import android.graphics.PointF;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

final class cyp
{
    static final eab a;
    static final eab b;
    private static final Interpolator c;
    private static abp d;
    
    static {
        c = (Interpolator)new LinearInterpolator();
        a = eab.y("t", "s", "e", "o", "i", "h", "to", "ti");
        b = eab.y("x", "y");
    }
    
    static czs a(final czg czg, final ctv ctv, final float n, final czd czd, final boolean b, final boolean b2) {
        if (!b) {
            return new czs(czd.a(czg, n));
        }
        if (b2) {
            czg.i();
            PointF c = null;
            PointF c2 = null;
            boolean b3 = false;
            PointF c3 = null;
            PointF c4 = null;
            PointF pointF = null;
            Object a = null;
            PointF pointF2 = null;
            PointF pointF3 = null;
            PointF pointF4 = null;
            float n2 = 0.0f;
            Object a2 = null;
            while (czg.o()) {
                switch (czg.r(cyp.a)) {
                    default: {
                        czg.n();
                        continue;
                    }
                    case 7: {
                        c2 = cyo.c(czg, n);
                        continue;
                    }
                    case 6: {
                        c = cyo.c(czg, n);
                        continue;
                    }
                    case 5: {
                        b3 = (czg.b() == 1);
                        continue;
                    }
                    case 4: {
                        if (czg.q() == 3) {
                            czg.i();
                            float n3 = 0.0f;
                            float n4 = 0.0f;
                            float n5 = 0.0f;
                            float n6 = 0.0f;
                            while (czg.o()) {
                                final int r = czg.r(cyp.b);
                                if (r != 0) {
                                    if (r != 1) {
                                        czg.n();
                                    }
                                    else if (czg.q() == 7) {
                                        n6 = (n4 = (float)czg.a());
                                    }
                                    else {
                                        czg.h();
                                        n4 = (float)czg.a();
                                        if (czg.q() == 7) {
                                            n6 = (float)czg.a();
                                        }
                                        else {
                                            n6 = n4;
                                        }
                                        czg.j();
                                    }
                                }
                                else if (czg.q() == 7) {
                                    n5 = (n3 = (float)czg.a());
                                }
                                else {
                                    czg.h();
                                    n3 = (float)czg.a();
                                    if (czg.q() == 7) {
                                        n5 = (float)czg.a();
                                    }
                                    else {
                                        n5 = n3;
                                    }
                                    czg.j();
                                }
                            }
                            pointF3 = new PointF(n3, n4);
                            pointF4 = new PointF(n5, n6);
                            czg.k();
                            continue;
                        }
                        c4 = cyo.c(czg, n);
                        continue;
                    }
                    case 3: {
                        if (czg.q() == 3) {
                            czg.i();
                            float n7 = 0.0f;
                            float n8 = 0.0f;
                            float n9 = 0.0f;
                            float n10 = 0.0f;
                            while (czg.o()) {
                                final int r2 = czg.r(cyp.b);
                                float n11;
                                if (r2 != 0) {
                                    if (r2 != 1) {
                                        czg.n();
                                        continue;
                                    }
                                    if (czg.q() == 7) {
                                        n10 = (n8 = (float)czg.a());
                                        continue;
                                    }
                                    czg.h();
                                    n11 = (float)czg.a();
                                    float n12;
                                    if (czg.q() == 7) {
                                        n12 = (float)czg.a();
                                    }
                                    else {
                                        n12 = n11;
                                    }
                                    czg.j();
                                    n10 = n12;
                                }
                                else {
                                    if (czg.q() == 7) {
                                        n9 = (n7 = (float)czg.a());
                                        continue;
                                    }
                                    czg.h();
                                    n7 = (float)czg.a();
                                    if (czg.q() == 7) {
                                        n9 = (float)czg.a();
                                    }
                                    else {
                                        n9 = n7;
                                    }
                                    czg.j();
                                    n11 = n8;
                                }
                                n8 = n11;
                            }
                            pointF = new PointF(n7, n8);
                            pointF2 = new PointF(n9, n10);
                            czg.k();
                        }
                        else {
                            c3 = cyo.c(czg, n);
                        }
                        continue;
                    }
                    case 2: {
                        a2 = czd.a(czg, n);
                        continue;
                    }
                    case 1: {
                        a = czd.a(czg, n);
                        continue;
                    }
                    case 0: {
                        n2 = (float)czg.a();
                        continue;
                    }
                }
            }
            czg.k();
            Interpolator interpolator = null;
            Interpolator b4 = null;
            Interpolator b5 = null;
            Label_0769: {
                Object o;
                if (b3) {
                    interpolator = cyp.c;
                    o = a;
                }
                else {
                    if (c3 != null && c4 != null) {
                        interpolator = b(c3, c4);
                    }
                    else {
                        if (pointF != null && pointF2 != null && pointF3 != null && pointF4 != null) {
                            b4 = b(pointF, pointF3);
                            b5 = b(pointF2, pointF4);
                            interpolator = null;
                            break Label_0769;
                        }
                        interpolator = cyp.c;
                    }
                    o = a2;
                }
                final Interpolator interpolator2 = null;
                b5 = null;
                a2 = o;
                b4 = interpolator2;
            }
            czs czs;
            if (b4 != null) {
                czs = new czs(ctv, a, a2, b4, b5, n2);
            }
            else {
                czs = new czs(ctv, a, a2, interpolator, n2, null);
            }
            czs.m = c;
            czs.n = c2;
            return czs;
        }
        czg.i();
        PointF c5 = null;
        PointF c6 = null;
        PointF c7 = null;
        boolean b6 = false;
        Object a3 = null;
        float n13 = 0.0f;
        PointF c8 = null;
        Object a4 = null;
        while (czg.o()) {
            switch (czg.r(cyp.a)) {
                default: {
                    czg.n();
                    continue;
                }
                case 7: {
                    c8 = cyo.c(czg, n);
                    continue;
                }
                case 6: {
                    c7 = cyo.c(czg, n);
                    continue;
                }
                case 5: {
                    b6 = (czg.b() == 1);
                    continue;
                }
                case 4: {
                    c6 = cyo.c(czg, 1.0f);
                    continue;
                }
                case 3: {
                    c5 = cyo.c(czg, 1.0f);
                    continue;
                }
                case 2: {
                    a4 = czd.a(czg, n);
                    continue;
                }
                case 1: {
                    a3 = czd.a(czg, n);
                    continue;
                }
                case 0: {
                    n13 = (float)czg.a();
                    continue;
                }
            }
        }
        czg.k();
        Interpolator interpolator3;
        if (b6) {
            interpolator3 = cyp.c;
            a4 = a3;
        }
        else if (c5 != null && c6 != null) {
            interpolator3 = b(c5, c6);
        }
        else {
            interpolator3 = cyp.c;
        }
        final czs czs2 = new czs(ctv, a3, a4, interpolator3, n13, null);
        czs2.m = c7;
        czs2.n = c8;
        return czs2;
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
        //     8: invokestatic    czm.b:(FFF)F
        //    11: putfield        android/graphics/PointF.x:F
        //    14: aload_0        
        //    15: aload_0        
        //    16: getfield        android/graphics/PointF.y:F
        //    19: ldc             -100.0
        //    21: ldc             100.0
        //    23: invokestatic    czm.b:(FFF)F
        //    26: putfield        android/graphics/PointF.y:F
        //    29: aload_1        
        //    30: aload_1        
        //    31: getfield        android/graphics/PointF.x:F
        //    34: ldc             -1.0
        //    36: fconst_1       
        //    37: invokestatic    czm.b:(FFF)F
        //    40: putfield        android/graphics/PointF.x:F
        //    43: aload_1        
        //    44: aload_1        
        //    45: getfield        android/graphics/PointF.y:F
        //    48: ldc             -100.0
        //    50: ldc             100.0
        //    52: invokestatic    czm.b:(FFF)F
        //    55: putfield        android/graphics/PointF.y:F
        //    58: aload_0        
        //    59: getfield        android/graphics/PointF.x:F
        //    62: aload_0        
        //    63: getfield        android/graphics/PointF.y:F
        //    66: aload_1        
        //    67: getfield        android/graphics/PointF.x:F
        //    70: aload_1        
        //    71: getfield        android/graphics/PointF.y:F
        //    74: invokestatic    czr.d:(FFFF)I
        //    77: istore_2       
        //    78: ldc             Lcyp;.class
        //    80: monitorenter   
        //    81: getstatic       cyp.d:Labp;
        //    84: ifnonnull       99
        //    87: new             Labp;
        //    90: astore_3       
        //    91: aload_3        
        //    92: invokespecial   abp.<init>:()V
        //    95: aload_3        
        //    96: putstatic       cyp.d:Labp;
        //    99: getstatic       cyp.d:Labp;
        //   102: iload_2        
        //   103: invokevirtual   abp.d:(I)Ljava/lang/Object;
        //   106: checkcast       Ljava/lang/ref/WeakReference;
        //   109: astore          4
        //   111: ldc             Lcyp;.class
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
        //   161: invokestatic    apc.c:(FFFF)Landroid/view/animation/PathInterpolator;
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
        //   207: invokestatic    apc.c:(FFFF)Landroid/view/animation/PathInterpolator;
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
        //   231: ldc             Lcyp;.class
        //   233: monitorenter   
        //   234: getstatic       cyp.d:Labp;
        //   237: iload_2        
        //   238: aload_1        
        //   239: invokevirtual   abp.h:(ILjava/lang/Object;)V
        //   242: ldc             Lcyp;.class
        //   244: monitorexit    
        //   245: aload_0        
        //   246: astore          4
        //   248: goto            257
        //   251: astore_1       
        //   252: ldc             Lcyp;.class
        //   254: monitorexit    
        //   255: aload_1        
        //   256: athrow         
        //   257: aload           4
        //   259: areturn        
        //   260: astore_0       
        //   261: ldc             Lcyp;.class
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
