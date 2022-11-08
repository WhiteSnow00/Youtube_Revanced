import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.io.IOException;
import java.util.logging.Level;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asbe
{
    private static final Logger a;
    
    static {
        a = Logger.getLogger(asbe.class.getName());
    }
    
    private asbe() {
    }
    
    public static Object a(String s) {
        s = (String)new agmx((Reader)new StringReader(s));
        try {
            return b((agmx)s);
        }
        finally {
            try {
                ((agmx)s).close();
            }
            catch (final IOException ex) {
                asbe.a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", ex);
            }
        }
    }
    
    private static Object b(final agmx agmx) {
        agot.E(agmx.g(), (Object)"unexpected end of JSON");
        final int n = agmx.h() - 1;
        boolean b = true;
        if (n != 0) {
            final char c = '\"';
            if (n != 2) {
                if (n == 5) {
                    int n2;
                    if ((n2 = agmx.c) == 0) {
                        n2 = agmx.a();
                    }
                    String s;
                    if (n2 == 10) {
                        s = agmx.e();
                    }
                    else if (n2 == 8) {
                        s = agmx.d('\'');
                    }
                    else if (n2 == 9) {
                        s = agmx.d('\"');
                    }
                    else if (n2 == 11) {
                        s = agmx.f;
                        agmx.f = null;
                    }
                    else if (n2 == 15) {
                        s = Long.toString(agmx.d);
                    }
                    else {
                        if (n2 != 16) {
                            final int h = agmx.h();
                            final String c2 = agmx.c();
                            final StringBuilder sb = new StringBuilder("Expected a string but was ");
                            sb.append(agnj.b(h));
                            sb.append(c2);
                            throw new IllegalStateException(sb.toString());
                        }
                        s = new String(agmx.a, agmx.b, agmx.e);
                        agmx.b += agmx.e;
                    }
                    agmx.c = 0;
                    final int[] i = agmx.i;
                    final int n3 = agmx.g - 1;
                    ++i[n3];
                    return s;
                }
                if (n == 6) {
                    int n4;
                    if ((n4 = agmx.c) == 0) {
                        n4 = agmx.a();
                    }
                    double double1;
                    if (n4 == 15) {
                        agmx.c = 0;
                        final int[] j = agmx.i;
                        final int n5 = agmx.g - 1;
                        ++j[n5];
                        double1 = (double)agmx.d;
                    }
                    else {
                        if (n4 == 16) {
                            final char[] a = agmx.a;
                            final int b2 = agmx.b;
                            final int e = agmx.e;
                            agmx.f = new String(a, b2, e);
                            agmx.b = b2 + e;
                        }
                        else if (n4 != 8 && n4 != 9) {
                            if (n4 == 10) {
                                agmx.f = agmx.e();
                            }
                            else if (n4 != 11) {
                                final int h2 = agmx.h();
                                final String c3 = agmx.c();
                                final StringBuilder sb2 = new StringBuilder("Expected a double but was ");
                                sb2.append(agnj.b(h2));
                                sb2.append(c3);
                                throw new IllegalStateException(sb2.toString());
                            }
                        }
                        else {
                            char c4 = c;
                            if (n4 == 8) {
                                c4 = '\'';
                            }
                            agmx.f = agmx.d(c4);
                        }
                        agmx.c = 11;
                        double1 = Double.parseDouble(agmx.f);
                        if (Double.isNaN(double1) || Double.isInfinite(double1)) {
                            final String c5 = agmx.c();
                            final StringBuilder sb3 = new StringBuilder("JSON forbids NaN and infinities: ");
                            sb3.append(double1);
                            sb3.append(c5);
                            throw new agmy(sb3.toString());
                        }
                        agmx.f = null;
                        agmx.c = 0;
                        final int[] k = agmx.i;
                        final int n6 = agmx.g - 1;
                        ++k[n6];
                    }
                    return double1;
                }
                if (n == 7) {
                    int n7;
                    if ((n7 = agmx.c) == 0) {
                        n7 = agmx.a();
                    }
                    if (n7 == 5) {
                        agmx.c = 0;
                        final int[] l = agmx.i;
                        final int n8 = agmx.g - 1;
                        ++l[n8];
                    }
                    else {
                        if (n7 != 6) {
                            final int h3 = agmx.h();
                            final String c6 = agmx.c();
                            final StringBuilder sb4 = new StringBuilder("Expected a boolean but was ");
                            sb4.append(agnj.b(h3));
                            sb4.append(c6);
                            throw new IllegalStateException(sb4.toString());
                        }
                        agmx.c = 0;
                        final int[] m = agmx.i;
                        final int n9 = agmx.g - 1;
                        ++m[n9];
                        b = false;
                    }
                    return b;
                }
                if (n != 8) {
                    throw new IllegalStateException("Bad token: ".concat(agmx.b()));
                }
                int n10;
                if ((n10 = agmx.c) == 0) {
                    n10 = agmx.a();
                }
                if (n10 == 7) {
                    agmx.c = 0;
                    final int[] i2 = agmx.i;
                    final int n11 = agmx.g - 1;
                    ++i2[n11];
                    return null;
                }
                final int h4 = agmx.h();
                final String c7 = agmx.c();
                final StringBuilder sb5 = new StringBuilder("Expected null but was ");
                sb5.append(agnj.b(h4));
                sb5.append(c7);
                throw new IllegalStateException(sb5.toString());
            }
            else {
                int n12;
                if ((n12 = agmx.c) == 0) {
                    n12 = agmx.a();
                }
                if (n12 != 1) {
                    final int h5 = agmx.h();
                    final String c8 = agmx.c();
                    final StringBuilder sb6 = new StringBuilder("Expected BEGIN_OBJECT but was ");
                    sb6.append(agnj.b(h5));
                    sb6.append(c8);
                    throw new IllegalStateException(sb6.toString());
                }
                agmx.f(3);
                agmx.c = 0;
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (agmx.g()) {
                    int n13;
                    if ((n13 = agmx.c) == 0) {
                        n13 = agmx.a();
                    }
                    String s2;
                    if (n13 == 14) {
                        s2 = agmx.e();
                    }
                    else if (n13 == 12) {
                        s2 = agmx.d('\'');
                    }
                    else {
                        if (n13 != 13) {
                            final int h6 = agmx.h();
                            final String c9 = agmx.c();
                            final StringBuilder sb7 = new StringBuilder("Expected a name but was ");
                            sb7.append(agnj.b(h6));
                            sb7.append(c9);
                            throw new IllegalStateException(sb7.toString());
                        }
                        s2 = agmx.d('\"');
                    }
                    agmx.c = 0;
                    linkedHashMap.put(agmx.h[agmx.g - 1] = s2, b(agmx));
                }
                agot.E(agmx.h() == 4, (Object)"Bad token: ".concat(agmx.b()));
                int n14;
                if ((n14 = agmx.c) == 0) {
                    n14 = agmx.a();
                }
                if (n14 == 2) {
                    int g = agmx.g - 1;
                    agmx.g = g;
                    agmx.h[g] = null;
                    final int[] i3 = agmx.i;
                    --g;
                    ++i3[g];
                    agmx.c = 0;
                    return Collections.unmodifiableMap((Map<?, ?>)linkedHashMap);
                }
                final int h7 = agmx.h();
                final String c10 = agmx.c();
                final StringBuilder sb8 = new StringBuilder("Expected END_OBJECT but was ");
                sb8.append(agnj.b(h7));
                sb8.append(c10);
                throw new IllegalStateException(sb8.toString());
            }
        }
        else {
            int n15;
            if ((n15 = agmx.c) == 0) {
                n15 = agmx.a();
            }
            if (n15 != 3) {
                final int h8 = agmx.h();
                final String c11 = agmx.c();
                final StringBuilder sb9 = new StringBuilder("Expected BEGIN_ARRAY but was ");
                sb9.append(agnj.b(h8));
                sb9.append(c11);
                throw new IllegalStateException(sb9.toString());
            }
            agmx.f(1);
            agmx.i[agmx.g - 1] = 0;
            agmx.c = 0;
            final ArrayList list = new ArrayList();
            while (agmx.g()) {
                list.add(b(agmx));
            }
            agot.E(agmx.h() == 2, (Object)"Bad token: ".concat(agmx.b()));
            int n16;
            if ((n16 = agmx.c) == 0) {
                n16 = agmx.a();
            }
            if (n16 == 4) {
                int g2 = agmx.g - 1;
                agmx.g = g2;
                final int[] i4 = agmx.i;
                --g2;
                ++i4[g2];
                agmx.c = 0;
                return Collections.unmodifiableList((List<?>)list);
            }
            final int h9 = agmx.h();
            final String c12 = agmx.c();
            final StringBuilder sb10 = new StringBuilder("Expected END_ARRAY but was ");
            sb10.append(agnj.b(h9));
            sb10.append(c12);
            throw new IllegalStateException(sb10.toString());
        }
    }
}
