// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.tvfilm;

import android.util.DisplayMetrics;
import android.content.Context;

public class TrailerOverlayPresenter implements syv, thl, tgg
{
    public final int a;
    public final int b;
    public boolean c;
    public final fxm d;
    private final abpu e;
    private final asid f;
    private final tgd g;
    private final asiq h;
    private final mdp i;
    
    public TrailerOverlayPresenter(final Context context, final fxm d, final mdp i, final abpu e, final asid f, final tgd g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.i = i;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = new asiq();
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.a = tpe.aZ(displayMetrics, 30);
        this.b = tpe.aZ(displayMetrics, 12);
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
    
    public final Class[] ms(final Class clazz, final Object o, int b) {
        boolean c = true;
        int a = 0;
        Class[] array;
        if (b != -1) {
            array = null;
            if (b != 0) {
                if (b != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(b);
                    throw new IllegalStateException(sb.toString());
                }
                final aanr aanr = (aanr)o;
                if (this.c) {
                    this.d.g(true);
                    final fxm d = this.d;
                    final boolean a2 = aanr.a;
                    if (a2) {
                        b = this.b;
                    }
                    else {
                        b = 0;
                    }
                    if (a2) {
                        a = this.a;
                    }
                    d.j(b, a);
                }
                else {
                    this.d.g(aanr.a ^ true);
                    this.d.j(0, 0);
                }
            }
            else {
                if (((xnu)o).a() == null) {
                    c = false;
                }
                this.c = c;
            }
        }
        else {
            array = new Class[] { xnu.class, aanr.class };
        }
        return array;
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oS(final aun aun) {
        final asiq h = this.h;
        final abpu e = this.e;
        h.f(e.M().an((asjm)new fqz(this, 18), (asjm)fua.e), e.R().R().P(this.f).an((asjm)new fqz(this, 19), (asjm)fua.e), ((ashi)e.p().b).an((asjm)new fqz(this, 20), (asjm)fua.e));
        this.g.g((Object)this);
        this.i.L((syv)this);
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        this.h.b();
        this.g.m((Object)this);
        this.i.M((syv)this);
    }
    
    public final void qB() {
    }
    
    public final void qC() {
        this.d.f();
    }
    
    public final void qD(final alfg alfg) {
        this.d.f();
    }
}
