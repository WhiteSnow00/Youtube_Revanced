// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aeop
{
    public static aeop d(final Throwable t) {
        return (aeop)new aeon(t);
    }
    
    public static aeop e(final Object o) {
        return (aeop)new aeoo(o);
    }
    
    public abstract Object a();
    
    public abstract boolean b();
    
    public abstract Throwable c();
}
