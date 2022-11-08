import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.Map;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class accp implements otn
{
    private static final String b = "accp";
    private final otd c;
    private final AtomicInteger d;
    private Optional e;
    private final uyi f;
    
    public accp(final uyi f, final Map map, final otd c) {
        this.f = f;
        this.c = c;
        this.e = Optional.empty();
        this.d = new AtomicInteger();
        if (!f.Z()) {
            return;
        }
        this.e = Collection$_EL.stream((Collection)((afcw)map).e()).map((Function)zxk.r).filter((Predicate)acbk.c).findFirst();
    }
    
    private static void d(final acbf acbf, final wxz wxz) {
        acbf.d((osl)new accl(acbf, wxz, 0));
    }
    
    private static void e(final acbf acbf, final wxz wxz, final boolean b) {
        acbf.H((oss)new acck(acbf, b, wxz));
    }
    
    private static boolean f(final long n, final int n2) {
        return (n & (long)(n2 - 1)) > 0L;
    }
    
    public final agyr a() {
        return (agyr)altw.b;
    }
}
