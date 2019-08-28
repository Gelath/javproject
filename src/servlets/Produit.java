package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import beans.User;
import database.DBConnect;

/**
 * Servlet implementation class Produit
 */
@WebServlet("/Produit")
public class Produit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Produit() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		beans.Produit produit = null;
		
		
		if(!request.getParameter("id").equals(null) && request.getParameter("id") != "" ) {
			
			Integer idart = Integer.parseInt(request.getParameter("id"));
		
			try {
				Connection con = DBConnect.connect();
				
				
				PreparedStatement stmt = con.prepareStatement(
						"SELECT * "
						+ "FROM produit "
						+ "WHERE id = ? "
				);
				
				stmt.setInt(1, idart);
				
				ResultSet rs = stmt.executeQuery();
				
				if(rs.next()) {
					//je créé un utilisateur User avec les infos venant de la BDD
					produit = new beans.Produit(
							rs.getString("nom_produit"),
							rs.getDouble("prix"), 
							rs.getString("photo_produit"), 
							rs.getString("categorie"),
							rs.getInt("id"),
							rs.getString("description	"));
				}	
				
				con.close();
						
						
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}else {
			
			response.sendRedirect("home");
		}
		
		request.setAttribute("produit", produit);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/produit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
