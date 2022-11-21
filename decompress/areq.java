import android.os.Bundle;
import java.util.Collections;
import java.util.LinkedHashMap;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import com.google.vr.sdk.proto.Display$DisplayParams;
import android.os.Build;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import java.util.ArrayList;
import android.content.ComponentName;
import android.app.Activity;
import java.lang.reflect.Field;
import android.util.Log;
import android.view.Display;
import android.os.Build$VERSION;
import java.util.concurrent.atomic.AtomicReference;
import android.content.ContentProviderClient;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import android.content.ContextWrapper;
import android.app.Application;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class areq
{
    public static Thread a;
    
    public static avs A(final br br, final avs avs) {
        return ((arni)aqvs.i((Object)br, (Class)arni.class)).as().b(br, avs);
    }
    
    public static Application B(final Context context) {
        if (!(context instanceof Application)) {
            Context baseContext = context;
            while (baseContext instanceof ContextWrapper) {
                final Context context2 = baseContext = ((ContextWrapper)baseContext).getBaseContext();
                if (context2 instanceof Application) {
                    return (Application)context2;
                }
            }
            throw new IllegalStateException("Could not find an Application in the given context: ".concat(String.valueOf(String.valueOf(context))));
        }
        return (Application)context;
    }
    
    public static boolean C(final Context context) {
        final Set du = ((arng)D(context, arng.class)).dU();
        final afkg afkg = (afkg)du;
        v(afkg.e <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        return du.isEmpty() || (boolean)((Iterator<Object>)afkg.k()).next();
    }
    
    public static final Object D(final Context context, final Class clazz) {
        context.getClass();
        return aqvs.i((Object)B(context.getApplicationContext()), clazz);
    }
    
    public static asck E(final Context context) {
        final List j = j(context);
        if (j != null) {
            for (final String s : j) {
                final ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(s);
                if (acquireContentProviderClient != null) {
                    return new asck(acquireContentProviderClient, s);
                }
            }
        }
        return null;
    }
    
    public static atwf F(int a, final int n) {
        final int n2 = 1;
        Object o;
        if (a != -2) {
            if (a != -1) {
                if (a != 0) {
                    int n3;
                    if ((n3 = a) == 1) {
                        if (n == 2) {
                            o = new atwm();
                            return (atwf)o;
                        }
                        n3 = 1;
                    }
                    o = new atwd(n3, n);
                }
                else if (n == 1) {
                    o = new atwt();
                }
                else {
                    o = new atwd(1, 2);
                }
            }
            else {
                if (n != 1) {
                    throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                }
                o = new atwm();
            }
        }
        else {
            a = n2;
            if (n == 1) {
                a = atwe.a;
            }
            o = new atwd(a, n);
        }
        return (atwf)o;
    }
    
    public static atuw G() {
        return (atuw)new atvl();
    }
    
    public static final Object H(final Throwable t) {
        return new atni(t);
    }
    
    public static final void I(final Object o) {
        if (!(o instanceof atni)) {
            return;
        }
        throw ((atni)o).a;
    }
    
    public static boolean J(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 28;
    }
    
    public static final arep b(final Display display) {
        if (Build$VERSION.SDK_INT < 29) {
            if (!a()) {
                return null;
            }
            try {
                final Class<?> forName = Class.forName("android.view.DisplayInfo");
                final Object instance = forName.getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                Display.class.getDeclaredMethod("getDisplayInfo", forName).invoke(display, instance);
                final Field declaredField = forName.getDeclaredField("displayCutout");
                declaredField.setAccessible(true);
                return arep.e(declaredField.get(instance));
            }
            catch (final Exception ex) {
                Log.e("AndroidPCompat", "Failed to fetch DisplayCutout from Display: ".concat(ex.toString()));
                return null;
            }
        }
        return new arep(display.getCutout());
    }
    
    public static Activity c(final Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper) {
            final Context baseContext = ((ContextWrapper)context).getBaseContext();
            if (baseContext != context) {
                return c(baseContext);
            }
        }
        return null;
    }
    
    public static ComponentName d(final Context context) {
        if (context instanceof arfv) {
            return ((arfv)context).a();
        }
        final Activity c = c(context);
        if (c != null) {
            return c.getComponentName();
        }
        return null;
    }
    
    public static int e(final agql agql) {
        final agqm a = agqk.a(agql);
        return (int)(Math.round(a.c() * 255.0) << 16 | Math.round(a.b() * 255.0) << 8 | Math.round(a.a() * 255.0)) | 0xFF000000;
    }
    
    public static boolean f(final double n) {
        return n > 30.0 && n <= 80.0;
    }
    
    public static boolean g(final agql agql) {
        final double b = agql.b;
        boolean b2 = true;
        if (b >= 0.1) {
            if (b < 0.15) {
                if (agql.c >= 0.5) {
                    return false;
                }
                b2 = b2;
            }
            else {
                b2 = false;
            }
        }
        return b2;
    }
    
    public static agql h(final agql agql, final double n) {
        return new agql(agql.a, agql.b, agql.c + n);
    }
    
    public static arfw i(final Context context) {
        final asck e = E(context);
        if (e != null) {
            return (arfw)new areu((ContentProviderClient)e.a, (String)e.b);
        }
        return (arfw)new arfg(context);
    }
    
    public static List j(final Context context) {
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            final ArrayList list = new ArrayList();
            list.add("com.google.vr.vrcore.settings");
            return list;
        }
        final List queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("android.content.action.VR_SETTINGS_PROVIDER"), 0);
        if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = queryIntentContentProviders.iterator();
            while (iterator.hasNext()) {
                final ProviderInfo providerInfo = ((ResolveInfo)iterator.next()).providerInfo;
                if (k(providerInfo.packageName)) {
                    list2.add(providerInfo.authority);
                }
            }
            return list2;
        }
        return null;
    }
    
    public static boolean k(final String s) {
        return s != null && s.startsWith("com.google.");
    }
    
    public static boolean l() {
        return "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
    }
    
    public static float m(final Display$DisplayParams display$DisplayParams) {
        if (display$DisplayParams != null && display$DisplayParams.hasBottomBezelHeight()) {
            return display$DisplayParams.getBottomBezelHeight();
        }
        return 0.003f;
    }
    
    public static float n(final float n) {
        return 0.0254f / n;
    }
    
    public static DisplayMetrics o(final Display display) {
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            final int widthPixels = displayMetrics.widthPixels;
            displayMetrics.widthPixels = displayMetrics.heightPixels;
            displayMetrics.heightPixels = widthPixels;
        }
        final float xdpi = displayMetrics.xdpi;
        displayMetrics.xdpi = displayMetrics.ydpi;
        displayMetrics.ydpi = xdpi;
        return displayMetrics;
    }
    
    public static DisplayMetrics p(final Display display, final Display$DisplayParams display$DisplayParams) {
        final DisplayMetrics o = o(display);
        if (display$DisplayParams != null) {
            if (display$DisplayParams.hasXPpi()) {
                o.xdpi = display$DisplayParams.getXPpi();
            }
            if (display$DisplayParams.hasYPpi()) {
                o.ydpi = display$DisplayParams.getYPpi();
            }
        }
        return o;
    }
    
    public static Display q(final Context context) {
        return ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
    }
    
    public static String r(final Context context) {
        final Resources resources = context.getResources();
        final int identifier = resources.getIdentifier("display_manager_hdmi_display_name", "string", "android");
        try {
            return resources.getString(identifier);
        }
        catch (final Resources$NotFoundException ex) {
            return null;
        }
    }
    
    public static int s(final int n) {
        if (n < 3) {
            return n + 1;
        }
        if (n < 1073741824) {
            return (int)(n / 0.75f + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
    
    public static LinkedHashMap t(final int n) {
        return new LinkedHashMap(s(n));
    }
    
    public static List u(final int n) {
        if (n == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(n);
    }
    
    public static void v(final boolean b, final String s, final Object... array) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.format(s, array));
    }
    
    public static void w(final Object o) {
        o.getClass();
    }
    
    public static void x(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    public static Object y(final Context context) {
        final Application b = B(context.getApplicationContext());
        final boolean b2 = b instanceof arog;
        final Class<? extends Application> class1 = b.getClass();
        if (b2) {
            return ((arog)b).aR();
        }
        throw new IllegalArgumentException(String.format("Sting BroadcastReceiver must be attached to an @Sting Application. Found: %s", class1));
    }
    
    public static avs z(final qu qu, final avs avs) {
        final asck yv = ((arnh)aqvs.i((Object)qu, (Class)arnh.class)).yv();
        Bundle extras;
        if (qu.getIntent() != null) {
            extras = qu.getIntent().getExtras();
        }
        else {
            extras = null;
        }
        return yv.c((cgn)qu, extras, avs);
    }
}
