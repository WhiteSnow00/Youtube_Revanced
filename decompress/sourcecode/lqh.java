// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lqh
{
    public static lqh d(final Object o) {
        return (lqh)new lqf((Integer)null, o, lqi.a);
    }
    
    public static lqh e(final int n, final Object o) {
        return (lqh)new lqf(Integer.valueOf(n), o, lqi.a);
    }
    
    public static lqh f(final int n, final Object o) {
        return (lqh)new lqf(Integer.valueOf(n), o, lqi.b);
    }
    
    public abstract lqi a();
    
    public abstract Integer b();
    
    public abstract Object c();
}
