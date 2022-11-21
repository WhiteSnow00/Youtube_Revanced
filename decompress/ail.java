import java.io.InputStream;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.fonts.Font$Builder;
import android.os.CancellationSignal;
import android.graphics.Typeface;
import android.content.res.Resources;
import android.content.Context;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ail extends aio
{
    private static int f(final FontStyle fontStyle, final FontStyle fontStyle2) {
        final int n = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        int n2;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            n2 = 0;
        }
        else {
            n2 = 2;
        }
        return n + n2;
    }
    
    private static final Font g(final FontFamily fontFamily, int f) {
        int i = 1;
        int n;
        if (0x1 != (f & 0x1)) {
            n = 400;
        }
        else {
            n = 700;
        }
        if ((f & 0x2) != 0x0) {
            f = 1;
        }
        else {
            f = 0;
        }
        final FontStyle fontStyle = new FontStyle(n, f);
        Font font = fontFamily.getFont(0);
        f = f(fontStyle, font.getStyle());
        while (i < fontFamily.getSize()) {
            final Font font2 = fontFamily.getFont(i);
            final int f2 = f(fontStyle, font2.getStyle());
            int n2;
            if (f2 < f) {
                n2 = f2;
            }
            else {
                n2 = f;
            }
            if (f2 < f) {
                font = font2;
            }
            ++i;
            f = n2;
        }
        return font;
    }
    
    @Override
    public final Typeface a(final Context p0, final ahm p1, final Resources p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          7
        //     3: aload_2        
        //     4: getfield        ahm.a:[Lahn;
        //     7: astore          8
        //     9: aload           8
        //    11: arraylength    
        //    12: istore          6
        //    14: iconst_0       
        //    15: istore          5
        //    17: aconst_null    
        //    18: astore_1       
        //    19: iload           5
        //    21: iload           6
        //    23: if_icmpge       117
        //    26: aload           8
        //    28: iload           5
        //    30: aaload         
        //    31: astore          9
        //    33: new             Landroid/graphics/fonts/Font$Builder;
        //    36: astore_2       
        //    37: aload_2        
        //    38: aload_3        
        //    39: aload           9
        //    41: getfield        ahn.f:I
        //    44: invokespecial   android/graphics/fonts/Font$Builder.<init>:(Landroid/content/res/Resources;I)V
        //    47: aload_2        
        //    48: aload           9
        //    50: getfield        ahn.b:I
        //    53: invokevirtual   android/graphics/fonts/Font$Builder.setWeight:(I)Landroid/graphics/fonts/Font$Builder;
        //    56: aload           9
        //    58: getfield        ahn.c:Z
        //    61: invokevirtual   android/graphics/fonts/Font$Builder.setSlant:(I)Landroid/graphics/fonts/Font$Builder;
        //    64: aload           9
        //    66: getfield        ahn.e:I
        //    69: invokevirtual   android/graphics/fonts/Font$Builder.setTtcIndex:(I)Landroid/graphics/fonts/Font$Builder;
        //    72: aload           9
        //    74: getfield        ahn.d:Ljava/lang/String;
        //    77: invokevirtual   android/graphics/fonts/Font$Builder.setFontVariationSettings:(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;
        //    80: invokevirtual   android/graphics/fonts/Font$Builder.build:()Landroid/graphics/fonts/Font;
        //    83: astore          9
        //    85: aload_1        
        //    86: ifnonnull       104
        //    89: new             Landroid/graphics/fonts/FontFamily$Builder;
        //    92: astore_2       
        //    93: aload_2        
        //    94: aload           9
        //    96: invokespecial   android/graphics/fonts/FontFamily$Builder.<init>:(Landroid/graphics/fonts/Font;)V
        //    99: aload_2        
        //   100: astore_1       
        //   101: goto            111
        //   104: aload_1        
        //   105: aload           9
        //   107: invokevirtual   android/graphics/fonts/FontFamily$Builder.addFont:(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
        //   110: pop            
        //   111: iinc            5, 1
        //   114: goto            19
        //   117: aload_1        
        //   118: ifnonnull       123
        //   121: aconst_null    
        //   122: areturn        
        //   123: aload_1        
        //   124: invokevirtual   android/graphics/fonts/FontFamily$Builder.build:()Landroid/graphics/fonts/FontFamily;
        //   127: astore_2       
        //   128: new             Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   131: astore_1       
        //   132: aload_1        
        //   133: aload_2        
        //   134: invokespecial   android/graphics/Typeface$CustomFallbackBuilder.<init>:(Landroid/graphics/fonts/FontFamily;)V
        //   137: aload_1        
        //   138: aload_2        
        //   139: iload           4
        //   141: invokestatic    ail.g:(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;
        //   144: invokevirtual   android/graphics/fonts/Font.getStyle:()Landroid/graphics/fonts/FontStyle;
        //   147: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.setStyle:(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   150: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.build:()Landroid/graphics/Typeface;
        //   153: astore_1       
        //   154: aload_1        
        //   155: areturn        
        //   156: astore_1       
        //   157: aload           7
        //   159: astore_1       
        //   160: goto            154
        //   163: astore_2       
        //   164: goto            111
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      14     156    163    Ljava/lang/Exception;
        //  33     85     163    167    Ljava/io/IOException;
        //  33     85     156    163    Ljava/lang/Exception;
        //  89     99     163    167    Ljava/io/IOException;
        //  89     99     156    163    Ljava/lang/Exception;
        //  104    111    163    167    Ljava/io/IOException;
        //  104    111    156    163    Ljava/lang/Exception;
        //  123    154    156    163    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0104:
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
    
    @Override
    public final Typeface b(final Context p0, final CancellationSignal p1, final ogz[] p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     4: astore          8
        //     6: aload_3        
        //     7: arraylength    
        //     8: istore          6
        //    10: aconst_null    
        //    11: astore_1       
        //    12: iconst_0       
        //    13: istore          5
        //    15: iload           5
        //    17: iload           6
        //    19: if_icmpge       210
        //    22: aload_3        
        //    23: iload           5
        //    25: aaload         
        //    26: astore          10
        //    28: aload           10
        //    30: getfield        ogz.e:Ljava/lang/Object;
        //    33: checkcast       Landroid/net/Uri;
        //    36: astore          9
        //    38: aload_1        
        //    39: astore          7
        //    41: aload           8
        //    43: aload           9
        //    45: ldc             "r"
        //    47: aload_2        
        //    48: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
        //    51: astore          9
        //    53: aload_1        
        //    54: astore          7
        //    56: aload           9
        //    58: ifnull          201
        //    61: new             Landroid/graphics/fonts/Font$Builder;
        //    64: astore          7
        //    66: aload           7
        //    68: aload           9
        //    70: invokespecial   android/graphics/fonts/Font$Builder.<init>:(Landroid/os/ParcelFileDescriptor;)V
        //    73: aload           7
        //    75: aload           10
        //    77: getfield        ogz.b:I
        //    80: invokevirtual   android/graphics/fonts/Font$Builder.setWeight:(I)Landroid/graphics/fonts/Font$Builder;
        //    83: aload           10
        //    85: getfield        ogz.c:Z
        //    88: invokevirtual   android/graphics/fonts/Font$Builder.setSlant:(I)Landroid/graphics/fonts/Font$Builder;
        //    91: aload           10
        //    93: getfield        ogz.a:I
        //    96: invokevirtual   android/graphics/fonts/Font$Builder.setTtcIndex:(I)Landroid/graphics/fonts/Font$Builder;
        //    99: invokevirtual   android/graphics/fonts/Font$Builder.build:()Landroid/graphics/fonts/Font;
        //   102: astore          10
        //   104: aload_1        
        //   105: ifnonnull       126
        //   108: new             Landroid/graphics/fonts/FontFamily$Builder;
        //   111: astore          7
        //   113: aload           7
        //   115: aload           10
        //   117: invokespecial   android/graphics/fonts/FontFamily$Builder.<init>:(Landroid/graphics/fonts/Font;)V
        //   120: aload           7
        //   122: astore_1       
        //   123: goto            133
        //   126: aload_1        
        //   127: aload           10
        //   129: invokevirtual   android/graphics/fonts/FontFamily$Builder.addFont:(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
        //   132: pop            
        //   133: aload_1        
        //   134: astore          7
        //   136: aload           9
        //   138: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   141: aload_1        
        //   142: astore          7
        //   144: goto            201
        //   147: astore          10
        //   149: aload           9
        //   151: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   154: goto            190
        //   157: astore          7
        //   159: ldc             Ljava/lang/Throwable;.class
        //   161: ldc             "addSuppressed"
        //   163: iconst_1       
        //   164: anewarray       Ljava/lang/Class;
        //   167: dup            
        //   168: iconst_0       
        //   169: ldc             Ljava/lang/Throwable;.class
        //   171: aastore        
        //   172: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   175: aload           10
        //   177: iconst_1       
        //   178: anewarray       Ljava/lang/Object;
        //   181: dup            
        //   182: iconst_0       
        //   183: aload           7
        //   185: aastore        
        //   186: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   189: pop            
        //   190: aload_1        
        //   191: astore          7
        //   193: aload           10
        //   195: athrow         
        //   196: astore          7
        //   198: aload_1        
        //   199: astore          7
        //   201: iinc            5, 1
        //   204: aload           7
        //   206: astore_1       
        //   207: goto            15
        //   210: aload_1        
        //   211: ifnonnull       216
        //   214: aconst_null    
        //   215: areturn        
        //   216: aload_1        
        //   217: invokevirtual   android/graphics/fonts/FontFamily$Builder.build:()Landroid/graphics/fonts/FontFamily;
        //   220: astore_1       
        //   221: new             Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   224: astore_2       
        //   225: aload_2        
        //   226: aload_1        
        //   227: invokespecial   android/graphics/Typeface$CustomFallbackBuilder.<init>:(Landroid/graphics/fonts/FontFamily;)V
        //   230: aload_2        
        //   231: aload_1        
        //   232: iload           4
        //   234: invokestatic    ail.g:(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;
        //   237: invokevirtual   android/graphics/fonts/Font.getStyle:()Landroid/graphics/fonts/FontStyle;
        //   240: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.setStyle:(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   243: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.build:()Landroid/graphics/Typeface;
        //   246: astore_1       
        //   247: aload_1        
        //   248: areturn        
        //   249: astore_1       
        //   250: aconst_null    
        //   251: areturn        
        //   252: astore_1       
        //   253: goto            201
        //   256: astore          7
        //   258: goto            190
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      10     249    252    Ljava/lang/Exception;
        //  28     38     196    201    Ljava/io/IOException;
        //  28     38     249    252    Ljava/lang/Exception;
        //  41     53     252    256    Ljava/io/IOException;
        //  41     53     249    252    Ljava/lang/Exception;
        //  61     104    147    196    Any
        //  108    120    147    196    Any
        //  126    133    147    196    Any
        //  136    141    252    256    Ljava/io/IOException;
        //  136    141    249    252    Ljava/lang/Exception;
        //  149    154    157    190    Any
        //  159    190    256    261    Ljava/lang/Exception;
        //  193    196    252    256    Ljava/io/IOException;
        //  193    196    249    252    Ljava/lang/Exception;
        //  216    247    249    252    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 134, Size: 134
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
    
    @Override
    public final Typeface d(final Context context, final Resources resources, final int n, final String s, final int n2) {
        try {
            final Font build = new Font$Builder(resources, n).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily$Builder(build).build()).setStyle(build.getStyle()).build();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    @Override
    protected final Typeface k(final Context context, final InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
    
    @Override
    protected final ogz l(final ogz[] array, final int n) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
