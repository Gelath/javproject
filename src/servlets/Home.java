package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import beans.Produit;
import database.DBConnect;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Produit> produits = new ArrayList<Produit>();
		
		try {
			Connection con = DBConnect.connect();
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(
					"SELECT * "
					+"FROM produit "
					+"ORDER BY nom_produit ASC "
					);
			
			
			while(rs.next()) {
				produits.add(new Produit(
						rs.getString("nom_produit"),
						rs.getDouble("prix"),
						rs.getString("photo_produit"),
						rs.getInt("id")));
			}
		
			
			con.close();
					
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("produits", produits);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
