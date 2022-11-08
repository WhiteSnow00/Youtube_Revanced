// 
// Decompiled by Procyon v0.6.0
// 

package io.grpc;

public enum Status$Code
{
    a("OK", 0, 0), 
    b("CANCELLED", 1, 1), 
    c("UNKNOWN", 2, 2), 
    d("INVALID_ARGUMENT", 3, 3), 
    e("DEADLINE_EXCEEDED", 4, 4), 
    f("NOT_FOUND", 5, 5), 
    g("ALREADY_EXISTS", 6, 6), 
    h("PERMISSION_DENIED", 7, 7), 
    i("RESOURCE_EXHAUSTED", 8, 8), 
    j("FAILED_PRECONDITION", 9, 9), 
    k("ABORTED", 10, 10), 
    l("OUT_OF_RANGE", 11, 11), 
    m("UNIMPLEMENTED", 12, 12), 
    n("INTERNAL", 13, 13), 
    o("UNAVAILABLE", 14, 14), 
    p("DATA_LOSS", 15, 15), 
    q("UNAUTHENTICATED", 16, 16);
    
    public final byte[] r;
    private final int t;
    
    private Status$Code(final String s, final int n, final int t) {
        this.t = t;
        this.r = Integer.toString(t).getBytes(aexb.a);
    }
    
    public static Status$Code a(final String s) {
        return Enum.valueOf(Status$Code.class, s);
    }
    
    public final Status b() {
        return Status.a.get(this.t);
    }
    
    public int value() {
        return this.t;
    }
}
