import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.concurrent.Executor;
import android.widget.TextView;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfg implements tgg
{
    public final tqd a;
    public final Context b;
    public final wyv c;
    public final acsy d;
    public final acsy e;
    public final LoadingFrameLayout f;
    public final View g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final acqv k;
    public final jff l;
    public final tgd m;
    private final atke n;
    private final Executor o;
    private final RecyclerView p;
    
    public jfg(final atke n, final tqd a, final Context b, final Executor o, final ziy ziy, final acps acps, final acrr acrr, final ipd ipd, final tgd m, final oug oug, final wyv c, final LoadingFrameLayout f, final jff l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.n = n;
        this.a = a;
        this.b = b;
        this.o = o;
        this.c = c;
        (this.f = f).f((acxp)new hxc(this, 2));
        this.g = f.findViewById(2131431886);
        final TextView i = (TextView)f.findViewById(2131428234);
        this.i = i;
        this.d = ziy.ap(i);
        final TextView j = (TextView)f.findViewById(2131430057);
        this.j = j;
        this.e = ziy.ap(j);
        this.h = (TextView)f.findViewById(2131432095);
        final RecyclerView p17 = (RecyclerView)f.findViewById(2131431887);
        (this.p = p17).af((nw)new LinearLayoutManager());
        final vmj vmj = (vmj)n.a();
        final vmj vmj2 = (vmj)n.a();
        final jfr jfr = (jfr)c;
        this.k = ipd.a((acrm)null, (aeea)null, p17, vmj, (acpu)acrr.a(vmj2, jfr.af), jfr.af, (acku)acps.a(), acrj.Zc, acqx.d, acdy.g, oug, b);
        this.m = m;
        this.l = l;
    }
    
    public final void a() {
        this.f.c();
        this.g.setVisibility(8);
        final vud f = ((vuf)this.n.a()).f();
        ((vkk)f).i();
        teu.k(((vuf)this.n.a()).h.b((vls)f, this.o), (Executor)afum.a, (tes)new hug(this, 6), (tet)new hgd(this, 15));
    }
    
    public final void b(final anuv anuv, final acsy acsy, final TextView textView) {
        if (((ahbc)anuv).ry((ahaq)ButtonRendererOuterClass.buttonRenderer)) {
            final aicz aicz = (aicz)((ahbc)anuv).rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
            acsy.h();
            ((acsx)acsy).b(aicz, ((jfr)this.c).af);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final jfj jfj = (jfj)o;
            ((jfr)this.l).dismiss();
            array = null;
        }
        else {
            array = new Class[] { jfj.class };
        }
        return array;
    }
}
