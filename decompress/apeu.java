// 
// Decompiled by Procyon v0.6.0
// 

public enum apeu implements ahdd
{
    a("VIDEO_STREAM_TYPE_UNSPECIFIED", 0, 0), 
    b("VIDEO_STREAM_TYPE_LIVE", 1, 1), 
    c("VIDEO_STREAM_TYPE_DVR", 2, 2), 
    d("VIDEO_STREAM_TYPE_VOD", 3, 3);
    
    private static final apeu[] f;
    public final int e;
    
    private apeu(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static ahdf a() {
        return aoxk.n;
    }
    
    public static apeu b(final int n) {
        if (n == 0) {
            return apeu.a;
        }
        if (n == 1) {
            return apeu.b;
        }
        if (n == 2) {
            return apeu.c;
        }
        if (n != 3) {
            return null;
        }
        return apeu.d;
    }
    
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
