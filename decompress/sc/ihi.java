import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import android.content.Context;
import com.google.android.apps.youtube.app.common.dialog.ProgressBarDialogFragmentController;
import com.google.protos.youtube.api.innertube.GetDownloadActionCommandOuterClass$GetDownloadActionCommand;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihi implements vcv
{
    public final zmf a;
    public final Executor b;
    public final Executor c;
    public final wyv d;
    public final atke e;
    public final aeea f;
    private final vcy g;
    private final atke h;
    private final ine i;
    private final arkg j;
    private final tag k;
    private final aln l;
    private final jki m;
    
    public ihi(final jki m, final vcy g, final aeea f, final zmf a, final atke h, final ine i, final aln l, final Executor b, final Executor c, final wyv d, final arkg j, final tag k, final atke e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.m = m;
        this.g = g;
        this.f = f;
        this.a = a;
        this.h = h;
        this.i = i;
        this.l = l;
        this.b = b;
        this.c = c;
        this.d = d;
        this.j = j;
        this.k = k;
        this.e = e;
    }
    
    public final void b(final aiqj aiqj, final ajxu ajxu) {
        if (((ahbc)aiqj).ry((ahaq)ajmu.a)) {
            final wyw wyw = (wyw)this.j.a();
            final afev m = afev.m("com.google.android.libraries.youtube.logging.interaction_logger", wyw);
            try {
                this.k.mE(aiqj, (Map)m);
                if ((ajxu.b & 0x10) != 0x0) {
                    wyw.D((wzz)new wyt(ajxu.e));
                }
                return;
            }
            catch (final vdj vdj) {
                throw ihi$$ExternalSyntheticBackport0.m("Unknown command", (Throwable)vdj);
            }
        }
        this.g.a(aiqj);
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        adkp.H(((ahbc)aiqj).ry((ahaq)GetDownloadActionCommandOuterClass$GetDownloadActionCommand.getDownloadActionCommand));
        final GetDownloadActionCommandOuterClass$GetDownloadActionCommand getDownloadActionCommandOuterClass$GetDownloadActionCommand = (GetDownloadActionCommandOuterClass$GetDownloadActionCommand)((ahbc)aiqj).rx((ahaq)GetDownloadActionCommandOuterClass$GetDownloadActionCommand.getDownloadActionCommand);
        final ahaz builder = ((ahbh)getDownloadActionCommandOuterClass$GetDownloadActionCommand).toBuilder();
        ((ProgressBarDialogFragmentController)this.e.a()).g();
        ((ProgressBarDialogFragmentController)this.e.a()).n();
        final jki m = this.m;
        final adfq f = ((imv)aefb.O((Context)m.a, (Class)imv.class, ((zlv)m.b).a(this.a.c()))).F();
        final amwz v = ((aaea)this.i).v(amwz.a);
        builder.copyOnWrite();
        final GetDownloadActionCommandOuterClass$GetDownloadActionCommand getDownloadActionCommandOuterClass$GetDownloadActionCommand2 = (GetDownloadActionCommandOuterClass$GetDownloadActionCommand)builder.instance;
        getDownloadActionCommandOuterClass$GetDownloadActionCommand2.g = v.k;
        getDownloadActionCommandOuterClass$GetDownloadActionCommand2.b |= 0x10;
        ListenableFuture listenableFuture;
        if ((getDownloadActionCommandOuterClass$GetDownloadActionCommand.b & 0x400) != 0x0) {
            listenableFuture = tpe.cm(((vef)this.h.a()).a(this.a.c()).f(getDownloadActionCommandOuterClass$GetDownloadActionCommand.j).j(amwu.class));
        }
        else {
            listenableFuture = afwm.m((Object)Optional.empty());
        }
        final ListenableFuture ax = this.f.ax(this.a.c());
        final ListenableFuture t = this.l.t();
        ((ggj)afnd.y(new ListenableFuture[] { listenableFuture, ax, t }).a).l(aeun.h((Runnable)new ihh(this, listenableFuture, ax, getDownloadActionCommandOuterClass$GetDownloadActionCommand, builder, t, f, aiqj, null, null, null, null, null, null)), this.b);
    }
}
