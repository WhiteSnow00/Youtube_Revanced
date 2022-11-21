import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aafr extends vmz
{
    public final List a;
    public long b;
    public long c;
    public int d;
    public float e;
    public final arzb f;
    
    public aafr(final aefs aefs, final znz znz, final arzb f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super("offline/playlist_sync_check", aefs, znz, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.f = f;
        this.a = new ArrayList();
    }
    
    public final /* bridge */ ahen a() {
        final ahcr builder = akxl.a.createBuilder();
        final long b = this.b;
        builder.copyOnWrite();
        final akxl akxl = (akxl)builder.instance;
        akxl.b |= 0x2;
        akxl.e = b;
        final long c = this.c;
        builder.copyOnWrite();
        final akxl akxl2 = (akxl)builder.instance;
        akxl2.b |= 0x4;
        akxl2.f = c;
        final int d = this.d;
        builder.copyOnWrite();
        final akxl akxl3 = (akxl)builder.instance;
        akxl3.b |= 0x8;
        akxl3.g = d;
        final float e = this.e;
        builder.copyOnWrite();
        final akxl akxl4 = (akxl)builder.instance;
        akxl4.b |= 0x10;
        akxl4.h = e;
        final List a = this.a;
        builder.copyOnWrite();
        final akxl akxl5 = (akxl)builder.instance;
        final ahdp d2 = akxl5.d;
        if (!d2.c()) {
            akxl5.d = ahcz.mutableCopy(d2);
        }
        ahbc.addAll((Iterable)a, (List)akxl5.d);
        return (ahen)builder;
    }
    
    protected final void c() {
        final boolean empty = this.a.isEmpty();
        final boolean b = true;
        adme.T(empty ^ true);
        adme.K(this.b >= 0L);
        adme.K(this.c >= 0L);
        adme.K(true);
        final float e = this.e;
        adme.K(e >= 0.0f && e <= 1.0f && b);
    }
}
