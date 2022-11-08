import java.io.InputStream;
import android.net.Uri;
import androidx.media3.common.DrmInitData$SchemeData;
import android.util.Base64;
import java.util.UUID;
import android.util.Pair;
import java.util.ArrayList;
import java.util.regex.Matcher;
import android.text.TextUtils;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bji extends DefaultHandler implements brp
{
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    private static final int[] d;
    private final XmlPullParserFactory e;
    
    static {
        a = Pattern.compile("(\\d+)(?:/(\\d+))?");
        b = Pattern.compile("CC([1-4])=.*");
        c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
        d = new int[] { -1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14 };
    }
    
    public bji() {
        try {
            this.e = XmlPullParserFactory.newInstance();
        }
        catch (final XmlPullParserException ex) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", (Throwable)ex);
        }
    }
    
    protected static final adec A(final XmlPullParser xmlPullParser, String s, final adec adec) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, s);
        if (attributeValue != null) {
            final String[] array = new String[5];
            final int[] array2 = new int[4];
            final String[] array3 = new String[4];
            array[0] = "";
            int i = 0;
            int n = 0;
            while (i < attributeValue.length()) {
                final int index = attributeValue.indexOf("$", i);
                final int n2 = -1;
                if (index == -1) {
                    array[n] = String.valueOf(array[n]).concat(String.valueOf(attributeValue.substring(i)));
                    i = attributeValue.length();
                }
                else if (index != i) {
                    array[n] = String.valueOf(array[n]).concat(String.valueOf(attributeValue.substring(i, index)));
                    i = index;
                }
                else if (attributeValue.startsWith("$$", i)) {
                    array[n] = String.valueOf(array[n]).concat("$");
                    i += 2;
                }
                else {
                    ++i;
                    final int index2 = attributeValue.indexOf("$", i);
                    s = attributeValue.substring(i, index2);
                    if (s.equals("RepresentationID")) {
                        array2[n] = 1;
                    }
                    else {
                        final int index3 = s.indexOf("%0");
                        String s3;
                        if (index3 != -1) {
                            final String s2 = s3 = s.substring(index3);
                            if (!s2.endsWith("d")) {
                                s3 = s2;
                                if (!s2.endsWith("x")) {
                                    s3 = s2;
                                    if (!s2.endsWith("X")) {
                                        s3 = String.valueOf(s2).concat("d");
                                    }
                                }
                            }
                            s = s.substring(0, index3);
                        }
                        else {
                            s3 = "%01d";
                        }
                        final int hashCode = s.hashCode();
                        int n3;
                        if (hashCode != -1950496919) {
                            if (hashCode != 2606829) {
                                if (hashCode != 38199441) {
                                    n3 = n2;
                                }
                                else {
                                    n3 = n2;
                                    if (s.equals("Bandwidth")) {
                                        n3 = 1;
                                    }
                                }
                            }
                            else {
                                n3 = n2;
                                if (s.equals("Time")) {
                                    n3 = 2;
                                }
                            }
                        }
                        else {
                            n3 = n2;
                            if (s.equals("Number")) {
                                n3 = 0;
                            }
                        }
                        if (n3 != 0) {
                            if (n3 != 1) {
                                if (n3 != 2) {
                                    throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                                }
                                array2[n] = 4;
                            }
                            else {
                                array2[n] = 3;
                            }
                        }
                        else {
                            array2[n] = 2;
                        }
                        array3[n] = s3;
                    }
                    ++n;
                    array[n] = "";
                    i = index2 + 1;
                }
            }
            return new adec(array, array2, array3, n);
        }
        return adec;
    }
    
    private static int B(final int n, final int n2) {
        if (n == -1) {
            return n2;
        }
        if (n2 == -1) {
            return n;
        }
        dk.h(n == n2);
        return n;
    }
    
    private static long C(long n, final long n2) {
        if (n2 != -9223372036854775807L) {
            n = n2;
        }
        if (n == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return n;
    }
    
    private static final long D(final List list, long n, final long n2, int n3, final long n4) {
        if (n3 >= 0) {
            ++n3;
        }
        else {
            n3 = (int)baw.q(n4 - n, n2);
        }
        for (int i = 0; i < n3; ++i) {
            list.add(new bjs(n, n2));
            n += n2;
        }
        return n;
    }
    
    protected static float b(final XmlPullParser xmlPullParser, final float n) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "frameRate");
        float n2 = n;
        if (attributeValue != null) {
            final Matcher matcher = bji.a.matcher(attributeValue);
            n2 = n;
            if (matcher.matches()) {
                final int int1 = Integer.parseInt(matcher.group(1));
                final String group = matcher.group(2);
                if (!TextUtils.isEmpty((CharSequence)group)) {
                    n2 = int1 / (float)Integer.parseInt(group);
                }
                else {
                    n2 = (float)int1;
                }
            }
        }
        return n2;
    }
    
    protected static int c(final XmlPullParser xmlPullParser, final String s, final int n) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, s);
        if (attributeValue == null) {
            return n;
        }
        return Integer.parseInt(attributeValue);
    }
    
    protected static long d(final XmlPullParser xmlPullParser, String s, long n) {
        s = xmlPullParser.getAttributeValue((String)null, s);
        if (s == null) {
            return n;
        }
        final Matcher matcher = baw.f.matcher(s);
        if (matcher.matches()) {
            final boolean empty = TextUtils.isEmpty((CharSequence)matcher.group(1));
            s = matcher.group(3);
            double double1 = 0.0;
            double n2;
            if (s != null) {
                n2 = Double.parseDouble(s) * 3.1556908E7;
            }
            else {
                n2 = 0.0;
            }
            s = matcher.group(5);
            double n3;
            if (s != null) {
                n3 = Double.parseDouble(s) * 2629739.0;
            }
            else {
                n3 = 0.0;
            }
            s = matcher.group(7);
            double n4;
            if (s != null) {
                n4 = Double.parseDouble(s) * 86400.0;
            }
            else {
                n4 = 0.0;
            }
            s = matcher.group(10);
            double n5;
            if (s != null) {
                n5 = Double.parseDouble(s) * 3600.0;
            }
            else {
                n5 = 0.0;
            }
            s = matcher.group(12);
            double n6;
            if (s != null) {
                n6 = Double.parseDouble(s) * 60.0;
            }
            else {
                n6 = 0.0;
            }
            final String group = matcher.group(14);
            if (group != null) {
                double1 = Double.parseDouble(group);
            }
            n = (long)((n2 + n3 + n4 + n5 + n6 + double1) * 1000.0);
            if (true ^ empty) {
                return -n;
            }
        }
        else {
            n = (long)(Double.parseDouble(s) * 3600.0 * 1000.0);
        }
        return n;
    }
    
    protected static long e(final XmlPullParser xmlPullParser, final String s, final long n) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, s);
        if (attributeValue == null) {
            return n;
        }
        return Long.parseLong(attributeValue);
    }
    
    protected static bjj g(final XmlPullParser xmlPullParser, final String s) {
        final String h = h(xmlPullParser, "schemeIdUri", "");
        final String h2 = h(xmlPullParser, "value", null);
        final String h3 = h(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!ef.h(xmlPullParser, s));
        return new bjj(h, h2, h3);
    }
    
    protected static String h(final XmlPullParser xmlPullParser, final String s, final String s2) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, s);
        if (attributeValue == null) {
            return s2;
        }
        return attributeValue;
    }
    
    protected static String i(final XmlPullParser xmlPullParser, final String s) {
        String s2 = "";
        String text;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            }
            else {
                j(xmlPullParser);
                text = s2;
            }
            s2 = text;
        } while (!ef.h(xmlPullParser, s));
        return text;
    }
    
    public static void j(final XmlPullParser xmlPullParser) {
        if (ef.i(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (ef.i(xmlPullParser)) {
                    ++i;
                }
                else {
                    if (!ef.g(xmlPullParser)) {
                        continue;
                    }
                    --i;
                }
            }
        }
    }
    
    protected static final int k(final XmlPullParser xmlPullParser) {
        final String h = h(xmlPullParser, "schemeIdUri", null);
        final int hashCode = h.hashCode();
        final int n = 6;
        int n2 = 0;
        int n3 = 0;
        Label_0199: {
            switch (hashCode) {
                case 2036691300: {
                    if (h.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                        n3 = 6;
                        break Label_0199;
                    }
                    break;
                }
                case 312179081: {
                    if (h.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                        n3 = 4;
                        break Label_0199;
                    }
                    break;
                }
                case -79006963: {
                    if (h.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                        n3 = 2;
                        break Label_0199;
                    }
                    break;
                }
                case -986633423: {
                    if (h.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                        n3 = 1;
                        break Label_0199;
                    }
                    break;
                }
                case -1138141449: {
                    if (h.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                        n3 = 5;
                        break Label_0199;
                    }
                    break;
                }
                case -1352850286: {
                    if (h.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                        n3 = 0;
                        break Label_0199;
                    }
                    break;
                }
                case -2128649360: {
                    if (h.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                        n3 = 3;
                        break Label_0199;
                    }
                    break;
                }
            }
            n3 = -1;
        }
        while (true) {
            Label_0244: {
                int n4 = 0;
                switch (n3) {
                    case 5:
                    case 6: {
                        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "value");
                        if (attributeValue == null) {
                            break Label_0244;
                        }
                        final String w = aeda.w(attributeValue);
                        Label_0383: {
                            switch (w.hashCode()) {
                                case 3133436: {
                                    if (w.equals("fa01")) {
                                        n2 = 3;
                                        break Label_0383;
                                    }
                                    break;
                                }
                                case 3094035: {
                                    if (w.equals("f801")) {
                                        n2 = 2;
                                        break Label_0383;
                                    }
                                    break;
                                }
                                case 2937391: {
                                    if (w.equals("a000")) {
                                        n2 = 1;
                                        break Label_0383;
                                    }
                                    break;
                                }
                                case 1596796: {
                                    if (w.equals("4000")) {
                                        break Label_0383;
                                    }
                                    break;
                                }
                            }
                            n2 = -1;
                        }
                        if (n2 == 0) {
                            n4 = 1;
                            break;
                        }
                        if (n2 == 1) {
                            n4 = 2;
                            break;
                        }
                        n4 = n;
                        if (n2 == 2) {
                            break;
                        }
                        if (n2 != 3) {
                            break Label_0244;
                        }
                        n4 = 8;
                        break;
                    }
                    case 4: {
                        final String attributeValue2 = xmlPullParser.getAttributeValue((String)null, "value");
                        if (attributeValue2 == null) {
                            break Label_0244;
                        }
                        if ((n4 = Integer.bitCount(Integer.parseInt(attributeValue2, 16))) == 0) {
                            break Label_0244;
                        }
                        break;
                    }
                    case 2:
                    case 3: {
                        final int c = c(xmlPullParser, "value", -1);
                        if (c <= 0) {
                            break Label_0244;
                        }
                        if ((n4 = c) >= 33) {
                            break Label_0244;
                        }
                        break;
                    }
                    case 1: {
                        final int c2 = c(xmlPullParser, "value", -1);
                        if (c2 < 0) {
                            break Label_0244;
                        }
                        final int[] d = bji.d;
                        final int length = d.length;
                        if (c2 < 21) {
                            n4 = d[c2];
                            break;
                        }
                        break Label_0244;
                    }
                    case 0: {
                        n4 = c(xmlPullParser, "value", -1);
                        break;
                    }
                }
                do {
                    xmlPullParser.next();
                } while (!ef.h(xmlPullParser, "AudioChannelConfiguration"));
                return n4;
            }
            int n4 = -1;
            continue;
        }
    }
    
    protected static final long l(final XmlPullParser xmlPullParser, final long n) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return n;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long)(Float.parseFloat(attributeValue) * 1000000.0f);
    }
    
    protected static final List m(final XmlPullParser xmlPullParser, final List list, final boolean b) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "dvb:priority");
        int int1;
        if (attributeValue != null) {
            int1 = Integer.parseInt(attributeValue);
        }
        else if (b) {
            int1 = 1;
        }
        else {
            int1 = Integer.MIN_VALUE;
        }
        final String attributeValue2 = xmlPullParser.getAttributeValue((String)null, "dvb:weight");
        int int2;
        if (attributeValue2 != null) {
            int2 = Integer.parseInt(attributeValue2);
        }
        else {
            int2 = 1;
        }
        final String attributeValue3 = xmlPullParser.getAttributeValue((String)null, "serviceLocation");
        final String i = i(xmlPullParser, "BaseURL");
        int j = 0;
        if (i != null && dl.p(i)[0] != -1) {
            String s;
            if ((s = attributeValue3) == null) {
                s = i;
            }
            return adwd.an(new bjf(i, s, int1, int2));
        }
        final ArrayList list2 = new ArrayList();
        int c = int1;
        while (j < list.size()) {
            final bjf bjf = list.get(j);
            final String o = dl.o(bjf.a, i);
            String b2;
            if (attributeValue3 == null) {
                b2 = o;
            }
            else {
                b2 = attributeValue3;
            }
            int d = int2;
            if (b) {
                c = bjf.c;
                d = bjf.d;
                b2 = bjf.b;
            }
            list2.add(new bjf(o, b2, c, d));
            ++j;
            int2 = d;
        }
        return list2;
    }
    
    protected static final Pair n(final XmlPullParser xmlPullParser) {
        final Object o = null;
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "schemeIdUri");
    Label_0363:
        while (true) {
            String s2 = null;
            byte[] array2 = null;
            Label_0353: {
                Label_0348: {
                    Label_0345: {
                        if (attributeValue == null) {
                            break Label_0345;
                        }
                        final String w = aeda.w(attributeValue);
                        int n = 0;
                        Label_0133: {
                            switch (w.hashCode()) {
                                case 1812765994: {
                                    if (w.equals("urn:mpeg:dash:mp4protection:2011")) {
                                        n = 0;
                                        break Label_0133;
                                    }
                                    break;
                                }
                                case 755418770: {
                                    if (w.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                                        n = 2;
                                        break Label_0133;
                                    }
                                    break;
                                }
                                case 489446379: {
                                    if (w.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                                        n = 1;
                                        break Label_0133;
                                    }
                                    break;
                                }
                                case -1980789791: {
                                    if (w.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                                        n = 3;
                                        break Label_0133;
                                    }
                                    break;
                                }
                            }
                            n = -1;
                        }
                        if (n != 0) {
                            UUID uuid;
                            if (n != 1) {
                                if (n != 2) {
                                    if (n != 3) {
                                        break Label_0345;
                                    }
                                    uuid = axy.c;
                                }
                                else {
                                    uuid = axy.d;
                                }
                            }
                            else {
                                uuid = axy.e;
                            }
                            final Object b = uuid;
                            break Label_0348;
                        }
                        final String attributeValue2 = xmlPullParser.getAttributeValue((String)null, "value");
                        final int attributeCount = xmlPullParser.getAttributeCount();
                        int i = 0;
                        Object b;
                        byte[] d;
                        Object o2;
                        String s;
                        while (true) {
                            while (i < attributeCount) {
                                if (ef.f(xmlPullParser.getAttributeName(i)).equals("default_KID")) {
                                    final String attributeValue3 = xmlPullParser.getAttributeValue(i);
                                    if (!TextUtils.isEmpty((CharSequence)attributeValue3) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue3)) {
                                        final String[] split = attributeValue3.split("\\s+");
                                        final UUID[] array = new UUID[split.length];
                                        for (int j = 0; j < split.length; ++j) {
                                            array[j] = UUID.fromString(split[j]);
                                        }
                                        d = byl.d(axy.b, array, null);
                                        b = axy.b;
                                        o2 = null;
                                        s = attributeValue2;
                                        break Label_0363;
                                    }
                                    s2 = attributeValue2;
                                    b = (array2 = null);
                                    break Label_0353;
                                }
                                else {
                                    ++i;
                                }
                            }
                            final String attributeValue3 = null;
                            continue;
                        }
                        Object o3;
                        Object o4;
                        byte[] array3;
                        do {
                            xmlPullParser.next();
                            if (ef.j(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                                o3 = xmlPullParser.getText();
                                o4 = b;
                                array3 = d;
                            }
                            else if (ef.j(xmlPullParser, "ms:laurl")) {
                                o3 = xmlPullParser.getAttributeValue((String)null, "licenseUrl");
                                o4 = b;
                                array3 = d;
                            }
                            else if (d == null && ef.i(xmlPullParser) && ef.f(xmlPullParser.getName()).equals("pssh") && xmlPullParser.next() == 4) {
                                array3 = Base64.decode(xmlPullParser.getText(), 0);
                                final UUID b2 = byl.b(array3);
                                if (b2 == null) {
                                    bao.c("MpdParser", "Skipping malformed cenc:pssh data");
                                    array3 = null;
                                    o4 = b2;
                                    o3 = o2;
                                }
                                else {
                                    o4 = b2;
                                    o3 = o2;
                                }
                            }
                            else if (d == null && axy.e.equals(b) && ef.j(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                                array3 = byl.c(axy.e, Base64.decode(xmlPullParser.getText(), 0));
                                o4 = b;
                                o3 = o2;
                            }
                            else {
                                j(xmlPullParser);
                                o3 = o2;
                                array3 = d;
                                o4 = b;
                            }
                            b = o4;
                            d = array3;
                            o2 = o3;
                        } while (!ef.h(xmlPullParser, "ContentProtection"));
                        Object o5 = o;
                        if (o4 != null) {
                            o5 = new DrmInitData$SchemeData((UUID)o4, (String)o3, "video/mp4", array3);
                        }
                        return Pair.create((Object)s, o5);
                    }
                    Object b = null;
                }
                s2 = null;
                array2 = null;
            }
            Object o2 = array2;
            byte[] d = array2;
            String s = s2;
            continue Label_0363;
        }
    }
    
    protected static final int o(final XmlPullParser xmlPullParser) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "contentType");
        final boolean empty = TextUtils.isEmpty((CharSequence)attributeValue);
        int n = -1;
        if (!empty) {
            if ("audio".equals(attributeValue)) {
                n = 1;
            }
            else if ("video".equals(attributeValue)) {
                n = 2;
            }
            else if ("text".equals(attributeValue)) {
                return 3;
            }
        }
        return n;
    }
    
    protected static long p(final XmlPullParser xmlPullParser, final String s) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, s);
        if (attributeValue == null) {
            return -9223372036854775807L;
        }
        return baw.x(attributeValue);
    }
    
    protected static float q(final XmlPullParser xmlPullParser, final String s) {
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, s);
        if (attributeValue == null) {
            return -3.4028235E38f;
        }
        return Float.parseFloat(attributeValue);
    }
    
    protected static final bjl r(final XmlPullParser xmlPullParser, String attributeValue, final String s) {
        attributeValue = xmlPullParser.getAttributeValue((String)null, attributeValue);
        final String attributeValue2 = xmlPullParser.getAttributeValue((String)null, s);
        long long1;
        if (attributeValue2 != null) {
            final String[] split = attributeValue2.split("-");
            final long n = long1 = Long.parseLong(split[0]);
            if (split.length == 2) {
                final long n2 = Long.parseLong(split[1]) - n + 1L;
                long1 = n;
                final long n3 = n2;
                return new bjl(attributeValue, long1, n3);
            }
        }
        else {
            long1 = 0L;
        }
        final long n3 = -1L;
        return new bjl(attributeValue, long1, n3);
    }
    
    protected static final int s(final String s) {
        if (s == null) {
            return 0;
        }
        int n = 0;
        Label_0331: {
            switch (s.hashCode()) {
                case 1855372047: {
                    if (s.equals("supplementary")) {
                        n = 2;
                        break Label_0331;
                    }
                    break;
                }
                case 1629013393: {
                    if (s.equals("emergency")) {
                        n = 5;
                        break Label_0331;
                    }
                    break;
                }
                case 899152809: {
                    if (s.equals("commentary")) {
                        n = 3;
                        break Label_0331;
                    }
                    break;
                }
                case 552573414: {
                    if (s.equals("caption")) {
                        n = 6;
                        break Label_0331;
                    }
                    break;
                }
                case 3530173: {
                    if (s.equals("sign")) {
                        n = 10;
                        break Label_0331;
                    }
                    break;
                }
                case 3343801: {
                    if (s.equals("main")) {
                        n = 0;
                        break Label_0331;
                    }
                    break;
                }
                case 99825: {
                    if (s.equals("dub")) {
                        n = 4;
                        break Label_0331;
                    }
                    break;
                }
                case -1396432756: {
                    if (s.equals("forced-subtitle")) {
                        n = 8;
                        break Label_0331;
                    }
                    break;
                }
                case -1408024454: {
                    if (s.equals("alternate")) {
                        n = 1;
                        break Label_0331;
                    }
                    break;
                }
                case -1574842690: {
                    if (s.equals("forced_subtitle")) {
                        n = 7;
                        break Label_0331;
                    }
                    break;
                }
                case -1580883024: {
                    if (s.equals("enhanced-audio-intelligibility")) {
                        n = 12;
                        break Label_0331;
                    }
                    break;
                }
                case -1724546052: {
                    if (s.equals("description")) {
                        n = 11;
                        break Label_0331;
                    }
                    break;
                }
                case -2060497896: {
                    if (s.equals("subtitle")) {
                        n = 9;
                        break Label_0331;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                return 0;
            }
            case 12: {
                return 2048;
            }
            case 11: {
                return 512;
            }
            case 10: {
                return 256;
            }
            case 7:
            case 8:
            case 9: {
                return 128;
            }
            case 6: {
                return 64;
            }
            case 5: {
                return 32;
            }
            case 4: {
                return 16;
            }
            case 3: {
                return 8;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    protected static final int t(final List list) {
        int i = 0;
        int n = 0;
        while (i < list.size()) {
            int n2 = n;
            if (aeda.y((CharSequence)"http://dashif.org/guidelines/trickmode", (CharSequence)((bjj)list.get(i)).a)) {
                n2 = (n | 0x4000);
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    protected static final ayf u(final String a, String j, int i, final int n, final float r, final int x, final int y, final int g, final String c, final List list, final List list2, String h, final List list3, final List list4) {
        String s = null;
        Label_0100: {
            if (ayy.i(j)) {
                s = ayy.c(h);
            }
            else if (ayy.m(j)) {
                s = ayy.f(h);
            }
            else {
                if (!ayy.l(j)) {
                    if (!ayy.j(j)) {
                        if (!"application/mp4".equals(j)) {
                            s = null;
                            break Label_0100;
                        }
                        if ("text/vtt".equals(s = ayy.d(h))) {
                            s = "application/x-mp4-vtt";
                        }
                        break Label_0100;
                    }
                }
                s = j;
            }
        }
        String k = null;
        Label_0255: {
            String s3;
            if ("audio/eac3".equals(s)) {
                int n2 = 0;
                String s2;
                while (true) {
                    final int size = list4.size();
                    s2 = "ec+3";
                    if (n2 >= size) {
                        k = "audio/eac3";
                        break;
                    }
                    final bjj bjj = list4.get(n2);
                    final String a2 = bjj.a;
                    if (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(a2) && "JOC".equals(bjj.b)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(a2) && "ec+3".equals(bjj.b))) {
                        k = "audio/eac3-joc";
                        break;
                    }
                    ++n2;
                }
                s3 = k;
                if ("audio/eac3-joc".equals(k)) {
                    h = s2;
                    break Label_0255;
                }
            }
            else {
                s3 = s;
            }
            k = s3;
        }
        int l = 0;
        int d = 0;
        while (l < list.size()) {
            final bjj bjj2 = list.get(l);
            int n3 = d;
            if (aeda.y((CharSequence)"urn:mpeg:dash:role:2011", (CharSequence)bjj2.a)) {
                final String b = bjj2.b;
                int n5 = 0;
                Label_0403: {
                    if (b != null) {
                        final int hashCode = b.hashCode();
                        int n4 = 0;
                        Label_0386: {
                            if (hashCode != -1574842690) {
                                if (hashCode == -1396432756) {
                                    if (b.equals("forced-subtitle")) {
                                        n4 = 1;
                                        break Label_0386;
                                    }
                                }
                            }
                            else if (b.equals("forced_subtitle")) {
                                n4 = 0;
                                break Label_0386;
                            }
                            n4 = -1;
                        }
                        if (n4 == 0 || n4 == 1) {
                            n5 = 2;
                            break Label_0403;
                        }
                    }
                    n5 = 0;
                }
                n3 = (d | n5);
            }
            ++l;
            d = n3;
        }
        int n6 = 0;
        int n7 = 0;
        while (n6 < list.size()) {
            final bjj bjj3 = list.get(n6);
            int n8 = n7;
            if (aeda.y((CharSequence)"urn:mpeg:dash:role:2011", (CharSequence)bjj3.a)) {
                n8 = (n7 | s(bjj3.b));
            }
            ++n6;
            n7 = n8;
        }
        int n9 = 0;
        int n10 = 0;
        while (n9 < list2.size()) {
            final bjj bjj4 = list2.get(n9);
            int n11 = 0;
            Label_0733: {
                int s4 = 0;
                Label_0549: {
                    if (aeda.y((CharSequence)"urn:mpeg:dash:role:2011", (CharSequence)bjj4.a)) {
                        s4 = s(bjj4.b);
                    }
                    else {
                        n11 = n10;
                        if (!aeda.y((CharSequence)"urn:tva:metadata:cs:AudioPurposeCS:2007", (CharSequence)bjj4.a)) {
                            break Label_0733;
                        }
                        final String b2 = bjj4.b;
                        if (b2 != null) {
                            switch (b2.hashCode()) {
                                case 54: {
                                    if (b2.equals("6")) {
                                        s4 = 1;
                                        break Label_0549;
                                    }
                                    break;
                                }
                                case 52: {
                                    if (b2.equals("4")) {
                                        s4 = 8;
                                        break Label_0549;
                                    }
                                    break;
                                }
                                case 51: {
                                    if (b2.equals("3")) {
                                        s4 = 4;
                                        break Label_0549;
                                    }
                                    break;
                                }
                                case 50: {
                                    if (b2.equals("2")) {
                                        s4 = 2048;
                                        break Label_0549;
                                    }
                                    break;
                                }
                                case 49: {
                                    if (b2.equals("1")) {
                                        s4 = 512;
                                        break Label_0549;
                                    }
                                    break;
                                }
                            }
                        }
                        s4 = 0;
                    }
                }
                n11 = (n10 | s4);
            }
            ++n9;
            n10 = n11;
        }
        final int t = t(list3);
        final int t2 = t(list4);
        final aye aye = new aye();
        aye.a = a;
        aye.j = j;
        aye.k = k;
        aye.h = h;
        aye.g = g;
        aye.d = d;
        aye.e = (n7 | n10 | t | t2);
        aye.c = c;
        if (ayy.m(k)) {
            aye.p = i;
            aye.q = n;
            aye.r = r;
        }
        else if (ayy.i(k)) {
            aye.x = x;
            aye.y = y;
        }
        else if (ayy.l(k)) {
            Label_1114: {
                if ("application/cea-608".equals(k)) {
                    bjj bjj5;
                    Matcher matcher;
                    for (i = 0; i < list2.size(); ++i) {
                        bjj5 = list2.get(i);
                        if ("urn:scte:dash:cc:cea-608:2015".equals(bjj5.a)) {
                            j = bjj5.b;
                            if (j != null) {
                                matcher = bji.b.matcher(j);
                                if (matcher.matches()) {
                                    i = Integer.parseInt(matcher.group(1));
                                    break Label_1114;
                                }
                                bao.c("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(String.valueOf(bjj5.b)));
                            }
                        }
                    }
                }
                else if ("application/cea-708".equals(k)) {
                    bjj bjj6;
                    Matcher matcher2;
                    for (i = 0; i < list2.size(); ++i) {
                        bjj6 = list2.get(i);
                        if ("urn:scte:dash:cc:cea-708:2015".equals(bjj6.a)) {
                            j = bjj6.b;
                            if (j != null) {
                                matcher2 = bji.c.matcher(j);
                                if (matcher2.matches()) {
                                    i = Integer.parseInt(matcher2.group(1));
                                    break Label_1114;
                                }
                                bao.c("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(String.valueOf(bjj6.b)));
                            }
                        }
                    }
                }
                i = -1;
            }
            aye.C = i;
        }
        else if (ayy.j(k)) {
            aye.p = i;
            aye.q = n;
        }
        return aye.a();
    }
    
    protected static final bjl v(final XmlPullParser xmlPullParser) {
        return r(xmlPullParser, "sourceURL", "range");
    }
    
    protected static final List w(final XmlPullParser xmlPullParser, final long n, final long n2) {
        final ArrayList list = new ArrayList();
        long n3 = 0L;
        long n4 = -9223372036854775807L;
        int n5 = 0;
        int n6 = 0;
        long e2;
        int c;
        int n8;
        long n9;
        do {
            xmlPullParser.next();
            if (ef.j(xmlPullParser, "S")) {
                final long e = e(xmlPullParser, "t", -9223372036854775807L);
                long d = n3;
                if (n5 != 0) {
                    d = D(list, n3, n4, n6, e);
                }
                long n7;
                if (e != -9223372036854775807L) {
                    n7 = e;
                }
                else {
                    n7 = d;
                }
                e2 = e(xmlPullParser, "d", -9223372036854775807L);
                c = c(xmlPullParser, "r", 0);
                n8 = 1;
                n9 = n7;
            }
            else {
                j(xmlPullParser);
                c = n6;
                e2 = n4;
                n9 = n3;
                n8 = n5;
            }
            n5 = n8;
            n3 = n9;
            n4 = e2;
            n6 = c;
        } while (!ef.h(xmlPullParser, "SegmentTimeline"));
        if (n8 != 0) {
            D(list, n9, e2, c, baw.y(n2, n, 1000L));
        }
        return list;
    }
    
    protected static final bjt x(final XmlPullParser xmlPullParser, final bjt bjt) {
        long i;
        if (bjt != null) {
            i = bjt.i;
        }
        else {
            i = 1L;
        }
        final long e = e(xmlPullParser, "timescale", i);
        long b = 0L;
        long j;
        if (bjt != null) {
            j = bjt.j;
        }
        else {
            j = 0L;
        }
        final long e2 = e(xmlPullParser, "presentationTimeOffset", j);
        long n;
        if (bjt != null) {
            n = bjt.a;
        }
        else {
            n = 0L;
        }
        if (bjt != null) {
            b = bjt.b;
        }
        bjl h = null;
        final String attributeValue = xmlPullParser.getAttributeValue((String)null, "indexRange");
        if (attributeValue != null) {
            final String[] split = attributeValue.split("-");
            n = Long.parseLong(split[0]);
            b = Long.parseLong(split[1]) - n + 1L;
        }
        if (bjt != null) {
            h = bjt.h;
        }
        bjl v;
        do {
            xmlPullParser.next();
            if (ef.j(xmlPullParser, "Initialization")) {
                v = v(xmlPullParser);
            }
            else {
                j(xmlPullParser);
                v = h;
            }
            h = v;
        } while (!ef.h(xmlPullParser, "SegmentBase"));
        return new bjt(v, e, e2, n, b);
    }
    
    protected static final bjq y(final XmlPullParser xmlPullParser, final bjq bjq, final long n, final long n2, long c, final long n3, final long n4) {
        final long n5 = 1L;
        long i;
        if (bjq != null) {
            i = bjq.i;
        }
        else {
            i = 1L;
        }
        final long e = e(xmlPullParser, "timescale", i);
        long j;
        if (bjq != null) {
            j = bjq.j;
        }
        else {
            j = 0L;
        }
        final long e2 = e(xmlPullParser, "presentationTimeOffset", j);
        long b;
        if (bjq != null) {
            b = bjq.b;
        }
        else {
            b = -9223372036854775807L;
        }
        final long e3 = e(xmlPullParser, "duration", b);
        long a = n5;
        if (bjq != null) {
            a = bjq.a;
        }
        final long e4 = e(xmlPullParser, "startNumber", a);
        c = C(c, n3);
        List list = null;
        bjl bjl;
        Object o = bjl = null;
        bjl bjl2;
        List list2;
        Object o2;
        do {
            xmlPullParser.next();
            if (ef.j(xmlPullParser, "Initialization")) {
                bjl2 = v(xmlPullParser);
                list2 = list;
                o2 = o;
            }
            else if (ef.j(xmlPullParser, "SegmentTimeline")) {
                list2 = w(xmlPullParser, e, n2);
                o2 = o;
                bjl2 = bjl;
            }
            else if (ef.j(xmlPullParser, "SegmentURL")) {
                if ((o2 = o) == null) {
                    o2 = new ArrayList<bjl>();
                }
                ((List<bjl>)o2).add(r(xmlPullParser, "media", "mediaRange"));
                list2 = list;
                bjl2 = bjl;
            }
            else {
                j(xmlPullParser);
                bjl2 = bjl;
                o2 = o;
                list2 = list;
            }
            list = list2;
            o = o2;
            bjl = bjl2;
        } while (!ef.h(xmlPullParser, "SegmentList"));
        List list3 = list2;
        List<bjl> e5 = (List<bjl>)o2;
        bjl bjl3 = bjl2;
        if (bjq != null) {
            if (bjl2 == null) {
                bjl2 = bjq.h;
            }
            if (list2 == null) {
                list2 = bjq.c;
            }
            if (o2 != null) {
                list3 = list2;
                e5 = (List<bjl>)o2;
                bjl3 = bjl2;
            }
            else {
                e5 = bjq.e;
                bjl3 = bjl2;
                list3 = list2;
            }
        }
        return new bjq(bjl3, e, e2, e4, e3, list3, c, (List)e5, baw.w(n4), baw.w(n));
    }
    
    protected static final bjr z(final XmlPullParser xmlPullParser, final bjr bjr, final List list, final long n, final long n2, long c, final long n3, final long n4) {
        final long n5 = 1L;
        long i;
        if (bjr != null) {
            i = bjr.i;
        }
        else {
            i = 1L;
        }
        final long e = e(xmlPullParser, "timescale", i);
        long j;
        if (bjr != null) {
            j = bjr.j;
        }
        else {
            j = 0L;
        }
        final long e2 = e(xmlPullParser, "presentationTimeOffset", j);
        long b;
        if (bjr != null) {
            b = bjr.b;
        }
        else {
            b = -9223372036854775807L;
        }
        final long e3 = e(xmlPullParser, "duration", b);
        long a = n5;
        if (bjr != null) {
            a = bjr.a;
        }
        final long e4 = e(xmlPullParser, "startNumber", a);
        while (true) {
            for (int k = 0; k < list.size(); ++k) {
                final bjj bjj = list.get(k);
                if (aeda.y((CharSequence)"http://dashif.org/guidelines/last-segment-number", (CharSequence)bjj.a)) {
                    final long long1 = Long.parseLong(bjj.b);
                    c = C(c, n3);
                    List list2 = null;
                    adec g;
                    if (bjr != null) {
                        g = bjr.g;
                    }
                    else {
                        g = null;
                    }
                    final adec a2 = A(xmlPullParser, "media", g);
                    adec f;
                    if (bjr != null) {
                        f = bjr.f;
                    }
                    else {
                        f = null;
                    }
                    final adec a3 = A(xmlPullParser, "initialization", f);
                    bjl bjl = null;
                    bjl bjl2;
                    List w;
                    do {
                        xmlPullParser.next();
                        if (ef.j(xmlPullParser, "Initialization")) {
                            bjl2 = v(xmlPullParser);
                            w = list2;
                        }
                        else if (ef.j(xmlPullParser, "SegmentTimeline")) {
                            w = w(xmlPullParser, e, n2);
                            bjl2 = bjl;
                        }
                        else {
                            j(xmlPullParser);
                            bjl2 = bjl;
                            w = list2;
                        }
                        list2 = w;
                        bjl = bjl2;
                    } while (!ef.h(xmlPullParser, "SegmentTemplate"));
                    List c2 = w;
                    bjl bjl3 = bjl2;
                    if (bjr != null) {
                        if (bjl2 == null) {
                            bjl2 = bjr.h;
                        }
                        if (w != null) {
                            c2 = w;
                            bjl3 = bjl2;
                        }
                        else {
                            c2 = bjr.c;
                            bjl3 = bjl2;
                        }
                    }
                    return new bjr(bjl3, e, e2, e4, long1, e3, c2, c, a3, a2, baw.w(n4), baw.w(n), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                }
            }
            final long long1 = -1L;
            continue;
        }
    }
    
    public final bjg f(final Uri p0, final InputStream p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: ldc_w           "ServiceDescription"
        //     7: astore          4
        //     9: ldc_w           "ProgramInformation"
        //    12: astore          5
        //    14: ldc             "id"
        //    16: astore          6
        //    18: ldc_w           "BaseURL"
        //    21: astore          7
        //    23: aload_0        
        //    24: getfield        bji.e:Lorg/xmlpull/v1/XmlPullParserFactory;
        //    27: invokevirtual   org/xmlpull/v1/XmlPullParserFactory.newPullParser:()Lorg/xmlpull/v1/XmlPullParser;
        //    30: astore          8
        //    32: aload           8
        //    34: aload_2        
        //    35: aconst_null    
        //    36: invokeinterface org/xmlpull/v1/XmlPullParser.setInput:(Ljava/io/InputStream;Ljava/lang/String;)V
        //    41: aload           8
        //    43: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //    48: iconst_2       
        //    49: if_icmpne       5854
        //    52: ldc_w           "MPD"
        //    55: aload           8
        //    57: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //    62: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    65: ifeq            5854
        //    68: iconst_0       
        //    69: anewarray       Ljava/lang/String;
        //    72: astore_2       
        //    73: aload           8
        //    75: aconst_null    
        //    76: ldc_w           "profiles"
        //    79: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    84: astore          9
        //    86: aload           9
        //    88: ifnull          100
        //    91: aload           9
        //    93: ldc_w           ","
        //    96: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    99: astore_2       
        //   100: aload_2        
        //   101: arraylength    
        //   102: istore          10
        //   104: iconst_0       
        //   105: istore          11
        //   107: iload           11
        //   109: iload           10
        //   111: if_icmpge       143
        //   114: aload_2        
        //   115: iload           11
        //   117: aaload         
        //   118: astore          9
        //   120: aload           9
        //   122: ldc_w           "urn:dvb:dash:profile:dvb-dash:"
        //   125: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   128: ifeq            137
        //   131: iconst_1       
        //   132: istore          12
        //   134: goto            146
        //   137: iinc            11, 1
        //   140: goto            107
        //   143: iconst_0       
        //   144: istore          12
        //   146: aload           8
        //   148: ldc_w           "availabilityStartTime"
        //   151: invokestatic    bji.p:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)J
        //   154: lstore          13
        //   156: aload           8
        //   158: ldc_w           "mediaPresentationDuration"
        //   161: ldc2_w          -9223372036854775807
        //   164: invokestatic    bji.d:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //   167: lstore          15
        //   169: aload           8
        //   171: ldc_w           "minBufferTime"
        //   174: ldc2_w          -9223372036854775807
        //   177: invokestatic    bji.d:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //   180: lstore          17
        //   182: aload           8
        //   184: aconst_null    
        //   185: ldc_w           "type"
        //   188: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   193: astore_2       
        //   194: ldc_w           "dynamic"
        //   197: aload_2        
        //   198: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   201: istore          19
        //   203: iload           19
        //   205: ifeq            224
        //   208: aload           8
        //   210: ldc_w           "minimumUpdatePeriod"
        //   213: ldc2_w          -9223372036854775807
        //   216: invokestatic    bji.d:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //   219: lstore          20
        //   221: goto            229
        //   224: ldc2_w          -9223372036854775807
        //   227: lstore          20
        //   229: ldc_w           "SupplementalProperty"
        //   232: astore          22
        //   234: ldc_w           "MPD"
        //   237: astore          23
        //   239: iload           19
        //   241: ifeq            260
        //   244: aload           8
        //   246: ldc_w           "timeShiftBufferDepth"
        //   249: ldc2_w          -9223372036854775807
        //   252: invokestatic    bji.d:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //   255: lstore          24
        //   257: goto            265
        //   260: ldc2_w          -9223372036854775807
        //   263: lstore          24
        //   265: iload           19
        //   267: ifeq            286
        //   270: aload           8
        //   272: ldc_w           "suggestedPresentationDelay"
        //   275: ldc2_w          -9223372036854775807
        //   278: invokestatic    bji.d:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //   281: lstore          26
        //   283: goto            291
        //   286: ldc2_w          -9223372036854775807
        //   289: lstore          26
        //   291: aload           8
        //   293: ldc_w           "publishTime"
        //   296: invokestatic    bji.p:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)J
        //   299: lstore          28
        //   301: iconst_1       
        //   302: iload           19
        //   304: if_icmpeq       315
        //   307: ldc2_w          -9223372036854775807
        //   310: lstore          30
        //   312: goto            318
        //   315: lconst_0       
        //   316: lstore          30
        //   318: new             Lbjf;
        //   321: astore          32
        //   323: aload_1        
        //   324: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   327: astore          9
        //   329: aload_1        
        //   330: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   333: astore_2       
        //   334: iconst_1       
        //   335: iload           12
        //   337: if_icmpeq       348
        //   340: ldc_w           -2147483648
        //   343: istore          11
        //   345: goto            351
        //   348: iconst_1       
        //   349: istore          11
        //   351: aload           32
        //   353: aload           9
        //   355: aload_2        
        //   356: iload           11
        //   358: iconst_1       
        //   359: invokespecial   bjf.<init>:(Ljava/lang/String;Ljava/lang/String;II)V
        //   362: iconst_1       
        //   363: anewarray       Lbjf;
        //   366: dup            
        //   367: iconst_0       
        //   368: aload           32
        //   370: aastore        
        //   371: invokestatic    adwd.an:([Ljava/lang/Object;)Ljava/util/ArrayList;
        //   374: astore          33
        //   376: new             Ljava/util/ArrayList;
        //   379: astore          32
        //   381: aload           32
        //   383: invokespecial   java/util/ArrayList.<init>:()V
        //   386: new             Ljava/util/ArrayList;
        //   389: astore          9
        //   391: aload           9
        //   393: invokespecial   java/util/ArrayList.<init>:()V
        //   396: iconst_1       
        //   397: iload           19
        //   399: if_icmpeq       408
        //   402: lconst_0       
        //   403: lstore          34
        //   405: goto            413
        //   408: ldc2_w          -9223372036854775807
        //   411: lstore          34
        //   413: ldc_w           "EssentialProperty"
        //   416: astore          36
        //   418: aconst_null    
        //   419: astore          37
        //   421: aconst_null    
        //   422: astore          38
        //   424: aconst_null    
        //   425: astore          39
        //   427: aconst_null    
        //   428: astore          40
        //   430: iconst_0       
        //   431: istore          41
        //   433: iconst_0       
        //   434: istore          42
        //   436: aload           5
        //   438: astore_2       
        //   439: aload           8
        //   441: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //   446: pop            
        //   447: aload           8
        //   449: aload           7
        //   451: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //   454: ifeq            534
        //   457: lload           30
        //   459: lstore          43
        //   461: iload           41
        //   463: ifne            475
        //   466: aload           8
        //   468: lload           30
        //   470: invokestatic    bji.l:(Lorg/xmlpull/v1/XmlPullParser;J)J
        //   473: lstore          43
        //   475: aload           9
        //   477: aload           8
        //   479: aload           33
        //   481: iload           12
        //   483: invokestatic    bji.m:(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;
        //   486: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   489: pop            
        //   490: iconst_1       
        //   491: istore          41
        //   493: aload_2        
        //   494: astore          5
        //   496: lload           43
        //   498: lstore          30
        //   500: aload           6
        //   502: astore_2       
        //   503: aload           36
        //   505: astore          45
        //   507: iload           19
        //   509: istore          46
        //   511: aload           5
        //   513: astore          6
        //   515: iload           12
        //   517: istore          19
        //   519: aload           9
        //   521: astore          36
        //   523: iload           46
        //   525: istore          12
        //   527: aload           45
        //   529: astore          9
        //   531: goto            5695
        //   534: aload           8
        //   536: aload_2        
        //   537: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //   540: istore          46
        //   542: ldc_w           "lang"
        //   545: astore          47
        //   547: iload           46
        //   549: ifeq            750
        //   552: aload           8
        //   554: ldc_w           "moreInformationURL"
        //   557: aconst_null    
        //   558: invokestatic    bji.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   561: astore          48
        //   563: aload           8
        //   565: ldc_w           "lang"
        //   568: aconst_null    
        //   569: invokestatic    bji.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   572: astore          49
        //   574: aconst_null    
        //   575: astore          50
        //   577: aconst_null    
        //   578: astore          45
        //   580: aconst_null    
        //   581: astore          5
        //   583: aload           8
        //   585: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //   590: pop            
        //   591: aload           8
        //   593: ldc_w           "Title"
        //   596: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //   599: ifeq            622
        //   602: aload           8
        //   604: invokeinterface org/xmlpull/v1/XmlPullParser.nextText:()Ljava/lang/String;
        //   609: astore          51
        //   611: aload           50
        //   613: astore          52
        //   615: aload           45
        //   617: astore          53
        //   619: goto            701
        //   622: aload           8
        //   624: ldc_w           "Source"
        //   627: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //   630: ifeq            653
        //   633: aload           8
        //   635: invokeinterface org/xmlpull/v1/XmlPullParser.nextText:()Ljava/lang/String;
        //   640: astore          52
        //   642: aload           45
        //   644: astore          53
        //   646: aload           5
        //   648: astore          51
        //   650: goto            701
        //   653: aload           8
        //   655: ldc_w           "Copyright"
        //   658: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //   661: ifeq            684
        //   664: aload           8
        //   666: invokeinterface org/xmlpull/v1/XmlPullParser.nextText:()Ljava/lang/String;
        //   671: astore          53
        //   673: aload           50
        //   675: astore          52
        //   677: aload           5
        //   679: astore          51
        //   681: goto            701
        //   684: aload           8
        //   686: invokestatic    bji.j:(Lorg/xmlpull/v1/XmlPullParser;)V
        //   689: aload           5
        //   691: astore          51
        //   693: aload           45
        //   695: astore          53
        //   697: aload           50
        //   699: astore          52
        //   701: aload           52
        //   703: astore          50
        //   705: aload           53
        //   707: astore          45
        //   709: aload           51
        //   711: astore          5
        //   713: aload           8
        //   715: aload_2        
        //   716: invokestatic    ef.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //   719: ifeq            583
        //   722: new             Lbjk;
        //   725: dup            
        //   726: aload           51
        //   728: aload           52
        //   730: aload           53
        //   732: aload           48
        //   734: aload           49
        //   736: invokespecial   bjk.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   739: astore          40
        //   741: goto            850
        //   744: astore_1       
        //   745: aconst_null    
        //   746: astore_2       
        //   747: goto            5879
        //   750: lload           30
        //   752: lstore          54
        //   754: aload           8
        //   756: ldc_w           "UTCTiming"
        //   759: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //   762: istore          46
        //   764: ldc             "value"
        //   766: astore          5
        //   768: ldc             "schemeIdUri"
        //   770: astore          52
        //   772: iload           46
        //   774: ifeq            823
        //   777: aload           8
        //   779: aconst_null    
        //   780: ldc             "schemeIdUri"
        //   782: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   787: astore          5
        //   789: aload           8
        //   791: aconst_null    
        //   792: ldc             "value"
        //   794: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   799: astore          37
        //   801: new             Lbjx;
        //   804: dup            
        //   805: aload           5
        //   807: aload           37
        //   809: invokespecial   bjx.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   812: astore          37
        //   814: goto            850
        //   817: astore_1       
        //   818: aconst_null    
        //   819: astore_2       
        //   820: goto            5879
        //   823: aload           8
        //   825: ldc_w           "Location"
        //   828: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //   831: ifeq            856
        //   834: aload_1        
        //   835: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   838: aload           8
        //   840: invokeinterface org/xmlpull/v1/XmlPullParser.nextText:()Ljava/lang/String;
        //   845: invokestatic    dl.n:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
        //   848: astore          38
        //   850: aload_2        
        //   851: astore          5
        //   853: goto            500
        //   856: aload           8
        //   858: aload           4
        //   860: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //   863: ifeq            1057
        //   866: ldc2_w          -9223372036854775807
        //   869: lstore          56
        //   871: ldc_w           -3.4028235E38
        //   874: fstore          58
        //   876: ldc_w           -3.4028235E38
        //   879: fstore          59
        //   881: ldc2_w          -9223372036854775807
        //   884: lstore          54
        //   886: ldc2_w          -9223372036854775807
        //   889: lstore          43
        //   891: aload           8
        //   893: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //   898: pop            
        //   899: aload           8
        //   901: ldc_w           "Latency"
        //   904: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //   907: ifeq            964
        //   910: aload           8
        //   912: ldc_w           "target"
        //   915: ldc2_w          -9223372036854775807
        //   918: invokestatic    bji.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //   921: lstore          56
        //   923: aload           8
        //   925: ldc_w           "min"
        //   928: ldc2_w          -9223372036854775807
        //   931: invokestatic    bji.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //   934: lstore          54
        //   936: aload           8
        //   938: ldc_w           "max"
        //   941: ldc2_w          -9223372036854775807
        //   944: invokestatic    bji.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //   947: lstore          43
        //   949: fload           58
        //   951: fstore          60
        //   953: fload           59
        //   955: fstore          58
        //   957: fload           60
        //   959: fstore          59
        //   961: goto            1010
        //   964: aload           8
        //   966: ldc_w           "PlaybackRate"
        //   969: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //   972: ifeq            998
        //   975: aload           8
        //   977: ldc_w           "min"
        //   980: invokestatic    bji.q:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)F
        //   983: fstore          59
        //   985: aload           8
        //   987: ldc_w           "max"
        //   990: invokestatic    bji.q:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)F
        //   993: fstore          58
        //   995: goto            1010
        //   998: fload           58
        //  1000: fstore          60
        //  1002: fload           59
        //  1004: fstore          58
        //  1006: fload           60
        //  1008: fstore          59
        //  1010: aload           8
        //  1012: aload           4
        //  1014: invokestatic    ef.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  1017: ifeq            1042
        //  1020: new             Lbjv;
        //  1023: dup            
        //  1024: lload           56
        //  1026: lload           54
        //  1028: lload           43
        //  1030: fload           59
        //  1032: fload           58
        //  1034: invokespecial   bjv.<init>:(JJJFF)V
        //  1037: astore          39
        //  1039: goto            850
        //  1042: fload           59
        //  1044: fstore          60
        //  1046: fload           58
        //  1048: fstore          59
        //  1050: fload           60
        //  1052: fstore          58
        //  1054: goto            891
        //  1057: aload_2        
        //  1058: astore          61
        //  1060: aload           8
        //  1062: aload_3        
        //  1063: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  1066: ifeq            5655
        //  1069: iload           42
        //  1071: ifne            5655
        //  1074: aload           9
        //  1076: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  1079: istore          46
        //  1081: iconst_1       
        //  1082: iload           46
        //  1084: if_icmpeq       1094
        //  1087: aload           9
        //  1089: astore          62
        //  1091: goto            1098
        //  1094: aload           33
        //  1096: astore          62
        //  1098: aload           8
        //  1100: aconst_null    
        //  1101: aload           6
        //  1103: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1108: astore          63
        //  1110: aload           8
        //  1112: ldc_w           "start"
        //  1115: lload           34
        //  1117: invokestatic    bji.d:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //  1120: lstore          64
        //  1122: lload           13
        //  1124: ldc2_w          -9223372036854775807
        //  1127: lcmp           
        //  1128: ifeq            1141
        //  1131: lload           13
        //  1133: lload           64
        //  1135: ladd           
        //  1136: lstore          66
        //  1138: goto            1146
        //  1141: ldc2_w          -9223372036854775807
        //  1144: lstore          66
        //  1146: aload           8
        //  1148: ldc_w           "duration"
        //  1151: ldc2_w          -9223372036854775807
        //  1154: invokestatic    bji.d:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //  1157: lstore          68
        //  1159: new             Ljava/util/ArrayList;
        //  1162: astore          45
        //  1164: aload           45
        //  1166: invokespecial   java/util/ArrayList.<init>:()V
        //  1169: new             Ljava/util/ArrayList;
        //  1172: astore          70
        //  1174: aload           70
        //  1176: invokespecial   java/util/ArrayList.<init>:()V
        //  1179: new             Ljava/util/ArrayList;
        //  1182: astore          71
        //  1184: aload           71
        //  1186: invokespecial   java/util/ArrayList.<init>:()V
        //  1189: ldc2_w          -9223372036854775807
        //  1192: lstore          72
        //  1194: lload           54
        //  1196: lstore          30
        //  1198: aconst_null    
        //  1199: astore          74
        //  1201: iconst_0       
        //  1202: istore          75
        //  1204: aload_3        
        //  1205: astore          76
        //  1207: aload           22
        //  1209: astore          77
        //  1211: lload           34
        //  1213: lstore          43
        //  1215: aload           52
        //  1217: astore_2       
        //  1218: iload           12
        //  1220: istore          46
        //  1222: aload           7
        //  1224: astore          78
        //  1226: aload           6
        //  1228: astore          79
        //  1230: aload           5
        //  1232: astore          6
        //  1234: aload           45
        //  1236: astore          22
        //  1238: aload           8
        //  1240: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //  1245: pop            
        //  1246: aload           8
        //  1248: aload           78
        //  1250: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  1253: ifeq            1354
        //  1256: lload           30
        //  1258: lstore          34
        //  1260: iload           75
        //  1262: ifne            1274
        //  1265: aload           8
        //  1267: lload           30
        //  1269: invokestatic    bji.l:(Lorg/xmlpull/v1/XmlPullParser;J)J
        //  1272: lstore          34
        //  1274: aload           71
        //  1276: aload           8
        //  1278: aload           62
        //  1280: iload           46
        //  1282: invokestatic    bji.m:(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;
        //  1285: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //  1288: pop            
        //  1289: aload           78
        //  1291: astore          7
        //  1293: aload_2        
        //  1294: astore_3       
        //  1295: iload           19
        //  1297: istore          12
        //  1299: aload           32
        //  1301: astore          52
        //  1303: lload           43
        //  1305: lstore          30
        //  1307: aload           36
        //  1309: astore          50
        //  1311: iconst_1       
        //  1312: istore          75
        //  1314: aload           47
        //  1316: astore          45
        //  1318: aload           79
        //  1320: astore_2       
        //  1321: lload           34
        //  1323: lstore          80
        //  1325: aload           22
        //  1327: astore          5
        //  1329: aload           77
        //  1331: astore          22
        //  1333: iload           46
        //  1335: istore          19
        //  1337: aload           9
        //  1339: astore          36
        //  1341: aload_3        
        //  1342: astore          32
        //  1344: aload           50
        //  1346: astore          9
        //  1348: aload           52
        //  1350: astore_3       
        //  1351: goto            5412
        //  1354: aload           8
        //  1356: ldc_w           "AdaptationSet"
        //  1359: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  1362: istore          12
        //  1364: lload           30
        //  1366: lstore          80
        //  1368: iload           12
        //  1370: ifeq            4246
        //  1373: iconst_1       
        //  1374: aload           71
        //  1376: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  1379: if_icmpeq       1389
        //  1382: aload           71
        //  1384: astore          82
        //  1386: goto            1393
        //  1389: aload           62
        //  1391: astore          82
        //  1393: aload           8
        //  1395: aload           79
        //  1397: iconst_m1      
        //  1398: invokestatic    bji.c:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
        //  1401: istore          83
        //  1403: aload           8
        //  1405: invokestatic    bji.o:(Lorg/xmlpull/v1/XmlPullParser;)I
        //  1408: istore          11
        //  1410: aload           8
        //  1412: aconst_null    
        //  1413: ldc_w           "mimeType"
        //  1416: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1421: astore          49
        //  1423: aload           8
        //  1425: aconst_null    
        //  1426: ldc_w           "codecs"
        //  1429: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1434: astore          51
        //  1436: aload           9
        //  1438: astore          52
        //  1440: aload           8
        //  1442: ldc_w           "width"
        //  1445: iconst_m1      
        //  1446: invokestatic    bji.c:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
        //  1449: istore          84
        //  1451: ldc_w           "SegmentTemplate"
        //  1454: astore          5
        //  1456: aload           8
        //  1458: ldc_w           "height"
        //  1461: iconst_m1      
        //  1462: invokestatic    bji.c:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
        //  1465: istore          85
        //  1467: aload           8
        //  1469: ldc_w           -1.0
        //  1472: invokestatic    bji.b:(Lorg/xmlpull/v1/XmlPullParser;F)F
        //  1475: fstore          59
        //  1477: aload           6
        //  1479: astore          86
        //  1481: aload           8
        //  1483: ldc_w           "audioSamplingRate"
        //  1486: iconst_m1      
        //  1487: invokestatic    bji.c:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
        //  1490: istore          87
        //  1492: aload           8
        //  1494: aconst_null    
        //  1495: aload           47
        //  1497: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1502: astore          88
        //  1504: ldc_w           "SegmentList"
        //  1507: astore_3       
        //  1508: aload           8
        //  1510: aconst_null    
        //  1511: ldc_w           "label"
        //  1514: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1519: astore          9
        //  1521: new             Ljava/util/ArrayList;
        //  1524: astore          89
        //  1526: aload           89
        //  1528: invokespecial   java/util/ArrayList.<init>:()V
        //  1531: new             Ljava/util/ArrayList;
        //  1534: astore          90
        //  1536: aload           90
        //  1538: invokespecial   java/util/ArrayList.<init>:()V
        //  1541: new             Ljava/util/ArrayList;
        //  1544: astore          91
        //  1546: aload           91
        //  1548: invokespecial   java/util/ArrayList.<init>:()V
        //  1551: ldc_w           "SegmentBase"
        //  1554: astore          45
        //  1556: new             Ljava/util/ArrayList;
        //  1559: astore          92
        //  1561: aload           92
        //  1563: invokespecial   java/util/ArrayList.<init>:()V
        //  1566: new             Ljava/util/ArrayList;
        //  1569: astore          93
        //  1571: aload           93
        //  1573: invokespecial   java/util/ArrayList.<init>:()V
        //  1576: new             Ljava/util/ArrayList;
        //  1579: astore          48
        //  1581: aload           48
        //  1583: invokespecial   java/util/ArrayList.<init>:()V
        //  1586: new             Ljava/util/ArrayList;
        //  1589: astore          7
        //  1591: aload           7
        //  1593: invokespecial   java/util/ArrayList.<init>:()V
        //  1596: new             Ljava/util/ArrayList;
        //  1599: astore          94
        //  1601: aload           94
        //  1603: invokespecial   java/util/ArrayList.<init>:()V
        //  1606: aload           74
        //  1608: astore          95
        //  1610: lload           72
        //  1612: lstore          30
        //  1614: lload           80
        //  1616: lstore          34
        //  1618: aconst_null    
        //  1619: astore          6
        //  1621: iconst_0       
        //  1622: istore          96
        //  1624: iconst_m1      
        //  1625: istore          10
        //  1627: aload_2        
        //  1628: astore          50
        //  1630: aload           36
        //  1632: astore          97
        //  1634: aload           32
        //  1636: astore          53
        //  1638: iload           19
        //  1640: istore          12
        //  1642: aload           94
        //  1644: astore          32
        //  1646: aload           88
        //  1648: astore_2       
        //  1649: iload           46
        //  1651: istore          19
        //  1653: aload           78
        //  1655: astore          36
        //  1657: aload           79
        //  1659: astore          94
        //  1661: aload           89
        //  1663: astore          88
        //  1665: aload           47
        //  1667: astore          78
        //  1669: aload           91
        //  1671: astore          89
        //  1673: aload           82
        //  1675: astore          79
        //  1677: aload           8
        //  1679: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //  1684: pop            
        //  1685: aload           8
        //  1687: aload           36
        //  1689: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  1692: ifeq            1830
        //  1695: lload           34
        //  1697: lstore          56
        //  1699: iload           96
        //  1701: ifne            1713
        //  1704: aload           8
        //  1706: lload           34
        //  1708: invokestatic    bji.l:(Lorg/xmlpull/v1/XmlPullParser;J)J
        //  1711: lstore          56
        //  1713: aload           32
        //  1715: aload           8
        //  1717: aload           79
        //  1719: iload           19
        //  1721: invokestatic    bji.m:(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;
        //  1724: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //  1727: pop            
        //  1728: lload           56
        //  1730: lstore          34
        //  1732: iconst_1       
        //  1733: istore          96
        //  1735: aload_2        
        //  1736: astore          82
        //  1738: aload           53
        //  1740: astore          91
        //  1742: aload           50
        //  1744: astore          98
        //  1746: aload           48
        //  1748: astore          99
        //  1750: aload           5
        //  1752: astore          47
        //  1754: aload           77
        //  1756: astore_2       
        //  1757: aload           45
        //  1759: astore          50
        //  1761: aload           7
        //  1763: astore          45
        //  1765: aload_3        
        //  1766: astore          77
        //  1768: aload           9
        //  1770: astore          5
        //  1772: aload           82
        //  1774: astore          53
        //  1776: aload           51
        //  1778: astore          48
        //  1780: aload           6
        //  1782: astore          82
        //  1784: aload           95
        //  1786: astore          100
        //  1788: lload           30
        //  1790: lstore          56
        //  1792: aload           36
        //  1794: astore          7
        //  1796: aload           52
        //  1798: astore          36
        //  1800: aload           99
        //  1802: astore          52
        //  1804: lload           43
        //  1806: lstore          30
        //  1808: aload           49
        //  1810: astore          51
        //  1812: aload           32
        //  1814: astore          49
        //  1816: aload           98
        //  1818: astore          32
        //  1820: aload           97
        //  1822: astore          9
        //  1824: aload           91
        //  1826: astore_3       
        //  1827: goto            3415
        //  1830: aload           8
        //  1832: ldc_w           "ContentProtection"
        //  1835: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  1838: ifeq            1894
        //  1841: aload           8
        //  1843: invokestatic    bji.n:(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;
        //  1846: astore          47
        //  1848: aload           47
        //  1850: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  1853: ifnull          1866
        //  1856: aload           47
        //  1858: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  1861: checkcast       Ljava/lang/String;
        //  1864: astore          6
        //  1866: aload           47
        //  1868: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  1871: ifnull          1888
        //  1874: aload           88
        //  1876: aload           47
        //  1878: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  1881: checkcast       Landroidx/media3/common/DrmInitData$SchemeData;
        //  1884: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1887: pop            
        //  1888: aload_2        
        //  1889: astore          82
        //  1891: goto            1738
        //  1894: lload           34
        //  1896: lstore          56
        //  1898: aload           8
        //  1900: ldc_w           "ContentComponent"
        //  1903: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  1906: istore          46
        //  1908: iload           46
        //  1910: ifeq            1967
        //  1913: aload           8
        //  1915: aconst_null    
        //  1916: aload           78
        //  1918: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1923: astore          47
        //  1925: aload_2        
        //  1926: ifnonnull       1935
        //  1929: aload           47
        //  1931: astore_2       
        //  1932: goto            1952
        //  1935: aload           47
        //  1937: ifnonnull       1943
        //  1940: goto            1952
        //  1943: aload_2        
        //  1944: aload           47
        //  1946: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1949: invokestatic    dk.h:(Z)V
        //  1952: iload           11
        //  1954: aload           8
        //  1956: invokestatic    bji.o:(Lorg/xmlpull/v1/XmlPullParser;)I
        //  1959: invokestatic    bji.B:(II)I
        //  1962: istore          11
        //  1964: goto            1888
        //  1967: aload           8
        //  1969: ldc_w           "Role"
        //  1972: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  1975: ifeq            1995
        //  1978: aload           92
        //  1980: aload           8
        //  1982: ldc_w           "Role"
        //  1985: invokestatic    bji.g:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lbjj;
        //  1988: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1991: pop            
        //  1992: goto            3289
        //  1995: aload           8
        //  1997: ldc_w           "AudioChannelConfiguration"
        //  2000: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2003: ifeq            2016
        //  2006: aload           8
        //  2008: invokestatic    bji.k:(Lorg/xmlpull/v1/XmlPullParser;)I
        //  2011: istore          10
        //  2013: goto            1888
        //  2016: aload           8
        //  2018: ldc_w           "Accessibility"
        //  2021: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2024: ifeq            2044
        //  2027: aload           89
        //  2029: aload           8
        //  2031: ldc_w           "Accessibility"
        //  2034: invokestatic    bji.g:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lbjj;
        //  2037: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2040: pop            
        //  2041: goto            1992
        //  2044: aload           97
        //  2046: astore          101
        //  2048: aload           8
        //  2050: aload           101
        //  2052: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2055: ifeq            2074
        //  2058: aload           93
        //  2060: aload           8
        //  2062: aload           101
        //  2064: invokestatic    bji.g:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lbjj;
        //  2067: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2070: pop            
        //  2071: goto            1992
        //  2074: aload           8
        //  2076: aload           77
        //  2078: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2081: ifeq            2100
        //  2084: aload           48
        //  2086: aload           8
        //  2088: aload           77
        //  2090: invokestatic    bji.g:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lbjj;
        //  2093: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2096: pop            
        //  2097: goto            3289
        //  2100: aload           8
        //  2102: ldc_w           "Representation"
        //  2105: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2108: istore          46
        //  2110: iload           46
        //  2112: ifeq            3094
        //  2115: aload           32
        //  2117: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  2120: istore          46
        //  2122: aload           77
        //  2124: astore          47
        //  2126: iconst_1       
        //  2127: iload           46
        //  2129: if_icmpeq       2139
        //  2132: aload           32
        //  2134: astore          97
        //  2136: goto            2143
        //  2139: aload           79
        //  2141: astore          97
        //  2143: aload           8
        //  2145: aconst_null    
        //  2146: aload           94
        //  2148: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2153: astore          102
        //  2155: aload           32
        //  2157: astore          82
        //  2159: aload           8
        //  2161: ldc_w           "bandwidth"
        //  2164: iconst_m1      
        //  2165: invokestatic    bji.c:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
        //  2168: istore          103
        //  2170: aload           8
        //  2172: ldc_w           "mimeType"
        //  2175: aload           49
        //  2177: invokestatic    bji.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2180: astore          104
        //  2182: aload           51
        //  2184: astore          105
        //  2186: aload           8
        //  2188: ldc_w           "codecs"
        //  2191: aload           105
        //  2193: invokestatic    bji.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2196: astore          106
        //  2198: aload           8
        //  2200: ldc_w           "width"
        //  2203: iload           84
        //  2205: invokestatic    bji.c:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
        //  2208: istore          107
        //  2210: iload           84
        //  2212: istore          108
        //  2214: aload           8
        //  2216: ldc_w           "height"
        //  2219: iload           85
        //  2221: invokestatic    bji.c:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
        //  2224: istore          109
        //  2226: aload           8
        //  2228: fload           59
        //  2230: invokestatic    bji.b:(Lorg/xmlpull/v1/XmlPullParser;F)F
        //  2233: fstore          58
        //  2235: iload           85
        //  2237: istore          84
        //  2239: aload           8
        //  2241: ldc_w           "audioSamplingRate"
        //  2244: iload           87
        //  2246: invokestatic    bji.c:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
        //  2249: istore          110
        //  2251: iload           87
        //  2253: istore          111
        //  2255: new             Ljava/util/ArrayList;
        //  2258: astore          112
        //  2260: aload           112
        //  2262: invokespecial   java/util/ArrayList.<init>:()V
        //  2265: new             Ljava/util/ArrayList;
        //  2268: astore          113
        //  2270: aload           113
        //  2272: invokespecial   java/util/ArrayList.<init>:()V
        //  2275: new             Ljava/util/ArrayList;
        //  2278: astore          114
        //  2280: aload           114
        //  2282: aload           93
        //  2284: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //  2287: new             Ljava/util/ArrayList;
        //  2290: astore          51
        //  2292: aload           51
        //  2294: aload           48
        //  2296: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //  2299: aload           48
        //  2301: astore          98
        //  2303: new             Ljava/util/ArrayList;
        //  2306: astore          115
        //  2308: aload           115
        //  2310: invokespecial   java/util/ArrayList.<init>:()V
        //  2313: iload           10
        //  2315: istore          85
        //  2317: lload           56
        //  2319: lstore          34
        //  2321: aload           95
        //  2323: astore          32
        //  2325: lload           30
        //  2327: lstore          116
        //  2329: aconst_null    
        //  2330: astore          48
        //  2332: iconst_0       
        //  2333: istore          87
        //  2335: aload           49
        //  2337: astore          91
        //  2339: aload           45
        //  2341: astore          100
        //  2343: aload_2        
        //  2344: astore          77
        //  2346: aload           82
        //  2348: astore          49
        //  2350: aload           47
        //  2352: astore          45
        //  2354: aload           7
        //  2356: astore          82
        //  2358: aload           48
        //  2360: astore_2       
        //  2361: aload_3        
        //  2362: astore          48
        //  2364: aload           52
        //  2366: astore          47
        //  2368: aload           50
        //  2370: astore          99
        //  2372: aload           97
        //  2374: astore          52
        //  2376: aload           105
        //  2378: astore          7
        //  2380: aload           101
        //  2382: astore_3       
        //  2383: aload           8
        //  2385: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //  2390: pop            
        //  2391: aload           8
        //  2393: aload           36
        //  2395: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2398: ifeq            2440
        //  2401: lload           34
        //  2403: lstore          118
        //  2405: iload           87
        //  2407: ifne            2419
        //  2410: aload           8
        //  2412: lload           34
        //  2414: invokestatic    bji.l:(Lorg/xmlpull/v1/XmlPullParser;J)J
        //  2417: lstore          118
        //  2419: aload           115
        //  2421: aload           8
        //  2423: aload           52
        //  2425: iload           19
        //  2427: invokestatic    bji.m:(Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List;Z)Ljava/util/List;
        //  2430: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //  2433: pop            
        //  2434: iconst_1       
        //  2435: istore          87
        //  2437: goto            2462
        //  2440: aload           8
        //  2442: ldc_w           "AudioChannelConfiguration"
        //  2445: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2448: ifeq            2484
        //  2451: aload           8
        //  2453: invokestatic    bji.k:(Lorg/xmlpull/v1/XmlPullParser;)I
        //  2456: istore          85
        //  2458: lload           34
        //  2460: lstore          118
        //  2462: lload           116
        //  2464: lstore          34
        //  2466: aload_2        
        //  2467: astore          101
        //  2469: lload           34
        //  2471: lstore          116
        //  2473: aload           32
        //  2475: astore          50
        //  2477: iload           85
        //  2479: istore          120
        //  2481: goto            2785
        //  2484: aload           8
        //  2486: aload           100
        //  2488: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2491: ifeq            2517
        //  2494: aload           8
        //  2496: aload           32
        //  2498: checkcast       Lbjt;
        //  2501: invokestatic    bji.x:(Lorg/xmlpull/v1/XmlPullParser;Lbjt;)Lbjt;
        //  2504: astore          32
        //  2506: lload           34
        //  2508: lstore          118
        //  2510: lload           116
        //  2512: lstore          34
        //  2514: goto            2466
        //  2517: aload           8
        //  2519: aload           48
        //  2521: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2524: ifeq            2569
        //  2527: aload           8
        //  2529: lload           116
        //  2531: invokestatic    bji.l:(Lorg/xmlpull/v1/XmlPullParser;J)J
        //  2534: lstore          116
        //  2536: aload           8
        //  2538: aload           32
        //  2540: checkcast       Lbjq;
        //  2543: lload           66
        //  2545: lload           68
        //  2547: lload           34
        //  2549: lload           116
        //  2551: lload           24
        //  2553: invokestatic    bji.y:(Lorg/xmlpull/v1/XmlPullParser;Lbjq;JJJJJ)Lbjq;
        //  2556: astore          32
        //  2558: lload           34
        //  2560: lstore          118
        //  2562: lload           116
        //  2564: lstore          34
        //  2566: goto            2466
        //  2569: aload           45
        //  2571: astore          50
        //  2573: aload           8
        //  2575: aload           5
        //  2577: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2580: ifeq            2627
        //  2583: aload           8
        //  2585: lload           116
        //  2587: invokestatic    bji.l:(Lorg/xmlpull/v1/XmlPullParser;J)J
        //  2590: lstore          116
        //  2592: aload           8
        //  2594: aload           32
        //  2596: checkcast       Lbjr;
        //  2599: aload           98
        //  2601: lload           66
        //  2603: lload           68
        //  2605: lload           34
        //  2607: lload           116
        //  2609: lload           24
        //  2611: invokestatic    bji.z:(Lorg/xmlpull/v1/XmlPullParser;Lbjr;Ljava/util/List;JJJJJ)Lbjr;
        //  2614: astore          32
        //  2616: lload           34
        //  2618: lstore          118
        //  2620: lload           116
        //  2622: lstore          34
        //  2624: goto            2466
        //  2627: aload           8
        //  2629: ldc_w           "ContentProtection"
        //  2632: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2635: ifeq            2687
        //  2638: aload           8
        //  2640: invokestatic    bji.n:(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/Pair;
        //  2643: astore          50
        //  2645: aload           50
        //  2647: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  2650: ifnull          2662
        //  2653: aload           50
        //  2655: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  2658: checkcast       Ljava/lang/String;
        //  2661: astore_2       
        //  2662: aload           50
        //  2664: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  2667: ifnull          2684
        //  2670: aload           112
        //  2672: aload           50
        //  2674: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  2677: checkcast       Landroidx/media3/common/DrmInitData$SchemeData;
        //  2680: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2683: pop            
        //  2684: goto            2506
        //  2687: aload           8
        //  2689: ldc_w           "InbandEventStream"
        //  2692: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2695: ifeq            2715
        //  2698: aload           113
        //  2700: aload           8
        //  2702: ldc_w           "InbandEventStream"
        //  2705: invokestatic    bji.g:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lbjj;
        //  2708: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2711: pop            
        //  2712: goto            2770
        //  2715: aload           8
        //  2717: aload_3        
        //  2718: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2721: ifeq            2739
        //  2724: aload           114
        //  2726: aload           8
        //  2728: aload_3        
        //  2729: invokestatic    bji.g:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lbjj;
        //  2732: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2735: pop            
        //  2736: goto            2712
        //  2739: aload           8
        //  2741: aload           50
        //  2743: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2746: ifeq            2765
        //  2749: aload           51
        //  2751: aload           8
        //  2753: aload           50
        //  2755: invokestatic    bji.g:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lbjj;
        //  2758: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2761: pop            
        //  2762: goto            2770
        //  2765: aload           8
        //  2767: invokestatic    bji.j:(Lorg/xmlpull/v1/XmlPullParser;)V
        //  2770: iload           85
        //  2772: istore          120
        //  2774: aload           32
        //  2776: astore          50
        //  2778: aload_2        
        //  2779: astore          101
        //  2781: lload           34
        //  2783: lstore          118
        //  2785: aload           53
        //  2787: astore          97
        //  2789: aload           100
        //  2791: astore_2       
        //  2792: aload           99
        //  2794: astore          32
        //  2796: iload           84
        //  2798: istore          85
        //  2800: aload           47
        //  2802: astore          99
        //  2804: aload           52
        //  2806: astore          53
        //  2808: aload           45
        //  2810: astore          52
        //  2812: aload           5
        //  2814: astore          47
        //  2816: aload           8
        //  2818: ldc_w           "Representation"
        //  2821: invokestatic    ef.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  2824: ifeq            3039
        //  2827: aload           102
        //  2829: aload           104
        //  2831: iload           107
        //  2833: iload           109
        //  2835: fload           58
        //  2837: iload           120
        //  2839: iload           110
        //  2841: iload           103
        //  2843: aload           77
        //  2845: aload           92
        //  2847: aload           89
        //  2849: aload           106
        //  2851: aload           114
        //  2853: aload           51
        //  2855: invokestatic    bji.u:(Ljava/lang/String;Ljava/lang/String;IIFIIILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Layf;
        //  2858: astore          100
        //  2860: aload           50
        //  2862: ifnull          2872
        //  2865: aload           50
        //  2867: astore          5
        //  2869: goto            2886
        //  2872: new             Lbjt;
        //  2875: dup            
        //  2876: aconst_null    
        //  2877: lconst_1       
        //  2878: lconst_0       
        //  2879: lconst_0       
        //  2880: lconst_0       
        //  2881: invokespecial   bjt.<init>:(Lbjl;JJJJ)V
        //  2884: astore          5
        //  2886: new             Lbjh;
        //  2889: astore          50
        //  2891: iconst_1       
        //  2892: aload           115
        //  2894: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  2897: if_icmpeq       2907
        //  2900: aload           115
        //  2902: astore          45
        //  2904: goto            2911
        //  2907: aload           53
        //  2909: astore          45
        //  2911: aload           50
        //  2913: aload           100
        //  2915: aload           45
        //  2917: aload           5
        //  2919: aload           101
        //  2921: aload           112
        //  2923: aload           113
        //  2925: aload           114
        //  2927: aload           51
        //  2929: invokespecial   bjh.<init>:(Layf;Ljava/util/List;Lbju;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;)V
        //  2932: iload           11
        //  2934: aload           50
        //  2936: getfield        bjh.a:Layf;
        //  2939: getfield        ayf.n:Ljava/lang/String;
        //  2942: invokestatic    ayy.b:(Ljava/lang/String;)I
        //  2945: invokestatic    bji.B:(II)I
        //  2948: istore          11
        //  2950: aload           82
        //  2952: aload           50
        //  2954: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  2959: pop            
        //  2960: aload           82
        //  2962: astore          45
        //  2964: aload           77
        //  2966: astore          53
        //  2968: lload           56
        //  2970: lstore          34
        //  2972: aload_2        
        //  2973: astore          50
        //  2975: aload           48
        //  2977: astore          77
        //  2979: aload           9
        //  2981: astore          5
        //  2983: aload           52
        //  2985: astore_2       
        //  2986: aload           7
        //  2988: astore          48
        //  2990: iload           111
        //  2992: istore          87
        //  2994: iload           108
        //  2996: istore          84
        //  2998: aload           6
        //  3000: astore          82
        //  3002: aload           95
        //  3004: astore          100
        //  3006: lload           30
        //  3008: lstore          56
        //  3010: aload           36
        //  3012: astore          7
        //  3014: aload           99
        //  3016: astore          36
        //  3018: aload           98
        //  3020: astore          52
        //  3022: lload           43
        //  3024: lstore          30
        //  3026: aload           91
        //  3028: astore          51
        //  3030: aload_3        
        //  3031: astore          9
        //  3033: aload           97
        //  3035: astore_3       
        //  3036: goto            3415
        //  3039: aload           52
        //  3041: astore          45
        //  3043: aload           53
        //  3045: astore          52
        //  3047: aload           99
        //  3049: astore          5
        //  3051: aload_2        
        //  3052: astore          100
        //  3054: aload           47
        //  3056: astore_2       
        //  3057: lload           118
        //  3059: lstore          34
        //  3061: aload           97
        //  3063: astore          53
        //  3065: aload           32
        //  3067: astore          99
        //  3069: aload           5
        //  3071: astore          47
        //  3073: aload_2        
        //  3074: astore          5
        //  3076: aload           101
        //  3078: astore_2       
        //  3079: iload           85
        //  3081: istore          84
        //  3083: aload           50
        //  3085: astore          32
        //  3087: iload           120
        //  3089: istore          85
        //  3091: goto            2383
        //  3094: lload           56
        //  3096: lstore          116
        //  3098: aload_2        
        //  3099: astore          47
        //  3101: aload           8
        //  3103: aload           45
        //  3105: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  3108: ifeq            3133
        //  3111: aload           8
        //  3113: aload           95
        //  3115: checkcast       Lbjt;
        //  3118: invokestatic    bji.x:(Lorg/xmlpull/v1/XmlPullParser;Lbjt;)Lbjt;
        //  3121: astore_2       
        //  3122: aload           9
        //  3124: astore          95
        //  3126: lload           30
        //  3128: lstore          56
        //  3130: goto            3303
        //  3133: aload           8
        //  3135: aload_3        
        //  3136: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  3139: ifeq            3175
        //  3142: aload           8
        //  3144: lload           30
        //  3146: invokestatic    bji.l:(Lorg/xmlpull/v1/XmlPullParser;J)J
        //  3149: lstore          30
        //  3151: aload           8
        //  3153: aload           95
        //  3155: checkcast       Lbjq;
        //  3158: lload           66
        //  3160: lload           68
        //  3162: lload           116
        //  3164: lload           30
        //  3166: lload           24
        //  3168: invokestatic    bji.y:(Lorg/xmlpull/v1/XmlPullParser;Lbjq;JJJJJ)Lbjq;
        //  3171: astore_2       
        //  3172: goto            3122
        //  3175: lload           30
        //  3177: lstore          56
        //  3179: aload           8
        //  3181: aload           5
        //  3183: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  3186: ifeq            3224
        //  3189: aload           8
        //  3191: lload           56
        //  3193: invokestatic    bji.l:(Lorg/xmlpull/v1/XmlPullParser;J)J
        //  3196: lstore          30
        //  3198: aload           8
        //  3200: aload           95
        //  3202: checkcast       Lbjr;
        //  3205: aload           48
        //  3207: lload           66
        //  3209: lload           68
        //  3211: lload           116
        //  3213: lload           30
        //  3215: lload           24
        //  3217: invokestatic    bji.z:(Lorg/xmlpull/v1/XmlPullParser;Lbjr;Ljava/util/List;JJJJJ)Lbjr;
        //  3220: astore_2       
        //  3221: goto            3122
        //  3224: aload           8
        //  3226: ldc_w           "InbandEventStream"
        //  3229: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  3232: ifeq            3252
        //  3235: aload           90
        //  3237: aload           8
        //  3239: ldc_w           "InbandEventStream"
        //  3242: invokestatic    bji.g:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lbjj;
        //  3245: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  3248: pop            
        //  3249: goto            3289
        //  3252: aload           8
        //  3254: ldc_w           "Label"
        //  3257: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  3260: ifeq            3276
        //  3263: aload           8
        //  3265: ldc_w           "Label"
        //  3268: invokestatic    bji.i:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //  3271: astore          9
        //  3273: goto            3296
        //  3276: aload           8
        //  3278: invokestatic    ef.i:(Lorg/xmlpull/v1/XmlPullParser;)Z
        //  3281: ifeq            3289
        //  3284: aload           8
        //  3286: invokestatic    bji.j:(Lorg/xmlpull/v1/XmlPullParser;)V
        //  3289: lload           30
        //  3291: lstore          56
        //  3293: aload_2        
        //  3294: astore          47
        //  3296: aload           95
        //  3298: astore_2       
        //  3299: aload           9
        //  3301: astore          95
        //  3303: aload           53
        //  3305: astore          100
        //  3307: aload           97
        //  3309: astore          9
        //  3311: aload           50
        //  3313: astore          82
        //  3315: aload           32
        //  3317: astore          101
        //  3319: aload           49
        //  3321: astore          105
        //  3323: lload           43
        //  3325: lstore          30
        //  3327: aload           48
        //  3329: astore          53
        //  3331: aload           52
        //  3333: astore          99
        //  3335: aload           36
        //  3337: astore          98
        //  3339: aload           51
        //  3341: astore          48
        //  3343: aload           77
        //  3345: astore          91
        //  3347: aload_3        
        //  3348: astore          77
        //  3350: aload           7
        //  3352: astore          50
        //  3354: aload           45
        //  3356: astore          97
        //  3358: aload           100
        //  3360: astore_3       
        //  3361: aload           82
        //  3363: astore          32
        //  3365: aload           101
        //  3367: astore          49
        //  3369: aload           105
        //  3371: astore          51
        //  3373: aload           53
        //  3375: astore          52
        //  3377: aload           99
        //  3379: astore          36
        //  3381: aload           98
        //  3383: astore          7
        //  3385: aload_2        
        //  3386: astore          100
        //  3388: aload           6
        //  3390: astore          82
        //  3392: aload           47
        //  3394: astore          53
        //  3396: aload           91
        //  3398: astore_2       
        //  3399: aload           5
        //  3401: astore          47
        //  3403: aload           95
        //  3405: astore          5
        //  3407: aload           50
        //  3409: astore          45
        //  3411: aload           97
        //  3413: astore          50
        //  3415: aload           8
        //  3417: ldc_w           "AdaptationSet"
        //  3420: invokestatic    ef.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  3423: ifeq            4121
        //  3426: new             Ljava/util/ArrayList;
        //  3429: astore          48
        //  3431: aload           48
        //  3433: aload           45
        //  3435: invokeinterface java/util/List.size:()I
        //  3440: invokespecial   java/util/ArrayList.<init>:(I)V
        //  3443: iconst_0       
        //  3444: istore          10
        //  3446: aload           88
        //  3448: astore          6
        //  3450: iload           10
        //  3452: aload           45
        //  3454: invokeinterface java/util/List.size:()I
        //  3459: if_icmpge       4067
        //  3462: aload           45
        //  3464: iload           10
        //  3466: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  3471: checkcast       Lbjh;
        //  3474: astore          77
        //  3476: aload           77
        //  3478: getfield        bjh.a:Layf;
        //  3481: invokevirtual   ayf.b:()Laye;
        //  3484: astore          47
        //  3486: aload           5
        //  3488: ifnull          3498
        //  3491: aload           47
        //  3493: aload           5
        //  3495: putfield        aye.b:Ljava/lang/String;
        //  3498: aload           77
        //  3500: getfield        bjh.d:Ljava/lang/String;
        //  3503: astore          53
        //  3505: aload           53
        //  3507: astore          50
        //  3509: aload           53
        //  3511: ifnonnull       3518
        //  3514: aload           82
        //  3516: astore          50
        //  3518: aload           77
        //  3520: getfield        bjh.e:Ljava/util/ArrayList;
        //  3523: astore          79
        //  3525: aload           79
        //  3527: aload           6
        //  3529: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //  3532: pop            
        //  3533: aload           79
        //  3535: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  3538: ifne            3885
        //  3541: iconst_0       
        //  3542: istore          85
        //  3544: iload           85
        //  3546: aload           79
        //  3548: invokevirtual   java/util/ArrayList.size:()I
        //  3551: if_icmpge       3609
        //  3554: aload           79
        //  3556: iload           85
        //  3558: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3561: checkcast       Landroidx/media3/common/DrmInitData$SchemeData;
        //  3564: astore          53
        //  3566: getstatic       axy.c:Ljava/util/UUID;
        //  3569: aload           53
        //  3571: getfield        androidx/media3/common/DrmInitData$SchemeData.a:Ljava/util/UUID;
        //  3574: invokevirtual   java/util/UUID.equals:(Ljava/lang/Object;)Z
        //  3577: ifeq            3603
        //  3580: aload           53
        //  3582: getfield        androidx/media3/common/DrmInitData$SchemeData.b:Ljava/lang/String;
        //  3585: astore          49
        //  3587: aload           49
        //  3589: ifnull          3603
        //  3592: aload           79
        //  3594: iload           85
        //  3596: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //  3599: pop            
        //  3600: goto            3612
        //  3603: iinc            85, 1
        //  3606: goto            3544
        //  3609: aconst_null    
        //  3610: astore          49
        //  3612: aload           45
        //  3614: astore          53
        //  3616: aload           5
        //  3618: astore          51
        //  3620: aload           49
        //  3622: ifnonnull       3642
        //  3625: aload           6
        //  3627: astore          5
        //  3629: aload_2        
        //  3630: astore          45
        //  3632: aload           45
        //  3634: astore_2       
        //  3635: aload           5
        //  3637: astore          6
        //  3639: goto            3740
        //  3642: iconst_0       
        //  3643: istore          85
        //  3645: aload_2        
        //  3646: astore          45
        //  3648: aload           6
        //  3650: astore          5
        //  3652: iload           85
        //  3654: aload           79
        //  3656: invokevirtual   java/util/ArrayList.size:()I
        //  3659: if_icmpge       3632
        //  3662: aload           79
        //  3664: iload           85
        //  3666: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3669: checkcast       Landroidx/media3/common/DrmInitData$SchemeData;
        //  3672: astore          5
        //  3674: getstatic       axy.b:Ljava/util/UUID;
        //  3677: aload           5
        //  3679: getfield        androidx/media3/common/DrmInitData$SchemeData.a:Ljava/util/UUID;
        //  3682: invokevirtual   java/util/UUID.equals:(Ljava/lang/Object;)Z
        //  3685: ifeq            3734
        //  3688: aload           5
        //  3690: getfield        androidx/media3/common/DrmInitData$SchemeData.b:Ljava/lang/String;
        //  3693: ifnonnull       3734
        //  3696: new             Landroidx/media3/common/DrmInitData$SchemeData;
        //  3699: astore          45
        //  3701: aload           45
        //  3703: getstatic       axy.c:Ljava/util/UUID;
        //  3706: aload           49
        //  3708: aload           5
        //  3710: getfield        androidx/media3/common/DrmInitData$SchemeData.c:Ljava/lang/String;
        //  3713: aload           5
        //  3715: getfield        androidx/media3/common/DrmInitData$SchemeData.d:[B
        //  3718: invokespecial   androidx/media3/common/DrmInitData$SchemeData.<init>:(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V
        //  3721: aload           79
        //  3723: iload           85
        //  3725: aload           45
        //  3727: invokevirtual   java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //  3730: pop            
        //  3731: goto            3734
        //  3734: iinc            85, 1
        //  3737: goto            3645
        //  3740: aload           79
        //  3742: invokevirtual   java/util/ArrayList.size:()I
        //  3745: iconst_1       
        //  3746: isub           
        //  3747: istore          85
        //  3749: iload           85
        //  3751: iflt            3851
        //  3754: aload           79
        //  3756: iload           85
        //  3758: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3761: checkcast       Landroidx/media3/common/DrmInitData$SchemeData;
        //  3764: astore          5
        //  3766: aload           5
        //  3768: invokevirtual   androidx/media3/common/DrmInitData$SchemeData.a:()Z
        //  3771: ifne            3845
        //  3774: iconst_0       
        //  3775: istore          87
        //  3777: iload           87
        //  3779: aload           79
        //  3781: invokevirtual   java/util/ArrayList.size:()I
        //  3784: if_icmpge       3845
        //  3787: aload           79
        //  3789: iload           87
        //  3791: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3794: checkcast       Landroidx/media3/common/DrmInitData$SchemeData;
        //  3797: astore          45
        //  3799: aload           45
        //  3801: invokevirtual   androidx/media3/common/DrmInitData$SchemeData.a:()Z
        //  3804: ifeq            3839
        //  3807: aload           5
        //  3809: invokevirtual   androidx/media3/common/DrmInitData$SchemeData.a:()Z
        //  3812: ifne            3839
        //  3815: aload           45
        //  3817: aload           5
        //  3819: getfield        androidx/media3/common/DrmInitData$SchemeData.a:Ljava/util/UUID;
        //  3822: invokevirtual   androidx/media3/common/DrmInitData$SchemeData.b:(Ljava/util/UUID;)Z
        //  3825: ifeq            3839
        //  3828: aload           79
        //  3830: iload           85
        //  3832: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //  3835: pop            
        //  3836: goto            3845
        //  3839: iinc            87, 1
        //  3842: goto            3777
        //  3845: iinc            85, -1
        //  3848: goto            3749
        //  3851: new             Landroidx/media3/common/DrmInitData;
        //  3854: astore          5
        //  3856: aload           5
        //  3858: aload           50
        //  3860: aload           79
        //  3862: invokespecial   androidx/media3/common/DrmInitData.<init>:(Ljava/lang/String;Ljava/util/List;)V
        //  3865: aload           47
        //  3867: aload           5
        //  3869: putfield        aye.n:Landroidx/media3/common/DrmInitData;
        //  3872: aload           51
        //  3874: astore          45
        //  3876: aload_2        
        //  3877: astore          5
        //  3879: aload           53
        //  3881: astore_2       
        //  3882: goto            3899
        //  3885: aload           45
        //  3887: astore          50
        //  3889: aload           5
        //  3891: astore          45
        //  3893: aload_2        
        //  3894: astore          5
        //  3896: aload           50
        //  3898: astore_2       
        //  3899: aload           77
        //  3901: getfield        bjh.f:Ljava/util/ArrayList;
        //  3904: astore          53
        //  3906: aload           53
        //  3908: aload           90
        //  3910: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //  3913: pop            
        //  3914: aload           77
        //  3916: getfield        bjh.g:J
        //  3919: lstore          34
        //  3921: aload           47
        //  3923: invokevirtual   aye.a:()Layf;
        //  3926: astore          51
        //  3928: aload           77
        //  3930: getfield        bjh.b:Lafcr;
        //  3933: astore          49
        //  3935: aload           77
        //  3937: getfield        bjh.c:Lbju;
        //  3940: astore          47
        //  3942: aload           77
        //  3944: getfield        bjh.h:Ljava/util/List;
        //  3947: astore          50
        //  3949: aload           77
        //  3951: getfield        bjh.i:Ljava/util/List;
        //  3954: astore          50
        //  3956: aload           47
        //  3958: instanceof      Lbjt;
        //  3961: ifeq            3992
        //  3964: new             Lbjn;
        //  3967: astore          50
        //  3969: aload           50
        //  3971: aload           51
        //  3973: aload           49
        //  3975: aload           47
        //  3977: checkcast       Lbjt;
        //  3980: aload           53
        //  3982: aconst_null    
        //  3983: ldc2_w          -1
        //  3986: invokespecial   bjn.<init>:(Layf;Ljava/util/List;Lbjt;Ljava/util/List;Ljava/lang/String;J)V
        //  3989: goto            4020
        //  3992: aload           47
        //  3994: instanceof      Lbjp;
        //  3997: ifeq            4054
        //  4000: new             Lbjm;
        //  4003: dup            
        //  4004: aload           51
        //  4006: aload           49
        //  4008: aload           47
        //  4010: checkcast       Lbjp;
        //  4013: aload           53
        //  4015: invokespecial   bjm.<init>:(Layf;Ljava/util/List;Lbjp;Ljava/util/List;)V
        //  4018: astore          50
        //  4020: aload           48
        //  4022: aload           50
        //  4024: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  4029: pop            
        //  4030: iinc            10, 1
        //  4033: aload           45
        //  4035: astore          53
        //  4037: aload           5
        //  4039: astore          50
        //  4041: aload_2        
        //  4042: astore          45
        //  4044: aload           53
        //  4046: astore          5
        //  4048: aload           50
        //  4050: astore_2       
        //  4051: goto            3450
        //  4054: new             Ljava/lang/IllegalArgumentException;
        //  4057: astore_1       
        //  4058: aload_1        
        //  4059: ldc_w           "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
        //  4062: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //  4065: aload_1        
        //  4066: athrow         
        //  4067: aload_2        
        //  4068: astore          50
        //  4070: new             Lbje;
        //  4073: astore_2       
        //  4074: aload_2        
        //  4075: iload           83
        //  4077: iload           11
        //  4079: aload           48
        //  4081: aload           89
        //  4083: aload           93
        //  4085: aload           52
        //  4087: invokespecial   bje.<init>:(IILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
        //  4090: aload           22
        //  4092: aload_2        
        //  4093: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  4098: pop            
        //  4099: aload           94
        //  4101: astore_2       
        //  4102: aload           78
        //  4104: astore          45
        //  4106: aload           86
        //  4108: astore          6
        //  4110: aload           22
        //  4112: astore          5
        //  4114: aload           50
        //  4116: astore          22
        //  4118: goto            5412
        //  4121: aload_3        
        //  4122: astore          97
        //  4124: aload           77
        //  4126: astore_3       
        //  4127: aload           5
        //  4129: astore          6
        //  4131: aload           48
        //  4133: astore          5
        //  4135: aload           7
        //  4137: astore          77
        //  4139: aload           36
        //  4141: astore          7
        //  4143: aload           52
        //  4145: astore          48
        //  4147: aload           51
        //  4149: astore          95
        //  4151: aload           49
        //  4153: astore          51
        //  4155: aload           32
        //  4157: astore          52
        //  4159: aload_2        
        //  4160: astore          49
        //  4162: aload           50
        //  4164: astore          91
        //  4166: aload           77
        //  4168: astore          36
        //  4170: aload           53
        //  4172: astore_2       
        //  4173: aload           51
        //  4175: astore          32
        //  4177: aload           97
        //  4179: astore          53
        //  4181: lload           30
        //  4183: lstore          43
        //  4185: aload           5
        //  4187: astore          51
        //  4189: aload           49
        //  4191: astore          77
        //  4193: aload           9
        //  4195: astore          97
        //  4197: aload           52
        //  4199: astore          50
        //  4201: aload           7
        //  4203: astore          52
        //  4205: aload           47
        //  4207: astore          5
        //  4209: aload           6
        //  4211: astore          9
        //  4213: aload           45
        //  4215: astore          7
        //  4217: aload           95
        //  4219: astore          49
        //  4221: aload           91
        //  4223: astore          45
        //  4225: aload           82
        //  4227: astore          6
        //  4229: aload           100
        //  4231: astore          95
        //  4233: lload           56
        //  4235: lstore          30
        //  4237: goto            1677
        //  4240: astore_1       
        //  4241: aconst_null    
        //  4242: astore_2       
        //  4243: goto            5879
        //  4246: aload           78
        //  4248: astore          7
        //  4250: aload_2        
        //  4251: astore          52
        //  4253: aload           9
        //  4255: astore          50
        //  4257: iload           19
        //  4259: istore          12
        //  4261: aload           32
        //  4263: astore_3       
        //  4264: aload           36
        //  4266: astore          53
        //  4268: aload           47
        //  4270: astore          45
        //  4272: aload           22
        //  4274: astore_2       
        //  4275: aload           8
        //  4277: ldc_w           "EventStream"
        //  4280: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  4283: ifeq            5161
        //  4286: aload           8
        //  4288: aload           52
        //  4290: ldc             ""
        //  4292: invokestatic    bji.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  4295: astore          36
        //  4297: aload           6
        //  4299: astore          22
        //  4301: aload           8
        //  4303: aload           22
        //  4305: ldc             ""
        //  4307: invokestatic    bji.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  4310: astore          51
        //  4312: aload           8
        //  4314: ldc_w           "timescale"
        //  4317: lconst_1       
        //  4318: invokestatic    bji.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //  4321: lstore          30
        //  4323: aload           8
        //  4325: ldc_w           "presentationTimeOffset"
        //  4328: lconst_0       
        //  4329: invokestatic    bji.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //  4332: lstore          56
        //  4334: new             Ljava/util/ArrayList;
        //  4337: astore          49
        //  4339: aload           49
        //  4341: invokespecial   java/util/ArrayList.<init>:()V
        //  4344: new             Ljava/io/ByteArrayOutputStream;
        //  4347: astore          48
        //  4349: aload           48
        //  4351: sipush          512
        //  4354: invokespecial   java/io/ByteArrayOutputStream.<init>:(I)V
        //  4357: aload           79
        //  4359: astore          9
        //  4361: aload_2        
        //  4362: astore          6
        //  4364: aload           52
        //  4366: astore_2       
        //  4367: aload           8
        //  4369: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //  4374: pop            
        //  4375: aload           8
        //  4377: ldc_w           "Event"
        //  4380: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  4383: ifeq            4980
        //  4386: aload           8
        //  4388: aload           9
        //  4390: lconst_0       
        //  4391: invokestatic    bji.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //  4394: lstore          116
        //  4396: aload           8
        //  4398: ldc_w           "duration"
        //  4401: ldc2_w          -9223372036854775807
        //  4404: invokestatic    bji.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //  4407: lstore          118
        //  4409: aload           8
        //  4411: ldc_w           "presentationTime"
        //  4414: lconst_0       
        //  4415: invokestatic    bji.e:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J
        //  4418: lstore          34
        //  4420: lload           118
        //  4422: ldc2_w          1000
        //  4425: lload           30
        //  4427: invokestatic    baw.y:(JJJ)J
        //  4430: lstore          118
        //  4432: lload           34
        //  4434: lload           56
        //  4436: lsub           
        //  4437: ldc2_w          1000000
        //  4440: lload           30
        //  4442: invokestatic    baw.y:(JJJ)J
        //  4445: lstore          121
        //  4447: aload           8
        //  4449: ldc_w           "messageData"
        //  4452: aconst_null    
        //  4453: invokestatic    bji.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  4456: astore          5
        //  4458: aload           48
        //  4460: invokevirtual   java/io/ByteArrayOutputStream.reset:()V
        //  4463: invokestatic    android/util/Xml.newSerializer:()Lorg/xmlpull/v1/XmlSerializer;
        //  4466: astore          52
        //  4468: aload           52
        //  4470: aload           48
        //  4472: getstatic       aexb.c:Ljava/nio/charset/Charset;
        //  4475: invokevirtual   java/nio/charset/Charset.name:()Ljava/lang/String;
        //  4478: invokeinterface org/xmlpull/v1/XmlSerializer.setOutput:(Ljava/io/OutputStream;Ljava/lang/String;)V
        //  4483: aload           8
        //  4485: invokeinterface org/xmlpull/v1/XmlPullParser.nextToken:()I
        //  4490: pop            
        //  4491: aload           8
        //  4493: ldc_w           "Event"
        //  4496: invokestatic    ef.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  4499: ifne            4904
        //  4502: aload           8
        //  4504: invokeinterface org/xmlpull/v1/XmlPullParser.getEventType:()I
        //  4509: tableswitch {
        //                0: 4881
        //                1: 4871
        //                2: 4786
        //                3: 4754
        //                4: 4729
        //                5: 4705
        //                6: 4681
        //                7: 4657
        //                8: 4633
        //                9: 4609
        //               10: 4585
        //          default: 4568
        //        }
        //  4568: lload           30
        //  4570: lstore          34
        //  4572: aload_2        
        //  4573: astore          32
        //  4575: aload           32
        //  4577: astore_2       
        //  4578: lload           34
        //  4580: lstore          30
        //  4582: goto            4893
        //  4585: aload           52
        //  4587: aload           8
        //  4589: invokeinterface org/xmlpull/v1/XmlPullParser.getText:()Ljava/lang/String;
        //  4594: invokeinterface org/xmlpull/v1/XmlSerializer.docdecl:(Ljava/lang/String;)V
        //  4599: aload_2        
        //  4600: astore          32
        //  4602: lload           30
        //  4604: lstore          34
        //  4606: goto            4575
        //  4609: aload           52
        //  4611: aload           8
        //  4613: invokeinterface org/xmlpull/v1/XmlPullParser.getText:()Ljava/lang/String;
        //  4618: invokeinterface org/xmlpull/v1/XmlSerializer.comment:(Ljava/lang/String;)V
        //  4623: aload_2        
        //  4624: astore          32
        //  4626: lload           30
        //  4628: lstore          34
        //  4630: goto            4575
        //  4633: aload           52
        //  4635: aload           8
        //  4637: invokeinterface org/xmlpull/v1/XmlPullParser.getText:()Ljava/lang/String;
        //  4642: invokeinterface org/xmlpull/v1/XmlSerializer.processingInstruction:(Ljava/lang/String;)V
        //  4647: aload_2        
        //  4648: astore          32
        //  4650: lload           30
        //  4652: lstore          34
        //  4654: goto            4575
        //  4657: aload           52
        //  4659: aload           8
        //  4661: invokeinterface org/xmlpull/v1/XmlPullParser.getText:()Ljava/lang/String;
        //  4666: invokeinterface org/xmlpull/v1/XmlSerializer.ignorableWhitespace:(Ljava/lang/String;)V
        //  4671: aload_2        
        //  4672: astore          32
        //  4674: lload           30
        //  4676: lstore          34
        //  4678: goto            4575
        //  4681: aload           52
        //  4683: aload           8
        //  4685: invokeinterface org/xmlpull/v1/XmlPullParser.getText:()Ljava/lang/String;
        //  4690: invokeinterface org/xmlpull/v1/XmlSerializer.entityRef:(Ljava/lang/String;)V
        //  4695: aload_2        
        //  4696: astore          32
        //  4698: lload           30
        //  4700: lstore          34
        //  4702: goto            4575
        //  4705: aload           52
        //  4707: aload           8
        //  4709: invokeinterface org/xmlpull/v1/XmlPullParser.getText:()Ljava/lang/String;
        //  4714: invokeinterface org/xmlpull/v1/XmlSerializer.cdsect:(Ljava/lang/String;)V
        //  4719: aload_2        
        //  4720: astore          32
        //  4722: lload           30
        //  4724: lstore          34
        //  4726: goto            4575
        //  4729: aload           52
        //  4731: aload           8
        //  4733: invokeinterface org/xmlpull/v1/XmlPullParser.getText:()Ljava/lang/String;
        //  4738: invokeinterface org/xmlpull/v1/XmlSerializer.text:(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //  4743: pop            
        //  4744: aload_2        
        //  4745: astore          32
        //  4747: lload           30
        //  4749: lstore          34
        //  4751: goto            4575
        //  4754: aload           52
        //  4756: aload           8
        //  4758: invokeinterface org/xmlpull/v1/XmlPullParser.getNamespace:()Ljava/lang/String;
        //  4763: aload           8
        //  4765: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //  4770: invokeinterface org/xmlpull/v1/XmlSerializer.endTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //  4775: pop            
        //  4776: aload_2        
        //  4777: astore          32
        //  4779: lload           30
        //  4781: lstore          34
        //  4783: goto            4575
        //  4786: aload           52
        //  4788: aload           8
        //  4790: invokeinterface org/xmlpull/v1/XmlPullParser.getNamespace:()Ljava/lang/String;
        //  4795: aload           8
        //  4797: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //  4802: invokeinterface org/xmlpull/v1/XmlSerializer.startTag:(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //  4807: pop            
        //  4808: iconst_0       
        //  4809: istore          11
        //  4811: aload_2        
        //  4812: astore          32
        //  4814: lload           30
        //  4816: lstore          34
        //  4818: iload           11
        //  4820: aload           8
        //  4822: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeCount:()I
        //  4827: if_icmpge       4575
        //  4830: aload           52
        //  4832: aload           8
        //  4834: iload           11
        //  4836: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeNamespace:(I)Ljava/lang/String;
        //  4841: aload           8
        //  4843: iload           11
        //  4845: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeName:(I)Ljava/lang/String;
        //  4850: aload           8
        //  4852: iload           11
        //  4854: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(I)Ljava/lang/String;
        //  4859: invokeinterface org/xmlpull/v1/XmlSerializer.attribute:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
        //  4864: pop            
        //  4865: iinc            11, 1
        //  4868: goto            4811
        //  4871: aload           52
        //  4873: invokeinterface org/xmlpull/v1/XmlSerializer.endDocument:()V
        //  4878: goto            4893
        //  4881: aload           52
        //  4883: aconst_null    
        //  4884: iconst_0       
        //  4885: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  4888: invokeinterface org/xmlpull/v1/XmlSerializer.startDocument:(Ljava/lang/String;Ljava/lang/Boolean;)V
        //  4893: aload           8
        //  4895: invokeinterface org/xmlpull/v1/XmlPullParser.nextToken:()I
        //  4900: pop            
        //  4901: goto            4491
        //  4904: aload           52
        //  4906: invokeinterface org/xmlpull/v1/XmlSerializer.flush:()V
        //  4911: aload           48
        //  4913: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //  4916: astore          32
        //  4918: aload           5
        //  4920: ifnull          4930
        //  4923: aload           5
        //  4925: invokestatic    baw.aj:(Ljava/lang/String;)[B
        //  4928: astore          32
        //  4930: new             Landroidx/media3/extractor/metadata/emsg/EventMessage;
        //  4933: astore          5
        //  4935: aload           5
        //  4937: aload           36
        //  4939: aload           51
        //  4941: lload           118
        //  4943: lload           116
        //  4945: aload           32
        //  4947: invokespecial   androidx/media3/extractor/metadata/emsg/EventMessage.<init>:(Ljava/lang/String;Ljava/lang/String;JJ[B)V
        //  4950: aload           49
        //  4952: lload           121
        //  4954: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4957: aload           5
        //  4959: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
        //  4962: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  4967: pop            
        //  4968: aload_2        
        //  4969: astore          32
        //  4971: goto            4988
        //  4974: astore_1       
        //  4975: aconst_null    
        //  4976: astore_2       
        //  4977: goto            5879
        //  4980: aload           8
        //  4982: invokestatic    bji.j:(Lorg/xmlpull/v1/XmlPullParser;)V
        //  4985: aload_2        
        //  4986: astore          32
        //  4988: aload           6
        //  4990: astore          5
        //  4992: aload           9
        //  4994: astore_2       
        //  4995: aload           8
        //  4997: ldc_w           "EventStream"
        //  5000: invokestatic    ef.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  5003: ifeq            5148
        //  5006: aload           49
        //  5008: invokeinterface java/util/List.size:()I
        //  5013: newarray        J
        //  5015: astore          6
        //  5017: aload           49
        //  5019: invokeinterface java/util/List.size:()I
        //  5024: anewarray       Landroidx/media3/extractor/metadata/emsg/EventMessage;
        //  5027: astore          9
        //  5029: iconst_0       
        //  5030: istore          11
        //  5032: iload           11
        //  5034: aload           49
        //  5036: invokeinterface java/util/List.size:()I
        //  5041: if_icmpge       5093
        //  5044: aload           49
        //  5046: iload           11
        //  5048: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  5053: checkcast       Landroid/util/Pair;
        //  5056: astore          52
        //  5058: aload           6
        //  5060: iload           11
        //  5062: aload           52
        //  5064: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  5067: checkcast       Ljava/lang/Long;
        //  5070: invokevirtual   java/lang/Long.longValue:()J
        //  5073: lastore        
        //  5074: aload           9
        //  5076: iload           11
        //  5078: aload           52
        //  5080: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  5083: checkcast       Landroidx/media3/extractor/metadata/emsg/EventMessage;
        //  5086: aastore        
        //  5087: iinc            11, 1
        //  5090: goto            5032
        //  5093: new             Lder;
        //  5096: astore          52
        //  5098: aload           52
        //  5100: aload           36
        //  5102: aload           51
        //  5104: aload           6
        //  5106: aload           9
        //  5108: invokespecial   der.<init>:(Ljava/lang/String;Ljava/lang/String;[J[Landroidx/media3/extractor/metadata/emsg/EventMessage;)V
        //  5111: aload           70
        //  5113: aload           52
        //  5115: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  5120: pop            
        //  5121: aload           22
        //  5123: astore          6
        //  5125: aload           77
        //  5127: astore          22
        //  5129: iload           46
        //  5131: istore          19
        //  5133: aload           50
        //  5135: astore          36
        //  5137: lload           43
        //  5139: lstore          30
        //  5141: aload           53
        //  5143: astore          9
        //  5145: goto            5412
        //  5148: aload_2        
        //  5149: astore          9
        //  5151: aload           5
        //  5153: astore          6
        //  5155: aload           32
        //  5157: astore_2       
        //  5158: goto            4367
        //  5161: aload_2        
        //  5162: astore          5
        //  5164: aload           79
        //  5166: astore_2       
        //  5167: aload           8
        //  5169: ldc_w           "SegmentBase"
        //  5172: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  5175: istore          19
        //  5177: iload           19
        //  5179: ifeq            5221
        //  5182: aload           8
        //  5184: aconst_null    
        //  5185: invokestatic    bji.x:(Lorg/xmlpull/v1/XmlPullParser;Lbjt;)Lbjt;
        //  5188: astore          74
        //  5190: aload           77
        //  5192: astore          22
        //  5194: iload           46
        //  5196: istore          19
        //  5198: aload           50
        //  5200: astore          36
        //  5202: lload           43
        //  5204: lstore          30
        //  5206: aload           52
        //  5208: astore          32
        //  5210: aload           53
        //  5212: astore          9
        //  5214: goto            5412
        //  5217: astore_1       
        //  5218: goto            5865
        //  5221: aload           8
        //  5223: ldc_w           "SegmentList"
        //  5226: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  5229: ifeq            5291
        //  5232: aload           8
        //  5234: ldc2_w          -9223372036854775807
        //  5237: invokestatic    bji.l:(Lorg/xmlpull/v1/XmlPullParser;J)J
        //  5240: lstore          30
        //  5242: aload           8
        //  5244: aconst_null    
        //  5245: lload           66
        //  5247: lload           68
        //  5249: lload           80
        //  5251: lload           30
        //  5253: lload           24
        //  5255: invokestatic    bji.y:(Lorg/xmlpull/v1/XmlPullParser;Lbjq;JJJJJ)Lbjq;
        //  5258: astore          74
        //  5260: lload           30
        //  5262: lstore          72
        //  5264: aload           77
        //  5266: astore          22
        //  5268: iload           46
        //  5270: istore          19
        //  5272: aload           50
        //  5274: astore          36
        //  5276: lload           43
        //  5278: lstore          30
        //  5280: aload           52
        //  5282: astore          32
        //  5284: aload           53
        //  5286: astore          9
        //  5288: goto            5412
        //  5291: aload           8
        //  5293: ldc_w           "SegmentTemplate"
        //  5296: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  5299: ifeq            5336
        //  5302: aload           8
        //  5304: ldc2_w          -9223372036854775807
        //  5307: invokestatic    bji.l:(Lorg/xmlpull/v1/XmlPullParser;J)J
        //  5310: lstore          30
        //  5312: aload           8
        //  5314: aconst_null    
        //  5315: invokestatic    afcr.q:()Lafcr;
        //  5318: lload           66
        //  5320: lload           68
        //  5322: lload           80
        //  5324: lload           30
        //  5326: lload           24
        //  5328: invokestatic    bji.z:(Lorg/xmlpull/v1/XmlPullParser;Lbjr;Ljava/util/List;JJJJJ)Lbjr;
        //  5331: astore          74
        //  5333: goto            5260
        //  5336: aload           8
        //  5338: ldc_w           "AssetIdentifier"
        //  5341: invokestatic    ef.j:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  5344: ifeq            5383
        //  5347: aload           8
        //  5349: ldc_w           "AssetIdentifier"
        //  5352: invokestatic    bji.g:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Lbjj;
        //  5355: pop            
        //  5356: aload           77
        //  5358: astore          22
        //  5360: iload           46
        //  5362: istore          19
        //  5364: aload           50
        //  5366: astore          36
        //  5368: lload           43
        //  5370: lstore          30
        //  5372: aload           52
        //  5374: astore          32
        //  5376: aload           53
        //  5378: astore          9
        //  5380: goto            5412
        //  5383: aload           8
        //  5385: invokestatic    bji.j:(Lorg/xmlpull/v1/XmlPullParser;)V
        //  5388: aload           53
        //  5390: astore          9
        //  5392: aload           52
        //  5394: astore          32
        //  5396: lload           43
        //  5398: lstore          30
        //  5400: aload           50
        //  5402: astore          36
        //  5404: iload           46
        //  5406: istore          19
        //  5408: aload           77
        //  5410: astore          22
        //  5412: aload           8
        //  5414: aload           76
        //  5416: invokestatic    ef.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  5419: ifeq            5599
        //  5422: new             Ladff;
        //  5425: astore          32
        //  5427: aload           32
        //  5429: aload           63
        //  5431: lload           64
        //  5433: aload           5
        //  5435: aload           70
        //  5437: invokespecial   adff.<init>:(Ljava/lang/String;JLjava/util/List;Ljava/util/List;)V
        //  5440: aload           32
        //  5442: lload           68
        //  5444: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  5447: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
        //  5450: astore          6
        //  5452: aload           6
        //  5454: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  5457: checkcast       Ladff;
        //  5460: astore          32
        //  5462: aload           32
        //  5464: getfield        adff.a:J
        //  5467: ldc2_w          -9223372036854775807
        //  5470: lcmp           
        //  5471: ifne            5533
        //  5474: iload           12
        //  5476: ifeq            5489
        //  5479: iconst_1       
        //  5480: istore          42
        //  5482: lload           30
        //  5484: lstore          34
        //  5486: goto            5582
        //  5489: aload_3        
        //  5490: invokeinterface java/util/List.size:()I
        //  5495: istore          11
        //  5497: new             Ljava/lang/StringBuilder;
        //  5500: astore_1       
        //  5501: aload_1        
        //  5502: invokespecial   java/lang/StringBuilder.<init>:()V
        //  5505: aload_1        
        //  5506: ldc_w           "Unable to determine start of period "
        //  5509: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  5512: pop            
        //  5513: aload_1        
        //  5514: iload           11
        //  5516: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  5519: pop            
        //  5520: aload_1        
        //  5521: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  5524: astore_1       
        //  5525: aload_1        
        //  5526: aconst_null    
        //  5527: invokestatic    ayz.c:(Ljava/lang/String;Ljava/lang/Throwable;)Layz;
        //  5530: astore_1       
        //  5531: aload_1        
        //  5532: athrow         
        //  5533: aload           6
        //  5535: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  5538: checkcast       Ljava/lang/Long;
        //  5541: invokevirtual   java/lang/Long.longValue:()J
        //  5544: lstore          30
        //  5546: lload           30
        //  5548: ldc2_w          -9223372036854775807
        //  5551: lcmp           
        //  5552: ifne            5563
        //  5555: ldc2_w          -9223372036854775807
        //  5558: lstore          34
        //  5560: goto            5573
        //  5563: aload           32
        //  5565: getfield        adff.a:J
        //  5568: lload           30
        //  5570: ladd           
        //  5571: lstore          34
        //  5573: aload_3        
        //  5574: aload           32
        //  5576: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  5581: pop            
        //  5582: aload_3        
        //  5583: astore          32
        //  5585: lload           54
        //  5587: lstore          30
        //  5589: aload           76
        //  5591: astore_3       
        //  5592: aload           61
        //  5594: astore          6
        //  5596: goto            5695
        //  5599: aload           22
        //  5601: astore          77
        //  5603: iload           19
        //  5605: istore          46
        //  5607: aload           7
        //  5609: astore          78
        //  5611: aload           36
        //  5613: astore          7
        //  5615: lload           30
        //  5617: lstore          43
        //  5619: iload           12
        //  5621: istore          19
        //  5623: aload           9
        //  5625: astore          36
        //  5627: lload           80
        //  5629: lstore          30
        //  5631: aload           45
        //  5633: astore          47
        //  5635: aload           5
        //  5637: astore          22
        //  5639: aload_2        
        //  5640: astore          79
        //  5642: aload           32
        //  5644: astore_2       
        //  5645: aload           7
        //  5647: astore          9
        //  5649: aload_3        
        //  5650: astore          32
        //  5652: goto            1238
        //  5655: aload           6
        //  5657: astore_2       
        //  5658: iload           12
        //  5660: istore          46
        //  5662: aload           9
        //  5664: astore          6
        //  5666: aload           36
        //  5668: astore          9
        //  5670: aload           8
        //  5672: invokestatic    bji.j:(Lorg/xmlpull/v1/XmlPullParser;)V
        //  5675: lload           54
        //  5677: lstore          30
        //  5679: iload           19
        //  5681: istore          12
        //  5683: aload           6
        //  5685: astore          36
        //  5687: iload           46
        //  5689: istore          19
        //  5691: aload           61
        //  5693: astore          6
        //  5695: aload           8
        //  5697: aload           23
        //  5699: invokestatic    ef.h:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //  5702: ifeq            5811
        //  5705: lload           15
        //  5707: lstore          30
        //  5709: lload           15
        //  5711: ldc2_w          -9223372036854775807
        //  5714: lcmp           
        //  5715: ifne            5757
        //  5718: lload           34
        //  5720: ldc2_w          -9223372036854775807
        //  5723: lcmp           
        //  5724: ifeq            5734
        //  5727: lload           34
        //  5729: lstore          30
        //  5731: goto            5757
        //  5734: iload           12
        //  5736: ifeq            5747
        //  5739: ldc2_w          -9223372036854775807
        //  5742: lstore          30
        //  5744: goto            5757
        //  5747: ldc_w           "Unable to determine duration of static manifest."
        //  5750: aconst_null    
        //  5751: invokestatic    ayz.c:(Ljava/lang/String;Ljava/lang/Throwable;)Layz;
        //  5754: astore_1       
        //  5755: aload_1        
        //  5756: athrow         
        //  5757: aload           32
        //  5759: invokeinterface java/util/List.isEmpty:()Z
        //  5764: ifne            5801
        //  5767: new             Lbjg;
        //  5770: dup            
        //  5771: lload           13
        //  5773: lload           30
        //  5775: lload           17
        //  5777: iload           12
        //  5779: lload           20
        //  5781: lload           24
        //  5783: lload           26
        //  5785: lload           28
        //  5787: aload           40
        //  5789: aload           37
        //  5791: aload           39
        //  5793: aload           38
        //  5795: aload           32
        //  5797: invokespecial   bjg.<init>:(JJJZJJJJLbjk;Lbjx;Lbjv;Landroid/net/Uri;Ljava/util/List;)V
        //  5800: areturn        
        //  5801: ldc_w           "No periods found."
        //  5804: aconst_null    
        //  5805: invokestatic    ayz.c:(Ljava/lang/String;Ljava/lang/Throwable;)Layz;
        //  5808: astore_1       
        //  5809: aload_1        
        //  5810: athrow         
        //  5811: aload_2        
        //  5812: astore          5
        //  5814: aload           6
        //  5816: astore_2       
        //  5817: aload           36
        //  5819: astore          45
        //  5821: iload           12
        //  5823: istore          46
        //  5825: aload           9
        //  5827: astore          36
        //  5829: aload           5
        //  5831: astore          6
        //  5833: iload           19
        //  5835: istore          12
        //  5837: aload           45
        //  5839: astore          9
        //  5841: iload           46
        //  5843: istore          19
        //  5845: goto            439
        //  5848: astore_1       
        //  5849: aconst_null    
        //  5850: astore_2       
        //  5851: goto            5879
        //  5854: ldc_w           "inputStream does not contain a valid media presentation description"
        //  5857: aconst_null    
        //  5858: invokestatic    ayz.c:(Ljava/lang/String;Ljava/lang/Throwable;)Layz;
        //  5861: astore_1       
        //  5862: aload_1        
        //  5863: athrow         
        //  5864: astore_1       
        //  5865: aconst_null    
        //  5866: astore_2       
        //  5867: goto            5879
        //  5870: astore_1       
        //  5871: aconst_null    
        //  5872: astore_2       
        //  5873: goto            5879
        //  5876: astore_1       
        //  5877: aconst_null    
        //  5878: astore_2       
        //  5879: aload_2        
        //  5880: aload_1        
        //  5881: invokestatic    ayz.c:(Ljava/lang/String;Ljava/lang/Throwable;)Layz;
        //  5884: astore_1       
        //  5885: goto            5890
        //  5888: aload_1        
        //  5889: athrow         
        //  5890: goto            5888
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  23     86     5876   5879   Lorg/xmlpull/v1/XmlPullParserException;
        //  91     100    5876   5879   Lorg/xmlpull/v1/XmlPullParserException;
        //  100    104    5876   5879   Lorg/xmlpull/v1/XmlPullParserException;
        //  120    131    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  146    182    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  182    194    5848   5854   Lorg/xmlpull/v1/XmlPullParserException;
        //  194    203    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  208    221    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  244    257    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  270    283    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  291    301    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  318    334    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  351    396    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  439    457    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  466    475    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  475    490    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  534    542    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  552    574    744    750    Lorg/xmlpull/v1/XmlPullParserException;
        //  583    611    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  622    642    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  653    673    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  684    689    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  713    741    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  754    764    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  777    801    817    823    Lorg/xmlpull/v1/XmlPullParserException;
        //  801    814    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  823    850    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  856    866    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  891    899    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  899    949    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  964    995    5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1010   1039   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1060   1069   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1074   1081   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1098   1110   744    750    Lorg/xmlpull/v1/XmlPullParserException;
        //  1110   1122   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1146   1189   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1238   1256   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1265   1274   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1274   1289   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1354   1364   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1373   1382   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1393   1410   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1410   1423   4240   4246   Lorg/xmlpull/v1/XmlPullParserException;
        //  1423   1436   4240   4246   Lorg/xmlpull/v1/XmlPullParserException;
        //  1440   1451   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1456   1477   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1481   1492   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1492   1504   744    750    Lorg/xmlpull/v1/XmlPullParserException;
        //  1508   1521   744    750    Lorg/xmlpull/v1/XmlPullParserException;
        //  1521   1531   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1531   1541   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1541   1551   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1556   1566   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1566   1576   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1576   1586   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1586   1596   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1596   1606   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1677   1695   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1704   1713   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1713   1728   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1830   1848   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1848   1866   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1866   1888   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1898   1908   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1913   1925   5864   5865   Lorg/xmlpull/v1/XmlPullParserException;
        //  1943   1952   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1952   1964   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1967   1992   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  1995   2013   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2016   2041   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2048   2071   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2074   2097   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2100   2110   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2115   2122   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2143   2155   5848   5854   Lorg/xmlpull/v1/XmlPullParserException;
        //  2159   2182   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2186   2210   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2214   2235   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2239   2251   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2255   2299   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2303   2313   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2383   2401   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2410   2419   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2419   2434   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2440   2458   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2484   2506   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2517   2558   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2573   2616   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2627   2645   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2645   2662   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2662   2684   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2687   2712   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2715   2736   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2739   2762   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2765   2770   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2816   2860   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2872   2886   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2886   2900   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  2911   2960   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3101   3122   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3133   3172   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3179   3221   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3224   3249   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3252   3273   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3276   3289   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3415   3443   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3450   3486   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3491   3498   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3498   3505   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3518   3525   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3525   3541   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3544   3587   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3592   3600   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3652   3731   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3740   3749   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3754   3774   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3777   3836   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3851   3872   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3899   3989   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  3992   4020   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4020   4030   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4054   4067   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4070   4099   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4275   4286   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4286   4297   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4301   4357   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4367   4447   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4447   4458   4974   4980   Lorg/xmlpull/v1/XmlPullParserException;
        //  4458   4491   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4491   4568   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4585   4599   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4609   4623   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4633   4647   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4657   4671   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4681   4695   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4705   4719   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4729   4744   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4754   4776   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4786   4808   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4818   4865   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4871   4878   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4881   4893   817    823    Lorg/xmlpull/v1/XmlPullParserException;
        //  4893   4901   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4904   4918   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4923   4930   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4930   4968   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4980   4985   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  4995   5029   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5032   5087   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5093   5121   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5167   5177   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5182   5190   5217   5221   Lorg/xmlpull/v1/XmlPullParserException;
        //  5221   5260   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5291   5333   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5336   5356   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5383   5388   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5412   5474   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5489   5525   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5525   5531   5864   5865   Lorg/xmlpull/v1/XmlPullParserException;
        //  5531   5533   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5533   5546   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5563   5573   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5573   5582   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5670   5675   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5695   5705   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5747   5755   5864   5865   Lorg/xmlpull/v1/XmlPullParserException;
        //  5755   5757   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5757   5801   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5801   5809   5864   5865   Lorg/xmlpull/v1/XmlPullParserException;
        //  5809   5811   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        //  5854   5862   5864   5865   Lorg/xmlpull/v1/XmlPullParserException;
        //  5862   5864   5870   5876   Lorg/xmlpull/v1/XmlPullParserException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1935:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
