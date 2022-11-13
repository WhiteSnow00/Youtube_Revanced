import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsp extends bdx
{
    private final bdc d;
    private final bas e;
    private long f;
    private bev g;
    
    public bsp() {
        super(6);
        this.d = new bdc(1);
        this.e = new bas();
    }
    
    protected final void C(final ayg[] array, final long n, final long n2) {
    }
    
    public final void R(final long n, final long n2) {
        while (!this.K() && this.f < 100000L + n) {
            ((bcw)this.d).clear();
            final bxc q = this.Q();
            final bdc d = this.d;
            int i = 0;
            if (this.P(q, d, 0) != -4) {
                break;
            }
            final bdc d2 = this.d;
            if (((bcw)d2).isEndOfStream()) {
                break;
            }
            this.f = d2.e;
            if (this.g == null || ((bcw)d2).isDecodeOnly()) {
                continue;
            }
            d2.c();
            final ByteBuffer c = this.d.c;
            final int a = bax.a;
            if (c.remaining() != 16) {
                continue;
            }
            this.e.E(c.array(), c.limit());
            this.e.G(c.arrayOffset() + 4);
            final float[] array = new float[3];
            while (i < 3) {
                array[i] = Float.intBitsToFloat(this.e.e());
                ++i;
            }
        }
    }
    
    public final boolean S() {
        return this.K();
    }
    
    public final boolean T() {
        return true;
    }
    
    public final int a(final ayg ayg) {
        int n;
        if ("application/x-camera-motion".equals(ayg.n)) {
            n = 4;
        }
        else {
            n = 0;
        }
        return ber.b(n);
    }
    
    public final String d() {
        return "CameraMotionRenderer";
    }
    
    public final void t(final int n, final Object o) {
        if (n == 8) {
            this.g = (bev)o;
        }
    }
    
    protected final void w() {
    }
    
    protected final void y(final long n, final boolean b) {
        this.f = Long.MIN_VALUE;
    }
}
