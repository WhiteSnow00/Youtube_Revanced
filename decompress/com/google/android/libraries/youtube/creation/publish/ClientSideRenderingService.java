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

public class ClientSideRenderingService extends uda
{
    public static final String a;
    public static final String b;
    static final int c;
    public String d;
    public String e;
    public ucu f;
    public ueu g;
    public vdr h;
    public zmf i;
    public String j;
    public vfp k;
    public int l;
    public int m;
    public int n;
    public long o;
    public pvh p;
    private final IBinder q;
    private uco r;
    
    static {
        a = String.valueOf(ClientSideRenderingService.class.getName()).concat(".task_id");
        b = String.valueOf(ClientSideRenderingService.class.getName()).concat(".working_dir");
        c = 1870122802;
    }
    
    public ClientSideRenderingService() {
        this.q = (IBinder)new aafl(this);
    }
    
    public static String a(final String s, final String s2, String string, final String s3, final String s4) {
        final boolean f = aezr.f(s3);
        final int n = 0;
        final int n2 = 0;
        int hashCode = n;
        if (!f) {
            arad g;
            try {
                final BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(s3));
                g = arad.g((InputStream)bufferedInputStream, ExtensionRegistryLite.getGeneratedRegistry());
                bufferedInputStream.close();
            }
            catch (final IOException ex) {
                ttr.c("YOUTUBE_SHORTS_CSR", "StateEvent file not found or can't be parsed!");
                g = null;
            }
            hashCode = n;
            if (g != null) {
                final ahaz builder = ((ahbh)g).toBuilder();
                int n3 = 0;
                int i;
                while (true) {
                    i = n2;
                    if (n3 >= g.b()) {
                        break;
                    }
                    final aqzs aqzs = (aqzs)((ahbh)g.d(n3)).toBuilder();
                    ((ahaz)aqzs).copyOnWrite();
                    aqzt.w((aqzt)aqzs.instance);
                    builder.copyOnWrite();
                    arad.j((arad)builder.instance, n3, (aqzt)((ahaz)aqzs).build());
                    ++n3;
                }
                while (i < g.a()) {
                    final ahaz builder2 = ((ahbh)g.c(i)).toBuilder();
                    builder2.copyOnWrite();
                    final aqyp aqyp = (aqyp)builder2.instance;
                    aqyp.b &= 0xFFFFFFFE;
                    aqyp.c = 0L;
                    builder.copyOnWrite();
                    arad.k((arad)builder.instance, i, (aqyp)builder2.build());
                    ++i;
                }
                hashCode = ((ahbh)builder.build()).hashCode();
            }
        }
        final StringBuilder sb = new StringBuilder("videoFileUri=");
        sb.append(s);
        sb.append("&startPositionUs=");
        sb.append(s2);
        sb.append("&endPositionUs=");
        sb.append(string);
        sb.append("&stateEventHashCode=");
        sb.append(hashCode);
        sb.append("&filterName=");
        sb.append(s4);
        string = sb.toString();
        final afoi a = afol.a();
        final Charset utf_8 = StandardCharsets.UTF_8;
        final afoj a2 = ((afod)a).a();
        ((afoe)a2).e(string.toString().getBytes(utf_8));
        return a2.g().toString();
    }
    
    private final void e() {
        final uco r = this.r;
        if (r != null && ((ucz)r).a == ucn.b) {
            final uco r2 = this.r;
            synchronized (((ucz)r2).b) {
                final utd m = ((ucz)r2).m;
                if (m == null) {
                    ((ucz)r2).b();
                }
                else {
                    final utg i = m.i;
                    if (i != null) {
                        i.b();
                        m.i = null;
                    }
                    final qzi j = m.j;
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
        if (adkp.ae(stringExtra, this.d)) {
            final EnumSet<ucn> of = EnumSet.of(ucn.a, ucn.b);
            final uco r = this.r;
            ucn ucn;
            if (r != null) {
                ucn = ((ucz)r).a;
            }
            else {
                ucn = ucn.f;
            }
            if (of.contains(ucn)) {
                return 2;
            }
        }
        final String stringExtra2 = launchIntentForPackage.getStringExtra("EXTRA_CSR_FRONTEND_UPLOAD_ID");
        if (stringExtra2 != null) {
            final Bundle bundle = new Bundle();
            bundle.putString("frontend_id_key", stringExtra2);
            this.k = (vfp)this.h.a(this.i.c());
            this.j = vgl.f(397, stringExtra2);
            this.g.o(bundle, (aiqj)null);
        }
        this.e();
        this.d = stringExtra;
        final Uri uri = (Uri)launchIntentForPackage.getParcelableExtra("EXTRA_CSR_EDITED_VIDEO_URI");
        uri.getClass();
        final String queryParameter = uri.getQueryParameter("videoEffectsStateFilePath");
        final String queryParameter2 = uri.getQueryParameter("filter");
        adkp.Q(tpe.bB(queryParameter, queryParameter2));
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
        final bny g = rlc.g((Context)this, Uri.parse(queryParameter3), long1, long2);
        this.l = launchIntentForPackage.getIntExtra("EXTRA_CSR_VIDEO_WIDTH", 720);
        this.m = launchIntentForPackage.getIntExtra("EXTRA_CSR_VIDEO_HEIGHT", 1280);
        this.n = launchIntentForPackage.getIntExtra("EXTRA_CSR_TARGET_OUTPUT_VIDEO_QUALITY", 5);
        this.o = TimeUnit.MICROSECONDS.toMillis(micros);
        final String stringExtra3 = launchIntentForPackage.getStringExtra(ClientSideRenderingService.b);
        stringExtra3.getClass();
        this.e = stringExtra3;
        final File ba = tpe.bA(new File(this.e), String.valueOf(this.d).concat(".mp4"));
        final pvh p3 = this.p;
        final ucz r2 = new ucz((ubg)((eqr)p3.a).b.e.a(), (ScheduledExecutorService)((eqr)p3.a).a.r.a(), (uly)((eqr)p3.a).a.a.at.a(), (uly)((eqr)p3.a).a.a.at.a(), (gxp)((eqr)p3.a).b.f.a(), (pvh)((eqr)p3.a).b.i.a(), new ucy(g, ba, queryParameter, queryParameter2, this.l, this.m, this.n), (aujg)((eqr)p3.a).a.a.ar.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.r = (uco)r2;
        final uct l = new uct(this);
        final ucz ucz = r2;
        r2.l = (ucu)l;
        r2.d.c((uph)new ucx(r2));
        c = ClientSideRenderingService.c;
        final afq afq = new afq((Context)this, "ClientSideRenderingServiceNotificationChannel");
        afq.q(2131231928);
        afq.i((CharSequence)((Context)this).getString(2132019990));
        launchIntentForPackage = ((Context)this).getPackageManager().getLaunchIntentForPackage(((Context)this).getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(270532608);
            launchIntentForPackage.setComponent(new ComponentName((Context)this, (Class)ClientSideRenderingService.class));
            afq.g = qlc.b((Context)this, launchIntentForPackage, 67108864);
        }
        this.startForeground(c, afq.a());
        return 2;
    }
    
    public final void onTaskRemoved(final Intent intent) {
        this.b();
    }
}
