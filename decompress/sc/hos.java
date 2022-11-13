import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.function.Function;
import j$.util.Comparator$_CC;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hos implements tgg
{
    ansg a;
    public final how b;
    
    public hos(final how b) {
        this.b = b;
        this.a = null;
    }
    
    public final Class[] ms(final Class clazz, final Object o, int b) {
        Class[] array2;
        if (b != -1) {
            final Class[] array = null;
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            final StringBuilder sb = new StringBuilder("unsupported op code: ");
                            sb.append(b);
                            throw new IllegalStateException(sb.toString());
                        }
                        final vql vql = (vql)o;
                        array2 = array;
                        if (vql.c() instanceof ansg) {
                            array2 = array;
                            if (vql.c().equals(this.a)) {
                                final hne d = this.b.d;
                                final long d2 = d.d();
                                final hmv p3 = d.p;
                                final hnf e = p3.e;
                                if (e != null) {
                                    if (p3.C(e.a) == -1) {
                                        synchronized (p3.a) {
                                            final int n = b = Collections.binarySearch(p3.a, p3.e, Comparator$_CC.comparing((Function)hkx.h));
                                            if (n < 0) {
                                                b = -(n + 1);
                                            }
                                            p3.a.add(b, p3.e);
                                            p3.e = null;
                                            monitorexit(p3.a);
                                            p3.j(p3.A(b));
                                        }
                                    }
                                }
                                b = d.p.C(d2);
                                if (b != -1) {
                                    d.B = b;
                                }
                                return null;
                            }
                        }
                    }
                    else {
                        final rlw rlw = (rlw)o;
                        final rlv a = rlv.a;
                        final gir a2 = gir.a;
                        b = rlw.a().ordinal();
                        if (b != 1 && b != 2) {
                            array2 = array;
                        }
                        else {
                            if (this.b.ax.t()) {
                                this.b.ar.m();
                                this.b.e.om();
                                return null;
                            }
                            array2 = array;
                        }
                    }
                }
                else {
                    final aezp g = ((hyu)o).g();
                    if (!g.h()) {
                        array2 = array;
                    }
                    else {
                        this.a = (ansg)g.c();
                        final hne d3 = this.b.d;
                        final ansg a3 = this.a;
                        a3.getClass();
                        b = d3.B;
                        if (b != -1) {
                            final hnf h = d3.p.H(b + 1);
                            if (h != null && h.b) {
                                d3.e.d(h);
                            }
                        }
                        ahab d4;
                        if ((a3.b & 0x2) != 0x0) {
                            d4 = a3.d;
                        }
                        else {
                            d4 = null;
                        }
                        array2 = array;
                        if (d3.s(new ttl(4, d4, a3)) == 1) {
                            this.b.aV();
                            if (!tsy.e(((br)this.b).nT())) {
                                how.bF(this.b);
                                return null;
                            }
                            array2 = array;
                        }
                    }
                }
            }
            else {
                final gfv gfv = (gfv)o;
                final bu od = this.b.od();
                od.getClass();
                od.runOnUiThread((Runnable)new hir(this, gfv, 7));
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { gfv.class, hyu.class, rlw.class, vql.class };
        }
        return array2;
    }
}
