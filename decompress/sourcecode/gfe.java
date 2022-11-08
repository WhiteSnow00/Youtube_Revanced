// 
// Decompiled by Procyon v0.6.0
// 

public final class gfe implements gfl
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public gfe(final gfi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final almd almd, final allx allx) {
        final int b = this.b;
        if (b == 0) {
            if (((gfi)this.a).b.isPresent() && almd == ((gfi)this.a).b.get()) {
                ((gfi)this.a).j(almd, (agzc)((agzi)allx).toBuilder());
            }
            return;
        }
        if (b != 1) {
            final hqn hqn = (hqn)this.a;
            hqn.a.i((agzc)((agzi)hyr.v(hqn.d, almd)).toBuilder());
            return;
        }
        final gfi gfi = (gfi)this.a;
        if (gfi.a && !gfi.g(allx)) {
            gfi.j(almd, (agzc)((agzi)allx).toBuilder());
        }
    }
}
