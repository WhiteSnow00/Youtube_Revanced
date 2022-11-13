import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.widget.TextView;
import java.util.Iterator;
import android.content.Context;
import java.util.Map;
import java.util.Collection;
import java.util.List;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

final class ige implements tcc
{
    final igf a;
    private final boolean b;
    
    public ige(final igf a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final /* bridge */ void b(final Object o, final Object o2) {
        final Void void1 = (Void)o;
        final Pair pair = (Pair)o2;
        final igf a = this.a;
        final acle l = a.l;
        l.getClass();
        a.j.getClass();
        a.n.getClass();
        ((tfz)l).clear();
        if (pair != null && pair.first != null && pair.second != null) {
            final aaar aaar = (aaar)pair.first;
            final List list = (List)pair.second;
            if (fbu.aZ(this.a.s)) {
                final ajut j = aaar.j;
                if (j != null) {
                    final igf a2 = this.a;
                    a2.l.add((Object)jgk.v(a2.a.getResources(), j));
                }
            }
            this.a.i.clear();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                this.a.i.add(((aaba)iterator.next()).f());
            }
            ((tfz)this.a.l).addAll((Collection)list);
            this.a.j.a();
            if (this.b) {
                final ktn u = this.a.u;
                final aaar aaar2 = (aaar)pair.first;
                final List list2 = (List)pair.second;
                final igf a3 = this.a;
                final tca c = tca.c(a3.a, (tcc)new hbr(a3, 6));
                if (((aanx)u.c).c()) {
                    final String a4 = aaar2.a;
                    final afev m = afev.m(a4, aaar2);
                    final afev i = afev.m(a4, list2);
                    if (((aanx)u.c).c()) {
                        ((Executor)u.h).execute((Runnable)new tu(u, (Map)m, (Map)i, (tcc)c, 20, (byte[])null, (byte[])null));
                    }
                }
            }
        }
        else {
            final igf a5 = this.a;
            a5.j.h((CharSequence)a5.a.getString(2132018806));
            if (!fal.v((Context)this.a.a)) {
                final igh p2 = this.a.p;
                if (p2 != null) {
                    p2.a();
                }
            }
        }
        final TextView n = this.a.n;
        List list3;
        if (pair == null) {
            list3 = null;
        }
        else {
            list3 = (List)pair.second;
        }
        jgk.B(n, list3, ((aabo)this.a.e.a()).a().l());
    }
    
    public final /* bridge */ void sd(final Object o, final Exception ex) {
        final Void void1 = (Void)o;
        final igf a = this.a;
        final LoadingFrameLayout j = a.j;
        j.getClass();
        a.n.getClass();
        j.h((CharSequence)a.a.getString(2132018806));
        final igf a2 = this.a;
        jgk.B(a2.n, (List)null, ((aabo)a2.e.a()).a().l());
    }
}
