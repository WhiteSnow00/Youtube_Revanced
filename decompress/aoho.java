// 
// Decompiled by Procyon v0.6.0
// 

public final class aoho implements vhc
{
    public static final vhd a;
    public final aohl b;
    
    static {
        a = new aohn();
    }
    
    public aoho(final aohl b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aohm(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        this.getStartToShortsPauseConfigModel();
        afhi.j(new afhi().g());
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aoho && this.b.equals(((aoho)o).b);
    }
    
    public Integer getStartToShortsDurationMinutes() {
        return this.b.d;
    }
    
    public aomw getStartToShortsPauseConfig() {
        aomw aomw;
        if ((aomw = this.b.e) == null) {
            aomw = aomw.a;
        }
        return aomw;
    }
    
    public aohp getStartToShortsPauseConfigModel() {
        aomw aomw;
        if ((aomw = this.b.e) == null) {
            aomw = aomw.a;
        }
        return new aohp((aomw)((ahcz)aomw).toBuilder().build());
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aoho.a;
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
