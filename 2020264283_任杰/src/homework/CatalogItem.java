package homework;

/**
 * @author 任杰
 * @PackageName:homework
 * @ClassName: CatalogItem
 * @Description:
 * @date 2020/9/19 21:17
 */

public class CatalogItem {
	
	/**
	 * @param code
	 * @param title
	 * @param publishDate
	 */
	public CatalogItem(String code, String title, String publishDate) {
		super();
		this.code = code;
		this.title = title;
		this.publishDate = publishDate;
	}
	public CatalogItem(){
		
	};
	private String code;
	private String title;
	private String publishDate;
	
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the publishDate
	 */
	public String getPublishDate() {
		return publishDate;
	}
	/**
	 * @param publishDate the publishDate to set
	 */
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CatalogItem [code=" + code + ", title=" + title + ", publishDate=" + publishDate + "]";
	}
	
	
	
}
