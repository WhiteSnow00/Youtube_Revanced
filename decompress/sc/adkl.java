import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkl extends IOException
{
    public final aphv a;
    
    public adkl(final aphv a) {
        final int ad = a.aD;
        final StringBuilder sb = new StringBuilder("OpenSourceVideoIOException: ");
        sb.append(ad);
        super(sb.toString());
        this.a = a;
    }
    
    public adkl(final Throwable t, final aphv a) {
        final int ad = a.aD;
        final String message = t.getMessage();
        final StringBuilder sb = new StringBuilder("OpenSourceVideoIOException: ");
        sb.append(ad);
        sb.append("\n");
        sb.append(message);
        super(sb.toString(), t);
        this.a = a;
    }
}
