// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player;

import android.view.MotionEvent;
import android.graphics.Rect;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class YouTubePlayerViewNotForReflection extends fnk implements fjo
{
    public boolean a;
    private fkk b;
    private foc c;
    
    public YouTubePlayerViewNotForReflection(final Context context) {
        this(context, null);
    }
    
    public YouTubePlayerViewNotForReflection(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = fkk.a;
        this.a = false;
        ana.X((View)this, 2);
    }
    
    private final boolean g() {
        return !this.b.h() && this.c != null;
    }
    
    public void extractSmartClipData(final int n, final int n2, final int n3, final int n4) {
    }
    
    public final void f() {
        final boolean v = this.d.v();
        boolean b = true;
        final int n = 0;
        final boolean b2 = v && this.b.o();
        if (!this.a || this.b.k()) {
            b = false;
        }
        final zbp d = this.d;
        if (d == null) {
            return;
        }
        int visibility = 0;
        Label_0087: {
            if (!b2) {
                visibility = n;
                if (!b) {
                    break Label_0087;
                }
            }
            visibility = 8;
        }
        ((View)d).setVisibility(visibility);
    }
    
    public final void lU(final foc c) {
        if (this.c == c) {
            return;
        }
        this.c = c;
        this.requestLayout();
    }
    
    protected final void mh(final View view, final Rect rect, final int n, final int n2, final int n3, final int n4) {
        if (view == ((absd)this).m && this.g()) {
            final foc c = this.c;
            c.getClass();
            c.c(view);
            return;
        }
        super.mh(view, rect, n, n2, n3, n4);
    }
    
    protected final void mi(final View view, final Rect rect, final int n, final int n2) {
        if (view == ((absd)this).m && this.g()) {
            final foc c = this.c;
            c.getClass();
            c.d(view, n, n2);
            return;
        }
        super.mi(view, rect, n, n2);
    }
    
    public final void oK(final fkk b) {
        if (b == this.b) {
            return;
        }
        this.b = b;
        this.f();
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (!this.g()) {
            this.setBackgroundColor(-16777216);
            return;
        }
        final foc c = this.c;
        c.getClass();
        this.setBackgroundColor(c.b());
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
    
    public final void requestLayout() {
        super.requestLayout();
        final View m = ((absd)this).m;
        if (m != null) {
            m.forceLayout();
        }
    }
}
