import java.util.Locale;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dts
{
    public final long a;
    
    static {
        new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault());
    }
    
    public dts(final long n, final long a) {
        this.a = a;
        String.format("%d%d", a, n);
    }
}
