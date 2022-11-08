import android.app.Dialog;
import com.google.protos.youtube.api.innertube.CreatePlaylistDialogRendererOuterClass;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.DropdownRendererOuterClass;
import android.view.ViewStub;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import android.widget.TextView;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import android.view.View;
import android.widget.EditText;
import java.util.List;
import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jem extends jen
{
    public vax ae;
    public vsc af;
    public tny ag;
    public tdz ah;
    public CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint ai;
    public List aj;
    public aiyg ak;
    public EditText al;
    public acqu am;
    public uyi an;
    public zhb ao;
    public aja ap;
    public cxz aq;
    public tyh ar;
    private View as;
    
    public static boolean aK(final aiyg aiyg) {
        anss anss;
        if ((anss = aiyg.d) == null) {
            anss = anss.a;
        }
        return ((agzd)anss).rs((agyr)MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        this.as = layoutInflater.inflate(2131624299, viewGroup, false);
        if (this.an.aT()) {
            this.as.setBackgroundColor(tmy.cn(((br)this).nT(), 2130970893));
        }
        final TextView textView = (TextView)this.as.findViewById(2131428669);
        ajsq ajsq;
        if ((ajsq = this.ak.b) == null) {
            ajsq = ajsq.a;
        }
        tmy.t(textView, (CharSequence)abyh.b(ajsq));
        final TextInputLayout textInputLayout = (TextInputLayout)this.as.findViewById(2131430017);
        textInputLayout.u(false);
        (this.al = (EditText)this.as.findViewById(2131430009)).setHint((CharSequence)this.ak.c);
        this.al.addTextChangedListener((TextWatcher)new hde(this, textInputLayout, 2));
        final PrivacySpinner privacySpinner = (PrivacySpinner)this.as.findViewById(2131430611);
        this.ar = this.ap.x(privacySpinner);
        final fzy d = this.aq.D(((br)this).nT(), (ViewStub)this.as.findViewById(2131430603));
        if (aK(this.ak)) {
            anss anss;
            if ((anss = this.ak.d) == null) {
                anss = anss.a;
            }
            d.f((amfl)((agzd)anss).rr((agyr)MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
            this.as.findViewById(2131430605).setVisibility(8);
        }
        else {
            anss anss2;
            if ((anss2 = this.ak.d) == null) {
                anss2 = anss.a;
            }
            if (((agzd)anss2).rs((agyr)DropdownRendererOuterClass.dropdownRenderer)) {
                final tyh ar = this.ar;
                anss anss3;
                if ((anss3 = this.ak.d) == null) {
                    anss3 = anss.a;
                }
                ar.l((ajhz)((agzd)anss3).rr((agyr)DropdownRendererOuterClass.dropdownRenderer));
                this.ar.e = new ov(this, 5);
            }
            else {
                this.ar.l((ajhz)null);
                this.ar.n(1);
            }
            privacySpinner.c = ((bi)this).d;
            this.as.findViewById(2131430605).setVisibility(0);
            d.f(null);
        }
        final acqu g = this.ao.g((TextView)this.as.findViewById(2131427999));
        anss anss4;
        if ((anss4 = this.ak.f) == null) {
            anss4 = anss.a;
        }
        ((acqt)g).b((aibb)((agzd)anss4).rr((agyr)ButtonRendererOuterClass.buttonRenderer), (wwv)null);
        ((acqt)g).c = (acqs)new ezi(this, 13);
        final acqu g2 = this.ao.g((TextView)this.as.findViewById(2131428512));
        this.am = g2;
        anss anss5;
        if ((anss5 = this.ak.g) == null) {
            anss5 = anss.a;
        }
        ((acqt)g2).b((aibb)((agzd)anss5).rr((agyr)ButtonRendererOuterClass.buttonRenderer), (wwv)null);
        this.am.d(false);
        ((acqt)this.am).c = (acqs)new ezi(this, 14);
        this.as.findViewById(2131427998).setVisibility(0);
        return this.as;
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        ((bi)this).nc(0, 0);
        final Bundle m = ((br)this).m;
        afcr aj;
        if (m != null && m.containsKey("SelectedVideoIds")) {
            aj = afcr.o((Collection)m.getStringArrayList("SelectedVideoIds"));
        }
        else {
            aj = afcr.q();
        }
        this.aj = (List)aj;
        CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint ai = null;
        Label_0123: {
            if (m != null && m.containsKey("CreatePlaylistDialogEndpoint")) {
                final byte[] byteArray = m.getByteArray("CreatePlaylistDialogEndpoint");
                if (byteArray != null) {
                    try {
                        ai = (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint)agzi.parseFrom((agzi)CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                        break Label_0123;
                    }
                    catch (final ahab ahab) {
                        trn.d("Unable to decode create playlist endpoint", (Throwable)ahab);
                    }
                }
                ai = CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a;
            }
            else {
                ai = CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a;
            }
        }
        this.ai = ai;
        anss a;
        if (ai.c == 9) {
            a = (anss)ai.d;
        }
        else {
            a = anss.a;
        }
        if (((agzd)a).rs((agyr)CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer)) {
            final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint ai2 = this.ai;
            anss a2;
            if (ai2.c == 9) {
                a2 = (anss)ai2.d;
            }
            else {
                a2 = anss.a;
            }
            this.ak = (aiyg)((agzd)a2).rr((agyr)CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer);
            return;
        }
        this.ak = aiyg.a;
    }
    
    public final Dialog pI(final Bundle bundle) {
        final Dialog pi = super.pI(bundle);
        pi.getWindow().setSoftInputMode(4);
        return pi;
    }
}
