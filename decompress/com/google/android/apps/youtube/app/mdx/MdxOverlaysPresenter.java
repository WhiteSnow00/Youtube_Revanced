// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx;

import android.view.View;
import android.text.TextUtils;
import j$.util.Optional;

public class MdxOverlaysPresenter implements tfg, tec
{
    public final xlv a;
    public final hzw b;
    public final hzs c;
    public final irl d;
    final xqj e;
    Optional f;
    public boolean g;
    private final xql h;
    
    public MdxOverlaysPresenter(final xlv a, final hzw b, final hzs c, final irl d, final xql h) {
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
        this.e = (xqj)new hzt(this, d);
        this.k(hzu.a);
    }
    
    public static final String m(final xlo xlo) {
        return xlo.j().e();
    }
    
    public final void j(final xlo xlo) {
        if (xlo == null) {
            this.k(hzu.a);
            return;
        }
        final int a = xlo.a();
        if (a == 0) {
            String e;
            if (xlo.j() != null) {
                e = xlo.j().e();
            }
            else {
                e = null;
            }
            final hzw b = this.b;
            final boolean ae = xlo.ae();
            int b2;
            if (TextUtils.isEmpty((CharSequence)e)) {
                if (!ae) {
                    b2 = 2132017781;
                }
                else {
                    b2 = 2132019321;
                }
            }
            else if (!ae) {
                b2 = 2132017782;
            }
            else {
                b2 = 2132019322;
            }
            if (b2 != b.b || b.a != 2 || !TextUtils.equals((CharSequence)b.c, (CharSequence)e)) {
                b.c = e;
                b.b = b2;
                b.a = 2;
                ((aazp)b).Y();
            }
            this.k(hzu.c);
            return;
        }
        if (a != 1) {
            this.k(hzu.a);
            return;
        }
        this.c.e(m(xlo));
        this.k(hzu.b);
    }
    
    public final void k(final hzu hzu) {
        if (this.f.isPresent() && this.f.get() == hzu) {
            return;
        }
        this.f = Optional.of((Object)hzu);
        this.l();
    }
    
    public final void l() {
        final boolean g = this.g;
        final boolean b = false;
        if (g) {
            this.d.mm();
            tmy.v((View)this.c, false);
            ((aazp)this.b).mk();
            return;
        }
        this.d.mk();
        final hzs c = this.c;
        boolean b2 = b;
        if (this.f.isPresent()) {
            b2 = b;
            if (this.f.get() == hzu.b) {
                b2 = true;
            }
        }
        tmy.v((View)c, b2);
        if (this.f.isPresent() && this.f.get() == hzu.c) {
            ((aazp)this.b).mm();
            return;
        }
        ((aazp)this.b).mk();
    }
    
    public final void lW(final aum aum) {
        this.h.a(this.e);
        this.j(this.a.g());
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
                final aaly aaly = (aaly)o;
                final xlo g = this.a.g();
                array2 = array;
                if (g != null) {
                    if (g.a() != 1) {
                        array2 = array;
                    }
                    else {
                        if (!g.Y()) {
                            final abim a = abim.a;
                            ordinal = aaly.c().ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 5) {
                                    if (ordinal == 8) {
                                        final hzs c = this.c;
                                        c.a.setText((CharSequence)c.c(2132019155, m(g)));
                                        this.k(hzu.b);
                                        return null;
                                    }
                                    if (ordinal != 9) {
                                        array2 = array;
                                        return array2;
                                    }
                                }
                                else {
                                    array2 = array;
                                    if (aaly.k() == null) {
                                        final hzw b = this.b;
                                        if (b.a != 1) {
                                            b.b = 2132017468;
                                            b.c = null;
                                            b.a = 1;
                                            ((aazp)b).Y();
                                        }
                                        this.k(hzu.c);
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
                            this.k(hzu.b);
                            return null;
                        }
                        this.k(hzu.a);
                        array2 = array;
                    }
                }
            }
            else {
                this.j(((xlw)o).a());
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { xlw.class, aaly.class };
        }
        return array2;
    }
    
    public final void my(final aum aum) {
        this.h.c(this.e);
    }
}
