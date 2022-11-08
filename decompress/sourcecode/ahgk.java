// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgk
{
    private final ahgm a;
    
    public ahgk(final ahgm a) {
        this.a = a;
    }
    
    public static agli b(final ahgm ahgm) {
        return new agli(((agzi)ahgm).toBuilder());
    }
    
    public final afdu a() {
        final afds afds = new afds();
        ahgo ahgo;
        if ((ahgo = this.a.d) == null) {
            ahgo = ahgo.a;
        }
        final ahgo ahgo2 = (ahgo)((agzi)ahgo).toBuilder().build();
        afds.j((Iterable)new afds().g());
        return afds.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ahgk && ((agzi)this.a).equals((Object)((ahgk)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("AccessibilityDataModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
