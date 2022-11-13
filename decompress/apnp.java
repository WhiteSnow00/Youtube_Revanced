// 
// Decompiled by Procyon v0.6.0
// 

public final class apnp implements vfu
{
    public static final vfv a;
    private final apnq b;
    
    static {
        a = new apno();
    }
    
    public apnp(final apnq b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new apnn(this.b.toBuilder());
    }
    
    public final afft b() {
        return new affr().g();
    }
    
    public final byte[] d() {
        return ((agzk)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof apnp && this.b.equals((Object)((apnp)o).b);
    }
    
    public Long getLastPlaybackPositionSeconds() {
        return this.b.f;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return apnp.a;
    }
    
    public String getVideoId() {
        return this.b.e;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("VideoPlaybackPositionEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
