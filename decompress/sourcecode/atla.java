import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class atla implements Serializable
{
    private static final long serialVersionUID = 0L;
    private final atli[] a;
    
    public atla(final atli[] a) {
        a.getClass();
        this.a = a;
    }
    
    private final Object readResolve() {
        final atli[] a = this.a;
        final int length = a.length;
        atli atli = atlj.a;
        for (int i = 0; i < length; ++i) {
            atli = atli.plus(a[i]);
        }
        return atli;
    }
}
