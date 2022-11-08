import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import android.util.Pair;
import android.text.SpannableStringBuilder;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abqz
{
    public final transient List a;
    private final List b;
    
    public abqz(final List list) {
        this.b = Collections.unmodifiableList((List<?>)list);
        final TreeSet set = new TreeSet();
        for (final abrk abrk : list) {
            set.addAll(abrk.b.b);
            set.addAll(abrk.b.c);
            set.addAll(abrk.c.a);
        }
        this.a = Collections.unmodifiableList((List<?>)new ArrayList<Object>(set));
    }
    
    public static afcr a(final trb trb, final long n) {
        return afcr.r((Object)new abqx(n, n, (List)new ArrayList(), trb));
    }
    
    public final List b(final long n) {
        final ArrayList list = new ArrayList();
        for (final abrk abrk : this.b) {
            final SubtitleWindowSettings a = abrk.c.a(n);
            Pair pair;
            if (a != null && a.f) {
                final abro b = abrk.b;
                int a2 = b.a(n, true);
                if (a2 == -1) {
                    pair = abro.a;
                }
                else {
                    final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    final SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    while (true) {
                        final int n2 = a2 + 1;
                        if (n2 >= b.b.size() || (long)b.b.get(n2) > n || (long)b.c.get(n2) <= n) {
                            break;
                        }
                        final CharSequence charSequence = b.d.get(a2);
                        if (charSequence.length() > 0 && charSequence.charAt(charSequence.length() - 1) == '\n') {
                            spannableStringBuilder.append(charSequence);
                            spannableStringBuilder2.append(charSequence);
                        }
                        a2 = n2;
                    }
                    spannableStringBuilder.append((CharSequence)b.d.get(a2));
                    final long longValue = b.c.get(a2);
                    while (a2 < b.b.size() && b.c.get(a2) == longValue) {
                        final CharSequence charSequence2 = b.d.get(a2);
                        if ((charSequence2.length() <= 0 || charSequence2.charAt(charSequence2.length() - 1) != '\n') && ++a2 < b.b.size() && b.c.get(a2) <= longValue) {
                            continue;
                        }
                        spannableStringBuilder2.append(charSequence2);
                        break;
                    }
                    pair = new Pair((Object)spannableStringBuilder, (Object)spannableStringBuilder2);
                }
            }
            else {
                final abro b2 = abrk.b;
                int a3 = b2.a(n, false);
                if (a3 == -1) {
                    pair = abro.a;
                }
                else {
                    final CharSequence charSequence3 = b2.d.get(a3);
                    final long longValue2 = b2.c.get(a3);
                    while (true) {
                        final int n3 = a3 + 1;
                        if (n3 >= b2.b.size() || (long)b2.c.get(n3) != longValue2) {
                            break;
                        }
                        a3 = n3;
                    }
                    pair = new Pair((Object)charSequence3, (Object)b2.d.get(a3));
                }
            }
            list.add(new SubtitleWindowSnapshot(abrk.a, n, (CharSequence)pair.first, (CharSequence)pair.second, a));
        }
        return list;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        for (final abrk abrk : this.b) {
            sb.append("[");
            sb.append(abrk);
            sb.append("]");
        }
        return sb.toString();
    }
}