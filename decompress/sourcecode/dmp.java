import android.app.FragmentTransaction;
import android.util.Log;
import android.os.Message;
import android.app.Fragment;
import com.bumptech.glide.manager.LifecycleLifecycle;
import android.app.FragmentManager;
import android.app.Application;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Bundle;
import java.util.HashMap;
import android.os.Handler;
import java.util.Map;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmp implements Handler$Callback
{
    private static final dmo c;
    final Map a;
    final Map b;
    private volatile dcl d;
    private final Handler e;
    private final dmo f;
    private final dmf g;
    private final dmk h;
    private final cxz i;
    
    static {
        c = (dmo)new dmn(0);
    }
    
    public dmp(final dmo dmo, final cxz i, final byte[] array) {
        this.a = new HashMap();
        this.b = new HashMap();
        new abg();
        new abg();
        new Bundle();
        dmo c = dmo;
        if (dmo == null) {
            c = dmp.c;
        }
        this.f = c;
        this.i = i;
        this.e = new Handler(Looper.getMainLooper(), (Handler$Callback)this);
        this.h = new dmk(c);
        final boolean a = dkg.a;
        Object g;
        if (!dkg.a) {
            g = new dma();
        }
        else if (i.f((Class)dbv.class)) {
            g = new dmc();
        }
        else {
            g = new dme();
        }
        this.g = (dmf)g;
    }
    
    private static Activity e(final Context context) {
        if (context instanceof Activity) {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper)context).getBaseContext());
        }
        return null;
    }
    
    private static void f(final Activity activity) {
        if (!activity.isDestroyed()) {
            return;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }
    
    private static boolean g(final Context context) {
        final Activity e = e(context);
        return e == null || !e.isFinishing();
    }
    
    public final dcl a(final Context context) {
        if (context != null) {
            if (dpg.p() && !(context instanceof Application)) {
                if (context instanceof bu) {
                    return this.b((bu)context);
                }
                if (context instanceof Activity) {
                    final Activity activity = (Activity)context;
                    dcl c;
                    if (dpg.o()) {
                        c = this.a(activity.getApplicationContext());
                    }
                    else if (activity instanceof bu) {
                        c = this.b((bu)activity);
                    }
                    else {
                        f(activity);
                        this.g.a(activity);
                        final FragmentManager fragmentManager = activity.getFragmentManager();
                        final boolean g = g((Context)activity);
                        final dmm c2 = this.c(fragmentManager);
                        c = c2.c;
                        if (c == null) {
                            c = this.f.a(dbo.b((Context)activity), (dmg)c2.a, c2.b, (Context)activity);
                            if (g) {
                                c.l();
                            }
                            c2.c = c;
                        }
                    }
                    return c;
                }
                if (context instanceof ContextWrapper) {
                    final ContextWrapper contextWrapper = (ContextWrapper)context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return this.a(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.d == null) {
                synchronized (this) {
                    if (this.d == null) {
                        this.d = this.f.a(dbo.b(context.getApplicationContext()), (dmg)new dlw(), (dmq)new dmj(), context.getApplicationContext());
                    }
                }
            }
            return this.d;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }
    
    public final dcl b(final bu bu) {
        if (dpg.o()) {
            return this.a(bu.getApplicationContext());
        }
        f((Activity)bu);
        this.g.a((Activity)bu);
        final cl supportFragmentManager = bu.getSupportFragmentManager();
        final boolean g = g((Context)bu);
        if (this.i.f((Class)dbu.class)) {
            final Context applicationContext = bu.getApplicationContext();
            final dbo b = dbo.b(applicationContext);
            final dmk h = this.h;
            final auh lifecycle = ((dh)bu).getLifecycle();
            bu.getSupportFragmentManager();
            dpg.k();
            dpg.k();
            dcl a;
            if ((a = ((Map<K, dcl>)h.a).get(lifecycle)) == null) {
                final LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
                a = ((dmo)h.b).a(b, lifecycleLifecycle, (dmq)new dmj(), applicationContext);
                ((Map<auh, dcl>)h.a).put(lifecycle, a);
                lifecycleLifecycle.a((dmh)new dmi(h, lifecycle));
                if (g) {
                    a.l();
                }
            }
            return a;
        }
        final dmy d = this.d(supportFragmentManager);
        dcl c;
        if ((c = d.c) == null) {
            c = this.f.a(dbo.b((Context)bu), (dmg)d.a, d.b, (Context)bu);
            if (g) {
                c.l();
            }
            d.c = c;
        }
        return c;
    }
    
    public final dmm c(final FragmentManager fragmentManager) {
        dmm dmm;
        if ((dmm = this.a.get(fragmentManager)) == null) {
            dmm = (dmm)fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (dmm == null) {
                final dmm dmm2 = new dmm();
                this.a.put(fragmentManager, dmm2);
                fragmentManager.beginTransaction().add((Fragment)dmm2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.e.obtainMessage(1, (Object)fragmentManager).sendToTarget();
                return dmm2;
            }
        }
        return dmm;
    }
    
    public final dmy d(final cl cl) {
        dmy dmy;
        if ((dmy = this.b.get(cl)) == null) {
            dmy = (dmy)cl.f("com.bumptech.glide.manager");
            if (dmy == null) {
                final dmy dmy2 = new dmy();
                this.b.put(cl, dmy2);
                final ct i = cl.i();
                i.s((br)dmy2, "com.bumptech.glide.manager");
                i.k();
                this.e.obtainMessage(2, (Object)cl).sendToTarget();
                return dmy2;
            }
        }
        return dmy;
    }
    
    public final boolean handleMessage(final Message message) {
        final int arg1 = message.arg1;
        final int what = message.what;
        final Object o = null;
        boolean b = false;
        boolean b2 = true;
        Object o2 = null;
        Object remove2 = null;
        Label_0573: {
            Label_0570: {
                Label_0491: {
                    if (what == 1) {
                        final FragmentManager fragmentManager = (FragmentManager)message.obj;
                        final dmm dmm = this.a.get(fragmentManager);
                        final dmm dmm2 = (dmm)fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
                        if (dmm2 != dmm) {
                            if (dmm2 != null && dmm2.c != null) {
                                final String string = dmm2.toString();
                                final String value = String.valueOf(dmm);
                                final StringBuilder sb = new StringBuilder("We've added two fragments with requests! Old: ");
                                sb.append(string);
                                sb.append(" New: ");
                                sb.append(value);
                                throw new IllegalStateException(sb.toString());
                            }
                            if (arg1 != 1 && !fragmentManager.isDestroyed()) {
                                final FragmentTransaction add = fragmentManager.beginTransaction().add((Fragment)dmm, "com.bumptech.glide.manager");
                                if (dmm2 != null) {
                                    add.remove((Fragment)dmm2);
                                }
                                add.commitAllowingStateLoss();
                                this.e.obtainMessage(1, 1, 0, (Object)fragmentManager).sendToTarget();
                                break Label_0491;
                            }
                            if (Log.isLoggable("RMRetriever", 5)) {
                                if (fragmentManager.isDestroyed()) {
                                    Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added");
                                }
                                else {
                                    Log.w("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                                }
                            }
                            dmm.a.b();
                        }
                        final Object remove = this.a.remove(fragmentManager);
                        o2 = fragmentManager;
                        remove2 = remove;
                        break Label_0570;
                    }
                    if (what != 2) {
                        final Object o3 = null;
                        b2 = false;
                        remove2 = o;
                        o2 = o3;
                        break Label_0573;
                    }
                    final cl cl = (cl)message.obj;
                    final dmy dmy = this.b.get(cl);
                    final dmy dmy2 = (dmy)cl.f("com.bumptech.glide.manager");
                    if (dmy2 != dmy) {
                        if (dmy2 != null && dmy2.c != null) {
                            final String string2 = dmy2.toString();
                            final String value2 = String.valueOf(dmy);
                            final StringBuilder sb2 = new StringBuilder("We've added two fragments with requests! Old: ");
                            sb2.append(string2);
                            sb2.append(" New: ");
                            sb2.append(value2);
                            throw new IllegalStateException(sb2.toString());
                        }
                        if (arg1 != 1 && !cl.w) {
                            final ct i = cl.i();
                            i.s((br)dmy, "com.bumptech.glide.manager");
                            if (dmy2 != null) {
                                i.n((br)dmy2);
                            }
                            i.e();
                            this.e.obtainMessage(2, 1, 0, (Object)cl).sendToTarget();
                            break Label_0491;
                        }
                        if (cl.w) {
                            if (Log.isLoggable("RMRetriever", 5)) {
                                Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                            }
                        }
                        else if (Log.isLoggable("RMRetriever", 6)) {
                            Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
                        }
                        dmy.a.b();
                    }
                    remove2 = this.b.remove(cl);
                    o2 = cl;
                    break Label_0570;
                }
                final Object o4 = null;
                remove2 = o;
                o2 = o4;
                break Label_0573;
            }
            b = true;
        }
        if (Log.isLoggable("RMRetriever", 5) && b && remove2 == null) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: ".concat(String.valueOf(String.valueOf(o2))));
        }
        return b2;
    }
}
