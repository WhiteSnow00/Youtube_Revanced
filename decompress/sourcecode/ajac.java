// 
// Decompiled by Procyon v0.6.0
// 

public final class ajac implements vdt
{
    public static final vdu a;
    public final ajad b;
    
    static {
        a = new ajab();
    }
    
    public ajac(final ajad b) {
        this.b = b;
    }
    
    public final afdu b() {
        return new afds().g();
    }
    
    public final byte[] d() {
        return ((agxl)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajac && ((agzi)this.b).equals(((ajac)o).b);
    }
    
    public Integer getStickyVideoQualityFixedResolution() {
        final ajad b = this.b;
        int intValue;
        if (b.d == 2) {
            intValue = (int)b.e;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
    
    public aply getStickyVideoQualitySetting() {
        final ajad b = this.b;
        aply aply;
        if (b.d == 3) {
            if ((aply = aply.b((int)b.e)) == null) {
                return aply.a;
            }
        }
        else {
            aply = aply.a;
        }
        return aply;
    }
    
    public vdu getType() {
        return ajac.a;
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
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
