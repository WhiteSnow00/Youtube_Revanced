// 
// Decompiled by Procyon v0.6.0
// 

final class aeme implements aelx
{
    private final aelx a;
    private aemp b;
    
    public aeme(final aelx a) {
        this.b = null;
        this.a = a;
    }
    
    public final void a(final Throwable t) {
        qcj.s();
        final aemp b = this.b;
        final aemp d = aemp.d(t);
        this.b = d;
        if (!d.equals(b)) {
            this.a.a(t);
        }
    }
    
    public final void b(final Object o) {
        qcj.s();
        final aemp b = this.b;
        final aemp e = aemp.e(o);
        this.b = e;
        if (!e.equals(b)) {
            final aaw aaw = (aaw)o;
        }
    }
}
