import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import j$.util.DesugarCollections;
import java.util.HashMap;
import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agse
{
    static final Map a;
    static final Collection b;
    static final Collection c;
    static final AtomicInteger d;
    public static volatile boolean e;
    private static final ConditionVariable f;
    private static volatile agsb g;
    private static volatile agsd h;
    private static volatile Thread i;
    
    static {
        f = new ConditionVariable();
        a = DesugarCollections.synchronizedMap((Map)new HashMap());
        b = new ConcurrentLinkedQueue();
        c = new ConcurrentLinkedQueue();
        d = new AtomicInteger();
        agse.e = false;
        agse.g = agsc.a;
        agse.h = null;
        agse.i = null;
    }
    
    public static List a() {
        return new ArrayList(agse.c);
    }
    
    public static List b() {
        return new ArrayList(agse.b);
    }
    
    public static void c(final String s, final String... array) {
        f(agse.g, s);
    }
    
    public static void d(final agsb agsb) {
        agsb a = agsb;
        if (agsb == null) {
            a = agsc.a;
        }
        agse.g = a;
    }
    
    private static void e(final agsb p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          6
        //     5: aload           6
        //     7: monitorenter   
        //     8: aload           6
        //    10: aload_1        
        //    11: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    16: checkcast       Landroid/os/ConditionVariable;
        //    19: astore          5
        //    21: getstatic       agse.f:Landroid/os/ConditionVariable;
        //    24: astore          7
        //    26: aload           5
        //    28: aload           7
        //    30: if_acmpne       37
        //    33: aload           6
        //    35: monitorexit    
        //    36: return         
        //    37: aload           5
        //    39: ifnull          47
        //    42: iconst_1       
        //    43: istore_2       
        //    44: goto            70
        //    47: new             Landroid/os/ConditionVariable;
        //    50: astore          5
        //    52: aload           5
        //    54: invokespecial   android/os/ConditionVariable.<init>:()V
        //    57: aload           6
        //    59: aload_1        
        //    60: aload           5
        //    62: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    67: pop            
        //    68: iconst_0       
        //    69: istore_2       
        //    70: aload           6
        //    72: monitorexit    
        //    73: iload_2        
        //    74: ifne            178
        //    77: aload           5
        //    79: monitorenter   
        //    80: invokestatic    java/lang/System.nanoTime:()J
        //    83: lstore_3       
        //    84: aload_0        
        //    85: aload_1        
        //    86: invokeinterface agsb.a:(Ljava/lang/String;)V
        //    91: aload           6
        //    93: aload_1        
        //    94: aload           7
        //    96: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   101: pop            
        //   102: getstatic       agse.e:Z
        //   105: ifeq            140
        //   108: getstatic       agse.b:Ljava/util/Collection;
        //   111: astore_0       
        //   112: new             Lakq;
        //   115: astore          6
        //   117: aload           6
        //   119: aload_1        
        //   120: invokestatic    java/lang/System.nanoTime:()J
        //   123: lload_3        
        //   124: lsub           
        //   125: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   128: invokespecial   akq.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   131: aload_0        
        //   132: aload           6
        //   134: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   139: pop            
        //   140: aload           5
        //   142: invokevirtual   android/os/ConditionVariable.open:()V
        //   145: aload           5
        //   147: monitorexit    
        //   148: goto            178
        //   151: astore_0       
        //   152: getstatic       agse.a:Ljava/util/Map;
        //   155: aload_1        
        //   156: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   161: pop            
        //   162: aload_0        
        //   163: athrow         
        //   164: astore_0       
        //   165: aload           5
        //   167: invokevirtual   android/os/ConditionVariable.open:()V
        //   170: aload_0        
        //   171: athrow         
        //   172: astore_0       
        //   173: aload           5
        //   175: monitorexit    
        //   176: aload_0        
        //   177: athrow         
        //   178: aload           5
        //   180: invokestatic    java/lang/Thread.holdsLock:(Ljava/lang/Object;)Z
        //   183: ifne            191
        //   186: aload           5
        //   188: invokevirtual   android/os/ConditionVariable.block:()V
        //   191: return         
        //   192: astore_0       
        //   193: aload           6
        //   195: monitorexit    
        //   196: aload_0        
        //   197: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  8      26     192    198    Any
        //  33     36     192    198    Any
        //  47     68     192    198    Any
        //  70     73     192    198    Any
        //  80     140    151    172    Any
        //  140    148    172    178    Any
        //  152    164    164    172    Any
        //  165    172    172    178    Any
        //  173    176    172    178    Any
        //  193    196    192    198    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0140:
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
    
    private static void f(final agsb agsb, final String s) {
        if (agse.e) {
            final long nanoTime = System.nanoTime();
            e(agsb, s);
            if (agse.d.incrementAndGet() <= 20) {
                agse.c.add(new akq((Object)s, (Object)(System.nanoTime() - nanoTime)));
            }
            return;
        }
        e(agsb, s);
    }
}
