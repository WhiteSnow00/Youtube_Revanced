import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bst
{
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;
    
    private bst(final List a, final int b, final int c, final int d, final float e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static bst a(final bar bar) {
        try {
            bar.H(4);
            final int n = (bar.i() & 0x3) + 1;
            if (n != 3) {
                final ArrayList list = new ArrayList();
                final int n2 = bar.i() & 0x1F;
                for (int i = 0; i < n2; ++i) {
                    list.add(b(bar));
                }
                for (int j = bar.i(), k = 0; k < j; ++k) {
                    list.add(b(bar));
                }
                int e;
                int f;
                float g;
                String b;
                if (n2 > 0) {
                    final btv c = btw.c((byte[])list.get(0), n, ((byte[])list.get(0)).length);
                    e = c.e;
                    f = c.f;
                    g = c.g;
                    b = bad.b(c.a, c.b, c.c);
                }
                else {
                    b = null;
                    e = -1;
                    f = -1;
                    g = 1.0f;
                }
                return new bst(list, n, e, f, g, b);
            }
            throw new IllegalStateException();
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw ayz.a("Error parsing AVC config", (Throwable)ex);
        }
    }
    
    private static byte[] b(final bar bar) {
        final int m = bar.m();
        final int b = bar.b;
        bar.H(m);
        final byte[] a = bar.a;
        final byte[] a2 = bad.a;
        final byte[] array = new byte[m + 4];
        System.arraycopy(bad.a, 0, array, 0, 4);
        System.arraycopy(a, b, array, 4, m);
        return array;
    }
}
