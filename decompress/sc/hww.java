import j$.util.Optional;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.FrameLayout;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack$BackStackEntry;
import java.util.function.Consumer;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.support.v4.app.Fragment$SavedState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hww extends hxq implements ggt
{
    public fmr a;
    public Fragment$SavedState ae;
    public PaneDescriptor af;
    public boolean ag;
    public boolean ah;
    public skt ai;
    public ajb aj;
    public fzw ak;
    public aeea al;
    private Object am;
    private Object an;
    private boolean ao;
    private boolean ap;
    private PaneBackStack aq;
    View b;
    final afaq c;
    final afaq d;
    public Fragment$SavedState e;
    
    public hww() {
        this.c = (afaq)new grr(this, 10);
        this.d = (afaq)new grr(this, 11);
        this.ap = false;
    }
    
    private final PaneBackStack aM() {
        if (this.aq == null) {
            this.aq = new PaneBackStack();
        }
        return this.aq;
    }
    
    private final PaneDescriptor aN() {
        if (this.o() != null) {
            return PaneDescriptor.b(this.o());
        }
        final PaneDescriptor af = this.af;
        if (af != null) {
            return af;
        }
        return (PaneDescriptor)this.d.a();
    }
    
    private final void aO(final PaneDescriptor paneDescriptor, final boolean b) {
        int n;
        if (this.ag) {
            n = 2131428643;
        }
        else {
            if (this.p() != null && !b) {
                this.am = this.p().bc();
                this.e = ((br)this).og().c((br)this.p());
            }
            n = 2131430603;
        }
        paneDescriptor.h().ifPresent((Consumer)new hyj(this, paneDescriptor, n, 1));
    }
    
    private final void aP(final boolean b) {
        if (this.p() != null) {
            return;
        }
        final PaneDescriptor paneDescriptor = (PaneDescriptor)this.c.a();
        paneDescriptor.h().ifPresent((Consumer)new hwu(this, b, paneDescriptor));
    }
    
    private final void br() {
        final PaneBackStack$BackStackEntry c = this.aM().c();
        c.getClass();
        this.af = c.a;
        this.ae = c.b;
        this.an = c.c;
        s(this.o(), this.af, true);
        this.aO(this.af, false);
    }
    
    private final boolean bs(final PaneDescriptor paneDescriptor) {
        final ggq o = this.o();
        return o != null && this.ak.au(PaneDescriptor.b(o)) && this.ak.av(paneDescriptor);
    }
    
    public static final void s(final ggq ggq, final PaneDescriptor paneDescriptor, final boolean b) {
        final ahaz builder = ((ahbh)amqg.a).createBuilder();
        int n2;
        final int n = n2 = 0;
        if (ggq != null) {
            n2 = n;
            if (ggq.pF() != null) {
                n2 = n;
                if (ggq.pF().i() != null) {
                    final String i = ggq.pF().i();
                    builder.copyOnWrite();
                    final amqg amqg = (amqg)builder.instance;
                    i.getClass();
                    amqg.b |= 0x1;
                    amqg.c = i;
                    n2 = 1;
                }
            }
        }
        if (b) {
            builder.copyOnWrite();
            final amqg amqg2 = (amqg)builder.instance;
            amqg2.b |= 0x2;
            amqg2.d = 22156;
        }
        else if (n2 == 0) {
            return;
        }
        paneDescriptor.m((amqg)builder.build());
    }
    
    public final boolean I() {
        return !this.q() && this.aM().e();
    }
    
    public final boolean J() {
        if (!this.I()) {
            if (this.ag) {
                this.br();
                this.ao = true;
            }
            else if (this.aM().e()) {
                this.aP(true);
                this.ao = false;
            }
            else {
                this.br();
                this.ao = true;
            }
            return true;
        }
        return false;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        View b;
        if (((br)this).nZ().getConfiguration().smallestScreenWidthDp >= 720) {
            b = layoutInflater.inflate(2131624669, viewGroup, false);
        }
        else {
            b = layoutInflater.inflate(2131624668, viewGroup, false);
        }
        this.b = b;
        final FrameLayout frameLayout = (FrameLayout)b.findViewById(2131430603);
        if (((br)this).nZ().getConfiguration().smallestScreenWidthDp >= 840) {
            frameLayout.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(((br)this).nZ().getDimensionPixelSize(2131168634), -1));
        }
        else if (((br)this).nZ().getConfiguration().smallestScreenWidthDp >= 720) {
            frameLayout.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(((br)this).nZ().getDimensionPixelSize(2131168633), -1));
        }
        final View viewById = this.b.findViewById(2131428643);
        final boolean ag = viewById != null && viewById.getVisibility() == 0;
        this.ag = ag;
        this.ao = (this.ao || ag);
        if (!this.ap) {
            this.ah = (this.ai.a && this.a.i());
        }
        if (!this.q()) {
            this.aP(false);
        }
        if (this.ao) {
            this.aO(this.aN(), true);
        }
        return this.b;
    }
    
    public final boolean L(final PaneDescriptor paneDescriptor) {
        if (this.q() && !this.bs(paneDescriptor)) {
            return false;
        }
        if (this.bs(paneDescriptor)) {
            s(this.o(), paneDescriptor, false);
            final ggq o = this.o();
            this.aM().d(PaneDescriptor.b(o), ((br)this).og().c((br)o), o.bc(), null);
        }
        else {
            s(this.p(), paneDescriptor, false);
            this.aM().f();
        }
        this.aO(paneDescriptor, false);
        return this.ao = true;
    }
    
    public final boolean N() {
        if (!this.ag) {
            return this.J();
        }
        if (PaneDescriptor.q(this.aN(), (PaneDescriptor)this.d.a(), this.al)) {
            return false;
        }
        if (!this.J()) {
            this.aO((PaneDescriptor)this.d.a(), false);
        }
        return true;
    }
    
    public final int aQ() {
        return 720;
    }
    
    public final Optional ba(final PaneDescriptor paneDescriptor) {
        if (PaneDescriptor.q(paneDescriptor, (PaneDescriptor)this.c.a(), this.al)) {
            return Optional.ofNullable(this.am);
        }
        if (PaneDescriptor.q(paneDescriptor, this.af, this.al)) {
            return Optional.ofNullable(this.an);
        }
        return Optional.empty();
    }
    
    public final Object bc() {
        Object o;
        Fragment$SavedState fragment$SavedState;
        if (this.q()) {
            o = this.am;
            fragment$SavedState = this.e;
        }
        else {
            o = this.p().bc();
            fragment$SavedState = ((br)this).og().c((br)this.p());
        }
        Object bc;
        PaneBackStack am;
        Object c;
        Object o2;
        if (this.ao) {
            bc = this.o().bc();
            am = this.aM();
            final PaneDescriptor an = this.aN();
            c = ((br)this).og().c((br)this.o());
            o2 = an;
        }
        else {
            bc = null;
            am = null;
            o2 = (c = am);
        }
        return new hwv(o, bc, am, fragment$SavedState, (Fragment$SavedState)c, (PaneDescriptor)o2, this.ao, this.ah);
    }
    
    public final void bg() {
        if (this.o() != null) {
            this.o().bg();
        }
        if (this.p() != null) {
            this.p().bg();
        }
    }
    
    public final void bi(final Object o) {
        if (!(o instanceof hwv)) {
            return;
        }
        final hwv hwv = (hwv)o;
        this.am = hwv.a;
        this.e = hwv.d;
        this.an = hwv.b;
        this.af = hwv.f;
        this.aq = hwv.c;
        this.ae = hwv.e;
        this.ao = hwv.g;
        this.ah = hwv.h;
        this.ap = true;
    }
    
    public final boolean bl() {
        return this.ag;
    }
    
    public final boolean mF() {
        if (!this.I()) {
            if (this.ag) {
                if (PaneDescriptor.q(this.aN(), (PaneDescriptor)this.d.a(), this.al)) {
                    return false;
                }
                this.aO((PaneDescriptor)this.d.a(), false);
                this.ao = true;
            }
            else {
                this.aP(true);
                this.ao = false;
            }
            return true;
        }
        return false;
    }
    
    public final gae mG() {
        if (!this.ag && this.ao) {
            return this.o().mG();
        }
        return this.aw;
    }
    
    public final ggq o() {
        return (ggq)((br)this).og().f("detail_fragment_tag");
    }
    
    public final ggq p() {
        return (ggq)((br)this).og().f("primary_fragment_tag");
    }
    
    final boolean q() {
        return !this.ag && this.ao;
    }
    
    public final void r() {
        throw null;
    }
}
