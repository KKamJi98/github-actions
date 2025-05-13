# Go Gin Example

## Download Gin Package

```bash
go get -u github.com/gin-gonic/gin
```

## Build Container Image(Podman)

```bash
podman build -t gin-test .
```

## Run Container Image

```bash
podman run -p 8080:8080 localhost/gin-test
# podman run --name gin-test -dp 8080:8080 localhost/gin-test
```

