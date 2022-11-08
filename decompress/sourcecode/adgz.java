// 
// Decompiled by Procyon v0.6.0
// 

public final class adgz implements adhb
{
    private final atjj a;
    private boolean b;
    
    public adgz(final atjj a) {
        this.b = false;
        this.a = a;
    }
    
    private final aklq e(final aooh c) {
        agot.D(this.b);
        final agza builder = ((agzi)aoog.a).createBuilder();
        builder.copyOnWrite();
        final aoog aoog = (aoog)builder.instance;
        c.getClass();
        aoog.c = c;
        aoog.b |= 0x1;
        final aoog aoog2 = (aoog)builder.build();
        final aklo d = aklq.d();
        ((agza)d).copyOnWrite();
        aklq.ce((aklq)d.instance, aoog2);
        return (aklq)((agza)d).build();
    }
    
    public final void a(final aoox aoox) {
        if (aoox != null && (aoox.b & 0x40) != 0x0) {
            aoor aoor;
            if ((aoor = aoox.f) == null) {
                aoor = aoor.a;
            }
            this.b = aoor.b;
        }
    }
    
    public final boolean b() {
        return this.b;
    }
    
    public final void c(final aooh aooh) {
        ((wvu)this.a.a()).d(this.e(aooh));
    }
    
    public final void d(final aooh aooh) {
        try {
            ((wvu)this.a.a()).h(this.e(aooh));
        }
        catch (final Exception ex) {
            trn.b("UncaughtException error occurred in critical transmission path.");
        }
    }
}
