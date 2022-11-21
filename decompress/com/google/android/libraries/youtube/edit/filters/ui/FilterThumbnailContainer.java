// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.filters.ui;

import android.view.ViewOutlineProvider;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public final class FilterThumbnailContainer extends FrameLayout
{
    public FilterThumbnailContainer(final Context context, final AttributeSet set) {
        super(context, set);
        this.setOutlineProvider((ViewOutlineProvider)new usg(this.getResources().getDimension(2131165581)));
        this.setClipToOutline(true);
    }
}
