// 
// Decompiled by Procyon v0.6.0
// 

public enum apka implements agzm
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
    
    public final int k;
    
    private apka(final String s, final int n, final int k) {
        this.k = k;
    }
    
    public static agzo a() {
        return apjd.j;
    }
    
    public static apka b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 9: {
                return apka.j;
            }
            case 8: {
                return apka.i;
            }
            case 7: {
                return apka.h;
            }
            case 6: {
                return apka.g;
            }
            case 5: {
                return apka.f;
            }
            case 4: {
                return apka.e;
            }
            case 3: {
                return apka.d;
            }
            case 2: {
                return apka.c;
            }
            case 1: {
                return apka.b;
            }
            case 0: {
                return apka.a;
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
