import j$.util.function.Consumer$_CC;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import j$.time.Duration;
import java.util.function.Function;
import j$.util.Optional;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.Map;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;
import java.util.List;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihs implements Consumer
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public ihs(final aaoz b, final List c, final RuntimeStreamWriter a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public ihs(final amfu a, final String b, final String c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ihs(final WatchNextResponseModel a, final String c, final PlayerResponseModel b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ihs(final fdd c, final acfw b, final vqo a, final int d, final byte[] array) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ihs(final ffh a, final String b, final String c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ihs(final String c, final appm b, final afeq a, final int d) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ihs(final List a, final Map b, final Map c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public ihs(final jzq a, final ackm c, final acbj b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ihs(final koq a, final anjf c, final ackm b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ihs(final twj a, final atke c, final String b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ihs(final wzc a, final Consumer c, final InteractionLoggingScreen b, final int d) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ihs(final wzz a, final wzz b, final ahaz c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void accept(final Object o) {
        switch (this.d) {
            default: {
                final Object c = this.c;
                final Object b = this.b;
                final Object a = this.a;
                if (o == ajtv.c) {
                    final String f = ((acfw)b).f;
                    final fdd fdd = (fdd)c;
                    Optional.ofNullable((Object)((vdr)fdd.e).a(((zmf)fdd.f).c()).f(f).j(ajtr.class).af()).map((Function)achg.a).ifPresent((Consumer)new aaxy((vqo)a, 14));
                    return;
                }
                break;
            }
            case 10: {
                final Object b2 = this.b;
                final Object c2 = this.c;
                final Object a2 = this.a;
                final Optional optional = (Optional)o;
                final Iterator iterator = ((List)c2).iterator();
                while (iterator.hasNext()) {
                    ((aaoz)b2).a.k((abvy)iterator.next());
                }
                ((aaoz)b2).b.remove(a2);
                return;
            }
            case 9: {
                final Object c3 = this.c;
                final Object b3 = this.b;
                final Object a3 = this.a;
                final aknr aknr = (aknr)o;
                final alga t = wzc.t((String)c3, (appm)b3, (afeq)a3);
                ((ahaz)aknr).copyOnWrite();
                aknt.aM((aknt)aknr.instance, t);
                return;
            }
            case 8: {
                final Object a4 = this.a;
                final Object c4 = this.c;
                final Object b4 = this.b;
                final aknr aknr2 = (aknr)o;
                ((Consumer<aknr>)c4).accept(aknr2);
                final InteractionLoggingScreen interactionLoggingScreen = (InteractionLoggingScreen)b4;
                if (((wzc)a4).m(interactionLoggingScreen)) {
                    wzc.A(aknr2, interactionLoggingScreen);
                }
                return;
            }
            case 7: {
                ((adqj)o).f((String)((atke)this.c).a(), (String)this.b, Duration.ofMillis(((twj)this.a).b()));
                return;
            }
            case 6: {
                ((rqb)o).j((WatchNextResponseModel)this.a, (String)this.c, (PlayerResponseModel)this.b);
                return;
            }
            case 5: {
                final Object a5 = this.a;
                final Object b5 = this.b;
                final Object c5 = this.c;
                final atzj atzj = (atzj)o;
                final int k = rcp.k;
                atzj.a((amfu)a5, (String)b5, (String)c5);
                return;
            }
            case 4: {
                final Object a6 = this.a;
                final Object b6 = this.b;
                final Object c6 = this.c;
                final wyw wyw = (wyw)o;
                final wzz wzz = (wzz)b6;
                final wzz wzz2 = (wzz)a6;
                wyw.F(wzz2, wzz);
                final ahaz builder = ((ahbh)alhi.a).createBuilder();
                builder.copyOnWrite();
                final alhi alhi = (alhi)builder.instance;
                final alir a7 = (alir)((ahaz)c6).build();
                a7.getClass();
                alhi.A = a7;
                alhi.c |= 0x8000;
                wyw.t(wzz2, (alhi)builder.build());
                return;
            }
            case 3: {
                final Object a8 = this.a;
                final Object c7 = this.c;
                final Object b7 = this.b;
                final tsu tsu = (tsu)o;
                final List list = (List)asht.U((Iterable)((anjf)c7).s).K((asjs)kcz.g).Z((asjr)jxh.u).aF().ac();
                final koq koq = (koq)a8;
                koq.l = khl.l((ackm)b7, c7, list, koq.f, tsu, koq.k);
                return;
            }
            case 2: {
                final Object a9 = this.a;
                final Object c8 = this.c;
                final Object b8 = this.b;
                final acko acko = (acko)o;
                final jzq jzq = (jzq)a9;
                jzq.d.add(acko);
                acko.mN((ackm)c8, b8);
                jzq.c.addView(acko.a(), -1, -2);
                return;
            }
            case 1: {
                final Object a10 = this.a;
                final Object b9 = this.b;
                final Object c9 = this.c;
                final almm almm = (almm)o;
                final String s = (String)b9;
                if (!aezr.f(s)) {
                    ((ffh)a10).a.add(ffg.a(s, TimeUnit.MICROSECONDS.toMillis(almm.f)));
                }
                final String s2 = (String)c9;
                if (!aezr.f(s2)) {
                    ((ffh)a10).a.add(ffg.a(s2, TimeUnit.MICROSECONDS.toMillis(almm.f + almm.e)));
                }
                return;
            }
            case 0: {
                final Object a11 = this.a;
                final Object b10 = this.b;
                final Object c10 = this.c;
                final amul amul = (amul)o;
                amuj amuj;
                if ((amuj = amul.e) == null) {
                    amuj = amuj.b;
                }
                final alzg alzg = (alzg)((ahbc)amuj).rx((ahaq)alzg.b);
                final String i = vgl.i(amul.d);
                ((List<String>)a11).add(i);
                ((Map<String, Integer>)b10).put(i, Integer.valueOf(ihy.j(alzg)));
                if ((alzg.c & 0x80) != 0x0) {
                    ((Map<String, Integer>)c10).put(i, Integer.valueOf(alzg.k));
                    break;
                }
                break;
            }
        }
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        switch (this.d) {
            default: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 10: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 9: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 8: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 7: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 6: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 5: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 4: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 3: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 2: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 1: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 0: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
        }
    }
}
