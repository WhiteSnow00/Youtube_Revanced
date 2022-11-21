import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amea implements vhc
{
    public static final vhd a;
    public final ameb b;
    
    static {
        a = new amdz();
    }
    
    public amea(final ameb b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new amdy(((ahcz)this.b).toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amea && ((ahcz)this.b).equals(((amea)o).b);
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amea.a;
    }
    
    public String getVideoId() {
        return this.b.e;
    }
    
    public List getVisibilityOverrideMarkersKey() {
        return (List)this.b.f;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MarkersVisibilityOverrideEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
