// 
// Decompiled by Procyon v0.6.0
// 

public enum ajqz implements ahbl
{
    a("MANIFESTLESS_SEQUENCE_METHOD_UNKNOWN", 0, 0), 
    b("MANIFESTLESS_SEQUENCE_METHOD_LIVE_HEAD", 1, 1), 
    c("UNRECOGNIZED", 2, -1);
    
    private static final ajqz[] d;
    private final int e;
    
    private ajqz(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return ajqf.l;
    }
    
    public static ajqz b(final int n) {
        if (n == 0) {
            return ajqz.a;
        }
        if (n != 1) {
            return null;
        }
        return ajqz.b;
    }
    
    public final int getNumber() {
        if (this != ajqz.c) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
