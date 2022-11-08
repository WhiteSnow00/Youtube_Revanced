// 
// Decompiled by Procyon v0.6.0
// 

public enum aouw implements agzm
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
    
    public final int n;
    
    private aouw(final String s, final int n, final int n2) {
        this.n = n2;
    }
    
    public static agzo a() {
        return aotc.j;
    }
    
    public static aouw b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 12: {
                return aouw.m;
            }
            case 11: {
                return aouw.l;
            }
            case 10: {
                return aouw.k;
            }
            case 9: {
                return aouw.j;
            }
            case 8: {
                return aouw.i;
            }
            case 7: {
                return aouw.h;
            }
            case 6: {
                return aouw.g;
            }
            case 5: {
                return aouw.f;
            }
            case 4: {
                return aouw.e;
            }
            case 3: {
                return aouw.d;
            }
            case 2: {
                return aouw.c;
            }
            case 1: {
                return aouw.b;
            }
            case 0: {
                return aouw.a;
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
