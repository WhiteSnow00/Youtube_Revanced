// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.common.ui;

import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Context;
import android.widget.FrameLayout;

public final class ShortsEditToolButtonView extends FrameLayout
{
    public final Context a;
    public ImageView b;
    private TextView c;
    
    public ShortsEditToolButtonView(final Context context) {
        this(context, null);
    }
    
    public ShortsEditToolButtonView(final Context a, final AttributeSet set) {
        super(a, set);
        this.a = a;
        LayoutInflater.from(a).inflate(2131625401, (ViewGroup)this);
        final ImageView b = (ImageView)this.findViewById(2131431484);
        b.getClass();
        this.b = b;
        final TextView c = (TextView)this.findViewById(2131431485);
        c.getClass();
        this.c = c;
        if (set == null) {
            return;
        }
        final TypedArray obtainStyledAttributes = a.getTheme().obtainStyledAttributes(set, txl.a, 0, 0);
        if (obtainStyledAttributes.hasValue(4)) {
            final ImageView b2 = this.b;
            b2.getClass();
            b2.setImageTintList(ColorStateList.valueOf(obtainStyledAttributes.getColor(4, -1)));
        }
        final int resourceId = obtainStyledAttributes.getResourceId(3, -1);
        if (resourceId != -1) {
            final ImageView b3 = this.b;
            b3.getClass();
            b3.setImageDrawable(a.getResources().getDrawable(resourceId));
        }
        final String string = obtainStyledAttributes.getString(1);
        final TextView c2 = this.c;
        c2.getClass();
        c2.setText((CharSequence)string);
        this.setContentDescription((CharSequence)obtainStyledAttributes.getString(0));
    }
    
    public final void a(final String s) {
        final TextView c = this.c;
        c.getClass();
        c.setText((CharSequence)s);
        this.setContentDescription((CharSequence)s);
    }
    
    public final void setEnabled(final boolean b) {
        super.setEnabled(b);
        final TextView c = this.c;
        c.getClass();
        c.setEnabled(b);
        final Context context = this.getContext();
        final ImageView b2 = this.b;
        b2.getClass();
        vdh.P(context, b2, b);
    }
}
