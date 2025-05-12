<template>
  <div class="hello">
    <h2>{{ msg }}</h2>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: {
      type: String,
      default: 'Welcome to Vue.js'
    }
  }
}
</script>

<style scoped>
.hello {
  margin: 20px 0;
  padding: 15px;
  border: 1px solid #42b983;
  border-radius: 5px;
  background-color: #f0f8f1;
}
</style>