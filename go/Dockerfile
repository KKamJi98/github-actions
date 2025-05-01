# ---------- 1) Build Stage ----------
FROM --platform=$BUILDPLATFORM golang:1.24.2-alpine AS builder

# Buildx 가 주입하는 변수를 명시적으로 선언
ARG TARGETOS
ARG TARGETARCH

WORKDIR /app

# 모듈 캐시 활용
COPY go.mod go.sum ./
RUN go mod download

# 소스 복사
COPY . .

# Go 빌드 캐시 디렉터리를 레이어에 남기지 않고 속도만 향상
RUN --mount=type=cache,target=/root/.cache/go-build \
    CGO_ENABLED=0 \
    GOOS=$TARGETOS \
    GOARCH=$TARGETARCH \
    go build -ldflags="-s -w" -o /server .

# ---------- 2) Runtime Stage ----------
FROM scratch
COPY --from=builder /server /server
EXPOSE 8080
ENTRYPOINT ["/server"]
