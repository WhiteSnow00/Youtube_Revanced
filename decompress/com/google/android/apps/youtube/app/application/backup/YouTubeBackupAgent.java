// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.application.backup;

import android.os.Build$VERSION;
import android.app.backup.BackupDataInput;
import java.util.List;
import android.app.backup.FileBackupHelper;
import android.text.TextUtils;
import android.net.Uri;
import android.app.backup.BackupHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.ContextWrapper;
import android.app.Activity;
import android.app.Service;
import android.app.Application;
import android.app.backup.BackupDataOutput;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.File;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.app.backup.RestoreObserver;
import android.app.backup.BackupManager;
import android.os.FileObserver;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public class YouTubeBackupAgent extends tdi
{
    public static final Class[] a;
    private static final Map f;
    public vaf b;
    public vlq c;
    
    static {
        a = new Class[] { fex.class, fmy.class, aald.class, aale.class, rig.class, tfg.class, zvf.class, adkp.class, yag.class, llp.class, jwp.class, jzg.class, fbu.class, kzr.class, glb.class };
        final HashMap f2 = new HashMap();
        f2.put("youtube", ewl.a);
        f = f2;
    }
    
    public static FileObserver a(final Context context) {
        final ewj ewj = new ewj(context.getDatabasePath("identity.db").getPath(), context);
        ((FileObserver)ewj).startWatching();
        return (FileObserver)ewj;
    }
    
    public static void d(final Context context) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences("youtube", 0);
        if (sharedPreferences.getBoolean("got_future_restore", false) && tum.a(context) >= sharedPreferences.getInt("future_restore_version", Integer.MAX_VALUE)) {
            final ewk ewk = new ewk(sharedPreferences);
            ttr.g("Triggering manual restore.");
            new BackupManager(context).requestRestore((RestoreObserver)ewk);
        }
    }
    
    public static void e(final Context context) {
        BackupManager.dataChanged(context.getPackageName());
        context.getSharedPreferences("youtube", 0).edit().putBoolean("got_future_restore", false).apply();
    }
    
    public static void f(final Context context) {
        context.getSharedPreferences("youtube", 0).registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)new jqc(context, 1));
    }
    
    public static boolean g(final vlq vlq) {
        return vlq == null || vlq.g("enable_backup_and_restore");
    }
    
    private final File k() {
        return this.getDatabasePath("identity.db");
    }
    
    private final File l() {
        return new File(this.getFilesDir(), "identity.db");
    }
    
    private static final void m(final File file, final File file2) {
        try {
            afpj.a(file, file2);
        }
        catch (final IOException ex) {
            ttr.g("Unable to copy identity database.");
        }
    }
    
    private static final void n(final File file) {
        if (!file.delete()) {
            ttr.g("Unable to delete identity database file from files directory.");
        }
    }
    
    protected final afeq b() {
        final afel d = afeq.d();
        d.h(vyg.t(this.getApplicationContext()));
        d.h(aakt.d(this.getApplicationContext()));
        d.h(aale.n(this.getApplicationContext()));
        d.h(tfg.k(this.getApplicationContext(), "commonui", "pivotbar_proto.pb"));
        d.h(tfg.k(this.getApplicationContext(), "commonui", "topbar_proto.pb"));
        d.h(fqy.a(this.getApplicationContext()));
        d.h(tfg.k(this.getApplicationContext(), "commonui", "theme_proto.pb"));
        d.h(tfg.k(this.getApplicationContext(), "commonui", "spatial_audio_mealbar_proto.pb"));
        d.h(fbu.a(this.getApplicationContext()));
        d.h(kzr.a(this.getApplicationContext()));
        final vaf b = this.b;
        if (b != null) {
            amjm amjm;
            if ((amjm = b.b().m) == null) {
                amjm = amjm.a;
            }
            anqt anqt;
            if ((anqt = amjm.f) == null) {
                anqt = anqt.a;
            }
            if (anqt.g) {
                d.h(tfg.k(this.getApplicationContext(), "offline", "offlinemainbackedup.pb"));
            }
        }
        return d.g();
    }
    
    protected final Map c() {
        return YouTubeBackupAgent.f;
    }
    
    public final void onBackup(final ParcelFileDescriptor parcelFileDescriptor, final BackupDataOutput backupDataOutput, final ParcelFileDescriptor parcelFileDescriptor2) {
        if (!g(this.c)) {
            return;
        }
        final File k = this.k();
        final File l = this.l();
        m(k, l);
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        n(l);
    }
    
    public final void onCreate() {
        Object o = this;
        int i = 0;
        while (true) {
            while (i < 10000) {
                Object o2;
                if (o == null) {
                    o2 = aeyo.a;
                }
                else if (o instanceof Application) {
                    o2 = aezp.k((Object)o);
                }
                else if (o instanceof Service) {
                    o2 = aezp.k((Object)((Service)o).getApplication());
                }
                else {
                    if (!(o instanceof Activity)) {
                        if (o instanceof ContextWrapper) {
                            o = ((ContextWrapper)o).getBaseContext();
                        }
                        else {
                            o = ((Context)o).getApplicationContext();
                        }
                        ++i;
                        continue;
                    }
                    o2 = aezp.k((Object)((Activity)o).getApplication());
                }
                final aezp aezp = (aezp)((aezp)o2).b((aezf)new sts((Class)ewi.class, 16)).d((afaq)fkw.q);
                if (!aezp.h()) {
                    ttr.l("Skipping auto-backup due to unknown component");
                    return;
                }
                ((ewi)aezp.c()).wv(this);
                if (g(this.c)) {
                    ((obm)this).addHelper("persistent_backup_agent_helper_prefs", (BackupHelper)new SharedPreferencesBackupHelper((Context)this, new String[] { "persistent_backup_agent_helper" }));
                    super.e = tfg.r(this.getApplicationContext(), false);
                    super.d = mdp.R();
                    final afeq b = this.b();
                    final afih afih = (afih)b;
                    final String[] array = new String[afih.c];
                    for (int j = 0; j < afih.c; ++j) {
                        final Context applicationContext = this.getApplicationContext();
                        final eg e = super.e;
                        final Uri uri = (Uri)b.get(j);
                        final qpb b2 = qpb.b();
                        b2.c();
                        String s = null;
                        Label_0389: {
                            try {
                                final File file = (File)e.ag(uri, (qnx)b2);
                                final File filesDir = applicationContext.getFilesDir();
                                if (file.getPath().startsWith(filesDir.getPath())) {
                                    s = file.getPath().replace(filesDir.getPath(), "");
                                    break Label_0389;
                                }
                            }
                            catch (final IOException ex) {
                                ttr.d("Failed to find the file from given uri", (Throwable)ex);
                            }
                            final List pathSegments = uri.getPathSegments();
                            if (pathSegments.size() > 1) {
                                s = TextUtils.join((CharSequence)File.separator, (Iterable)pathSegments.subList(1, pathSegments.size()));
                            }
                            else {
                                s = "";
                            }
                        }
                        array[j] = s;
                    }
                    this.addHelper("protodatastore", (BackupHelper)new FileBackupHelper(this.getApplicationContext(), array));
                    this.addHelper("DATABASES", (BackupHelper)new FileBackupHelper((Context)this, new String[] { "identity.db" }));
                }
                return;
            }
            Object o2 = aeyo.a;
            continue;
        }
    }
    
    public final void onRestore(final BackupDataInput backupDataInput, final int n, final ParcelFileDescriptor parcelFileDescriptor) {
        if (!g(this.c)) {
            return;
        }
        final Context applicationContext = this.getApplicationContext();
        final int a = tum.a(applicationContext);
        if (a == 0) {
            return;
        }
        if (n > a && Build$VERSION.SDK_INT <= 32) {
            applicationContext.getSharedPreferences("youtube", 0).edit().putBoolean("got_future_restore", true).putInt("future_restore_version", n).apply();
            ttr.g("Restore from future version skipped - will trigger a manual restore at next update.");
            return;
        }
        super.onRestore(backupDataInput, n, parcelFileDescriptor);
        ttr.g("Restore initiated.");
        final File l = this.l();
        m(l, this.k());
        n(l);
    }
}
