package homework;

import homework.DBhelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * @author 任杰
 * @PackageName:homework
 * @ClassName: Catalog
 * @Description:
 * @date 2020/9/19 20：42
 */

public class Catalog {
    /**
     * add a book
     *
     * @param book
     */
    public void addBook(Book book) {

        try {

            Connection c = DBhelper.getInstance().getConnection();

            String sql = "insert into book(code,title,publishDate,author,numberOfPages) values(?,?,?,?,?)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, book.getCode());
            ps.setString(2, book.getTitle());
            ps.setString(3, book.getPublishDate());
            ps.setString(4, book.getAuthor());
            ps.setInt(5, book.getNumberOfPages());

            ps.execute();


            DBhelper.closeConnection(c, ps, null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * add a recording
     *
     * @param recording
     */
    public void addRecord(Recording recording) {

        try {

            Connection c = DBhelper.getInstance().getConnection();

            String sql = "insert into record(code,title,publishDate,performer,format) values(?,?,?,?,?)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, recording.getCode());
            ps.setString(2, recording.getTitle());
            ps.setString(3, recording.getPublishDate());
            ps.setString(4, recording.getPerformer());
            ps.setString(5, recording.getFormat());

            ps.execute();

            //ResultSet rs = ps.getGeneratedKeys();

            DBhelper.closeConnection(c, ps, null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * remove a book
     *
     * @param code
     */
    public void removeBook(String code) {

        try {

            Connection c = DBhelper.getInstance().getConnection();
            String sql = "delete from book where code = '" + code + "'";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.execute();


            DBhelper.closeConnection(c, ps, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * remove a recording
     *
     * @param code
     */
    public void removeRecording(String code) {
        try {

            Connection c = DBhelper.getInstance().getConnection();
            String sql = "delete from record where code = '" + code + "'";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.execute();

            //ResultSet rs = ps.getGeneratedKeys();

            DBhelper.closeConnection(c, ps, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * find a book by code
     *
     * @param code
     * @return
     */
    public List<Book> getBook(String code) {

        List<Book> books = new ArrayList<Book>();

        try {

            Connection c = DBhelper.getInstance().getConnection();

            Statement s = c.createStatement();

            String sql = "select * from book where code =  '" + code + "'";

            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Book book = new Book();
                book.setCode(rs.getString("code"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPublishDate(rs.getString("publishDate"));
                book.setNumberOfPages(rs.getInt("numberOfPages"));
                books.add(book);
            }

            DBhelper.closeConnection(c, s, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    /**
     * find a recording by code
     *
     * @param code
     * @return
     */
    public List<Recording> getRecording(String code) {

        List<Recording> records = new ArrayList<Recording>();

        try {

            Connection c = DBhelper.getInstance().getConnection();

            Statement s = c.createStatement();

            String sql = "select * from record where code =  '" + code + "'";

            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Recording recording = new Recording();
                recording.setCode(rs.getString("code"));
                recording.setTitle(rs.getString("title"));
                recording.setPerformer(rs.getString("performer"));
                recording.setPublishDate(rs.getString("publishDate"));
                recording.setFormat(rs.getString("format"));
                records.add(recording);
            }

            DBhelper.closeConnection(c, s, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return records;
    }

    /**
     * get the number of books
     *
     * @return
     */
    public int getNumberOfBooks() {

        List<Book> books = new ArrayList<Book>();

        try {

            Connection c = DBhelper.getInstance().getConnection();

            Statement s = c.createStatement();

            String sql = "select * from book";

            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Book book = new Book();
                book.setCode(rs.getString("code"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPublishDate(rs.getString("publishDate"));
                book.setNumberOfPages(rs.getInt("numberOfPages"));
                books.add(book);
            }

            DBhelper.closeConnection(c, s, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return books.size();
    }

    /**
     * get the number of recordings
     *
     * @return
     */
    public int getNumberOfRecordings() {

        List<Recording> records = new ArrayList<Recording>();

        try {

            Connection c = DBhelper.getInstance().getConnection();

            Statement s = c.createStatement();

            String sql = "select * from record";

            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Recording recording = new Recording();
                recording.setCode(rs.getString("code"));
                recording.setTitle(rs.getString("title"));
                recording.setPerformer(rs.getString("performer"));
                recording.setPublishDate(rs.getString("publishDate"));
                recording.setFormat(rs.getString("format"));
                records.add(recording);
            }

            DBhelper.closeConnection(c, s, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return records.size();
    }

    public List<Book> getAllBook() {
        List<Book> books = new ArrayList<Book>();
        try {

            Connection c = DBhelper.getInstance().getConnection();

            Statement s = c.createStatement();

            String sql = "select * from book  ";

            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Book book = new Book();
                book.setCode(rs.getString("code"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setPublishDate(rs.getString("publishDate"));
                book.setNumberOfPages(rs.getInt("numberOfPages"));
                books.add(book);
            }

            DBhelper.closeConnection(c, s, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    public List<Recording> getAllRecording() {

        List<Recording> records = new ArrayList<Recording>();

        try {

            Connection c = DBhelper.getInstance().getConnection();

            Statement s = c.createStatement();

            String sql = "select * from record " ;

            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Recording recording = new Recording();
                recording.setCode(rs.getString("code"));
                recording.setTitle(rs.getString("title"));
                recording.setPerformer(rs.getString("performer"));
                recording.setPublishDate(rs.getString("publishDate"));
                recording.setFormat(rs.getString("format"));
                records.add(recording);
            }

            DBhelper.closeConnection(c, s, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return records;
    }
}
