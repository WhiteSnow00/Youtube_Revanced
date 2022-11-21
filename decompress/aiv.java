import android.net.Uri;
import android.graphics.drawable.Icon;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiv
{
    public static int a(final Object o) {
        return ((Icon)o).getResId();
    }
    
    public static int b(final Object o) {
        return ((Icon)o).getType();
    }
    
    static Uri c(final Object o) {
        return ((Icon)o).getUri();
    }
    
    static String d(final Object o) {
        return ((Icon)o).getResPackage();
    }
}
