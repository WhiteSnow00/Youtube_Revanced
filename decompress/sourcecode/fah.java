import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ArgbEvaluator;
import android.animation.Animator;
import android.view.View;
import android.view.ContextThemeWrapper;
import app.revanced.integrations.utils.ThemeHelper;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fah
{
    @Deprecated
    public static void b(final fjo fjo, final fkk fkk) {
        fjo.oK(fkk);
    }
    
    public static void c(final fjp fjp, final atjj atjj) {
        fjp.l((fjo)atjj.a());
    }
    
    public static String d(final String s, final zki zki) {
        return e(s, zki.c().d());
    }
    
    public static String e(final String s, final String s2) {
        return String.format(Locale.US, "%s:".concat(s), s2);
    }
    
    public static boolean f(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && s.endsWith("bollard_enabled");
    }
    
    public static fqb g(final absb absb) {
        return (fqb)new fpy(absb);
    }
    
    public static fqb h(final absb absb) {
        return (fqb)new fpw(absb);
    }
    
    public static fqb i(final absb absb) {
        return (fqb)new fpx(absb);
    }
    
    public static int j(final long n, final long n2, final int n3, final int n4) {
        return n3 + (int)(n4 * (tmy.aO(n, 0L, n2) / (float)n2));
    }
    
    public static void k(final Canvas canvas, final Rect rect, final Paint paint, final Paint paint2, final List list, final afgd afgd, final int n, final boolean b) {
        final afid d = afid.d();
        ((afgf)d).a(afgd.d((Comparable)rect.left, (Comparable)rect.right));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((afgf)d).b((afgd)iterator.next());
        }
        for (final afgd afgd2 : ((afgf)d).c()) {
            if (afgd != null && afgd.j(afgd2)) {
                final float n2 = (float)(int)afgd2.g();
                final int top = rect.top;
                final float n3 = (float)(int)afgd2.h();
                final int bottom = rect.bottom;
                final float n4 = (float)top;
                float n5;
                if (b) {
                    n5 = (float)n;
                }
                else {
                    n5 = n / 2.0f;
                }
                float n6;
                if (b) {
                    n6 = (float)bottom;
                }
                else {
                    n6 = bottom + n / 2.0f;
                }
                canvas.drawRect(n2, n4 - n5, n3, n6, paint2);
            }
            else {
                canvas.drawRect((float)(int)afgd2.g(), (float)rect.top, (float)(int)afgd2.h(), (float)rect.bottom, paint);
            }
        }
    }
    
    public static void l(final Canvas canvas, final Rect rect, final Paint paint, final List list, final afgd afgd, final int n, final boolean b) {
        final afid d = afid.d();
        ((afgf)d).a(afgd.d((Comparable)rect.left, (Comparable)rect.right));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((afgf)d).b((afgd)iterator.next());
        }
        for (final afgd afgd2 : ((afgf)d).c()) {
            int n2 = 0;
            if (afgd != null) {
                n2 = n2;
                if (afgd.j(afgd2)) {
                    n2 = 1;
                }
            }
            final float n3 = rect.top + 0.25f;
            float n4 = rect.bottom - 0.25f;
            float n5 = n3;
            float n6 = n4;
            if (n2 != 0) {
                float n7;
                if (b) {
                    n7 = (float)n;
                }
                else {
                    n7 = n / 2.0f;
                }
                n5 = n3 - n7;
                if (!b) {
                    n4 += n / 2.0f;
                }
                n6 = n4 - 0.5f;
            }
            canvas.drawLine((float)(int)afgd2.g(), n5, (float)(int)afgd2.h(), n5, paint);
            canvas.drawLine((float)(int)afgd2.g(), n6, (float)(int)afgd2.h(), n6, paint);
        }
    }
    
    public static void m(final Context context) {
        n(false, context);
    }
    
    public static void n(final boolean b, final Context context) {
        final Configuration configuration = context.getResources().getConfiguration();
        int n;
        if (!b) {
            n = 16;
        }
        else {
            n = 32;
        }
        configuration.uiMode = (n | (configuration.uiMode & 0xFFFFFFCF));
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
    }
    
    public static Context o(final Activity activity, final gko gko, final uyi uyi) {
        if (uyi.aT() && uyi.aU()) {
            int n;
            if (gko.a() == gkm.b) {
                n = 2132084270;
                ThemeHelper.setTheme(1);
            }
            else {
                n = 2132084299;
                ThemeHelper.setTheme(0);
            }
            return (Context)new ContextThemeWrapper((Context)activity, n);
        }
        int n2;
        if (gko.a() == gkm.b) {
            n2 = 2132084265;
            ThemeHelper.setTheme(1);
        }
        else {
            n2 = 2132084294;
            ThemeHelper.setTheme(0);
        }
        return (Context)new ContextThemeWrapper((Context)activity, n2);
    }
    
    public static boolean p(final int n, final int n2) {
        return (n & n2) != 0x0;
    }
    
    public static boolean q(final int n) {
        return n == 0;
    }
    
    public static boolean r(final int n) {
        return p(n, 1);
    }
    
    public static boolean s(final int n) {
        return p(n, 2);
    }
    
    public static final Animator t(final View view, final int n, final int n2, final long duration) {
        final ValueAnimator ofObject = ValueAnimator.ofObject((TypeEvaluator)new ArgbEvaluator(), new Object[] { n, n2 });
        ofObject.setDuration(duration);
        ofObject.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new qh(view, 9));
        return (Animator)ofObject;
    }
    
    public static void u(final acij acij, final int n) {
        acij.f("lineSeparatorOverride", (Object)n);
    }
    
    public static void v(final acij acij, final int n) {
        acij.f("setBackgroundColor", (Object)n);
    }
    
    public static void w(final Context context, final acij acij, final acio acio, final boolean b) {
        context.getClass();
        acij.getClass();
        int cn;
        if (b) {
            cn = tmy.cn(context, 2130970822);
        }
        else {
            cn = 0;
        }
        acij.f("setBackgroundColor", (Object)cn);
        acio.e(acij);
    }
    
    public static boolean x(final gim gim, final String s, final String s2) {
        final boolean v = aeda.v(gim.d(), s);
        boolean b = false;
        if (v) {
            if (gim.b() != null && s2 != null) {
                if (aeda.v(gim.b(), s2)) {
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
    
    public static boolean y(final ryt ryt) {
        return ryt != null && ryt.a() == 1;
    }
    
    public static fqo z(final fqo fqo, final fzo fzo) {
        if (!((aexq)fzo.a).h() && !((aexq)fzo.b).h()) {
            return fqo;
        }
        final agza builder = ((agzi)fqo.a).createBuilder();
        if (fzo.e("snap_zoom_initially_zoomed")) {
            final boolean f = fzo.f("snap_zoom_initially_zoomed");
            builder.copyOnWrite();
            final fqo fqo2 = (fqo)builder.instance;
            fqo2.b |= 0x1;
            fqo2.c = f;
        }
        if (fzo.e("video_zoom_user_education_shown")) {
            final boolean f2 = fzo.f("video_zoom_user_education_shown");
            builder.copyOnWrite();
            final fqo fqo3 = (fqo)builder.instance;
            fqo3.b |= 0x2;
            fqo3.d = f2;
        }
        if (fzo.e("inline_global_play_pause")) {
            final int d = fzo.d("inline_global_play_pause", -1);
            builder.copyOnWrite();
            final fqo fqo4 = (fqo)builder.instance;
            fqo4.b |= 0x4;
            fqo4.e = d;
        }
        if (fzo.e("autonav_toggle_user_edu_triggers_remaining")) {
            final int d2 = fzo.d("autonav_toggle_user_edu_triggers_remaining", 1);
            builder.copyOnWrite();
            final fqo fqo5 = (fqo)builder.instance;
            fqo5.b |= 0x100;
            fqo5.l = d2;
        }
        return (fqo)builder.build();
    }
}
