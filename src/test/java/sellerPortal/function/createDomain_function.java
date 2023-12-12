package sellerPortal.function;

import core.basePage;
import core.common_function;
import junit.framework.Assert;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import sellerPortal.page.createDomain_page;

public class createDomain_function extends basePage {
    public createDomain_function(WebDriver driver) {
        super(driver);
    }
    common_function commonFunction =new common_function(driver);
    createDomain_page createDomainPage = new createDomain_page();

    public String randomSubdomain(){
        String subdomain = RandomStringUtils.randomAlphabetic(10);
        return subdomain;
    }

    public void createSubdomain() throws InterruptedException {
        commonFunction.senKeys(createDomainPage.subdomain,randomSubdomain());
    }
    public void createEhighwayDomain() throws InterruptedException {
        commonFunction.senKeys(createDomainPage.subdomain,randomSubdomain());
        String subdomain = commonFunction.getValue(createDomainPage.subdomain);
//        System.out.println(subdomain);
        commonFunction.verifyElement(createDomainPage.verifyValueDomain,".devshop.ehighway.co");
        String domain = "https://" + subdomain +".devshop.ehighway.co";
        System.out.println(domain);
        Thread.sleep(2000);
        commonFunction.click(createDomainPage.confirmBtn);
        Thread.sleep(2000);
        commonFunction.verifyPage(createDomainPage.titleEditSellpage);
        Assert.assertEquals(domain,commonFunction.getText(createDomainPage.domainSellpage));
    }
    public void createCustomizeDomain() throws InterruptedException {
        commonFunction.click(createDomainPage.customizeRadio);
        commonFunction.verifyPage(createDomainPage.noteCustomize);
        commonFunction.verifyElement(createDomainPage.noteCustomize,"DNS changes can take up to 10 minutes to apply.");
        commonFunction.senKeys(createDomainPage.subdomain,randomSubdomain());
        String subdomain = commonFunction.getValue(createDomainPage.subdomain);
//        System.out.println(subdomain);
        commonFunction.click(createDomainPage.domain);
        commonFunction.click(createDomainPage.valueDomain);
//        commonFunction.verifyElement(createDomainPage.verifyValueDomain,".decorwix.online");
        commonFunction.verifyElement(createDomainPage.verifyValueDomain,".rochenianly.space");
//        String domain = "https://" + subdomain +".decorwix.online";
        String domain = "https://" + subdomain +".rochenianly.space";
        System.out.println(domain);
        Thread.sleep(2000);
        commonFunction.click(createDomainPage.confirmBtn);
        Thread.sleep(2000);
        commonFunction.verifyPage(createDomainPage.titleEditSellpage);
        Assert.assertEquals(domain,commonFunction.getText(createDomainPage.domainSellpage));
    }
   public void createCustomizeDomainVerify() throws InterruptedException {
       commonFunction.click(createDomainPage.customizeRadio);
       commonFunction.verifyPage(createDomainPage.noteCustomize);
       commonFunction.verifyElement(createDomainPage.noteCustomize,"DNS changes can take up to 10 minutes to apply.");
       commonFunction.senKeys(createDomainPage.subdomain,randomSubdomain());
       String subdomain = commonFunction.getValue(createDomainPage.subdomain);
//        System.out.println(subdomain);
       commonFunction.click(createDomainPage.domain);
       commonFunction.click(createDomainPage.domainVerify);
//        commonFunction.verifyElement(createDomainPage.verifyValueDomain,".decorwix.online");
       commonFunction.verifyElement(createDomainPage.verifyValueDomain,".miracool.bio");
//        String domain = "https://" + subdomain +".decorwix.online";
       String domain = "https://" + subdomain +".miracool.bio";
       System.out.println(domain);
       Thread.sleep(2000);
       commonFunction.click(createDomainPage.confirmBtn);
       Thread.sleep(2000);
       commonFunction.verifyPage(createDomainPage.titleEditSellpage);
       Assert.assertEquals(domain,commonFunction.getText(createDomainPage.domainSellpage));

   }

}
