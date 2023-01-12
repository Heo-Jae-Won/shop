<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="../../../resources/library/jquery/dist/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="frm">
	아이디: <input type="text" name="u_id" placeholder="아이디를 입력하세요" />
	비밀번호: <input type="password" name="u_password" placeholder="비밀번호를 입력하세요" />
	이름:  <input type="text" name="u_name" placeholder="아이디를 입력하세요" />
	생년월일: <input type="text" name="u_birth" placeholder="생년월일을 6자로 입력해주세요"/>
	<p>성별:</p> 
	<input type="radio" name="u_gender" value="M"/>
	<label>남성</label>
		<input type="radio" name="u_gender" value="F"/>
	<label>여성</label>
	<button type="submit">회원가입</button>
</form>

</body>
</html>
<script>
$(frm).on("submit",function(e){
	e.preventDefault();
	
	const id=$(frm.u_id).val();
	const password=$(frm.u_password).val();
	const name=$(frm.u_name).val();
	const birth=$(frm.u_birth).val();
	const gender=$(frm.u_gender).val();
	$.ajax({
		type:"post",
		url:"/api/user",
		data:{
			id,
			password,
			name,
			birth,
			gender
		}
	}).done(function(){
		alert("success");
	}).fail(function(e){
		console.log(e)
	})
})
</script>

