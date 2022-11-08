import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class bzr
{
    public static final byte[] a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public byte[] f;
    
    static {
        a = new byte[] { 0, 0, 1 };
    }
    
    public bzr() {
        this.f = new byte[128];
    }
    
    public final void a(final byte[] array, final int n, int n2) {
        if (!this.b) {
            return;
        }
        final int n3 = n2 - n;
        final byte[] f = this.f;
        final int length = f.length;
        n2 = this.d + n3;
        if (length < n2) {
            this.f = Arrays.copyOf(f, n2 + n2);
        }
        System.arraycopy(array, n, this.f, this.d, n3);
        this.d += n3;
    }
    
    public final void b() {
        this.b = false;
        this.d = 0;
        this.c = 0;
    }
}
