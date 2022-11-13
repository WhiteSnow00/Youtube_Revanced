import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebm extends dst
{
    @dyi(a = 0)
    @dyj(a = dyk.i)
    public float a;
    @dyi(a = 0)
    @dyj(a = dyk.i)
    public float b;
    @dyi(a = 0)
    @dyj(a = dyk.i)
    public float c;
    @dyi(a = 3)
    @dyj(a = dyk.g)
    public int d;
    @dyi(a = 0)
    @dyj(a = dyk.h)
    public float e;
    @dyi(a = 3)
    @dyj(a = dyk.g)
    public int f;
    
    public ebm() {
        super("CardShadow");
        this.b = -1.0f;
        this.c = -1.0f;
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        return new ebn();
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        final ebn ebn = (ebn)o;
        final int f = this.f;
        final int d = this.d;
        final float a = this.a;
        final float e = this.e;
        final float b = this.b;
        final float c = this.c;
        if (ebn.a != f) {
            ebn.a = f;
            ebn.g = true;
            ebn.invalidateSelf();
        }
        if (ebn.b != d) {
            ebn.b = d;
            ebn.g = true;
            ebn.invalidateSelf();
        }
        final float c2 = ebn.c;
        final float c3 = (float)(int)(a + 0.5f);
        if (c2 != c3) {
            ebn.c = c3;
            ebn.g = true;
            ebn.invalidateSelf();
        }
        if (e < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        final int e2 = ebn.e(e);
        final float d2 = ebn.d;
        final float d3 = (float)e2;
        if (d2 != d3) {
            ebn.d = d3;
            ebn.g = true;
            ebn.invalidateSelf();
        }
        if (b != ebn.e) {
            ebn.e = b;
            ebn.g = true;
            ebn.invalidateSelf();
        }
        if (c == ebn.f) {
            return;
        }
        ebn.f = c;
        ebn.g = true;
        ebn.invalidateSelf();
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 2;
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst != null && this.getClass() == dst.getClass()) {
            final ebm ebm = (ebm)dst;
            return Float.compare(this.a, ebm.a) == 0 && Float.compare(this.b, ebm.b) == 0 && Float.compare(this.c, ebm.c) == 0 && this.d == ebm.d && Float.compare(this.e, ebm.e) == 0 && this.f == ebm.f;
        }
        return false;
    }
}
