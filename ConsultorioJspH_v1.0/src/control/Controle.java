package control;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.ClienteDao;
import persistence.DentistaDao;

import datautil.Conversor;

import entity.Cliente;
import entity.Dentista;

public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String flag = request.getParameter("flag");

		if (flag.equalsIgnoreCase("cadDent")) {

			cadastroDentista(request, response);

		} else if (flag.equalsIgnoreCase("cadCli")) {
			cadastroCliente(request, response);
		}

	}

	protected void cadastroDentista(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {

			Dentista d = new Dentista(null, new Integer(
					request.getParameter("cpf")), request.getParameter("nome"),
					request.getParameter("especialidade"), new Integer(
							request.getParameter("status")));

			new DentistaDao().save(d);

			request.setAttribute("msg", "Dentista Gravado Com Sucesso!");

			request.getRequestDispatcher("index.jsp")
					.forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();
			request.setAttribute("msg", "Ops, Erro : " + e.getMessage());

		}

	}

	protected void cadastroCliente(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			Cliente c = new Cliente(null, new Integer(
					request.getParameter("prontuario")),
					request.getParameter("nome"),
					new Conversor().dataToJava(request.getParameter("dtCad")),
					request.getParameter("indicacao"),
					request.getParameter("dentista"));

			new ClienteDao().save(c);

			request.setAttribute("msg", "Cliente Gravado Com Sucesso!");

			request.getRequestDispatcher("index.jsp")
					.forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();
			request.setAttribute("msg", "Erro : " + e.getMessage());

		}

	}

}
