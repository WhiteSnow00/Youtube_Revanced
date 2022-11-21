// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.creation.publish;

import android.content.ComponentName;
import java.util.concurrent.ScheduledExecutorService;
import java.io.File;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import android.net.Uri;
import android.os.Bundle;
import java.util.EnumSet;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import java.nio.charset.Charset;
import j$.nio.charset.StandardCharsets;
import java.io.IOException;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import android.os.IBinder;

public class ClientSideRenderingService extends uef
{
    public static final String a;
    public static final String b;
    static final int c;
    public String d;
    public String e;
    public udz f;
    public ufz g;
    public vey h;
    public zoa i;
    public String j;
    public vgx k;
    public int l;
    public int m;
    public int n;
    public long o;
    public oqz p;
    private final IBinder q;
    private udt r;
    
    static {
        a = String.valueOf(ClientSideRenderingService.class.getName()).concat(".task_id");
        b = String.valueOf(ClientSideRenderingService.class.getName()).concat(".working_dir");
        c = 1870122802;
    }
    
    public ClientSideRenderingService() {
        this.q = (IBinder)new aahi(this);
    }
    
    public static String a(String string, final String s, final String s2, final String s3, final String s4) {
        final boolean f = afbj.f(s3);
        final int n = 0;
        final int n2 = 0;
        int hashCode = n;
        if (!f) {
            arcy g;
            try {
                final BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(s3));
                g = arcy.g(bufferedInputStream, ExtensionRegistryLite.getGeneratedRegistry());
                bufferedInputStream.close();
            }
            catch (final IOException ex) {
                tut.c("YOUTUBE_SHORTS_CSR", "StateEvent file not found or can't be parsed!");
                g = null;
            }
            hashCode = n;
            if (g != null) {
                final ahcr builder = g.toBuilder();
                int n3 = 0;
                int i;
                while (true) {
                    i = n2;
                    if (n3 >= g.b()) {
                        break;
                    }
                    final arcn arcn = (arcn)((ahcz)g.d(n3)).toBuilder();
                    ((ahcr)arcn).copyOnWrite();
                    arco.w((arco)arcn.instance);
                    builder.copyOnWrite();
                    arcy.j((arcy)builder.instance, n3, (arco)((ahcr)arcn).build());
                    ++n3;
                }
                while (i < g.a()) {
                    final ahcr builder2 = g.c(i).toBuilder();
                    builder2.copyOnWrite();
                    final arbk arbk = (arbk)builder2.instance;
                    arbk.b &= 0xFFFFFFFE;
                    arbk.c = 0L;
                    builder.copyOnWrite();
                    arcy.k((arcy)builder.instance, i, (arbk)builder2.build());
                    ++i;
                }
                hashCode = builder.build().hashCode();
            }
        }
        final StringBuilder sb = new StringBuilder("videoFileUri=");
        sb.append(string);
        sb.append("&startPositionUs=");
        sb.append(s);
        sb.append("&endPositionUs=");
        sb.append(s2);
        sb.append("&stateEventHashCode=");
        sb.append(hashCode);
        sb.append("&filterName=");
        sb.append(s4);
        string = sb.toString();
        final afpy a = afqb.a();
        final Charset utf_8 = StandardCharsets.UTF_8;
        final afpz a2 = ((afpt)a).a();
        ((afpu)a2).e(string.toString().getBytes(utf_8));
        return a2.g().toString();
    }
    
    private final void e() {
        final udt r = this.r;
        if (r != null && ((uee)r).a == uds.b) {
            final udt r2 = this.r;
            synchronized (((uee)r2).b) {
                final uue m = ((uee)r2).m;
                if (m == null) {
                    ((uee)r2).b();
                }
                else {
                    final uuh i = m.i;
                    if (i != null) {
                        i.b();
                        m.i = null;
                    }
                    final rag j = m.j;
                    if (j != null) {
                        j.a();
                    }
                }
            }
        }
        this.r = null;
    }
    
    public final void b() {
        this.e();
        this.stopForeground(true);
        this.stopSelf();
    }
    
    public final IBinder onBind(final Intent intent) {
        return this.q;
    }
    
    public final void onCreate() {
        super.onCreate();
        ((NotificationManager)((Context)this).getSystemService((Class)NotificationManager.class)).createNotificationChannel(new NotificationChannel("ClientSideRenderingServiceNotificationChannel", (CharSequence)"Client Side Rendering Service Channel", 2));
    }
    
    public final void onDestroy() {
        this.e();
    }
    
    public final int onStartCommand(Intent launchIntentForPackage, int c, final int n) {
        final String stringExtra = launchIntentForPackage.getStringExtra(ClientSideRenderingService.a);
        if (aexq.c(stringExtra, this.d)) {
            final EnumSet<uds> of = EnumSet.of(uds.a, uds.b);
            final udt r = this.r;
            uds uds;
            if (r != null) {
                uds = ((uee)r).a;
            }
            else {
                uds = uds.f;
            }
            if (of.contains(uds)) {
                return 2;
            }
        }
        final String stringExtra2 = launchIntentForPackage.getStringExtra("EXTRA_CSR_FRONTEND_UPLOAD_ID");
        if (stringExtra2 != null) {
            final Bundle bundle = new Bundle();
            bundle.putString("frontend_id_key", stringExtra2);
            this.k = (vgx)this.h.a(this.i.c());
            this.j = vht.f(397, stringExtra2);
            this.g.o(bundle, (aisc)null);
        }
        this.e();
        this.d = stringExtra;
        final Uri uri = (Uri)launchIntentForPackage.getParcelableExtra("EXTRA_CSR_EDITED_VIDEO_URI");
        uri.getClass();
        final String queryParameter = uri.getQueryParameter("videoEffectsStateFilePath");
        final String queryParameter2 = uri.getQueryParameter("filter");
        adme.T(tqf.bB(queryParameter, queryParameter2));
        final String queryParameter3 = uri.getQueryParameter("videoFileUri");
        queryParameter3.getClass();
        final long micros = TimeUnit.MILLISECONDS.toMicros(launchIntentForPackage.getLongExtra("EXTRA_CSR_VIDEO_DURATION_MS", 0L));
        final String queryParameter4 = uri.getQueryParameter("trimStartUs");
        final String queryParameter5 = uri.getQueryParameter("trimEndUs");
        long long1;
        if (queryParameter4 != null) {
            long1 = Long.parseLong(queryParameter4);
        }
        else {
            long1 = 0L;
        }
        long long2;
        if (queryParameter5 != null) {
            long2 = Long.parseLong(queryParameter5);
        }
        else {
            long2 = micros;
        }
        final bob e = rmc.e((Context)this, Uri.parse(queryParameter3), long1, long2);
        this.l = launchIntentForPackage.getIntExtra("EXTRA_CSR_VIDEO_WIDTH", 720);
        this.m = launchIntentForPackage.getIntExtra("EXTRA_CSR_VIDEO_HEIGHT", 1280);
        this.n = launchIntentForPackage.getIntExtra("EXTRA_CSR_TARGET_OUTPUT_VIDEO_QUALITY", 5);
        this.o = TimeUnit.MICROSECONDS.toMillis(micros);
        final String stringExtra3 = launchIntentForPackage.getStringExtra(ClientSideRenderingService.b);
        stringExtra3.getClass();
        this.e = stringExtra3;
        final File ba = tqf.bA(new File(this.e), String.valueOf(this.d).concat(".mp4"));
        final oqz p3 = this.p;
        final uee r2 = new uee((ucm)((eqt)p3.a).b.e.a(), (ScheduledExecutorService)((eqt)p3.a).a.r.a(), (unb)((eqt)p3.a).a.a.av.a(), (unb)((eqt)p3.a).a.a.av.a(), (gxz)((eqt)p3.a).b.f.a(), (oqz)((eqt)p3.a).b.i.a(), new ued(e, ba, queryParameter, queryParameter2, this.l, this.m, this.n), (aapu)((eqt)p3.a).a.a.ar.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.r = (udt)r2;
        final udy l = new udy(this);
        final uee uee = r2;
        r2.l = (udz)l;
        r2.d.c((uqi)new uec(r2));
        c = ClientSideRenderingService.c;
        final afr afr = new afr((Context)this, "ClientSideRenderingServiceNotificationChannel");
        afr.q(2131231926);
        afr.i((CharSequence)((Context)this).getString(2132019993));
        launchIntentForPackage = ((Context)this).getPackageManager().getLaunchIntentForPackage(((Context)this).getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(270532608);
            launchIntentForPackage.setComponent(new ComponentName((Context)this, (Class)ClientSideRenderingService.class));
            afr.g = qlw.b((Context)this, launchIntentForPackage, 67108864);
        }
        this.startForeground(c, afr.a());
        return 2;
    }
    
    public final void onTaskRemoved(final Intent intent) {
        this.b();
    }
}
