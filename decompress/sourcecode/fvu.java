import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.content.Intent;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Spinner;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvu
{
    public static boolean a(final List list, final Class clazz) {
        if (list != null) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (clazz.isInstance(iterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean b(final acij acij) {
        return acht.a(acij).a > 1 || acij.j("always_display_as_grid", false);
    }
    
    public static final fuy c(final ViewGroup viewGroup, final Spinner spinner, final int n, final int n2, final int n3) {
        viewGroup.getClass();
        spinner.getClass();
        return new fuy(viewGroup, spinner, n, n2, n3);
    }
    
    public static void d(final achk achk, final achk achk2, final String s, final uyf uyf) {
        if (achk instanceof acjb) {
            final ains b = uyf.b();
            alvl alvl;
            if ((alvl = b.e) == null) {
                alvl = alvl.a;
            }
            if ((alvl.d & 0x400) != 0x0) {
                alvl alvl2;
                if ((alvl2 = b.e) == null) {
                    alvl2 = alvl.a;
                }
                final boolean ac = alvl2.ac;
            }
            else {
                final boolean ac = true;
            }
            if (((tdv)achk).isEmpty()) {
                if (!achk2.isEmpty()) {
                    final Object c = achk2.c(0);
                    final boolean ac;
                    if (!(c instanceof ahwm) && !(c instanceof aige) && !(c instanceof almg) && !(c instanceof aiiw) && !(c instanceof aoyq) && !(c instanceof aoyk) && !(c instanceof aiqw) && !(c instanceof aipu) && !(c instanceof ajzx) && !(c instanceof anol) && !(c instanceof kmd) && !(c instanceof ajoi) && !(c instanceof anuy) && !(c instanceof aohh) && !(c instanceof aoho) && !(c instanceof akac) && !(c instanceof amfe) && !(c instanceof aird) && (!(c instanceof abzh) || ac) && !(c instanceof aijg) && !gkt.Y(c) && !TextUtils.equals((CharSequence)s, (CharSequence)"FEhashtag")) {
                        ((acjb)achk).add((Object)ftm.b());
                    }
                }
            }
        }
    }
    
    public static Intent e(final Context context) {
        return new Intent().setClassName(context, i("settings.SettingsActivity")).putExtra(":android:show_fragment", i("settings.GeneralPrefsFragment")).setFlags(335544320);
    }
    
    public static Intent f(final Context context) {
        return new Intent().setClassName(context, i("settings.SettingsActivity")).putExtra(":android:show_fragment", i("settings.OfflinePrefsFragment")).setFlags(335544320);
    }
    
    public static Intent g(final Context context) {
        return new Intent().setClassName(context, i("settings.SettingsActivity")).putExtra(":android:show_fragment", i("settings.videoquality.VideoQualityPrefsFragment")).setFlags(335544320);
    }
    
    public static Intent h(final Context context) {
        return new Intent().setClassName(context, "com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity").setFlags(335544320).setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
    }
    
    public static String i(final String s) {
        return "com.google.android.apps.youtube.app.".concat(s);
    }
    
    public static String j(final String s) {
        return "UC".concat(s);
    }
    
    public static String k(final String s) {
        if (s != null && l(s)) {
            return s.substring(2);
        }
        return null;
    }
    
    public static boolean l(final String s) {
        boolean b = false;
        if (s != null) {
            if (!s.startsWith("VLPL") && !s.startsWith("VLLL")) {
                if ("VLWL".equals(s)) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public static boolean m(final String s) {
        return s != null && s.startsWith("FEsfv");
    }
    
    public static void n(final View view, final GradientDrawable gradientDrawable, final aigg aigg, final Context context) {
        final aigg a = aigg.a;
        final int ordinal = aigg.ordinal();
        if (ordinal == 1) {
            view.setVisibility(0);
            gradientDrawable.setColor(actf.a(context, aoqb.K, 0));
            return;
        }
        if (ordinal != 2) {
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        gradientDrawable.setColor(context.getResources().getColor(2131099793));
    }
}
