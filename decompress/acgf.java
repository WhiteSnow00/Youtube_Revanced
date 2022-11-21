import android.content.DialogInterface$OnKeyListener;
import android.os.Looper;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public class acgf implements ott, ojn
{
    public final ojp a;
    public final arna b;
    private final xab c;
    private final acyg d;
    
    public acgf(final ojp a, final arna b, final xab c, final acyg d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public final ahci a() {
        return aoiu.b;
    }
    
    public /* bridge */ asjy b(final Object o, final ots ots) {
        return this.c((aoiu)o, ots);
    }
    
    public asjy c(final aoiu aoiu, final ots g) {
        if (this.d.k()) {
            return asjy.f();
        }
        if ((aoiu.c & 0x1) == 0x0) {
            ajol ajol;
            if ((ajol = aoiu.e) == null) {
                ajol = ajol.a;
            }
            if ((ajol.b & 0x1) == 0x0) {
                final ajol e = aoiu.e;
                ajol a;
                if (e == null) {
                    a = ajol.a;
                }
                else {
                    a = e;
                }
                if ((a.b & 0x8) != 0x0) {
                    ajol a2;
                    if ((a2 = e) == null) {
                        a2 = ajol.a;
                    }
                    if ((a2.b & 0x4) != 0x0) {
                        this.f(aoiu, true);
                        final otu otu = (otu)this.b.a();
                        ajol ajol2;
                        if ((ajol2 = aoiu.e) == null) {
                            ajol2 = ajol.a;
                        }
                        CommandOuterClass$Command commandOuterClass$Command;
                        if ((commandOuterClass$Command = ajol2.e) == null) {
                            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
                        }
                        return otu.a(commandOuterClass$Command, g);
                    }
                }
                return asjy.f();
            }
        }
        final ojm a3 = ojo.a();
        if (aoiu.g) {
            a3.m = 2;
        }
        else {
            a3.m = 3;
        }
        a3.g = g;
        if (aoiu.f) {
            a3.b(1);
        }
        if ((aoiu.c & 0x80) != 0x0) {
            a3.h = (DialogInterface$OnKeyListener)new acgd(this, aoiu, g);
        }
        a3.i = (ojn)this;
        a3.j = this.c;
        ajol ajol3;
        if ((ajol3 = aoiu.e) == null) {
            ajol3 = ajol.a;
        }
        aqiq aqiq;
        if ((ajol3.b & 0x1) != 0x0) {
            ajol ajol4;
            if ((ajol4 = aoiu.e) == null) {
                ajol4 = ajol.a;
            }
            if ((aqiq = ajol4.c) == null) {
                aqiq = aqiq.a;
            }
        }
        else if ((aqiq = aoiu.d) == null) {
            aqiq = aqiq.a;
        }
        final asjy u = asjy.u(new acge(this, aoiu, aqiq, a3, 0));
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return u;
        }
        return u.F(aslh.a());
    }
    
    public void d() {
    }
    
    public void e() {
    }
    
    public final void f(final aoiu aoiu, final boolean b) {
        this.c.b(xbf.b(16906), (aisc)null, (alji)null);
        ajol ajol;
        if ((ajol = aoiu.e) == null) {
            ajol = ajol.a;
        }
        if ((ajol.b & 0x4) != 0x0) {
            ajol ajol2;
            if ((ajol2 = aoiu.e) == null) {
                ajol2 = ajol.a;
            }
            final ahbt d = ajol2.d;
            this.c.D((xbe)new wzy(d));
            if (b) {
                this.c.t((xbe)new wzy(d), (alji)null);
            }
        }
    }
}
