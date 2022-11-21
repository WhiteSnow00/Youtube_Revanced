import app.revanced.integrations.patches.DisableAutoCaptionsPatch;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abry
{
    public final abos a;
    public final Executor b;
    public final Executor c;
    public tdi d;
    public final abqc e;
    public final absv f;
    public final arzb g;
    public final agnl h;
    private final vku i;
    private final abmo j;
    private final adzx k;
    private final adzx l;
    
    public abry(final vku i, final abqc e, final abos a, final agnl h, final Executor b, final Executor c, final arzb g, final adzx l, final abmo j, final absv f, final adzx k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        i.getClass();
        this.i = i;
        this.e = e;
        a.getClass();
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
        this.g = g;
        this.l = l;
        this.j = j;
        this.f = f;
        this.k = k;
    }
    
    public final void a(final PlayerResponseModel playerResponseModel, final PlaybackStartDescriptor playbackStartDescriptor, final abrx abrx, final xbt xbt) {
        synchronized (this.h) {
            if (this.h.a == null) {
                return;
            }
            if (playerResponseModel == null) {
                return;
            }
            final tdi d = this.d;
            if (d != null) {
                d.b();
            }
            monitorexit(this.h);
            final tdi a = tdi.a((tdg)new abrv(this, playerResponseModel, abrx, playbackStartDescriptor, xbt));
            this.d = a;
            this.a.k(playerResponseModel.y(), (tdg)a, playerResponseModel.K());
        }
    }
    
    public final void b() {
        final tdi d = this.d;
        if (d != null) {
            d.b();
            this.d = null;
        }
    }
    
    public final void c(final PlayerResponseModel playerResponseModel, final ablo ablo, final abwn abwn) {
        if (this.l.t() == 2) {
            return;
        }
        this.j.n(abli.c);
        if (ablo != null) {
            abwn.A(playerResponseModel, ablo);
        }
    }
    
    public final void d(final PlayerResponseModel playerResponseModel, final PlaybackStartDescriptor playbackStartDescriptor, final xbt xbt, final abwn abwn) {
        DisableAutoCaptionsPatch.captionsButtonDisabled = false;
        tcl.l();
        ((auna)this.e.j).tt(new aaoh());
        if (xbt != null) {
            xbt.c("pc");
        }
        if (this.f.s() && this.k.s((Object)playerResponseModel) == 2) {
            return;
        }
        if (abwn.V()) {
            abwn.B(playerResponseModel, playbackStartDescriptor);
        }
    }
    
    public final void e() {
        this.a.c = false;
        this.b();
    }
    
    public final boolean f(final PlayerResponseModel playerResponseModel, final abwn abwn, final abrx abrx) {
        if (absv.ae(this.g)) {
            tcl.k();
            final vxu ad = playerResponseModel.ad(this.i);
            if (ad != null) {
                if (!aamr.n(playerResponseModel.y())) {
                    ((auna)this.e.h).tt(new aapl(ad.f()));
                }
                if (abwn.W()) {
                    this.c.execute((Runnable)new aayj(abwn, playerResponseModel, 20));
                }
                else if (abrx != null) {
                    if (aamr.n(playerResponseModel.y())) {
                        this.c.execute((Runnable)new zvn(abwn, playerResponseModel, ad, 18, (byte[])null, (byte[])null, (byte[])null));
                    }
                    else {
                        this.c.execute(new abse(abrx, ad, 1, null, null, null));
                    }
                }
                return true;
            }
        }
        else {
            final vxu ad2 = playerResponseModel.ad(this.i);
            if (ad2 != null) {
                ((auna)this.e.h).tt(new aapl(ad2.f()));
                if (abwn.W()) {
                    abwn.B(playerResponseModel, (PlaybackStartDescriptor)null);
                }
                else if (abrx != null) {
                    abrx.b(ad2);
                }
                return true;
            }
        }
        return false;
    }
}
