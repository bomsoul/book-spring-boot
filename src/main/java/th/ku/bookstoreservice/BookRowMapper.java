package th.ku.bookstoreservice;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet resultSet, int i) throws SQLException {
        Book book = new Book(resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getDouble("price"));
        return book;
    }
}
