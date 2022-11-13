// 
// Decompiled by Procyon v0.6.0
// 

public final class cec
{
    public static final cec a;
    public static final cec b;
    public static final cec c;
    public static final cec d;
    public static final cec e;
    public static final cec f;
    final float[] g;
    final float[] h;
    final float[] i;
    final boolean j;
    
    static {
        final cec a2 = new cec();
        e(a = a2);
        h(a2);
        final cec b2 = new cec();
        g(b = b2);
        h(b2);
        final cec c2 = new cec();
        d(c = c2);
        h(c2);
        final cec d2 = new cec();
        e(d = d2);
        f(d2);
        final cec e2 = new cec();
        g(e = e2);
        f(e2);
        final cec f2 = new cec();
        d(f = f2);
        f(f2);
    }
    
    public cec() {
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
    
    private static void d(final cec cec) {
        final float[] h = cec.h;
        h[1] = 0.26f;
        h[2] = 0.45f;
    }
    
    private static void e(final cec cec) {
        final float[] h = cec.h;
        h[0] = 0.55f;
        h[1] = 0.74f;
    }
    
    private static void f(final cec cec) {
        final float[] g = cec.g;
        g[1] = 0.3f;
        g[2] = 0.4f;
    }
    
    private static void g(final cec cec) {
        final float[] h = cec.h;
        h[0] = 0.3f;
        h[1] = 0.5f;
        h[2] = 0.7f;
    }
    
    private static void h(final cec cec) {
        final float[] g = cec.g;
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
