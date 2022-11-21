import java.lang.reflect.Constructor;
import android.content.Intent;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.view.InflateException;
import android.util.Xml;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class cff
{
    public static final int a = 0;
    private static final Class[] b;
    private static final HashMap c;
    
    static {
        b = new Class[] { Context.class, AttributeSet.class };
        c = new HashMap();
    }
    
    public static final Preference a(final XmlPullParser xmlPullParser, final PreferenceGroup preferenceGroup, final Context context, final Object[] array, final cfj cfj, final String[] array2) {
        monitorenter(array);
        try {
            final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
            array[0] = context;
            try {
                while (true) {
                    final int next = xmlPullParser.next();
                    if (next == 2) {
                        final PreferenceGroup preferenceGroup2 = (PreferenceGroup)d(xmlPullParser.getName(), attributeSet, context, array, array2);
                        PreferenceGroup preferenceGroup3;
                        if ((preferenceGroup3 = preferenceGroup) == null) {
                            ((Preference)preferenceGroup2).A(cfj);
                            preferenceGroup3 = preferenceGroup2;
                        }
                        b(xmlPullParser, (Preference)preferenceGroup3, attributeSet, context, array, cfj, array2);
                        monitorexit(array);
                        return (Preference)preferenceGroup3;
                    }
                    if (next != 1) {
                        continue;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append(xmlPullParser.getPositionDescription());
                    sb.append(": No start tag found!");
                    throw new InflateException(sb.toString());
                }
            }
            catch (final IOException ex) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(xmlPullParser.getPositionDescription());
                sb2.append(": ");
                sb2.append(ex.getMessage());
                final InflateException ex2 = new InflateException(sb2.toString());
                ex2.initCause((Throwable)ex);
                throw ex2;
            }
            catch (final XmlPullParserException ex3) {
                final InflateException ex4 = new InflateException(ex3.getMessage());
                ex4.initCause((Throwable)ex3);
                throw ex4;
            }
            catch (final InflateException ex5) {
                throw ex5;
            }
        }
        finally {
            monitorexit(array);
            while (true) {}
        }
    }
    
    private static final void b(final XmlPullParser xmlPullParser, final Preference preference, final AttributeSet set, final Context context, final Object[] array, final cfj cfj, final String[] array2) {
        final int depth = xmlPullParser.getDepth();
        while (true) {
            int next;
            if ((next = xmlPullParser.next()) == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    break;
                }
                next = 3;
            }
            if (next == 1) {
                break;
            }
            if (next != 2) {
                continue;
            }
            final String name = xmlPullParser.getName();
            if ("intent".equals(name)) {
                try {
                    preference.t = Intent.parseIntent(context.getResources(), xmlPullParser, set);
                    continue;
                }
                catch (final IOException ex) {
                    final XmlPullParserException ex2 = new XmlPullParserException("Error parsing preference");
                    ex2.initCause((Throwable)ex);
                    throw ex2;
                }
            }
            if ("extra".equals(name)) {
                context.getResources().parseBundleExtra("extra", set, preference.q());
                try {
                    final int depth2 = xmlPullParser.getDepth();
                    int next2;
                    do {
                        next2 = xmlPullParser.next();
                        if (next2 != 1) {
                            continue;
                        }
                        break;
                    } while (next2 != 3 || xmlPullParser.getDepth() > depth2);
                    continue;
                }
                catch (final IOException ex3) {
                    final XmlPullParserException ex4 = new XmlPullParserException("Error parsing preference");
                    ex4.initCause((Throwable)ex3);
                    throw ex4;
                }
            }
            final Preference d = d(name, set, context, array, array2);
            ((PreferenceGroup)preference).af(d);
            b(xmlPullParser, d, set, context, array, cfj, array2);
        }
    }
    
    private static final Preference c(final String s, final String[] array, final AttributeSet set, final Context context, final Object[] array2) {
        Label_0205: {
            Constructor<?> constructor;
            if ((constructor = cff.c.get(s)) != null) {
                break Label_0205;
            }
            Label_0223: {
                try {
                    final ClassLoader classLoader = context.getClassLoader();
                    Class<?> forName2;
                    if (array != null) {
                        final Class clazz = null;
                        final ClassNotFoundException ex = null;
                        int n = 0;
                        Class<?> forName;
                        while (true) {
                            forName = clazz;
                            if (n < 2) {
                                final String s2 = array[n];
                                try {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(s2);
                                    sb.append(s);
                                    forName = Class.forName(sb.toString(), false, classLoader);
                                }
                                catch (final ClassNotFoundException ex) {
                                    ++n;
                                    continue;
                                }
                                break;
                            }
                            break;
                        }
                        if ((forName2 = forName) == null) {
                            if (ex == null) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append(set.getPositionDescription());
                                sb2.append(": Error inflating class ");
                                sb2.append(s);
                                throw new InflateException(sb2.toString());
                            }
                            throw ex;
                        }
                    }
                    else {
                        forName2 = Class.forName(s, false, classLoader);
                    }
                    constructor = forName2.getConstructor((Class<?>[])cff.b);
                    constructor.setAccessible(true);
                    cff.c.put(s, constructor);
                    break Label_0205;
                }
                catch (final Exception ex2) {
                    break Label_0223;
                }
                catch (final ClassNotFoundException ex3) {
                    throw ex3;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(set.getPositionDescription());
                    sb3.append(": Error inflating class ");
                    sb3.append(s);
                    final InflateException ex4 = new InflateException(sb3.toString());
                    final Exception ex2;
                    ex4.initCause((Throwable)ex2);
                    throw ex4;
                    array2[1] = set;
                    return (Preference)constructor.newInstance(array2);
                }
            }
        }
    }
    
    private static final Preference d(String o, final AttributeSet set, final Context context, final Object[] array, final String[] array2) {
        try {
            if (((String)o).indexOf(46) == -1) {
                o = c((String)o, array2, set, context, array);
            }
            else {
                o = c((String)o, null, set, context, array);
            }
            return (Preference)o;
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append(set.getPositionDescription());
            sb.append(": Error inflating class ");
            sb.append((String)o);
            final InflateException ex2 = new InflateException(sb.toString());
            ex2.initCause((Throwable)ex);
            throw ex2;
        }
        catch (final ClassNotFoundException ex3) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(set.getPositionDescription());
            sb2.append(": Error inflating class (not found)");
            sb2.append((String)o);
            final InflateException ex4 = new InflateException(sb2.toString());
            ex4.initCause((Throwable)ex3);
            throw ex4;
        }
        catch (final InflateException ex5) {
            throw ex5;
        }
    }
}
