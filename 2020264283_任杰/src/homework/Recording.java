package homework;

/**
 * @author 任杰
 * @PackageName:homework
 * @ClassName: Recording
 * @Description:
 * @date 2020/9/19 21:42
 */
public class Recording extends CatalogItem{
	
	/**
	 * @param code
	 * @param title
	 * @param publishDate
	 */
	public Recording(String code, String title, String publishDate) {
		super(code, title, publishDate);
		// TODO Auto-generated constructor stub
	}
	public Recording() {
		super();
	}
	private String performer;
	private String format;
	/**
	 * @return the performer
	 */
	public String getPerformer() {
		return performer;
	}
	/**
	 * @param performer the performer to set
	 */
	public void setPerformer(String performer) {
		this.performer = performer;
	}
	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}
	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public String toString() {
		return  "Recording_" + super.getCode()+"_" + super.getTitle()+"_" + super.getPublishDate()+"_" +
				performer+"_" + format;
	}
}
