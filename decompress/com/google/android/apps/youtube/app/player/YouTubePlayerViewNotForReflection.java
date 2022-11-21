// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player;

import android.view.MotionEvent;
import android.graphics.Rect;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class YouTubePlayerViewNotForReflection extends fns implements fjx
{
    public boolean a;
    private fku b;
    private fok e;
    
    public YouTubePlayerViewNotForReflection(final Context context) {
        this(context, null);
    }
    
    public YouTubePlayerViewNotForReflection(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = fku.a;
        this.a = false;
        anc.X((View)this, 2);
    }
    
    private final boolean g() {
        return !this.b.h() && this.e != null;
    }
    
    public void extractSmartClipData(final int n, final int n2, final int n3, final int n4) {
    }
    
    public final void f() {
        final boolean v = this.c.v();
        boolean b = true;
        final int n = 0;
        final boolean b2 = v && this.b.o();
        if (!this.a || this.b.k()) {
            b = false;
        }
        final zfd c = this.c;
        if (c == null) {
            return;
        }
        int visibility = 0;
        Label_0084: {
            if (!b2) {
                visibility = n;
                if (!b) {
                    break Label_0084;
                }
            }
            visibility = 8;
        }
        ((View)c).setVisibility(visibility);
    }
    
    public final void lU(final fok e) {
        if (this.e == e) {
            return;
        }
        this.e = e;
        this.requestLayout();
    }
    
    protected final void mh(final View view, final Rect rect, final int n, final int n2, final int n3, final int n4) {
        if (view == ((abvo)this).m && this.g()) {
            final fok e = this.e;
            e.getClass();
            e.c(view);
            return;
        }
        super.mh(view, rect, n, n2, n3, n4);
    }
    
    protected final void mi(final View view, final Rect rect, final int n, final int n2) {
        if (view == ((abvo)this).m && this.g()) {
            final fok e = this.e;
            e.getClass();
            e.d(view, n, n2);
            return;
        }
        super.mi(view, rect, n, n2);
    }
    
    public final void n(final fku b) {
        if (b == this.b) {
            return;
        }
        this.b = b;
        this.f();
    }
    
    public final void oI(final fku fku, final fku fku2) {
        gag.i((fjx)this, fku2);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (!this.g()) {
            this.setBackgroundColor(-16777216);
            return;
        }
        final fok e = this.e;
        e.getClass();
        this.setBackgroundColor(e.b());
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
    
    public final void requestLayout() {
        super.requestLayout();
        final View m = ((abvo)this).m;
        if (m != null) {
            m.forceLayout();
        }
    }
}
