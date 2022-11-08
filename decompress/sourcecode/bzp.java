import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class bzp
{
    public static final byte[] a;
    public boolean b;
    public int c;
    public int d;
    public byte[] e;
    
    static {
        a = new byte[] { 0, 0, 1 };
    }
    
    public bzp() {
        this.e = new byte[128];
    }
    
    public final void a(final byte[] array, final int n, int n2) {
        if (!this.b) {
            return;
        }
        final int n3 = n2 - n;
        final byte[] e = this.e;
        final int length = e.length;
        n2 = this.c + n3;
        if (length < n2) {
            this.e = Arrays.copyOf(e, n2 + n2);
        }
        System.arraycopy(array, n, this.e, this.c, n3);
        this.c += n3;
    }
}
