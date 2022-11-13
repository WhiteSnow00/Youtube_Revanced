// 
// Decompiled by Procyon v0.6.0
// 

public final class diy implements dij
{
    public static final ddo a;
    private final cya b;
    
    static {
        a = ddo.c("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    }
    
    public diy() {
        this(null, null);
    }
    
    public diy(final cya b, final byte[] array) {
        this.b = b;
    }
    
    @Override
    public final /* bridge */ boolean a(final Object o) {
        final dhz dhz = (dhz)o;
        return true;
    }
    
    @Override
    public final /* bridge */ aln b(final Object o, final int n, final int n2, final ddp ddp) {
        dhz dhz = (dhz)o;
        final dhz dhz2 = (dhz)this.b.g((Object)dhz, 0, 0);
        if (dhz2 == null) {
            this.b.h((Object)dhz, 0, 0, (Object)dhz);
        }
        else {
            dhz = dhz2;
        }
        return new aln((ddk)dhz, (ddy)new deh(dhz, (int)ddp.b(diy.a)));
    }
}
