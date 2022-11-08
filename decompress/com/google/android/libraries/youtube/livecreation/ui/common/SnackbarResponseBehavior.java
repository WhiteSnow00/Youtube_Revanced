// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.common;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar$SnackbarLayout;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class SnackbarResponseBehavior extends SwipeDismissBehavior
{
    public SnackbarResponseBehavior(final Context context, final AttributeSet set) {
    }
    
    public final boolean n(final View view) {
        return view instanceof Snackbar$SnackbarLayout;
    }
    
    public final boolean qE(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        if (!(view2 instanceof Snackbar$SnackbarLayout)) {
            return false;
        }
        if (view.getVisibility() != 0) {
            return false;
        }
        view.setTranslationY(Math.min(0.0f, view2.getTranslationY() - view2.getHeight()));
        return true;
    }
    
    public final boolean w(final View view) {
        return false;
    }
}
