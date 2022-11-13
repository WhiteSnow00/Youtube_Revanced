import j$.util.stream.Stream;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acqm implements ttg
{
    public final aezf a;
    public final acle b;
    public final int c;
    
    public acqm(final aezf a, final acle b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final Object o) {
        final aezf a = this.a;
        final acle b = this.b;
        final int c = this.c;
        final afeq afeq = (afeq)o;
        if (afeq != null && !afeq.isEmpty()) {
            final Stream stream = Collection$_EL.stream((Collection)afeq);
            a.getClass();
            final afeq afeq2 = (afeq)stream.map((Function)new yud(a, 18)).filter((Predicate)acdl.e).map((Function)achg.b).collect(afci.a);
            ((tfz)b).remove(c);
            ((tfz)b).addAll(c, (Collection)afeq2);
        }
    }
}
