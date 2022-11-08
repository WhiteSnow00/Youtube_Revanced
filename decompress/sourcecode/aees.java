import java.util.function.Consumer;
import com.google.android.youtube.api.jar.client.d;
import android.content.BroadcastReceiver;
import com.google.android.youtube.api.service.YouTubeService;
import android.os.RemoteException;
import android.os.IBinder;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentServiceFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerFactoryService;
import android.os.Handler;
import android.content.Context;
import android.os.IBinder$DeathRecipient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aees extends aefr implements IBinder$DeathRecipient, lng, lol
{
    public static final afdu a;
    public final Context b;
    public final Handler c;
    public final String d;
    public final aeep e;
    public final uyi f;
    private volatile lnb g;
    private volatile ApiPlayerFactoryService h;
    private volatile EmbedFragmentServiceFactoryService i;
    private tgf j;
    private volatile aeey k;
    private final c l;
    
    static {
        a = afdu.w((Object)"com.examples.youtubeapidemo", (Object)"com.examples.youtubeapidemo.materialdesign", (Object)"com.google.android.googlequicksearchbox", (Object)"com.google.android.apps.magazines", (Object)"com.google.android.play.games");
        afdu.x((Object)"com.examples.youtubeapidemo", (Object)"com.examples.youtubeapidemo.materialdesign", (Object)"com.google.android.apps.newsstand_exp", (Object)"com.google.android.apps.newsstand_internal", (Object)"com.google.android.apps.newsstand_staging", (Object)"com.google.android.apps.newsstanddev", (Object[])new String[0]);
    }
    
    public aees(final Context b, final c l, final String d, final aeey k, final lkn lkn, final Handler c, final aeep e, final uyi f, final byte[] array, final byte[] array2, final byte[] array3) {
        b.getClass();
        this.b = b;
        k.getClass();
        this.k = k;
        c.getClass();
        this.c = c;
        l.getClass();
        this.l = l;
        this.d = d;
        lkn.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
    }
    
    private final void l() {
        if (this.g == null) {
            throw new IllegalStateException("YouTubeServiceEntity not initialized. apiEnvironment is null.");
        }
        if (this.h == null) {
            throw new IllegalStateException("YouTubeServiceEntity not initialized. apiPlayerFactoryService is null.");
        }
        if (this.i != null) {
            return;
        }
        throw new IllegalStateException("YouTubeServiceEntity not initialized. embedFragmentServiceFactoryService is null.");
    }
    
    public final void a(final lnb g) {
        this.g = g;
        this.j = (tgf)new tgg(this.b, (atjj)new aauf(g, 6), (vja)((lnf)g).L.a(), (byte[])null);
        this.h = new ApiPlayerFactoryService(this.b, this.c, this.l, g, (byte[])null);
        this.i = new EmbedFragmentServiceFactoryService(this.b, this.c, this.l, g, (byte[])null);
        final aeey k = this.k;
        while (true) {
            if (k == null) {
                break Label_0123;
            }
            try {
                ((eny)k).a.linkToDeath((IBinder$DeathRecipient)this, 0);
                k.a("SUCCESS", (IBinder)this);
                this.l.b((lol)this);
            }
            catch (final RemoteException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void b(final Exception ex) {
        this.g = null;
        trn.d("Error creating ApiEnvironment", (Throwable)ex);
        if (this.k != null) {
            YouTubeService.b(this.k, lnf.o(ex));
        }
    }
    
    public final void binderDied() {
        this.i();
    }
    
    public final void c() {
        this.f();
    }
    
    public final IBinder d() {
        this.l();
        final ApiPlayerFactoryService h = this.h;
        ((enz)h).asBinder();
        return (IBinder)h;
    }
    
    public final IBinder e() {
        this.l();
        final EmbedFragmentServiceFactoryService i = this.i;
        ((enz)i).asBinder();
        return (IBinder)i;
    }
    
    public final void f() {
        final tgf j = this.j;
        if (j != null) {
            final tgg tgg = (tgg)j;
            tgg.a.unregisterReceiver((BroadcastReceiver)j);
            tgg.d.e((tey)tgg.b);
            tgg.d.e((tey)tgg.c);
            this.j = null;
        }
        if (this.g != null) {
            this.g = null;
        }
        this.h = null;
        this.i = null;
        if (this.k != null) {
            ((eny)this.k).a.unlinkToDeath((IBinder$DeathRecipient)this, 0);
            this.k = null;
        }
        this.l.c((lol)this);
        System.gc();
    }
    
    public final void g(final String s) {
        this.l();
        this.g.g(s, (zku)null);
    }
    
    public final void h() {
        this.l();
        this.g.h();
    }
    
    public final void i() {
        this.c.post((Runnable)new d(this, 6));
    }
    
    public final aefq j(final aefo aefo) {
        this.l();
        return (aefq)new aefp(this.c, ((vuh)((lnf)this.g).I).c(), this.g.f(), (thh)((lnf)this.g).N.a(), aefo, (byte[])null, (byte[])null);
    }
    
    public final void k(final aeex aeex) {
        this.l();
        final lnf lnf = (lnf)this.g;
        if (!lnf.f.isPresent()) {
            afqg.r("Listener registration failed: authentication events are disabled");
        }
        lnf.f.ifPresent((Consumer)new lke(aeex, 3));
    }
}
