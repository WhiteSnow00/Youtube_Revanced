import android.app.Dialog;
import android.content.DialogInterface;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import java.util.concurrent.Executor;
import java.util.Locale;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etf extends eti implements aemu, arix, aenp, aerp
{
    private eth ae;
    private Context af;
    private final aun ag;
    private boolean ah;
    private final athj ai;
    
    @Deprecated
    public etf() {
        this.ag = new aun((aum)this);
        this.ai = new athj((br)this);
        qcj.s();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.ai.p();
        try {
            super.K(layoutInflater, viewGroup, bundle);
            final eth ak = this.aK();
            final View inflate = layoutInflater.inflate(2131625100, viewGroup, false);
            final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(2131429576);
            recyclerView.ac((nq)ak.l);
            recyclerView.af((nw)new LinearLayoutManager());
            final acjb k = ak.k;
            k.getClass();
            k.add((Object)eth.e((acmq)acmp.a(), null));
            aesw.k();
            return inflate;
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                epc.b((Throwable)layoutInflater, t);
            }
        }
    }
    
    public final void T(final Bundle bundle) {
        this.ai.p();
        try {
            super.T(bundle);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epc.b(t, t2);
            }
        }
    }
    
    public final void U(final int n, final int n2, final Intent intent) {
        final aers k = this.ai.k();
        try {
            super.U(n, n2, intent);
            k.close();
        }
        finally {
            try {
                k.close();
            }
            finally {
                final Throwable t;
                epc.b((Throwable)intent, t);
            }
        }
    }
    
    public final void V(final Activity activity) {
        this.ai.p();
        try {
            super.V(activity);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epc.b(t, t2);
            }
        }
    }
    
    public final void W() {
        final aers e = this.ai.e();
        try {
            super.W();
            final eth ak = this.aK();
            ((ktk)ak.f.a()).b((ktj)ak);
            e.close();
        }
        finally {
            try {
                e.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epc.b(t, t2);
            }
        }
    }
    
    public final void Y() {
        this.ai.p();
        try {
            super.Y();
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epc.b(t, t2);
            }
        }
    }
    
    public final void aE(final MenuItem menuItem) {
        this.ai.o().close();
    }
    
    public final void aF() {
        ((bi)this.aK().a).dismiss();
    }
    
    public final void aI(final int n, final int n2) {
        this.ai.m(n, n2);
        aesw.k();
    }
    
    public final eth aK() {
        final eth ae = this.ae;
        if (ae == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.ah) {
            return ae;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final aeso aM() {
        return (aeso)this.ai.c;
    }
    
    public final Locale aO() {
        return aesy.a((br)this);
    }
    
    public final void aa() {
        final aers h = this.ai.h();
        try {
            super.aa();
            h.close();
        }
        finally {
            try {
                h.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epc.b(t, t2);
            }
        }
    }
    
    public final void ab(final View view, final Bundle bundle) {
        this.ai.p();
        aesw.k();
    }
    
    public final void dismiss() {
        final aers s = aesw.s();
        try {
            super.dismiss();
            s.close();
        }
        finally {
            try {
                s.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epc.b(t, t2);
            }
        }
    }
    
    public final auh getLifecycle() {
        return (auh)this.ag;
    }
    
    public final void lP(final Context context) {
        this.ai.p();
        try {
            if (!this.ah) {
                super.lP(context);
                if (this.ae == null) {
                    try {
                        final Object ar = this.aR();
                        final br br = (br)((arje)((eso)ar).b).a;
                        if (!(br instanceof etf)) {
                            final String string = eth.class.toString();
                            final String value = String.valueOf(br.getClass());
                            final StringBuilder sb = new StringBuilder("Attempt to inject a Fragment wrapper of type ");
                            sb.append(string);
                            sb.append(", but the wrapper available is of type: ");
                            sb.append(value);
                            sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                            throw new IllegalStateException(sb.toString());
                        }
                        final etf etf = (etf)br;
                        etf.getClass();
                        this.ae = new eth(etf, ((eso)ar).c, (aeby)((eso)ar).d.a(), (acae)((eso)ar).aO.C.a(), ((eso)ar).e, (ggs)((eso)ar).aO.D.a(), ((eso)ar).aO.E, (addp)((eso)ar).a.a.an.a(), (gbg)((eso)ar).aO.F.a(), (Executor)((eso)ar).a.g.a(), ((eso)ar).aO.d(), (gko)((eso)ar).a.fo.a(), (uyi)((eso)ar).a.jV.a(), null, null, null, null, null);
                        ((auh)((br)this).X).b((aul)new TracedFragmentLifecycle(this.ai, this.ag, null));
                    }
                    catch (final ClassCastException ex) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", ex);
                    }
                }
                final br c = ((br)this).C;
                if (c instanceof aerp) {
                    final athj ai = this.ai;
                    if (ai.c == null) {
                        ai.j(((aerp)c).aM(), true);
                    }
                }
                aesw.k();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                epc.b((Throwable)context, t);
            }
        }
    }
    
    public final Context nT() {
        if (super.nT() != null) {
            if (this.af == null) {
                this.af = (Context)new aenq((br)this, super.nT());
            }
            return this.af;
        }
        return null;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        this.ai.p();
        try {
            final LayoutInflater nj = super.nj(bundle);
            final LayoutInflater cloneInContext = nj.cloneInContext((Context)new aenq((br)this, nj));
            aesw.k();
            return cloneInContext;
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                epc.b((Throwable)bundle, t);
            }
        }
    }
    
    public final void nm() {
        final aers f = this.ai.f();
        try {
            super.nm();
            f.close();
        }
        finally {
            try {
                f.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epc.b(t, t2);
            }
        }
    }
    
    public final void nn() {
        final aers g = this.ai.g();
        try {
            super.nn();
            this.ah = true;
            g.close();
        }
        finally {
            try {
                g.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epc.b(t, t2);
            }
        }
    }
    
    public final void no() {
        this.ai.p();
        try {
            super.no();
            alhb.P((bi)this);
            if (((bi)this).c) {
                alhb.O((bi)this);
            }
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epc.b(t, t2);
            }
        }
    }
    
    public final void np() {
        this.ai.p();
        try {
            super.np();
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epc.b(t, t2);
            }
        }
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        this.ai.l().close();
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        final aers n = this.ai.n();
        try {
            super.onDismiss(dialogInterface);
            final eth ak = this.aK();
            if (ak.o) {
                final vuf h = ak.q.h();
                ((vii)h).i();
                final agza builder = ((agzi)akyt.a).createBuilder();
                final akyp a = akyp.a;
                builder.copyOnWrite();
                final akyt akyt = (akyt)builder.instance;
                a.getClass();
                akyt.c = a;
                akyt.b = 5;
                h.a = (akyt)builder.build();
                tcp.k(ak.q.i(h), ak.h, (tcn)etg.a, (tco)new erz(ak, 4));
            }
            n.close();
        }
        finally {
            try {
                n.close();
            }
            finally {
                final Throwable t;
                epc.b((Throwable)dialogInterface, t);
            }
        }
    }
    
    public final void oq(final Bundle bundle) {
        this.ai.p();
        try {
            super.oq(bundle);
            final eth ak = this.aK();
            ak.k = new acjb();
            final aciy aciy = new aciy();
            aciy.f((Class)abzh.class, (acip)new acit(ak.b, 0));
            aciy.f((Class)acoa.class, (acip)new acit(ak.d, 0));
            (ak.l = ak.r.T((acir)aciy)).h((achk)ak.k);
            ak.l.f((acik)new achw(ak.n));
            ak.e.p((ggr)ak);
            ((ktk)ak.f.a()).a((ktj)ak);
            int n;
            if (ak.p.aT() && ak.p.aU()) {
                if (ak.j.a() == gkm.a) {
                    n = 2132084312;
                }
                else {
                    n = 2132084310;
                }
            }
            else if (ak.j.a() == gkm.a) {
                n = 2132084311;
            }
            else {
                n = 2132084309;
            }
            ((bi)ak.a).nc(2, n);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                epc.b((Throwable)bundle, t);
            }
        }
    }
    
    public final Dialog pI(final Bundle bundle) {
        super.pI(bundle);
        final etf a = this.aK().a;
        return (Dialog)new adrq((Context)((br)a).od(), ((bi)a).b);
    }
    
    public final void pK(final Bundle bundle) {
        this.ai.p();
        try {
            super.pK(bundle);
            aesw.k();
        }
        finally {
            try {
                aesw.k();
            }
            finally {
                final Throwable t;
                epc.b((Throwable)bundle, t);
            }
        }
    }
    
    public final void sb(final aeso aeso, final boolean b) {
        this.ai.j(aeso, b);
    }
}
