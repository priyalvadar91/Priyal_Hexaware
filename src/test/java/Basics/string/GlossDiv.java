package Basics.string;

public class GlossDiv{
	private GlossList glossList;
	private String title;

	public void setGlossList(GlossList glossList){
		this.glossList = glossList;
	}

	public GlossList getGlossList(){
		return glossList;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"GlossDiv{" + 
			"glossList = '" + glossList + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}
