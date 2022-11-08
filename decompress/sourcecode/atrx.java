// 
// Decompiled by Procyon v0.6.0
// 

public final class atrx extends atpu
{
    static {
        new atrx();
    }
    
    private atrx() {
    }
    
    public final void d(final atli atli, final Runnable runnable) {
        atli.getClass();
        if (atli.get(atsa.a) != null) {
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
    
    public final boolean e(final atli atli) {
        atli.getClass();
        return false;
    }
    
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
