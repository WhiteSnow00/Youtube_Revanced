import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabz extends vjn
{
    public final List a;
    public final List b;
    public final List c;
    
    protected aabz(final adcr adcr, final zkh zkh, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super("offline", adcr, zkh, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
    }
    
    protected final void c() {
        agot.D(!this.a.isEmpty() || !this.b.isEmpty() || !this.c.isEmpty());
        agot.D(true);
    }
}
