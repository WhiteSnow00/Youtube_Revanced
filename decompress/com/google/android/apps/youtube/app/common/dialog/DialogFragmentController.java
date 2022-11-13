// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.dialog;

public abstract class DialogFragmentController implements aua
{
    private final String a;
    private final bu b;
    private boolean c;
    private bi d;
    public bi e;
    private int f;
    
    protected DialogFragmentController(final bu b, final String a) {
        this.f = 1;
        b.getClass();
        this.b = b;
        tvb.n(a);
        this.a = a;
    }
    
    private final void g() {
        ((dh)this.b).getLifecycle().b((aum)this);
        this.c = (((dh)this.b).getLifecycle().a() == auh.e ^ true);
    }
    
    public final bi i() {
        final bi e = this.e;
        if (e != null) {
            return e;
        }
        return (bi)this.b.getSupportFragmentManager().f(this.a);
    }
    
    public final void k() {
        if (this.c) {
            this.f = 16;
            return;
        }
        final bi i = this.i();
        if ((this.e = i) != null) {
            ((dh)this.b).getLifecycle().c((aum)this);
            final ct j = this.b.getSupportFragmentManager().i();
            j.B(2130772000, 2130772001);
            j.n((br)i);
            j.d();
            this.e = null;
        }
    }
    
    public final void l() {
        if (this.c) {
            this.f = 8;
            return;
        }
        final bi i = this.i();
        this.e = i;
        if (i != null && i.aw()) {
            final bi e = this.e;
            final ct j = this.b.getSupportFragmentManager().i();
            j.B(0, 2130772001);
            j.m((br)e);
            j.d();
        }
    }
    
    public final void lW(final aun aun) {
        this.c = false;
        final int f = this.f;
        if (f != 2) {
            if (f != 4) {
                if (f != 8) {
                    if (f == 16) {
                        this.k();
                    }
                }
                else {
                    this.l();
                }
            }
            else {
                this.n();
            }
        }
        else {
            final bi d = this.d;
            if (d != null) {
                this.pQ(d);
            }
        }
        this.f = 1;
    }
    
    public final void m() {
        this.e = null;
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
        this.c = true;
    }
    
    public void n() {
        this.g();
        if (this.c) {
            this.f = 4;
            return;
        }
        final bi i = this.i();
        this.e = i;
        if (i != null && !i.aw()) {
            final bi e = this.e;
            final ct j = this.b.getSupportFragmentManager().i();
            j.B(2130772000, 0);
            j.o((br)e);
            j.d();
        }
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oX(final aun aun) {
    }
    
    public final void pQ(final bi bi) {
        this.g();
        if (this.c) {
            this.f = 2;
            this.d = bi;
            return;
        }
        if (this.e == null) {
            this.d = null;
            this.e = bi;
            bi.getLifecycle().b((aum)new DialogFragmentController$1(this));
            final ct i = this.b.getSupportFragmentManager().i();
            i.B(2130772000, 0);
            i.s((br)bi, this.a);
            i.d();
        }
    }
}
