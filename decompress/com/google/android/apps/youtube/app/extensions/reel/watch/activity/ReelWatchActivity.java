// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

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

public final class ReelWatchActivity extends hjw implements aemu, aenm
{
    private hkj b;
    private final aepy c;
    private boolean d;
    private Context e;
    private aun f;
    private boolean g;
    
    public ReelWatchActivity() {
        this.c = aepy.a((Activity)this);
        SystemClock.elapsedRealtime();
        ((qt)this).addOnContextAvailableListener((rc)new qn(this, 19));
    }
    
    private final hkj e() {
        this.d();
        return this.b;
    }
    
    public final void applyOverrideConfiguration(final Configuration configuration) {
        Context context;
        if ((context = this.getBaseContext()) == null) {
            context = this.e;
        }
        aety.b(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected final void attachBaseContext(final Context e) {
        aety.a(this.e = e);
        super.attachBaseContext(e);
        this.e = null;
    }
    
    public final void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.b:Lhkj;
        //     4: ifnonnull       645
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.d:Z
        //    11: ifeq            634
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
        //    43: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //    46: astore_1       
        //    47: aload_0        
        //    48: invokevirtual   hjw.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_1        
        //    53: invokevirtual   aere.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //    61: astore_2       
        //    62: aload_0        
        //    63: invokevirtual   hjw.aR:()Ljava/lang/Object;
        //    66: astore_3       
        //    67: aload_3        
        //    68: checkcast       Lesm;
        //    71: getfield        esm.d:Latjj;
        //    74: invokeinterface atjj.a:()Ljava/lang/Object;
        //    79: checkcast       Landroid/app/Activity;
        //    82: astore          4
        //    84: aload           4
        //    86: instanceof      Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity;
        //    89: ifeq            501
        //    92: aload           4
        //    94: checkcast       Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity;
        //    97: astore          5
        //    99: aload           5
        //   101: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   104: pop            
        //   105: aload_3        
        //   106: checkcast       Lesm;
        //   109: getfield        esm.fc:Latjj;
        //   112: invokeinterface atjj.a:()Ljava/lang/Object;
        //   117: checkcast       Lhjp;
        //   120: astore          4
        //   122: aload_3        
        //   123: checkcast       Lesm;
        //   126: getfield        esm.b:Leqv;
        //   129: getfield        eqv.jQ:Latjj;
        //   132: invokeinterface atjj.a:()Ljava/lang/Object;
        //   137: checkcast       Lhmm;
        //   140: astore          6
        //   142: aload_3        
        //   143: checkcast       Lesm;
        //   146: getfield        esm.p:Latjj;
        //   149: astore          7
        //   151: aload_3        
        //   152: checkcast       Lesm;
        //   155: getfield        esm.b:Leqv;
        //   158: getfield        eqv.jM:Latjj;
        //   161: invokeinterface atjj.a:()Ljava/lang/Object;
        //   166: checkcast       Lhqv;
        //   169: astore          8
        //   171: aload_3        
        //   172: checkcast       Lesm;
        //   175: getfield        esm.b:Leqv;
        //   178: getfield        eqv.w:Latjj;
        //   181: invokeinterface atjj.a:()Ljava/lang/Object;
        //   186: checkcast       Luyf;
        //   189: astore          9
        //   191: aload_3        
        //   192: checkcast       Lesm;
        //   195: getfield        esm.b:Leqv;
        //   198: getfield        eqv.v:Latjj;
        //   201: invokeinterface atjj.a:()Ljava/lang/Object;
        //   206: checkcast       Larud;
        //   209: astore          10
        //   211: aload_3        
        //   212: checkcast       Lesm;
        //   215: getfield        esm.F:Latjj;
        //   218: invokeinterface atjj.a:()Ljava/lang/Object;
        //   223: checkcast       Lfxo;
        //   226: astore          11
        //   228: aload_3        
        //   229: checkcast       Lesm;
        //   232: getfield        esm.M:Latjj;
        //   235: invokeinterface atjj.a:()Ljava/lang/Object;
        //   240: checkcast       Lacnx;
        //   243: astore          12
        //   245: aload_3        
        //   246: checkcast       Lesm;
        //   249: getfield        esm.b:Leqv;
        //   252: getfield        eqv.a:Leqx;
        //   255: getfield        eqx.dP:Latjj;
        //   258: invokeinterface atjj.a:()Ljava/lang/Object;
        //   263: checkcast       Lhlf;
        //   266: astore_1       
        //   267: aload_3        
        //   268: checkcast       Lesm;
        //   271: getfield        esm.m:Latjj;
        //   274: invokeinterface atjj.a:()Ljava/lang/Object;
        //   279: checkcast       Lmrm;
        //   282: astore          13
        //   284: aload_3        
        //   285: checkcast       Lesm;
        //   288: getfield        esm.fn:Latjj;
        //   291: invokeinterface atjj.a:()Ljava/lang/Object;
        //   296: checkcast       Ltlb;
        //   299: astore          14
        //   301: aload_3        
        //   302: checkcast       Lesm;
        //   305: getfield        esm.b:Leqv;
        //   308: getfield        eqv.a:Leqx;
        //   311: getfield        eqx.c:Latjj;
        //   314: invokeinterface atjj.a:()Ljava/lang/Object;
        //   319: checkcast       Lphq;
        //   322: astore          15
        //   324: aload_3        
        //   325: checkcast       Lesm;
        //   328: getfield        esm.b:Leqv;
        //   331: getfield        eqv.dj:Latjj;
        //   334: invokeinterface atjj.a:()Ljava/lang/Object;
        //   339: checkcast       Ltox;
        //   342: astore          16
        //   344: aload_3        
        //   345: checkcast       Lesm;
        //   348: getfield        esm.dG:Latjj;
        //   351: invokeinterface atjj.a:()Ljava/lang/Object;
        //   356: checkcast       Lhlh;
        //   359: astore          17
        //   361: aload_3        
        //   362: checkcast       Lesm;
        //   365: getfield        esm.dp:Latjj;
        //   368: invokeinterface atjj.a:()Ljava/lang/Object;
        //   373: checkcast       Lhlk;
        //   376: astore          18
        //   378: aload_3        
        //   379: checkcast       Lesm;
        //   382: getfield        esm.fe:Latjj;
        //   385: invokeinterface atjj.a:()Ljava/lang/Object;
        //   390: checkcast       Lcom/google/android/apps/youtube/app/watchwhile/startup/StartupSignalStream;
        //   393: astore          19
        //   395: aload_3        
        //   396: checkcast       Lesm;
        //   399: getfield        esm.av:Latjj;
        //   402: invokeinterface atjj.a:()Ljava/lang/Object;
        //   407: checkcast       Lcom/google/android/apps/youtube/app/player/overlay/FullscreenEngagementPanelOverlay;
        //   410: astore          20
        //   412: aload_3        
        //   413: checkcast       Lesm;
        //   416: getfield        esm.b:Leqv;
        //   419: getfield        eqv.jV:Latjj;
        //   422: invokeinterface atjj.a:()Ljava/lang/Object;
        //   427: checkcast       Luyi;
        //   430: astore_3       
        //   431: new             Lhkj;
        //   434: astore          21
        //   436: aload           21
        //   438: aload           5
        //   440: aload           4
        //   442: aload           6
        //   444: aload           7
        //   446: aload           8
        //   448: aload           9
        //   450: aload           10
        //   452: aload           11
        //   454: aload           12
        //   456: aload_1        
        //   457: aload           13
        //   459: aload           14
        //   461: aload           15
        //   463: aload           16
        //   465: aload           17
        //   467: aload           18
        //   469: aload           19
        //   471: aload           20
        //   473: aload_3        
        //   474: aconst_null    
        //   475: aconst_null    
        //   476: aconst_null    
        //   477: aconst_null    
        //   478: aconst_null    
        //   479: invokespecial   hkj.<init>:(Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity;Lhjp;Lhmm;Latjj;Lhqv;Luyf;Larud;Lfxo;Lacnx;Lhlf;Lmrm;Ltlb;Lphq;Ltox;Lhlh;Lhlk;Lcom/google/android/apps/youtube/app/watchwhile/startup/StartupSignalStream;Lcom/google/android/apps/youtube/app/player/overlay/FullscreenEngagementPanelOverlay;Luyi;[B[B[B[B[B)V
        //   482: aload_0        
        //   483: aload           21
        //   485: putfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.b:Lhkj;
        //   488: aload_2        
        //   489: invokevirtual   aere.close:()V
        //   492: aload_0        
        //   493: getfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.b:Lhkj;
        //   496: aload_0        
        //   497: putfield        hkj.t:Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity;
        //   500: return         
        //   501: new             Ljava/lang/IllegalStateException;
        //   504: astore          14
        //   506: ldc             Lhkj;.class
        //   508: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   511: astore_1       
        //   512: aload           4
        //   514: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   517: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   520: astore          10
        //   522: new             Ljava/lang/StringBuilder;
        //   525: astore          4
        //   527: aload           4
        //   529: ldc_w           "Attempt to inject a Activity wrapper of type "
        //   532: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   535: aload           4
        //   537: aload_1        
        //   538: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   541: pop            
        //   542: aload           4
        //   544: ldc_w           ", but the wrapper available is of type: "
        //   547: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   550: pop            
        //   551: aload           4
        //   553: aload           10
        //   555: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   558: pop            
        //   559: aload           4
        //   561: ldc_w           ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   564: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   567: pop            
        //   568: aload           14
        //   570: aload           4
        //   572: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   575: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   578: aload           14
        //   580: athrow         
        //   581: astore_1       
        //   582: goto            603
        //   585: astore_1       
        //   586: new             Ljava/lang/IllegalStateException;
        //   589: astore          14
        //   591: aload           14
        //   593: ldc_w           "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   596: aload_1        
        //   597: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   600: aload           14
        //   602: athrow         
        //   603: aload_2        
        //   604: invokevirtual   aere.close:()V
        //   607: goto            616
        //   610: astore_2       
        //   611: aload_1        
        //   612: aload_2        
        //   613: invokestatic    iba.b:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   616: aload_1        
        //   617: athrow         
        //   618: astore_2       
        //   619: aload_1        
        //   620: invokevirtual   aere.close:()V
        //   623: goto            632
        //   626: astore_1       
        //   627: aload_2        
        //   628: aload_1        
        //   629: invokestatic    iba.b:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   632: aload_2        
        //   633: athrow         
        //   634: new             Ljava/lang/IllegalStateException;
        //   637: dup            
        //   638: ldc_w           "createPeer() called outside of onCreate"
        //   641: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   644: athrow         
        //   645: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     618    634    Any
        //  62     67     585    603    Ljava/lang/ClassCastException;
        //  62     67     581    618    Any
        //  67     488    581    618    Any
        //  501    581    581    618    Any
        //  586    603    581    618    Any
        //  603    607    610    616    Any
        //  619    623    626    632    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0603:
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
        final aers b = this.c.b();
        try {
            super.finish();
            final hkj e = this.e();
            anqa anqa;
            if ((anqa = e.n.b().A) == null) {
                anqa = anqa.a;
            }
            if (anqa.b) {
                final ReelWatchActivity a = e.a;
                int n;
                if (!(boolean)hkj.a(a.getIntent()).map((Function)hkc.d).map((Function)hkc.e).orElse((Object)false)) {
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
                iba.b(t, t2);
            }
        }
    }
    
    public final auh getLifecycle() {
        if (this.f == null) {
            this.f = new aenn((bu)this);
        }
        return (auh)this.f;
    }
    
    public final void invalidateOptionsMenu() {
        final aers s = aesw.s();
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
                iba.b(t, t2);
            }
        }
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aers q = this.c.q();
        try {
            final hkj e = this.e();
            if (!e.s.m(n, n2, intent)) {
                e.t.onActivityResult(n, n2, intent);
            }
            q.close();
        }
        finally {
            try {
                q.close();
            }
            finally {
                final Throwable t;
                iba.b((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aers c = this.c.c();
        try {
            final hkj e = this.e();
            anqa anqa;
            if ((anqa = e.n.b().A) == null) {
                anqa = anqa.a;
            }
            if (anqa.b) {
                final gug gug = (gug)e.c.a();
                if (!(boolean)Optional.ofNullable((Object)gug.a()).filter((Predicate)new fqe(gui.class, 10)).map((Function)new fnm(gui.class, 20)).map((Function)gnq.r).orElse((Object)false)) {
                    if (!gug.h()) {
                        e.a.finishAfterTransition();
                    }
                }
            }
            else if (!((gug)e.c.a()).g()) {
                ((gug)e.c.a()).h();
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
                iba.b(t, t2);
            }
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        final aers r = this.c.r();
        try {
            super.onConfigurationChanged(configuration);
            final hkj e = this.e();
            e.e.c(configuration);
            final tox h = e.h;
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
                iba.b((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aers s = this.c.s();
        try {
            this.d = true;
            ((aenn)((dh)this).getLifecycle()).h(this.c);
            final hkj e = this.e();
            final long currentTimeMillis = System.currentTimeMillis();
            fah.m((Context)e.a);
            e.t.onCreate(bundle);
            if (e.o.aT()) {
                ((fa)e.a).setTheme(2132083492);
            }
            ((qt)e.a).setContentView(2131625276);
            final hjy hjy = (hjy)((bu)e.a).getSupportFragmentManager().f("ProcessDeathDetectorFragmentTag");
            if (bundle != null && hjy != null && hjy.a) {
                e.a.finish();
            }
            else {
                final ct i = ((bu)e.a).getSupportFragmentManager().i();
                final hjy hjy2 = new hjy();
                hjy2.a = false;
                ((br)hjy2).am(true);
                i.s((br)hjy2, "ProcessDeathDetectorFragmentTag");
                i.a();
                e.b.d("r_ac", currentTimeMillis);
                aeo.b((Activity)e.a);
                e.b();
                e.e.a();
                e.g.a();
                anqa anqa;
                if ((anqa = e.n.b().A) == null) {
                    anqa = anqa.a;
                }
                if (anqa.b) {
                    e.r.B((Callable)new guf(e, 11));
                }
                anqh anqh;
                if ((anqh = e.p.f().u) == null) {
                    anqh = anqh.a;
                }
                anqt anqt;
                if ((anqt = anqh.d) == null) {
                    anqt = anqt.a;
                }
                e.m = anqt.J;
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
                    iba.b((Throwable)bundle, t);
                }
            }
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aers t = this.c.t();
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
                iba.b((Throwable)menu, t2);
            }
        }
    }
    
    protected final void onDestroy() {
        final aers d = this.c.d();
        try {
            super.onDestroy();
            final hkj e = this.e();
            e.g.b();
            final hqv d2 = e.d;
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
                    if ((o = e.p.f().A) == null) {
                        o = ajpg.a;
                    }
                    final agza builder = ajph.a.createBuilder();
                    builder.copyOnWrite();
                    ajph.a((ajph)builder.instance);
                    final ajph ajph = (ajph)builder.build();
                    final ahas b = ((ajpg)o).b;
                    final Long value = 45366409L;
                    o = ajph;
                    if (b.containsKey(value)) {
                        o = b.get(value);
                    }
                    if (((ajph)o).b == 1 && (boolean)((ajph)o).c) {
                        o = e.i.g;
                        if (o != null) {
                            ((acms)o).rU();
                        }
                        o = e.j.f;
                        if (o != null) {
                            ((acms)o).rU();
                        }
                        e.k.mM((aum)e.a);
                        e.l.mM((aum)e.a);
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
                iba.b(t, t2);
            }
        }
    }
    
    protected final void onLocalesChanged(final ajo ajo) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aers e = this.c.e(intent);
        try {
            super.onNewIntent(intent);
            final hkj e2 = this.e();
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
                    iba.b((Throwable)intent, t);
                }
            }
        }
    }
    
    protected final void onNightModeChanged(final int n) {
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        final aers u = this.c.u();
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
                iba.b((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aers f = this.c.f();
        try {
            final hkj e = this.e();
            if (e.a.isFinishing()) {
                e.a.setRequestedOrientation(-1);
            }
            e.t.onPause();
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
                    iba.b(t, t2);
                }
            }
        }
    }
    
    public final void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        final aers v = this.c.v();
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
                iba.b((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onPostCreate(final Bundle bundle) {
        final aers w = this.c.w();
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
                    iba.b((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onPostResume() {
        final aers g = this.c.g();
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
                iba.b(t, t2);
            }
        }
    }
    
    public final boolean onPrepareOptionsMenu(final Menu menu) {
        final aers s = aesw.s();
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
                iba.b((Throwable)menu, t);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aers x = this.c.x();
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
                iba.b((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onResume() {
        final aers h = this.c.h();
        try {
            super.onResume();
            final hkj e = this.e();
            e.e.e();
            final tox h2 = e.h;
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
                    iba.b(t, t2);
                }
            }
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final aers y = this.c.y();
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
                    iba.b((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onStart() {
        final aers i = this.c.i();
        try {
            super.onStart();
            final hkj e = this.e();
            e.q.n(((fa)e.a).getResources().getConfiguration(), (Context)e.a);
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
                    iba.b(t, t2);
                }
            }
        }
    }
    
    protected final void onStop() {
        final aers j = this.c.j();
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
                    iba.b(t, t2);
                }
            }
        }
    }
    
    public final boolean onSupportNavigateUp() {
        final aers k = this.c.k();
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
                iba.b(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aers l = this.c.l();
        try {
            super.onUserInteraction();
            final hkj e = this.e();
            final tox h = e.h;
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
                iba.b(t, t2);
            }
        }
    }
    
    public final void startActivity(final Intent intent) {
        if (agnj.K(intent, this.getApplicationContext())) {
            aesm.j(intent);
        }
        super.startActivity(intent);
    }
    
    public final void startActivity(final Intent intent, final Bundle bundle) {
        if (agnj.K(intent, this.getApplicationContext())) {
            aesm.j(intent);
        }
        super.startActivity(intent, bundle);
    }
}
