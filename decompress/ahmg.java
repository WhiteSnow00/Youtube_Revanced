// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmg implements vfu
{
    public static final vfv a;
    private final ahmh b;
    
    static {
        a = new ahme();
    }
    
    public ahmg(final ahmh b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return this.c();
    }
    
    public final afft b() {
        return new affr().g();
    }
    
    public final ahmf c() {
        return new ahmf(((ahbh)this.b).toBuilder());
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ahmg && ((ahbh)this.b).equals((Object)((ahmg)o).b);
    }
    
    public Boolean getFullscreenForced() {
        return this.b.d;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return ahmg.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("AdPlayerFullscreenStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}