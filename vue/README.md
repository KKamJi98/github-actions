# Vue Project

This is a Vue.js project with multi-architecture CI/CD pipeline support for AMD64 and ARM64 architectures.

## Setup

```bash
npm install
```

## Development

```bash
npm run dev
```

## Build

```bash
npm run build
```

## Test

```bash
npm run test
```

## Docker Build

Build the Docker image locally:

```bash
# For AMD64
docker build -t vue-app:amd64 --platform linux/amd64 .

# For ARM64
docker build -t vue-app:arm64 --platform linux/arm64 .
```

## CI/CD Pipeline

This project includes three different CI/CD pipeline approaches for multi-architecture builds:

### 1. Matrix Strategy (ECR)

Uses GitHub Actions matrix strategy to build native images on different architecture runners:
- AMD64 builds on `ubuntu-24.04`
- ARM64 builds on `ubuntu-24.04-arm`

The workflow creates individual architecture images and then combines them into a multi-architecture manifest.

**Workflow file:** `.github/workflows/vue-multi-architecture-build-and-push-to-ecr-using-matrix.yaml`

### 2. Matrix Strategy (Harbor)

Similar to the ECR approach but pushes images to Harbor registry instead of ECR.

**Workflow file:** `.github/workflows/vue-multi-architecture-build-and-push-to-harbor-using-matrix.yaml`

### 3. QEMU Emulation (ECR)

Uses QEMU to emulate different architectures on a single runner, allowing for multi-architecture builds without requiring different runner types.

**Workflow file:** `.github/workflows/vue-multi-architecture-build-and-push-to-ecr-using-qemu.yaml`

## Required Secrets

For ECR workflows:
- `AWS_ROLE_TO_ASSUME_ARN`
- `AWS_REGION`
- `AWS_ACCOUNT_ID`
- `VUE_ECR_REPOSITORY`

For Harbor workflow:
- `HARBOR_REGISTRY`
- `HARBOR_USERNAME`
- `HARBOR_PASSWORD`
- `HARBOR_PROJECT`