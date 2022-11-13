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

public final class afci
{
    public static final Collector a;
    public static final Collector b;
    
    static {
        a = Collector$_CC.of((Supplier)acoe.f, (BiConsumer)afcf.b, (BinaryOperator)afce.a, (Function)afcg.b, new Collector$Characteristics[0]);
        b = Collector$_CC.of((Supplier)acoe.g, (BiConsumer)afcf.a, (BinaryOperator)afce.c, (Function)afcg.a, new Collector$Characteristics[0]);
        Collector$_CC.of((Supplier)acoe.h, (BiConsumer)afcf.c, (BinaryOperator)afce.b, (Function)achg.t, new Collector$Characteristics[0]);
    }
    
    public static Collector a(final Function function, final Function function2) {
        function.getClass();
        function2.getClass();
        return Collector$_CC.of((Supplier)acoe.i, (BiConsumer)new afch(function, function2), (BinaryOperator)afce.d, (Function)afcg.c, new Collector$Characteristics[0]);
    }
}
