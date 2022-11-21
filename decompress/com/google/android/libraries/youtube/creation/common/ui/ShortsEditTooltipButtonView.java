// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.common.ui;

import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;

public final class ShortsEditTooltipButtonView extends LinearLayout
{
    private TextView a;
    private ImageView b;
    
    public ShortsEditTooltipButtonView(final Context context) {
        this(context, null);
    }
    
    public ShortsEditTooltipButtonView(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set);
        LayoutInflater.from(this.getContext()).inflate(2131625405, (ViewGroup)this);
        this.setVerticalGravity(16);
        this.setOrientation(0);
        this.b = (ImageView)this.findViewById(2131431488);
        this.a = (TextView)this.findViewById(2131431489);
        if (set == null) {
            return;
        }
        obtainStyledAttributes = (Context)this.getContext().getTheme().obtainStyledAttributes(set, tyn.b, 0, 0);
        try {
            final int resourceId = ((TypedArray)obtainStyledAttributes).getResourceId(2, -1);
            if (resourceId != -1) {
                final ImageView b = this.b;
                if (b != null) {
                    b.setImageDrawable(this.getContext().getResources().getDrawable(resourceId));
                }
            }
            final String string = ((TypedArray)obtainStyledAttributes).getString(1);
            final TextView a = this.a;
            if (a != null && string != null) {
                a.setText((CharSequence)string);
            }
            this.setContentDescription((CharSequence)((TypedArray)obtainStyledAttributes).getString(0));
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
}
