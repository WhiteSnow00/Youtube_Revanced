// 
// Decompiled by Procyon v0.6.0
// 

public final class ajee implements vhc
{
    public static final vhd a;
    public final ajef b;
    
    static {
        a = new ajed();
    }
    
    public ajee(final ajef b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajec(((ahcz)this.b).toBuilder());
    }
    
    public final afhk b() {
        return new afhi().g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajee && ((ahcz)this.b).equals(((ajee)o).b);
    }
    
    public Integer getStickyVideoQualityFixedResolution() {
        final ajef b = this.b;
        int intValue;
        if (b.d == 2) {
            intValue = (int)b.e;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
    
    public apqo getStickyVideoQualitySetting() {
        final ajef b = this.b;
        apqo apqo;
        if (b.d == 3) {
            if ((apqo = apqo.b((int)b.e)) == null) {
                return apqo.a;
            }
        }
        else {
            apqo = apqo.a;
        }
        return apqo;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajee.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DataSavingVideoQualityEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
