import java.util.Arrays;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iis implements ijj
{
    private final asid a;
    private final bhv b;
    
    public iis(final asid a, final bhv b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
    }
    
    public final asht b() {
        alxp alxp;
        if ((alxp = ((vaf)this.b.a).b().e) == null) {
            alxp = alxp.a;
        }
        long n = (long)alxp.aK;
        if (n <= 0L) {
            n = 60L;
        }
        return asht.W(n, n, TimeUnit.SECONDS, this.a).af(this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof iis;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { 60L });
    }
}
