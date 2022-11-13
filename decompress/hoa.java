import j$.util.function.Consumer$_CC;
import android.net.Uri;
import java.util.concurrent.Callable;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hoa implements Consumer
{
    public final Object a;
    private final int b;
    
    public hoa(final aanw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hoa(final ahaz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hoa(final ReelWatchEndpointOuterClass$ReelWatchEndpoint a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hoa(final hmu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hoa(final how a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hoa(final hpe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hoa(final hpu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hoa(final hqk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hoa(final hqv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hoa(final hsp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hoa(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void accept(final Object o) {
        switch (this.b) {
            default: {
                final Object a = this.a;
                final gdn gdn = (gdn)o;
                final hwl hwl = (hwl)a;
                gdn.a((aiqj)hwl.bY.get(), (acqv)hwl.r(), hwl.ba, hwl.bu, ((br)a).nT(), tpe.bb(hwl.nY()));
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout)o;
                final wyw pf = ((hwl)a2).pF();
                if (specificNetworkErrorViewLoadingFrameLayout.i.X()) {
                    if ((specificNetworkErrorViewLoadingFrameLayout.f = pf) != null) {
                        pf.l((wzz)new wyt(xaa.c(147758)));
                    }
                }
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final String f = (String)o;
                final ahaz ahaz = (ahaz)a3;
                ahaz.copyOnWrite();
                final zhs zhs = (zhs)ahaz.instance;
                final zhs a4 = zhs.a;
                f.getClass();
                zhs.b |= 0x8;
                zhs.f = f;
                return;
            }
            case 17: {
                final Object a5 = this.a;
                final String d = (String)o;
                final ahaz ahaz2 = (ahaz)a5;
                ahaz2.copyOnWrite();
                final zhs zhs2 = (zhs)ahaz2.instance;
                final zhs a6 = zhs.a;
                d.getClass();
                zhs2.b |= 0x2;
                zhs2.d = d;
                return;
            }
            case 16: {
                final Object a7 = this.a;
                final String e = (String)o;
                final ahaz ahaz3 = (ahaz)a7;
                ahaz3.copyOnWrite();
                final zhs zhs3 = (zhs)ahaz3.instance;
                final zhs a8 = zhs.a;
                e.getClass();
                zhs3.b |= 0x4;
                zhs3.e = e;
                return;
            }
            case 15: {
                final Object a9 = this.a;
                final String c = (String)o;
                final ahaz ahaz4 = (ahaz)a9;
                ahaz4.copyOnWrite();
                final zhs zhs4 = (zhs)ahaz4.instance;
                final zhs a10 = zhs.a;
                c.getClass();
                zhs4.b |= 0x1;
                zhs4.c = c;
                return;
            }
            case 14: {
                final Object a11 = this.a;
                zlm.b(zll.b, zlk.x, "fetch browseResponseModel failed".concat(String.valueOf(String.valueOf(o))));
                ((utv)a11).E();
                return;
            }
            case 13: {
                ((hsp)this.a).j((hkj)o);
                return;
            }
            case 12: {
                ((hsi)o).a().aH((asjm)new hom((hqv)this.a, 18));
                return;
            }
            case 11: {
                ((hqj)o).h(((hqk)this.a).j);
                return;
            }
            case 10: {
                ((hpu)this.a).g((akeb)o, true);
                return;
            }
            case 9: {
                ((gvp)o).aP((aiqj)((hpe)this.a).ae.get());
                return;
            }
            case 8: {
                ((hoc)o).H((aanw)this.a);
                return;
            }
            case 7: {
                ((how)this.a).aw.a((aiqj)o);
                return;
            }
            case 6: {
                ((how)this.a).aw.a((aiqj)o);
                return;
            }
            case 5: {
                final Object a12 = this.a;
                final hsi hsi = (hsi)o;
                final how how = (how)a12;
                how.cg.Q((Callable)new hly(how, hsi, 5));
                return;
            }
            case 4: {
                final Object a13 = this.a;
                final hqo hqo = (hqo)o;
                final int cl = how.cl;
                hqo.e((ReelWatchEndpointOuterClass$ReelWatchEndpoint)a13);
                return;
            }
            case 3: {
                final Object a14 = this.a;
                final hqo hqo2 = (hqo)o;
                final int cl2 = how.cl;
                aotp aotp;
                if ((aotp = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)a14).i) == null) {
                    aotp = aotp.a;
                }
                final Uri k = aald.K(aotp, hqo2.d.getWidth(), hqo2.d.getHeight());
                if (k != null) {
                    hqo2.a.k(k, hqo2.k);
                }
                return;
            }
            case 2: {
                final Object a15 = this.a;
                final hqo hqo3 = (hqo)o;
                final int cl3 = how.cl;
                hqo3.d((ReelWatchEndpointOuterClass$ReelWatchEndpoint)a15);
                return;
            }
            case 1: {
                ((eup)((hmu)this.a).B).a.D((wzz)new wyt(((ajmo)o).e));
                return;
            }
            case 0: {
                final Object a16 = this.a;
                final hqo hqo4 = (hqo)o;
                final int y = hob.y;
                hqo4.d((ReelWatchEndpointOuterClass$ReelWatchEndpoint)a16);
            }
        }
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        switch (this.b) {
            default: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 19: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 18: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 17: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 16: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 15: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 14: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 13: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 12: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 11: {
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
