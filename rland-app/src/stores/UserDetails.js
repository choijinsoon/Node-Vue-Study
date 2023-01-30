import { defineStore } from 'pinia'

export const useAuthStore = defineStore({
  id:'userDetails',
  state:()=>({
    userDetails:{username:'soon'}
  }),
  getters:{
    username:(state)=>state.userDetails.username
  },
  actions:{
    getAuth(){
      return this.userDetails.username;
    },
    invalid(){
      this.userDetails.username = null;
    },
    setAuth(value){
      this.userDetails.username = value;
    }
  }
});