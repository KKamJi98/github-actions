# ---------- 1) Build Stage ----------
FROM --platform=$BUILDPLATFORM node:24-alpine AS builder

# Buildx 가 주입하는 변수를 명시적으로 선언
ARG TARGETOS
ARG TARGETARCH

WORKDIR /app

# Install dependencies
COPY package*.json ./
RUN npm ci

# Copy source code
COPY . .

# Build the application
RUN npm run build

# ---------- 2) Runtime Stage ----------
FROM nginx:alpine

# Copy built files from builder stage
COPY --from=builder /app/dist /usr/share/nginx/html

# Copy custom nginx config if needed
# COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]