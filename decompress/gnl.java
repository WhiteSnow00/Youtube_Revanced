import java.util.List;
import android.view.WindowManager$LayoutParams;
import android.view.Window;
import java.util.Iterator;
import android.view.View;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.CreationEntryEndpointOuterClass$CreationEntryEndpoint;
import android.app.Activity;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnl implements vcv
{
    private final tjm a;
    private final jsp b;
    private final lkx c;
    
    public gnl(final tjm a, final jsp b, final lkx c, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        if (!this.a.o()) {
            this.b.b();
            return;
        }
        final lkx c = this.c;
        final Activity activity = (Activity)((atke)c.a).a();
        activity.getClass();
        final acpk acpk = (acpk)((atke)c.b).a();
        acpk.getClass();
        final vcy vcy = (vcy)((atke)c.c).a();
        vcy.getClass();
        final xac xac = (xac)((atke)c.f).a();
        xac.getClass();
        final tgd tgd = (tgd)((atke)c.d).a();
        tgd.getClass();
        final aeea aeea = (aeea)((atke)c.e).a();
        aeea.getClass();
        final jsw jsw = new jsw(activity, acpk, vcy, xac, tgd, aeea, (byte[])null, (byte[])null, (byte[])null);
        final CreationEntryEndpointOuterClass$CreationEntryEndpoint creationEntryEndpointOuterClass$CreationEntryEndpoint = (CreationEntryEndpointOuterClass$CreationEntryEndpoint)((ahbc)aiqj).rx((ahaq)CreationEntryEndpointOuterClass$CreationEntryEndpoint.creationEntryEndpoint);
        creationEntryEndpointOuterClass$CreationEntryEndpoint.getClass();
        final ey f = jsw.f;
        if (f != null && f.isShowing()) {
            return;
        }
        jsw.d.b(xaa.b(36216), aiqj, (alhi)null);
        final View inflate = jsw.a.getLayoutInflater().inflate(2131624301, (ViewGroup)null, false);
        final LinearLayout linearLayout = (LinearLayout)inflate.findViewById(2131428518);
        aidm aidm;
        if ((aidm = creationEntryEndpointOuterClass$CreationEntryEndpoint.b) == null) {
            aidm = aidm.a;
        }
        adkp.Q(0x1 == (aidm.b & 0x1));
        aidm aidm2;
        if ((aidm2 = creationEntryEndpointOuterClass$CreationEntryEndpoint.b) == null) {
            aidm2 = aidm.a;
        }
        aidl aidl;
        if ((aidl = aidm2.c) == null) {
            aidl = aidl.a;
        }
        if ((aidl.b & 0x1) != 0x0) {
            final TextView textView = (TextView)inflate.findViewById(2131428523);
            aidm aidm3;
            if ((aidm3 = creationEntryEndpointOuterClass$CreationEntryEndpoint.b) == null) {
                aidm3 = aidm.a;
            }
            aidl aidl2;
            if ((aidl2 = aidm3.c) == null) {
                aidl2 = aidl.a;
            }
            ajut ajut;
            if ((ajut = aidl2.d) == null) {
                ajut = ajut.a;
            }
            textView.setText((CharSequence)acak.b(ajut));
        }
        aidm aidm4;
        if ((aidm4 = creationEntryEndpointOuterClass$CreationEntryEndpoint.b) == null) {
            aidm4 = aidm.a;
        }
        aidl aidl3;
        if ((aidl3 = aidm4.c) == null) {
            aidl3 = aidl.a;
        }
        final Iterator<Object> iterator = ((List<Object>)aidl3.c).iterator();
        while (iterator.hasNext()) {
            aicz aicz;
            if ((aicz = iterator.next().b) == null) {
                aicz = aicz.a;
            }
            final View inflate2 = jsw.a.getLayoutInflater().inflate(2131624300, (ViewGroup)linearLayout, false);
            final TextView textView2 = (TextView)inflate2.findViewById(2131431953);
            ajut ajut2;
            if ((aicz.b & 0x200) != 0x0) {
                if ((ajut2 = aicz.i) == null) {
                    ajut2 = ajut.a;
                }
            }
            else {
                ajut2 = null;
            }
            textView2.setText((CharSequence)acak.b(ajut2));
            ajut ajut3;
            if ((aicz.b & 0x200) != 0x0) {
                if ((ajut3 = aicz.i) == null) {
                    ajut3 = ajut.a;
                }
            }
            else {
                ajut3 = null;
            }
            inflate2.setContentDescription((CharSequence)acak.b(ajut3));
            anb.N(inflate2, (akw)new tpq());
            if ((aicz.b & 0x20) != 0x0) {
                final acpk b = jsw.b;
                akdi akdi;
                if ((akdi = aicz.g) == null) {
                    akdi = akdi.a;
                }
                akdh akdh;
                if ((akdh = akdh.b(akdi.c)) == null) {
                    akdh = akdh.a;
                }
                ((ImageView)inflate2.findViewById(2131429296)).setImageResource(b.a(akdh));
            }
            inflate2.setOnClickListener((View$OnClickListener)new jlb(jsw, aicz, 12));
            jsw.d.l((wzz)new wyt(aicz.w));
            linearLayout.addView(inflate2);
        }
        final ey f2 = jsw.f;
        if (f2 == null) {
            final ex ex = new ex((Context)jsw.a, 2132083218);
            ex.p(inflate);
            jsw.f = ex.b();
            if (jsw.g.ao()) {
                jsw.f.setOnShowListener((DialogInterface$OnShowListener)new eyk(jsw, 11));
            }
            else {
                jsw.f.setOnShowListener((DialogInterface$OnShowListener)new eyk(jsw, 12));
            }
            jsw.f.setOnDismissListener((DialogInterface$OnDismissListener)new fap(jsw, 9));
            jsw.f.show();
            final Window window = jsw.f.getWindow();
            int dimensionPixelSize;
            if ((dimensionPixelSize = jsw.a.getResources().getDimensionPixelSize(2131166199)) <= 0) {
                dimensionPixelSize = -1;
            }
            window.setLayout(dimensionPixelSize, -2);
            final WindowManager$LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setAttributes(attributes);
            return;
        }
        f2.a.b(inflate);
        jsw.f.show();
    }
}
