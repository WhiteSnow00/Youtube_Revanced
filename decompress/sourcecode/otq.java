// 
// Decompiled by Procyon v0.6.0
// 

public final class otq
{
    public int a;
    public float b;
    public byte c;
    private float d;
    private boolean e;
    
    public otq() {
    }
    
    public otq(final otr otr) {
        this.a = otr.a;
        this.d = otr.b;
        this.b = otr.c;
        this.e = otr.d;
        this.c = 63;
    }
    
    public final otr a() {
        if (this.c != 63) {
            final StringBuilder sb = new StringBuilder();
            if ((this.c & 0x1) == 0x0) {
                sb.append(" initRangeSize");
            }
            if ((this.c & 0x2) == 0x0) {
                sb.append(" collectionRangeRatio");
            }
            if ((this.c & 0x4) == 0x0) {
                sb.append(" binderRangeRatio");
            }
            if ((this.c & 0x8) == 0x0) {
                sb.append(" recyclerViewItemPrefetch");
            }
            if ((this.c & 0x10) == 0x0) {
                sb.append(" useLegacyVisible");
            }
            if ((this.c & 0x20) == 0x0) {
                sb.append(" cleanupOnDetach");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new otr(this.a, this.d, this.b, this.e);
    }
    
    public final void b(final float d) {
        this.d = d;
        this.c |= 0x2;
    }
    
    public final void c(final boolean e) {
        this.e = e;
        this.c |= 0x10;
    }
}
