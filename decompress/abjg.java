// 
// Decompiled by Procyon v0.6.0
// 

public final class abjg implements arom
{
    private final atnb a;
    private final atnb b;
    
    public abjg(final atnb a, final atnb b) {
        this.a = a;
        this.b = b;
    }
    
    public static abjg b(final atnb atnb, final atnb atnb2) {
        return new abjg(atnb, atnb2);
    }
    
    @Override
    public final /* bridge */ Object a() {
        return this.c();
    }
    
    public final abwe c() {
        return new abwe(this.a, this.b, (byte[])null);
    }
}
