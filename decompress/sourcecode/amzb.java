// 
// Decompiled by Procyon v0.6.0
// 

public enum amzb implements agzm
{
    a("PHOTO_UPLOAD_STATUS_UNSPECIFIED", 0, 0), 
    b("PHOTO_UPLOAD_STATUS_UPLOADING", 1, 1), 
    c("PHOTO_UPLOAD_STATUS_FAILED", 2, 2);
    
    public final int d;
    
    private amzb(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static agzo a() {
        return amtt.p;
    }
    
    public static amzb b(final int n) {
        if (n == 0) {
            return amzb.a;
        }
        if (n == 1) {
            return amzb.b;
        }
        if (n != 2) {
            return null;
        }
        return amzb.c;
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
