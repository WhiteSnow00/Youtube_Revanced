import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atlj implements Serializable, atli
{
    public static final atlj a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new atlj();
    }
    
    private atlj() {
    }
    
    private final Object readResolve() {
        return atlj.a;
    }
    
    @Override
    public final Object fold(final Object o, final atmp atmp) {
        return o;
    }
    
    @Override
    public final atlf get(final atlg atlg) {
        atlg.getClass();
        return null;
    }
    
    @Override
    public final int hashCode() {
        return 0;
    }
    
    @Override
    public final atli minusKey(final atlg atlg) {
        atlg.getClass();
        return this;
    }
    
    @Override
    public final atli plus(final atli atli) {
        atli.getClass();
        return atli;
    }
    
    @Override
    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
