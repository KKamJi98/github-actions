<template>
  <div class="container">
    <h1>Vue Multi-Architecture Demo</h1>
    <p>This is a Vue.js application with multi-architecture CI/CD pipeline support (AMD64, ARM64)</p>
    <div class="architecture-info">
      <h2>Architecture Information</h2>
      <p>Current architecture: {{ architecture }}</p>
    </div>
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      architecture: 'Unknown (detected at runtime)'
    }
  }
}
</script>

<style>
.container {
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
  font-family: Arial, sans-serif;
}

.architecture-info {
  margin-top: 30px;
  padding: 15px;
  border: 1px solid #ddd;
  border-radius: 5px;
  background-color: #f9f9f9;
}
</style>