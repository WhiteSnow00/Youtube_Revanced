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

public final class gnf implements vau
{
    private final thh a;
    private final jro b;
    private final lht c;
    
    public gnf(final thh a, final jro b, final lht c, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        if (!this.a.o()) {
            this.b.b();
            return;
        }
        final lht c = this.c;
        final Activity activity = (Activity)((atjj)c.a).a();
        activity.getClass();
        final acng acng = (acng)((atjj)c.e).a();
        acng.getClass();
        final vax vax = (vax)((atjj)c.f).a();
        vax.getClass();
        final wyc wyc = (wyc)((atjj)c.d).a();
        wyc.getClass();
        final tdz tdz = (tdz)((atjj)c.b).a();
        tdz.getClass();
        final aeby aeby = (aeby)((atjj)c.c).a();
        aeby.getClass();
        final jrv jrv = new jrv(activity, acng, vax, wyc, tdz, aeby, (byte[])null, (byte[])null, (byte[])null);
        final CreationEntryEndpointOuterClass$CreationEntryEndpoint creationEntryEndpointOuterClass$CreationEntryEndpoint = (CreationEntryEndpointOuterClass$CreationEntryEndpoint)((agzd)aioe).rr((agyr)CreationEntryEndpointOuterClass$CreationEntryEndpoint.creationEntryEndpoint);
        creationEntryEndpointOuterClass$CreationEntryEndpoint.getClass();
        final ey f = jrv.f;
        if (f != null && f.isShowing()) {
            return;
        }
        jrv.d.b(wya.b(36216), aioe, (alff)null);
        final View inflate = jrv.a.getLayoutInflater().inflate(2131624302, (ViewGroup)null, false);
        final LinearLayout linearLayout = (LinearLayout)inflate.findViewById(2131428518);
        aibo aibo;
        if ((aibo = creationEntryEndpointOuterClass$CreationEntryEndpoint.b) == null) {
            aibo = aibo.a;
        }
        agot.D(0x1 == (aibo.b & 0x1));
        aibo aibo2;
        if ((aibo2 = creationEntryEndpointOuterClass$CreationEntryEndpoint.b) == null) {
            aibo2 = aibo.a;
        }
        aibn aibn;
        if ((aibn = aibo2.c) == null) {
            aibn = aibn.a;
        }
        if ((aibn.b & 0x1) != 0x0) {
            final TextView textView = (TextView)inflate.findViewById(2131428523);
            aibo aibo3;
            if ((aibo3 = creationEntryEndpointOuterClass$CreationEntryEndpoint.b) == null) {
                aibo3 = aibo.a;
            }
            aibn aibn2;
            if ((aibn2 = aibo3.c) == null) {
                aibn2 = aibn.a;
            }
            ajsq ajsq;
            if ((ajsq = aibn2.d) == null) {
                ajsq = ajsq.a;
            }
            textView.setText((CharSequence)abyh.b(ajsq));
        }
        aibo aibo4;
        if ((aibo4 = creationEntryEndpointOuterClass$CreationEntryEndpoint.b) == null) {
            aibo4 = aibo.a;
        }
        aibn aibn3;
        if ((aibn3 = aibo4.c) == null) {
            aibn3 = aibn.a;
        }
        final Iterator<Object> iterator = ((List<Object>)aibn3.c).iterator();
        while (iterator.hasNext()) {
            aibb aibb;
            if ((aibb = iterator.next().b) == null) {
                aibb = aibb.a;
            }
            final View inflate2 = jrv.a.getLayoutInflater().inflate(2131624301, (ViewGroup)linearLayout, false);
            final TextView textView2 = (TextView)inflate2.findViewById(2131431950);
            ajsq ajsq2;
            if ((aibb.b & 0x200) != 0x0) {
                if ((ajsq2 = aibb.i) == null) {
                    ajsq2 = ajsq.a;
                }
            }
            else {
                ajsq2 = null;
            }
            textView2.setText((CharSequence)abyh.b(ajsq2));
            ajsq ajsq3;
            if ((aibb.b & 0x200) != 0x0) {
                if ((ajsq3 = aibb.i) == null) {
                    ajsq3 = ajsq.a;
                }
            }
            else {
                ajsq3 = null;
            }
            inflate2.setContentDescription((CharSequence)abyh.b(ajsq3));
            ana.N(inflate2, (akv)new tnk());
            if ((aibb.b & 0x20) != 0x0) {
                final acng b = jrv.b;
                akbf akbf;
                if ((akbf = aibb.g) == null) {
                    akbf = akbf.a;
                }
                akbe akbe;
                if ((akbe = akbe.b(akbf.c)) == null) {
                    akbe = akbe.a;
                }
                ((ImageView)inflate2.findViewById(2131429296)).setImageResource(b.a(akbe));
            }
            inflate2.setOnClickListener((View$OnClickListener)new jjz(jrv, aibb, 11));
            jrv.d.l((wxz)new wws(aibb.w));
            linearLayout.addView(inflate2);
        }
        final ey f2 = jrv.f;
        if (f2 == null) {
            final ex ex = new ex((Context)jrv.a, 2132083218);
            ex.p(inflate);
            jrv.f = ex.b();
            if (jrv.g.ai()) {
                jrv.f.setOnShowListener((DialogInterface$OnShowListener)new eyh(jrv, 11));
            }
            else {
                jrv.f.setOnShowListener((DialogInterface$OnShowListener)new eyh(jrv, 12));
            }
            jrv.f.setOnDismissListener((DialogInterface$OnDismissListener)new fal(jrv, 9));
            jrv.f.show();
            final Window window = jrv.f.getWindow();
            int dimensionPixelSize;
            if ((dimensionPixelSize = jrv.a.getResources().getDimensionPixelSize(2131166199)) <= 0) {
                dimensionPixelSize = -1;
            }
            window.setLayout(dimensionPixelSize, -2);
            final WindowManager$LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setAttributes(attributes);
            return;
        }
        f2.a.b(inflate);
        jrv.f.show();
    }
}
