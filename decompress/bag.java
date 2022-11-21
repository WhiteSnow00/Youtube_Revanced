import java.util.regex.Matcher;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bag
{
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    private static final Map d;
    
    static {
        a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
        final HashMap d2 = new HashMap();
        (d = d2).put("aliceblue", -984833);
        d2.put("antiquewhite", -332841);
        final Integer value = -16711681;
        d2.put("aqua", value);
        d2.put("aquamarine", -8388652);
        d2.put("azure", -983041);
        d2.put("beige", -657956);
        d2.put("bisque", -6972);
        d2.put("black", -16777216);
        d2.put("blanchedalmond", -5171);
        d2.put("blue", -16776961);
        d2.put("blueviolet", -7722014);
        d2.put("brown", -5952982);
        d2.put("burlywood", -2180985);
        d2.put("cadetblue", -10510688);
        d2.put("chartreuse", -8388864);
        d2.put("chocolate", -2987746);
        d2.put("coral", -32944);
        d2.put("cornflowerblue", -10185235);
        d2.put("cornsilk", -1828);
        d2.put("crimson", -2354116);
        d2.put("cyan", value);
        d2.put("darkblue", -16777077);
        d2.put("darkcyan", -16741493);
        d2.put("darkgoldenrod", -4684277);
        final Integer value2 = -5658199;
        d2.put("darkgray", value2);
        d2.put("darkgreen", -16751616);
        d2.put("darkgrey", value2);
        d2.put("darkkhaki", -4343957);
        d2.put("darkmagenta", -7667573);
        d2.put("darkolivegreen", -11179217);
        d2.put("darkorange", -29696);
        d2.put("darkorchid", -6737204);
        d2.put("darkred", -7667712);
        d2.put("darksalmon", -1468806);
        d2.put("darkseagreen", -7357297);
        d2.put("darkslateblue", -12042869);
        final Integer value3 = -13676721;
        d2.put("darkslategray", value3);
        d2.put("darkslategrey", value3);
        d2.put("darkturquoise", -16724271);
        d2.put("darkviolet", -7077677);
        d2.put("deeppink", -60269);
        d2.put("deepskyblue", -16728065);
        final Integer value4 = -9868951;
        d2.put("dimgray", value4);
        d2.put("dimgrey", value4);
        d2.put("dodgerblue", -14774017);
        d2.put("firebrick", -5103070);
        d2.put("floralwhite", -1296);
        d2.put("forestgreen", -14513374);
        final Integer value5 = -65281;
        d2.put("fuchsia", value5);
        d2.put("gainsboro", -2302756);
        d2.put("ghostwhite", -460545);
        d2.put("gold", -10496);
        d2.put("goldenrod", -2448096);
        final Integer value6 = -8355712;
        d2.put("gray", value6);
        d2.put("green", -16744448);
        d2.put("greenyellow", -5374161);
        d2.put("grey", value6);
        d2.put("honeydew", -983056);
        d2.put("hotpink", -38476);
        d2.put("indianred", -3318692);
        d2.put("indigo", -11861886);
        d2.put("ivory", -16);
        d2.put("khaki", -989556);
        d2.put("lavender", -1644806);
        d2.put("lavenderblush", -3851);
        d2.put("lawngreen", -8586240);
        d2.put("lemonchiffon", -1331);
        d2.put("lightblue", -5383962);
        d2.put("lightcoral", -1015680);
        d2.put("lightcyan", -2031617);
        d2.put("lightgoldenrodyellow", -329006);
        final Integer value7 = -2894893;
        d2.put("lightgray", value7);
        d2.put("lightgreen", -7278960);
        d2.put("lightgrey", value7);
        d2.put("lightpink", -18751);
        d2.put("lightsalmon", -24454);
        d2.put("lightseagreen", -14634326);
        d2.put("lightskyblue", -7876870);
        final Integer value8 = -8943463;
        d2.put("lightslategray", value8);
        d2.put("lightslategrey", value8);
        d2.put("lightsteelblue", -5192482);
        d2.put("lightyellow", -32);
        d2.put("lime", -16711936);
        d2.put("limegreen", -13447886);
        d2.put("linen", -331546);
        d2.put("magenta", value5);
        d2.put("maroon", -8388608);
        d2.put("mediumaquamarine", -10039894);
        d2.put("mediumblue", -16777011);
        d2.put("mediumorchid", -4565549);
        d2.put("mediumpurple", -7114533);
        d2.put("mediumseagreen", -12799119);
        d2.put("mediumslateblue", -8689426);
        d2.put("mediumspringgreen", -16713062);
        d2.put("mediumturquoise", -12004916);
        d2.put("mediumvioletred", -3730043);
        d2.put("midnightblue", -15132304);
        d2.put("mintcream", -655366);
        d2.put("mistyrose", -6943);
        d2.put("moccasin", -6987);
        d2.put("navajowhite", -8531);
        d2.put("navy", -16777088);
        d2.put("oldlace", -133658);
        d2.put("olive", -8355840);
        d2.put("olivedrab", -9728477);
        d2.put("orange", -23296);
        d2.put("orangered", -47872);
        d2.put("orchid", -2461482);
        d2.put("palegoldenrod", -1120086);
        d2.put("palegreen", -6751336);
        d2.put("paleturquoise", -5247250);
        d2.put("palevioletred", -2396013);
        d2.put("papayawhip", -4139);
        d2.put("peachpuff", -9543);
        d2.put("peru", -3308225);
        d2.put("pink", -16181);
        d2.put("plum", -2252579);
        d2.put("powderblue", -5185306);
        d2.put("purple", -8388480);
        d2.put("rebeccapurple", -10079335);
        d2.put("red", -65536);
        d2.put("rosybrown", -4419697);
        d2.put("royalblue", -12490271);
        d2.put("saddlebrown", -7650029);
        d2.put("salmon", -360334);
        d2.put("sandybrown", -744352);
        d2.put("seagreen", -13726889);
        d2.put("seashell", -2578);
        d2.put("sienna", -6270419);
        d2.put("silver", -4144960);
        d2.put("skyblue", -7876885);
        d2.put("slateblue", -9807155);
        final Integer value9 = -9404272;
        d2.put("slategray", value9);
        d2.put("slategrey", value9);
        d2.put("snow", -1286);
        d2.put("springgreen", -16711809);
        d2.put("steelblue", -12156236);
        d2.put("tan", -2968436);
        d2.put("teal", -16744320);
        d2.put("thistle", -2572328);
        d2.put("tomato", -40121);
        d2.put("transparent", 0);
        d2.put("turquoise", -12525360);
        d2.put("violet", -1146130);
        d2.put("wheat", -663885);
        d2.put("white", -1);
        d2.put("whitesmoke", -657931);
        d2.put("yellow", -256);
        d2.put("yellowgreen", -6632142);
    }
    
    public static int a(final String s) {
        return c(s, true);
    }
    
    public static int b(final String s) {
        return c(s, false);
    }
    
    private static int c(String s, final boolean b) {
        bad.d(TextUtils.isEmpty((CharSequence)s) ^ true);
        final String replace = s.replace(" ", "");
        if (replace.charAt(0) == '#') {
            final int n = (int)Long.parseLong(replace.substring(1), 16);
            int n2;
            if (replace.length() == 7) {
                n2 = (0xFF000000 | n);
            }
            else {
                if (replace.length() != 9) {
                    throw new IllegalArgumentException();
                }
                n2 = ((n & 0xFF) << 24 | n >>> 8);
            }
            return n2;
        }
        if (replace.startsWith("rgba")) {
            Pattern pattern;
            if (b) {
                pattern = bag.c;
            }
            else {
                pattern = bag.b;
            }
            final Matcher matcher = pattern.matcher(replace);
            if (matcher.matches()) {
                int int1;
                if (b) {
                    final String group = matcher.group(4);
                    bad.b(group);
                    int1 = (int)(Float.parseFloat(group) * 255.0f);
                }
                else {
                    final String group2 = matcher.group(4);
                    bad.b(group2);
                    int1 = Integer.parseInt(group2, 10);
                }
                final String group3 = matcher.group(1);
                bad.b(group3);
                final int int2 = Integer.parseInt(group3, 10);
                final String group4 = matcher.group(2);
                bad.b(group4);
                final int int3 = Integer.parseInt(group4, 10);
                s = matcher.group(3);
                bad.b(s);
                return Color.argb(int1, int2, int3, Integer.parseInt(s, 10));
            }
        }
        else if (replace.startsWith("rgb")) {
            final Matcher matcher2 = bag.a.matcher(replace);
            if (matcher2.matches()) {
                final String group5 = matcher2.group(1);
                bad.b(group5);
                final int int4 = Integer.parseInt(group5, 10);
                final String group6 = matcher2.group(2);
                bad.b(group6);
                final int int5 = Integer.parseInt(group6, 10);
                s = matcher2.group(3);
                bad.b(s);
                return Color.rgb(int4, int5, Integer.parseInt(s, 10));
            }
        }
        else {
            final Integer n3 = bag.d.get(aewr.b(replace));
            if (n3 != null) {
                return n3;
            }
        }
        throw new IllegalArgumentException();
    }
}
