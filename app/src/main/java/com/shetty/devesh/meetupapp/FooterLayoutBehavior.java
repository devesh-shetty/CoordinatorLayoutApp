package com.shetty.devesh.meetupapp;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;


/**
 * A custom Behavior for FooterBarLayout{@link FooterBarLayout}
 * 
 */
public class FooterLayoutBehavior extends CoordinatorLayout.Behavior<FooterBarLayout> {

  /**
   * This constructor is useful when we are attaching FooterLayoutBehavior{@link FooterLayoutBehavior} as a default behavior
   * to any view using annotation {@link android.support.design.widget.CoordinatorLayout.DefaultBehavior}
   */
  public FooterLayoutBehavior() {

  }

  /**
   * This constructor is useful when we are attaching FooterLayoutBehavior{@link FooterLayoutBehavior} to a view via XML
   * @param context
   * @param attrs
   */
  public FooterLayoutBehavior(Context context, AttributeSet attrs) {
    super(context, attrs);
  }


  @Override
  public boolean layoutDependsOn(CoordinatorLayout parent, FooterBarLayout child, View dependency) {
    //return true when dependency is an instance of AppBarLayout since we want to listen for changes made on the AppBarLayout
    return dependency instanceof AppBarLayout;
  }

  @Override
  public boolean onDependentViewChanged(CoordinatorLayout parent, FooterBarLayout child, View dependency) {
    //triggered whenever incremental changes happen on dependentView; in this case AppBarLayout
    int offset = -dependency.getTop();
    child.setTranslationY(offset);
    return true;//return true when the view has changed it's position
  }



}
