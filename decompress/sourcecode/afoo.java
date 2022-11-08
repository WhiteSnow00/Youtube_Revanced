// 
// Decompiled by Procyon v0.6.0
// 

public enum afoo implements agzm
{
    DISABLED("DISABLED", 1, 1);
    
    public static final int DISABLED_VALUE = 1;
    
    ENABLED_NO_FILTERING("ENABLED_NO_FILTERING", 2, 2);
    
    public static final int ENABLED_NO_FILTERING_VALUE = 2;
    
    ENABLED_WITH_MEDIAN_FILTER("ENABLED_WITH_MEDIAN_FILTER", 3, 3);
    
    public static final int ENABLED_WITH_MEDIAN_FILTER_VALUE = 3;
    
    UNKNOWN_ALIGNMENT("UNKNOWN_ALIGNMENT", 0, 0);
    
    public static final int UNKNOWN_ALIGNMENT_VALUE = 0;
    private static final agzn internalValueMap;
    public final int value;
    
    static {
        internalValueMap = (agzn)new afom(0);
    }
    
    private afoo(final String s, final int n, final int value) {
        this.value = value;
    }
    
    public static afoo a(final int n) {
        if (n == 0) {
            return afoo.UNKNOWN_ALIGNMENT;
        }
        if (n == 1) {
            return afoo.DISABLED;
        }
        if (n == 2) {
            return afoo.ENABLED_NO_FILTERING;
        }
        if (n != 3) {
            return null;
        }
        return afoo.ENABLED_WITH_MEDIAN_FILTER;
    }
    
    public static agzo b() {
        return afon.INSTANCE;
    }
    
    public final int getNumber() {
        return this.value;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.value);
    }
}
