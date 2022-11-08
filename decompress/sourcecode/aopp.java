// 
// Decompiled by Procyon v0.6.0
// 

public enum aopp
{
    a("PREFETCH_CONFIG", 0), 
    b("CONFIG_NOT_SET", 1);
    
    private aopp(final String s, final int n) {
    }
    
    public static aopp a(final int n) {
        if (n == 0) {
            return aopp.b;
        }
        if (n != 6) {
            return null;
        }
        return aopp.a;
    }
}
