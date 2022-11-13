// 
// Decompiled by Procyon v0.6.0
// 

public final class anhh implements vfu
{
    public static final vfv a;
    private final anhi b;
    
    static {
        a = new anhg();
    }
    
    public anhh(final anhi b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new anhf(this.b.toBuilder());
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
        return o instanceof anhh && this.b.equals((Object)((anhh)o).b);
    }
    
    public anhj getAdsState() {
        anhj anhj;
        if ((anhj = anhj.b(this.b.f)) == null) {
            anhj = anhj.a;
        }
        return anhj;
    }
    
    public anhk getPlayerState() {
        anhk anhk;
        if ((anhk = anhk.b(this.b.e)) == null) {
            anhk = anhk.a;
        }
        return anhk;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return anhh.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("PlayerStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
