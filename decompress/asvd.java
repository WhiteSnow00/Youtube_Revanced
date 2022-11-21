import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asvd implements Callable
{
    private final int a;
    
    public asvd(final int a) {
        this.a = a;
    }
    
    public static final List a() {
        return new ArrayList(16);
    }
    
    @Override
    public final Object call() {
        final int a = this.a;
        if (a == 0) {
            return new asvg();
        }
        if (a == 1) {
            throw null;
        }
        if (a == 2) {
            return atmc.a;
        }
        if (a == 3) {
            return atmd.a;
        }
        if (a != 4) {
            return atmf.a;
        }
        return atme.a;
    }
}
