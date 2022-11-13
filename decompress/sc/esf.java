import java.util.Set;
import android.app.Application;
import java.io.File;
import java.util.List;
import java.util.Iterator;
import android.content.ComponentCallbacks;
import android.os.MessageQueue$IdleHandler;
import android.os.Looper;
import com.google.android.libraries.youtube.systemhealth.termination.NativeCrashDetectorUtil;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esf implements Runnable
{
    public final Object a;
    private final int b;
    
    public esf(final esm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esf(final tok a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        int n = 1;
        switch (b) {
            default: {
                ((acgm)((esm)this.a).aJ.a()).b();
                return;
            }
            case 19: {
                ((vlq)((esm)this.a).aw.a()).f();
                return;
            }
            case 18: {
                ((esm)this.a).s.a();
                return;
            }
            case 17: {
                final adlp adlp = (adlp)((esm)this.a).aZ.a();
                ((tgd)adlp.f).g(adlp.d);
                ((tgd)adlp.f).g(adlp.e);
                final Object a = ((abqg)adlp.g).a;
                final Object a2 = adlp.a;
                a2.getClass();
                ((ashi)a).am((asjm)new abpj((abzv)a2, 12));
                final Object k = ((abqg)adlp.g).k;
                final Object a3 = adlp.a;
                a3.getClass();
                ((ashi)k).am((asjm)new abpj((abzv)a3, 13));
                final Iterator<Object> iterator = ((Set<Object>)adlp.c).iterator();
                while (iterator.hasNext()) {
                    abjr.f((abjq)iterator.next());
                }
                final Iterator<Object> iterator2 = ((Set<Object>)adlp.b).iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().a();
                }
                return;
            }
            case 16: {
                final esm esm = (esm)this.a;
                ((vjx)esm.ay.a()).lX((abpu)((adet)esm.ax.a()).a);
                return;
            }
            case 15: {
                final abux abux = (abux)((esm)this.a).L.a();
                abux.a.c((abuk)abux);
                final afkf d = ((afeq)abux.b.a()).D();
                while (((Iterator)d).hasNext()) {
                    ((abuu)((Iterator)d).next()).f();
                }
                return;
            }
            case 14: {
                final esm esm2 = (esm)this.a;
                ((atjy)((aeea)esm2.aN.a()).a).ts((Object)false);
                esm2.aj.a();
                final vko vko = (vko)esm2.ak.a();
                vko.b();
                vko.c.a();
                vko.a.a();
                ((vmb)vko.b.a()).a();
                final aklf aklf = (aklf)vko.f.a();
                ((hyo)esm2.al.a()).a.a();
                esm2.am.a();
                return;
            }
            case 13: {
                final esm esm3 = (esm)this.a;
                esm3.bN.ts((Object)((boolean)esm3.bm.a() ^ true));
                return;
            }
            case 12: {
                final fle fle = (fle)((esm)this.a).U.a();
                fle.a.g((Object)fle);
                fle.a();
                return;
            }
            case 11: {
                final inf inf = (inf)((esm)this.a).T.a();
                inf.b();
                inf.b.g((Object)inf);
                return;
            }
            case 10: {
                ((wxl)((esm)this.a).ad.a()).a();
                return;
            }
            case 9: {
                ((esm)this.a).r.a();
                return;
            }
            case 8: {
                final aujg aujg = (aujg)((esm)this.a).aW.a();
                final List q = adkp.q((adiz)aujg.a, adjb.b);
                final Object a4 = aujg.a;
                final adjb a5 = adjb.a;
                final adiz adiz = (adiz)a4;
                final List q2 = adkp.q(adiz, a5);
                final File y = adkp.y((Context)adiz.c);
                try {
                    if (y.exists()) {
                        q2.add(y);
                    }
                }
                catch (final SecurityException ex) {
                    adkp.s(String.format("AnrJV3 !v1journal '%s'", y), (Throwable)ex);
                }
                final NativeCrashDetectorUtil nativeCrashDetectorUtil = (NativeCrashDetectorUtil)((atke)aujg.c).a();
                final File b2 = NativeCrashDetectorUtil.b((Context)((adiz)aujg.a).c);
                File[] listFiles;
                try {
                    listFiles = b2.listFiles();
                }
                catch (final SecurityException ex2) {
                    listFiles = null;
                }
                if (q.isEmpty()) {
                    if (listFiles != null) {
                        n = 2;
                    }
                    else if (!q2.isEmpty()) {
                        n = 3;
                    }
                    else {
                        n = 7;
                    }
                }
                ((tok)aujg.b).m(tok.h, n);
                return;
            }
            case 7: {
                ((esm)this.a).ba.a();
                return;
            }
            case 6: {
                ((esm)this.a).u.a();
                return;
            }
            case 5: {
                final Object a6 = this.a;
                tbi.f();
                Looper.myQueue().addIdleHandler((MessageQueue$IdleHandler)a6);
                final Application q3 = ((tok)a6).q;
                if (q3 != null) {
                    q3.registerComponentCallbacks((ComponentCallbacks)a6);
                }
                return;
            }
            case 4: {
                ((esm)this.a).t.a();
                return;
            }
            case 3: {
                ((tcl)((esm)this.a).Z.a()).b();
                return;
            }
            case 2: {
                ((esm)this.a).d.i(3);
                return;
            }
            case 1: {
                ((tmx)((esm)this.a).aP.a()).a();
                return;
            }
            case 0: {
                ((esm)this.a).d.i(3);
            }
        }
    }
}
