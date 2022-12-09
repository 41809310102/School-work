<template>
  <div class="register">
    <div class="login-form">
      <img style="width: 300px;height: 150px;margin-left: 24px" src="../assets/images/phone.png" alt="">
      <h3 class="title">手机号验证登陆</h3>
      <phone-login
        :rule-form="phoneForm"
        @send="send"
        @submit="submit"
        @errHandle="errHandle">
      </phone-login>
    </div>
  </div>
</template>

<script>
import PhoneLogin from '../components/PhoneLogin/index'

export default {
  name: 'Register1',
  components: { PhoneLogin},
  props:{},
  data(){
    return{
      phoneForm: {
        phone: '',
        code: ''
      }
    }
  },
  methods:{
    submit(){
      this.$message.success('提交成功')
      console.log("成功")
    },
    errHandle(){
      this.$message.error('表单填写有误，请检查')
      console.log("失败")
    },
    send(){
      this.$message.info('发送验证码成功')
    }
  },
  mounted(){

  }
}
</script>

<style rel="stylesheet/scss" lang="scss">
.register {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100%;
  background-image: url("../assets/images/login-background.jpg");
  background-size: cover;
}

.title {
  margin: 0px auto 30px auto;
  text-align: center;
  color: #707070;
}

.login-form {
  border-radius: 6px;
  background: #ffffff;
  width: 400px;
  padding: 25px 25px 5px 25px;
  height: 450px;
  .el-input {
    height: 38px;
    input {
      height: 38px;
    }
  }
  .input-icon {
    height: 39px;
    width: 14px;
    margin-left: 2px;
  }
}
</style>


