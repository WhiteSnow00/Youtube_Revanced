// 
// Decompiled by Procyon v0.6.0
// 

final class bwx
{
    public final bwy a;
    public final bar b;
    public int c;
    public boolean d;
    private int e;
    
    public bwx() {
        this.a = new bwy();
        this.b = new bar(new byte[65025], 0);
        this.c = -1;
    }
    
    private final int b(final int n) {
        int n2 = 0;
        this.e = 0;
        int i;
        int n4;
        do {
            final int e = this.e;
            final int n3 = n + e;
            final bwy a = this.a;
            n4 = n2;
            if (n3 >= a.c) {
                break;
            }
            final int[] f = a.f;
            this.e = e + 1;
            i = f[n3];
            n4 = (n2 += i);
        } while (i == 255);
        return n4;
    }
    
    public final boolean a(final btj btj) {
        dk.h(true);
        if (this.d) {
            this.d = false;
            this.b.C(0);
        }
        while (!this.d) {
            int c;
            if ((c = this.c) < 0) {
                if (!this.a.c(btj) || !this.a.b(btj, true)) {
                    return false;
                }
                final bwy a = this.a;
                int d = a.d;
                if ((a.a & 0x1) == 0x1 && this.b.c == 0) {
                    d += this.b(0);
                    c = this.e;
                }
                else {
                    c = 0;
                }
                if (!blx.e(btj, d)) {
                    return false;
                }
                this.c = c;
            }
            final int b = this.b(c);
            final int n = this.c + this.e;
            if (b > 0) {
                final bar b2 = this.b;
                b2.A(b2.c + b);
                final bar b3 = this.b;
                if (!blx.d(btj, b3.a, b3.c, b)) {
                    return false;
                }
                final bar b4 = this.b;
                b4.F(b4.c + b);
                this.d = (this.a.f[n - 1] != 255);
            }
            int c2;
            if ((c2 = n) == this.a.c) {
                c2 = -1;
            }
            this.c = c2;
        }
        return true;
    }
}
