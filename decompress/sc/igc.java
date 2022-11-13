import android.content.Context;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class igc implements tcc
{
    final amxe a;
    final afeq b;
    final String c;
    final String d;
    final wyw e;
    final afeq f;
    final igd g;
    
    public igc(final igd g, final amxe a, final afeq b, final String c, final String d, final wyw e, final afeq f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final /* bridge */ void b(Object a, final Object o) {
        final aujg aujg = (aujg)a;
        final aujg aujg2 = (aujg)o;
        final ArrayList list = new ArrayList((Collection<?>)aujg2.c);
        Collections.sort((List<E>)list, aaiz.f);
        this.g.c(this.a, afeq.o((Collection)afeq.o((Collection)list)), this.b, this.c, this.d);
        a = aujg2.a;
        if (a != null) {
            this.e.D((wzz)new wyt((byte[])a));
        }
        igd.a(this.a, this.e);
    }
    
    public final /* bridge */ void sd(final Object o, final Exception ex) {
        final aujg aujg = (aujg)o;
        if (!(ex instanceof aaij)) {
            return;
        }
        final aaij aaij = (aaij)ex;
        if (aaij.b) {
            final ArrayList list = new ArrayList((Collection<? extends E>)this.f);
            Collections.sort((List<Object>)list, aaiz.f);
            this.g.c(this.a, afeq.o((Collection)afeq.o((Collection)list)), this.b, this.c, this.d);
            return;
        }
        final amvk c = aaij.c;
        if (c != null) {
            this.g.b.e(c, this.e);
            return;
        }
        final String a = aaij.a;
        if (a != null) {
            tpe.y((Context)this.g.a, (CharSequence)a, 1);
            return;
        }
        tpe.x((Context)this.g.a, 2132018898, 1);
    }
}
