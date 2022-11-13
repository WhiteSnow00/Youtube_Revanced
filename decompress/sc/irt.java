import com.google.android.libraries.youtube.player.ui.PlayerView;
import java.util.function.Consumer;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import j$.util.Optional;
import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.PlayerCollapsedStateMonitor;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import java.util.Locale;
import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irt extends irl implements aeou, arlm, aepp, aetq
{
    public final auo a;
    private iru c;
    private Context d;
    private boolean e;
    
    @Deprecated
    public irt() {
        this.a = new auo((aun)this);
        qdt.h();
    }
    
    public final View K(final LayoutInflater p0, final ViewGroup p1, final Bundle p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        irt.b:Latib;
        //     4: invokevirtual   atib.p:()V
        //     7: aload_0        
        //     8: aload_1        
        //     9: aload_2        
        //    10: aload_3        
        //    11: invokevirtual   aepl.aS:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
        //    14: aload_0        
        //    15: invokevirtual   irt.o:()Liru;
        //    18: astore          6
        //    20: aload           6
        //    22: aload_1        
        //    23: ldc             2131625027
        //    25: aload_2        
        //    26: iconst_0       
        //    27: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    30: checkcast       Landroid/view/ViewGroup;
        //    33: putfield        iru.M:Landroid/view/ViewGroup;
        //    36: aload           6
        //    38: aload           6
        //    40: getfield        iru.M:Landroid/view/ViewGroup;
        //    43: ldc             2131430468
        //    45: invokevirtual   android/view/ViewGroup.findViewById:(I)Landroid/view/View;
        //    48: checkcast       Lcom/google/android/apps/youtube/app/player/YouTubePlayerViewNotForReflection;
        //    51: putfield        iru.R:Lcom/google/android/apps/youtube/app/player/YouTubePlayerViewNotForReflection;
        //    54: aload           6
        //    56: getfield        iru.R:Lcom/google/android/apps/youtube/app/player/YouTubePlayerViewNotForReflection;
        //    59: aload           6
        //    61: getfield        iru.y:Ltqf;
        //    64: invokevirtual   abue.i:(Ltqf;)V
        //    67: aload           6
        //    69: aload           6
        //    71: getfield        iru.F:Lgkx;
        //    74: invokeinterface gkx.a:()Lgkv;
        //    79: putfield        iru.P:Lgkv;
        //    82: aload           6
        //    84: getfield        iru.S:Lvaf;
        //    87: invokevirtual   vaf.b:()Laipx;
        //    90: getfield        aipx.A:Lansd;
        //    93: astore_2       
        //    94: aload_2        
        //    95: astore_1       
        //    96: aload_2        
        //    97: ifnonnull       104
        //   100: getstatic       ansd.a:Lansd;
        //   103: astore_1       
        //   104: aload           6
        //   106: aload_1        
        //   107: getfield        ansd.d:Z
        //   110: putfield        iru.Q:Z
        //   113: aload           6
        //   115: getfield        iru.b:Lkyf;
        //   118: aload_3        
        //   119: invokeinterface kyf.e:(Landroid/os/Bundle;)V
        //   124: aload_3        
        //   125: ifnull          355
        //   128: aload           6
        //   130: getfield        iru.i:Lfbn;
        //   133: astore_1       
        //   134: aload_3        
        //   135: ldc             "background_dialog_type"
        //   137: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //   140: istore          4
        //   142: iload           4
        //   144: ifge            151
        //   147: invokestatic    fbu.b:()[I
        //   150: pop            
        //   151: aload_1        
        //   152: invokestatic    fbu.b:()[I
        //   155: iload           4
        //   157: iaload         
        //   158: putfield        fbn.t:I
        //   161: aload_3        
        //   162: ldc             "background_failed_upsell_dialog"
        //   164: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //   167: istore          5
        //   169: iload           5
        //   171: ifeq            205
        //   174: aload_3        
        //   175: ldc             "background_failed_upsell_dialog"
        //   177: invokevirtual   android/os/Bundle.getByteArray:(Ljava/lang/String;)[B
        //   180: astore_2       
        //   181: invokestatic    com/google/protobuf/ExtensionRegistryLite.getGeneratedRegistry:()Lcom/google/protobuf/ExtensionRegistryLite;
        //   184: astore          7
        //   186: aload_1        
        //   187: getstatic       apip.a:Lapip;
        //   190: aload_2        
        //   191: aload           7
        //   193: invokestatic    ahbh.parseFrom:(Lahbh;[BLcom/google/protobuf/ExtensionRegistryLite;)Lahbh;
        //   196: checkcast       Lapip;
        //   199: putfield        fbn.i:Lapip;
        //   202: goto            334
        //   205: aload_3        
        //   206: ldc             "background_failed_dismissible_dialog"
        //   208: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //   211: istore          5
        //   213: iload           5
        //   215: ifeq            249
        //   218: aload_3        
        //   219: ldc             "background_failed_dismissible_dialog"
        //   221: invokevirtual   android/os/Bundle.getByteArray:(Ljava/lang/String;)[B
        //   224: astore_2       
        //   225: invokestatic    com/google/protobuf/ExtensionRegistryLite.getGeneratedRegistry:()Lcom/google/protobuf/ExtensionRegistryLite;
        //   228: astore          7
        //   230: aload_1        
        //   231: getstatic       ajfd.a:Lajfd;
        //   234: aload_2        
        //   235: aload           7
        //   237: invokestatic    ahbh.parseFrom:(Lahbh;[BLcom/google/protobuf/ExtensionRegistryLite;)Lahbh;
        //   240: checkcast       Lajfd;
        //   243: putfield        fbn.k:Lajfd;
        //   246: goto            334
        //   249: aload_3        
        //   250: ldc             "background_failed_dismissible_snackbar"
        //   252: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //   255: istore          5
        //   257: iload           5
        //   259: ifeq            293
        //   262: aload_3        
        //   263: ldc             "background_failed_dismissible_snackbar"
        //   265: invokevirtual   android/os/Bundle.getByteArray:(Ljava/lang/String;)[B
        //   268: astore_2       
        //   269: invokestatic    com/google/protobuf/ExtensionRegistryLite.getGeneratedRegistry:()Lcom/google/protobuf/ExtensionRegistryLite;
        //   272: astore          7
        //   274: aload_1        
        //   275: getstatic       amsn.a:Lamsn;
        //   278: aload_2        
        //   279: aload           7
        //   281: invokestatic    ahbh.parseFrom:(Lahbh;[BLcom/google/protobuf/ExtensionRegistryLite;)Lahbh;
        //   284: checkcast       Lamsn;
        //   287: putfield        fbn.l:Lamsn;
        //   290: goto            334
        //   293: aload_3        
        //   294: ldc             "background_failed_upsell_dialog_on_elements"
        //   296: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //   299: istore          5
        //   301: iload           5
        //   303: ifeq            334
        //   306: aload_3        
        //   307: ldc             "background_failed_upsell_dialog_on_elements"
        //   309: invokevirtual   android/os/Bundle.getByteArray:(Ljava/lang/String;)[B
        //   312: astore          7
        //   314: invokestatic    com/google/protobuf/ExtensionRegistryLite.getGeneratedRegistry:()Lcom/google/protobuf/ExtensionRegistryLite;
        //   317: astore_2       
        //   318: aload_1        
        //   319: getstatic       aiqm.a:Laiqm;
        //   322: aload           7
        //   324: aload_2        
        //   325: invokestatic    ahbh.parseFrom:(Lahbh;[BLcom/google/protobuf/ExtensionRegistryLite;)Lahbh;
        //   328: checkcast       Laiqm;
        //   331: putfield        fbn.j:Laiqm;
        //   334: aload_1        
        //   335: aload_3        
        //   336: ldc             "background_start_time"
        //   338: invokevirtual   android/os/Bundle.getLong:(Ljava/lang/String;)J
        //   341: putfield        fbn.g:J
        //   344: aload           6
        //   346: aload_3        
        //   347: ldc             "is_player_maximized"
        //   349: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //   352: putfield        iru.O:Z
        //   355: aload           6
        //   357: aload           6
        //   359: getfield        iru.h:Latke;
        //   362: invokeinterface atke.a:()Ljava/lang/Object;
        //   367: checkcast       Lfog;
        //   370: putfield        iru.N:Lfog;
        //   373: aload           6
        //   375: getfield        iru.c:Lkyd;
        //   378: astore_1       
        //   379: new             Lpvh;
        //   382: astore_2       
        //   383: aload_2        
        //   384: aload           6
        //   386: invokespecial   pvh.<init>:(Liru;)V
        //   389: aload_1        
        //   390: aload_2        
        //   391: invokeinterface kyd.l:(Lpvh;)V
        //   396: new             Lpvh;
        //   399: astore_1       
        //   400: aload_1        
        //   401: aload           6
        //   403: aconst_null    
        //   404: invokespecial   pvh.<init>:(Liru;[C)V
        //   407: aload           6
        //   409: aload_1        
        //   410: putfield        iru.Z:Lpvh;
        //   413: aload           6
        //   415: getfield        iru.R:Lcom/google/android/apps/youtube/app/player/YouTubePlayerViewNotForReflection;
        //   418: astore_1       
        //   419: aload_1        
        //   420: ifnull          432
        //   423: aload           6
        //   425: getfield        iru.W:Lrwt;
        //   428: aload_1        
        //   429: putfield        rwt.b:Ljava/lang/Object;
        //   432: aload           6
        //   434: getfield        iru.q:Latke;
        //   437: invokeinterface atke.a:()Ljava/lang/Object;
        //   442: checkcast       Ltrh;
        //   445: aload           6
        //   447: getfield        iru.g:Lcom/google/android/apps/youtube/app/common/player/overlay/YouTubePlayerOverlaysLayout;
        //   450: putfield        trh.b:Ltrf;
        //   453: aload           6
        //   455: aload           6
        //   457: getfield        iru.B:Llhs;
        //   460: invokevirtual   iru.l:(Lfoc;)V
        //   463: aload           6
        //   465: aload           6
        //   467: getfield        iru.C:Liyp;
        //   470: invokevirtual   iru.l:(Lfoc;)V
        //   473: aload           6
        //   475: getfield        iru.A:Lfnv;
        //   478: aload           6
        //   480: invokevirtual   fnv.c:(Lfnu;)V
        //   483: aload           6
        //   485: aload           6
        //   487: getfield        iru.E:Lfvx;
        //   490: invokevirtual   iru.l:(Lfoc;)V
        //   493: aload           6
        //   495: getfield        iru.D:Lfjv;
        //   498: aload           6
        //   500: invokeinterface fjv.l:(Lfju;)V
        //   505: aload           6
        //   507: getfield        iru.R:Lcom/google/android/apps/youtube/app/player/YouTubePlayerViewNotForReflection;
        //   510: astore_1       
        //   511: aload_1        
        //   512: ifnull          526
        //   515: aload           6
        //   517: getfield        iru.D:Lfjv;
        //   520: aload_1        
        //   521: invokeinterface fjv.l:(Lfju;)V
        //   526: aload           6
        //   528: getfield        iru.D:Lfjv;
        //   531: aload           6
        //   533: getfield        iru.g:Lcom/google/android/apps/youtube/app/common/player/overlay/YouTubePlayerOverlaysLayout;
        //   536: invokeinterface fjv.l:(Lfju;)V
        //   541: aload           6
        //   543: getfield        iru.D:Lfjv;
        //   546: aload           6
        //   548: getfield        iru.N:Lfog;
        //   551: invokeinterface fjv.l:(Lfju;)V
        //   556: aload           6
        //   558: getfield        iru.a:Lirt;
        //   561: getfield        irt.a:Lauo;
        //   564: aload           6
        //   566: getfield        iru.z:Lcom/google/android/libraries/youtube/player/features/onesie/BandaidConnectionOpenerController;
        //   569: invokevirtual   aui.b:(Laum;)V
        //   572: aload           6
        //   574: getfield        iru.a:Lirt;
        //   577: getfield        irt.a:Lauo;
        //   580: aload           6
        //   582: getfield        iru.s:Lcom/google/android/apps/youtube/app/watch/nextgenwatch/flexy/PlayerCollapsedStateMonitor;
        //   585: invokevirtual   aui.b:(Laum;)V
        //   588: aload           6
        //   590: getfield        iru.M:Landroid/view/ViewGroup;
        //   593: astore_1       
        //   594: invokestatic    aeux.k:()V
        //   597: aload_1        
        //   598: areturn        
        //   599: astore_1       
        //   600: invokestatic    aeux.k:()V
        //   603: goto            612
        //   606: astore_2       
        //   607: aload_1        
        //   608: aload_2        
        //   609: invokestatic    jgk.p:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   612: aload_1        
        //   613: athrow         
        //   614: astore_2       
        //   615: goto            334
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type  
        //  -----  -----  -----  -----  ------
        //  7      94     599    614    Any
        //  100    104    599    614    Any
        //  104    124    599    614    Any
        //  128    142    599    614    Any
        //  147    151    599    614    Any
        //  151    169    599    614    Any
        //  174    202    614    618    Lahca;
        //  174    202    599    614    Any
        //  205    213    599    614    Any
        //  218    246    614    618    Lahca;
        //  218    246    599    614    Any
        //  249    257    599    614    Any
        //  262    290    614    618    Lahca;
        //  262    290    599    614    Any
        //  293    301    599    614    Any
        //  306    334    614    618    Lahca;
        //  306    334    599    614    Any
        //  334    355    599    614    Any
        //  355    419    599    614    Any
        //  423    432    599    614    Any
        //  432    511    599    614    Any
        //  515    526    599    614    Any
        //  526    594    599    614    Any
        //  600    603    606    612    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0205:
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
    
    @Override
    public final void V(final Activity activity) {
        this.b.p();
        try {
            super.V(activity);
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                jgk.p((Throwable)activity, t);
            }
        }
    }
    
    public final void Y() {
        this.b.p();
        try {
            this.s();
            this.o();
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                jgk.p(t, t2);
            }
        }
    }
    
    public final aeup aM() {
        return (aeup)this.b.c;
    }
    
    @Override
    public final /* bridge */ Object aN() {
        return this.o();
    }
    
    public final Locale aO() {
        return agpi.Z((br)this);
    }
    
    public final void aa() {
        final aett h = this.b.h();
        try {
            this.aK();
            this.o().A.a(1);
            h.close();
        }
        finally {
            try {
                h.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                jgk.p(t, t2);
            }
        }
    }
    
    @Override
    protected final arlc d() {
        return (arlc)aepu.a((br)this);
    }
    
    public final aui getLifecycle() {
        return this.a;
    }
    
    @Override
    public final void lP(final Context context) {
        this.b.p();
        try {
            if (!this.e) {
                super.lP(context);
                if (this.c == null) {
                    try {
                        final Object ar = this.aR();
                        final br a = ((ess)ar).a;
                        if (!(a instanceof irt)) {
                            final String string = iru.class.toString();
                            final String value = String.valueOf(a.getClass());
                            final StringBuilder sb = new StringBuilder("Attempt to inject a Fragment wrapper of type ");
                            sb.append(string);
                            sb.append(", but the wrapper available is of type: ");
                            sb.append(value);
                            sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                            throw new IllegalStateException(sb.toString());
                        }
                        final irt irt = (irt)a;
                        irt.getClass();
                        final kyf kyf = (kyf)((ess)ar).ak.cd.a();
                        final kyd kyd = (kyd)((ess)ar).ak.cd.a();
                        final tqd tqd = (tqd)((ess)ar).b.ix.a();
                        final tgd tgd = (tgd)((ess)ar).b.h.a();
                        final abpu abpu = (abpu)((ess)ar).ak.j.a();
                        final YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout = (YouTubePlayerOverlaysLayout)((ess)ar).ak.bx.a();
                        final atke g = ((ess)ar).ak.a.G;
                        final hmw hmw = (hmw)((ess)ar).R.a();
                        final fbn g2 = ((ess)ar).ak.g();
                        final aaos aaos = (aaos)((ess)ar).b.gl.a();
                        final iro iro = (iro)((abpu)((ess)ar).ak.a.aC.j.a()).j();
                        iro.getClass();
                        final abni abni = (abni)((ess)ar).S.a();
                        final irh irh = (irh)((ess)ar).ak.a.H.a();
                        final rwt rwt = (rwt)((ess)ar).b.lU.a();
                        final aaxx aaxx = (aaxx)((ess)ar).b.iL.a();
                        final wyw wyw = (wyw)((ess)ar).ak.ag.a();
                        final abvi abvi = (abvi)((ess)ar).b.pI.a();
                        final xhp xhp = (xhp)((ess)ar).ak.cf.a();
                        final esp ak = ((ess)ar).ak;
                        final atke am = ak.aM;
                        final atke i = ak.a.I;
                        final aawq aawq = (aawq)ak.R.a();
                        final xnt xnt = (xnt)((ess)ar).b.iG.a();
                        final PlayerCollapsedStateMonitor playerCollapsedStateMonitor = (PlayerCollapsedStateMonitor)((ess)ar).T.a();
                        final irp irp = (irp)((ess)ar).ak.a.J.a();
                        final irp irp2 = (irp)((ess)ar).U.a();
                        final abpq abpq = (abpq)((ess)ar).ak.k.a();
                        final abkx g3 = ((abpu)((ess)ar).ak.a.aC.j.a()).g();
                        g3.getClass();
                        final abpl abpl = (abpl)((ess)ar).ak.bU.a();
                        final aaqz aaqz = (aaqz)((ess)ar).b.a.j.a();
                        final ccb ccb = (ccb)((ess)ar).V.a();
                        final atke bt = ((ess)ar).ak.bT;
                        final fgt fgt = (fgt)((ess)ar).b.a.cB.a();
                        final gml gml = (gml)((ess)ar).ak.eH.a();
                        final tqf tqf = (tqf)((ess)ar).ak.n.a();
                        final BandaidConnectionOpenerController bandaidConnectionOpenerController = (BandaidConnectionOpenerController)((ess)ar).b.a.cq.a();
                        final atke cu = ((ess)ar).b.a.cu;
                        final fnv fnv = (fnv)((ess)ar).ak.L.a();
                        final lhs lhs = (lhs)((ess)ar).ak.aN.a();
                        final qv qv = (qv)((ess)ar).ak.aA.a();
                        final liq liq = (liq)((ess)ar).ak.K.a();
                        final fjv fjv = (fjv)((ess)ar).ak.z.a();
                        final vaf vaf = (vaf)((ess)ar).b.w.a();
                        final arwh arwh = (arwh)((ess)ar).b.v.a();
                        final vai vai = (vai)((ess)ar).ak.dn.a();
                        final Executor executor = (Executor)((ess)ar).b.F.a();
                        final fvx fvx = (fvx)((ess)ar).b.a.e.a();
                        final vwa zz = ((ess)ar).ak.zZ();
                        final gkx gkx = (gkx)((ess)ar).b.fr.a();
                        final abbf abbf = (abbf)((ess)ar).b.a.cz.a();
                        final hox hox = (hox)((ess)ar).ak.aw.a();
                        this.c = new iru(irt, kyf, kyd, tqd, tgd, abpu, youTubePlayerOverlaysLayout, g, hmw, g2, aaos, iro, abni, irh, rwt, aaxx, wyw, abvi, xhp, am, i, aawq, xnt, playerCollapsedStateMonitor, irp, irp2, abpq, g3, abpl, aaqz, ccb, bt, fgt, gml, tqf, bandaidConnectionOpenerController, cu, fnv, lhs, qv, liq, fjv, vaf, arwh, vai, executor, fvx, zz, gkx, (Optional)((ess)ar).ak.r.a(), (xbv)((ess)ar).b.ip.a(), ((ess)ar).ak.bm(), (vwa)((ess)ar).b.fQ.a(), (iyp)((ess)ar).ak.bm.a(), (elx)((ess)ar).b.a.eu.a(), (abrj)((ess)ar).b.ed.a(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                        ((br)this).X.b((aum)new TracedFragmentLifecycle(this.b, this.a, null));
                    }
                    catch (final ClassCastException ex) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", ex);
                    }
                }
                aeux.k();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                jgk.p(t, t2);
            }
        }
    }
    
    @Override
    public final Context nT() {
        if (super.nT() != null) {
            if (this.d == null) {
                this.d = (Context)new aepq((br)this, super.nT());
            }
            return this.d;
        }
        return null;
    }
    
    public final LayoutInflater nj(final Bundle bundle) {
        this.b.p();
        try {
            final LayoutInflater aa = ((br)this).aA();
            final LayoutInflater cloneInContext = aa.cloneInContext((Context)arlc.f(aa, (br)this));
            final LayoutInflater cloneInContext2 = cloneInContext.cloneInContext((Context)new aepq((br)this, cloneInContext));
            aeux.k();
            return cloneInContext2;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t;
                jgk.p((Throwable)bundle, t);
            }
        }
    }
    
    public final void nm() {
        final aett f = this.b.f();
        try {
            this.q();
            final iru o = this.o();
            o.X.f();
            final YouTubePlayerViewNotForReflection r = o.R;
            if (r != null) {
                ((PlayerView)r).m();
            }
            o.W.b = null;
            o.v.c.clear();
            o.J.remove(o.E);
            if (o.Y.B(o)) {
                o.Y.a = null;
            }
            f.close();
        }
        finally {
            try {
                f.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                jgk.p(t, t2);
            }
        }
    }
    
    public final void nn() {
        final aett g = this.b.g();
        try {
            this.r();
            this.e = true;
            g.close();
        }
        finally {
            try {
                g.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                jgk.p(t, t2);
            }
        }
    }
    
    public final void no() {
        this.b.p();
        try {
            this.aL();
            final iru o = this.o();
            o.o.a((abvh)o);
            ((Optional)o.w.a()).ifPresent((Consumer)new inj(o, 3));
            o.e.d((Object)new fio());
            o.I.f(o.lX(o.f));
            final aaos j = o.j;
            if (!j.d) {
                j.lX(j.b);
                j.d = true;
            }
            final irp u = o.U;
            u.a.l(u);
            final irp t = o.t;
            t.a.l(t);
            final iro k = o.k;
            k.d = o.l;
            k.a = o.m;
            o.A.a(0);
            if (o.T.f(45365562L) && o.R != null && o.G.isPresent()) {
                final YouTubePlayerViewNotForReflection r = o.R;
                final asiq i = o.I;
                final asht a = ((hsi)o.G.get()).a();
                r.getClass();
                i.c(a.aH((asjm)new ihl(r, 20)));
            }
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t2;
                final Throwable t3;
                jgk.p(t2, t3);
            }
        }
    }
    
    public final void np() {
        this.b.p();
        try {
            this.aQ();
            final iru o = this.o();
            o.A.a(4);
            o.o.a((abvh)null);
            final iro k = o.k;
            k.d = null;
            k.a = null;
            o.I.b();
            final irp u = o.U;
            u.a.n(u);
            final irp t = o.t;
            t.a.n(t);
            ((Optional)o.w.a()).ifPresent((Consumer)new inj(o, 2));
            aeux.k();
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t2;
                final Throwable t3;
                jgk.p(t2, t3);
            }
        }
    }
    
    public final iru o() {
        final iru c = this.c;
        if (c == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.e) {
            return c;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final void pP(final Bundle bundle) {
        this.b.p();
        try {
            final iru o = this.o();
            o.b.g(bundle);
            final fbn i = o.i;
            final int t = i.t;
            if (t == 0) {
                throw null;
            }
            bundle.putInt("background_dialog_type", t - 1);
            final int t2 = i.t;
            final int n = t2 - 1;
            if (t2 != 0) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n == 5) {
                                bundle.putByteArray("background_failed_upsell_dialog_on_elements", ((agzk)i.j).toByteArray());
                            }
                        }
                        else {
                            bundle.putByteArray("background_failed_dismissible_snackbar", ((agzk)i.l).toByteArray());
                        }
                    }
                    else {
                        bundle.putByteArray("background_failed_upsell_dialog", ((agzk)i.i).toByteArray());
                    }
                }
                else {
                    bundle.putByteArray("background_failed_dismissible_dialog", ((agzk)i.k).toByteArray());
                }
                bundle.putLong("background_start_time", i.g);
                final fkr j = o.D.j();
                final boolean k = j.i();
                final boolean b = true;
                boolean o2 = false;
                Label_0220: {
                    if (k) {
                        o2 = b;
                        if (!j.m()) {
                            break Label_0220;
                        }
                    }
                    o2 = (j.h() && b);
                }
                bundle.putBoolean("is_player_maximized", o.O = o2);
                final gkv p = o.P;
                if (p != null) {
                    bundle.putInt("PREVIOUS_THEME", p.c);
                }
                aeux.k();
                return;
            }
            throw null;
        }
        finally {
            try {
                aeux.k();
            }
            finally {
                final Throwable t3;
                jgk.p((Throwable)bundle, t3);
            }
        }
    }
    
    public final void sh(final aeup aeup, final boolean b) {
        this.b.j(aeup, b);
    }
}
