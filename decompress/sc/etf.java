import java.util.concurrent.Executor;
import android.content.Intent;
import java.util.concurrent.CancellationException;
import com.google.protos.youtube.api.innertube.ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand;
import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;
import com.google.protos.youtube.api.innertube.CommerceActionCommandOuterClass$CommerceActionCommand;
import java.util.Map;
import com.google.protos.youtube.api.innertube.EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand;
import com.google.protos.youtube.api.innertube.CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand;
import com.google.android.apps.youtube.app.account.profilecard.DefaultProfileCardController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etf implements tes
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public etf(final abrj a, final Runnable b, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final DefaultProfileCardController a, final etk b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final DefaultProfileCardController a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final fca a, final CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final fca a, final EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final fca a, final Map b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final gnr a, final CommerceActionCommandOuterClass$CommerceActionCommand b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final gpt a, final amxu b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final gqh a, final GalFlowActivity b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final gww a, final uby b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final hln a, final apgf b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final hln a, final ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final hun a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final jhs a, final Integer b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final kwk a, final aiqj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final vkf b, final vkd a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public etf(final vye a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final vyn a, final ajxx b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final vyn a, final aogv b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public etf(final wme b, final wlm a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Object o) {
        switch (this.c) {
            default: {
                this.b((Throwable)o);
                return;
            }
            case 19: {
                this.b((Throwable)o);
                return;
            }
            case 18: {
                this.b((Throwable)o);
                return;
            }
            case 17: {
                this.b((Throwable)o);
                return;
            }
            case 16: {
                this.b((Throwable)o);
                return;
            }
            case 15: {
                this.b((Throwable)o);
                return;
            }
            case 14: {
                this.b((Throwable)o);
                return;
            }
            case 13: {
                this.b((Throwable)o);
                return;
            }
            case 12: {
                this.b((Throwable)o);
                return;
            }
            case 11: {
                this.b((Throwable)o);
                return;
            }
            case 10: {
                this.b((Throwable)o);
                return;
            }
            case 9: {
                this.b((Throwable)o);
                return;
            }
            case 8: {
                this.b((Throwable)o);
                return;
            }
            case 7: {
                this.b((Throwable)o);
                return;
            }
            case 6: {
                this.b((Throwable)o);
                return;
            }
            case 5: {
                this.b((Throwable)o);
                return;
            }
            case 4: {
                this.b((Throwable)o);
                return;
            }
            case 3: {
                this.b((Throwable)o);
                return;
            }
            case 2: {
                this.b((Throwable)o);
                return;
            }
            case 1: {
                this.b((Throwable)o);
                return;
            }
            case 0: {
                this.b((Throwable)o);
            }
        }
    }
    
    public final void b(final Throwable t) {
        switch (this.c) {
            default: {
                final Object b = this.b;
                final Object a = this.a;
                final dbj dbj = (dbj)t;
                ttr.c("Error calling AddBroadcastParticipant", wme.r(dbj));
                final dbb b2 = dbj.b;
                if (b2 != null && b2.a == 403) {
                    wka.b().o(19, 2, dbj);
                    ((wme)b).d.post((Runnable)new wly((wlm)a, 2));
                    return;
                }
                wka.b().o(19, 1, dbj);
                ((wme)b).d.post((Runnable)new wly((wlm)a, 3));
                return;
            }
            case 19: {
                final Object a2 = this.a;
                final Object b3 = this.b;
                final fca fca = (fca)a2;
                ((Executor)fca.d).execute((Runnable)new usq(fca, (Map)b3, t, 6, (byte[])null));
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final apgf apgf = (apgf)this.b;
                if ((apgf.b & 0x4) != 0x0) {
                    final Object b4 = ((hln)a3).b;
                    aiqj aiqj;
                    if ((aiqj = apgf.f) == null) {
                        aiqj = aiqj.a;
                    }
                    ((vcy)b4).a(aiqj);
                }
                return;
            }
            case 17: {
                final Object a4 = this.a;
                final aogv aogv = (aogv)this.b;
                if ((aogv.b & 0x4) != 0x0) {
                    final vcy a5 = ((vyn)a4).a;
                    aiqj aiqj2;
                    if ((aiqj2 = aogv.e) == null) {
                        aiqj2 = aiqj.a;
                    }
                    a5.a(aiqj2);
                }
                return;
            }
            case 16: {
                final Object a6 = this.a;
                final ajxx ajxx = (ajxx)this.b;
                if ((ajxx.b & 0x4) != 0x0) {
                    final vcy a7 = ((vyn)a6).a;
                    aiqj aiqj3;
                    if ((aiqj3 = ajxx.e) == null) {
                        aiqj3 = aiqj.a;
                    }
                    a7.a(aiqj3);
                }
                return;
            }
            case 15: {
                ((vye)this.a).g((String)this.b);
                return;
            }
            case 14: {
                ((vye)this.a).g((String)this.b);
                return;
            }
            case 13: {
                final Object b5 = this.b;
                final Object a8 = this.a;
                if (t instanceof CancellationException) {
                    ((vkf)b5).e(((vkd)a8).f.z());
                }
                return;
            }
            case 12: {
                final Object a9 = this.a;
                final ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand applyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand = (ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand)this.b;
                if ((applyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.b & 0x4) != 0x0) {
                    final Object b6 = ((hln)a9).b;
                    aiqj aiqj4;
                    if ((aiqj4 = applyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.e) == null) {
                        aiqj4 = aiqj.a;
                    }
                    ((vcy)b6).a(aiqj4);
                }
                return;
            }
            case 11: {
                final Object a10 = this.a;
                final Object b7 = this.b;
                final gnr gnr = (gnr)a10;
                if (((sxr)gnr.d).isAdded()) {
                    ((sxr)gnr.d).a();
                }
                final CommerceActionCommandOuterClass$CommerceActionCommand commerceActionCommandOuterClass$CommerceActionCommand = (CommerceActionCommandOuterClass$CommerceActionCommand)b7;
                if ((commerceActionCommandOuterClass$CommerceActionCommand.b & 0x8) != 0x0) {
                    final Object f = gnr.f;
                    aiqj aiqj5;
                    if ((aiqj5 = commerceActionCommandOuterClass$CommerceActionCommand.g) == null) {
                        aiqj5 = aiqj.a;
                    }
                    ((vcy)f).a(aiqj5);
                    return;
                }
                ((tqd)gnr.b).e(t);
                return;
            }
            case 10: {
                final Object a11 = this.a;
                final Object b8 = this.b;
                final Object b9 = ((abrj)a11).b;
                ((tqd)b9).d(((tqd)b9).b(t));
                ((Runnable)b8).run();
                return;
            }
            case 9: {
                final Object a12 = this.a;
                final Object b10 = this.b;
                zlm.b(zll.a, zlk.a, "[InlineCustomTab]Could not launch custom tabs:".concat(String.valueOf(t.getMessage())));
                final kwk kwk = (kwk)a12;
                if (qdw.I(kwk.b)) {
                    kwk.f((aiqj)b10);
                }
                return;
            }
            case 8: {
                final Object a13 = this.a;
                final Object b11 = this.b;
                final jhs jhs = (jhs)a13;
                jhs.b.i((Integer)b11, jhs.a, (String)null);
                return;
            }
            case 7: {
                final Object a14 = this.a;
                final Object b12 = this.b;
                final hun hun = (hun)a14;
                hun.aa.h("Failed to save custom thumbnail.", t);
                hun.C.E((String)b12, apht.ba);
                return;
            }
            case 6: {
                ((gww)this.a).i(this.b);
                zlm.b(zll.b, zlk.f, "[ShortsCreation][Android][Camera]Cannot get composed video");
                return;
            }
            case 5: {
                final Object a15 = this.a;
                final Object b13 = this.b;
                ttr.d("Unable to link account.", t);
                ((gqh)a15).a((GalFlowActivity)b13, gqg.e);
                return;
            }
            case 4: {
                final Object a16 = this.a;
                final Object b14 = this.b;
                ttr.d("Failed to get PiP eligibility", t);
                final amxu amxu = (amxu)b14;
                if ((amxu.c & 0x2) != 0x0) {
                    final vcy a17 = ((gpt)a16).a;
                    aiqj aiqj6;
                    if ((aiqj6 = amxu.e) == null) {
                        aiqj6 = aiqj.a;
                    }
                    a17.a(aiqj6);
                    return;
                }
                ((gpt)a16).b(amxu.d);
                return;
            }
            case 3: {
                final Object a18 = this.a;
                final EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand = (EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand)this.b;
                if ((editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.b & 0x8) != 0x0) {
                    final vcy vcy = (vcy)((atke)((fca)a18).d).a();
                    aiqj aiqj7;
                    if ((aiqj7 = editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.f) == null) {
                        aiqj7 = aiqj.a;
                    }
                    vcy.a(aiqj7);
                }
                return;
            }
            case 2: {
                final Object a19 = this.a;
                final CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand = (CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand)this.b;
                if ((createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.b & 0x8) != 0x0) {
                    final vcy vcy2 = (vcy)((atke)((fca)a19).d).a();
                    aiqj aiqj8;
                    if ((aiqj8 = createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.f) == null) {
                        aiqj8 = aiqj.a;
                    }
                    vcy2.a(aiqj8);
                }
                return;
            }
            case 1: {
                final Object a20 = this.a;
                final Object b15 = this.b;
                final acor acor = new acor(((DefaultProfileCardController)a20).a.a(t), true, (Intent)null, (acaa)null);
                final etk etk = (etk)b15;
                etk.a();
                final acle k = etk.k;
                k.getClass();
                k.add((Object)etk.e((acot)acor, etk.m));
                return;
            }
            case 0: {
                ((DefaultProfileCardController)this.a).c.c((String)this.b);
            }
        }
    }
}
