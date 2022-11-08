// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.actionbar;

import com.google.android.material.appbar.AppBarLayout;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

public class MainScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior
{
    public boolean a;
    public boolean b;
    int c;
    
    public MainScrollingViewBehavior() {
        this.c = 0;
    }
    
    public MainScrollingViewBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = 0;
    }
    
    public final boolean n(final View view) {
        return !this.a && !this.b && view instanceof AppBarLayout;
    }
    
    public final boolean qE(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        if (this.a) {
            return false;
        }
        ++this.c;
        super.qE(coordinatorLayout, view, view2);
        return false;
    }
}
