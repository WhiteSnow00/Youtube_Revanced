import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;
import java.util.List;
import java.util.Arrays;
import android.util.Patterns;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjj
{
    private static final qjk a;
    
    static {
        a = qjk.b();
    }
    
    public static kji a(final String s, final apjn apjn) {
        final boolean empty = s.isEmpty();
        algl algl = null;
        algl algl2 = null;
        if (empty) {
            kji kji;
            if (apjn.c) {
                kji = kji.a();
            }
            else {
                ajut ajut;
                if ((apjn.b & 0x2) != 0x0) {
                    if ((ajut = apjn.d) == null) {
                        ajut = ajut.a;
                    }
                }
                else {
                    ajut = null;
                }
                aiqj aiqj;
                if ((apjn.b & 0x4) != 0x0) {
                    if ((aiqj = apjn.e) == null) {
                        aiqj = aiqj.a;
                    }
                }
                else {
                    aiqj = null;
                }
                if ((apjn.b & 0x8) != 0x0 && (algl2 = apjn.f) == null) {
                    algl2 = algl.a;
                }
                kji = kji.b(ajut, aiqj, algl2);
            }
            return kji;
        }
        for (int i = 0; i < apjn.g.size(); ++i) {
            final apjm apjm = (apjm)apjn.g.get(i);
            final int c = apjm.c;
            boolean b = true;
            Label_0291: {
                if (c == 1) {
                    b = c(s, (apjl)apjm.d);
                }
                else {
                    if (c != 2) {
                        continue;
                    }
                    int ax;
                    if ((ax = aqsx.ax(((apjk)apjm.d).b)) == 0) {
                        ax = 1;
                    }
                    Label_0279: {
                        if (--ax != 1) {
                            Label_0241: {
                                if (ax == 2) {
                                    try {
                                        final qjk a = kjj.a;
                                        if (a.m(a.e((CharSequence)s, (String)null))) {
                                            break Label_0291;
                                        }
                                        break Label_0241;
                                    }
                                    catch (final qjj qjj) {
                                        break Label_0241;
                                    }
                                    break Label_0279;
                                }
                            }
                            b = false;
                            break Label_0291;
                        }
                    }
                    b = Patterns.EMAIL_ADDRESS.matcher(s).matches();
                }
            }
            if (!b) {
                ajut ajut2;
                if ((apjm.b & 0x4) != 0x0) {
                    if ((ajut2 = apjm.e) == null) {
                        ajut2 = ajut.a;
                    }
                }
                else {
                    ajut2 = null;
                }
                aiqj aiqj2;
                if ((apjm.b & 0x8) != 0x0) {
                    if ((aiqj2 = apjm.f) == null) {
                        aiqj2 = aiqj.a;
                    }
                }
                else {
                    aiqj2 = null;
                }
                if ((apjm.b & 0x10) != 0x0 && (algl = apjm.g) == null) {
                    algl = algl.a;
                }
                return kji.b(ajut2, aiqj2, algl);
            }
        }
        return kji.a();
    }
    
    public static void b(final wyw wyw, final wyt wyt, final algl algl) {
        if (algl != null) {
            final List<algl> list = Arrays.asList(algl);
            final ahaz builder = ((ahbh)alhi.a).createBuilder();
            final ahaz builder2 = ((ahbh)algn.a).createBuilder();
            final ahaz builder3 = ((ahbh)algm.a).createBuilder();
            builder3.be((Iterable)list);
            builder2.copyOnWrite();
            final algn algn = (algn)builder2.instance;
            final algm d = (algm)builder3.build();
            d.getClass();
            algn.d = d;
            algn.c = 1;
            builder.copyOnWrite();
            final alhi alhi = (alhi)builder.instance;
            final algn v = (algn)builder2.build();
            v.getClass();
            alhi.v = v;
            alhi.c |= 0x400;
            wyw.w((wzz)wyt, (alhi)builder.build());
        }
    }
    
    private static boolean c(final String s, final apjl apjl) {
        final int size = apjl.b.size();
        final int aw = aqsx.aw(apjl.c);
        final boolean b = true;
        int n = aw;
        if (aw == 0) {
            n = 1;
        }
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4 = n;
            int n5 = n3;
            Label_0126: {
                if (n2 >= size) {
                    break Label_0126;
                }
                final String s2 = (String)apjl.b.get(n2);
                while (true) {
                    try {
                        final boolean find = Pattern.compile(s2).matcher(s).find();
                        int n6 = n3;
                        if (find) {
                            ++n3;
                            n4 = n;
                            n5 = n3;
                            if (n != 2) {
                                n6 = n3;
                                if (n != 3) {
                                    break Label_0117;
                                }
                                n4 = 3;
                                n5 = n3;
                            }
                            if (n4 == 2) {
                                final boolean b2 = b;
                                if (n5 > 0) {
                                    return b2;
                                }
                            }
                            if (n4 == 3) {
                                final boolean b2 = b;
                                if (n5 == 0) {
                                    return b2;
                                }
                            }
                            boolean b2;
                            if (n4 == 4) {
                                if (n5 >= size) {
                                    return false;
                                }
                                b2 = b;
                            }
                            else {
                                b2 = false;
                            }
                            return b2;
                        }
                        ++n2;
                        n3 = n6;
                    }
                    catch (final PatternSyntaxException ex) {
                        final int n6 = n3;
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
