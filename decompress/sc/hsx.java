// 
// Decompiled by Procyon v0.6.0
// 

public final class hsx extends vls
{
    public String a;
    public String b;
    
    public hsx(final aeea aeea, final zme zme, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super("reel/reel_watch_sequence", aeea, zme, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((vkk)this).k(vap.b);
    }
    
    public final /* bridge */ ahcv a() {
        final ahaz builder = ((ahbh)akqq.a).createBuilder();
        final String b = this.b;
        if (b != null) {
            builder.copyOnWrite();
            final akqq akqq = (akqq)builder.instance;
            akqq.c = 4;
            akqq.d = b;
        }
        final String a = this.a;
        if (a != null) {
            builder.copyOnWrite();
            final akqq akqq2 = (akqq)builder.instance;
            akqq2.c = 3;
            akqq2.d = a;
        }
        return (ahcv)builder;
    }
    
    public final String b() {
        final adet adet = new adet((byte[])null, (short[])null);
        adet.ak("serviceName", ((vkk)this).r);
        adet.ak("identity", ((vkk)this).s.d());
        adet.ak("continuation", g(this.a));
        adet.ak("sequenceParams", g(this.b));
        return adet.ai();
    }
    
    protected final void c() {
        adkp.Q(this.b == null ^ aezr.f(this.a));
    }
}
