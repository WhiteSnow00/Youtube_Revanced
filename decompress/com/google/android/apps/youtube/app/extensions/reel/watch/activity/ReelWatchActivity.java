// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import java.util.Map;
import android.view.MenuItem;
import android.view.Menu;
import java.util.concurrent.Callable;
import android.os.Bundle;
import java.util.function.Predicate;
import j$.util.Optional;
import android.content.Intent;
import java.util.function.Function;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;

public final class ReelWatchActivity extends hkr implements aeou, aepm
{
    private hlf b;
    private final aerz c;
    private boolean d;
    private Context e;
    private auo f;
    private boolean g;
    
    public ReelWatchActivity() {
        this.c = aerz.a((Activity)this);
        SystemClock.elapsedRealtime();
        ((qt)this).addOnContextAvailableListener((rc)new jmk(this, 1));
    }
    
    private final hlf e() {
        this.d();
        return this.b;
    }
    
    public final /* bridge */ Object aN() {
        final hlf b = this.b;
        if (b == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.g) {
            return b;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final void applyOverrideConfiguration(final Configuration configuration) {
        Context context;
        if ((context = this.getBaseContext()) == null) {
            context = this.e;
        }
        aeuz.c(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected final void attachBaseContext(final Context e) {
        aeuz.b(this.e = e);
        super.attachBaseContext(e);
        this.e = null;
    }
    
    public final arku b() {
        return (arku)aeps.a((Activity)this);
    }
    
    public final void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.b:Lhlf;
        //     4: ifnonnull       660
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.d:Z
        //    11: ifeq            649
        //    14: aload_0        
        //    15: getfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.g:Z
        //    18: ifeq            41
        //    21: aload_0        
        //    22: invokevirtual   com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.isFinishing:()Z
        //    25: ifeq            31
        //    28: goto            41
        //    31: new             Ljava/lang/IllegalStateException;
        //    34: dup            
        //    35: ldc             "createPeer() called after destroyed."
        //    37: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    40: athrow         
        //    41: ldc             "CreateComponent"
        //    43: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //    46: astore_2       
        //    47: aload_0        
        //    48: invokevirtual   hkr.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_2        
        //    53: invokevirtual   aetf.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //    61: astore_1       
        //    62: aload_0        
        //    63: invokevirtual   hkr.aR:()Ljava/lang/Object;
        //    66: astore          20
        //    68: aload           20
        //    70: checkcast       Lesp;
        //    73: getfield        esp.d:Latke;
        //    76: invokeinterface atke.a:()Ljava/lang/Object;
        //    81: checkcast       Landroid/app/Activity;
        //    84: astore          4
        //    86: aload           4
        //    88: instanceof      Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity;
        //    91: ifeq            522
        //    94: aload           4
        //    96: checkcast       Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity;
        //    99: astore          19
        //   101: aload           19
        //   103: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   106: pop            
        //   107: aload           20
        //   109: checkcast       Lesp;
        //   112: getfield        esp.fd:Latke;
        //   115: invokeinterface atke.a:()Ljava/lang/Object;
        //   120: checkcast       Lhko;
        //   123: astore          7
        //   125: aload           20
        //   127: checkcast       Lesp;
        //   130: getfield        esp.b:Leqy;
        //   133: getfield        eqy.jU:Latke;
        //   136: invokeinterface atke.a:()Ljava/lang/Object;
        //   141: checkcast       Lhng;
        //   144: astore          9
        //   146: aload           20
        //   148: checkcast       Lesp;
        //   151: getfield        esp.p:Latke;
        //   154: astore          5
        //   156: aload           20
        //   158: checkcast       Lesp;
        //   161: getfield        esp.b:Leqy;
        //   164: getfield        eqy.jQ:Latke;
        //   167: invokeinterface atke.a:()Ljava/lang/Object;
        //   172: checkcast       Lhrp;
        //   175: astore          8
        //   177: aload           20
        //   179: checkcast       Lesp;
        //   182: getfield        esp.b:Leqy;
        //   185: getfield        eqy.w:Latke;
        //   188: invokeinterface atke.a:()Ljava/lang/Object;
        //   193: checkcast       Lvaf;
        //   196: astore          4
        //   198: aload           20
        //   200: checkcast       Lesp;
        //   203: getfield        esp.b:Leqy;
        //   206: getfield        eqy.v:Latke;
        //   209: invokeinterface atke.a:()Ljava/lang/Object;
        //   214: checkcast       Larwh;
        //   217: astore          13
        //   219: aload           20
        //   221: checkcast       Lesp;
        //   224: getfield        esp.G:Latke;
        //   227: invokeinterface atke.a:()Ljava/lang/Object;
        //   232: checkcast       Lfxw;
        //   235: astore          14
        //   237: aload           20
        //   239: checkcast       Lesp;
        //   242: getfield        esp.N:Latke;
        //   245: invokeinterface atke.a:()Ljava/lang/Object;
        //   250: checkcast       Lelx;
        //   253: astore          17
        //   255: aload           20
        //   257: checkcast       Lesp;
        //   260: getfield        esp.b:Leqy;
        //   263: getfield        eqy.a:Lera;
        //   266: getfield        era.dP:Latke;
        //   269: invokeinterface atke.a:()Ljava/lang/Object;
        //   274: checkcast       Lhmb;
        //   277: astore          15
        //   279: aload           20
        //   281: checkcast       Lesp;
        //   284: getfield        esp.m:Latke;
        //   287: invokeinterface atke.a:()Ljava/lang/Object;
        //   292: checkcast       Lmsr;
        //   295: astore_3       
        //   296: aload           20
        //   298: checkcast       Lesp;
        //   301: getfield        esp.fp:Latke;
        //   304: invokeinterface atke.a:()Ljava/lang/Object;
        //   309: checkcast       Ltne;
        //   312: astore          11
        //   314: aload           20
        //   316: checkcast       Lesp;
        //   319: getfield        esp.b:Leqy;
        //   322: getfield        eqy.a:Lera;
        //   325: getfield        era.c:Latke;
        //   328: invokeinterface atke.a:()Ljava/lang/Object;
        //   333: checkcast       Lpja;
        //   336: astore          10
        //   338: aload           20
        //   340: checkcast       Lesp;
        //   343: getfield        esp.b:Leqy;
        //   346: getfield        eqy.dj:Latke;
        //   349: invokeinterface atke.a:()Ljava/lang/Object;
        //   354: checkcast       Ltrc;
        //   357: astore          12
        //   359: aload           20
        //   361: checkcast       Lesp;
        //   364: getfield        esp.dI:Latke;
        //   367: invokeinterface atke.a:()Ljava/lang/Object;
        //   372: checkcast       Lhmd;
        //   375: astore          16
        //   377: aload           20
        //   379: checkcast       Lesp;
        //   382: getfield        esp.dq:Latke;
        //   385: invokeinterface atke.a:()Ljava/lang/Object;
        //   390: checkcast       Lhmg;
        //   393: astore_2       
        //   394: aload           20
        //   396: checkcast       Lesp;
        //   399: getfield        esp.ff:Latke;
        //   402: invokeinterface atke.a:()Ljava/lang/Object;
        //   407: checkcast       Lcom/google/android/apps/youtube/app/watchwhile/startup/StartupSignalStream;
        //   410: astore          18
        //   412: aload           20
        //   414: checkcast       Lesp;
        //   417: getfield        esp.ax:Latke;
        //   420: invokeinterface atke.a:()Ljava/lang/Object;
        //   425: checkcast       Lcom/google/android/apps/youtube/app/player/overlay/FullscreenEngagementPanelOverlay;
        //   428: astore          6
        //   430: aload           20
        //   432: checkcast       Lesp;
        //   435: getfield        esp.b:Leqy;
        //   438: getfield        eqy.ka:Latke;
        //   441: invokeinterface atke.a:()Ljava/lang/Object;
        //   446: checkcast       Lvai;
        //   449: astore          21
        //   451: new             Lhlf;
        //   454: astore          20
        //   456: aload           20
        //   458: aload           19
        //   460: aload           7
        //   462: aload           9
        //   464: aload           5
        //   466: aload           8
        //   468: aload           4
        //   470: aload           13
        //   472: aload           14
        //   474: aload           17
        //   476: aload           15
        //   478: aload_3        
        //   479: aload           11
        //   481: aload           10
        //   483: aload           12
        //   485: aload           16
        //   487: aload_2        
        //   488: aload           18
        //   490: aload           6
        //   492: aload           21
        //   494: aconst_null    
        //   495: aconst_null    
        //   496: aconst_null    
        //   497: aconst_null    
        //   498: aconst_null    
        //   499: aconst_null    
        //   500: invokespecial   hlf.<init>:(Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity;Lhko;Lhng;Latke;Lhrp;Lvaf;Larwh;Lfxw;Lelx;Lhmb;Lmsr;Ltne;Lpja;Ltrc;Lhmd;Lhmg;Lcom/google/android/apps/youtube/app/watchwhile/startup/StartupSignalStream;Lcom/google/android/apps/youtube/app/player/overlay/FullscreenEngagementPanelOverlay;Lvai;[B[B[B[B[B[B)V
        //   503: aload_0        
        //   504: aload           20
        //   506: putfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.b:Lhlf;
        //   509: aload_1        
        //   510: invokevirtual   aetf.close:()V
        //   513: aload_0        
        //   514: getfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.b:Lhlf;
        //   517: aload_0        
        //   518: putfield        hlf.t:Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity;
        //   521: return         
        //   522: new             Ljava/lang/IllegalStateException;
        //   525: astore_2       
        //   526: ldc             Lhlf;.class
        //   528: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   531: astore_3       
        //   532: aload           4
        //   534: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   537: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   540: astore          5
        //   542: new             Ljava/lang/StringBuilder;
        //   545: astore          4
        //   547: aload           4
        //   549: ldc_w           "Attempt to inject a Activity wrapper of type "
        //   552: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   555: aload           4
        //   557: aload_3        
        //   558: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   561: pop            
        //   562: aload           4
        //   564: ldc_w           ", but the wrapper available is of type: "
        //   567: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   570: pop            
        //   571: aload           4
        //   573: aload           5
        //   575: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   578: pop            
        //   579: aload           4
        //   581: ldc_w           ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   584: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   587: pop            
        //   588: aload_2        
        //   589: aload           4
        //   591: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   594: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   597: aload_2        
        //   598: athrow         
        //   599: astore_2       
        //   600: goto            618
        //   603: astore_3       
        //   604: new             Ljava/lang/IllegalStateException;
        //   607: astore_2       
        //   608: aload_2        
        //   609: ldc_w           "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   612: aload_3        
        //   613: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   616: aload_2        
        //   617: athrow         
        //   618: aload_1        
        //   619: invokevirtual   aetf.close:()V
        //   622: goto            631
        //   625: astore_1       
        //   626: aload_2        
        //   627: aload_1        
        //   628: invokestatic    hnu.c:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   631: aload_2        
        //   632: athrow         
        //   633: astore_1       
        //   634: aload_2        
        //   635: invokevirtual   aetf.close:()V
        //   638: goto            647
        //   641: astore_2       
        //   642: aload_1        
        //   643: aload_2        
        //   644: invokestatic    hnu.c:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   647: aload_1        
        //   648: athrow         
        //   649: new             Ljava/lang/IllegalStateException;
        //   652: dup            
        //   653: ldc_w           "createPeer() called outside of onCreate"
        //   656: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   659: athrow         
        //   660: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     633    649    Any
        //  62     68     603    618    Ljava/lang/ClassCastException;
        //  62     68     599    633    Any
        //  68     509    599    633    Any
        //  522    599    599    633    Any
        //  604    618    599    633    Any
        //  618    622    625    631    Any
        //  634    638    641    647    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0618:
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
    
    public final void finish() {
        final aett b = this.c.b();
        try {
            super.finish();
            final hlf e = this.e();
            ansd ansd;
            if ((ansd = e.n.b().A) == null) {
                ansd = ansd.a;
            }
            if (ansd.b) {
                final ReelWatchActivity a = e.a;
                int n;
                if (!(boolean)hlf.a(a.getIntent()).map((Function)hkx.d).map((Function)hkx.e).orElse((Object)false)) {
                    n = 2130772087;
                }
                else {
                    n = 2130772089;
                }
                a.overridePendingTransition(0, n);
            }
            b.close();
        }
        finally {
            try {
                b.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hnu.c(t, t2);
            }
        }
    }
    
    public final aui getLifecycle() {
        if (this.f == null) {
            this.f = (auo)new aepn((bu)this);
        }
        return this.f;
    }
    
    public final void invalidateOptionsMenu() {
        final aett s = aeux.s();
        try {
            super.invalidateOptionsMenu();
            s.close();
        }
        finally {
            try {
                s.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hnu.c(t, t2);
            }
        }
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aett q = this.c.q();
        try {
            final hlf e = this.e();
            if (!e.s.G(n, n2, intent)) {
                ((hlg)e).t.onActivityResult(n, n2, intent);
            }
            q.close();
        }
        finally {
            try {
                q.close();
            }
            finally {
                final Throwable t;
                hnu.c((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aett c = this.c.c();
        try {
            final hlf e = this.e();
            ansd ansd;
            if ((ansd = e.n.b().A) == null) {
                ansd = ansd.a;
            }
            if (ansd.b) {
                final guw guw = (guw)e.c.a();
                if (!(boolean)Optional.ofNullable((Object)guw.a()).filter((Predicate)new fqn((Class)guy.class, 10)).map((Function)new fnr((Class)guy.class, 20)).map((Function)gnx.r).orElse((Object)false)) {
                    if (!guw.h()) {
                        e.a.finishAfterTransition();
                    }
                }
            }
            else if (!((guw)e.c.a()).g()) {
                ((guw)e.c.a()).h();
            }
            c.close();
        }
        finally {
            try {
                c.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hnu.c(t, t2);
            }
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        final aett r = this.c.r();
        try {
            super.onConfigurationChanged(configuration);
            final hlf e = this.e();
            e.e.c(configuration);
            final trc h = e.h;
            if (h != null && e.m) {
                h.b();
            }
            r.close();
        }
        finally {
            try {
                r.close();
            }
            finally {
                final Throwable t;
                hnu.c((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aett s = this.c.s();
        try {
            this.d = true;
            ((aepn)((dh)this).getLifecycle()).h(this.c);
            final hlf e = this.e();
            final long currentTimeMillis = System.currentTimeMillis();
            glb.c((Context)e.a);
            ((hlg)e).t.onCreate(bundle);
            if (e.o.aU()) {
                ((fa)e.a).setTheme(2132083492);
            }
            ((qt)e.a).setContentView(2131625281);
            final hkt hkt = (hkt)((bu)e.a).getSupportFragmentManager().f("ProcessDeathDetectorFragmentTag");
            if (bundle != null && hkt != null && hkt.a) {
                e.a.finish();
            }
            else {
                final ct i = ((bu)e.a).getSupportFragmentManager().i();
                final hkt hkt2 = new hkt();
                hkt2.a = false;
                ((br)hkt2).am(true);
                i.s((br)hkt2, "ProcessDeathDetectorFragmentTag");
                i.a();
                e.b.d("r_ac", currentTimeMillis);
                aep.b((Activity)e.a);
                e.b();
                e.e.a();
                e.g.a();
                ansd ansd;
                if ((ansd = e.n.b().A) == null) {
                    ansd = ansd.a;
                }
                if (ansd.b) {
                    e.r.R((Callable)new gqw(e, 13));
                }
                ansk ansk;
                if ((ansk = e.p.f().u) == null) {
                    ansk = ansk.a;
                }
                answ answ;
                if ((answ = ansk.d) == null) {
                    answ = answ.a;
                }
                e.m = answ.J;
            }
            this.d = false;
            if (s != null) {
                s.close();
            }
        }
        finally {
            if (s != null) {
                try {
                    s.close();
                }
                finally {
                    final Throwable t;
                    hnu.c((Throwable)bundle, t);
                }
            }
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aett t = this.c.t();
        try {
            super.onCreatePanelMenu(n, menu);
            t.close();
            return true;
        }
        finally {
            try {
                t.close();
            }
            finally {
                final Throwable t2;
                hnu.c((Throwable)menu, t2);
            }
        }
    }
    
    protected final void onDestroy() {
        final aett d = this.c.d();
        try {
            super.onDestroy();
            final hlf e = this.e();
            e.g.b();
            final hrp d2 = e.d;
            Object o = d2.a;
            synchronized (o) {
                d2.a.clear();
                monitorexit(o);
                o = d2.b;
                synchronized (o) {
                    d2.b.clear();
                    monitorexit(o);
                    e.e.d();
                    e.f.e();
                    o = e.p.f().A;
                    if (o == null) {
                        final ajrk a = ajrk.a;
                    }
                    o = ((ahbh)ajrl.a).createBuilder();
                    ((ahaz)o).copyOnWrite();
                    ajrl.a((ajrl)((ahaz)o).instance);
                    o = ((ahaz)o).build();
                    final ahcr b = ((ajrk)o).b;
                    final Long value = 45366409L;
                    if (((Map)b).containsKey(value)) {
                        final Object o2 = ((Map)b).get(value);
                    }
                    if (((ajrl)o).b == 1 && (boolean)((ajrl)o).c) {
                        final acqv g = e.i.g;
                        if (g != null) {
                            ((acov)g).sa();
                        }
                        final acqv f = e.j.f;
                        if (f != null) {
                            ((acov)f).sa();
                        }
                        e.k.mM((aun)e.a);
                        e.l.mM((aun)e.a);
                    }
                    this.g = true;
                    d.close();
                }
            }
        }
        finally {
            try {
                d.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hnu.c(t, t2);
            }
        }
    }
    
    protected final void onLocalesChanged(final ajp ajp) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aett e = this.c.e(intent);
        try {
            super.onNewIntent(intent);
            final hlf e2 = this.e();
            e2.a.setIntent(intent);
            e2.b();
            if (e != null) {
                e.close();
            }
        }
        finally {
            if (e != null) {
                try {
                    e.close();
                }
                finally {
                    final Throwable t;
                    hnu.c((Throwable)intent, t);
                }
            }
        }
    }
    
    protected final void onNightModeChanged(final int n) {
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        final aett u = this.c.u();
        try {
            final boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            u.close();
            return onOptionsItemSelected;
        }
        finally {
            try {
                u.close();
            }
            finally {
                final Throwable t;
                hnu.c((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aett f = this.c.f();
        try {
            final hlf e = this.e();
            if (e.a.isFinishing()) {
                e.a.setRequestedOrientation(-1);
            }
            ((hlg)e).t.onPause();
            e.e.b();
            if (f != null) {
                f.close();
            }
        }
        finally {
            if (f != null) {
                try {
                    f.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    hnu.c(t, t2);
                }
            }
        }
    }
    
    public final void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        final aett v = this.c.v();
        try {
            super.onPictureInPictureModeChanged(b, configuration);
            v.close();
        }
        finally {
            try {
                v.close();
            }
            finally {
                final Throwable t;
                hnu.c((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onPostCreate(final Bundle bundle) {
        final aett w = this.c.w();
        try {
            super.onPostCreate(bundle);
            if (w != null) {
                w.close();
            }
        }
        finally {
            if (w != null) {
                try {
                    w.close();
                }
                finally {
                    final Throwable t;
                    hnu.c((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onPostResume() {
        final aett g = this.c.g();
        try {
            super.onPostResume();
            g.close();
        }
        finally {
            try {
                g.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hnu.c(t, t2);
            }
        }
    }
    
    public final boolean onPrepareOptionsMenu(final Menu menu) {
        final aett s = aeux.s();
        try {
            final boolean onPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            s.close();
            return onPrepareOptionsMenu;
        }
        finally {
            try {
                s.close();
            }
            finally {
                final Throwable t;
                hnu.c((Throwable)menu, t);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aett x = this.c.x();
        try {
            super.onRequestPermissionsResult(n, array, array2);
            x.close();
        }
        finally {
            try {
                x.close();
            }
            finally {
                final Throwable t;
                hnu.c((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onResume() {
        final aett h = this.c.h();
        try {
            super.onResume();
            final hlf e = this.e();
            e.e.e();
            final trc h2 = e.h;
            if (h2 != null && e.m) {
                h2.b();
            }
            if (h != null) {
                h.close();
            }
        }
        finally {
            if (h != null) {
                try {
                    h.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    hnu.c(t, t2);
                }
            }
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final aett y = this.c.y();
        try {
            super.onSaveInstanceState(bundle);
            if (y != null) {
                y.close();
            }
        }
        finally {
            if (y != null) {
                try {
                    y.close();
                }
                finally {
                    final Throwable t;
                    hnu.c((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onStart() {
        final aett i = this.c.i();
        try {
            super.onStart();
            final hlf e = this.e();
            e.q.l(((fa)e.a).getResources().getConfiguration(), (Context)e.a);
            if (i != null) {
                i.close();
            }
        }
        finally {
            if (i != null) {
                try {
                    i.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    hnu.c(t, t2);
                }
            }
        }
    }
    
    protected final void onStop() {
        final aett j = this.c.j();
        try {
            super.onStop();
            if (j != null) {
                j.close();
            }
        }
        finally {
            if (j != null) {
                try {
                    j.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    hnu.c(t, t2);
                }
            }
        }
    }
    
    public final boolean onSupportNavigateUp() {
        final aett k = this.c.k();
        try {
            final boolean onSupportNavigateUp = super.onSupportNavigateUp();
            k.close();
            return onSupportNavigateUp;
        }
        finally {
            try {
                k.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hnu.c(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aett l = this.c.l();
        try {
            super.onUserInteraction();
            final hlf e = this.e();
            final trc h = e.h;
            if (h != null && e.m) {
                h.b();
            }
            l.close();
        }
        finally {
            try {
                l.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hnu.c(t, t2);
            }
        }
    }
    
    public final void startActivity(final Intent intent) {
        if (aefb.P(intent, this.getApplicationContext())) {
            aeun.j(intent);
        }
        super.startActivity(intent);
    }
    
    public final void startActivity(final Intent intent, final Bundle bundle) {
        if (aefb.P(intent, this.getApplicationContext())) {
            aeun.j(intent);
        }
        super.startActivity(intent, bundle);
    }
}
