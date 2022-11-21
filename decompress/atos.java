import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class atos implements Serializable
{
    private static final long serialVersionUID = 0L;
    private final atpa[] a;
    
    public atos(final atpa[] a) {
        a.getClass();
        this.a = a;
    }
    
    private final Object readResolve() {
        final atpa[] a = this.a;
        final int length = a.length;
        Object o = atpb.a;
        for (int i = 0; i < length; ++i) {
            o = ((atpa)o).plus(a[i]);
        }
        return o;
    }
}
