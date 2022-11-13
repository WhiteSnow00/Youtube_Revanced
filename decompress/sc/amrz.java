// 
// Decompiled by Procyon v0.6.0
// 

public final class amrz implements vfu
{
    public static final vfv a;
    private final amsa b;
    
    static {
        a = new amry();
    }
    
    public amrz(final amsa b) {
        this.b = b;
    }
    
    public final /* bridge */ vfk a() {
        return new amrx(((ahbh)this.b).toBuilder());
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
        return o instanceof amrz && ((ahbh)this.b).equals((Object)((amrz)o).b);
    }
    
    public amsb getState() {
        amsb amsb;
        if ((amsb = amsb.b(this.b.e)) == null) {
            amsb = amsb.a;
        }
        return amsb;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return amrz.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("NotificationOsSettingEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
