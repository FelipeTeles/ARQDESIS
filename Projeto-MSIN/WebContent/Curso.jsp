<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="TO.TO_Curso" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Curso</title>
</head>
<body>

	<%TO_Curso Curso = (TO_Curso)request.getAttribute("curso"); %>
Codigo: <%=Curso.getCodigo() %><br>
		NomeCurso: <%=Curso.getNomeCurso() %><br>
		Data Inicio: <%=Curso.getDataInicio() %><br>
		Data Fim: <%=Curso.getDataFim() %><br>
		NumerodeVagas: <%=Curso.getNumeroVagas() %><br>
		Valor: <%=Curso.getValor() %><br>
		LabSala: <%=Curso.getLabSala() %><br>
		Horario: <%=Curso.getHorario() %><br>
		Descrição: <%=Curso.getDescricao() %><br>
		MatSoftwares: <%=Curso.getMatSoftwares() %><br>
		Area: <%=Curso.getArea() %><br>
		

</body>
</html>