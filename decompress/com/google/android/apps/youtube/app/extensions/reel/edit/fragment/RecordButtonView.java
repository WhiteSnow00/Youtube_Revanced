// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;
import android.widget.ImageView;
import android.widget.FrameLayout;

public class RecordButtonView extends FrameLayout
{
    public ImageView a;
    public FrameLayout b;
    public ProgressBar c;
    private FrameLayout d;
    
    public RecordButtonView(final Context context, final AttributeSet set) {
        super(context, set);
        LayoutInflater.from(context).inflate(2131625188, (ViewGroup)this, true);
        this.a = (ImageView)this.findViewById(2131430833);
        this.d = (FrameLayout)this.findViewById(2131430836);
        this.c = (ProgressBar)this.findViewById(2131430821);
        this.b = (FrameLayout)this.findViewById(2131431025);
    }
    
    public final void setContentDescription(final CharSequence charSequence) {
        super.setContentDescription(charSequence);
        this.d.setContentDescription(charSequence);
    }
    
    public final void setOnClickListener(final View$OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }
    
    public final void setOnTouchListener(final View$OnTouchListener onTouchListener) {
        this.d.setOnTouchListener(onTouchListener);
    }
}
