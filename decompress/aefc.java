import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefc implements aefk
{
    private final arna a;
    private final arna b;
    private final arna c;
    
    public aefc(final arna a, final arna b, final arna c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final aefk c() {
        aefk aefk;
        if (this.c.a() == null) {
            aefk = (aefk)this.a.a();
        }
        else {
            aefk = (aefk)this.b.a();
        }
        return aefk;
    }
    
    @Override
    public final nnt a(final aefn aefn) {
        return this.c().a(aefn);
    }
    
    @Override
    public final Set b() {
        return this.c().b();
    }
}
