import android.os.Vibrator;
import android.os.Build$VERSION;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.List;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;
import android.os.VibrationEffect;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.SharedPreferences;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import android.accounts.Account;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmc
{
    public final boolean a;
    public final Object b;
    public final Object c;
    
    public agmc(final akqn b, final VideoStreamingData c, final boolean a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public agmc(final Account b, final boolean a, final zpe c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public agmc(Context a, final String s) {
        a = agz.a(a);
        this.b = a;
        final Context context = a;
        final SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.common.prefs:".concat(s), 0);
        this.c = sharedPreferences;
        final boolean contains = sharedPreferences.contains("firebase_data_collection_default_enabled");
        final boolean b = true;
        while (true) {
            if (contains) {
                final boolean a2 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                break Label_0143;
            }
            try {
                final Context context2 = a;
                final PackageManager packageManager = a.getPackageManager();
                boolean a2 = b;
                if (packageManager != null) {
                    final Context context3 = a;
                    final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128);
                    a2 = b;
                    if (applicationInfo != null) {
                        a2 = b;
                        if (applicationInfo.metaData != null) {
                            a2 = b;
                            if (applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                                a2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                            }
                        }
                    }
                }
                this.a = a2;
            }
            catch (final PackageManager$NameNotFoundException ex) {
                final boolean a2 = b;
                continue;
            }
            break;
        }
    }
    
    public agmc(final Context context, final vai vai, final vai vai2) {
        this.c = context.getSystemService("vibrator");
        final boolean f = vai.f(45372470L);
        boolean a = true;
        if (!f) {
            a = (vai2.f(45376299L) && a);
        }
        this.a = a;
        this.b = VibrationEffect.createOneShot(25L, 255);
    }
    
    public agmc(final atke b, final Executor c) {
        this.c = c;
        this.a = false;
        this.b = b;
    }
    
    public agmc(final PlaybackStartDescriptor c, final abjt b, final boolean a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public agmc(final List c, final Map b) {
        this.c = c;
        this.b = b;
        this.a = true;
    }
    
    public agmc(final uwm c, final uwj b, final vaf vaf) {
        this.c = c;
        this.b = b;
        aiqw aiqw;
        if ((aiqw = vaf.b().v) == null) {
            aiqw = aiqw.a;
        }
        this.a = aiqw.i;
        aiqw aiqw2;
        if ((aiqw2 = vaf.b().v) == null) {
            aiqw2 = aiqw.a;
        }
        b.u = aiqw2.j;
    }
    
    public agmc(final vai vai) {
        this.a = vai.A();
        final ativ ae = ativ.aE();
        this.c = ae;
        this.b = ((ashi)ae).J().V();
    }
    
    public final boolean a() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public final afev b() {
        adkp.Q(true);
        final Set set = (Set)((atke)this.b).a();
        final afes h = afev.h();
        for (final aekg aekg : set) {
            adkp.I(aekg.a.isEmpty() ^ true, (Object)"AccountProvider's account type cannot be an empty string.");
            h.g(aekg.a, aekg.b);
        }
        return h.c();
    }
    
    public final void c() {
        ((uwa)this.b).n = true;
        final uwa uwa = (uwa)this.c;
        uwa.n = false;
        uwa.j();
    }
    
    public final void d() {
        ((uwa)this.c).n = true;
        final uwa uwa = (uwa)this.b;
        uwa.n = false;
        uwa.j();
    }
    
    public final void e(final anyv anyv) {
        if (this.h()) {
            final Object c = this.c;
            Object q;
            if (anyv != null && (anyv.c & 0x20000) != 0x0) {
                q = aezp.k((Object)vgl.h(ambu.b.a(), anyv.q));
            }
            else {
                q = aeyo.a;
            }
            final uwm uwm = (uwm)c;
            uwm.q = (aezp)q;
            uwm.r.b();
            if (uwm.q.h()) {
                uwm.r.c(uwm.p.b().h((String)uwm.q.c(), true).af(asil.a()).aH((asjm)new uvm(uwm, 4)));
            }
            uwm.j = (aezp)aeyo.a;
            if (anyv != null && (anyv.c & 0x8000) != 0x0) {
                anyr anyr;
                if ((anyr = anyv.o) == null) {
                    anyr = anyr.a;
                }
                if ((anyr.b & 0x1) != 0x0) {
                    anyr anyr2;
                    if ((anyr2 = anyv.o) == null) {
                        anyr2 = anyr.a;
                    }
                    anuv anuv;
                    if ((anuv = anyr2.c) == null) {
                        anuv = anuv.a;
                    }
                    if (anuv.ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
                        anyr anyr3;
                        if ((anyr3 = anyv.o) == null) {
                            anyr3 = anyr.a;
                        }
                        anuv anuv2;
                        if ((anuv2 = anyr3.c) == null) {
                            anuv2 = anuv.a;
                        }
                        final aicz aicz = (aicz)anuv2.rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
                        if ((aicz.b & 0x200) != 0x0) {
                            uwm.l = aezp.k((Object)new wyt(aicz.w));
                            uwm.k.D((wzz)uwm.l.c());
                            ajut ajut;
                            if ((ajut = aicz.i) == null) {
                                ajut = ajut.a;
                            }
                            uwm.j = aezp.k((Object)acak.b(ajut));
                        }
                    }
                }
            }
        }
    }
    
    public final void f() {
        if (this.h()) {
            ((uwa)this.c).i();
            return;
        }
        if (this.g()) {
            ((uwa)this.b).i();
        }
    }
    
    public final boolean g() {
        return ((uwa)this.b).n;
    }
    
    public final boolean h() {
        return ((uwa)this.c).n;
    }
    
    public final void i() {
        if (this.c != null && Build$VERSION.SDK_INT != 26) {
            if (this.a) {
                try {
                    if (this.b != null && Build$VERSION.SDK_INT > 26) {
                        ((Vibrator)this.c).vibrate((VibrationEffect)this.b);
                        return;
                    }
                    ((Vibrator)this.c).vibrate(25L);
                }
                catch (final RuntimeException ex) {
                    ttr.d("Failed to haptics vibrate for fine scrubbing.", (Throwable)ex);
                }
            }
        }
    }
}
