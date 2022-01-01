package edu.luc.etl.cs313.android.clickcounter;

import androidx.test.filters.SmallTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Rule;
import org.junit.runner.RunWith;

/**
 * Concrete Android test subclass. Has to inherit from framework class and uses delegation to
 * concrete subclass of abstract test superclass.
 *
 * @author laufer
 * @see http://developer.android.com/tools/testing/activity_testing.html
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class ClickCounterActivityTest extends AbstractClickCounterActivityTest {

  @Rule
  public ActivityTestRule<ClickCounterActivity> activityRule =
      new ActivityTestRule<>(ClickCounterActivity.class);

  @Override
  protected ClickCounterActivity getActivity() {
    return activityRule.getActivity();
  }
}
