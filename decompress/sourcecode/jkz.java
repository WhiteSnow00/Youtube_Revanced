import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkz implements adee
{
    private final acwj a;
    
    public jkz(final acwj a) {
        a.getClass();
        this.a = a;
    }
    
    private static final void f(final agzc agzc, final String c, final boolean b) {
        if (c.isEmpty()) {
            return;
        }
        final agzc agzc2 = (agzc)((agzi)ajss.a).createBuilder();
        ((agza)agzc2).copyOnWrite();
        final ajss ajss = (ajss)agzc2.instance;
        c.getClass();
        ajss.b |= 0x1;
        ajss.c = c;
        if (b) {
            ((agza)agzc2).copyOnWrite();
            final ajss ajss2 = (ajss)agzc2.instance;
            ajss2.b |= 0x2;
            ajss2.d = true;
        }
        agzc.i((ajss)((agza)agzc2).build());
    }
    
    private static final agmd g(final String s) {
        return new agmd(s, akwr.a);
    }
    
    public final ListenableFuture a(final String s, final aexq aexq) {
        return this.e(s);
    }
    
    public final ListenableFuture b() {
        return afva.m(g(""));
    }
    
    public final ListenableFuture c() {
        return afva.m(g(""));
    }
    
    public final void d() {
    }
    
    public final ListenableFuture e(final String s) {
        agmd agmd;
        if (s.isEmpty()) {
            agmd = g(s);
        }
        else {
            final List a = this.a.a(s);
            if (a == null) {
                agmd = g(s);
            }
            else {
                final agza builder = ((agzi)anvz.a).createBuilder();
                final Iterator iterator = a.iterator();
                int c = 0;
                while (iterator.hasNext()) {
                    final String s2 = (String)iterator.next();
                    final agzc agzc = (agzc)((agzi)ajsq.a).createBuilder();
                    final StringBuilder sb = new StringBuilder();
                    final ArrayList an = adwd.an((Object[])s2.split("[\\s\\_\\.\\/\\'\",]"));
                    final ArrayList an2 = adwd.an((Object[])s.split("[\\s\\_\\.\\/\\'\",]"));
                    int size = an.size();
                    int i = 0;
                    int n = 0;
                    int n2 = 0;
                    while (i < size) {
                        final String s3 = (String)an.get(i);
                        int n3;
                        if (TextUtils.isEmpty((CharSequence)s3)) {
                            n3 = size;
                        }
                        else {
                            if (s2.charAt(n2) != s3.charAt(0)) {
                                final int n4 = n2;
                                n3 = size;
                                int n5;
                                for (n5 = n4; s2.charAt(n5) != s3.charAt(0); ++n5) {}
                                sb.append(s2, n2, n5);
                                n2 = n5;
                            }
                            else {
                                n3 = size;
                            }
                            final int n6 = n2 + s3.length();
                            int n7 = -1;
                            int j = 0;
                            int n8 = 0;
                            while (j < an2.size()) {
                                final String s4 = (String)an2.get(j);
                                int n9 = n7;
                                int n10 = n8;
                                if (!TextUtils.isEmpty((CharSequence)s4)) {
                                    int n11;
                                    if (s3.equals(s4)) {
                                        n11 = 2;
                                    }
                                    else if (s3.startsWith(s4)) {
                                        n11 = 1;
                                    }
                                    else {
                                        n11 = 0;
                                    }
                                    n9 = n7;
                                    n10 = n8;
                                    if (n11 > n8) {
                                        n9 = j;
                                        n10 = n11;
                                    }
                                }
                                ++j;
                                n7 = n9;
                                n8 = n10;
                            }
                            int n12;
                            if (n8 != 0) {
                                n12 = 0;
                            }
                            else {
                                n12 = 1;
                            }
                            if (n12 != n) {
                                f(agzc, sb.toString(), (boolean)(n != 0));
                                sb.setLength(0);
                            }
                            if (n8 == 2) {
                                sb.append(s3);
                                an2.remove(n7);
                                n = (false ? 1 : 0);
                                n2 = n6;
                            }
                            else {
                                if (n8 == 1) {
                                    final int length = ((String)an2.get(n7)).length();
                                    sb.append(s3, 0, length);
                                    f(agzc, sb.toString(), false);
                                    sb.setLength(0);
                                    sb.append(s3, length, s3.length());
                                    an2.remove(n7);
                                }
                                else {
                                    sb.append(s3);
                                }
                                n = (true ? 1 : 0);
                                n2 = n6;
                            }
                        }
                        ++i;
                        size = n3;
                    }
                    f(agzc, sb.toString(), (boolean)(n != 0));
                    if (n2 < s2.length()) {
                        f(agzc, s2.substring(n2), true);
                    }
                    final ajsq c2 = (ajsq)((agza)agzc).build();
                    final agza builder2 = ((agzi)anwa.a).createBuilder();
                    final agza builder3 = ((agzi)anvy.a).createBuilder();
                    builder3.copyOnWrite();
                    final anvy anvy = (anvy)builder3.instance;
                    c2.getClass();
                    anvy.c = c2;
                    anvy.b |= 0x1;
                    final agza builder4 = ((agzi)akxf.a).createBuilder();
                    builder4.copyOnWrite();
                    final akxf akxf = (akxf)builder4.instance;
                    akxf.b |= 0x1;
                    akxf.c = c;
                    builder4.copyOnWrite();
                    final akxf akxf2 = (akxf)builder4.instance;
                    akxf2.f = 18;
                    akxf2.b |= 0x8;
                    builder4.copyOnWrite();
                    final akxf akxf3 = (akxf)builder4.instance;
                    akxf3.b |= 0x2;
                    akxf3.d = 0;
                    builder4.bb(71);
                    final akxf d = (akxf)builder4.build();
                    builder3.copyOnWrite();
                    final anvy anvy2 = (anvy)builder3.instance;
                    d.getClass();
                    anvy2.d = d;
                    anvy2.b |= 0x10;
                    final anvy d2 = (anvy)builder3.build();
                    builder2.copyOnWrite();
                    final anwa anwa = (anwa)builder2.instance;
                    d2.getClass();
                    anwa.d = d2;
                    anwa.b |= 0x2;
                    builder.by((anwa)builder2.build());
                    ++c;
                }
                final agza builder5 = ((agzi)akwr.a).createBuilder();
                final agza builder6 = ((agzi)akwy.a).createBuilder();
                final anvz c3 = (anvz)builder.build();
                builder6.copyOnWrite();
                final akwy akwy = (akwy)builder6.instance;
                c3.getClass();
                akwy.c = c3;
                akwy.b = 87359530;
                builder5.aZ((akwy)builder6.build());
                agmd = new agmd(s, (akwr)builder5.build());
                this.a.b();
            }
        }
        return afva.m(agmd);
    }
}
