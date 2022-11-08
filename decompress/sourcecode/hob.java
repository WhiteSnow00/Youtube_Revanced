import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint;
import android.text.TextUtils;
import android.os.Bundle;
import android.content.Context;
import java.util.concurrent.Callable;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.q;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hob
{
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    public hob(final Activity activity, ashe ashe, final mrm c, final kct kct, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        final ashe ak = c.v(tfo.a).ak((asjc)new q((Callable)new exk(ashe, activity, 12), 15));
        this.d = ak;
        final asgm c2 = asgm.c;
        final ashe ashe2 = ak;
        final asgt tw = asgt.e((aujo)ak.i(c2), (aujo)((asgt)kct.a).L((asjc)gkj.c).p(), (asit)exh.i).V().ax().tw();
        this.b = tw;
        final gkj d = gkj.d;
        final ashe ashe3 = ak;
        ak.W((asjc)d).W((asjc)gkj.e).i(asgm.c);
        final gkj f = gkj.f;
        final asgt asgt = tw;
        this.f = tw.L((asjc)f);
        final gkj g = gkj.g;
        final asgt asgt2 = tw;
        this.e = tw.L((asjc)g);
        final gkj h = gkj.h;
        ashe = ak;
        ak.W((asjc)h).i(asgm.c);
    }
    
    public hob(final hku c, final acnx d, final hrf b, final arud e, final hmm f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
        this.f = f;
    }
    
    public static akiy d(final Context context) {
        final int be = tmy.be(context);
        akiy akiy;
        if (be != 1 && be != 2) {
            if (be != 3 && be != 4) {
                akiy = akiy.a;
            }
            else {
                akiy = akiy.c;
            }
        }
        else {
            akiy = akiy.b;
        }
        return akiy;
    }
    
    private final boolean e() {
        anqh anqh;
        if ((anqh = ((arud)this.e).f().u) == null) {
            anqh = anqh.a;
        }
        anqt anqt;
        if ((anqt = anqh.d) == null) {
            anqt = anqt.a;
        }
        return anqt != null && anqt.r;
    }
    
    final aioe a(final aioe aioe) {
        final agza u = iba.U(aioe);
        if (((amob)u.instance).c.isEmpty() || ((amob)u.instance).d == 22156) {
            final Object a = ((acnx)this.d).a;
            String c = null;
            if (a != null) {
                final amob s = iba.S(acnx.i((Bundle)a));
                if (s != null) {
                    c = s.c;
                }
            }
            if (c != null) {
                u.copyOnWrite();
                final amob amob = (amob)u.instance;
                amob.b |= 0x1;
                amob.c = c;
            }
        }
        final agzc agzc = (agzc)((agzi)aioe).toBuilder();
        agzc.e((agyr)amoa.b, u.build());
        return (aioe)agzc.build();
    }
    
    public final void b(final wwv wwv) {
        if (this.a) {
            wwv.s();
            this.a = false;
        }
    }
    
    final void c(final wwv wwv, final aioe aioe, final String c, final String s, final boolean b) {
        if (this.e()) {
            ((hmm)this.f).c("r_lns");
        }
        alff alff2;
        if (!TextUtils.isEmpty((CharSequence)c)) {
            final agza builder = ((agzi)alff.a).createBuilder();
            final agza builder2 = ((agzi)alfm.a).createBuilder();
            builder2.copyOnWrite();
            final alfm alfm = (alfm)builder2.instance;
            c.getClass();
            alfm.b |= 0x1;
            alfm.c = c;
            builder.copyOnWrite();
            final alff alff = (alff)builder.instance;
            final alfm k = (alfm)builder2.build();
            k.getClass();
            alff.k = k;
            alff.b |= 0x40;
            alff2 = (alff)builder.build();
        }
        else {
            alff2 = null;
        }
        if (((agzd)aioe).rs((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)) {
            anss anss;
            if ((anss = ((ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((agzd)aioe).rr((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)).b) == null) {
                anss = anss.a;
            }
            final anqm anqm = (anqm)((agzd)anss).rr((agyr)ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer);
            anuk anuk;
            if ((anuk = anqm.b) == null) {
                anuk = anuk.a;
            }
            final int b2 = anuk.b;
            final int n = 83769;
            int c2;
            if ((b2 & 0x1) != 0x0) {
                anuk anuk2;
                if ((anuk2 = anqm.b) == null) {
                    anuk2 = anuk.a;
                }
                c2 = anuk2.c;
            }
            else {
                c2 = 83769;
            }
            if (c2 == 83769) {
                hjp.a(zjo.b, zjn.x, "ReelNonVideoContentRenderer did not provide a screen VE type. Logging as UNKNOWN_PAGE.");
                c2 = n;
            }
            wwv.b(wya.b(c2), aioe, (alff)null);
        }
        else {
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            int z;
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 0x4000000) != 0x0) {
                z = reelWatchEndpointOuterClass$ReelWatchEndpoint.z;
            }
            else {
                z = 37414;
            }
            wwv.c(wya.b(z), wxr.a, aioe, (alff)null, alff2);
        }
        this.a = true;
        if (b && !TextUtils.isEmpty((CharSequence)s)) {
            wwv.q(s);
        }
        final Bundle g = acnx.g(wwv);
        if (g != null) {
            ((acnx)this.d).a = g;
        }
        final Object c3 = this.c;
        if (((agzd)aioe).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((agzd)aioe).rr((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            final hku hku = (hku)c3;
            if (hku.a.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint2)) {
                final sey sey = hku.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint2);
                sey.e = true;
                hku.d((trb)new hks(sey, 6));
            }
        }
        else if (((agzd)aioe).rs((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint)) {
            final ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint reelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint = (ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint)((agzd)aioe).rr((agyr)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint);
            final hku hku2 = (hku)c3;
            final aexq c4 = hku2.c(reelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint);
            if (c4.h()) {
                final sez sez = (sez)c4.c();
                sez.e = true;
                hku2.d((trb)new hks(sez, 7));
            }
        }
        wwv.l((wxz)new wws(wya.c(22156)));
        wwv.l((wxz)new wws(wya.c(37419)));
        wwv.l((wxz)new wws(wya.c(37420)));
        wwv.l((wxz)new wws(wya.c(56922)));
        wwv.l((wxz)new wws(wya.c(56921)));
        wwv.l((wxz)new wws(wya.c(58160)));
        if (this.e()) {
            ((hmm)this.f).c("r_lnsc");
        }
    }
}
