// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class NoOverlapImageView extends ImageView
{
    public NoOverlapImageView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public NoOverlapImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public NoOverlapImageView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
