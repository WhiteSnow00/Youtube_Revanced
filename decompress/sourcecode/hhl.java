import android.content.DialogInterface$OnClickListener;
import android.content.res.Configuration;
import android.content.ContentResolver;
import android.util.DisplayMetrics;
import android.graphics.Rect;
import android.view.ContextThemeWrapper;
import android.content.DialogInterface$OnKeyListener;
import java.util.Map;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.CommentStickerRendererOuterClass;
import android.view.Window;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import android.content.Context;
import android.net.Uri;
import android.media.MediaMetadataRetriever;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import com.google.protobuf.ExtensionRegistryLite;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import android.app.Dialog;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhl extends hgt implements acst, hhg, hjg, hie, hiz, udk, ues
{
    static final PermissionDescriptor[] a;
    private static final PermissionDescriptor[] aA;
    private static final long az;
    private aioe aB;
    private hid aC;
    private Dialog aD;
    private aonw aE;
    private apjz aG;
    private apjz aH;
    private boolean aI;
    private boolean aJ;
    private boolean aK;
    public uoe ae;
    public uoe af;
    public umr ag;
    public uda ah;
    public uet ai;
    public gko aj;
    public acsu ak;
    public hhi al;
    public hjh am;
    public aqxf an;
    public aiva ao;
    public final hhm ap;
    public hhn aq;
    public uyf ar;
    public acss as;
    public uyi at;
    public aagm au;
    public fzo av;
    public aeby aw;
    public final qpt ax;
    public Handler b;
    public vax c;
    public hja d;
    public uos e;
    
    static {
        az = TimeUnit.MINUTES.toMillis(1L);
        a = new PermissionDescriptor[] { new PermissionDescriptor(0, wya.c(31566), wya.c(31569)), new PermissionDescriptor(1, wya.c(31564), wya.c(31567)), new PermissionDescriptor(2, wya.c(31565), wya.c(31568)) };
        aA = new PermissionDescriptor[0];
    }
    
    public hhl() {
        this.ap = (hhm)new hhk(this, 0);
        this.ax = new qpt(this);
    }
    
    public static boolean bh(final aioe aioe) {
        return aioe != null && ((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint)((agzd)aioe).rr((agyr)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).c > 0;
    }
    
    private final yor bk() {
        final uqx uqx = (uqx)((br)this).og().f("reelEditFragment2");
        if (uqx == null) {
            return null;
        }
        return uqx.az.m();
    }
    
    public static hhl o(final aioe aioe, final boolean b, final boolean b2) {
        final hhl hhl = new hhl();
        final Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", ((agxl)aioe).toByteArray());
        bundle.putBoolean("modify_window_fullscreen_mode", b);
        bundle.putBoolean("SWIPE_TO_CAMERA_ENABLED", b2);
        ((br)hhl).ag(bundle);
        return hhl;
    }
    
    public final View K(LayoutInflater inflate, ViewGroup e, final Bundle bundle) {
        super.K(inflate, e, bundle);
        inflate = (LayoutInflater)inflate.inflate(2131625193, e, false);
        final hja d = this.d;
        if (bundle != null) {
            final byte[] byteArray = bundle.getByteArray("reel_handler_edit_video_endpoint");
            if (byteArray != null) {
                try {
                    d.b((aioe)agzi.parseFrom((agzi)aioe.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry()));
                }
                catch (final ahab ahab) {}
            }
        }
        final boolean b = true;
        boolean b4;
        boolean b5;
        if (bundle != null) {
            e = (ViewGroup)((br)this).og().e(2131430844);
            this.aE = null;
            final byte[] byteArray2 = bundle.getByteArray("camera_swazzle_effects_settings_key");
            boolean b2;
            if (byteArray2 != null) {
                try {
                    final aonw ae = (aonw)agzi.parseFrom((agzi)aonw.a, byteArray2, ExtensionRegistryLite.getGeneratedRegistry());
                    this.aE = ae;
                    this.e.e(ae);
                }
                catch (final ahab ahab2) {
                    this.aE = null;
                }
                b2 = false;
            }
            else {
                b2 = true;
            }
            this.aG = null;
            final byte[] byteArray3 = bundle.getByteArray("camera_kazoo_effects_settings_key");
            if (byteArray3 != null) {
                try {
                    this.aG = (apjz)agzi.parseFrom((agzi)apjz.a, byteArray3, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab3) {
                    this.aG = null;
                }
                this.ae.h(this.aG, false);
                b2 = false;
            }
            this.aH = null;
            final byte[] byteArray4 = bundle.getByteArray("edit_kazoo_effects_settings_key");
            if (byteArray4 != null) {
                try {
                    this.aH = (apjz)agzi.parseFrom((agzi)apjz.a, byteArray4, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab4) {
                    this.aH = null;
                }
                this.af.g(this.aH);
                b2 = false;
            }
            boolean b3 = false;
            Label_0463: {
                if (e instanceof acsu) {
                    (this.ak = (acsu)e).aK((acst)this);
                }
                else if (e instanceof hid) {
                    final hid ac = (hid)e;
                    this.aC = ac;
                    b3 = b;
                    if (!ac.bK()) {
                        this.aC.bE((ujm)this.af);
                        this.aC.bD((ujn)this.af);
                        this.aC.bL(this.af.k(), this.af.a);
                        b3 = b;
                    }
                    break Label_0463;
                }
                else if (e instanceof hhi) {
                    (this.al = (hhi)e).aT((hhg)this);
                    this.al.aU(this.e);
                    this.al.aS(this.ae);
                }
                else if (e instanceof hjh) {
                    final hjh am = (hjh)e;
                    this.am = am;
                    am.a = (hjg)this;
                }
                b3 = false;
            }
            final byte[] byteArray5 = bundle.getByteArray("block reel_creation_key");
            b4 = b2;
            b5 = b3;
            if (byteArray5 != null) {
                try {
                    this.ao = (aiva)agzi.parseFrom((agzi)aiva.a, byteArray5, ExtensionRegistryLite.getGeneratedRegistry());
                    this.b.post((Runnable)new hcp(this, 8));
                    b4 = b2;
                    b5 = b3;
                }
                catch (final ahab ahab5) {
                    trn.d("Error parsing renderer.", (Throwable)ahab5);
                    b4 = b2;
                    b5 = b3;
                }
            }
        }
        else {
            b5 = false;
            b4 = true;
        }
        if (this.aC == null && this.al == null && this.am == null && this.ak == null) {
            tcp.n((aum)this, this.au.b(), (trb)hen.c, (trb)new gzr(this, 13));
        }
        else {
            this.aT(b5);
        }
        if (b4) {
            final hja d2 = this.d;
            final uoe af = this.af;
            af.getClass();
            final tzd tzd = new tzd(af);
            d2.sendEmptyMessage(0);
            tcp.n((aum)this, afrp.f(afrp.e((ListenableFuture)aftj.m(afld.k((Callable)new guf((uod)tzd, 9), (Executor)d2.e)), (aexg)gku.r, (Executor)afsl.a), (afry)new fdr(d2, 11), (Executor)afsl.a), (trb)new gzr(d2, 16), (trb)new gzr(d2, 17));
        }
        this.ag.execute((Object[])new Void[0]);
        this.ah.b();
        return (View)inflate;
    }
    
    public final void W() {
        super.W();
        this.d.removeCallbacksAndMessages((Object)null);
    }
    
    public final void a(final aqxf aqxf) {
        final yor bk = this.bk();
        if (bk != null) {
            bk.b(aqxf);
        }
    }
    
    public final void aK(final aonw ae, final apjz ag, final apjz ah) {
        boolean b = true;
        if (ae != null) {
            b = (ag == null && b);
        }
        agot.D(b);
        this.aE = ae;
        this.aG = ag;
        this.aH = ah;
        if (ae != null) {
            this.e.e(ae);
        }
        else if (ag != null) {
            this.ae.h(ag, false);
        }
        if (ah != null) {
            this.af.g(ah);
        }
    }
    
    public final void aL() {
        final hhn aq = this.aq;
        if (aq != null) {
            aq.d();
        }
    }
    
    public final void aM() {
        this.b.post((Runnable)new hcp(this, 9, (byte[])null));
    }
    
    public final void aN(DeviceLocalFile f) {
        final String type = this.n().getType(f.f());
        if (type != null && type.startsWith("video/")) {
            f = (DeviceLocalFile)f.f();
            final MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            RecordingInfo recordingInfo = null;
            Label_0300: {
                try {
                    mediaMetadataRetriever.setDataSource(this.n().openAssetFileDescriptor((Uri)f, "r").getFileDescriptor());
                    mediaMetadataRetriever.setDataSource((Context)((br)this).od(), (Uri)f);
                    final long long1 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                    int n = 0;
                    int n2 = 0;
                    Label_0198: {
                        try {
                            final String metadata = mediaMetadataRetriever.extractMetadata(18);
                            int int1;
                            if (metadata != null) {
                                int1 = Integer.parseInt(metadata);
                            }
                            else {
                                int1 = 0;
                            }
                            final String metadata2 = mediaMetadataRetriever.extractMetadata(19);
                            int int2;
                            if (metadata2 != null) {
                                int2 = Integer.parseInt(metadata2);
                            }
                            else {
                                int2 = 0;
                            }
                            final String metadata3 = mediaMetadataRetriever.extractMetadata(24);
                            n = int1;
                            n2 = int2;
                            if (metadata3 != null) {
                                final int int3 = Integer.parseInt(metadata3);
                                if (int3 != 90) {
                                    n = int1;
                                    n2 = int2;
                                    if (int3 != 270) {
                                        break Label_0198;
                                    }
                                }
                                n2 = int1;
                                n = int2;
                            }
                        }
                        catch (final NumberFormatException ex) {
                            n = 0;
                            n2 = 0;
                        }
                    }
                    int height = n2;
                    while (true) {
                        Label_0229: {
                            if (n == 0) {
                                break Label_0229;
                            }
                            final int width = n;
                            if ((height = n2) == 0) {
                                height = 0;
                                break Label_0229;
                            }
                            mediaMetadataRetriever.release();
                            recordingInfo = new RecordingInfo(((Uri)f).toString(), false, width, height, long1, false, true, (String)null, (apje)null, false);
                            break Label_0300;
                        }
                        final Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                        int width = n;
                        if (frameAtTime != null) {
                            width = frameAtTime.getWidth();
                            height = frameAtTime.getHeight();
                        }
                        continue;
                    }
                }
                catch (final Exception ex2) {
                    trn.b("Failed loading video from camera roll.");
                    recordingInfo = null;
                }
            }
            if (recordingInfo != null) {
                final int b = recordingInfo.b;
                if (b != 0) {
                    if (Math.abs(recordingInfo.a / (float)b - 0.5625f) >= 0.01f) {
                        apgi apgi;
                        if ((apgi = this.ar.b().q) == null) {
                            apgi = apgi.a;
                        }
                        if (!apgi.c) {
                            tmy.bS((Context)((br)this).od(), 2132019442);
                            return;
                        }
                    }
                    if (recordingInfo.d < 1000L) {
                        tmy.bS((Context)((br)this).od(), 2132019440);
                        return;
                    }
                    alvl alvl;
                    if ((alvl = this.ar.b().e) == null) {
                        alvl = alvl.a;
                    }
                    Object o2 = null;
                    Label_0708: {
                        if (alvl.bA) {
                            final long d = recordingInfo.d;
                            final long az = hhl.az;
                            if (d > az) {
                                final fzo av = this.av;
                                final Uri parse = Uri.parse(recordingInfo.c);
                                Object o;
                                if (recordingInfo.d <= az) {
                                    o = aexq.k(parse);
                                }
                                else {
                                    final hgv hgv = new hgv(av, parse, az, (byte[])null, (byte[])null, (byte[])null);
                                    final File a = ((hjl)av.a).a().a;
                                    if (a == null) {
                                        zjp.b(zjo.b, zjn.x, "Failed to open disk cache directory");
                                        o = aewp.a;
                                    }
                                    else {
                                        try {
                                            final File tempFile = File.createTempFile("MP4_SPLITTER_TEMP_FILE_NAME_BASE", ".mp4", a);
                                            if (fzo.J((rbz)((atjj)hgv).a(), new FileOutputStream(tempFile)) && tempFile != null) {
                                                o = aexq.k(Uri.fromFile(tempFile));
                                            }
                                            else {
                                                o = aewp.a;
                                            }
                                        }
                                        catch (final IOException ex3) {
                                            zjp.c(zjo.b, zjn.x, "Failed to create output stream from file", (Throwable)ex3);
                                            o = aewp.a;
                                        }
                                    }
                                }
                                if (!((aexq)o).h()) {
                                    o2 = aewp.a;
                                    break Label_0708;
                                }
                                final String path = ((Uri)((aexq)o).c()).getPath();
                                if (path == null) {
                                    o2 = aewp.a;
                                    break Label_0708;
                                }
                                o2 = aexq.k(new RecordingInfo(path, true, recordingInfo.a, recordingInfo.b, hhl.az, recordingInfo.f, recordingInfo.g, recordingInfo.h, recordingInfo.i, recordingInfo.j));
                                break Label_0708;
                            }
                        }
                        o2 = aexq.k(recordingInfo);
                    }
                    if (!((aexq)o2).h()) {
                        tmy.bS((Context)((br)this).od(), 2132019438);
                        return;
                    }
                    this.d.a((RecordingInfo)((aexq)o2).c(), 0);
                    return;
                }
            }
            tmy.bS((Context)((br)this).od(), 2132019439);
            this.al.aM(false);
            return;
        }
        if (type != null && type.startsWith("image/")) {
            try {
                final Bitmap d2 = uji.D(uji.C((Context)((br)this).od(), f.f()));
                final br e = ((br)this).og().e(2131430844);
                if (e instanceof hhi) {
                    ((hhi)e).aO(d2, true);
                    return;
                }
                tmy.bS((Context)((br)this).od(), 2132019436);
                this.al.aM(false);
                return;
            }
            catch (final Exception ex4) {
                trn.b("Error retrieve image from uri");
                tmy.bS((Context)((br)this).od(), 2132019436);
                return;
            }
        }
        tmy.bS((Context)((br)this).od(), 2132019439);
        this.al.aM(false);
    }
    
    public final void aO() {
        final hhn aq = this.aq;
        if (aq != null) {
            aq.d();
        }
    }
    
    public final void aP(final br br) {
        final ct i = ((br)this).og().i();
        i.n(br);
        i.a();
    }
    
    public final void aQ(final aqxe aqxe) {
        final yor bk = this.bk();
        if (bk != null) {
            bk.c(aqxe);
        }
    }
    
    public final void aS(final br br, final String s) {
        final ct i = ((br)this).og().i();
        i.w(2131430844, br, s);
        i.a();
    }
    
    public final void aT(final boolean b) {
        if (this.aI) {
            if (this.aq != null) {
                final Window window = ((br)this).od().getWindow();
                if (b) {
                    window.addFlags(1024);
                    window.setSoftInputMode(2);
                    return;
                }
                window.clearFlags(1024);
                window.setSoftInputMode(16);
                this.aq.e();
            }
        }
    }
    
    public final void aU(final boolean ak) {
        this.aK = ak;
    }
    
    public final void aV() {
        final hhi al = (hhi)((br)this).og().f("cameraFragment");
        this.al = al;
        if (al == null) {
            final aioe ab = this.aB;
            int c = 0;
            airb airb = null;
            int n = 0;
            Label_0126: {
                if (ab != null && ((agzd)ab).rs((agyr)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)) {
                    final LightweightCameraEndpointOuterClass$LightweightCameraEndpoint lightweightCameraEndpointOuterClass$LightweightCameraEndpoint = (LightweightCameraEndpointOuterClass$LightweightCameraEndpoint)((agzd)this.aB).rr((agyr)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
                    c = lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.c;
                    if (lightweightCameraEndpointOuterClass$LightweightCameraEndpoint != null && lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.e.size() != 0) {
                        airb = (airb)((agzd)lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.e.get(0)).rr((agyr)CommentStickerRendererOuterClass.commentStickerRenderer);
                    }
                    else {
                        airb = null;
                    }
                    if (airb != null) {
                        n = 1;
                        break Label_0126;
                    }
                }
                else {
                    airb = null;
                }
                n = 0;
            }
            this.al = hhi.bc(n, c * 1000, airb, this.ae, this.e, this.aJ, this.aB);
        }
        this.al.aT((hhg)this);
        this.aS((br)this.al, "cameraFragment");
        this.d.sendEmptyMessage(3);
        if (this.ao != null) {
            this.b.post((Runnable)new hcp(this, 8));
        }
        final acsu ak = this.ak;
        if (ak != null) {
            ak.aK((acst)null);
            this.ak = null;
        }
    }
    
    public final void aW(final RecordingInfo recordingInfo, aioe aioe, int d) {
        this.aT(true);
        final HashMap hashMap = new HashMap();
        hashMap.put("fragment_tag", "reelEditFragment2");
        hashMap.put("recording_info", recordingInfo);
        hashMap.put("kazoo_effects_loader", this.af);
        hashMap.put("destination_endpoint", this.aB);
        hashMap.put("comment_sticker", this.an);
        final acsu ak = this.ak;
        if (ak != null) {
            ak.aK((acst)null);
            this.ak = null;
        }
        final wwv q = this.q();
        if (1 != d) {
            d = 39304;
        }
        else {
            d = 18044;
        }
        aioe aioe2 = aioe;
        if (q != null) {
            aioe2 = aioe;
            if (q.a() != null) {
                final agza builder = ((agzi)amob.a).createBuilder();
                final String a = q.a().a;
                builder.copyOnWrite();
                final amob amob = (amob)builder.instance;
                a.getClass();
                amob.b |= 0x1;
                amob.c = a;
                builder.copyOnWrite();
                final amob amob2 = (amob)builder.instance;
                amob2.b |= 0x2;
                amob2.d = d;
                final amob amob3 = (amob)builder.build();
                final agzc agzc = (agzc)((agzi)aioe).toBuilder();
                agzc.e((agyr)amoa.b, amob3);
                agzc.copyOnWrite();
                aioe = (aioe)agzc.instance;
                aioe.b &= 0xFFFFFFFE;
                aioe.c = aioe.a.c;
                aioe2 = (aioe)agzc.build();
            }
        }
        final Dialog ad = this.aD;
        if (ad != null) {
            ad.dismiss();
            this.aD = null;
        }
        this.c.c(aioe2, (Map)hashMap);
    }
    
    public final void aX() {
        (this.aD = new Dialog((Context)((br)this).od(), 2132083468)).setCanceledOnTouchOutside(false);
        this.aD.setContentView(2131625215);
        this.aD.setOnKeyListener((DialogInterface$OnKeyListener)hhj.a);
        if (this.al != null) {
            final ct i = ((br)this).og().i();
            i.n((br)this.al);
            i.a();
        }
        this.aD.show();
    }
    
    public final void aY() {
        final bu od = ((br)this).od();
        if (this.ak == null && od != null) {
            final acss as = this.as;
            as.e(hhl.a);
            as.d(hhl.aA);
            as.f = wya.b(31571);
            as.g = wya.c(31563);
            as.h = wya.c(31570);
            as.i = wya.c(31639);
            int n;
            if (!acsm.j((Context)od)) {
                n = 2132019448;
            }
            else {
                n = 2132019449;
            }
            as.b(n);
            int n2;
            if (!acsm.j((Context)od)) {
                n2 = 2132019450;
            }
            else {
                n2 = 2132019452;
            }
            as.c(n2);
            this.ak = (acsu)as.a();
        }
        this.ak.aK((acst)this);
        int n3;
        if (!this.at.aT()) {
            n3 = 2132083490;
        }
        else {
            n3 = 2132083492;
        }
        this.ak.aL((Context)new ContextThemeWrapper((Context)od, n3));
        this.aS((br)this.ak, "permissionRequestFragment");
    }
    
    public final void aZ() {
        if (this.bi()) {
            final br e = ((br)this).og().e(2131430844);
            if (e != null) {
                if (!(e instanceof acsu)) {
                    final Context nt = ((br)this).nT();
                    int n;
                    if (this.aj.a() == gkm.b) {
                        n = 2132084532;
                    }
                    else {
                        n = 2132084539;
                    }
                    final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(nt, n);
                    wwv n2;
                    if (e instanceof wwu) {
                        n2 = ((wwu)e).n();
                    }
                    else {
                        n2 = null;
                    }
                    if (n2 != null) {
                        n2.l((wxz)new wws(this.ao.o));
                        aibc aibc;
                        if ((aibc = this.ao.h) == null) {
                            aibc = aibc.a;
                        }
                        aibb aibb;
                        if ((aibb = aibc.c) == null) {
                            aibb = aibb.a;
                        }
                        n2.l((wxz)new wws(aibb.w));
                        aibc aibc2;
                        if ((aibc2 = this.ao.i) == null) {
                            aibc2 = aibc.a;
                        }
                        aibb aibb2;
                        if ((aibb2 = aibc2.c) == null) {
                            aibb2 = aibb.a;
                        }
                        n2.l((wxz)new wws(aibb2.w));
                    }
                    abyv.m((Context)contextThemeWrapper, this.ao, this.c, n2, false, (abyu)new imq(this, 1), (Object)null, (acng)null, this.aw);
                }
            }
        }
    }
    
    public final void ba(final aiva ao) {
        this.ao = ao;
        this.aZ();
    }
    
    public final void bb() {
        this.aT(false);
        final hhn aq = this.aq;
        if (aq != null) {
            aq.d();
        }
    }
    
    public final void bc() {
        final hid ac = (hid)((br)this).og().f("reelEditFragment2");
        this.aC = ac;
        if (ac != null) {
            final qpt ay = ac.ay;
            if (ay != null) {
                ((hid)ay.a).bh();
            }
        }
    }
    
    public final void bd() {
        final hid ac = (hid)((br)this).og().f("reelEditFragment2");
        this.aC = ac;
        if (ac != null) {
            final qpt ay = ac.ay;
            if (ay != null) {
                ((hid)ay.a).bb();
            }
        }
    }
    
    public final void be(final agza agza) {
        final yor bk = this.bk();
        if (bk != null) {
            bk.n(agza);
        }
    }
    
    public final boolean bf() {
        return acsm.f((Context)((br)this).od(), hhl.a);
    }
    
    public final boolean bg() {
        return this.aK;
    }
    
    final boolean bi() {
        if (((br)this).aw() && !((br)this).s && !((br)this).H && ((br)this).ar() && ((br)this).au() && ((br)this).od() != null) {
            final View o = ((br)this).O;
            if (o == null) {
                return false;
            }
            final Rect rect = new Rect();
            o.getGlobalVisibleRect(rect);
            final int width = rect.width();
            final DisplayMetrics displayMetrics = new DisplayMetrics();
            ((br)this).od().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            final double n = width;
            final double n2 = displayMetrics.widthPixels;
            Double.isNaN(n2);
            if (n > n2 * 0.1) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean bj() {
        final br e = ((br)this).og().e(2131430844);
        if (e instanceof hhi) {
            ((hhi)e).aQ();
            return true;
        }
        if (e instanceof hid) {
            final hid hid = (hid)e;
            if (hid.am.d) {
                hid.ba();
            }
            else if (hid.ak.j) {
                hid.e();
            }
            else if (hid.an.d) {
                hid.h();
            }
            else {
                final hiy aj = hid.aj;
                if (aj.i) {
                    aj.f();
                }
                else {
                    final hhp al = hid.al;
                    if (!al.c) {
                        hid.af.s(hid.d.f());
                        return true;
                    }
                    al.f();
                }
                hid.bh();
            }
            return true;
        }
        if (e instanceof hjh) {
            ((hjh)e).a.aO();
            return true;
        }
        if (e instanceof acsu) {
            ((acsu)e).r();
            return true;
        }
        return false;
    }
    
    public final ContentResolver n() {
        return ((br)this).od().getContentResolver();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((br)this).od().setRequestedOrientation(1);
    }
    
    public final void oq(Bundle o) {
        super.oq((Bundle)o);
        o = ((br)this).m;
        Label_0064: {
            if (o == null) {
                break Label_0064;
            }
            final byte[] byteArray = ((Bundle)o).getByteArray("navigation_endpoint");
            while (true) {
                if (byteArray == null) {
                    break Label_0044;
                }
                try {
                    this.aB = (aioe)agzi.parseFrom((agzi)aioe.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                    this.aI = ((Bundle)o).getBoolean("modify_window_fullscreen_mode");
                    this.aJ = ((Bundle)o).getBoolean("SWIPE_TO_CAMERA_ENABLED");
                    if (!bh(this.aB)) {
                        tmy.bS((Context)((br)this).od(), 2132019376);
                        o = this.aq;
                        if (o != null) {
                            ((hhn)o).d();
                        }
                    }
                }
                catch (final ahab ahab) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final uet p() {
        return this.ai;
    }
    
    public final void pK(final Bundle bundle) {
        final aonw ae = this.aE;
        final byte[] array = null;
        byte[] byteArray;
        if (ae != null) {
            byteArray = ((agxl)ae).toByteArray();
        }
        else {
            byteArray = null;
        }
        bundle.putByteArray("camera_swazzle_effects_settings_key", byteArray);
        final apjz ag = this.aG;
        byte[] byteArray2;
        if (ag != null) {
            byteArray2 = ((agxl)ag).toByteArray();
        }
        else {
            byteArray2 = null;
        }
        bundle.putByteArray("camera_kazoo_effects_settings_key", byteArray2);
        final apjz ah = this.aH;
        byte[] byteArray3;
        if (ah != null) {
            byteArray3 = ((agxl)ah).toByteArray();
        }
        else {
            byteArray3 = null;
        }
        bundle.putByteArray("edit_kazoo_effects_settings_key", byteArray3);
        final aiva ao = this.ao;
        if (ao != null) {
            bundle.putByteArray("block reel_creation_key", ((agxl)ao).toByteArray());
        }
        final aioe d = this.d.d;
        byte[] byteArray4 = array;
        if (d != null) {
            byteArray4 = ((agxl)d).toByteArray();
        }
        bundle.putByteArray("reel_handler_edit_video_endpoint", byteArray4);
    }
    
    public final wwv q() {
        if (!this.bi()) {
            return null;
        }
        final br e = ((br)this).og().e(2131430844);
        if (e instanceof hhi) {
            return ((hhi)e).c;
        }
        return null;
    }
    
    public final void r() {
        this.aV();
    }
    
    public final void s(final RecordingInfo recordingInfo) {
        this.aw.af((Context)((br)this).od()).setTitle((CharSequence)((br)this).P(2132019396)).setMessage((CharSequence)((br)this).P(2132019393)).setPositiveButton(2132019395, (DialogInterface$OnClickListener)new fbh(this, recordingInfo, 7)).setNegativeButton(2132019394, (DialogInterface$OnClickListener)null).show();
    }
}
