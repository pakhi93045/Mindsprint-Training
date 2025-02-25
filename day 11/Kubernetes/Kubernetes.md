# Kubernetes

Kubernetes is a tool that helps manage and organize containers, which are like small, lightweight virtual machines. It makes it easier to deploy, scale, and operate applications by automating many of the tasks involved in running containerized applications. Think of it as a conductor for an orchestra, ensuring all the different parts work together smoothly.

## Key Concepts

- **Pods and Containers**:
  - We can put multiple containers under one pod, but they should be connected.
  - They can communicate with one another using localhost.

- **etcd**:
  - etcd is the storage, storing values in combination of key and value pairs.

## Self-Healing

- **Pods**:
  - Pods are not self-healing. If a pod is deleted, it can't be restored.

- **Replica Sets**:
  - Replica sets are self-healing. If a pod fails, it has the capability to start another pod.

- **Deployments**:
  - Deployments provide declarative updates to applications. They manage the creation and scaling of pods and replica sets.
  - Deployments ensure that the desired number of pods are running at all times.
  - They allow for rolling updates, which means you can update your application without downtime.

## Commands
```
- `kubectl version`: To check Kubernetes version.
- `kubectl cluster-info`: To get cluster information.

1. `kubectl apply -f pod.yml`: Run after making the `pod.yml` file.
2. `kubectl get pods`: To list all pods.
3. `kubectl describe pod nginx`: To describe the `nginx` pod.
4. `kubectl get svc`: To list all the services in your Kubernetes cluster.
5. `kubectl apply -f deployment.yml`: To create a deployment from a `deployment.yml` file.
6. `kubectl get deployments`: To list all deployments.
7. `kubectl describe deployment <deployment_name>`: To describe a specific deployment.
8. `kubectl rollout status deployment/<deployment_name>`: To check the status of a deployment rollout.
9. `kubectl set image deployment/<deployment_name> <container_name>=<new_image>`: To update the image of a deployment.
```