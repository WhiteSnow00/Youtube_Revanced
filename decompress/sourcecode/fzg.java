// 
// Decompiled by Procyon v0.6.0
// 

public final class fzg
{
    public int a;
    private float b;
    private float c;
    private byte d;
    
    public final fzh a() {
        if (this.d == 3) {
            final int a = this.a;
            if (a != 0) {
                return new fzh(a, this.b, this.c);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" collapseMode");
        }
        if ((this.d & 0x1) == 0x0) {
            sb.append(" fadeOffsetPercentStart");
        }
        if ((this.d & 0x2) == 0x0) {
            sb.append(" fadeOffsetPercentEnd");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final float c) {
        this.c = c;
        this.d |= 0x2;
    }
    
    public final void c(final float b) {
        this.b = b;
        this.d |= 0x1;
    }
}
