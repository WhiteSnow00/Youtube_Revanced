import java.util.Iterator;
import com.google.apps.tiktok.account.AccountId;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import j$.util.Optional;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fml
{
    public final atjj a;
    public final atjj b;
    public final Executor c;
    public final zki d;
    public final vcf e;
    public final flg f;
    public volatile afcr g;
    public asic h;
    public final fzo i;
    private final atjj j;
    private final zjy k;
    private final flg l;
    private final Context m;
    private final uyi n;
    private final fzo o;
    
    public fml(final atjj j, final atjj a, final atjj b, final tlq tlq, final asho asho, final Executor c, final zki d, final zjy k, final vcf e, final flg f, final flg l, final Context m, final fzo i, final fzo o, final uyi n, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.g = afcr.q();
        this.h = arxj.a();
        this.j = j;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.k = k;
        this.e = e;
        this.f = f;
        this.l = l;
        this.m = m;
        this.i = i;
        this.o = o;
        this.n = n;
        if (!tlq.m(tlq.aA)) {
            this.h = this.d(asho);
        }
    }
    
    private final asic r(final String s, final trb trb, final asho asho) {
        final ashe z = this.e.a(this.d.c()).h(s, true).aa(asho).W((asjc)flt.m).z();
        trb.getClass();
        return z.aC((asix)new fmh(trb, 4), (asix)new fmh(this, 5));
    }
    
    public final ListenableFuture a() {
        return this.k.b(this.d.c());
    }
    
    public final ListenableFuture b() {
        return afrp.e((ListenableFuture)aftj.m(uji.P(this.l.e(fle.a().c()).J((asjc)flt.o))), aesm.a((aexg)new fee(11)), this.c);
    }
    
    public final ListenableFuture c() {
        return ((fmm)this.b.a()).g();
    }
    
    public final asic d(final asho asho) {
        if (this.n.aj()) {
            return this.r(gkt.bv(), (trb)new exr(this, 15), asho);
        }
        return this.r(gkt.aW(), (trb)new exr(this, 16), asho);
    }
    
    public final void e(final Optional optional) {
        monitorenter(this);
        try {
            if (!optional.isPresent()) {
                this.g = afcr.q();
                monitorexit(this);
                return;
            }
            final alwp alwp = (alwp)optional.get();
            final afcm d = afcr.d();
            final afif d2 = ((afcr)alwp.getDownloadsModels()).D();
            while (((Iterator)d2).hasNext()) {
                final alyn a = ((alwm)((Iterator)d2).next()).a();
                if (a != null) {
                    d.h((Object)a.e());
                }
            }
            this.g = d.g();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void f(final Optional optional) {
        monitorenter(this);
        try {
            if (!optional.isPresent()) {
                this.g = afcr.q();
                monitorexit(this);
                return;
            }
            final alxx alxx = (alxx)optional.get();
            final afcm d = afcr.d();
            final afif d2 = ((afcr)alxx.getItemsModels()).D();
            while (((Iterator)d2).hasNext()) {
                final alxs a = ((alxu)((Iterator)d2).next()).a();
                if (a != null) {
                    d.h((Object)a.e());
                }
            }
            this.g = d.g();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean g() {
        final boolean c = ((aamd)this.j.a()).c();
        boolean b = false;
        if (c) {
            if (((zzu)this.a.a()).a().j().c(auck.b(2)).isEmpty()) {
                if (this.h()) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean h() {
        return !this.g.isEmpty();
    }
    
    @Deprecated
    public final boolean i() {
        if (this.n.f(45365077L)) {
            Object o = null;
            try {
                if (!this.d.t()) {
                    o = afva.m((Object)false);
                }
                else {
                    o = aete.f(this.a());
                    o = ((aete)o).h((afry)new fdr(this, 6), this.c);
                }
                return (boolean)((ListenableFuture)o).get();
            }
            catch (final ExecutionException o) {}
            catch (final InterruptedException ex) {}
            zjp.c(zjo.b, zjn.y, "Failed to get hasOfflinedContent from pds", (Throwable)o);
            return false;
        }
        if (!((aamd)this.j.a()).c()) {
            return false;
        }
        try {
            return !((Collection)((zzu)this.a.a()).a().l().i().get(4L, TimeUnit.SECONDS)).isEmpty() || this.h();
        }
        catch (final TimeoutException ex2) {
            trn.d("Get offline video snapshots timed out", (Throwable)ex2);
            return false;
        }
        catch (final InterruptedException ex3) {
            trn.d("Get offline video snapshots was interrupted", (Throwable)ex3);
            return false;
        }
        catch (final ExecutionException ex4) {
            trn.d("Failed to get offline video snapshots", (Throwable)ex4);
            return false;
        }
    }
    
    public final boolean j(final String s) {
        return !aexs.f(s) && this.k() && ((zzu)this.a.a()).a().i().e(s) != null;
    }
    
    public final boolean k() {
        return ((aamd)this.j.a()).c() && !((zzu)this.a.a()).a().i().l().isEmpty();
    }
    
    public final boolean l() {
        if (!((aamd)this.j.a()).c()) {
            return false;
        }
        if (this.n.aq()) {
            return (boolean)this.i.ap((Callable)new csh(this, 11), (Runnable)new exu(this.o, 8, (byte[])null, (byte[])null, (byte[])null, (byte[])null)).map((Function)new fnm(this, 1)).orElseGet((Supplier)new gnu(this, 1));
        }
        return !((zzu)this.a.a()).a().l().k().isEmpty();
    }
    
    public final boolean m(final String s) {
        if (!this.i()) {
            return false;
        }
        final zzl e = ((zzu)this.a.a()).a().l().e(s);
        return e != null && !e.q();
    }
    
    public final boolean n() {
        return ((aamd)this.j.a()).c() && !((zzu)this.a.a()).a().j().b().isEmpty();
    }
    
    public final boolean o() {
        if (this.n() && this.g()) {
            if (this.n()) {
                if (((zzu)this.a.a()).a().j().b().size() > ((zzu)this.a.a()).a().j().m().size()) {
                    return false;
                }
            }
            if (!this.l() && !this.k()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean p(String s) {
        if (this.n.aj()) {
            s = gkt.bl(s);
        }
        else {
            s = gkt.bw(s);
        }
        return this.g.contains((Object)s);
    }
    
    public final fzo q(final AccountId accountId) {
        return ((fmk)agnj.J(this.m, (Class)fmk.class, accountId)).n();
    }
}
