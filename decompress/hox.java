import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint;
import android.text.TextUtils;
import android.os.Bundle;
import android.content.Context;
import java.util.concurrent.Callable;
import com.google.android.apps.youtube.embeddedplayer.service.jar.e;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hox
{
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    public hox(final Activity activity, final asht asht, final msr c, final jki jki, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        final asht aq = c.L(tht.a).aq((asjr)new e((Callable)new exo(asht, activity, 12), 16));
        this.d = aq;
        final ashb c2 = ashb.c;
        final asht asht2 = aq;
        final ashi tz = ashi.e((auke)aq.i(c2), (auke)((ashi)jki.b).L((asjr)gkr.c).p(), (asji)exl.i).V().ay().tz();
        this.b = tz;
        final gkr d = gkr.d;
        final asht asht3 = aq;
        aq.Z((asjr)d).Z((asjr)gkr.e).i(ashb.c);
        final gkr f = gkr.f;
        final ashi ashi = tz;
        this.f = tz.L((asjr)f);
        final gkr g = gkr.g;
        final ashi ashi2 = tz;
        this.e = tz.L((asjr)g);
        final gkr h = gkr.h;
        final asht asht4 = aq;
        aq.Z((asjr)h).i(ashb.c);
    }
    
    public hox(final hlq c, final acqb d, final hrz b, final arwh e, final hng f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
        this.f = f;
    }
    
    public static aklb d(final Context context) {
        final int be = tpe.be(context);
        aklb aklb;
        if (be != 1 && be != 2) {
            if (be != 3 && be != 4) {
                aklb = aklb.a;
            }
            else {
                aklb = aklb.c;
            }
        }
        else {
            aklb = aklb.b;
        }
        return aklb;
    }
    
    private final boolean e() {
        ansk ansk;
        if ((ansk = ((arwh)this.e).f().u) == null) {
            ansk = ansk.a;
        }
        answ answ;
        if ((answ = ansk.d) == null) {
            answ = answ.a;
        }
        return answ != null && answ.r;
    }
    
    final aiqj a(final aiqj aiqj) {
        final ahaz k = hko.K(aiqj);
        if (((amqg)k.instance).c.isEmpty() || ((amqg)k.instance).d == 22156) {
            final Object a = ((acqb)this.d).a;
            String c = null;
            if (a != null) {
                final amqg i = hko.I(acqb.e((Bundle)a));
                if (i != null) {
                    c = i.c;
                }
            }
            if (c != null) {
                k.copyOnWrite();
                final amqg amqg = (amqg)k.instance;
                amqg.b |= 0x1;
                amqg.c = c;
            }
        }
        final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
        ahbb.e((ahaq)amqf.b, (Object)k.build());
        return (aiqj)((ahaz)ahbb).build();
    }
    
    public final void b(final wyw wyw) {
        if (this.a) {
            wyw.s();
            this.a = false;
        }
    }
    
    final void c(final wyw wyw, final aiqj aiqj, final String c, final String s, final boolean b) {
        if (this.e()) {
            ((hng)this.f).c("r_lns");
        }
        alhi alhi2;
        if (!TextUtils.isEmpty((CharSequence)c)) {
            final ahaz builder = ((ahbh)alhi.a).createBuilder();
            final ahaz builder2 = ((ahbh)alhp.a).createBuilder();
            builder2.copyOnWrite();
            final alhp alhp = (alhp)builder2.instance;
            c.getClass();
            alhp.b |= 0x1;
            alhp.c = c;
            builder.copyOnWrite();
            final alhi alhi = (alhi)builder.instance;
            final alhp k = (alhp)builder2.build();
            k.getClass();
            alhi.k = k;
            alhi.b |= 0x40;
            alhi2 = (alhi)builder.build();
        }
        else {
            alhi2 = null;
        }
        if (((ahbc)aiqj).ry((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)) {
            anuv anuv;
            if ((anuv = ((ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((ahbc)aiqj).rx((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)).b) == null) {
                anuv = anuv.a;
            }
            final ansq ansq = (ansq)((ahbc)anuv).rx((ahaq)ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer);
            anwn anwn;
            if ((anwn = ansq.b) == null) {
                anwn = anwn.a;
            }
            final int b2 = anwn.b;
            final int n = 83769;
            int c2;
            if ((b2 & 0x1) != 0x0) {
                anwn anwn2;
                if ((anwn2 = ansq.b) == null) {
                    anwn2 = anwn.a;
                }
                c2 = anwn2.c;
            }
            else {
                c2 = 83769;
            }
            if (c2 == 83769) {
                hko.L(zll.b, zlk.x, "ReelNonVideoContentRenderer did not provide a screen VE type. Logging as UNKNOWN_PAGE.");
                c2 = n;
            }
            wyw.b(xaa.b(c2), aiqj, (alhi)null);
        }
        else {
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            int z;
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x4000000) != 0x0) {
                z = reelWatchEndpointOuterClass$ReelWatchEndpoint.z;
            }
            else {
                z = 37414;
            }
            wyw.c(xaa.b(z), wzr.a, aiqj, (alhi)null, alhi2);
        }
        this.a = true;
        if (b && !TextUtils.isEmpty((CharSequence)s)) {
            wyw.q(s);
        }
        final Bundle c3 = acqb.c(wyw);
        if (c3 != null) {
            ((acqb)this.d).a = c3;
        }
        final Object c4 = this.c;
        if (((ahbc)aiqj).ry((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            final hlq hlq = (hlq)c4;
            if (hlq.a.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint2)) {
                final shd shd = hlq.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint2);
                shd.e = true;
                hlq.d((ttg)new hlo(shd, 6));
            }
        }
        else if (((ahbc)aiqj).ry((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)) {
            final ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint reelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint = (ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((ahbc)aiqj).rx((ahaq)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint);
            final hlq hlq2 = (hlq)c4;
            final aezp c5 = hlq2.c(reelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint);
            if (c5.h()) {
                final she she = (she)c5.c();
                she.e = true;
                hlq2.d((ttg)new hlo(she, 7));
            }
        }
        wyw.l((wzz)new wyt(xaa.c(22156)));
        wyw.l((wzz)new wyt(xaa.c(37419)));
        wyw.l((wzz)new wyt(xaa.c(37420)));
        wyw.l((wzz)new wyt(xaa.c(56922)));
        wyw.l((wzz)new wyt(xaa.c(56921)));
        wyw.l((wzz)new wyt(xaa.c(58160)));
        if (this.e()) {
            ((hng)this.f).c("r_lnsc");
        }
    }
}
