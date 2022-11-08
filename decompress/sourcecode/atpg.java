import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atpg extends atpm
{
    public final ator a;
    
    public atpg(final atld atld, final Throwable t, final boolean b) {
        Throwable t2 = t;
        if (t == null) {
            final StringBuilder sb = new StringBuilder("Continuation ");
            sb.append(atld);
            sb.append(" was cancelled normally");
            t2 = new CancellationException(sb.toString());
        }
        super(t2, b);
        this.a = auet.f(false);
    }
}
