import java.io.File;
import android.net.Uri;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.$AutoValue_TranscodeOptions;
import android.graphics.RectF;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.SegmentProcessingService;
import android.os.IBinder;
import android.content.ComponentName;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.TranscodeOptions;
import android.content.BroadcastReceiver;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

final class hdu implements ServiceConnection
{
    public final gxf a;
    boolean b;
    BroadcastReceiver c;
    public final qpt d;
    private final tzw e;
    private final hds f;
    private final TranscodeOptions g;
    
    public hdu(final gxf a, final qpt d, final hds f, final TranscodeOptions g, final tzw e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.b = false;
        this.f = f;
        this.g = g;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (binder == null) {
            trn.b("Service bound is null.");
            return;
        }
        final SegmentProcessingService segmentProcessingService = (SegmentProcessingService)((adkm)binder).a;
        final hdv b = segmentProcessingService.b();
        final PackageManager packageManager = segmentProcessingService.getPackageManager();
        final afp afp = new afp((Context)b.a, "segmentProcessingServiceChannel");
        afp.q(2131231928);
        afp.i((CharSequence)((SegmentProcessingService)b.a).getString(2132019989));
        final Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(((SegmentProcessingService)b.a).getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(270532608);
            launchIntentForPackage.setComponent(new ComponentName((Context)b.a, (Class)SegmentProcessingService.class));
            afp.g = qjs.b((Context)b.b, launchIntentForPackage, 67108864);
        }
        else {
            trn.b("Cannot find the launch intent in the package.");
        }
        segmentProcessingService.startForeground(1073042767, afp.a());
        final gxf a = this.a;
        final hds f = this.f;
        final TranscodeOptions g = this.g;
        final tzw e = this.e;
        final aqyq b2 = f.b;
        a.c = f.d;
        Object f2;
        if (f.g != null) {
            final Integer i = f.i;
            int intValue;
            if (i == null) {
                intValue = 0;
            }
            else {
                intValue = i;
            }
            final Context b3 = a.b;
            final Uri a2 = f.a;
            final Uri h = f.h;
            final long micros = TimeUnit.MILLISECONDS.toMicros(intValue);
            final long micros2 = TimeUnit.MILLISECONDS.toMicros(b2.c);
            final long micros3 = TimeUnit.MILLISECONDS.toMicros(b2.d);
            final bbp bbp = new bbp(b3);
            f2 = new bmy((bnx)new bop((bbj)bbp).b(ayt.b(a2)), micros2, micros3);
            if (h != null) {
                f2 = new boh(true, new bnx[] { (bnx)f2, (bnx)new bmy((bnx)new bop((bbj)bbp).b(ayt.b(h)), micros + micros2, micros + micros3) }, (byte[])null);
            }
        }
        else {
            f2 = qcj.F(a.b, f.a, TimeUnit.MILLISECONDS.toMicros(b2.c), TimeUnit.MILLISECONDS.toMicros(b2.d));
        }
        final RectF rectF = new RectF(b2.h, b2.e, 1.0f - b2.g, 1.0f - b2.f);
        final File k = f.k;
        String.valueOf(k);
        final Context b4 = a.b;
        final String path = k.getPath();
        if (path != null) {
            final $AutoValue_TranscodeOptions $AutoValue_TranscodeOptions = ($AutoValue_TranscodeOptions)g;
            a.e = new rhz(new rdn(b4, path, (bnx)f2, $AutoValue_TranscodeOptions.a, $AutoValue_TranscodeOptions.b, rectF, (rdl)new gxd(a, f, e, k), (rdk)new gxe(a, e), (qyc)new qyj(a.d, 1), a.a));
            ((qxx)a.e.a).f();
            return;
        }
        throw new NullPointerException("Null outputPath");
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
    }
}
