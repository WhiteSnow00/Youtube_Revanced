// 
// Decompiled by Procyon v0.6.0
// 

public final class ajqo
{
    private final vgx a;
    private final ajqp b;
    
    public ajqo(final ajqp b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    public static aefs b(final ajqp ajqp) {
        return new aefs(((ahcz)ajqp).toBuilder());
    }
    
    public final afhk a() {
        final afhi afhi = new afhi();
        ajqh ajqh;
        if ((ajqh = this.b.e) == null) {
            ajqh = ajqh.a;
        }
        afhi.j(ajqf.b(ajqh).B(this.a).a());
        return afhi.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajqo && ((ahcz)this.b).equals(((ajqo)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
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
