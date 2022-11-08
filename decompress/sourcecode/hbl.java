import android.util.DisplayMetrics;
import android.graphics.Rect;
import java.util.List;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.TimeUnit;
import android.app.AlertDialog$Builder;
import android.app.Activity;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.ShortsCreationTitleRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;
import android.media.CamcorderProfile;
import com.google.protos.youtube.api.innertube.GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand;
import com.google.protos.youtube.api.innertube.ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand;
import android.content.DialogInterface$OnClickListener;
import j$.time.temporal.TemporalAmount;
import j$.time.Instant;
import java.util.HashSet;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
import com.google.protos.youtube.api.innertube.CommentStickerRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import java.util.concurrent.Executor;
import android.content.Context;
import com.google.apps.tiktok.account.AccountId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbl extends hbn implements gwd, hbf, gxs, hft, gxl, hfp
{
    public static final afcr a;
    public static final afcr b;
    public static final aioe c;
    public aagm aA;
    public fzo aB;
    public avt aC;
    public aeby aD;
    public auip aE;
    private asic aG;
    private int aH;
    private boolean aI;
    private boolean aJ;
    public gko ae;
    public vax af;
    public hcx ag;
    public hga ah;
    public wwv ai;
    public tzs aj;
    public tzg ak;
    public ucs al;
    public tzz am;
    public hbk an;
    public AccountId ao;
    public gzw ap;
    public Context aq;
    public final hhm ar;
    public aioe as;
    public aioe at;
    public uab au;
    public uqs av;
    public long aw;
    public boolean ax;
    public int ay;
    public gxa az;
    public Executor d;
    public tze e;
    
    static {
        a = afcr.r((Object)new PermissionDescriptor(0, wya.c(31566), wya.c(31569)));
        b = afcr.s((Object)new PermissionDescriptor(1, wya.c(31564), wya.c(31567)), (Object)new PermissionDescriptor(2, wya.c(31565), wya.c(31568)));
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        agzc.e((agyr)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint, ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.a);
        c = (aioe)agzc.build();
    }
    
    public hbl() {
        this.aw = 0L;
        this.ay = -1;
        this.ar = (hhm)new hhk(this, 1);
    }
    
    public static final aexq bf(final aioe aioe) {
        final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint j = uji.J(aioe);
        if (j != null) {
            for (final anss anss : j.g) {
                if (((agzd)anss).rs((agyr)CommentStickerRendererOuterClass.commentStickerRenderer)) {
                    return aexq.k(((agzd)anss).rr((agyr)CommentStickerRendererOuterClass.commentStickerRenderer));
                }
            }
        }
        return (aexq)aewp.a;
    }
    
    private final void bi(final gvs gvs) {
        gvs.getClass();
        gvs.a().g = (gwd)this;
    }
    
    private final void bj(final hbg hbg) {
        hbg.getClass();
        hbg.ae = (hbf)this;
    }
    
    private final void bk(final br br, final String s) {
        final ct i = ((br)this).og().i();
        this.aO(s);
        i.w(2131430844, br, s);
        i.d();
    }
    
    private final void bl() {
        final bu od = ((br)this).od();
        if (od != null) {
            ((Activity)od).runOnUiThread((Runnable)new gwx(this, 13));
        }
    }
    
    private final void bm(final aioe aioe) {
        hbg ak;
        if ((ak = (hbg)((br)this).og().f("galleryFragment")) == null) {
            ak = hbg.aK(false, aioe, this.ao);
        }
        this.bj(ak);
        this.bk((br)ak, "galleryFragment");
    }
    
    private final void bn() {
        this.bm(avt.Q(this.ai, this.as, 98539));
    }
    
    private final yor bo() {
        final br f = ((br)this).og().f("editFragment");
        if (f instanceof aemu) {
            final Object an = ((aemu)f).aN();
            if (an instanceof umv) {
                return ((umv)an).m();
            }
        }
        return null;
    }
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.K(layoutInflater, viewGroup, bundle);
        final View inflate = layoutInflater.inflate(2131625193, viewGroup, false);
        this.e.b(bundle, this.as);
        this.ak.h(bundle);
        if (bundle != null) {
            this.ax = bundle.getBoolean("gallery_opened_on_create", false);
            final br e = ((br)this).og().e(2131430844);
            if (e instanceof gvs) {
                this.bi((gvs)e);
            }
            else if (e instanceof hbg) {
                this.bj((hbg)e);
            }
        }
        final int a = this.aj.a(bundle);
        int n = 0;
        Label_0478: {
            if ((n = a) == 2) {
                n = a;
                if (this.aj.b() instanceof tzw) {
                    final tzw tzw = (tzw)this.aj.b();
                    if (tzw != null) {
                        final HashSet set = new HashSet();
                        for (final aqyw aqyw : tzw.d) {
                            aqyy aqyy;
                            if ((aqyy = aqyw.n) == null) {
                                aqyy = aqyy.a;
                            }
                            if ((aqyy.b & 0x1) != 0x0) {
                                aqyy aqyy2;
                                if ((aqyy2 = aqyw.n) == null) {
                                    aqyy2 = aqyy.a;
                                }
                                set.add(aqyy2.c);
                            }
                            final aqyy n2 = aqyw.n;
                            aqyy a2;
                            if (n2 == null) {
                                a2 = aqyy.a;
                            }
                            else {
                                a2 = n2;
                            }
                            if ((a2.b & 0x4) != 0x0) {
                                aqyy a3;
                                if ((a3 = n2) == null) {
                                    a3 = aqyy.a;
                                }
                                set.add(a3.e);
                            }
                        }
                        if (!set.isEmpty()) {
                            final Instant n3 = tzw.n;
                            if (n3 != null && Instant.now().isAfter(n3.plus((TemporalAmount)tzw.a))) {
                                final Context aq = this.aq;
                                aq.getClass();
                                final avt ac = this.aC;
                                final gko ae = this.ae;
                                ae.getClass();
                                szc.f();
                                int n4;
                                if (ae.a() == gkm.b) {
                                    n4 = 2132083650;
                                }
                                else {
                                    n4 = 2132083651;
                                }
                                final ex ex = new ex(aq, n4);
                                ex.g((CharSequence)aq.getResources().getString(2132019746));
                                ex.l((CharSequence)aq.getResources().getString(2132019745), (DialogInterface$OnClickListener)null);
                                ex.q();
                                final tuw s = ac.S(wya.c(154845));
                                s.k(true);
                                s.c();
                                this.aj.e(hvr.c(this.as));
                                n = 0;
                                break Label_0478;
                            }
                        }
                    }
                    n = 2;
                }
            }
        }
        this.aG = this.aj.c().aB((asix)new gxt(this, 15));
        final br e2 = ((br)this).og().e(2131430844);
        if (e2 == null || !e2.ar()) {
            final wwv ai = this.ai;
            final wyb b = wya.b(96661);
            final aioe as = this.as;
            alff alff2;
            if (this.aE.bx()) {
                final agza builder = ((agzi)alff.a).createBuilder();
                final CamcorderProfile b2 = uhu.b((int)uhu.a.get(0));
                if (b2 != null) {
                    final agza builder2 = ((agzi)algf.a).createBuilder();
                    final agza builder3 = ((agzi)alfu.a).createBuilder();
                    final int videoFrameWidth = b2.videoFrameWidth;
                    builder3.copyOnWrite();
                    final alfu alfu = (alfu)builder3.instance;
                    alfu.b |= 0x8;
                    alfu.c = videoFrameWidth;
                    final int videoFrameHeight = b2.videoFrameHeight;
                    builder3.copyOnWrite();
                    final alfu alfu2 = (alfu)builder3.instance;
                    alfu2.b |= 0x10;
                    alfu2.d = videoFrameHeight;
                    final int videoFrameRate = b2.videoFrameRate;
                    builder3.copyOnWrite();
                    final alfu alfu3 = (alfu)builder3.instance;
                    alfu3.b |= 0x20;
                    alfu3.e = (float)videoFrameRate;
                    final alfu p3 = (alfu)builder3.build();
                    builder2.copyOnWrite();
                    final algf algf = (algf)builder2.instance;
                    p3.getClass();
                    algf.p = p3;
                    algf.b |= 0x20000;
                    final algf d = (algf)builder2.build();
                    builder.copyOnWrite();
                    final alff alff = (alff)builder.instance;
                    d.getClass();
                    alff.D = d;
                    alff.c |= 0x40000;
                }
                alff2 = (alff)builder.build();
            }
            else {
                alff2 = null;
            }
            ai.b(b, as, alff2);
            final boolean b3 = n != 2;
            final boolean b4 = n == 2;
            final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint j = uji.J(this.as);
            aioe at;
            if (j != null && (j.b & 0x8) != 0x0) {
                if ((at = j.f) == null) {
                    at = aioe.a;
                }
            }
            else {
                at = null;
            }
            if (at != null && (((agzd)at).rs((agyr)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand) || ((agzd)at).rs((agyr)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand))) {
                if (b4) {
                    if (((agzd)at).rs((agyr)GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand)) {
                        if (this.at != null) {
                            trn.b("Unused pending navigation command.");
                        }
                        this.at = at;
                        this.c();
                    }
                    else {
                        this.af.a(at);
                    }
                    this.aX(((br)this).nT());
                }
                else {
                    this.af.a(at);
                }
                return inflate;
            }
            this.ai.l((wxz)new wws(wya.c(99212)));
            this.ai.l((wxz)new wws(wya.c(98539)));
            this.ai.D((wxz)new wws(wya.c(135959)));
            this.ai.D((wxz)new wws(wya.c(135958)));
            final aioe as2 = this.as;
            final tzw tzw2 = (tzw)this.aj.b();
            boolean ax = false;
            Label_1281: {
                Label_1278: {
                    if (!hvr.d(as2)) {
                        if (as2 == null || !((agzd)as2).rs((agyr)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint) || ((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)((agzd)as2).rr((agyr)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)).g.isEmpty()) {
                            Label_1272: {
                                if (as2 != null && ((agzd)as2).rs((agyr)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
                                    final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)((agzd)as2).rr((agyr)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint);
                                    if ((shortsCreationEndpointOuterClass$ShortsCreationEndpoint.b & 0x4) != 0x0) {
                                        final int e3 = shortsCreationEndpointOuterClass$ShortsCreationEndpoint.e;
                                        final int bs = aqql.bs(e3);
                                        if (bs != 0) {
                                            if (bs == 3) {
                                                break Label_1272;
                                            }
                                        }
                                        final int bs2 = aqql.bs(e3);
                                        if (bs2 != 0) {
                                            if (bs2 == 2) {
                                                break Label_1278;
                                            }
                                        }
                                    }
                                }
                                if (tzw2 != null && tzw2.S()) {
                                    break Label_1278;
                                }
                            }
                            ax = true;
                            break Label_1281;
                        }
                    }
                }
                ax = false;
            }
            this.ax = ax;
            final long aw = this.aw;
            if (aw > 0L) {
                if (ax) {
                    final gxa az = this.az;
                    (az.f = az.a.c(alku.aW)).f(aw);
                }
                else {
                    final gxa az2 = this.az;
                    (az2.c = az2.a.c(alku.aT)).f(aw);
                }
            }
            if (this.ax) {
                this.bn();
            }
            else {
                final gvs q = this.q(b3);
                if (n == 0) {
                    final aexq s2 = this.s();
                    if (s2.h()) {
                        this.ak.e();
                        this.ak.o((aocn)s2.c());
                    }
                    final aexq ak = this.aK();
                    if (ak.h() && (((aocx)ak.c()).b & 0x1) != 0x0) {
                        this.au.F(((aocx)ak.c()).c);
                    }
                    final aexq bf = bf(this.as);
                    if (bf.h()) {
                        this.ap.a((airb)bf.c());
                    }
                    this.aV();
                    if (this.aJ) {
                        q.a().bQ.j(30.0f);
                    }
                    n = 0;
                }
                if (b4) {
                    final tzw tzw3 = (tzw)this.au;
                    if (!tzw3.U()) {
                        tzw3.D();
                    }
                    this.aX(((br)this).nT());
                }
                else {
                    this.au.J(hvr.c(this.as));
                }
                if (n == 0) {
                    final tzs aj = this.aj;
                    final uab b5 = aj.b();
                    if (b5 != null) {
                        aj.k(2, b5.q, b5.Y());
                    }
                }
            }
        }
        return inflate;
    }
    
    public final void W() {
        super.W();
        final bu od = ((br)this).od();
        if (this.au != null && od != null && ((Activity)od).isFinishing()) {
            this.au.y();
        }
        asjg.b((AtomicReference)this.aG);
        ((hcy)this.ag).a = null;
    }
    
    public final void Z(final int n, final String[] array, final int[] array2) {
        final uqs av = this.av;
        if (av != null) {
            av.b(n, array, array2);
            return;
        }
        trn.b("No active PermissionRequester to handle PermissionsResult");
    }
    
    public final aexq aK() {
        final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint j = uji.J(this.as);
        if (j != null) {
            for (final anss anss : j.c) {
                if (((agzd)anss).rs((agyr)ShortsCreationTitleRendererOuterClass.shortsCreationTitleRenderer)) {
                    return aexq.k(((agzd)anss).rr((agyr)ShortsCreationTitleRendererOuterClass.shortsCreationTitleRenderer));
                }
            }
        }
        return (aexq)aewp.a;
    }
    
    public final void aL(final int n) {
        this.aM(null, n);
    }
    
    final void aM(final Uri p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: aconst_null    
        //     3: astore          4
        //     5: bipush          7
        //     7: istore          5
        //     9: iload_2        
        //    10: ifeq            33
        //    13: iload_2        
        //    14: iconst_5       
        //    15: if_icmpeq       33
        //    18: iload_2        
        //    19: istore          6
        //    21: iload_2        
        //    22: bipush          7
        //    24: if_icmpne       619
        //    27: bipush          7
        //    29: istore_2       
        //    30: goto            33
        //    33: iload_2        
        //    34: ifne            47
        //    37: aload_0        
        //    38: getfield        hbl.al:Lucs;
        //    41: iconst_0       
        //    42: invokeinterface ucs.k:(Z)V
        //    47: iload_2        
        //    48: iconst_5       
        //    49: if_icmpne       68
        //    52: aload_0        
        //    53: getfield        hbl.al:Lucs;
        //    56: iconst_1       
        //    57: invokeinterface ucs.k:(Z)V
        //    62: iconst_5       
        //    63: istore          6
        //    65: goto            71
        //    68: iload_2        
        //    69: istore          6
        //    71: aload_1        
        //    72: ifnonnull       90
        //    75: ldc_w           "Don't have a valid video uri"
        //    78: invokestatic    trn.b:(Ljava/lang/String;)V
        //    81: iload_2        
        //    82: ifne            89
        //    85: aload_0        
        //    86: invokespecial   hbl.bn:()V
        //    89: return         
        //    90: invokestatic    java/lang/Math.random:()D
        //    93: ldc2_w          10.0
        //    96: dmul           
        //    97: invokestatic    java/lang/Math.floor:(D)D
        //   100: dconst_0       
        //   101: dcmpl          
        //   102: ifne            111
        //   105: iconst_1       
        //   106: istore          7
        //   108: goto            114
        //   111: iconst_0       
        //   112: istore          7
        //   114: aload_0        
        //   115: getfield        hbl.az:Lgxa;
        //   118: astore          4
        //   120: aload           4
        //   122: aload           4
        //   124: getfield        gxa.a:Lwyo;
        //   127: getstatic       alku.aV:Lalku;
        //   130: invokeinterface wyo.b:(Lalku;)Lwyn;
        //   135: putfield        gxa.d:Lwyn;
        //   138: aload_0        
        //   139: invokevirtual   br.od:()Lbu;
        //   142: astore          4
        //   144: aload           4
        //   146: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   149: pop            
        //   150: aload           4
        //   152: aload_1        
        //   153: invokestatic    lhz.c:(Landroid/content/Context;Landroid/net/Uri;)Lcom/google/android/libraries/video/media/VideoMetaData;
        //   156: astore          4
        //   158: iconst_1       
        //   159: istore          8
        //   161: goto            220
        //   164: astore          4
        //   166: goto            176
        //   169: astore          4
        //   171: goto            176
        //   174: astore          4
        //   176: ldc_w           "Failed to parse the video file"
        //   179: aload           4
        //   181: invokestatic    trn.d:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   184: iload           7
        //   186: ifeq            214
        //   189: getstatic       zjo.a:Lzjo;
        //   192: getstatic       zjn.f:Lzjn;
        //   195: ldc_w           "[ShortsCreation][Android][GalleryParse]"
        //   198: aload           4
        //   200: invokestatic    uji.b:(Ljava/lang/Throwable;)Ljava/lang/String;
        //   203: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   206: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   209: aload           4
        //   211: invokestatic    zjp.c:(Lzjo;Lzjn;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   214: aconst_null    
        //   215: astore          4
        //   217: iconst_0       
        //   218: istore          8
        //   220: iload           8
        //   222: ifeq            1027
        //   225: aload_0        
        //   226: getfield        hbl.aE:Lauip;
        //   229: getfield        auip.c:Ljava/lang/Object;
        //   232: checkcast       Luyi;
        //   235: ldc2_w          45355138
        //   238: invokevirtual   uyi.l:(J)Lashe;
        //   241: invokevirtual   ashe.aG:()Ljava/lang/Object;
        //   244: checkcast       Ljava/lang/Boolean;
        //   247: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   250: ifeq            486
        //   253: aload_0        
        //   254: invokevirtual   br.od:()Lbu;
        //   257: astore          9
        //   259: aload           9
        //   261: aload_1        
        //   262: lconst_0       
        //   263: lconst_0       
        //   264: invokestatic    rbz.i:(Landroid/content/Context;Landroid/net/Uri;JJ)Lrbz;
        //   267: astore          9
        //   269: aload           9
        //   271: getfield        rbz.a:Landroid/content/Context;
        //   274: astore          10
        //   276: aload           9
        //   278: getfield        rbz.b:Landroid/net/Uri;
        //   281: astore          11
        //   283: aload           11
        //   285: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   288: pop            
        //   289: aload           10
        //   291: aload           11
        //   293: invokestatic    rbz.h:(Landroid/content/Context;Landroid/net/Uri;)Ldps;
        //   296: astore          10
        //   298: aload           9
        //   300: aconst_null    
        //   301: aload           10
        //   303: invokevirtual   dps.a:()Ldqm;
        //   306: invokevirtual   rbz.c:(Ldps;Ldqm;)Ljava/util/List;
        //   309: pop            
        //   310: aload           10
        //   312: invokevirtual   ardh.close:()V
        //   315: goto            486
        //   318: astore          9
        //   320: aload           10
        //   322: invokevirtual   ardh.close:()V
        //   325: goto            364
        //   328: astore          10
        //   330: ldc_w           Ljava/lang/Throwable;.class
        //   333: ldc_w           "addSuppressed"
        //   336: iconst_1       
        //   337: anewarray       Ljava/lang/Class;
        //   340: dup            
        //   341: iconst_0       
        //   342: ldc_w           Ljava/lang/Throwable;.class
        //   345: aastore        
        //   346: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   349: aload           9
        //   351: iconst_1       
        //   352: anewarray       Ljava/lang/Object;
        //   355: dup            
        //   356: iconst_0       
        //   357: aload           10
        //   359: aastore        
        //   360: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   363: pop            
        //   364: aload           9
        //   366: athrow         
        //   367: astore          9
        //   369: aload           9
        //   371: instanceof      Lqww;
        //   374: ifeq            380
        //   377: aload           9
        //   379: athrow         
        //   380: new             Lqww;
        //   383: astore          10
        //   385: aload           10
        //   387: aload           9
        //   389: getstatic       qwv.h:Lqwv;
        //   392: invokespecial   qww.<init>:(Ljava/lang/Throwable;Lqwv;)V
        //   395: aload           10
        //   397: athrow         
        //   398: astore          9
        //   400: goto            405
        //   403: astore          9
        //   405: ldc_w           "Building trimmed ISO file will fail"
        //   408: aload           9
        //   410: invokestatic    trn.d:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   413: iload           7
        //   415: ifeq            432
        //   418: getstatic       zjo.a:Lzjo;
        //   421: getstatic       zjn.f:Lzjn;
        //   424: ldc_w           "[ShortsCreation][Android][GalleryParse]MP4Parser failed to build ISO file."
        //   427: aload           9
        //   429: invokestatic    zjp.c:(Lzjo;Lzjn;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   432: aload_0        
        //   433: getfield        hbl.aE:Lauip;
        //   436: getfield        auip.c:Ljava/lang/Object;
        //   439: checkcast       Luyi;
        //   442: ldc2_w          45355139
        //   445: invokevirtual   uyi.l:(J)Lashe;
        //   448: invokevirtual   ashe.aG:()Ljava/lang/Object;
        //   451: checkcast       Ljava/lang/Boolean;
        //   454: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   457: ifeq            473
        //   460: aload_0        
        //   461: getfield        hbl.aB:Lfzo;
        //   464: getstatic       apfp.aM:Lapfp;
        //   467: invokevirtual   fzo.L:(Lapfp;)V
        //   470: goto            1027
        //   473: aload_0        
        //   474: getfield        hbl.aB:Lfzo;
        //   477: getstatic       apfp.aL:Lapfp;
        //   480: invokevirtual   fzo.L:(Lapfp;)V
        //   483: goto            486
        //   486: iload_2        
        //   487: istore          7
        //   489: iload           7
        //   491: ifne            569
        //   494: aload_0        
        //   495: getfield        hbl.aj:Ltzs;
        //   498: astore          9
        //   500: aload           4
        //   502: getfield        com/google/android/libraries/video/media/VideoMetaData.a:Landroid/net/Uri;
        //   505: astore          10
        //   507: aload_0        
        //   508: getfield        hbl.as:Laioe;
        //   511: invokestatic    hvr.c:(Laioe;)Laocs;
        //   514: astore_1       
        //   515: aload           9
        //   517: getfield        tzs.b:Ljava/lang/Object;
        //   520: checkcast       Latid;
        //   523: invokevirtual   atid.aF:()Ljava/lang/Object;
        //   526: checkcast       Luab;
        //   529: astore_3       
        //   530: aload_3        
        //   531: ifnull          538
        //   534: aload_3        
        //   535: invokevirtual   uab.y:()V
        //   538: aload           10
        //   540: aload           9
        //   542: getfield        tzs.c:Ljava/lang/Object;
        //   545: checkcast       Lacko;
        //   548: invokevirtual   acko.c:()Ljava/lang/String;
        //   551: invokestatic    uac.d:(Landroid/net/Uri;Ljava/lang/String;)Luac;
        //   554: astore_3       
        //   555: aload_3        
        //   556: aload_1        
        //   557: invokevirtual   uab.J:(Laocs;)V
        //   560: aload           9
        //   562: aload_3        
        //   563: invokevirtual   tzs.h:(Luab;)V
        //   566: goto            591
        //   569: iload           7
        //   571: istore_2       
        //   572: iload           7
        //   574: iconst_5       
        //   575: if_icmpeq       594
        //   578: iload           7
        //   580: bipush          7
        //   582: if_icmpne       591
        //   585: bipush          7
        //   587: istore_2       
        //   588: goto            594
        //   591: goto            619
        //   594: aload_0        
        //   595: getfield        hbl.aj:Ltzs;
        //   598: invokevirtual   tzs.b:()Luab;
        //   601: astore_1       
        //   602: aload_1        
        //   603: invokestatic    uab.ab:(Luab;)Z
        //   606: ifeq            616
        //   609: aload_1        
        //   610: checkcast       Ltzw;
        //   613: invokevirtual   tzw.L:()V
        //   616: iload_2        
        //   617: istore          6
        //   619: iload           6
        //   621: ifeq            691
        //   624: iload           6
        //   626: iconst_2       
        //   627: if_icmpeq       684
        //   630: iload           6
        //   632: iconst_4       
        //   633: if_icmpeq       677
        //   636: iload           6
        //   638: iconst_5       
        //   639: if_icmpeq       691
        //   642: iload           6
        //   644: bipush          6
        //   646: if_icmpeq       670
        //   649: iload           6
        //   651: bipush          7
        //   653: if_icmpeq       663
        //   656: ldc_w           96644
        //   659: istore_2       
        //   660: goto            695
        //   663: ldc_w           128645
        //   666: istore_2       
        //   667: goto            695
        //   670: ldc_w           129088
        //   673: istore_2       
        //   674: goto            695
        //   677: ldc_w           96638
        //   680: istore_2       
        //   681: goto            695
        //   684: ldc_w           96643
        //   687: istore_2       
        //   688: goto            695
        //   691: ldc_w           97092
        //   694: istore_2       
        //   695: aload_0        
        //   696: invokevirtual   hbl.r:()Lwwv;
        //   699: getstatic       hbl.c:Laioe;
        //   702: iload_2        
        //   703: invokestatic    avt.Q:(Lwwv;Laioe;I)Laioe;
        //   706: astore_1       
        //   707: iload           6
        //   709: iconst_3       
        //   710: if_icmpeq       1016
        //   713: iload           6
        //   715: iconst_1       
        //   716: if_icmpeq       1016
        //   719: iload           6
        //   721: iconst_2       
        //   722: if_icmpne       728
        //   725: goto            1016
        //   728: aload_0        
        //   729: getfield        hbl.aH:I
        //   732: istore          7
        //   734: ldc_w           60000
        //   737: istore_2       
        //   738: iload           6
        //   740: iconst_5       
        //   741: if_icmpeq       779
        //   744: iload           6
        //   746: bipush          6
        //   748: if_icmpne       754
        //   751: goto            779
        //   754: iload           6
        //   756: bipush          7
        //   758: if_icmpne       776
        //   761: aload_0        
        //   762: getfield        hbl.am:Ltzz;
        //   765: getfield        tzz.c:I
        //   768: istore_2       
        //   769: iload           5
        //   771: istore          6
        //   773: goto            802
        //   776: goto            806
        //   779: aload_0        
        //   780: invokevirtual   hbl.o:()Lgvs;
        //   783: astore          9
        //   785: aload           9
        //   787: ifnull          802
        //   790: aload           9
        //   792: invokevirtual   gvs.a:()Lgwg;
        //   795: getfield        gwg.t:Ltzz;
        //   798: invokevirtual   tzz.a:()I
        //   801: istore_2       
        //   802: bipush          100
        //   804: istore          7
        //   806: iload           6
        //   808: bipush          6
        //   810: if_icmpne       895
        //   813: aload_0        
        //   814: getfield        hbl.ag:Lhcx;
        //   817: checkcast       Lhcy;
        //   820: astore          9
        //   822: aload           9
        //   824: getfield        hcy.b:Lcom/google/apps/tiktok/account/AccountId;
        //   827: astore          4
        //   829: new             Lhea;
        //   832: dup            
        //   833: invokespecial   hea.<init>:()V
        //   836: astore_3       
        //   837: new             Landroid/os/Bundle;
        //   840: dup            
        //   841: invokespecial   android/os/Bundle.<init>:()V
        //   844: astore          10
        //   846: aload_1        
        //   847: ifnull          862
        //   850: aload           10
        //   852: ldc_w           "SHORTS_CLIP_TRIM_COMMAND_KEY"
        //   855: aload_1        
        //   856: invokevirtual   agxl.toByteArray:()[B
        //   859: invokevirtual   android/os/Bundle.putByteArray:(Ljava/lang/String;[B)V
        //   862: aload_3        
        //   863: iload           7
        //   865: putfield        hea.c:I
        //   868: aload_3        
        //   869: iload_2        
        //   870: putfield        hea.d:I
        //   873: aload_3        
        //   874: aload           10
        //   876: invokevirtual   hea.ag:(Landroid/os/Bundle;)V
        //   879: aload_3        
        //   880: aload           4
        //   882: invokestatic    aenz.e:(Lbr;Lcom/google/apps/tiktok/account/AccountId;)V
        //   885: aload           9
        //   887: aload_3        
        //   888: ldc_w           "clipEditFragment"
        //   891: invokevirtual   hcy.b:(Lbr;Ljava/lang/String;)V
        //   894: return         
        //   895: aload_0        
        //   896: invokevirtual   hbl.aZ:()V
        //   899: aload_0        
        //   900: getfield        hbl.ag:Lhcx;
        //   903: checkcast       Lhcy;
        //   906: astore_3       
        //   907: aload_3        
        //   908: getfield        hcy.b:Lcom/google/apps/tiktok/account/AccountId;
        //   911: astore          9
        //   913: new             Lhek;
        //   916: dup            
        //   917: invokespecial   hek.<init>:()V
        //   920: astore          11
        //   922: new             Landroid/os/Bundle;
        //   925: dup            
        //   926: invokespecial   android/os/Bundle.<init>:()V
        //   929: astore          10
        //   931: aload_1        
        //   932: ifnull          947
        //   935: aload           10
        //   937: ldc_w           "SHORTS_EDIT_VIDEO_ENDPOINT"
        //   940: aload_1        
        //   941: invokevirtual   agxl.toByteArray:()[B
        //   944: invokevirtual   android/os/Bundle.putByteArray:(Ljava/lang/String;[B)V
        //   947: aload           10
        //   949: ldc_w           "max_hardware_decoders"
        //   952: iconst_2       
        //   953: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   956: aload           10
        //   958: ldc_w           "max_video_length_ms"
        //   961: iload_2        
        //   962: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   965: aload           10
        //   967: ldc_w           "min_video_length_ms"
        //   970: iload           7
        //   972: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   975: aload           10
        //   977: ldc_w           "navigation_source_key"
        //   980: iload           6
        //   982: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   985: aload           11
        //   987: aload           4
        //   989: putfield        hek.c:Lcom/google/android/libraries/video/media/VideoMetaData;
        //   992: aload           11
        //   994: aload           10
        //   996: invokevirtual   hek.ag:(Landroid/os/Bundle;)V
        //   999: aload           11
        //  1001: aload           9
        //  1003: invokestatic    aenz.e:(Lbr;Lcom/google/apps/tiktok/account/AccountId;)V
        //  1006: aload_3        
        //  1007: aload           11
        //  1009: ldc_w           "trimFragment"
        //  1012: invokevirtual   hcy.b:(Lbr;Ljava/lang/String;)V
        //  1015: return         
        //  1016: aload_0        
        //  1017: getfield        hbl.ag:Lhcx;
        //  1020: aload_1        
        //  1021: invokeinterface hcx.a:(Laioe;)V
        //  1026: return         
        //  1027: aload_0        
        //  1028: invokevirtual   hbl.r:()Lwwv;
        //  1031: astore          4
        //  1033: aload           4
        //  1035: ifnull          1229
        //  1038: getstatic       alff.a:Lalff;
        //  1041: invokevirtual   agzi.createBuilder:()Lagza;
        //  1044: astore          9
        //  1046: getstatic       algf.a:Lalgf;
        //  1049: invokevirtual   agzi.createBuilder:()Lagza;
        //  1052: astore          10
        //  1054: getstatic       algc.a:Lalgc;
        //  1057: invokevirtual   agzi.createBuilder:()Lagza;
        //  1060: astore          12
        //  1062: aload           12
        //  1064: invokevirtual   agza.copyOnWrite:()V
        //  1067: aload           12
        //  1069: getfield        agza.instance:Lagzi;
        //  1072: checkcast       Lalgc;
        //  1075: astore          11
        //  1077: aload           11
        //  1079: aload           11
        //  1081: getfield        algc.b:I
        //  1084: iconst_4       
        //  1085: ior            
        //  1086: putfield        algc.b:I
        //  1089: aload           11
        //  1091: iconst_0       
        //  1092: putfield        algc.d:Z
        //  1095: aload           12
        //  1097: invokevirtual   agza.build:()Lagzi;
        //  1100: checkcast       Lalgc;
        //  1103: astore          12
        //  1105: aload           10
        //  1107: invokevirtual   agza.copyOnWrite:()V
        //  1110: aload           10
        //  1112: getfield        agza.instance:Lagzi;
        //  1115: checkcast       Lalgf;
        //  1118: astore          11
        //  1120: aload           12
        //  1122: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1125: pop            
        //  1126: aload           11
        //  1128: aload           12
        //  1130: putfield        algf.c:Lalgc;
        //  1133: aload           11
        //  1135: aload           11
        //  1137: getfield        algf.b:I
        //  1140: iconst_2       
        //  1141: ior            
        //  1142: putfield        algf.b:I
        //  1145: aload           10
        //  1147: invokevirtual   agza.build:()Lagzi;
        //  1150: checkcast       Lalgf;
        //  1153: astore          11
        //  1155: aload           9
        //  1157: invokevirtual   agza.copyOnWrite:()V
        //  1160: aload           9
        //  1162: getfield        agza.instance:Lagzi;
        //  1165: checkcast       Lalff;
        //  1168: astore          10
        //  1170: aload           11
        //  1172: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1175: pop            
        //  1176: aload           10
        //  1178: aload           11
        //  1180: putfield        alff.D:Lalgf;
        //  1183: aload           10
        //  1185: aload           10
        //  1187: getfield        alff.c:I
        //  1190: ldc_w           262144
        //  1193: ior            
        //  1194: putfield        alff.c:I
        //  1197: aload           9
        //  1199: invokevirtual   agza.build:()Lagzi;
        //  1202: checkcast       Lalff;
        //  1205: astore          9
        //  1207: aload           4
        //  1209: new             Lwws;
        //  1212: dup            
        //  1213: ldc_w           97092
        //  1216: invokestatic    wya.c:(I)Lwyb;
        //  1219: invokespecial   wws.<init>:(Lwyb;)V
        //  1222: aload           9
        //  1224: invokeinterface wwv.w:(Lwxz;Lalff;)V
        //  1229: aload_0        
        //  1230: getfield        hbl.aq:Landroid/content/Context;
        //  1233: ldc_w           2132019766
        //  1236: iconst_1       
        //  1237: invokestatic    android/widget/Toast.makeText:(Landroid/content/Context;II)Landroid/widget/Toast;
        //  1240: invokevirtual   android/widget/Toast.show:()V
        //  1243: iload_2        
        //  1244: iconst_5       
        //  1245: if_icmpeq       1587
        //  1248: aload_0        
        //  1249: invokevirtual   hbl.r:()Lwwv;
        //  1252: astore          9
        //  1254: aload_3        
        //  1255: astore          4
        //  1257: aload           9
        //  1259: ifnull          1376
        //  1262: aload_3        
        //  1263: astore          4
        //  1265: aload           9
        //  1267: invokeinterface wwv.a:()Lcom/google/android/libraries/youtube/logging/interaction/InteractionLoggingScreen;
        //  1272: ifnull          1376
        //  1275: getstatic       amob.a:Lamob;
        //  1278: invokevirtual   agzi.createBuilder:()Lagza;
        //  1281: astore          4
        //  1283: aload           9
        //  1285: invokeinterface wwv.a:()Lcom/google/android/libraries/youtube/logging/interaction/InteractionLoggingScreen;
        //  1290: getfield        com/google/android/libraries/youtube/logging/interaction/InteractionLoggingScreen.a:Ljava/lang/String;
        //  1293: astore          9
        //  1295: aload           4
        //  1297: invokevirtual   agza.copyOnWrite:()V
        //  1300: aload           4
        //  1302: getfield        agza.instance:Lagzi;
        //  1305: checkcast       Lamob;
        //  1308: astore_3       
        //  1309: aload           9
        //  1311: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1314: pop            
        //  1315: aload_3        
        //  1316: aload_3        
        //  1317: getfield        amob.b:I
        //  1320: iconst_1       
        //  1321: ior            
        //  1322: putfield        amob.b:I
        //  1325: aload_3        
        //  1326: aload           9
        //  1328: putfield        amob.c:Ljava/lang/String;
        //  1331: aload           4
        //  1333: invokevirtual   agza.copyOnWrite:()V
        //  1336: aload           4
        //  1338: getfield        agza.instance:Lagzi;
        //  1341: checkcast       Lamob;
        //  1344: astore          9
        //  1346: aload           9
        //  1348: aload           9
        //  1350: getfield        amob.b:I
        //  1353: iconst_2       
        //  1354: ior            
        //  1355: putfield        amob.b:I
        //  1358: aload           9
        //  1360: ldc_w           97092
        //  1363: putfield        amob.d:I
        //  1366: aload           4
        //  1368: invokevirtual   agza.build:()Lagzi;
        //  1371: checkcast       Lamob;
        //  1374: astore          4
        //  1376: aload_0        
        //  1377: getfield        hbl.al:Lucs;
        //  1380: iconst_0       
        //  1381: invokeinterface ucs.s:(Z)V
        //  1386: aload_0        
        //  1387: getfield        hbl.al:Lucs;
        //  1390: aload_1        
        //  1391: invokeinterface ucs.r:(Landroid/net/Uri;)V
        //  1396: aload_0        
        //  1397: getfield        hbl.ah:Lhga;
        //  1400: astore          9
        //  1402: invokestatic    hgc.a:()Lhgb;
        //  1405: astore_3       
        //  1406: aload_3        
        //  1407: aload_0        
        //  1408: invokevirtual   br.nT:()Landroid/content/Context;
        //  1411: aload_1        
        //  1412: invokestatic    hgd.a:(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
        //  1415: putfield        hgb.k:Ljava/lang/String;
        //  1418: aload_0        
        //  1419: invokevirtual   br.nT:()Landroid/content/Context;
        //  1422: astore          10
        //  1424: lconst_0       
        //  1425: lstore          13
        //  1427: lload           13
        //  1429: lstore          15
        //  1431: aload           10
        //  1433: ifnull          1510
        //  1436: aload           10
        //  1438: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //  1441: aload_1        
        //  1442: iconst_1       
        //  1443: anewarray       Ljava/lang/String;
        //  1446: dup            
        //  1447: iconst_0       
        //  1448: ldc_w           "duration"
        //  1451: aastore        
        //  1452: invokestatic    android/provider/MediaStore$Video.query:(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;)Landroid/database/Cursor;
        //  1455: astore          10
        //  1457: lload           13
        //  1459: lstore          15
        //  1461: aload           10
        //  1463: ifnull          1510
        //  1466: aload           10
        //  1468: invokeinterface android/database/Cursor.moveToFirst:()Z
        //  1473: pop            
        //  1474: aload           10
        //  1476: ldc_w           "duration"
        //  1479: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //  1484: istore_2       
        //  1485: lload           13
        //  1487: lstore          15
        //  1489: iload_2        
        //  1490: iflt            1503
        //  1493: aload           10
        //  1495: iload_2        
        //  1496: invokeinterface android/database/Cursor.getLong:(I)J
        //  1501: lstore          15
        //  1503: aload           10
        //  1505: invokeinterface android/database/Cursor.close:()V
        //  1510: aload_3        
        //  1511: lload           15
        //  1513: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1516: putfield        hgb.i:Ljava/lang/Long;
        //  1519: aload_3        
        //  1520: getstatic       apfo.h:Lapfo;
        //  1523: invokevirtual   hgb.c:(Lapfo;)V
        //  1526: aload_3        
        //  1527: iconst_2       
        //  1528: putfield        hgb.p:I
        //  1531: aload_3        
        //  1532: aload           4
        //  1534: putfield        hgb.c:Lamob;
        //  1537: aload_3        
        //  1538: aload_1        
        //  1539: putfield        hgb.a:Landroid/net/Uri;
        //  1542: aload_3        
        //  1543: aload_0        
        //  1544: getfield        hbl.al:Lucs;
        //  1547: invokeinterface ucs.a:()Ljava/lang/String;
        //  1552: putfield        hgb.n:Ljava/lang/String;
        //  1555: aload_0        
        //  1556: getfield        hbl.au:Luab;
        //  1559: astore_1       
        //  1560: aload_3        
        //  1561: aload_1        
        //  1562: getfield        uab.q:Ljava/lang/String;
        //  1565: putfield        hgb.j:Ljava/lang/String;
        //  1568: aload_3        
        //  1569: aload_1        
        //  1570: invokevirtual   uab.Y:()Lafcr;
        //  1573: putfield        hgb.l:Lafcr;
        //  1576: aload           9
        //  1578: aload_3        
        //  1579: invokevirtual   hgb.a:()Lhgc;
        //  1582: invokeinterface hga.a:(Lhgc;)V
        //  1587: return         
        //  1588: astore          10
        //  1590: goto            364
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  138    158    174    176    Ljava/io/IOException;
        //  138    158    169    174    Ljava/lang/RuntimeException;
        //  138    158    164    169    Ljava/lang/Error;
        //  253    259    403    405    Ljava/io/IOException;
        //  259    269    398    403    Ljava/io/IOException;
        //  269    298    367    398    Any
        //  298    310    318    367    Any
        //  310    315    367    398    Any
        //  320    325    328    364    Any
        //  330    364    1588   1593   Ljava/lang/Exception;
        //  330    364    367    398    Any
        //  364    367    367    398    Any
        //  369    380    398    403    Ljava/io/IOException;
        //  380    398    398    403    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0364:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void aN() {
        this.ai.o((wxz)new wws(wya.c(135959)), (alff)null);
        this.ai.o((wxz)new wws(wya.c(135958)), (alff)null);
    }
    
    public final void aO(String string) {
        if (((br)this).av()) {
            final StringBuilder sb = new StringBuilder("Attempted fragment transaction (");
            sb.append(string);
            sb.append(") after ShortsMainFragment onSaveInstanceState.");
            string = sb.toString();
            trn.b(string);
            zjp.b(zjo.a, zjn.f, "[ShortsCreation][Android][Navigation]".concat(string));
            ((br)this).nT();
        }
    }
    
    public final void aP(final br br) {
        this.aO(br.F);
        final ct i = ((br)this).og().i();
        i.n(br);
        i.d();
    }
    
    public final void aQ(final aqxe aqxe) {
        final yor bo = this.bo();
        if (bo != null) {
            bo.c(aqxe);
        }
    }
    
    public final void aS(final DeviceLocalFile deviceLocalFile, final int n) {
        final Uri f = deviceLocalFile.f();
        final bu od = ((br)this).od();
        String type;
        if (od != null) {
            type = ((Context)od).getContentResolver().getType(f);
        }
        else {
            type = null;
        }
        if (type != null && type.startsWith("video/")) {
            this.bb(deviceLocalFile, n);
            return;
        }
        tmy.bS((Context)((br)this).od(), 2132019439);
    }
    
    public final void aT() {
        this.j();
    }
    
    public final void aU(final aqyx aqyx) {
        final aioe q = avt.Q(this.r(), this.as, 147595);
        final int ordinal = aqyx.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
            this.aj.j();
            this.p(-1, true, q);
            return;
        }
        if (ordinal != 4) {
            return;
        }
        this.aj.j();
        this.ag.a(q);
    }
    
    public final void aV() {
        final uab b = this.aj.b();
        if (b == null) {
            return;
        }
        final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint j = uji.J(this.as);
        Object o;
        if (j != null && (j.b & 0x40) != 0x0) {
            aocq aocq;
            if ((aocq = j.j) == null) {
                aocq = aocq.a;
            }
            o = aexq.k(aocq);
        }
        else {
            o = aewp.a;
        }
        if (((aexq)o).h()) {
            final aocq aocq2 = (aocq)((aexq)o).c();
            b.B(aocq2);
            if ((aocq2.b & 0x2) != 0x0) {
                b.F(aocq2.d);
            }
        }
    }
    
    public final void aW(final int n, final int n2, final wwv wwv) {
        final bu od = ((br)this).od();
        if (od == null) {
            return;
        }
        ((Activity)od).runOnUiThread((Runnable)new awz(this, wwv, n, n2, (Activity)od, 3));
    }
    
    public final void aX(final Context context) {
        final aeby ad = this.aD;
        final Context aq = this.aq;
        int n;
        if (this.ae.a() == gkm.b) {
            n = 2132083650;
        }
        else {
            n = 2132083651;
        }
        final abyy ag = ad.ag(aq, n);
        ((AlertDialog$Builder)ag).setMessage((CharSequence)context.getString(2132019737)).setNegativeButton((CharSequence)context.getString(2132019738), (DialogInterface$OnClickListener)new sln(this, hvr.d(this.as), 1)).setPositiveButton((CharSequence)context.getString(2132019736), (DialogInterface$OnClickListener)new ceg(this, 5));
        ((AlertDialog$Builder)ag).setTitle(2132019739);
        ((AlertDialog$Builder)ag).setCancelable(false);
        final bu od = ((br)this).od();
        if (od != null) {
            ((Activity)od).runOnUiThread((Runnable)new gwx((AlertDialog$Builder)ag, 15));
            this.ai.t((wxz)new wws(wya.c(135959)), (alff)null);
            this.ai.t((wxz)new wws(wya.c(135958)), (alff)null);
        }
    }
    
    public final void aY(final aioe aioe) {
        agot.u(((agzd)aioe).rs((agyr)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand));
        final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand = (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand)((agzd)aioe).rr((agyr)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand);
        this.aZ();
        Object o = null;
        Label_0445: {
            if ((o = ((br)this).og().f("videoIngestionFragment")) == null) {
                wwv wwv;
                if (this.n() == null) {
                    wwv = this.ai;
                }
                else {
                    wwv = this.r();
                }
                final aioe q = avt.Q(wwv, aioe, 99212);
                final long micros = TimeUnit.SECONDS.toMicros(shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.c);
                final AccountId ao = this.ao;
                final hfl hfl = new hfl();
                final Bundle bundle = new Bundle();
                if (q != null) {
                    bundle.putByteArray("VIDEO_INGESTION_COMMAND", ((agxl)q).toByteArray());
                }
                hfl.ag(bundle);
                hfl.al = 1000000L;
                hfl.am = micros;
                hfl.ap = (micros == hfl.a);
                aenz.e((br)hfl, ao);
                if (q != null && ((agzd)q).rs((agyr)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand)) {
                    final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2 = (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand)((agzd)q).rr((agyr)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand);
                    if ((shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.b & 0x2) != 0x0) {
                        int br;
                        if ((br = aqql.br(shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.d)) == 0) {
                            br = 1;
                        }
                        if (--br != 1) {
                            if (br != 2) {
                                if (br != 3) {
                                    if (br != 4) {
                                        hfl.e = null;
                                    }
                                    else {
                                        hfl.e = aqyx.d;
                                    }
                                }
                                else {
                                    hfl.e = aqyx.e;
                                }
                            }
                            else {
                                hfl.e = aqyx.c;
                            }
                        }
                        else {
                            hfl.e = aqyx.b;
                        }
                        if ((shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.b & 0x10) != 0x0) {
                            aock ae;
                            if ((ae = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.g) == null) {
                                ae = aock.a;
                            }
                            hfl.ae = ae;
                            if ((shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.b & 0x8) != 0x0) {
                                hfl.af = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.e;
                                if (shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.f.size() > 0) {
                                    hfl.ag = (aocy)shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.f.get(0);
                                }
                                o = hfl;
                                break Label_0445;
                            }
                            hfl.aL("Missing player params from command endpoint.");
                        }
                        else {
                            hfl.aL("Missing remix source from command endpoint.");
                        }
                    }
                    else {
                        hfl.aL("Missing multimix context from command endpoint.");
                    }
                }
                else {
                    hfl.aL("Missing ShortsCreationVideoIngestionCommand from command endpoint.");
                }
                o = null;
            }
        }
        if (o == null) {
            return;
        }
        final tze e = this.e;
        if (((agzd)aioe).rs((agyr)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand)) {
            final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand3 = (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand)((agzd)aioe).rr((agyr)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand);
            final int b = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand3.b;
            if ((b & 0x2) != 0x0) {
                final int br2 = aqql.br(shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand3.d);
                if (br2 != 0 && br2 == 5 && (b & 0x100) != 0x0) {
                    final String k = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand3.k;
                    final tyr g = e.g;
                    if (g != null) {
                        g.a((tyq)new tzc(e, k), k, (agyc)null);
                    }
                }
            }
        }
        this.bk((br)o, "videoIngestionFragment");
    }
    
    final void aZ() {
        hgd.u((br)this, this.aA, "[ShortsCreation][Android][SegmentImport]");
    }
    
    public final void b() {
        if (!this.ax) {
            this.p(-1, false, avt.Q(this.r(), this.as, 96638));
            return;
        }
        final hbk an = this.an;
        if (an != null) {
            an.g(false);
        }
    }
    
    public final boolean ba(final br br) {
        final bu od = ((br)this).od();
        od.getClass();
        return (od.getSupportFragmentManager() == null || od.getSupportFragmentManager().a() <= 0) && (br.aw() && br instanceof gvs);
    }
    
    public final boolean bb(final DeviceLocalFile p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   br.od:()Lbu;
        //     4: astore_3       
        //     5: aload_1        
        //     6: invokevirtual   com/google/android/libraries/youtube/edit/common/DeviceLocalFile.f:()Landroid/net/Uri;
        //     9: astore_1       
        //    10: new             Landroid/media/MediaMetadataRetriever;
        //    13: dup            
        //    14: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //    17: astore          4
        //    19: aload_3        
        //    20: ifnull          353
        //    23: aload_3        
        //    24: aload_1        
        //    25: invokestatic    qju.e:(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/res/AssetFileDescriptor;
        //    28: astore          5
        //    30: aload           4
        //    32: aload           5
        //    34: invokevirtual   android/content/res/AssetFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    37: invokevirtual   android/media/MediaMetadataRetriever.setDataSource:(Ljava/io/FileDescriptor;)V
        //    40: aload           5
        //    42: ifnull          50
        //    45: aload           5
        //    47: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //    50: aload           4
        //    52: aload_3        
        //    53: aload_1        
        //    54: invokevirtual   android/media/MediaMetadataRetriever.setDataSource:(Landroid/content/Context;Landroid/net/Uri;)V
        //    57: aload           4
        //    59: bipush          9
        //    61: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //    64: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    67: lstore          6
        //    69: aload           4
        //    71: bipush          18
        //    73: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //    76: astore          5
        //    78: aload           5
        //    80: ifnull          93
        //    83: aload           5
        //    85: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    88: istore          8
        //    90: goto            96
        //    93: iconst_0       
        //    94: istore          8
        //    96: aload           4
        //    98: bipush          19
        //   100: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   103: astore          5
        //   105: aload           5
        //   107: ifnull          120
        //   110: aload           5
        //   112: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   115: istore          9
        //   117: goto            123
        //   120: iconst_0       
        //   121: istore          9
        //   123: aload           4
        //   125: bipush          24
        //   127: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   130: astore          5
        //   132: iload           8
        //   134: istore          10
        //   136: iload           9
        //   138: istore          11
        //   140: aload           5
        //   142: ifnull          194
        //   145: aload           5
        //   147: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   150: istore          12
        //   152: iload           12
        //   154: bipush          90
        //   156: if_icmpeq       175
        //   159: iload           8
        //   161: istore          10
        //   163: iload           9
        //   165: istore          11
        //   167: iload           12
        //   169: sipush          270
        //   172: if_icmpne       194
        //   175: iload           8
        //   177: istore          11
        //   179: iload           9
        //   181: istore          10
        //   183: goto            194
        //   186: astore          5
        //   188: iconst_0       
        //   189: istore          10
        //   191: iconst_0       
        //   192: istore          11
        //   194: iload           11
        //   196: istore          8
        //   198: iload           10
        //   200: ifeq            219
        //   203: iload           10
        //   205: istore          9
        //   207: iload           11
        //   209: istore          8
        //   211: iload           11
        //   213: ifne            249
        //   216: iconst_0       
        //   217: istore          8
        //   219: aload           4
        //   221: invokevirtual   android/media/MediaMetadataRetriever.getFrameAtTime:()Landroid/graphics/Bitmap;
        //   224: astore          5
        //   226: iload           10
        //   228: istore          9
        //   230: aload           5
        //   232: ifnull          249
        //   235: aload           5
        //   237: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   240: istore          9
        //   242: aload           5
        //   244: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   247: istore          8
        //   249: invokestatic    com/google/android/libraries/youtube/creation/common/media/ShortsVideoMetadata.e:()Ltux;
        //   252: astore          5
        //   254: aload           5
        //   256: aload_1        
        //   257: invokevirtual   tux.c:(Landroid/net/Uri;)V
        //   260: aload           5
        //   262: iload           9
        //   264: invokevirtual   tux.e:(I)V
        //   267: aload           5
        //   269: iload           8
        //   271: invokevirtual   tux.b:(I)V
        //   274: aload           5
        //   276: lload           6
        //   278: invokevirtual   tux.d:(J)V
        //   281: aload           5
        //   283: invokevirtual   tux.a:()Lcom/google/android/libraries/youtube/creation/common/media/ShortsVideoMetadata;
        //   286: astore          5
        //   288: aload           5
        //   290: astore_1       
        //   291: aload           4
        //   293: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   296: aload           5
        //   298: astore_1       
        //   299: goto            404
        //   302: astore_1       
        //   303: aload           5
        //   305: ifnull          351
        //   308: aload           5
        //   310: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   313: goto            351
        //   316: astore          5
        //   318: ldc_w           Ljava/lang/Throwable;.class
        //   321: ldc_w           "addSuppressed"
        //   324: iconst_1       
        //   325: anewarray       Ljava/lang/Class;
        //   328: dup            
        //   329: iconst_0       
        //   330: ldc_w           Ljava/lang/Throwable;.class
        //   333: aastore        
        //   334: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   337: aload_1        
        //   338: iconst_1       
        //   339: anewarray       Ljava/lang/Object;
        //   342: dup            
        //   343: iconst_0       
        //   344: aload           5
        //   346: aastore        
        //   347: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   350: pop            
        //   351: aload_1        
        //   352: athrow         
        //   353: new             Ljava/io/FileNotFoundException;
        //   356: astore_1       
        //   357: aload_1        
        //   358: ldc_w           "Activity destroyed."
        //   361: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   364: aload_1        
        //   365: athrow         
        //   366: astore_1       
        //   367: goto            469
        //   370: astore_1       
        //   371: ldc_w           "Failed loading video from camera roll."
        //   374: aload_1        
        //   375: invokestatic    trn.d:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   378: aconst_null    
        //   379: astore          5
        //   381: aconst_null    
        //   382: astore_1       
        //   383: aload           4
        //   385: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   388: aload           5
        //   390: astore_1       
        //   391: goto            404
        //   394: astore          5
        //   396: ldc_w           "Failed releasing resources."
        //   399: aload           5
        //   401: invokestatic    trn.d:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   404: aload_1        
        //   405: ifnull          457
        //   408: aload_1        
        //   409: checkcast       Lcom/google/android/libraries/youtube/creation/common/media/$AutoValue_ShortsVideoMetadata;
        //   412: astore_1       
        //   413: aload_1        
        //   414: getfield        com/google/android/libraries/youtube/creation/common/media/$AutoValue_ShortsVideoMetadata.c:I
        //   417: ifeq            457
        //   420: aload_1        
        //   421: getfield        com/google/android/libraries/youtube/creation/common/media/$AutoValue_ShortsVideoMetadata.d:J
        //   424: aload_0        
        //   425: getfield        hbl.aH:I
        //   428: i2l            
        //   429: lcmp           
        //   430: iflt            444
        //   433: aload_0        
        //   434: aload_1        
        //   435: getfield        com/google/android/libraries/youtube/creation/common/media/$AutoValue_ShortsVideoMetadata.a:Landroid/net/Uri;
        //   438: iload_2        
        //   439: invokevirtual   hbl.aM:(Landroid/net/Uri;I)V
        //   442: iconst_1       
        //   443: ireturn        
        //   444: aload_0        
        //   445: invokevirtual   br.od:()Lbu;
        //   448: ldc_w           2132019440
        //   451: invokestatic    tmy.bS:(Landroid/content/Context;I)V
        //   454: goto            467
        //   457: aload_0        
        //   458: invokevirtual   br.od:()Lbu;
        //   461: ldc_w           2132019439
        //   464: invokestatic    tmy.bS:(Landroid/content/Context;I)V
        //   467: iconst_0       
        //   468: ireturn        
        //   469: aload           4
        //   471: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   474: goto            487
        //   477: astore          5
        //   479: ldc_w           "Failed releasing resources."
        //   482: aload           5
        //   484: invokestatic    trn.d:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   487: aload_1        
        //   488: athrow         
        //   489: astore          5
        //   491: goto            351
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  23     30     370    394    Ljava/lang/Exception;
        //  23     30     366    489    Any
        //  30     40     302    353    Any
        //  45     50     370    394    Ljava/lang/Exception;
        //  45     50     366    489    Any
        //  50     69     370    394    Ljava/lang/Exception;
        //  50     69     366    489    Any
        //  69     78     186    194    Ljava/lang/NumberFormatException;
        //  69     78     370    394    Ljava/lang/Exception;
        //  69     78     366    489    Any
        //  83     90     186    194    Ljava/lang/NumberFormatException;
        //  83     90     370    394    Ljava/lang/Exception;
        //  83     90     366    489    Any
        //  96     105    186    194    Ljava/lang/NumberFormatException;
        //  96     105    370    394    Ljava/lang/Exception;
        //  96     105    366    489    Any
        //  110    117    186    194    Ljava/lang/NumberFormatException;
        //  110    117    370    394    Ljava/lang/Exception;
        //  110    117    366    489    Any
        //  123    132    186    194    Ljava/lang/NumberFormatException;
        //  123    132    370    394    Ljava/lang/Exception;
        //  123    132    366    489    Any
        //  145    152    186    194    Ljava/lang/NumberFormatException;
        //  145    152    370    394    Ljava/lang/Exception;
        //  145    152    366    489    Any
        //  219    226    370    394    Ljava/lang/Exception;
        //  219    226    366    489    Any
        //  235    249    370    394    Ljava/lang/Exception;
        //  235    249    366    489    Any
        //  249    288    370    394    Ljava/lang/Exception;
        //  249    288    366    489    Any
        //  291    296    394    404    Ljava/io/IOException;
        //  308    313    316    351    Any
        //  318    351    489    494    Ljava/lang/Exception;
        //  318    351    366    489    Any
        //  351    353    370    394    Ljava/lang/Exception;
        //  351    353    366    489    Any
        //  353    366    370    394    Ljava/lang/Exception;
        //  353    366    366    489    Any
        //  371    378    366    489    Any
        //  383    388    394    404    Ljava/io/IOException;
        //  469    474    477    487    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 236, Size: 236
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void bc() {
    }
    
    public final void bd() {
    }
    
    public final void be(final agza agza) {
        final yor bo = this.bo();
        if (bo != null) {
            bo.n(agza);
        }
    }
    
    public final br c() {
        final br n = this.n();
        if (n == null) {
            final AccountId ao = this.ao;
            final aioe q = avt.Q(this.ai, this.as, 99212);
            final gxi gxi = new gxi();
            arin.g((br)gxi);
            aenz.e((br)gxi, ao);
            final Bundle bundle = new Bundle();
            bundle.putByteArray("NAVIGATION_ENDPOINT", ((agxl)q).toByteArray());
            gxi.ag(bundle);
            aenz.e((br)gxi, ao);
            this.bk((br)gxi, "loadingFragment");
            return (br)gxi;
        }
        return n;
    }
    
    public final void d() {
        if (!this.aI) {
            this.aj.i();
        }
        this.bm(avt.Q(this.r(), this.as, 96638));
    }
    
    public final void e(final DeviceLocalFile deviceLocalFile) {
        this.aS(deviceLocalFile, 0);
    }
    
    public final void g() {
        this.bl();
    }
    
    public final void h() {
        final br f = ((br)this).og().f("editFragment");
        if (f == null) {
            final hbk an = this.an;
            if (an != null) {
                an.g(false);
            }
            return;
        }
        if (!(f instanceof aemu)) {
            throw new RuntimeException("Edit fragment doesn't supply peer class");
        }
        final Object an2 = ((aemu)f).aN();
        if (!(an2 instanceof wwu)) {
            throw new RuntimeException("Edit fragment doesn't supply interaction logger");
        }
        final wwv n = ((wwu)an2).n();
        if (uab.ab(this.au)) {
            this.p(-1, false, avt.Q(n, this.as, 96638));
            return;
        }
        this.aL(4);
    }
    
    public final void j() {
        this.an.g(true);
    }
    
    public final void k() {
        this.d.execute(aesm.h((Runnable)new gwx(this, 14)));
    }
    
    public final void l() {
        this.bl();
    }
    
    public final void m() {
        if (this.aI && uab.af(this.aj.b())) {
            this.aj.j();
        }
        this.aL(3);
    }
    
    public final br n() {
        final br e = ((br)this).og().e(2131430844);
        if (e instanceof gxi) {
            return e;
        }
        return null;
    }
    
    public final void nh() {
        final fcy fcy = new fcy(this, this.r(), 11);
        tcp.o((aum)this, this.aA.b(), (trb)new gzr((trb)fcy, 6), (trb)new gzr((trb)fcy, 7));
    }
    
    public final gvs o() {
        if (!tmy.bP((br)this)) {
            return null;
        }
        final br e = ((br)this).og().e(2131430844);
        if (e != null && tmy.bP(e) && e instanceof gvs) {
            return (gvs)e;
        }
        return null;
    }
    
    public final void oq(final Bundle bundle) {
        super.oq(bundle);
        final Bundle m = ((br)this).m;
        if (m != null) {
            final byte[] byteArray = m.getByteArray("navigation_endpoint");
            if (byteArray != null) {
                try {
                    this.as = (aioe)agzi.parseFrom((agzi)aioe.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                }
                catch (final ahab ahab) {}
            }
        }
        final int bp = this.aE.bp();
        this.aH = this.aE.bq();
        this.aI = this.aE.bv();
        this.aJ = this.aE.bx();
        final tzz am = this.am;
        final int ah = this.aH;
        float float1;
        if (bundle != null) {
            am.a = bundle.getInt("MIN_SEGMENT_DURATION_KEY");
            am.b = bundle.getInt("MIN_PROJECT_DURATION_KEY");
            am.c = bundle.getInt("MAX_PROJECT_DURATION_KEY");
            am.d = bundle.getInt("CURRENT_PROJECT_DURATION_KEY");
            am.e = bundle.getInt("CURRENT_PROJECT_ORIGINAL_DURATION_KEY");
            float1 = bundle.getFloat("SPEED_MULTIPLIER_KEY");
        }
        else {
            am.a = 160;
            am.b = ah;
            am.c = bp;
            float1 = 1.0f;
        }
        am.f = float1;
    }
    
    public final gvs p(final int n, final boolean b, final aioe aioe) {
        this.aZ();
        this.ay = -1;
        gvs n2;
        if ((n2 = (gvs)((br)this).og().f("cameraFragment")) == null) {
            n2 = gwg.N(b, aioe, n, this.ao);
        }
        this.al.s(true);
        this.bk((br)n2, "cameraFragment");
        this.bi(n2);
        return n2;
    }
    
    public final void pK(final Bundle bundle) {
        bundle.putBoolean("gallery_opened_on_create", this.ax);
        final uab au = this.au;
        if (au != null) {
            au.I(bundle);
        }
        final tze e = this.e;
        final aonw b = e.b;
        final byte[] array = null;
        byte[] byteArray;
        if (b != null) {
            byteArray = ((agxl)b).toByteArray();
        }
        else {
            byteArray = null;
        }
        bundle.putByteArray("camera_swazzle_effects_settings_key", byteArray);
        final apjz c = e.c;
        byte[] byteArray2;
        if (c != null) {
            byteArray2 = ((agxl)c).toByteArray();
        }
        else {
            byteArray2 = null;
        }
        bundle.putByteArray("edit_kazoo_effects_settings_key", byteArray2);
        final aodb d = e.d;
        byte[] byteArray3;
        if (d != null) {
            byteArray3 = ((agxl)d).toByteArray();
        }
        else {
            byteArray3 = null;
        }
        bundle.putByteArray("shorts_effect_picker_entry_renderer_key", byteArray3);
        final aodr e2 = e.e;
        byte[] byteArray4 = array;
        if (e2 != null) {
            byteArray4 = ((agxl)e2).toByteArray();
        }
        bundle.putByteArray("shorts_layout_picker_entry_renderer_key", byteArray4);
        final List h = e.h;
        if (h != null) {
            aeda.aw(bundle, "engagement_panel_list_key", h);
        }
        this.ak.i(bundle);
        final tzz am = this.am;
        bundle.putInt("MIN_SEGMENT_DURATION_KEY", am.a);
        bundle.putInt("MIN_PROJECT_DURATION_KEY", am.b);
        bundle.putInt("MAX_PROJECT_DURATION_KEY", am.c);
        bundle.putInt("CURRENT_PROJECT_DURATION_KEY", am.d);
        bundle.putInt("CURRENT_PROJECT_ORIGINAL_DURATION_KEY", am.e);
        bundle.putFloat("SPEED_MULTIPLIER_KEY", am.f);
        bundle.putString("SHORTS_RECENT_PROJECT_ID", (String)this.aj.a);
    }
    
    public final gvs q(final boolean b) {
        return this.p(-1, b, avt.Q(this.ai, this.as, 99212));
    }
    
    public final wwv r() {
        if (((br)this).aw() && !((br)this).s && !((br)this).H && ((br)this).ar() && ((br)this).au() && ((br)this).od() != null) {
            final View o = ((br)this).O;
            if (o != null) {
                final Rect rect = new Rect();
                o.getGlobalVisibleRect(rect);
                final int width = rect.width();
                final DisplayMetrics displayMetrics = new DisplayMetrics();
                ((br)this).od().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                final double n = width;
                final double n2 = displayMetrics.widthPixels;
                Double.isNaN(n2);
                if (n > n2 * 0.1) {
                    final br e = ((br)this).og().e(2131430844);
                    if (e instanceof gvs) {
                        return ((gvs)e).a().j;
                    }
                    if (e instanceof gxr) {
                        return ((gxr)e).a().b;
                    }
                    if (e instanceof hbg) {
                        return ((hbg)e).al;
                    }
                    if (e instanceof hea) {
                        return ((hea)e).aw;
                    }
                    if (e instanceof hef) {
                        return ((hef)e).au;
                    }
                    if (e instanceof hek) {
                        return ((hek)e).an;
                    }
                    if (e instanceof hfl) {
                        return ((hfl)e).ay;
                    }
                    if (e instanceof gxi) {
                        return ((gxi)e).a().b;
                    }
                }
            }
        }
        return null;
    }
    
    public final aexq s() {
        final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint j = uji.J(this.as);
        if (j != null) {
            for (final anss anss : j.c) {
                if (((agzd)anss).rs((agyr)aoco.a)) {
                    return aexq.k(((agzd)anss).rr((agyr)aoco.a));
                }
            }
        }
        return (aexq)aewp.a;
    }
}
