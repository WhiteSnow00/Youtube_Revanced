// 
// Decompiled by Procyon v0.6.0
// 

public final class hsw extends vls
{
    public String a;
    public boolean b;
    public int c;
    public ahaz d;
    
    public hsw(final aeea aeea, final zme zme, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super("reel/reel_item_watch", aeea, zme, 1, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.c = 1;
        this.b = false;
    }
    
    public final /* bridge */ ahcv a() {
        final ahaz builder = ((ahbh)akqm.a).createBuilder();
        final akxf e = (akxf)this.d.build();
        builder.copyOnWrite();
        final akqm akqm = (akqm)builder.instance;
        e.getClass();
        akqm.e = e;
        akqm.b |= 0x4;
        final int c = this.c;
        builder.copyOnWrite();
        final akqm akqm2 = (akqm)builder.instance;
        if (c != 0) {
            akqm2.d = c - 1;
            akqm2.b |= 0x2;
            final String a = this.a;
            if (a != null) {
                builder.copyOnWrite();
                final akqm akqm3 = (akqm)builder.instance;
                akqm3.b |= 0x8;
                akqm3.f = a;
            }
            final boolean b = this.b;
            builder.copyOnWrite();
            final akqm akqm4 = (akqm)builder.instance;
            akqm4.b |= 0x10;
            akqm4.g = b;
            return (ahcv)builder;
        }
        throw null;
    }
    
    public final String b() {
        final adet adet = new adet((byte[])null, (short[])null);
        adet.ak("serviceName", ((vkk)this).r);
        adet.ak("identity", ((vkk)this).s.d());
        final int c = this.c;
        if (c != 0) {
            adet.aj("inputType", c - 1);
            adet.ak("videoId", ((akxf)this.d.instance).d);
            adet.ak("playlistId", g(((akxf)this.d.instance).i));
            adet.aj("playlistIndex", d(((akxf)this.d.instance).j));
            adet.ak("playerParams", g(((akxf)this.d.instance).k));
            adet.ak("reelWatchEndpointParams", g(this.a));
            return adet.ai();
        }
        throw null;
    }
    
    protected final void c() {
        final ahaz d = this.d;
        d.getClass();
        if (this.c == 3) {
            return;
        }
        final boolean empty = ((akxf)d.instance).i.isEmpty();
        final boolean b = true;
        if (empty) {
            adkp.Q(((akxf)this.d.instance).d.isEmpty() ^ true);
            return;
        }
        boolean b2 = b;
        if (((akxf)this.d.instance).d.isEmpty()) {
            b2 = (((akxf)this.d.instance).j > 0 && b);
        }
        adkp.Q(b2);
    }
}
