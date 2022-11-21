// 
// Decompiled by Procyon v0.6.0
// 

public final class aqat implements vhc
{
    public static final vhd a;
    private final aqau b;
    
    static {
        a = new aqas();
    }
    
    public aqat(final aqau b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return this.c();
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final aqar c() {
        return new aqar(this.b.toBuilder());
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqat && this.b.equals(((aqat)o).b);
    }
    
    public apqo getPersistentVideoQuality() {
        apqo apqo;
        if ((apqo = apqo.b(this.b.f)) == null) {
            apqo = apqo.a;
        }
        return apqo;
    }
    
    public Boolean getSelectQualityEveryVideoEnabled() {
        return this.b.e;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aqat.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("YtMainAppSettingsEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
