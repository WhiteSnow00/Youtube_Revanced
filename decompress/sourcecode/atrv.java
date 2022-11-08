// 
// Decompiled by Procyon v0.6.0
// 

public final class atrv
{
    public static final ThreadLocal a;
    
    static {
        a = new ThreadLocal();
    }
    
    public static final atqp a() {
        final ThreadLocal a = atrv.a;
        Object o;
        if ((o = a.get()) == null) {
            o = new atpa(Thread.currentThread());
            a.set(o);
        }
        return (atqp)o;
    }
}
