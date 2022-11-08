// 
// Decompiled by Procyon v0.6.0
// 

public final class anjs implements vdt
{
    public static final vdu a;
    public final anjt b;
    
    static {
        a = new anjr();
    }
    
    public anjs(final anjt b) {
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        this.getPostEphemeralitySettingsModel();
        afds.j((Iterable)new afds().g());
        return afds.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof anjs && this.b.equals(((anjs)o).b);
    }
    
    public anjv getPostEphemeralitySettings() {
        anjv anjv;
        if ((anjv = this.b.d) == null) {
            anjv = anjv.a;
        }
        return anjv;
    }
    
    public anju getPostEphemeralitySettingsModel() {
        anjv anjv;
        if ((anjv = this.b.d) == null) {
            anjv = anjv.a;
        }
        return new anju((anjv)anjv.toBuilder().build());
    }
    
    public vdu getType() {
        return anjs.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("PostEphemeralitySettingsEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
