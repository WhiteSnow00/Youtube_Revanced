// 
// Decompiled by Procyon v0.6.0
// 

public final class agho implements agjg
{
    private static final Object a;
    private volatile Object b;
    private volatile agjg c;
    
    static {
        a = new Object();
    }
    
    public agho(final agjg c) {
        this.b = agho.a;
        this.c = c;
    }
    
    public final Object a() {
        final Object b = this.b;
        final Object a = agho.a;
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
