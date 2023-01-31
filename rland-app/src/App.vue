<script setup>
import { provide, reactive } from 'vue';

const userDetails = reactive({username:null});
provide('userDetails', {username:null});
</script>

<template>
  <router-view></router-view>
</template>