import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bun implements buh
{
    public final afeq a;
    public final int b;
    
    private bun(final int b, final afeq a) {
        this.b = b;
        this.a = a;
    }
    
    public static bun c(final int n, final bas bas) {
        final afel afel = new afel();
        final int c = bas.c;
        int n2 = -2;
        while (bas.a() > 8) {
            final int e = bas.e();
            final int n3 = bas.b + bas.e();
            bas.F(n3);
            Object c2 = null;
            Label_0820: {
                if (e == 1414744396) {
                    c2 = c(bas.e(), bas);
                }
                else {
                    switch (e) {
                        case 1852994675: {
                            c2 = new bup(bas.w(bas.a()));
                            break Label_0820;
                        }
                        case 1752331379: {
                            final int e2 = bas.e();
                            bas.H(12);
                            bas.e();
                            final int e3 = bas.e();
                            final int e4 = bas.e();
                            bas.H(4);
                            final int e5 = bas.e();
                            final int e6 = bas.e();
                            bas.H(8);
                            c2 = new bul(e2, e3, e4, e5, e6);
                            break Label_0820;
                        }
                        case 1751742049: {
                            final int e7 = bas.e();
                            bas.H(8);
                            final int e8 = bas.e();
                            final int e9 = bas.e();
                            bas.H(4);
                            bas.e();
                            bas.H(12);
                            c2 = new buk(e7, e8, e9);
                            break Label_0820;
                        }
                        case 1718776947: {
                            if (n2 == 2) {
                                bas.H(4);
                                final int e10 = bas.e();
                                final int e11 = bas.e();
                                bas.H(4);
                                final int e12 = bas.e();
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
                                    bap.c("StreamFormatChunk", sb.toString());
                                    break;
                                }
                                final ayf ayf = new ayf();
                                ayf.p = e10;
                                ayf.q = e11;
                                ayf.k = k;
                                c2 = new buo(ayf.a());
                                break Label_0820;
                            }
                            else {
                                if (n2 != 1) {
                                    bap.c("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(bax.S(n2)));
                                    break;
                                }
                                final int g = bas.g();
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
                                    bap.c("StreamFormatChunk", sb2.toString());
                                    break;
                                }
                                final int g2 = bas.g();
                                final int e13 = bas.e();
                                bas.H(6);
                                final int l = bax.l(bas.m());
                                final int g3 = bas.g();
                                final byte[] array = new byte[g3];
                                bas.B(array, 0, g3);
                                final ayf ayf2 = new ayf();
                                ayf2.k = i;
                                ayf2.x = g2;
                                ayf2.y = e13;
                                if ("audio/raw".equals(i) && l != 0) {
                                    ayf2.z = l;
                                }
                                if ("audio/mp4a-latm".equals(i) && g3 > 0) {
                                    ayf2.m = (List)afeq.r((Object)array);
                                }
                                c2 = new buo(ayf2.a());
                                break Label_0820;
                            }
                            break;
                        }
                    }
                    c2 = null;
                }
            }
            int n4 = n2;
            if (c2 != null) {
                if (((buh)c2).a() == 1752331379) {
                    final int a = ((bul)c2).a;
                    if (a != 1935960438) {
                        if (a != 1935963489) {
                            if (a != 1937012852) {
                                bap.c("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(a))));
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
                afel.h(c2);
                n4 = n2;
            }
            bas.G(n3);
            bas.F(c);
            n2 = n4;
        }
        return new bun(n, afel.g());
    }
    
    public final int a() {
        return this.b;
    }
    
    public final buh b(final Class clazz) {
        final afeq a = this.a;
        final int c = ((afih)a).c;
        int i = 0;
        while (i < c) {
            final buh buh = ((List<buh>)a).get(i);
            final Class<? extends buh> class1 = buh.getClass();
            ++i;
            if (class1 == clazz) {
                return buh;
            }
        }
        return null;
    }
}
