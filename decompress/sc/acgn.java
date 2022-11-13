// 
// Decompiled by Procyon v0.6.0
// 

public final class acgn
{
    public boolean a;
    public boolean b;
    public acgq c;
    public acgu d;
    public byte e;
    public int f;
    public int g;
    private boolean h;
    private int i;
    
    public acgn() {
    }
    
    public acgn(final acgo acgo) {
        this.h = acgo.c;
        this.f = acgo.i;
        this.i = acgo.d;
        this.a = acgo.e;
        this.b = acgo.f;
        this.g = acgo.j;
        this.c = acgo.g;
        this.d = acgo.h;
        this.e = 15;
    }
    
    public final acgo a() {
        if (this.e == 15 && this.f != 0 && this.g != 0) {
            return new acgo(this.h, this.f, this.i, this.a, this.b, this.g, this.c, this.d);
        }
        final StringBuilder sb = new StringBuilder();
        if ((this.e & 0x1) == 0x0) {
            sb.append(" shouldUpdateOnLayoutChange");
        }
        if (this.f == 0) {
            sb.append(" animation");
        }
        if ((this.e & 0x2) == 0x0) {
            sb.append(" placeholderResId");
        }
        if ((this.e & 0x4) == 0x0) {
            sb.append(" cleanUpDrawableWhenLoading");
        }
        if ((this.e & 0x8) == 0x0) {
            sb.append(" waitLayoutRequest");
        }
        if (this.g == 0) {
            sb.append(" retrieveFromCacheOption");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final int i) {
        this.i = i;
        this.e |= 0x2;
    }
    
    public final void c(final boolean h) {
        this.h = h;
        this.e |= 0x1;
    }
}
