import android.app.Activity;
import android.content.res.Configuration;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Callable;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.concurrent.Executor;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public class iok extends ggh
{
    public ioe a;
    private iod ae;
    private ijh af;
    private ioj ag;
    private boolean ah;
    public fzw b;
    public fza c;
    public uyi d;
    private fzw e;
    
    public iok() {
        this.ah = true;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131624369, viewGroup, false);
        if (this.d.bU()) {
            inflate.setBackgroundColor(tmy.ct(((br)this).nY(), 2130970845).orElse(0));
        }
        final wwv n = this.n();
        n.getClass();
        this.af = new ijh(n);
        final ioe a = this.a;
        final ioj ag = this.ag;
        acpi b;
        if (ag != null) {
            b = ag.b;
        }
        else {
            b = null;
        }
        final ijh af = this.af;
        final CharSequence bb = this.bb();
        final boolean bn = this.bn();
        final lfy lfy = (lfy)a.a.a();
        lfy.getClass();
        final tdz tdz = (tdz)a.b.a();
        tdz.getClass();
        final iko iko = (iko)a.c.a();
        iko.getClass();
        final imo imo = (imo)a.d.a();
        imo.getClass();
        final fmd fmd = (fmd)a.e.a();
        fmd.getClass();
        final ida ida = (ida)a.f.a();
        ida.getClass();
        final vbq vbq = (vbq)a.g.a();
        vbq.getClass();
        final Executor executor = (Executor)a.h.a();
        executor.getClass();
        final Executor executor2 = (Executor)a.i.a();
        executor2.getClass();
        final ioa ioa = (ioa)a.j.a();
        ioa.getClass();
        final ilu ilu = (ilu)a.k.a();
        ilu.getClass();
        final mrm mrm = (mrm)a.l.a();
        mrm.getClass();
        final uyf uyf = (uyf)a.m.a();
        uyf.getClass();
        final alm alm = (alm)a.n.a();
        alm.getClass();
        final oas oas = (oas)a.o.a();
        oas.getClass();
        final zki zki = (zki)a.p.a();
        zki.getClass();
        final uyi uyi = (uyi)a.q.a();
        uyi.getClass();
        af.getClass();
        bb.getClass();
        final iod ae = new iod(lfy, tdz, iko, imo, fmd, ida, vbq, executor, executor2, ioa, ilu, mrm, uyf, alm, oas, zki, uyi, b, af, bb, bn, null, null, null, null, null);
        this.ae = ae;
        ae.p = (LoadingFrameLayout)inflate.findViewById(2131429675);
        ae.q = (RecyclerView)inflate.findViewById(2131428730);
        final RecyclerView q = ae.q;
        q.getContext();
        q.af((nw)new LinearLayoutManager());
        this.ae.d(this.ah);
        final fzv b2 = this.b.b();
        b2.n((aexg)new ift(this, 9));
        this.e = b2.a();
        return inflate;
    }
    
    public final fzw aS() {
        return this.e;
    }
    
    public final CharSequence bb() {
        final fa at = this.at;
        String string;
        if (at != null) {
            string = ((Activity)at).getString(2132018916);
        }
        else {
            string = "";
        }
        return string;
    }
    
    public final Object bc() {
        final iod ae = this.ae;
        final Object o = null;
        acpi qv = null;
        Object o2;
        if (ae == null) {
            o2 = o;
        }
        else {
            final ioq r = ae.r;
            if (r != null) {
                qv = ((acms)r).qv();
            }
            o2 = new ioj(new ioc(qv, ae.w));
        }
        return o2;
    }
    
    public final void bi(Object a) {
        if (!(a instanceof ioj)) {
            return;
        }
        final ioj ag = (ioj)a;
        this.ag = ag;
        a = ag.a;
    }
    
    public final void bj(final boolean ah) {
        this.ah = ah;
        final iod ae = this.ae;
        if (ae == null) {
            return;
        }
        ae.d(ah);
    }
    
    public final void no() {
        super.no();
        final aioe au = this.aU();
        this.af.a.b(wya.b(42352), au, (alff)null);
        final ajfm ajfm = (ajfm)((agzd)au).rr((agyr)DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
        final iod ae = this.ae;
        int w;
        if ((w = ajox.w(ajfm.d)) == 0) {
            w = 1;
        }
        final ioa i = ae.i;
        if (!i.d) {
            final wyn c = ((wyo)i.a.a()).c(alku.G);
            c.getClass();
            i.c = c;
            final auip auip = (auip)i.b.a();
            final aceo aceo = (aceo)((atjj)auip.a).a();
            aceo.getClass();
            ((acgd)new acgj(aceo, (adcr)((atjj)auip.b).a(), (adfy)((atjj)auip.c).a(), 6, 1, 0, false, false, c, (byte[])null, (byte[])null)).k();
            c.c("br_s");
        }
        final lfy z = ae.z;
        final acpi s = ae.s;
        final RecyclerView q = ae.q;
        q.getClass();
        final ijh k = ae.k;
        final aeby aeby = (aeby)((atjj)z.g).a();
        aeby.getClass();
        final acoc acoc = (acoc)((atjj)z.f).a();
        acoc.getClass();
        final ilu ilu = (ilu)((atjj)z.b).a();
        ilu.getClass();
        final tdz tdz = (tdz)((atjj)z.h).a();
        tdz.getClass();
        final tny tny = (tny)((atjj)z.d).a();
        tny.getClass();
        final aciy aciy = (aciy)((atjj)z.a).a();
        aciy.getClass();
        final acpn acpn = (acpn)((atjj)z.i).a();
        acpn.getClass();
        final arud arud = (arud)((atjj)z.e).a();
        arud.getClass();
        final asgt asgt = (asgt)((atjj)z.c).a();
        asgt.getClass();
        ae.r = new ioq(aeby, acoc, ilu, tdz, tny, aciy, acpn, arud, asgt, s, q, k, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        if (ae.s == null || !ae.w) {
            final ilu j = ae.j;
            ae.t = ashp.F((Callable)new imb(j, j.c(ajfl.b), 1)).Q(atio.b(ae.g)).L(atio.b(ae.h)).Z((asix)new jok(ae, w, 1));
        }
        else {
            ae.h.execute((Runnable)new ihc(ae, 4));
        }
        ae.a.g((Object)ae);
        ae.a.g((Object)ae.b);
        ae.a.g((Object)ae.d);
        ae.e.a((icz)ae.n);
        ae.b.b();
        ae.c.b(imo.c);
        if (ae.m) {
            ae.u = new acjb();
            ae.v = new fzo(ae.l);
            ae.d(true);
            final ioq r = ae.r;
            r.getClass();
            ((aclp)r).M((achk)ae.u);
        }
    }
    
    public final void np() {
        super.np();
        final iod ae = this.ae;
        final asic t = ae.t;
        if (t != null) {
            asjg.b((AtomicReference)t);
            ae.t = null;
        }
        ae.w = false;
        ae.e.c((icz)ae.n);
        ae.a.m((Object)ae);
        ae.a.m((Object)ae.b);
        ae.a.m((Object)ae.d);
        final ioq r = ae.r;
        r.getClass();
        ((acms)r).rU();
        ae.r = null;
        final ijh k = ae.k;
        k.f = 0;
        k.c.clear();
        k.b.clear();
        k.d.clear();
        k.e.clear();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final iod ae = this.ae;
        if (ae != null) {
            final ioq r = ae.r;
            if (r != null) {
                ((aclp)r).G(configuration);
            }
        }
    }
}
