<template>
<div>
  <div> nameBot:{{ bot_name }} </div>
  <div> botCre: {{ bot_rating }}</div>
</div>
</template>
<script>
import $ from 'jquery';
import { ref } from 'vue';

export default{
  name: "app", 
  setup:()=>{
    let bot_name =ref("");
    let bot_rating = ref("");
    $.ajax({
      url: "http://localhost:9000/pk/getbotinfo/", 
      type: "get",
      success: resp=>{
        bot_name.value = resp.name; 
        bot_rating.value = resp.version;
       
      }
    })
    return{
      bot_name,
      bot_rating
    }

  }
}
</script>
<style>
body{
  background-image: url("@/assets/bg.jpg");
  background-size: cover;
}

</style>
