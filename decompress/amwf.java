// 
// Decompiled by Procyon v0.6.0
// 

public final class amwf
{
    private final amwh a;
    
    public amwf(final amwh a) {
        this.a = a;
    }
    
    public static aefs b(final amwh amwh) {
        return new aefs(((ahcz)amwh).toBuilder());
    }
    
    public final afhk a() {
        final afhi afhi = new afhi();
        amwg amwg;
        if ((amwg = this.a.e) == null) {
            amwg = amwg.a;
        }
        amwe.b(amwg).u();
        afhi.j(amwe.a());
        return afhi.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amwf && ((ahcz)this.a).equals(((amwf)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("OfflineFutureUnplayableInfoModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
