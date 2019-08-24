import Vue from 'vue'
import Router from 'vue-router'

import Appindex from '@/components/home/Appindex'
import Login from '@/components/Login'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/index',
      name: 'AppIndex',
      component: Appindex
    }
  ]
})
