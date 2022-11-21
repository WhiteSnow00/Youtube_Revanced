import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atsy extends atte
{
    public final atsj a;
    
    public atsy(final atov atov, final Throwable t, final boolean b) {
        Throwable t2 = t;
        if (t == null) {
            final StringBuilder sb = new StringBuilder("Continuation ");
            sb.append(atov);
            sb.append(" was cancelled normally");
            t2 = new CancellationException(sb.toString());
        }
        super(t2, b);
        this.a = auop.h(false);
    }
}
