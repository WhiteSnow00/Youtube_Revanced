// 
// Decompiled by Procyon v0.6.0
// 

final class dga implements ddw
{
    final /* synthetic */ dgb a;
    final /* synthetic */ alm b;
    
    public dga(final dgb a, final alm b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Object c) {
        if (this.a.e(this.b)) {
            final dgb a = this.a;
            final alm b = this.b;
            final dfh o = a.a.o;
            if (c != null && o.c(((ddx)b.b).g())) {
                a.c = c;
                ((dfc)a.b).e(2);
                return;
            }
            final dey b2 = a.b;
            final Object a2 = b.a;
            final Object b3 = b.b;
            b2.d((ddj)a2, c, (ddx)b3, ((ddx)b3).g(), (ddj)a.d);
        }
    }
    
    public final void e(final Exception ex) {
        if (this.a.e(this.b)) {
            final dgb a = this.a;
            final alm b = this.b;
            final dey b2 = a.b;
            final dex d = a.d;
            final Object b3 = b.b;
            b2.b((ddj)d, ex, (ddx)b3, ((ddx)b3).g());
        }
    }
}
