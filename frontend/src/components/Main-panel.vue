<template>
  <div>
    <div class="row grid-divider">
      <div class="col-md-4">
        <login></login>
      </div>
      <div class="col-md-8 col-padding">
        <div v-for="message in messages">
          <div class="col-md-12">
            <div class="panel panel-default">
              <div class="panel-heading">
                <h3 class="panel-title">{{ message.username }} @ {{ message.date }}</h3>
              </div>
              <div class="panel-body" >
                {{ message.description}}
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div>
    </template>

    <script>
    import Login from './Login'

      export default {
        components: { Login },

        name: 'main-panel',
        data () {
          return {
            msg : 'main-panel',
            messages : ''
          }
        },
        created: function () {
          this.getMessages();
        } ,
        methods : {
          getMessages () {
            this.$http.get('http://localhost:8081/message').then((res) => {
              this.messages = res.body._embedded.message;
              console.log(this.messages);
            }, (err) => {
              console.log(err);
            });
          }
        }
      }
    </script>


    <style type="text/css">
      .grid-divider {
        position: relative;
        padding: 0;
    }
    .grid-divider>[class*='col-'] {
        position: static;
    }
    .grid-divider>[class*='col-']:nth-child(n+2):before {
        content: "";
        border-left: 1px solid #DDD;
        position: absolute;
        top: 0;
        bottom: 0;
    }
    .col-padding {
        padding: 0 15px;
    }
    </style>