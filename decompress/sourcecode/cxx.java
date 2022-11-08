import java.io.IOException;
import java.net.HttpURLConnection;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxx implements Closeable
{
    public final HttpURLConnection a;
    
    public cxx(final HttpURLConnection a) {
        this.a = a;
    }
    
    public final boolean a() {
        boolean b = false;
        try {
            if (this.a.getResponseCode() / 100 == 2) {
                b = true;
            }
            return b;
        }
        catch (final IOException ex) {
            return b;
        }
    }
    
    @Override
    public final void close() {
        this.a.disconnect();
    }
}
