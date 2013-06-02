package com.efrain.agenda.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.efrain.agenda.modelos.Agenda;
import com.efrain.agenda.modelos.Contacto;

public class RegistroController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			
			String nombre = req.getParameter("nombre");
			String apellido = req.getParameter("apellido");
			String edad = req.getParameter("edad");
			String telefono = req.getParameter("telefono");
			String ciudad = req.getParameter("ciudad");
			
			if(nombre.equals("") || apellido.equals("") || edad.equals("") || telefono.equals("") || ciudad.equals("")) {
				req.setAttribute("mensaje", "Debe se insertar todos los datos");
				req.getRequestDispatcher("resultado.jsp").forward(req, resp);
			} else {
				new Agenda().agregarContacto(new Contacto(nombre, apellido, edad, telefono, ciudad));
				req.setAttribute("mensaje", "Se ha agregado su contacto");
				req.getRequestDispatcher("resultado.jsp").forward(req, resp);
			}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
			req.setAttribute("contactoList", new Agenda().getContactos());
			req.getRequestDispatcher("contactos.jsp").forward(req, resp);
	}

}
