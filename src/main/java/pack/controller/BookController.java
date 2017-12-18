package pack.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pack.dao.BookDao;
import pack.model.Book;

@Controller
public class BookController
{
	@Autowired
	private BookDao dao;
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView saveBook(HttpServletRequest request)
	{
		Book book=new Book();
		book.setBookId(Integer.parseInt(request.getParameter("empid")));
		book.setBookName(request.getParameter("empname"));
		book.setISBN(Integer.parseInt(request.getParameter("isbn")));
		book.setPublisher(request.getParameter("publisher"));
		book.setYear(Integer.parseInt(request.getParameter("year")));
		dao.addBook(book);
		return new ModelAndView("index");	
	}

}
