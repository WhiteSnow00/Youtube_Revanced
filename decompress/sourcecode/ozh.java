import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozh
{
    public String a;
    public afnt b;
    public Integer c;
    public int[] d;
    public int[] e;
    private MessageLite f;
    private int g;
    
    public final ozi a() {
        final String a = this.a;
        if (a != null) {
            final MessageLite f = this.f;
            if (f != null) {
                if (this.g != 0) {
                    return new ozi(a, f, this.b, this.c, this.d, this.e);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" logSource");
        }
        if (this.f == null) {
            sb.append(" message");
        }
        if (this.g == 0) {
            sb.append(" qosTier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final MessageLite f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null message");
    }
    
    public final void c() {
        this.g = 1;
    }
}
