<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp list</title>
</head>
<body>
	<h1 align="center">직원 목록 전체 조회</h1>
	<table align="center" border="1">
		<tr>
			<th>사원번호</th>
			<th>직원명</th>
			<th>주민등록번호</th>
			<th>이메일</th>
			<th>전화번호</th>
			<th>부서코드</th>
			<th>직급코드</th>
			<th>급여등급</th>
			<th>급여</th>
			<th>보너스율</th>
			<th>관리자사번</th>
			<th>입사일</th>
			<th>퇴사일</th>
			<th>퇴직여부</th>
		</tr>
		<c:forEach items="${ requestScope.empList }" var="emp">
		<tr>
			<td>${ emp.empId }</td>
			<td>${ emp.empName }</td>
			<td>${ emp.empNo }</td>
			<td>${ emp.email }</td>
			<td>${ emp.phone }</td>
			<td>${ emp.deptCode }</td>
			<td>${ emp.jobCode }</td>
			<td>${ emp.salLevel }</td>
			<td>${ emp.salary }</td>
			<td>${ emp.bonus }</td>
			<td>${ emp.managerId }</td>
			<td>${ emp.hireDate }</td>
			<td>${ emp.entDate }</td>
			<td>${ emp.entYn }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>