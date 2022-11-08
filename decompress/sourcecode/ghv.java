// 
// Decompiled by Procyon v0.6.0
// 

public final class ghv implements shu
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public ghv(final fbv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ghv(final ghw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void l(final ryt v) {
        if (this.b != 0) {
            final Object a = this.a;
            final saz b = v.b();
            final fbv fbv = (fbv)a;
            fbv.a = b;
            final skm b2 = fbv.b;
            if (b2 != null) {
                ((skq)b2).a = fbv.a;
            }
            return;
        }
        if (!aeda.v(((ghw)this.a).v, v)) {
            final ghw ghw = (ghw)this.a;
            ghw.v = v;
            if (ghw.z && !ghw.y) {
                ghw.f();
            }
        }
    }
}
