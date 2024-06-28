<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script>
			function send(f){
				f.action = "login_check.do";
				f.submit();
			}
			
		</script>
	</head>
	
	<body>
		<form>
			아이디 : <input name="id"><br>
			비번 : <input name="pwd" type="password"><br>
			<input type="button" value="제출" onclick="send(this.form);">
		</form>
	</body>
</html>