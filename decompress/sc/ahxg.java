// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxg implements vfu
{
    public static final vfv a;
    private final ahxh b;
    
    static {
        a = new ahxe();
    }
    
    public ahxg(final ahxh b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new ahxf(((ahbh)this.b).toBuilder());
    }
    
    public final afft b() {
        return new affr().g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ahxg && ((ahbh)this.b).equals((Object)((ahxg)o).b);
    }
    
    public Boolean getIsAutonavOn() {
        return this.b.d;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return ahxg.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("AutonavStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
