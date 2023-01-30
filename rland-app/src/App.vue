<script>
import { computed } from 'vue';
export default{
  data(){
    return{
      userDetails:{username:null}
    }
  },
  provide(){
    return {
      userDetails:computed(() =>this.userDetails)
    }
  }
}
</script>

<template>
  <router-view></router-view>
</template>