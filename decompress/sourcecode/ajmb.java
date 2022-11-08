import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmb
{
    private final vdo a;
    private final ajmd b;
    
    public ajmb(final ajmd b, final vdo a) {
        this.b = b;
        this.a = a;
    }
    
    public static aglk b(final ajmd ajmd) {
        return new aglk(((agzi)ajmd).toBuilder());
    }
    
    public final afdu a() {
        final afds afds = new afds();
        aorm aorm;
        if ((aorm = this.b.f) == null) {
            aorm = aorm.a;
        }
        afds.j((Iterable)aoro.b(aorm).J(this.a).a());
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.b.i).iterator();
        while (iterator.hasNext()) {
            afcm.h(new ajmc((ajme)((agzi)iterator.next()).toBuilder().build(), this.a));
        }
        final afif d = afcm.g().D();
        while (((Iterator)d).hasNext()) {
            final ajmc ajmc = (ajmc)((Iterator)d).next();
            final afds afds2 = new afds();
            final afcm afcm2 = new afcm();
            final Iterator<Object> iterator2 = ((List<Object>)ajmc.b.b).iterator();
            while (iterator2.hasNext()) {
                afcm2.h(aoro.b(iterator2.next()).J(ajmc.a));
            }
            final afif d2 = afcm2.g().D();
            while (((Iterator)d2).hasNext()) {
                afds2.j((Iterable)((aoro)((Iterator)d2).next()).a());
            }
            afds.j((Iterable)afds2.g());
        }
        return afds.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajmb && ((agzi)this.b).equals(((ajmb)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
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
