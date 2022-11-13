import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwq implements aqwn
{
    public final aqxa a(final String s, final String s2, final aqwo aqwo, final aqwl aqwl) {
        try {
            return (aqxa)new aqwp((HttpURLConnection)new URL(s).openConnection(), s2, aqwo, aqwl);
        }
        catch (final IOException ex) {
            throw new IllegalStateException("Http connection could not be created.", ex);
        }
        catch (final MalformedURLException ex2) {
            throw new IllegalArgumentException("Url is malformed.", ex2);
        }
    }
}
