// 
// Decompiled by Procyon v0.6.0
// 

public final class atzu
{
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public atzu f;
    public atzu g;
    
    public atzu() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
    
    public atzu(final byte[] a, final int b, final int c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = false;
    }
    
    public final atzu a() {
        final atzu f = this.f;
        atzu atzu;
        if (f != this) {
            atzu = f;
        }
        else {
            atzu = null;
        }
        final atzu g = this.g;
        g.getClass();
        g.f = f;
        final atzu f2 = this.f;
        f2.getClass();
        f2.g = g;
        this.f = null;
        this.g = null;
        return atzu;
    }
    
    public final atzu b() {
        this.d = true;
        return new atzu(this.a, this.b, this.c, true);
    }
    
    public final void c(final atzu atzu, final int n) {
        if (atzu.e) {
            final int c = atzu.c;
            final int n2 = c + n;
            int c2 = c;
            if (n2 > 8192) {
                if (atzu.d) {
                    throw new IllegalArgumentException();
                }
                final int b = atzu.b;
                if (n2 - b > 8192) {
                    throw new IllegalArgumentException();
                }
                final byte[] a = atzu.a;
                atum.k(a, a, b, c);
                c2 = atzu.c - atzu.b;
                atzu.c = c2;
                atzu.b = 0;
            }
            final byte[] a2 = this.a;
            final byte[] a3 = atzu.a;
            final int b2 = this.b;
            atum.h(a2, a3, c2, b2, b2 + n);
            atzu.c += n;
            this.b += n;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }
    
    public final void d(final atzu atzu) {
        atzu.g = this;
        atzu.f = this.f;
        final atzu f = this.f;
        f.getClass();
        f.g = atzu;
        this.f = atzu;
    }
}
