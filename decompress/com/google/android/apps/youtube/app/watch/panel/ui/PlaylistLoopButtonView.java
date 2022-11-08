// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.panel.ui;

import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.AppCompatImageView;

public class PlaylistLoopButtonView extends AppCompatImageView
{
    public static final int[] a;
    public int[] b;
    
    static {
        a = new int[] { 2130970344 };
    }
    
    public PlaylistLoopButtonView(final Context context) {
        this(context, null);
    }
    
    public PlaylistLoopButtonView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public PlaylistLoopButtonView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final int[] onCreateDrawableState(final int n) {
        final int[] b = this.b;
        if (b != null) {
            return mergeDrawableStates(super.onCreateDrawableState(n + 1), b);
        }
        return super.onCreateDrawableState(n);
    }
}
