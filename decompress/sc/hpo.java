import java.util.Map;
import java.util.function.Consumer;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelCommentsBottomBarUpdatedListener;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelBottomBarUpdatedListener;
import com.google.android.apps.youtube.app.common.ui.pip.observer.PipPlayerObserver;
import java.util.concurrent.Callable;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.function.Supplier;
import android.os.Bundle;
import java.util.function.Function;
import java.util.function.Predicate;
import j$.util.Optional;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelObscuredPlaybackSuspender;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpo extends hpk
{
    public afft a;
    public arkg ae;
    public asid af;
    public ReelObscuredPlaybackSuspender ag;
    public tqf ah;
    public atke ai;
    public hng aj;
    public arwh ak;
    public pa al;
    public blu am;
    public lmo an;
    public msr ao;
    public fzw ap;
    private Object aq;
    public Optional b;
    public final atjz c;
    public int d;
    public wyv e;
    
    public hpo() {
        this.a = afiq.a;
        this.b = Optional.empty();
        this.c = ((atjz)atjm.e()).bc();
        this.d = 0;
    }
    
    private final Optional aK() {
        return Optional.ofNullable((Object)((br)this).og().f("reel_watch_pager_fragment")).filter((Predicate)hoi.g).map((Function)hpl.c);
    }
    
    private final boolean aL() {
        ajrk ajrk;
        if ((ajrk = this.az.b().y) == null) {
            ajrk = ajrk.a;
        }
        final ahaz builder = ((ahbh)ajrl.a).createBuilder();
        builder.copyOnWrite();
        ajrl.a((ajrl)builder.instance);
        final ajrl ajrl = (ajrl)builder.build();
        final ahcr b = ajrk.b;
        final Long value = 45378800L;
        ajrl ajrl2 = ajrl;
        if (((Map)b).containsKey(value)) {
            ajrl2 = (ajrl)((Map)b).get(value);
        }
        return ajrl2.b == 1 && (boolean)ajrl2.c;
    }
    
    private final boolean aM() {
        final arwh ak = this.ak;
        answ answ;
        if (ak == null) {
            answ = null;
        }
        else {
            ansk ansk;
            if ((ansk = ak.f().u) == null) {
                ansk = ansk.a;
            }
            if ((answ = ansk.d) == null) {
                answ = answ.a;
            }
        }
        return answ != null && answ.r;
    }
    
    private final void aN(final Bundle bundle) {
        bundle.putBoolean("ReelWatchFragment.isInWatchWhileActivity", true);
        if (this.aL()) {
            bundle.putBoolean("ReelWatchFragment.isInReelWatchPagerFragment", true);
            bundle.putBoolean("ReelWatchFragment.isAtRoot", this.ay.I());
        }
    }
    
    private static Bundle q(final Bundle bundle) {
        return (Bundle)Optional.ofNullable((Object)bundle).map((Function)hpl.a).orElseGet((Supplier)fdi.m);
    }
    
    private final gae r() {
        final boolean al = this.aL();
        final boolean b = false;
        if (!al) {
            boolean b2 = b;
            if (this.b.orElse((Object)true)) {
                b2 = b;
                if (!this.aL()) {
                    b2 = true;
                }
            }
            final gad a = gae.a();
            a.k(ezt.u());
            a.c(ezt.u());
            a.g(ezt.t(2130970884));
            final tqt a2 = fzj.a();
            a2.c(ezt.t(2130970884));
            a2.d = this.al.a;
            a2.f(this.a);
            a.b(a2.b());
            a.d(true);
            a.f = fzp.a().a();
            a.l(true);
            a.m(b2);
            return a.a();
        }
        if (this.d == 0) {
            final gad a3 = gae.a();
            a3.k(ezt.u());
            a3.c(ezt.u());
            a3.g(ezt.t(2130970884));
            a3.d(true);
            a3.f = fzp.a().a();
            a3.l(true);
            a3.m(false);
            return a3.a();
        }
        final gad a4 = gae.a();
        a4.k(ezt.t(2130970845));
        a4.c(ezt.u());
        a4.g(ezt.t(2130970924));
        a4.d(true);
        a4.f = fzp.a().a();
        a4.l(true);
        a4.m(false);
        return a4.a();
    }
    
    private final Optional s() {
        return Optional.ofNullable((Object)((br)this).og().f("reel_watch_fragment_watch_while")).filter((Predicate)hoi.h).map((Function)hpl.h);
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        if (this.aM()) {
            this.aj.c("r_pfcv");
        }
        final pa al = this.al;
        Object c = null;
        al.o((antb)null);
        if (!this.aL()) {
            final pa al2 = this.al;
            final View inflate = layoutInflater.inflate(2131625227, viewGroup, false);
            if ((al2.a = inflate) != null) {
                c = inflate.findViewById(2131428445);
            }
            al2.c = c;
            al2.n();
        }
        return layoutInflater.inflate(2131625284, viewGroup, false);
    }
    
    public final gae aT(final gae gae) {
        return this.r();
    }
    
    public final asht aV() {
        return asht.X(gkq.b);
    }
    
    public final asht aX() {
        if (this.aL()) {
            return (asht)this.c;
        }
        final adqw a = gai.a();
        a.j(gak.b);
        a.i(gaj.b);
        a.h(false);
        return asht.X(a.f());
    }
    
    public final asht aY() {
        return tpe.n(this.at.getWindow().getDecorView(), this.af).A().Z((asjr)new gdc(this, 9));
    }
    
    public final asht aZ() {
        return asht.X(false);
    }
    
    public final void ab(final View view, Bundle q) {
        if (this.aM()) {
            this.aj.c("r_pfvc");
        }
        if (this.aL()) {
            Object o;
            if (q == null) {
                final Bundle q2 = q(((br)this).m);
                this.aN(q2);
                o = new hpe();
                ((hpe)o).ag(q2);
                final ct i = ((br)this).og().i();
                i.z();
                i.r(2131429084, (br)o, "reel_watch_pager_fragment");
                i.a();
            }
            else {
                o = this.aK().orElse((Object)null);
            }
            final Bundle m = ((br)this).m;
            if (m != null) {
                final byte[] byteArray = m.getByteArray("navigation_endpoint_interaction_logging_extension");
                if (o != null && byteArray != null) {
                    ((hpb)o).s(byteArray);
                }
            }
            if (o != null) {
                ((hpb)o).r(this.aq);
                new msr(((br)o).getLifecycle()).Q((Callable)new hly(this, (hpb)o, 7));
            }
        }
        else {
            Object al;
            if (q == null) {
                q = q(((br)this).m);
                this.aN(q);
                al = how.aL(q);
                final ct j = ((br)this).og().i();
                j.z();
                j.r(2131429084, (br)al, "reel_watch_fragment_watch_while");
                j.a();
            }
            else {
                al = this.s().orElse((Object)null);
            }
            if (al != null) {
                ((hoe)al).o(this.aq);
                final Bundle k = ((br)this).m;
                if (k != null) {
                    ((hoe)al).s(k.getByteArray("navigation_endpoint_interaction_logging_extension"));
                }
            }
            if (al instanceof hog) {
                new msr(((br)al).getLifecycle()).Q((Callable)new hly(this, (hog)al, 8));
            }
        }
        ((aui)((br)this).X).b((aum)this.ag);
        final View viewById = view.findViewById(2131429084);
        if (viewById != null) {
            final auo x = ((br)this).X;
            final blu am = this.am;
            final hzm hzm = (hzm)((atke)am.b).a();
            hzm.getClass();
            final msr msr = (msr)((atke)am.d).a();
            final PipPlayerObserver pipPlayerObserver = (PipPlayerObserver)((atke)am.a).a();
            pipPlayerObserver.getClass();
            final vai vai = (vai)((atke)am.e).a();
            vai.getClass();
            final vaf vaf = (vaf)((atke)am.c).a();
            vaf.getClass();
            ((aui)x).b((aum)new ReelBottomBarUpdatedListener(hzm, msr, pipPlayerObserver, vai, vaf, viewById, (byte[])null, (byte[])null));
        }
        ansd ansd;
        if ((ansd = this.az.b().A) == null) {
            ansd = ansd.a;
        }
        if (ansd.f) {
            final View viewById2 = ((ViewGroup)this.ai.a()).findViewById(2131427617);
            if (viewById2 != null) {
                final auo x2 = ((br)this).X;
                final fzw ap = this.ap;
                final tqf ah = this.ah;
                final hzm hzm2 = (hzm)((atke)ap.b).a();
                hzm2.getClass();
                final msr msr2 = (msr)((atke)ap.a).a();
                ah.getClass();
                ((aui)x2).b((aum)new ReelCommentsBottomBarUpdatedListener(hzm2, msr2, viewById2, ah, (byte[])null, (byte[])null));
            }
        }
        if (!hko.t(((ggq)this).aU())) {
            if (!tpe.bR(((br)this).nY())) {
                return;
            }
            ansk ansk;
            if ((ansk = this.ak.f().u) == null) {
                ansk = ansk.a;
            }
            answ answ;
            if ((answ = ansk.d) == null) {
                answ = answ.a;
            }
            if (!answ.t) {
                return;
            }
        }
        if (!this.aL()) {
            final ViewGroup viewGroup = (ViewGroup)view.findViewById(2131429084);
            if (viewGroup != null) {
                this.ao.Q((Callable)new hpm(this, viewGroup.getPaddingTop(), viewGroup, viewGroup.getPaddingLeft(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom()));
            }
        }
    }
    
    public final Object bc() {
        if (this.aL()) {
            return this.aK().map((Function)hpl.f).orElse((Object)null);
        }
        return this.s().map((Function)hpl.g).orElse((Object)null);
    }
    
    public final void bf() {
        if (this.aL()) {
            this.aK().ifPresent((Consumer)gyr.r);
        }
    }
    
    public final void bi(final Object aq) {
        this.aq = aq;
    }
    
    public final boolean bo() {
        return true;
    }
    
    public final boolean bq() {
        final boolean al = this.aL();
        final Boolean value = false;
        if (al) {
            return (boolean)this.aK().map((Function)hpl.d).orElse((Object)value);
        }
        return (boolean)this.s().map((Function)hpl.e).orElse((Object)value);
    }
    
    public final gae mG() {
        return this.r();
    }
}
