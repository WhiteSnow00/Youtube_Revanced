// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects;

import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

public final class GreenScreenMediaPickerView extends LinearLayout
{
    public final HorizontalScrollView a;
    public final LinearLayout b;
    
    public GreenScreenMediaPickerView(final Context context, final AttributeSet set) {
        super(context, set);
        View.inflate(context, 2131624175, (ViewGroup)this);
        this.a = (HorizontalScrollView)this.findViewById(2131427639);
        final LinearLayout b = (LinearLayout)this.findViewById(2131427638);
        this.b = b;
        final ViewGroup$LayoutParams layoutParams = b.getLayoutParams();
        layoutParams.getClass();
        final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)layoutParams;
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166818);
        layoutParams2.topMargin = dimensionPixelSize;
        layoutParams2.bottomMargin = dimensionPixelSize;
        b.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        this.setImportantForAccessibility(1);
    }
}
