// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmk
{
    private final vdo a;
    private final ajml b;
    
    public ajmk(final ajml b, final vdo a) {
        this.b = b;
        this.a = a;
    }
    
    public static aglk b(final ajml ajml) {
        return new aglk(((agzi)ajml).toBuilder());
    }
    
    public final afdu a() {
        final afds afds = new afds();
        ajmd ajmd;
        if ((ajmd = this.b.e) == null) {
            ajmd = ajmd.a;
        }
        afds.j((Iterable)ajmb.b(ajmd).G(this.a).a());
        return afds.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajmk && ((agzi)this.b).equals(((ajmk)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("EmojiRunModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
