import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atfm extends AtomicReference
{
    private static final long serialVersionUID = 2404266111789071508L;
    private Object a;
    
    public atfm() {
    }
    
    public atfm(final Object a) {
        this.a = a;
    }
    
    public final atfm a() {
        return this.get();
    }
    
    public final Object b() {
        final Object a = this.a;
        this.a = null;
        return a;
    }
}
