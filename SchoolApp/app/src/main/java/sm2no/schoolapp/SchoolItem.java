package sm2no.schoolapp;

import android.graphics.drawable.Drawable;

/**
 * Created by 01020072846 on 2017-10-17.
 */

public class SchoolItem {
    private Drawable icon;
    private String name;
    private String contents;

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}