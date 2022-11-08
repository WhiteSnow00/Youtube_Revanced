// 
// Decompiled by Procyon v0.6.0
// 

public enum amtu implements agzm
{
    a("OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN", 0, 0), 
    b("OFFLINE_VIDEO_POLICY_ACTION_OK", 1, 1), 
    c("OFFLINE_VIDEO_POLICY_ACTION_DISABLE", 2, 2), 
    d("OFFLINE_VIDEO_POLICY_ACTION_DOWNLOAD_FAILED", 3, 3);
    
    public final int e;
    
    private amtu(final String s, final int n, final int e) {
        this.e = e;
    }
    
    public static agzo a() {
        return amtt.a;
    }
    
    public static amtu b(final int n) {
        if (n == 0) {
            return amtu.a;
        }
        if (n == 1) {
            return amtu.b;
        }
        if (n == 2) {
            return amtu.c;
        }
        if (n != 3) {
            return null;
        }
        return amtu.d;
    }
    
    @Override
    public final int getNumber() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}
