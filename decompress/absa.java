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

public final class absa implements asmn
{
    public final Object a;
    private final int b;
    
    public absa(final aapv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final abrk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final acjq a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final acvc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final adlp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final afax a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final aheu a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public absa(final asqo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Object a(Object b) {
        final int b2 = this.b;
        final boolean b3 = false;
        switch (b2) {
            default: {
                return ((asqo)this.a).d.a(new Object[] { b });
            }
            case 7: {
                final Object a = this.a;
                final adoj adoj = (adoj)b;
                final int t = adlk.t;
                final ahcr builder = adoj.toBuilder();
                builder.copyOnWrite();
                final adoj adoj2 = (adoj)builder.instance;
                adoj2.b |= 0x4000;
                adoj2.q = true;
                final adlp adlp = (adlp)a;
                adlp.a.ifPresent((Consumer)new achl(builder, 7));
                adlp.b.ifPresent((Consumer)new achl(builder, 8));
                return builder.build();
            }
            case 6: {
                final Object a2 = this.a;
                final Optional optional = (Optional)b;
                final adzx a3 = ((acvc)a2).a;
                a3.getClass();
                return optional.map((Function)new yte(a3, 20, (byte[])null)).orElse((Object)askp.I());
            }
            case 5: {
                final aheu aheu = (aheu)this.a;
                for (final acsq acsq : aheu.a) {
                    if (acsq.e() != null && acsq.e().a(b)) {
                        b = acsq;
                        return b;
                    }
                }
                b = aheu.b;
                return b;
            }
            case 4: {
                final Object a4 = this.a;
                final aanp aanp = (aanp)b;
                final Object d = ((acjq)a4).d;
                final ajad b4 = aanp.b();
                final PlayerResponseModel a5 = aanp.a();
                boolean d2;
                if ((b4.b & 0x2) != 0x0) {
                    d2 = b4.d;
                }
                else {
                    final int s = ((abkq)d).s;
                    final PlayerConfigModel m = a5.m();
                    d2 = b3;
                    if (m != null) {
                        if (!m.ax()) {
                            d2 = b3;
                            if (!m.az()) {
                                return d2;
                            }
                            d2 = b3;
                            if (s != 1) {
                                return d2;
                            }
                        }
                        d2 = true;
                    }
                }
                return d2;
            }
            case 3: {
                return new Pair((Object)((aapv)this.a).a(), b);
            }
            case 2: {
                final Object a6 = this.a;
                final aapv aapv = (aapv)b;
                return ((aske)((afax)a6).apply(aapv.a())).L(new absa(aapv, 3));
            }
            case 1: {
                final Object a7 = this.a;
                final aapv aapv2 = (aapv)b;
                ((abrk)a7).b.r();
                return aapv2.a().Y().f();
            }
            case 0: {
                return ((afax)this.a).apply(((aapv)b).a());
            }
        }
    }
}
