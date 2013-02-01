package edu.luc.etl.cs313.android.clickcounter.android;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;

/**
 * Concrete Android test subclass. Has to inherit from framework class
 * and uses delegation to concrete subclass of abstract test superclass.
 * IMPORTANT: project must export JUnit 4 to make it available on the
 * device.
 *
 * @author laufer
 * @see http://developer.android.com/tools/testing/activity_testing.html
 */
public class ClickCounterActivityInstrumentationTest extends ActivityInstrumentationTestCase2<ClickCounterAdapter> {

    /**
     * Creates an {@link ActivityInstrumentationTestCase2} for the {@link SkeletonActivity}
     * activity.
     */
	public ClickCounterActivityInstrumentationTest() {
		super(ClickCounterAdapter.class);
		actualTest = new ClickCounterActivityTest() {
			@Override
			protected ClickCounterAdapter getActivity() {
				// return activity instance provided by instrumentation test
		    	return ClickCounterActivityInstrumentationTest.this.getActivity();
			}
		};
	}

	// test subclass instance to delegate to
	private ClickCounterActivityTest actualTest;

	public void testActivityTestCaseSetUpProperly() {
		actualTest.testActivityTestCaseSetUpProperly();
    }

    @UiThreadTest
    public void testActivityScenarioIncReset() {
		actualTest.testActivityScenarioIncReset();
    }

    @UiThreadTest
    public void testActivityScenarioIncUntilFull() {
		actualTest.testActivityScenarioIncUntilFull();
    }
}