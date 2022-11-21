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

public class YouTubeBackupAgent extends tem
{
    public static final Class[] a;
    private static final Map f;
    public vbo b;
    public vmx c;
    
    static {
        a = new Class[] { ffa.class, fnb.class, aamz.class, aana.class, rje.class, tgj.class, zxd.class, adme.class, ych.class, lma.class, jwx.class, jzq.class, fbx.class, kzz.class, glg.class };
        final HashMap f2 = new HashMap();
        f2.put("youtube", ewn.a);
        f = f2;
    }
    
    public static FileObserver a(final Context context) {
        final ewl ewl = new ewl(context.getDatabasePath("identity.db").getPath(), context);
        ((FileObserver)ewl).startWatching();
        return (FileObserver)ewl;
    }
    
    public static void d(final Context context) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences("youtube", 0);
        if (sharedPreferences.getBoolean("got_future_restore", false) && tvo.a(context) >= sharedPreferences.getInt("future_restore_version", Integer.MAX_VALUE)) {
            final ewm ewm = new ewm(sharedPreferences);
            tut.g("Triggering manual restore.");
            new BackupManager(context).requestRestore((RestoreObserver)ewm);
        }
    }
    
    public static void e(final Context context) {
        BackupManager.dataChanged(context.getPackageName());
        context.getSharedPreferences("youtube", 0).edit().putBoolean("got_future_restore", false).apply();
    }
    
    public static void f(final Context context) {
        context.getSharedPreferences("youtube", 0).registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)new jqj(context, 1));
    }
    
    public static boolean g(final vmx vmx) {
        return vmx == null || vmx.g("enable_backup_and_restore");
    }
    
    private final File k() {
        return this.getDatabasePath("identity.db");
    }
    
    private final File l() {
        return new File(this.getFilesDir(), "identity.db");
    }
    
    private static final void m(final File file, final File file2) {
        try {
            afqz.a(file, file2);
        }
        catch (final IOException ex) {
            tut.g("Unable to copy identity database.");
        }
    }
    
    private static final void n(final File file) {
        if (!file.delete()) {
            tut.g("Unable to delete identity database file from files directory.");
        }
    }
    
    protected final afgh b() {
        final afgc d = afgh.d();
        d.h(wbe.C(this.getApplicationContext()));
        d.h(aamp.d(this.getApplicationContext()));
        d.h(aana.n(this.getApplicationContext()));
        d.h(tgj.l(this.getApplicationContext(), "commonui", "pivotbar_proto.pb"));
        d.h(tgj.l(this.getApplicationContext(), "commonui", "topbar_proto.pb"));
        d.h(fra.a(this.getApplicationContext()));
        d.h(tgj.l(this.getApplicationContext(), "commonui", "theme_proto.pb"));
        d.h(tgj.l(this.getApplicationContext(), "commonui", "spatial_audio_mealbar_proto.pb"));
        d.h(fbx.a(this.getApplicationContext()));
        d.h(kzz.a(this.getApplicationContext()));
        final vbo b = this.b;
        if (b != null) {
            amlr amlr;
            if ((amlr = b.b().m) == null) {
                amlr = amlr.a;
            }
            ansz ansz;
            if ((ansz = amlr.f) == null) {
                ansz = ansz.a;
            }
            if (ansz.g) {
                d.h(tgj.l(this.getApplicationContext(), "offline", "offlinemainbackedup.pb"));
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
                afbh afbh;
                if (o == null) {
                    afbh = afag.a;
                }
                else if (o instanceof Application) {
                    afbh = afbh.k(o);
                }
                else if (o instanceof Service) {
                    afbh = afbh.k(((Service)o).getApplication());
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
                    afbh = afbh.k(((Activity)o).getApplication());
                }
                final afbh afbh2 = (afbh)afbh.b((afax)new sur((Class)ewk.class, 16)).d((afci)fkz.q);
                if (!afbh2.h()) {
                    tut.l("Skipping auto-backup due to unknown component");
                    return;
                }
                ((ewk)afbh2.c()).xg(this);
                if (g(this.c)) {
                    ((occ)this).addHelper("persistent_backup_agent_helper_prefs", (BackupHelper)new SharedPreferencesBackupHelper((Context)this, new String[] { "persistent_backup_agent_helper" }));
                    super.e = tgj.s(this.getApplicationContext(), false);
                    super.d = med.am();
                    final afgh b = this.b();
                    final afjx afjx = (afjx)b;
                    final String[] array = new String[afjx.c];
                    for (int j = 0; j < afjx.c; ++j) {
                        final Context applicationContext = this.getApplicationContext();
                        final eg e = super.e;
                        final Uri uri = b.get(j);
                        final qpv b2 = qpv.b();
                        b2.c();
                        String s = null;
                        Label_0389: {
                            try {
                                final File file = (File)e.ag(uri, (qor)b2);
                                final File filesDir = applicationContext.getFilesDir();
                                if (file.getPath().startsWith(filesDir.getPath())) {
                                    s = file.getPath().replace(filesDir.getPath(), "");
                                    break Label_0389;
                                }
                            }
                            catch (final IOException ex) {
                                tut.d("Failed to find the file from given uri", (Throwable)ex);
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
            afbh afbh = afag.a;
            continue;
        }
    }
    
    public final void onRestore(final BackupDataInput backupDataInput, final int n, final ParcelFileDescriptor parcelFileDescriptor) {
        if (!g(this.c)) {
            return;
        }
        final Context applicationContext = this.getApplicationContext();
        final int a = tvo.a(applicationContext);
        if (a == 0) {
            return;
        }
        if (n > a && Build$VERSION.SDK_INT <= 32) {
            applicationContext.getSharedPreferences("youtube", 0).edit().putBoolean("got_future_restore", true).putInt("future_restore_version", n).apply();
            tut.g("Restore from future version skipped - will trigger a manual restore at next update.");
            return;
        }
        super.onRestore(backupDataInput, n, parcelFileDescriptor);
        tut.g("Restore initiated.");
        final File l = this.l();
        m(l, this.k());
        n(l);
    }
}
