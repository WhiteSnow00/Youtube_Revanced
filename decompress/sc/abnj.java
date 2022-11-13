// 
// Decompiled by Procyon v0.6.0
// 

public final class abnj implements abmh
{
    public final abnl a;
    public final boolean b;
    
    public abnj(final abnl a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final adet adet) {
        final abnl a = this.a;
        final boolean b = this.b;
        adet.al("allowControversialContent", a.c);
        adet.al("allowAdultContent", b);
    }
}
