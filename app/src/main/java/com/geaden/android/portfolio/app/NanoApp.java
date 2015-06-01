package com.geaden.android.portfolio.app;

import java.io.Serializable;

/**
 * POJO representing nano degree app.
 *
 * @author Gennady Denisov
 */
public class NanoApp implements Serializable {
    private String title;
    private String shortTitle;

    public NanoApp(String title, String shortTitle) {
        this.title = title;
        this.shortTitle = shortTitle;
    }

    public String getTitle() {
        return title;
    }

    public String getShortTitle() {
        return shortTitle;
    }
}
