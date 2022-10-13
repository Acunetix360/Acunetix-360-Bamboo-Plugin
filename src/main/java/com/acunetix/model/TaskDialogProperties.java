package com.acunetix.model;

public class TaskDialogProperties {

    public static final String HIDE_WEBSITE_LIST_Literal = "acunetix360HideWebsiteList";
    public final String HideWebsiteList;

    public TaskDialogProperties(String hideWebsiteList) {
        this.HideWebsiteList = hideWebsiteList;
    }

    public TaskDialogProperties() {
        this.HideWebsiteList = null;
    }

}