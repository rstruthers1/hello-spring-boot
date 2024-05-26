#!/bin/bash

# Set AWS region and EKS cluster name
AWS_REGION=us-west-2
EKS_CLUSTER_NAME=hello-world-cluster

# Update kubeconfig


aws eks update-kubeconfig --region $AWS_REGION --name $EKS_CLUSTER_NAME --role-arn arn:aws:iam::777605092423:role/eksctl-hello-world-cluster-cluster-ServiceRole-9xR4lLis6Mt3

# Update the Kubernetes deployment
kubectl set image deployment/hello-world-spring-boot hello-world-spring-boot=rmstruthers1/hello-world-spring-boot:latest


