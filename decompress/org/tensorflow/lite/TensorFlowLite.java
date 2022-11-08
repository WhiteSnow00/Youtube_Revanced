// 
// Decompiled by Procyon v0.6.0
// 

package org.tensorflow.lite;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public final class TensorFlowLite
{
    private static final Logger a;
    private static final String[][] b;
    private static volatile boolean c;
    private static final AtomicBoolean[] d;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //     5: invokestatic    java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
        //     8: putstatic       org/tensorflow/lite/TensorFlowLite.a:Ljava/util/logging/Logger;
        //    11: iconst_2       
        //    12: anewarray       [Ljava/lang/String;
        //    15: astore_0       
        //    16: iconst_0       
        //    17: istore_1       
        //    18: aload_0        
        //    19: iconst_0       
        //    20: iconst_2       
        //    21: anewarray       Ljava/lang/String;
        //    24: dup            
        //    25: iconst_0       
        //    26: ldc             "tensorflowlite_jni"
        //    28: aastore        
        //    29: dup            
        //    30: iconst_1       
        //    31: ldc             "tensorflowlite_jni_stable"
        //    33: aastore        
        //    34: aastore        
        //    35: aload_0        
        //    36: iconst_1       
        //    37: iconst_1       
        //    38: anewarray       Ljava/lang/String;
        //    41: dup            
        //    42: iconst_0       
        //    43: ldc             "tensorflowlite_jni_gms_client"
        //    45: aastore        
        //    46: aastore        
        //    47: aload_0        
        //    48: putstatic       org/tensorflow/lite/TensorFlowLite.b:[[Ljava/lang/String;
        //    51: iconst_0       
        //    52: putstatic       org/tensorflow/lite/TensorFlowLite.c:Z
        //    55: aconst_null    
        //    56: astore_2       
        //    57: iconst_0       
        //    58: istore_3       
        //    59: iload_3        
        //    60: iconst_2       
        //    61: if_icmpge       228
        //    64: aload_0        
        //    65: iload_3        
        //    66: aaload         
        //    67: astore          4
        //    69: aload           4
        //    71: arraylength    
        //    72: istore          5
        //    74: iconst_0       
        //    75: istore          6
        //    77: iload           6
        //    79: iload           5
        //    81: if_icmpge       222
        //    84: aload           4
        //    86: iload           6
        //    88: aaload         
        //    89: astore          7
        //    91: aload           7
        //    93: invokestatic    java/lang/System.loadLibrary:(Ljava/lang/String;)V
        //    96: getstatic       org/tensorflow/lite/TensorFlowLite.a:Ljava/util/logging/Logger;
        //    99: astore          8
        //   101: getstatic       java/util/logging/Level.INFO:Ljava/util/logging/Level;
        //   104: astore          9
        //   106: new             Ljava/lang/StringBuilder;
        //   109: astore          10
        //   111: aload           10
        //   113: invokespecial   java/lang/StringBuilder.<init>:()V
        //   116: aload           10
        //   118: ldc             "Loaded native library: "
        //   120: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   123: pop            
        //   124: aload           10
        //   126: aload           7
        //   128: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   131: pop            
        //   132: aload           8
        //   134: aload           9
        //   136: ldc             "org.tensorflow.lite.TensorFlowLite"
        //   138: ldc             "<clinit>"
        //   140: aload           10
        //   142: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   145: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   148: goto            222
        //   151: astore          10
        //   153: getstatic       org/tensorflow/lite/TensorFlowLite.a:Ljava/util/logging/Logger;
        //   156: getstatic       java/util/logging/Level.INFO:Ljava/util/logging/Level;
        //   159: ldc             "org.tensorflow.lite.TensorFlowLite"
        //   161: ldc             "<clinit>"
        //   163: ldc             "Didn't load native library: "
        //   165: aload           7
        //   167: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   170: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   173: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   176: aload_2        
        //   177: ifnonnull       186
        //   180: aload           10
        //   182: astore_2       
        //   183: goto            216
        //   186: ldc             Ljava/lang/Throwable;.class
        //   188: ldc             "addSuppressed"
        //   190: iconst_1       
        //   191: anewarray       Ljava/lang/Class;
        //   194: dup            
        //   195: iconst_0       
        //   196: ldc             Ljava/lang/Throwable;.class
        //   198: aastore        
        //   199: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   202: aload_2        
        //   203: iconst_1       
        //   204: anewarray       Ljava/lang/Object;
        //   207: dup            
        //   208: iconst_0       
        //   209: aload           10
        //   211: aastore        
        //   212: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   215: pop            
        //   216: iinc            6, 1
        //   219: goto            77
        //   222: iinc            3, 1
        //   225: goto            59
        //   228: iconst_3       
        //   229: anewarray       Ljava/util/concurrent/atomic/AtomicBoolean;
        //   232: putstatic       org/tensorflow/lite/TensorFlowLite.d:[Ljava/util/concurrent/atomic/AtomicBoolean;
        //   235: iload_1        
        //   236: istore_3       
        //   237: iload_3        
        //   238: iconst_3       
        //   239: if_icmpge       260
        //   242: getstatic       org/tensorflow/lite/TensorFlowLite.d:[Ljava/util/concurrent/atomic/AtomicBoolean;
        //   245: iload_3        
        //   246: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //   249: dup            
        //   250: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:()V
        //   253: aastore        
        //   254: iinc            3, 1
        //   257: goto            237
        //   260: return         
        //   261: astore          10
        //   263: goto            216
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  91     148    151    222    Ljava/lang/UnsatisfiedLinkError;
        //  186    216    261    266    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0186:
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
    
    private TensorFlowLite() {
    }
    
    private static native void nativeDoNothing();
}
