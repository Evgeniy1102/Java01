package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.adressbook.appmanager.ApplicationManager;

/**
 * Created by Евгений Сироткин on 21.02.2017.
 */
public class TestBase {

<<<<<<< HEAD
    protected final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);
=======
    protected final ApplicationManager app = new ApplicationManager();
>>>>>>> parent of 129084e... Chrome & IE

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
