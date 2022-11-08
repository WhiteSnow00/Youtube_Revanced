import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvg
{
    public final Object a;
    public final agbu b;
    public final int c;
    public final afus d;
    public final int e;
    private final byte[] f;
    
    public afvg(final Object a, final byte[] array, final int e, final agbu b, final int c, final afus d) {
        this.a = a;
        this.f = Arrays.copyOf(array, array.length);
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final byte[] a() {
        final byte[] f = this.f;
        if (f == null) {
            return null;
        }
        return Arrays.copyOf(f, f.length);
    }
}
