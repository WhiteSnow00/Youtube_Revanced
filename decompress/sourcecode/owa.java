import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owa
{
    public String a;
    public Integer b;
    public Status c;
    public String d;
    public String e;
    public Integer f;
    public Boolean g;
    public adgk h;
    private afdu i;
    private int j;
    private byte k;
    
    public final owb a() {
        if (this.k == 1) {
            final afdu i = this.i;
            if (i != null) {
                return new owb(i, this.h, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.j, null);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.i == null) {
            sb.append(" templateUris");
        }
        if (this.k == 0) {
            sb.append(" materializationCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final int j) {
        this.j = j;
        this.k = 1;
    }
    
    public final void c(final afdu i) {
        if (i != null) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null templateUris");
    }
}
