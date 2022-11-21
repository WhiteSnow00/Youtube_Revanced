// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.jar.k;
import android.app.Activity;
import android.view.Window;
import android.app.ActionBar;
import com.google.android.apps.youtube.embeddedplayer.service.jar.a;
import android.content.Context;

public final class b implements tqz, trq
{
    public final Context a;
    public final a b;
    public tra c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final trn o;
    public boolean p;
    public final oqz q;
    private final ActionBar r;
    private final Window s;
    private int t;
    private boolean u;
    
    public b(final Context a, final a b, final oqz q, final trn o, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.q = q;
        this.o = o;
        this.r = b.c();
        this.s = b.d();
        this.i = b.b();
        this.t = b.b();
    }
    
    public final int a() {
        final boolean j = this.j;
        final boolean n = this.n;
        int n2 = 0;
        int n3;
        if (!n) {
            n3 = 0;
        }
        else {
            n3 = 2;
        }
        int n4;
        if (!this.k) {
            n4 = 0;
        }
        else {
            n4 = 4;
        }
        if (this.l) {
            n2 = 8;
        }
        return (j ? 1 : 0) | n3 | n4 | n2;
    }
    
    public final void d() {
        ((tqx)this.o).q(1);
        this.e();
    }
    
    public final void e() {
        if (this.n) {
            final trn o = this.o;
            final boolean p = this.p;
            int n = 1;
            if (!p) {
                if (this.u) {
                    n = n;
                }
                else {
                    n = 0;
                }
            }
            ((tqx)o).k(n);
        }
    }
    
    public final void f(int n) {
        final int n2 = n & 0x4;
        final int n3 = 0;
        final boolean b = n2 == 0;
        if (n2 != 0 && (n & 0x1) == 0x0) {
            throw new IllegalArgumentException("Can not set FULLSCREEN_FLAG_FULLSCREEN_WHEN_DEVICE_LANDSCAPE without setting FULLSCREEN_FLAG_CONTROL_ORIENTATION");
        }
        final boolean k = this.k;
        this.j = (0x1 == (n & 0x1));
        this.n = ((n & 0x2) != 0x0);
        final boolean i = b ^ true;
        this.k = i;
        this.l = ((n & 0x8) != 0x0);
        if (i) {
            this.c.enable();
        }
        else if (k && this.e == 1) {
            this.c.disable();
        }
        final trn o = this.o;
        n = n3;
        if (this.l) {
            n = n3;
            if (this.r != null) {
                n = n3;
                if (!this.s.hasFeature(9)) {
                    n = 1;
                }
            }
        }
        o.r((boolean)((n ^ 0x1) != 0x0));
    }
    
    public final void g(final boolean u) {
        this.u = u;
        this.e();
    }
    
    public final void h(final int n) {
        final int i = this.i;
        if (this.b.b() != this.t) {
            this.i = this.b.b();
        }
        int j;
        if ((j = n) == i) {
            j = this.i;
        }
        this.t = j;
        ((Activity)((k)this.b).a).setRequestedOrientation(j);
    }
    
    public final boolean i() {
        return this.t != this.i;
    }
    
    public final void mT(final boolean b, final int n) {
        if (b && this.k && !this.g && !this.h) {
            this.q.k(true);
        }
    }
    
    public final void mw(final boolean b, final int n) {
        this.h = false;
        if (this.f && this.j) {
            if (b) {
                if (this.k && !this.g) {
                    this.q.k(true);
                }
            }
            else if (this.i()) {
                if (this.d) {
                    this.q.k(false);
                }
                this.h(this.i);
            }
        }
    }
    
    public final void y() {
        if (this.f && this.g && this.n) {
            ((aeix)this.q.a).as();
        }
    }
}
