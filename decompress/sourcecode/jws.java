import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.function.Function;
import java.util.List;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jws
{
    public final vax a;
    public final wwu b;
    public ameo c;
    public final arcq d;
    private final atje e;
    private afcr f;
    
    public jws(final vax a, final arcq d, final wwu b, final byte[] array, final byte[] array2) {
        final atje ax = ((atje)atir.aR((Object)Optional.empty())).aX();
        this.e = ax;
        this.a = a;
        this.d = d;
        ((ashe)ax).W((asjc)new jax(this, 18)).aP().aS();
        this.b = b;
    }
    
    public final afcr a(final Optional optional) {
        return (afcr)Collection$_EL.stream((Collection)optional.map((Function)iof.t).orElse((Object)afcr.q())).map((Function)jwq.a).map((Function)new hqf(this, 18)).filter((Predicate)ifl.o).map((Function)iof.u).collect(afaj.a);
    }
    
    public final afcr b() {
        if (this.f == null) {
            this.f = this.a(Optional.ofNullable((Object)this.c));
        }
        return this.f;
    }
    
    public final void c(final ameo c) {
        this.c = c;
        this.f = null;
        this.e.tr((Object)Optional.ofNullable((Object)c));
    }
}
