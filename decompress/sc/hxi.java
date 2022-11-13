import android.text.TextUtils;
import android.os.Parcelable;
import android.view.View$OnClickListener;
import java.util.function.Consumer;
import j$.util.Optional;
import android.content.Context;
import com.google.protobuf.ExtensionRegistryLite;
import android.util.TypedValue;
import android.view.ViewStub;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Iterator;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.android.apps.youtube.app.fragments.PlaylistEditorFragment$EditorState;
import android.app.AlertDialog;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxi extends hxt implements tgg
{
    public zmf a;
    private PlaylistEditEndpointOuterClass$PlaylistEditEndpoint aA;
    private aiqj aB;
    private ImageView aC;
    private EditText aD;
    private EditText aE;
    private View aF;
    private TextView aG;
    private TextView aH;
    private gag aI;
    private float aJ;
    private float aK;
    private int aL;
    private uak aM;
    public vcy ae;
    public acwb af;
    public String ag;
    public anjx ah;
    public LoadingFrameLayout ai;
    public YouTubeTextView aj;
    hxh ak;
    public AlertDialog al;
    public vai am;
    public aadx an;
    public cya ao;
    public aln ap;
    public ziy aq;
    public aeea ar;
    public aeea as;
    public vuf b;
    public tqd c;
    public tgd d;
    public acgs e;
    
    private final PlaylistEditorFragment$EditorState aM() {
        return new PlaylistEditorFragment$EditorState((CharSequence)this.aD.getText(), (CharSequence)this.aE.getText(), this.aM.l());
    }
    
    private static boolean aN(final anjs anjs) {
        anuv a;
        if (anjs.b == 6) {
            a = (anuv)anjs.c;
        }
        else {
            a = anuv.a;
        }
        return a.ry((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
    }
    
    private static boolean aO(final anjs anjs) {
        anka a;
        if (anjs.b == 4) {
            a = (anka)anjs.c;
        }
        else {
            a = anka.a;
        }
        anjm anjm;
        if ((anjm = a.b) == null) {
            anjm = anjm.a;
        }
        ajke ajke;
        if ((ajke = anjm.b) == null) {
            ajke = ajke.a;
        }
        return (ajke.b & 0x1) != 0x0;
    }
    
    private final boolean aP() {
        final anjs b = hxw.b(this.ah);
        if (b != null) {
            anjz anjz;
            if ((anjz = b.e) == null) {
                anjz = anjz.a;
            }
            if ((anjz.b & 0x1) != 0x0) {
                anjz anjz2;
                if ((anjz2 = b.f) == null) {
                    anjz2 = anjz.a;
                }
                if ((anjz2.b & 0x1) != 0x0) {
                    if (aN(b)) {
                        return true;
                    }
                    if (aO(b)) {
                        try {
                            s(b);
                            return true;
                        }
                        catch (final IllegalStateException ex) {
                            ttr.b("Privacy status is not set in the PrivacyDropdown.");
                            return false;
                        }
                    }
                    ttr.b("Missing privacy option in the PlaylistSettingsEditorRenderer");
                    return false;
                }
            }
        }
        ttr.b("Missing name or description in the PlaylistSettingsEditorRenderer.");
        return false;
    }
    
    private static final void br(final EditText editText, final int n) {
        if (n <= 0) {
            return;
        }
        editText.setFilters(new InputFilter[] { (InputFilter)new InputFilter$LengthFilter(n) });
    }
    
    public static int s(final anjs anjs) {
        anka a;
        if (anjs.b == 4) {
            a = (anka)anjs.c;
        }
        else {
            a = anka.a;
        }
        anjm anjm;
        if ((anjm = a.b) == null) {
            anjm = anjm.a;
        }
        ajke ajke;
        if ((ajke = anjm.b) == null) {
            ajke = ajke.a;
        }
        ajkd ajkd;
        if ((ajkd = ajke.c) == null) {
            ajkd = ajkd.a;
        }
        for (final ajka ajka : ajkd.c) {
            ajkc ajkc;
            if ((ajkc = ajka.c) == null) {
                ajkc = ajkc.a;
            }
            if (ajkc.h) {
                ajkc ajkc2;
                if ((ajkc2 = ajka.c) == null) {
                    ajkc2 = ajkc.a;
                }
                int intValue;
                if (ajkc2.c == 6) {
                    intValue = (int)ajkc2.d;
                }
                else {
                    intValue = 0;
                }
                final int cu = aqsx.cu(intValue);
                if (cu != 0) {
                    return cu;
                }
                throw new IllegalStateException("Unknown privacy status");
            }
        }
        throw new IllegalStateException();
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final LoadingFrameLayout ai = (LoadingFrameLayout)layoutInflater.inflate(2131625040, viewGroup, false);
        this.ai = ai;
        this.aC = (ImageView)ai.findViewById(2131432009);
        this.aD = (EditText)this.ai.findViewById(2131432104);
        this.aE = (EditText)this.ai.findViewById(2131428626);
        this.aj = (YouTubeTextView)this.ai.findViewById(2131430611);
        this.aM = this.ap.T((PrivacySpinner)this.ai.findViewById(2131430609));
        final cya ao = this.ao;
        final Context nt = ((br)this).nT();
        nt.getClass();
        this.aI = ao.D(nt, (ViewStub)this.ai.findViewById(2131430606));
        this.ak = new hxh(this);
        this.aF = this.ai.findViewById(2131428242);
        this.aG = (TextView)this.ai.findViewById(2131428244);
        this.aH = (TextView)this.ai.findViewById(2131428243);
        this.aJ = this.ai.getAlpha();
        final TypedValue typedValue = new TypedValue();
        this.ai.getContext().getTheme().resolveAttribute(16842803, typedValue, true);
        this.aK = typedValue.getFloat();
        this.aL = tpe.cr(this.ai.getContext(), 2130970922);
        Label_0450: {
            if (bundle != null) {
                this.ag = bundle.getString("playlist_id", "");
                this.aB = vdb.b(bundle.getByteArray("navigation_endpoint"));
                try {
                    final byte[] byteArray = bundle.getByteArray("playlist_settings_editor");
                    anjx ah;
                    if (byteArray != null) {
                        ah = (anjx)ahbh.parseFrom((ahbh)anjx.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                    }
                    else {
                        ah = null;
                    }
                    this.ah = ah;
                }
                catch (final ahca ahca) {
                    this.ah = null;
                }
                final PlaylistEditorFragment$EditorState playlistEditorFragment$EditorState = (PlaylistEditorFragment$EditorState)bundle.getParcelable("editor_state");
                final anjx ah2 = this.ah;
                if (ah2 != null) {
                    this.p(ah2, playlistEditorFragment$EditorState);
                    this.ai.a();
                    break Label_0450;
                }
            }
            final Bundle m = ((br)this).m;
            if (m != null) {
                this.ag = m.getString("playlist_id", "");
                this.aB = vdb.b(m.getByteArray("navigation_endpoint"));
                final hxg hxg = new hxg(this);
                this.ai.f((acxp)new hxf(this, hxg, 0));
                this.o((zpf)hxg);
            }
        }
        ((ggq)this).pF().b(xaa.b(20445), this.aB, (alhi)null);
        return (View)this.ai;
    }
    
    public final void Y() {
        super.Y();
        Optional.ofNullable((Object)((br)this).O).ifPresent((Consumer)hvn.j);
    }
    
    public final void aa() {
        super.aa();
        if (!this.a.t()) {
            this.ax.c(false);
        }
    }
    
    public final void bg() {
        final PlaylistEditorFragment$EditorState am = this.aM();
        final hxg hxg = new hxg(this);
        hxg.a = am;
        this.o((zpf)hxg);
    }
    
    public final gae mG() {
        if (this.au == null) {
            final gad b = this.aw.b();
            b.n((aezf)new hxb(this, 2));
            this.au = b.a();
        }
        return this.au;
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zmu zmu = (zmu)o;
            this.ax.c(false);
            array = null;
        }
        else {
            array = new Class[] { zmu.class };
        }
        return array;
    }
    
    public final void no() {
        super.no();
        if (!this.a.t()) {
            this.ax.c(false);
            return;
        }
        this.d.g((Object)this);
    }
    
    public final void np() {
        super.np();
        this.d.m((Object)this);
    }
    
    public final void o(final zpf zpf) {
        this.ai.c();
        final vuc e = this.b.e();
        e.w(this.ag);
        ((vkk)e).k(vap.b);
        this.b.h((vls)e, zpf);
    }
    
    public final void p(final anjx anjx, final PlaylistEditorFragment$EditorState playlistEditorFragment$EditorState) {
        if (anjx == null) {
            return;
        }
        final anjs b = hxw.b(anjx);
        if (this.aP()) {
            if (b != null) {
                if (playlistEditorFragment$EditorState != null) {
                    this.aD.setText(playlistEditorFragment$EditorState.a);
                    this.aE.setText(playlistEditorFragment$EditorState.b);
                }
                else {
                    final EditText ad = this.aD;
                    anjz anjz;
                    if ((anjz = b.e) == null) {
                        anjz = anjz.a;
                    }
                    ajuh ajuh;
                    if ((ajuh = anjz.c) == null) {
                        ajuh = ajuh.a;
                    }
                    ad.setText((CharSequence)ajuh.d);
                    final EditText ae = this.aE;
                    anjz anjz2;
                    if ((anjz2 = b.f) == null) {
                        anjz2 = anjz.a;
                    }
                    ajuh ajuh2;
                    if ((ajuh2 = anjz2.c) == null) {
                        ajuh2 = ajuh.a;
                    }
                    ae.setText((CharSequence)ajuh2.d);
                }
                final EditText ad2 = this.aD;
                anjz anjz3;
                if ((anjz3 = b.e) == null) {
                    anjz3 = anjz.a;
                }
                ajuh ajuh3;
                if ((ajuh3 = anjz3.c) == null) {
                    ajuh3 = ajuh.a;
                }
                br(ad2, ajuh3.e);
                final EditText ae2 = this.aE;
                anjz anjz4;
                if ((anjz4 = b.f) == null) {
                    anjz4 = anjz.a;
                }
                ajuh ajuh4;
                if ((ajuh4 = anjz4.c) == null) {
                    ajuh4 = ajuh.a;
                }
                br(ae2, ajuh4.e);
                final acgs e = this.e;
                final ImageView ac = this.aC;
                ankk ankk;
                if ((ankk = b.d) == null) {
                    ankk = ankk.a;
                }
                final int b2 = ankk.b;
                final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = null;
                aotp aotp;
                if ((b2 & 0x2) != 0x0) {
                    ankk ankk2;
                    if ((ankk2 = b.d) == null) {
                        ankk2 = ankk.a;
                    }
                    ankj ankj;
                    if ((ankj = ankk2.d) == null) {
                        ankj = ankj.a;
                    }
                    if ((aotp = ankj.b) == null) {
                        aotp = aotp.a;
                    }
                }
                else {
                    final ankk d = b.d;
                    ankk a;
                    if (d == null) {
                        a = ankk.a;
                    }
                    else {
                        a = d;
                    }
                    if ((a.b & 0x1) != 0x0) {
                        ankk a2;
                        if ((a2 = d) == null) {
                            a2 = ankk.a;
                        }
                        ankl ankl;
                        if ((ankl = a2.c) == null) {
                            ankl = ankl.a;
                        }
                        if ((aotp = ankl.c) == null) {
                            aotp = aotp.a;
                        }
                    }
                    else {
                        aotp = null;
                    }
                }
                e.g(ac, aotp);
                if (aO(b)) {
                    final uak am = this.aM;
                    anka a3;
                    if (b.b == 4) {
                        a3 = (anka)b.c;
                    }
                    else {
                        a3 = anka.a;
                    }
                    anjm anjm;
                    if ((anjm = a3.b) == null) {
                        anjm = anjm.a;
                    }
                    ajke ajke;
                    if ((ajke = anjm.b) == null) {
                        ajke = ajke.a;
                    }
                    ajkd ajkd;
                    if ((ajkd = ajke.c) == null) {
                        ajkd = ajkd.a;
                    }
                    am.k(ajkd);
                    if (playlistEditorFragment$EditorState != null) {
                        this.aM.m(playlistEditorFragment$EditorState.c);
                    }
                    else {
                        this.aM.m(s(b));
                    }
                    this.aI.a();
                    this.ai.findViewById(2131429546).setVisibility(0);
                }
                else if (aN(b)) {
                    final gag ai = this.aI;
                    anuv a4;
                    if (b.b == 6) {
                        a4 = (anuv)b.c;
                    }
                    else {
                        a4 = anuv.a;
                    }
                    ai.f((amhp)a4.rx((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
                    this.aj.setVisibility(8);
                    this.ai.findViewById(2131430609).setVisibility(8);
                    this.ai.findViewById(2131429546).setVisibility(8);
                }
                final anjt c = hxw.c(anjx);
                if (c != null) {
                    final TextView ag = this.aG;
                    ajut ajut;
                    if ((c.b & 0x1) != 0x0) {
                        if ((ajut = c.c) == null) {
                            ajut = ajut.a;
                        }
                    }
                    else {
                        ajut = null;
                    }
                    ag.setText((CharSequence)acak.b(ajut));
                    this.aF.setVisibility(0);
                    if (c.m) {
                        this.aG.setTextColor(this.aL);
                        this.aH.setTextColor(this.aL);
                    }
                    this.aF.setOnClickListener((View$OnClickListener)new hqd(this, c, 10));
                    this.aM.e = new ov(this, 3);
                    this.q();
                }
                else {
                    this.aF.setVisibility(8);
                }
                if ((anjx.b & 0x2) != 0x0) {
                    aiqj aiqj;
                    if ((aiqj = anjx.c) == null) {
                        aiqj = aiqj.a;
                    }
                    PlaylistEditEndpointOuterClass$PlaylistEditEndpoint aa = playlistEditEndpointOuterClass$PlaylistEditEndpoint;
                    if (((ahbc)aiqj).ry((ahaq)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint)) {
                        aiqj aiqj2;
                        if ((aiqj2 = anjx.c) == null) {
                            aiqj2 = aiqj.a;
                        }
                        aa = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint)((ahbc)aiqj2).rx((ahaq)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
                    }
                    this.aA = aa;
                }
            }
        }
    }
    
    public final void pP(final Bundle bundle) {
        bundle.putString("playlist_id", this.ag);
        bundle.putByteArray("navigation_endpoint", ((agzk)this.aB).toByteArray());
        final anjx ah = this.ah;
        if (ah != null) {
            bundle.putByteArray("playlist_settings_editor", ((agzk)ah).toByteArray());
            bundle.putParcelable("editor_state", (Parcelable)this.aM());
        }
    }
    
    public final void q() {
        final int l = this.aM.l();
        boolean enabled = true;
        if (l == 1) {
            enabled = false;
        }
        this.aF.setEnabled(enabled);
        final View af = this.aF;
        float alpha;
        if (enabled) {
            alpha = this.aJ;
        }
        else {
            alpha = this.aK;
        }
        af.setAlpha(alpha);
    }
    
    public final void r(final zpf zpf) {
        final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint aa = this.aA;
        if (aa == null) {
            return;
        }
        if (!this.aP()) {
            return;
        }
        final vuh k = this.an.k();
        k.a = aa.c;
        ((vkk)k).i();
        final PlaylistEditorFragment$EditorState am = this.aM();
        final String trim = tvb.d(am.a).toString().trim();
        if (TextUtils.isEmpty((CharSequence)trim)) {
            tpe.x((Context)this.at, 2132017976, 0);
            return;
        }
        final anjs b = hxw.b(this.ah);
        if (b != null) {
            anjz anjz;
            if ((anjz = b.e) == null) {
                anjz = anjz.a;
            }
            ajuh ajuh;
            if ((ajuh = anjz.c) == null) {
                ajuh = ajuh.a;
            }
            if (!TextUtils.equals((CharSequence)trim, (CharSequence)ajuh.d)) {
                final ahaz builder = ania.a.createBuilder();
                builder.copyOnWrite();
                final ania ania = (ania)builder.instance;
                ania.c = 6;
                ania.b |= 0x1;
                builder.copyOnWrite();
                final ania ania2 = (ania)builder.instance;
                trim.getClass();
                ania2.b |= 0x100;
                ania2.h = trim;
                k.b.add(builder.build());
            }
            final String trim2 = tvb.d(am.b).toString().trim();
            anjz anjz2;
            if ((anjz2 = b.f) == null) {
                anjz2 = anjz.a;
            }
            ajuh ajuh2;
            if ((ajuh2 = anjz2.c) == null) {
                ajuh2 = ajuh.a;
            }
            if (!TextUtils.equals((CharSequence)trim2, (CharSequence)ajuh2.d)) {
                final ahaz builder2 = ania.a.createBuilder();
                builder2.copyOnWrite();
                final ania ania3 = (ania)builder2.instance;
                ania3.c = 7;
                ania3.b |= 0x1;
                builder2.copyOnWrite();
                final ania ania4 = (ania)builder2.instance;
                trim2.getClass();
                ania4.b |= 0x200;
                ania4.i = trim2;
                k.b.add(builder2.build());
            }
            if (aO(b)) {
                final int c = am.c;
                if (c != s(b)) {
                    final ahaz builder3 = ania.a.createBuilder();
                    builder3.copyOnWrite();
                    final ania ania5 = (ania)builder3.instance;
                    ania5.c = 9;
                    ania5.b |= 0x1;
                    builder3.copyOnWrite();
                    final ania ania6 = (ania)builder3.instance;
                    if (c == 0) {
                        throw null;
                    }
                    ania6.j = c - 1;
                    ania6.b |= 0x800;
                    k.b.add(builder3.build());
                }
            }
        }
        if (!k.b.isEmpty()) {
            this.an.l((vls)k, zpf);
            return;
        }
        zpf.mX((Object)akxs.a);
    }
}
