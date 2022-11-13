// 
// Decompiled by Procyon v0.6.0
// 

public final class amyy implements vfu
{
    public static final vfv a;
    private final amyz b;
    
    static {
        a = new amyx();
    }
    
    public amyy(final amyz b) {
        this.b = b;
    }
    
    public static amyw c(final amyz amyz) {
        return new amyw(((ahbh)amyz).toBuilder());
    }
    
    public final /* bridge */ vfk a() {
        return new amyw(((ahbh)this.b).toBuilder());
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
        return o instanceof amyy && ((ahbh)this.b).equals((Object)((amyy)o).b);
    }
    
    public amza getState() {
        amza amza;
        if ((amza = amza.b(this.b.d)) == null) {
            amza = amza.a;
        }
        return amza;
    }
    
    public /* bridge */ vfm getType() {
        return (vfm)this.getType();
    }
    
    public vfv getType() {
        return amyy.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahbh)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ParticipantJoinStateEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
