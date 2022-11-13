import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaxi implements aaxg
{
    private final xag a;
    private final int b;
    private final Object c;
    
    public aaxi(final aaxh c, final xag a, final int b) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aaxi(final xag a, final aiqj c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final aaxu a() {
        if (this.b != 0) {
            return aaxu.a;
        }
        return aaxu.b;
    }
    
    public final aaye b() {
        if (this.b != 0) {
            return aaye.a;
        }
        return new aaye(this.a, (xah)null);
    }
    
    public final aiqj c() {
        if (this.b != 0) {
            return (aiqj)this.c;
        }
        return ((aaxh)this.c).a;
    }
    
    public final Optional d(final aani aani) {
        if (this.b != 0) {
            return Optional.of((Object)new aaxh(this.a, aani.d()));
        }
        return Optional.of((Object)new aaxd(this.a, aani.b(), aani.d(), 1));
    }
    
    public final aaxd e(final aiqj aiqj) {
        if (this.b != 0) {
            return new aaxd(this.a, (aiqj)this.c, aiqj, 2);
        }
        return new aaxd(this.a, ((aaxh)this.c).a, aiqj, 2);
    }
}
