// 
// Decompiled by Procyon v0.6.0
// 

public final class ahvp implements vfu
{
    public static final vfv a;
    private final ahvq b;
    
    static {
        a = new ahvn();
    }
    
    public ahvp(final ahvq b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return this.c();
    }
    
    public final afft b() {
        return new affr().g();
    }
    
    public final ahvo c() {
        return new ahvo(((ahbh)this.b).toBuilder());
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ahvp && ((ahbh)this.b).equals((Object)((ahvp)o).b);
    }
    
    public String getAssetId() {
        return this.b.e;
    }
    
    public ahvs getAssetItemSelectedState() {
        ahvs ahvs;
        if ((ahvs = ahvs.b(this.b.f)) == null) {
            ahvs = ahvs.a;
        }
        return ahvs;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return ahvp.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("AssetItemCurrentlySelectedEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
