// 
// Decompiled by Procyon v0.6.0
// 

public final class apll implements vdt
{
    public static final vdu a;
    private final aplm b;
    
    static {
        a = new aplk();
    }
    
    public apll(final aplm b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof apll && this.b.equals(((apll)o).b);
    }
    
    public Long getLastPlaybackPositionSeconds() {
        return this.b.f;
    }
    
    public vdu getType() {
        return apll.a;
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
