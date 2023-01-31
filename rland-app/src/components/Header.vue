<script setup>
import { useAuthStore } from '../stores/UserDetails';
import { useRouter } from 'vue-router';

const store = useAuthStore();
const router = useRouter();

function logoutHandler(e){
    store.invalid(); // 상태 저장소 변수 초기화
    router.push("/index");
}

</script>

<template>
    <header class="header">
        <div>
            <h1 class="header-title"><router-link to="/"><img class="logo" src="/image/logo-w.png"
                        alt="알랜드"></router-link></h1>
            <ul class="main-menu d-none d-inline-flex-sm">
                <li><router-link to="/admin/menu/list"><span v-text="store.username"></span> 카페메뉴관리</router-link></li>
                <li><router-link to="/menu/list">카페메뉴</router-link></li>
                <li><router-link to="/">공지사항</router-link></li>
                <li>
                    <router-link v-if="store.username == null" to="/user/login">로그인</router-link>
                    <router-link v-if="store.username != null" to="/user/logout" @click.prevent="logoutHandler">로그아웃</router-link>
                </li>
            </ul>
            <div class="d-none-sm"><a class="icon icon-menu icon-white" href="?m=on">메뉴버튼</a></div>
        </div>
    </header>
</template>