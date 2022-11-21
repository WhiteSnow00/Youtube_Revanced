import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisb
{
    private final vgx a;
    private final aisc b;
    
    public aisb(final aisc b, final vgx a) {
        this.b = b;
        this.a = a;
    }
    
    public static agpd b(final aisc aisc) {
        return new agpd((ahct)((ahcz)aisc).toBuilder());
    }
    
    public final afhk a() {
        final afhi afhi = new afhi();
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.b.d).iterator();
        while (iterator.hasNext()) {
            afgc.h(new alyd((alyh)iterator.next().toBuilder().build(), this.a));
        }
        final aflv d = afgc.g().D();
        while (((Iterator)d).hasNext()) {
            final alyd alyd = (alyd)((Iterator)d).next();
            final afhi afhi2 = new afhi();
            final afgc afgc2 = new afgc();
            final Iterator<Object> iterator2 = ((List<Object>)alyd.b.d).iterator();
            while (iterator2.hasNext()) {
                final ahcr builder = iterator2.next().toBuilder();
                final vgx a = alyd.a;
                afgc2.h(new alyc((alyg)builder.build()));
            }
            final aflv d2 = afgc2.g().D();
            while (((Iterator)d2).hasNext()) {
                final alyc alyc = (alyc)((Iterator)d2).next();
                afhi2.j(new afhi().g());
            }
            final afgc afgc3 = new afgc();
            final Iterator<Object> iterator3 = ((List<Object>)alyd.b.e).iterator();
            while (iterator3.hasNext()) {
                final ahcr builder2 = iterator3.next().toBuilder();
                final vgx a2 = alyd.a;
                afgc3.h(new alye((alyi)builder2.build()));
            }
            final aflv d3 = afgc3.g().D();
            while (((Iterator)d3).hasNext()) {
                final alye alye = (alye)((Iterator)d3).next();
                afhi2.j(new afhi().g());
            }
            afhi.j(afhi2.g());
        }
        aisd aisd;
        if ((aisd = this.b.e) == null) {
            aisd = aisd.a;
        }
        final aisd aisd2 = (aisd)((ahcr)((ahcz)aisd).toBuilder()).build();
        afhi.j(new afhi().g());
        return afhi.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aisb && ((ahcz)this.b).equals(((aisb)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("CommandModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
