// 
// Decompiled by Procyon v0.6.0
// 

public final class aipc implements vdt
{
    public static final vdu a;
    private final aipd b;
    
    static {
        a = new aipb();
    }
    
    public aipc(final aipd b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return ((agxl)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aipc && ((agzi)this.b).equals(((aipc)o).b);
    }
    
    public Long getLatestTimestampMs() {
        return this.b.f;
    }
    
    public String getLatestTimestampText() {
        return this.b.e;
    }
    
    public vdu getType() {
        return aipc.a;
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
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
