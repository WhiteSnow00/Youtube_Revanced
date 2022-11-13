// 
// Decompiled by Procyon v0.6.0
// 

public enum ajtv implements ahbl
{
    a("FLOW_STATE_PASSING_SPEC_UNSPECIFIED", 0, 0), 
    b("FLOW_STATE_PASSING_SPEC_DONT_PASS", 1, 1), 
    c("FLOW_STATE_PASSING_SPEC_FULL_STATE", 2, 2);
    
    private static final ajtv[] d;
    private final int e;
    
    private ajtv(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahbn a() {
        return ajty.b;
    }
    
    public static ajtv b(final int n) {
        if (n == 0) {
            return ajtv.a;
        }
        if (n == 1) {
            return ajtv.b;
        }
        if (n != 2) {
            return null;
        }
        return ajtv.c;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
