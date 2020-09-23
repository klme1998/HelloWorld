package homework;

/**
 * @author 任杰
 * @PackageName:homework
 * @ClassName: Book
 * @Description:
 * @date 2020/9/19 20:19
 */

public class Book extends CatalogItem{

	/**
	 * @param code
	 * @param title
	 * @param publishDate
	 */
	public Book(String code, String title, String publishDate) {
		super(code, title, publishDate);
	}
	public Book(){
		super();
	};
	private String author;
	private int numberOfPages;
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the numberOfPages
	 */
	public int getNumberOfPages() {
		return numberOfPages;
	}
	/**
	 * @param numberOfPages the numberOfPages to set
	 */
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Book_" + super.getCode()+"_" + super.getTitle()+"_" + super.getPublishDate()+"_" +
				author+"_" + numberOfPages;
	}
}
