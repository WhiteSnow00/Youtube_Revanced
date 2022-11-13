// 
// Decompiled by Procyon v0.6.0
// 

public final class anod implements vfu
{
    public static final vfv a;
    private final anoe b;
    
    static {
        a = new anoc();
    }
    
    public anod(final anoe b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new anob(this.b.toBuilder());
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
        return o instanceof anod && this.b.equals((Object)((anod)o).b);
    }
    
    public Boolean getIsControlOverlayVisible() {
        return this.b.e;
    }
    
    public Boolean getIsFullscreen() {
        return this.b.f;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return anod.a;
    }
    
    public Integer getVideoTimeSec() {
        return this.b.d;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ProductsInVideoEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
