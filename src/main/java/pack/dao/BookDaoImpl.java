package pack.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import pack.model.Book;
@Repository

public class BookDaoImpl implements BookDao
{
	@Autowired
	private HibernateTemplate ht;
	public void addBook(Book book) 
	{
		// TODO Auto-generated method stub
		ht.saveOrUpdate(book);	
	}

}
