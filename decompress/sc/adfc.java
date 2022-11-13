import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfc implements nuj
{
    public final Object a;
    private final int b;
    
    public adfc(final aqmz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adfc(final aqng a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adfc(final List a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final List a(final List list) {
        final int b = this.b;
        if (b == 0) {
            final aqmz aqmz = (aqmz)this.a;
            aqmy a;
            if (aqmz.b == 2) {
                a = (aqmy)aqmz.c;
            }
            else {
                a = aqmy.a;
            }
            return (List)a.b;
        }
        if (b != 1) {
            final aqng aqng = (aqng)this.a;
            aqmy a2;
            if (aqng.b == 2) {
                a2 = (aqmy)aqng.c;
            }
            else {
                a2 = aqmy.a;
            }
            return (List)a2.b;
        }
        return (List)Collection$_EL.stream((Collection)this.a).map((Function)achg.f).filter((Predicate)acdl.g).collect(afci.a);
    }
}
