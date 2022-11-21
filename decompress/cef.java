// 
// Decompiled by Procyon v0.6.0
// 

public final class cef
{
    public static final cef a;
    public static final cef b;
    public static final cef c;
    public static final cef d;
    public static final cef e;
    public static final cef f;
    final float[] g;
    final float[] h;
    final float[] i;
    final boolean j;
    
    static {
        final cef a2 = new cef();
        e(a = a2);
        h(a2);
        final cef b2 = new cef();
        g(b = b2);
        h(b2);
        final cef c2 = new cef();
        d(c = c2);
        h(c2);
        final cef d2 = new cef();
        e(d = d2);
        f(d2);
        final cef e2 = new cef();
        g(e = e2);
        f(e2);
        final cef f2 = new cef();
        d(f = f2);
        f(f2);
    }
    
    public cef() {
        final float[] g = new float[3];
        this.g = g;
        final float[] h = new float[3];
        this.h = h;
        final float[] i = new float[3];
        this.i = i;
        this.j = true;
        i(g);
        i(h);
        i[0] = 0.24f;
        i[1] = 0.52f;
        i[2] = 0.24f;
    }
    
    private static void d(final cef cef) {
        final float[] h = cef.h;
        h[1] = 0.26f;
        h[2] = 0.45f;
    }
    
    private static void e(final cef cef) {
        final float[] h = cef.h;
        h[0] = 0.55f;
        h[1] = 0.74f;
    }
    
    private static void f(final cef cef) {
        final float[] g = cef.g;
        g[1] = 0.3f;
        g[2] = 0.4f;
    }
    
    private static void g(final cef cef) {
        final float[] h = cef.h;
        h[0] = 0.3f;
        h[1] = 0.5f;
        h[2] = 0.7f;
    }
    
    private static void h(final cef cef) {
        final float[] g = cef.g;
        g[0] = 0.35f;
        g[1] = 1.0f;
    }
    
    private static void i(final float[] array) {
        array[0] = 0.0f;
        array[1] = 0.5f;
        array[2] = 1.0f;
    }
    
    public final float a() {
        return this.i[1];
    }
    
    public final float b() {
        return this.i[2];
    }
    
    public final float c() {
        return this.i[0];
    }
}
