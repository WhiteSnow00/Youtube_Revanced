import java.util.Iterator;
import android.text.Html;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abrn implements zla
{
    public final List a;
    public final List b;
    private final List c;
    
    public abrn() {
        this.c = new ArrayList();
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
    
    public final abro b() {
        final List c = this.c;
        final List a = this.a;
        final List b = this.b;
        final ArrayList list = new ArrayList(b.size());
        final Iterator iterator = b.iterator();
        while (iterator.hasNext()) {
            list.add((Object)Html.fromHtml((String)iterator.next()));
        }
        return new abro(c, a, list);
    }
    
    public final void c(final String s, final long n, final long n2) {
        if (!this.c.isEmpty() && n < (long)adwd.aK((Iterable)this.c)) {
            trn.l("subtitles are not given in non-decreasing start time order");
        }
        this.c.add(n);
        this.a.add(n2);
        this.b.add(s);
    }
}
