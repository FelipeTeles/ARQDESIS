<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="TO.TO_Aluno" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aluno</title>
</head>
<body>
	<%TO_Aluno to = (TO_Aluno)request.getAttribute("aluno"); %>
	RA: <%=to.getRa() %><br>
	Nome: <%=to.getNome() %><br>
	Endereco: <%=to.getEndereco() %><br>
	Telefone: <%=to.getTelefone() %><br>
	Email: <%=to.getEmail() %><br>
	RG: <%=to.getRG() %><br>
	CPF: <%=to.getCPF() %><br>
		

</body>
</html>