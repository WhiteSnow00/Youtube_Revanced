import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcl extends beb
{
    private static final long b;
    public boolean a;
    private final long c;
    
    static {
        b = TimeUnit.SECONDS.toMicros(1L);
    }
    
    public hcl(final aujg aujg, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = true;
        this.c = TimeUnit.MILLISECONDS.toMicros(aujg.bo()) + hcl.b;
    }
    
    public final long a() {
        return this.c;
    }
    
    public final boolean h(final long n, final long n2, final float n3) {
        return n2 <= this.c;
    }
    
    public final boolean i(final long n, final float n2, final boolean b, final long n3) {
        if (this.a) {
            return n >= this.c;
        }
        return super.i(n, n2, b, n3);
    }
}
