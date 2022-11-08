import android.content.DialogInterface$OnKeyListener;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand;
import java.util.Map;
import j$.util.Optional;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gql implements vau
{
    public final bu a;
    public final PlayBilling b;
    public final vax c;
    public final Executor d;
    public final adfy e;
    public Optional f;
    public Optional g;
    public Optional h;
    private final vxi i;
    private final vbq j;
    private final rgh k;
    private final asho l;
    private final svm m;
    private Optional n;
    private Optional o;
    private Optional p;
    private String r;
    private String s;
    private String t;
    private String u;
    private final cya v;
    
    public gql(final bu a, final PlayBilling b, final vxi i, final vax c, final vbq j, final rgh k, final cya v, final adfy e, final asho l, final Executor d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = "";
        this.g = Optional.empty();
        this.h = Optional.empty();
        this.a = a;
        this.b = b;
        this.i = i;
        this.c = c;
        this.j = j;
        this.k = k;
        this.v = v;
        this.e = e;
        this.l = l;
        this.d = d;
        this.m = new svm();
    }
    
    public final void b() {
        this.e.b("PURCHASE_USER_CANCELED");
        this.h(4);
        this.c();
        if (this.o.isPresent()) {
            this.c.a((aioe)this.o.get());
        }
    }
    
    public final void c() {
        this.m.dismissAllowingStateLoss();
        if (this.p.isPresent()) {
            ((asic)this.p.get()).dispose();
            this.p = Optional.empty();
        }
    }
    
    public final void d() {
        if (this.h.isPresent()) {
            this.g((akat)this.h.get(), amzy.b);
            this.h = Optional.empty();
        }
    }
    
    public final void e(final String s, final String s2) {
        this.h(5);
        trn.b(s);
        this.e.b(s2);
        this.d();
        this.c();
    }
    
    public final void f(final String s, final String s2) {
        if (this.n.isPresent()) {
            this.c.a((aioe)this.n.get());
        }
        this.e(s, s2);
    }
    
    public final void g(final akat akat, final amzy amzy) {
        final vdv c = ((vdo)this.j.a(this.k.c())).c();
        final akar d = akas.d(akat.d());
        final agza a = d.a;
        a.copyOnWrite();
        final akau akau = (akau)a.instance;
        final akau a2 = akau.a;
        akau.k = amzy.d;
        akau.b |= 0x100;
        c.d((vdm)d.b());
        c.b().U();
    }
    
    public final void h(final int n) {
        this.v.s(n, this.r, this.s, this.t, this.u, this.g);
    }
    
    public final void mE(final aioe aioe, final Map map) {
        if (this.p.isPresent()) {
            return;
        }
        final PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand = (PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand)((agzd)aioe).rr((agyr)PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.playBillingCrossSellCommand);
        this.r = playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.c;
        this.s = playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.d;
        this.t = playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.g;
        this.u = playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.h;
        String s;
        if ((playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.b & 0x40) != 0x0) {
            s = playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.i;
        }
        else {
            final String r = this.r;
            final String s2 = this.s;
            final StringBuilder sb = new StringBuilder();
            sb.append(r);
            sb.append(":");
            sb.append(s2);
            s = vek.h(340, sb.toString());
        }
        if ((playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.b & 0x4) != 0x0) {
            aioe aioe2;
            if ((aioe2 = playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.e) == null) {
                aioe2 = aioe.a;
            }
            this.f = Optional.of((Object)aioe2);
        }
        if ((playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.b & 0x8) != 0x0) {
            aioe aioe3;
            if ((aioe3 = playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.f) == null) {
                aioe3 = aioe.a;
            }
            this.n = Optional.of((Object)aioe3);
        }
        if ((playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.b & 0x80) != 0x0) {
            aioe aioe4;
            if ((aioe4 = playBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.j) == null) {
                aioe4 = aioe.a;
            }
            this.o = Optional.of((Object)aioe4);
        }
        final Iterator iterator = this.i.a.iterator();
        while (iterator.hasNext()) {
            ((vyc)iterator.next()).b();
        }
        this.e.b("PURCHASE_STARTED");
        this.h(3);
        this.m.b = (DialogInterface$OnKeyListener)new gqk(this, 0);
        this.m.show(this.a.getFragmentManager(), svm.a);
        this.p = Optional.of((Object)((vdo)this.j.a(this.k.c())).i(s).aa(this.l).aB((asix)new gly(this, 14)));
    }
}
