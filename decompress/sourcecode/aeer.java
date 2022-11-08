import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeer extends aefn
{
    private final Context a;
    private final Handler b;
    private final uyi c;
    private final c d;
    private final lkn e;
    
    public aeer(final Context a, final lkn e, final c d, final Handler b, final uyi c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.e = e;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final aeey p0, final int p1, final String p2, final String p3, final String p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: sipush          1000
        //     4: if_icmpge       14
        //     7: aload_1        
        //     8: bipush          9
        //    10: invokestatic    com/google/android/youtube/api/service/YouTubeService.b:(Laeey;I)V
        //    13: return         
        //    14: aload_0        
        //    15: getfield        aeer.a:Landroid/content/Context;
        //    18: astore          6
        //    20: invokestatic    android/os/Binder.getCallingUid:()I
        //    23: istore          7
        //    25: aload_3        
        //    26: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    29: ifeq            35
        //    32: goto            501
        //    35: aload           6
        //    37: invokestatic    mzn.a:(Landroid/content/Context;)Lmck;
        //    40: astore          8
        //    42: aload           8
        //    44: getfield        mck.a:Ljava/lang/Object;
        //    47: checkcast       Landroid/content/Context;
        //    50: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    53: iload           7
        //    55: invokevirtual   android/content/pm/PackageManager.getPackagesForUid:(I)[Ljava/lang/String;
        //    58: astore          6
        //    60: iconst_1       
        //    61: istore          9
        //    63: aload           6
        //    65: ifnull          71
        //    68: goto            271
        //    71: aload           8
        //    73: getfield        mck.a:Ljava/lang/Object;
        //    76: checkcast       Landroid/content/Context;
        //    79: invokestatic    mck.f:(Landroid/content/Context;)Lmck;
        //    82: astore          10
        //    84: aconst_null    
        //    85: astore          8
        //    87: aload           8
        //    89: astore          6
        //    91: aload           10
        //    93: ifnull          271
        //    96: new             Landroid/os/Bundle;
        //    99: astore          6
        //   101: aload           6
        //   103: invokespecial   android/os/Bundle.<init>:()V
        //   106: aload           6
        //   108: ldc             "uid"
        //   110: iload           7
        //   112: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   115: invokestatic    android/os/Binder.clearCallingIdentity:()J
        //   118: lstore          11
        //   120: aload           10
        //   122: getfield        mck.a:Ljava/lang/Object;
        //   125: checkcast       Landroid/content/Context;
        //   128: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   131: getstatic       mzq.a:Landroid/net/Uri;
        //   134: ldc             "getAppPackageForUid"
        //   136: aconst_null    
        //   137: aload           6
        //   139: invokevirtual   android/content/ContentResolver.call:(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
        //   142: astore          6
        //   144: lload           11
        //   146: invokestatic    android/os/Binder.restoreCallingIdentity:(J)V
        //   149: aload           6
        //   151: ifnull          189
        //   154: aload           6
        //   156: ldc             "result"
        //   158: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   161: astore          6
        //   163: aload           6
        //   165: ifnonnull       175
        //   168: aload           8
        //   170: astore          6
        //   172: goto            271
        //   175: iconst_1       
        //   176: anewarray       Ljava/lang/String;
        //   179: dup            
        //   180: iconst_0       
        //   181: aload           6
        //   183: aastore        
        //   184: astore          6
        //   186: goto            271
        //   189: new             Landroid/os/RemoteException;
        //   192: astore          6
        //   194: aload           6
        //   196: invokespecial   android/os/RemoteException.<init>:()V
        //   199: aload           6
        //   201: athrow         
        //   202: astore          6
        //   204: goto            247
        //   207: astore          6
        //   209: invokestatic    mck.c:()V
        //   212: new             Landroid/os/RemoteException;
        //   215: astore          6
        //   217: aload           6
        //   219: ldc             "SecurityException: Content provider unavailable. Likely framework issue."
        //   221: invokespecial   android/os/RemoteException.<init>:(Ljava/lang/String;)V
        //   224: aload           6
        //   226: athrow         
        //   227: astore          6
        //   229: invokestatic    mck.c:()V
        //   232: new             Landroid/os/RemoteException;
        //   235: astore          6
        //   237: aload           6
        //   239: ldc             "IAE: Content provider unavailable. Likely GmsCore down."
        //   241: invokespecial   android/os/RemoteException.<init>:(Ljava/lang/String;)V
        //   244: aload           6
        //   246: athrow         
        //   247: lload           11
        //   249: invokestatic    android/os/Binder.restoreCallingIdentity:(J)V
        //   252: aload           6
        //   254: athrow         
        //   255: astore          6
        //   257: ldc             "InstantAppsPMW"
        //   259: ldc             "Error getting app package for UID"
        //   261: aload           6
        //   263: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   266: pop            
        //   267: aload           8
        //   269: astore          6
        //   271: aload_3        
        //   272: ifnull          501
        //   275: aload           6
        //   277: ifnull          501
        //   280: iconst_0       
        //   281: istore          7
        //   283: iload           7
        //   285: aload           6
        //   287: arraylength    
        //   288: if_icmpge       501
        //   291: aload_3        
        //   292: aload           6
        //   294: iload           7
        //   296: aaload         
        //   297: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   300: ifeq            495
        //   303: new             Laees;
        //   306: dup            
        //   307: aload_0        
        //   308: getfield        aeer.a:Landroid/content/Context;
        //   311: aload_0        
        //   312: getfield        aeer.d:Lcom/google/android/apps/youtube/embeddedplayer/service/clientinfo/service/c;
        //   315: aload_3        
        //   316: aload_1        
        //   317: aload_0        
        //   318: getfield        aeer.e:Llkn;
        //   321: aload_0        
        //   322: getfield        aeer.b:Landroid/os/Handler;
        //   325: new             Laeep;
        //   328: dup            
        //   329: aload_0        
        //   330: getfield        aeer.a:Landroid/content/Context;
        //   333: invokestatic    mpe.a:(Landroid/content/Context;)Lmpe;
        //   336: invokespecial   aeep.<init>:(Lmpe;)V
        //   339: aload_0        
        //   340: getfield        aeer.c:Luyi;
        //   343: aconst_null    
        //   344: aconst_null    
        //   345: aconst_null    
        //   346: invokespecial   aees.<init>:(Landroid/content/Context;Lcom/google/android/apps/youtube/embeddedplayer/service/clientinfo/service/c;Ljava/lang/String;Laeey;Llkn;Landroid/os/Handler;Laeep;Luyi;[B[B[B)V
        //   349: astore          8
        //   351: iload_2        
        //   352: invokestatic    aefx.b:(I)Ljava/lang/String;
        //   355: astore_1       
        //   356: aload           4
        //   358: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   361: pop            
        //   362: aload           5
        //   364: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   367: pop            
        //   368: aload           8
        //   370: getfield        aees.f:Luyi;
        //   373: ldc2_w          45377141
        //   376: invokevirtual   uyi.f:(J)Z
        //   379: ifeq            450
        //   382: aload           8
        //   384: getfield        aees.e:Laeep;
        //   387: astore          6
        //   389: aload           8
        //   391: getfield        aees.d:Ljava/lang/String;
        //   394: astore_3       
        //   395: aload           6
        //   397: getfield        aeep.a:Lmpe;
        //   400: aload_3        
        //   401: invokevirtual   mpe.c:(Ljava/lang/String;)Z
        //   404: ifeq            424
        //   407: aload           6
        //   409: getfield        aeep.b:Ljava/util/Set;
        //   412: aload_3        
        //   413: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   418: ifeq            424
        //   421: goto            427
        //   424: iconst_0       
        //   425: istore          9
        //   427: getstatic       android/os/Build.TYPE:Ljava/lang/String;
        //   430: ldc             "userdebug"
        //   432: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   435: ifne            447
        //   438: getstatic       android/os/Build.TYPE:Ljava/lang/String;
        //   441: ldc             "eng"
        //   443: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   446: pop            
        //   447: goto            463
        //   450: getstatic       aees.a:Lafdu;
        //   453: aload           8
        //   455: getfield        aees.d:Ljava/lang/String;
        //   458: invokevirtual   afdu.contains:(Ljava/lang/Object;)Z
        //   461: istore          9
        //   463: aload           8
        //   465: aload           8
        //   467: getfield        aees.c:Landroid/os/Handler;
        //   470: aload           8
        //   472: getfield        aees.b:Landroid/content/Context;
        //   475: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //   478: aload           5
        //   480: aload           8
        //   482: getfield        aees.d:Ljava/lang/String;
        //   485: aload           4
        //   487: aload_1        
        //   488: iload           9
        //   490: iconst_2       
        //   491: invokestatic    lnf.p:(Llng;Landroid/os/Handler;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
        //   494: return         
        //   495: iinc            7, 1
        //   498: goto            283
        //   501: aload_1        
        //   502: iconst_2       
        //   503: invokestatic    com/google/android/youtube/api/service/YouTubeService.b:(Laeey;I)V
        //   506: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  96     120    255    271    Landroid/os/RemoteException;
        //  120    144    227    247    Ljava/lang/IllegalArgumentException;
        //  120    144    207    227    Ljava/lang/SecurityException;
        //  120    144    202    207    Any
        //  144    149    255    271    Landroid/os/RemoteException;
        //  154    163    255    271    Landroid/os/RemoteException;
        //  175    186    255    271    Landroid/os/RemoteException;
        //  189    202    255    271    Landroid/os/RemoteException;
        //  209    227    202    207    Any
        //  229    247    202    207    Any
        //  247    255    255    271    Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
}
