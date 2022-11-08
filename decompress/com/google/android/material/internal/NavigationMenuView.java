// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

public class NavigationMenuView extends RecyclerView implements jb
{
    public NavigationMenuView(final Context context) {
        this(context, null);
    }
    
    public NavigationMenuView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public NavigationMenuView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.af((nw)new LinearLayoutManager(1));
    }
    
    public final void a(final im im) {
    }
}
