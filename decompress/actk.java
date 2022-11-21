// 
// Decompiled by Procyon v0.6.0
// 

public final class actk extends actj
{
    public final amis k;
    public final boolean l;
    
    public actk(final String s, final amis k) {
        super(s);
        this.k = k;
        amix amix;
        if ((amix = k.d) == null) {
            amix = amix.a;
        }
        final int b = amix.b;
        boolean l = false;
        if ((b & 0x1000) != 0x0) {
            amix amix2;
            if ((amix2 = k.d) == null) {
                amix2 = amix.a;
            }
            l = l;
            if (amix2.i) {
                l = true;
            }
        }
        this.l = l;
    }
    
    public final boolean e() {
        return !this.l && super.b;
    }
    
    public final boolean h() {
        return true;
    }
}
