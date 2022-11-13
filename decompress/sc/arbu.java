import io.grpc.Status;
import java.util.List;
import android.content.ComponentName;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import android.view.WindowManager;
import android.content.Context;
import android.util.DisplayMetrics;
import com.google.vr.sdk.proto.Display$DisplayParams;
import android.os.Build;
import java.lang.reflect.Field;
import android.util.Log;
import android.view.Display;
import android.os.Build$VERSION;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.CancellationException;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class arbu
{
    public static arlv A(final auch auch) {
        return new arlv((Map)auch.a);
    }
    
    public static atrz B() {
        return new atso();
    }
    
    public static void C(final atmd atmd, final CancellationException ex) {
        final atrw atrw = (atrw)atmd.get((atmb)atrw.c);
        if (atrw != null) {
            atrw.r(ex);
        }
    }
    
    public static void D(final atmd atmd) {
        atmd.getClass();
        final atrw atrw = (atrw)atmd.get((atmb)atrw.c);
        if (atrw != null && !atrw.tQ()) {
            throw atrw.n();
        }
    }
    
    public static Object E(final Throwable t) {
        return new atkl(t);
    }
    
    public static void F(final Object o) {
        if (!(o instanceof atkl)) {
            return;
        }
        throw ((atkl)o).a;
    }
    
    public static boolean G(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
    
    private static double H(final double n) {
        if (n <= 0.03928) {
            return n / 12.92;
        }
        return Math.pow((n + 0.055) / 1.055, 2.4);
    }
    
    public static boolean e() {
        return Build$VERSION.SDK_INT >= 28;
    }
    
    public static arbt f(final Display display) {
        if (Build$VERSION.SDK_INT < 29) {
            if (!e()) {
                return null;
            }
            try {
                final Class<?> forName = Class.forName("android.view.DisplayInfo");
                final Object instance = forName.getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                Display.class.getDeclaredMethod("getDisplayInfo", forName).invoke(display, instance);
                final Field declaredField = forName.getDeclaredField("displayCutout");
                declaredField.setAccessible(true);
                return arbt.e(declaredField.get(instance));
            }
            catch (final Exception ex) {
                Log.e("AndroidPCompat", "Failed to fetch DisplayCutout from Display: ".concat(ex.toString()));
                return null;
            }
        }
        return new arbt(display.getCutout());
    }
    
    public static int g(final agos agos) {
        final agot a = agor.a(agos);
        return (int)(Math.round(a.c() * 255.0) << 16 | Math.round(a.b() * 255.0) << 8 | Math.round(a.a() * 255.0)) | 0xFF000000;
    }
    
    public static boolean h(final double n) {
        return n > 30.0 && n <= 80.0;
    }
    
    public static boolean i(final agos agos) {
        final double b = agos.b;
        boolean b2 = true;
        if (b >= 0.1) {
            if (b < 0.15) {
                if (agos.c >= 0.5) {
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
    
    public static agos j(final agos agos, final double n) {
        return new agos(agos.a, agos.b, agos.c + n);
    }
    
    public static double k(final agot agot, final agot agot2) {
        final double h = H(agot.c());
        final double h2 = H(agot.b());
        final double h3 = H(agot.a());
        final double h4 = H(agot2.c());
        final double h5 = H(agot2.b());
        final double h6 = H(agot2.a());
        final double n = h * 0.2126 + h2 * 0.7152 + h3 * 0.0722;
        final double n2 = h4 * 0.2126 + h5 * 0.7152 + h6 * 0.0722;
        return (Math.max(n, n2) + 0.05) / (Math.min(n, n2) + 0.05);
    }
    
    public static boolean l(final String s) {
        return s != null && s.startsWith("com.google.");
    }
    
    public static boolean m() {
        return "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
    }
    
    public static float n(final Display$DisplayParams display$DisplayParams) {
        if (display$DisplayParams != null && display$DisplayParams.hasBottomBezelHeight()) {
            return display$DisplayParams.getBottomBezelHeight();
        }
        return 0.003f;
    }
    
    public static float o(final float n) {
        return 0.0254f / n;
    }
    
    public static DisplayMetrics p(final Display display) {
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
    
    public static DisplayMetrics q(final Display display, final Display$DisplayParams display$DisplayParams) {
        final DisplayMetrics p2 = p(display);
        if (display$DisplayParams != null) {
            if (display$DisplayParams.hasXPpi()) {
                p2.xdpi = display$DisplayParams.getXPpi();
            }
            if (display$DisplayParams.hasYPpi()) {
                p2.ydpi = display$DisplayParams.getYPpi();
            }
        }
        return p2;
    }
    
    public static Display r(final Context context) {
        return ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
    }
    
    public static String s(final Context context) {
        final Resources resources = context.getResources();
        final int identifier = resources.getIdentifier("display_manager_hdmi_display_name", "string", "android");
        try {
            return resources.getString(identifier);
        }
        catch (final Resources$NotFoundException ex) {
            return null;
        }
    }
    
    public static Activity t(final Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper) {
            final Context baseContext = ((ContextWrapper)context).getBaseContext();
            if (baseContext != context) {
                return t(baseContext);
            }
        }
        return null;
    }
    
    public static ComponentName u(final Context context) {
        if (context instanceof arcz) {
            return ((arcz)context).a();
        }
        final Activity t = t(context);
        if (t != null) {
            return t.getComponentName();
        }
        return null;
    }
    
    public static arlx v(final List list, final List list2) {
        return new arlx(list, list2);
    }
    
    public static void w(final atke atke, final List list) {
        list.add(atke);
    }
    
    public static void x(final atke atke, final List list) {
        list.add(atke);
    }
    
    public static void y(final Object o, final Class clazz) {
        if (o != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(clazz.getCanonicalName()).concat(" must be set"));
    }
    
    public void a(final Status status, final arwk arwk) {
        throw null;
    }
    
    public void b(final arwk arwk) {
        throw null;
    }
    
    public void c(final Object o) {
        throw null;
    }
    
    public void d() {
    }
    
    public arva z() {
        throw null;
    }
}
