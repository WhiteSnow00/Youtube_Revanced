// 
// Decompiled by Procyon v0.6.0
// 

public final class gfm implements gft
{
    final Object a;
    private final int b;
    
    public gfm(final gfq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gfm(final gfq a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public gfm(final hrh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final alog alog, final aloa aloa) {
        final int b = this.b;
        if (b == 0) {
            if (((gfq)this.a).b.isPresent() && alog == ((gfq)this.a).b.get()) {
                ((gfq)this.a).j(alog, (ahbb)((ahbh)aloa).toBuilder());
            }
            return;
        }
        if (b != 1) {
            final hrh hrh = (hrh)this.a;
            hrh.a.i((ahbb)((ahbh)hzn.v(hrh.d, alog)).toBuilder());
            return;
        }
        final gfq gfq = (gfq)this.a;
        if (gfq.a && !gfq.g(aloa)) {
            gfq.j(alog, (ahbb)((ahbh)aloa).toBuilder());
        }
    }
}
