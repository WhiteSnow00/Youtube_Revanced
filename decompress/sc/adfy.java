import java.util.List;
import java.util.Iterator;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.pm.ResolveInfo;
import java.util.Set;
import android.content.pm.PackageManager;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adfy implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public adfy(final acid b, final Bundle a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adfy(final addo a, final String b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adfy(final adju a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adfy(final adld a, final admv b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adfy(final adld a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adfy(final adll b, final adlk a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adfy(final adlp a, final aknt b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adfy(final admj a, final admm b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adfy(final admj a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adfy(final adpi a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adfy(final adpp a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adfy(final gna a, final alcx b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adfy(final svy b, final PackageManager a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                ((adpp)this.a).d((String)this.b);
                return;
            }
            case 19: {
                ((adpp)this.a).d((String)this.b);
                return;
            }
            case 18: {
                final Object a = this.a;
                final String s = (String)this.b;
                final adpp adpp = (adpp)a;
                adpp.b(s, false);
                adpp.d(s);
                return;
            }
            case 17: {
                ((adpp)this.a).d((String)this.b);
                return;
            }
            case 16: {
                final Object a2 = this.a;
                final Object b = this.b;
                synchronized (((adpi)a2).g) {
                    ((adpi)a2).g.remove(b);
                }
            }
            case 15: {
                final Object a3 = this.a;
                final String a4 = ((admm)this.b).a;
                final admj admj = (admj)a3;
                synchronized (admj.l) {
                    if (!((admj)a3).n.containsKey(a4)) {
                        ttr.m("ForegroundUploadController", "Skipped notification update for missing upload.");
                        return;
                    }
                    ((admj)a3).A();
                    monitorexit(admj.l);
                    admj.f.d(a4);
                    admj.E();
                }
            }
            case 14: {
                final Object a5 = this.a;
                final Object b2 = this.b;
                synchronized (((admj)a5).l) {
                    ((admj)a5).w();
                    ((admj)a5).u((admm)b2);
                    ((admj)a5).d.execute(new adfy((admj)a5, (admm)b2, 15));
                }
            }
            case 13: {
                final Object a6 = this.a;
                final Object b3 = this.b;
                final admj admj2 = (admj)a6;
                synchronized (admj2.l) {
                    ((admj)a6).y((String)b3);
                    monitorexit(admj2.l);
                    admj2.E();
                }
            }
            case 12: {
                final Object a7 = this.a;
                final Object b4 = this.b;
                final admj admj3 = (admj)a7;
                synchronized (admj3.l) {
                    ((admj)a7).u((admm)b4);
                    ((admj)a7).A();
                    monitorexit(admj3.l);
                    admj3.E();
                }
            }
            case 11: {
                ((wxx)((adlp)this.a).c).d((aknt)this.b);
                return;
            }
            case 10: {
                ((wxx)((adlp)this.a).c).d((aknt)this.b);
                return;
            }
            case 9: {
                ((wxx)((adlp)this.a).c).d((aknt)this.b);
                return;
            }
            case 8: {
                final Object a8 = this.a;
                final Object b5 = this.b;
                final Object a9 = ((gna)a8).a;
                b5.getClass();
                final alcx alcx = (alcx)b5;
                for (final alde alde : alcx.c) {
                    if (alde.b == 64128279) {
                        ((adll)a9).d((aphy)alde.c);
                    }
                }
                for (final anuu anuu : alcx.d) {
                    if (anuu.ry((ahaq)aphy.b)) {
                        ((adll)a9).d((aphy)anuu.rx((ahaq)aphy.b));
                    }
                }
                ((adll)a9).g();
                return;
            }
            case 7: {
                final Object b6 = this.b;
                final Object a10 = this.a;
                final adll adll = (adll)b6;
                adll.e.add(a10);
                adll.g();
                return;
            }
            case 6: {
                final Object a11 = this.a;
                final Object b7 = this.b;
                final Iterator iterator3 = ((adld)a11).a.iterator();
                while (iterator3.hasNext()) {
                    ((adle)iterator3.next()).j((String)b7);
                }
                return;
            }
            case 5: {
                final Object a12 = this.a;
                final Object b8 = this.b;
                final Iterator iterator4 = ((adld)a12).a.iterator();
                while (iterator4.hasNext()) {
                    ((adle)iterator4.next()).h((admv)b8);
                }
                return;
            }
            case 4: {
                ((adju)this.a).a.q.remove(this.b);
                return;
            }
            case 3: {
                final Object a13 = this.a;
                final Object b9 = this.b;
                ttr.c("UploadClientApi", "Flow execution failed");
                ((adju)a13).a.L((String)b9);
                return;
            }
            case 2: {
                final Object b10 = this.b;
                final Object a14 = this.a;
                for (final vgn vgn : (Set)((atke)((acid)b10).b).a()) {
                    try {
                        vgn.c((Bundle)a14);
                    }
                    catch (final Exception ex) {
                        ttr.d("Failed to fill feedback.", (Throwable)ex);
                    }
                }
                return;
            }
            case 1: {
                tbi.e();
                final List ak = tpe.ak((PackageManager)this.a);
                synchronized (this.b) {
                    final Iterator iterator6 = ak.iterator();
                    while (iterator6.hasNext()) {
                        ((List<String>)((svy)this.b).a).add(((ResolveInfo)iterator6.next()).activityInfo.applicationInfo.packageName);
                    }
                }
            }
            case 0: {
                final Object a15 = this.a;
                final Object b11 = this.b;
                final addo addo = (addo)a15;
                final Object e = addo.e;
                if (e != null && !((ListenableFuture)e).isCancelled() && !((ListenableFuture)addo.e).isDone()) {
                    ((ListenableFuture)addo.e).cancel(true);
                }
                teu.k((ListenableFuture)(addo.e = ((adgf)addo.d).a((String)b11, (aezp)aeyo.a)), (Executor)addo.c, (tes)new adaz(2), (tet)new zif(addo, 11, (byte[])null));
            }
        }
    }
}
