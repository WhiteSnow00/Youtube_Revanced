// 
// Decompiled by Procyon v0.6.0
// 

final class aujj implements aujr, aujq
{
    public final int a;
    public final aujm b;
    private final int c;
    private final int d;
    private final aujj[] e;
    
    public aujj(final int c, final int d, final int a, final aujj[] e) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = null;
    }
    
    public aujj(final aujj aujj, final aujm aujm) {
        this.c = aujj.c;
        this.d = aujj.d;
        this.a = aujj.a;
        this.e = aujj.e;
        final aujm b = aujj.b;
        Object b2 = aujm;
        if (b != null) {
            b2 = new auji(b, aujm);
        }
        this.b = (aujm)b2;
    }
    
    static final boolean e(final auge auge, final int n) {
        switch (n) {
            default: {
                return auge.e(aufx.k) || auge.e(aufx.l);
            }
            case 7: {
                return auge.e(aufx.l);
            }
            case 6: {
                return auge.e(aufx.k);
            }
            case 5: {
                return auge.e(aufx.j);
            }
            case 4: {
                return auge.e(aufx.i);
            }
            case 3: {
                return auge.e(aufx.g);
            }
            case 2: {
                return auge.e(aufx.f);
            }
            case 1: {
                return auge.e(aufx.e);
            }
            case 0: {
                return auge.e(aufx.d);
            }
        }
    }
    
    static final boolean f(final augh augh) {
        for (int c = augh.c(), i = 0; i < c; ++i) {
            if (augh.b(i) != 0) {
                return false;
            }
        }
        return true;
    }
    
    public final int a(final augh augh) {
        final long d = this.d(augh);
        if (d == Long.MAX_VALUE) {
            return 0;
        }
        final int max = Math.max(aujb.a(d), this.c);
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
            final int max2 = Math.max(max, n3);
            final int a = this.a;
            final int n4 = n2 = max2 + 1;
            if (a == 9) {
                n2 = n4;
                if (Math.abs(d) % 1000L == 0L) {
                    n2 = n4 - 4;
                }
            }
            n = d / 1000L;
        }
        final aujm b = this.b;
        int n5 = n2;
        if (b != null) {
            n5 = n2 + b.a((int)n);
        }
        return n5;
    }
    
    public final int b(final augh augh, final int n) {
        if (this.d != 4 && this.d(augh) == Long.MAX_VALUE) {
            return 0;
        }
        return 1;
    }
    
    public final void c(final StringBuffer sb, final augh augh) {
        final long d = this.d(augh);
        if (d == Long.MAX_VALUE) {
            return;
        }
        final int a = this.a;
        int n = (int)d;
        if (a >= 8) {
            n = (int)(d / 1000L);
        }
        final int length = sb.length();
        if (this.c <= 1) {
            aujb.g(sb, n);
        }
        else {
            aujb.e(sb, n, 2);
        }
        if (this.a >= 8) {
            final long abs = Math.abs(d);
            final int a2 = this.a;
            final int n2 = (int)(abs % 1000L);
            if (a2 == 8 || n2 > 0) {
                if (d < 0L && d > -1000L) {
                    sb.insert(length, '-');
                }
                sb.append('.');
                aujb.e(sb, n2, 3);
            }
        }
        final aujm b = this.b;
        if (b != null) {
            b.b(sb, n);
        }
    }
    
    final long d(final augh augh) {
        auge e;
        if (this.d == 4) {
            e = null;
        }
        else {
            e = augh.e();
        }
        if (e != null && !e(e, this.a)) {
            return Long.MAX_VALUE;
        }
        long n = 0L;
        Label_0239: {
            int n2 = 0;
            switch (this.a) {
                default: {
                    n = augh.a(aufx.l) + augh.a(aufx.k) * 1000L;
                    break Label_0239;
                }
                case 7: {
                    n2 = augh.a(aufx.l);
                    break;
                }
                case 6: {
                    n2 = augh.a(aufx.k);
                    break;
                }
                case 5: {
                    n2 = augh.a(aufx.j);
                    break;
                }
                case 4: {
                    n2 = augh.a(aufx.i);
                    break;
                }
                case 3: {
                    n2 = augh.a(aufx.g);
                    break;
                }
                case 2: {
                    n2 = augh.a(aufx.f);
                    break;
                }
                case 1: {
                    n2 = augh.a(aufx.e);
                    break;
                }
                case 0: {
                    n2 = augh.a(aufx.d);
                    break;
                }
            }
            n = n2;
        }
        long n3 = n;
        if (n == 0L) {
            final int d = this.d;
            Label_0265: {
                if (d == 1) {
                    if (f(augh)) {
                        final aujj[] e2 = this.e;
                        final int a = this.a;
                        if (e2[a] == this) {
                            int min = Math.min(a, 8);
                            while (true) {
                                final int n4 = min - 1;
                                if (n4 < 0 || n4 > 9) {
                                    break Label_0265;
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
                    if (f(augh)) {
                        final aujj[] e3 = this.e;
                        int i = this.a;
                        if (e3[i] == this) {
                            ++i;
                            while (i <= 9) {
                                if (e(e, i) && this.e[i] != null) {
                                    return Long.MAX_VALUE;
                                }
                                ++i;
                            }
                            break Label_0265;
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
