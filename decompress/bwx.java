import java.io.EOFException;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

final class bwx implements bxd
{
    public final long a;
    public final long b;
    public final bxh c;
    public long d;
    private final bxc e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    
    public bwx(final bxh c, final long a, final long b, final long n, final long d, final boolean b2) {
        bad.d(a >= 0L && b > a);
        this.c = c;
        this.a = a;
        this.b = b;
        if (n != b - a && !b2) {
            this.f = 0;
        }
        else {
            this.d = d;
            this.f = 4;
        }
        this.e = new bxc();
    }
    
    public final long a(final btn btn) {
        final int f = this.f;
        if (f != 0) {
            if (f != 1) {
                if (f != 2) {
                    if (f != 3) {
                        return -1L;
                    }
                }
                else {
                    final long i = this.i;
                    final long j = this.j;
                    long n = 0L;
                    Label_0308: {
                        Label_0046: {
                            if (i != j) {
                                final btg btg = (btg)btn;
                                final long c = btg.c;
                                if (!this.e.d(btn, j)) {
                                    n = this.i;
                                    if (n == c) {
                                        throw new IOException("No ogg page can be found.");
                                    }
                                }
                                else {
                                    this.e.b(btn, false);
                                    btn.l();
                                    final long h = this.h;
                                    final bxc e = this.e;
                                    final long b = e.b;
                                    final long n2 = h - b;
                                    final int n3 = e.d + e.e;
                                    if (n2 >= 0L && n2 < 72000L) {
                                        break Label_0046;
                                    }
                                    if (n2 < 0L) {
                                        this.j = c;
                                        this.l = b;
                                    }
                                    else {
                                        this.i = btg.c + n3;
                                        this.k = b;
                                    }
                                    final long k = this.j;
                                    final long l = this.i;
                                    final long n4 = k - l;
                                    if (n4 < 100000L) {
                                        this.j = l;
                                        n = l;
                                    }
                                    else {
                                        final long n5 = n3;
                                        long n6;
                                        if (n2 <= 0L) {
                                            n6 = 2L;
                                        }
                                        else {
                                            n6 = 1L;
                                        }
                                        n = baz.r(btg.c - n5 * n6 + n2 * n4 / (this.l - this.k), l, k - 1L);
                                    }
                                }
                                break Label_0308;
                            }
                        }
                        n = -1L;
                    }
                    if (n != -1L) {
                        return n;
                    }
                    this.f = 3;
                }
                while (true) {
                    this.e.c(btn);
                    this.e.b(btn, false);
                    final bxc e2 = this.e;
                    if (e2.b > this.h) {
                        break;
                    }
                    btn.m(e2.d + e2.e);
                    this.i = ((btg)btn).c;
                    this.k = this.e.b;
                }
                btn.l();
                this.f = 4;
                return -(this.k + 2L);
            }
        }
        else {
            final long c2 = ((btg)btn).c;
            this.g = c2;
            this.f = 1;
            final long n7 = this.b - 65307L;
            if (n7 > c2) {
                return n7;
            }
        }
        this.e.a();
        if (this.e.c(btn)) {
            this.e.b(btn, false);
            final bxc e3 = this.e;
            btn.m(e3.d + e3.e);
            long d = this.e.b;
            while (true) {
                final bxc e4 = this.e;
                if ((e4.a & 0x4) == 0x4 || !e4.c(btn) || ((btg)btn).c >= this.b || !this.e.b(btn, true)) {
                    break;
                }
                final bxc e5 = this.e;
                if (!bmd.e(btn, e5.d + e5.e)) {
                    break;
                }
                d = this.e.b;
            }
            this.d = d;
            this.f = 4;
            return this.g;
        }
        throw new EOFException();
    }
    
    public final /* bridge */ bud b() {
        if (this.d != 0L) {
            return (bud)new bww(this);
        }
        return null;
    }
    
    public final void c(final long n) {
        this.h = baz.r(n, 0L, -1L + this.d);
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0L;
        this.l = this.d;
    }
}
