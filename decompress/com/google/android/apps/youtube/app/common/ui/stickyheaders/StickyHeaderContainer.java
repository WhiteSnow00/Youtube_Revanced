// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.stickyheaders;

import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;

public final class StickyHeaderContainer extends FrameLayout
{
    public final RecyclerView a;
    
    public StickyHeaderContainer(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public StickyHeaderContainer(final Context context, final AttributeSet set, int resourceId) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, gkd.a, resourceId, 0);
        resourceId = obtainStyledAttributes.getResourceId(0, 2131625181);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(resourceId, (ViewGroup)this);
        this.a = (RecyclerView)this.getChildAt(0);
    }
}
