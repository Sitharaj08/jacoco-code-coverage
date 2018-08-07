package com.sitharaj.coverage;

import android.widget.Button;
import android.widget.TextView;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityUnitTest {

    @Test
    public void shouldHideButtonAfterClick() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        Button button = activity.findViewById(R.id.changeText);
        TextView textView = activity.findViewById(R.id.text);
        button.performClick();

        Assert.assertEquals(button.getText().toString(), textView.getText().toString());
    }
}
