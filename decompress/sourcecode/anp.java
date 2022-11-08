import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anp extends ans
{
    private static Field a;
    private static boolean c;
    private static Constructor d;
    private static boolean e;
    private WindowInsets f;
    private aia g;
    
    public anp() {
        this.f = i();
    }
    
    public anp(final aoa aoa) {
        super(aoa);
        this.f = aoa.e();
    }
    
    private static WindowInsets i() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            20
        //     6: ldc             Landroid/view/WindowInsets;.class
        //     8: ldc             "CONSUMED"
        //    10: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    13: putstatic       anp.a:Ljava/lang/reflect/Field;
        //    16: iconst_1       
        //    17: putstatic       anp.c:Z
        //    20: getstatic       anp.a:Ljava/lang/reflect/Field;
        //    23: astore_0       
        //    24: aload_0        
        //    25: ifnull          53
        //    28: aload_0        
        //    29: aconst_null    
        //    30: invokevirtual   java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    33: checkcast       Landroid/view/WindowInsets;
        //    36: astore_0       
        //    37: aload_0        
        //    38: ifnull          53
        //    41: new             Landroid/view/WindowInsets;
        //    44: dup            
        //    45: aload_0        
        //    46: invokespecial   android/view/WindowInsets.<init>:(Landroid/view/WindowInsets;)V
        //    49: astore_0       
        //    50: aload_0        
        //    51: areturn        
        //    52: astore_0       
        //    53: getstatic       anp.e:Z
        //    56: ifne            80
        //    59: ldc             Landroid/view/WindowInsets;.class
        //    61: iconst_1       
        //    62: anewarray       Ljava/lang/Class;
        //    65: dup            
        //    66: iconst_0       
        //    67: ldc             Landroid/graphics/Rect;.class
        //    69: aastore        
        //    70: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    73: putstatic       anp.d:Ljava/lang/reflect/Constructor;
        //    76: iconst_1       
        //    77: putstatic       anp.e:Z
        //    80: getstatic       anp.d:Ljava/lang/reflect/Constructor;
        //    83: astore_1       
        //    84: aload_1        
        //    85: ifnull          114
        //    88: new             Landroid/graphics/Rect;
        //    91: astore_0       
        //    92: aload_0        
        //    93: invokespecial   android/graphics/Rect.<init>:()V
        //    96: aload_1        
        //    97: iconst_1       
        //    98: anewarray       Ljava/lang/Object;
        //   101: dup            
        //   102: iconst_0       
        //   103: aload_0        
        //   104: aastore        
        //   105: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //   108: checkcast       Landroid/view/WindowInsets;
        //   111: astore_0       
        //   112: aload_0        
        //   113: areturn        
        //   114: aconst_null    
        //   115: areturn        
        //   116: astore_0       
        //   117: goto            16
        //   120: astore_0       
        //   121: goto            76
        //   124: astore_0       
        //   125: goto            114
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                    
        //  -----  -----  -----  -----  ----------------------------------------
        //  6      16     116    120    Ljava/lang/ReflectiveOperationException;
        //  28     37     52     53     Ljava/lang/ReflectiveOperationException;
        //  41     50     52     53     Ljava/lang/ReflectiveOperationException;
        //  59     76     120    124    Ljava/lang/ReflectiveOperationException;
        //  88     112    124    128    Ljava/lang/ReflectiveOperationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 68, Size: 68
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
    
    public aoa a() {
        this.h();
        final aoa o = aoa.o(this.f);
        o.r(this.b);
        o.b.p(this.g);
        return o;
    }
    
    public void b(final aia g) {
        this.g = g;
    }
    
    public void c(final aia aia) {
        final WindowInsets f = this.f;
        if (f != null) {
            this.f = f.replaceSystemWindowInsets(aia.b, aia.c, aia.d, aia.e);
        }
    }
}
