package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ListaLivros;
import model.Livro;

import java.io.IOException;

@WebServlet("/LivroServlet")
public class LivroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LivroServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		String subtitulo = request.getParameter("subtitulo");
		String autor = request.getParameter("autor");
		
		Livro livro = new Livro();
		livro.setAutor(autor);
		livro.setTitulo(titulo);
		livro.setSubtitulo(subtitulo);
		
		// inserindo o livro na lista
		ListaLivros lista = ListaLivros.getInstance();
		lista.addLivro(livro);
	}

}
