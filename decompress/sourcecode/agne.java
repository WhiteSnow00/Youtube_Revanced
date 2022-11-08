// 
// Decompiled by Procyon v0.6.0
// 

public enum agne implements agzm
{
    a("DATA_USAGE_NOTICE_TYPE_UNSPECIFIED", 0, 0), 
    b("DATA_USAGE_NOTICE_TYPE_LINKING_INFO", 1, 1), 
    c("DATA_USAGE_NOTICE_TYPE_CAPABILITY_CONSENT", 2, 2), 
    d("DATA_USAGE_NOTICE_TYPE_LINKING_INFO_WITH_CONSENT", 3, 3), 
    e("UNRECOGNIZED", 4, -1);
    
    private final int g;
    
    private agne(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static agne a(final int n) {
        if (n == 0) {
            return agne.a;
        }
        if (n == 1) {
            return agne.b;
        }
        if (n == 2) {
            return agne.c;
        }
        if (n != 3) {
            return null;
        }
        return agne.d;
    }
    
    public final int getNumber() {
        if (this != agne.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}
