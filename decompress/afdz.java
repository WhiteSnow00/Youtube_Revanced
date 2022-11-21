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

public final class afdz
{
    public static final Collector a;
    public static final Collector b;
    
    static {
        a = Collector$_CC.of((Supplier)achh.h, (BiConsumer)afdx.b, (BinaryOperator)afdw.a, (Function)adtc.g, new Collector$Characteristics[0]);
        b = Collector$_CC.of((Supplier)achh.i, (BiConsumer)afdx.a, (BinaryOperator)afdw.c, (Function)adtc.h, new Collector$Characteristics[0]);
        Collector$_CC.of((Supplier)achh.j, (BiConsumer)afdx.c, (BinaryOperator)afdw.b, (Function)adtc.f, new Collector$Characteristics[0]);
    }
    
    public static Collector a(final Function function, final Function function2) {
        function.getClass();
        function2.getClass();
        return Collector$_CC.of((Supplier)achh.k, (BiConsumer)new afdy(function, function2), (BinaryOperator)afdw.d, (Function)adtc.i, new Collector$Characteristics[0]);
    }
}
