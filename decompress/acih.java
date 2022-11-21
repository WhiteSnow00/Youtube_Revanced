import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acih extends Exception
{
    public final String a;
    private final String b;
    
    public acih(final Throwable t, final Uri uri, final String a) {
        String string;
        if (uri == null) {
            string = "NONE";
        }
        else {
            string = uri.toString();
        }
        this.b = string;
        this.a = a;
        this.initCause(t);
    }
    
    @Override
    public final String getMessage() {
        return "Error loading url: ".concat(String.valueOf(this.b));
    }
}
