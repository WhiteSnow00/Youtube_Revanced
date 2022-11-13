import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efu implements efw
{
    public static void c(int n, final String s, final String s2, final Throwable t) {
        if (--n == 0) {
            Log.w("RenderCore:".concat(s), s2, t);
            return;
        }
        if (n == 1) {
            Log.e("RenderCore:".concat(s), s2, t);
            return;
        }
        Log.e("RenderCore:".concat(s), s2, t);
        throw new RuntimeException(s2);
    }
    
    public final void a(final int n, final String s, final String s2) {
        c(n, s, s2, null);
    }
    
    public final void b(final int n, final String s, final String s2) {
        c(n, s, s2, null);
    }
    
    public final void d(final String s, final Throwable t) {
        c(2, "LITHO:NPE:UNSET_PADDING", s, t);
    }
    
    public final void e(final int n, final String s) {
        c(n, "TextureTooBig", s, null);
    }
}
