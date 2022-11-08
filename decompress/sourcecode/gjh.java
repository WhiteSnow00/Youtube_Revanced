// 
// Decompiled by Procyon v0.6.0
// 

public final class gjh
{
    public float a;
    public float b;
    public byte c;
    private float d;
    
    public final gji a() {
        if (this.c != 7) {
            final StringBuilder sb = new StringBuilder();
            if ((this.c & 0x1) == 0x0) {
                sb.append(" postSelectionVisibilityPercentBoost");
            }
            if ((this.c & 0x2) == 0x0) {
                sb.append(" firstItemVisibilityPercentBoost");
            }
            if ((this.c & 0x4) == 0x0) {
                sb.append(" deltaThreshold");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new gji(this.d, this.a, this.b);
    }
    
    public final void b(final float d) {
        this.d = d;
        this.c |= 0x1;
    }
}
