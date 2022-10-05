package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = request.getParameter("edit");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String titleRead = br.readLine();
        String contentRead = br.readLine();
        br.close();

        Note note = new Note(titleRead, contentRead);
        request.setAttribute("note", note);
request.setAttribute("inputT", note );
request.setAttribute("inputC", note );

        if (url == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   String editedTitle = request.getParameter("inputT");
        String editedContent = request.getParameter("inputC");
        Note newNote = new Note(editedTitle, editedContent);
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        pw.println(newNote.getTitle());
        pw.print(newNote.getContent());
        request.setAttribute("note", newNote);
        pw.close();
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
    }

}
