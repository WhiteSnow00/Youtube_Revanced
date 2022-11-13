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

public final class jfn extends jfo
{
    public vcy ae;
    public vuf af;
    public tqd ag;
    public tgd ah;
    public CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint ai;
    public List aj;
    public ajal ak;
    public EditText al;
    public acsy am;
    public vai an;
    public cya ao;
    public aln ap;
    public ziy aq;
    public uak ar;
    private View as;
    
    public static boolean aK(final ajal ajal) {
        anuv anuv;
        if ((anuv = ajal.d) == null) {
            anuv = anuv.a;
        }
        return anuv.ry((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        this.as = layoutInflater.inflate(2131624298, viewGroup, false);
        if (this.an.aU()) {
            this.as.setBackgroundColor(tpe.cr(((br)this).nT(), 2130970893));
        }
        final TextView textView = (TextView)this.as.findViewById(2131428669);
        ajut ajut;
        if ((ajut = this.ak.b) == null) {
            ajut = ajut.a;
        }
        tpe.t(textView, (CharSequence)acak.b(ajut));
        final TextInputLayout textInputLayout = (TextInputLayout)this.as.findViewById(2131430017);
        textInputLayout.u(false);
        (this.al = (EditText)this.as.findViewById(2131430009)).setHint((CharSequence)this.ak.c);
        this.al.addTextChangedListener((TextWatcher)new hdw(this, textInputLayout, 2));
        final PrivacySpinner privacySpinner = (PrivacySpinner)this.as.findViewById(2131430614);
        this.ar = this.ap.T(privacySpinner);
        final gag d = this.ao.D(((br)this).nT(), (ViewStub)this.as.findViewById(2131430606));
        if (aK(this.ak)) {
            anuv anuv;
            if ((anuv = this.ak.d) == null) {
                anuv = anuv.a;
            }
            d.f((amhp)anuv.rx((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
            this.as.findViewById(2131430608).setVisibility(8);
        }
        else {
            anuv anuv2;
            if ((anuv2 = this.ak.d) == null) {
                anuv2 = anuv.a;
            }
            if (anuv2.ry((ahaq)DropdownRendererOuterClass.dropdownRenderer)) {
                final uak ar = this.ar;
                anuv anuv3;
                if ((anuv3 = this.ak.d) == null) {
                    anuv3 = anuv.a;
                }
                ar.k((ajkd)anuv3.rx((ahaq)DropdownRendererOuterClass.dropdownRenderer));
                this.ar.e = new ov(this, 5);
            }
            else {
                this.ar.k((ajkd)null);
                this.ar.m(1);
            }
            privacySpinner.c = ((bi)this).d;
            this.as.findViewById(2131430608).setVisibility(0);
            d.f((amhp)null);
        }
        final acsy ap = this.aq.ap((TextView)this.as.findViewById(2131427999));
        anuv anuv4;
        if ((anuv4 = this.ak.f) == null) {
            anuv4 = anuv.a;
        }
        ((acsx)ap).b((aicz)anuv4.rx((ahaq)ButtonRendererOuterClass.buttonRenderer), (wyw)null);
        ((acsx)ap).c = (acsw)new ezm(this, 13);
        final acsy ap2 = this.aq.ap((TextView)this.as.findViewById(2131428512));
        this.am = ap2;
        anuv anuv5;
        if ((anuv5 = this.ak.g) == null) {
            anuv5 = anuv.a;
        }
        ((acsx)ap2).b((aicz)anuv5.rx((ahaq)ButtonRendererOuterClass.buttonRenderer), (wyw)null);
        this.am.d(false);
        ((acsx)this.am).c = (acsw)new ezm(this, 14);
        this.as.findViewById(2131427998).setVisibility(0);
        return this.as;
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        ((bi)this).nc(0, 0);
        final Bundle m = ((br)this).m;
        afeq aj;
        if (m != null && m.containsKey("SelectedVideoIds")) {
            aj = afeq.o((Collection)m.getStringArrayList("SelectedVideoIds"));
        }
        else {
            aj = afeq.q();
        }
        this.aj = (List)aj;
        CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint ai = null;
        Label_0123: {
            if (m != null && m.containsKey("CreatePlaylistDialogEndpoint")) {
                final byte[] byteArray = m.getByteArray("CreatePlaylistDialogEndpoint");
                if (byteArray != null) {
                    try {
                        ai = (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint)ahbh.parseFrom((ahbh)CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                        break Label_0123;
                    }
                    catch (final ahca ahca) {
                        ttr.d("Unable to decode create playlist endpoint", (Throwable)ahca);
                    }
                }
                ai = CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a;
            }
            else {
                ai = CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.a;
            }
        }
        this.ai = ai;
        anuv a;
        if (ai.c == 9) {
            a = (anuv)ai.d;
        }
        else {
            a = anuv.a;
        }
        if (a.ry((ahaq)CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer)) {
            final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint ai2 = this.ai;
            anuv a2;
            if (ai2.c == 9) {
                a2 = (anuv)ai2.d;
            }
            else {
                a2 = anuv.a;
            }
            this.ak = (ajal)a2.rx((ahaq)CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer);
            return;
        }
        this.ak = ajal.a;
    }
    
    public final Dialog pN(final Bundle bundle) {
        final Dialog pn = super.pN(bundle);
        pn.getWindow().setSoftInputMode(4);
        return pn;
    }
}
