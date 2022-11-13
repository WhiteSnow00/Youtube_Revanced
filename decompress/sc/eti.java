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

public final class eti extends etl implements aeou, arlm, aepp, aetq
{
    private etk ae;
    private Context af;
    private final auo ag;
    private boolean ah;
    private final atib ai;
    
    @Deprecated
    public eti() {
        this.ag = new auo((aun)this);
        this.ai = new atib((br)this);
        qdt.h();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.ai.p();
        try {
            super.K(layoutInflater, viewGroup, bundle);
            final etk ak = this.aK();
            final View inflate = layoutInflater.inflate(2131625104, viewGroup, false);
            final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(2131429576);
            recyclerView.ac((nq)ak.l);
            recyclerView.af((nw)new LinearLayoutManager());
            final acle k = ak.k;
            k.getClass();
            k.add((Object)etk.e((acot)acos.a(), null));
            aeux.k();
            return inflate;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                epf.b((Throwable)viewGroup, t);
            }
        }
    }
    
    public final void T(final Bundle bundle) {
        this.ai.p();
        try {
            super.T(bundle);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                epf.b((Throwable)bundle, t);
            }
        }
    }
    
    public final void U(final int n, final int n2, final Intent intent) {
        final aett k = this.ai.k();
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
                epf.b((Throwable)intent, t);
            }
        }
    }
    
    @Override
    public final void V(final Activity activity) {
        this.ai.p();
        try {
            super.V(activity);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                epf.b((Throwable)activity, t);
            }
        }
    }
    
    public final void W() {
        final aett e = this.ai.e();
        try {
            super.W();
            final etk ak = this.aK();
            ((kum)ak.f.a()).b((kul)ak);
            e.close();
        }
        finally {
            try {
                e.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epf.b(t, t2);
            }
        }
    }
    
    public final void Y() {
        this.ai.p();
        try {
            super.Y();
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epf.b(t, t2);
            }
        }
    }
    
    public final void aE(final MenuItem menuItem) {
        this.ai.o().close();
    }
    
    public final void aF() {
        this.aK().a.dismiss();
    }
    
    public final void aI(final int n, final int n2) {
        this.ai.m(n, n2);
        aeux.k();
    }
    
    public final etk aK() {
        final etk ae = this.ae;
        if (ae == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.ah) {
            return ae;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    @Override
    protected final /* bridge */ aepz aL() {
        return (aepz)aept.b((br)this);
    }
    
    public final aeup aM() {
        return (aeup)this.ai.c;
    }
    
    @Override
    public final /* bridge */ Object aN() {
        return this.aK();
    }
    
    public final Locale aO() {
        return agpi.Z((br)this);
    }
    
    public final void aa() {
        final aett h = this.ai.h();
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
                epf.b(t, t2);
            }
        }
    }
    
    public final void ab(final View view, final Bundle bundle) {
        this.ai.p();
        aeux.k();
    }
    
    public final void dismiss() {
        final aett s = aeux.s();
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
                epf.b(t, t2);
            }
        }
    }
    
    public final aui getLifecycle() {
        return (aui)this.ag;
    }
    
    @Override
    public final void lP(final Context context) {
        this.ai.p();
        try {
            if (!this.ah) {
                super.lP(context);
                if (this.ae == null) {
                    try {
                        final Object ar = this.aR();
                        final br br = (br)((arlt)((esr)ar).b).a;
                        if (!(br instanceof eti)) {
                            final String string = etk.class.toString();
                            final String value = String.valueOf(br.getClass());
                            final StringBuilder sb = new StringBuilder("Attempt to inject a Fragment wrapper of type ");
                            sb.append(string);
                            sb.append(", but the wrapper available is of type: ");
                            sb.append(value);
                            sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                            throw new IllegalStateException(sb.toString());
                        }
                        final eti eti = (eti)br;
                        eti.getClass();
                        this.ae = new etk(eti, ((esr)ar).c, (aeea)((esr)ar).d.a(), (accf)((esr)ar).aN.B.a(), ((esr)ar).e, (ghb)((esr)ar).aN.C.a(), ((esr)ar).aN.D, (adfq)((esr)ar).a.a.an.a(), (gbo)((esr)ar).aN.E.a(), (Executor)((esr)ar).a.g.a(), ((esr)ar).aN.d(), (gkx)((esr)ar).a.fr.a(), (vai)((esr)ar).a.ka.a(), null, null, null, null, null);
                        ((aui)((br)this).X).b((aum)new TracedFragmentLifecycle(this.ai, this.ag, (byte[])null));
                    }
                    catch (final ClassCastException ex) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", ex);
                    }
                }
                final br c = ((br)this).C;
                if (c instanceof aetq) {
                    final atib ai = this.ai;
                    if (ai.c == null) {
                        ai.j(((aetq)c).aM(), true);
                    }
                }
                aeux.k();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epf.b(t, t2);
            }
        }
    }
    
    @Override
    public final Context nT() {
        if (super.nT() != null) {
            if (this.af == null) {
                this.af = (Context)new aepq((br)this, super.nT());
            }
            return this.af;
        }
        return null;
    }
    
    @Override
    public final LayoutInflater nj(final Bundle bundle) {
        this.ai.p();
        try {
            final LayoutInflater nj = super.nj(bundle);
            final LayoutInflater cloneInContext = nj.cloneInContext((Context)new aepq((br)this, nj));
            aeux.k();
            return cloneInContext;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                epf.b((Throwable)bundle, t);
            }
        }
    }
    
    public final void nm() {
        final aett f = this.ai.f();
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
                epf.b(t, t2);
            }
        }
    }
    
    public final void nn() {
        final aett g = this.ai.g();
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
                epf.b(t, t2);
            }
        }
    }
    
    public final void no() {
        this.ai.p();
        try {
            super.no();
            afpo.e((bi)this);
            if (super.c) {
                afpo.d((bi)this);
            }
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epf.b(t, t2);
            }
        }
    }
    
    public final void np() {
        this.ai.p();
        try {
            super.np();
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                epf.b(t, t2);
            }
        }
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        this.ai.l().close();
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        final aett n = this.ai.n();
        try {
            super.onDismiss(dialogInterface);
            final etk ak = this.aK();
            if (ak.o) {
                final vwi h = ak.q.h();
                ((vkk)h).i();
                final ahaz builder = ((ahbh)alaw.a).createBuilder();
                final alas a = alas.a;
                builder.copyOnWrite();
                final alaw alaw = (alaw)builder.instance;
                a.getClass();
                alaw.c = a;
                alaw.b = 5;
                h.a = (alaw)builder.build();
                teu.k(ak.q.i(h), ak.h, (tes)etj.a, (tet)new esc(ak, 4));
            }
            n.close();
        }
        finally {
            try {
                n.close();
            }
            finally {
                final Throwable t;
                epf.b((Throwable)dialogInterface, t);
            }
        }
    }
    
    public final void oq(final Bundle bundle) {
        this.ai.p();
        try {
            super.oq(bundle);
            final etk ak = this.aK();
            ak.k = new acle();
            final aclb aclb = new aclb();
            aclb.f((Class)acbj.class, (acks)new ackw(ak.b, 0));
            aclb.f((Class)acqe.class, (acks)new ackw(ak.d, 0));
            (ak.l = ak.r.Z((acku)aclb)).h((acjn)ak.k);
            ak.l.f((ackn)new acjz(ak.n));
            ak.e.p((gha)ak);
            ((kum)ak.f.a()).a((kul)ak);
            int n;
            if (ak.p.aU() && ak.p.aV()) {
                if (ak.j.a() == gkv.a) {
                    n = 2132084312;
                }
                else {
                    n = 2132084310;
                }
            }
            else if (ak.j.a() == gkv.a) {
                n = 2132084311;
            }
            else {
                n = 2132084309;
            }
            ak.a.nc(2, n);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                epf.b((Throwable)bundle, t);
            }
        }
    }
    
    public final Dialog pN(final Bundle bundle) {
        super.pN(bundle);
        final eti a = this.aK().a;
        return (Dialog)new adts((Context)((br)a).od(), a.b);
    }
    
    public final void pP(final Bundle bundle) {
        this.ai.p();
        try {
            super.pP(bundle);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                epf.b((Throwable)bundle, t);
            }
        }
    }
    
    public final void sh(final aeup aeup, final boolean b) {
        this.ai.j(aeup, b);
    }
}
