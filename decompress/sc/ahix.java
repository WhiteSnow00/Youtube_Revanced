// 
// Decompiled by Procyon v0.6.0
// 

public final class ahix implements vfu
{
    public static final vfv a;
    private final ahiy b;
    
    static {
        a = new ahiv();
    }
    
    public ahix(final ahiy b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new ahiw(((ahbh)this.b).toBuilder());
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
        return o instanceof ahix && ((ahbh)this.b).equals((Object)((ahix)o).b);
    }
    
    public Boolean getLinked() {
        return this.b.d;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return ahix.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("AccountLinkStatusEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
