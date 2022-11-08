import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwb implements acwu
{
    private static final int[] a;
    private static final Pattern b;
    private static final Pattern c;
    private final acvy d;
    private final agkw e;
    
    static {
        a = new int[] { 271 };
        b = Pattern.compile("^\\s+");
        c = Pattern.compile("\\s{2,}");
    }
    
    public acwb(final acvy d, final agkw e, final byte[] array) {
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
    }
    
    @Override
    public final acwf a(final acwq acwq) {
        final aexq h = this.e.h();
        if (!h.h()) {
            acwf.a.f = adbp.i((acvx)acwq);
            return acwf.a;
        }
        final aexq h2 = this.d.h();
        Locale english;
        if (acwq.b.isEmpty()) {
            english = Locale.ENGLISH;
        }
        else {
            english = new Locale(acwq.b);
        }
        if (h2.h() && english.getLanguage().equals(new Locale((String)h2.c()).getLanguage())) {
            final List a = ((aqtx)h.c()).a(acwb.c.matcher(acwb.b.matcher(acwq.d).replaceAll("")).replaceAll(" ").toLowerCase(english));
            final ArrayList list = new ArrayList();
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                list.add(new acwl((String)iterator.next(), 23, acwb.a));
            }
            final acwf acwf = new acwf(list, this.d.l(), this.d.c());
            acwf.f = adbp.i((acvx)acwq);
            return acwf;
        }
        acwf.a.f = adbp.i((acvx)acwq);
        return acwf.a;
    }
}
