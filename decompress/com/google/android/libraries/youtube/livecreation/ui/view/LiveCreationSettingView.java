// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.res.TypedArray;
import android.view.View;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;

public class LiveCreationSettingView extends LinearLayout implements View$OnClickListener
{
    public afhd a;
    private final TextView b;
    private final ImageView c;
    private final ImageView d;
    private final CharSequence e;
    
    public LiveCreationSettingView(final Context context, final AttributeSet set) {
        super(context, set);
        inflate(context, 2131624650, (ViewGroup)this);
        Object obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, wql.c, 0, 0);
        try {
            final Drawable drawable = ((TypedArray)obtainStyledAttributes).getDrawable(1);
            final CharSequence text = ((TypedArray)obtainStyledAttributes).getText(2);
            this.e = text;
            final CharSequence text2 = ((TypedArray)obtainStyledAttributes).getText(3);
            final CharSequence text3 = ((TypedArray)obtainStyledAttributes).getText(0);
            ((TypedArray)obtainStyledAttributes).recycle();
            obtainStyledAttributes = this.findViewById(2131431390);
            this.b = (TextView)obtainStyledAttributes;
            final ImageView c = (ImageView)this.findViewById(2131431389);
            this.c = c;
            final ImageView d = (ImageView)this.findViewById(2131428213);
            this.d = d;
            ((TextView)obtainStyledAttributes).setText(text);
            ((TextView)obtainStyledAttributes).setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable)null, (Drawable)null, (Drawable)null);
            ((TextView)obtainStyledAttributes).setOnClickListener((View$OnClickListener)this);
            c.setOnClickListener((View$OnClickListener)this);
            d.setOnClickListener((View$OnClickListener)this);
            c.setContentDescription(text2);
            d.setContentDescription(text3);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public final void a(CharSequence e) {
        final boolean b = TextUtils.isEmpty(e) ^ true;
        final TextView b2 = this.b;
        if (!b) {
            e = this.e;
        }
        b2.setText(e);
        tpe.v((View)this.c, b ^ true);
        tpe.v((View)this.d, b);
    }
    
    public final void onClick(final View view) {
        if (view != this.b && view != this.c) {
            if (view == this.d) {
                this.a(null);
                final afhd a = this.a;
                if (a != null) {
                    ((wtm)a.a).ax = null;
                }
            }
        }
        else {
            final afhd a2 = this.a;
            if (a2 != null) {
                ((wtm)a2.a).c.b(2131429114);
            }
        }
    }
}
