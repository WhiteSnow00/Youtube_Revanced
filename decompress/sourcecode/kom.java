import java.util.Map;
import android.view.View$OnClickListener;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class kom extends acja
{
    protected final Context a;
    protected final acnj b;
    protected final aceo c;
    public final vax d;
    public final View e;
    protected final acek f;
    protected final fzo g;
    private final View h;
    
    public kom(final Context a, final acnj b, final aceo c, final vax d, final fzo g, final int n, final int n2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        final LayoutInflater from = LayoutInflater.from(a);
        View viewById = null;
        final View inflate = from.inflate(n, (ViewGroup)null);
        this.e = inflate;
        final acej a2 = acek.a();
        a2.b(2131232282);
        this.f = a2.a();
        if (n2 != 0) {
            viewById = inflate.findViewById(n2);
        }
        this.h = viewById;
    }
    
    public final View a() {
        return this.e;
    }
    
    public void c(final acir acir) {
    }
    
    protected void f(final acij acij, final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        final Map e = acij.e();
        Map map;
        aioe aioe3;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 0x1000) != 0x0) {
            final fzo g = this.g;
            aioe aioe;
            if ((aioe = reelItemRendererOuterClass$ReelItemRenderer.m) == null) {
                aioe = aioe.a;
            }
            final int ci = aqql.ci(reelItemRendererOuterClass$ReelItemRenderer.o);
            boolean b = false;
            if (ci != 0) {
                if (ci == 2) {
                    b = true;
                }
            }
            g.S(1, aioe, b);
            final fzo g2 = this.g;
            aioe aioe2;
            if ((aioe2 = reelItemRendererOuterClass$ReelItemRenderer.m) == null) {
                aioe2 = aioe.a;
            }
            final aioe q = g2.Q(aioe2);
            final aorm a = guc.a(q, this.c);
            map = e;
            aioe3 = q;
            if (a != null) {
                if (e == null) {
                    map = new HashMap();
                }
                else {
                    map = new HashMap(e);
                }
                map.put("com.google.android.libraries.youtube.innertube.bundle", hgd.t(a));
                aioe3 = q;
            }
        }
        else {
            aioe3 = null;
            map = e;
        }
        final ReelToReelList list = (ReelToReelList)acij.c("ReelToReelListDecorator");
        Map a2 = map;
        if (list != null) {
            a2 = ReelToReelList.a(aioe3, list, map);
        }
        this.g.R(this.e, new jku(this, reelItemRendererOuterClass$ReelItemRenderer, 20));
        this.g(reelItemRendererOuterClass$ReelItemRenderer);
        this.e.setOnClickListener((View$OnClickListener)new klr(this, reelItemRendererOuterClass$ReelItemRenderer, a2, 5));
    }
    
    public boolean g(final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        final View h = this.h;
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = b;
        if (h != null) {
            b3 = b;
            if (reelItemRendererOuterClass$ReelItemRenderer != null) {
                final int ci = aqql.ci(reelItemRendererOuterClass$ReelItemRenderer.o);
            Label_0106:
                while (true) {
                    Label_0053: {
                        if (ci == 0) {
                            break Label_0053;
                        }
                        if (ci != 2) {
                            break Label_0053;
                        }
                        b3 = true;
                        break Label_0106;
                    }
                    final fzo g = this.g;
                    aioe aioe;
                    if ((reelItemRendererOuterClass$ReelItemRenderer.b & 0x1000) != 0x0) {
                        if ((aioe = reelItemRendererOuterClass$ReelItemRenderer.m) == null) {
                            aioe = aioe.a;
                        }
                    }
                    else {
                        aioe = null;
                    }
                    b3 = b2;
                    if (g.V(aioe)) {
                        continue;
                    }
                    break;
                }
                this.h.setEnabled(b3 ^ true);
            }
        }
        return b3;
    }
}
