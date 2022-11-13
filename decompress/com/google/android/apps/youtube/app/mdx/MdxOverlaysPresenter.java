// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx;

import android.view.View;
import android.text.TextUtils;
import j$.util.Optional;

public class MdxOverlaysPresenter implements thk, tgg
{
    public final xnt a;
    public final iat b;
    public final iap c;
    public final isj d;
    final xsh e;
    Optional f;
    public boolean g;
    private final xsj h;
    
    public MdxOverlaysPresenter(final xnt a, final iat b, final iap c, final isj d, final xsj h) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.f = Optional.empty();
        this.h = h;
        this.e = (xsh)new iaq(this, d);
        this.k(iar.a);
    }
    
    public static final String m(final xnm xnm) {
        return xnm.j().e();
    }
    
    public final thh g() {
        return thh.c;
    }
    
    public final void j(final xnm xnm) {
        if (xnm == null) {
            this.k(iar.a);
            return;
        }
        final int a = xnm.a();
        if (a == 0) {
            String e;
            if (xnm.j() != null) {
                e = xnm.j().e();
            }
            else {
                e = null;
            }
            final iat b = this.b;
            final boolean ae = xnm.ae();
            int b2;
            if (TextUtils.isEmpty((CharSequence)e)) {
                if (!ae) {
                    b2 = 2132017781;
                }
                else {
                    b2 = 2132019322;
                }
            }
            else if (!ae) {
                b2 = 2132017782;
            }
            else {
                b2 = 2132019323;
            }
            if (b2 != b.b || b.a != 2 || !TextUtils.equals((CharSequence)b.c, (CharSequence)e)) {
                b.c = e;
                b.b = b2;
                b.a = 2;
                ((abbk)b).Y();
            }
            this.k(iar.c);
            return;
        }
        if (a != 1) {
            this.k(iar.a);
            return;
        }
        this.c.e(m(xnm));
        this.k(iar.b);
    }
    
    public final void k(final iar iar) {
        if (this.f.isPresent() && this.f.get() == iar) {
            return;
        }
        this.f = Optional.of((Object)iar);
        this.l();
    }
    
    public final void l() {
        final boolean g = this.g;
        final boolean b = false;
        if (g) {
            this.d.mm();
            tpe.v((View)this.c, false);
            ((abbk)this.b).mk();
            return;
        }
        this.d.mk();
        final iap c = this.c;
        boolean b2 = b;
        if (this.f.isPresent()) {
            b2 = b;
            if (this.f.get() == iar.b) {
                b2 = true;
            }
        }
        tpe.v((View)c, b2);
        if (this.f.isPresent() && this.f.get() == iar.c) {
            ((abbk)this.b).mm();
            return;
        }
        ((abbk)this.b).mk();
    }
    
    public final void lW(final aun aun) {
        this.h.a(this.e);
        this.j(this.a.g());
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final Class[] ms(final Class clazz, final Object o, int ordinal) {
        Class[] array2;
        if (ordinal != -1) {
            final Class[] array = null;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(ordinal);
                    throw new IllegalStateException(sb.toString());
                }
                final aans aans = (aans)o;
                final xnm g = this.a.g();
                array2 = array;
                if (g != null) {
                    if (g.a() != 1) {
                        array2 = array;
                    }
                    else {
                        if (!g.Y()) {
                            final abke a = abke.a;
                            ordinal = aans.c().ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 5) {
                                    if (ordinal == 8) {
                                        final iap c = this.c;
                                        c.a.setText((CharSequence)c.c(2132019156, m(g)));
                                        this.k(iar.b);
                                        return null;
                                    }
                                    if (ordinal != 9) {
                                        array2 = array;
                                        return array2;
                                    }
                                }
                                else {
                                    array2 = array;
                                    if (aans.k() == null) {
                                        final iat b = this.b;
                                        if (b.a != 1) {
                                            b.b = 2132017468;
                                            b.c = null;
                                            b.a = 1;
                                            ((abbk)b).Y();
                                        }
                                        this.k(iar.c);
                                        array2 = array;
                                        return array2;
                                    }
                                    return array2;
                                }
                            }
                            else {
                                this.d.h(false);
                            }
                            this.c.e(m(g));
                            this.k(iar.b);
                            return null;
                        }
                        this.k(iar.a);
                        array2 = array;
                    }
                }
            }
            else {
                this.j(((xnu)o).a());
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { xnu.class, aans.class };
        }
        return array2;
    }
    
    public final void my(final aun aun) {
        this.h.c(this.e);
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.e((thk)this);
    }
    
    public final void oW() {
        tfg.d((thk)this);
    }
    
    public final void oX(final aun aun) {
    }
}
