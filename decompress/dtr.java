import java.lang.reflect.Field;
import java.util.Iterator;
import android.graphics.Rect;
import org.json.JSONObject;
import android.widget.TextView;
import com.facebook.litho.TextContent;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtr
{
    private static final HashSet a;
    
    static {
        a = new HashSet((Collection<? extends E>)Arrays.asList("delegate", "feedPrefetcher", "parentFeedContextChain", "child", "children", "childComponent", "trackingCode", "eventsController", "itemAnimator", "onScrollListeners", "recyclerConfiguration", "threadTileViewData", "textColorStateList", "typeface", "text", "params"));
    }
    
    private static String a(final Object o, final int n) {
        if (o == null) {
            return "";
        }
        String s2;
        final String s = s2 = o.toString().replace(" \n", " ").replace("\n", " ").replace("\"", "");
        if (s.length() > n) {
            s2 = String.valueOf(s.substring(0, n)).concat("...");
        }
        return s2;
    }
    
    public static void addViewDescription(final dtp dtp, final StringBuilder sb, final int n, final int n2, final boolean b, final boolean b2) {
        addViewDescription(dtp, sb, n, n2, b, b2, null);
    }
    
    public static void addViewDescription(dtp dtp, final StringBuilder sb, int n, int ordinal, final boolean b, final boolean b2, final dtq dtq) {
        sb.append("litho.");
        sb.append(dtp.b().q());
        sb.append('{');
        sb.append(Integer.toHexString(dtp.hashCode()));
        sb.append(' ');
        final dvu f = dtp.f();
        final bhv n2 = dtp.n();
        final String s = "V";
        final String s2 = ".";
        String s3;
        if (f != null && f.getVisibility() == 0) {
            s3 = "V";
        }
        else {
            s3 = ".";
        }
        sb.append(s3);
        String s4 = null;
        Label_0138: {
            if (n2 != null) {
                final dtz bh = ((dva)n2.a).bh();
                if (bh != null && bh.q == 1) {
                    s4 = "F";
                    break Label_0138;
                }
            }
            s4 = ".";
        }
        sb.append(s4);
        String s5;
        if (f != null && f.isEnabled()) {
            s5 = "E";
        }
        else {
            s5 = ".";
        }
        sb.append(s5);
        sb.append(".");
        String s6;
        if (f != null && f.isHorizontalScrollBarEnabled()) {
            s6 = "H";
        }
        else {
            s6 = ".";
        }
        sb.append(s6);
        String s7;
        if (f != null && f.isVerticalScrollBarEnabled()) {
            s7 = s;
        }
        else {
            s7 = ".";
        }
        sb.append(s7);
        String s8 = s2;
        if (n2 != null) {
            s8 = s2;
            if (n2.m() != null) {
                s8 = "C";
            }
        }
        sb.append(s8);
        sb.append(". .. ");
        final Rect a = dtp.a();
        sb.append(a.left - n);
        sb.append(",");
        sb.append(a.top - ordinal);
        sb.append("-");
        sb.append(a.right - n);
        sb.append(",");
        sb.append(a.bottom - ordinal);
        final boolean m = dtp.m();
        Object declaredFields = null;
        String au;
        if (m) {
            au = dtp.b.au();
        }
        else {
            au = null;
        }
        if (au != null && !TextUtils.isEmpty((CharSequence)au)) {
            sb.append(" litho:id/");
            sb.append(au.replace(' ', '_'));
        }
        final dvu f2 = dtp.f();
        ordinal = 0;
        Object o;
        if (f2 == null) {
            o = declaredFields;
        }
        else {
            final dst b3 = dtp.b();
            final dvz k = f2.k;
            final int n3 = ((efz)k).a();
            n = 0;
            while (true) {
                o = declaredFields;
                if (n >= n3) {
                    break;
                }
                final ega g = k.g(n);
                dst c;
                if (g == null) {
                    c = null;
                }
                else {
                    c = dvd.b(g).c;
                }
                if (c != null && c.j == b3.j) {
                    final Object a2 = g.a;
                    final StringBuilder sb2 = new StringBuilder();
                    if (a2 instanceof TextContent) {
                        final Iterator iterator = ((TextContent)a2).getTextItems().iterator();
                        while (iterator.hasNext()) {
                            sb2.append((CharSequence)iterator.next());
                        }
                    }
                    else if (a2 instanceof TextView) {
                        sb2.append(((TextView)a2).getText());
                    }
                    if (sb2.length() != 0) {
                        o = sb2.toString();
                        break;
                    }
                }
                ++n;
            }
        }
        if (o != null && !TextUtils.isEmpty((CharSequence)o)) {
            sb.append(" text=\"");
            sb.append(a(o, 200));
            sb.append("\"");
        }
    Label_0718_Outer:
        while (true) {
            if (!b2) {
                break Label_0939;
            }
            o = dtp.b();
            dtp = (dtp)new JSONObject();
            declaredFields = ((CharSequence)o).getClass().getDeclaredFields();
            final int n3 = ((CharSequence)declaredFields).length;
            n = ordinal;
        Label_0902_Outer:
            while (true) {
                Label_0908: {
                    if (n >= n3) {
                        break Label_0908;
                    }
                    final Field field = declaredFields[n];
                Block_44_Outer:
                    while (true) {
                        try {
                            if (dtr.a.contains(field.getName())) {
                                break Label_0902;
                            }
                            final dyj dyj = field.getAnnotation(dyj.class);
                            if (dyj == null) {
                                break Label_0902;
                            }
                            field.setAccessible(true);
                            final dyk a3 = dyk.a;
                            ordinal = dyj.a().ordinal();
                            if (ordinal != 1) {
                                if (ordinal == 11 || ordinal == 6 || ordinal == 7 || ordinal == 8) {
                                    break Label_0902;
                                }
                                final Object value = field.get(o);
                                if (value != null) {
                                    ((JSONObject)dtp).put(field.getName(), value);
                                    break Label_0902;
                                }
                                break Label_0902;
                            }
                            else {
                                final String a4 = a(field.get(o), 50);
                                if (!TextUtils.isEmpty((CharSequence)a4)) {
                                    ((JSONObject)dtp).put(field.getName(), (Object)a4);
                                    break Label_0902;
                                }
                                break Label_0902;
                            }
                        }
                        catch (final Exception ex) {
                            final dtp dtp2 = dtp;
                            final String s9 = "DUMP-ERROR";
                            final Exception ex2 = ex;
                            final String s10 = ex2.getMessage();
                            final int n4 = 50;
                            final String s11 = a(s10, n4);
                            ((JSONObject)dtp2).put(s9, (Object)s11);
                        }
                        try {
                            final dtp dtp2 = dtp;
                            final String s9 = "DUMP-ERROR";
                            final Exception ex;
                            final Exception ex2 = ex;
                            final String s10 = ex2.getMessage();
                            final int n4 = 50;
                            final String s11 = a(s10, n4);
                            ((JSONObject)dtp2).put(s9, (Object)s11);
                            ++n;
                            continue Label_0902_Outer;
                            iftrue(Label_0951:)(dtq == null);
                        Label_0951_Outer:
                            while (true) {
                                while (true) {
                                    Block_45: {
                                        break Block_45;
                                        while (true) {
                                            while (true) {
                                                sb.append('}');
                                                return;
                                                sb.append(" props=\"");
                                                sb.append(((JSONObject)dtp).toString());
                                                sb.append("\"");
                                                continue Label_0718_Outer;
                                                sb.append(" [clickable]");
                                                continue Block_44_Outer;
                                            }
                                            iftrue(Label_0977:)(b || n2 == null || n2.m() == null);
                                            continue Label_0951_Outer;
                                        }
                                    }
                                    dtq.a();
                                    continue;
                                }
                                iftrue(Label_0939:)(((JSONObject)dtp).length() <= 0);
                                continue Label_0951_Outer;
                            }
                        }
                        catch (final Exception ex3) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
            break;
        }
    }
}
