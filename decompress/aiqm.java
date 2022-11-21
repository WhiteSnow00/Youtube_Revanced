// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqm
{
    private final vgx a;
    private final aiph b;
    
    public aiqm(final aiph b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    public static agpd b(final aiph aiph) {
        return new agpd(((ahcz)aiph).toBuilder());
    }
    
    public final afhk a() {
        final afhi afhi = new afhi();
        final aiph b = this.b;
        aipj a;
        if (b.b == 1) {
            a = (aipj)b.c;
        }
        else {
            a = aipj.a;
        }
        aiqn.b(a).J();
        afhi.j(aiqn.a());
        final aiph b2 = this.b;
        aipm a2;
        if (b2.b == 2) {
            a2 = (aipm)b2.c;
        }
        else {
            a2 = aipm.a;
        }
        aiqp.b(a2).H();
        afhi.j(aiqp.a());
        final aiph b3 = this.b;
        aipk a3;
        if (b3.b == 3) {
            a3 = (aipk)b3.c;
        }
        else {
            a3 = aipk.a;
        }
        aiqo.b(a3).I();
        afhi.j(aiqo.a());
        final aiph b4 = this.b;
        aipu a4;
        if (b4.b == 4) {
            a4 = (aipu)b4.c;
        }
        else {
            a4 = aipu.a;
        }
        afhi.j(aiqt.b(a4).G(this.a).a());
        return afhi.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiqm && ((ahcz)this.b).equals(((aiqm)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("CreatorMusicEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
