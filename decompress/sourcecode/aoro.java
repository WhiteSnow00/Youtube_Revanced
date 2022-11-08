import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoro
{
    private final vdo a;
    private final aorm b;
    
    public aoro(final aorm b, final vdo a) {
        this.b = b;
        this.a = a;
    }
    
    public static aeby b(final aorm aorm) {
        return new aeby((agzc)((agzi)aorm).toBuilder());
    }
    
    public final afdu a() {
        final afds afds = new afds();
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.b.c).iterator();
        while (iterator.hasNext()) {
            afcm.h(new aorp((aorl)iterator.next().toBuilder().build()));
        }
        final afif d = afcm.g().D();
        while (((Iterator)d).hasNext()) {
            final aorp aorp = (aorp)((Iterator)d).next();
            afds.j((Iterable)new afds().g());
        }
        ahgn ahgn;
        if ((ahgn = this.b.d) == null) {
            ahgn = ahgn.a;
        }
        afds.j((Iterable)ahgl.b(ahgn).o(this.a).a());
        aorj aorj;
        if ((aorj = this.b.e) == null) {
            aorj = aorj.a;
        }
        final aorn aorn = new aorn((aorj)aorj.toBuilder().build());
        final afds afds2 = new afds();
        alun alun;
        if ((alun = aorn.a.b) == null) {
            alun = alun.a;
        }
        final alun alun2 = (alun)((agzi)alun).toBuilder().build();
        afds2.j((Iterable)new afds().g());
        afds.j((Iterable)afds2.g());
        aork aork;
        if ((aork = this.b.g) == null) {
            aork = aork.a;
        }
        final aork aork2 = (aork)aork.toBuilder().build();
        afds.j((Iterable)new afds().g());
        allu allu;
        if ((allu = this.b.h) == null) {
            allu = allu.a;
        }
        allt.b(allu).C();
        afds.j((Iterable)allt.a());
        allu allu2;
        if ((allu2 = this.b.i) == null) {
            allu2 = allu.a;
        }
        allt.b(allu2).C();
        afds.j((Iterable)allt.a());
        return afds.g();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aoro && ((agzi)this.b).equals(((aoro)o).b);
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ThumbnailDetailsModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
