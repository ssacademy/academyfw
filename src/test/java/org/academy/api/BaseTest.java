package org.academy.api;

import org.academy.MainConfig;
import org.academy.utils.helpers.ApiHelpers;
import org.academy.utils.helpers.DataRandomizer;
import org.testng.annotations.Listeners;

@Listeners(org.academy.tools.TestNgListener.class)
public abstract class BaseTest extends MainConfig {
    protected ApiHelpers apiHelpers = new ApiHelpers();
    protected DataRandomizer dr = new DataRandomizer();
}
