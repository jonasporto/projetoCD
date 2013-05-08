<%@page import="entity.Dentista"%>
<%@page import="persistence.DentistaDao"%>
<%@page import="persistence.ClienteDao"%>
<%@page import="entity.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Digitação de Lancamentos</title>

<link href="visual/css/bootstrap.css" rel="stylesheet">


</head>
<body>

	<div class="container">


		<div class="span12">

			<fieldset>

				<legend>Digitação de Ocorrencias :</legend>
				<span>Selecione um Cliente</span><br /> <select name="sltCli">

					<%
						for (Cliente c : new ClienteDao().findByAll()) {
							out.print("<option value='" + c.getIdCliente());
							out.print("'>" + c.getProntuario() + " - " + c.getNome()
									+ "</option>");
						}
					%>


				</select>

				<p />

				<span>Selecione um Profissional</span><br /> <select name="sltDent">

					<%
						for (Dentista c : new DentistaDao().findByAll()) {
							out.print("<option value='" + c.getIdDentista());
							out.print("'>" + c.getIdDentista() + " - " + c.getNome()
									+ "</option>");
						}
					%>
				</select> <br />
		</div>

		</select>


		</fieldset>




	</div>












</body>

<script src="visual/js/jquery.js" type="text/javascript"></script>
<script src="visual/js/bootstrap.js"></script>
</html>