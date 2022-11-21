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

public final class ReelWatchActivity extends hkz implements aeqn, aerf
{
    private hln b;
    private final aets c;
    private boolean d;
    private Context e;
    private auq f;
    private boolean g;
    
    public ReelWatchActivity() {
        this.c = aets.a((Activity)this);
        SystemClock.elapsedRealtime();
        ((qu)this).addOnContextAvailableListener((rd)new jmw(this, 1));
    }
    
    private final hln e() {
        this.d();
        return this.b;
    }
    
    public final /* bridge */ Object aN() {
        final hln b = this.b;
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
        agsk.ag(context);
        super.applyOverrideConfiguration(configuration);
    }
    
    protected final void attachBaseContext(final Context e) {
        agsk.af(this.e = e);
        super.attachBaseContext(e);
        this.e = null;
    }
    
    public final arno b() {
        return aerl.a((Activity)this);
    }
    
    public final void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.b:Lhln;
        //     4: ifnonnull       658
        //     7: aload_0        
        //     8: getfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.d:Z
        //    11: ifeq            647
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
        //    43: invokestatic    aewp.o:(Ljava/lang/String;)Laeux;
        //    46: astore_2       
        //    47: aload_0        
        //    48: invokevirtual   hkz.aR:()Ljava/lang/Object;
        //    51: pop            
        //    52: aload_2        
        //    53: invokevirtual   aeux.close:()V
        //    56: ldc             "CreatePeer"
        //    58: invokestatic    aewp.o:(Ljava/lang/String;)Laeux;
        //    61: astore_1       
        //    62: aload_0        
        //    63: invokevirtual   hkz.aR:()Ljava/lang/Object;
        //    66: astore          20
        //    68: aload           20
        //    70: checkcast       Lesr;
        //    73: getfield        esr.d:Latnb;
        //    76: invokeinterface atnb.a:()Ljava/lang/Object;
        //    81: checkcast       Landroid/app/Activity;
        //    84: astore          4
        //    86: aload           4
        //    88: instanceof      Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity;
        //    91: ifeq            520
        //    94: aload           4
        //    96: checkcast       Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity;
        //    99: astore_2       
        //   100: aload_2        
        //   101: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   104: pop            
        //   105: aload           20
        //   107: checkcast       Lesr;
        //   110: getfield        esr.fj:Latnb;
        //   113: invokeinterface atnb.a:()Ljava/lang/Object;
        //   118: checkcast       Lhkw;
        //   121: astore          18
        //   123: aload           20
        //   125: checkcast       Lesr;
        //   128: getfield        esr.b:Lera;
        //   131: getfield        era.jm:Latnb;
        //   134: invokeinterface atnb.a:()Ljava/lang/Object;
        //   139: checkcast       Lhnp;
        //   142: astore_3       
        //   143: aload           20
        //   145: checkcast       Lesr;
        //   148: getfield        esr.p:Latnb;
        //   151: astore          13
        //   153: aload           20
        //   155: checkcast       Lesr;
        //   158: getfield        esr.b:Lera;
        //   161: getfield        era.ji:Latnb;
        //   164: invokeinterface atnb.a:()Ljava/lang/Object;
        //   169: checkcast       Lhrx;
        //   172: astore          10
        //   174: aload           20
        //   176: checkcast       Lesr;
        //   179: getfield        esr.b:Lera;
        //   182: getfield        era.w:Latnb;
        //   185: invokeinterface atnb.a:()Ljava/lang/Object;
        //   190: checkcast       Lvbo;
        //   193: astore          8
        //   195: aload           20
        //   197: checkcast       Lesr;
        //   200: getfield        esr.b:Lera;
        //   203: getfield        era.v:Latnb;
        //   206: invokeinterface atnb.a:()Ljava/lang/Object;
        //   211: checkcast       Larzb;
        //   214: astore          19
        //   216: aload           20
        //   218: checkcast       Lesr;
        //   221: getfield        esr.G:Latnb;
        //   224: invokeinterface atnb.a:()Ljava/lang/Object;
        //   229: checkcast       Lfyb;
        //   232: astore          5
        //   234: aload           20
        //   236: checkcast       Lesr;
        //   239: getfield        esr.N:Latnb;
        //   242: invokeinterface atnb.a:()Ljava/lang/Object;
        //   247: checkcast       Lacrm;
        //   250: astore          11
        //   252: aload           20
        //   254: checkcast       Lesr;
        //   257: getfield        esr.b:Lera;
        //   260: getfield        era.a:Lerc;
        //   263: getfield        erc.dQ:Latnb;
        //   266: invokeinterface atnb.a:()Ljava/lang/Object;
        //   271: checkcast       Lhmj;
        //   274: astore          12
        //   276: aload           20
        //   278: checkcast       Lesr;
        //   281: getfield        esr.m:Latnb;
        //   284: invokeinterface atnb.a:()Ljava/lang/Object;
        //   289: checkcast       Lmtf;
        //   292: astore          15
        //   294: aload           20
        //   296: checkcast       Lesr;
        //   299: getfield        esr.fv:Latnb;
        //   302: invokeinterface atnb.a:()Ljava/lang/Object;
        //   307: checkcast       Ltog;
        //   310: astore          4
        //   312: aload           20
        //   314: checkcast       Lesr;
        //   317: getfield        esr.b:Lera;
        //   320: getfield        era.a:Lerc;
        //   323: getfield        erc.c:Latnb;
        //   326: invokeinterface atnb.a:()Ljava/lang/Object;
        //   331: checkcast       Lpjs;
        //   334: astore          14
        //   336: aload           20
        //   338: checkcast       Lesr;
        //   341: getfield        esr.b:Lera;
        //   344: getfield        era.dm:Latnb;
        //   347: invokeinterface atnb.a:()Ljava/lang/Object;
        //   352: checkcast       Ltsd;
        //   355: astore          16
        //   357: aload           20
        //   359: checkcast       Lesr;
        //   362: getfield        esr.dQ:Latnb;
        //   365: invokeinterface atnb.a:()Ljava/lang/Object;
        //   370: checkcast       Lhml;
        //   373: astore          9
        //   375: aload           20
        //   377: checkcast       Lesr;
        //   380: getfield        esr.dy:Latnb;
        //   383: invokeinterface atnb.a:()Ljava/lang/Object;
        //   388: checkcast       Lhmo;
        //   391: astore          6
        //   393: aload           20
        //   395: checkcast       Lesr;
        //   398: getfield        esr.fl:Latnb;
        //   401: invokeinterface atnb.a:()Ljava/lang/Object;
        //   406: checkcast       Lcom/google/android/apps/youtube/app/watchwhile/startup/StartupSignalStream;
        //   409: astore          7
        //   411: aload           20
        //   413: checkcast       Lesr;
        //   416: getfield        esr.ax:Latnb;
        //   419: invokeinterface atnb.a:()Ljava/lang/Object;
        //   424: checkcast       Lcom/google/android/apps/youtube/app/player/overlay/FullscreenEngagementPanelOverlay;
        //   427: astore          17
        //   429: aload           20
        //   431: checkcast       Lesr;
        //   434: getfield        esr.b:Lera;
        //   437: getfield        era.js:Latnb;
        //   440: invokeinterface atnb.a:()Ljava/lang/Object;
        //   445: checkcast       Lvbs;
        //   448: astore          21
        //   450: new             Lhln;
        //   453: astore          20
        //   455: aload           20
        //   457: aload_2        
        //   458: aload           18
        //   460: aload_3        
        //   461: aload           13
        //   463: aload           10
        //   465: aload           8
        //   467: aload           19
        //   469: aload           5
        //   471: aload           11
        //   473: aload           12
        //   475: aload           15
        //   477: aload           4
        //   479: aload           14
        //   481: aload           16
        //   483: aload           9
        //   485: aload           6
        //   487: aload           7
        //   489: aload           17
        //   491: aload           21
        //   493: aconst_null    
        //   494: aconst_null    
        //   495: aconst_null    
        //   496: aconst_null    
        //   497: aconst_null    
        //   498: invokespecial   hln.<init>:(Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity;Lhkw;Lhnp;Latnb;Lhrx;Lvbo;Larzb;Lfyb;Lacrm;Lhmj;Lmtf;Ltog;Lpjs;Ltsd;Lhml;Lhmo;Lcom/google/android/apps/youtube/app/watchwhile/startup/StartupSignalStream;Lcom/google/android/apps/youtube/app/player/overlay/FullscreenEngagementPanelOverlay;Lvbs;[B[B[B[B[B)V
        //   501: aload_0        
        //   502: aload           20
        //   504: putfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.b:Lhln;
        //   507: aload_1        
        //   508: invokevirtual   aeux.close:()V
        //   511: aload_0        
        //   512: getfield        com/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity.b:Lhln;
        //   515: aload_0        
        //   516: putfield        hln.t:Lcom/google/android/apps/youtube/app/extensions/reel/watch/activity/ReelWatchActivity;
        //   519: return         
        //   520: new             Ljava/lang/IllegalStateException;
        //   523: astore_2       
        //   524: ldc             Lhln;.class
        //   526: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   529: astore_3       
        //   530: aload           4
        //   532: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   535: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   538: astore          5
        //   540: new             Ljava/lang/StringBuilder;
        //   543: astore          4
        //   545: aload           4
        //   547: ldc_w           "Attempt to inject a Activity wrapper of type "
        //   550: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   553: aload           4
        //   555: aload_3        
        //   556: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   559: pop            
        //   560: aload           4
        //   562: ldc_w           ", but the wrapper available is of type: "
        //   565: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   568: pop            
        //   569: aload           4
        //   571: aload           5
        //   573: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   576: pop            
        //   577: aload           4
        //   579: ldc_w           ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   582: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   585: pop            
        //   586: aload_2        
        //   587: aload           4
        //   589: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   592: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   595: aload_2        
        //   596: athrow         
        //   597: astore_2       
        //   598: goto            616
        //   601: astore_2       
        //   602: new             Ljava/lang/IllegalStateException;
        //   605: astore_3       
        //   606: aload_3        
        //   607: ldc_w           "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   610: aload_2        
        //   611: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   614: aload_3        
        //   615: athrow         
        //   616: aload_1        
        //   617: invokevirtual   aeux.close:()V
        //   620: goto            629
        //   623: astore_1       
        //   624: aload_2        
        //   625: aload_1        
        //   626: invokestatic    hll.b:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   629: aload_2        
        //   630: athrow         
        //   631: astore_1       
        //   632: aload_2        
        //   633: invokevirtual   aeux.close:()V
        //   636: goto            645
        //   639: astore_2       
        //   640: aload_1        
        //   641: aload_2        
        //   642: invokestatic    hll.b:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   645: aload_1        
        //   646: athrow         
        //   647: new             Ljava/lang/IllegalStateException;
        //   650: dup            
        //   651: ldc_w           "createPeer() called outside of onCreate"
        //   654: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   657: athrow         
        //   658: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  47     52     631    647    Any
        //  62     68     601    616    Ljava/lang/ClassCastException;
        //  62     68     597    631    Any
        //  68     507    597    631    Any
        //  520    597    597    631    Any
        //  602    616    597    631    Any
        //  616    620    623    629    Any
        //  632    636    639    645    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0616:
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
        final aevl b = this.c.b();
        try {
            super.finish();
            final hln e = this.e();
            anuj anuj;
            if ((anuj = e.n.b().A) == null) {
                anuj = anuj.a;
            }
            if (anuj.b) {
                final ReelWatchActivity a = e.a;
                int n;
                if (!(boolean)hln.a(a.getIntent()).map((Function)hdp.e).map((Function)hdp.f).orElse((Object)false)) {
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
                hll.b(t, t2);
            }
        }
    }
    
