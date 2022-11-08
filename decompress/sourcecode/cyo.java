import android.graphics.PointF;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

final class cyo
{
    static final eaa a;
    static final eaa b;
    private static final Interpolator c;
    private static abo d;
    
    static {
        c = (Interpolator)new LinearInterpolator();
        a = eaa.y("t", "s", "e", "o", "i", "h", "to", "ti");
        b = eaa.y("x", "y");
    }
    
    static czr a(final czf czf, final ctu ctu, final float n, final czc czc, final boolean b, final boolean b2) {
        if (!b) {
            return new czr(czc.a(czf, n));
        }
        if (b2) {
            czf.i();
            PointF pointF = null;
            PointF c = null;
            PointF c2 = null;
            boolean b3 = false;
            PointF c3 = null;
            PointF c4 = null;
            PointF pointF2 = null;
            Object a = null;
            PointF pointF3 = null;
            Object a2 = null;
            PointF pointF4 = null;
            float n2 = 0.0f;
            while (czf.o()) {
                switch (czf.r(cyo.a)) {
                    default: {
                        czf.n();
                        continue;
                    }
                    case 7: {
                        c2 = cyn.c(czf, n);
                        continue;
                    }
                    case 6: {
                        c = cyn.c(czf, n);
                        continue;
                    }
                    case 5: {
                        b3 = (czf.b() == 1);
                        continue;
                    }
                    case 4: {
                        if (czf.q() == 3) {
                            czf.i();
                            float n3 = 0.0f;
                            float n4 = 0.0f;
                            float n5 = 0.0f;
                            float n6 = 0.0f;
                        Label_0218_Outer:
                            while (czf.o()) {
                                final int r = czf.r(cyo.b);
                                if (r != 0) {
                                    if (r != 1) {
                                        czf.n();
                                    }
                                    else if (czf.q() == 7) {
                                        n6 = (n4 = (float)czf.a());
                                    }
                                    else {
                                        czf.h();
                                        n4 = (float)czf.a();
                                        if (czf.q() == 7) {
                                            n6 = (float)czf.a();
                                        }
                                        else {
                                            n6 = n4;
                                        }
                                        czf.j();
                                    }
                                }
                                else if (czf.q() == 7) {
                                    n5 = (n3 = (float)czf.a());
                                }
                                else {
                                    czf.h();
                                    n3 = (float)czf.a();
                                    if (czf.q() == 7) {
                                        n5 = (float)czf.a();
                                    }
                                    else {
                                        n5 = n3;
                                    }
                                    czf.j();
                                }
                                while (true) {
                                    continue Label_0218_Outer;
                                    continue;
                                }
                            }
                            pointF4 = new PointF(n3, n4);
                            pointF = new PointF(n5, n6);
                            czf.k();
                            continue;
                        }
                        c4 = cyn.c(czf, n);
                        continue;
                    }
                    case 3: {
                        if (czf.q() == 3) {
                            czf.i();
                            float n7 = 0.0f;
                            float n8 = 0.0f;
                            float n9 = 0.0f;
                            float n10 = 0.0f;
                            while (czf.o()) {
                                final int r2 = czf.r(cyo.b);
                                if (r2 != 0) {
                                    if (r2 != 1) {
                                        czf.n();
                                    }
                                    else if (czf.q() == 7) {
                                        n10 = (n8 = (float)czf.a());
                                    }
                                    else {
                                        czf.h();
                                        n8 = (float)czf.a();
                                        if (czf.q() == 7) {
                                            n10 = (float)czf.a();
                                        }
                                        else {
                                            n10 = n8;
                                        }
                                        czf.j();
                                    }
                                }
                                else if (czf.q() == 7) {
                                    n9 = (n7 = (float)czf.a());
                                }
                                else {
                                    czf.h();
                                    n7 = (float)czf.a();
                                    if (czf.q() == 7) {
                                        n9 = (float)czf.a();
                                    }
                                    else {
                                        n9 = n7;
                                    }
                                    czf.j();
                                }
                            }
                            pointF2 = new PointF(n7, n8);
                            pointF3 = new PointF(n9, n10);
                            czf.k();
                            continue;
                        }
                        c3 = cyn.c(czf, n);
                        continue;
                    }
                    case 2: {
                        a2 = czc.a(czf, n);
                        continue;
                    }
                    case 1: {
                        a = czc.a(czf, n);
                        continue;
                    }
                    case 0: {
                        n2 = (float)czf.a();
                        continue;
                    }
                }
            }
            czf.k();
            Interpolator interpolator = null;
            Object o = null;
            Interpolator b4 = null;
            Interpolator interpolator2 = null;
            Label_0761: {
                if (b3) {
                    interpolator = cyo.c;
                    o = a;
                }
                else {
                    if (c3 != null && c4 != null) {
                        interpolator = b(c3, c4);
                    }
                    else {
                        if (pointF2 != null && pointF3 != null && pointF4 != null && pointF != null) {
                            b4 = b(pointF2, pointF4);
                            final Interpolator b5 = b(pointF3, pointF);
                            o = a2;
                            interpolator2 = b5;
                            interpolator = null;
                            break Label_0761;
                        }
                        interpolator = cyo.c;
                    }
                    o = a2;
                }
                b4 = null;
                interpolator2 = null;
            }
            czr czr;
            if (b4 != null) {
                czr = new czr(ctu, a, o, b4, interpolator2, n2);
            }
            else {
                czr = new czr(ctu, a, o, interpolator, n2, null);
            }
            czr.m = c;
            czr.n = c2;
            return czr;
        }
        czf.i();
        PointF c5 = null;
        PointF c6 = null;
        PointF c7 = null;
        PointF c8 = null;
        boolean b6 = false;
        Object a3 = null;
        float n11 = 0.0f;
        Object a4 = null;
        while (czf.o()) {
            switch (czf.r(cyo.a)) {
                default: {
                    czf.n();
                    continue;
                }
                case 7: {
                    c7 = cyn.c(czf, n);
                    continue;
                }
                case 6: {
                    c6 = cyn.c(czf, n);
                    continue;
                }
                case 5: {
                    b6 = (czf.b() == 1);
                    continue;
                }
                case 4: {
                    c5 = cyn.c(czf, 1.0f);
                    continue;
                }
                case 3: {
                    c8 = cyn.c(czf, 1.0f);
                    continue;
                }
                case 2: {
                    a4 = czc.a(czf, n);
                    continue;
                }
                case 1: {
                    a3 = czc.a(czf, n);
                    continue;
                }
                case 0: {
                    n11 = (float)czf.a();
                    continue;
                }
            }
        }
        czf.k();
        Interpolator interpolator3;
        if (b6) {
            interpolator3 = cyo.c;
            a4 = a3;
        }
        else if (c8 != null && c5 != null) {
            interpolator3 = b(c8, c5);
        }
        else {
            interpolator3 = cyo.c;
        }
        final czr czr2 = new czr(ctu, a3, a4, interpolator3, n11, null);
        czr2.m = c6;
        czr2.n = c7;
        return czr2;
    }
    
