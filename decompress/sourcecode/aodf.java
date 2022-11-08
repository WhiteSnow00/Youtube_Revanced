// 
// Decompiled by Procyon v0.6.0
// 

public final class aodf implements vdt
{
    public static final vdu a;
    public final aodc b;
    
    static {
        a = new aode();
    }
    
    public aodf(final aodc b) {
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        this.getStartToShortsPauseConfigModel();
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
        return o instanceof aodf && this.b.equals(((aodf)o).b);
    }
    
    public Integer getStartToShortsDurationMinutes() {
        return this.b.d;
    }
    
    public aoij getStartToShortsPauseConfig() {
        aoij aoij;
        if ((aoij = this.b.e) == null) {
            aoij = aoij.a;
        }
        return aoij;
    }
    
    public aodg getStartToShortsPauseConfigModel() {
        aoij aoij;
        if ((aoij = this.b.e) == null) {
            aoij = aoij.a;
        }
        return new aodg((aoij)((agzi)aoij).toBuilder().build());
    }
    
    public vdu getType() {
        return aodf.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ShortsFirstEligibilityEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
