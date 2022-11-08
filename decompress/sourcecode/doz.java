// 
// Decompiled by Procyon v0.6.0
// 

public final class doz implements dpa
{
    final /* synthetic */ dpa a;
    private volatile Object b;
    
    public doz(final dpa a) {
        this.a = a;
    }
    
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    final Object a = this.a.a();
                    cll.h(a);
                    this.b = a;
                }
            }
        }
        return this.b;
    }
}
