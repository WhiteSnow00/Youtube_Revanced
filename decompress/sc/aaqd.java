import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaqd implements Runnable
{
    public final aaqz a;
    public final vjj b;
    public final boolean c;
    
    public aaqd(final aaqz a, final vjj b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final aaqz a = this.a;
        final vjj b = this.b;
        final boolean c = this.c;
        if (b != null && a.g != null) {
            final aatn i = a.i;
            if (i != null) {
                try {
                    int k;
                    if (b.a()) {
                        if (c) {
                            k = 2;
                        }
                        else {
                            k = 3;
                        }
                    }
                    else {
                        k = 1;
                    }
                    i.b.j(b, k);
                    i.k = k;
                    final Iterator iterator = i.e.iterator();
                    while (iterator.hasNext()) {
                        ((aatl)iterator.next()).z(k);
                    }
                    try {
                        final int j = a.i.k;
                        try {
                            final aapn g = a.g;
                            if (j != 0) {
                                g.l = j;
                                g.d();
                                if (j != 1) {
                                    if (a.e == null) {
                                        a.e = new aasj(a.z, a.b, a.w, null);
                                        final aasj e = a.e;
                                        if (e.e) {
                                            e.b.start();
                                        }
                                        try {
                                            a.i.m = a.e;
                                        }
                                        catch (final NullPointerException ex) {
                                            final int n = aaqz.r(a.g, a.i) - 1;
                                            if (n == 0) {
                                                throw new aaqk(ex);
                                            }
                                            if (n == 1) {
                                                throw new aaqp(ex);
                                            }
                                            if (n != 2) {
                                                throw new aaqf(ex);
                                            }
                                            throw new aaqu(ex);
                                        }
                                    }
                                    return;
                                }
                                final aasj e2 = a.e;
                                if (e2 != null) {
                                    e2.a();
                                }
                                a.e = null;
                                try {
                                    a.i.m = null;
                                    return;
                                }
                                catch (final NullPointerException ex2) {
                                    final int n2 = aaqz.r(a.g, a.i) - 1;
                                    if (n2 == 0) {
                                        throw new aaql(ex2);
                                    }
                                    if (n2 == 1) {
                                        throw new aaqq(ex2);
                                    }
                                    if (n2 != 2) {
                                        throw new aaqg(ex2);
                                    }
                                    throw new aaqv(ex2);
                                }
                            }
                            throw null;
                        }
                        catch (final NullPointerException ex3) {
                            final int n3 = aaqz.r(a.g, a.i) - 1;
                            if (n3 == 0) {
                                throw new aaqn(ex3);
                            }
                            if (n3 == 1) {
                                throw new aaqs(ex3);
                            }
                            if (n3 != 2) {
                                throw new aaqi(ex3);
                            }
                            throw new aaqx(ex3);
                        }
                    }
                    catch (final NullPointerException ex4) {
                        final int n4 = aaqz.r(a.g, a.i) - 1;
                        if (n4 == 0) {
                            throw new aaqj(ex4);
                        }
                        if (n4 == 1) {
                            throw new aaqo(ex4);
                        }
                        if (n4 != 2) {
                            throw new aaqe(ex4);
                        }
                        throw new aaqt(ex4);
                    }
                }
                catch (final NullPointerException ex5) {
                    final int n5 = aaqz.r(a.g, a.i) - 1;
                    if (n5 == 0) {
                        throw new aaqm(ex5);
                    }
                    if (n5 == 1) {
                        throw new aaqr(ex5);
                    }
                    if (n5 != 2) {
                        throw new aaqh(ex5);
                    }
                    throw new aaqw(ex5);
                }
                catch (final aatr aatr) {
                    a.s(aatr);
                    return;
                }
            }
        }
        final String value = String.valueOf(b);
        final String value2 = String.valueOf(a.g);
        final String value3 = String.valueOf(a.i);
        final StringBuilder sb = new StringBuilder("Null rendering mode. RM: ");
        sb.append(value);
        sb.append(", CR: ");
        sb.append(value2);
        sb.append(", SG: ");
        sb.append(value3);
        ttr.b(sb.toString());
    }
}
