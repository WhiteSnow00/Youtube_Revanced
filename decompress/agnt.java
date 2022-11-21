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

public final class agnt
{
    public final boolean a;
    public final Object b;
    public final Object c;
    
    public agnt(final akso b, final VideoStreamingData c, final boolean a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public agnt(final Account b, final boolean a, final zra c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public agnt(Context a, final String s) {
        a = aha.a(a);
        this.b = a;
        final Context context = a;
        final SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.common.prefs:".concat(s), 0);
        this.c = sharedPreferences;
        final boolean contains = sharedPreferences.contains("firebase_data_collection_default_enabled");
        final boolean b = true;
        while (true) {
            if (contains) {
                final boolean a2 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                break Label_0145;
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
    
    public agnt(final Context context, final vbs vbs, final vbs vbs2) {
        this.c = context.getSystemService("vibrator");
        final boolean f = vbs.f(45372470L);
        boolean a = true;
        if (!f) {
            a = (vbs2.f(45376299L) && a);
        }
        this.a = a;
        this.b = VibrationEffect.createOneShot(25L, 255);
    }
    
    public agnt(final atnb b, final Executor c) {
        this.c = c;
        this.a = false;
        this.b = b;
    }
    
    public agnt(final PlaybackStartDescriptor c, final abla b, final boolean a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public agnt(final List c, final Map b) {
        this.c = c;
        this.b = b;
        this.a = true;
    }
    
    public agnt(final uxs c, final uxp b, final vbo vbo) {
        this.c = c;
        this.b = b;
        aisq aisq;
        if ((aisq = vbo.b().v) == null) {
            aisq = aisq.a;
        }
        this.a = aisq.i;
        aisq aisq2;
        if ((aisq2 = vbo.b().v) == null) {
            aisq2 = aisq.a;
        }
        b.u = aisq2.j;
    }
    
    public agnt(final vbs vbs) {
        this.a = vbs.A();
        final atls ae = atls.aE();
        this.c = ae;
        this.b = ((aske)ae).J().V();
    }
    
    public final boolean a() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public final afgm b() {
        adme.T(true);
        final Set set = (Set)((atnb)this.b).a();
        final afgj h = afgm.h();
        for (final aelz aelz : set) {
            adme.L(aelz.a.isEmpty() ^ true, "AccountProvider's account type cannot be an empty string.");
            h.g(aelz.a, aelz.b);
        }
        return h.c();
    }
    
    public final void c() {
        ((uxf)this.b).n = true;
        final uxf uxf = (uxf)this.c;
        uxf.n = false;
        uxf.j();
    }
    
    public final void d() {
        ((uxf)this.c).n = true;
        final uxf uxf = (uxf)this.b;
        uxf.n = false;
        uxf.j();
    }
    
    public final void e(final aobc aobc) {
        if (this.h()) {
            final Object c = this.c;
            afbh q;
            if (aobc != null && (aobc.c & 0x20000) != 0x0) {
                q = afbh.k(vht.h(amdu.b.a(), aobc.q));
            }
            else {
                q = afag.a;
            }
            final uxs uxs = (uxs)c;
            uxs.q = q;
            uxs.r.b();
            if (uxs.q.h()) {
                uxs.r.c(uxs.p.b().i((String)uxs.q.c(), true).af(aslh.a()).aH((asmi)new uvn(uxs, 8)));
            }
            uxs.j = afag.a;
            if (aobc != null && (aobc.c & 0x8000) != 0x0) {
                aoay aoay;
                if ((aoay = aobc.o) == null) {
                    aoay = aoay.a;
                }
                if ((aoay.b & 0x1) != 0x0) {
                    aoay aoay2;
                    if ((aoay2 = aobc.o) == null) {
                        aoay2 = aoay.a;
                    }
                    anxb anxb;
                    if ((anxb = aoay2.c) == null) {
                        anxb = anxb.a;
                    }
                    if (((ahcu)anxb).ry((ahci)ButtonRendererOuterClass.buttonRenderer)) {
                        aoay aoay3;
                        if ((aoay3 = aobc.o) == null) {
                            aoay3 = aoay.a;
                        }
                        anxb anxb2;
                        if ((anxb2 = aoay3.c) == null) {
                            anxb2 = anxb.a;
                        }
                        final aies aies = (aies)((ahcu)anxb2).rx((ahci)ButtonRendererOuterClass.buttonRenderer);
                        if ((aies.b & 0x200) != 0x0) {
                            uxs.l = afbh.k(new wzy(aies.w));
                            uxs.k.D((xbe)uxs.l.c());
                            ajws ajws;
                            if ((ajws = aies.i) == null) {
                                ajws = ajws.a;
                            }
                            uxs.j = afbh.k(acbu.b(ajws));
                        }
                    }
                }
            }
        }
    }
    
    public final void f() {
        if (this.h()) {
            ((uxf)this.c).i();
            return;
        }
        if (this.g()) {
            ((uxf)this.b).i();
        }
    }
    
    public final boolean g() {
        return ((uxf)this.b).n;
    }
    
    public final boolean h() {
        return ((uxf)this.c).n;
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
                    tut.d("Failed to haptics vibrate for fine scrubbing.", (Throwable)ex);
                }
            }
        }
    }
}
