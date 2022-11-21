// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqt
{
    private final vgx a;
    private final aipu b;
    
    public aiqt(final aipu b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    public static agpd b(final aipu aipu) {
        return new agpd(aipu.toBuilder());
    }
    
    public final afhk a() {
        final afhi afhi = new afhi();
        aipt aipt;
        if ((aipt = this.b.b) == null) {
            aipt = aipt.a;
        }
        final aipt aipt2 = (aipt)aipt.toBuilder().build();
        afhi.j(new afhi().g());
        aipf aipf;
        if ((aipf = this.b.c) == null) {
            aipf = aipf.a;
        }
        afhi.j(aiqk.b(aipf).x(this.a).a());
        return afhi.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiqt && this.b.equals(((aiqt)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("TrackModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
