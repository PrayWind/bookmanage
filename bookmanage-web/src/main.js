// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
// router文件夹的index.js里定义的路由
import router from './router'


// 设置反向代理，前端请求默认发送到 http://localhost:8087/api
var axios = require('axios')
axios.defaults.baseURL = 'http://localhost:8087/api'
// 全局注册，之后可在其他组件中通过 this.$axios 发送数据
Vue.prototype.$axios = axios


// 阻止vue 在启动时生成生产提示
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
