// 
// Decompiled by Procyon v0.6.0
// 

public final class ahge implements vdt
{
    public static final vdu a;
    private final ahgb b;
    
    static {
        a = new ahgc();
    }
    
    public ahge(final ahgb b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return ((agxl)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ahge && ((agzi)this.b).equals((Object)((ahge)o).b);
    }
    
    public Boolean getShouldRequireViewerAck() {
        return this.b.d;
    }
    
    public vdu getType() {
        return ahge.a;
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("AADCGuidelinesStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
