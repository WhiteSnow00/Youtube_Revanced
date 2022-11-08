// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgl
{
    private final vdo a;
    private final ahgn b;
    
    public ahgl(final ahgn b, final vdo a) {
        this.b = b;
        this.a = a;
    }
    
    public static agli b(final ahgn ahgn) {
        return new agli(((agzi)ahgn).toBuilder());
    }
    
    public final afdu a() {
        final afds afds = new afds();
        ahgm ahgm;
        if ((ahgm = this.b.c) == null) {
            ahgm = ahgm.a;
        }
        afds.j((Iterable)ahgk.b(ahgm).p().a());
        return afds.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ahgl && ((agzi)this.b).equals((Object)((ahgl)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("AccessibilitySupportedDatasModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
