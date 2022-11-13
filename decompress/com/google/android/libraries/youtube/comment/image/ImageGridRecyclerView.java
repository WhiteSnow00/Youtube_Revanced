// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.comment.image;

import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ImageGridRecyclerView extends RecyclerView
{
    public GridLayoutManager aa;
    private int ab;
    
    public ImageGridRecyclerView(final Context context, final AttributeSet set) {
        super(context, set);
        this.ab = context.getResources().getDimensionPixelSize(2131166877);
        this.af((nw)(this.aa = (GridLayoutManager)new sqn(this.getContext())));
        this.aC((hy)new sqo(context));
    }
    
    protected final void onMeasure(int max, final int n) {
        super.onMeasure(max, n);
        max = Math.max(1, this.getMeasuredWidth() / this.ab);
        this.aa.r(max);
    }
}
