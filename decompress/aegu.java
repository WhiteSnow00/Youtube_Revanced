import android.util.Log;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.security.NoSuchAlgorithmException;
import android.util.Base64;
import java.security.MessageDigest;
import java.io.File;
import android.app.Activity;
import android.os.Looper;
import android.os.Build$VERSION;
import android.content.Intent;
import android.text.Spannable;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.android.setupcompat.logging.CustomEvent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.view.InflateException;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegu
{
    public static int A(final Object o, final int n) {
        if (o instanceof byte[]) {
            return ((byte[])o)[n] & 0xFF;
        }
        if (o instanceof short[]) {
            return (char)((short[])o)[n];
        }
        return ((int[])o)[n];
    }
    
    public static int B(final int n) {
        return Math.max(4, v(n + 1));
    }
    
    public static Object C(final int n) {
        if (n < 2 || n > 1073741824 || Integer.highestOneBit(n) != n) {
            final StringBuilder sb = new StringBuilder("must be power of 2 between 2^1 and 2^30: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n <= 256) {
            return new byte[n];
        }
        if (n <= 65536) {
            return new short[n];
        }
        return new int[n];
    }
    
    public static void D(final Object o) {
        if (o instanceof byte[]) {
            Arrays.fill((byte[])o, (byte)0);
            return;
        }
        if (o instanceof short[]) {
            Arrays.fill((short[])o, (short)0);
            return;
        }
        Arrays.fill((int[])o, 0);
    }
    
    public static void E(final Object o, final int n, final int n2) {
        if (o instanceof byte[]) {
            ((byte[])o)[n] = (byte)n2;
            return;
        }
        if (o instanceof short[]) {
            ((short[])o)[n] = (short)n2;
            return;
        }
        ((int[])o)[n] = n2;
    }
    
    public static Collection F(final Collection collection, final afbk afbk) {
        afbk.getClass();
        return new afea(collection, afbk);
    }
    
    public static Collection G(final Collection collection, final afax afax) {
        return new afeb(collection, afax);
    }
    
    public static boolean H(final Collection collection, final Collection collection2) {
        final Iterator iterator = collection2.iterator();
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean I(final Collection collection, final Object o) {
        collection.getClass();
        try {
            return collection.contains(o);
        }
        catch (final ClassCastException | NullPointerException ex) {
            return false;
        }
    }
    
    public static final aetd J(final Set set, final long n, final afbh afbh) {
        return new aetd(set, n, afbh);
    }
    
    public static final void K(final Collection collection, final Set set) {
        set.addAll(collection);
    }
    
    public static aerx L(final afbh afbh, aerx aerx) {
        if (afbh.h()) {
            aerx = new aerx(afbh);
        }
        else {
            aerx.getClass();
        }
        return aerx;
    }
    
    public static void M(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static Object N(Context applicationContext, final Class clazz) {
        applicationContext = applicationContext.getApplicationContext();
        if (applicationContext instanceof arog) {
            final Object ar = ((arog)applicationContext).aR();
            try {
                return clazz.cast(ar);
            }
            catch (final ClassCastException ex) {
                throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", ex);
            }
        }
        throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext.getClass()))));
    }
    
    public static int O(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 32: {
                return 33;
            }
            case 31: {
                return 32;
            }
            case 30: {
                return 31;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 27: {
                return 28;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 24: {
                return 25;
            }
            case 23: {
                return 24;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 19: {
                return 20;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int P(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int Q(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int R(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int S(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int T(final int n) {
        if (n == 40) {
            return 41;
        }
        switch (n) {
            default: {
                return 0;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int U(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 44: {
                return 45;
            }
            case 43: {
                return 44;
            }
            case 42: {
                return 43;
            }
            case 41: {
                return 42;
            }
            case 40: {
                return 41;
            }
            case 39: {
                return 40;
            }
            case 38: {
                return 39;
            }
            case 37: {
                return 38;
            }
            case 36: {
                return 37;
            }
            case 35: {
                return 36;
            }
            case 34: {
                return 35;
            }
            case 33: {
                return 34;
            }
            case 32: {
                return 33;
            }
            case 31: {
                return 32;
            }
            case 30: {
                return 31;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 24: {
                return 25;
            }
            case 23: {
                return 24;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 19: {
                return 20;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int V(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int W(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int X(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int Y(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int Z(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static void a(final String s, final String s2, final int n, final int n2) {
        l(s, String.format("%s cannot be null.", s2));
        final int length = s.length();
        j(length <= n2 && length >= n, String.format("Length of %s should be in the range [%s-%s]", s2, n, n2));
    }
    
    public static int aa(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int ab(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int ac(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ad(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ae(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int af(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ag(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ah(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int ai(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int aj(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int ak(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int al(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 5;
    }
    
    public static int am(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 5) {
            return 6;
        }
        if (n == 10) {
            return 11;
        }
        if (n == 20) {
            return 21;
        }
        if (n != 30) {
            return 0;
        }
        return 31;
    }
    
    public static int an(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 5: {
                return 6;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int ao(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static String ap(final int n) {
        if (n == 1) {
            return "USER_INTERFACE_THEME_UNKNOWN";
        }
        if (n == 2) {
            return "USER_INTERFACE_THEME_LIGHT";
        }
        if (n != 3) {
            return "null";
        }
        return "USER_INTERFACE_THEME_DARK";
    }
    
    public static int aq(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ar(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int as(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    public static int at(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    private static final aeha au(final XmlPullParser xmlPullParser, final Context context) {
        final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
        try {
            while (true) {
                final int next = xmlPullParser.next();
                if (next != 2) {
                    if (next != 1) {
                        continue;
                    }
                    final String positionDescription = xmlPullParser.getPositionDescription();
                    final StringBuilder sb = new StringBuilder();
                    sb.append(positionDescription);
                    sb.append(": No start tag found!");
                    throw new InflateException(sb.toString());
                }
                else {
                    if (xmlPullParser.getName().equals("FooterButton")) {
                        return new aeha(context, attributeSet);
                    }
                    final String positionDescription2 = xmlPullParser.getPositionDescription();
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(positionDescription2);
                    sb2.append(": not a FooterButton");
                    throw new InflateException(sb2.toString());
                }
            }
        }
        catch (final IOException ex) {
            final String positionDescription3 = xmlPullParser.getPositionDescription();
            final String message = ex.getMessage();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(positionDescription3);
            sb3.append(": ");
            sb3.append(message);
            throw new InflateException(sb3.toString(), (Throwable)ex);
        }
        catch (final XmlPullParserException ex2) {
            throw new InflateException(ex2.getMessage(), (Throwable)ex2);
        }
    }
    
    private static final String av(final String s, final XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); ++i) {
            if (xmlPullParser.getAttributeName(i).equals(s)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
    
    private static final void aw(final XmlPullParser xmlPullParser) {
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
    
    public static final aeha b(final int n, final Context context) {
        final XmlResourceParser xml = context.getResources().getXml(n);
        try {
            return au((XmlPullParser)xml, context);
        }
        finally {
            xml.close();
        }
    }
    
    public static void c(final Context context, final CustomEvent customEvent) {
        l(context, "Context cannot be null.");
        final aegr a = aegr.a(context);
        final Bundle bundle = new Bundle();
        bundle.putParcelable("CustomEvent_bundle", (Parcelable)CustomEvent.b(customEvent));
        a.f(1, bundle);
    }
    
    public static void d(final Spannable spannable, final Object o, final Object... array) {
        final int spanStart = spannable.getSpanStart(o);
        final int spanEnd = spannable.getSpanEnd(o);
        spannable.removeSpan(o);
        for (int i = 0; i < array.length; ++i) {
            spannable.setSpan(array[i], spanStart, spanEnd, 0);
        }
    }
    
    public static boolean e(final Intent intent) {
        if (intent == null) {
            return false;
        }
        if (Build$VERSION.SDK_INT < 29) {
            if (!intent.getBooleanExtra("firstRun", false)) {
                if (!intent.getBooleanExtra("preDeferredSetup", false)) {
                    if (!intent.getBooleanExtra("deferredSetup", false)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return intent.getBooleanExtra("isSetupFlow", false);
    }
    
    public static boolean f(final Object o, final Object o2) {
        boolean b = true;
        if (o != o2) {
            if (o != null) {
                if (!o.equals(o2)) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public static boolean g() {
        return Build$VERSION.SDK_INT >= 31;
    }
    
    public static boolean h() {
        return Build$VERSION.SDK_INT >= 33;
    }
    
    public static String i(final int n) {
        switch (n) {
            default: {
                return "REBIND_REQUIRED";
            }
            case 6: {
                return "SERVICE_NOT_USABLE";
            }
            case 5: {
                return "DISCONNECTED";
            }
            case 4: {
                return "CONNECTED";
            }
            case 3: {
                return "BINDING";
            }
            case 2: {
                return "BIND_FAILED";
            }
            case 1: {
                return "NOT_STARTED";
            }
        }
    }
    
    public static void j(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static void k(final String s) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException(s.concat(" must be called from the UI thread."));
    }
    
    public static void l(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
    
    public static final String m(final Activity activity) {
        return activity.getComponentName().toString();
    }
    
    public static final aegn n(final aegv aegv, final aegv aegv2, final aegv aegv3, final aegv aegv4, final aegv aegv5, final aegv aegv6, final aegv aegv7, final aegv aegv8, final aegv aegv9, final aegv aegv10, final aegv aegv11, final aegv aegv12, final aegv aegv13, final int n) {
        return new aegn(n, aegv, aegv2, aegv3, aegv4, aegv5, aegv6, aegv7, aegv8, aegv9, aegv10, aegv11, aegv12, aegv13);
    }
    
    public static String o(final File file) {
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
    
    public static String p(final byte[] array) {
        try {
            final MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(array);
            return Base64.encodeToString(instance.digest(), 11);
        }
        catch (final NoSuchAlgorithmException ex) {
            return "";
        }
    }
    
    public static Context q(final Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }
    
    public static final aefs r(XmlPullParser ex, final aefs aefs) {
        try {
            while (((XmlPullParser)ex).next() != 1) {
                if (((XmlPullParser)ex).getEventType() == 2) {
                    if (((XmlPullParser)ex).getName().equals("splits")) {
                        while (((XmlPullParser)ex).next() != 3) {
                            if (((XmlPullParser)ex).getEventType() == 2) {
                                if (((XmlPullParser)ex).getName().equals("module")) {
                                    final String av = av("name", (XmlPullParser)ex);
                                    if (av != null) {
                                        while (((XmlPullParser)ex).next() != 3) {
                                            if (((XmlPullParser)ex).getEventType() == 2) {
                                                if (((XmlPullParser)ex).getName().equals("language")) {
                                                    while (((XmlPullParser)ex).next() != 3) {
                                                        if (((XmlPullParser)ex).getEventType() == 2) {
                                                            if (((XmlPullParser)ex).getName().equals("entry")) {
                                                                final String av2 = av("key", (XmlPullParser)ex);
                                                                final String av3 = av("split", (XmlPullParser)ex);
                                                                aw((XmlPullParser)ex);
                                                                if (av2 == null || av3 == null) {
                                                                    continue;
                                                                }
                                                                if (!((Map)aefs.a).containsKey(av2)) {
                                                                    ((Map<String, HashMap>)aefs.a).put(av2, new HashMap());
                                                                }
                                                                ((Map<K, Map<String, String>>)aefs.a).get(av2).put(av, av3);
                                                            }
                                                            else {
                                                                aw((XmlPullParser)ex);
                                                            }
                                                        }
                                                    }
                                                }
                                                else {
                                                    aw((XmlPullParser)ex);
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        aw((XmlPullParser)ex);
                                    }
                                }
                                else {
                                    aw((XmlPullParser)ex);
                                }
                            }
                        }
                    }
                    else {
                        aw((XmlPullParser)ex);
                    }
                }
            }
            ex = (IllegalStateException)new HashMap();
            for (final Map.Entry<String, V> entry : ((Map<Object, Object>)aefs.a).entrySet()) {
                ((Map<String, Map<Object, Object>>)ex).put(entry.getKey(), Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>((Map<?, ?>)entry.getValue())));
            }
            ex = (IllegalStateException)new aefs(Collections.unmodifiableMap((Map<?, ?>)ex));
            return (aefs)ex;
        }
        catch (final IllegalStateException ex) {}
        catch (final IOException ex) {}
        catch (final XmlPullParserException ex2) {}
        Log.e("SplitInstall", "Error while parsing splits.xml", (Throwable)ex);
        return null;
    }
    
    public static final afgi s(final afgw afgw) {
        return afgi.c((Collection)afgw.a.entrySet());
    }
    
    public static int t(final int n) {
        return (int)(Integer.rotateLeft((int)(n * -862048943L), 15) * 461845907L);
    }
    
    public static int u(final Object o) {
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        return t(hashCode);
    }
    
    public static int v(int highestOneBit) {
        final int max = Math.max(highestOneBit, 2);
        highestOneBit = Integer.highestOneBit(max);
        if (max <= highestOneBit) {
            return highestOneBit;
        }
        highestOneBit += highestOneBit;
        if (highestOneBit > 0) {
            return highestOneBit;
        }
        return 1073741824;
    }
    
    public static int w(final int n, final int n2) {
        return n & ~n2;
    }
    
    public static int x(final int n, final int n2, final int n3) {
        return (n & ~n3) | (n2 & n3);
    }
    
    public static int y(final int n) {
        int n2;
        if (n < 32) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        return n2 * (n + 1);
    }
    
    public static int z(final Object o, final Object o2, final int n, final Object o3, final int[] array, final Object[] array2, final Object[] array3) {
        final int u = u(o);
        final int n2 = u & n;
        int a = A(o3, n2);
        if (a == 0) {
            return -1;
        }
        final int w = w(u, n);
        int n3 = -1;
        while (true) {
            --a;
            final int n4 = array[a];
            if (w(n4, n) == w && aexq.c(o, array2[a]) && (array3 == null || aexq.c(o2, array3[a]))) {
                final int n5 = n4 & n;
                if (n3 == -1) {
                    E(o3, n2, n5);
                }
                else {
                    array[n3] = x(array[n3], n5, n);
                }
                return a;
            }
            final int n6 = n4 & n;
            if (n6 == 0) {
                return -1;
            }
            n3 = a;
            a = n6;
        }
    }
}
