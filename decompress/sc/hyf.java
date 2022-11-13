import java.util.function.Predicate;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.function.Function;
import java.util.function.Consumer;
import com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack$PanelsBackStackEntry;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import java.util.ArrayList;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import android.support.v4.app.Fragment$SavedState;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyf extends hyc implements ggt, ghf, hyg, hyh, hyd
{
    public arkg a;
    private Optional ae;
    private Object af;
    private Fragment$SavedState ag;
    private PanelDescriptor ah;
    private Object ai;
    private Fragment$SavedState aj;
    private PanelDescriptor ak;
    private PanelDescriptor al;
    private PanelsBackStack am;
    private Optional an;
    public PanelsConfiguration b;
    public msr c;
    public fzw d;
    public aeea e;
    
    public hyf() {
        this.ae = Optional.empty();
        this.am = PanelsBackStack.e(new ArrayList());
        this.an = Optional.empty();
    }
    
    private final br aP(final int n) {
        return ((br)this).og().e(n);
    }
    
    private final PanelDescriptor br() {
        final br s = this.s();
        if (s instanceof ggq) {
            return (PanelDescriptor)PaneFragmentPanelDescriptor.b(PaneDescriptor.b((ggq)s));
        }
        return this.al;
    }
    
    private final PanelDescriptor bs() {
        final br f = this.f();
        if (f instanceof ggq) {
            return (PanelDescriptor)PaneFragmentPanelDescriptor.b(PaneDescriptor.b((ggq)f));
        }
        final PanelsConfiguration b = this.b;
        if (b != null) {
            return b.a;
        }
        return null;
    }
    
    private final void bt(final PanelsBackStack$PanelsBackStackEntry panelsBackStack$PanelsBackStackEntry) {
        if (panelsBackStack$PanelsBackStackEntry == null) {
            return;
        }
        this.ak = panelsBackStack$PanelsBackStackEntry.a;
        this.aj = panelsBackStack$PanelsBackStackEntry.b;
        this.ai = panelsBackStack$PanelsBackStackEntry.c;
        bw(this.s(), this.ak, true);
        this.bu(this.ak, false);
    }
    
    private final void bu(final PanelDescriptor panelDescriptor, final boolean b) {
        if (b) {
            bw(this.s(), panelDescriptor, false);
            final PanelDescriptor br = this.br();
            if (br != null) {
                final br s = this.s();
                Object bc;
                if (s instanceof ggq) {
                    bc = ((ggq)s).bc();
                }
                else {
                    bc = null;
                }
                this.am.f(br, ((br)this).og().c(s), bc, br.d());
            }
        }
        this.an.ifPresent((Consumer)hvn.l);
        final br f = this.f();
        if (f != null) {
            if (f instanceof ggq) {
                this.af = ((ggq)f).bc();
            }
            this.ag = ((br)this).og().c(f);
        }
        this.ah = this.bs();
        this.aK(panelDescriptor, 2131428645);
        this.an.ifPresent((Consumer)new hvr(this, 15));
    }
    
    private final boolean bv() {
        if (this.b == null) {
            return false;
        }
        final boolean booleanValue = (boolean)this.an.map((Function)hvv.j).orElse((Object)false);
        final PanelDescriptor ah = this.ah;
        if (booleanValue && ah != null) {
            bw(this.s(), ah, true);
            this.aK(ah, 2131431372);
            return true;
        }
        return booleanValue;
    }
    
    private static final void bw(final br br, final PanelDescriptor panelDescriptor, final boolean b) {
        if (panelDescriptor instanceof PaneFragmentPanelDescriptor) {
            if (br instanceof ggq) {
                final ggq ggq = (ggq)br;
                final ahaz builder = ((ahbh)amqg.a).createBuilder();
                final wyw pf = ggq.pF();
                int n = 0;
                if (pf != null) {
                    n = n;
                    if (ggq.pF().i() != null) {
                        final String i = ggq.pF().i();
                        builder.copyOnWrite();
                        final amqg amqg = (amqg)builder.instance;
                        i.getClass();
                        amqg.b |= 0x1;
                        amqg.c = i;
                        n = 1;
                    }
                }
                if (b) {
                    builder.copyOnWrite();
                    final amqg amqg2 = (amqg)builder.instance;
                    amqg2.b |= 0x2;
                    amqg2.d = 22156;
                }
                else if (n == 0) {
                    return;
                }
                ((PaneFragmentPanelDescriptor)panelDescriptor).a().m((amqg)builder.build());
            }
        }
    }
    
    private static final Optional bx(final PanelDescriptor panelDescriptor) {
        if (!(panelDescriptor instanceof PaneFragmentPanelDescriptor)) {
            return Optional.empty();
        }
        return Optional.of((Object)((PaneFragmentPanelDescriptor)panelDescriptor).a());
    }
    
    private static final void by(final PanelDescriptor panelDescriptor, final PanelDescriptor panelDescriptor2, final br br, final Fragment$SavedState fragment$SavedState) {
        if (panelDescriptor == panelDescriptor2) {
            if (fragment$SavedState != null) {
                br.ai(fragment$SavedState);
            }
        }
    }
    
    public final boolean I() {
        return this.am.g() && (this.d() || !((ggq)this).bl() || (boolean)this.an.map((Function)hvv.h).orElse((Object)false));
    }
    
    public final boolean J() {
        if (this.am.g()) {
            return this.bv();
        }
        this.bt(this.am.d());
        return true;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, Bundle m) {
        final View inflate = layoutInflater.inflate(2131624970, viewGroup, false);
        final fzw d = this.d;
        final msr c = this.c;
        final ViewGroup viewGroup2 = (ViewGroup)inflate;
        final grr grr = new grr(this, 12);
        final Optional of = Optional.of((Object)this);
        final PanelsConfiguration panelsConfiguration = null;
        Bundle bundle;
        if (m != null) {
            bundle = m.getBundle("fragments.panels.PanelsFragment.restoredPanelsLayoutController");
        }
        else {
            bundle = null;
        }
        this.an = Optional.ofNullable((Object)d.aB(c, viewGroup2, 2131431372, 2131428645, 2131430253, (hyg)this, (afaq)grr, of, Optional.ofNullable((Object)bundle)));
        m = ((br)this).m;
        PanelsConfiguration panelsConfiguration2 = panelsConfiguration;
        if (m != null) {
            panelsConfiguration2 = (PanelsConfiguration)m.getParcelable("panels_configuration");
        }
        this.b(panelsConfiguration2);
        return inflate;
    }
    
    public final boolean L(final PaneDescriptor paneDescriptor) {
        return this.aO(PaneFragmentPanelDescriptor.b(paneDescriptor), paneDescriptor.b.getBoolean("selection_panel_selection_changed", false));
    }
    
    public final boolean N() {
        return this.J();
    }
    
    public final void aK(final PanelDescriptor al, final int n) {
        if (((br)this).og().w || ((br)this).og().Z()) {
            ttr.b("Attempted PanelsFragment.addPanel after instance state saved.");
            zlm.b(zll.a, zlk.y, "[LayoutSystem][Android]Attempted PanelsFragment.addPanel after instance state saved.");
            return;
        }
        if (al == null) {
            return;
        }
        final Optional c = al.c();
        if (c.isEmpty()) {
            return;
        }
        if (n == 2131428645) {
            this.al = al;
        }
        final br br = (br)c.get();
        if (br instanceof ggq) {
            if (br.m == null) {
                br.ag(new Bundle());
            }
            if (n == 2131428645) {
                br.m.putBoolean("needs_nested_header", true);
            }
            if (n == 2131431372) {
                br.m.putBoolean("selection_panel", true);
            }
        }
        by(al, this.ah, br, this.ag);
        by(al, this.ak, br, this.aj);
        final ct i = ((br)this).og().i();
        i.w(n, br, al.d());
        i.i = 0;
        i.a();
    }
    
    public final void aL() {
        ((fzf)this.a.a()).r();
        ((fzf)this.a.a()).l();
        final br s = this.s();
        if (s instanceof ggq) {
            ((ggq)s).bj(this.d());
        }
    }
    
    public final void aM(final int n, final int n2) {
        hyi.b(((br)this).nT(), this.aP(n), n2);
    }
    
    public final boolean aN() {
        return this.an.filter((Predicate)hoi.q).isPresent();
    }
    
    public final boolean aO(final PaneFragmentPanelDescriptor paneFragmentPanelDescriptor, final boolean b) {
        final PanelsConfiguration b2 = this.b;
        final boolean b3 = false;
        if (b2 == null) {
            return false;
        }
        if (b) {
            bw(this.f(), (PanelDescriptor)paneFragmentPanelDescriptor, false);
            this.am.h();
            this.al = null;
            this.b = PanelsConfiguration.a((PanelDescriptor)this.b.a, (PanelDescriptor)paneFragmentPanelDescriptor);
        }
        final PanelDescriptor al = this.al;
        boolean b4;
        if (al == null) {
            b4 = b3;
        }
        else {
            b4 = b3;
            if (!al.equals(paneFragmentPanelDescriptor)) {
                b4 = true;
            }
        }
        this.bu((PanelDescriptor)paneFragmentPanelDescriptor, b4);
        return true;
    }
    
    public final gae aT(final gae gae) {
        gae mg = gae;
        if (this.aN()) {
            final br s = this.s();
            mg = gae;
            if (s instanceof ggq) {
                mg = ((ggq)s).mG();
            }
        }
        return mg;
    }
    
    public final void b(final PanelsConfiguration b) {
        if (b == null) {
            return;
        }
        this.b = null;
        this.al = null;
        this.af = null;
        this.ag = null;
        this.ah = null;
        this.ai = null;
        this.aj = null;
        this.ak = null;
        this.am.h();
        this.b = b;
        if (this.ae.isEmpty()) {
            this.an.ifPresent((Consumer)hvn.k);
            return;
        }
        final hye hye = (hye)this.ae.get();
        this.af = hye.a;
        this.ah = hye.g;
        this.ag = hye.d;
        this.ai = hye.b;
        this.ak = hye.f;
        this.aj = hye.e;
        this.am = hye.c;
        this.aK(this.ah, 2131431372);
        this.an.ifPresent((Consumer)new hvr(this, 12));
        this.aK(this.ak, 2131428645);
        this.an.ifPresent((Consumer)new hvr(this, 13));
    }
    
    public final Optional ba(final PaneDescriptor paneDescriptor) {
        if (PaneDescriptor.q(paneDescriptor, (PaneDescriptor)bx(this.ah).orElse((Object)null), this.e)) {
            return Optional.ofNullable(this.af);
        }
        if (PaneDescriptor.q(paneDescriptor, (PaneDescriptor)bx(this.ak).orElse((Object)null), this.e)) {
            return Optional.ofNullable(this.ai);
        }
        return Optional.empty();
    }
    
    public final Object bc() {
        final br f = this.f();
        final Object o = null;
        Fragment$SavedState c;
        Object o2;
        if (f != null) {
            Object bc;
            if (f instanceof ggq) {
                bc = ((ggq)f).bc();
            }
            else {
                bc = null;
            }
            c = ((br)this).og().c(f);
            o2 = bc;
        }
        else {
            o2 = null;
            c = null;
        }
        final br s = this.s();
        Object bc2;
        Fragment$SavedState c2;
        if (s != null) {
            bc2 = o;
            if (s instanceof ggq) {
                bc2 = ((ggq)s).bc();
            }
            c2 = ((br)this).og().c(s);
        }
        else {
            bc2 = null;
            c2 = null;
        }
        return new hye(o2, bc2, this.am, c, c2, this.br(), this.bs());
    }
    
    public final void bg() {
        final br s = this.s();
        if (s instanceof ggq) {
            ((ggq)s).bg();
        }
        final br f = this.f();
        if (f instanceof ggq) {
            ((ggq)f).bg();
        }
    }
    
    public final void bi(final Object o) {
        if (!(o instanceof hye)) {
            return;
        }
        this.ae = Optional.of((Object)o);
    }
    
    public final boolean bl() {
        return this.b != null;
    }
    
    public final /* bridge */ void c(final PanelDescriptor panelDescriptor, final boolean b) {
        this.aO((PaneFragmentPanelDescriptor)panelDescriptor, b);
    }
    
    public final boolean d() {
        return (boolean)this.an.map((Function)hvv.i).orElse((Object)false);
    }
    
    public final boolean e() {
        return this.an.filter((Predicate)hoi.r).isPresent();
    }
    
    public final br f() {
        return this.aP(2131431372);
    }
    
    public final boolean mF() {
        if (this.am.g()) {
            return this.bv();
        }
        final PanelsBackStack$PanelsBackStackEntry c = this.am.c();
        this.am.h();
        this.bt(c);
        return true;
    }
    
    public final gae mG() {
        gae gae = this.aw;
        if (this.aN()) {
            final br s = this.s();
            gae = gae;
            if (s instanceof ggq) {
                gae = ((ggq)s).mG();
            }
        }
        return gae;
    }
    
    public final void pP(final Bundle bundle) {
        this.an.ifPresent((Consumer)new hvr(bundle, 14));
    }
    
    public final int q() {
        final PaneDescriptor paneDescriptor = (PaneDescriptor)bx(this.bs()).orElse((Object)null);
        if (paneDescriptor != null && paneDescriptor.b.getBoolean("split_pane_library_opened_in_offline_mode", false)) {
            return 2;
        }
        return 1;
    }
    
    public final void r() {
        throw null;
    }
    
    public final br s() {
        return this.aP(2131428645);
    }
}