    public final auk getLifecycle() {
        if (this.f == null) {
            this.f = new aerg((bu)this);
        }
        return (auk)this.f;
    }
    
    public final void invalidateOptionsMenu() {
        final aevl s = aewp.s();
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
                hll.b(t, t2);
            }
        }
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        final aevl r = this.c.r();
        try {
            final hln e = this.e();
            if (!e.s.i(n, n2, intent)) {
                ((hlo)e).t.onActivityResult(n, n2, intent);
            }
            r.close();
        }
        finally {
            try {
                r.close();
            }
            finally {
                final Throwable t;
                hll.b((Throwable)intent, t);
            }
        }
    }
    
    public final void onBackPressed() {
        final aevl c = this.c.c();
        try {
            final hln e = this.e();
            anuj anuj;
            if ((anuj = e.n.b().A) == null) {
                anuj = anuj.a;
            }
            if (anuj.b) {
                final gve gve = (gve)e.c.a();
                if (!(boolean)Optional.ofNullable((Object)gve.a()).filter((Predicate)new fqp((Class)gvg.class, 10)).map((Function)new fnu((Class)gvg.class, 20)).map((Function)gjx.s).orElse((Object)false)) {
                    if (!gve.h()) {
                        e.a.finishAfterTransition();
                    }
                }
            }
            else if (!((gve)e.c.a()).g()) {
                ((gve)e.c.a()).h();
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
                hll.b(t, t2);
            }
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        final aevl s = this.c.s();
        try {
            super.onConfigurationChanged(configuration);
            final hln e = this.e();
            e.e.c(configuration);
            final tsd h = e.h;
            if (h != null && e.m) {
                h.b();
            }
            s.close();
        }
        finally {
            try {
                s.close();
            }
            finally {
                final Throwable t;
                hll.b((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        final aevl t = this.c.t();
        try {
            this.d = true;
            ((aerg)((dh)this).getLifecycle()).h(this.c);
            final hln e = this.e();
            final long currentTimeMillis = System.currentTimeMillis();
            glg.b((Context)e.a);
            ((hlo)e).t.onCreate(bundle);
            if (e.o.aX()) {
                ((fa)e.a).setTheme(2132083492);
            }
            ((qu)e.a).setContentView(2131625283);
            final hlb hlb = (hlb)((bu)e.a).getSupportFragmentManager().f("ProcessDeathDetectorFragmentTag");
            if (bundle != null && hlb != null && hlb.a) {
                e.a.finish();
            }
            else {
                final ct i = ((bu)e.a).getSupportFragmentManager().i();
                final hlb hlb2 = new hlb();
                hlb2.a = false;
                ((br)hlb2).am(true);
                i.s((br)hlb2, "ProcessDeathDetectorFragmentTag");
                i.a();
                e.b.d("r_ac", currentTimeMillis);
                aeq.b((Activity)e.a);
                e.b();
                e.e.a();
                e.g.a();
                anuj anuj;
                if ((anuj = e.n.b().A) == null) {
                    anuj = anuj.a;
                }
                if (anuj.b) {
                    e.r.x((Callable)new gmm(e, 14));
                }
                anuq anuq;
                if ((anuq = e.p.f().u) == null) {
                    anuq = anuq.a;
                }
                anvc anvc;
                if ((anvc = anuq.d) == null) {
                    anvc = anvc.a;
                }
                e.m = anvc.I;
            }
            this.d = false;
            if (t != null) {
                t.close();
            }
        }
        finally {
            if (t != null) {
                try {
                    t.close();
                }
                finally {
                    final Throwable t2;
                    hll.b((Throwable)bundle, t2);
                }
            }
        }
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        final aevl u = this.c.u();
        try {
            super.onCreatePanelMenu(n, menu);
            u.close();
            return true;
        }
        finally {
            try {
                u.close();
            }
            finally {
                final Throwable t;
                hll.b((Throwable)menu, t);
            }
        }
    }
    
    protected final void onDestroy() {
        final aevl d = this.c.d();
        try {
            super.onDestroy();
            final hln e = this.e();
            e.g.b();
            final hrx d2 = e.d;
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
                        o = ajtj.a;
                    }
                    final ahcr builder = ((ahcz)ajtk.a).createBuilder();
                    builder.copyOnWrite();
                    ajtk.a((ajtk)builder.instance);
                    final ajtk ajtk = (ajtk)builder.build();
                    final ahej b = ((ajtj)o).b;
                    final Long value = 45366409L;
                    o = ajtk;
                    if (((Map)b).containsKey(value)) {
                        o = ((Map)b).get(value);
                    }
                    if (((ajtk)o).b == 1 && (boolean)((ajtk)o).c) {
                        o = e.i.g;
                        if (o != null) {
                            ((acqh)o).sa();
                        }
                        o = e.j.f;
                        if (o != null) {
                            ((acqh)o).sa();
                        }
                        e.k.oO((aup)e.a);
                        e.l.oO((aup)e.a);
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
                hll.b(t, t2);
            }
        }
    }
    
    protected final void onLocalesChanged(final ajq ajq) {
    }
    
    protected final void onNewIntent(final Intent intent) {
        final aevl e = this.c.e(intent);
        try {
            super.onNewIntent(intent);
            final hln e2 = this.e();
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
                    hll.b((Throwable)intent, t);
                }
            }
        }
    }
    
    protected final void onNightModeChanged(final int n) {
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        final aevl v = this.c.v();
        try {
            final boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            v.close();
            return onOptionsItemSelected;
        }
        finally {
            try {
                v.close();
            }
            finally {
                final Throwable t;
                hll.b((Throwable)menuItem, t);
            }
        }
    }
    
    protected final void onPause() {
        final aevl f = this.c.f();
        try {
            final hln e = this.e();
            if (e.a.isFinishing()) {
                e.a.setRequestedOrientation(-1);
            }
            ((hlo)e).t.onPause();
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
                    hll.b(t, t2);
                }
            }
        }
    }
    
    public final void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        final aevl w = this.c.w();
        try {
            super.onPictureInPictureModeChanged(b, configuration);
            w.close();
        }
        finally {
            try {
                w.close();
            }
            finally {
                final Throwable t;
                hll.b((Throwable)configuration, t);
            }
        }
    }
    
    protected final void onPostCreate(final Bundle bundle) {
        final aevl x = this.c.x();
        try {
            super.onPostCreate(bundle);
            if (x != null) {
                x.close();
            }
        }
        finally {
            if (x != null) {
                try {
                    x.close();
                }
                finally {
                    final Throwable t;
                    hll.b((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onPostResume() {
        final aevl g = this.c.g();
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
                hll.b(t, t2);
            }
        }
    }
    
    public final boolean onPrepareOptionsMenu(final Menu menu) {
        final aevl s = aewp.s();
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
                hll.b((Throwable)menu, t);
            }
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final aevl y = this.c.y();
        try {
            super.onRequestPermissionsResult(n, array, array2);
            y.close();
        }
        finally {
            try {
                y.close();
            }
            finally {
                final Throwable t;
                hll.b((Throwable)(Object)array, t);
            }
        }
    }
    
    protected final void onResume() {
        final aevl h = this.c.h();
        try {
            super.onResume();
            final hln e = this.e();
            e.e.e();
            final tsd h2 = e.h;
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
                    hll.b(t, t2);
                }
            }
        }
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        final aevl z = this.c.z();
        try {
            super.onSaveInstanceState(bundle);
            if (z != null) {
                z.close();
            }
        }
        finally {
            if (z != null) {
                try {
                    z.close();
                }
                finally {
                    final Throwable t;
                    hll.b((Throwable)bundle, t);
                }
            }
        }
    }
    
    protected final void onStart() {
        final aevl i = this.c.i();
        try {
            super.onStart();
            final hln e = this.e();
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
                    hll.b(t, t2);
                }
            }
        }
    }
    
    protected final void onStop() {
        final aevl j = this.c.j();
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
                    hll.b(t, t2);
                }
            }
        }
    }
    
    public final boolean onSupportNavigateUp() {
        final aevl k = this.c.k();
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
                hll.b(t, t2);
            }
        }
    }
    
    public final void onUserInteraction() {
        final aevl l = this.c.l();
        try {
            super.onUserInteraction();
            final hln e = this.e();
            final tsd h = e.h;
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
                hll.b(t, t2);
            }
        }
    }
    
    public final void startActivity(final Intent intent) {
        if (adme.ah(intent, this.getApplicationContext())) {
            aewf.j(intent);
        }
        super.startActivity(intent);
    }
    
    public final void startActivity(final Intent intent, final Bundle bundle) {
        if (adme.ah(intent, this.getApplicationContext())) {
            aewf.j(intent);
        }
        super.startActivity(intent, bundle);
    }
}
