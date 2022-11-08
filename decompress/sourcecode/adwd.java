import android.support.v7.widget.AppCompatImageButton;
import android.graphics.Outline;
import android.view.Window;
import java.util.Locale;
import android.os.Build;
import android.view.animation.PathInterpolator;
import android.graphics.Path;
import android.view.animation.AnimationUtils;
import android.animation.TimeInterpolator;
import android.provider.Settings$Global;
import android.content.ContentResolver;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.graphics.Typeface;
import android.content.res.Configuration;
import java.util.Arrays;
import java.util.ArrayList;
import android.util.Log;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.RectF;
import com.google.android.material.tabs.TabLayout;
import com.google.apps.tiktok.account.AccountId;
import android.os.Bundle;
import java.util.RandomAccess;
import java.util.NoSuchElementException;
import java.util.Iterator;
import android.widget.EditText;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import android.widget.ImageView$ScaleType;
import java.security.NoSuchAlgorithmException;
import android.util.Base64;
import java.security.MessageDigest;
import java.io.File;
import j$.util.Optional;
import java.util.Collection;
import android.animation.ValueAnimator;
import android.animation.Animator;
import java.util.List;
import android.animation.AnimatorSet;
import android.graphics.Color;
import android.util.TypedValue;
import android.content.Context;
import android.view.View;
import java.util.concurrent.ThreadPoolExecutor;

// 
// Decompiled by Procyon v0.6.0
// 

public class adwd
{
    private static aebk a;
    public static ThreadPoolExecutor b;
    private static agiy c;
    
    public static int A(final View view, final int n) {
        return bc(view.getContext(), l(view.getContext(), n, view.getClass().getCanonicalName()));
    }
    
    public static int B(final Context context, final int n, final int n2) {
        final TypedValue k = k(context, n);
        if (k != null) {
            return bc(context, k);
        }
        return n2;
    }
    
    public static int C(final int n, final int n2, final float n3) {
        return ahy.e(ahy.f(n2, Math.round(Color.alpha(n2) * n3)), n);
    }
    
    public static boolean D(final int n) {
        return n != 0 && ahy.b(n) > 0.5;
    }
    
    public static int E(final Context context, final String s) {
        return bc(context, l(context, 2130969109, s));
    }
    