    private static Interpolator b(final PointF p0, final PointF p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: getfield        android/graphics/PointF.x:F
        //     5: ldc             -1.0
        //     7: fconst_1       
        //     8: invokestatic    czl.b:(FFF)F
        //    11: putfield        android/graphics/PointF.x:F
        //    14: aload_0        
        //    15: aload_0        
        //    16: getfield        android/graphics/PointF.y:F
        //    19: ldc             -100.0
        //    21: ldc             100.0
        //    23: invokestatic    czl.b:(FFF)F
        //    26: putfield        android/graphics/PointF.y:F
        //    29: aload_1        
        //    30: aload_1        
        //    31: getfield        android/graphics/PointF.x:F
        //    34: ldc             -1.0
        //    36: fconst_1       
        //    37: invokestatic    czl.b:(FFF)F
        //    40: putfield        android/graphics/PointF.x:F
        //    43: aload_1        
        //    44: aload_1        
        //    45: getfield        android/graphics/PointF.y:F
        //    48: ldc             -100.0
        //    50: ldc             100.0
        //    52: invokestatic    czl.b:(FFF)F
        //    55: putfield        android/graphics/PointF.y:F
        //    58: aload_0        
        //    59: getfield        android/graphics/PointF.x:F
        //    62: aload_0        
        //    63: getfield        android/graphics/PointF.y:F
        //    66: aload_1        
        //    67: getfield        android/graphics/PointF.x:F
        //    70: aload_1        
        //    71: getfield        android/graphics/PointF.y:F
        //    74: invokestatic    czq.d:(FFFF)I
        //    77: istore_2       
        //    78: ldc             Lcyo;.class
        //    80: monitorenter   
        //    81: getstatic       cyo.d:Labo;
        //    84: ifnonnull       99
        //    87: new             Labo;
        //    90: astore_3       
        //    91: aload_3        
        //    92: invokespecial   abo.<init>:()V
        //    95: aload_3        
        //    96: putstatic       cyo.d:Labo;
        //    99: getstatic       cyo.d:Labo;
        //   102: iload_2        
        //   103: invokevirtual   abo.d:(I)Ljava/lang/Object;
        //   106: checkcast       Ljava/lang/ref/WeakReference;
        //   109: astore          4
        //   111: ldc             Lcyo;.class
        //   113: monitorexit    
        //   114: aload           4
        //   116: ifnull          131
        //   119: aload           4
        //   121: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //   124: checkcast       Landroid/view/animation/Interpolator;
        //   127: astore_3       
        //   128: goto            133
        //   131: aconst_null    
        //   132: astore_3       
        //   133: aload           4
        //   135: ifnull          145
        //   138: aload_3        
        //   139: astore          4
        //   141: aload_3        
        //   142: ifnonnull       257
        //   145: aload_0        
        //   146: getfield        android/graphics/PointF.x:F
        //   149: aload_0        
        //   150: getfield        android/graphics/PointF.y:F
        //   153: aload_1        
        //   154: getfield        android/graphics/PointF.x:F
        //   157: aload_1        
        //   158: getfield        android/graphics/PointF.y:F
        //   161: invokestatic    apb.c:(FFFF)Landroid/view/animation/PathInterpolator;
        //   164: astore_3       
        //   165: aload_3        
        //   166: astore_0       
        //   167: goto            222
        //   170: astore_3       
        //   171: ldc             "The Path cannot loop back on itself."
        //   173: aload_3        
        //   174: invokevirtual   java/lang/IllegalArgumentException.getMessage:()Ljava/lang/String;
        //   177: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   180: ifeq            214
        //   183: aload_0        
        //   184: getfield        android/graphics/PointF.x:F
        //   187: fconst_1       
        //   188: invokestatic    java/lang/Math.min:(FF)F
        //   191: aload_0        
        //   192: getfield        android/graphics/PointF.y:F
        //   195: aload_1        
        //   196: getfield        android/graphics/PointF.x:F
        //   199: fconst_0       
        //   200: invokestatic    java/lang/Math.max:(FF)F
        //   203: aload_1        
        //   204: getfield        android/graphics/PointF.y:F
        //   207: invokestatic    apb.c:(FFFF)Landroid/view/animation/PathInterpolator;
        //   210: astore_0       
        //   211: goto            222
        //   214: new             Landroid/view/animation/LinearInterpolator;
        //   217: dup            
        //   218: invokespecial   android/view/animation/LinearInterpolator.<init>:()V
        //   221: astore_0       
        //   222: new             Ljava/lang/ref/WeakReference;
        //   225: astore_1       
        //   226: aload_1        
        //   227: aload_0        
        //   228: invokespecial   java/lang/ref/WeakReference.<init>:(Ljava/lang/Object;)V
        //   231: ldc             Lcyo;.class
        //   233: monitorenter   
        //   234: getstatic       cyo.d:Labo;
        //   237: iload_2        
        //   238: aload_1        
        //   239: invokevirtual   abo.h:(ILjava/lang/Object;)V
        //   242: ldc             Lcyo;.class
        //   244: monitorexit    
        //   245: aload_0        
        //   246: astore          4
        //   248: goto            257
        //   251: astore_1       
        //   252: ldc             Lcyo;.class
        //   254: monitorexit    
        //   255: aload_1        
        //   256: athrow         
        //   257: aload           4
        //   259: areturn        
        //   260: astore_0       
        //   261: ldc             Lcyo;.class
        //   263: monitorexit    
        //   264: aload_0        
        //   265: athrow         
        //   266: astore_1       
        //   267: aload_0        
        //   268: astore          4
        //   270: goto            257
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  81     99     260    266    Any
        //  99     114    260    266    Any
        //  145    165    170    222    Ljava/lang/IllegalArgumentException;
        //  222    234    266    273    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  234    245    251    257    Any
        //  252    255    251    257    Any
        //  255    257    266    273    Ljava/lang/ArrayIndexOutOfBoundsException;
        //  261    264    260    266    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0222:
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
