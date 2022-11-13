import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.HashMap;
import java.util.ArrayList;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kja
{
    public final Context a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public View g;
    
    public kja(final acgs f, final asid e, final zhk b, final Context a, final atjm d) {
        this.c = new asiq();
        this.f = f;
        this.b = b;
        this.e = e;
        this.a = a;
        this.d = d;
    }
    
    public kja(final Context a, final bx b, final kdt f, final kdt c, final kdt e, final elx d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.f = f;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
        this.a = a;
    }
    
    public kja(final Context a, final vcy b, final arwh d, final aeea f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
        this.c = new ArrayList();
        this.d = d;
        this.e = new HashMap();
        this.f = f;
    }
    
    public static final aotp c(final amco amco, final int n) {
        if (amco.l.size() > n) {
            return (aotp)amco.l.get(n);
        }
        String.format(Locale.getDefault(), "No autogen thumbnail #%d, got only %d", n, amco.l.size());
        aotp aotp;
        if ((aotp = amco.k) == null) {
            aotp = aotp.a;
        }
        return aotp;
    }
    
    public final List a() {
        final ArrayList list = new ArrayList();
        for (final kiz kiz : this.c) {
            final kix a = kiz.a;
            final ajvl b = kiz.b;
            if (!(a instanceof kio)) {
                final ahaz builder = ((ahbh)eiv.a).createBuilder();
                final ahaz builder2 = ((ahbh)eix.a).createBuilder();
                final String f = a.f();
                builder2.copyOnWrite();
                final eix eix = (eix)builder2.instance;
                f.getClass();
                eix.b |= 0x1;
                eix.c = f;
                builder.copyOnWrite();
                final eiv eiv = (eiv)builder.instance;
                final eix d = (eix)builder2.build();
                d.getClass();
                eiv.d = d;
                eiv.c = 4;
                final String d2 = b.d;
                builder.copyOnWrite();
                final eiv eiv2 = (eiv)builder.instance;
                d2.getClass();
                eiv2.b |= 0x1;
                eiv2.e = d2;
                final boolean h = a.h();
                builder.copyOnWrite();
                final eiv eiv3 = (eiv)builder.instance;
                eiv3.b |= 0x2;
                eiv3.f = h;
                list.add(builder.build());
            }
        }
        return list;
    }
    
    public final void b() {
        ((asiq)this.c).dispose();
    }
    
    public final void d(final amco amco, final aujg aujg) {
        aotp aotp;
        if ((aotp = amco.k) == null) {
            aotp = aotp.a;
        }
        if (aotp.c.size() > 0) {
            aotp aotp2;
            if ((aotp2 = amco.k) == null) {
                aotp2 = aotp.a;
            }
            aujg.an(aotp2);
            return;
        }
        final Bitmap decodeResource = BitmapFactory.decodeResource(this.a.getResources(), 2131232010);
        if (((atjm)this.d).ba()) {
            ((asiq)this.c).c(((asht)this.d).af((asid)this.e).aH((asjm)new fdu(decodeResource, aujg, 15, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null)));
            return;
        }
        aujg.ao(aezp.j((Object)decodeResource));
    }
}
