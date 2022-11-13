import j$.util.stream.Stream;
import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;
import java.text.NumberFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfm implements nuj
{
    public final aqng a;
    public final NumberFormat b;
    private final int c;
    
    public adfm(final aqng a, final NumberFormat b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final List a(final List list) {
        final int c = this.c;
        if (c == 0) {
            return (List)Collection$_EL.stream((Collection)this.a.d).map((Function)new adfl(this.b, 1)).collect(Collectors.toList());
        }
        if (c != 1) {
            final aqng a = this.a;
            final NumberFormat b = this.b;
            final Stream stream = Collection$_EL.stream((Collection)a.d);
            b.getClass();
            return (List)stream.map((Function)new adfl(b, 0)).collect(Collectors.toList());
        }
        return (List)Collection$_EL.stream((Collection)this.a.d).map((Function)new adfl(this.b, 2)).collect(Collectors.toList());
    }
}
