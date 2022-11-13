import com.google.common.util.concurrent.ListenableFuture;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.common.dialog.ProgressBarDialogFragmentController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihk implements vcv
{
    public final arkg a;
    public final tqd b;
    public final ProgressBarDialogFragmentController c;
    public final aaif d;
    public final vcy e;
    public final wyv f;
    public final tag g;
    public final bx h;
    private final bu i;
    private final Executor j;
    private final aadx k;
    
    public ihk(final bu i, final aadx k, final arkg a, final tqd b, final ProgressBarDialogFragmentController c, final aaif d, final vcy e, final tag g, final bx h, final Executor j, final wyv f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.k = k;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.f = f;
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        final String c = ((YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint)((ahbc)aiqj).rx((ahaq)YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint)).c;
        if (TextUtils.isEmpty((CharSequence)c)) {
            return;
        }
        this.c.g();
        this.c.n();
        final aadx k = this.k;
        final vxd vxd = new vxd(k.c, ((zmf)k.d).c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        vxd.a = vxd.g(c);
        ((vkk)vxd).j(aiqj.c);
        final bu i = this.i;
        final aadx j = this.k;
        final Executor l = this.j;
        final ListenableFuture b = ((vml)j.f).b((vls)vxd, l);
        if (((vai)j.g).C()) {
            vxg.a((zmw)j.e, b, l, almx.cs);
        }
        teu.n((aun)i, b, (ttg)new hui(this, 12), (ttg)new ihj(this, aiqj, map));
    }
}
