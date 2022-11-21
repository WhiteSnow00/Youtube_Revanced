// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.gallery;

import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;

public class ShortsGalleryHeaderView extends RelativeLayout
{
    public ShortsGalleryHeaderView(final Context context) {
        this(context, null);
    }
    
    public ShortsGalleryHeaderView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ShortsGalleryHeaderView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(this.getResources().getDisplayMetrics().heightPixels / 3, 1073741824));
    }
}
