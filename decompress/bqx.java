// 
// Decompiled by Procyon v0.6.0
// 

public final class bqx extends bqw
{
    public final boolean e;
    public final bqo f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final int p;
    private final int q;
    
    public bqx(int n, final azo azo, int p6, bqo f, final int n2, final boolean b) {
        super(n, azo, p6);
        this.f = f;
        final boolean e = f.E;
        final int n3 = 1;
        int n4;
        if (!e) {
            n4 = 16;
        }
        else {
            n4 = 24;
        }
        final boolean d = f.D;
        boolean e2 = false;
        Label_0149: {
            if (b) {
                final ayh d2 = this.d;
                n = d2.s;
                if (n == -1 || n <= f.b) {
                    n = d2.t;
                    if (n == -1 || n <= f.c) {
                        final float u = d2.u;
                        if (u == -1.0f || u <= f.d) {
                            n = d2.j;
                            if (n == -1 || n <= f.e) {
                                e2 = true;
                                break Label_0149;
                            }
                        }
                    }
                }
            }
            e2 = false;
        }
        this.e = e2;
        boolean g = false;
        Label_0261: {
            Label_0258: {
                if (b) {
                    final ayh d3 = this.d;
                    n = d3.s;
                    if (n != -1) {
                        p6 = f.f;
                        if (n < 0) {
                            break Label_0258;
                        }
                    }
                    p6 = d3.t;
                    if (p6 != -1) {
                        n = f.g;
                        if (p6 < 0) {
                            break Label_0258;
                        }
                    }
                    final float u2 = d3.u;
                    if (u2 != -1.0f) {
                        n = f.h;
                        if (u2 < 0.0f) {
                            break Label_0258;
                        }
                    }
                    n = d3.j;
                    if (n != -1) {
                        p6 = f.i;
                        if (n < 0) {
                            break Label_0258;
                        }
                    }
                    g = true;
                    break Label_0261;
                }
            }
            g = false;
        }
        this.g = g;
        this.h = bqy.k(n2, false);
        final ayh d4 = this.d;
        this.i = d4.j;
        this.j = d4.a();
        n = this.d.g;
        p6 = f.n;
        this.l = bqy.b(n, 0);
        n = this.d.g;
        this.m = (n == 0 || (n & 0x1) != 0x0);
        n = 0;
        while (true) {
            final afgh m = f.m;
            if (n >= ((afjx)m).c) {
                n = Integer.MAX_VALUE;
                break;
            }
            final String n5 = this.d.n;
            if (n5 != null && n5.equals(m.get(n))) {
                break;
            }
            ++n;
        }
        this.k = n;
        this.n = (bht.e(n2) == 128);
        this.o = (bht.g(n2) == 64);
        final ayh d5 = this.d;
        final String n6 = d5.n;
        Label_0676: {
            if (n6 != null) {
                n = n6.hashCode();
                p6 = 4;
                Label_0632: {
                    switch (n) {
                        case 1599127257: {
                            if (n6.equals("video/x-vnd.on2.vp9")) {
                                n = 3;
                                break Label_0632;
                            }
                            break;
                        }
                        case 1331836730: {
                            if (n6.equals("video/avc")) {
                                n = 4;
                                break Label_0632;
                            }
                            break;
                        }
                        case -1662541442: {
                            if (n6.equals("video/hevc")) {
                                n = 2;
                                break Label_0632;
                            }
                            break;
                        }
                        case -1662735862: {
                            if (n6.equals("video/av01")) {
                                n = 1;
                                break Label_0632;
                            }
                            break;
                        }
                        case -1851077871: {
                            if (n6.equals("video/dolby-vision")) {
                                n = 0;
                                break Label_0632;
                            }
                            break;
                        }
                    }
                    n = -1;
                }
                if (n == 0) {
                    p6 = 5;
                    break Label_0676;
                }
                if (n == 1) {
                    break Label_0676;
                }
                if (n == 2) {
                    p6 = 3;
                    break Label_0676;
                }
                if (n == 3) {
                    p6 = 2;
                    break Label_0676;
                }
                if (n == 4) {
                    p6 = 1;
                    break Label_0676;
                }
            }
            p6 = 0;
        }
        this.p = p6;
        Label_0813: {
            if ((d5.g & 0x4000) == 0x0) {
                f = this.f;
                if (bqy.k(n2, f.M)) {
                    final boolean e3 = this.e;
                    if (e3 || f.C) {
                        n = n3;
                        if (!bqy.k(n2, false)) {
                            break Label_0813;
                        }
                        n = n3;
                        if (!this.g) {
                            break Label_0813;
                        }
                        n = n3;
                        if (!e3) {
                            break Label_0813;
                        }
                        n = n3;
                        if (d5.j == -1) {
                            break Label_0813;
                        }
                        n = n3;
                        if (f.y) {
                            break Label_0813;
                        }
                        final boolean x = f.x;
                        n = n3;
                        if ((n4 & n2) != 0x0) {
                            n = 2;
                        }
                        break Label_0813;
                    }
                }
            }
            n = 0;
        }
        this.q = n;
    }
    
    @Override
    public final int b() {
        return this.q;
    }
    
    @Override
    public final /* bridge */ boolean c(final bqw bqw) {
        final bqx bqx = (bqx)bqw;
        if (baz.aa(this.d.n, bqx.d.n)) {
            final boolean f = this.f.F;
            if (this.n == bqx.n && this.o == bqx.o) {
                return true;
            }
        }
        return false;
    }
}
