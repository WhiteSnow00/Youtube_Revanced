// 
// Decompiled by Procyon v0.6.0
// 

public enum ajbz implements ahbl
{
    a("DATA_PUSH_CLIENT_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("DATA_PUSH_CLIENT_EVENT_TYPE_EMBEDDED_FILE_GROUP_INIT_FAILED", 1, 1), 
    c("DATA_PUSH_CLIENT_EVENT_TYPE_EMBEDDED_BUILD_ID_INIT_FAILED", 2, 11), 
    d("DATA_PUSH_CLIENT_EVENT_TYPE_FILE_GROUP_NOT_FOUND", 3, 2), 
    e("DATA_PUSH_CLIENT_EVENT_TYPE_FILE_NOT_FOUND", 4, 3), 
    f("DATA_PUSH_CLIENT_EVENT_TYPE_FILE_READ_BYTES_FAILED", 5, 4), 
    g("DATA_PUSH_CLIENT_EVENT_TYPE_ADD_FILE_GROUP_FAILED", 6, 5), 
    h("DATA_PUSH_CLIENT_EVENT_TYPE_MANIFEST_INIT_FAILED", 7, 6), 
    i("DATA_PUSH_CLIENT_EVENT_TYPE_FILE_GROUP_VALIDATION_FAILED", 8, 7), 
    j("DATA_PUSH_CLIENT_EVENT_TYPE_REPORT_VERSION_UNHANDLED_FILE_TYPE", 9, 12), 
    k("DATA_PUSH_CLIENT_EVENT_TYPE_BLOCKS_CONTAINER_MANIFEST_PARSE_FAILED", 10, 8), 
    l("DATA_PUSH_CLIENT_EVENT_TYPE_BLOCKS_RESOURCE_ENSURE_LOADED_FAILED", 11, 9), 
    m("DATA_PUSH_CLIENT_EVENT_TYPE_BLOCKS_CONTAINER_CREATION_FAILED", 12, 10);
    
    private static final ajbz[] o;
    public final int n;
    
    private ajbz(final String s, final int n, final int n2) {
        this.n = n2;
    }
    
    public static ahbn a() {
        return airy.o;
    }
    
    public static ajbz b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 12: {
                return ajbz.j;
            }
            case 11: {
                return ajbz.c;
            }
            case 10: {
                return ajbz.m;
            }
            case 9: {
                return ajbz.l;
            }
            case 8: {
                return ajbz.k;
            }
            case 7: {
                return ajbz.i;
            }
            case 6: {
                return ajbz.h;
            }
            case 5: {
                return ajbz.g;
            }
            case 4: {
                return ajbz.f;
            }
            case 3: {
                return ajbz.e;
            }
            case 2: {
                return ajbz.d;
            }
            case 1: {
                return ajbz.b;
            }
            case 0: {
                return ajbz.a;
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
