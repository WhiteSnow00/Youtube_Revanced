// 
// Decompiled by Procyon v0.6.0
// 

public enum airo implements ahbl
{
    a("COMMENT_POLL_STATUS_UNKNOWN", 0, 0), 
    b("COMMENT_POLL_STATUS_NO_VOTE", 1, 10), 
    c("COMMENT_POLL_STATUS_VOTE_NO_COMMENT", 2, 20), 
    d("COMMENT_POLL_STATUS_VOTE_AND_COMMENT", 3, 30), 
    e("COMMENT_POLL_STATUS_VOTING", 4, 40);
    
    private static final airo[] g;
    public final int f;
    
    private airo(final String s, final int n, final int f) {
        this.f = f;
    }
    
    public static ahbn a() {
        return aill.q;
    }
    
    public static airo b(final int n) {
        if (n == 0) {
            return airo.a;
        }
        if (n == 10) {
            return airo.b;
        }
        if (n == 20) {
            return airo.c;
        }
        if (n == 30) {
            return airo.d;
        }
        if (n != 40) {
            return null;
        }
        return airo.e;
    }
    
    public final int getNumber() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}
