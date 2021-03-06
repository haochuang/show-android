package one.show.live.common.util;

import android.graphics.Bitmap;

import com.facebook.imagepipeline.request.BasePostprocessor;

public final class DelayPostprocessor extends BasePostprocessor {

  private static DelayPostprocessor sSlowPostprocessor;

  private static DelayPostprocessor sMediumPostprocessor;

  private static DelayPostprocessor sFastPostprocessor;

  private final int mDelay;

  private DelayPostprocessor(final int delay) {
    this.mDelay = delay;
  }

  public static DelayPostprocessor getSlowPostprocessor() {
    if (sSlowPostprocessor == null) {
      sSlowPostprocessor = new DelayPostprocessor(20);
    }
    return sSlowPostprocessor;
  }

  public static DelayPostprocessor getMediumPostprocessor() {
    if (sMediumPostprocessor == null) {
      sMediumPostprocessor = new DelayPostprocessor(10);
    }
    return sMediumPostprocessor;
  }

  public static DelayPostprocessor getFastPostprocessor() {
    if (sFastPostprocessor == null) {
      sFastPostprocessor = new DelayPostprocessor(5);
    }
    return sFastPostprocessor;
  }

  @Override
  public void process(Bitmap bitmap) {
    FrescoUtils.Fib(mDelay);
  }
}