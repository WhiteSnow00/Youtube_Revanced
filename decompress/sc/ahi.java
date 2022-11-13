import android.util.Log;
import android.content.res.TypedArray;
import java.lang.reflect.Array;
import android.graphics.Color;
import android.util.StateSet;
import android.os.Build$VERSION;
import android.util.TypedValue;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Xml;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahi
{
    private static final ThreadLocal a;
    
    static {
        a = new ThreadLocal();
    }
    
    public static ColorStateList a(final Resources resources, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme) {
        final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            final int next = xmlPullParser.next();
            if (next == 2) {
                return b(resources, xmlPullParser, attributeSet, resources$Theme);
            }
            if (next != 1) {
                continue;
            }
            throw new XmlPullParserException("No start tag found");
        }
    }
    
    public static ColorStateList b(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            final int n = xmlPullParser.getDepth() + 1;
            int[][] array = new int[20][];
            int[] array2 = new int[20];
            int n2 = 0;
            while (true) {
                final int next = xmlPullParser.next();
                if (next == 1) {
                    break;
                }
                final int depth = xmlPullParser.getDepth();
                if (depth < n && next == 3) {
                    break;
                }
                if (next != 2 || depth > n || !xmlPullParser.getName().equals("item")) {
                    continue;
                }
                final int[] a = aen.a;
                TypedArray typedArray;
                if (resources$Theme == null) {
                    typedArray = resources.obtainAttributes(set, a);
                }
                else {
                    typedArray = resources$Theme.obtainStyledAttributes(set, a, 0, 0);
                }
                final int resourceId = typedArray.getResourceId(0, -1);
                int n3 = 0;
                Label_0268: {
                    if (resourceId != -1) {
                        final ThreadLocal a2 = ahi.a;
                        TypedValue typedValue = a2.get();
                        if (typedValue == null) {
                            typedValue = new TypedValue();
                            a2.set(typedValue);
                        }
                        resources.getValue(resourceId, typedValue, true);
                        if (typedValue.type < 28 || typedValue.type > 31) {
                            try {
                                n3 = a(resources, (XmlPullParser)resources.getXml(resourceId), resources$Theme).getDefaultColor();
                            }
                            catch (final Exception ex) {
                                n3 = typedArray.getColor(0, -65281);
                            }
                            break Label_0268;
                        }
                    }
                    n3 = typedArray.getColor(0, -65281);
                }
                float n4;
                if (typedArray.hasValue(1)) {
                    n4 = typedArray.getFloat(1, 1.0f);
                }
                else if (typedArray.hasValue(3)) {
                    n4 = typedArray.getFloat(3, 1.0f);
                }
                else {
                    n4 = 1.0f;
                }
                float n5;
                if (Build$VERSION.SDK_INT >= 31 && typedArray.hasValue(2)) {
                    n5 = typedArray.getFloat(2, -1.0f);
                }
                else {
                    n5 = typedArray.getFloat(4, -1.0f);
                }
                typedArray.recycle();
                final int attributeCount = set.getAttributeCount();
                final int[] array3 = new int[attributeCount];
                int n6 = 0;
                int n7;
                for (int i = 0; i < attributeCount; ++i, n6 = n7) {
                    final int attributeNameResource = set.getAttributeNameResource(i);
                    n7 = n6;
                    if (attributeNameResource != 16843173) {
                        n7 = n6;
                        if (attributeNameResource != 16843551) {
                            n7 = n6;
                            if (attributeNameResource != 2130968657) {
                                n7 = n6;
                                if (attributeNameResource != 2130969635) {
                                    int n8 = attributeNameResource;
                                    if (!set.getAttributeBooleanValue(i, false)) {
                                        n8 = -attributeNameResource;
                                    }
                                    array3[n6] = n8;
                                    n7 = n6 + 1;
                                }
                            }
                        }
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(array3, n6);
                boolean b = n5 >= 0.0f && n5 <= 100.0f;
                Label_1179: {
                    if (n4 == 1.0f) {
                        if (!b) {
                            break Label_1179;
                        }
                        b = true;
                    }
                    final int t = aei.t((int)(Color.alpha(n3) * n4 + 0.5f), 0, 255);
                    Label_1165: {
                        if (b) {
                            final ahg b2 = ahg.b(n3);
                            final float a3 = b2.a;
                            float b3 = b2.b;
                            final double n9 = b3;
                            final ahw a4 = ahw.a;
                            if (n9 >= 1.0 && (Math.round(n5) > 0.0 && Math.round(n5) < 100.0)) {
                                float min;
                                if (a3 < 0.0f) {
                                    min = 0.0f;
                                }
                                else {
                                    min = Math.min(360.0f, a3);
                                }
                                float n10 = b3;
                                ahg ahg = null;
                                int n11 = 1;
                                float n12 = 0.0f;
                                while (Math.abs(n12 - b3) >= 0.4f) {
                                    float n13 = 1000.0f;
                                    float n14 = 1000.0f;
                                    float n15 = 0.0f;
                                    float n16 = 100.0f;
                                    ahg ahg2 = null;
                                    while (Math.abs(n15 - n16) > 0.01f) {
                                        final float n17 = n15 + (n16 - n15) / 2.0f;
                                        final int a5 = ahg.c(n17, n10, min).a(ahw.a);
                                        final float a6 = ahh.a(Color.red(a5));
                                        final float a7 = ahh.a(Color.green(a5));
                                        final float a8 = ahh.a(Color.blue(a5));
                                        final float[] array4 = ahh.d[1];
                                        final float n18 = (a6 * array4[0] + a7 * array4[1] + a8 * array4[2]) / 100.0f;
                                        float n19;
                                        if (n18 <= 0.008856452f) {
                                            n19 = n18 * 903.2963f;
                                        }
                                        else {
                                            n19 = (float)Math.cbrt(n18) * 116.0f - 16.0f;
                                        }
                                        final float abs = Math.abs(n5 - n19);
                                        ahg ahg3;
                                        if (abs < 0.2f) {
                                            final ahg b4 = ahg.b(a5);
                                            final ahg c = ahg.c(b4.c, b4.b, min);
                                            final float n20 = b4.d - c.d;
                                            final float n21 = b4.e - c.e;
                                            final float n22 = b4.f - c.f;
                                            final float n23 = (float)(Math.pow(Math.sqrt(n20 * n20 + n21 * n21 + n22 * n22), 0.63) * 1.41);
                                            ahg3 = ahg2;
                                            if (n23 <= 1.0f) {
                                                n14 = n23;
                                                ahg3 = b4;
                                                n13 = abs;
                                            }
                                        }
                                        else {
                                            ahg3 = ahg2;
                                        }
                                        if (n13 == 0.0f) {
                                            ahg2 = ahg3;
                                            if (n14 == 0.0f) {
                                                break;
                                            }
                                        }
                                        if (n19 >= n5) {
                                            n16 = n17;
                                        }
                                        if (n19 < n5) {
                                            n15 = n17;
                                        }
                                        ahg2 = ahg3;
                                    }
                                    if (n11 != 0) {
                                        if (ahg2 != null) {
                                            n3 = ahg2.a(a4);
                                            break Label_1165;
                                        }
                                        n10 = n12 + (b3 - n12) / 2.0f;
                                        n11 = 0;
                                    }
                                    else {
                                        if (ahg2 != null) {
                                            ahg = ahg2;
                                        }
                                        if (ahg2 != null) {
                                            n12 = n10;
                                        }
                                        if (ahg2 == null) {
                                            b3 = n10;
                                        }
                                        n10 = n12 + (b3 - n12) / 2.0f;
                                    }
                                }
                                if (ahg == null) {
                                    n3 = ahh.b(n5);
                                }
                                else {
                                    n3 = ahg.a(a4);
                                }
                            }
                            else {
                                trimStateSet = trimStateSet;
                                n3 = ahh.b(n5);
                            }
                        }
                    }
                    n3 = ((0xFFFFFF & n3) | t << 24);
                }
                final int n24 = n2 + 1;
                if (n24 > array2.length) {
                    final int[] array5 = new int[vg.b(n2)];
                    System.arraycopy(array2, 0, array5, 0, n2);
                    array2 = array5;
                }
                array2[n2] = n3;
                Object o = array;
                if (n24 > array.length) {
                    o = Array.newInstance(array.getClass().getComponentType(), vg.b(n2));
                    System.arraycopy(array, 0, o, 0, n2);
                }
                o[n2] = trimStateSet;
                array = (int[][])o;
                n2 = n24;
            }
            final int[] array6 = new int[n2];
            final int[][] array7 = new int[n2][];
            System.arraycopy(array2, 0, array6, 0, n2);
            System.arraycopy(array, 0, array7, 0, n2);
            return new ColorStateList(array7, array6);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
    
    public static ColorStateList c(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        try {
            return a(resources, (XmlPullParser)resources.getXml(n), resources$Theme);
        }
        catch (final Exception ex) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", (Throwable)ex);
            return null;
        }
    }
}
