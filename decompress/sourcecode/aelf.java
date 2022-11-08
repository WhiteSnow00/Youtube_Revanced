import androidx.work.WorkerParameters;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelf extends cnd
{
    private static final afik a;
    private final Map b;
    private final aeru c;
    
    static {
        a = afik.m("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory");
    }
    
    public aelf(final Map b, final aeru c) {
        this.b = b;
        this.c = c;
    }
    
    public final cmq a(final Context p0, final String p1, final WorkerParameters p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        aelf.c:Laeru;
        //     4: ldc             "WorkerFactory.createWorker()"
        //     6: invokevirtual   aeru.c:(Ljava/lang/String;)Laers;
        //     9: astore          4
        //    11: aload_2        
        //    12: ldc             Lcom/google/apps/tiktok/contrib/work/TikTokListenableWorker;.class
        //    14: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    17: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    20: ifeq            171
        //    23: aload_3        
        //    24: getfield        androidx/work/WorkerParameters.c:Ljava/util/Set;
        //    27: invokestatic    aelh.a:(Ljava/util/Set;)Lafdu;
        //    30: astore_2       
        //    31: aload_2        
        //    32: invokevirtual   afdu.size:()I
        //    35: istore          5
        //    37: iload           5
        //    39: iconst_1       
        //    40: if_icmpeq       100
        //    43: new             Lagmj;
        //    46: astore_1       
        //    47: aload_1        
        //    48: aload_2        
        //    49: invokevirtual   afdu.size:()I
        //    52: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    55: invokespecial   agmj.<init>:(Ljava/lang/Object;)V
        //    58: getstatic       aelf.a:Lafik;
        //    61: invokevirtual   afig.g:()Lafiz;
        //    64: checkcast       Lafii;
        //    67: ldc             "com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory"
        //    69: ldc             "createWorker"
        //    71: bipush          68
        //    73: ldc             "TikTokWorkerFactory.java"
        //    75: invokeinterface afii.j:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lafiz;
        //    80: checkcast       Lafii;
        //    83: ldc             "A TikTok worker was created, but it has %s count tags instead of 1, so it was skipped"
        //    85: aload_1        
        //    86: invokeinterface afii.t:(Ljava/lang/String;Ljava/lang/Object;)V
        //    91: aload           4
        //    93: invokeinterface aers.close:()V
        //    98: aconst_null    
        //    99: areturn        
        //   100: aload_2        
        //   101: invokestatic    adwd.aL:(Ljava/lang/Iterable;)Ljava/lang/Object;
        //   104: checkcast       Ljava/lang/String;
        //   107: astore          6
        //   109: aload_0        
        //   110: getfield        aelf.b:Ljava/util/Map;
        //   113: aload           6
        //   115: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   120: checkcast       Latjj;
        //   123: astore_2       
        //   124: aload_2        
        //   125: astore          7
        //   127: aload_2        
        //   128: ifnonnull       213
        //   131: getstatic       aelf.a:Lafik;
        //   134: invokevirtual   afig.g:()Lafiz;
        //   137: checkcast       Lafii;
        //   140: ldc             "com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory"
        //   142: ldc             "createWorker"
        //   144: bipush          79
        //   146: ldc             "TikTokWorkerFactory.java"
        //   148: invokeinterface afii.j:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lafiz;
        //   153: checkcast       Lafii;
        //   156: ldc             "A worker with the `permanentTag` %s does not exist in this version of the application. This suggests that an app upgrade removed this worker and now work scheduled before the upgrade can't run. If this is surprising, refer to go/tiktok/dev/androidx/work#deprecating, then reach out to #tiktok on YAQS, or g/tiktok-users if the situation is still unclear."
        //   158: aload           6
        //   160: invokeinterface afii.t:(Ljava/lang/String;Ljava/lang/Object;)V
        //   165: aload_2        
        //   166: astore          7
        //   168: goto            213
        //   171: aload_0        
        //   172: getfield        aelf.b:Ljava/util/Map;
        //   175: aload_2        
        //   176: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   181: checkcast       Latjj;
        //   184: astore          6
        //   186: aload           6
        //   188: astore          7
        //   190: aload           6
        //   192: ifnull          213
        //   195: aload_3        
        //   196: getfield        androidx/work/WorkerParameters.c:Ljava/util/Set;
        //   199: aload_2        
        //   200: invokestatic    aelh.b:(Ljava/lang/String;)Ljava/lang/String;
        //   203: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   208: pop            
        //   209: aload           6
        //   211: astore          7
        //   213: aload           7
        //   215: ifnonnull       227
        //   218: aload           4
        //   220: invokeinterface aers.close:()V
        //   225: aconst_null    
        //   226: areturn        
        //   227: new             Lcom/google/apps/tiktok/contrib/work/TikTokListenableWorker;
        //   230: dup            
        //   231: aload_1        
        //   232: aload_0        
        //   233: getfield        aelf.c:Laeru;
        //   236: aload           7
        //   238: aload_3        
        //   239: invokespecial   com/google/apps/tiktok/contrib/work/TikTokListenableWorker.<init>:(Landroid/content/Context;Laeru;Latjj;Landroidx/work/WorkerParameters;)V
        //   242: astore_1       
        //   243: aload           4
        //   245: invokeinterface aers.close:()V
        //   250: aload_1        
        //   251: areturn        
        //   252: astore_1       
        //   253: aload           4
        //   255: invokeinterface aers.close:()V
        //   260: goto            293
        //   263: astore_2       
        //   264: ldc             Ljava/lang/Throwable;.class
        //   266: ldc             "addSuppressed"
        //   268: iconst_1       
        //   269: anewarray       Ljava/lang/Class;
        //   272: dup            
        //   273: iconst_0       
        //   274: ldc             Ljava/lang/Throwable;.class
        //   276: aastore        
        //   277: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   280: aload_1        
        //   281: iconst_1       
        //   282: anewarray       Ljava/lang/Object;
        //   285: dup            
        //   286: iconst_0       
        //   287: aload_2        
        //   288: aastore        
        //   289: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   292: pop            
        //   293: aload_1        
        //   294: athrow         
        //   295: astore_1       
        //   296: getstatic       aelf.a:Lafik;
        //   299: invokevirtual   afig.h:()Lafiz;
        //   302: ldc             "TikTokWorkerFactory failed to instantiate a TikTokWorker"
        //   304: ldc             "com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory"
        //   306: ldc             "createWorker"
        //   308: bipush          112
        //   310: ldc             "TikTokWorkerFactory.java"
        //   312: aload_1        
        //   313: invokestatic    c.i:(Lafiz;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;CLjava/lang/String;Ljava/lang/Throwable;)V
        //   316: aconst_null    
        //   317: areturn        
        //   318: astore_2       
        //   319: goto            293
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  0      11     295    318    Ljava/lang/RuntimeException;
        //  11     37     252    295    Any
        //  43     91     252    295    Any
        //  91     98     295    318    Ljava/lang/RuntimeException;
        //  100    124    252    295    Any
        //  131    165    252    295    Any
        //  171    186    252    295    Any
        //  195    209    252    295    Any
        //  218    225    295    318    Ljava/lang/RuntimeException;
        //  227    243    252    295    Any
        //  243    250    295    318    Ljava/lang/RuntimeException;
        //  253    260    263    293    Any
        //  264    293    318    322    Ljava/lang/Exception;
        //  293    295    295    318    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0293:
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
