package com.son.aos;

/**
 * Created by 01020072846 on 2017-09-10.
 */

public class SchoolItem {
    private int icon;
    private String schoolName;
    private String schoolDes;

    public SchoolItem(int icon, String schoolName, String schoolDes) {
        this.icon = icon;
        this.schoolName = schoolName;
        this.schoolDes = schoolDes;
    }

    public int getIcon() {
        return this.icon;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public String getSchoolDes() {
        return this.schoolDes;
    }
}
