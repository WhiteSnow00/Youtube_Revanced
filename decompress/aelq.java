import java.util.concurrent.Executor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;
import android.os.PowerManager;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelq
{
    public static final afkk a;
    public final Context b;
    public final afvs c;
    public final afvt d;
    public final Map e;
    public final sqq f;
    private final PowerManager g;
    private final afvt h;
    private boolean i;
    
    static {
        a = afkk.m("com/google/apps/tiktok/concurrent/AndroidFutures");
    }
    
    public aelq(final Context b, final PowerManager g, final afvs c, final Map e, final afvt d, final afvt h, final sqq f, final byte[] array, final byte[] array2, final byte[] array3) {
        adyf.A((afaq)new adhz(this, 14));
        this.i = false;
        this.b = b;
        this.g = g;
        this.c = c;
        this.d = d;
        this.h = h;
        this.e = e;
        this.f = f;
    }
    
    public static void a(final ListenableFuture listenableFuture, final String s, final Object[] array) {
        try {
            afwm.u((Future)listenableFuture);
        }
        catch (final ExecutionException ex) {
            ((afki)((afki)((afki)((afkg)aelq.a).g()).i(ex.getCause())).j("com/google/apps/tiktok/concurrent/AndroidFutures", "lambda$logOnFailure$3", 339, "AndroidFutures.java")).z(s, array);
        }
        catch (final CancellationException ex2) {}
    }
    
    public static void b(final ListenableFuture listenableFuture, final String s, final Object... array) {
        listenableFuture.addListener(aeun.h((Runnable)new adlo(listenableFuture, s, array, 5)), (Executor)afum.a);
    }
    
    public final void c(final ListenableFuture p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          4
        //     5: aload           4
        //     7: ifnonnull       17
        //    10: ldc             "<no trace>"
        //    12: astore          4
        //    14: goto            24
        //    17: aload           4
        //    19: invokestatic    aeux.h:(Laets;)Ljava/lang/String;
        //    22: astore          4
        //    24: aload_1        
        //    25: invokeinterface com/google/common/util/concurrent/ListenableFuture.isDone:()Z
        //    30: ifeq            36
        //    33: goto            291
        //    36: aload_0        
        //    37: getfield        aelq.g:Landroid/os/PowerManager;
        //    40: iconst_1       
        //    41: aload           4
        //    43: invokevirtual   android/os/PowerManager.newWakeLock:(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
        //    46: astore          5
        //    48: aload           5
        //    50: invokevirtual   android/os/PowerManager$WakeLock.acquire:()V
        //    53: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //    56: astore          7
        //    58: aload_1        
        //    59: invokestatic    afwm.n:(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;
        //    62: astore          6
        //    64: aload           6
        //    66: ldc2_w          45
        //    69: aload           7
        //    71: aload_0        
        //    72: getfield        aelq.d:Lafvt;
        //    75: invokestatic    afwm.t:(Lcom/google/common/util/concurrent/ListenableFuture;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/common/util/concurrent/ListenableFuture;
        //    78: astore          8
        //    80: new             Laelp;
        //    83: astore          7
        //    85: aload           7
        //    87: aload           6
        //    89: aload           4
        //    91: invokespecial   aelp.<init>:(Lcom/google/common/util/concurrent/ListenableFuture;Ljava/lang/String;)V
        //    94: aload           8
        //    96: aload           7
        //    98: invokestatic    aeun.f:(Lafva;)Lafva;
        //   101: getstatic       afum.a:Lafum;
        //   104: invokestatic    afwm.w:(Lcom/google/common/util/concurrent/ListenableFuture;Lafva;Ljava/util/concurrent/Executor;)V
        //   107: aload_1        
        //   108: invokestatic    afwm.n:(Lcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   111: ldc2_w          3600
        //   114: getstatic       java/util/concurrent/TimeUnit.SECONDS:Ljava/util/concurrent/TimeUnit;
        //   117: aload_0        
        //   118: getfield        aelq.h:Lafvt;
        //   121: invokestatic    afwm.t:(Lcom/google/common/util/concurrent/ListenableFuture;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   124: astore          4
        //   126: aload           5
        //   128: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   131: pop            
        //   132: new             Lcom/google/android/youtube/api/jar/client/d;
        //   135: astore_1       
        //   136: aload_1        
        //   137: aload           5
        //   139: bipush          10
        //   141: invokespecial   com/google/android/youtube/api/jar/client/d.<init>:(Landroid/os/PowerManager$WakeLock;I)V
        //   144: aload           4
        //   146: aload_1        
        //   147: getstatic       afum.a:Lafum;
        //   150: invokeinterface com/google/common/util/concurrent/ListenableFuture.addListener:(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
        //   155: return         
        //   156: astore_1       
        //   157: aload_0        
        //   158: getfield        aelq.i:Z
        //   161: ifne            291
        //   164: aload_0        
        //   165: getfield        aelq.b:Landroid/content/Context;
        //   168: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   171: aload_0        
        //   172: getfield        aelq.b:Landroid/content/Context;
        //   175: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   178: sipush          4096
        //   181: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   184: astore          4
        //   186: aload           4
        //   188: getfield        android/content/pm/PackageInfo.requestedPermissions:[Ljava/lang/String;
        //   191: ifnull          289
        //   194: aload           4
        //   196: getfield        android/content/pm/PackageInfo.requestedPermissions:[Ljava/lang/String;
        //   199: astore          4
        //   201: aload           4
        //   203: arraylength    
        //   204: istore_3       
        //   205: iconst_0       
        //   206: istore_2       
        //   207: iload_2        
        //   208: iload_3        
        //   209: if_icmpge       289
        //   212: ldc             "android.permission.WAKE_LOCK"
        //   214: aload           4
        //   216: iload_2        
        //   217: aaload         
        //   218: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   221: ifeq            251
        //   224: aload_0        
        //   225: iconst_1       
        //   226: putfield        aelq.i:Z
        //   229: getstatic       aelq.a:Lafkk;
        //   232: invokevirtual   afkg.g:()Lafkz;
        //   235: ldc             "Failed to acquire wakelock"
        //   237: ldc             "com/google/apps/tiktok/concurrent/AndroidFutures"
        //   239: ldc             "checkPermissionRequested"
        //   241: sipush          154
        //   244: ldc             "AndroidFutures.java"
        //   246: aload_1        
        //   247: invokestatic    c.i:(Lafkz;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;CLjava/lang/String;Ljava/lang/Throwable;)V
        //   250: return         
        //   251: iinc            2, 1
        //   254: goto            207
        //   257: astore          4
        //   259: ldc             Ljava/lang/Throwable;.class
        //   261: ldc             "addSuppressed"
        //   263: iconst_1       
        //   264: anewarray       Ljava/lang/Class;
        //   267: dup            
        //   268: iconst_0       
        //   269: ldc             Ljava/lang/Throwable;.class
        //   271: aastore        
        //   272: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   275: aload_1        
        //   276: iconst_1       
        //   277: anewarray       Ljava/lang/Object;
        //   280: dup            
        //   281: iconst_0       
        //   282: aload           4
        //   284: aastore        
        //   285: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   288: pop            
        //   289: aload_1        
        //   290: athrow         
        //   291: return         
        //   292: astore          4
        //   294: goto            289
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  36     155    156    291    Ljava/lang/SecurityException;
        //  164    205    257    289    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  212    250    257    289    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  259    289    292    297    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0289:
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
}
