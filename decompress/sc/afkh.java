import j$.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afkh extends afkq implements afkz
{
    protected afkh(final Level level) {
        super(level);
    }
    
    protected final afns a() {
        return (afns)afnq.a;
    }
    
    protected final boolean b(final afku afku) {
        final aflt k = this.k();
        final int b = k.b();
        final boolean b2 = false;
        int i = 0;
        while (i < b) {
            if (k.c(i).a == "eye3tag") {
                if (k.d(afko.a) == null && k.d(afko.g) == null) {
                    this.o(afko.g, (Object)afle.a);
                    break;
                }
                break;
            }
            else {
                ++i;
            }
        }
        final afkp c = super.c;
        if (c != null) {
            Label_0437: {
                if (afku != null) {
                    final Integer n = (Integer)c.d(afko.b);
                    final afkw afkw = (afkw)super.c.d(afko.c);
                    final afkp c2 = super.c;
                    final adet d = afkx.d;
                    final Object value = ((ConcurrentHashMap)d.a).get((Object)afku);
                    Object o;
                    if (value != null) {
                        o = value;
                    }
                    else {
                        final afkx afkx = new afkx();
                        final Object putIfAbsent = ((ConcurrentHashMap)d.a).putIfAbsent((Object)afku, (Object)afkx);
                        if (putIfAbsent != null) {
                            o = putIfAbsent;
                        }
                        else {
                            final int b3 = c2.b;
                            agjf agjf = null;
                            for (int j = 0; j < b3; ++j) {
                                if (afko.d.equals(((aflt)c2).c(j))) {
                                    final Object e = ((aflt)c2).e(j);
                                    if (e instanceof afla) {
                                        if (agjf == null) {
                                            agjf = new agjf(d, afku, 1, (byte[])null, (byte[])null, (byte[])null);
                                        }
                                        ((afla)e).a();
                                    }
                                }
                            }
                            o = afkx;
                        }
                    }
                    final afkx afkx2 = (afkx)o;
                    final long n2 = 0L;
                    if (n != null) {
                        final int intValue = n;
                        final boolean b4 = b2;
                        if (afkx2.a.getAndIncrement() % intValue != 0L) {
                            return b4;
                        }
                    }
                    if (afkw != null) {
                        final long b5 = super.b;
                        long value2 = afkx2.b.get();
                        final long n3 = afkw.b.toNanos(afkw.a) + value2;
                        Label_0422: {
                            if (n3 >= 0L) {
                                if (b5 < n3) {
                                    if (value2 != 0L) {
                                        break Label_0422;
                                    }
                                    value2 = n2;
                                }
                                if (afkx2.b.compareAndSet(value2, b5)) {
                                    afkw.c = afkx2.c.getAndSet(0);
                                    break Label_0437;
                                }
                            }
                        }
                        afkx2.c.incrementAndGet();
                        return b2;
                    }
                }
            }
            final afle afle = (afle)super.c.d(afko.g);
            if (afle != null) {
                final aflc g = afko.g;
                final afkp c3 = super.c;
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
                this.o(afko.a, (Object)new afkv((Throwable)this.k().d(afko.a), afle, afnv.b((Class)afkq.class, afle.f)));
            }
        }
        return true;
    }
}
