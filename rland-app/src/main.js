import { createApp } from 'vue'
import { createPinia } from 'pinia';
import { useAuthStore } from './stores/UserDetails';
import { createRouter, createWebHistory } from "vue-router";

import Layout from "./components/Layout.vue";
import MenuLayout from "./components/menu/Layout.vue";
import MenuList from "./components/menu/List.vue";
import Index from "./components/Index.vue"

import AdminLayout from "./components/admin/Layout.vue";
import AdminMenuLayout from "./components/admin/menu/Layout.vue";
import AdminMenuList from "./components/admin/menu/List.vue";
import AdminIndex from "./components/Index.vue"

import UserLogin from "./components/user/Login.vue"

import App from './App.vue'

const pinia = createPinia();

const app = createApp(App)
app.config.unwrapInjectedRef = true;
app.use(pinia)

const store = useAuthStore();

const routes = createRouter({
    history:createWebHistory(import.meta.env.VITE_APP_BASE_PATH),
    routes:[
        /**
         * Nested Routes (중첩된 라우터)
         * /로 시작하는 라우트는 루트 경로로 취급한다. 
         * children 옵션을 사용하면 URL을 중복해 사용하지 않고도 컴포넌트 중첩을 활용할 수 있다.
         * 경로가 더 먼저 정의 될수록 우선 순위가 높아진다.
         */
        {path:'/index', component:Index},
        {path:'/', redirect:'/index', component:Layout, children:[
            {path:'menu', component:MenuLayout, children:[
                {path:'list', component:MenuList}
            ]},
        ]},
        {path:'/user', component:Layout, children:[
            {path:'login', component:UserLogin}
        ]},
        /**
         * /admin
         * Admin도 루트 경로에서 시작하지만 레이아웃이 다르기 때문에
         * ui를 기준으로 종속관계를 만들어야 한다.
         */
        {path:'/admin', component:AdminLayout, children:[
            {path:'index', component:AdminIndex},
            {path:'menu', component:AdminMenuLayout, children:[
                {path:'list', component:AdminMenuList}
            ]},
        ], beforeEnter:(to, from, next)=>{
            // /admin/** 로 접속 전에 처리할 내용을 입력
            if(store.username)
                next();
            else
                next('/user/login')
        }}
    ]
});

app.use(routes)
.mount('#app')
