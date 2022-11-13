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
        //    33: goto            292
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
        //    78: astore          7
        //    80: new             Laelp;
        //    83: astore          8
        //    85: aload           8
        //    87: aload           6
        //    89: aload           4
        //    91: invokespecial   aelp.<init>:(Lcom/google/common/util/concurrent/ListenableFuture;Ljava/lang/String;)V
        //    94: aload           7
        //    96: aload           8
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
        //   124: astore_1       
        //   125: aload           5
        //   127: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   130: pop            
        //   131: new             Lcom/google/android/youtube/api/jar/client/d;
        //   134: astore          4
        //   136: aload           4
        //   138: aload           5
        //   140: bipush          10
        //   142: invokespecial   com/google/android/youtube/api/jar/client/d.<init>:(Landroid/os/PowerManager$WakeLock;I)V
        //   145: aload_1        
        //   146: aload           4
        //   148: getstatic       afum.a:Lafum;
        //   151: invokeinterface com/google/common/util/concurrent/ListenableFuture.addListener:(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
        //   156: return         
        //   157: astore_1       
        //   158: aload_0        
        //   159: getfield        aelq.i:Z
        //   162: ifne            292
        //   165: aload_0        
        //   166: getfield        aelq.b:Landroid/content/Context;
        //   169: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   172: aload_0        
        //   173: getfield        aelq.b:Landroid/content/Context;
        //   176: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   179: sipush          4096
        //   182: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   185: astore          4
        //   187: aload           4
        //   189: getfield        android/content/pm/PackageInfo.requestedPermissions:[Ljava/lang/String;
        //   192: ifnull          290
        //   195: aload           4
        //   197: getfield        android/content/pm/PackageInfo.requestedPermissions:[Ljava/lang/String;
        //   200: astore          4
        //   202: aload           4
        //   204: arraylength    
        //   205: istore_3       
        //   206: iconst_0       
        //   207: istore_2       
        //   208: iload_2        
        //   209: iload_3        
        //   210: if_icmpge       290
        //   213: ldc             "android.permission.WAKE_LOCK"
        //   215: aload           4
        //   217: iload_2        
        //   218: aaload         
        //   219: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   222: ifeq            252
        //   225: aload_0        
        //   226: iconst_1       
        //   227: putfield        aelq.i:Z
        //   230: getstatic       aelq.a:Lafkk;
        //   233: invokevirtual   afkg.g:()Lafkz;
        //   236: ldc             "Failed to acquire wakelock"
        //   238: ldc             "com/google/apps/tiktok/concurrent/AndroidFutures"
        //   240: ldc             "checkPermissionRequested"
        //   242: sipush          154
        //   245: ldc             "AndroidFutures.java"
        //   247: aload_1        
        //   248: invokestatic    c.i:(Lafkz;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;CLjava/lang/String;Ljava/lang/Throwable;)V
        //   251: return         
        //   252: iinc            2, 1
        //   255: goto            208
        //   258: astore          4
        //   260: ldc             Ljava/lang/Throwable;.class
        //   262: ldc             "addSuppressed"
        //   264: iconst_1       
        //   265: anewarray       Ljava/lang/Class;
        //   268: dup            
        //   269: iconst_0       
        //   270: ldc             Ljava/lang/Throwable;.class
        //   272: aastore        
        //   273: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   276: aload_1        
        //   277: iconst_1       
        //   278: anewarray       Ljava/lang/Object;
        //   281: dup            
        //   282: iconst_0       
        //   283: aload           4
        //   285: aastore        
        //   286: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   289: pop            
        //   290: aload_1        
        //   291: athrow         
        //   292: return         
        //   293: astore          4
        //   295: goto            290
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  36     156    157    292    Ljava/lang/SecurityException;
        //  165    206    258    290    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  213    251    258    290    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  260    290    293    298    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0290:
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
