// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.mdx;

import android.view.View;
import android.text.TextUtils;
import j$.util.Optional;

public class MdxOverlaysPresenter implements tin, thj
{
    public final xpf a;
    public final ibb b;
    public final iax c;
    public final iss d;
    final xts e;
    Optional f;
    public boolean g;
    private final xtu h;
    
    public MdxOverlaysPresenter(final xpf a, final ibb b, final iax c, final iss d, final xtu h) {
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
        this.e = (xts)new iay(this, d);
        this.k(iaz.a);
    }
    
    public static final String m(final xoy xoy) {
        return xoy.j().e();
    }
    
    public final tik g() {
        return tik.c;
    }
    
    public final void j(final xoy xoy) {
        if (xoy == null) {
            this.k(iaz.a);
            return;
        }
        final int a = xoy.a();
        if (a == 0) {
            String e;
            if (xoy.j() != null) {
                e = xoy.j().e();
            }
            else {
                e = null;
            }
            final ibb b = this.b;
            final boolean ae = xoy.ae();
            int b2;
            if (TextUtils.isEmpty((CharSequence)e)) {
                if (!ae) {
                    b2 = 2132017781;
                }
                else {
                    b2 = 2132019324;
                }
            }
            else if (!ae) {
                b2 = 2132017782;
            }
            else {
                b2 = 2132019325;
            }
            if (b2 != b.b || b.a != 2 || !TextUtils.equals((CharSequence)b.c, (CharSequence)e)) {
                b.c = e;
                b.b = b2;
                b.a = 2;
                ((abcq)b).Y();
            }
            this.k(iaz.c);
            return;
        }
        if (a != 1) {
            this.k(iaz.a);
            return;
        }
        this.c.e(m(xoy));
        this.k(iaz.b);
    }
    
    public final void k(final iaz iaz) {
        if (this.f.isPresent() && this.f.get() == iaz) {
            return;
        }
        this.f = Optional.of((Object)iaz);
        this.l();
    }
    
    public final void l() {
        final boolean g = this.g;
        final boolean b = false;
        if (g) {
            ((abcq)this.d).ow();
            tqf.v((View)this.c, false);
            ((abcq)this.b).mk();
            return;
        }
        ((abcq)this.d).mk();
        final iax c = this.c;
        boolean b2 = b;
        if (this.f.isPresent()) {
            b2 = b;
            if (this.f.get() == iaz.b) {
                b2 = true;
            }
        }
        tqf.v((View)c, b2);
        if (this.f.isPresent() && this.f.get() == iaz.c) {
            ((abcq)this.b).ow();
            return;
        }
        ((abcq)this.b).mk();
    }
    
    public final void lW(final aup aup) {
        this.h.a(this.e);
        this.j(this.a.g());
    }
    
    public final void mp(final aup aup) {
    }
    
    public final Class[] mr(final Class clazz, final Object o, int ordinal) {
        Class[] array2;
        if (ordinal != -1) {
            final Class[] array = null;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(ordinal);
                    throw new IllegalStateException(sb.toString());
                }
                final aapp aapp = (aapp)o;
                final xoy g = this.a.g();
                array2 = array;
                if (g != null) {
                    if (g.a() != 1) {
                        array2 = array;
                    }
                    else {
                        if (!g.Y()) {
                            final abll a = abll.a;
                            ordinal = aapp.c().ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 5) {
                                    if (ordinal == 8) {
                                        final iax c = this.c;
                                        c.a.setText((CharSequence)c.c(2132019158, m(g)));
                                        this.k(iaz.b);
                                        return null;
                                    }
                                    if (ordinal != 9) {
                                        array2 = array;
                                        return array2;
                                    }
                                }
                                else {
                                    array2 = array;
                                    if (aapp.k() == null) {
                                        final ibb b = this.b;
                                        if (b.a != 1) {
                                            b.b = 2132017468;
                                            b.c = null;
                                            b.a = 1;
                                            ((abcq)b).Y();
                                        }
                                        this.k(iaz.c);
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
                            this.k(iaz.b);
                            return null;
                        }
                        this.k(iaz.a);
                        array2 = array;
                    }
                }
            }
            else {
                this.j(((xpg)o).a());
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { xpg.class, aapp.class };
        }
        return array2;
    }
    
    public final void mx(final aup aup) {
        this.h.c(this.e);
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
    }
    
    public final void oU() {
        tgj.f((tin)this);
    }
    
    public final void oX() {
        tgj.e((tin)this);
    }
    
    public final void oY(final aup aup) {
    }
}
