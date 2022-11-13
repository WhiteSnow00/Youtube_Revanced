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

public final class god implements vcv
{
    private final jvb a;
    
    public god(final jvb a) {
        this.a = a;
    }
    
    public final void mE(final aiqj aiqj, Map map) {
        adkp.H(((ahbc)aiqj).ry((ahaq)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.multiReelDismissalEndpointCommand));
        anuv anuv;
        if ((anuv = ((MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand)((ahbc)aiqj).rx((ahaq)MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.multiReelDismissalEndpointCommand)).b) == null) {
            anuv = anuv.a;
        }
        final amlq amlq = (amlq)aakt.v(anuv, (ahaq)MultiReelDismissalRendererOuterClass.multiReelDismissalRenderer);
        map = (Map)tpe.O(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)Map.class);
        if (map != null) {
            final kqg kqg = (kqg)tpe.O(map, (Object)"multiReelDismissalCallback", (Class)kqg.class);
            final anuv[] array = (anuv[])tpe.O(map, (Object)"reelItemRenderers", (Class)anuv[].class);
            final List h = (List)tpe.O(map, (Object)"reelDismissalInfo", (Class)List.class);
            if (array != null && kqg != null && h != null) {
                final jvb a = this.a;
                final ey f = a.f;
                if (f == null || !f.isShowing()) {
                    a.d.pF().b(xaa.b(57929), aiqj, (alhi)null);
                    a.h = h;
                    a.g.clear();
                    a.e.clear();
                    final LayoutInflater from = LayoutInflater.from(a.a);
                    int i = 0;
                    final View inflate = from.inflate(2131624883, (ViewGroup)null, false);
                    final TextView textView = (TextView)inflate.findViewById(2131429980);
                    final TextView textView2 = (TextView)inflate.findViewById(2131429979);
                    final Button button = (Button)inflate.findViewById(2131429977);
                    final RecyclerView recyclerView = (RecyclerView)inflate.findViewById(2131429978);
                    recyclerView.af((nw)new LinearLayoutManager(1));
                    ajut ajut;
                    if ((amlq.b & 0x1) != 0x0) {
                        if ((ajut = amlq.c) == null) {
                            ajut = ajut.a;
                        }
                    }
                    else {
                        ajut = null;
                    }
                    textView.setText((CharSequence)acak.b(ajut));
                    ajut ajut2;
                    if ((amlq.b & 0x2) != 0x0) {
                        if ((ajut2 = amlq.d) == null) {
                            ajut2 = ajut.a;
                        }
                    }
                    else {
                        ajut2 = null;
                    }
                    textView2.setText((CharSequence)acak.b(ajut2));
                    final ArrayList list = new ArrayList();
                    while (i < array.length) {
                        final anuv anuv2 = array[i];
                        final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer)((ahbc)anuv2).rx((ahaq)ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer);
                        if (((ahbc)anuv2).ry((ahaq)ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) && (reelItemRendererOuterClass$ReelItemRenderer.b & 0x400000) != 0x0) {
                            final List h2 = a.h;
                            ansl ansl;
                            if ((ansl = reelItemRendererOuterClass$ReelItemRenderer.s) == null) {
                                ansl = ansl.a;
                            }
                            if (!h2.contains(ansl)) {
                                list.add(reelItemRendererOuterClass$ReelItemRenderer);
                            }
                        }
                        ++i;
                    }
                    recyclerView.ac((nq)new jva(a, (List)list, amlq));
                    anuv anuv3;
                    if ((anuv3 = amlq.g) == null) {
                        anuv3 = anuv.a;
                    }
                    final aicz aicz = (aicz)((ahbc)anuv3).rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
                    ajut ajut3;
                    if ((aicz.b & 0x200) != 0x0) {
                        if ((ajut3 = aicz.i) == null) {
                            ajut3 = ajut.a;
                        }
                    }
                    else {
                        ajut3 = null;
                    }
                    button.setText((CharSequence)acak.b(ajut3));
                    a.d.pF().D((wzz)new wyt(aicz.w));
                    a.d.pF().t((wzz)new wyt(aicz.w), (alhi)null);
                    button.setOnClickListener((View$OnClickListener)new ezp(a, kqg, amlq, aicz, 7));
                    final ex ex = new ex(a.a, 2132083353);
                    ex.p(inflate);
                    a.f = ex.b();
                    if (a.j.ao()) {
                        a.f.setOnShowListener((DialogInterface$OnShowListener)new eyk(a, 13));
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
