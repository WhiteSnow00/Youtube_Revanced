import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.function.Function;
import j$.util.Comparator$_CC;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hnx implements tec
{
    anqd a;
    public final /* synthetic */ hoa b;
    
    public hnx(final hoa b) {
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
                        final voi voi = (voi)o;
                        array2 = array;
                        if (voi.c() instanceof anqd) {
                            array2 = array;
                            if (voi.c().equals(this.a)) {
                                final hmk d = this.b.d;
                                final long d2 = d.d();
                                final hma p3 = d.p;
                                final hml e = p3.e;
                                if (e != null) {
                                    if (p3.C(e.a) == -1) {
                                        synchronized (p3.a) {
                                            final int n = b = Collections.binarySearch(p3.a, p3.e, Comparator$_CC.comparing((Function)hkc.h));
                                            if (n < 0) {
                                                b = -(n + 1);
                                            }
                                            p3.a.add(b, p3.e);
                                            p3.e = null;
                                            monitorexit(p3.a);
                                            ((nq)p3).mT(p3.A(b));
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
                        final rjt rjt = (rjt)o;
                        final rjs a = rjs.a;
                        final gii a2 = gii.a;
                        b = rjt.a().ordinal();
                        if (b != 1 && b != 2) {
                            array2 = array;
                        }
                        else {
                            if (this.b.az.t()) {
                                this.b.as.m();
                                this.b.e.om();
                                return null;
                            }
                            array2 = array;
                        }
                    }
                }
                else {
                    final aexq g = ((hxz)o).g();
                    if (!g.h()) {
                        array2 = array;
                    }
                    else {
                        this.a = (anqd)g.c();
                        final hmk d3 = this.b.d;
                        final anqd a3 = this.a;
                        a3.getClass();
                        b = d3.B;
                        if (b != -1) {
                            final hml h = d3.p.H(b + 1);
                            if (h != null && h.b) {
                                d3.e.d(h);
                            }
                        }
                        agyc d4;
                        if ((a3.b & 0x2) != 0x0) {
                            d4 = a3.d;
                        }
                        else {
                            d4 = null;
                        }
                        array2 = array;
                        if (d3.s(new trg(4, d4, a3)) == 1) {
                            this.b.aV();
                            if (!tqt.e(((br)this.b).nT())) {
                                hoa.bF(this.b);
                                return null;
                            }
                            array2 = array;
                        }
                    }
                }
            }
            else {
                final gfn gfn = (gfn)o;
                final bu od = this.b.od();
                od.getClass();
                od.runOnUiThread((Runnable)new hhv(this, gfn, 7));
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { gfn.class, hxz.class, rjt.class, voi.class };
        }
        return array2;
    }
}
