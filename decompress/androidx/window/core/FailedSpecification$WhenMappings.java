// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

public final class FailedSpecification$WhenMappings
{
    public static final int[] $EnumSwitchMapping$0;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: arraylength    
        //     4: newarray        I
        //     6: astore_0       
        //     7: aload_0        
        //     8: getstatic       androidx/window/core/VerificationMode.STRICT:Landroidx/window/core/VerificationMode;
        //    11: invokevirtual   androidx/window/core/VerificationMode.ordinal:()I
        //    14: iconst_1       
        //    15: iastore        
        //    16: aload_0        
        //    17: getstatic       androidx/window/core/VerificationMode.LOG:Landroidx/window/core/VerificationMode;
        //    20: invokevirtual   androidx/window/core/VerificationMode.ordinal:()I
        //    23: iconst_2       
        //    24: iastore        
        //    25: aload_0        
        //    26: getstatic       androidx/window/core/VerificationMode.QUIET:Landroidx/window/core/VerificationMode;
        //    29: invokevirtual   androidx/window/core/VerificationMode.ordinal:()I
        //    32: iconst_3       
        //    33: iastore        
        //    34: aload_0        
        //    35: putstatic       androidx/window/core/FailedSpecification$WhenMappings.$EnumSwitchMapping$0:[I
        //    38: return         
        //    39: astore_1       
        //    40: goto            16
        //    43: astore_1       
        //    44: goto            25
        //    47: astore_1       
        //    48: goto            34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      16     39     43     Ljava/lang/NoSuchFieldError;
        //  16     25     43     47     Ljava/lang/NoSuchFieldError;
        //  25     34     47     51     Ljava/lang/NoSuchFieldError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 28, Size: 28
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
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
}
