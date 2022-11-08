import java.util.function.Function;
import java.util.function.BinaryOperator;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import j$.util.stream.Collector$_CC;
import j$.util.stream.Collector$Characteristics;
import j$.util.stream.Collector;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afaj
{
    public static final Collector a;
    public static final Collector b;
    
    static {
        a = Collector$_CC.of((Supplier)acmb.f, (BiConsumer)afag.b, (BinaryOperator)afaf.a, (Function)afah.b, new Collector$Characteristics[0]);
        b = Collector$_CC.of((Supplier)acmb.g, (BiConsumer)afag.a, (BinaryOperator)afaf.c, (Function)afah.a, new Collector$Characteristics[0]);
        Collector$_CC.of((Supplier)acmb.h, (BiConsumer)afag.c, (BinaryOperator)afaf.b, (Function)acfd.t, new Collector$Characteristics[0]);
    }
    
    public static Collector a(final Function function, final Function function2) {
        function.getClass();
        function2.getClass();
        return Collector$_CC.of((Supplier)acmb.i, (BiConsumer)new afai(function, function2), (BinaryOperator)afaf.d, (Function)afah.c, new Collector$Characteristics[0]);
    }
}
