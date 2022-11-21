// 
// Decompiled by Procyon v0.6.0
// 

public enum apoq implements ahdd
{
    a("DOWNLOAD_STATE_UNKNOWN", 0, 0), 
    b("DOWNLOAD_STATE_NOT_DOWNLOADED", 1, 1), 
    c("DOWNLOAD_STATE_PENDING_DOWNLOAD", 2, 2), 
    d("DOWNLOAD_STATE_DOWNLOAD_IN_PROGRESS", 3, 3), 
    e("DOWNLOAD_STATE_COMPLETE", 4, 4), 
    f("DOWNLOAD_STATE_FAILED", 5, 5), 
    g("DOWNLOAD_STATE_PAUSED", 6, 6), 
    h("DOWNLOAD_STATE_RETRYABLE_FAILURE", 7, 7), 
    i("DOWNLOAD_STATE_SYNC_NOW", 8, 8), 
    j("DOWNLOAD_STATE_USER_DELETED", 9, 9);
    
    private static final apoq[] l;
    public final int k;
    
    private apoq(final String s, final int n, final int k) {
        this.k = k;
    }
    
    public static ahdf a() {
        return apnc.l;
    }
    
    public static apoq b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 9: {
                return apoq.j;
            }
            case 8: {
                return apoq.i;
            }
            case 7: {
                return apoq.h;
            }
            case 6: {
                return apoq.g;
            }
            case 5: {
                return apoq.f;
            }
            case 4: {
                return apoq.e;
            }
            case 3: {
                return apoq.d;
            }
            case 2: {
                return apoq.c;
            }
            case 1: {
                return apoq.b;
            }
            case 0: {
                return apoq.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.k;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}
