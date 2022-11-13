import android.content.res.TypedArray;
import java.io.IOException;
import java.util.ArrayList;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;
import android.content.res.Resources$NotFoundException;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Configuration;
import android.util.SparseArray;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahv
{
    private static final ThreadLocal a;
    private static final WeakHashMap b;
    private static final Object c;
    
    static {
        a = new ThreadLocal();
        b = new WeakHashMap(0);
        c = new Object();
    }
    
    public static int a(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        return ahp.a(resources, n, resources$Theme);
    }
    
    public static ColorStateList b(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        final ahr ahr = new ahr(resources, resources$Theme);
        synchronized (ahv.c) {
            final SparseArray sparseArray = ahv.b.get(ahr);
            final ColorStateList list = null;
            Object c = null;
            Label_0150: {
                if (sparseArray != null && sparseArray.size() > 0) {
                    final ttl ttl = (ttl)sparseArray.get(n);
                    if (ttl != null) {
                        if (((Configuration)ttl.b).equals(ahr.a.getConfiguration())) {
                            final Resources$Theme b = ahr.b;
                            if ((b == null && ttl.a == 0) || (b != null && ttl.a == b.hashCode())) {
                                c = ttl.c;
                                monitorexit(ahv.c);
                                break Label_0150;
                            }
                        }
                        sparseArray.remove(n);
                    }
                }
                monitorexit(ahv.c);
                c = null;
            }
            if (c == null) {
                final TypedValue i = i();
                resources.getValue(n, i, true);
                ColorStateList a;
                if (i.type >= 28 && i.type <= 31) {
                    a = list;
                }
                else {
                    final XmlResourceParser xml = resources.getXml(n);
                    try {
                        a = ahi.a(resources, (XmlPullParser)xml, resources$Theme);
                    }
                    catch (final Exception ex) {
                        Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", (Throwable)ex);
                        a = list;
                    }
                }
                if (a != null) {
                    final Object c2 = ahv.c;
                    synchronized (ahv.c) {
                        final WeakHashMap b2 = ahv.b;
                        SparseArray sparseArray2;
                        if ((sparseArray2 = b2.get(ahr)) == null) {
                            sparseArray2 = new SparseArray();
                            b2.put(ahr, sparseArray2);
                        }
                        sparseArray2.append(n, (Object)new ttl(a, ahr.a.getConfiguration(), resources$Theme));
                        return a;
                    }
                }
                return ahp.b(resources, n, resources$Theme);
            }
            return (ColorStateList)c;
        }
    }
    
    public static Typeface c(final Context context, final int n) {
        if (context.isRestricted()) {
            return null;
        }
        return j(context, n, new TypedValue(), 0, null, false, true);
    }
    
    public static Typeface d(final Context context, final int n) {
        if (context.isRestricted()) {
            return null;
        }
        return j(context, n, new TypedValue(), 0, null, false, false);
    }
    
    public static Typeface e(final Context context, final int n, final TypedValue typedValue, final int n2, final ahs ahs) {
        if (context.isRestricted()) {
            return null;
        }
        return j(context, n, typedValue, n2, ahs, true, false);
    }
    
    public static Drawable f(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        return aho.a(resources, n, resources$Theme);
    }
    
    public static float g(final Resources resources) {
        if (Build$VERSION.SDK_INT >= 29) {
            return ahq.a(resources, 2131168475);
        }
        final TypedValue i = i();
        resources.getValue(2131168475, i, true);
        if (i.type == 4) {
            return i.getFloat();
        }
        final StringBuilder sb = new StringBuilder("Resource ID #0x");
        sb.append(Integer.toHexString(2131168475));
        sb.append(" type #0x");
        sb.append(Integer.toHexString(i.type));
        sb.append(" is not valid");
        throw new Resources$NotFoundException(sb.toString());
    }
    
    public static void h(final Context context, final int n, final ahs ahs) {
        if (context.isRestricted()) {
            ahs.c(-4);
            return;
        }
        j(context, n, new TypedValue(), 0, ahs, false, false);
    }
    
    private static TypedValue i() {
        final ThreadLocal a = ahv.a;
        TypedValue typedValue;
        if ((typedValue = a.get()) == null) {
            typedValue = new TypedValue();
            a.set(typedValue);
        }
        return typedValue;
    }
    
    private static Typeface j(final Context context, final int n, final TypedValue typedValue, final int n2, final ahs ahs, final boolean b, final boolean b2) {
        final Resources resources = context.getResources();
        resources.getValue(n, typedValue, true);
        final Typeface k = k(context, resources, typedValue, n, n2, ahs, b, b2);
        if (k == null && ahs == null && !b2) {
            final StringBuilder sb = new StringBuilder("Font resource ID #0x");
            sb.append(Integer.toHexString(n));
            sb.append(" could not be retrieved.");
            throw new Resources$NotFoundException(sb.toString());
        }
        return k;
    }
    
    private static Typeface k(final Context context, final Resources resources, final TypedValue typedValue, final int n, final int n2, final ahs ahs, final boolean b, final boolean b2) {
        if (typedValue.string == null) {
            final StringBuilder sb = new StringBuilder("Resource \"");
            sb.append(resources.getResourceName(n));
            sb.append("\" (");
            sb.append(Integer.toHexString(n));
            sb.append(") is not a Font: ");
            sb.append(typedValue);
            throw new Resources$NotFoundException(sb.toString());
        }
        final String string = typedValue.string.toString();
        if (!string.startsWith("res/")) {
            if (ahs != null) {
                ahs.c(-3);
            }
            return null;
        }
        final Typeface typeface = (Typeface)aig.a.c(aig.c(resources, n, string, typedValue.assetCookie, n2));
        if (typeface != null) {
            if (ahs != null) {
                ahs.d(typeface);
            }
            return typeface;
        }
        if (b2) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                final Typeface b3 = aig.b(context, resources, n, string, typedValue.assetCookie, n2);
                if (ahs != null) {
                    if (b3 != null) {
                        ahs.d(b3);
                    }
                    else {
                        ahs.c(-3);
                    }
                }
                return b3;
            }
            final XmlResourceParser xml = resources.getXml(n);
            while (true) {
                final int next = ((XmlPullParser)xml).next();
                if (next != 2) {
                    if (next != 1) {
                        continue;
                    }
                    throw new XmlPullParserException("No start tag found");
                }
                else {
                    ((XmlPullParser)xml).require(2, (String)null, "font-family");
                    Object o = null;
                    Label_0684: {
                        Label_0681: {
                            if (((XmlPullParser)xml).getName().equals("font-family")) {
                                final TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)xml), aen.b);
                                final String string2 = obtainAttributes.getString(0);
                                final String string3 = obtainAttributes.getString(4);
                                final String string4 = obtainAttributes.getString(5);
                                final int resourceId = obtainAttributes.getResourceId(1, 0);
                                final int integer = obtainAttributes.getInteger(2, 1);
                                final int integer2 = obtainAttributes.getInteger(3, 500);
                                final String string5 = obtainAttributes.getString(6);
                                obtainAttributes.recycle();
                                if (string2 != null && string3 != null && string4 != null) {
                                    while (((XmlPullParser)xml).next() != 3) {
                                        tf.d((XmlPullParser)xml);
                                    }
                                    o = new ahn(new ajw(string2, string3, string4, tf.c(resources, resourceId)), integer, integer2, string5);
                                }
                                else {
                                    final ArrayList list = new ArrayList();
                                    while (((XmlPullParser)xml).next() != 3) {
                                        if (((XmlPullParser)xml).getEventType() == 2) {
                                            if (((XmlPullParser)xml).getName().equals("font")) {
                                                final TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)xml), aen.c);
                                                int n3 = 8;
                                                if (!obtainAttributes2.hasValue(8)) {
                                                    n3 = 1;
                                                }
                                                final int int1 = obtainAttributes2.getInt(n3, 400);
                                                int n4;
                                                if (!obtainAttributes2.hasValue(6)) {
                                                    n4 = 2;
                                                }
                                                else {
                                                    n4 = 6;
                                                }
                                                final boolean b4 = obtainAttributes2.getInt(n4, 0) == 1;
                                                int n5 = 9;
                                                if (!obtainAttributes2.hasValue(9)) {
                                                    n5 = 3;
                                                }
                                                int n6 = 7;
                                                if (!obtainAttributes2.hasValue(7)) {
                                                    n6 = 4;
                                                }
                                                final String string6 = obtainAttributes2.getString(n6);
                                                final int int2 = obtainAttributes2.getInt(n5, 0);
                                                int n7;
                                                if (!obtainAttributes2.hasValue(5)) {
                                                    n7 = 0;
                                                }
                                                else {
                                                    n7 = 5;
                                                }
                                                final int resourceId2 = obtainAttributes2.getResourceId(n7, 0);
                                                final String string7 = obtainAttributes2.getString(n7);
                                                obtainAttributes2.recycle();
                                                while (((XmlPullParser)xml).next() != 3) {
                                                    tf.d((XmlPullParser)xml);
                                                }
                                                list.add(new ahm(string7, int1, b4, string6, int2, resourceId2));
                                            }
                                            else {
                                                tf.d((XmlPullParser)xml);
                                            }
                                        }
                                    }
                                    if (list.isEmpty()) {
                                        break Label_0681;
                                    }
                                    o = new ahl((ahm[])list.toArray(new ahm[0]));
                                }
                                break Label_0684;
                            }
                            tf.d((XmlPullParser)xml);
                        }
                        o = null;
                    }
                    if (o == null) {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        if (ahs != null) {
                            ahs.c(-3);
                        }
                        return null;
                    }
                    return aig.d(context, (ahk)o, resources, n, string, typedValue.assetCookie, n2, ahs, b);
                }
            }
        }
        catch (final IOException ex) {
            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(String.valueOf(string)), (Throwable)ex);
        }
        catch (final XmlPullParserException ex2) {
            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(String.valueOf(string)), (Throwable)ex2);
        }
        if (ahs != null) {
            ahs.c(-3);
        }
        return null;
    }
}
