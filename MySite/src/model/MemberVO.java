package model;



public class MemberVO {
	private String id;
	private String name;
	private String password;
	private int urlno;
	private String url;
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MemberVO(String name) {
		super();
		this.name = name;
	}
	
	public MemberVO(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public MemberVO(String id, String name, String password, int urlno, String url) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.urlno = urlno;
		this.url = url;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUrlno() {
		return urlno;
	}
	public void setUrlno(int urlno) {
		this.urlno = urlno;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
