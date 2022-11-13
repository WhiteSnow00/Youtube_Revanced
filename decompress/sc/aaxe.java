import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

final class aaxe implements aaxg
{
    private final xah a;
    private final aiqj b;
    private final int c;
    private final Object d;
    
    public aaxe(final aaxd d, final xah a, final aiqj b, final int c) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public aaxe(final aaxd d, final xah a, final aiqj b, final int c, final byte[] array) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final aaxu a() {
        if (this.c != 0) {
            return aaxu.c;
        }
        return aaxu.d;
    }
    
    @Override
    public final aaye b() {
        if (this.c != 0) {
            return new aaye((xag)((aaxd)this.d).b, null);
        }
        return new aaye((xag)((aaxd)this.d).b, this.a);
    }
    
    @Override
    public final aiqj c() {
        if (this.c != 0) {
            return this.b;
        }
        return this.b;
    }
    
    @Override
    public final Optional d(final aani aani) {
        if (this.c != 0) {
            return Optional.of((Object)new aaxd((xag)((aaxd)this.d).b, aani.a(), aani.d(), 0));
        }
        return Optional.empty();
    }
    
    @Override
    public final aaxd e(final aiqj aiqj) {
        if (this.c != 0) {
            final aaxd aaxd = (aaxd)this.d;
            return new aaxd((xag)aaxd.b, aaxd.a, aiqj, 2);
        }
        final aaxd aaxd2 = (aaxd)this.d;
        return new aaxd((xag)aaxd2.b, aaxd2.a, aiqj, 2);
    }
}
