import com.google.protobuf.ExtensionRegistryLite;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class agyz
{
    private static final Logger a;
    private static final String b;
    
    static {
        a = Logger.getLogger(agym.class.getName());
        b = "agxr";
    }
    
    public static ExtensionRegistryLite b(final Class p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //     5: astore_1       
        //     6: aload_0        
        //     7: ldc             Lcom/google/protobuf/ExtensionRegistryLite;.class
        //     9: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    12: ifeq            22
        //    15: getstatic       agyz.b:Ljava/lang/String;
        //    18: astore_2       
        //    19: goto            64
        //    22: aload_0        
        //    23: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    26: ldc             Lagyz;.class
        //    28: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    31: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    34: ifeq            324
        //    37: ldc             "%s.BlazeGenerated%sLoader"
        //    39: iconst_2       
        //    40: anewarray       Ljava/lang/Object;
        //    43: dup            
        //    44: iconst_0       
        //    45: aload_0        
        //    46: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    49: invokevirtual   java/lang/Package.getName:()Ljava/lang/String;
        //    52: aastore        
        //    53: dup            
        //    54: iconst_1       
        //    55: aload_0        
        //    56: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //    59: aastore        
        //    60: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    63: astore_2       
        //    64: aload_2        
        //    65: iconst_1       
        //    66: aload_1        
        //    67: invokestatic    java/lang/Class.forName:(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
        //    70: astore_2       
        //    71: aload_2        
        //    72: iconst_0       
        //    73: anewarray       Ljava/lang/Class;
        //    76: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    79: iconst_0       
        //    80: anewarray       Ljava/lang/Object;
        //    83: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //    86: checkcast       Lagyz;
        //    89: astore_2       
        //    90: aload_0        
        //    91: aload_2        
        //    92: invokevirtual   agyz.a:()Lcom/google/protobuf/ExtensionRegistryLite;
        //    95: invokevirtual   java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        //    98: checkcast       Lcom/google/protobuf/ExtensionRegistryLite;
        //   101: areturn        
        //   102: astore_3       
        //   103: new             Ljava/lang/IllegalStateException;
        //   106: astore_2       
        //   107: aload_2        
        //   108: aload_3        
        //   109: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   112: aload_2        
        //   113: athrow         
        //   114: astore_3       
        //   115: new             Ljava/lang/IllegalStateException;
        //   118: astore_2       
        //   119: aload_2        
        //   120: aload_3        
        //   121: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   124: aload_2        
        //   125: athrow         
        //   126: astore_2       
        //   127: new             Ljava/lang/IllegalStateException;
        //   130: astore_3       
        //   131: aload_3        
        //   132: aload_2        
        //   133: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   136: aload_3        
        //   137: athrow         
        //   138: astore_2       
        //   139: new             Ljava/lang/IllegalStateException;
        //   142: astore_3       
        //   143: aload_3        
        //   144: aload_2        
        //   145: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   148: aload_3        
        //   149: athrow         
        //   150: astore_2       
        //   151: ldc             Lagyz;.class
        //   153: aload_1        
        //   154: invokestatic    java/util/ServiceLoader.load:(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;
        //   157: invokevirtual   java/util/ServiceLoader.iterator:()Ljava/util/Iterator;
        //   160: astore_1       
        //   161: new             Ljava/util/ArrayList;
        //   164: dup            
        //   165: invokespecial   java/util/ArrayList.<init>:()V
        //   168: astore_3       
        //   169: aload_1        
        //   170: invokeinterface java/util/Iterator.hasNext:()Z
        //   175: ifeq            235
        //   178: aload_3        
        //   179: aload_0        
        //   180: aload_1        
        //   181: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   186: checkcast       Lagyz;
        //   189: invokevirtual   agyz.a:()Lcom/google/protobuf/ExtensionRegistryLite;
        //   192: invokevirtual   java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        //   195: checkcast       Lcom/google/protobuf/ExtensionRegistryLite;
        //   198: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   201: pop            
        //   202: goto            169
        //   205: astore_2       
        //   206: getstatic       agyz.a:Ljava/util/logging/Logger;
        //   209: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //   212: ldc             "com.google.protobuf.GeneratedExtensionRegistryLoader"
        //   214: ldc             "load"
        //   216: ldc             "Unable to load "
        //   218: aload_0        
        //   219: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   222: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   225: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   228: aload_2        
        //   229: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   232: goto            169
        //   235: aload_3        
        //   236: invokevirtual   java/util/ArrayList.size:()I
        //   239: iconst_1       
        //   240: if_icmpne       252
        //   243: aload_3        
        //   244: iconst_0       
        //   245: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   248: checkcast       Lcom/google/protobuf/ExtensionRegistryLite;
        //   251: areturn        
        //   252: aload_3        
        //   253: invokevirtual   java/util/ArrayList.size:()I
        //   256: ifne            261
        //   259: aconst_null    
        //   260: areturn        
        //   261: aload_0        
        //   262: ldc             "combine"
        //   264: iconst_1       
        //   265: anewarray       Ljava/lang/Class;
        //   268: dup            
        //   269: iconst_0       
        //   270: ldc             Ljava/util/Collection;.class
        //   272: aastore        
        //   273: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   276: aconst_null    
        //   277: iconst_1       
        //   278: anewarray       Ljava/lang/Object;
        //   281: dup            
        //   282: iconst_0       
        //   283: aload_3        
        //   284: aastore        
        //   285: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   288: checkcast       Lcom/google/protobuf/ExtensionRegistryLite;
        //   291: astore_0       
        //   292: aload_0        
        //   293: areturn        
        //   294: astore_0       
        //   295: new             Ljava/lang/IllegalStateException;
        //   298: dup            
        //   299: aload_0        
        //   300: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   303: athrow         
        //   304: astore_0       
        //   305: new             Ljava/lang/IllegalStateException;
        //   308: dup            
        //   309: aload_0        
        //   310: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   313: athrow         
        //   314: astore_0       
        //   315: new             Ljava/lang/IllegalStateException;
        //   318: dup            
        //   319: aload_0        
        //   320: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   323: athrow         
        //   324: new             Ljava/lang/IllegalArgumentException;
        //   327: dup            
        //   328: aload_0        
        //   329: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   332: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   335: astore_0       
        //   336: goto            341
        //   339: aload_0        
        //   340: athrow         
        //   341: goto            339
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  64     71     150    324    Ljava/lang/ClassNotFoundException;
        //  71     90     138    150    Ljava/lang/NoSuchMethodException;
        //  71     90     126    138    Ljava/lang/InstantiationException;
        //  71     90     114    126    Ljava/lang/IllegalAccessException;
        //  71     90     102    114    Ljava/lang/reflect/InvocationTargetException;
        //  71     90     150    324    Ljava/lang/ClassNotFoundException;
        //  90     102    150    324    Ljava/lang/ClassNotFoundException;
        //  103    114    150    324    Ljava/lang/ClassNotFoundException;
        //  115    126    150    324    Ljava/lang/ClassNotFoundException;
        //  127    138    150    324    Ljava/lang/ClassNotFoundException;
        //  139    150    150    324    Ljava/lang/ClassNotFoundException;
        //  178    202    205    235    Ljava/util/ServiceConfigurationError;
        //  261    292    314    324    Ljava/lang/NoSuchMethodException;
        //  261    292    304    314    Ljava/lang/IllegalAccessException;
        //  261    292    294    304    Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 184, Size: 184
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
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
    
    protected abstract ExtensionRegistryLite a();
}
