// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.common.ui;

import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.util.List;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.widget.FrameLayout;

public class CreationButtonView extends FrameLayout
{
    private final Context a;
    public TextView b;
    public ImageView c;
    public boolean d;
    public txd e;
    public xab f;
    public String g;
    private ImageView h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;
    
    public CreationButtonView(final Context context) {
        this(context, null);
    }
    
    public CreationButtonView(final Context a, final AttributeSet set) {
        super(a, set);
        this.a = a;
        final TypedArray obtainStyledAttributes = a.getTheme().obtainStyledAttributes(set, txl.a, 0, 0);
        final int int1 = obtainStyledAttributes.getInt(2, 0);
        int n;
        if (int1 != 1) {
            if (int1 != 2) {
                n = 2131625212;
            }
            else {
                n = 2131625389;
            }
        }
        else {
            this.i = true;
            n = 2131625390;
        }
        LayoutInflater.from(a).inflate(n, (ViewGroup)this);
        this.b = (TextView)this.findViewById(2131428805);
        this.c = (ImageView)this.findViewById(2131428804);
        ImageView h;
        int n2;
        if (int1 == 1) {
            h = (ImageView)this.findViewById(2131430051);
            n2 = 1;
        }
        else {
            n2 = int1;
            h = null;
        }
        this.h = h;
        if (set != null) {
            final int resourceId = obtainStyledAttributes.getResourceId(3, -1);
            if (resourceId != -1) {
                this.c.setImageDrawable(fc.b(a, resourceId));
                this.a();
            }
            final String string = obtainStyledAttributes.getString(1);
            if (string != null) {
                this.b.setText((CharSequence)string);
            }
            else {
                this.b.setVisibility(8);
            }
            this.setContentDescription((CharSequence)obtainStyledAttributes.getString(0));
            final int integer = obtainStyledAttributes.getInteger(6, 0);
            if (integer != 0) {
                this.f = xaa.c(integer);
            }
            this.g = obtainStyledAttributes.getString(5);
            if (n2 == 1) {
                this.b.setVisibility(8);
            }
        }
        this.setOnClickListener(null);
    }
    
    private final void a() {
        if (!this.l) {
            this.j = this.c.getLayoutParams().width;
            this.k = this.c.getLayoutParams().height;
        }
    }
    
    public final void b(final int n) {
        this.d(fc.b(this.a, n));
    }
    
    public final void c(final int backgroundResource) {
        this.c.setBackgroundResource(backgroundResource);
    }
    
    public final void d(final Drawable imageDrawable) {
        this.c.setImageDrawable(imageDrawable);
        this.a();
    }
    
    public final void e(final String s) {
        this.b.setText((CharSequence)s);
        this.setContentDescription((CharSequence)s);
    }
    
    public final void f(final boolean b) {
        final ImageView h = this.h;
        if (h != null) {
            int visibility;
            if (!b) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            h.setVisibility(visibility);
        }
    }
    
    public final void g(final CharSequence text) {
        this.b.setText(text);
    }
    
    public final void onVisibilityChanged(final View view, final int n) {
        super.onVisibilityChanged(view, n);
        final txd e = this.e;
        if (e != null && view == this) {
            final gvy gvy = (gvy)e;
            gvy.n();
            gvy.k();
            gvy.g(this);
            final List b = gvy.b();
            final List c = gvy.c();
            if (this.getVisibility() == 0 && (b.contains(this) || (c.contains(this) && gvy.m == 1))) {
                if (gvy.n && this.b.getVisibility() != 0) {
                    gvy.r(this);
                    return;
                }
                if (!gvy.n && this.b.getVisibility() == 0) {
                    gvy.p(this);
                }
            }
        }
    }
    
    public final void setEnabled(final boolean b) {
        super.setEnabled(b);
        this.b.setEnabled(b);
        vdh.P(this.getContext(), this.c, b);
    }
    
    public final void setOnClickListener(final View$OnClickListener view$OnClickListener) {
        super.setOnClickListener((View$OnClickListener)new suf(this, view$OnClickListener, 13));
    }
    
    public final void setPressed(final boolean b) {
        super.setPressed(b);
        this.l = b;
        int j = this.j;
        int k = this.k;
        final boolean i = this.i;
        int n = 0;
        int n3;
        int n4;
        int n5;
        if (i && b) {
            final double n2 = Math.max(j, k);
            Double.isNaN(n2);
            final int max = Math.max(9, (int)(n2 * 0.06));
            final int l = this.k;
            k = l - max;
            final int m = this.j;
            j = m - max;
            n3 = max / 2;
            n4 = m - j - n3;
            n5 = l - k - n3;
            n = n3;
        }
        else {
            n3 = 0;
            n4 = 0;
            n5 = 0;
        }
        final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)this.c.getLayoutParams();
        layoutParams.setMargins(n, n3, n4, n5);
        layoutParams.height = k;
        layoutParams.width = j;
        this.c.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.c.requestLayout();
    }
    
    public final void setVisibility(final int visibility) {
        this.getVisibility();
        super.setVisibility(visibility);
    }
}
