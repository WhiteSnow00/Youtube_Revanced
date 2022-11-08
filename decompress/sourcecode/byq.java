import android.text.Layout$Alignment;
import java.util.Iterator;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayDeque;
import android.text.style.TypefaceSpan;
import android.text.style.BackgroundColorSpan;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import java.util.TreeSet;
import java.util.ArrayList;
import android.text.SpannableStringBuilder;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class byq
{
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final bys f;
    public final String[] g;
    public final String h;
    public final String i;
    public final byq j;
    private final HashMap k;
    private final HashMap l;
    private List m;
    
    public byq(final String a, final String b, final long d, final long e, final bys f, final String[] g, final String h, final String i, final byq j) {
        this.a = a;
        this.b = b;
        this.i = i;
        this.f = f;
        this.g = g;
        this.c = (b != null);
        this.d = d;
        this.e = e;
        dk.d((Object)h);
        this.h = h;
        this.j = j;
        this.k = new HashMap();
        this.l = new HashMap();
    }
    
    private static SpannableStringBuilder i(final String s, final Map map) {
        if (!map.containsKey(s)) {
            final azw azw = new azw();
            azw.a = (CharSequence)new SpannableStringBuilder();
            map.put(s, azw);
        }
        final CharSequence a = map.get(s).a;
        dk.d((Object)a);
        return (SpannableStringBuilder)a;
    }
    
    public final int a() {
        final List m = this.m;
        if (m == null) {
            return 0;
        }
        return m.size();
    }
    
    public final byq b(final int n) {
        final List m = this.m;
        if (m != null) {
            return (byq)m.get(n);
        }
        throw new IndexOutOfBoundsException();
    }
    
    public final void c(final byq byq) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(byq);
    }
    
    public final void d(final TreeSet set, final boolean b) {
        final boolean equals = "p".equals(this.a);
        final boolean equals2 = "div".equals(this.a);
        if (b || equals || (equals2 && this.i != null)) {
            final long d = this.d;
            if (d != -9223372036854775807L) {
                set.add(d);
            }
            final long e = this.e;
            if (e != -9223372036854775807L) {
                set.add(e);
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); ++i) {
                final byq byq = this.m.get(i);
                boolean b2 = true;
                if (!b) {
                    b2 = (equals && b2);
                }
                byq.d(set, b2);
            }
        }
    }
    
    public final void e(final long n, String h, final List list) {
        if (!"".equals(this.h)) {
            h = this.h;
        }
        final boolean h2 = this.h(n);
        int i;
        final int n2 = i = 0;
        if (h2) {
            i = n2;
            if ("div".equals(this.a)) {
                final String j = this.i;
                if (j != null) {
                    list.add(new Pair((Object)h, (Object)j));
                    return;
                }
                i = n2;
            }
        }
        while (i < this.a()) {
            this.b(i).e(n, h, list);
            ++i;
        }
    }
    
    public final void f(final long n, final Map map, final Map map2, final String s, final Map map3) {
        if (!this.h(n)) {
            return;
        }
        String h;
        if (!"".equals(this.h)) {
            h = this.h;
        }
        else {
            h = s;
        }
        for (final Map.Entry<String, V> entry : this.l.entrySet()) {
            final String s2 = entry.getKey();
            int intValue;
            if (this.k.containsKey(s2)) {
                intValue = this.k.get(s2);
            }
            else {
                intValue = 0;
            }
            final int intValue2 = (int)entry.getValue();
            if (intValue != intValue2) {
                final azw azw = map3.get(s2);
                dk.d((Object)azw);
                dk.d((Object)map2.get(h));
                final bys c = bhs.c(this.f, this.g, map);
                SpannableStringBuilder a;
                if ((a = (SpannableStringBuilder)azw.a) == null) {
                    a = new SpannableStringBuilder();
                    azw.a = (CharSequence)a;
                }
                if (c == null) {
                    continue;
                }
                byq byq = this.j;
                if (c.a() != -1) {
                    ((Spannable)a).setSpan((Object)new StyleSpan(c.a()), intValue, intValue2, 33);
                }
                if (c.f == 1) {
                    ((Spannable)a).setSpan((Object)new StrikethroughSpan(), intValue, intValue2, 33);
                }
                if (c.g == 1) {
                    ((Spannable)a).setSpan((Object)new UnderlineSpan(), intValue, intValue2, 33);
                }
                if (c.c) {
                    if (!c.c) {
                        throw new IllegalStateException("Font color has not been defined.");
                    }
                    dj.r((Spannable)a, (Object)new ForegroundColorSpan(c.b), intValue, intValue2);
                }
                if (c.e) {
                    if (!c.e) {
                        throw new IllegalStateException("Background color has not been defined.");
                    }
                    dj.r((Spannable)a, (Object)new BackgroundColorSpan(c.d), intValue, intValue2);
                }
                if (c.a != null) {
                    dj.r((Spannable)a, (Object)new TypefaceSpan(c.a), intValue, intValue2);
                }
                if (c.r != null) {
                    dj.r((Spannable)a, (Object)new dk(), intValue, intValue2);
                }
                final int m = c.m;
                Label_0814: {
                    if (m == 2) {
                        while (true) {
                            while (byq != null) {
                                final bys c2 = bhs.c(byq.f, byq.g, map);
                                if (c2 != null) {
                                    final byq byq2 = byq;
                                    if (c2.m == 1) {
                                        if (byq2 != null) {
                                            final ArrayDeque arrayDeque = new ArrayDeque();
                                            arrayDeque.push(byq2);
                                            while (true) {
                                                while (!arrayDeque.isEmpty()) {
                                                    final byq byq3 = (byq)arrayDeque.pop();
                                                    final bys c3 = bhs.c(byq3.f, byq3.g, map);
                                                    if (c3 != null && c3.m == 3) {
                                                        if (byq3 == null) {
                                                            break Label_0814;
                                                        }
                                                        if (byq3.a() == 1 && byq3.b(0).b != null) {
                                                            final String b = byq3.b(0).b;
                                                            final int a2 = baw.a;
                                                            final bys c4 = bhs.c(byq3.f, byq3.g, map);
                                                            if (c4 == null || c4.n == -1) {
                                                                bhs.c(byq2.f, byq2.g, map);
                                                            }
                                                            ((Spannable)a).setSpan((Object)new dj(), intValue, intValue2, 33);
                                                            break Label_0814;
                                                        }
                                                        bao.f();
                                                        break Label_0814;
                                                    }
                                                    else {
                                                        for (int i = byq3.a() - 1; i >= 0; --i) {
                                                            arrayDeque.push(byq3.b(i));
                                                        }
                                                    }
                                                }
                                                final byq byq3 = null;
                                                continue;
                                            }
                                        }
                                        break Label_0814;
                                    }
                                }
                                byq = byq.j;
                            }
                            final byq byq2 = null;
                            continue;
                        }
                    }
                    if (m == 3 || m == 4) {
                        ((Spannable)a).setSpan((Object)new byl(), intValue, intValue2, 33);
                    }
                }
                if (c.q == 1) {
                    dj.r((Spannable)a, (Object)new axs(), intValue, intValue2);
                }
                final int j = c.j;
                if (j != 1) {
                    if (j != 2) {
                        if (j == 3) {
                            dj.r((Spannable)a, (Object)new RelativeSizeSpan(c.k / 100.0f), intValue, intValue2);
                        }
                    }
                    else {
                        dj.r((Spannable)a, (Object)new RelativeSizeSpan(c.k), intValue, intValue2);
                    }
                }
                else {
                    dj.r((Spannable)a, (Object)new AbsoluteSizeSpan((int)c.k, true), intValue, intValue2);
                }
                if (!"p".equals(this.a)) {
                    continue;
                }
                final float s3 = c.s;
                if (s3 != Float.MAX_VALUE) {
                    azw.l = s3 * -90.0f / 100.0f;
                }
                final Layout$Alignment o = c.o;
                if (o != null) {
                    azw.c = o;
                }
                final Layout$Alignment p5 = c.p;
                if (p5 == null) {
                    continue;
                }
                azw.d = p5;
            }
        }
        for (int k = 0; k < this.a(); ++k) {
            this.b(k).f(n, map, map2, h, map3);
        }
    }
    
    public final void g(final long n, final boolean b, String s, final Map map) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.h)) {
            s = this.h;
        }
        if (this.c && b) {
            final SpannableStringBuilder i = i(s, map);
            s = this.b;
            dk.d((Object)s);
            i.append((CharSequence)s);
            return;
        }
        if ("br".equals(this.a) && b) {
            i(s, map).append('\n');
            return;
        }
        if (this.h(n)) {
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                final HashMap k = this.k;
                final String s2 = entry.getKey();
                final CharSequence a = ((azw)entry.getValue()).a;
                dk.d((Object)a);
                k.put(s2, a.length());
            }
            final boolean equals = "p".equals(this.a);
            for (int j = 0; j < this.a(); ++j) {
                this.b(j).g(n, b || equals, s, map);
            }
            if (equals) {
                final SpannableStringBuilder l = i(s, map);
                int length = l.length();
                while (--length >= 0 && l.charAt(length) == ' ') {}
                if (length >= 0 && l.charAt(length) != '\n') {
                    l.append('\n');
                }
            }
            for (final Map.Entry<String, V> entry2 : map.entrySet()) {
                final HashMap m = this.l;
                final String s3 = entry2.getKey();
                final CharSequence a2 = ((azw)entry2.getValue()).a;
                dk.d((Object)a2);
                m.put(s3, a2.length());
            }
        }
    }
    
    public final boolean h(final long n) {
        final long d = this.d;
        final boolean b = true;
        long n2 = d;
        if (d == -9223372036854775807L) {
            final boolean b2 = b;
            if (this.e == -9223372036854775807L) {
                return b2;
            }
            n2 = -9223372036854775807L;
        }
        if (n2 <= n) {
            final boolean b2 = b;
            if (this.e == -9223372036854775807L) {
                return b2;
            }
        }
        if (n2 == -9223372036854775807L) {
            final boolean b2 = b;
            if (n < this.e) {
                return b2;
            }
        }
        boolean b2;
        if (n2 <= n) {
            if (n >= this.e) {
                return false;
            }
            b2 = b;
        }
        else {
            b2 = false;
        }
        return b2;
    }
}
