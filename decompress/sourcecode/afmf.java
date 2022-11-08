import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afmf extends afmh implements Serializable
{
    private static final long serialVersionUID = 0L;
    final byte[] a;
    
    public afmf(final byte[] array) {
        array.getClass();
        this.a = array;
    }
    
    public final int a() {
        final int length = this.a.length;
        agot.F(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        final byte[] a = this.a;
        return (a[3] & 0xFF) << 24 | ((a[0] & 0xFF) | (a[1] & 0xFF) << 8 | (a[2] & 0xFF) << 16);
    }
    
    public final int b() {
        return this.a.length * 8;
    }
    
    public final boolean c(final afmh afmh) {
        if (this.a.length == afmh.e().length) {
            int n = 0;
            boolean b = true;
            while (true) {
                final byte[] a = this.a;
                if (n >= a.length) {
                    break;
                }
                b &= (a[n] == afmh.e()[n]);
                ++n;
            }
            return b;
        }
        return false;
    }
    
    public final byte[] d() {
        return this.a.clone();
    }
    
    public final byte[] e() {
        return this.a;
    }
}
