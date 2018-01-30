<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<meta http-equiv="X-UA-Compatible" >
<meta name="renderer" content="webkit|ie-stand|ie-comp" />  
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
</style>
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">  
</head>
<script src="js/jquery-3.2.1.min.js"></script>  
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript">
$(function(){
    $("#userName").change(function(){
       var val=$(this).val();
        val=$.trim(val);
           if(val !=""){
             var url="helloo.do";    
             var args={"userName":val,"time":new Date()};
             $.post(url,args,function(data){
                $("#message").html(data);
             });
           }
    });
});
   </script>
<body>
      <form action="" method="post">
        userName:<input type="text" name="userName" id="userName"/> 
        <br/>
        <div id="message"></div>
        <p>${result}</p>
         <br/>
         <input type="submit" value="提交" />
      </form>
  </body>
</html>