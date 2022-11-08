import com.google.protobuf.MessageLite;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.AutoplayRendererOuterClass;
import com.google.protos.youtube.api.innertube.UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction;
import com.google.protos.youtube.api.innertube.UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand;
import java.lang.ref.WeakReference;
import com.google.protos.youtube.api.innertube.UpdateViewershipActionOuterClass$UpdateViewershipAction;
import java.util.concurrent.Executor;
import java.util.List;
import java.util.ArrayList;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyo implements Runnable, fxn
{
    public final Handler a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public aexq g;
    public List h;
    public boolean i;
    public boolean j;
    private final Executor k;
    private final vax l;
    private final fxo m;
    private final atjj n;
    private final long o;
    private final oas p;
    private long q;
    
    public fyo(final Handler a, final vax l, final oas p8, final fxo m, final atjj n, final String b, final Executor k, final long o) {
        this.q = 0L;
        this.a = a;
        this.l = l;
        this.p = p8;
        this.m = m;
        this.n = n;
        this.b = b;
        this.k = k;
        this.o = o;
        this.h = (List)afcr.q();
        this.g = (aexq)aewp.a;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }
    
    public final void a() {
        this.a.removeCallbacks((Runnable)this);
    }
    
    public final void b() {
        final String a = fyt.a;
        this.a.removeCallbacks((Runnable)this);
        this.m.i((fxn)this);
        this.g = (aexq)aewp.a;
        this.h = (List)afcr.q();
        this.q = 0L;
        this.j = true;
    }
    
    public final void c() {
        this.a.post((Runnable)this);
    }
    
    public final void d(final List list, final List list2, final List list3, final List list4, final List list5, final String s) {
        for (final aioe aioe : list) {
            if (((agzd)aioe).rs((agyr)UpdateViewershipActionOuterClass$UpdateViewershipAction.updateViewershipAction)) {
                final UpdateViewershipActionOuterClass$UpdateViewershipAction updateViewershipActionOuterClass$UpdateViewershipAction = (UpdateViewershipActionOuterClass$UpdateViewershipAction)((agzd)aioe).rr((agyr)UpdateViewershipActionOuterClass$UpdateViewershipAction.updateViewershipAction);
                if (updateViewershipActionOuterClass$UpdateViewershipAction.c) {
                    continue;
                }
                apkw apkw;
                if ((apkw = updateViewershipActionOuterClass$UpdateViewershipAction.b) == null) {
                    apkw = apkw.a;
                }
                if ((apkw.b & 0x1) == 0x0) {
                    continue;
                }
                apkw apkw2;
                if ((apkw2 = updateViewershipActionOuterClass$UpdateViewershipAction.b) == null) {
                    apkw2 = apkw.a;
                }
                apmw apmw;
                if ((apmw = apkw2.c) == null) {
                    apmw = apmw.a;
                }
                final Iterator iterator2 = list2.iterator();
                while (iterator2.hasNext()) {
                    final fys fys = ((WeakReference<fys>)iterator2.next()).get();
                    if (fys != null) {
                        fys.qo(s, apmw);
                    }
                }
            }
            else if (((agzd)aioe).rs((agyr)UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.updateDonationShelfCommand)) {
                anss anss;
                if ((anss = ((UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand)((agzd)aioe).rr((agyr)UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.updateDonationShelfCommand)).b) == null) {
                    anss = anss.a;
                }
                final ajdi ajdi = (ajdi)((agzd)anss).rr((agyr)ajdj.a);
                if (ajdi == null) {
                    continue;
                }
                final Iterator iterator3 = list3.iterator();
                while (iterator3.hasNext()) {
                    final fyr fyr = ((WeakReference<fyr>)iterator3.next()).get();
                    if (fyr != null) {
                        fyr.f(s, ajdi);
                    }
                }
            }
            else if (((agzd)aioe).rs((agyr)UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.updateToggleButtonTextAction)) {
                final UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction = (UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction)((agzd)aioe).rr((agyr)UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.updateToggleButtonTextAction);
                if ((updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.b & 0x4) == 0x0) {
                    continue;
                }
                final Iterator iterator4 = list4.iterator();
                while (iterator4.hasNext()) {
                    final fyq fyq = ((WeakReference<fyq>)iterator4.next()).get();
                    if (fyq != null) {
                        int ai;
                        if ((ai = aqql.aI(updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.e)) == 0) {
                            ai = 1;
                        }
                        ajsq ajsq;
                        if ((ajsq = updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.c) == null) {
                            ajsq = ajsq.a;
                        }
                        ajsq ajsq2;
                        if ((ajsq2 = updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.d) == null) {
                            ajsq2 = ajsq.a;
                        }
                        fyq.a(s, ai, ajsq, ajsq2);
                    }
                }
            }
            else if (((agzd)aioe).rs((agyr)apdp.b)) {
                final apdp apdp = (apdp)((agzd)aioe).rr((agyr)apdp.b);
                anss anss2;
                if ((anss2 = apdp.c) == null) {
                    anss2 = anss.a;
                }
                final ahvo ahvo = (ahvo)((agzd)anss2).rr((agyr)AutoplayRendererOuterClass.a);
                anss anss3;
                if ((anss3 = apdp.d) == null) {
                    anss3 = anss.a;
                }
                final anec anec = (anec)((agzd)anss3).rr((agyr)aner.a);
                if (ahvo == null || anec == null) {
                    continue;
                }
                final Iterator iterator5 = list5.iterator();
                while (iterator5.hasNext()) {
                    final fyp fyp = ((WeakReference<fyp>)iterator5.next()).get();
                    if (fyp != null) {
                        fyp.a(anec);
                    }
                }
            }
            else {
                this.l.a(aioe);
            }
        }
    }
    
    @Override
    public final void run() {
        final long c = this.p.c();
        final long q = this.q;
        if (q != 0L && c - q < this.o) {
            final String a = fyt.a;
            this.a.postDelayed((Runnable)this, this.o);
            return;
        }
        this.q = c;
        this.m.g((fxn)this);
        final addp addp = (addp)this.n.a();
        String b;
        if (this.g.h()) {
            b = null;
        }
        else {
            b = this.b;
        }
        final String b2 = (String)this.g.f();
        final vuk vuk = new vuk(addp.c, ((zki)addp.e).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        vuk.a = b;
        vuk.b = b2;
        tcp.l(addp.c((MessageLite)alad.a, (vjh)addp.d, (tad)vue.f, (tac)vta.r).a((vjn)vuk), this.k, (tcn)new fcb(this, 4), (tco)new erz(this, 10), afua.a);
    }
}
