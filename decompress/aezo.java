// 
// Decompiled by Procyon v0.6.0
// 

public enum aezo implements ahdd
{
    a("UNKNOWN_EVENT", 0, 0), 
    b("QUEUE_REQUEST", 1, 1), 
    c("PROCESS_REQUEST", 2, 2), 
    d("REMOTE_CREATE_HANDLE", 3, 3), 
    e("REMOTE_INIT", 4, 4), 
    f("STORE_VM", 5, 5), 
    g("VERIFY_VM_SIGNATURE", 6, 6), 
    h("CREATE_VM_CLASS_LOADER", 7, 7), 
    i("LOAD_VM_CLASS", 8, 8), 
    j("CREATE_VM_OBJECT", 9, 9), 
    k("LOCAL_INIT", 10, 10), 
    l("LOCAL_CLOSE", 11, 11), 
    m("HANDLE_CREATED", 12, 12), 
    n("SNAPSHOT_START", 13, 13), 
    o("SNAPSHOT_COMPLETE", 14, 14);
    
    private static final aezo[] q;
    public final int p;
    
    private aezo(final String s, final int n, final int p3) {
        this.p = p3;
    }
    
    public static aezo a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 14: {
                return aezo.o;
            }
            case 13: {
                return aezo.n;
            }
            case 12: {
                return aezo.m;
            }
            case 11: {
                return aezo.l;
            }
            case 10: {
                return aezo.k;
            }
            case 9: {
                return aezo.j;
            }
            case 8: {
                return aezo.i;
            }
            case 7: {
                return aezo.h;
            }
            case 6: {
                return aezo.g;
            }
            case 5: {
                return aezo.f;
            }
            case 4: {
                return aezo.e;
            }
            case 3: {
                return aezo.d;
            }
            case 2: {
                return aezo.c;
            }
            case 1: {
                return aezo.b;
            }
            case 0: {
                return aezo.a;
            }
        }
    }
    
    public static ahdf b() {
        return aemb.h;
    }
    
    public final int getNumber() {
        return this.p;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.p);
    }
}
