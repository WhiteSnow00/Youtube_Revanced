// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.view.View$OnClickListener;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.ImageView;
import android.view.View;
import android.widget.GridLayout;

public class HatsContainer extends GridLayout
{
    View a;
    ImageView b;
    View c;
    YouTubeTextView d;
    HatsSurvey e;
    public ViewGroup f;
    public boolean g;
    boolean h;
    private gbm i;
    private int j;
    
    public HatsContainer(final Context context) {
        super(context);
        this.h = false;
        this.j = 0;
    }
    
    public HatsContainer(final Context context, final AttributeSet set) {
        super(context, set);
        this.h = false;
        this.j = 0;
    }
    
    public HatsContainer(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.h = false;
        this.j = 0;
    }
    
    public final gbm a() {
        if (this.i == null) {
            this.i = new gbm(this);
        }
        return this.i;
    }
    
    public final void b() {
        if (this.j == 0 && this.d != null) {
            tpe.v((View)this.b, true);
            tpe.v(this.c, true);
            tpe.v((View)this.d, true);
            tpe.v((View)this.e, false);
            tpe.v(this.a, this.g);
            this.j = 1;
            return;
        }
        final YouTubeTextView d = this.d;
        if (d != null) {
            final ciu ciu = new ciu();
            ciu.J(1);
            ciu.M((TimeInterpolator)new LinearInterpolator());
            final cih cih = new cih(2);
            ((cin)cih).b = 75L;
            ((cin)cih).y((View)d);
            ciu.f((cin)cih);
            final cih cih2 = new cih(1);
            ((cin)cih2).b = 150L;
            ((cin)cih2).y((View)this.e);
            ciu.f((cin)cih2);
            final gbn gbn = new gbn();
            ((cin)gbn).b = 300L;
            ((cin)gbn).y((View)this);
            final ciu ciu2 = new ciu();
            ciu2.J(0);
            ciu2.f((cin)ciu);
            ciu2.f((cin)gbn);
            cir.b((ViewGroup)this, (cin)ciu2);
        }
        tpe.v((View)this.b, false);
        tpe.v(this.c, false);
        final YouTubeTextView d2 = this.d;
        if (d2 != null) {
            tpe.v((View)d2, false);
        }
        tpe.v((View)this.e, true);
        tpe.v(this.a, this.g);
        this.j = 2;
    }
    
    public final void c() {
        this.j = 0;
        this.b();
        if (this.h) {
            this.b();
        }
    }
    
    public final void d(final View$OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
    
    public final void e(final YouTubeTextView d) {
        final YouTubeTextView d2 = this.d;
        if (d2 != null) {
            this.f.removeView((View)d2);
        }
        if ((this.d = d) != null) {
            this.f.addView((View)d);
            this.d.setOnClickListener((View$OnClickListener)new fup(this, 4));
        }
    }
    
    public final void f(final HatsSurvey e) {
        final HatsSurvey e2 = this.e;
        if (e2 != null) {
            this.f.removeView((View)e2);
        }
        if ((this.e = e) != null) {
            this.f.addView((View)e);
        }
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (ViewGroup)this.findViewById(2131429181);
        this.a = this.findViewById(2131429182);
        this.c = this.findViewById(2131429184);
        (this.b = (ImageView)this.findViewById(2131429183)).setOnClickListener((View$OnClickListener)new fup(this, 5));
    }
}
