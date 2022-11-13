import java.lang.reflect.Array;
import android.os.CancellationSignal;
import android.graphics.Typeface;
import android.content.res.Resources;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import java.nio.ByteBuffer;
import android.graphics.fonts.FontVariationAxis;
import android.content.res.AssetManager;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

// 
// Decompiled by Procyon v0.6.0
// 

public class aii extends aih
{
    protected final Class a;
    protected final Constructor b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;
    
    public aii() {
        Class<?> forName = null;
        Constructor<?> constructor = null;
        Method method = null;
        Method method2 = null;
        Method method3 = null;
        Method method4 = null;
        Method e = null;
        Label_0210: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                constructor = forName.getConstructor((Class<?>[])new Class[0]);
                method = forName.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
                method2 = forName.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
                method3 = forName.getMethod("freeze", (Class[])new Class[0]);
                method4 = forName.getMethod("abortCreation", (Class[])new Class[0]);
                e = this.e(forName);
                break Label_0210;
            }
            catch (final NoSuchMethodException method) {}
            catch (final ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(String.valueOf(((NoSuchMethodException)method).getClass().getName())), (Throwable)method);
            forName = null;
            final Method method5 = null;
            constructor = null;
            method = (method2 = (Method)constructor);
            e = (method3 = method2);
            method4 = method5;
        }
        this.a = forName;
        this.b = constructor;
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = method4;
        this.g = e;
    }
    
    private final Object f() {
        try {
            return this.b.newInstance(new Object[0]);
        }
        catch (final IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            return null;
        }
    }
    
    private final void g(final Object o) {
        try {
            this.f.invoke(o, new Object[0]);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {}
    }
    
    private final boolean h(final Context context, final Object o, final String s, final int n, final int n2, final int n3, final FontVariationAxis[] array) {
        try {
            return (boolean)this.c.invoke(o, context.getAssets(), s, 0, false, n, n2, n3, array);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    private final boolean i(final Object o) {
        try {
            return (boolean)this.e.invoke(o, new Object[0]);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    private final boolean j() {
        if (this.c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.c != null;
    }
    
    public final Typeface a(final Context context, final ahl ahl, final Resources resources, int i) {
        if (!this.j()) {
            return super.a(context, ahl, resources, i);
        }
        final Object f = this.f();
        if (f == null) {
            return null;
        }
        final ahm[] a = ahl.a;
        int length;
        ahm ahm;
        for (length = a.length, i = 0; i < length; ++i) {
            ahm = a[i];
            if (!this.h(context, f, ahm.a, ahm.e, ahm.b, ahm.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(ahm.d))) {
                this.g(f);
                return null;
            }
        }
        if (!this.i(f)) {
            return null;
        }
        return this.c(f);
    }
    
    public final Typeface b(final Context p0, final CancellationSignal p1, final ogh[] p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: istore          6
        //     4: iload           6
        //     6: ifgt            11
        //     9: aconst_null    
        //    10: areturn        
        //    11: aload_0        
        //    12: invokespecial   aii.j:()Z
        //    15: ifne            135
        //    18: aload_0        
        //    19: aload_3        
        //    20: iload           4
        //    22: invokevirtual   ain.l:([Logh;I)Logh;
        //    25: astore_3       
        //    26: aload_1        
        //    27: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    30: astore_1       
        //    31: aload_1        
        //    32: aload_3        
        //    33: getfield        ogh.e:Ljava/lang/Object;
        //    36: checkcast       Landroid/net/Uri;
        //    39: ldc             "r"
        //    41: aload_2        
        //    42: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
        //    45: astore_1       
        //    46: aload_1        
        //    47: ifnonnull       52
        //    50: aconst_null    
        //    51: areturn        
        //    52: new             Landroid/graphics/Typeface$Builder;
        //    55: astore_2       
        //    56: aload_2        
        //    57: aload_1        
        //    58: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    61: invokespecial   android/graphics/Typeface$Builder.<init>:(Ljava/io/FileDescriptor;)V
        //    64: aload_2        
        //    65: aload_3        
        //    66: getfield        ogh.b:I
        //    69: invokevirtual   android/graphics/Typeface$Builder.setWeight:(I)Landroid/graphics/Typeface$Builder;
        //    72: aload_3        
        //    73: getfield        ogh.c:Z
        //    76: invokevirtual   android/graphics/Typeface$Builder.setItalic:(Z)Landroid/graphics/Typeface$Builder;
        //    79: invokevirtual   android/graphics/Typeface$Builder.build:()Landroid/graphics/Typeface;
        //    82: astore_2       
        //    83: aload_1        
        //    84: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //    87: aload_2        
        //    88: areturn        
        //    89: astore_2       
        //    90: aload_1        
        //    91: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //    94: goto            130
        //    97: astore_1       
        //    98: ldc_w           Ljava/lang/Throwable;.class
        //   101: ldc_w           "addSuppressed"
        //   104: iconst_1       
        //   105: anewarray       Ljava/lang/Class;
        //   108: dup            
        //   109: iconst_0       
        //   110: ldc_w           Ljava/lang/Throwable;.class
        //   113: aastore        
        //   114: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   117: aload_2        
        //   118: iconst_1       
        //   119: anewarray       Ljava/lang/Object;
        //   122: dup            
        //   123: iconst_0       
        //   124: aload_1        
        //   125: aastore        
        //   126: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   129: pop            
        //   130: aload_2        
        //   131: athrow         
        //   132: astore_1       
        //   133: aconst_null    
        //   134: areturn        
        //   135: new             Ljava/util/HashMap;
        //   138: dup            
        //   139: invokespecial   java/util/HashMap.<init>:()V
        //   142: astore          11
        //   144: iconst_0       
        //   145: istore          5
        //   147: iload           5
        //   149: iload           6
        //   151: if_icmpge       212
        //   154: aload_3        
        //   155: iload           5
        //   157: aaload         
        //   158: astore          12
        //   160: aload           12
        //   162: getfield        ogh.d:I
        //   165: ifeq            171
        //   168: goto            206
        //   171: aload           12
        //   173: getfield        ogh.e:Ljava/lang/Object;
        //   176: astore          12
        //   178: aload           11
        //   180: aload           12
        //   182: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   185: ifne            206
        //   188: aload           11
        //   190: aload           12
        //   192: aload_1        
        //   193: aload_2        
        //   194: aload           12
        //   196: checkcast       Landroid/net/Uri;
        //   199: invokestatic    zt.d:(Landroid/content/Context;Landroid/os/CancellationSignal;Landroid/net/Uri;)Ljava/nio/ByteBuffer;
        //   202: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   205: pop            
        //   206: iinc            5, 1
        //   209: goto            147
        //   212: aload           11
        //   214: invokestatic    java/util/Collections.unmodifiableMap:(Ljava/util/Map;)Ljava/util/Map;
        //   217: astore          12
        //   219: aload_0        
        //   220: invokespecial   aii.f:()Ljava/lang/Object;
        //   223: astore_1       
        //   224: aload_1        
        //   225: ifnonnull       230
        //   228: aconst_null    
        //   229: areturn        
        //   230: aload_3        
        //   231: arraylength    
        //   232: istore          7
        //   234: iconst_0       
        //   235: istore          5
        //   237: iconst_0       
        //   238: istore          6
        //   240: iload           5
        //   242: iload           7
        //   244: if_icmpge       368
        //   247: aload_3        
        //   248: iload           5
        //   250: aaload         
        //   251: astore_2       
        //   252: aload           12
        //   254: aload_2        
        //   255: getfield        ogh.e:Ljava/lang/Object;
        //   258: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   263: checkcast       Ljava/nio/ByteBuffer;
        //   266: astore          11
        //   268: aload           11
        //   270: ifnull          362
        //   273: aload_2        
        //   274: getfield        ogh.a:I
        //   277: istore          8
        //   279: aload_2        
        //   280: getfield        ogh.b:I
        //   283: istore          9
        //   285: aload_2        
        //   286: getfield        ogh.c:Z
        //   289: istore          6
        //   291: aload_0        
        //   292: getfield        aii.d:Ljava/lang/reflect/Method;
        //   295: aload_1        
        //   296: iconst_5       
        //   297: anewarray       Ljava/lang/Object;
        //   300: dup            
        //   301: iconst_0       
        //   302: aload           11
        //   304: aastore        
        //   305: dup            
        //   306: iconst_1       
        //   307: iload           8
        //   309: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   312: aastore        
        //   313: dup            
        //   314: iconst_2       
        //   315: aconst_null    
        //   316: aastore        
        //   317: dup            
        //   318: iconst_3       
        //   319: iload           9
        //   321: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   324: aastore        
        //   325: dup            
        //   326: iconst_4       
        //   327: iload           6
        //   329: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   332: aastore        
        //   333: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   336: checkcast       Ljava/lang/Boolean;
        //   339: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   342: istore          10
        //   344: iload           10
        //   346: ifeq            355
        //   349: iconst_1       
        //   350: istore          6
        //   352: goto            362
        //   355: aload_0        
        //   356: aload_1        
        //   357: invokespecial   aii.g:(Ljava/lang/Object;)V
        //   360: aconst_null    
        //   361: areturn        
        //   362: iinc            5, 1
        //   365: goto            240
        //   368: iload           6
        //   370: ifne            380
        //   373: aload_0        
        //   374: aload_1        
        //   375: invokespecial   aii.g:(Ljava/lang/Object;)V
        //   378: aconst_null    
        //   379: areturn        
        //   380: aload_0        
        //   381: aload_1        
        //   382: invokespecial   aii.i:(Ljava/lang/Object;)Z
        //   385: ifne            390
        //   388: aconst_null    
        //   389: areturn        
        //   390: aload_0        
        //   391: aload_1        
        //   392: invokevirtual   aii.c:(Ljava/lang/Object;)Landroid/graphics/Typeface;
        //   395: astore_1       
        //   396: aload_1        
        //   397: ifnonnull       402
        //   400: aconst_null    
        //   401: areturn        
        //   402: aload_1        
        //   403: iload           4
        //   405: invokestatic    android/graphics/Typeface.create:(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
        //   408: areturn        
        //   409: astore_1       
        //   410: goto            130
        //   413: astore_2       
        //   414: goto            355
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  31     46     132    135    Ljava/io/IOException;
        //  52     83     89     132    Any
        //  83     87     132    135    Ljava/io/IOException;
        //  90     94     97     130    Any
        //  98     130    409    413    Ljava/lang/Exception;
        //  130    132    132    135    Ljava/io/IOException;
        //  291    344    413    417    Ljava/lang/IllegalAccessException;
        //  291    344    413    417    Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0130:
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
    
    protected Typeface c(final Object o) {
        try {
            final Object instance = Array.newInstance(this.a, 1);
            Array.set(instance, 0, o);
            final Method g = this.g;
            final Integer value = -1;
            return (Typeface)g.invoke(null, instance, value, value);
        }
        catch (final IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public final Typeface d(final Context context, final Resources resources, final int n, final String s, final int n2) {
        if (!this.j()) {
            return super.d(context, resources, n, s, n2);
        }
        final Object f = this.f();
        if (f == null) {
            return null;
        }
        if (!this.h(context, f, s, 0, -1, -1, null)) {
            this.g(f);
            return null;
        }
        if (!this.i(f)) {
            return null;
        }
        return this.c(f);
    }
    
    protected Method e(final Class clazz) {
        final Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(clazz, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
