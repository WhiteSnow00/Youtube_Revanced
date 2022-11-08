import android.content.DialogInterface$OnKeyListener;
import android.os.Looper;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public class accs implements ors, ohp
{
    public final ohr a;
    public final arhr b;
    private final wwv c;
    private final acup d;
    
    public accs(final ohr a, final arhr b, final wwv c, final acup d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    @Override
    public final agyr a() {
        return (agyr)aoei.b;
    }
    
    public asgn c(final aoei aoei, final orr g) {
        if (this.d.j()) {
            return asgn.f();
        }
        if ((aoei.c & 0x1) == 0x0) {
            ajkh ajkh;
            if ((ajkh = aoei.e) == null) {
                ajkh = ajkh.a;
            }
            if ((ajkh.b & 0x1) == 0x0) {
                final ajkh e = aoei.e;
                ajkh a;
                if (e == null) {
                    a = ajkh.a;
                }
                else {
                    a = e;
                }
                if ((a.b & 0x8) != 0x0) {
                    ajkh a2;
                    if ((a2 = e) == null) {
                        a2 = ajkh.a;
                    }
                    if ((a2.b & 0x4) != 0x0) {
                        this.f(aoei, true);
                        final ort ort = (ort)this.b.a();
                        ajkh ajkh2;
                        if ((ajkh2 = aoei.e) == null) {
                            ajkh2 = ajkh.a;
                        }
                        CommandOuterClass$Command commandOuterClass$Command;
                        if ((commandOuterClass$Command = ajkh2.e) == null) {
                            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
                        }
                        return ort.a(commandOuterClass$Command, g);
                    }
                }
                return asgn.f();
            }
        }
        final oho a3 = ohq.a();
        if (aoei.g) {
            a3.m = 2;
        }
        else {
            a3.m = 3;
        }
        a3.g = g;
        if (aoei.f) {
            a3.b(1);
        }
        if ((aoei.c & 0x40) != 0x0) {
            a3.h = (DialogInterface$OnKeyListener)new accq(this, aoei, g);
        }
        a3.i = (ohp)this;
        a3.j = this.c;
        ajkh ajkh3;
        if ((ajkh3 = aoei.e) == null) {
            ajkh3 = ajkh.a;
        }
        aqdk aqdk;
        if ((ajkh3.b & 0x1) != 0x0) {
            ajkh ajkh4;
            if ((ajkh4 = aoei.e) == null) {
                ajkh4 = ajkh.a;
            }
            if ((aqdk = ajkh4.c) == null) {
                aqdk = aqdk.a;
            }
        }
        else if ((aqdk = aoei.d) == null) {
            aqdk = aqdk.a;
        }
        final asgn u = asgn.u((asir)new accr(this, aoei, aqdk, a3, 0));
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return u;
        }
        return u.F(ashw.a());
    }
    
    public void d() {
    }
    
    public void e() {
    }
    
    public final void f(final aoei aoei, final boolean b) {
        this.c.b(wya.b(16906), (aioe)null, (alff)null);
        ajkh ajkh;
        if ((ajkh = aoei.e) == null) {
            ajkh = ajkh.a;
        }
        if ((ajkh.b & 0x4) != 0x0) {
            ajkh ajkh2;
            if ((ajkh2 = aoei.e) == null) {
                ajkh2 = ajkh.a;
            }
            final agyc d = ajkh2.d;
            this.c.D((wxz)new wws(d));
            if (b) {
                this.c.t((wxz)new wws(d), (alff)null);
            }
        }
    }
}
