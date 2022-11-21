// 
// Decompiled by Procyon v0.6.0
// 

public final class aarq extends aarh
{
    final int i;
    private final atnb j;
    private aavh k;
    private boolean m;
    private float[] n;
    
    public aarq(final aave aave, final aavf aavf, final float[] array, final atnb j) {
        super(aave, aavf, j);
        this.n = null;
        final int f = aave.f;
        this.i = f;
        final StringBuilder sb = new StringBuilder("Incorrect number of colors in color vertex array ");
        final int n = array.length >> 2;
        sb.append(n);
        sb.append(" doesn't match vertex count ");
        sb.append(f);
        adme.L(n == f, sb.toString());
        this.j = j;
        this.k = new aavh(array, 4);
    }
    
    public static float[] h(final int n) {
        final float n2 = (n >> 16 & 0xFF) / 255.0f;
        final float n3 = (n >> 8 & 0xFF) / 255.0f;
        final float n4 = (n & 0xFF) / 255.0f;
        int n5 = n >> 24 & 0x7F;
        if (n < 0) {
            n5 += 128;
        }
        return new float[] { n2, n3, n4, n5 / 255.0f };
    }
    
    public static float[] s(final float[] array, int i) {
        final int n = i * 4;
        final float[] array2 = new float[n];
        for (i = 0; i < n; i += 4) {
            array2[i] = array[0];
            array2[i + 1] = array[1];
            array2[i + 2] = array[2];
            array2[i + 3] = array[3];
        }
        return array2;
    }
    
    public final void g(final int n) {
        this.n = s(h(n), this.i);
    }
    
    protected final boolean l() {
        return this.m || super.c < 0.99f;
    }
    
    public final void m() {
        if (this.n != null) {
            this.k.b();
            this.k = new aavh(this.n, 4);
            this.n = null;
        }
        this.k.a(((aaxe)this.j.a()).b);
    }
    
    public final void rQ() {
        super.rQ();
        this.k.b();
    }
    
    public final void t() {
        this.m = true;
    }
}
