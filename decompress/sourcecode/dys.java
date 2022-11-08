// 
// Decompiled by Procyon v0.6.0
// 

final class dys extends dyl
{
    final /* synthetic */ dyt b;
    
    public dys(final dyt b) {
        this.b = b;
    }
    
    @Override
    public final void c(final long e) {
        final dyt b = this.b;
        b.d = false;
        if (b.c) {
            if (b.e != e) {
                b.f.i(e);
                b.e = e;
            }
            if (b.c) {
                b.a();
            }
        }
    }
}
