import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class artq
{
    public static final arrf a;
    private int b;
    
    static {
        a = arrf.a("internal:health-checking-config");
    }
    
    public abstract void a(final Status p0);
    
    public void b(final artm artm) {
        if (this.b++ == 0) {
            this.d(artm);
        }
        this.b = 0;
    }
    
    public abstract void c();
    
    public boolean d(final artm artm) {
        if (!artm.a.isEmpty()) {
            if (this.b++ == 0) {
                this.b(artm);
            }
            this.b = 0;
            return true;
        }
        final Status l = Status.l;
        final String value = String.valueOf(artm.a);
        final String string = artm.b.toString();
        final StringBuilder sb = new StringBuilder("NameResolver returned no usable address. addrs=");
        sb.append(value);
        sb.append(", attrs=");
        sb.append(string);
        this.a(l.withDescription(sb.toString()));
        return false;
    }
}