    public static void F(final AnimatorSet set, final List list) {
        final int size = list.size();
        long max = 0L;
        for (int i = 0; i < size; ++i) {
            final Animator animator = list.get(i);
            max = Math.max(max, animator.getStartDelay() + animator.getDuration());
        }
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { 0, 0 });
        ((Animator)ofInt).setDuration(max);
        list.add(0, ofInt);
        set.playTogether((Collection)list);
    }
    
    public static void G(final adok adok) {
        H(adqb.a(adok));
    }
    
    public static void H(final agsi agsi) {
        agot.G(Double.compare(agsi.f, 2.0) <= 0, "Playout rate cannot be set higher than %s.", (Object)2.0);
    }
    
    public static adoo I(final adon adon) {
        return new adoo((String)null, adon, Optional.empty());
    }
    
    public static adoo J(final String s) {
        return new adoo(s, adon.a, Optional.empty());
    }
    
    public static adoo K(final String s, final adon adon, final String s2) {
        return new adoo(s, adon, Optional.of((Object)new adop(s2)));
    }
    
    public static String L(final File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        final String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) {
            return "";
        }
        if (replaceFirst.startsWith("base-")) {
            return replaceFirst.replace("base-", "config.");
        }
        return replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
    }
    
    public static String M(final byte[] array) {
        try {
            final MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(array);
            return Base64.encodeToString(instance.digest(), 11);
        }
        catch (final NoSuchAlgorithmException ex) {
            return "";
        }
    }
    
    public static Context N(final Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }
    
    public static aebk O(final Context context) {
        synchronized (adwd.class) {
            if (adwd.a == null) {
                adwd.a = (aebk)new aebf(new aeby(N(context), (byte[])null), null);
            }
            return adwd.a;
        }
    }
    
    public static aeai P(final String s, final String s2) {
        return new aeai(s, s2);
    }
    
    public static adzx Q(final String s, final String s2) {
        return new adzx(s, s2);
    }
    
    public static String R(final String s) {
        return "update.precondition.failures:".concat(s);
    }
    
    public static ImageView$ScaleType S(final int n) {
        if (n == 0) {
            return ImageView$ScaleType.FIT_XY;
        }
        if (n == 1) {
            return ImageView$ScaleType.FIT_START;
        }
        if (n == 2) {
            return ImageView$ScaleType.FIT_CENTER;
        }
        if (n == 3) {
            return ImageView$ScaleType.FIT_END;
        }
        if (n == 5) {
            return ImageView$ScaleType.CENTER_CROP;
        }
        if (n != 6) {
            return ImageView$ScaleType.CENTER;
        }
        return ImageView$ScaleType.CENTER_INSIDE;
    }
    
    public static void T(final TextInputLayout textInputLayout, final CheckableImageButton checkableImageButton, final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        Drawable drawable2;
        final Drawable drawable = drawable2 = checkableImageButton.getDrawable();
        if (drawable != null) {
            final Drawable mutate = drawable.mutate();
            if (list != null && list.isStateful()) {
                aip.g(mutate, ColorStateList.valueOf(list.getColorForState(bf(textInputLayout, checkableImageButton), list.getDefaultColor())));
            }
            else {
                aip.g(mutate, list);
            }
            drawable2 = mutate;
            if (porterDuff$Mode != null) {
                aip.h(mutate, porterDuff$Mode);
                drawable2 = mutate;
            }
        }
        if (checkableImageButton.getDrawable() != drawable2) {
            ((AppCompatImageButton)checkableImageButton).setImageDrawable(drawable2);
        }
    }
    
    public static void U(final TextInputLayout textInputLayout, final CheckableImageButton checkableImageButton, final ColorStateList list) {
        final Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && list != null) {
            if (list.isStateful()) {
                final int colorForState = list.getColorForState(bf(textInputLayout, checkableImageButton), list.getDefaultColor());
                final Drawable mutate = drawable.mutate();
                aip.g(mutate, ColorStateList.valueOf(colorForState));
                ((AppCompatImageButton)checkableImageButton).setImageDrawable(mutate);
            }
        }
    }
    
    public static void V(final CheckableImageButton checkableImageButton, final int n) {
        checkableImageButton.setMinimumWidth(n);
        checkableImageButton.setMinimumHeight(n);
    }
    
    public static void W(final CheckableImageButton checkableImageButton, final View$OnClickListener onClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        bg(checkableImageButton);
    }
    
    public static void X(final CheckableImageButton checkableImageButton) {
        checkableImageButton.setOnLongClickListener((View$OnLongClickListener)null);
        bg(checkableImageButton);
    }
    
    public static boolean Y(final EditText editText) {
        return editText.getInputType() != 0;
    }
    
    public static agiy Z(final Context context) {
        synchronized (adwd.class) {
            if (adwd.c == null) {
                adwd.c = new agiy(new adcr(N(context), null), (byte[])null, (byte[])null);
            }
            return adwd.c;
        }
    }
    
    public static void aA(final Iterator iterator) {
        iterator.getClass();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
    
    public static boolean aB(final Collection collection, final Iterator iterator) {
        collection.getClass();
        iterator.getClass();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= collection.add(iterator.next());
        }
        return b;
    }
    
    public static boolean aC(final Iterator iterator, final Object o) {
        if (o == null) {
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return true;
                }
            }
        }
        else {
            while (iterator.hasNext()) {
                if (o.equals(iterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean aD(final Iterator iterator, final Collection collection) {
        collection.getClass();
        boolean b = false;
        while (iterator.hasNext()) {
            if (collection.contains(iterator.next())) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    public static int aE(final Iterable iterable, final aext aext) {
        return at(iterable.iterator(), aext);
    }
    
    public static aexq aF(final Iterable iterable, final aext aext) {
        final Iterator iterator = iterable.iterator();
        iterator.getClass();
        aext.getClass();
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (aext.a(next)) {
                final Object o = aexq.k(next);
                return (aexq)o;
            }
        }
        final Object o = aewp.a;
        return (aexq)o;
    }
    
    public static Iterable aG(final Iterable iterable, final aext aext) {
        iterable.getClass();
        aext.getClass();
        return (Iterable)new afee(iterable, aext);
    }
    
    public static Iterable aH(final Iterable iterable, final aexg aexg) {
        aexg.getClass();
        return (Iterable)new afef(iterable, aexg);
    }
    
    public static Object aI(final Iterable iterable, final int n) {
        final Iterator iterator = iterable.iterator();
        final int as = as(iterator, n);
        if (iterator.hasNext()) {
            return iterator.next();
        }
        final StringBuilder sb = new StringBuilder("position (");
        sb.append(n);
        sb.append(") must be less than the number of elements that remained (");
        sb.append(as);
        sb.append(")");
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public static Object aJ(final Iterable iterable, final Object o) {
        return aw(iterable.iterator(), o);
    }
    
    public static Object aK(final Iterable iterable) {
        if (!(iterable instanceof List)) {
            return av(iterable.iterator());
        }
        if (!((List)iterable).isEmpty()) {
            return bh((List)iterable);
        }
        throw new NoSuchElementException();
    }
    
    public static Object aL(final Iterable iterable) {
        final Iterator iterator = iterable.iterator();
        final Object next = iterator.next();
        if (!iterator.hasNext()) {
            return next;
        }
        final StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int n = 0; n < 4 && iterator.hasNext(); ++n) {
            sb.append(", ");
            sb.append(iterator.next());
        }
        if (iterator.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static String aM(final Iterable iterable) {
        final Iterator iterator = iterable.iterator();
        final StringBuilder sb = new StringBuilder("[");
        int n = 1;
        while (iterator.hasNext()) {
            if (n == 0) {
                sb.append(", ");
            }
            sb.append(iterator.next());
            n = 0;
        }
        sb.append(']');
        return sb.toString();
    }
    
    public static boolean aN(final Collection collection, final Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection)iterable);
        }
        iterable.getClass();
        return aB(collection, iterable.iterator());
    }
    
    public static boolean aO(final Iterable iterable, final aext aext) {
        return at(iterable.iterator(), aext) != -1;
    }
    
    public static Object[] aP(final Iterable iterable) {
        return bi(iterable).toArray();
    }
    
    public static Object[] aQ(final Iterable iterable, final Class clazz) {
        return aR(iterable, ajox.H(clazz, 0));
    }
    
    public static Object[] aR(final Iterable iterable, final Object[] array) {
        return bi(iterable).toArray(array);
    }
    
    public static Object aS(final Iterable iterable) {
        if (iterable instanceof Collection) {
            if (((Collection)iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof List) {
                return bh((List)iterable);
            }
        }
        final Iterator iterator = iterable.iterator();
        if (iterator.hasNext()) {
            return av(iterator);
        }
        return null;
    }
    
    public static void aT(final Iterable iterable, final aext aext) {
        if (iterable instanceof RandomAccess && iterable instanceof List) {
            final List list = (List)iterable;
            aext.getClass();
            bk(list, aext);
            return;
        }
        final Iterator iterator = iterable.iterator();
        aext.getClass();
        while (iterator.hasNext()) {
            if (aext.a(iterator.next())) {
                iterator.remove();
            }
        }
    }
    
    public static afcs aU(final afdg afdg) {
        return afcs.c(afdg.a.entrySet());
    }
    
    public static aeoe aV(final aexq aexq, aeoe aeoe) {
        if (aexq.h()) {
            aeoe = new aeoe(aexq);
        }
        else {
            aeoe.getClass();
        }
        return aeoe;
    }
    
    public static Bundle aW(final br br) {
        Bundle m;
        if ((m = br.m) == null) {
            m = new Bundle();
        }
        return m;
    }
    
    public static void aX(final br br, final AccountId accountId) {
        agot.z(br instanceof ariy, "Fragment %s is not a TikTok Fragment", (Object)br);
        agot.z(((ariy)br).lC() instanceof aenz, "Fragment %s is not a TikTok account Fragment", (Object)br);
        aenz.e(br, accountId);
    }
    
    private static float aZ(final String[] array, final int n) {
        final float float1 = Float.parseFloat(array[n]);
        if (float1 >= 0.0f && float1 <= 1.0f) {
            return float1;
        }
        final StringBuilder sb = new StringBuilder("Motion easing control point value must be between 0 and 1; instead got: ");
        sb.append(float1);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static RectF aa(final TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.w && view instanceof adxv) {
            final adxv adxv = (adxv)view;
            final TextView a = adxv.a;
            final int n = 0;
            final ImageView b = adxv.b;
            int i = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            while (i < 3) {
                view = (new View[] { (View)a, (View)b, null })[i];
                int n5 = n2;
                int n6 = n3;
                int n7 = n4;
                if (view != null) {
                    n5 = n2;
                    n6 = n3;
                    n7 = n4;
                    if (view.getVisibility() == 0) {
                        int n8;
                        if (n4 != 0) {
                            n8 = Math.min(n3, view.getLeft());
                        }
                        else {
                            n8 = view.getLeft();
                        }
                        int n9;
                        if (n4 != 0) {
                            n9 = Math.max(n2, view.getRight());
                        }
                        else {
                            n9 = view.getRight();
                        }
                        n7 = 1;
                        n6 = n8;
                        n5 = n9;
                    }
                }
                ++i;
                n2 = n5;
                n3 = n6;
                n4 = n7;
            }
            final int n10 = n2 - n3;
            final TextView a2 = adxv.a;
            final ImageView b2 = adxv.b;
            int n11 = 0;
            int n12 = 0;
            int n13 = 0;
            int n14;
            int n15;
            int n16;
            for (int j = n; j < 3; ++j, n11 = n14, n12 = n15, n13 = n16) {
                final View view2 = (new View[] { (View)a2, (View)b2, null })[j];
                n14 = n11;
                n15 = n12;
                n16 = n13;
                if (view2 != null) {
                    n14 = n11;
                    n15 = n12;
                    n16 = n13;
                    if (view2.getVisibility() == 0) {
                        int n17;
                        if (n13 != 0) {
                            n17 = Math.min(n12, view2.getTop());
                        }
                        else {
                            n17 = view2.getTop();
                        }
                        int n18;
                        if (n13 != 0) {
                            n18 = Math.max(n11, view2.getBottom());
                        }
                        else {
                            n18 = view2.getBottom();
                        }
                        n16 = 1;
                        n15 = n17;
                        n14 = n18;
                    }
                }
            }
            int n19 = (int)p(adxv.getContext(), 24);
            if (n10 >= n19) {
                n19 = n10;
            }
            final int n20 = (adxv.getLeft() + adxv.getRight()) / 2;
            final int n21 = (adxv.getTop() + adxv.getBottom()) / 2;
            final int n22 = n19 / 2;
            return new RectF((float)(n20 - n22), (float)(n21 - (n11 - n12) / 2), (float)(n22 + n20), (float)(n21 + n20 / 2));
        }
        return new RectF((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom());
    }
    
    public static adwd ac() {
        return new adwd();
    }
    
    public static void ad(final View view, final float n) {
        final Drawable background = view.getBackground();
        if (background instanceof adwf) {
            ((adwf)background).n(n);
        }
    }
    
    public static void ae(final View view) {
        final Drawable background = view.getBackground();
        if (background instanceof adwf) {
            af(view, (adwf)background);
        }
    }
    
    public static void af(final View view, final adwf adwf) {
        final adsk b = adwf.a.b;
        if (b != null && b.a) {
            ViewParent viewParent = view.getParent();
            float n = 0.0f;
            while (viewParent instanceof View) {
                n += ana.a((View)viewParent);
                viewParent = viewParent.getParent();
            }
            adwf.q(n);
        }
    }
    
    public static adwb ag(final adwb adwb, final float n) {
        if (adwb instanceof adwh) {
            return adwb;
        }
        return (adwb)new adwa(n, adwb);
    }
    
    public static adwd ah(final int n) {
        if (n == 0) {
            return (adwd)new adwi();
        }
        if (n != 1) {
            return ai();
        }
        return (adwd)new adwc();
    }
    
    public static adwd ai() {
        return (adwd)new adwi();
    }
    
    public static aeby aj(XmlPullParser ex, final aeby aeby) {
        try {
            while (((XmlPullParser)ex).next() != 1) {
                if (((XmlPullParser)ex).getEventType() == 2) {
                    if (((XmlPullParser)ex).getName().equals("splits")) {
                        while (((XmlPullParser)ex).next() != 3) {
                            if (((XmlPullParser)ex).getEventType() == 2) {
                                if (((XmlPullParser)ex).getName().equals("module")) {
                                    final String bd = bd("name", (XmlPullParser)ex);
                                    if (bd != null) {
                                        while (((XmlPullParser)ex).next() != 3) {
                                            if (((XmlPullParser)ex).getEventType() == 2) {
                                                if (((XmlPullParser)ex).getName().equals("language")) {
                                                    while (((XmlPullParser)ex).next() != 3) {
                                                        if (((XmlPullParser)ex).getEventType() == 2) {
                                                            if (((XmlPullParser)ex).getName().equals("entry")) {
                                                                final String bd2 = bd("key", (XmlPullParser)ex);
                                                                final String bd3 = bd("split", (XmlPullParser)ex);
                                                                be((XmlPullParser)ex);
                                                                if (bd2 == null || bd3 == null) {
                                                                    continue;
                                                                }
                                                                if (!((Map)aeby.a).containsKey(bd2)) {
                                                                    ((Map<String, HashMap>)aeby.a).put(bd2, new HashMap());
                                                                }
                                                                ((Map<K, Map<String, String>>)aeby.a).get(bd2).put(bd, bd3);
                                                            }
                                                            else {
                                                                be((XmlPullParser)ex);
                                                            }
                                                        }
                                                    }
                                                }
                                                else {
                                                    be((XmlPullParser)ex);
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        be((XmlPullParser)ex);
                                    }
                                }
                                else {
                                    be((XmlPullParser)ex);
                                }
                            }
                        }
                    }
                    else {
                        be((XmlPullParser)ex);
                    }
                }
            }
            ex = (IllegalStateException)new HashMap();
            for (final Map.Entry<String, V> entry : ((Map<Object, Object>)aeby.a).entrySet()) {
                ((Map<String, Map<Object, Object>>)ex).put(entry.getKey(), Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>((Map<?, ?>)entry.getValue())));
            }
            ex = (IllegalStateException)new aeby((Map)Collections.unmodifiableMap((Map<?, ?>)ex));
            return (aeby)ex;
        }
        catch (final IllegalStateException ex) {}
        catch (final IOException ex) {}
        catch (final XmlPullParserException ex2) {}
        Log.e("SplitInstall", "Error while parsing splits.xml", (Throwable)ex);
        return null;
    }
    
    public static ArrayList ak() {
        return new ArrayList();
    }
    
    public static ArrayList al(final Iterable iterable) {
        iterable.getClass();
        ArrayList am;
        if (iterable instanceof Collection) {
            am = new ArrayList((Collection<?>)iterable);
        }
        else {
            am = am(iterable.iterator());
        }
        return am;
    }
    
    public static ArrayList am(final Iterator iterator) {
        final ArrayList ak = ak();
        aB(ak, iterator);
        return ak;
    }
    
    @SafeVarargs
    public static ArrayList an(final Object... array) {
        array.getClass();
        final int length = array.length;
        ahbz.ay(length, "arraySize");
        final ArrayList list = new ArrayList<Object>(aesy.A(length + 5L + length / 10));
        Collections.addAll((Collection<? super Object>)list, array);
        return list;
    }
    
    public static ArrayList ao(final int n) {
        ahbz.ay(n, "initialArraySize");
        return new ArrayList(n);
    }
    
    public static List ap(final List list) {
        if (list instanceof afcr) {
            return (List)((afcr)list).a();
        }
        if (list instanceof afeu) {
            return ((afeu)list).a;
        }
        if (list instanceof RandomAccess) {
            return (List)new afes(list);
        }
        return (List)new afeu(list);
    }
    
    public static List aq(final List list, final aexg aexg) {
        Object o;
        if (list instanceof RandomAccess) {
            o = new afew(list, aexg);
        }
        else {
            o = new afey(list, aexg);
        }
        return (List)o;
    }
    
    public static boolean ar(final List list, final Object o) {
        if (o == list) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        final List list2 = (List)o;
        final int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; ++i) {
                if (!aeda.v(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        final Iterator iterator = list.iterator();
        final Iterator iterator2 = list2.iterator();
        while (iterator.hasNext()) {
            if (iterator2.hasNext()) {
                if (aeda.v(iterator.next(), iterator2.next())) {
                    continue;
                }
            }
            return false;
        }
        if (!iterator2.hasNext()) {
            return true;
        }
        return false;
    }
    
    public static int as(final Iterator iterator, final int n) {
        iterator.getClass();
        int n2 = 0;
        agot.v(n >= 0, (Object)"numberToAdvance must be nonnegative");
        while (n2 < n && iterator.hasNext()) {
            iterator.next();
            ++n2;
        }
        return n2;
    }
    
    public static int at(final Iterator iterator, final aext aext) {
        aext.getClass();
        int n = 0;
        while (iterator.hasNext()) {
            if (aext.a(iterator.next())) {
                return n;
            }
            ++n;
        }
        return -1;
    }
    
    public static afie au(final Iterator iterator, final aext aext) {
        iterator.getClass();
        aext.getClass();
        return (afie)new afek(iterator, aext);
    }
    
    public static Object av(final Iterator iterator) {
        Object next;
        do {
            next = iterator.next();
        } while (iterator.hasNext());
        return next;
    }
    
    public static Object aw(final Iterator iterator, final Object o) {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return o;
    }
    
    public static Object ax(final Iterator iterator) {
        if (iterator.hasNext()) {
            final Object next = iterator.next();
            iterator.remove();
            return next;
        }
        return null;
    }
    
    public static Iterator ay(final Iterator iterator) {
        return (Iterator)new afeo(iterator);
    }
    
    public static Iterator az(final Iterator iterator, final aexg aexg) {
        aexg.getClass();
        return (Iterator)new afel(iterator, aexg);
    }
    
    private static String ba(final String s, final String s2) {
        return s.substring(s2.length() + 1, s.length() - 1);
    }
    
    private static boolean bb(final String s, final String s2) {
        return s.startsWith(s2.concat("(")) && s.endsWith(")");
    }
    
    private static int bc(final Context context, final TypedValue typedValue) {
        if (typedValue.resourceId != 0) {
            return agx.a(context, typedValue.resourceId);
        }
        return typedValue.data;
    }
    
    private static String bd(final String s, final XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); ++i) {
            if (xmlPullParser.getAttributeName(i).equals(s)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
    
    private static void be(final XmlPullParser xmlPullParser) {
        int i = 1;
        while (i != 0) {
            final int next = xmlPullParser.next();
            if (next != 2) {
                if (next != 3) {
                    continue;
                }
                --i;
            }
            else {
                ++i;
            }
        }
    }
    
    private static int[] bf(final TextInputLayout textInputLayout, final CheckableImageButton checkableImageButton) {
        final int[] drawableState = textInputLayout.getDrawableState();
        final int[] drawableState2 = checkableImageButton.getDrawableState();
        final int length = drawableState.length;
        final int length2 = drawableState2.length;
        final int[] copy = Arrays.copyOf(drawableState, length + length2);
        System.arraycopy(drawableState2, 0, copy, length, length2);
        return copy;
    }
    
    private static void bg(final CheckableImageButton checkableImageButton) {
        final boolean aj = ana.aj((View)checkableImageButton);
        checkableImageButton.setFocusable(aj);
        checkableImageButton.setClickable(aj);
        checkableImageButton.c = aj;
        checkableImageButton.setLongClickable(false);
        int n = 1;
        if (!aj) {
            n = 2;
        }
        ana.X((View)checkableImageButton, n);
    }
    
    private static Object bh(final List list) {
        return list.get(list.size() - 1);
    }
    
    private static Collection bi(final Iterable iterable) {
        Collection am;
        if (iterable instanceof Collection) {
            am = (Collection)iterable;
        }
        else {
            am = am(iterable.iterator());
        }
        return am;
    }
    
    private static void bj(final List list, final aext aext, final int n, final int n2) {
        int size = list.size();
        int n4;
        while (true) {
            final int n3 = size - 1;
            if (n3 <= (n4 = n2)) {
                break;
            }
            size = n3;
            if (!aext.a(list.get(n3))) {
                continue;
            }
            list.remove(n3);
            size = n3;
        }
        while (--n4 >= n) {
            list.remove(n4);
        }
    }
    
    private static void bk(final List list, final aext aext) {
        int i = 0;
        int n = 0;
        while (i < list.size()) {
            final Object value = list.get(i);
            int n2 = n;
            if (!aext.a(value)) {
                if (i > n) {
                    try {
                        list.set(n, value);
                    }
                    catch (final IllegalArgumentException ex) {
                        bj(list, aext, n, i);
                        return;
                    }
                    catch (final UnsupportedOperationException ex2) {
                        bj(list, aext, n, i);
                        return;
                    }
                }
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        list.subList(n, list.size()).clear();
    }
    
    public static Typeface d(final Configuration configuration, final Typeface typeface) {
        if (Build$VERSION.SDK_INT >= 31 && configuration.fontWeightAdjustment != Integer.MAX_VALUE && configuration.fontWeightAdjustment != 0 && typeface != null) {
            return Typeface.create(typeface, aeh.t(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
        }
        return null;
    }
    
    public static int e(final Context context, final TypedArray typedArray, int dimensionPixelSize, final int n) {
        final TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(dimensionPixelSize, typedValue) && typedValue.type == 2) {
            final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { typedValue.data });
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, n);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(dimensionPixelSize, n);
    }
    
    public static ColorStateList f(final Context context, final TypedArray typedArray, final int n) {
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                final ColorStateList d = td.d(context, resourceId);
                if (d != null) {
                    return d;
                }
            }
        }
        return typedArray.getColorStateList(n);
    }
    
    public static Drawable g(final Context context, final TypedArray typedArray, final int n) {
        if (typedArray.hasValue(n)) {
            final int resourceId = typedArray.getResourceId(n, 0);
            if (resourceId != 0) {
                final Drawable b = fc.b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getDrawable(n);
    }
    
    public static boolean h(final Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }
    
    public static boolean i(final Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
    
    public static int j(final Context context, final int n, final int n2) {
        final TypedValue k = k(context, n);
        if (k != null && k.type == 16) {
            return k.data;
        }
        return n2;
    }
    
    public static TypedValue k(final Context context, final int n) {
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(n, typedValue, true)) {
            return typedValue;
        }
        return null;
    }
    
    public static TypedValue l(final Context context, final int n, final String s) {
        final TypedValue k = k(context, n);
        if (k != null) {
            return k;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", s, context.getResources().getResourceName(n)));
    }
    
    public static boolean m(final Context context, final int n, final boolean b) {
        final TypedValue k = k(context, n);
        boolean b2 = b;
        if (k != null) {
            b2 = b;
            if (k.type == 18) {
                if (k.data != 0) {
                    return true;
                }
                b2 = false;
            }
        }
        return b2;
    }
    
    public static float n(final ContentResolver contentResolver) {
        return Settings$Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
    
    public static TimeInterpolator o(final Context context, int length, TimeInterpolator ba) {
        final TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(length, typedValue, true)) {
            return ba;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        final String value = String.valueOf(typedValue.string);
        if (!bb(value, "cubic-bezier") && !bb(value, "path")) {
            return (TimeInterpolator)AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        PathInterpolator pathInterpolator;
        if (bb(value, "cubic-bezier")) {
            final String[] split = ba(value, "cubic-bezier").split(",");
            length = split.length;
            if (length != 4) {
                final StringBuilder sb = new StringBuilder("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            }
            pathInterpolator = apb.c(aZ(split, 0), aZ(split, 1), aZ(split, 2), aZ(split, 3));
        }
        else {
            if (!bb(value, "path")) {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(value)));
            }
            ba = (TimeInterpolator)ba(value, "path");
            Path path = new Path();
            final aie[] b = vi.b((String)ba);
            Label_0224: {
                if (b != null) {
                    try {
                        aie.a(b, path);
                        break Label_0224;
                    }
                    catch (final RuntimeException ex) {
                        throw new RuntimeException("Error in parsing ".concat(String.valueOf(ba)), ex);
                    }
                }
                path = null;
            }
            pathInterpolator = apb.a(path);
        }
        return (TimeInterpolator)pathInterpolator;
    }
    
    public static float p(final Context context, final int n) {
        return TypedValue.applyDimension(1, (float)n, context.getResources().getDisplayMetrics());
    }
    
    public static PorterDuff$Mode q(final int n, final PorterDuff$Mode porterDuff$Mode) {
        if (n == 3) {
            return PorterDuff$Mode.SRC_OVER;
        }
        if (n == 5) {
            return PorterDuff$Mode.SRC_IN;
        }
        if (n == 9) {
            return PorterDuff$Mode.SRC_ATOP;
        }
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
        }
    }
    
    public static boolean r(final View view) {
        return ana.f(view) == 1;
    }
    
    public static ColorStateList s(final Context context, final cdn cdn, final int n) {
        if (cdn.q(n)) {
            final int i = cdn.i(n, 0);
            if (i != 0) {
                final ColorStateList d = td.d(context, i);
                if (d != null) {
                    return d;
                }
            }
        }
        return cdn.j(n);
    }
    
    public static boolean t() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }
    
    public static void u(final Window window, final boolean b) {
        window.getDecorView();
        Object o;
        if (Build$VERSION.SDK_INT >= 30) {
            o = new aod(window);
        }
        else {
            o = new aoc(window);
        }
        ((afr)o).b(b);
    }
    
    public static Drawable v(Drawable drawable, final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        Drawable mutate;
        if (drawable == null) {
            mutate = null;
        }
        else {
            mutate = drawable;
            if (list != null) {
                drawable = (mutate = drawable.mutate());
                if (porterDuff$Mode != null) {
                    aip.h(drawable, porterDuff$Mode);
                    mutate = drawable;
                }
            }
        }
        return mutate;
    }
    
    public static void w(final Outline outline, final Path convexPath) {
        if (Build$VERSION.SDK_INT >= 30) {
            outline.setPath(convexPath);
            return;
        }
        Label_0028: {
            if (Build$VERSION.SDK_INT < 29) {
                break Label_0028;
            }
            try {
                outline.setConvexPath(convexPath);
                return;
                while (true) {
                    outline.setConvexPath(convexPath);
                    Label_0040: {
                        return;
                    }
                    iftrue(Label_0040:)(!convexPath.isConvex());
                    continue;
                }
            }
            catch (final IllegalArgumentException ex) {}
        }
    }
    
    public static void x(final Drawable drawable, final int n) {
        if (n != 0) {
            aip.f(drawable, n);
            return;
        }
        aip.g(drawable, (ColorStateList)null);
    }
    
    public static int[] y(int[] copy) {
        int n = 0;
        while (true) {
            final int length = copy.length;
            if (n >= length) {
                copy = Arrays.copyOf(copy, length + 1);
                copy[length] = 16842912;
                return copy;
            }
            final int n2 = copy[n];
            if (n2 == 16842912) {
                return copy;
            }
            if (n2 == 0) {
                copy = copy.clone();
                copy[n] = 16842912;
                return copy;
            }
            ++n;
        }
    }
    
    public static int z(final int n, final int n2) {
        return ahy.f(n, Color.alpha(n) * n2 / 255);
    }
    
    public void a(final Object o, final int n) {
    }
    
    public void ab(final TabLayout tabLayout, final View view, final View view2, final float n, final Drawable drawable) {
        final RectF aa = aa(tabLayout, view);
        final RectF aa2 = aa(tabLayout, view2);
        drawable.setBounds(adqd.c((int)aa.left, (int)aa2.left, n), drawable.getBounds().top, adqd.c((int)aa.right, (int)aa2.right, n), drawable.getBounds().bottom);
    }
    
    public void b(final Object o) {
    }
    
    public void c(final adwu adwu, final float n, final float n2) {
    }
}
