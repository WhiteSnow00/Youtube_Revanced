import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brm extends IOException
{
    public brm(final Throwable t) {
        final String simpleName = t.getClass().getSimpleName();
        final String message = t.getMessage();
        final StringBuilder sb = new StringBuilder("Unexpected ");
        sb.append(simpleName);
        sb.append(": ");
        sb.append(message);
        super(sb.toString(), t);
    }
}
