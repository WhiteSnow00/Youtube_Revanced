// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.tutorial;

import android.view.MotionEvent;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import android.view.animation.Animation;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;

public class ClingTutorialView extends RelativeLayout implements View$OnClickListener, fxa
{
    public ClingView a;
    public TextView b;
    public int c;
    public pvh d;
    private View e;
    private LinearLayout f;
    
    public ClingTutorialView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = 500;
    }
    
    public final void a() {
        this.b();
        final pvh d = this.d;
        if (d != null) {
            final Object a = d.a;
            ((ksj)a).a.f((fxg)a);
        }
    }
    
    public final void b() {
        this.setAnimation((Animation)null);
        this.setVisibility(8);
    }
    
    public final void c(final Rect rect) {
        final int top = rect.top;
        final int measuredHeight = this.getMeasuredHeight();
        final int bottom = rect.bottom;
        if (this.f == null) {
            return;
        }
        int bottom2;
        if (rect.top != rect.bottom && top < measuredHeight - bottom) {
            bottom2 = rect.bottom;
        }
        else {
            bottom2 = rect.top - this.f.getHeight();
        }
        tpe.aF((View)this.f, tpe.aB(bottom2), (Class)ViewGroup$MarginLayoutParams.class);
    }
    
    public final void onClick(final View view) {
        if (view == this.e) {
            this.a();
        }
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        (this.e = this.findViewById(2131430162)).setOnClickListener((View$OnClickListener)this);
        final ClingView a = (ClingView)this.findViewById(2131428218);
        this.a = a;
        a.c = (fxa)this;
        this.b = (TextView)this.findViewById(2131431953);
        this.f = (LinearLayout)this.findViewById(2131431963);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final ClingView a = this.a;
        if (a == null) {
            return false;
        }
        if (a.a().contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
            if (motionEvent.getAction() == 0) {
                this.a();
            }
            return false;
        }
        return true;
    }
}
