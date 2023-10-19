package com.crowdar.examples.constants;

import org.checkerframework.checker.index.qual.PolyUpperBound;

public class TimeEntriesConstants {
    public static final String PLUS_BUTTON = "id:floating_action_button";
    public static final String INPUT_HOURS = "xpath://android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.NumberPicker[1]/android.widget.EditText";
    public static final String HOURS_BUTTON = "xpath://android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.NumberPicker[1]/android.widget.Button[2]";
    public static final String INPUT_MINUTES = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.NumberPicker[2]/android.widget.EditText";
    public static final String MINUTES_BUTTON = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.NumberPicker[2]/android.widget.Button[2]";
    public static final String INPUT_DESCRIPTION = "id:time_entry_description_input";
    public static final String PROJECT_BUTTON = "id:timeentry_project_section";
    public static final String CROWDAR_PROJECT = "xpath://*[contains(@text, 'Crowdar Academy')]";
    public static final String SAVE_BUTTON = "xpath://*[contains(@text, 'SAVE')]";
    public static final String DIV_HOURS_DESCRIPTION = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup";
    public static final String HOURS_LABEL_DESCRIPTION = "xpath://*[contains(@text, 'TP Crowdar Academy')]";
    public static final String HOURS_NOT_DISPLAYED_MESSAGE = "Hours Input is not displayed.";
    public static final String BACK_ARROW_BUTTON = "ACCESSIBILITY_ID:Navigate up";
    public static final String DISCARD_BUTTON_POPUP = "xpath://*[contains(@text, 'DISCARD')]";
    public static final String TIME_ENTRIES_HEADER = "xpath://android.widget.TextView[@content-desc='Time entries']";
    public static final String START_DATE = "xpath://android.view.View[@content-desc='%s']";
    public static final String END_DATE = "xpath://android.view.View[@content-desc='%s']";
    public static final String END_BUTTON = "xpath://android.widget.LinearLayout[@content-desc='END']";
    public static final String ADD_DATES = "id:constraintLayout";
    public static final String SAVE_DATE_BUTTON = "xpath://*[contains(@text, 'SAVE')]";

}
