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

public final class fwc
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
    
    public static boolean b(final ackm ackm) {
        return acjw.a(ackm).a > 1 || ackm.j("always_display_as_grid", false);
    }
    
    public static final fvh c(final ViewGroup viewGroup, final Spinner spinner, final int n, final int n2, final int n3) {
        viewGroup.getClass();
        spinner.getClass();
        return new fvh(viewGroup, spinner, n, n2, n3);
    }
    
    public static void d(final acjn acjn, final acjn acjn2, final String s, final vaf vaf) {
        if (acjn instanceof acle) {
            final aipx b = vaf.b();
            alxp alxp;
            if ((alxp = b.e) == null) {
                alxp = alxp.a;
            }
            if ((alxp.d & 0x400) != 0x0) {
                alxp alxp2;
                if ((alxp2 = b.e) == null) {
                    alxp2 = alxp.a;
                }
                final boolean ac = alxp2.ac;
            }
            else {
                final boolean ac = true;
            }
            if (((tfz)acjn).isEmpty()) {
                if (!acjn2.isEmpty()) {
                    final Object c = acjn2.c(0);
                    final boolean ac;
                    if (!(c instanceof ahyk) && !(c instanceof aiic) && !(c instanceof aloj) && !(c instanceof aiku) && !(c instanceof apau) && !(c instanceof apao) && !(c instanceof aitb) && !(c instanceof airz) && !(c instanceof akca) && !(c instanceof anqp) && !(c instanceof kne) && !(c instanceof ajqn) && !(c instanceof anxb) && !(c instanceof aojk) && !(c instanceof aojr) && !(c instanceof akcf) && !(c instanceof amhi) && !(c instanceof aiti) && (!(c instanceof acbj) || ac) && !(c instanceof aile) && !glb.h(c) && !TextUtils.equals((CharSequence)s, (CharSequence)"FEhashtag")) {
                        ((acle)acjn).add((Object)ftu.b());
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
    
    public static void n(final View view, final GradientDrawable gradientDrawable, final aiie aiie, final Context context) {
        final aiie a = aiie.a;
        final int ordinal = aiie.ordinal();
        if (ordinal == 1) {
            view.setVisibility(0);
            gradientDrawable.setColor(acvj.a(context, aose.K, 0));
            return;
        }
        if (ordinal != 2) {
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        gradientDrawable.setColor(context.getResources().getColor(2131099793));
    }
    
    public static void o(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
}
