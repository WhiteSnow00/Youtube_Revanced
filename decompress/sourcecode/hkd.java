import java.util.function.Function;
import java.util.function.Predicate;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hkd implements hnj
{
    private final atjj a;
    
    public hkd(final atjj a) {
        this.a = a;
    }
    
    @Override
    public final Optional a() {
        return Optional.ofNullable((Object)((gug)this.a.a()).a()).filter((Predicate)fqf.t).map((Function)hkc.a);
    }
}
