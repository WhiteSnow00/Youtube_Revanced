import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwe implements acwu
{
    private final acws a;
    private final boolean b;
    
    public acwe(final acws a, final tlq tlq) {
        a.getClass();
        this.a = a;
        this.b = ((tlq.e(tlq.am) & 0x20L) != 0x0L);
    }
    
    @Override
    public final acwf a(final acwq acwq) {
        acwq.w = this.b;
        try {
            return this.a.c(acwq);
        }
        catch (final IOException ex) {
            adbp.k("OnlineSuggestSource exception", ex);
            return acwf.a;
        }
    }
}
