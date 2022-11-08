// 
// Decompiled by Procyon v0.6.0
// 

public final class fet extends wyy
{
    protected fet(final wzd wzd) {
        super("browse", wzd);
    }
    
    protected final boolean a(final tdc tdc) {
        final boolean a = super.a(tdc);
        if (a && tdc.getClass() != fhh.class) {
            this.f("abandoned_browse");
            return true;
        }
        return a;
    }
}
