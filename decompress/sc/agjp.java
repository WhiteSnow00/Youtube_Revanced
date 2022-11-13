// 
// Decompiled by Procyon v0.6.0
// 

public final class agjp implements aglh
{
    private static final Object a;
    private volatile Object b;
    private volatile aglh c;
    
    static {
        a = new Object();
    }
    
    public agjp(final aglh c) {
        this.b = agjp.a;
        this.c = c;
    }
    
    public final Object a() {
        final Object b = this.b;
        final Object a = agjp.a;
        final Object o = b;
        if (b == a) {
            synchronized (this) {
                if (this.b == a) {
                    this.b = this.c.a();
                    this.c = null;
                }
            }
        }
        return o;
    }
}
