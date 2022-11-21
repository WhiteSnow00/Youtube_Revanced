import java.util.function.Consumer;
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

public final class aeim extends aejl implements IBinder$DeathRecipient, low, lqd
{
    public static final afhk a;
    public final Context b;
    public final Handler c;
    public final String d;
    public final aeij e;
    public final vbs f;
    private volatile lor g;
    private volatile ApiPlayerFactoryService h;
    private volatile EmbedFragmentServiceFactoryService i;
    private tjo j;
    private volatile aeis k;
    private final c l;
    
    static {
        a = afhk.w("com.examples.youtubeapidemo", "com.examples.youtubeapidemo.materialdesign", "com.google.android.googlequicksearchbox", "com.google.android.apps.magazines", "com.google.android.play.games");
        afhk.x("com.examples.youtubeapidemo", "com.examples.youtubeapidemo.materialdesign", "com.google.android.apps.newsstand_exp", "com.google.android.apps.newsstand_internal", "com.google.android.apps.newsstand_staging", "com.google.android.apps.newsstanddev", (Object[])new String[0]);
    }
    
    public aeim(final Context b, final c l, final String d, final aeis k, final kzz kzz, final Handler c, final aeij e, final vbs f, final byte[] array, final byte[] array2) {
        b.getClass();
        this.b = b;
        k.getClass();
        this.k = k;
        c.getClass();
        this.c = c;
        l.getClass();
        this.l = l;
        this.d = d;
        kzz.getClass();
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
    
    public final void a(final lor g) {
        this.g = g;
        this.j = (tjo)new tjp(this.b, (atnb)new aawk(g, 8), (vmm)((lov)g).L.a(), (byte[])null);
        this.h = new ApiPlayerFactoryService(this.b, this.c, this.l, g, (byte[])null);
        this.i = new EmbedFragmentServiceFactoryService(this.b, this.c, this.l, g, (byte[])null);
        final aeis k = this.k;
        while (true) {
            if (k == null) {
                break Label_0123;
            }
            try {
                k.a.linkToDeath((IBinder$DeathRecipient)this, 0);
                k.a("SUCCESS", (IBinder)this);
                this.l.a((lqd)this);
            }
            catch (final RemoteException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void b(final Exception ex) {
        this.g = null;
        tut.d("Error creating ApiEnvironment", (Throwable)ex);
        if (this.k != null) {
            YouTubeService.b(this.k, lov.o(ex));
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
        ((eod)h).asBinder();
        return (IBinder)h;
    }
    
    public final IBinder e() {
        this.l();
        final EmbedFragmentServiceFactoryService i = this.i;
        ((eod)i).asBinder();
        return (IBinder)i;
    }
    
    public final void f() {
        final tjo j = this.j;
        if (j != null) {
            final tjp tjp = (tjp)j;
            tjp.a.unregisterReceiver((BroadcastReceiver)j);
            tjp.d.e((tif)tjp.b);
            tjp.d.e((tif)tjp.c);
            this.j = null;
        }
        if (this.g != null) {
            this.g = null;
        }
        this.h = null;
        this.i = null;
        if (this.k != null) {
            this.k.a.unlinkToDeath((IBinder$DeathRecipient)this, 0);
            this.k = null;
        }
        this.l.b((lqd)this);
        System.gc();
    }
    
    public final void g(final String s) {
        this.l();
        this.g.g(s, (zom)null);
    }
    
    public final void h() {
        this.l();
        this.g.h();
    }
    
    public final void i() {
        this.c.post((Runnable)new com.google.android.youtube.api.jar.client.c(this, 6));
    }
    
    public final aejk j(final aeji aeji) {
        this.l();
        return (aejk)new aejj(this.c, ((vxr)((lov)this.g).I).c(), this.g.f(), (tkq)((lov)this.g).N.a(), aeji, (byte[])null, (byte[])null);
    }
    
    public final void k(final aeir aeir) {
        this.l();
        final lov lov = (lov)this.g;
        if (!lov.f.isPresent()) {
            aftr.k("Listener registration failed: authentication events are disabled");
        }
        lov.f.ifPresent((Consumer)new llr(aeir, 6));
    }
}
