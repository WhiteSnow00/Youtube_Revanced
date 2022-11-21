// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.view.View;
import android.view.ViewGroup;

public final class t implements abcr
{
    public final Object a;
    private final int b;
    
    public t(final ViewGroup a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public t(final aa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void d(final abcs abcs, final View view) {
        final int b = this.b;
        if (b == 0) {
            final aa aa = (aa)this.a;
            aa.n.addView(view, aa.u.a());
            return;
        }
        if (b == 1) {
            final aa aa2 = (aa)this.a;
            aa2.n.addView(view, aa2.t.a());
            return;
        }
        if (b == 2) {
            final aa aa3 = (aa)this.a;
            aa3.n.addView(view, 1, aa3.s.a());
            return;
        }
        if (b == 3) {
            final aa aa4 = (aa)this.a;
            aa4.n.addView(view, aa4.p.a());
            return;
        }
        if (b == 4) {
            final aa aa5 = (aa)this.a;
            aa5.n.addView(view, aa5.r.a());
            return;
        }
        if (b != 5) {
            ((ViewGroup)this.a).addView(view);
            return;
        }
        final aa aa6 = (aa)this.a;
        int n2;
        final int n = n2 = aa6.n.getChildCount();
        if (aa6.p.mm()) {
            n2 = Math.min(n, aa6.n.indexOfChild(aa6.p.md()));
        }
        int min = n2;
        if (((abcq)aa6.t).mm()) {
            min = Math.min(n2, aa6.n.indexOfChild(((abcq)aa6.t).md()));
        }
        aa6.n.addView(view, min, aa6.o.a());
        if (aa6.o.mm()) {
            aa6.p.r(aa6.o.B());
            aa6.p.t(aa6.o.G());
        }
    }
}
