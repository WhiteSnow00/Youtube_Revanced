import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeng implements avq
{
    private final Set a;
    private final avq b;
    private final atu c;
    
    public aeng(final br br, final avq b, final Set a, final hgm hgm, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = new aene((cgj)br, br.m, hgm, null, null);
    }
    
    public final avo a(final Class clazz) {
        if (this.a.contains(clazz.getName())) {
            return this.c.a(clazz);
        }
        return this.b.a(clazz);
    }
}
