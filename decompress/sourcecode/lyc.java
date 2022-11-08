// 
// Decompiled by Procyon v0.6.0
// 

public final class lyc
{
    public final byte[] a;
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    
    public lyc() {
        this.a = new byte[10];
    }
    
    public final void a(final lyb lyb) {
        if (this.c > 0) {
            lyb.V.e(this.d, this.e, this.f, this.g, lyb.i);
            this.c = 0;
        }
    }
    
    public final void b(final buc buc, final bub bub) {
        if (this.c > 0) {
            buc.e(this.d, this.e, this.f, this.g, bub);
            this.c = 0;
        }
    }
    
    public final void c() {
        this.b = false;
        this.c = 0;
    }
    
    public final void d(final buc buc, final long d, final int e, final int n, final int g, final bub bub) {
        dk.i(this.g <= n + g, (Object)"TrueHD chunk samples must be contiguous in the sample queue.");
        if (!this.b) {
            return;
        }
        final int c = this.c;
        final int c2 = c + 1;
        this.c = c2;
        if (c == 0) {
            this.d = d;
            this.e = e;
            this.f = 0;
        }
        this.f += n;
        this.g = g;
        if (c2 >= 16) {
            this.b(buc, bub);
        }
    }
    
    public final void e(final btj btj) {
        if (this.b) {
            return;
        }
        btj.j(this.a, 0, 10);
        btj.l();
        if (bsr.b(this.a) == 0) {
            return;
        }
        this.b = true;
    }
}
