import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyg implements acyw
{
    private final acyu a;
    private final boolean b;
    
    public acyg(final acyu a, final tnu tnu) {
        a.getClass();
        this.a = a;
        this.b = ((tnu.e(tnu.am) & 0x20L) != 0x0L);
    }
    
    public final acyh a(final acys acys) {
        acys.w = this.b;
        try {
            return this.a.c(acys);
        }
        catch (final IOException ex) {
            acvg.n("OnlineSuggestSource exception", (Throwable)ex);
            return acyh.a;
        }
    }
}
