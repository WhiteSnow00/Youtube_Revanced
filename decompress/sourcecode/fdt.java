import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdt implements vau
{
    public asic a;
    private final uvc c;
    private final uvf d;
    private final uyf e;
    private final kyp f;
    private final abpj g;
    
    public fdt(final uvc c, final uyf e, final uvf d, final kyp f, final abpj g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.e = e;
        this.d = d;
        this.f = f;
        this.g = g;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        vem.v(this.a);
        final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)((agzd)aioe).rr((agyr)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
        if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 0x4) == 0x0) {
            ajnh ajnh;
            if ((ajnh = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.h) == null) {
                ajnh = ajnh.a;
            }
            ajnl b;
            if (ajnh.b == 138681066) {
                b = (ajnl)ajnh.c;
            }
            else {
                b = ajnl.b;
            }
            ajnj ajnj;
            if ((ajnj = b.g) == null) {
                ajnj = ajnj.a;
            }
            utk a;
            if (ajnj.b == 449330433) {
                a = (utk)this.c.b().aG();
            }
            else {
                final uvc c = this.c;
                ajng a2;
                if (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c == 10) {
                    a2 = (ajng)showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d;
                }
                else {
                    a2 = ajng.a;
                }
                ajnf ajnf;
                if ((ajnf = ajnf.b(a2.c)) == null) {
                    ajnf = ajnf.a;
                }
                a = c.a(ajnf);
            }
            if (!vem.F(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint, a)) {
                final ajnh h = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.h;
                ajnh a3;
                if (h == null) {
                    a3 = ajnh.a;
                }
                else {
                    a3 = h;
                }
                if (a3.b == 138681066) {
                    ajnh a4;
                    if ((a4 = h) == null) {
                        a4 = ajnh.a;
                    }
                    ajnl b2;
                    if (a4.b == 138681066) {
                        b2 = (ajnl)a4.c;
                    }
                    else {
                        b2 = ajnl.b;
                    }
                    a.o(b2);
                }
                vem.E(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.g, this.d);
                String d;
                if ((d = vem.D(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint)) == null) {
                    d = (String)tmy.O(map, (Object)"engagement_panel_id_key", (Class)String.class);
                }
                if (this.d.b(a)) {
                    a.A();
                }
                vem.G(aioe, a, (usz)tmy.O(map, (Object)"engagement_panel_close_listener_key", (Class)usz.class), d, gkt.A(this.e) && (boolean)tmy.N(map, (Object)"triggered_on_ui_ready", (Object)false), map);
                if (this.d.c(a)) {
                    this.a = a.g().l.B((asjd)exd.k).ai().aw((Object)false).e().V((asir)new erx(this.d, 7));
                }
            }
            return;
        }
        this.g.ao(aioe);
    }
}
