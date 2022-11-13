import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbt
{
    private static final Class a;
    private final Object b;
    
    static {
        final boolean e = arbu.e();
        Class<?> forName;
        final Class<?> clazz = forName = null;
        if (e) {
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
    
    public arbt(final Object b) {
        this.b = b;
    }
    
    static arbt e(final Object o) {
        if (o == null) {
            return null;
        }
        if (arbt.a == null) {
            return null;
        }
        return new arbt(o);
    }
    
    private final int f(final String s) {
        try {
            return (int)arbt.a.getDeclaredMethod(s, (Class[])new Class[0]).invoke(this.b, new Object[0]);
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
