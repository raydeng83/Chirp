<template>
  <div>
    <div class="row" v-for="message in messages">
      <div class="col-md-4"></div>
      <div class="col-md-8">
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
    <!-- <div class="row">
      <div class="col-md-4"></div>
      <div class="col-md-8">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">Panel title</h3>
          </div>
          <div class="panel-body">
            "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system.""
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-md-4"></div>
      <div class="col-md-8">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">Panel title</h3>
          </div>
          <div class="panel-body">
            "At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat."
          </div>
        </div>
      </div>
    </div> -->
  <div>
</template>

  <script>
      export default {
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