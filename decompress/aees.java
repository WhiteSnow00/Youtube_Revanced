// 
// Decompiled by Procyon v0.6.0
// 

final class aees extends aeeo
{
    final aeex a;
    
    public aees(final aeex a) {
        this.a = a;
    }
    
    public final void a() {
        final aeex a = this.a;
        if (a.k != null) {
            a.a.unbindService(a.j);
            aeex.e(this.a);
            final aeex a2 = this.a;
            a2.k = null;
            a2.j = null;
        }
        this.a.b();
    }
}
