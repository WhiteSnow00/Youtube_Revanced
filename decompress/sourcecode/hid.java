import java.util.Map;
import android.content.res.Resources;
import android.os.Parcelable;
import java.util.Collections;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import android.graphics.drawable.Drawable;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.widget.FrameLayout$LayoutParams;
import java.util.Iterator;
import android.content.ContentResolver;
import j$.util.Optional;
import android.view.View$OnTouchListener;
import android.widget.ImageView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.video.trim.VideoTrimView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;
import java.util.Collection;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.FileOutputStream;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.CreationReelPickerRendererOuterClass;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import com.google.protos.youtube.api.innertube.ReelPickerButtonRendererOuterClass;
import android.widget.ImageButton;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelCreationTrayRendererOuterClass;
import android.widget.LinearLayout;
import android.view.View$OnClickListener;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import java.util.Arrays;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import com.google.protobuf.ExtensionRegistryLite;
import android.provider.MediaStore$Images$Media;
import java.io.IOException;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.libraries.video.media.VideoMetaData;
import java.io.File;
import android.net.Uri;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import android.view.View;
import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel;
import android.graphics.Bitmap;
import android.view.ContextThemeWrapper;
import android.animation.AnimatorSet;
import com.google.android.libraries.youtube.edit.preview.EditableVideoControllerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hid extends hgu implements ufj, him, hii, hhw, hiv, hir, hhq, hho, hio, hhz, hjc, wwu, hgk, hib, uel
{
    public boolean a;
    private EditableVideoControllerView aZ;
    public wwv ae;
    public hie af;
    public hin ag;
    public hil ah;
    public hhy ai;
    public hiy aj;
    public hhr ak;
    public hhp al;
    public hip am;
    public hia an;
    public hje ao;
    public uen ap;
    public atjj aq;
    public atjj ar;
    public atjj as;
    public atjj at;
    public atjj au;
    public uyf av;
    public uyi aw;
    public avt ax;
    public final qpt ay;
    public AnimatorSet b;
    private ContextThemeWrapper ba;
    private aioe bb;
    private aioe bc;
    private anqe bd;
    private boolean be;
    private boolean bf;
    private boolean bg;
    private Bitmap bh;
    private aqxf bi;
    public boolean c;
    public ReelEditModel d;
    public adfy e;
    
    public hid() {
        this.ay = new qpt(this);
    }
    
    private final void bM() {
        final hil ah = this.ah;
        int n;
        if (!this.bo()) {
            n = 2131233044;
        }
        else {
            n = 2131233041;
        }
        hil.f(ah.g, n);
        if (!this.c) {
            final Context nt = ((br)this).nT();
            final View g = this.ah.g;
            if (nt != null && g != null) {
                CharSequence contentDescription;
                if (this.bo()) {
                    contentDescription = nt.getResources().getText(2132019410);
                }
                else {
                    contentDescription = nt.getResources().getText(2132019402);
                }
                g.setContentDescription(contentDescription);
            }
        }
    }
    
    private static final Uri bN(final RecordingInfo recordingInfo) {
        if (recordingInfo == null) {
            return null;
        }
        if (recordingInfo.c.startsWith("content:")) {
            return Uri.parse(recordingInfo.c);
        }
        return Uri.parse(new File(recordingInfo.c).toURI().toString());
    }
    
    static final VideoMetaData bs(final Context context, final Uri a, final RecordingInfo recordingInfo) {
        if (!recordingInfo.f) {
            return qzk.a(context, a);
        }
        final qzq qzq = new qzq();
        qzq.b = true;
        qzq.a = a;
        qzq.c = 0;
        qzq.d = recordingInfo.a;
        qzq.e = recordingInfo.b;
        qzq.f = 0;
        qzq.h = recordingInfo.d * 1000L;
        qzq.b(new long[] { 0L });
        qzq.j = null;
        qzq.k = false;
        return qzq.a();
    }
    
    public final View K(LayoutInflater o, ViewGroup viewGroup, Bundle onTouchListener) {
        ((uqx)this).bC(this.ae);
        final bu od = ((br)this).od();
        int n;
        if (!this.aw.aT()) {
            n = 2132083490;
        }
        else {
            n = 2132083492;
        }
        this.ba = new ContextThemeWrapper((Context)od, n);
        final Bundle m = ((br)this).m;
        Object k = m.getParcelable("RECORDING_INFO");
        final Uri bn = bN((RecordingInfo)k);
        Label_0176: {
            if (!((RecordingInfo)k).f) {
                final bu od2 = ((br)this).od();
                final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                final ContentResolver contentResolver = ((Context)od2).getContentResolver();
                try {
                    tmy.bW(bn, mediaMetadataRetriever, contentResolver);
                    this.bh = tmy.bX(1L, 2, mediaMetadataRetriever);
                    tmy.bY(mediaMetadataRetriever);
                    break Label_0176;
                }
                catch (final SecurityException bn) {}
                catch (final IOException ex) {}
                trn.d("Error getting video thumbnail.", (Throwable)bn);
            }
            else {
                try {
                    this.bh = MediaStore$Images$Media.getBitmap(((br)this).nT().getContentResolver(), bn);
                }
                catch (final IOException ex2) {}
            }
        }
        final byte[] byteArray = m.getByteArray("NAVIGATION_ENDPOINT");
        if (byteArray != null) {
            try {
                this.bb = (aioe)agzi.parseFrom((agzi)aioe.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahab ahab) {
                trn.d("Error parsing navigation endpoint.", (Throwable)ahab);
            }
        }
        final byte[] byteArray2 = m.getByteArray("REEL_EDIT_VIDEO_ENDPOINT_KEY");
        if (byteArray2 != null) {
            try {
                this.bc = (aioe)agzi.parseFrom((agzi)aioe.a, byteArray2, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahab ahab2) {
                trn.d("Error parsing navigation endpoint.", (Throwable)ahab2);
            }
        }
        final byte[] byteArray3 = m.getByteArray("VIDEO_EDIT_RENDERER");
        if (byteArray3 != null) {
            try {
                this.bd = (anqe)agzi.parseFrom((agzi)anqe.a, byteArray3, ExtensionRegistryLite.getGeneratedRegistry());
            }
            catch (final ahab ahab3) {
                trn.d("Error parsing renderer.", (Throwable)ahab3);
            }
        }
        if (m.getByteArray("comment_sticker") != null) {
            try {
                this.bi = aqxf.m(m.getByteArray("comment_sticker"), ExtensionRegistryLite.getGeneratedRegistry());
                m.remove("comment_sticker");
            }
            catch (final ahab ahab4) {
                trn.d("Error parsing comment sticker.", (Throwable)ahab4);
            }
        }
        try {
            final aexq j = aexq.j(onTouchListener);
            final File file = new File(((br)this).nT().getCacheDir(), "reel_effects");
            if (!file.exists()) {
                file.mkdirs();
            }
            else {
                final File[] listFiles = file.listFiles();
                for (int length = listFiles.length, i = 0; i < length; ++i) {
                    listFiles[i].delete();
                }
            }
            ReelEditModel d;
            if (j.h()) {
                d = (ReelEditModel)((Bundle)j.c()).getParcelable("REEL_MODEL");
            }
            else {
                final VideoMetaData bs = bs(((br)this).nT(), bN((RecordingInfo)k), (RecordingInfo)k);
                alvl alvl;
                if ((alvl = this.av.b().e) == null) {
                    alvl = alvl.a;
                }
                final boolean ba = alvl.bA;
                if (((RecordingInfo)k).g && !((RecordingInfo)k).f && ba) {
                    final long am = ((uqx)this).aM;
                    final long h = bs.h;
                    final ArrayList list = new ArrayList();
                    if (h > am && am != 0L) {
                        final long micros = TimeUnit.SECONDS.toMicros(1L);
                        int n2 = 0;
                        while (true) {
                            final long n3 = n2;
                            if (n3 >= 4L || n3 * am + micros > h) {
                                break;
                            }
                            list.add(this.aP((RecordingInfo)k, bs, n2));
                            ++n2;
                        }
                    }
                    else {
                        list.add(this.aP((RecordingInfo)k, bs, 0));
                    }
                    final zvm g = ReelEditModel.g();
                    g.m((List)list);
                    d = g.k();
                }
                else {
                    final zvm g2 = ReelEditModel.g();
                    g2.m((List)Arrays.asList(this.aP((RecordingInfo)k, bs, 0)));
                    d = g2.k();
                }
            }
            this.d = d;
        }
        catch (final IOException ex3) {
            ((uqx)this).by(ex3);
        }
        if (k != null && ((RecordingInfo)k).f) {
            ((uqx)this).aK = false;
        }
        else {
            ((uqx)this).aK = true;
        }
        final View inflate = o.inflate(2131625200, viewGroup, false);
        o = (LayoutInflater)this.ag;
        ((hin)o).b = (him)this;
        (((hin)o).e = (VideoWithPreviewView)inflate.findViewById(2131432347)).setOnClickListener((View$OnClickListener)o);
        ((hin)o).e.b = (hin)o;
        ((hin)o).c = inflate.findViewById(2131432322);
        ((hin)o).d = inflate.findViewById(2131428806);
        onTouchListener = (Bundle)this.ah;
        final hij hij = new hij();
        hij.b(true);
        Label_4993: {
            if (inflate == null) {
                break Label_4993;
            }
            hij.a = inflate;
            o = (LayoutInflater)((br)this).nZ();
            Label_4982: {
                if (o == null) {
                    break Label_4982;
                }
                hij.b = (Resources)o;
                hij.c = (hii)this;
                Label_4971: {
                    if (k == null) {
                        break Label_4971;
                    }
                    hij.d = (RecordingInfo)k;
                    hij.e = this.be;
                    hij.i |= 0x1;
                    hij.b(this.d.c().size() == 1);
                    viewGroup = (ViewGroup)this.av.b().e;
                    Object a;
                    if ((a = viewGroup) == null) {
                        a = alvl.a;
                    }
                    hij.f = ((alvl)a).bA;
                    hij.i |= 0x4;
                    o = (LayoutInflater)this.ae;
                    Label_4960: {
                        if (o == null) {
                            break Label_4960;
                        }
                        hij.g = (wwv)o;
                        o = (LayoutInflater)((br)this).od();
                        Label_4949: {
                            if (o == null) {
                                break Label_4949;
                            }
                            hij.h = (bu)o;
                            final hik a2 = hij.a();
                            ((hil)onTouchListener).p = a2.c;
                            ((hil)onTouchListener).q = a2.d;
                            ((hil)onTouchListener).c = a2.h;
                            ((hil)onTouchListener).b = a2.i;
                            apju apju;
                            if ((apju = ((arud)((hil)onTouchListener).x.a).f().s) == null) {
                                apju = apju.a;
                            }
                            ((hil)onTouchListener).u = apju.m;
                            if (((hil)onTouchListener).x.F()) {
                                ((hil)onTouchListener).d = a2.a.findViewById(2131430891);
                                ((hil)onTouchListener).e = ((hil)onTouchListener).d.findViewById(2131431061);
                                ((hil)onTouchListener).f = ((hil)onTouchListener).d.findViewById(2131431066);
                                ((hil)onTouchListener).g = ((hil)onTouchListener).d.findViewById(2131431060);
                                ((hil)onTouchListener).i = ((hil)onTouchListener).d.findViewById(2131431058);
                                ((hil)onTouchListener).j = ((hil)onTouchListener).d.findViewById(2131431062);
                                ((hil)onTouchListener).l = (ViewGroup)((hil)onTouchListener).d.findViewById(2131431064);
                                ((hil)onTouchListener).m = ((hil)onTouchListener).d.findViewById(2131431063);
                                ((hil)onTouchListener).n = ((hil)onTouchListener).d.findViewById(2131431065);
                                ((hil)onTouchListener).h = (LinearLayout)((hil)onTouchListener).d.findViewById(2131431067);
                                if (((hil)onTouchListener).u) {
                                    ((hil)onTouchListener).k = ((hil)onTouchListener).d.findViewById(2131431059);
                                }
                                if (a2.a.findViewById(2131430892) != null) {
                                    a2.a.findViewById(2131430892).setVisibility(8);
                                }
                                ((hil)onTouchListener).t = true;
                            }
                            else {
                                ((hil)onTouchListener).d = a2.a.findViewById(2131430892);
                                ((hil)onTouchListener).e = ((hil)onTouchListener).d.findViewById(2131430875);
                                ((hil)onTouchListener).f = ((hil)onTouchListener).d.findViewById(2131430893);
                                ((hil)onTouchListener).g = ((hil)onTouchListener).d.findViewById(2131430872);
                                ((hil)onTouchListener).i = ((hil)onTouchListener).d.findViewById(2131430804);
                                ((hil)onTouchListener).j = ((hil)onTouchListener).d.findViewById(2131430878);
                                ((hil)onTouchListener).l = (ViewGroup)((hil)onTouchListener).d.findViewById(2131430888);
                                ((hil)onTouchListener).m = ((hil)onTouchListener).d.findViewById(2131430887);
                                ((hil)onTouchListener).n = ((hil)onTouchListener).d.findViewById(2131430889);
                                ((hil)onTouchListener).h = (LinearLayout)((hil)onTouchListener).d.findViewById(2131431052);
                                if (a2.a.findViewById(2131430891) != null) {
                                    a2.a.findViewById(2131430891).setVisibility(8);
                                }
                                ((hil)onTouchListener).s = a2.b.getDimension(2131168936);
                                ((hil)onTouchListener).t = false;
                            }
                            ((hil)onTouchListener).e.setOnClickListener((View$OnClickListener)onTouchListener);
                            ((hil)onTouchListener).f.setOnClickListener((View$OnClickListener)onTouchListener);
                            ((hil)onTouchListener).g.setOnClickListener((View$OnClickListener)onTouchListener);
                            if (a2.e) {
                                ((hil)onTouchListener).i.setVisibility(0);
                            }
                            else {
                                ((hil)onTouchListener).i.setVisibility(8);
                            }
                            ((hil)onTouchListener).j.setOnClickListener((View$OnClickListener)onTouchListener);
                            if (((hil)onTouchListener).u) {
                                final View l = ((hil)onTouchListener).k;
                                if (l != null) {
                                    l.setVisibility(0);
                                    ((hil)onTouchListener).k.setOnClickListener((View$OnClickListener)onTouchListener);
                                }
                            }
                            Label_1656: {
                                if (a2.f) {
                                    final RecordingInfo q = ((hil)onTouchListener).q;
                                    if (q == null || !q.f) {
                                        break Label_1656;
                                    }
                                }
                                ((hil)onTouchListener).f.setVisibility(8);
                                ((hil)onTouchListener).g.setVisibility(8);
                            }
                            if (a2.g) {
                                ((hil)onTouchListener).l.setVisibility(0);
                                ((hil)onTouchListener).m.setOnClickListener((View$OnClickListener)onTouchListener);
                                ((hil)onTouchListener).o = (aexq)aewp.a;
                            }
                            else {
                                ((hil)onTouchListener).l.setVisibility(8);
                            }
                            ((hil)onTouchListener).d.setVisibility(0);
                            final hil ah = this.ah;
                            final anqe bd = this.bd;
                            if (bd != null) {
                                anss anss;
                                if ((anss = bd.d) == null) {
                                    anss = anss.a;
                                }
                                if (((agzd)anss).rs((agyr)ReelCreationTrayRendererOuterClass.reelCreationTrayRenderer)) {
                                    final hmb v = ah.v;
                                    final LinearLayout h2 = ah.h;
                                    anss anss2;
                                    if ((anss2 = bd.d) == null) {
                                        anss2 = anss.a;
                                    }
                                    final anqc anqc = (anqc)((agzd)anss2).rr((agyr)ReelCreationTrayRendererOuterClass.reelCreationTrayRenderer);
                                    final wwv n4 = ((wwu)v.b).n();
                                    n4.l((wxz)new wws(anqc.c.I()));
                                    for (final anss anss3 : anqc.b) {
                                        if (((agzd)anss3).rs((agyr)ButtonRendererOuterClass.buttonRenderer)) {
                                            final aibb aibb = (aibb)((agzd)anss3).rr((agyr)ButtonRendererOuterClass.buttonRenderer);
                                            Object o2;
                                            if (((avt)v.f).F()) {
                                                final CreationButtonView creationButtonView = new CreationButtonView((Context)v.c);
                                                if ((aibb.b & 0x20) != 0x0) {
                                                    final Object a3 = v.a;
                                                    akbf akbf;
                                                    if ((akbf = aibb.g) == null) {
                                                        akbf = akbf.a;
                                                    }
                                                    akbe akbe;
                                                    if ((akbe = akbe.b(akbf.c)) == null) {
                                                        akbe = akbe.a;
                                                    }
                                                    creationButtonView.b(((acng)a3).a(akbe));
                                                }
                                                o2 = creationButtonView;
                                                if ((aibb.b & 0x80000) != 0x0) {
                                                    ahgm ahgm;
                                                    if ((ahgm = aibb.s) == null) {
                                                        ahgm = ahgm.a;
                                                    }
                                                    creationButtonView.e(ahgm.c);
                                                    o2 = creationButtonView;
                                                }
                                            }
                                            else {
                                                final ImageButton imageButton = (ImageButton)((LayoutInflater)((Context)v.c).getSystemService("layout_inflater")).inflate(2131625194, (ViewGroup)h2, false);
                                                if ((aibb.b & 0x20) != 0x0) {
                                                    final Object a4 = v.a;
                                                    akbf akbf2;
                                                    if ((akbf2 = aibb.g) == null) {
                                                        akbf2 = akbf.a;
                                                    }
                                                    akbe akbe2;
                                                    if ((akbe2 = akbe.b(akbf2.c)) == null) {
                                                        akbe2 = akbe.a;
                                                    }
                                                    imageButton.setImageResource(((acng)a4).a(akbe2));
                                                }
                                                o2 = imageButton;
                                                if ((aibb.b & 0x80000) != 0x0) {
                                                    ahgm ahgm2;
                                                    if ((ahgm2 = aibb.s) == null) {
                                                        ahgm2 = ahgm.a;
                                                    }
                                                    imageButton.setContentDescription((CharSequence)ahgm2.c);
                                                    o2 = imageButton;
                                                }
                                            }
                                            ((Map<aibb, View>)v.e).put(aibb, (View)o2);
                                            ((View)o2).setOnClickListener((View$OnClickListener)new gbp(v, aibb, n4, 8, null));
                                            ((ViewGroup)h2).addView((View)o2);
                                        }
                                    }
                                }
                            }
                            ah.r = true;
                            final int size = this.d.c().size();
                            final anqe bd2 = this.bd;
                            Label_2270: {
                                if (bd2 != null) {
                                    anss anss4;
                                    if ((anss4 = bd2.e) == null) {
                                        anss4 = anss.a;
                                    }
                                    final anqn anqn = (anqn)((agzd)anss4).rr((agyr)ReelPickerButtonRendererOuterClass.reelPickerButtonRenderer);
                                    if ((anqn.b & 0x4) != 0x0) {
                                        if ((o = (LayoutInflater)anqn.c) == null) {
                                            o = (LayoutInflater)aioe.a;
                                        }
                                        break Label_2270;
                                    }
                                }
                                o = null;
                            }
                            final hhy ai = this.ai;
                            final bu od3 = ((br)this).od();
                            final aioe bb = this.bb;
                            final Bitmap bh = this.bh;
                            final hiy aj = this.aj;
                            final umv az = ((uqx)this).az;
                            final wwv ae = this.ae;
                            final boolean bg = this.af.bg();
                            ai.m = od3;
                            ai.n = (RecordingInfo)k;
                            ai.t = bb;
                            ai.p = bh;
                            ai.o = (hhw)this;
                            ai.r = (his)aj;
                            ai.s = az;
                            ai.q = ae;
                            ai.G = bg;
                            ai.u = inflate.findViewById(2131430876);
                            (ai.v = (Button)inflate.findViewById(2131430890)).setOnClickListener((View$OnClickListener)ai);
                            (ai.w = (Button)inflate.findViewById(2131430867)).setOnClickListener((View$OnClickListener)ai);
                            (ai.x = inflate.findViewById(2131431011)).setOnClickListener((View$OnClickListener)ai);
                            ai.y = false;
                            ai.z = od3.getResources().getDimension(2131168882);
                            k = this.ai;
                            alvl alvl2;
                            if ((alvl2 = this.av.b().e) == null) {
                                alvl2 = alvl.a;
                            }
                            final boolean ba2 = alvl2.bA;
                            ((hhy)k).a = (aioe)o;
                            final Button v2 = ((hhy)k).v;
                            int visibility;
                            if (!ba2) {
                                visibility = 0;
                            }
                            else {
                                visibility = 8;
                            }
                            v2.setVisibility(visibility);
                            apju apju2;
                            onTouchListener = (Bundle)(apju2 = ((arud)((hhy)k).L.a).f().s);
                            if (onTouchListener == null) {
                                apju2 = apju.a;
                            }
                            final boolean h3 = apju2.h;
                            ((hhy)k).A = h3;
                            if (h3 || ((hhy)k).G) {
                                tcp.n((aum)((hhy)k).m, ((hhy)k).J.b(), (trb)hen.k, (trb)new gzr((hhy)k, 15));
                            }
                            ((hhy)k).x.setVisibility(0);
                            if (o != null) {
                                ((hhy)k).w.setVisibility(0);
                            }
                            ((hhy)k).y = true;
                            if (size > 1) {
                                this.ai.h(false);
                                k = this.aq.a();
                                final aexq k2 = aexq.k(this);
                                ((hig)k).b = inflate.findViewById(2131430884);
                                final hgl a5 = ((hig)k).a;
                                final RecyclerView e = (RecyclerView)inflate.findViewById(2131430877);
                                e.getClass();
                                (a5.e = e).af((nw)new LinearLayoutManager(0));
                                a5.e.ac((nq)a5.a);
                                a5.e.aC(new fye(a5.b.getResources().getDimensionPixelSize(2131168889)));
                                a5.f = k2;
                                a5.a.e = aexq.k(a5);
                                a5.h = aexq.k(new hgj(a5));
                                a5.g = aexq.k(new ql((qf)((aexw)a5.h).a));
                                ((ql)((aexw)a5.g).a).g(a5.e);
                                ((hig)k).b.setVisibility(0);
                                ((hig)k).c = true;
                                ((hig)k).a.d((Object)this.d, (hgo)this.ar.a());
                                ((hig)k).a.c();
                                final hic hic = (hic)this.as.a();
                                final View viewById = inflate.findViewById(2131430882);
                                viewById.getClass();
                                hic.c = viewById;
                                onTouchListener = (Bundle)inflate.findViewById(2131430881);
                                onTouchListener.getClass();
                                hic.d = (View)onTouchListener;
                                hic.c.setOnClickListener((View$OnClickListener)new hht(hic, 6));
                                hic.d.setOnClickListener((View$OnClickListener)new gbw(hic, (hib)this, 16));
                                ((cca)this.at.a()).c = inflate.findViewById(2131431597);
                            }
                            if (o != null && ((agzd)o).rs((agyr)aiym.b)) {
                                if ((o = (LayoutInflater)((aiym)((agzd)o).rr((agyr)aiym.b)).c) == null) {
                                    o = (LayoutInflater)anss.a;
                                }
                                viewGroup = (ViewGroup)((agzd)o).rr((agyr)CreationReelPickerRendererOuterClass.creationReelPickerRenderer);
                            }
                            else {
                                viewGroup = null;
                            }
                            Label_3720: {
                                if (viewGroup == null) {
                                    break Label_3720;
                                }
                                k = this.aj;
                                ((hiy)k).c = this.bh;
                                ((hiy)k).d = (hiv)this;
                                ((hiy)k).e = (hir)this;
                                ((hiy)k).f = inflate.findViewById(2131431036);
                                ((hiy)k).g = (TextView)inflate.findViewById(2131430968);
                                final TextView g3 = ((hiy)k).g;
                                ajsq ajsq;
                                if ((((aiyn)viewGroup).b & 0x1) != 0x0) {
                                    if ((ajsq = ((aiyn)viewGroup).d) == null) {
                                        ajsq = ajsq.a;
                                    }
                                }
                                else {
                                    ajsq = null;
                                }
                                g3.setText((CharSequence)abyh.b(ajsq).toString());
                                ((hiy)k).h = (RecyclerView)inflate.findViewById(2131431113);
                                final Context a6 = ((hiy)k).a;
                                ((hiy)k).h.af((nw)new LinearLayoutManager(0));
                                o = (LayoutInflater)((hiy)k).b;
                                viewGroup = (ViewGroup)((aiyn)viewGroup).c;
                                onTouchListener = (Bundle)new File(((hiy)k).a.getCacheDir().getPath(), "REEL_VIDEO_THUMBNAIL");
                                while (true) {
                                    try {
                                        ((File)onTouchListener).createNewFile();
                                        final FileOutputStream fileOutputStream = new FileOutputStream((File)onTouchListener);
                                        final int width = ((hiy)k).c.getWidth();
                                        final int height = ((hiy)k).c.getHeight();
                                        final double n5 = ((hiy)k).c.getWidth();
                                        final double n6 = ((hiy)k).c.getHeight();
                                        Double.isNaN(n5);
                                        Double.isNaN(n6);
                                        final double n7 = n5 / n6;
                                        int n9;
                                        int n12;
                                        if (width > height) {
                                            final double n8 = Math.min(width, 320);
                                            Double.isNaN(n8);
                                            n9 = Math.max((int)Math.round(n8 / 4.0) * 4, 4);
                                            final double n10 = n9;
                                            Double.isNaN(n10);
                                            final double n11 = (int)Math.round(n10 / n7);
                                            Double.isNaN(n11);
                                            n12 = Math.max((int)Math.round(n11 / 4.0) * 4, 4);
                                        }
                                        else {
                                            final double n13 = Math.min(height, 320);
                                            Double.isNaN(n13);
                                            n12 = Math.max((int)Math.round(n13 / 4.0) * 4, 4);
                                            final double n14 = n12;
                                            Double.isNaN(n14);
                                            final double n15 = (int)Math.round(n14 * n7);
                                            Double.isNaN(n15);
                                            n9 = Math.max((int)Math.round(n15 / 4.0) * 4, 4);
                                        }
                                        (((hiy)k).c = Bitmap.createScaledBitmap(((hiy)k).c, n9, n12, true)).compress(Bitmap$CompressFormat.PNG, 50, (OutputStream)fileOutputStream);
                                        fileOutputStream.close();
                                        final String absolutePath = ((File)onTouchListener).getAbsolutePath();
                                        final hiv d2 = ((hiy)k).d;
                                        onTouchListener = (Bundle)((hiy)k).e;
                                        ((hix)o).e = new ArrayList((Collection<? extends E>)viewGroup);
                                        absolutePath.getClass();
                                        ((hix)o).f = absolutePath;
                                        d2.getClass();
                                        ((hix)o).h = d2;
                                        onTouchListener.getClass();
                                        ((hix)o).g = (hir)onTouchListener;
                                        ((hix)o).i = new ArrayList();
                                        ((hiy)k).h.ac((nq)((hiy)k).b);
                                        ((hiy)k).j = ((hiy)k).a.getResources().getDimension(2131169061);
                                        ((hiy)k).i = false;
                                        o = (LayoutInflater)this.ak;
                                        ((hhr)o).l = (hhq)this;
                                        ((hhr)o).a = inflate.getContext();
                                        ((hhr)o).b = inflate.findViewById(2131427654);
                                        ((hhr)o).c = (AudioTrackView)inflate.findViewById(2131430874);
                                        ((hhr)o).d = (AudioCrossFadeView)inflate.findViewById(2131427651);
                                        ((hhr)o).e = (TextView)inflate.findViewById(2131430873);
                                        ((hhr)o).f = (TextView)inflate.findViewById(2131430868);
                                        (((hhr)o).g = (ImageButton)inflate.findViewById(2131430871)).setOnClickListener((View$OnClickListener)o);
                                        (((hhr)o).h = (Button)inflate.findViewById(2131430869)).setOnClickListener((View$OnClickListener)o);
                                        (((hhr)o).i = (Button)inflate.findViewById(2131430870)).setOnClickListener((View$OnClickListener)o);
                                        ((hhr)o).k = ((hhr)o).a.getResources().getDimension(2131168852);
                                        viewGroup = (ViewGroup)((arud)this.ax.a).f().s;
                                        if ((o = (LayoutInflater)viewGroup) == null) {
                                            o = (LayoutInflater)apju.a;
                                        }
                                        this.c = ((apju)o).k;
                                        viewGroup = (ViewGroup)this.al;
                                        o = (LayoutInflater)this.ae;
                                        ((hhp)viewGroup).d = (hho)this;
                                        ((hhp)viewGroup).h = (wwv)o;
                                        ((hhp)viewGroup).a = inflate.getContext();
                                        (((hhp)viewGroup).e = (TextView)inflate.findViewById(2131430866)).setOnClickListener((View$OnClickListener)viewGroup);
                                        (((hhp)viewGroup).f = (TextView)inflate.findViewById(2131430883)).setOnClickListener((View$OnClickListener)viewGroup);
                                        ((hhp)viewGroup).g = inflate.findViewById(2131427653);
                                        ((hhp)viewGroup).b = ((hhp)viewGroup).a.getResources().getDimension(2131168850);
                                        viewGroup = (ViewGroup)this.am;
                                        o = (LayoutInflater)this.ae;
                                        ((hip)viewGroup).f = (hio)this;
                                        ((hip)viewGroup).g = (wwv)o;
                                        ((hip)viewGroup).a = inflate.findViewById(2131430896);
                                        ((hip)viewGroup).b = (VideoTrimView)inflate.findViewById(2131430898);
                                        (((hip)viewGroup).c = (Button)inflate.findViewById(2131430897)).setOnClickListener((View$OnClickListener)viewGroup);
                                        ((hip)viewGroup).e = inflate.getContext().getResources().getDimension(2131168944);
                                        viewGroup = (ViewGroup)this.an;
                                        o = (LayoutInflater)this.ae;
                                        ((hia)viewGroup).f = (hhz)this;
                                        ((hia)viewGroup).g = (wwv)o;
                                        ((hia)viewGroup).a = inflate.findViewById(2131430879);
                                        (((hia)viewGroup).b = (ChooseFilterView)inflate.findViewById(2131428192)).i((upb)viewGroup);
                                        (((hia)viewGroup).c = (Button)inflate.findViewById(2131430880)).setOnClickListener((View$OnClickListener)viewGroup);
                                        ((hia)viewGroup).e = inflate.getContext().getResources().getDimension(2131168901);
                                        onTouchListener = (Bundle)this.ao;
                                        viewGroup = (ViewGroup)this.bd;
                                        k = ((uqx)this).az;
                                        final boolean be = this.be;
                                        final boolean bf = this.bf;
                                        final boolean bg2 = this.bg;
                                        o = (LayoutInflater)this.ae;
                                        ((hje)onTouchListener).h = (br)this;
                                        ((hje)onTouchListener).j = (hjc)this;
                                        ((hje)onTouchListener).k = (umv)k;
                                        ((hje)onTouchListener).o = (wwv)o;
                                        ((hje)onTouchListener).d = inflate.findViewById(2131432190);
                                        ((hje)onTouchListener).e = (ImageView)inflate.findViewById(2131432191);
                                        ((hje)onTouchListener).f = inflate.findViewById(2131432189);
                                        if (viewGroup != null && (((anqe)viewGroup).b & 0x8) != 0x0) {
                                            viewGroup = (ViewGroup)((anqe)viewGroup).f;
                                            if ((o = (LayoutInflater)viewGroup) == null) {
                                                o = (LayoutInflater)akbf.a;
                                            }
                                            viewGroup = (ViewGroup)akbe.b(((akbf)o).c);
                                            if ((o = (LayoutInflater)viewGroup) == null) {
                                                o = (LayoutInflater)akbe.a;
                                            }
                                        }
                                        else {
                                            o = (LayoutInflater)akbe.aJ;
                                        }
                                        ((hje)onTouchListener).e.setImageResource(((hje)onTouchListener).a.a((akbe)o));
                                        ((hje)onTouchListener).g = inflate.findViewById(2131431969);
                                        viewGroup = (ViewGroup)inflate.findViewById(2131430894);
                                        if (((hje)onTouchListener).q.F()) {
                                            o = (LayoutInflater)inflate.findViewById(2131431058);
                                        }
                                        else {
                                            o = (LayoutInflater)inflate.findViewById(2131430804);
                                        }
                                        if (be) {
                                            ((View)o).setVisibility(0);
                                            ((hje)onTouchListener).c.o(((hje)onTouchListener).g, (View)viewGroup, (View)o, bf, bg2, true, false, (wwv)null, (vup)null);
                                        }
                                        ((hje)onTouchListener).p.a = be;
                                        viewGroup = (ViewGroup)inflate.findViewById(2131431908);
                                        o = (LayoutInflater)inflate.findViewById(2131432347);
                                        ((hje)onTouchListener).m = new hjd((TextView)viewGroup, (View)o, (hjc)this);
                                        ((hje)onTouchListener).l = new uja(((View)o).getContext(), (uix)((hje)onTouchListener).m);
                                        ((View)o).setOnTouchListener((View$OnTouchListener)onTouchListener);
                                        this.aZ = (EditableVideoControllerView)inflate.findViewById(2131428803);
                                        final boolean e2 = tqt.e(((br)this).nT());
                                        this.e.a(e2, "STORIES");
                                        if (e2) {
                                            tqt.c(((br)this).nT(), inflate, (CharSequence)((br)this).P(2132019341));
                                        }
                                        this.ap.c((br)this, inflate.findViewById(2131431942), Optional.empty(), Optional.empty());
                                        this.ae.b(wya.b(36851), this.bc, (alff)null);
                                        this.ae.D((wxz)new wws(wya.c(39104)));
                                        this.ae.D((wxz)new wws(wya.c(74465)));
                                        o = (LayoutInflater)this.ah;
                                        ((hil)o).c.l((wxz)new wws(wya.c(36854)));
                                        ((hil)o).c.l((wxz)new wws(wya.c(22156)));
                                        ((hil)o).c.l((wxz)new wws(wya.c(39303)));
                                        if (((hil)o).i.getVisibility() == 0) {
                                            ((hil)o).c.l((wxz)new wws(wya.c(37172)));
                                        }
                                        if (((hil)o).l.getVisibility() == 0) {
                                            ((hil)o).c.l((wxz)new wws(wya.c(36855)));
                                        }
                                        onTouchListener = (Bundle)((hil)o).v;
                                        o = (LayoutInflater)((Map<Object, V>)((hmb)onTouchListener).e).keySet().iterator();
                                        while (((Iterator)o).hasNext()) {
                                            viewGroup = (ViewGroup)((Iterator<aibb>)o).next();
                                            ((wwu)((hmb)onTouchListener).b).n().l((wxz)new wws(((aibb)viewGroup).w));
                                        }
                                        o = (LayoutInflater)this.ai;
                                        if (((hhy)o).v.getVisibility() == 0) {
                                            ((hhy)o).q.l((wxz)new wws(wya.c(36855)));
                                        }
                                        ((hhy)o).q.l((wxz)new wws(wya.c(36857)));
                                        return inflate;
                                        o = (LayoutInflater)new NullPointerException("Null root");
                                        throw o;
                                        throw new NullPointerException("Null fragmentActivity");
                                        throw new NullPointerException("Null resources");
                                        throw new NullPointerException("Null recordingInfo");
                                        throw new NullPointerException("Null interactionLogger");
                                    }
                                    catch (final Exception ex4) {
                                        continue;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void Y() {
        final akak f = ((uqx)this).aV.f();
        Label_0045: {
            if ((f.b & 0x1000) != 0x0) {
                apgj apgj;
                if ((apgj = f.h) == null) {
                    apgj = apgj.a;
                }
                if (!apgj.h) {
                    break Label_0045;
                }
            }
            this.be();
        }
        super.Y();
    }
    
    public final void a(int dimensionPixelSize) {
        final hic hic = (hic)this.as.a();
        final View t = ((hig)this.aq.a()).a.e.n.T(dimensionPixelSize);
        hic.e = dimensionPixelSize;
        tmy.v(hic.c, true);
        hic.f = t;
        final toz toz = new toz();
        toz.c(toz, hic.f, (View)hic.c.getParent());
        final int left = toz.a.left;
        final int right = toz.a.right;
        dimensionPixelSize = hic.a.getResources().getDimensionPixelSize(2131168914);
        tmy.aF(hic.d, tmy.an(new tsp[] { tmy.au((left + right - dimensionPixelSize) / 2), tmy.aB(toz.a.top - hic.a.getResources().getDimensionPixelSize(2131168914) - hic.a.getResources().getDimensionPixelSize(2131168913)) }), (Class)FrameLayout$LayoutParams.class);
        hic.b.postDelayed(hic.g, 5000L);
    }
    
    public final View aL() {
        return this.ah.j;
    }
    
    public final View aM() {
        return this.ag.d;
    }
    
    protected final View aN() {
        return this.ah.f;
    }
    
    protected final View aO() {
        return this.ag.c;
    }
    
    public final ReelItemEditModel aP(final RecordingInfo recordingInfo, final VideoMetaData a, final int n) {
        final qxu qxu = new qxu();
        qxu.a = a;
        qxu.c(((uqx)this).aM);
        final EditableVideo a2 = qxu.a();
        if (n > 0 || a.h > ((uqx)this).aM) {
            final long am = ((uqx)this).aM;
            a2.F(n * am, (n + 1) * am);
        }
        ((uqx)this).bc(a2);
        final hiq g = ReelItemEditModel.g();
        g.d(recordingInfo);
        g.f(a);
        g.b(a2.a);
        g.e(String.valueOf(n));
        return g.a();
    }
    
    public final VideoMetaData aQ(final Context context, final Uri uri) {
        return bs(context, uri, this.d.f());
    }
    
    protected final VideoWithPreviewView aS() {
        return this.ag.e;
    }
    
    protected final VideoTrimView aT() {
        return this.am.b;
    }
    
    protected final AudioCrossFadeView aU() {
        return this.ak.d;
    }
    
    protected final AudioTrackView aV() {
        return this.ak.c;
    }
    
    protected final ChooseFilterView aW() {
        final hia an = this.an;
        if (an != null) {
            return an.b;
        }
        return null;
    }
    
    protected final EditableVideoControllerView aX() {
        return this.aZ;
    }
    
    public final ajsq aY() {
        final agzc agzc = (agzc)((agzi)ajsq.a).createBuilder();
        final String string = ((br)this).nT().getString(2132019460);
        agzc.copyOnWrite();
        final ajsq ajsq = (ajsq)agzc.instance;
        string.getClass();
        ajsq.b |= 0x1;
        ajsq.d = string;
        return (ajsq)agzc.build();
    }
    
    public final void aZ() {
        ((uqx)this).bv(aexq.k(this.d.e().h()));
        hjp.b(this.d.e().e(), ((br)this).nT(), ((uqx)this).az);
        this.aW().g(this.d.e().h().p());
        this.bM();
    }
    
    public final void ab(final View view, final Bundle bundle) {
        super.ab(view, bundle);
        ((uqx)this).bv(aexq.k(this.d.e().h()));
        final hje ao = this.ao;
        if (ao.k.m() != null) {
            ao.k.m().e((uln)ao);
        }
        hjp.b(this.d.e().e(), ((br)this).nT(), ((uqx)this).az);
        if (this.bi != null) {
            ((uqx)this).az.m().b(this.bi);
            final uen ap = this.ap;
            ap.e(Math.round(ap.a() - ap.b - this.bi.a()));
        }
        this.bM();
    }
    
    public final void b(final int n) {
        final hyq hyq = (hyq)this.au.a();
        hyq.a = ((wyo)hyq.b).b(alku.bf);
        this.be();
        final zvm d = this.d.d();
        d.l(n);
        this.d = d.k();
        ((hig)this.aq.a()).a.d((Object)this.d, (hgo)this.ar.a());
        this.aZ();
        final hyq hyq2 = (hyq)this.au.a();
        final Object a = hyq2.a;
        if (a == null) {
            return;
        }
        ((wyn)a).c("aft");
        hyq2.a = null;
    }
    
    public final void ba() {
        this.am.f();
        this.bh();
    }
    
    public final void bb() {
        final hil ah = this.ah;
        if (ah.r) {
            if (ah.t) {
                ah.d.setVisibility(8);
            }
            else {
                uji.I((tvl)ah);
            }
            ah.r = false;
        }
        if (this.d.c().size() > 1) {
            ((hig)this.aq.a()).f();
            return;
        }
        this.ai.g();
    }
    
    protected final void bc(final EditableVideo editableVideo) {
        final aioe bb = this.bb;
        if (bb != null && ((agzd)bb).rs((agyr)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)) {
            if (!editableVideo.M() && editableVideo.b.h > (((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint)((agzd)this.bb).rr((agyr)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).c + 1) * 1000000L) {
                tmy.bS((Context)((br)this).od(), 2132019441);
                this.af.r();
            }
            final double n = editableVideo.b.k();
            final double n2 = editableVideo.b.j();
            Double.isNaN(n);
            Double.isNaN(n2);
            final double n3 = n / n2;
            final double abs = Math.abs(-0.5625 + n3);
            double n4 = 0.0;
            double n7;
            double n6;
            double n8;
            if (abs >= 0.01) {
                if (n3 > 0.5625) {
                    Double.isNaN(n2);
                    Double.isNaN(n);
                    final double n5 = (n - n2 * 0.5625) / 2.0;
                    Double.isNaN(n);
                    n6 = (n7 = n5 / n);
                    n8 = 0.0;
                }
                else {
                    Double.isNaN(n);
                    final double n9 = n / 0.5625;
                    Double.isNaN(n2);
                    final double n10 = (n2 - n9) / 2.0;
                    Double.isNaN(n2);
                    n8 = n10 / n2;
                    n6 = (n7 = 0.0);
                    n4 = n8;
                }
            }
            else {
                n8 = 0.0;
                n6 = (n7 = n8);
            }
            editableVideo.B(n4, n8);
            editableVideo.A(n6, n7);
        }
    }
    
    public final void bd(final int n, final TextView textView, final AnimatorSet set) {
        final ChooseFilterView aw = this.aW();
        upi c;
        if (aw == null) {
            c = null;
        }
        else {
            c = aw.c();
        }
        if (aw != null && c != null) {
            if (n == 3) {
                c.j();
                tmy.bU(this.ae, c.c, wya.c(74465));
            }
            else {
                if (n != 1) {
                    return;
                }
                c.k();
                tmy.bU(this.ae, c.c, wya.c(74465));
            }
            ((br)this).od().runOnUiThread((Runnable)new tu(this, textView, c, set, 18));
        }
    }
    
    public final void be() {
        final String e = this.d.e().e();
        final yor m = ((uqx)this).az.m();
        Object o;
        if (m == null) {
            o = aewp.a;
        }
        else {
            o = m.m(aexq.k(new File("reel_effects", e).getPath())).a();
        }
        final ReelEditModel d = this.d;
        final boolean h = ((aexq)o).h();
        final boolean b = false;
        boolean b2 = false;
        Label_0157: {
            if (!h) {
                b2 = b;
            }
            else {
                final Iterator iterator = ((aqxp)((aexq)o).c()).i().iterator();
                aqyc a;
                do {
                    b2 = b;
                    if (!iterator.hasNext()) {
                        break Label_0157;
                    }
                    final aqxd i = ((aqxf)iterator.next()).i();
                    if (i.c == 10) {
                        a = (aqyc)i.d;
                    }
                    else {
                        a = aqyc.a;
                    }
                } while (!a.d);
                b2 = true;
            }
        }
        ReelEditModel k;
        if (d.e().f() == b2) {
            k = d;
        }
        else {
            final hiq a2 = d.e().a();
            a2.c(b2);
            final ReelItemEditModel a3 = a2.a();
            final ArrayList list = new ArrayList((Collection<?>)d.c());
            list.set(d.a(), (Object)a3);
            final zvm d2 = d.d();
            d2.m((List)list);
            k = d2.k();
        }
        this.d = k;
    }
    
    protected final void bf() {
        this.an.b.setBackgroundColor(tmy.ct((Context)this.ba, 2130970163).orElse(0));
    }
    
    public final void bg(final boolean be, final boolean bf, final boolean bg) {
        this.be = be;
        this.bf = bf;
        this.bg = bg;
    }
    
    public final void bh() {
        final hil ah = this.ah;
        if (!ah.r) {
            if (ah.t) {
                ah.d.setVisibility(0);
            }
            else {
                uji.I((tvl)ah);
            }
            ah.r = true;
        }
        if (this.d.c().size() > 1) {
            ((hig)this.aq.a()).g();
            return;
        }
        this.ai.l();
    }
    
    protected final void bi() {
        final hhr ak = this.ak;
        final AudioCrossFadeView d = ak.d;
        d.c.setProgressDrawable(d.getResources().getDrawable(2131230980));
        ak.d.setVisibility(0);
        ak.d.e = -1275068417;
        ak.c.e.b.setColor(0);
        ak.c.b.setColor(0);
        final AudioTrackView c = ak.c;
        c.g = false;
        c.h = true;
        final View viewById = ak.d.findViewById(2131427672);
        CharSequence string = null;
        viewById.setBackground((Drawable)null);
        final AudioCrossFadeView d2 = ak.d;
        final float dimension = ak.a.getResources().getDimension(2131168846);
        d2.a.setTextSize(0, dimension);
        d2.b.setTextSize(0, dimension);
        final int n = (int)ak.a.getResources().getDimension(2131168845);
        final AudioCrossFadeView d3 = ak.d;
        d3.d((View)d3.a, n, n);
        d3.d((View)d3.b, n, n);
        final hhr ak2 = this.ak;
        final Track h = ((uqx)this).aH.h;
        CharSequence string2;
        if (h == null) {
            string2 = null;
        }
        else {
            string2 = h.b.toString();
        }
        final Track h2 = ((uqx)this).aH.h;
        if (h2 != null) {
            string = h2.a.toString();
        }
        if (!ak2.j) {
            uji.I((tvl)ak2);
            ak2.j = true;
        }
        ak2.f.setText(string2);
        ak2.e.setText(string);
        this.bb();
    }
    
    public final void bj() {
        if (this.d.c().size() > 1) {
            ((hig)this.aq.a()).g();
            this.ai.g();
            return;
        }
        ((hig)this.aq.a()).f();
        this.ai.l();
    }
    
    protected final void bk() {
        if (this.aW().c() == null) {
            return;
        }
        final View al = ((uqx)this).aL();
        final boolean q = this.aW().c().q();
        int imageResource;
        final int n = imageResource = 2131232611;
        if (q) {
            final ujn ar = ((uqx)this).aR;
            imageResource = n;
            if (ar != null) {
                imageResource = n;
                if (ar.a(apjf.b)) {
                    imageResource = 2131231560;
                }
            }
        }
        if (al instanceof ImageButton) {
            ((ImageButton)al).setImageResource(imageResource);
            return;
        }
        if (al instanceof CreationButtonView) {
            ((CreationButtonView)al).b(imageResource);
        }
    }
    
    public final void bl(final ReelEditModel d) {
        this.d = d;
        ((hig)this.aq.a()).a.d((Object)d, (hgo)this.ar.a());
    }
    
    protected final void bm(final int n) {
    }
    
    public final boolean bn() {
        final ReelEditModel d = this.d;
        for (int i = 0; i < d.c().size(); ++i) {
            if (i != d.a()) {
                if (((ReelItemEditModel)d.c().get(i)).f()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public final boolean bo() {
        final EditableVideo bu = ((uqx)this).bu();
        return bu != null && bu.G();
    }
    
    protected final boolean bp() {
        return true;
    }
    
    protected final boolean bq() {
        return !((uqx)this).aT().v;
    }
    
    public final boolean br() {
        return !this.am.d && !this.ak.j && !this.an.d && !this.al.c && !this.aj.i;
    }
    
    public final void c(int n, final int n2) {
        final ReelEditModel d = this.d;
        final afcr c = d.c();
        ReelEditModel k = d;
        if (n >= 0) {
            k = d;
            if (n < c.size()) {
                k = d;
                if (n2 >= 0) {
                    k = d;
                    if (n2 < c.size()) {
                        if (n == n2) {
                            k = d;
                        }
                        else {
                            final ArrayList list = new ArrayList((Collection<?>)c);
                            Collections.swap(list, n, n2);
                            final int a = d.a();
                            if (a == n) {
                                n = n2;
                            }
                            else if (a != n2) {
                                n = a;
                            }
                            final zvm d2 = d.d();
                            d2.m((List)list);
                            d2.l(n);
                            k = d2.k();
                        }
                    }
                }
            }
        }
        this.bl(k);
    }
    
    public final void d() {
        final EditableVideo bu = ((uqx)this).bu();
        if (bu != null) {
            bu.w(this.bo() ^ true);
        }
        this.bM();
        this.bh();
    }
    
    public final void e() {
        this.ak.f();
        this.bh();
    }
    
    public final void h() {
        this.an.f();
        this.bh();
    }
    
    public final void k(final boolean b) {
        if (b) {
            this.bb();
            return;
        }
        this.bh();
    }
    
    public final wwv n() {
        return this.ae;
    }
    
    public final void nm() {
        final hje ao = this.ao;
        if (ao.k.m() != null) {
            ao.k.m().f((uln)ao);
        }
        ao.c.i();
        super.nm();
    }
    
    public final void np() {
        final hje ao = this.ao;
        if (ao.g.getVisibility() == 0) {
            final ufk c = ao.c;
            c.k.setText((CharSequence)null);
            c.k.setTextSize(2, 36.0f);
            c.j.setVisibility(8);
        }
        super.np();
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        if (bundle != null) {
            this.bg(bundle.getBoolean("TEXT_ENABLED"), bundle.getBoolean("ADVANCED_TEXT_ENABLED"), bundle.getBoolean("TEXT_ROUNDED_CORNERS_ENABLED"));
            this.a = bundle.getBoolean("CAN_REQUEST_VIDEO_EFFECTS_STATE");
        }
    }
    
    protected final int p() {
        return 2131361815;
    }
    
    public final void pK(final Bundle bundle) {
        super.pK(bundle);
        bundle.putBoolean("TEXT_ENABLED", this.be);
        bundle.putBoolean("ADVANCED_TEXT_ENABLED", this.bf);
        bundle.putBoolean("TEXT_ROUNDED_CORNERS_ENABLED", this.bg);
        bundle.putBoolean("CAN_REQUEST_VIDEO_EFFECTS_STATE", this.a);
        bundle.putParcelable("REEL_MODEL", (Parcelable)this.d);
    }
    
    protected final View r() {
        return this.ak.b;
    }
    
    protected final View s() {
        return this.ah.g;
    }
}
