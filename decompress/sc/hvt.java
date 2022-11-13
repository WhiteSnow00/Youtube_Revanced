import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import com.google.android.apps.youtube.app.offline.OfflineModeChangedMealbarController;
import com.google.android.apps.youtube.app.livechat.settings.LiveChatFragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvt implements Runnable
{
    public final Object a;
    private final int b;
    
    public hvt(final LiveChatFragment a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final OfflineModeChangedMealbarController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final hvy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final hwt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final hxa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final hyq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final hys a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final ibc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final ibf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final ibm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final idm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final ieo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final ieu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final ihe a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final ihm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hvt(final iia a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final int b = this.b;
        ajut ajut = null;
        boolean b2 = false;
        switch (b) {
            default: {
                ((iia)this.a).d.a().j().f("smart_downloads_video_list_");
                return;
            }
            case 19: {
                final ihm ihm = (ihm)this.a;
                final Iterator iterator = ihm.c.iterator();
                while (iterator.hasNext()) {
                    ((asir)iterator.next()).dispose();
                }
                ihm.c.clear();
                return;
            }
            case 18: {
                ((ihm)this.a).a();
                return;
            }
            case 17: {
                final Object a = this.a;
                final ihm ihm2 = (ihm)a;
                ((tgd)ihm2.b.a()).g(a);
                ihm2.a();
                return;
            }
            case 16: {
                final Object a2 = this.a;
                synchronized (((ihe)a2).f) {
                    final ListenableFuture g = ((ihe)a2).g;
                    if (g != null) {
                        g.cancel(false);
                    }
                    ((ihe)a2).g = null;
                }
            }
            case 15: {
                ((ieu)this.a).j();
                return;
            }
            case 14: {
                final Object a3 = this.a;
                tbi.e();
                final ieo ieo = (ieo)a3;
                final zme c = ieo.e.c();
                final vee a4 = ieo.d.a(c);
                final vdq a5 = ieo.c.a(c);
                final ArrayList list = new ArrayList();
                final afke k = ieo.a.k();
                while (k.hasNext()) {
                    list.add(a4.e((int)ieo.i.g((Class)k.next())));
                }
                final assz assz = new assz(ashi.H((Iterable)list).C((asjr)hzh.n).C((asjr)hzh.o), 2);
                final asjr o = atqx.o;
                ((asie)assz).c((asjr)new flo(ieo, a4, a5, 6)).p((asjg)new fcj(ieo, a4, a5, 7)).U();
                return;
            }
            case 13: {
                final Object a6 = this.a;
                if (((fmr)((idm)a6).c.a()).h()) {
                    try {
                        ((idm)a6).d.a(idm.e(glb.u()));
                        if (((idm)a6).f.ak()) {
                            ((idm)a6).d.a(idm.e(glb.T()));
                        }
                    }
                    catch (final aach aach) {
                        ttr.b("Couldn't delete: ".concat(String.valueOf(aach.getMessage())));
                    }
                }
                return;
            }
            case 12: {
                final idm idm = (idm)this.a;
                final amac amac = (amac)idm.e.a(idm.a.c()).f(glb.u()).j((Class)amac.class).af();
                if (amac != null) {
                    final vfn b3 = amac.b.b(amac.c.f);
                    if (b3 == null || b3 instanceof anuc) {
                        b2 = true;
                    }
                    adkp.R(b2, "entityFromStore is not instance of RefreshEntityModel, key=refresh");
                    final anuc anuc = (anuc)b3;
                    if (anuc != null && idm.d(anuc)) {
                        return;
                    }
                }
                idm.b();
                idm.c();
                return;
            }
            case 11: {
                final OfflineModeChangedMealbarController offlineModeChangedMealbarController = (OfflineModeChangedMealbarController)this.a;
                offlineModeChangedMealbarController.m(offlineModeChangedMealbarController.j());
                return;
            }
            case 10: {
                ((fy)this.a).dismiss();
                return;
            }
            case 9: {
                final Object a7 = this.a;
                ((ibc)a7).c.f((ibe)a7);
                return;
            }
            case 8: {
                final Object a8 = this.a;
                ((ibf)a8).b.y(a8);
                return;
            }
            case 7: {
                final Object a9 = this.a;
                final LiveChatFragment liveChatFragment = (LiveChatFragment)a9;
                if (liveChatFragment.ar()) {
                    final anzw n = liveChatFragment.d.n(10034);
                    if (n != null) {
                        final bu od = liveChatFragment.od();
                        if ((0x1 & n.b) != 0x0 && (ajut = n.c) == null) {
                            ajut = ajut.a;
                        }
                        od.setTitle((CharSequence)acak.b(ajut));
                        liveChatFragment.c.d((cey)a9, (List)n.d);
                    }
                }
                return;
            }
            case 6: {
                final hys hys = (hys)this.a;
                if (hys.b.compareAndSet(0, 1)) {
                    hys.a.addAll((Collection)hys.c.c());
                    hys.b.compareAndSet(1, 2);
                }
                return;
            }
            case 5: {
                final hyq hyq = (hyq)this.a;
                if (hyq.b.compareAndSet(0, 1)) {
                    hyq.a.addAll((Collection)hyq.c.c());
                    hyq.b.compareAndSet(1, 2);
                }
                return;
            }
            case 4: {
                final hxa hxa = (hxa)this.a;
                hxa.an = true;
                hxa.aN();
                return;
            }
            case 3: {
                final Object a10 = this.a;
                ((hwl)a10).bV();
                ((hwt)a10).bd.b();
                return;
            }
            case 2: {
                ((hvy)this.a).b.bu.b();
                return;
            }
            case 1: {
                final hwl hwl = (hwl)this.a;
                hwl.ba.a(hwl.bX);
                return;
            }
            case 0: {
                final arkg aq = ((hwl)this.a).aq;
                if (aq != null) {
                    ((fzf)aq.a()).q();
                }
            }
        }
    }
}
