import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myp
{
    public static final lzh a;
    public static final kgk b;
    public static final kgk c;
    
    static {
        a = new lzh("Help.API", b = (kgk)new myo(), c = new kgk(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static mzf a(final Activity activity) {
        return new mzf(activity);
    }
    
    public static mzf b(final Context context) {
        return new mzf(context);
    }
}
