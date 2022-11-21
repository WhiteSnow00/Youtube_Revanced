import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajqf
{
    private final vgx a;
    private final ajqh b;
    
    public ajqf(final ajqh b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    public static aefs b(final ajqh ajqh) {
        return new aefs(((ahcz)ajqh).toBuilder());
    }
    
    public final afhk a() {
        final afhi afhi = new afhi();
        aowb aowb;
        if ((aowb = this.b.f) == null) {
            aowb = aowb.a;
        }
        afhi.j(aowd.b(aowb).p(this.a).a());
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.b.i).iterator();
        while (iterator.hasNext()) {
            afgc.h(new ajqg((ajqi)((ahcz)iterator.next()).toBuilder().build(), this.a));
        }
        final aflv d = afgc.g().D();
        while (((Iterator)d).hasNext()) {
            final ajqg ajqg = (ajqg)((Iterator)d).next();
            final afhi afhi2 = new afhi();
            final afgc afgc2 = new afgc();
            final Iterator<Object> iterator2 = ((List<Object>)ajqg.b.b).iterator();
            while (iterator2.hasNext()) {
                afgc2.h(aowd.b((aowb)iterator2.next()).p(ajqg.a));
            }
            final aflv d2 = afgc2.g().D();
            while (((Iterator)d2).hasNext()) {
                afhi2.j(((aowd)((Iterator)d2).next()).a());
            }
            afhi.j(afhi2.g());
        }
        return afhi.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajqf && ((ahcz)this.b).equals(((ajqf)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("EmojiModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
