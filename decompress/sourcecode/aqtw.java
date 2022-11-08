import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtw
{
    public boolean a;
    public int b;
    public int c;
    public Object d;
    
    public aqtw() {
    }
    
    public aqtw(final byte[] array) {
        this.d = new byte[128];
    }
    
    public final void a(final byte[] array, final int n, int length) {
        if (!this.a) {
            return;
        }
        final int n2 = length - n;
        final byte[] array2 = (byte[])this.d;
        length = array2.length;
        final int n3 = this.c + n2;
        if (length < n3) {
            this.d = Arrays.copyOf(array2, n3 + n3);
        }
        System.arraycopy(array, n, this.d, this.c, n2);
        this.c += n2;
    }
}
