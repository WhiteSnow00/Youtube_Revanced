// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqk
{
    private final aipf a;
    
    public aiqk(final aipf a) {
        this.a = a;
    }
    
    public static agpd b(final aipf aipf) {
        return new agpd(((ahcz)aipf).toBuilder());
    }
    
    public final afhk a() {
        final afhi afhi = new afhi();
        final aipf a = this.a;
        aipj a2;
        if (a.b == 1) {
            a2 = (aipj)a.c;
        }
        else {
            a2 = aipj.a;
        }
        aiqn.b(a2).J();
        afhi.j(aiqn.a());
        final aipf a3 = this.a;
        aipm a4;
        if (a3.b == 2) {
            a4 = (aipm)a3.c;
        }
        else {
            a4 = aipm.a;
        }
        aiqp.b(a4).H();
        afhi.j(aiqp.a());
        final aipf a5 = this.a;
        aipk a6;
        if (a5.b == 3) {
            a6 = (aipk)a5.c;
        }
        else {
            a6 = aipk.a;
        }
        aiqo.b(a6).I();
        afhi.j(aiqo.a());
        return afhi.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aiqk && ((ahcz)this.a).equals(((aiqk)o).a);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.a).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("CreatorMusicCollectionModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
