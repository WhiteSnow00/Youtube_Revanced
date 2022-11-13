// 
// Decompiled by Procyon v0.6.0
// 

public enum agpd implements ahbl
{
    a("DATA_USAGE_NOTICE_TYPE_UNSPECIFIED", 0, 0), 
    b("DATA_USAGE_NOTICE_TYPE_LINKING_INFO", 1, 1), 
    c("DATA_USAGE_NOTICE_TYPE_CAPABILITY_CONSENT", 2, 2), 
    d("DATA_USAGE_NOTICE_TYPE_LINKING_INFO_WITH_CONSENT", 3, 3), 
    e("UNRECOGNIZED", 4, -1);
    
    private static final agpd[] f;
    private final int g;
    
    private agpd(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static agpd a(final int n) {
        if (n == 0) {
            return agpd.a;
        }
        if (n == 1) {
            return agpd.b;
        }
        if (n == 2) {
            return agpd.c;
        }
        if (n != 3) {
            return null;
        }
        return agpd.d;
    }
    
    public final int getNumber() {
        if (this != agpd.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
