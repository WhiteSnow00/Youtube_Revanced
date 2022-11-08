// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.subscriptions.widget;

import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

public class MinWidthVisibleTextView extends YouTubeTextView
{
    private Integer a;
    
    public MinWidthVisibleTextView(final Context context) {
        super(context);
    }
    
    public MinWidthVisibleTextView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public MinWidthVisibleTextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    final void a(final int visibility, final boolean b) {
        if (b) {
            this.a = visibility;
        }
        super.setVisibility(visibility);
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (this.a == null) {
            this.a = this.getVisibility();
        }
        if (this.getVisibility() == 8 || (this.getVisibility() == 4 && this.a == 4)) {
            super.onMeasure(n, n2);
            return;
        }
        int size;
        if (View$MeasureSpec.getMode(n) == 0) {
            size = Integer.MAX_VALUE;
        }
        else {
            size = View$MeasureSpec.getSize(n);
        }
        if (size >= this.getMinimumWidth()) {
            if (this.getVisibility() != this.a) {
                this.a(this.a, false);
            }
            super.onMeasure(n, n2);
            return;
        }
        if (this.getVisibility() != 4) {
            this.a(4, false);
        }
        this.setMeasuredDimension(0, 0);
    }
    
    public final void setVisibility(final int n) {
        this.a(n, true);
    }
}
