import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gog implements gov
{
    public final abll a;
    private final int b;
    
    public gog(final abll a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final ListenableFuture a(final vls vls) {
        final int b = this.b;
        if (b == 0) {
            return ((vml)this.a.g).a((vls)vls);
        }
        if (b != 1) {
            return ((vml)this.a.e).a((vls)vls);
        }
        return ((vml)this.a.h).a((vls)vls);
    }
}
