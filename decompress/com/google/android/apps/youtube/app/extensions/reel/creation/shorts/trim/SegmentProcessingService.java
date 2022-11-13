// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim;

import android.content.Context;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public final class SegmentProcessingService extends heh implements aeou
{
    private heo a;
    private boolean b;
    private boolean c;
    private final aglu d;
    
    @Deprecated
    public SegmentProcessingService() {
        this.d = new aglu((Service)this);
        qdt.h();
    }
    
    public final /* bridge */ Object aN() {
        return this.b();
    }
    
    public final heo b() {
        final heo a = this.a;
        if (a == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (!this.c) {
            return a;
        }
        throw new IllegalStateException("peer() called after destroyed.");
    }
    
    public final IBinder onBind(Intent e) {
        final aglu d = this.d;
        final aets a = aeux.a();
        final Object b = d.b;
        final String concat = String.valueOf(((Service)b).getClass().getName()).concat(".onBind");
        Object o;
        if (e == null) {
            o = agqs.ap((Service)b, concat);
        }
        else {
            final aets aets = (aets)aeun.n(e, false);
            if (aets != null) {
                aeux.n(aets);
                o = aetc.a;
            }
            else {
                o = agqs.ap((Service)b, concat);
            }
        }
        e = (Intent)aglu.e(a, (aett)o, (aett)aeux.o(d.f("onBind")));
        try {
            final Object c = this.b().c;
            ((aett)e).close();
            return (IBinder)c;
        }
        finally {
            try {
                ((aett)e).close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                hgy.e(t, t2);
            }
        }
    }
    
    public final void onCreate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.d:Laglu;
        //     4: astore_2       
        //     5: invokestatic    aeux.a:()Laets;
        //     8: astore_3       
        //     9: invokestatic    aeux.r:()Z
        //    12: ifne            132
        //    15: invokestatic    aeux.d:()Laets;
        //    18: astore_1       
        //    19: aload_1        
        //    20: ifnull          94
        //    23: new             Laetb;
        //    26: dup            
        //    27: iconst_0       
        //    28: invokespecial   aetb.<init>:(I)V
        //    31: astore          5
        //    33: aload_1        
        //    34: invokestatic    aeux.n:(Laets;)V
        //    37: invokestatic    aetj.b:()Laeth;
        //    40: astore          4
        //    42: aload           4
        //    44: getstatic       aetp.c:Lagqs;
        //    47: aload           5
        //    49: invokeinterface aeth.a:(Lagqs;Ljava/lang/Object;)V
        //    54: aload           4
        //    56: checkcast       Laetj;
        //    59: invokevirtual   aetj.e:()Laetj;
        //    62: astore          4
        //    64: aload_2        
        //    65: ldc             "Creating "
        //    67: aload_2        
        //    68: getfield        aglu.b:Ljava/lang/Object;
        //    71: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    74: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //    77: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    80: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    83: aload           4
        //    85: invokestatic    aeux.p:(Ljava/lang/String;Laetj;)Laetf;
        //    88: putfield        aglu.a:Ljava/lang/Object;
        //    91: goto            134
        //    94: aload_2        
        //    95: getfield        aglu.b:Ljava/lang/Object;
        //    98: checkcast       Landroid/content/Context;
        //   101: invokestatic    afnd.v:(Landroid/content/Context;)Laetv;
        //   104: ldc             "Creating "
        //   106: aload_2        
        //   107: getfield        aglu.b:Ljava/lang/Object;
        //   110: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   113: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   116: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   119: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   122: getstatic       aetp.a:Laetj;
        //   125: invokevirtual   aetv.b:(Ljava/lang/String;Laetj;)Laesy;
        //   128: astore_1       
        //   129: goto            134
        //   132: aconst_null    
        //   133: astore_1       
        //   134: new             Laesz;
        //   137: dup            
        //   138: aload_2        
        //   139: aload_2        
        //   140: ldc             "onCreate"
        //   142: invokevirtual   aglu.f:(Ljava/lang/String;)Ljava/lang/String;
        //   145: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //   148: aload_1        
        //   149: aload_3        
        //   150: aconst_null    
        //   151: invokespecial   aesz.<init>:(Laglu;Laett;Laett;Laets;[B)V
        //   154: astore_1       
        //   155: aload_0        
        //   156: iconst_1       
        //   157: putfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.b:Z
        //   160: aload_0        
        //   161: invokevirtual   com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.getApplication:()Landroid/app/Application;
        //   164: instanceof      Laepm;
        //   167: invokestatic    adkp.Q:(Z)V
        //   170: aload_0        
        //   171: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.a:Lheo;
        //   174: ifnonnull       450
        //   177: aload_0        
        //   178: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.b:Z
        //   181: ifeq            437
        //   184: aload_0        
        //   185: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.c:Z
        //   188: ifne            424
        //   191: ldc             "CreateComponent"
        //   193: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //   196: astore_3       
        //   197: aload_0        
        //   198: invokevirtual   heh.aR:()Ljava/lang/Object;
        //   201: pop            
        //   202: aload_3        
        //   203: invokevirtual   aetf.close:()V
        //   206: ldc             "CreatePeer"
        //   208: invokestatic    aeux.o:(Ljava/lang/String;)Laetf;
        //   211: astore_2       
        //   212: aload_0        
        //   213: invokevirtual   heh.aR:()Ljava/lang/Object;
        //   216: astore          4
        //   218: aload           4
        //   220: checkcast       Lest;
        //   223: getfield        est.a:Landroid/app/Service;
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
        //   249: checkcast       Lest;
        //   252: getfield        est.b:Leqy;
        //   255: getfield        eqy.qg:Lauch;
        //   258: getfield        auch.a:Ljava/lang/Object;
        //   261: astore          4
        //   263: new             Lheo;
        //   266: astore          5
        //   268: aload           5
        //   270: aload_3        
        //   271: aload           4
        //   273: checkcast       Landroid/content/Context;
        //   276: invokespecial   heo.<init>:(Lcom/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService;Landroid/content/Context;)V
        //   279: aload_0        
        //   280: aload           5
        //   282: putfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.a:Lheo;
        //   285: aload_2        
        //   286: invokevirtual   aetf.close:()V
        //   289: goto            450
        //   292: new             Ljava/lang/IllegalStateException;
        //   295: astore          4
        //   297: ldc             Lheo;.class
        //   299: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   302: astore_3       
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
        //   327: aload_3        
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
        //   371: astore_3       
        //   372: goto            393
        //   375: astore_3       
        //   376: new             Ljava/lang/IllegalStateException;
        //   379: astore          4
        //   381: aload           4
        //   383: ldc_w           "Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class."
        //   386: aload_3        
        //   387: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   390: aload           4
        //   392: athrow         
        //   393: aload_2        
        //   394: invokevirtual   aetf.close:()V
        //   397: goto            406
        //   400: astore_2       
        //   401: aload_3        
        //   402: aload_2        
        //   403: invokestatic    hgy.e:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //   406: aload_3        
        //   407: athrow         
        //   408: astore_2       
        //   409: aload_3        
        //   410: invokevirtual   aetf.close:()V
        //   413: goto            422
        //   416: astore_3       
        //   417: aload_2        
        //   418: aload_3        
        //   419: invokestatic    hgy.e:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
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
        //   451: invokespecial   heh.onCreate:()V
        //   454: aload_0        
        //   455: iconst_0       
        //   456: putfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/trim/SegmentProcessingService.b:Z
        //   459: aload_1        
        //   460: invokeinterface aett.close:()V
        //   465: return         
        //   466: astore_2       
        //   467: aload_1        
        //   468: invokeinterface aett.close:()V
        //   473: goto            482
        //   476: astore_1       
        //   477: aload_2        
        //   478: aload_1        
        //   479: invokestatic    hgy.e:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
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
        final aglu d = this.d;
        final aets a = aeux.a();
        Object b;
        if (!aeux.r()) {
            b = afnd.v((Context)d.b).b("Destroying ".concat(String.valueOf(d.b.getClass().getSimpleName())), aetp.a);
        }
        else {
            b = null;
        }
        final aett e = aglu.e(a, (aett)b, (aett)aeux.o(d.f("onDestroy")));
        try {
            super.onDestroy();
            final heo b2 = this.b();
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
                hgy.e(t, t2);
            }
        }
    }
}
