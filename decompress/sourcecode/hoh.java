import androidx.viewpager.widget.ViewPager;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.function.Supplier;
import java.util.concurrent.Callable;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import java.util.function.Predicate;
import java.util.function.Consumer;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.function.Function;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelWatchPagerViewPager;
import android.os.Bundle;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hoh extends hky implements cku, hnh
{
    public asho a;
    public Optional ae;
    public Bundle af;
    public hog ag;
    public int ah;
    public byte[] ai;
    private hof aj;
    private final atje ak;
    public abno b;
    public hqa c;
    public wwu d;
    public ReelWatchPagerViewPager e;
    
    public hoh() {
        this.ae = Optional.empty();
        this.af = new Bundle();
        this.ak = ((atje)atir.e()).aX();
        this.ah = 0;
        this.ai = null;
    }
    
    private final Optional aQ() {
        return Optional.ofNullable((Object)((br)this).og()).map((Function)hns.r);
    }
    
    private final void aS() {
        if (this.aL().isPresent()) {
            final hnk hnk = (hnk)this.aL().get();
            this.c.d();
            this.b.D();
            hnk.y();
        }
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return layoutInflater.inflate(2131625278, viewGroup, false);
    }
    
    public final void a(final int n) {
        final ReelWatchPagerViewPager e = this.e;
        int n2 = n;
        if (e != null && (n2 = n) == 1) {
            if (((ViewPager)e).a() == 0) {
                this.aM();
            }
            n2 = 1;
        }
        final ReelWatchPagerViewPager e2 = this.e;
        if (e2 != null && n2 == 2) {
            if (((ViewPager)e2).a() == 0) {
                this.aS();
                Optional.ofNullable((Object)((br)this).og()).map((Function)hoo.b).ifPresent((Consumer)gyc.q);
            }
            else if (this.aL().isPresent()) {
                this.c.a();
            }
        }
        final ReelWatchPagerViewPager e3 = this.e;
        if (e3 != null && n2 == 0) {
            if (((ViewPager)e3).a() != 1) {
                if (this.aL().isPresent()) {
                    ((hnk)this.aL().get()).z();
                }
            }
            else {
                Optional.ofNullable((Object)((br)this).og()).map((Function)hns.q).ifPresent((Consumer)gyc.p);
            }
        }
    }
    
    public final boolean aK() {
        final ReelWatchPagerViewPager e = this.e;
        if (e == null) {
            return false;
        }
        if (((ViewPager)e).a() == 0) {
            return (boolean)this.aL().map((Function)hns.m).orElse((Object)false);
        }
        ((ViewPager)e).l(0);
        return true;
    }
    
    public final Optional aL() {
        return Optional.ofNullable((Object)((br)this).og()).map((Function)hns.o).filter((Predicate)hnm.e).map((Function)hns.p);
    }
    
    public final void aM() {
        if (this.ae.isPresent()) {
            Optional.ofNullable((Object)((br)this).og()).map((Function)hns.n).ifPresent((Consumer)new hnr(this, 8));
        }
    }
    
    public final void aN(final guk guk) {
        final hog ag = this.ag;
        if (ag != null) {
            final Object b = ag.b;
            if (b != null) {
                guk.o(b);
            }
        }
    }
    
    public final void aO(final br br) {
        if (!(br instanceof hni)) {
            return;
        }
        final hni hni = (hni)br;
        final hog ag = this.ag;
        if (ag != null) {
            hni.o(ag.a);
        }
        else if (this.aP()) {
            final hnz hnz = new hnz((ReelToReelList)null, (cya)null, (byte[])null, (byte[])null, (byte[])null);
            hnz.b = true;
            hni.o((Object)hnz);
        }
        hni.s(this.ai);
        hni.r((hnh)this);
        if (hni instanceof hnk) {
            new mrm(((br)hni).getLifecycle()).A((Callable)new hlc(this, (hnk)hni, 6));
        }
    }
    
    public final boolean aP() {
        return this.ah == 1;
    }
    
    public final void aa() {
        super.aa();
        this.ak.tr((Object)this.ah);
    }
    
    public final void ab(final View view, Bundle builder) {
        if (builder != null) {
            this.ah = builder.getInt("reel_watch_pager_current_item", 0);
        }
        this.e = (ReelWatchPagerViewPager)view.findViewById(2131431086);
        this.af = (Bundle)Optional.ofNullable((Object)((br)this).m).orElseGet((Supplier)fde.l);
        Label_0399: {
            if (!this.aP() || this.ag == null || builder == null) {
                break Label_0399;
            }
            builder = (Bundle)((agzi)amob.a).createBuilder();
            final byte[] ai = this.ai;
            Label_0107: {
                if (ai == null) {
                    break Label_0107;
                }
                while (true) {
                    try {
                        ((agxk)builder).mergeFrom(ai, ExtensionRegistryLite.getGeneratedRegistry());
                        String c = ((amob)((agza)builder).instance).c;
                        while (true) {
                            final hog ag = this.ag;
                            if (ag != null) {
                                final guw guw = (guw)ag.b;
                                if (guw != null) {
                                    final Optional b = guw.b;
                                    final Optional c2 = guw.c;
                                    if (b.isPresent() && c2.isPresent() && c != null) {
                                        final aioe aioe = (aioe)c2.get();
                                        final agzc agzc = (agzc)((agzi)aioe).toBuilder();
                                        final agzg b2 = amoa.b;
                                        final agza builder2 = ((agzi)((agzd)aioe).rr((agyr)amoa.b)).toBuilder();
                                        final String f = (String)b.get();
                                        builder2.copyOnWrite();
                                        final amob amob = (amob)builder2.instance;
                                        amob.b |= 0x20;
                                        amob.f = f;
                                        builder2.copyOnWrite();
                                        final amob amob2 = (amob)builder2.instance;
                                        amob2.b |= 0x1;
                                        amob2.c = c;
                                        agzc.e((agyr)b2, (Object)builder2.build());
                                        final aioe aioe2 = (aioe)((agza)agzc).build();
                                        this.d.n().c(wya.b(6827), wxr.a, aioe2, xkm.as(aioe2, algq.b), xkm.as(aioe2, algq.a));
                                    }
                                }
                            }
                            final String i = this.d.n().i();
                            if (i != null) {
                                ((agza)builder).copyOnWrite();
                                final amob amob3 = (amob)((agza)builder).instance;
                                amob3.b |= 0x1;
                                amob3.c = i;
                                this.ai = ((agxl)((agza)builder).build()).toByteArray();
                            }
                            if (this.aL().isPresent()) {
                                this.aO((br)this.aL().get());
                            }
                            if (this.aQ().isPresent()) {
                                this.aN((guk)this.aQ().get());
                            }
                            if (this.aj == null) {
                                this.aj = new hof(this, ((br)this).og());
                            }
                            final ReelWatchPagerViewPager e = this.e;
                            if (e != null) {
                                ((ViewPager)e).p(1);
                                ((ViewPager)this.e).e((cku)this);
                                ((ViewPager)this.e).k((cko)this.aj);
                            }
                            return;
                            c = null;
                            continue;
                        }
                    }
                    catch (final ahab ahab) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public final void b(final int n, final float n2, final int n3) {
    }
    
    public final void c(final int ah) {
        this.ak.tr((Object)ah);
        this.ah = ah;
        if (ah == 1) {
            final ReelWatchPagerViewPager e = this.e;
            if (e != null) {
                e.h = true;
            }
        }
    }
    
    public final void d() {
        final ReelWatchPagerViewPager e = this.e;
        if (e != null && ((ViewPager)e).a() == 0 && this.ae.isPresent()) {
            this.aM();
            final ReelWatchPagerViewPager e2 = this.e;
            if (e2 != null) {
                ((ViewPager)e2).l(1);
            }
        }
    }
    
    public final ashe o() {
        return (ashe)this.ak;
    }
    
    public final Object p() {
        final hnz hnz = (hnz)this.aL().map((Function)hns.s).filter((Predicate)hnm.f).map((Function)hns.t).orElse((Object)null);
        if (hnz != null) {
            final ReelWatchPagerViewPager e = this.e;
            if (e != null) {
                final int a = ((ViewPager)e).a();
                boolean b = true;
                if (a != 1) {
                    b = false;
                }
                hnz.b = b;
            }
        }
        return new hog((Object)hnz, this.aQ().map((Function)hns.u).orElse((Object)null));
    }
    
    public final void pK(final Bundle bundle) {
        bundle.putInt("reel_watch_pager_current_item", this.ah);
    }
    
    public final void q() {
        final ReelWatchPagerViewPager e = this.e;
        if (e != null && ((ViewPager)e).a() == 1) {
            ((ViewPager)e).l(0);
            this.aS();
        }
    }
    
    public final void r(final Object o) {
        if (o instanceof hog) {
            this.ag = (hog)o;
        }
    }
    
    public final void s(final byte[] ai) {
        this.ai = ai;
    }
}
