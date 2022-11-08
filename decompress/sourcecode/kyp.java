import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.text.Spanned;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.LayerDrawable;
import java.util.Locale;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import java.util.List;
import android.text.style.TextAppearanceSpan;
import android.text.Annotation;
import android.text.SpannableString;
import android.app.Activity;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import com.google.android.libraries.youtube.engagementpanel.size.EngagementPanelSizeBehavior;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewConfiguration;
import android.net.Uri;
import android.content.Context;
import java.util.concurrent.Callable;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyp
{
    @Backup
    public static final String FLOATY_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP = "floaty_bar_tutorial_last_shown_timestamp";
    @Backup
    public static final String FLOATY_BAR_TUTORIAL_SHOWN_COUNT = "floaty_bar_tutorial_shown_count";
    
    public kyp() {
    }
    
    public kyp(final aamd aamd, final vup vup, final mrm mrm, final auh auh, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        mrm.A((Callable)new imb(aamd, new xpn(vup, "playback_lock_co_watch_interrupter", auh, (byte[])null, (byte[])null, (byte[])null, (byte[])null), 20, null, null, null));
    }
    
    public static Uri a(final Context context) {
        return tdb.k(context, "watch", "floatybartutorial.pb");
    }
    
    public static int b(final Context context) {
        return ViewConfiguration.get(context).getScaledMinimumFlingVelocity() * 32;
    }
    
    public static RecyclerView c(final View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView)view;
        }
        if (view instanceof alt && view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            if (viewGroup.getChildCount() > 0) {
                return c(viewGroup.getChildAt(0));
            }
        }
        return null;
    }
    
    public static void d(final PlaybackStartDescriptor playbackStartDescriptor, final abno abno) {
        final abtt p2 = abno.p();
        if (p2 == null) {
            return;
        }
        final PlayerResponseModel d = p2.d();
        long c;
        if (d != null && TimeUnit.SECONDS.toMillis(d.h()) - p2.c() <= 1000L) {
            c = 0L;
        }
        else {
            c = p2.c();
        }
        playbackStartDescriptor.p(c);
    }
    
    public static aexq e(final boolean b, final atjj atjj) {
        aexq aexq;
        if (b) {
            aexq = aexq.k((Object)atjj.a());
        }
        else {
            aexq = aewp.a;
        }
        return aexq;
    }
    
    public static uyi f(final uwi uwi, final EngagementPanelSizeBehavior engagementPanelSizeBehavior, final Set set) {
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList((uwl)uwi, (uwl)engagementPanelSizeBehavior));
        list.addAll(set);
        return new uyi((uwl[])adwd.aQ((Iterable)list, (Class)uwl.class));
    }
    
    public static boolean g(final utd utd, final kwd kwd, final arud arud) {
        final ajnl c = utd.C();
        if (c == null) {
            return false;
        }
        int j;
        if ((j = ajox.j(c.w)) == 0) {
            j = 1;
        }
        if (--j != 1) {
            if (j != 2) {
                if (j != 3) {
                    alvs alvs;
                    if ((alvs = arud.f().e) == null) {
                        alvs = alvs.a;
                    }
                    return !alvs.aT && kwd != kwd.a;
                }
                return kwd != kwd.b;
            }
            else if (kwd != kwd.a) {
                return true;
            }
        }
        return false;
    }
    
    public static CharSequence i(final Activity activity, int i) {
        final SpannableString spannableString = new SpannableString(activity.getText(i));
        final int length = spannableString.length();
        i = 0;
        for (Annotation[] array = (Annotation[])spannableString.getSpans(0, length, (Class)Annotation.class); i < array.length; ++i) {
            final Annotation annotation = array[i];
            if (annotation.getKey().equals("font") && annotation.getValue().equals("deeplink_emphasis")) {
                spannableString.setSpan((Object)new TextAppearanceSpan((Context)activity, 2132085305), spannableString.getSpanStart((Object)annotation), spannableString.getSpanEnd((Object)annotation), 33);
            }
        }
        return (CharSequence)spannableString;
    }
    
    public static List j(final acij acij, Object o, final List list, final acir acir, final tqp tqp, final SwipeLayout swipeLayout) {
        if (tqp != null) {
            tqp.a.add(swipeLayout);
        }
        swipeLayout.h();
        if (list != null && !list.isEmpty()) {
            final acij acij2 = new acij(acij);
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", o);
            acij2.g((Map)hashMap);
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = list.iterator();
            Object o2 = null;
            while (iterator.hasNext()) {
                final aibb aibb = (aibb)iterator.next();
                if (aibb != null) {
                    o = new kqq(aibb);
                    final aexq u = actc.u(acir, o, (ViewGroup)null);
                    if (!u.h()) {
                        continue;
                    }
                    final acil acil = (acil)u.c();
                    acil.mN(acij2, o);
                    list2.add(acil.a());
                    if ((o = o2) == null) {
                        o = new ArrayList();
                    }
                    ((List<acil>)o).add(acil);
                    o2 = o;
                }
            }
            tmy.Y(swipeLayout, (List)list2);
            return (List)o2;
        }
        swipeLayout.h = false;
        return null;
    }
    
    public static void k(final tqp tqp, final SwipeLayout swipeLayout, final List list, final acir acir) {
        if (list != null) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final View a = ((acil)iterator.next()).a();
                if (a.getParent() != null) {
                    ((ViewGroup)a.getParent()).removeView(a);
                }
                acir.b(a);
            }
            list.clear();
        }
        if (tqp != null) {
            tqp.a.remove(swipeLayout);
        }
        tmy.Y(swipeLayout, (List)Collections.emptyList());
    }
    
    public static void l(final View view, final ImageView imageView, final boolean b) {
        int dimensionPixelSize;
        if (b) {
            dimensionPixelSize = 0;
        }
        else {
            dimensionPixelSize = view.getResources().getDimensionPixelSize(2131169797);
        }
        int dimensionPixelSize2;
        if (b) {
            dimensionPixelSize2 = 0;
        }
        else {
            dimensionPixelSize2 = view.getResources().getDimensionPixelSize(2131169796);
        }
        view.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, 0);
        ImageView$ScaleType scaleType;
        if (b) {
            scaleType = ImageView$ScaleType.CENTER_CROP;
        }
        else {
            scaleType = ImageView$ScaleType.FIT_CENTER;
        }
        imageView.setScaleType(scaleType);
    }
    
    public static anne[] m(final List list) {
        final anne[] array = new anne[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            array[i] = (anne)list.get(i);
        }
        return array;
    }
    
    public static annf[] n(final List list) {
        final annf[] array = new annf[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            array[i] = (annf)list.get(i);
        }
        return array;
    }
    
    public static void o(final boolean b, final gli gli, final vax vax, final acij acij, final kaw kaw, final kjw kjw, final aioe aioe) {
        if (b && gli != null && vax != null && acij != null && kaw != null) {
            final aioe d = gli.d();
            d.getClass();
            if (!kaw.c(d, vax, ((wwx)acij).a, acij.e(), (acif)new kap(kaw, gli, 2))) {
                kjw.p(aioe);
            }
            return;
        }
        kjw.p(aioe);
    }
    
    public static void p(final TextView textView, final RatingBar ratingBar, final float n, final int textColor, final int n2) {
        if (textView != null && ratingBar != null) {
            if (n <= 0.0f) {
                textView.setVisibility(8);
                ratingBar.setVisibility(8);
                return;
            }
            float rating = n;
            if (n > 5.0f) {
                rating = 5.0f;
            }
            textView.setText((CharSequence)String.format(Locale.getDefault(), "%1.1f", rating));
            textView.setVisibility(0);
            textView.setContentDescription((CharSequence)String.valueOf(String.valueOf(textView.getText())).concat(" stars"));
            textView.setTextColor(textColor);
            ratingBar.setRating(rating);
            ratingBar.setVisibility(0);
            ((LayerDrawable)ratingBar.getProgressDrawable()).getDrawable(2).setColorFilter(n2, PorterDuff$Mode.SRC_ATOP);
        }
    }
    
    public static void q(final TextView textView, final Spanned spanned) {
        if (textView != null) {
            tmy.t(textView, (CharSequence)spanned);
        }
    }
    
    public static void r(final ImageView imageView, final aorm aorm, final aceo aceo) {
        if (imageView != null && aorm != null) {
            aceo.g(imageView, aorm);
            imageView.setVisibility(0);
            return;
        }
        imageView.setVisibility(8);
    }
    
    public static boolean s(final boolean b) {
        return !b;
    }
    
    public static View t(final View view, final ViewGroup viewGroup, final String s, final String s2, final boolean b, final Context context, final int n) {
        final TextView v = v(view, viewGroup, context, n);
        final ViewGroup$LayoutParams layoutParams = v.getLayoutParams();
        layoutParams.height = -2;
        v.setLayoutParams(layoutParams);
        v.setSingleLine(false);
        w(v, s, s2);
        x(v, b, false, context);
        return (View)v;
    }
    
    public static View u(final View view, final ViewGroup viewGroup, final String s, final String s2, final boolean b, final boolean b2, final Context context, final int n) {
        final TextView v = v(view, viewGroup, context, n);
        v.setSingleLine(false);
        w(v, s, s2);
        x(v, b, b2, context);
        return (View)v;
    }
    
    private static TextView v(final View view, final ViewGroup viewGroup, final Context context, final int n) {
        final LayoutInflater from = LayoutInflater.from(context);
        TextView textView;
        if (view == null) {
            textView = (TextView)from.inflate(n, viewGroup, false);
        }
        else {
            textView = (TextView)view;
        }
        return textView;
    }
    
    private static void w(final TextView textView, final String s, final String s2) {
        String text = s;
        if (s.isEmpty()) {
            text = s2;
        }
        textView.setText((CharSequence)text);
    }
    
    private static void x(final TextView textView, final boolean b, final boolean b2, final Context context) {
        int textColor;
        if (b) {
            if (b2) {
                textColor = tmy.cn(context, 2130970927);
            }
            else {
                textColor = tmy.cn(context, 2130968635);
            }
        }
        else {
            textColor = tmy.cn(context, 2130968634);
        }
        textView.setTextColor(textColor);
    }
}
