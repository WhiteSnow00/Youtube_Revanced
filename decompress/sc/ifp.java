import android.content.Context;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ifp implements tcc
{
    final int a;
    final amxe b;
    final wyw c;
    final List d;
    final ifr e;
    
    public ifp(final ifr e, final int a, final amxe b, final wyw c, final List d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final /* bridge */ void b(Object a, final Object o) {
        final aujg aujg = (aujg)a;
        final aujg aujg2 = (aujg)o;
        final ArrayList list = new ArrayList((Collection<?>)aujg2.b);
        Collections.sort((List<E>)list, this.e.b.f());
        this.e.c(this.a, list);
        this.e.g(this.b);
        a = aujg2.a;
        if (a != null) {
            this.c.D((wzz)new wyt((byte[])a));
        }
        ifr.t(this.b, this.c);
    }
    
    public final /* bridge */ void sd(final Object o, final Exception ex) {
        final aujg aujg = (aujg)o;
        if (!(ex instanceof aaij)) {
            return;
        }
        final aaij aaij = (aaij)ex;
        if (aaij.b) {
            final ArrayList list = new ArrayList(this.d);
            Collections.sort((List<Object>)list, this.e.b.f());
            this.e.c(this.a, list);
            this.e.g(this.b);
            return;
        }
        final amvk c = aaij.c;
        if (c != null) {
            this.e.e(c, this.c);
            return;
        }
        final String a = aaij.a;
        if (a != null) {
            tpe.y((Context)this.e.a, (CharSequence)a, 1);
            return;
        }
        tpe.x((Context)this.e.a, 2132018898, 1);
    }
}
