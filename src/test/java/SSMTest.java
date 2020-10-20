import com.wjf.pojo.Book;
import com.wjf.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import java.util.List;

public class SSMTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> books = bookService.queryAllBooks();
        for (Book book:books){
            System.out.println(book);
        }
    }
}
