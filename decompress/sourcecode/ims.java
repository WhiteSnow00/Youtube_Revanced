import java.util.List;
import android.util.Pair;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ims implements aagn
{
    private final Activity a;
    private final Context b;
    private final vax c;
    private final aafo d;
    private final hyr e;
    private final aeby f;
    private final aeby g;
    
    public ims(final Activity a, final Context b, final vax c, final aafo d, final hyr e, final aeby g, final aeby f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = f;
    }
    
    public final void a(Object o, final wwv wwv, final Pair pair, final aagx aagx) {
        if (this.a.isFinishing()) {
            return;
        }
        if (o instanceof aiva && wwv != null) {
            abyv.o(this.b, (aiva)o, this.c, wwv, this.g, (abyu)new imr(1), (Object)null, this.f);
            return;
        }
        if (o instanceof ajcz && wwv != null) {
            final ajcz ajcz = (ajcz)o;
            final hyr e = this.e;
            final agza builder = aiva.a.createBuilder();
            if ((ajcz.b & 0x2) != 0x0) {
                final ajsq g = abyh.g(new String[] { ajcz.d });
                builder.copyOnWrite();
                final aiva aiva = (aiva)builder.instance;
                g.getClass();
                aiva.c = g;
                aiva.b |= 0x1;
            }
            if ((ajcz.b & 0x4) != 0x0) {
                builder.aF(abyh.g(new String[] { ajcz.e }));
            }
            else if (!((List)ajcz.f).isEmpty()) {
                final agzy f = ajcz.f;
                builder.copyOnWrite();
                final aiva aiva2 = (aiva)builder.instance;
                aiva2.a();
                agxl.addAll((Iterable)f, (List)aiva2.g);
            }
            akbf e2;
            if ((e2 = ajcz.c) == null) {
                e2 = akbf.a;
            }
            builder.copyOnWrite();
            final aiva aiva3 = (aiva)builder.instance;
            e2.getClass();
            aiva3.e = e2;
            aiva3.b |= 0x10;
            final agyc h = ajcz.h;
            builder.copyOnWrite();
            final aiva aiva4 = (aiva)builder.instance;
            h.getClass();
            aiva4.b |= 0x80000;
            aiva4.o = h;
            ahfw j;
            if ((j = ajcz.g) == null) {
                j = ahfw.a;
            }
            builder.copyOnWrite();
            final aiva aiva5 = (aiva)builder.instance;
            j.getClass();
            aiva5.j = j;
            aiva5.b |= 0x800;
            final aibc y = hyr.y(((Context)e.a).getResources().getText(2132017891).toString());
            builder.copyOnWrite();
            final aiva aiva6 = (aiva)builder.instance;
            y.getClass();
            aiva6.i = y;
            aiva6.b |= 0x80;
            if (pair != null) {
                final aibc y2 = hyr.y((String)pair.first);
                builder.copyOnWrite();
                final aiva aiva7 = (aiva)builder.instance;
                y2.getClass();
                aiva7.h = y2;
                aiva7.b |= 0x40;
            }
            final aiva aiva8 = (aiva)builder.build();
            final Context b = this.b;
            final vax c = this.c;
            final aeby g2 = this.g;
            if (pair != null) {
                o = new imq(pair, 0);
            }
            else {
                o = new imr(0);
            }
            abyv.o(b, aiva8, c, wwv, g2, (abyu)o, (Object)null, this.f);
            return;
        }
        this.d.a(o, wwv, pair, (aagx)null);
    }
}
