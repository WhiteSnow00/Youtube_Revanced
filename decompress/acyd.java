import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyd implements acyw
{
    private static final int[] a;
    private static final Pattern b;
    private static final Pattern c;
    private final acya d;
    private final agmx e;
    
    static {
        a = new int[] { 271 };
        b = Pattern.compile("^\\s+");
        c = Pattern.compile("\\s{2,}");
    }
    
    public acyd(final acya d, final agmx e, final byte[] array, final byte[] array2) {
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
    }
    
    public final acyh a(final acys acys) {
        final aezp h = this.e.h();
        if (!h.h()) {
            acyh.a.f = acvg.l((acxz)acys);
            return acyh.a;
        }
        final aezp h2 = this.d.h();
        Locale english;
        if (acys.b.isEmpty()) {
            english = Locale.ENGLISH;
        }
        else {
            english = new Locale(acys.b);
        }
        if (h2.h() && english.getLanguage().equals(new Locale((String)h2.c()).getLanguage())) {
            final List a = ((aqwk)h.c()).a(acyd.c.matcher(acyd.b.matcher(acys.d).replaceAll("")).replaceAll(" ").toLowerCase(english));
            final ArrayList list = new ArrayList();
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                list.add(new acyn((String)iterator.next(), 23, acyd.a));
            }
            final acyh acyh = new acyh(list, this.d.l(), this.d.c());
            acyh.f = acvg.l((acxz)acys);
            return acyh;
        }
        acyh.a.f = acvg.l((acxz)acys);
        return acyh.a;
    }
}
