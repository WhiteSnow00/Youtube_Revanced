import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.widget.CompoundButton;
import android.graphics.PorterDuff$Mode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kd
{
    public PorterDuff$Mode a;
    public boolean b;
    public boolean c;
    private final CompoundButton d;
    private boolean e;
    
    public kd(final CompoundButton d) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.d = d;
    }
    
    public final void a() {
        final Drawable a = apg.a(this.d);
        if (a != null && (this.b || this.c)) {
            final Drawable mutate = a.mutate();
            if (this.b) {
                aip.g(mutate, null);
            }
            if (this.c) {
                aip.h(mutate, this.a);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.d.getDrawableState());
            }
            this.d.setButtonDrawable(mutate);
        }
    }
    
    final void b(final AttributeSet p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        kd.d:Landroid/widget/CompoundButton;
        //     4: invokevirtual   android/widget/CompoundButton.getContext:()Landroid/content/Context;
        //     7: aload_1        
        //     8: getstatic       gl.m:[I
        //    11: iload_2        
        //    12: iconst_0       
        //    13: invokestatic    cdn.w:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lcdn;
        //    16: astore_3       
        //    17: aload_0        
        //    18: getfield        kd.d:Landroid/widget/CompoundButton;
        //    21: astore          4
        //    23: aload           4
        //    25: aload           4
        //    27: invokevirtual   android/widget/CompoundButton.getContext:()Landroid/content/Context;
        //    30: getstatic       gl.m:[I
        //    33: aload_1        
        //    34: aload_3        
        //    35: getfield        cdn.a:Ljava/lang/Object;
        //    38: checkcast       Landroid/content/res/TypedArray;
        //    41: iload_2        
        //    42: iconst_0       
        //    43: invokestatic    ana.M:(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
        //    46: aload_3        
        //    47: iconst_1       
        //    48: invokevirtual   cdn.q:(I)Z
        //    51: ifeq            85
        //    54: aload_3        
        //    55: iconst_1       
        //    56: iconst_0       
        //    57: invokevirtual   cdn.i:(II)I
        //    60: istore_2       
        //    61: iload_2        
        //    62: ifeq            85
        //    65: aload_0        
        //    66: getfield        kd.d:Landroid/widget/CompoundButton;
        //    69: astore_1       
        //    70: aload_1        
        //    71: aload_1        
        //    72: invokevirtual   android/widget/CompoundButton.getContext:()Landroid/content/Context;
        //    75: iload_2        
        //    76: invokestatic    fc.b:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
        //    79: invokevirtual   android/widget/CompoundButton.setButtonDrawable:(Landroid/graphics/drawable/Drawable;)V
        //    82: goto            121
        //    85: aload_3        
        //    86: iconst_0       
        //    87: invokevirtual   cdn.q:(I)Z
        //    90: ifeq            121
        //    93: aload_3        
        //    94: iconst_0       
        //    95: iconst_0       
        //    96: invokevirtual   cdn.i:(II)I
        //    99: istore_2       
        //   100: iload_2        
        //   101: ifeq            121
        //   104: aload_0        
        //   105: getfield        kd.d:Landroid/widget/CompoundButton;
        //   108: astore_1       
        //   109: aload_1        
        //   110: aload_1        
        //   111: invokevirtual   android/widget/CompoundButton.getContext:()Landroid/content/Context;
        //   114: iload_2        
        //   115: invokestatic    fc.b:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
        //   118: invokevirtual   android/widget/CompoundButton.setButtonDrawable:(Landroid/graphics/drawable/Drawable;)V
        //   121: aload_3        
        //   122: iconst_2       
        //   123: invokevirtual   cdn.q:(I)Z
        //   126: ifeq            141
        //   129: aload_0        
        //   130: getfield        kd.d:Landroid/widget/CompoundButton;
        //   133: aload_3        
        //   134: iconst_2       
        //   135: invokevirtual   cdn.j:(I)Landroid/content/res/ColorStateList;
        //   138: invokestatic    apf.c:(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V
        //   141: aload_3        
        //   142: iconst_3       
        //   143: invokevirtual   cdn.q:(I)Z
        //   146: ifeq            166
        //   149: aload_0        
        //   150: getfield        kd.d:Landroid/widget/CompoundButton;
        //   153: aload_3        
        //   154: iconst_3       
        //   155: iconst_m1      
        //   156: invokevirtual   cdn.f:(II)I
        //   159: aconst_null    
        //   160: invokestatic    mb.a:(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
        //   163: invokestatic    apf.d:(Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
        //   166: aload_3        
        //   167: invokevirtual   cdn.o:()V
        //   170: return         
        //   171: astore_1       
        //   172: aload_3        
        //   173: invokevirtual   cdn.o:()V
        //   176: aload_1        
        //   177: athrow         
        //   178: astore_1       
        //   179: goto            85
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  46     61     171    178    Any
        //  65     82     178    182    Landroid/content/res/Resources$NotFoundException;
        //  65     82     171    178    Any
        //  85     100    171    178    Any
        //  104    121    171    178    Any
        //  121    141    171    178    Any
        //  141    166    171    178    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0085:
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
    
    final void c() {
        if (this.e) {
            this.e = false;
            return;
        }
        this.e = true;
        this.a();
    }
}
