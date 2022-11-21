import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwp
{
    private final vgx a;
    private final ajws b;
    
    public ajwp(final ajws b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    public static aefs b(final ajws ajws) {
        return new aefs((ahct)((ahcz)ajws).toBuilder());
    }
    
    public final afhk a() {
        final afhi afhi = new afhi();
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.b.c).iterator();
        while (iterator.hasNext()) {
            afgc.h(new ajwr((ajwu)((ahcr)((ahcz)iterator.next()).toBuilder()).build(), this.a));
        }
        final aflv d = afgc.g().D();
        while (((Iterator)d).hasNext()) {
            final ajwr ajwr = (ajwr)((Iterator)d).next();
            final afhi afhi2 = new afhi();
            aisc aisc;
            if ((aisc = ajwr.b.m) == null) {
                aisc = aisc.a;
            }
            afhi2.j(aisb.b(aisc).F(ajwr.a).a());
            alxw alxw;
            if ((alxw = ajwr.b.n) == null) {
                alxw = alxw.b;
            }
            afhi2.j(alxu.b(alxw).w(ajwr.a).a());
            afhi.j(afhi2.g());
        }
        ajwt ajwt;
        if ((ajwt = this.b.f) == null) {
            ajwt = ajwt.a;
        }
        final ajwq ajwq = new ajwq((ajwt)((ahcz)ajwt).toBuilder().build(), this.a);
        final afhi afhi3 = new afhi();
        ahkb ahkb;
        if ((ahkb = ajwq.b.c) == null) {
            ahkb = ahkb.a;
        }
        afhi3.j(ahjz.b(ahkb).A().a());
        afhi.j(afhi3.g());
        return afhi.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajwp && ((ahcz)this.b).equals(((ajwp)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("FormattedStringModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
