import org.xmlpull.v1.XmlPullParser;
import android.text.Layout$Alignment;
import java.util.regex.Matcher;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class byq extends bxh
{
    static final Pattern a;
    static final Pattern b;
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;
    private static final Pattern g;
    private static final byo h;
    private static final atwt j;
    private final XmlPullParserFactory i;
    
    static {
        c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
        d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
        e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
        a = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
        b = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
        f = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
        g = Pattern.compile("^(\\d+) (\\d+)$");
        h = new byo(30.0f, 1, 1);
        j = new atwt(15, (char[])null);
    }
    
    public byq() {
        super("TtmlDecoder");
        try {
            (this.i = XmlPullParserFactory.newInstance()).setNamespaceAware(true);
        }
        catch (final XmlPullParserException ex) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", (Throwable)ex);
        }
    }
    
    private static long o(String s, final byo byo) {
        final Matcher matcher = byq.c.matcher(s);
        final boolean matches = matcher.matches();
        int n = 2;
        if (matches) {
            s = matcher.group(1);
            dk.d((Object)s);
            final long long1 = Long.parseLong(s);
            s = matcher.group(2);
            dk.d((Object)s);
            final long long2 = Long.parseLong(s);
            s = matcher.group(3);
            dk.d((Object)s);
            final double n2 = (double)Long.parseLong(s);
            s = matcher.group(4);
            double n3 = 0.0;
            double double1;
            if (s != null) {
                double1 = Double.parseDouble(s);
            }
            else {
                double1 = 0.0;
            }
            final double n4 = (double)(long2 * 60L);
            final double n5 = (double)(long1 * 3600L);
            Double.isNaN(n5);
            Double.isNaN(n4);
            Double.isNaN(n2);
            s = matcher.group(5);
            double n6;
            if (s != null) {
                n6 = Long.parseLong(s) / byo.a;
            }
            else {
                n6 = 0.0;
            }
            s = matcher.group(6);
            if (s != null) {
                final double n7 = (double)Long.parseLong(s);
                final double n8 = byo.b;
                final double n9 = byo.a;
                Double.isNaN(n7);
                Double.isNaN(n8);
                final double n10 = n7 / n8;
                Double.isNaN(n9);
                n3 = n10 / n9;
            }
            return (long)((n5 + n4 + n2 + double1 + n6 + n3) * 1000000.0);
        }
        final Matcher matcher2 = byq.d.matcher(s);
        if (matcher2.matches()) {
            s = matcher2.group(1);
            dk.d((Object)s);
            final double double2 = Double.parseDouble(s);
            s = matcher2.group(2);
            dk.d((Object)s);
            final int hashCode = s.hashCode();
            Label_0445: {
                if (hashCode != 102) {
                    if (hashCode != 104) {
                        if (hashCode != 109) {
                            if (hashCode != 3494) {
                                if (hashCode != 115) {
                                    if (hashCode == 116) {
                                        if (s.equals("t")) {
                                            n = 5;
                                            break Label_0445;
                                        }
                                    }
                                }
                                else if (s.equals("s")) {
                                    break Label_0445;
                                }
                            }
                            else if (s.equals("ms")) {
                                n = 3;
                                break Label_0445;
                            }
                        }
                        else if (s.equals("m")) {
                            n = 1;
                            break Label_0445;
                        }
                    }
                    else if (s.equals("h")) {
                        n = 0;
                        break Label_0445;
                    }
                }
                else if (s.equals("f")) {
                    n = 4;
                    break Label_0445;
                }
                n = -1;
            }
            double n13;
            if (n != 0) {
                if (n != 1) {
                    double n12;
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                final double n11 = double2;
                                return (long)(n11 * 1000000.0);
                            }
                            n12 = byo.c;
                            Double.isNaN(n12);
                        }
                        else {
                            n12 = byo.a;
                            Double.isNaN(n12);
                        }
                    }
                    else {
                        n12 = 1000.0;
                    }
                    final double n11 = double2 / n12;
                    return (long)(n11 * 1000000.0);
                }
                n13 = 60.0;
            }
            else {
                n13 = 3600.0;
            }
            final double n11 = double2 * n13;
            return (long)(n11 * 1000000.0);
        }
        throw new bxk("Malformed time expression: ".concat(String.valueOf(s)));
    }
    
    private static Layout$Alignment p(String b) {
        b = aevy.b(b);
        int n = 0;
        Label_0135: {
            switch (b.hashCode()) {
                case 109757538: {
                    if (b.equals("start")) {
                        n = 1;
                        break Label_0135;
                    }
                    break;
                }
                case 108511772: {
                    if (b.equals("right")) {
                        n = 2;
                        break Label_0135;
                    }
                    break;
                }
                case 3317767: {
                    if (b.equals("left")) {
                        n = 0;
                        break Label_0135;
                    }
                    break;
                }
                case 100571: {
                    if (b.equals("end")) {
                        n = 3;
                        break Label_0135;
                    }
                    break;
                }
                case -1364013995: {
                    if (b.equals("center")) {
                        n = 4;
                        break Label_0135;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n == 0 || n == 1) {
            return Layout$Alignment.ALIGN_NORMAL;
        }
        if (n == 2 || n == 3) {
            return Layout$Alignment.ALIGN_OPPOSITE;
        }
        if (n != 4) {
            return null;
        }
        return Layout$Alignment.ALIGN_CENTER;
    }
    
    private static byt q(final byt byt) {
        byt byt2 = byt;
        if (byt == null) {
            byt2 = new byt();
        }
        return byt2;
    }
    
    private static byt r(final XmlPullParser xmlPullParser, byt byt) {
        final int attributeCount = xmlPullParser.getAttributeCount();
        int i = 0;
        byt byt2 = byt;
        while (i < attributeCount) {
            final String attributeValue = xmlPullParser.getAttributeValue(i);
            final String attributeName = xmlPullParser.getAttributeName(i);
            final int hashCode = attributeName.hashCode();
            int n = -1;
            int n2 = 0;
            Label_0427: {
                switch (hashCode) {
                    case 1754920356: {
                        if (attributeName.equals("multiRowAlign")) {
                            n2 = 8;
                            break Label_0427;
                        }
                        break;
                    }
                    case 1287124693: {
                        if (attributeName.equals("backgroundColor")) {
                            n2 = 1;
                            break Label_0427;
                        }
                        break;
                    }
                    case 1115953443: {
                        if (attributeName.equals("rubyPosition")) {
                            n2 = 11;
                            break Label_0427;
                        }
                        break;
                    }
                    case 921125321: {
                        if (attributeName.equals("textEmphasis")) {
                            n2 = 13;
                            break Label_0427;
                        }
                        break;
                    }
                    case 365601008: {
                        if (attributeName.equals("fontSize")) {
                            n2 = 4;
                            break Label_0427;
                        }
                        break;
                    }
                    case 110138194: {
                        if (attributeName.equals("textCombine")) {
                            n2 = 9;
                            break Label_0427;
                        }
                        break;
                    }
                    case 109403361: {
                        if (attributeName.equals("shear")) {
                            n2 = 14;
                            break Label_0427;
                        }
                        break;
                    }
                    case 94842723: {
                        if (attributeName.equals("color")) {
                            n2 = 2;
                            break Label_0427;
                        }
                        break;
                    }
                    case 3511770: {
                        if (attributeName.equals("ruby")) {
                            n2 = 10;
                            break Label_0427;
                        }
                        break;
                    }
                    case 3355: {
                        if (attributeName.equals("id")) {
                            n2 = 0;
                            break Label_0427;
                        }
                        break;
                    }
                    case -734428249: {
                        if (attributeName.equals("fontWeight")) {
                            n2 = 5;
                            break Label_0427;
                        }
                        break;
                    }
                    case -879295043: {
                        if (attributeName.equals("textDecoration")) {
                            n2 = 12;
                            break Label_0427;
                        }
                        break;
                    }
                    case -1065511464: {
                        if (attributeName.equals("textAlign")) {
                            n2 = 7;
                            break Label_0427;
                        }
                        break;
                    }
                    case -1224696685: {
                        if (attributeName.equals("fontFamily")) {
                            n2 = 3;
                            break Label_0427;
                        }
                        break;
                    }
                    case -1550943582: {
                        if (attributeName.equals("fontStyle")) {
                            n2 = 6;
                            break Label_0427;
                        }
                        break;
                    }
                }
                n2 = -1;
            }
            switch (n2) {
                default: {
                    byt = byt2;
                    break;
                }
                case 14: {
                    byt = q(byt2);
                    final Matcher matcher = byq.a.matcher(attributeValue);
                    final boolean matches = matcher.matches();
                    float min = Float.MAX_VALUE;
                    if (!matches) {
                        bap.c("TtmlDecoder", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    else {
                        try {
                            final String group = matcher.group(1);
                            dk.d((Object)group);
                            min = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        }
                        catch (final NumberFormatException ex) {
                            bap.d("TtmlDecoder", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), (Throwable)ex);
                        }
                    }
                    byt.s = min;
                    break;
                }
                case 13: {
                    byt = q(byt2);
                    byt.r = byn.a(attributeValue);
                    break;
                }
                case 12: {
                    final String b = aevy.b(attributeValue);
                    switch (b.hashCode()) {
                        case 1679736913: {
                            if (b.equals("linethrough")) {
                                n = 0;
                                break;
                            }
                            break;
                        }
                        case 913457136: {
                            if (b.equals("nolinethrough")) {
                                n = 1;
                                break;
                            }
                            break;
                        }
                        case -1026963764: {
                            if (b.equals("underline")) {
                                n = 2;
                                break;
                            }
                            break;
                        }
                        case -1461280213: {
                            if (b.equals("nounderline")) {
                                n = 3;
                                break;
                            }
                            break;
                        }
                    }
                    if (n == 0) {
                        byt = q(byt2);
                        byt.f = 1;
                        break;
                    }
                    if (n == 1) {
                        byt = q(byt2);
                        byt.f = 0;
                        break;
                    }
                    if (n == 2) {
                        byt = q(byt2);
                        byt.g = 1;
                        break;
                    }
                    if (n != 3) {
                        byt = byt2;
                        break;
                    }
                    byt = q(byt2);
                    byt.g = 0;
                    break;
                }
                case 11: {
                    final String b2 = aevy.b(attributeValue);
                    final int hashCode2 = b2.hashCode();
                    if (hashCode2 != -1392885889) {
                        if (hashCode2 == 92734940) {
                            if (b2.equals("after")) {
                                n = 1;
                            }
                        }
                    }
                    else if (b2.equals("before")) {
                        n = 0;
                    }
                    if (n == 0) {
                        byt = q(byt2);
                        byt.n = 1;
                        break;
                    }
                    if (n != 1) {
                        byt = byt2;
                        break;
                    }
                    byt = q(byt2);
                    byt.n = 2;
                    break;
                }
                case 10: {
                    final String b3 = aevy.b(attributeValue);
                    int n3 = 0;
                    switch (b3.hashCode()) {
                        default: {
                            n3 = n;
                            break;
                        }
                        case 3556653: {
                            n3 = n;
                            if (b3.equals("text")) {
                                n3 = 3;
                                break;
                            }
                            break;
                        }
                        case 3016401: {
                            n3 = n;
                            if (b3.equals("base")) {
                                n3 = 1;
                                break;
                            }
                            break;
                        }
                        case -136074796: {
                            n3 = n;
                            if (b3.equals("textContainer")) {
                                n3 = 4;
                                break;
                            }
                            break;
                        }
                        case -250518009: {
                            n3 = n;
                            if (b3.equals("delimiter")) {
                                n3 = 5;
                                break;
                            }
                            break;
                        }
                        case -410956671: {
                            n3 = n;
                            if (b3.equals("container")) {
                                n3 = 0;
                                break;
                            }
                            break;
                        }
                        case -618561360: {
                            n3 = n;
                            if (b3.equals("baseContainer")) {
                                n3 = 2;
                                break;
                            }
                            break;
                        }
                    }
                    if (n3 == 0) {
                        byt = q(byt2);
                        byt.m = 1;
                        break;
                    }
                    if (n3 == 1 || n3 == 2) {
                        byt = q(byt2);
                        byt.m = 2;
                        break;
                    }
                    if (n3 == 3 || n3 == 4) {
                        byt = q(byt2);
                        byt.m = 3;
                        break;
                    }
                    if (n3 != 5) {
                        byt = byt2;
                        break;
                    }
                    byt = q(byt2);
                    byt.m = 4;
                    break;
                }
                case 9: {
                    final String b4 = aevy.b(attributeValue);
                    final int hashCode3 = b4.hashCode();
                    if (hashCode3 != 96673) {
                        if (hashCode3 == 3387192) {
                            if (b4.equals("none")) {
                                n = 0;
                            }
                        }
                    }
                    else if (b4.equals("all")) {
                        n = 1;
                    }
                    if (n == 0) {
                        byt = q(byt2);
                        byt.q = 0;
                        break;
                    }
                    if (n != 1) {
                        byt = byt2;
                        break;
                    }
                    byt = q(byt2);
                    byt.q = 1;
                    break;
                }
                case 8: {
                    byt = q(byt2);
                    byt.p = p(attributeValue);
                    break;
                }
                case 7: {
                    byt = q(byt2);
                    byt.o = p(attributeValue);
                    break;
                }
                case 6: {
                    byt = q(byt2);
                    byt.i = ("italic".equalsIgnoreCase(attributeValue) ? 1 : 0);
                    break;
                }
                case 5: {
                    byt = q(byt2);
                    byt.h = ("bold".equalsIgnoreCase(attributeValue) ? 1 : 0);
                    break;
                }
                case 4: {
                    byt = byt2;
                    try {
                        final byt byt3 = byt = q(byt2);
                        final String[] ap = bax.ap(attributeValue, "\\s+");
                        byt = byt3;
                        final int length = ap.length;
                        Matcher matcher2;
                        if (length == 1) {
                            byt = byt3;
                            matcher2 = byq.e.matcher(attributeValue);
                        }
                        else {
                            if (length != 2) {
                                byt = byt3;
                                byt = byt3;
                                byt = byt3;
                                final StringBuilder sb = new StringBuilder();
                                byt = byt3;
                                sb.append("Invalid number of entries for fontSize: ");
                                byt = byt3;
                                sb.append(length);
                                byt = byt3;
                                sb.append(".");
                                byt = byt3;
                                final bxk bxk = new bxk(sb.toString());
                                byt = byt3;
                                throw bxk;
                            }
                            byt = byt3;
                            matcher2 = byq.e.matcher(ap[1]);
                            byt = byt3;
                            bap.c("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        byt = byt3;
                        if (matcher2.matches()) {
                            byt = byt3;
                            final String group2 = matcher2.group(3);
                            byt = byt3;
                            dk.d((Object)group2);
                            byt = byt3;
                            final int hashCode4 = group2.hashCode();
                            if (hashCode4 != 37) {
                                if (hashCode4 != 3240) {
                                    if (hashCode4 == 3592) {
                                        if (group2.equals("px")) {
                                            n = 0;
                                        }
                                    }
                                }
                                else if (group2.equals("em")) {
                                    n = 1;
                                }
                            }
                            else if (group2.equals("%")) {
                                n = 2;
                            }
                            if (n != 0) {
                                if (n != 1) {
                                    if (n != 2) {
                                        byt = byt3;
                                        byt = byt3;
                                        byt = byt3;
                                        final StringBuilder sb2 = new StringBuilder();
                                        byt = byt3;
                                        sb2.append("Invalid unit for fontSize: '");
                                        byt = byt3;
                                        sb2.append(group2);
                                        byt = byt3;
                                        sb2.append("'.");
                                        byt = byt3;
                                        final bxk bxk2 = new bxk(sb2.toString());
                                        byt = byt3;
                                        throw bxk2;
                                    }
                                    byt = byt3;
                                    byt3.j = 3;
                                }
                                else {
                                    byt = byt3;
                                    byt3.j = 2;
                                }
                            }
                            else {
                                byt = byt3;
                                byt3.j = 1;
                            }
                            byt = byt3;
                            final String group3 = matcher2.group(1);
                            byt = byt3;
                            dk.d((Object)group3);
                            byt = byt3;
                            byt3.k = Float.parseFloat(group3);
                            byt = byt3;
                            break;
                        }
                        byt = byt3;
                        byt = byt3;
                        byt = byt3;
                        final StringBuilder sb3 = new StringBuilder();
                        byt = byt3;
                        sb3.append("Invalid expression for fontSize: '");
                        byt = byt3;
                        sb3.append(attributeValue);
                        byt = byt3;
                        sb3.append("'.");
                        byt = byt3;
                        final bxk bxk3 = new bxk(sb3.toString());
                        byt = byt3;
                        throw bxk3;
                    }
                    catch (final bxk bxk4) {
                        bap.c("TtmlDecoder", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                }
                case 3: {
                    byt = q(byt2);
                    byt.a = attributeValue;
                    break;
                }
                case 2: {
                    byt = q(byt2);
                    try {
                        byt.c(baf.b(attributeValue));
                    }
                    catch (final IllegalArgumentException ex2) {
                        bap.c("TtmlDecoder", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                }
                case 1: {
                    byt = q(byt2);
                    try {
                        byt.b(baf.b(attributeValue));
                    }
                    catch (final IllegalArgumentException ex3) {
                        bap.c("TtmlDecoder", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                }
                case 0: {
                    byt = byt2;
                    if ("style".equals(xmlPullParser.getName())) {
                        byt = q(byt2);
                        byt.l = attributeValue;
                        break;
                    }
                    break;
                }
            }
            ++i;
            byt2 = byt;
        }
        return byt2;
    }
    
    private static String[] s(String trim) {
        trim = trim.trim();
        String[] ap;
        if (trim.isEmpty()) {
            ap = new String[0];
        }
        else {
            ap = bax.ap(trim, "\\s+");
        }
        return ap;
    }
    
    protected final bxi n(final byte[] p0, final int p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          28
        //     5: ldc_w           "\n"
        //     8: astore          26
        //    10: ldc_w           "http://www.w3.org/ns/ttml#parameter"
        //    13: astore          31
        //    15: aload_0        
        //    16: getfield        byq.i:Lorg/xmlpull/v1/XmlPullParserFactory;
        //    19: invokevirtual   org/xmlpull/v1/XmlPullParserFactory.newPullParser:()Lorg/xmlpull/v1/XmlPullParser;
        //    22: astore          40
        //    24: new             Ljava/util/HashMap;
        //    27: astore          39
        //    29: aload           39
        //    31: invokespecial   java/util/HashMap.<init>:()V
        //    34: new             Ljava/util/HashMap;
        //    37: astore          38
        //    39: aload           38
        //    41: invokespecial   java/util/HashMap.<init>:()V
        //    44: new             Ljava/util/HashMap;
        //    47: astore          27
        //    49: aload           27
        //    51: invokespecial   java/util/HashMap.<init>:()V
        //    54: new             Lbys;
        //    57: astore          24
        //    59: aload           24
        //    61: ldc_w           ""
        //    64: ldc_w           -3.4028235E38
        //    67: ldc_w           -3.4028235E38
        //    70: ldc_w           -2147483648
        //    73: ldc_w           -2147483648
        //    76: ldc_w           -3.4028235E38
        //    79: ldc_w           -3.4028235E38
        //    82: ldc_w           -2147483648
        //    85: ldc_w           -3.4028235E38
        //    88: ldc_w           -2147483648
        //    91: invokespecial   bys.<init>:(Ljava/lang/String;FFIIFFIFI)V
        //    94: aload           38
        //    96: ldc_w           ""
        //    99: aload           24
        //   101: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   106: pop            
        //   107: new             Ljava/io/ByteArrayInputStream;
        //   110: astore          24
        //   112: aload           24
        //   114: aload_1        
        //   115: iconst_0       
        //   116: iload_2        
        //   117: invokespecial   java/io/ByteArrayInputStream.<init>:([BII)V
        //   120: aload           40
        //   122: aload           24
        //   124: aconst_null    
        //   125: invokeinterface org/xmlpull/v1/XmlPullParser.setInput:(Ljava/io/InputStream;Ljava/lang/String;)V
        //   130: new             Ljava/util/ArrayDeque;
        //   133: astore          41
        //   135: aload           41
        //   137: invokespecial   java/util/ArrayDeque.<init>:()V
        //   140: aload           40
        //   142: invokeinterface org/xmlpull/v1/XmlPullParser.getEventType:()I
        //   147: istore          10
        //   149: getstatic       byq.h:Lbyo;
        //   152: astore          24
        //   154: getstatic       byq.j:Latwt;
        //   157: astore          30
        //   159: aconst_null    
        //   160: astore          25
        //   162: aconst_null    
        //   163: astore          29
        //   165: iconst_0       
        //   166: istore          9
        //   168: aload           26
        //   170: astore_1       
        //   171: iload           10
        //   173: iconst_1       
        //   174: if_icmpeq       3260
        //   177: aload           41
        //   179: invokevirtual   java/util/ArrayDeque.peek:()Ljava/lang/Object;
        //   182: checkcast       Lbyr;
        //   185: astore          42
        //   187: iload           9
        //   189: ifne            3198
        //   192: aload           40
        //   194: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   199: astore          34
        //   201: aload           24
        //   203: astore          26
        //   205: iload           10
        //   207: iconst_2       
        //   208: if_icmpne       3019
        //   211: ldc_w           "tt"
        //   214: aload           34
        //   216: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   219: istore_3       
        //   220: iload_3        
        //   221: ifeq            755
        //   224: aload           40
        //   226: aload           31
        //   228: ldc_w           "frameRate"
        //   231: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   236: astore          24
        //   238: aload           24
        //   240: ifnull          252
        //   243: aload           24
        //   245: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   248: istore_2       
        //   249: goto            255
        //   252: bipush          30
        //   254: istore_2       
        //   255: aload           40
        //   257: aload           31
        //   259: ldc_w           "frameRateMultiplier"
        //   262: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   267: astore          24
        //   269: aload           24
        //   271: ifnull          326
        //   274: aload           24
        //   276: ldc_w           " "
        //   279: invokestatic    bax.ap:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //   282: astore          24
        //   284: aload           24
        //   286: arraylength    
        //   287: iconst_2       
        //   288: if_icmpne       313
        //   291: aload           24
        //   293: iconst_0       
        //   294: aaload         
        //   295: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   298: i2f            
        //   299: aload           24
        //   301: iconst_1       
        //   302: aaload         
        //   303: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   306: i2f            
        //   307: fdiv           
        //   308: fstore          4
        //   310: goto            329
        //   313: new             Lbxk;
        //   316: astore_1       
        //   317: aload_1        
        //   318: ldc_w           "frameRateMultiplier doesn't have 2 parts"
        //   321: invokespecial   bxk.<init>:(Ljava/lang/String;)V
        //   324: aload_1        
        //   325: athrow         
        //   326: fconst_1       
        //   327: fstore          4
        //   329: getstatic       byq.h:Lbyo;
        //   332: astore          26
        //   334: aload           26
        //   336: getfield        byo.b:I
        //   339: istore          10
        //   341: aload           40
        //   343: aload           31
        //   345: ldc_w           "subFrameRate"
        //   348: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   353: astore          24
        //   355: aload           24
        //   357: ifnull          370
        //   360: aload           24
        //   362: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   365: istore          10
        //   367: goto            370
        //   370: aload           26
        //   372: getfield        byo.c:I
        //   375: istore          11
        //   377: aload           40
        //   379: aload           31
        //   381: ldc_w           "tickRate"
        //   384: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   389: astore          24
        //   391: aload           24
        //   393: ifnull          406
        //   396: aload           24
        //   398: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   401: istore          11
        //   403: goto            406
        //   406: new             Lbyo;
        //   409: astore          24
        //   411: aload           24
        //   413: iload_2        
        //   414: i2f            
        //   415: fload           4
        //   417: fmul           
        //   418: iload           10
        //   420: iload           11
        //   422: invokespecial   byo.<init>:(FII)V
        //   425: getstatic       byq.j:Latwt;
        //   428: astore          29
        //   430: aload           40
        //   432: aload           31
        //   434: ldc_w           "cellResolution"
        //   437: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   442: astore          30
        //   444: aload           30
        //   446: ifnull          630
        //   449: getstatic       byq.g:Ljava/util/regex/Pattern;
        //   452: aload           30
        //   454: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   457: astore          26
        //   459: aload           26
        //   461: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   464: ifne            483
        //   467: ldc             "TtmlDecoder"
        //   469: ldc_w           "Ignoring malformed cell resolution: "
        //   472: aload           30
        //   474: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   477: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   480: goto            630
        //   483: aload           26
        //   485: iconst_1       
        //   486: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   489: astore          32
        //   491: aload           32
        //   493: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   496: pop            
        //   497: aload           32
        //   499: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   502: istore          10
        //   504: aload           26
        //   506: iconst_2       
        //   507: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   510: astore          26
        //   512: aload           26
        //   514: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   517: pop            
        //   518: aload           26
        //   520: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   523: istore_2       
        //   524: iload           10
        //   526: ifeq            551
        //   529: iload_2        
        //   530: ifeq            551
        //   533: new             Latwt;
        //   536: dup            
        //   537: iload_2        
        //   538: aconst_null    
        //   539: invokespecial   atwt.<init>:(I[C)V
        //   542: astore          26
        //   544: aload           26
        //   546: astore          29
        //   548: goto            630
        //   551: new             Lbxk;
        //   554: astore          32
        //   556: new             Ljava/lang/StringBuilder;
        //   559: astore          26
        //   561: aload           26
        //   563: invokespecial   java/lang/StringBuilder.<init>:()V
        //   566: aload           26
        //   568: ldc_w           "Invalid cell resolution "
        //   571: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   574: pop            
        //   575: aload           26
        //   577: iload           10
        //   579: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   582: pop            
        //   583: aload           26
        //   585: ldc_w           " "
        //   588: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   591: pop            
        //   592: aload           26
        //   594: iload_2        
        //   595: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   598: pop            
        //   599: aload           32
        //   601: aload           26
        //   603: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   606: invokespecial   bxk.<init>:(Ljava/lang/String;)V
        //   609: aload           32
        //   611: athrow         
        //   612: astore          26
        //   614: ldc             "TtmlDecoder"
        //   616: ldc_w           "Ignoring malformed cell resolution: "
        //   619: aload           30
        //   621: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   624: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   627: goto            630
        //   630: aload           40
        //   632: ldc_w           "extent"
        //   635: invokestatic    ef.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //   638: astore          30
        //   640: aload           30
        //   642: ifnonnull       651
        //   645: aconst_null    
        //   646: astore          26
        //   648: goto            767
        //   651: getstatic       byq.f:Ljava/util/regex/Pattern;
        //   654: aload           30
        //   656: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   659: astore          26
        //   661: aload           26
        //   663: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   666: ifne            685
        //   669: ldc             "TtmlDecoder"
        //   671: ldc_w           "Ignoring non-pixel tts extent: "
        //   674: aload           30
        //   676: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   679: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   682: goto            645
        //   685: aload           26
        //   687: iconst_1       
        //   688: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   691: astore          32
        //   693: aload           32
        //   695: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   698: pop            
        //   699: aload           32
        //   701: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   704: istore_2       
        //   705: aload           26
        //   707: iconst_2       
        //   708: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   711: astore          26
        //   713: aload           26
        //   715: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //   718: pop            
        //   719: new             Lbyp;
        //   722: dup            
        //   723: iload_2        
        //   724: aload           26
        //   726: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   729: invokespecial   byp.<init>:(II)V
        //   732: astore          26
        //   734: goto            767
        //   737: astore          26
        //   739: ldc             "TtmlDecoder"
        //   741: ldc_w           "Ignoring malformed tts extent: "
        //   744: aload           30
        //   746: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   749: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //   752: goto            645
        //   755: aload           26
        //   757: astore          24
        //   759: aload           29
        //   761: astore          26
        //   763: aload           30
        //   765: astore          29
        //   767: aload           34
        //   769: ldc_w           "tt"
        //   772: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   775: istore_3       
        //   776: ldc_w           "metadata"
        //   779: astore          33
        //   781: ldc_w           "region"
        //   784: astore          32
        //   786: iload_3        
        //   787: ifne            965
        //   790: aload           34
        //   792: ldc_w           "head"
        //   795: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   798: ifne            965
        //   801: aload           34
        //   803: ldc_w           "body"
        //   806: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   809: ifne            965
        //   812: aload           34
        //   814: ldc_w           "div"
        //   817: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   820: ifne            965
        //   823: aload           34
        //   825: ldc_w           "p"
        //   828: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   831: ifne            965
        //   834: aload           34
        //   836: ldc_w           "span"
        //   839: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   842: ifne            965
        //   845: aload           34
        //   847: ldc_w           "br"
        //   850: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   853: ifne            965
        //   856: aload           34
        //   858: ldc_w           "style"
        //   861: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   864: ifne            965
        //   867: aload           34
        //   869: ldc_w           "styling"
        //   872: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   875: ifne            965
        //   878: aload           34
        //   880: ldc_w           "layout"
        //   883: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   886: ifne            965
        //   889: aload           34
        //   891: ldc_w           "region"
        //   894: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   897: ifne            965
        //   900: aload           34
        //   902: ldc_w           "metadata"
        //   905: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   908: ifne            965
        //   911: aload           34
        //   913: ldc_w           "image"
        //   916: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   919: ifne            965
        //   922: aload           34
        //   924: ldc_w           "data"
        //   927: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   930: ifne            965
        //   933: aload           34
        //   935: ldc_w           "information"
        //   938: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   941: ifeq            947
        //   944: goto            965
        //   947: aload           40
        //   949: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   954: pop            
        //   955: invokestatic    bap.f:()V
        //   958: aload           24
        //   960: astore          30
        //   962: goto            1836
        //   965: ldc_w           "head"
        //   968: aload           34
        //   970: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   973: istore_3       
        //   974: iload_3        
        //   975: ifne            1860
        //   978: aload           40
        //   980: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeCount:()I
        //   985: istore          10
        //   987: aload           40
        //   989: aconst_null    
        //   990: invokestatic    byq.r:(Lorg/xmlpull/v1/XmlPullParser;Lbyt;)Lbyt;
        //   993: astore          43
        //   995: aconst_null    
        //   996: astore          33
        //   998: aconst_null    
        //   999: astore          30
        //  1001: ldc2_w          -9223372036854775807
        //  1004: lstore          14
        //  1006: ldc2_w          -9223372036854775807
        //  1009: lstore          16
        //  1011: lload           16
        //  1013: lstore          18
        //  1015: aload           28
        //  1017: astore          32
        //  1019: iconst_0       
        //  1020: istore          11
        //  1022: iload           11
        //  1024: iload           10
        //  1026: if_icmpge       1593
        //  1029: aload           40
        //  1031: iload           11
        //  1033: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeName:(I)Ljava/lang/String;
        //  1038: astore          34
        //  1040: aload           40
        //  1042: iload           11
        //  1044: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(I)Ljava/lang/String;
        //  1049: astore          37
        //  1051: aload           34
        //  1053: invokevirtual   java/lang/String.hashCode:()I
        //  1056: istore_2       
        //  1057: iload_2        
        //  1058: lookupswitch {
        //          -934795532: 1198
        //            99841: 1182
        //           100571: 1167
        //          93616297: 1151
        //          109780401: 1135
        //          1292595405: 1119
        //          default: 1116
        //        }
        //  1116: goto            1214
        //  1119: aload           34
        //  1121: ldc_w           "backgroundImage"
        //  1124: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1127: ifeq            1214
        //  1130: iconst_5       
        //  1131: istore_2       
        //  1132: goto            1216
        //  1135: aload           34
        //  1137: ldc_w           "style"
        //  1140: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1143: ifeq            1214
        //  1146: iconst_3       
        //  1147: istore_2       
        //  1148: goto            1216
        //  1151: aload           34
        //  1153: ldc_w           "begin"
        //  1156: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1159: ifeq            1214
        //  1162: iconst_0       
        //  1163: istore_2       
        //  1164: goto            1216
        //  1167: aload           34
        //  1169: ldc             "end"
        //  1171: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1174: ifeq            1214
        //  1177: iconst_1       
        //  1178: istore_2       
        //  1179: goto            1216
        //  1182: aload           34
        //  1184: ldc_w           "dur"
        //  1187: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1190: ifeq            1214
        //  1193: iconst_2       
        //  1194: istore_2       
        //  1195: goto            1216
        //  1198: aload           34
        //  1200: ldc_w           "region"
        //  1203: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1206: ifeq            1214
        //  1209: iconst_4       
        //  1210: istore_2       
        //  1211: goto            1216
        //  1214: iconst_m1      
        //  1215: istore_2       
        //  1216: iload_2        
        //  1217: ifeq            1529
        //  1220: iload_2        
        //  1221: iconst_1       
        //  1222: if_icmpeq       1497
        //  1225: iload_2        
        //  1226: iconst_2       
        //  1227: if_icmpeq       1465
        //  1230: iload_2        
        //  1231: iconst_3       
        //  1232: if_icmpeq       1401
        //  1235: iload_2        
        //  1236: iconst_4       
        //  1237: if_icmpeq       1338
        //  1240: iload_2        
        //  1241: iconst_5       
        //  1242: if_icmpeq       1272
        //  1245: lload           14
        //  1247: lstore          22
        //  1249: aload           33
        //  1251: astore          34
        //  1253: aload           32
        //  1255: astore          35
        //  1257: aload           30
        //  1259: astore          36
        //  1261: lload           16
        //  1263: lstore          20
        //  1265: lload           18
        //  1267: lstore          12
        //  1269: goto            1558
        //  1272: lload           14
        //  1274: lstore          22
        //  1276: aload           33
        //  1278: astore          34
        //  1280: aload           32
        //  1282: astore          35
        //  1284: aload           30
        //  1286: astore          36
        //  1288: lload           16
        //  1290: lstore          20
        //  1292: lload           18
        //  1294: lstore          12
        //  1296: aload           37
        //  1298: ldc_w           "#"
        //  1301: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //  1304: ifeq            1558
        //  1307: aload           37
        //  1309: iconst_1       
        //  1310: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  1313: astore          36
        //  1315: lload           14
        //  1317: lstore          22
        //  1319: aload           33
        //  1321: astore          34
        //  1323: aload           32
        //  1325: astore          35
        //  1327: lload           16
        //  1329: lstore          20
        //  1331: lload           18
        //  1333: lstore          12
        //  1335: goto            1558
        //  1338: lload           14
        //  1340: lstore          22
        //  1342: aload           33
        //  1344: astore          34
        //  1346: aload           32
        //  1348: astore          35
        //  1350: aload           30
        //  1352: astore          36
        //  1354: lload           16
        //  1356: lstore          20
        //  1358: lload           18
        //  1360: lstore          12
        //  1362: aload           38
        //  1364: aload           37
        //  1366: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //  1371: ifeq            1558
        //  1374: aload           37
        //  1376: astore          35
        //  1378: lload           14
        //  1380: lstore          22
        //  1382: aload           33
        //  1384: astore          34
        //  1386: aload           30
        //  1388: astore          36
        //  1390: lload           16
        //  1392: lstore          20
        //  1394: lload           18
        //  1396: lstore          12
        //  1398: goto            1558
        //  1401: aload           37
        //  1403: invokestatic    byq.s:(Ljava/lang/String;)[Ljava/lang/String;
        //  1406: astore          37
        //  1408: lload           14
        //  1410: lstore          22
        //  1412: aload           33
        //  1414: astore          34
        //  1416: aload           32
        //  1418: astore          35
        //  1420: aload           30
        //  1422: astore          36
        //  1424: lload           16
        //  1426: lstore          20
        //  1428: lload           18
        //  1430: lstore          12
        //  1432: aload           37
        //  1434: arraylength    
        //  1435: ifle            1558
        //  1438: aload           37
        //  1440: astore          34
        //  1442: lload           14
        //  1444: lstore          22
        //  1446: aload           32
        //  1448: astore          35
        //  1450: aload           30
        //  1452: astore          36
        //  1454: lload           16
        //  1456: lstore          20
        //  1458: lload           18
        //  1460: lstore          12
        //  1462: goto            1558
        //  1465: aload           37
        //  1467: aload           24
        //  1469: invokestatic    byq.o:(Ljava/lang/String;Lbyo;)J
        //  1472: lstore          12
        //  1474: lload           14
        //  1476: lstore          22
        //  1478: aload           33
        //  1480: astore          34
        //  1482: aload           32
        //  1484: astore          35
        //  1486: aload           30
        //  1488: astore          36
        //  1490: lload           16
        //  1492: lstore          20
        //  1494: goto            1558
        //  1497: aload           37
        //  1499: aload           24
        //  1501: invokestatic    byq.o:(Ljava/lang/String;Lbyo;)J
        //  1504: lstore          22
        //  1506: aload           33
        //  1508: astore          34
        //  1510: aload           32
        //  1512: astore          35
        //  1514: aload           30
        //  1516: astore          36
        //  1518: lload           16
        //  1520: lstore          20
        //  1522: lload           18
        //  1524: lstore          12
        //  1526: goto            1558
        //  1529: aload           37
        //  1531: aload           24
        //  1533: invokestatic    byq.o:(Ljava/lang/String;Lbyo;)J
        //  1536: lstore          20
        //  1538: lload           18
        //  1540: lstore          12
        //  1542: aload           30
        //  1544: astore          36
        //  1546: aload           32
        //  1548: astore          35
        //  1550: aload           33
        //  1552: astore          34
        //  1554: lload           14
        //  1556: lstore          22
        //  1558: iinc            11, 1
        //  1561: lload           22
        //  1563: lstore          14
        //  1565: aload           34
        //  1567: astore          33
        //  1569: aload           35
        //  1571: astore          32
        //  1573: aload           36
        //  1575: astore          30
        //  1577: lload           20
        //  1579: lstore          16
        //  1581: lload           12
        //  1583: lstore          18
        //  1585: goto            1022
        //  1588: astore          30
        //  1590: goto            1822
        //  1593: aload           42
        //  1595: ifnull          1686
        //  1598: aload           42
        //  1600: getfield        byr.d:J
        //  1603: lstore          22
        //  1605: lload           14
        //  1607: lstore          12
        //  1609: lload           16
        //  1611: lstore          20
        //  1613: lload           22
        //  1615: ldc2_w          -9223372036854775807
        //  1618: lcmp           
        //  1619: ifeq            1694
        //  1622: lload           16
        //  1624: ldc2_w          -9223372036854775807
        //  1627: lcmp           
        //  1628: ifeq            1641
        //  1631: lload           16
        //  1633: lload           22
        //  1635: ladd           
        //  1636: lstore          16
        //  1638: goto            1646
        //  1641: ldc2_w          -9223372036854775807
        //  1644: lstore          16
        //  1646: lload           14
        //  1648: ldc2_w          -9223372036854775807
        //  1651: lcmp           
        //  1652: ifeq            1669
        //  1655: lload           14
        //  1657: lload           22
        //  1659: ladd           
        //  1660: lstore          12
        //  1662: lload           16
        //  1664: lstore          20
        //  1666: goto            1694
        //  1669: ldc2_w          -9223372036854775807
        //  1672: lstore          12
        //  1674: lload           16
        //  1676: lstore          20
        //  1678: goto            1694
        //  1681: astore          30
        //  1683: goto            1822
        //  1686: lload           16
        //  1688: lstore          20
        //  1690: lload           14
        //  1692: lstore          12
        //  1694: lload           12
        //  1696: ldc2_w          -9223372036854775807
        //  1699: lcmp           
        //  1700: ifne            1754
        //  1703: lload           18
        //  1705: ldc2_w          -9223372036854775807
        //  1708: lcmp           
        //  1709: ifeq            1722
        //  1712: lload           20
        //  1714: lload           18
        //  1716: ladd           
        //  1717: lstore          12
        //  1719: goto            1754
        //  1722: aload           42
        //  1724: ifnull          1746
        //  1727: aload           42
        //  1729: getfield        byr.e:J
        //  1732: lstore          12
        //  1734: lload           12
        //  1736: ldc2_w          -9223372036854775807
        //  1739: lcmp           
        //  1740: ifeq            1746
        //  1743: goto            1754
        //  1746: ldc2_w          -9223372036854775807
        //  1749: lstore          12
        //  1751: goto            1754
        //  1754: aload           40
        //  1756: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //  1761: astore          34
        //  1763: new             Lbyr;
        //  1766: astore          35
        //  1768: aload           35
        //  1770: aload           34
        //  1772: aconst_null    
        //  1773: lload           20
        //  1775: lload           12
        //  1777: aload           43
        //  1779: aload           33
        //  1781: aload           32
        //  1783: aload           30
        //  1785: aload           42
        //  1787: invokespecial   byr.<init>:(Ljava/lang/String;Ljava/lang/String;JJLbyt;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbyr;)V
        //  1790: aload           41
        //  1792: aload           35
        //  1794: invokevirtual   java/util/ArrayDeque.push:(Ljava/lang/Object;)V
        //  1797: aload           42
        //  1799: ifnull          1809
        //  1802: aload           42
        //  1804: aload           35
        //  1806: invokevirtual   byr.c:(Lbyr;)V
        //  1809: aload           24
        //  1811: astore          30
        //  1813: aload           27
        //  1815: astore          24
        //  1817: goto            2987
        //  1820: astore          30
        //  1822: ldc             "TtmlDecoder"
        //  1824: ldc_w           "Suppressing parser error"
        //  1827: aload           30
        //  1829: invokestatic    bap.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1832: aload           24
        //  1834: astore          30
        //  1836: aload           26
        //  1838: astore          32
        //  1840: aload_1        
        //  1841: astore          26
        //  1843: aload           27
        //  1845: astore          26
        //  1847: iconst_1       
        //  1848: istore_2       
        //  1849: aload           29
        //  1851: astore          30
        //  1853: aload           32
        //  1855: astore          29
        //  1857: goto            3233
        //  1860: aload           24
        //  1862: astore          30
        //  1864: aload           27
        //  1866: astore          24
        //  1868: aload           30
        //  1870: astore          27
        //  1872: aload           40
        //  1874: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //  1879: pop            
        //  1880: aload           40
        //  1882: ldc_w           "style"
        //  1885: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  1888: ifeq            1997
        //  1891: aload           40
        //  1893: ldc_w           "style"
        //  1896: invokestatic    ef.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //  1899: astore          34
        //  1901: new             Lbyt;
        //  1904: astore          30
        //  1906: aload           30
        //  1908: invokespecial   byt.<init>:()V
        //  1911: aload           40
        //  1913: aload           30
        //  1915: invokestatic    byq.r:(Lorg/xmlpull/v1/XmlPullParser;Lbyt;)Lbyt;
        //  1918: astore          30
        //  1920: aload           34
        //  1922: ifnull          1970
        //  1925: aload           34
        //  1927: invokestatic    byq.s:(Ljava/lang/String;)[Ljava/lang/String;
        //  1930: astore          34
        //  1932: aload           34
        //  1934: arraylength    
        //  1935: istore          10
        //  1937: iconst_0       
        //  1938: istore_2       
        //  1939: iload_2        
        //  1940: iload           10
        //  1942: if_icmpge       1970
        //  1945: aload           30
        //  1947: aload           39
        //  1949: aload           34
        //  1951: iload_2        
        //  1952: aaload         
        //  1953: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1958: checkcast       Lbyt;
        //  1961: invokevirtual   byt.d:(Lbyt;)V
        //  1964: iinc            2, 1
        //  1967: goto            1939
        //  1970: aload           30
        //  1972: getfield        byt.l:Ljava/lang/String;
        //  1975: astore          34
        //  1977: aload           34
        //  1979: ifnull          2089
        //  1982: aload           39
        //  1984: aload           34
        //  1986: aload           30
        //  1988: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1993: pop            
        //  1994: goto            2089
        //  1997: aload           40
        //  1999: aload           32
        //  2001: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2004: istore_3       
        //  2005: iload_3        
        //  2006: ifne            2092
        //  2009: aload           40
        //  2011: aload           33
        //  2013: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2016: ifeq            2089
        //  2019: aload           40
        //  2021: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //  2026: pop            
        //  2027: aload           40
        //  2029: ldc_w           "image"
        //  2032: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2035: ifeq            2073
        //  2038: aload           40
        //  2040: ldc_w           "id"
        //  2043: invokestatic    ef.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //  2046: astore          30
        //  2048: aload           30
        //  2050: ifnull          2073
        //  2053: aload           24
        //  2055: aload           30
        //  2057: aload           40
        //  2059: invokeinterface org/xmlpull/v1/XmlPullParser.nextText:()Ljava/lang/String;
        //  2064: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2069: pop            
        //  2070: goto            2073
        //  2073: aload           40
        //  2075: aload           33
        //  2077: invokestatic    ef.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2080: ifeq            2086
        //  2083: goto            2089
        //  2086: goto            2019
        //  2089: goto            2972
        //  2092: aload           40
        //  2094: ldc_w           "id"
        //  2097: invokestatic    ef.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //  2100: astore          34
        //  2102: aload           34
        //  2104: ifnonnull       2113
        //  2107: aconst_null    
        //  2108: astore          30
        //  2110: goto            2940
        //  2113: aload           40
        //  2115: ldc_w           "origin"
        //  2118: invokestatic    ef.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //  2121: astore          30
        //  2123: aload           30
        //  2125: ifnull          2929
        //  2128: getstatic       byq.b:Ljava/util/regex/Pattern;
        //  2131: astore          36
        //  2133: aload           36
        //  2135: aload           30
        //  2137: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //  2140: astore          42
        //  2142: getstatic       byq.f:Ljava/util/regex/Pattern;
        //  2145: astore          35
        //  2147: aload           35
        //  2149: aload           30
        //  2151: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //  2154: astore          37
        //  2156: aload           42
        //  2158: invokevirtual   java/util/regex/Matcher.matches:()Z
        //  2161: istore_3       
        //  2162: iload_3        
        //  2163: ifeq            2241
        //  2166: aload           42
        //  2168: iconst_1       
        //  2169: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //  2172: astore          37
        //  2174: aload           37
        //  2176: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2179: pop            
        //  2180: aload           37
        //  2182: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //  2185: ldc_w           100.0
        //  2188: fdiv           
        //  2189: fstore          5
        //  2191: aload           42
        //  2193: iconst_2       
        //  2194: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //  2197: astore          37
        //  2199: aload           37
        //  2201: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2204: pop            
        //  2205: aload           37
        //  2207: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //  2210: fstore          4
        //  2212: fload           4
        //  2214: ldc_w           100.0
        //  2217: fdiv           
        //  2218: fstore          4
        //  2220: goto            2340
        //  2223: astore          34
        //  2225: ldc             "TtmlDecoder"
        //  2227: ldc_w           "Ignoring region with malformed origin: "
        //  2230: aload           30
        //  2232: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2235: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2238: goto            2107
        //  2241: aload           37
        //  2243: invokevirtual   java/util/regex/Matcher.matches:()Z
        //  2246: ifeq            2913
        //  2249: aload           26
        //  2251: ifnonnull       2270
        //  2254: ldc             "TtmlDecoder"
        //  2256: ldc_w           "Ignoring region with missing tts:extent: "
        //  2259: aload           30
        //  2261: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2264: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2267: goto            2107
        //  2270: aload           37
        //  2272: iconst_1       
        //  2273: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //  2276: astore          42
        //  2278: aload           42
        //  2280: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2283: pop            
        //  2284: aload           42
        //  2286: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  2289: istore_2       
        //  2290: aload           37
        //  2292: iconst_2       
        //  2293: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //  2296: astore          37
        //  2298: aload           37
        //  2300: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2303: pop            
        //  2304: aload           37
        //  2306: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  2309: istore          10
        //  2311: iload_2        
        //  2312: i2f            
        //  2313: aload           26
        //  2315: getfield        byp.a:I
        //  2318: i2f            
        //  2319: fdiv           
        //  2320: fstore          5
        //  2322: iload           10
        //  2324: i2f            
        //  2325: fstore          4
        //  2327: aload           26
        //  2329: getfield        byp.b:I
        //  2332: istore_2       
        //  2333: fload           4
        //  2335: iload_2        
        //  2336: i2f            
        //  2337: fdiv           
        //  2338: fstore          4
        //  2340: aload           40
        //  2342: ldc_w           "extent"
        //  2345: invokestatic    ef.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //  2348: astore          37
        //  2350: aload           37
        //  2352: ifnull          2884
        //  2355: aload           36
        //  2357: aload           37
        //  2359: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //  2362: astore          36
        //  2364: aload           35
        //  2366: aload           37
        //  2368: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //  2371: astore          35
        //  2373: aload           36
        //  2375: invokevirtual   java/util/regex/Matcher.matches:()Z
        //  2378: istore_3       
        //  2379: iload_3        
        //  2380: ifeq            2458
        //  2383: aload           36
        //  2385: iconst_1       
        //  2386: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //  2389: astore          35
        //  2391: aload           35
        //  2393: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2396: pop            
        //  2397: aload           35
        //  2399: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //  2402: ldc_w           100.0
        //  2405: fdiv           
        //  2406: fstore          7
        //  2408: aload           36
        //  2410: iconst_2       
        //  2411: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //  2414: astore          35
        //  2416: aload           35
        //  2418: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2421: pop            
        //  2422: aload           35
        //  2424: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //  2427: fstore          6
        //  2429: fload           6
        //  2431: ldc_w           100.0
        //  2434: fdiv           
        //  2435: fstore          6
        //  2437: goto            2557
        //  2440: astore          34
        //  2442: ldc             "TtmlDecoder"
        //  2444: ldc_w           "Ignoring region with malformed extent: "
        //  2447: aload           30
        //  2449: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2452: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2455: goto            2107
        //  2458: aload           35
        //  2460: invokevirtual   java/util/regex/Matcher.matches:()Z
        //  2463: ifeq            2868
        //  2466: aload           26
        //  2468: ifnonnull       2487
        //  2471: ldc             "TtmlDecoder"
        //  2473: ldc_w           "Ignoring region with missing tts:extent: "
        //  2476: aload           30
        //  2478: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2481: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2484: goto            2107
        //  2487: aload           35
        //  2489: iconst_1       
        //  2490: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //  2493: astore          36
        //  2495: aload           36
        //  2497: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2500: pop            
        //  2501: aload           36
        //  2503: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  2506: istore          10
        //  2508: aload           35
        //  2510: iconst_2       
        //  2511: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //  2514: astore          35
        //  2516: aload           35
        //  2518: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2521: pop            
        //  2522: aload           35
        //  2524: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  2527: istore_2       
        //  2528: iload           10
        //  2530: i2f            
        //  2531: aload           26
        //  2533: getfield        byp.a:I
        //  2536: i2f            
        //  2537: fdiv           
        //  2538: fstore          7
        //  2540: iload_2        
        //  2541: i2f            
        //  2542: fstore          6
        //  2544: aload           26
        //  2546: getfield        byp.b:I
        //  2549: istore_2       
        //  2550: fload           6
        //  2552: iload_2        
        //  2553: i2f            
        //  2554: fdiv           
        //  2555: fstore          6
        //  2557: aload           40
        //  2559: ldc_w           "displayAlign"
        //  2562: invokestatic    ef.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //  2565: astore          30
        //  2567: aload           30
        //  2569: ifnull          2675
        //  2572: aload           30
        //  2574: invokestatic    aevy.b:(Ljava/lang/String;)Ljava/lang/String;
        //  2577: astore          30
        //  2579: aload           30
        //  2581: invokevirtual   java/lang/String.hashCode:()I
        //  2584: istore_2       
        //  2585: iload_2        
        //  2586: ldc_w           -1364013995
        //  2589: if_icmpeq       2618
        //  2592: iload_2        
        //  2593: ldc_w           92734940
        //  2596: if_icmpeq       2602
        //  2599: goto            2633
        //  2602: aload           30
        //  2604: ldc_w           "after"
        //  2607: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2610: ifeq            2633
        //  2613: iconst_1       
        //  2614: istore_2       
        //  2615: goto            2635
        //  2618: aload           30
        //  2620: ldc             "center"
        //  2622: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2625: ifeq            2633
        //  2628: iconst_0       
        //  2629: istore_2       
        //  2630: goto            2635
        //  2633: iconst_m1      
        //  2634: istore_2       
        //  2635: iload_2        
        //  2636: ifeq            2660
        //  2639: iload_2        
        //  2640: iconst_1       
        //  2641: if_icmpeq       2647
        //  2644: goto            2675
        //  2647: fload           4
        //  2649: fload           6
        //  2651: fadd           
        //  2652: fstore          4
        //  2654: iconst_2       
        //  2655: istore          10
        //  2657: goto            2678
        //  2660: fload           4
        //  2662: fload           6
        //  2664: fconst_2       
        //  2665: fdiv           
        //  2666: fadd           
        //  2667: fstore          4
        //  2669: iconst_1       
        //  2670: istore          10
        //  2672: goto            2678
        //  2675: iconst_0       
        //  2676: istore          10
        //  2678: fconst_1       
        //  2679: aload           29
        //  2681: getfield        atwt.a:I
        //  2684: i2f            
        //  2685: fdiv           
        //  2686: fstore          8
        //  2688: aload           40
        //  2690: ldc_w           "writingMode"
        //  2693: invokestatic    ef.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //  2696: astore          30
        //  2698: aload           30
        //  2700: ifnull          2817
        //  2703: aload           30
        //  2705: invokestatic    aevy.b:(Ljava/lang/String;)Ljava/lang/String;
        //  2708: astore          30
        //  2710: aload           30
        //  2712: invokevirtual   java/lang/String.hashCode:()I
        //  2715: istore_2       
        //  2716: iload_2        
        //  2717: sipush          3694
        //  2720: if_icmpeq       2772
        //  2723: iload_2        
        //  2724: ldc_w           3553396
        //  2727: if_icmpeq       2756
        //  2730: iload_2        
        //  2731: ldc_w           3553576
        //  2734: if_icmpeq       2740
        //  2737: goto            2788
        //  2740: aload           30
        //  2742: ldc_w           "tbrl"
        //  2745: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2748: ifeq            2788
        //  2751: iconst_2       
        //  2752: istore_2       
        //  2753: goto            2790
        //  2756: aload           30
        //  2758: ldc_w           "tblr"
        //  2761: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2764: ifeq            2788
        //  2767: iconst_1       
        //  2768: istore_2       
        //  2769: goto            2790
        //  2772: aload           30
        //  2774: ldc_w           "tb"
        //  2777: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2780: ifeq            2788
        //  2783: iconst_0       
        //  2784: istore_2       
        //  2785: goto            2790
        //  2788: iconst_m1      
        //  2789: istore_2       
        //  2790: iload_2        
        //  2791: ifeq            2812
        //  2794: iload_2        
        //  2795: iconst_1       
        //  2796: if_icmpeq       2812
        //  2799: iload_2        
        //  2800: iconst_2       
        //  2801: if_icmpeq       2807
        //  2804: goto            2817
        //  2807: iconst_1       
        //  2808: istore_2       
        //  2809: goto            2821
        //  2812: iconst_2       
        //  2813: istore_2       
        //  2814: goto            2821
        //  2817: ldc_w           -2147483648
        //  2820: istore_2       
        //  2821: new             Lbys;
        //  2824: dup            
        //  2825: aload           34
        //  2827: fload           5
        //  2829: fload           4
        //  2831: iconst_0       
        //  2832: iload           10
        //  2834: fload           7
        //  2836: fload           6
        //  2838: iconst_1       
        //  2839: fload           8
        //  2841: iload_2        
        //  2842: invokespecial   bys.<init>:(Ljava/lang/String;FFIIFFIFI)V
        //  2845: astore          30
        //  2847: goto            2940
        //  2850: astore          34
        //  2852: ldc             "TtmlDecoder"
        //  2854: ldc_w           "Ignoring region with malformed extent: "
        //  2857: aload           30
        //  2859: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2862: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2865: goto            2937
        //  2868: ldc             "TtmlDecoder"
        //  2870: ldc_w           "Ignoring region with unsupported extent: "
        //  2873: aload           30
        //  2875: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2878: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2881: goto            2937
        //  2884: ldc             "TtmlDecoder"
        //  2886: ldc_w           "Ignoring region without an extent"
        //  2889: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2892: goto            2937
        //  2895: astore          34
        //  2897: ldc             "TtmlDecoder"
        //  2899: ldc_w           "Ignoring region with malformed origin: "
        //  2902: aload           30
        //  2904: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2907: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2910: goto            2937
        //  2913: ldc             "TtmlDecoder"
        //  2915: ldc_w           "Ignoring region with unsupported origin: "
        //  2918: aload           30
        //  2920: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  2923: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2926: goto            2937
        //  2929: ldc             "TtmlDecoder"
        //  2931: ldc_w           "Ignoring region without an origin"
        //  2934: invokestatic    bap.c:(Ljava/lang/String;Ljava/lang/String;)V
        //  2937: aconst_null    
        //  2938: astore          30
        //  2940: aload           24
        //  2942: astore          34
        //  2944: aload           34
        //  2946: astore          24
        //  2948: aload           30
        //  2950: ifnull          2972
        //  2953: aload           38
        //  2955: aload           30
        //  2957: getfield        bys.a:Ljava/lang/String;
        //  2960: aload           30
        //  2962: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2967: pop            
        //  2968: aload           34
        //  2970: astore          24
        //  2972: aload           40
        //  2974: ldc_w           "head"
        //  2977: invokestatic    ef.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2980: ifeq            3016
        //  2983: aload           27
        //  2985: astore          30
        //  2987: aload           26
        //  2989: astore          27
        //  2991: aload_1        
        //  2992: astore          26
        //  2994: aload           24
        //  2996: astore          26
        //  2998: aload           30
        //  3000: astore          24
        //  3002: aload           29
        //  3004: astore          30
        //  3006: iload           9
        //  3008: istore_2       
        //  3009: aload           27
        //  3011: astore          29
        //  3013: goto            3233
        //  3016: goto            1872
        //  3019: aload           27
        //  3021: astore          32
        //  3023: iload           10
        //  3025: iconst_4       
        //  3026: if_icmpne       3113
        //  3029: aload           42
        //  3031: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3034: pop            
        //  3035: aload           40
        //  3037: invokeinterface org/xmlpull/v1/XmlPullParser.getText:()Ljava/lang/String;
        //  3042: astore          26
        //  3044: new             Lbyr;
        //  3047: astore          32
        //  3049: aload           32
        //  3051: aconst_null    
        //  3052: aload           26
        //  3054: ldc_w           "\r\n"
        //  3057: aload_1        
        //  3058: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  3061: ldc_w           " *\n *"
        //  3064: aload_1        
        //  3065: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  3068: aload_1        
        //  3069: ldc_w           " "
        //  3072: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  3075: ldc_w           "[ \t\\x0B\f\r]+"
        //  3078: ldc_w           " "
        //  3081: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  3084: ldc2_w          -9223372036854775807
        //  3087: ldc2_w          -9223372036854775807
        //  3090: aconst_null    
        //  3091: aconst_null    
        //  3092: ldc_w           ""
        //  3095: aconst_null    
        //  3096: aconst_null    
        //  3097: invokespecial   byr.<init>:(Ljava/lang/String;Ljava/lang/String;JJLbyt;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbyr;)V
        //  3100: aload           42
        //  3102: aload           32
        //  3104: invokevirtual   byr.c:(Lbyr;)V
        //  3107: iload           9
        //  3109: istore_2       
        //  3110: goto            3226
        //  3113: aload_1        
        //  3114: astore          33
        //  3116: iload           9
        //  3118: istore_2       
        //  3119: iload           10
        //  3121: iconst_3       
        //  3122: if_icmpne       3226
        //  3125: aload           40
        //  3127: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //  3132: ldc_w           "tt"
        //  3135: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3138: ifeq            3178
        //  3141: new             Lbyu;
        //  3144: astore          25
        //  3146: aload           41
        //  3148: invokevirtual   java/util/ArrayDeque.peek:()Ljava/lang/Object;
        //  3151: checkcast       Lbyr;
        //  3154: astore          24
        //  3156: aload           24
        //  3158: invokestatic    dk.d:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3161: pop            
        //  3162: aload           25
        //  3164: aload           24
        //  3166: aload           39
        //  3168: aload           38
        //  3170: aload           32
        //  3172: invokespecial   byu.<init>:(Lbyr;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
        //  3175: goto            3178
        //  3178: aload           41
        //  3180: invokevirtual   java/util/ArrayDeque.pop:()Ljava/lang/Object;
        //  3183: pop            
        //  3184: aload           26
        //  3186: astore          24
        //  3188: aload           32
        //  3190: astore          26
        //  3192: iload           9
        //  3194: istore_2       
        //  3195: goto            3233
        //  3198: iload           10
        //  3200: iconst_2       
        //  3201: if_icmpne       3212
        //  3204: iload           9
        //  3206: iconst_1       
        //  3207: iadd           
        //  3208: istore_2       
        //  3209: goto            3226
        //  3212: iload           9
        //  3214: istore_2       
        //  3215: iload           10
        //  3217: iconst_3       
        //  3218: if_icmpne       3226
        //  3221: iload           9
        //  3223: iconst_1       
        //  3224: isub           
        //  3225: istore_2       
        //  3226: aload_1        
        //  3227: astore          26
        //  3229: aload           27
        //  3231: astore          26
        //  3233: aload           40
        //  3235: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //  3240: pop            
        //  3241: aload           40
        //  3243: invokeinterface org/xmlpull/v1/XmlPullParser.getEventType:()I
        //  3248: istore          10
        //  3250: aload           26
        //  3252: astore          27
        //  3254: iload_2        
        //  3255: istore          9
        //  3257: goto            171
        //  3260: aload           25
        //  3262: ifnull          3268
        //  3265: aload           25
        //  3267: areturn        
        //  3268: new             Lbxk;
        //  3271: astore_1       
        //  3272: aload_1        
        //  3273: ldc_w           "No TTML subtitles found"
        //  3276: invokespecial   bxk.<init>:(Ljava/lang/String;)V
        //  3279: aload_1        
        //  3280: athrow         
        //  3281: astore_1       
        //  3282: new             Ljava/lang/IllegalStateException;
        //  3285: dup            
        //  3286: ldc_w           "Unexpected error when reading input."
        //  3289: aload_1        
        //  3290: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3293: athrow         
        //  3294: astore_1       
        //  3295: new             Lbxk;
        //  3298: dup            
        //  3299: ldc_w           "Unable to decode source"
        //  3302: aload_1        
        //  3303: invokespecial   bxk.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  3306: astore_1       
        //  3307: goto            3312
        //  3310: aload_1        
        //  3311: athrow         
        //  3312: goto            3310
        //  3315: astore          26
        //  3317: goto            614
        //  3320: astore          26
        //  3322: goto            614
        //  3325: astore          26
        //  3327: goto            614
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  15     159    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  15     159    3281   3294   Ljava/io/IOException;
        //  177    187    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  177    187    3281   3294   Ljava/io/IOException;
        //  192    201    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  192    201    3281   3294   Ljava/io/IOException;
        //  211    220    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  211    220    3281   3294   Ljava/io/IOException;
        //  224    238    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  224    238    3281   3294   Ljava/io/IOException;
        //  243    249    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  243    249    3281   3294   Ljava/io/IOException;
        //  255    269    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  255    269    3281   3294   Ljava/io/IOException;
        //  274    310    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  274    310    3281   3294   Ljava/io/IOException;
        //  313    326    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  313    326    3281   3294   Ljava/io/IOException;
        //  329    355    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  329    355    3281   3294   Ljava/io/IOException;
        //  360    367    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  360    367    3281   3294   Ljava/io/IOException;
        //  370    391    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  370    391    3281   3294   Ljava/io/IOException;
        //  396    403    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  396    403    3281   3294   Ljava/io/IOException;
        //  406    444    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  406    444    3281   3294   Ljava/io/IOException;
        //  449    480    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  449    480    3281   3294   Ljava/io/IOException;
        //  483    504    612    614    Ljava/lang/NumberFormatException;
        //  483    504    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  483    504    3281   3294   Ljava/io/IOException;
        //  504    524    3315   3320   Ljava/lang/NumberFormatException;
        //  504    524    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  504    524    3281   3294   Ljava/io/IOException;
        //  533    544    3315   3320   Ljava/lang/NumberFormatException;
        //  533    544    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  533    544    3281   3294   Ljava/io/IOException;
        //  551    556    3315   3320   Ljava/lang/NumberFormatException;
        //  551    556    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  551    556    3281   3294   Ljava/io/IOException;
        //  556    566    3320   3325   Ljava/lang/NumberFormatException;
        //  556    566    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  556    566    3281   3294   Ljava/io/IOException;
        //  566    612    3325   3330   Ljava/lang/NumberFormatException;
        //  566    612    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  566    612    3281   3294   Ljava/io/IOException;
        //  614    627    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  614    627    3281   3294   Ljava/io/IOException;
        //  630    640    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  630    640    3281   3294   Ljava/io/IOException;
        //  651    682    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  651    682    3281   3294   Ljava/io/IOException;
        //  685    734    737    755    Ljava/lang/NumberFormatException;
        //  685    734    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  685    734    3281   3294   Ljava/io/IOException;
        //  739    752    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  739    752    3281   3294   Ljava/io/IOException;
        //  767    776    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  767    776    3281   3294   Ljava/io/IOException;
        //  790    944    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  790    944    3281   3294   Ljava/io/IOException;
        //  947    958    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  947    958    3281   3294   Ljava/io/IOException;
        //  965    974    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  965    974    3281   3294   Ljava/io/IOException;
        //  978    995    1820   1822   Lbxk;
        //  978    995    3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  978    995    3281   3294   Ljava/io/IOException;
        //  1029   1057   1588   1593   Lbxk;
        //  1029   1057   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1029   1057   3281   3294   Ljava/io/IOException;
        //  1296   1315   1588   1593   Lbxk;
        //  1296   1315   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1296   1315   3281   3294   Ljava/io/IOException;
        //  1362   1374   1588   1593   Lbxk;
        //  1362   1374   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1362   1374   3281   3294   Ljava/io/IOException;
        //  1401   1408   1588   1593   Lbxk;
        //  1401   1408   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1401   1408   3281   3294   Ljava/io/IOException;
        //  1432   1438   1588   1593   Lbxk;
        //  1432   1438   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1432   1438   3281   3294   Ljava/io/IOException;
        //  1465   1474   1588   1593   Lbxk;
        //  1465   1474   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1465   1474   3281   3294   Ljava/io/IOException;
        //  1497   1506   1588   1593   Lbxk;
        //  1497   1506   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1497   1506   3281   3294   Ljava/io/IOException;
        //  1529   1538   1588   1593   Lbxk;
        //  1529   1538   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1529   1538   3281   3294   Ljava/io/IOException;
        //  1598   1605   1681   1686   Lbxk;
        //  1598   1605   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1598   1605   3281   3294   Ljava/io/IOException;
        //  1727   1734   1681   1686   Lbxk;
        //  1727   1734   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1727   1734   3281   3294   Ljava/io/IOException;
        //  1754   1797   1681   1686   Lbxk;
        //  1754   1797   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1754   1797   3281   3294   Ljava/io/IOException;
        //  1802   1809   1681   1686   Lbxk;
        //  1802   1809   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1802   1809   3281   3294   Ljava/io/IOException;
        //  1822   1832   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1822   1832   3281   3294   Ljava/io/IOException;
        //  1872   1920   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1872   1920   3281   3294   Ljava/io/IOException;
        //  1925   1937   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1925   1937   3281   3294   Ljava/io/IOException;
        //  1945   1964   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1945   1964   3281   3294   Ljava/io/IOException;
        //  1970   1977   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1970   1977   3281   3294   Ljava/io/IOException;
        //  1982   1994   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1982   1994   3281   3294   Ljava/io/IOException;
        //  1997   2005   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  1997   2005   3281   3294   Ljava/io/IOException;
        //  2009   2019   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2009   2019   3281   3294   Ljava/io/IOException;
        //  2019   2048   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2019   2048   3281   3294   Ljava/io/IOException;
        //  2053   2070   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2053   2070   3281   3294   Ljava/io/IOException;
        //  2073   2083   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2073   2083   3281   3294   Ljava/io/IOException;
        //  2092   2102   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2092   2102   3281   3294   Ljava/io/IOException;
        //  2113   2123   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2113   2123   3281   3294   Ljava/io/IOException;
        //  2128   2162   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2128   2162   3281   3294   Ljava/io/IOException;
        //  2166   2212   2223   2241   Ljava/lang/NumberFormatException;
        //  2166   2212   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2166   2212   3281   3294   Ljava/io/IOException;
        //  2225   2238   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2225   2238   3281   3294   Ljava/io/IOException;
        //  2241   2249   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2241   2249   3281   3294   Ljava/io/IOException;
        //  2254   2267   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2254   2267   3281   3294   Ljava/io/IOException;
        //  2270   2322   2895   2913   Ljava/lang/NumberFormatException;
        //  2270   2322   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2270   2322   3281   3294   Ljava/io/IOException;
        //  2327   2333   2895   2913   Ljava/lang/NumberFormatException;
        //  2327   2333   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2327   2333   3281   3294   Ljava/io/IOException;
        //  2340   2350   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2340   2350   3281   3294   Ljava/io/IOException;
        //  2355   2379   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2355   2379   3281   3294   Ljava/io/IOException;
        //  2383   2429   2440   2458   Ljava/lang/NumberFormatException;
        //  2383   2429   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2383   2429   3281   3294   Ljava/io/IOException;
        //  2442   2455   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2442   2455   3281   3294   Ljava/io/IOException;
        //  2458   2466   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2458   2466   3281   3294   Ljava/io/IOException;
        //  2471   2484   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2471   2484   3281   3294   Ljava/io/IOException;
        //  2487   2540   2850   2868   Ljava/lang/NumberFormatException;
        //  2487   2540   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2487   2540   3281   3294   Ljava/io/IOException;
        //  2544   2550   2850   2868   Ljava/lang/NumberFormatException;
        //  2544   2550   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2544   2550   3281   3294   Ljava/io/IOException;
        //  2557   2567   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2557   2567   3281   3294   Ljava/io/IOException;
        //  2572   2585   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2572   2585   3281   3294   Ljava/io/IOException;
        //  2678   2698   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2678   2698   3281   3294   Ljava/io/IOException;
        //  2703   2716   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2703   2716   3281   3294   Ljava/io/IOException;
        //  2821   2847   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2821   2847   3281   3294   Ljava/io/IOException;
        //  2852   2865   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2852   2865   3281   3294   Ljava/io/IOException;
        //  2868   2881   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2868   2881   3281   3294   Ljava/io/IOException;
        //  2884   2892   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2884   2892   3281   3294   Ljava/io/IOException;
        //  2897   2910   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2897   2910   3281   3294   Ljava/io/IOException;
        //  2913   2926   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2913   2926   3281   3294   Ljava/io/IOException;
        //  2929   2937   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2929   2937   3281   3294   Ljava/io/IOException;
        //  2953   2968   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2953   2968   3281   3294   Ljava/io/IOException;
        //  2972   2983   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  2972   2983   3281   3294   Ljava/io/IOException;
        //  3029   3107   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  3029   3107   3281   3294   Ljava/io/IOException;
        //  3125   3175   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  3125   3175   3281   3294   Ljava/io/IOException;
        //  3178   3184   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  3178   3184   3281   3294   Ljava/io/IOException;
        //  3233   3250   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  3233   3250   3281   3294   Ljava/io/IOException;
        //  3268   3281   3294   3315   Lorg/xmlpull/v1/XmlPullParserException;
        //  3268   3281   3281   3294   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1471, Size: 1471
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
