// 
// Decompiled by Procyon v0.6.0
// 

final class buq implements buk
{
    public final afgh a;
    public final int b;
    
    private buq(final int b, final afgh a) {
        this.b = b;
        this.a = a;
    }
    
    public static buq c(final int n, final bat bat) {
        final afgc afgc = new afgc();
        final int c = bat.c;
        int n2 = -2;
        while (bat.a() > 8) {
            final int e = bat.e();
            final int n3 = bat.b + bat.e();
            bat.F(n3);
            Object c2 = null;
            Label_0818: {
                if (e == 1414744396) {
                    c2 = c(bat.e(), bat);
                }
                else {
                    switch (e) {
                        case 1852994675: {
                            c2 = new bus(bat.w(bat.a()));
                            break Label_0818;
                        }
                        case 1752331379: {
                            final int e2 = bat.e();
                            bat.H(12);
                            bat.e();
                            final int e3 = bat.e();
                            final int e4 = bat.e();
                            bat.H(4);
                            final int e5 = bat.e();
                            final int e6 = bat.e();
                            bat.H(8);
                            c2 = new buo(e2, e3, e4, e5, e6);
                            break Label_0818;
                        }
                        case 1751742049: {
                            final int e7 = bat.e();
                            bat.H(8);
                            final int e8 = bat.e();
                            final int e9 = bat.e();
                            bat.H(4);
                            bat.e();
                            bat.H(12);
                            c2 = new bun(e7, e8, e9);
                            break Label_0818;
                        }
                        case 1718776947: {
                            if (n2 == 2) {
                                bat.H(4);
                                final int e10 = bat.e();
                                final int e11 = bat.e();
                                bat.H(4);
                                final int e12 = bat.e();
                                String k = null;
                                switch (e12) {
                                    default: {
                                        k = null;
                                        break;
                                    }
                                    case 1196444237:
                                    case 1735420525: {
                                        k = "video/mjpeg";
                                        break;
                                    }
                                    case 859066445: {
                                        k = "video/mp43";
                                        break;
                                    }
                                    case 842289229: {
                                        k = "video/mp42";
                                        break;
                                    }
                                    case 826496577:
                                    case 828601953:
                                    case 875967048: {
                                        k = "video/avc";
                                        break;
                                    }
                                    case 808802372:
                                    case 877677894:
                                    case 1145656883:
                                    case 1145656920:
                                    case 1482049860:
                                    case 1684633208:
                                    case 2021026148: {
                                        k = "video/mp4v-es";
                                        break;
                                    }
                                }
                                if (k == null) {
                                    final StringBuilder sb = new StringBuilder("Ignoring track with unsupported compression ");
                                    sb.append(e12);
                                    baq.c("StreamFormatChunk", sb.toString());
                                    break;
                                }
                                final ayg ayg = new ayg();
                                ayg.p = e10;
                                ayg.q = e11;
                                ayg.k = k;
                                c2 = new bur(ayg.a());
                                break Label_0818;
                            }
                            else {
                                if (n2 != 1) {
                                    baq.c("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(baz.S(n2)));
                                    break;
                                }
                                final int g = bat.g();
                                String i;
                                if (g != 1) {
                                    if (g != 85) {
                                        if (g != 255) {
                                            if (g != 8192) {
                                                if (g != 8193) {
                                                    i = null;
                                                }
                                                else {
                                                    i = "audio/vnd.dts";
                                                }
                                            }
                                            else {
                                                i = "audio/ac3";
                                            }
                                        }
                                        else {
                                            i = "audio/mp4a-latm";
                                        }
                                    }
                                    else {
                                        i = "audio/mpeg";
                                    }
                                }
                                else {
                                    i = "audio/raw";
                                }
                                if (i == null) {
                                    final StringBuilder sb2 = new StringBuilder("Ignoring track with unsupported format tag ");
                                    sb2.append(g);
                                    baq.c("StreamFormatChunk", sb2.toString());
                                    break;
                                }
                                final int g2 = bat.g();
                                final int e13 = bat.e();
                                bat.H(6);
                                final int l = baz.l(bat.m());
                                final int g3 = bat.g();
                                final byte[] array = new byte[g3];
                                bat.B(array, 0, g3);
                                final ayg ayg2 = new ayg();
                                ayg2.k = i;
                                ayg2.x = g2;
                                ayg2.y = e13;
                                if ("audio/raw".equals(i) && l != 0) {
                                    ayg2.z = l;
                                }
                                if ("audio/mp4a-latm".equals(i) && g3 > 0) {
                                    ayg2.m = afgh.r(array);
                                }
                                c2 = new bur(ayg2.a());
                                break Label_0818;
                            }
                            break;
                        }
                    }
                    c2 = null;
                }
            }
            int n4 = n2;
            if (c2 != null) {
                if (((buk)c2).a() == 1752331379) {
                    final int a = ((buo)c2).a;
                    if (a != 1935960438) {
                        if (a != 1935963489) {
                            if (a != 1937012852) {
                                baq.c("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(a))));
                                n2 = -1;
                            }
                            else {
                                n2 = 3;
                            }
                        }
                        else {
                            n2 = 1;
                        }
                    }
                    else {
                        n2 = 2;
                    }
                }
                afgc.h(c2);
                n4 = n2;
            }
            bat.G(n3);
            bat.F(c);
            n2 = n4;
        }
        return new buq(n, afgc.g());
    }
    
    public final int a() {
        return this.b;
    }
    
    public final buk b(final Class clazz) {
        final afgh a = this.a;
        final int c = ((afjx)a).c;
        int i = 0;
        while (i < c) {
            final buk buk = a.get(i);
            final Class<? extends buk> class1 = buk.getClass();
            ++i;
            if (class1 == clazz) {
                return buk;
            }
        }
        return null;
    }
}
