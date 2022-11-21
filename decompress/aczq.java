import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczq implements adaj
{
    private static final int[] a;
    private static final Pattern b;
    private static final Pattern c;
    private final aczn d;
    private final agop e;
    
    static {
        a = new int[] { 271 };
        b = Pattern.compile("^\\s+");
        c = Pattern.compile("\\s{2,}");
    }
    
    public aczq(final aczn d, final agop e, final byte[] array, final byte[] array2) {
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
    }
    
    @Override
    public final aczu a(final adaf adaf) {
        final afbh h = this.e.h();
        if (!h.h()) {
            aczu.a.f = acws.f((aczm)adaf);
            return aczu.a;
        }
        final afbh h2 = this.d.h();
        Locale english;
        if (adaf.b.isEmpty()) {
            english = Locale.ENGLISH;
        }
        else {
            english = new Locale(adaf.b);
        }
        if (h2.h() && english.getLanguage().equals(new Locale((String)h2.c()).getLanguage())) {
            final List a = ((aqzf)h.c()).a(aczq.c.matcher(aczq.b.matcher(adaf.d).replaceAll("")).replaceAll(" ").toLowerCase(english));
            final ArrayList list = new ArrayList();
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                list.add(new adaa((String)iterator.next(), 23, aczq.a));
            }
            final aczu aczu = new aczu(list, this.d.l(), this.d.c());
            aczu.f = acws.f((aczm)adaf);
            return aczu;
        }
        aczu.a.f = acws.f((aczm)adaf);
        return aczu.a;
    }
}
