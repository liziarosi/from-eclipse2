package org.pommanager;

import java.util.ArrayList;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass{
	
	public AmazonPojo()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	
	@FindBy(xpath="//div//a//h2//span")
	private List<WebElement> results;
	
	@FindBy(xpath="//a[@aria-label='Go to page 2']")
	private WebElement nextpage;

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public List<WebElement> getResults() {
		return results;
	}

	public void setResults(List<WebElement> results) {
		this.results = results;
	}

	public WebElement getNextpage() {
		return nextpage;
	}

	public void setNextpage(WebElement nextpage) {
		this.nextpage = nextpage;
	}
	
    public void search(String searchword)
    {
    	this.search.sendKeys(searchword,Keys.ENTER);
    }
    public void resultstore()
    {
    	int size = this.results.size();
    	int j=0;
    	int k=0;
    	List <String> contlist = new ArrayList();
    	List <String> notcontlist = new ArrayList();
    	for(int i=0;i<size;i++)
    	{
    		WebElement webElement = this.results.get(i);
    		String text = webElement.getText();
    		//System.out.println("\n"+text);
    		
    	    if(text.contains("iPhone"))
    				{
    	    	System.out.println("Added in productcontainslist:");
    				
    				contlist.add(j, text);
    				j++;
    			System.out.println("\n"+contlist);
    				}
    		else
    		{
    			System.out.println("Added in productnotcontainslist:");
    			
				notcontlist.add(k, text);
				k++;
    			System.out.println("\n"+notcontlist);
    	
    		}
    	   // public String contsrchword(String prodName)
    	   // {
    	    	
    	   // }
    	}
    }
	

}
