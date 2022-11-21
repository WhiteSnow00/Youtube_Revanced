import android.os.Handler;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxh implements Runnable
{
    public final Object a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    private final int i;
    
    public acxh(final acxj d, final View e, final akdp f, final Object a, final xab g, final boolean b, final boolean c, final acxb h, final int i) {
        this.i = i;
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    
    public acxh(final wxy g, final boolean b, final boolean c, final Integer h, final Integer d, final String f, final String a, final wje e, final int i) {
        this.i = i;
        this.g = g;
        this.b = b;
        this.c = c;
        this.h = h;
        this.d = d;
        this.f = f;
        this.a = a;
        this.e = e;
    }
    
    @Override
    public final void run() {
        if (this.i == 0) {
            final Object d = this.d;
            final Object e = this.e;
            final Object f = this.f;
            final Object a = this.a;
            final Object g = this.g;
            final boolean b = this.b;
            final boolean c = this.c;
            final Object h = this.h;
            final View view = (View)e;
            if (view.isShown() && view.isAttachedToWindow()) {
                ((acxj)d).d((akdp)f, view, a, (xab)g, b, c, (acxb)h);
            }
            return;
        }
        final Object g2 = this.g;
        final boolean b2 = this.b;
        final boolean c2 = this.c;
        final Object h2 = this.h;
        final Object d2 = this.d;
        final Object f2 = this.f;
        final Object a2 = this.a;
        final Object e2 = this.e;
        final wxy wxy = (wxy)g2;
        wxy.n = b2;
        boolean b3 = true;
        adme.K(true);
        e2.getClass();
        if (wxy.h == null) {
            ((wje)e2).a(8);
            return;
        }
        final wwu k = wxy.k;
        if (k != null) {
            k.a(b2);
        }
        int intValue = 0;
        int intValue2 = 0;
        Label_0356: {
            if (h2 != null && d2 != null) {
                final Integer n = (Integer)h2;
                if (n > 0) {
                    final Integer n2 = (Integer)d2;
                    if (n2 > 0) {
                        intValue = n;
                        intValue2 = n2;
                        break Label_0356;
                    }
                }
            }
            Label_0202: {
                if (!wxy.f || !wxy.q.u()) {
                    Label_0221: {
                        if (!wxy.f) {
                            int n3;
                            if (wxy.q.s().I) {
                                intValue2 = 3840;
                                if (!c2) {
                                    intValue = 3840;
                                }
                                else {
                                    intValue = 2160;
                                }
                                n3 = intValue;
                                if (!c2) {
                                    intValue2 = 2160;
                                    break Label_0356;
                                }
                            }
                            else if (wxy.q.u()) {
                                intValue2 = 1920;
                                if (!c2) {
                                    intValue = 1920;
                                }
                                else {
                                    intValue = 1080;
                                }
                                n3 = intValue;
                                if (!c2) {
                                    break Label_0202;
                                }
                            }
                            else {
                                intValue2 = 1280;
                                if (!c2) {
                                    intValue = 1280;
                                }
                                else {
                                    intValue = 720;
                                }
                                if (!c2) {
                                    break Label_0221;
                                }
                                break Label_0356;
                            }
                            intValue = n3;
                            break Label_0356;
                        }
                        intValue = 640;
                    }
                    intValue2 = 720;
                    break Label_0356;
                }
                intValue = 960;
            }
            intValue2 = 1080;
        }
        final wie a3 = wxy.a;
        if (intValue < 0 || intValue2 < 0) {
            b3 = false;
        }
        adme.K(b3);
        a3.a = intValue;
        a3.b = intValue2;
        final wxi h3 = wxy.h;
        final Handler i = wxy.i;
        final wxp g3 = wxy.g;
        i.getClass();
        h3.k = i;
        h3.l = b2;
        f2.getClass();
        h3.m = (String)f2;
        a2.getClass();
        h3.n = (String)a2;
        h3.o = intValue;
        h3.p = intValue2;
        h3.q = g3;
        ((wje)e2).a(0);
    }
}
