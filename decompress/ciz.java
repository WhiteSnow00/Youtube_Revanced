import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;

// 
// Decompiled by Procyon v0.6.0
// 

public class ciz
{
    private static Field a;
    private static boolean b;
    
    static boolean a(final View view) {
        return view.isAttachedToWindow();
    }
    
    public static int[] h() {
        return new int[] { 1, 2, 3 };
    }
    
    public float b(final View view) {
        throw null;
    }
    
    public void c(final View view, final int n, final int n2, final int n3, final int n4) {
        throw null;
    }
    
    public void d(final View view, final float n) {
        throw null;
    }
    
    public void e(final View p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifne            30
        //     6: ldc             Landroid/view/View;.class
        //     8: ldc             "mViewFlags"
        //    10: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    13: astore          4
        //    15: aload           4
        //    17: putstatic       ciz.a:Ljava/lang/reflect/Field;
        //    20: aload           4
        //    22: iconst_1       
        //    23: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    26: iconst_1       
        //    27: putstatic       ciz.b:Z
        //    30: getstatic       ciz.a:Ljava/lang/reflect/Field;
        //    33: astore          4
        //    35: aload           4
        //    37: ifnull          60
        //    40: aload           4
        //    42: aload_1        
        //    43: invokevirtual   java/lang/reflect/Field.getInt:(Ljava/lang/Object;)I
        //    46: istore_3       
        //    47: getstatic       ciz.a:Ljava/lang/reflect/Field;
        //    50: aload_1        
        //    51: iload_2        
        //    52: iload_3        
        //    53: bipush          -13
        //    55: iand           
        //    56: ior            
        //    57: invokevirtual   java/lang/reflect/Field.setInt:(Ljava/lang/Object;I)V
        //    60: return         
        //    61: astore          4
        //    63: goto            26
        //    66: astore_1       
        //    67: goto            60
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  6      26     61     66     Ljava/lang/NoSuchFieldException;
        //  40     60     66     70     Ljava/lang/IllegalAccessException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0060:
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
    
    public void f(final View view, final Matrix matrix) {
        throw null;
    }
    
    public void g(final View view, final Matrix matrix) {
        throw null;
    }
}
