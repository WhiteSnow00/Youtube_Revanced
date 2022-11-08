import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.HashMap;
import java.util.Map;
import android.content.res.Resources;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gns extends swh implements svr
{
    public final Activity a;
    public final tdz b;
    public final YpcOffersListDialogFragmentController c;
    public final Resources d;
    public final wwu e;
    public final acha f;
    public final van g;
    public final hyc h;
    public final aeby i;
    
    public gns(final Activity a, final svu svu, final tny tny, final tdz b, final vax vax, final YpcOffersListDialogFragmentController c, final mck mck, final van g, final hyc h, final wwu e, final vvq vvq, final acha f, final vjl vjl, final aeby i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(svu, tny, vax, mck, vvq, vjl, (byte[])null, (byte[])null);
        this.a = a;
        this.d = a.getResources();
        this.b = b;
        this.c = c;
        this.g = g;
        this.h = h;
        this.e = e;
        this.f = f;
        this.i = i;
        svu.p = (svr)this;
    }
    
    protected final void b(final aioe aioe, final Map map) {
        final HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("OnYpcTransactionListener", new gnr(this, (svs)tmy.O((Map)hashMap, (Object)"OnYpcTransactionListener", (Class)svs.class), this.m));
        super.b(aioe, (Map)Collection$_EL.stream((Collection)hashMap.entrySet()).filter((Predicate)fqf.q).collect(afaj.a((Function)gnq.a, (Function)gnq.c)));
    }
    
    protected final void c(final aldf aldf, final aioe aioe) {
        this.b.d((Object)new ffw());
        super.c(aldf, aioe);
    }
    
    public final void d() {
        this.b.d((Object)new ffz());
    }
    
    protected final void e(final aioe aioe) {
        if (aioe != null && ((agzd)aioe).rs((agyr)YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint) && !((YpcGetCartEndpoint$YPCGetCartEndpoint)((agzd)aioe).rr((agyr)YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)).c.isEmpty()) {
            this.b.d((Object)new ffv());
        }
        super.e(aioe);
    }
    
    public final void mE(final aioe aioe, final Map map) {
        ((DialogFragmentController)this.c).l();
        super.mE(aioe, map);
    }
}
