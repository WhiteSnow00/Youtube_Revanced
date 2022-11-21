// 
// Decompiled by Procyon v0.6.0
// 

public enum apka implements ahdd
{
    a("UPLOAD_CREATION_FAILURE_REASON_UNKNOWN", 0, 0), 
    b("UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED", 1, 1), 
    c("UPLOAD_CREATION_FAILURE_REASON_JOB_CHANGE_FAILED", 2, 2), 
    d("UPLOAD_CREATION_FAILURE_REASON_JOB_CONFIRMATION_FAILED", 3, 3), 
    e("UPLOAD_CREATION_FAILURE_REASON_JOB_CANCELLATION_FAILED", 4, 4), 
    f("UPLOAD_CREATION_FAILURE_REASON_NOT_OPENABLE_SOURCE_VIDEO", 5, 5), 
    g("UPLOAD_CREATION_FAILURE_REASON_JOB_EXECUTION_NOT_SCHEDULED", 6, 6), 
    h("UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_TIMED_OUT", 7, 7), 
    i("UPLOAD_CREATION_FAILURE_REASON_JOB_CHANGE_TIMED_OUT", 8, 8), 
    j("UPLOAD_CREATION_FAILURE_REASON_JOB_CONFIRMATION_TIMED_OUT", 9, 9), 
    k("UPLOAD_CREATION_FAILURE_REASON_JOB_CANCELLATION_TIMED_OUT", 10, 10), 
    l("UPLOAD_CREATION_FAILURE_REASON_APPLICATION_UNCAUGHT_CRASH_EXCEPTION", 11, 11), 
    m("UPLOAD_CREATION_FAILURE_REASON_APPLICATION_HANGING", 12, 12), 
    n("UPLOAD_CREATION_FAILURE_REASON_CLIENT_SIDE_RENDERING_FAILED", 13, 13);
    
    private static final apka[] p;
    public final int o;
    
    private apka(final String s, final int n, final int o) {
        this.o = o;
    }
    
    public static ahdf a() {
        return aoxk.u;
    }
    
    public static apka b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 13: {
                return apka.n;
            }
            case 12: {
                return apka.m;
            }
            case 11: {
                return apka.l;
            }
            case 10: {
                return apka.k;
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
        return this.o;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.o);
    }
}
