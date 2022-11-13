// 
// Decompiled by Procyon v0.6.0
// 

public final class ddo
{
    private static final ddn e;
    public final Object a;
    public final ddn b;
    public final String c;
    public volatile byte[] d;
    
    static {
        e = (ddn)new ddm();
    }
    
    private ddo(final String c, final Object a, final ddn b) {
        clm.j(c);
        this.c = c;
        this.a = a;
        clm.h((Object)b);
        this.b = b;
    }
    
    public static ddo a(final String s, final Object o, final ddn ddn) {
        return new ddo(s, o, ddn);
    }
    
    public static ddo b(final String s) {
        return new ddo(s, null, ddo.e);
    }
    
    public static ddo c(final String s, final Object o) {
        return new ddo(s, o, ddo.e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ddo && this.c.equals(((ddo)o).c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String c = this.c;
        final StringBuilder sb = new StringBuilder("Option{key='");
        sb.append(c);
        sb.append("'}");
        return sb.toString();
    }
}
