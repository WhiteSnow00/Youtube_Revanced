import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fff implements ffe
{
    public final atke a;
    private final fez b;
    private final atke c;
    private final xao d;
    private xan e;
    private boolean f;
    
    public fff(final fez b, final atke c, final atke a, final xao d) {
        this.b = b;
        this.d = d;
        this.c = c;
        this.a = a;
        this.e = (xan)new xap();
    }
    
    public final void a() {
        final xan c = this.d.c(almx.f);
        this.e = c;
        if (this.f) {
            c.e();
            final xan e = this.e;
            final ahaz builder = ((ahbh)almj.a).createBuilder();
            builder.copyOnWrite();
            final almj almj = (almj)builder.instance;
            almj.b |= 0x10;
            almj.i = "warm";
            e.a((almj)builder.build());
            return;
        }
        teu.k((ListenableFuture)this.c.a(), (Executor)afum.a, (tes)new fcf(this, 3), (tet)new esc(this, 7));
        this.f = true;
    }
    
    public final void b(final String s) {
        this.e.c(s);
        if (s.equals("thmon_e")) {
            this.e = (xan)new xap();
        }
    }
    
    public final void c(final boolean b, final boolean j) {
        this.e.f(this.b.d);
        final xan e = this.e;
        final ahaz builder = ((ahbh)almj.a).createBuilder();
        builder.copyOnWrite();
        final almj almj = (almj)builder.instance;
        almj.b |= 0x10;
        String i;
        if (!b) {
            i = "cold";
        }
        else {
            i = "frozen";
        }
        almj.i = i;
        builder.copyOnWrite();
        final almj almj2 = (almj)builder.instance;
        almj2.b |= 0x40;
        almj2.j = j;
        e.a((almj)builder.build());
    }
}
