// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.util.AttributeSet;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;

public class AudioSwapTabsBar extends DefaultTabsBar
{
    public ViewPager c;
    
    public AudioSwapTabsBar(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void m(final int n, final boolean b) {
        super.m(n, b);
        final ViewPager c = this.c;
        if (c != null && b) {
            c.m(n, true);
        }
    }
}
