// 
// Decompiled by Procyon v0.6.0
// 

final class auis implements auja, auiz
{
    public final int a;
    public final auiv b;
    private final int c;
    private final int d;
    private final auis[] e;
    
    public auis(final int c, final int d, final int a, final auis[] e) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = null;
    }
    
    public auis(final auis auis, final auiv auiv) {
        this.c = auis.c;
        this.d = auis.d;
        this.a = auis.a;
        this.e = auis.e;
        final auiv b = auis.b;
        Object b2 = auiv;
        if (b != null) {
            b2 = new auir(b, auiv);
        }
        this.b = (auiv)b2;
    }
    
    static final boolean e(final aufn aufn, final int n) {
        switch (n) {
            default: {
                return aufn.e(aufg.k) || aufn.e(aufg.l);
            }
            case 7: {
                return aufn.e(aufg.l);
            }
            case 6: {
                return aufn.e(aufg.k);
            }
            case 5: {
                return aufn.e(aufg.j);
            }
            case 4: {
                return aufn.e(aufg.i);
            }
            case 3: {
                return aufn.e(aufg.g);
            }
            case 2: {
                return aufn.e(aufg.f);
            }
            case 1: {
                return aufn.e(aufg.e);
            }
            case 0: {
                return aufn.e(aufg.d);
            }
        }
    }
    
    static final boolean f(final aufq aufq) {
        for (int c = aufq.c(), i = 0; i < c; ++i) {
            if (aufq.b(i) != 0) {
                return false;
            }
        }
        return true;
    }
    
    public final int a(final aufq aufq) {
        final long d = this.d(aufq);
        if (d == Long.MAX_VALUE) {
            return 0;
        }
        final int max = Math.max(auik.a(d), this.c);
        long n = d;
        int n2 = max;
        if (this.a >= 8) {
            int n3;
            if (d < 0L) {
                n3 = 5;
            }
            else {
                n3 = 4;
            }
            final int n4 = n2 = Math.max(max, n3) + 1;
            if (this.a == 9) {
                n2 = n4;
                if (Math.abs(d) % 1000L == 0L) {
                    n2 = n4 - 4;
                }
            }
            n = d / 1000L;
        }
        final int n5 = (int)n;
        final auiv b = this.b;
        int n6 = n2;
        if (b != null) {
            n6 = n2 + b.a(n5);
        }
        return n6;
    }
    
    public final int b(final aufq aufq, final int n) {
        if (this.d != 4 && this.d(aufq) == Long.MAX_VALUE) {
            return 0;
        }
        return 1;
    }
    
    public final void c(final StringBuffer sb, final aufq aufq) {
        final long d = this.d(aufq);
        if (d == Long.MAX_VALUE) {
            return;
        }
        int n = (int)d;
        if (this.a >= 8) {
            n = (int)(d / 1000L);
        }
        final int length = sb.length();
        if (this.c <= 1) {
            auik.g(sb, n);
        }
        else {
            auik.e(sb, n, 2);
        }
        if (this.a >= 8) {
            final int n2 = (int)(Math.abs(d) % 1000L);
            if (this.a == 8 || n2 > 0) {
                if (d < 0L && d > -1000L) {
                    sb.insert(length, '-');
                }
                sb.append('.');
                auik.e(sb, n2, 3);
            }
        }
        final auiv b = this.b;
        if (b != null) {
            b.b(sb, n);
        }
    }
    
    final long d(final aufq aufq) {
        aufn e;
        if (this.d == 4) {
            e = null;
        }
        else {
            e = aufq.e();
        }
        if (e != null && !e(e, this.a)) {
            return Long.MAX_VALUE;
        }
        long n = 0L;
        Label_0234: {
            int n2 = 0;
            switch (this.a) {
                default: {
                    n = aufq.a(aufg.k) * 1000L + aufq.a(aufg.l);
                    break Label_0234;
                }
                case 7: {
                    n2 = aufq.a(aufg.l);
                    break;
                }
                case 6: {
                    n2 = aufq.a(aufg.k);
                    break;
                }
                case 5: {
                    n2 = aufq.a(aufg.j);
                    break;
                }
                case 4: {
                    n2 = aufq.a(aufg.i);
                    break;
                }
                case 3: {
                    n2 = aufq.a(aufg.g);
                    break;
                }
                case 2: {
                    n2 = aufq.a(aufg.f);
                    break;
                }
                case 1: {
                    n2 = aufq.a(aufg.e);
                    break;
                }
                case 0: {
                    n2 = aufq.a(aufg.d);
                    break;
                }
            }
            n = n2;
        }
        long n3 = n;
        if (n == 0L) {
            final int d = this.d;
            Label_0261: {
                if (d == 1) {
                    if (f(aufq)) {
                        final auis[] e2 = this.e;
                        final int a = this.a;
                        if (e2[a] == this) {
                            int min = Math.min(a, 8);
                            while (true) {
                                final int n4 = min - 1;
                                if (n4 < 0 || n4 > 9) {
                                    break Label_0261;
                                }
                                min = n4;
                                if (!e(e, n4)) {
                                    continue;
                                }
                                if (this.e[n4] != null) {
                                    break;
                                }
                                min = n4;
                            }
                        }
                    }
                    return Long.MAX_VALUE;
                }
                if (d == 2) {
                    if (f(aufq)) {
                        final auis[] e3 = this.e;
                        int i = this.a;
                        if (e3[i] == this) {
                            ++i;
                            while (i <= 9) {
                                if (e(e, i) && this.e[i] != null) {
                                    return Long.MAX_VALUE;
                                }
                                ++i;
                            }
                            break Label_0261;
                        }
                    }
                    return Long.MAX_VALUE;
                }
            }
            n3 = 0L;
        }
        return n3;
    }
}
