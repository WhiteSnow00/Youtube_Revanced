import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeqz implements avs
{
    private final Set a;
    private final avs b;
    private final atx c;
    
    public aeqz(final br br, final avs b, final Set a, final hho hho, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = new aeqx((cgn)br, br.m, hho, null, null);
    }
    
    public final avq a(final Class clazz) {
        if (this.a.contains(clazz.getName())) {
            return this.c.a(clazz);
        }
        return this.b.a(clazz);
    }
    
    public final avq b(final Class clazz, final avz avz) {
        return aqo.e((avs)this, clazz);
    }
}
