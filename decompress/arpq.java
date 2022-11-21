// 
// Decompiled by Procyon v0.6.0
// 

public final class arpq implements qip
{
    public static final arpq a;
    public static final arpq b;
    public static final arpq c;
    private final int d;
    
    static {
        c = new arpq(2);
        b = new arpq(1);
        a = new arpq(0);
    }
    
    private arpq(final int d) {
        this.d = d;
    }
    
    public final Object a(final byte[] array) {
        final int d = this.d;
        if (d == 0) {
            return ahcz.parseFrom((ahcz)ahho.a, array);
        }
        if (d != 1) {
            return ahcz.parseFrom((ahcz)ahho.a, array);
        }
        return ahcz.parseFrom(arik.a, array);
    }
}
