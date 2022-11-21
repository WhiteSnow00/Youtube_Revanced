// 
// Decompiled by Procyon v0.6.0
// 

public final class amue implements vhc
{
    public static final vhd a;
    private final amuf b;
    
    static {
        a = new amud();
    }
    
    public amue(final amuf b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new amuc(((ahcz)this.b).toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amue && ((ahcz)this.b).equals(((amue)o).b);
    }
    
    public amug getState() {
        amug amug;
        if ((amug = amug.b(this.b.e)) == null) {
            amug = amug.a;
        }
        return amug;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amue.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
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
