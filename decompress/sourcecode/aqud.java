import java.net.MalformedURLException;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqud implements aqua
{
    public final aqum a(final String s, final String s2, final aqub aqub, final aqty aqty) {
        try {
            return (aqum)new aquc((HttpURLConnection)new URL(s).openConnection(), s2, aqub, aqty);
        }
        catch (final IOException ex) {
            throw new IllegalStateException("Http connection could not be created.", ex);
        }
        catch (final MalformedURLException ex2) {
            throw new IllegalArgumentException("Url is malformed.", ex2);
        }
    }
}
