// 
// Decompiled by Procyon v0.6.0
// 

public final class abtf implements arom
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    
    public abtf(final atnb a, final atnb b, final atnb c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static abtf b(final atnb atnb, final atnb atnb2, final atnb atnb3) {
        return new abtf(atnb, atnb2, atnb3);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final aapu c() {
        return new aapu(this.a, this.b, this.c, null, null, (char[])null, (char[])null);
    }
}
