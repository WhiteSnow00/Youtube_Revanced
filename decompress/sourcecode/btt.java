// 
// Decompiled by Procyon v0.6.0
// 

public final class btt
{
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    
    public final boolean a(final int n) {
        if (!btu.d(n)) {
            return false;
        }
        final int a = n >>> 19 & 0x3;
        if (a == 1) {
            return false;
        }
        final int n2 = n >>> 17 & 0x3;
        if (n2 == 0) {
            return false;
        }
        final int n3 = n >>> 12 & 0xF;
        if (n3 == 0 || n3 == 15) {
            return false;
        }
        final int n4 = n >>> 10 & 0x3;
        if (n4 == 3) {
            return false;
        }
        this.a = a;
        this.b = btu.a[3 - n2];
        final int d = btu.b[n4];
        this.d = d;
        final int n5 = 2;
        int n6;
        if (a == 2) {
            n6 = d / 2;
            this.d = n6;
        }
        else {
            n6 = d;
            if (a == 0) {
                n6 = d / 4;
                this.d = n6;
            }
        }
        final int n7 = n >>> 9 & 0x1;
        this.g = btu.b(a, n2);
        if (n2 == 3) {
            int f;
            if (a == 3) {
                f = btu.c[n3 - 1];
            }
            else {
                f = btu.d[n3 - 1];
            }
            this.f = f;
            this.c = (f * 12 / n6 + n7) * 4;
        }
        else {
            int n8 = 144;
            if (a == 3) {
                int f2;
                if (n2 == 2) {
                    f2 = btu.e[n3 - 1];
                }
                else {
                    f2 = btu.f[n3 - 1];
                }
                this.f = f2;
                this.c = f2 * 144 / n6 + n7;
            }
            else {
                final int f3 = btu.g[n3 - 1];
                this.f = f3;
                if (n2 == 1) {
                    n8 = 72;
                }
                this.c = n8 * f3 / n6 + n7;
            }
        }
        int e = n5;
        if ((n >> 6 & 0x3) == 0x3) {
            e = 1;
        }
        this.e = e;
        return true;
    }
}
