// 
// Decompiled by Procyon v0.6.0
// 

abstract class augh extends auge
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
        long n = 0L;
        long n2 = 0L;
        int n3;
        for (int i = 0; i < 11; i = n3) {
            n += augh.H[i] * 86400000L;
            n3 = i + 1;
            augh.J[n3] = n;
            n2 += augh.I[i] * 86400000L;
            augh.K[n3] = n2;
        }
    }
    
    public augh(final aueu aueu, final int n) {
        super(aueu, n);
    }
    
    public final int S(final int n, final int n2) {
        if (this.aj(n)) {
            return augh.I[n2 - 1];
        }
        return augh.H[n2 - 1];
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
    
    public final long ac(final int n, final int n2) {
        if (this.aj(n)) {
            return augh.K[n2 - 1];
        }
        return augh.J[n2 - 1];
    }
    
    public final long ad(long n, long n2) {
        final int z = this.Z(n);
        final int z2 = this.Z(n2);
        final long n3 = n - this.ae(z);
        final long n4 = n2 - this.ae(z2);
        n = n3;
        n2 = n4;
        if (n4 >= 5097600000L) {
            if (this.aj(z2)) {
                n = n3;
                n2 = n4;
                if (!this.aj(z)) {
                    n2 = n4 - 86400000L;
                    n = n3;
                }
            }
            else {
                n = n3;
                n2 = n4;
                if (n3 >= 5097600000L) {
                    n = n3;
                    n2 = n4;
                    if (this.aj(z)) {
                        n = n3 - 86400000L;
                        n2 = n4;
                    }
                }
            }
        }
        int n5 = z - z2;
        if (n < n2) {
            --n5;
        }
        return n5;
    }
    
    public final long ah(final long n, final int n2) {
        final int z = this.Z(n);
        final int q = this.Q(n, z);
        final int t = this.T(n);
        int n3 = q;
        if (q > 59) {
            if (this.aj(z)) {
                n3 = q;
                if (!this.aj(n2)) {
                    n3 = q - 1;
                }
            }
            else {
                n3 = q;
                if (this.aj(n2)) {
                    n3 = q + 1;
                }
            }
        }
        return this.af(n2, 1, n3) + t;
    }
    
    public final boolean ai(final long n) {
        return ((augb)this).k.a(n) == 29 && ((augb)this).m.t(n);
    }
}
