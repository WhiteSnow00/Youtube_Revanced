import android.view.WindowManager$LayoutParams;
import android.view.Window;
import android.view.View;
import android.content.DialogInterface$OnShowListener;
import android.view.View$OnClickListener;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.ArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.List;
import com.google.protos.youtube.api.innertube.MultiReelDismissalRendererOuterClass;
import com.google.protos.youtube.api.innertube.MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnw implements vau
{
    private final jua a;
    
    public gnw(final jua a) {
        this.a = a;
    }
    
    public final void mE(final aioe aioe, Map map) {
        agot.u(((agzd)aioe).rs((agyr)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.multiReelDismissalEndpointCommand));
        anss anss;
        if ((anss = ((MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand)((agzd)aioe).rr((agyr)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.multiReelDismissalEndpointCommand)).b) == null) {
            anss = anss.a;
        }
        final amjm amjm = (amjm)aaiy.w(anss, (agyr)MultiReelDismissalRendererOuterClass.multiReelDismissalRenderer);
        map = (Map)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)Map.class);
        if (map != null) {
            final kpf kpf = (kpf)tmy.O(map, (Object)"multiReelDismissalCallback", (Class)kpf.class);
            final anss[] array = (anss[])tmy.O(map, (Object)"reelItemRenderers", (Class)anss[].class);
            final List h = (List)tmy.O(map, (Object)"reelDismissalInfo", (Class)List.class);
            if (array != null && kpf != null && h != null) {
                final jua a = this.a;
                final ey f = a.f;
                if (f == null || !f.isShowing()) {
                    a.d.n().b(wya.b(57929), aioe, (alff)null);
                    a.h = h;
                    a.g.clear();
                    a.e.clear();
                    final LayoutInflater from = LayoutInflater.from(a.a);
                    int i = 0;
                    final View inflate = from.inflate(2131624882, (ViewGroup)null, false);
                    final TextView textView = (TextView)inflate.findViewById(2131429980);
                    final TextView textView2 = (TextView)inflate.findViewById(2131429979);
                    final Button button = (Button)inflate.findViewById(2131429977);
                    final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(2131429978);
                    recyclerView.af((nw)new LinearLayoutManager(1));
                    ajsq ajsq;
                    if ((amjm.b & 0x1) != 0x0) {
                        if ((ajsq = amjm.c) == null) {
                            ajsq = ajsq.a;
                        }
                    }
                    else {
                        ajsq = null;
                    }
                    textView.setText((CharSequence)abyh.b(ajsq));
                    ajsq ajsq2;
                    if ((amjm.b & 0x2) != 0x0) {
                        if ((ajsq2 = amjm.d) == null) {
                            ajsq2 = ajsq.a;
                        }
                    }
                    else {
                        ajsq2 = null;
                    }
                    textView2.setText((CharSequence)abyh.b(ajsq2));
                    final ArrayList list = new ArrayList();
                    while (i < array.length) {
                        final anss anss2 = array[i];
                        final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer)((agzd)anss2).rr((agyr)ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer);
                        if (((agzd)anss2).rs((agyr)ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) && (reelItemRendererOuterClass$ReelItemRenderer.b & 0x400000) != 0x0) {
                            final List h2 = a.h;
                            anqi anqi;
                            if ((anqi = reelItemRendererOuterClass$ReelItemRenderer.s) == null) {
                                anqi = anqi.a;
                            }
                            if (!h2.contains(anqi)) {
                                list.add(reelItemRendererOuterClass$ReelItemRenderer);
                            }
                        }
                        ++i;
                    }
                    recyclerView.ac((nq)new jtz(a, (List)list, amjm));
                    anss anss3;
                    if ((anss3 = amjm.g) == null) {
                        anss3 = anss.a;
                    }
                    final aibb aibb = (aibb)((agzd)anss3).rr((agyr)ButtonRendererOuterClass.buttonRenderer);
                    ajsq ajsq3;
                    if ((aibb.b & 0x200) != 0x0) {
                        if ((ajsq3 = aibb.i) == null) {
                            ajsq3 = ajsq.a;
                        }
                    }
                    else {
                        ajsq3 = null;
                    }
                    button.setText((CharSequence)abyh.b(ajsq3));
                    a.d.n().D((wxz)new wws(aibb.w));
                    a.d.n().t((wxz)new wws(aibb.w), (alff)null);
                    button.setOnClickListener((View$OnClickListener)new ezl(a, kpf, amjm, aibb, 7));
                    final ex ex = new ex(a.a, 2132083353);
                    ex.p(inflate);
                    a.f = ex.b();
                    if (a.j.ai()) {
                        a.f.setOnShowListener((DialogInterface$OnShowListener)new eyh(a, 13));
                    }
                    a.f.show();
                    final Window window = a.f.getWindow();
                    window.setLayout(-1, -2);
                    final WindowManager$LayoutParams attributes = window.getAttributes();
                    attributes.gravity = 17;
                    window.setAttributes(attributes);
                }
            }
        }
    }
}
