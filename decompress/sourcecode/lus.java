import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class lus
{
    public boolean a;
    public byte[] b;
    public int c;
    private final int d;
    private boolean e;
    
    public lus(final int d) {
        this.d = d;
        (this.b = new byte[131])[2] = 1;
    }
    
    public final void a(final byte[] array, final int n, int n2) {
        if (!this.e) {
            return;
        }
        final int n3 = n2 - n;
        final byte[] b = this.b;
        final int length = b.length;
        n2 = this.c + n3;
        if (length < n2) {
            this.b = Arrays.copyOf(b, n2 + n2);
        }
        System.arraycopy(array, n, this.b, this.c, n3);
        this.c += n3;
    }
    
    public final void b() {
        this.e = false;
        this.a = false;
    }
    
    public final void c(final int n) {
        final boolean e = this.e;
        boolean e2 = true;
        jfi.U(e ^ true);
        if (n != this.d) {
            e2 = false;
        }
        this.e = e2;
        if (e2) {
            this.c = 3;
            this.a = false;
        }
    }
    
    public final boolean d(final int n) {
        if (!this.e) {
            return false;
        }
        this.c -= n;
        this.e = false;
        return this.a = true;
    }
}
