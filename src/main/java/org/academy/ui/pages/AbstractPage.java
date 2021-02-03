package org.academy.ui.pages;

import lombok.extern.slf4j.Slf4j;
import org.academy.utils.helpers.WebHelpers;
import java.util.Objects;

@Slf4j
public class AbstractPage extends WebHelpers {

    public AbstractPage() {
    }

    public AbstractPage(boolean navigateToPage, String navigateToPageUrl) {
        if (navigateToPage && !Objects.equals(webDriver.getCurrentUrl(), navigateToPageUrl)) {
            webDriver.get(navigateToPageUrl);
        }
    }
}
