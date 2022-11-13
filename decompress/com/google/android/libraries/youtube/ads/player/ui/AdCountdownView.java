// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.ads.player.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;

public class AdCountdownView extends LinearLayout implements View$OnClickListener
{
    public slf a;
    public sle b;
    public skw c;
    public ImageView d;
    public boolean e;
    public boolean f;
    public boolean g;
    public sgp h;
    public int i;
    public int j;
    public int k;
    public int l;
    private CharSequence m;
    private CharSequence n;
    
    public AdCountdownView(final Context context) {
        super(context);
        this.c();
    }
    
    public AdCountdownView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c();
    }
    
    public AdCountdownView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c();
    }
    
    public AdCountdownView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.c();
    }
    
    private final void c() {
        LayoutInflater.from(this.getContext()).inflate(2131623999, (ViewGroup)this, true);
        this.setOrientation(0);
        this.f = true;
        final Resources resources = this.getResources();
        (this.d = (ImageView)this.findViewById(2131428438)).setOnClickListener((View$OnClickListener)this);
        this.c = new skw(this.getContext(), resources, (ImageView)this.findViewById(2131428494), (AdCountdownTextView)this.findViewById(2131428497), this.getAlpha());
        this.a = new slf((View)this, this.getBackground(), this.getAlpha());
        this.a();
        this.i = resources.getDimensionPixelSize(2131169767);
        this.j = resources.getDimensionPixelSize(2131169766);
        this.k = resources.getDimensionPixelSize(2131166190);
        this.l = resources.getDimensionPixelSize(2131166191);
        this.m = resources.getText(2132020128);
        this.n = resources.getText(2132020129);
    }
    
    public final void a() {
        this.b(false);
        final skw c = this.c;
        final acan c2 = acan.c(c.k);
        if (c2 != null) {
            c.c.setTypeface(c2.b(c.a, 0), 0);
        }
        final sld d = c.d;
        d.c = null;
        d.d((Object)5);
        c.c.setClickable(true);
        c.c.setAlpha(1.0f);
        final AdCountdownTextView c3 = c.c;
        c3.setPadding(c.g, c3.getPaddingTop(), c.h, c.c.getPaddingBottom());
        tpe.aH((View)c.b, c.i, c.j);
        tpe.aH((View)c.c, -2, c.j);
        final sle m = c.m;
        if (m != null) {
            m.b();
        }
        this.f = true;
        final sle b = this.b;
        if (b != null) {
            b.b();
        }
        final int l = this.l;
        final int k = this.k;
        this.d.getLayoutParams().width = l;
        this.d.getLayoutParams().height = k;
    }
    
    public final void b(final boolean e) {
        this.e = e;
        CharSequence a = this.m;
        if (a == null) {
            return;
        }
        if (!e && this.h != sgp.c) {
            if (this.g) {
                a = this.n;
            }
        }
        else {
            a = "";
        }
        final sld d = this.c.d;
        d.a = a;
        ((slf)d).a();
    }
    
    public final void onClick(final View view) {
        if (!this.e) {
            if (this.f) {
                this.c.a();
                final skw c = this.c;
                c.c.setClickable(true);
                final bx ab = anb.aB((View)c.c);
                ab.p(1.0f);
                ab.q((long)c.l);
                ab.t(0L);
                ab.s((anl)new skv(c));
            }
        }
    }
    
    public final void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        this.c.a();
        if (!this.e && this.f) {
            if (visibility == 0) {
                this.c.b();
            }
        }
    }
}
