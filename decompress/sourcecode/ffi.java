// 
// Decompiled by Procyon v0.6.0
// 

public final class ffi extends wyy
{
    protected ffi(final wzd wzd) {
        super("inline_playback", wzd);
    }
    
    protected final boolean a(final tdc tdc) {
        final boolean a = super.a(tdc);
        if (a && tdc.getClass() != aakw.class) {
            this.f("abandoned_inline_playback");
            return true;
        }
        return a;
    }
}
