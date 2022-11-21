// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.fragment;

import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.support.v7.widget.RecyclerView;

public class ReelRecyclerView extends RecyclerView
{
    public View aa;
    
    public ReelRecyclerView(final Context context) {
        super(context);
    }
    
    public ReelRecyclerView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public ReelRecyclerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void a(final boolean b) {
        hll.e(this.aa, b);
    }
}
