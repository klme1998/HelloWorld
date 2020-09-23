package homework;

import homework.Catalog;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * @author 任杰
 * @PackageName:homework
 * @ClassName: LibrarySystem
 * @Description:
 * @date 2020/9/19 21：22
 */
public class LibrarySystem {

    public void saveCatalogToFile() {
        System.out.print("Input file name:");
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(str));
            //展示所有的book目录
            Catalog catalogg = new Catalog();
            List<Book> books = catalogg.getAllBook();
            for (Book book : books) {
                System.out.println(book);
                bw.write(book.toString());
                bw.newLine();
            }

            //展示所有的recording目录
            Catalog cataloggg = new Catalog();
            List<Recording> record = cataloggg.getAllRecording();
            for (Recording recording : record) {
                System.out.println(recording);
                bw.write(recording.toString());
                bw.newLine();
            }
            bw.close();
            System.out.println("Catalog has been saved into:"+str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        /*try {

            Connection c = DBhelper.getInstance().getConnection();

            String sql = "insert into student(Sno,Sname) values(?,?)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, 200);
            ps.setString(2, "sname");

            ps.execute();


            DBhelper.closeConnection(c, ps, null);

        } catch (Exception e) {
            e.printStackTrace();
        }


         */
        System.out.println("--------------The following are -------------");


        //展示所有的book目录
        Catalog catalogg = new Catalog();
        List<Book> books = catalogg.getAllBook();
        for (Book book : books) {
            System.out.println(book);
        }

        //展示所有的recording目录
        Catalog cataloggg = new Catalog();
        List<Recording> record = cataloggg.getAllRecording();
        for (Recording recording : record) {
            System.out.println(recording);
        }


        //行为选择
        while (true) {
            while (true) {
                try {
                    System.out.println("----------------------------");
                    System.out.println("1.add a book");
                    System.out.println("2.add a recording");
                    System.out.println("3.remove a book");
                    System.out.println("4.remove a recording");
                    System.out.println("5.get a book");
                    System.out.println("6.get a recording");
                    System.out.println("7.get number of books");
                    System.out.println("8.get number of recordings");
                    System.out.println("9.save item");
                    System.out.println("----------------------------");
                    System.out.println("Please choose your opreation");

                    Scanner scanner = new Scanner(System.in);
                    int num = scanner.nextInt();
                    switch (num) {
                        case 1:
                            System.out.println("Please enter the correct format(code/title/Author/data(0000-00-00)/NumberOfPages)");
                            String str = scanner.next();
                            String[] str1 = str.split("/");
                            Book book = new Book(str1[0], str1[1], str1[3]);
                            book.setAuthor(str1[2]);
                            book.setNumberOfPages(Integer.parseInt(str1[4]));
                            Catalog test = new Catalog();
                            test.addBook(book);
                            break;
                        case 2:
                            System.out.println("Please enter the correct format(code/title/performer/data(0000-0-00)/format)");
                            String strr = scanner.next();
                            String[] str2 = strr.split("/");
                            Recording recording = new Recording(str2[0], str2[1], str2[3]);
                            recording.setPerformer(str2[2]);
                            recording.setFormat(str2[4]);
                            Catalog catalog = new Catalog();
                            catalog.addRecord(recording);
                            break;
                        case 3:
                            System.out.println("Please input remove code");
                            String strrr = scanner.next();
                            Catalog catalog1 = new Catalog();
                            catalog1.removeBook(strrr);
                            break;
                        case 4:
                            System.out.println("Please input remove code");
                            String strrrr = scanner.next();
                            Catalog catalog2 = new Catalog();
                            catalog2.removeRecording(strrrr);
                            break;
                        case 5:
                            System.out.println("Please input the book's code");
                            String strrrrr = scanner.next();
                            Catalog catalog3 = new Catalog();
                            System.out.println(catalog3.getBook(strrrrr));
                            break;
                        case 6:
                            System.out.println("Please input the recording's code");
                            String strrrrrr = scanner.next();
                            Catalog catalog4 = new Catalog();
                            catalog4.getRecording(strrrrrr);
                            break;
                        case 7:
                            Catalog catalog5 = new Catalog();
                            System.out.println("The book's number is " + catalog5.getNumberOfBooks());
                            break;
                        case 8:
                            Catalog catalog6 = new Catalog();
                            System.out.println("The recording's number is " + catalog6.getNumberOfRecordings());
                            break;
                        case 9:
                            new LibrarySystem().saveCatalogToFile();
                        default:
                            System.out.println("Please input the proper num(1-8)");
                            break;

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

}
