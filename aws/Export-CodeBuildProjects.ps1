# Set the AWS CLI profile to use
$aws_profile = "rachel_admin_profile"

# List all CodeBuild projects using the specified profile
$projects = aws codebuild list-projects --profile $aws_profile --query "projects" --output text

# Split the projects into an array
$projectArray = $projects -split "\s+"

# Loop through each project and export its configuration
foreach ($project in $projectArray) {
    Write-Output "Exporting configuration for project: $project"
    # Describe the project using batch-get-projects
    $output = aws codebuild batch-get-projects --names $project --profile $aws_profile --output json

    # Create a sanitized filename
    $sanitizedProjectName = $project -replace "[^a-zA-Z0-9-_]", "_"

    # Save the output to a JSON file
    $output | Out-File -FilePath "$sanitizedProjectName.json"
}

Write-Output "Export completed."
