import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import java.util.List;
import java.io.Reader;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParserFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class bvc
{
    private static final String[] a;
    private static final String[] b;
    private static final String[] c;
    
    static {
        a = new String[] { "Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo" };
        b = new String[] { "Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs" };
        c = new String[] { "Camera:MicroVideoOffset", "GCamera:MicroVideoOffset" };
    }
    
    public static foi a(String e) {
        final foi foi = null;
        try {
            final XmlPullParser pullParser = XmlPullParserFactory.newInstance().newPullParser();
            pullParser.setInput((Reader)new StringReader(e));
            pullParser.next();
            if (!ef.j(pullParser, "x:xmpmeta")) {
                throw ayz.a("Couldn't find xmp metadata", (Throwable)null);
            }
            Object q = afcr.q();
            long n = -9223372036854775807L;
            Object o = null;
            long n4 = 0L;
            do {
                pullParser.next();
                Label_0311: {
                    if (ef.j(pullParser, "rdf:Description")) {
                        final String[] a = bvc.a;
                        final int n2 = 0;
                        int n3 = 0;
                        foi foi2;
                        while (true) {
                            foi2 = foi;
                            if (n3 >= 4) {
                                break;
                            }
                            final String e2 = ef.e(pullParser, a[n3]);
                            if (e2 != null) {
                                foi2 = foi;
                                if (Integer.parseInt(e2) == 1) {
                                    final String[] b = bvc.b;
                                    int i = 0;
                                    while (true) {
                                        while (i < 4) {
                                            final String e3 = ef.e(pullParser, b[i]);
                                            if (e3 != null) {
                                                final long long1;
                                                if ((long1 = Long.parseLong(e3)) == -1L) {
                                                    break;
                                                }
                                                final String[] c = bvc.c;
                                                while (true) {
                                                    for (int j = n2; j < 2; ++j) {
                                                        e = ef.e(pullParser, c[j]);
                                                        if (e != null) {
                                                            o = afcr.s((Object)new byz("image/jpeg", 0L, 0L), (Object)new byz("video/mp4", Long.parseLong(e), 0L));
                                                            n4 = long1;
                                                            break Label_0311;
                                                        }
                                                    }
                                                    o = afcr.q();
                                                    continue;
                                                }
                                            }
                                            else {
                                                ++i;
                                            }
                                        }
                                        long long1 = -9223372036854775807L;
                                        continue;
                                    }
                                }
                                break;
                            }
                            else {
                                ++n3;
                            }
                        }
                        return foi2;
                    }
                    if (ef.j(pullParser, "Container:Directory")) {
                        o = b(pullParser, "Container", "Item");
                        n4 = n;
                    }
                    else {
                        o = q;
                        n4 = n;
                        if (ef.j(pullParser, "GContainer:Directory")) {
                            o = b(pullParser, "GContainer", "GContainerItem");
                            n4 = n;
                        }
                    }
                }
                q = o;
                n = n4;
            } while (!ef.h(pullParser, "x:xmpmeta"));
            if (((List)o).isEmpty()) {
                return foi;
            }
            return new foi(n4, (List)o);
        }
        catch (final XmlPullParserException | ayz | NumberFormatException ex) {
            bao.c("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }
    
    private static afcr b(final XmlPullParser xmlPullParser, String concat, final String s) {
        final String concat2 = concat.concat(":Item");
        concat = concat.concat(":Directory");
        final afcm d = afcr.d();
        do {
            xmlPullParser.next();
            if (ef.j(xmlPullParser, concat2)) {
                final String e = ef.e(xmlPullParser, s.concat(":Mime"));
                final String e2 = ef.e(xmlPullParser, s.concat(":Semantic"));
                final String e3 = ef.e(xmlPullParser, s.concat(":Length"));
                final String e4 = ef.e(xmlPullParser, s.concat(":Padding"));
                if (e == null || e2 == null) {
                    return afcr.q();
                }
                long long1;
                if (e3 != null) {
                    long1 = Long.parseLong(e3);
                }
                else {
                    long1 = 0L;
                }
                long long2;
                if (e4 != null) {
                    long2 = Long.parseLong(e4);
                }
                else {
                    long2 = 0L;
                }
                d.h(new byz(e, long1, long2));
            }
        } while (!ef.h(xmlPullParser, concat));
        return d.g();
    }
}
