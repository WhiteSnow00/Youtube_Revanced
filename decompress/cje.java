import android.os.Build$VERSION;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

final class cje
{
    private static boolean a = true;
    
    static void a(final ViewGroup viewGroup, final boolean b) {
        if (Build$VERSION.SDK_INT >= 29) {
            cjd.b(viewGroup, b);
            return;
        }
        b(viewGroup, b);
    }
    
    private static void b(final ViewGroup viewGroup, final boolean b) {
        if (cje.a) {
            try {
                cjd.b(viewGroup, b);
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                cje.a = false;
            }
        }
    }
}
