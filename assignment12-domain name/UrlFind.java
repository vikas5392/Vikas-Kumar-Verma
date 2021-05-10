
import java.util.Scanner;

class Data{
    private String domainName;
    private  String url;

    public void setDomainName(String domainName){
        this.domainName=domainName;
    }
    public String getDomainName(){
        return domainName;
    }
    public void setUrl(String url){
        this.url=url;
    }
    public String getUrl(){
        return url;
    }
void extractUrl(String urlname){
      int iStart= urlname.indexOf(':')+3;
      int iEnd=urlname.indexOf('/',iStart);
      domainName=urlname.substring(iStart,iEnd);
    System.out.println("Domain name is "+ domainName);
}

}

public class UrlFind {
    public static void main(String[] args) {
    Data dataObject=new Data();
    Scanner input=new Scanner(System.in);
        System.out.println("Enter the URL:");
        String inputUrl=input.next();
        dataObject.setUrl(inputUrl);
        System.out.println("URL is "+dataObject.getUrl());
        dataObject.extractUrl(dataObject.getUrl());

    }
}
