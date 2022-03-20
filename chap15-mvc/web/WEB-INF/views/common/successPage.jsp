<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
		(function(){
			
			const successCode = '${ requestScope.successCode }';
			
			let successMessage = '';
			let movePath = '';
			
			switch(successCode){
			case 'insertEmp'
				successMessage = '신규 직원 등록에 성공하셨습니다.';
				movePath = '${ pageContext.servletContext.contextpath }'
				break;
			case 'updateEmp'
				successMessage = '직원 퇴사 처리에 성공하셨습니다.';
				movePath = '${ pageContext.servletContext.contextPath }'
				break;
			}
			
			alert(successMessage);
			location.href = movePath;
		})
	</script>
</body>
</html>