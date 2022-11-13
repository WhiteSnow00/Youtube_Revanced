import app.revanced.integrations.patches.DisableAutoCaptionsPatch;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abqp
{
    public final abnl a;
    public final Executor b;
    public final Executor c;
    public tce d;
    public final abou e;
    public final arwh f;
    public final abrj g;
    public final aglu h;
    private final vjm i;
    private final ablh j;
    private final xra k;
    private final xra l;
    
    public abqp(final vjm i, final abou e, final abnl a, final aglu h, final Executor b, final Executor c, final arwh f, final xra l, final ablh j, final abrj g, final xra k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        i.getClass();
        this.i = i;
        this.e = e;
        a.getClass();
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
        this.f = f;
        this.l = l;
        this.j = j;
        this.g = g;
        this.k = k;
    }
    
    public final void a(final PlayerResponseModel playerResponseModel, final PlaybackStartDescriptor playbackStartDescriptor, final abqo abqo, final xan xan) {
        synchronized (this.h) {
            if (this.h.a == null) {
                return;
            }
            if (playerResponseModel == null) {
                return;
            }
            final tce d = this.d;
            if (d != null) {
                d.d();
            }
            monitorexit(this.h);
            final tce c = tce.c((tcc)new abqm(this, playerResponseModel, abqo, playbackStartDescriptor, xan));
            this.d = c;
            this.a.k(playerResponseModel.y(), (tcc)c, playerResponseModel.K());
        }
    }
    
    public final void b() {
        final tce d = this.d;
        if (d != null) {
            d.d();
            this.d = null;
        }
    }
    
    public final void c(final PlayerResponseModel playerResponseModel, final abkh abkh, final abvb abvb) {
        if (this.l.c() == 2) {
            return;
        }
        this.j.n(abkb.c);
        if (abkh != null) {
            abvb.A(playerResponseModel, abkh);
        }
    }
    
    public final void d(final PlayerResponseModel playerResponseModel, final PlaybackStartDescriptor playbackStartDescriptor, final xan xan, final abvb abvb) {
        DisableAutoCaptionsPatch.captionsButtonDisabled = false;
        tbi.f();
        ((aukf)this.e.j).tu((Object)new aamk());
        if (xan != null) {
            xan.c("pc");
        }
        if (this.g.s() && this.k.b((Object)playerResponseModel) == 2) {
            return;
        }
        if (abvb.V()) {
            abvb.B(playerResponseModel, playbackStartDescriptor);
        }
    }
    
    public final void e() {
        this.a.c = false;
        this.b();
    }
    
    public final boolean f(final PlayerResponseModel playerResponseModel, final abvb abvb, final abqo abqo) {
        if (abrj.ai(this.f)) {
            tbi.e();
            final vwa ad = playerResponseModel.ad(this.i);
            if (ad != null) {
                if (!aakv.n(playerResponseModel.y())) {
                    ((aukf)this.e.h).tu((Object)new aano(ad.d()));
                }
                if (abvb.W()) {
                    this.c.execute((Runnable)new aaxb(abvb, playerResponseModel, 17));
                }
                else if (abqo != null) {
                    if (aakv.n(playerResponseModel.y())) {
                        this.c.execute((Runnable)new ztq(abvb, playerResponseModel, ad, 18, (byte[])null, (byte[])null));
                    }
                    else {
                        this.c.execute((Runnable)new aaxb(abqo, ad, 18, (byte[])null, (byte[])null));
                    }
                }
                return true;
            }
        }
        else {
            final vwa ad2 = playerResponseModel.ad(this.i);
            if (ad2 != null) {
                ((aukf)this.e.h).tu((Object)new aano(ad2.d()));
                if (abvb.W()) {
                    abvb.B(playerResponseModel, (PlaybackStartDescriptor)null);
                }
                else if (abqo != null) {
                    abqo.b(ad2);
                }
                return true;
            }
        }
        return false;
    }
}
