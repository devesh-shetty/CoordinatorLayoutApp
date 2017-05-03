package com.shetty.devesh.meetupapp;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * FooterBarLayout is a wrapper container which contains a TextView acting as a footer
 * A default behavior of {@link FooterLayoutBehavior} is attached to it.
 */
@CoordinatorLayout.DefaultBehavior(FooterLayoutBehavior.class)
public class FooterBarLayout extends FrameLayout {
  public FooterBarLayout(@NonNull Context context) {
    super(context);
  }
  public FooterBarLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }
  public FooterBarLayout(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }
}
