import android.util.Log;
import android.graphics.Color;
import android.view.View;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import android.view.ContextThemeWrapper;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.content.pm.ActivityInfo;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.Context;
import android.media.AudioDeviceInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bid
{
    public static void a(final bhj bhj, final Object o) {
        bhj.q((AudioDeviceInfo)o);
    }
    
    public static int b(final Exception ex, final int n) {
        final int a = baw.a;
        if (bku.b((Throwable)ex)) {
            return bku.a((Throwable)ex);
        }
        if (bkv.a((Throwable)ex)) {
            return 6006;
        }
        if (bkt.b((Throwable)ex)) {
            return 6002;
        }
        if (bkt.a((Throwable)ex)) {
            return 6007;
        }
        if (ex instanceof blk) {
            return 6001;
        }
        if (ex instanceof bkf) {
            return 6003;
        }
        if (ex instanceof blh) {
            return 6008;
        }
        if (n == 1) {
            return 6006;
        }
        if (n == 2) {
            return 6004;
        }
        return 6002;
    }
    
    public static boolean c(final Context context) {
        final Intent putExtra = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        final Iterator iterator = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
        while (iterator.hasNext()) {
            final ActivityInfo activityInfo = ((ResolveInfo)iterator.next()).activityInfo;
            if (activityInfo != null && activityInfo.applicationInfo != null && (activityInfo.applicationInfo.flags & 0x81) != 0x0) {
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }
    
    public static float d(final Context context) {
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }
    
    public static int e(final Context context) {
        final int i = i(context, 2130969899);
        if (i == 0) {
            return g(context);
        }
        return i;
    }
    
    public static int f(final Context context, final int n) {
        if (ahy.a(-1, h(context, n, 2130969086)) >= 3.0) {
            return -1;
        }
        return -570425344;
    }
    
    public static int g(final Context context) {
        final TypedValue typedValue = new TypedValue();
        int n;
        if (context.getTheme().resolveAttribute(2130969593, typedValue, true) && typedValue.data != 0) {
            if (f(context, 0) != -570425344) {
                return 2132084255;
            }
            n = 2132084254;
        }
        else {
            if (f(context, 0) != -570425344) {
                return 2132084253;
            }
            n = 2132084256;
        }
        return n;
    }
    
    public static int h(final Context context, int color, final int n) {
        if (color != 0) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(color, new int[] { n });
            color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }
    
    public static int i(final Context context, final int n) {
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }
    
    public static Context j(final Context context, int n, final boolean b) {
        int i = n;
        if (n == 0) {
            if (!b) {
                n = 2130969245;
            }
            else {
                n = 2130968646;
            }
            i = i(context, n);
        }
        final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i((Context)contextThemeWrapper, 2130969899) != 0) {
            return (Context)new ContextThemeWrapper((Context)contextThemeWrapper, g((Context)contextThemeWrapper));
        }
        return (Context)contextThemeWrapper;
    }
    
    public static void k(final Context context, final MediaRouteVolumeSlider mediaRouteVolumeSlider, final View view) {
        int n2;
        final int n = n2 = f(context, 0);
        if (Color.alpha(n) != 255) {
            n2 = ahy.e(n, (int)view.getTag());
        }
        if (mediaRouteVolumeSlider.a != n2) {
            if (Color.alpha(n2) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #".concat(String.valueOf(Integer.toHexString(n2))));
            }
            mediaRouteVolumeSlider.a = n2;
        }
        if (mediaRouteVolumeSlider.b != n2) {
            if (Color.alpha(n2) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #".concat(String.valueOf(Integer.toHexString(n2))));
            }
            mediaRouteVolumeSlider.b = n2;
        }
    }
}
