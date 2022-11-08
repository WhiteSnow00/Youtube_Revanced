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
    public xpb a;
    private final TextView b;
    private final ImageView c;
    private final ImageView d;
    private final CharSequence e;
    
    public LiveCreationSettingView(final Context context, final AttributeSet set) {
        super(context, set);
        inflate(context, 2131624649, (ViewGroup)this);
        Object obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, wol.c, 0, 0);
        try {
            final Drawable drawable = ((TypedArray)obtainStyledAttributes).getDrawable(1);
            final CharSequence text = ((TypedArray)obtainStyledAttributes).getText(2);
            this.e = text;
            final CharSequence text2 = ((TypedArray)obtainStyledAttributes).getText(3);
            final CharSequence text3 = ((TypedArray)obtainStyledAttributes).getText(0);
            ((TypedArray)obtainStyledAttributes).recycle();
            final TextView b = (TextView)this.findViewById(2131431387);
            this.b = b;
            final ImageView c = (ImageView)this.findViewById(2131431386);
            this.c = c;
            obtainStyledAttributes = this.findViewById(2131428213);
            this.d = (ImageView)obtainStyledAttributes;
            b.setText(text);
            b.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable)null, (Drawable)null, (Drawable)null);
            b.setOnClickListener((View$OnClickListener)this);
            c.setOnClickListener((View$OnClickListener)this);
            ((ImageView)obtainStyledAttributes).setOnClickListener((View$OnClickListener)this);
            c.setContentDescription(text2);
            ((ImageView)obtainStyledAttributes).setContentDescription(text3);
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
        tmy.v((View)this.c, b ^ true);
        tmy.v((View)this.d, b);
    }
    
    public final void onClick(final View view) {
        if (view != this.b && view != this.c) {
            if (view == this.d) {
                this.a(null);
                final xpb a = this.a;
                if (a != null) {
                    ((wrm)a.a).ax = null;
                }
            }
        }
        else {
            final xpb a2 = this.a;
            if (a2 != null) {
                ((wrm)a2.a).c.b(2131429114);
            }
        }
    }
}
