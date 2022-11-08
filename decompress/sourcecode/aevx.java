// 
// Decompiled by Procyon v0.6.0
// 

public enum aevx implements agzm
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
    
    public final int p;
    
    private aevx(final String s, final int n, final int p3) {
        this.p = p3;
    }
    
    public static aevx a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 14: {
                return aevx.o;
            }
            case 13: {
                return aevx.n;
            }
            case 12: {
                return aevx.m;
            }
            case 11: {
                return aevx.l;
            }
            case 10: {
                return aevx.k;
            }
            case 9: {
                return aevx.j;
            }
            case 8: {
                return aevx.i;
            }
            case 7: {
                return aevx.h;
            }
            case 6: {
                return aevx.g;
            }
            case 5: {
                return aevx.f;
            }
            case 4: {
                return aevx.e;
            }
            case 3: {
                return aevx.d;
            }
            case 2: {
                return aevx.c;
            }
            case 1: {
                return aevx.b;
            }
            case 0: {
                return aevx.a;
            }
        }
    }
    
    public static agzo b() {
        return aeih.h;
    }
    
    public final int getNumber() {
        return this.p;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.p);
    }
}
