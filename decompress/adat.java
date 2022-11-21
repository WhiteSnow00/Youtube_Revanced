import java.util.List;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import android.content.pm.PackageManager;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adat implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public adat(final acjq b, final Bundle a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adat(final adfa a, final String b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adat(final adlj a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adat(final adms a, final adoj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adat(final adms a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adat(final adna b, final admz a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adat(final adnd a, final akpu b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adat(final adnx a, final adoa b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adat(final adnx a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adat(final adqw a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adat(final adre a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adat(final gng a, final alex b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adat(final gsf a, final aexj b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adat(final gsf a, final Throwable b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adat(final sxa b, final PackageManager a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                final Object a = this.a;
                final String s = (String)this.b;
                final adre adre = (adre)a;
                adre.b(s, false);
                adre.d(s);
                return;
            }
            case 19: {
                ((adre)this.a).d((String)this.b);
                return;
            }
            case 18: {
                final Object a2 = this.a;
                final Object b = this.b;
                synchronized (((adqw)a2).g) {
                    ((adqw)a2).g.remove(b);
                }
            }
            case 17: {
                final Object a3 = this.a;
                final String a4 = ((adoa)this.b).a;
                final adnx adnx = (adnx)a3;
                synchronized (adnx.l) {
                    if (!((adnx)a3).n.containsKey(a4)) {
                        tut.m("ForegroundUploadController", "Skipped notification update for missing upload.");
                        return;
                    }
                    ((adnx)a3).A();
                    monitorexit(adnx.l);
                    adnx.f.d(a4);
                    adnx.E();
                }
            }
            case 16: {
                final Object a5 = this.a;
                final Object b2 = this.b;
                synchronized (((adnx)a5).l) {
                    ((adnx)a5).w();
                    ((adnx)a5).u((adoa)b2);
                    ((adnx)a5).d.execute(new adat((adnx)a5, (adoa)b2, 17));
                }
            }
            case 15: {
                final Object a6 = this.a;
                final Object b3 = this.b;
                final adnx adnx2 = (adnx)a6;
                synchronized (adnx2.l) {
                    ((adnx)a6).y((String)b3);
                    monitorexit(adnx2.l);
                    adnx2.E();
                }
            }
            case 14: {
                final Object a7 = this.a;
                final Object b4 = this.b;
                final adnx adnx3 = (adnx)a7;
                synchronized (adnx3.l) {
                    ((adnx)a7).u((adoa)b4);
                    ((adnx)a7).A();
                    monitorexit(adnx3.l);
                    adnx3.E();
                }
            }
            case 13: {
                ((wza)((adnd)this.a).c).d((akpu)this.b);
                return;
            }
            case 12: {
                ((wza)((adnd)this.a).c).d((akpu)this.b);
                return;
            }
            case 11: {
                ((wza)((adnd)this.a).c).d((akpu)this.b);
                return;
            }
            case 10: {
                final Object a8 = this.a;
                final Object b5 = this.b;
                final Object a9 = ((gng)a8).a;
                b5.getClass();
                final alex alex = (alex)b5;
                for (final alfe alfe : alex.c) {
                    if (alfe.b == 64128279) {
                        ((adna)a9).d((apkk)alfe.c);
                    }
                }
                for (final anxa anxa : alex.d) {
                    if (((ahcu)anxa).ry((ahci)apkk.b)) {
                        ((adna)a9).d((apkk)((ahcu)anxa).rx((ahci)apkk.b));
                    }
                }
                ((adna)a9).g();
                return;
            }
            case 9: {
                final Object b6 = this.b;
                final Object a10 = this.a;
                final adna adna = (adna)b6;
                adna.e.add(a10);
                adna.g();
                return;
            }
            case 8: {
                final Object a11 = this.a;
                final Object b7 = this.b;
                final Iterator iterator3 = ((adms)a11).a.iterator();
                while (iterator3.hasNext()) {
                    ((admt)iterator3.next()).j((String)b7);
                }
                return;
            }
            case 7: {
                final Object a12 = this.a;
                final Object b8 = this.b;
                final Iterator iterator4 = ((adms)a12).a.iterator();
                while (iterator4.hasNext()) {
                    ((admt)iterator4.next()).h((adoj)b8);
                }
                return;
            }
            case 6: {
                ((adlj)this.a).a.q.remove(this.b);
                return;
            }
            case 5: {
                final Object a13 = this.a;
                final Object b9 = this.b;
                tut.c("UploadClientApi", "Flow execution failed");
                ((adlj)a13).a.L((String)b9);
                return;
            }
            case 4: {
                final Object b10 = this.b;
                final Object a14 = this.a;
                for (final vhv vhv : (Set)((atnb)((acjq)b10).b).a()) {
                    try {
                        vhv.c((Bundle)a14);
                    }
                    catch (final Exception ex) {
                        tut.d("Failed to fill feedback.", (Throwable)ex);
                    }
                }
                return;
            }
            case 3: {
                final Object a15 = this.a;
                final Object b11 = this.b;
                final adfa adfa = (adfa)a15;
                final Object e = adfa.e;
                if (e != null && !((ListenableFuture)e).isCancelled() && !((ListenableFuture)adfa.e).isDone()) {
                    ((ListenableFuture)adfa.e).cancel(true);
                }
                tfx.k((ListenableFuture)(adfa.e = ((adhs)adfa.d).a((String)b11, (afbh)afag.a)), (Executor)adfa.c, (tfv)new adhp(1), (tfw)new zvx(adfa, 7, (byte[])null));
                return;
            }
            case 2: {
                tcl.k();
                final List ak = tqf.ak((PackageManager)this.a);
                synchronized (this.b) {
                    final Iterator iterator6 = ak.iterator();
                    while (iterator6.hasNext()) {
                        ((List<String>)((sxa)this.b).a).add(((ResolveInfo)iterator6.next()).activityInfo.applicationInfo.packageName);
                    }
                }
            }
            case 1: {
                final Object a16 = this.a;
                final Object b12 = this.b;
                final adau e2 = ((adaw)((gsf)a16).a).e;
                aexl aexl;
                if ((aexl = ((aexj)b12).c) == null) {
                    aexl = aexl.a;
                }
                e2.a(aexl);
                return;
            }
            case 0: {
                ((adaw)((gsf)this.a).a).e.c((Throwable)this.b);
            }
        }
    }
}
