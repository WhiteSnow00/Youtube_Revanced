// 
// Decompiled by Procyon v0.6.0
// 

public final class adjc implements adje
{
    private final atke a;
    private boolean b;
    
    public adjc(final atke a) {
        this.b = false;
        this.a = a;
    }
    
    private final aknt e(final aoqk c) {
        adkp.Q(this.b);
        final ahaz builder = ((ahbh)aoqj.a).createBuilder();
        builder.copyOnWrite();
        final aoqj aoqj = (aoqj)builder.instance;
        c.getClass();
        aoqj.c = c;
        aoqj.b |= 0x1;
        final aoqj aoqj2 = (aoqj)builder.build();
        final aknr d = aknt.d();
        ((ahaz)d).copyOnWrite();
        aknt.cf((aknt)d.instance, aoqj2);
        return (aknt)((ahaz)d).build();
    }
    
    @Override
    public final void a(final aora aora) {
        if (aora != null && (aora.b & 0x40) != 0x0) {
            aoqu aoqu;
            if ((aoqu = aora.f) == null) {
                aoqu = aoqu.a;
            }
            this.b = aoqu.b;
        }
    }
    
    @Override
    public final boolean b() {
        return this.b;
    }
    
    @Override
    public final void c(final aoqk aoqk) {
        ((wxx)this.a.a()).d(this.e(aoqk));
    }
    
    @Override
    public final void d(final aoqk aoqk) {
        try {
            ((wxx)this.a.a()).h(this.e(aoqk));
        }
        catch (final Exception ex) {
            ttr.b("UncaughtException error occurred in critical transmission path.");
        }
    }
}
