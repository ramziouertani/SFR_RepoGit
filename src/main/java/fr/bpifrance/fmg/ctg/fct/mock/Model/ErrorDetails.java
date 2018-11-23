package fr.bpifrance.fmg.ctg.fct.mock.Model;

public class ErrorDetails {
	
	public String code;
	
	public String title;
	
	public String description;
	
	

	public ErrorDetails() {
		super();
	}

	
	public ErrorDetails(String code, String title, String description) {
		super();
		this.code = code;
		this.title = title;
		this.description = description;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
