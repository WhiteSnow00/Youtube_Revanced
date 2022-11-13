// 
// Decompiled by Procyon v0.6.0
// 

public final class boq implements boc
{
    private final bbk b;
    private bkt c;
    private bri d;
    private int e;
    private pvh f;
    
    public boq(final bbk bbk) {
        this(bbk, (btn)new btg());
    }
    
    public boq(final bbk b, final btn btn) {
        final pvh f = new pvh(btn);
        final bkk c = new bkk();
        final brh d = new brh();
        this.b = b;
        this.f = f;
        this.c = (bkt)c;
        this.d = (bri)d;
        this.e = 1048576;
    }
    
    public final /* bridge */ bny a(final ayu ayu) {
        return (bny)this.b(ayu);
    }
    
    public final bor b(final ayu ayu) {
        dk.d((Object)ayu.b);
        final ayq b = ayu.b;
        final Object h = b.h;
        final String f = b.f;
        return new bor(ayu, this.b, this.f, this.c.a(ayu), this.d, this.e, null, null, null, null, null);
    }
}
