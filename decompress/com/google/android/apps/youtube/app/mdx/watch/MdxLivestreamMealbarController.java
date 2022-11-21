// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.watch;

import j$.util.Optional;
import android.content.SharedPreferences;
import android.app.Activity;

public class MdxLivestreamMealbarController implements tio
{
    public final Activity a;
    public final acxl b;
    public final xpf c;
    public final cl d;
    public final SharedPreferences e;
    public final amgi f;
    public final ccn g;
    public final xka h;
    public final oco i;
    public final zoa j;
    public final xji k;
    public final xaa l;
    public final fjy m;
    private final abqz n;
    private final aslm o;
    private final icg p;
    
    public MdxLivestreamMealbarController(final Activity a, final acxl b, final xpf c, final cl d, final SharedPreferences e, final abqz n, final ccn g, final xka h, final atnb atnb, final oco i, final zoa j, final xji k, final xaa l, final fjy m) {
        this.o = new aslm();
        this.p = new icg(this, 0);
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.n = n;
        this.g = g;
        this.h = h;
        amgi f;
        if ((f = ((vbo)atnb.a()).b().l) == null) {
            f = amgi.a;
        }
        this.f = f;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        Optional.empty();
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        final amgi f = this.f;
        final int b = f.b;
        if ((0x100000 & b) != 0x0) {
            if (f.e) {
                if ((0x200000 & b) != 0x0) {
                    this.o.f(this.p.lX(this.n));
                }
            }
        }
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.o.b();
    }
}
