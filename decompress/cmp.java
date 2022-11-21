import java.util.List;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cmp
{
    private static final String a;
    
    static {
        a = cmv.b("InputMerger");
    }
    
    public static cmp b(String value) {
        try {
            return (cmp)Class.forName(value).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            value = String.valueOf(value);
            cmv.a();
            Log.e(cmp.a, "Trouble instantiating + ".concat(value), (Throwable)ex);
            return null;
        }
    }
    
    public abstract cml a(final List p0);
}
