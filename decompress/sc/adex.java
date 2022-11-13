import java.util.List;
import java.text.NumberFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adex implements nwx
{
    public final NumberFormat a;
    public final List b;
    
    public adex(final NumberFormat a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final Object o, final int n, final nxb nxb) {
        final NumberFormat a = this.a;
        final List b = this.b;
        final nxe nxe = (nxe)o;
        return a.format(b.get(n));
    }
}
