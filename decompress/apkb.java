// 
// Decompiled by Procyon v0.6.0
// 

public enum apkb implements ahdd
{
    a("UPLOAD_CREATION_FLOW_UNKNOWN", 0, 0), 
    b("UPLOAD_CREATION_FLOW_LEGACY", 1, 1), 
    c("UPLOAD_CREATION_FLOW_EXTERNAL", 2, 2), 
    d("UPLOAD_CREATION_FLOW_SHORTS", 3, 3);
    
    private static final apkb[] f;
    public final int e;
    
    private apkb(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return apkc.b;
    }
    
    public static apkb b(final int n) {
        if (n == 0) {
            return apkb.a;
        }
        if (n == 1) {
            return apkb.b;
        }
        if (n == 2) {
            return apkb.c;
        }
        if (n != 3) {
            return null;
        }
        return apkb.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
