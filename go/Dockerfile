# 1) Build Stage
FROM docker.io/library/golang:1.24.2-alpine AS builder
WORKDIR /app
# go.mod, go.sum만 먼저 복사하고 의존성 다운로드 (캐시 활용)
COPY go.mod go.sum ./
RUN go mod download
# 소스 코드 복사 및 빌드
COPY . .
# 정적 링크, Linux AMD64 용 바이너리로 컴파일
RUN CGO_ENABLED=0 \
    GOOS=${TARGETOS} \
    GOARCH=${TARGETARCH} \
    go build -ldflags="-s -w" -o server .

# 2) Runtime Stage
FROM scratch
COPY --from=builder /app/server /server
EXPOSE 8080
ENTRYPOINT ["/server"]
