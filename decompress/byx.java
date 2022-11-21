import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Pair;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class byx implements bxl
{
    private final byu a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;
    
    public byx(final byu a, final Map map, final Map d, final Map e) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.c = Collections.unmodifiableMap((Map<?, ?>)map);
        final TreeSet set = new TreeSet();
        int n = 0;
        a.d(set, false);
        final long[] b = new long[set.size()];
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            b[n] = (long)iterator.next();
            ++n;
        }
        this.b = b;
    }
    
    public final int a() {
        return this.b.length;
    }
    
    public final int b(final long n) {
        final int au = baz.au(this.b, n, false);
        if (au < this.b.length) {
            return au;
        }
        return -1;
    }
    
    public final long c(final int n) {
        return this.b[n];
    }
    
    public final List d(final long n) {
        final byu a = this.a;
        final Map c = this.c;
        final Map d = this.d;
        final Map e = this.e;
        final ArrayList list = new ArrayList();
        a.e(n, a.h, (List)list);
        final TreeMap treeMap = new TreeMap();
        a.g(n, false, a.h, (Map)treeMap);
        a.f(n, c, d, a.h, (Map)treeMap);
        final ArrayList list2 = new ArrayList();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Pair pair = (Pair)list.get(i);
            final String s = e.get(pair.second);
            if (s != null) {
                final byte[] decode = Base64.decode(s, 0);
                final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                final byv byv = d.get(pair.first);
                bad.b(byv);
                final azy azy = new azy();
                azy.b = decodeByteArray;
                azy.f = byv.b;
                azy.g = 0;
                azy.b(byv.c, 0);
                azy.e = byv.e;
                azy.h = byv.f;
                azy.i = byv.g;
                azy.k = byv.j;
                list2.add(azy.a());
            }
        }
        for (final Map.Entry<Object, V> entry : treeMap.entrySet()) {
            final byv byv2 = d.get(entry.getKey());
            bad.b(byv2);
            final azy azy2 = (azy)entry.getValue();
            final CharSequence a2 = azy2.a;
            bad.b(a2);
            final SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder)a2;
            for (final byp byp : (byp[])spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), (Class)byp.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart((Object)byp), spannableStringBuilder.getSpanEnd((Object)byp), (CharSequence)"");
            }
            for (int k = 0; k < spannableStringBuilder.length(); ++k) {
                if (spannableStringBuilder.charAt(k) == ' ') {
                    int n3;
                    int n2;
                    for (n2 = (n3 = k + 1); n3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(n3) == ' '; ++n3) {}
                    final int n4 = n3 - n2;
                    if (n4 > 0) {
                        spannableStringBuilder.delete(k, n4 + k);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int l = 0; l < spannableStringBuilder.length() - 1; ++l) {
                if (spannableStringBuilder.charAt(l) == '\n') {
                    final int n5 = l + 1;
                    if (spannableStringBuilder.charAt(n5) == ' ') {
                        spannableStringBuilder.delete(n5, l + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int n6 = 0; n6 < spannableStringBuilder.length() - 1; ++n6) {
                if (spannableStringBuilder.charAt(n6) == ' ') {
                    final int n7 = n6 + 1;
                    if (spannableStringBuilder.charAt(n7) == '\n') {
                        spannableStringBuilder.delete(n6, n7);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            azy2.b(byv2.c, byv2.d);
            azy2.e = byv2.e;
            azy2.f = byv2.b;
            azy2.h = byv2.f;
            azy2.c(byv2.i, byv2.h);
            azy2.k = byv2.j;
            list2.add(azy2.a());
        }
        return list2;
    }
}
