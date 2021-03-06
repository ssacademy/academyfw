//package org.academy.ui;
//
//import org.academy.ui.pages.MainPage;
//import org.academy.ui.steps.LoginSteps;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class AddSuiteTest extends BaseTest {
//
//    private LoginSteps loginSteps = new LoginSteps();
//    private MainPage mainPage;
//
//    @BeforeMethod(alwaysRun = true)
//    public void precondition() {
//        mainPage = loginSteps.makeLogin();
//    }
//
//    @Test
//    public void addSuiteTest() {
//        AddSuitePage addSuitePage = mainPage.clickOnProjectLink()
//                .clickOnTestCasesLink();
//        try {
//            addSuitePage.clickOnAddSectionBtn()
//                    .fillNameField("Test Section")
//                    .fillDescriptionField("Test Description");
//            addSuitePage.clickOnAcceptBtn();
//
//        } catch (RuntimeException e) {
//            addSuitePage.clickOnAddSectionLink()
//                    .fillNameField("Test Section")
//                    .fillDescriptionField("Test Description");
//            addSuitePage.clickOnAcceptBtn();
//            addSuitePage.refreshPage();
//        } finally {
//            addSuitePage.waitUntilElementIsClickable(addSuitePage.getSectionTitle());
//            addSuitePage.placeCursorOverElement();
//            addSuitePage
//                    .clickOnDeleteBtn()
//                    .clickOnConfirmDeleteCheckBox()
//                    .clickOnOkBtn();
//        }
//    }
//}
