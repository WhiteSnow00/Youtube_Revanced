import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdv implements vau
{
    public final tny a;
    public final vax b;
    public final wwv c;
    private final Executor d;
    private final bu e;
    private final vbq f;
    private final zki g;
    private final vup h;
    
    public fdv(final vup h, final tny a, final vax b, final Executor d, final bu e, final vbq f, final zki g, final wwv c, final byte[] array) {
        this.h = h;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        c.getClass();
        this.c = c;
    }
    
    public final void b(final String c, final aotx aotx) {
        if (c.isEmpty()) {
            return;
        }
        final vbp a = this.f.a(this.g.c());
        c.getClass();
        agot.E(c.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)aouj.a).createBuilder();
        builder.copyOnWrite();
        final aouj aouj = (aouj)builder.instance;
        aouj.b |= 0x1;
        aouj.c = c;
        final aoug aoug = new aoug(builder);
        final agza a2 = aoug.a;
        a2.copyOnWrite();
        final aouj aouj2 = (aouj)a2.instance;
        aouj2.d = aotx.f;
        aouj2.b |= 0x2;
        final aoui b = aoug.b();
        final vdv c2 = ((vdo)a).c();
        c2.d((vdm)b);
        c2.b().X();
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final vup h = this.h;
        final addp k = ((vuj)agnj.J((Context)h.a, (Class)vuj.class, ((zjy)h.b).a(this.g.c()))).k();
        final aoue aoue = (aoue)((agzd)aioe).rr((agyr)aouf.a);
        akze akze;
        if ((akze = aoue.b) == null) {
            akze = akze.a;
        }
        final vui vui = new vui(k.c, ((eg)k.d).aq(), akze, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        ((vii)vui).j(aioe.c);
        aoty aoty;
        if ((aoty = aoue.c) == null) {
            aoty = aoty.a;
        }
        final String e = aoty.e;
        this.b(e, aotx.c);
        tcp.n((aum)this.e, ((vkh)k.e).b((vjn)vui, this.d), (trb)new fcy(this, e, 2), (trb)new eyc(this, akze, e, 3));
    }
}
