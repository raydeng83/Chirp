<template>
  <div id="app">
    <div class="container">
      <navbar></navbar>
      <router-view id="router-view"></router-view>
    </div>
  </div>
</template>

<script>
import Navbar from './components/Navbar'
import Signup from './components/Signup'
import MainPanel from './components/Main-panel'
import PostMessage from './components/Post-message'
import GoogleSso from './components/Google-sso'

export default {
  components: { Navbar, Signup, MainPanel, PostMessage, GoogleSso }
}
</script>

<style lang="sass">

  // Bootstrap
  $icon-font-path: '../node_modules/bootstrap-sass/assets/fonts/bootstrap/';
  $link-color: #42b983;
  $brand-success: #42b983;
  @import 'node_modules/bootstrap-sass/assets/stylesheets/bootstrap';

  // font awesome
  $fa-font-path: '../node_modules/font-awesome/fonts/';
  @import 'node_modules/font-awesome/scss/font-awesome';

  //some styling adaptations
  h1
    color: #42b983
  p
    text-align: justify

  #router-view
    margin-top: 100px
</style>
