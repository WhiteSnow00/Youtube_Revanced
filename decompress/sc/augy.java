// 
// Decompiled by Procyon v0.6.0
// 

abstract class augy extends augv
{
    private static final int[] H;
    private static final int[] I;
    private static final long[] J;
    private static final long[] K;
    private static final long serialVersionUID = 538276888268L;
    
    static {
        H = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        I = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        J = new long[12];
        K = new long[12];
        int i = 0;
        long n = 0L;
        long n2 = 0L;
        while (i < 11) {
            n += augy.H[i] * 86400000L;
            final int n3 = i + 1;
            augy.J[n3] = n;
            n2 += augy.I[i] * 86400000L;
            augy.K[n3] = n2;
            i = n3;
        }
    }
    
    public augy(final aufl aufl, final int n) {
        super(aufl, n);
    }
    
    public final int S(int n, final int n2) {
        final boolean aj = this.aj(n);
        n = n2 - 1;
        if (aj) {
            return augy.I[n];
        }
        return augy.H[n];
    }
    
    public final int U(final long n, int n2) {
        final long ae = this.ae(n2);
        final int n3 = 10;
        final int n4 = (int)(n - ae >> 10);
        if (this.aj(n2)) {
            if (n4 < 15356250) {
                if (n4 < 7678125) {
                    if (n4 >= 2615625) {
                        if (n4 >= 5062500) {
                            return 3;
                        }
                        return 2;
                    }
                }
                else {
                    if (n4 < 10209375) {
                        return 4;
                    }
                    if (n4 >= 12825000) {
                        return 6;
                    }
                    return 5;
                }
            }
            else if (n4 < 23118750) {
                if (n4 < 17971875) {
                    return 7;
                }
                if (n4 >= 20587500) {
                    return 9;
                }
                return 8;
            }
            else {
                if (n4 < 25734375) {
                    n2 = n3;
                    return n2;
                }
                if (n4 >= 28265625) {
                    return 12;
                }
                return 11;
            }
        }
        else if (n4 < 15271875) {
            if (n4 < 7593750) {
                if (n4 >= 2615625) {
                    if (n4 >= 4978125) {
                        return 3;
                    }
                    return 2;
                }
            }
            else {
                if (n4 < 10125000) {
                    return 4;
                }
                if (n4 >= 12740625) {
                    return 6;
                }
                return 5;
            }
        }
        else if (n4 < 23034375) {
            if (n4 < 17887500) {
                return 7;
            }
            if (n4 >= 20503125) {
                return 9;
            }
            return 8;
        }
        else {
            if (n4 < 25650000) {
                n2 = n3;
                return n2;
            }
            if (n4 >= 28181250) {
                return 12;
            }
            return 11;
        }
        n2 = 1;
        return n2;
        n2 = 3;
        return n2;
        n2 = 4;
        return n2;
        n2 = 6;
        return n2;
        n2 = 7;
        return n2;
        n2 = 9;
        return n2;
        n2 = 12;
        return n2;
    }
    
    public final long ac(int n, final int n2) {
        final boolean aj = this.aj(n);
        n = n2 - 1;
        if (aj) {
            return augy.K[n];
        }
        return augy.J[n];
    }
    
    public final long ad(long n, long n2) {
        final int z = this.Z(n);
        final int z2 = this.Z(n2);
        final long n3 = n - this.ae(z);
        final long n4 = n2 - this.ae(z2);
        n2 = n3;
        n = n4;
        if (n4 >= 5097600000L) {
            if (this.aj(z2)) {
                n2 = n3;
                n = n4;
                if (!this.aj(z)) {
                    n = n4 - 86400000L;
                    n2 = n3;
                }
            }
            else {
                n2 = n3;
                n = n4;
                if (n3 >= 5097600000L) {
                    n2 = n3;
                    n = n4;
                    if (this.aj(z)) {
                        n2 = n3 - 86400000L;
                        n = n4;
                    }
                }
            }
        }
        int n5 = z - z2;
        if (n2 < n) {
            --n5;
        }
        return n5;
    }
    
    public final long ah(final long n, final int n2) {
        final int z = this.Z(n);
        int q;
        final int n3 = q = this.Q(n, z);
        if (n3 > 59) {
            if (this.aj(z)) {
                q = n3;
                if (!this.aj(n2)) {
                    q = n3 - 1;
                }
            }
            else {
                q = n3;
                if (this.aj(n2)) {
                    q = n3 + 1;
                }
            }
        }
        return this.af(n2, 1, q) + this.T(n);
    }
    
    public final boolean ai(final long n) {
        return ((augs)this).k.a(n) == 29 && ((augs)this).m.t(n);
    }
}
