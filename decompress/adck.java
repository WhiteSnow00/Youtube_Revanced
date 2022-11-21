import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adck extends acph implements adci, adem
{
    private final Context a;
    private final veh b;
    private final acmr c;
    
    public adck(final apcm apcm, final Context a, final veh b) {
        this.a = a;
        this.b = b;
        final acmr c = new acmr();
        this.c = c;
        apcm.getClass();
        c.add((Object)apcm);
    }
    
    public final acla a() {
        return this.c;
    }
    
    @Override
    public final void d(final List list) {
    }
    
    @Override
    public final void e(final acmh acmh) {
        acmh.f(apcm.class, (acmf)new ete(this.a, this.b, 18, (byte[])null));
    }
    
    public final void f(final ajws d) {
        final apcm apcm = (apcm)this.c.get(0);
        final acmr c = this.c;
        final ahcr builder = ((ahcz)apcm).toBuilder();
        builder.copyOnWrite();
        final apcm apcm2 = (apcm)builder.instance;
        d.getClass();
        apcm2.d = d;
        apcm2.b |= 0x2;
        c.set(0, (Object)builder.build());
        this.c.l();
    }
}
