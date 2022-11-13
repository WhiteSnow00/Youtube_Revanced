// 
// Decompiled by Procyon v0.6.0
// 

public final class gxs
{
    public static void a(final bu bu, final int navigationBarColor) {
        if (bu != null) {
            bu.getWindow().setNavigationBarColor(navigationBarColor);
        }
    }
    
    public static void b(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
}
