import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnDismissListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.protos.youtube.api.innertube.ModalEndpointOuterClass$ModalEndpoint;
import java.util.Map;
import com.google.android.apps.youtube.app.common.command.modal.ModalDialogController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcw implements vau
{
    private final ModalDialogController a;
    
    public fcw(final ModalDialogController a) {
        this.a = a;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final ModalEndpointOuterClass$ModalEndpoint modalEndpointOuterClass$ModalEndpoint = (ModalEndpointOuterClass$ModalEndpoint)((agzd)aioe).rr((agyr)ModalEndpointOuterClass$ModalEndpoint.modalEndpoint);
        amik amik;
        if ((amik = modalEndpointOuterClass$ModalEndpoint.b) == null) {
            amik = amik.a;
        }
        if (amik.b == 106613512) {
            amik amik2;
            if ((amik2 = modalEndpointOuterClass$ModalEndpoint.b) == null) {
                amik2 = amik.a;
            }
            amil a;
            if (amik2.b == 106613512) {
                a = (amil)amik2.c;
            }
            else {
                a = amil.a;
            }
            final ModalDialogController a2 = this.a;
            final boolean c = modalEndpointOuterClass$ModalEndpoint.c;
            if (a != null) {
                aibc aibc;
                if ((aibc = a.d) == null) {
                    aibc = aibc.a;
                }
                if ((aibc.b & 0x1) != 0x0) {
                    if (c) {
                        a2.d.a();
                    }
                    a2.j();
                    if (!a2.j) {
                        a2.f = LayoutInflater.from(a2.a).inflate(2131624839, (ViewGroup)null);
                        a2.g = (TextView)a2.f.findViewById(2131428665);
                        a2.i = (acqt)a2.k.g((TextView)a2.f.findViewById(2131430035));
                        final acqt i = a2.i;
                        final agzc agzc = (agzc)((agzi)aibb.a).createBuilder();
                        final ajsq h = abyh.h(a2.a.getString(2132017611));
                        ((agza)agzc).copyOnWrite();
                        final aibb aibb = (aibb)agzc.instance;
                        h.getClass();
                        aibb.i = h;
                        aibb.b |= 0x200;
                        ((agza)agzc).copyOnWrite();
                        final aibb aibb2 = (aibb)agzc.instance;
                        aibb2.d = 13;
                        aibb2.c = 1;
                        i.b((aibb)((agza)agzc).build(), a2.c.n());
                        a2.h = (acqt)a2.k.g((TextView)a2.f.findViewById(2131430518));
                        a2.h.c = new ezi(a2, 3);
                        a2.j = true;
                    }
                    final abyy af = a2.l.af(a2.a);
                    ajsq ajsq;
                    if ((ajsq = a.b) == null) {
                        ajsq = ajsq.a;
                    }
                    (a2.e = ((AlertDialog$Builder)af).setTitle((CharSequence)abyh.b(ajsq)).setView(a2.f).setOnDismissListener((DialogInterface$OnDismissListener)new fal(a2, 2)).create()).show();
                    final TextView g = a2.g;
                    ajsq ajsq2;
                    if ((ajsq2 = a.c) == null) {
                        ajsq2 = ajsq.a;
                    }
                    g.setText((CharSequence)abyh.c(ajsq2, a2.b));
                    final acqt h2 = a2.h;
                    aibc aibc2;
                    if ((aibc2 = a.d) == null) {
                        aibc2 = aibc.a;
                    }
                    aibb aibb3;
                    if ((aibb3 = aibc2.c) == null) {
                        aibb3 = aibb.a;
                    }
                    h2.b(aibb3, a2.c.n());
                    a2.i.c = new fcx(a2, c);
                }
            }
        }
    }
}
