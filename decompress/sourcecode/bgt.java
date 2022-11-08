// 
// Decompiled by Procyon v0.6.0
// 

final class bgt
{
    public final String a;
    public int b;
    public long c;
    public boolean d;
    public boolean e;
    final /* synthetic */ bgu f;
    public ayx g;
    
    public bgt(final bgu f, final String a, final int b, final ayx g) {
        this.f = f;
        this.a = a;
        this.b = b;
        long d;
        if (g == null) {
            d = -1L;
        }
        else {
            d = g.d;
        }
        this.c = d;
        if (g != null && g.a()) {
            this.g = g;
        }
    }
    
    public final boolean a(final bga bga) {
        final ayx i = bga.i;
        final boolean b = true;
        if (i == null) {
            return this.b != bga.c;
        }
        final long c = this.c;
        if (c == -1L) {
            return false;
        }
        if (i.d > c) {
            return true;
        }
        if (this.g == null) {
            return false;
        }
        final int a = bga.b.a(i.a);
        final int a2 = bga.b.a(this.g.a);
        final ayx j = bga.i;
        if (j.d < this.g.d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        if (j.a()) {
            final ayx k = bga.i;
            final int b2 = k.b;
            final int c2 = k.c;
            final ayx g = this.g;
            final int b3 = g.b;
            boolean b4 = b;
            if (b2 <= b3) {
                if (b2 == b3) {
                    if (c2 <= g.c) {
                        return false;
                    }
                    b4 = b;
                }
                else {
                    b4 = false;
                }
            }
            return b4;
        }
        final int e = bga.i.e;
        return e == -1 || e > this.g.b;
    }
}
