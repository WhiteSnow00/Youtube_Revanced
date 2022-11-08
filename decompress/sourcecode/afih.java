import j$.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afih extends afiq implements afiz
{
    protected afih(final Level level) {
        super(level);
    }
    
    protected final afls a() {
        return aflq.a;
    }
    
    protected final boolean b(final afiu afiu) {
        final afjt k = this.k();
        final int b = k.b();
        final boolean b2 = false;
        int i = 0;
        while (i < b) {
            if (k.c(i).a == "eye3tag") {
                if (k.d(afio.a) == null && k.d(afio.g) == null) {
                    this.o(afio.g, (Object)afje.a);
                    break;
                }
                break;
            }
            else {
                ++i;
            }
        }
        final afip c = super.c;
        if (c != null) {
            Label_0428: {
                if (afiu != null) {
                    final Integer n = (Integer)c.d(afio.b);
                    final afiw afiw = (afiw)super.c.d(afio.c);
                    final afip c2 = super.c;
                    final adcr d = afix.d;
                    final Object value = ((ConcurrentHashMap)d.a).get((Object)afiu);
                    Object o;
                    if (value != null) {
                        o = value;
                    }
                    else {
                        final afix afix = new afix();
                        final Object putIfAbsent = ((ConcurrentHashMap)d.a).putIfAbsent((Object)afiu, (Object)afix);
                        if (putIfAbsent != null) {
                            o = putIfAbsent;
                        }
                        else {
                            final int b3 = c2.b;
                            adpd adpd = null;
                            for (int j = 0; j < b3; ++j) {
                                if (afio.d.equals((Object)((afjt)c2).c(j))) {
                                    final Object e = ((afjt)c2).e(j);
                                    if (e instanceof afja) {
                                        if (adpd == null) {
                                            adpd = new adpd(d, afiu, 19, (byte[])null, (byte[])null, (byte[])null);
                                        }
                                        ((afja)e).a();
                                    }
                                }
                            }
                            o = afix;
                        }
                    }
                    final afix afix2 = (afix)o;
                    long n2 = 0L;
                    if (n != null) {
                        final int intValue = n;
                        final boolean b4 = b2;
                        if (afix2.a.getAndIncrement() % intValue != 0L) {
                            return b4;
                        }
                    }
                    if (afiw != null) {
                        final long b5 = super.b;
                        final long value2 = afix2.b.get();
                        final long n3 = afiw.b.toNanos(afiw.a) + value2;
                        Label_0413: {
                            if (n3 >= 0L) {
                                if (b5 < n3) {
                                    if (value2 != 0L) {
                                        break Label_0413;
                                    }
                                }
                                else {
                                    n2 = value2;
                                }
                                if (afix2.b.compareAndSet(n2, b5)) {
                                    afiw.c = afix2.c.getAndSet(0);
                                    break Label_0428;
                                }
                            }
                        }
                        afix2.c.incrementAndGet();
                        return b2;
                    }
                }
            }
            final afje afje = (afje)super.c.d(afio.g);
            if (afje != null) {
                final afjc g = afio.g;
                final afip c3 = super.c;
                if (c3 != null) {
                    final int a = c3.a(g);
                    if (a >= 0) {
                        int l = a + a;
                        int n4 = l + 2;
                        int b6;
                        while (true) {
                            b6 = c3.b;
                            if (n4 >= b6 + b6) {
                                break;
                            }
                            final Object o2 = c3.a[n4];
                            int n5 = l;
                            if (!o2.equals(g)) {
                                final Object[] a2 = c3.a;
                                a2[l] = o2;
                                a2[l + 1] = a2[n4 + 1];
                                n5 = l + 2;
                            }
                            n4 += 2;
                            l = n5;
                        }
                        c3.b = b6 - (n4 - l >> 1);
                        while (l < n4) {
                            c3.a[l] = null;
                            ++l;
                        }
                    }
                }
                this.o(afio.a, (Object)new afiv((Throwable)this.k().d(afio.a), afje, aflv.b((Class)afiq.class, afje.f)));
            }
        }
        return true;
    }
}
