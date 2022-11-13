// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxt implements vfu
{
    public static final vfv a;
    private final ahxu b;
    
    static {
        a = new ahxr();
    }
    
    public ahxt(final ahxu b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new ahxs(((ahbh)this.b).toBuilder());
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
        return o instanceof ahxt && ((ahbh)this.b).equals((Object)((ahxt)o).b);
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return ahxt.a;
    }
    
    public ahxv getVisibilityState() {
        ahxv ahxv;
        if ((ahxv = ahxv.b(this.b.d)) == null) {
            ahxv = ahxv.a;
        }
        return ahxv;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("AutotagVisibilityStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
