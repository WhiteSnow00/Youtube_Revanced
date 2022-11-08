// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx.watch;

import j$.util.Optional;
import android.content.SharedPreferences;
import android.app.Activity;

public class MdxLivestreamMealbarController implements tfh
{
    public final Activity a;
    public final actu b;
    public final xlv c;
    public final cl d;
    public final SharedPreferences e;
    public final amcc f;
    public final ccj g;
    public final xgq h;
    public final oas i;
    public final zki j;
    public final xfz k;
    public final wwu l;
    public final fjp m;
    private final abns n;
    private final asib o;
    private final ibc p;
    
    public MdxLivestreamMealbarController(final Activity a, final actu b, final xlv c, final cl d, final SharedPreferences e, final abns n, final ccj g, final xgq h, final atjj atjj, final oas i, final zki j, final xfz k, final wwu l, final fjp m) {
        this.o = new asib();
        this.p = new ibc(this, 0);
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.n = n;
        this.g = g;
        this.h = h;
        amcc f;
        if ((f = ((uyf)atjj.a()).b().l) == null) {
            f = amcc.a;
        }
        this.f = f;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        Optional.empty();
    }
    
    public final void oS(final aum aum) {
        final amcc f = this.f;
        final int b = f.b;
        if ((0x100000 & b) != 0x0) {
            if (f.e) {
                if ((0x200000 & b) != 0x0) {
                    this.o.f(this.p.lX(this.n));
                }
            }
        }
    }
    
    public final void oW(final aum aum) {
        this.o.b();
    }
}
