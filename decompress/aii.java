import java.lang.reflect.Array;
import android.os.CancellationSignal;
import android.graphics.Typeface;
import android.content.res.Resources;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Executable;
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
        Executable method2 = null;
        Method method3 = null;
        Method method4 = null;
        Method e = null;
        Label_0220: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                constructor = forName.getConstructor((Class<?>[])new Class[0]);
                method = forName.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
                method2 = forName.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
                method3 = forName.getMethod("freeze", (Class[])new Class[0]);
                method4 = forName.getMethod("abortCreation", (Class[])new Class[0]);
                e = this.e(forName);
                break Label_0220;
            }
            catch (final NoSuchMethodException method4) {}
            catch (final ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(String.valueOf(((NoSuchMethodException)method4).getClass().getName())), (Throwable)method4);
            final Class clazz = null;
            final Method method5 = null;
            final Constructor constructor2 = null;
            final Constructor constructor4;
            final Constructor constructor3 = constructor4 = constructor2;
            method3 = (e = (Method)constructor4);
            method2 = constructor4;
            method = (Method)constructor3;
            constructor = constructor2;
            method4 = method5;
            forName = clazz;
        }
        this.a = forName;
        this.b = constructor;
        this.c = method;
        this.d = (Method)method2;
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
        //   244: if_icmpge       370
        //   247: aload_3        
        //   248: iload           5
        //   250: aaload         
        //   251: astore          11
        //   253: aload           12
        //   255: aload           11
        //   257: getfield        ogh.e:Ljava/lang/Object;
        //   260: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   265: checkcast       Ljava/nio/ByteBuffer;
        //   268: astore_2       
        //   269: aload_2        
        //   270: ifnull          364
        //   273: aload           11
        //   275: getfield        ogh.a:I
        //   278: istore          6
        //   280: aload           11
        //   282: getfield        ogh.b:I
        //   285: istore          8
        //   287: aload           11
        //   289: getfield        ogh.c:Z
        //   292: istore          9
        //   294: aload_0        
        //   295: getfield        aii.d:Ljava/lang/reflect/Method;
        //   298: aload_1        
        //   299: iconst_5       
        //   300: anewarray       Ljava/lang/Object;
        //   303: dup            
        //   304: iconst_0       
        //   305: aload_2        
        //   306: aastore        
        //   307: dup            
        //   308: iconst_1       
        //   309: iload           6
        //   311: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   314: aastore        
        //   315: dup            
        //   316: iconst_2       
        //   317: aconst_null    
        //   318: aastore        
        //   319: dup            
        //   320: iconst_3       
        //   321: iload           8
        //   323: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   326: aastore        
        //   327: dup            
        //   328: iconst_4       
        //   329: iload           9
        //   331: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   334: aastore        
        //   335: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   338: checkcast       Ljava/lang/Boolean;
        //   341: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   344: istore          10
        //   346: iload           10
        //   348: ifeq            357
        //   351: iconst_1       
        //   352: istore          6
        //   354: goto            364
        //   357: aload_0        
        //   358: aload_1        
        //   359: invokespecial   aii.g:(Ljava/lang/Object;)V
        //   362: aconst_null    
        //   363: areturn        
        //   364: iinc            5, 1
        //   367: goto            240
        //   370: iload           6
        //   372: ifne            382
        //   375: aload_0        
        //   376: aload_1        
        //   377: invokespecial   aii.g:(Ljava/lang/Object;)V
        //   380: aconst_null    
        //   381: areturn        
        //   382: aload_0        
        //   383: aload_1        
        //   384: invokespecial   aii.i:(Ljava/lang/Object;)Z
        //   387: ifne            392
        //   390: aconst_null    
        //   391: areturn        
        //   392: aload_0        
        //   393: aload_1        
        //   394: invokevirtual   aii.c:(Ljava/lang/Object;)Landroid/graphics/Typeface;
        //   397: astore_1       
        //   398: aload_1        
        //   399: ifnonnull       404
        //   402: aconst_null    
        //   403: areturn        
        //   404: aload_1        
        //   405: iload           4
        //   407: invokestatic    android/graphics/Typeface.create:(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
        //   410: areturn        
        //   411: astore_1       
        //   412: goto            130
        //   415: astore_2       
        //   416: goto            357
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  31     46     132    135    Ljava/io/IOException;
        //  52     83     89     132    Any
        //  83     87     132    135    Ljava/io/IOException;
        //  90     94     97     130    Any
        //  98     130    411    415    Ljava/lang/Exception;
        //  130    132    132    135    Ljava/io/IOException;
        //  294    346    415    419    Ljava/lang/IllegalAccessException;
        //  294    346    415    419    Ljava/lang/reflect/InvocationTargetException;
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
