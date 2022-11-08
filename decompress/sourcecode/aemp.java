// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aemp
{
    public static aemp d(final Throwable t) {
        return (aemp)new aemn(t);
    }
    
    public static aemp e(final Object o) {
        return (aemp)new aemo(o);
    }
    
    public abstract Object a();
    
    public abstract boolean b();
    
    public abstract Throwable c();
}
