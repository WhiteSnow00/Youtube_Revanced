import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adma extends IOException
{
    public final apkh a;
    
    public adma(final apkh a) {
        final int ad = a.aD;
        final StringBuilder sb = new StringBuilder("OpenSourceVideoIOException: ");
        sb.append(ad);
        super(sb.toString());
        this.a = a;
    }
    
    public adma(final Throwable t, final apkh a) {
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
