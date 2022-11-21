import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import android.os.Build$VERSION;
import android.util.Log;
import android.content.res.Configuration;
import java.util.List;
import android.os.IBinder;
import android.app.Activity;
import android.os.Looper;
import android.os.Handler;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aez
{
    protected static final Class a;
    protected static final Field b;
    protected static final Field c;
    public static final Method d;
    public static final Method e;
    protected static final Method f;
    private static final Handler g;
    
    static {
        g = new Handler(Looper.getMainLooper());
        final Method method = null;
        Class a2;
        try {
            Class.forName("android.app.ActivityThread");
        }
        finally {
            a2 = null;
        }
        a = a2;
        Field b2;
        try {
            Activity.class.getDeclaredField("mMainThread").setAccessible(true);
        }
        finally {
            b2 = null;
        }
        b = b2;
        Field c2;
        try {
            Activity.class.getDeclaredField("mToken").setAccessible(true);
        }
        finally {
            c2 = null;
        }
        c = c2;
        final Class a3 = aez.a;
        final Method d2;
        Label_0129: {
            Label_0085: {
                if (a3 != null) {
                    try {
                        a3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class).setAccessible(true);
                    }
                    finally {
                        break Label_0085;
                    }
                    break Label_0129;
                }
            }
            d2 = null;
        }
        d = d2;
        final Class a4 = aez.a;
        final Method e2;
        Label_0180: {
            Label_0141: {
                if (a4 != null) {
                    try {
                        a4.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE).setAccessible(true);
                    }
                    finally {
                        break Label_0141;
                    }
                    break Label_0180;
                }
            }
            e2 = null;
        }
        e = e2;
        final Class a5 = aez.a;
        Method declaredMethod = method;
        while (true) {
            if (!c()) {
                break Label_0274;
            }
            if (a5 == null) {
                declaredMethod = method;
                break Label_0274;
            }
            try {
                declaredMethod = a5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                f = declaredMethod;
            }
            finally {
                declaredMethod = method;
                continue;
            }
            break;
        }
    }
    
    protected static boolean a(Object value, final int n, final Activity activity) {
        try {
            final Object value2 = aez.c.get(activity);
            if (value2 == value && activity.hashCode() == n) {
                value = aez.b.get(activity);
                aez.g.postAtFrontOfQueue((Runnable)new vt(value, value2, 10));
                return true;
            }
            return false;
        }
        finally {
            final Throwable t;
            Log.e("ActivityRecreator", "Exception while fetching field values", t);
            return false;
        }
    }
    
    public static boolean b(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (c() && aez.f == null) {
            return false;
        }
        if (aez.e == null) {
            if (aez.d == null) {
                return false;
            }
        }
        try {
            final Object value = aez.c.get(activity);
            if (value == null) {}
            final Object value2 = aez.b.get(activity);
            if (value2 == null) {}
            final Application application = activity.getApplication();
            final aey aey = new aey(activity);
            application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)aey);
            final Handler g = aez.g;
            g.post((Runnable)new vt(aey, value, 8));
            try {
                if (c()) {
                    final Method f = aez.f;
                    final Boolean value3 = false;
                    f.invoke(value2, value, null, null, 0, value3, null, null, value3, value3);
                }
                else {
                    activity.recreate();
                }
                g.post((Runnable)new vt(application, aey, 9));
                return true;
            }
            finally {
                aez.g.post((Runnable)new vt(application, aey, 9));
            }
        }
        finally {
            return false;
        }
    }
    
    private static boolean c() {
        return Build$VERSION.SDK_INT == 26 || Build$VERSION.SDK_INT == 27;
    }
}
