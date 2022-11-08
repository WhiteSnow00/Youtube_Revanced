import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebi implements aebq
{
    private final arhr a;
    private final arhr b;
    private final arhr c;
    
    public aebi(final arhr a, final arhr b, final arhr c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final aebq c() {
        aebq aebq;
        if (this.c.a() == null) {
            aebq = (aebq)this.a.a();
        }
        else {
            aebq = (aebq)this.b.a();
        }
        return aebq;
    }
    
    public final nly a(final aebt aebt) {
        return this.c().a(aebt);
    }
    
    public final Set b() {
        return this.c().b();
    }
}
