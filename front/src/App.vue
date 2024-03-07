
<template>
  <div id="app">
    <h1>Test Data</h1>
    <ul>
      <li v-for="test in tests" :key="test.id">
        {{ test.testName}}
      </li>
    </ul>
  </div>
</template>

<script >

import axios from "axios";

export default {
  data() {
    return {
      tests: []
    }
  },
  mounted() {
    axios.get("/test")
        .then(response => {
          this.tests = response.data;
          console.log(response.data)
        })
        .catch(error => {
          console.log('Error',error)
        })
  }
}
</script>
