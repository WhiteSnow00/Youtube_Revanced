// 
// Decompiled by Procyon v0.6.0
// 

public enum ampn implements agzm
{
    a("SHORTS_EXPANDED_LAYOUT_TYPE_UNKNOWN", 0, 0), 
    b("SHORTS_EXPANDED_LAYOUT_TYPE_THUMBNAIL_END", 1, 1);
    
    private final int d;
    
    private ampn(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return amom.l;
    }
    
    public static ampn b(final int n) {
        if (n == 0) {
            return ampn.a;
        }
        if (n != 1) {
            return null;
        }
        return ampn.b;
    }
    
    @Override
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
