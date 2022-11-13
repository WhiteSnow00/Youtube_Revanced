// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.watch;

import j$.util.Optional;
import android.content.SharedPreferences;
import android.app.Activity;

public class MdxLivestreamMealbarController implements thl
{
    public final Activity a;
    public final acvy b;
    public final xnt c;
    public final cl d;
    public final SharedPreferences e;
    public final ameg f;
    public final cck g;
    public final xip h;
    public final oby i;
    public final zmf j;
    public final xhy k;
    public final wyv l;
    public final fjv m;
    private final abpu n;
    private final asiq o;
    private final ibx p;
    
    public MdxLivestreamMealbarController(final Activity a, final acvy b, final xnt c, final cl d, final SharedPreferences e, final abpu n, final cck g, final xip h, final atke atke, final oby i, final zmf j, final xhy k, final wyv l, final fjv m) {
        this.o = new asiq();
        this.p = new ibx(this, 0);
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.n = n;
        this.g = g;
        this.h = h;
        ameg f;
        if ((f = ((vaf)atke.a()).b().l) == null) {
            f = ameg.a;
        }
        this.f = f;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        Optional.empty();
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        final ameg f = this.f;
        final int b = f.b;
        if ((0x100000 & b) != 0x0) {
            if (f.e) {
                if ((0x200000 & b) != 0x0) {
                    this.o.f(this.p.lX(this.n));
                }
            }
        }
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.o.b();
    }
}
