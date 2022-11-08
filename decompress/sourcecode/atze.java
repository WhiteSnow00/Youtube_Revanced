// 
// Decompiled by Procyon v0.6.0
// 

public final class atze
{
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public atze f;
    public atze g;
    
    public atze() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
    
    public atze(final byte[] a, final int b, final int c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = false;
    }
    
    public final atze a() {
        final atze f = this.f;
        atze atze;
        if (f != this) {
            atze = f;
        }
        else {
            atze = null;
        }
        final atze g = this.g;
        g.getClass();
        g.f = f;
        final atze f2 = this.f;
        f2.getClass();
        f2.g = g;
        this.f = null;
        this.g = null;
        return atze;
    }
    
    public final atze b() {
        this.d = true;
        return new atze(this.a, this.b, this.c, true);
    }
    
    public final void c(final atze atze, final int n) {
        if (atze.e) {
            final int c = atze.c;
            final int n2 = c + n;
            int c2 = c;
            if (n2 > 8192) {
                if (atze.d) {
                    throw new IllegalArgumentException();
                }
                final int b = atze.b;
                if (n2 - b > 8192) {
                    throw new IllegalArgumentException();
                }
                final byte[] a = atze.a;
                aqqn.E(a, a, b, c);
                c2 = atze.c - atze.b;
                atze.c = c2;
                atze.b = 0;
            }
            final byte[] a2 = this.a;
            final byte[] a3 = atze.a;
            final int b2 = this.b;
            aqqn.B(a2, a3, c2, b2, b2 + n);
            atze.c += n;
            this.b += n;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }
    
    public final void d(final atze atze) {
        atze.g = this;
        atze.f = this.f;
        final atze f = this.f;
        f.getClass();
        f.g = atze;
        this.f = atze;
    }
}
