// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim;

import android.content.Context;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public final class SegmentProcessingService extends hdn implements aemu
{
    private hdv a;
    private boolean b;
    private boolean c;
    private final agjt d;
    
    @Deprecated
    public SegmentProcessingService() {
        this.d = new agjt((Service)this);
        qcj.s();
    }
    
    public final hdv b() {
        final hdv a = this.a;
        if (a == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.c) {
            return a;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final IBinder onBind(final Intent intent) {
        final agjt d = this.d;
        final aerr a = aesw.a();
        final Object b = d.b;
        final String concat = String.valueOf(((Service)b).getClass().getName()).concat(".onBind");
        Object o;
        if (intent == null) {
            o = ajox.W((Service)b, concat);
        }
        else {
            final aerr aerr = (aerr)aesm.n(intent, false);
            if (aerr != null) {
                aesw.n(aerr);
                o = aerb.a;
            }
            else {
                o = ajox.W((Service)b, concat);
            }
        }
        final aers e = agjt.e(a, (aers)o, (aers)aesw.o(d.f("onBind")));
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
                hxd.e((Throwable)intent, t);
            }
        }
    }
    
    public final void onCreate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.d:Lagjt;
        //     4: astore_1       
        //     5: invokestatic    aesw.a:()Laerr;
        //     8: astore_2       
        //     9: invokestatic    aesw.r:()Z
        //    12: ifne            132
        //    15: invokestatic    aesw.d:()Laerr;
        //    18: astore_3       
        //    19: aload_3        
        //    20: ifnull          94
        //    23: new             Laera;
        //    26: dup            
        //    27: iconst_0       
        //    28: invokespecial   aera.<init>:(I)V
        //    31: astore          4
        //    33: aload_3        
        //    34: invokestatic    aesw.n:(Laerr;)V
        //    37: invokestatic    aeri.b:()Laerg;
        //    40: astore          5
        //    42: aload           5
        //    44: getstatic       aero.c:Lafld;
        //    47: aload           4
        //    49: invokeinterface aerg.a:(Lafld;Ljava/lang/Object;)V
        //    54: aload           5
        //    56: checkcast       Laeri;
        //    59: invokevirtual   aeri.e:()Laeri;
        //    62: astore          4
        //    64: aload_1        
        //    65: ldc             "Creating "
        //    67: aload_1        
        //    68: getfield        agjt.b:Ljava/lang/Object;
        //    71: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    74: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //    77: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    80: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    83: aload           4
        //    85: invokestatic    aesw.p:(Ljava/lang/String;Laeri;)Laere;
        //    88: putfield        agjt.a:Ljava/lang/Object;
        //    91: goto            134
        //    94: aload_1        
        //    95: getfield        agjt.b:Ljava/lang/Object;
        //    98: checkcast       Landroid/content/Context;
        //   101: invokestatic    alhb.S:(Landroid/content/Context;)Laeru;
        //   104: ldc             "Creating "
        //   106: aload_1        
        //   107: getfield        agjt.b:Ljava/lang/Object;
        //   110: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   113: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   116: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   119: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   122: getstatic       aero.a:Laeri;
        //   125: invokevirtual   aeru.b:(Ljava/lang/String;Laeri;)Laeqx;
        //   128: astore_3       
        //   129: goto            134
        //   132: aconst_null    
        //   133: astore_3       
        //   134: new             Laeqy;
        //   137: dup            
        //   138: aload_1        
        //   139: aload_1        
        //   140: ldc             "onCreate"
        //   142: invokevirtual   agjt.f:(Ljava/lang/String;)Ljava/lang/String;
        //   145: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //   148: aload_3        
        //   149: aload_2        
        //   150: aconst_null    
        //   151: invokespecial   aeqy.<init>:(Lagjt;Laers;Laers;Laerr;[B)V
        //   154: astore_3       
        //   155: aload_0        
        //   156: iconst_1       
        //   157: putfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.b:Z
        //   160: aload_0        
        //   161: invokevirtual   com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.getApplication:()Landroid/app/Application;
        //   164: instanceof      Laenm;
        //   167: invokestatic    agot.D:(Z)V
        //   170: aload_0        
        //   171: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.a:Lhdv;
        //   174: ifnonnull       450
        //   177: aload_0        
        //   178: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.b:Z
        //   181: ifeq            437
        //   184: aload_0        
        //   185: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.c:Z
        //   188: ifne            424
        //   191: ldc             "CreateComponent"
        //   193: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //   196: astore_1       
        //   197: aload_0        
        //   198: invokevirtual   hdn.aR:()Ljava/lang/Object;
        //   201: pop            
        //   202: aload_1        
        //   203: invokevirtual   aere.close:()V
        //   206: ldc             "CreatePeer"
        //   208: invokestatic    aesw.o:(Ljava/lang/String;)Laere;
        //   211: astore_2       
        //   212: aload_0        
        //   213: invokevirtual   hdn.aR:()Ljava/lang/Object;
        //   216: astore          4
        //   218: aload           4
        //   220: checkcast       Lesq;
        //   223: getfield        esq.a:Landroid/app/Service;
        //   226: astore          5
        //   228: aload           5
        //   230: instanceof      Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService;
        //   233: ifeq            292
        //   236: aload           5
        //   238: checkcast       Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService;
        //   241: astore_1       
        //   242: aload_1        
        //   243: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   246: pop            
        //   247: aload           4
        //   249: checkcast       Lesq;
        //   252: getfield        esq.b:Leqv;
        //   255: getfield        eqv.qg:Laeby;
        //   258: getfield        aeby.a:Ljava/lang/Object;
        //   261: astore          4
        //   263: new             Lhdv;
        //   266: astore          5
        //   268: aload           5
        //   270: aload_1        
        //   271: aload           4
        //   273: checkcast       Landroid/content/Context;
        //   276: invokespecial   hdv.<init>:(Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService;Landroid/content/Context;)V
        //   279: aload_0        
        //   280: aload           5
        //   282: putfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.a:Lhdv;
        //   285: aload_2        
        //   286: invokevirtual   aere.close:()V
        //   289: goto            450
        //   292: new             Ljava/lang/IllegalStateException;
        //   295: astore          4
        //   297: ldc             Lhdv;.class
        //   299: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   302: astore_1       
        //   303: aload           5
        //   305: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   308: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   311: astore          5
        //   313: new             Ljava/lang/StringBuilder;
        //   316: astore          6
        //   318: aload           6
        //   320: ldc             "Attempt to inject a Service wrapper of type "
        //   322: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   325: aload           6
        //   327: aload_1        
        //   328: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   331: pop            
        //   332: aload           6
        //   334: ldc_w           ", but the wrapper available is of type: "
        //   337: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   340: pop            
        //   341: aload           6
        //   343: aload           5
        //   345: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   348: pop            
        //   349: aload           6
        //   351: ldc_w           ". Does your peer's @Inject constructor reference the wrong wrapper class?"
        //   354: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   357: pop            
        //   358: aload           4
        //   360: aload           6
        //   362: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   365: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   368: aload           4
        //   370: athrow         
        //   371: astore_1       
        //   372: goto            393
        //   375: astore_1       
        //   376: new             Ljava/lang/IllegalStateException;
        //   379: astore          4
        //   381: aload           4
        //   383: ldc_w           "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   386: aload_1        
        //   387: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   390: aload           4
        //   392: athrow         
        //   393: aload_2        
        //   394: invokevirtual   aere.close:()V
        //   397: goto            406
        //   400: astore_2       
        //   401: aload_1        
        //   402: aload_2        
        //   403: invokestatic    hxd.e:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   406: aload_1        
        //   407: athrow         
        //   408: astore_2       
        //   409: aload_1        
        //   410: invokevirtual   aere.close:()V
        //   413: goto            422
        //   416: astore_1       
        //   417: aload_2        
        //   418: aload_1        
        //   419: invokestatic    hxd.e:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   422: aload_2        
        //   423: athrow         
        //   424: new             Ljava/lang/IllegalStateException;
        //   427: astore_2       
        //   428: aload_2        
        //   429: ldc_w           "createPeer() called after destroyed."
        //   432: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   435: aload_2        
        //   436: athrow         
        //   437: new             Ljava/lang/IllegalStateException;
        //   440: astore_2       
        //   441: aload_2        
        //   442: ldc_w           "createPeer() called outside of onCreate"
        //   445: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   448: aload_2        
        //   449: athrow         
        //   450: aload_0        
        //   451: invokespecial   hdn.onCreate:()V
        //   454: aload_0        
        //   455: iconst_0       
        //   456: putfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.b:Z
        //   459: aload_3        
        //   460: invokeinterface aers.close:()V
        //   465: return         
        //   466: astore_2       
        //   467: aload_3        
        //   468: invokeinterface aers.close:()V
        //   473: goto            482
        //   476: astore_3       
        //   477: aload_2        
        //   478: aload_3        
        //   479: invokestatic    hxd.e:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   482: aload_2        
        //   483: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                          
        //  -----  -----  -----  -----  ------------------------------
        //  155    197    466    484    Any
        //  197    202    408    424    Any
        //  202    212    466    484    Any
        //  212    218    375    393    Ljava/lang/ClassCastException;
        //  212    218    371    408    Any
        //  218    285    371    408    Any
        //  285    289    466    484    Any
        //  292    371    371    408    Any
        //  376    393    371    408    Any
        //  393    397    400    406    Any
        //  401    406    466    484    Any
        //  406    408    466    484    Any
        //  409    413    416    422    Any
        //  417    422    466    484    Any
        //  422    424    466    484    Any
        //  424    437    466    484    Any
        //  437    450    466    484    Any
        //  450    459    466    484    Any
        //  467    473    476    482    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0393:
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
        final agjt d = this.d;
        final aerr a = aesw.a();
        Object b;
        if (!aesw.r()) {
            b = alhb.S((Context)d.b).b("Destroying ".concat(String.valueOf(d.b.getClass().getSimpleName())), aero.a);
        }
        else {
            b = null;
        }
        final aers e = agjt.e(a, (aers)b, (aers)aesw.o(d.f("onDestroy")));
        try {
            super.onDestroy();
            final hdv b2 = this.b();
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
                hxd.e(t, t2);
            }
        }
    }
}
