import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.Map;
import java.util.Iterator;
import android.content.pm.PackageManager;
import android.os.Parcelable;
import android.content.pm.ResolveInfo;
import java.util.HashSet;
import java.util.ArrayList;
import android.content.Intent;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpo implements vau
{
    public final vax a;
    private final Activity b;
    private final Executor c;
    private final atjj d;
    private final atjj e;
    private final uyf f;
    private final hyq g;
    
    public gpo(final Activity b, final vax a, final Executor c, final atjj d, final atjj e, final hyq g, final uyf f, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = f;
    }
    
    public final void b(final String s) {
        Uri parse;
        if (s == null) {
            parse = null;
        }
        else {
            parse = Uri.parse(s);
        }
        if (parse == null) {
            tmy.x((Context)this.b, 2132017997, 0);
            return;
        }
        final Intent intent = new Intent("android.intent.action.VIEW", parse);
        if (((Context)this.b).getPackageManager().queryIntentActivities(intent, 128).isEmpty()) {
            tmy.x((Context)this.b, 2132017997, 0);
            return;
        }
        tab.c((Context)this.b, intent, parse);
        final Activity b = this.b;
        final Intent setFlags = intent.setFlags(268435456);
        final PackageManager packageManager = ((Context)b).getPackageManager();
        final ArrayList list = new ArrayList();
        final HashSet set = new HashSet();
        final Iterator iterator = packageManager.queryIntentActivities(setFlags, 0).iterator();
        while (iterator.hasNext()) {
            final String packageName = ((ResolveInfo)iterator.next()).activityInfo.packageName;
            if (!packageName.equals(((Context)b).getPackageName())) {
                set.add(packageName);
                list.add(new Intent(setFlags).setPackage(packageName));
            }
        }
        if (set.isEmpty()) {
            final ResolveInfo resolveActivity = ((Context)b).getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://")), 65536);
            if (resolveActivity != null) {
                final String packageName2 = resolveActivity.activityInfo.packageName;
                set.add(packageName2);
                list.add(new Intent(setFlags).setPackage(packageName2));
            }
        }
        if (set.isEmpty()) {
            tmy.x((Context)b, 2132017997, 0);
            return;
        }
        final ResolveInfo resolveActivity2 = packageManager.resolveActivity(setFlags, 0);
        if (resolveActivity2 != null && set.contains(resolveActivity2.activityInfo.packageName)) {
            ((Context)b).startActivity(setFlags);
            return;
        }
        final Intent chooser = Intent.createChooser((Intent)list.remove(0), (CharSequence)null);
        chooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])list.toArray(new Parcelable[0]));
        chooser.setFlags(268435456);
        ((Context)b).startActivity(chooser);
    }
    
    public final void mE(aioe ex, Map a) {
        if (!((agzd)ex).rs((agyr)amvq.b)) {
            return;
        }
        final amvq amvq = (amvq)((agzd)ex).rr((agyr)amvq.b);
        anqa anqa;
        if ((anqa = this.f.b().A) == null) {
            anqa = anqa.a;
        }
        if (anqa.g) {
            ex = (ExecutionException)this.g.m().p();
        }
        else {
            ex = (ExecutionException)((abno)this.e.a()).p();
        }
        final gid gid = (gid)this.d.a();
        alvs alvs;
        if ((alvs = gid.c.f().e) == null) {
            alvs = alvs.a;
        }
        final boolean ao = alvs.aO;
        boolean b = false;
        Label_0453: {
            if (!ao) {
                final ghy a2 = ghy.a;
                try {
                    if (gid.a().get() != ghy.c) {
                        ex = (ExecutionException)afva.m((Object)false);
                        break Label_0453;
                    }
                    if (!gid.g((abtt)ex) || !gid.f((abtt)ex)) {
                        ex = (ExecutionException)afva.m((Object)false);
                        break Label_0453;
                    }
                    if (gid.a.isInPictureInPictureMode() || gid.a.isChangingConfigurations()) {
                        ex = (ExecutionException)afva.m((Object)false);
                        break Label_0453;
                    }
                    if (!gid.b.b) {
                        ex = (ExecutionException)afva.m((Object)false);
                        break Label_0453;
                    }
                    ex = (ExecutionException)afva.m((Object)gid.d.m().f());
                    break Label_0453;
                }
                catch (final ExecutionException ex) {}
                catch (final InterruptedException ex2) {}
                trn.d("Exception when trying to fetch pip setting", (Throwable)ex);
                ex = (ExecutionException)afva.m((Object)false);
            }
            else if (!gid.a.isInPictureInPictureMode() && !gid.a.isChangingConfigurations()) {
                if (gid.g((abtt)ex) && gid.f((abtt)ex) && gid.d.m().f()) {
                    if (!gid.b.b) {
                        ex = (ExecutionException)afva.m((Object)false);
                    }
                    else {
                        a = ghy.a;
                        Label_0412: {
                            try {
                                ex = (ExecutionException)gid.a().get();
                                break Label_0412;
                            }
                            catch (final ExecutionException ex) {}
                            catch (final InterruptedException ex3) {}
                            trn.d("Exception when trying to fetch pip setting", (Throwable)ex);
                            ex = (ExecutionException)a;
                        }
                        if (ex == ghy.c) {
                            b = true;
                        }
                        ex = (ExecutionException)afva.m((Object)b);
                    }
                }
                else {
                    ex = (ExecutionException)afva.m((Object)false);
                }
            }
            else {
                ex = (ExecutionException)afva.m((Object)false);
            }
        }
        tcp.k((ListenableFuture)ex, this.c, (tcn)new etc(this, amvq, 4), (tco)new exa(this, amvq, 11));
    }
}
