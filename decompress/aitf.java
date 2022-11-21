// 
// Decompiled by Procyon v0.6.0
// 

public final class aitf implements vhc
{
    public static final vhd a;
    private final aitg b;
    
    static {
        a = new aite();
    }
    
    public aitf(final aitg b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aitd(this.b.toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aitf && this.b.equals(((aitf)o).b);
    }
    
    public Long getLatestTimestampMs() {
        return this.b.f;
    }
    
    public String getLatestTimestampText() {
        return this.b.e;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aitf.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("CommentComposerTimestampEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
