// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim;

import android.content.Context;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public final class SegmentProcessingService extends hep implements aeqn
{
    private hew a;
    private boolean b;
    private boolean c;
    private final agnl d;
    
    @Deprecated
    public SegmentProcessingService() {
        this.d = new agnl((Service)this);
        qem.r();
    }
    
    public final /* bridge */ Object aN() {
        return this.b();
    }
    
    public final hew b() {
        final hew a = this.a;
        if (a == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.c) {
            return a;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final IBinder onBind(final Intent intent) {
        final agnl d = this.d;
        final aevk a = aewp.a();
        final Object b = d.b;
        final String concat = String.valueOf(((Service)b).getClass().getName()).concat(".onBind");
        aevl aevl;
        if (intent == null) {
            aevl = agpx.aw((Service)b, concat);
        }
        else {
            final aevk aevk = (aevk)aewf.n(intent, false);
            if (aevk != null) {
                aewp.n(aevk);
                aevl = aeuu.a;
            }
            else {
                aevl = agpx.aw((Service)b, concat);
            }
        }
        final aevl e = agnl.e(a, aevl, aewp.o(d.f("onBind")));
        try {
            final Object c = this.b().c;
            e.close();
            return (IBinder)c;
        }
        finally {
            try {
                e.close();
            }
            finally {
                final Throwable t;
                hhg.e((Throwable)intent, t);
            }
        }
    }
    
    public final void onCreate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.d:Lagnl;
        //     4: astore_3       
        //     5: invokestatic    aewp.a:()Laevk;
        //     8: astore_2       
        //     9: invokestatic    aewp.r:()Z
        //    12: ifne            132
        //    15: invokestatic    aewp.d:()Laevk;
        //    18: astore_1       
        //    19: aload_1        
        //    20: ifnull          94
        //    23: new             Laeut;
        //    26: dup            
        //    27: iconst_0       
        //    28: invokespecial   aeut.<init>:(I)V
        //    31: astore          4
        //    33: aload_1        
        //    34: invokestatic    aewp.n:(Laevk;)V
        //    37: invokestatic    aevb.b:()Laeuz;
        //    40: astore          5
        //    42: aload           5
        //    44: getstatic       aevh.c:Lagpx;
        //    47: aload           4
        //    49: invokeinterface aeuz.a:(Lagpx;Ljava/lang/Object;)V
        //    54: aload           5
        //    56: checkcast       Laevb;
        //    59: invokevirtual   aevb.e:()Laevb;
        //    62: astore          4
        //    64: aload_3        
        //    65: ldc             "Creating "
        //    67: aload_3        
        //    68: getfield        agnl.b:Ljava/lang/Object;
        //    71: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    74: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //    77: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    80: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    83: aload           4
        //    85: invokestatic    aewp.p:(Ljava/lang/String;Laevb;)Laeux;
        //    88: putfield        agnl.a:Ljava/lang/Object;
        //    91: goto            134
        //    94: aload_3        
        //    95: getfield        agnl.b:Ljava/lang/Object;
        //    98: checkcast       Landroid/content/Context;
        //   101: invokestatic    afot.m:(Landroid/content/Context;)Laevn;
        //   104: ldc             "Creating "
        //   106: aload_3        
        //   107: getfield        agnl.b:Ljava/lang/Object;
        //   110: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   113: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   116: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   119: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   122: getstatic       aevh.a:Laevb;
        //   125: invokevirtual   aevn.b:(Ljava/lang/String;Laevb;)Laeuq;
        //   128: astore_1       
        //   129: goto            134
        //   132: aconst_null    
        //   133: astore_1       
        //   134: new             Laeur;
        //   137: dup            
        //   138: aload_3        
        //   139: aload_3        
        //   140: ldc             "onCreate"
        //   142: invokevirtual   agnl.f:(Ljava/lang/String;)Ljava/lang/String;
        //   145: invokestatic    aewp.o:(Ljava/lang/String;)Laeux;
        //   148: aload_1        
        //   149: aload_2        
        //   150: aconst_null    
        //   151: invokespecial   aeur.<init>:(Lagnl;Laevl;Laevl;Laevk;[B)V
        //   154: astore_1       
        //   155: aload_0        
        //   156: iconst_1       
        //   157: putfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.b:Z
        //   160: aload_0        
        //   161: invokevirtual   com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.getApplication:()Landroid/app/Application;
        //   164: instanceof      Laerf;
        //   167: invokestatic    adme.T:(Z)V
        //   170: aload_0        
        //   171: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.a:Lhew;
        //   174: ifnonnull       449
        //   177: aload_0        
        //   178: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.b:Z
        //   181: ifeq            436
        //   184: aload_0        
        //   185: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.c:Z
        //   188: ifne            423
        //   191: ldc             "CreateComponent"
        //   193: invokestatic    aewp.o:(Ljava/lang/String;)Laeux;
        //   196: astore_3       
        //   197: aload_0        
        //   198: invokevirtual   hep.aR:()Ljava/lang/Object;
        //   201: pop            
        //   202: aload_3        
        //   203: invokevirtual   aeux.close:()V
        //   206: ldc             "CreatePeer"
        //   208: invokestatic    aewp.o:(Ljava/lang/String;)Laeux;
        //   211: astore_2       
        //   212: aload_0        
        //   213: invokevirtual   hep.aR:()Ljava/lang/Object;
        //   216: astore          4
        //   218: aload           4
        //   220: checkcast       Lesv;
        //   223: getfield        esv.a:Landroid/app/Service;
        //   226: astore          5
        //   228: aload           5
        //   230: instanceof      Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService;
        //   233: ifeq            292
        //   236: aload           5
        //   238: checkcast       Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService;
        //   241: astore_3       
        //   242: aload_3        
        //   243: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   246: pop            
        //   247: aload           4
        //   249: checkcast       Lesv;
        //   252: getfield        esv.b:Lera;
        //   255: getfield        era.py:Lagpb;
        //   258: getfield        agpb.a:Ljava/lang/Object;
        //   261: astore          5
        //   263: new             Lhew;
        //   266: astore          4
        //   268: aload           4
        //   270: aload_3        
        //   271: aload           5
        //   273: checkcast       Landroid/content/Context;
        //   276: invokespecial   hew.<init>:(Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService;Landroid/content/Context;)V
        //   279: aload_0        
        //   280: aload           4
        //   282: putfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.a:Lhew;
        //   285: aload_2        
        //   286: invokevirtual   aeux.close:()V
        //   289: goto            449
        //   292: new             Ljava/lang/IllegalStateException;
        //   295: astore_3       
        //   296: ldc             Lhew;.class
        //   298: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   301: astore          4
        //   303: aload           5
        //   305: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   308: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   311: astore          6
        //   313: new             Ljava/lang/StringBuilder;
        //   316: astore          5
        //   318: aload           5
        //   320: ldc             "Attempt to inject a Service wrapper of type "
        //   322: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   325: aload           5
        //   327: aload           4
        //   329: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   332: pop            
        //   333: aload           5
        //   335: ldc_w           ", but the wrapper available is of type: "
        //   338: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   341: pop            
        //   342: aload           5
        //   344: aload           6
        //   346: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   349: pop            
        //   350: aload           5
        //   352: ldc_w           ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   355: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   358: pop            
        //   359: aload_3        
        //   360: aload           5
        //   362: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   365: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   368: aload_3        
        //   369: athrow         
        //   370: astore_3       
        //   371: goto            392
        //   374: astore_3       
        //   375: new             Ljava/lang/IllegalStateException;
        //   378: astore          4
        //   380: aload           4
        //   382: ldc_w           "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   385: aload_3        
        //   386: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   389: aload           4
        //   391: athrow         
        //   392: aload_2        
        //   393: invokevirtual   aeux.close:()V
        //   396: goto            405
        //   399: astore_2       
        //   400: aload_3        
        //   401: aload_2        
        //   402: invokestatic    hhg.e:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   405: aload_3        
        //   406: athrow         
        //   407: astore_2       
        //   408: aload_3        
        //   409: invokevirtual   aeux.close:()V
        //   412: goto            421
        //   415: astore_3       
        //   416: aload_2        
        //   417: aload_3        
        //   418: invokestatic    hhg.e:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   421: aload_2        
        //   422: athrow         
        //   423: new             Ljava/lang/IllegalStateException;
        //   426: astore_2       
        //   427: aload_2        
        //   428: ldc_w           "createPeer() called after destroyed."
        //   431: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   434: aload_2        
        //   435: athrow         
        //   436: new             Ljava/lang/IllegalStateException;
        //   439: astore_2       
        //   440: aload_2        
        //   441: ldc_w           "createPeer() called outside of onCreate"
        //   444: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   447: aload_2        
        //   448: athrow         
        //   449: aload_0        
        //   450: invokespecial   hep.onCreate:()V
        //   453: aload_0        
        //   454: iconst_0       
        //   455: putfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.b:Z
        //   458: aload_1        
        //   459: invokeinterface aevl.close:()V
        //   464: return         
        //   465: astore_2       
        //   466: aload_1        
        //   467: invokeinterface aevl.close:()V
        //   472: goto            481
        //   475: astore_1       
        //   476: aload_2        
        //   477: aload_1        
        //   478: invokestatic    hhg.e:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   481: aload_2        
        //   482: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  155    197    465    483    Any
        //  197    202    407    423    Any
        //  202    212    465    483    Any
        //  212    218    374    392    Ljava/lang/ClassCastException;
        //  212    218    370    407    Any
        //  218    285    370    407    Any
        //  285    289    465    483    Any
        //  292    370    370    407    Any
        //  375    392    370    407    Any
        //  392    396    399    405    Any
        //  400    405    465    483    Any
        //  405    407    465    483    Any
        //  408    412    415    421    Any
        //  416    421    465    483    Any
        //  421    423    465    483    Any
        //  423    436    465    483    Any
        //  436    449    465    483    Any
        //  449    458    465    483    Any
        //  466    472    475    481    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0392:
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
    
    public final void onDestroy() {
        final agnl d = this.d;
        final aevk a = aewp.a();
        aeuq b;
        if (!aewp.r()) {
            b = afot.m((Context)d.b).b("Destroying ".concat(String.valueOf(d.b.getClass().getSimpleName())), aevh.a);
        }
        else {
            b = null;
        }
        final aevl e = agnl.e(a, b, aewp.o(d.f("onDestroy")));
        try {
            super.onDestroy();
            final hew b2 = this.b();
            ((SegmentProcessingService)b2.a).stopForeground(true);
            ((SegmentProcessingService)b2.a).stopSelf();
            this.c = true;
            e.close();
        }
        finally {
            try {
                e.close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hhg.e(t, t2);
            }
        }
    }
}
