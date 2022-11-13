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

public final class gnz extends sym implements sxw
{
    public static final int j = 0;
    public final Activity a;
    public final tgd b;
    public final YpcOffersListDialogFragmentController c;
    public final Resources d;
    public final wyv e;
    public final acjd f;
    public final vbs g;
    public final hyx h;
    public final aeea i;
    
    public gnz(final Activity a, final sxz sxz, final tqd tqd, final tgd b, final vcy vcy, final YpcOffersListDialogFragmentController c, final mdp mdp, final vbs g, final hyx h, final wyv e, final vxr vxr, final acjd f, final vlq vlq, final aeea i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(sxz, tqd, vcy, mdp, vxr, vlq, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.d = a.getResources();
        this.b = b;
        this.c = c;
        this.g = g;
        this.h = h;
        this.e = e;
        this.f = f;
        this.i = i;
        sxz.p = (sxw)this;
    }
    
    protected final void b(final aiqj aiqj, final Map map) {
        final HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("OnYpcTransactionListener", new gny(this, (sxx)tpe.O((Map)hashMap, (Object)"OnYpcTransactionListener", (Class)sxx.class), this.m));
        super.b(aiqj, (Map)Collection$_EL.stream((Collection)hashMap.entrySet()).filter((Predicate)fqo.q).collect(afci.a(gnx.a, gnx.c)));
    }
    
    protected final void c(final alfi alfi, final aiqj aiqj) {
        this.b.d((Object)new fgc());
        super.c(alfi, aiqj);
    }
    
    public final void d() {
        this.b.d((Object)new fgf());
    }
    
    protected final void e(final aiqj aiqj) {
        if (aiqj != null && ((ahbc)aiqj).ry((ahaq)YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint) && !((YpcGetCartEndpoint$YPCGetCartEndpoint)((ahbc)aiqj).rx((ahaq)YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)).c.isEmpty()) {
            this.b.d((Object)new fgb());
        }
        super.e(aiqj);
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        ((DialogFragmentController)this.c).l();
        super.mE(aiqj, map);
    }
}
