import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import android.util.Pair;
import java.util.function.Function;
import j$.util.Optional;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abqq implements asjr
{
    public final Object a;
    private final int b;
    
    public abqq(final aany a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abqq(final acid a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public abqq(final actr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abqq(final adka a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abqq(final aekp a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public abqq(final aezf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abqq(final asns a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a(Object a) {
        final int b = this.b;
        final boolean b2 = false;
        switch (b) {
            default: {
                return ((asns)this.a).d.a((Object)new Object[] { a });
            }
            case 6: {
                final Object a2 = this.a;
                final admv admv = (admv)a;
                final int t = adjv.t;
                final ahaz builder = ((ahbh)admv).toBuilder();
                builder.copyOnWrite();
                final admv admv2 = (admv)builder.instance;
                admv2.b |= 0x4000;
                admv2.q = true;
                final adka adka = (adka)a2;
                adka.a.ifPresent((Consumer)new adjk(builder, 1));
                adka.b.ifPresent((Consumer)new adjk(builder, 0));
                return builder.build();
            }
            case 5: {
                final Object a3 = this.a;
                final Optional optional = (Optional)a;
                final afhd a4 = ((actr)a3).a;
                a4.getClass();
                return optional.map((Function)new yud(a4, 19, (byte[])null, (byte[])null)).orElse((Object)asht.I());
            }
            case 4: {
                final aekp aekp = (aekp)this.a;
                for (final acrf acrf : aekp.b) {
                    if (acrf.e() != null && acrf.e().a(a)) {
                        a = acrf;
                        return a;
                    }
                }
                a = aekp.a;
                return a;
            }
            case 3: {
                final Object a5 = this.a;
                final aals aals = (aals)a;
                final Object d = ((acid)a5).d;
                final aiyf b3 = aals.b();
                final PlayerResponseModel a6 = aals.a();
                boolean d2;
                if ((0x2 & b3.b) != 0x0) {
                    d2 = b3.d;
                }
                else {
                    final int s = ((abjj)d).s;
                    final PlayerConfigModel m = a6.m();
                    d2 = b2;
                    if (m != null) {
                        if (!m.ax()) {
                            d2 = b2;
                            if (!m.az()) {
                                return d2;
                            }
                            d2 = b2;
                            if (s != 1) {
                                return d2;
                            }
                        }
                        d2 = true;
                    }
                }
                return d2;
            }
            case 2: {
                return new Pair((Object)((aany)this.a).a(), a);
            }
            case 1: {
                return ((aezf)this.a).apply((Object)((aany)a).a());
            }
            case 0: {
                final Object a7 = this.a;
                final aany aany = (aany)a;
                return ((ashi)((aezf)a7).apply((Object)aany.a())).L((asjr)new abqq(aany, 2));
            }
        }
    }
}
