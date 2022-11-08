// 
// Decompiled by Procyon v0.6.0
// 

public final class acby
{
    public int a;
    public float b;
    public acbx c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public float l;
    public boolean m;
    public short n;
    private boolean o;
    
    public final acbz a() {
        if (this.n != 8191) {
            final StringBuilder sb = new StringBuilder();
            if ((this.n & 0x1) == 0x0) {
                sb.append(" lithoInitRange");
            }
            if ((this.n & 0x2) == 0x0) {
                sb.append(" lithoRangeRatio");
            }
            if ((this.n & 0x4) == 0x0) {
                sb.append(" useIncrementalMountForRb");
            }
            if ((this.n & 0x8) == 0x0) {
                sb.append(" useLegacyVisible");
            }
            if ((this.n & 0x10) == 0x0) {
                sb.append(" horizontalCollectionTouchInterceptor");
            }
            if ((this.n & 0x20) == 0x0) {
                sb.append(" useSwipeToCameraLocalElementsConfig");
            }
            if ((this.n & 0x40) == 0x0) {
                sb.append(" useSizeSpecYouTubeElement");
            }
            if ((this.n & 0x80) == 0x0) {
                sb.append(" useAsyncPresenterPreparation");
            }
            if ((this.n & 0x100) == 0x0) {
                sb.append(" rebindAfterDetach");
            }
            if ((this.n & 0x200) == 0x0) {
                sb.append(" asyncPrepareInitRange");
            }
            if ((this.n & 0x400) == 0x0) {
                sb.append(" asyncPrepareRangeRatio");
            }
            if ((this.n & 0x800) == 0x0) {
                sb.append(" useIncrementalMountForAsyncPrepare");
            }
            if ((this.n & 0x1000) == 0x0) {
                sb.append(" useFlatbufferRuntime");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new acbz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.o);
    }
    
    public final void b(final boolean o) {
        this.o = o;
        this.n |= 0x1000;
    }
}
