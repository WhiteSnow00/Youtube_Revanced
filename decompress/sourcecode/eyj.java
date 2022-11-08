import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyj implements Runnable
{
    public final /* synthetic */ eyk a;
    
    public eyj(final eyk a) {
        this.a = a;
    }
    
    public final boolean a() {
        return this == this.a.m;
    }
    
    @Override
    public final void run() {
        final String string = this.a.g.getText().toString();
        final eyk a = this.a;
        aifo aifo;
        if ((aifo = a.i.i) == null) {
            aifo = aifo.a;
        }
        final Pattern j = a.j;
        ajsq ajsq;
        if (j != null && !j.matcher(string).matches() && (aifo.b & 0x20) != 0x0) {
            if ((ajsq = aifo.h) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            final int codePointCount = string.codePointCount(0, string.length());
            final int b = aifo.b;
            if ((b & 0x1) != 0x0 && codePointCount < aifo.c && (b & 0x2) != 0x0) {
                if ((ajsq = aifo.d) == null) {
                    ajsq = ajsq.a;
                }
            }
            else if ((b & 0x4) != 0x0 && codePointCount > aifo.e && (b & 0x8) != 0x0) {
                if ((ajsq = aifo.f) == null) {
                    ajsq = ajsq.a;
                }
            }
            else {
                ajsq = null;
            }
        }
        if (ajsq != null) {
            this.a.f(trg.A(ajsq));
            return;
        }
        this.a.d.post((Runnable)new exu(this, 2));
        final eyk a2 = this.a;
        final vmp c = a2.c;
        final aihf i = a2.i;
        final String e = i.e;
        final String f = i.f;
        final vmn vmn = new vmn(c.c, c.d, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        vmn.a = string;
        vmn.b = e;
        vmn.c = f;
        final eyk a3 = this.a;
        a3.n = a3.c.b((vjn)vmn, a3.f);
        final erz erz = new erz(this, 5);
        final fcb fcb = new fcb(this, 1);
        final eyk a4 = this.a;
        tcp.l(a4.n, a4.e, (tcn)fcb, (tco)erz, afua.a);
    }
}
