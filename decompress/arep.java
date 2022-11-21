import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arep
{
    private static final Class a;
    private final Object b;
    
    static {
        final boolean a2 = areq.a();
        Class<?> forName;
        final Class<?> clazz = forName = null;
        if (a2) {
            try {
                forName = Class.forName("android.view.DisplayCutout");
            }
            catch (final Exception ex) {
                Log.e("AndroidPCompat", "Failed to obtain DisplayCutout API.");
                forName = clazz;
            }
        }
        a = forName;
    }
    
    public arep(final Object b) {
        this.b = b;
    }
    
    static arep e(final Object o) {
        if (o == null) {
            return null;
        }
        if (arep.a == null) {
            return null;
        }
        return new arep(o);
    }
    
    private final int f(final String s) {
        try {
            return (int)arep.a.getDeclaredMethod(s, (Class[])new Class[0]).invoke(this.b, new Object[0]);
        }
        catch (final Exception ex) {
            return 0;
        }
    }
    
    public final int a() {
        return this.f("getSafeInsetBottom");
    }
    
    public final int b() {
        return this.f("getSafeInsetLeft");
    }
    
    public final int c() {
        return this.f("getSafeInsetRight");
    }
    
    public final int d() {
        return this.f("getSafeInsetTop");
    }
}
