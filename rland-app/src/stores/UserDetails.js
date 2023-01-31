import { defineStore } from 'pinia'

export const useAuthStore = defineStore({
  id:'userDetails',
  state:()=>({
    userDetails:{
      username:null,
      role:null
    }
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
      this.userDetails.role = null;
    },
    setAuth(value){
      this.userDetails.username = value;
    }
  }
});