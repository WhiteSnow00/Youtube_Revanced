// 
// Decompiled by Procyon v0.6.0
// 

public final class anhp implements vfu
{
    public static final vfv a;
    private final anhq b;
    
    static {
        a = new anho();
    }
    
    public anhp(final anhq b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new anhn(this.b.toBuilder());
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
        return o instanceof anhp && this.b.equals((Object)((anhp)o).b);
    }
    
    public Long getCurrentVideoTimeInMs() {
        return this.b.h;
    }
    
    public Boolean getLiveVideo() {
        return this.b.e;
    }
    
    public Long getMaximumSeekableTimeInMs() {
        return this.b.g;
    }
    
    public Long getMinimumSeekableTimeInMs() {
        return this.b.f;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return anhp.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("PlayerTimeEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
