// 
// Decompiled by Procyon v0.6.0
// 

public final class atvc
{
    public static final atvj a;
    public final atot b;
    private final int c;
    private final boolean d;
    private final int e;
    private final atou f;
    private final aubp g;
    
    static {
        a = new atvj("REMOVE_FROZEN");
    }
    
    public atvc(final int c, final boolean d) {
        this.c = c;
        this.d = d;
        final int e = c - 1;
        this.e = e;
        this.f = auet.h((Object)null);
        this.b = auet.g(0L);
        this.g = new aubp(c);
        if (e > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((c & e) == 0x0) {
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
    
    public final int a(final Object o) {
        final atot b = this.b;
        while (true) {
            final long b2 = b.b;
            if ((0x3000000000000000L & b2) != 0x0L) {
                if ((0x2000000000000000L & b2) != 0x0L) {
                    return 2;
                }
                return 1;
            }
            else {
                final int n = (int)(0x3FFFFFFFL & b2);
                final int n2 = (int)((b2 & 0xFFFFFFFC0000000L) >> 30);
                final int e = this.e;
                if ((n2 + 2 & e) == (n & e)) {
                    return 1;
                }
                if (!this.d && this.g.m(n2 & e).a != null) {
                    final int c = this.c;
                    if (c < 1024 || (n2 - n & 0x3FFFFFFF) > c >> 1) {
                        return 1;
                    }
                    continue;
                }
                else {
                    if (this.b.b(b2, atva.a(b2, 1152921503533105152L) | (long)(n2 + 1 & 0x3FFFFFFF) << 30)) {
                        this.g.m(n2 & e).c(o);
                        atvc atvc = this;
                        while ((atvc.b.b & 0x1000000000000000L) != 0x0L) {
                            atvc c2 = atvc.c();
                            final Object a = c2.g.m(c2.e & n2).a;
                            if (a instanceof atvb && ((atvb)a).a == n2) {
                                c2.g.m(c2.e & n2).c(o);
                            }
                            else {
                                c2 = null;
                            }
                            atvc = c2;
                            if (c2 == null) {
                                break;
                            }
                        }
                        return 0;
                    }
                    continue;
                }
            }
        }
    }
    
    public final Object b() {
        final atot b = this.b;
        while (true) {
            final long b2 = b.b;
            if ((b2 & 0x1000000000000000L) != 0x0L) {
                return atvc.a;
            }
            final int n = (int)(b2 & 0x3FFFFFFFL);
            final int e = this.e;
            final int n2 = n & e;
            if ((e & (int)((0xFFFFFFFC0000000L & b2) >> 30)) == n2) {
                return null;
            }
            final Object a = this.g.m(n2).a;
            if (a == null) {
                if (this.d) {
                    return null;
                }
                continue;
            }
            else {
                if (a instanceof atvb) {
                    return null;
                }
                final int n3 = n + 1 & 0x3FFFFFFF;
                if (this.b.b(b2, atva.b(b2, n3))) {
                    this.g.m(this.e & n).c(null);
                    return a;
                }
                if (this.d) {
                    atvc c = this;
                    do {
                        final atot b3 = c.b;
                        while (true) {
                            final long b4 = b3.b;
                            final int n4 = (int)(b4 & 0x3FFFFFFFL);
                            final boolean a2 = atqb.a;
                            if ((b4 & 0x1000000000000000L) != 0x0L) {
                                c = c.c();
                                break;
                            }
                            if (c.b.b(b4, atva.b(b4, n3))) {
                                c.g.m(n4 & c.e).c(null);
                                c = null;
                                break;
                            }
                        }
                    } while (c != null);
                    return a;
                }
                continue;
            }
        }
    }
    
    public final atvc c() {
        final atot b = this.b;
        long b2;
        long n;
        do {
            b2 = b.b;
            if ((b2 & 0x1000000000000000L) != 0x0L) {
                n = b2;
                break;
            }
            n = (b2 | 0x1000000000000000L);
        } while (!b.b(b2, n));
        final atou f = this.f;
        atvc atvc;
        while (true) {
            atvc = (atvc)f.a;
            if (atvc != null) {
                break;
            }
            final atou f2 = this.f;
            final int c = this.c;
            final atvc atvc2 = new atvc(c + c, this.d);
            int n2 = (int)(0x3FFFFFFFL & n);
            final int n3 = (int)((0xFFFFFFFC0000000L & n) >> 30);
            while (true) {
                final int e = this.e;
                final int n4 = n2 & e;
                if (n4 == (e & n3)) {
                    break;
                }
                Object a;
                if ((a = this.g.m(n4).a) == null) {
                    a = new atvb(n2);
                }
                atvc2.g.m(atvc2.e & n2).c(a);
                ++n2;
            }
            atvc2.b.b = atva.a(n, 1152921504606846976L);
            f2.d(null, atvc2);
        }
        return atvc;
    }
    
    public final boolean d() {
        final atot b = this.b;
        long b2;
        do {
            b2 = b.b;
            if ((b2 & 0x2000000000000000L) != 0x0L) {
                return true;
            }
            if ((0x1000000000000000L & b2) != 0x0L) {
                return false;
            }
        } while (!b.b(b2, 0x2000000000000000L | b2));
        return true;
    }
    
    public final boolean e() {
        final long b = this.b.b;
        return (int)(0x3FFFFFFFL & b) == (int)((b & 0xFFFFFFFC0000000L) >> 30);
    }
}
