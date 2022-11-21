// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.gallery;

import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MediaGridRecyclerView extends RecyclerView
{
    private final int aa;
    private final GridLayoutManager ab;
    
    public MediaGridRecyclerView(final Context context, final AttributeSet set) {
        super(context, set);
        this.aa = context.getResources().getDimensionPixelSize(2131166554);
        this.getContext();
        this.af((nx)(this.ab = new GridLayoutManager(3)));
    }
    
    protected final void onMeasure(int max, final int n) {
        super.onMeasure(max, n);
        max = Math.max(1, this.getMeasuredWidth() / this.aa);
        this.ab.r(max);
    }
}
