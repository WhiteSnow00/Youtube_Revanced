import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczt implements adaj
{
    private final adah a;
    private final boolean b;
    
    public aczt(final adah a, final tov tov) {
        a.getClass();
        this.a = a;
        this.b = ((tov.e(tov.am) & 0x20L) != 0x0L);
    }
    
    @Override
    public final aczu a(final adaf adaf) {
        adaf.w = this.b;
        try {
            return this.a.c(adaf);
        }
        catch (final IOException ex) {
            acws.h("OnlineSuggestSource exception", (Throwable)ex);
            return aczu.a;
        }
    }
}
