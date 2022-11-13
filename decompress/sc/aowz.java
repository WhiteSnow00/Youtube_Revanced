// 
// Decompiled by Procyon v0.6.0
// 

public enum aowz implements ahbl
{
    a("TRANSFER_FAILURE_REASON_UNKNOWN", 0, 0), 
    b("TRANSFER_FAILURE_REASON_FILESYSTEM_WRITE", 1, 1), 
    c("TRANSFER_FAILURE_REASON_EXTERNAL_FILESYSTEM_WRITE", 2, 2), 
    d("TRANSFER_FAILURE_REASON_PLAYABILITY", 3, 3), 
    e("TRANSFER_FAILURE_REASON_TOO_MANY_RETRIES", 4, 4), 
    f("TRANSFER_FAILURE_REASON_INTERNAL", 5, 5), 
    g("TRANSFER_FAILURE_REASON_STREAM_MISSING", 6, 6), 
    h("TRANSFER_FAILURE_REASON_SERVER", 7, 7), 
    i("TRANSFER_FAILURE_REASON_SERVER_PROPERTY_MISSING", 8, 8), 
    j("TRANSFER_FAILURE_REASON_NETWORK", 9, 9), 
    k("TRANSFER_FAILURE_REASON_TERMINATED_BY_USER", 10, 10), 
    l("TRANSFER_FAILURE_REASON_NETWORK_LOST", 11, 11), 
    m("TRANSFER_FAILURE_REASON_TIMEOUT_NO_PROGRESS", 12, 12);
    
    private static final aowz[] o;
    public final int n;
    
    private aowz(final String s, final int n, final int n2) {
        this.n = n2;
    }
    
    public static ahbn a() {
        return aove.k;
    }
    
    public static aowz b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 12: {
                return aowz.m;
            }
            case 11: {
                return aowz.l;
            }
            case 10: {
                return aowz.k;
            }
            case 9: {
                return aowz.j;
            }
            case 8: {
                return aowz.i;
            }
            case 7: {
                return aowz.h;
            }
            case 6: {
                return aowz.g;
            }
            case 5: {
                return aowz.f;
            }
            case 4: {
                return aowz.e;
            }
            case 3: {
                return aowz.d;
            }
            case 2: {
                return aowz.c;
            }
            case 1: {
                return aowz.b;
            }
            case 0: {
                return aowz.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.n;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}
