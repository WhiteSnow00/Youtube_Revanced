import java.util.Map;
import java.text.ParseException;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Iterator;
import com.bumptech.glide.module.AppGlideModule;
import java.util.List;
import android.content.Context;
import java.util.Set;
import android.graphics.drawable.Animatable2$AnimationCallback;
import android.graphics.drawable.AnimatedVectorDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckd
{
    static void a(final Object o) {
        ((AnimatedVectorDrawable)o).clearAnimationCallbacks();
    }
    
    static void b(final Object o, final Object o2) {
        ((AnimatedVectorDrawable)o).registerAnimationCallback((Animatable2$AnimationCallback)o2);
    }
    
    public static boolean c(final Object o, final Object o2) {
        return ((AnimatedVectorDrawable)o).unregisterAnimationCallback((Animatable2$AnimationCallback)o2);
    }
    
    public static final cmi d(final boolean b, final Set set, final int n) {
        return new cmi(n, b, false, false, false, -1L, -1L, atzd.j((Iterable)set));
    }
    
    public static void e(final Context context, final dbs dbs, final dcj dcj, List dnf, final AppGlideModule appGlideModule) {
        final Iterator iterator = ((List)dnf).iterator();
        while (iterator.hasNext()) {
            dnf = (dnf)iterator.next();
            try {
                dnf.registerComponents(context, dbs, dcj);
                continue;
            }
            catch (final AbstractMethodError abstractMethodError) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(dnf.getClass().getName())), abstractMethodError);
            }
            break;
        }
        if (appGlideModule != null) {
            appGlideModule.registerComponents(context, dbs, dcj);
        }
    }
    
    public static long f(String s) {
        try {
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(s).getTime();
        }
        catch (final ParseException ex) {
            if (!"0".equals(s) && !"-1".equals(s)) {
                final String a = dbn.a;
                final String format = String.format(Locale.US, "Unable to parse dateStr: %s, falling back to 0", s);
                final StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
                while (true) {
                    for (int i = 2; i < stackTrace.length; ++i) {
                        if (!stackTrace[i].getClassName().equals(dbn.b)) {
                            final String className = stackTrace[i].getClassName();
                            final String substring = className.substring(className.lastIndexOf(46) + 1);
                            final String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                            s = stackTrace[i].getMethodName();
                            final StringBuilder sb = new StringBuilder();
                            sb.append(substring2);
                            sb.append(".");
                            sb.append(s);
                            s = sb.toString();
                            Log.e(a, String.format(Locale.US, "[%d] %s: %s", Thread.currentThread().getId(), s, format), (Throwable)ex);
                            return 0L;
                        }
                    }
                    s = "<unknown>";
                    continue;
                }
            }
            s = dbn.a;
            return 0L;
        }
    }
    
    public static daz g(final dbe p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: lstore          14
        //     5: aload_0        
        //     6: getfield        dbe.c:Ljava/util/Map;
        //     9: astore          16
        //    11: aload           16
        //    13: ifnonnull       18
        //    16: aconst_null    
        //    17: areturn        
        //    18: aload           16
        //    20: ldc             "Date"
        //    22: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    27: checkcast       Ljava/lang/String;
        //    30: astore          17
        //    32: aload           17
        //    34: ifnull          47
        //    37: aload           17
        //    39: invokestatic    ckd.f:(Ljava/lang/String;)J
        //    42: lstore          8
        //    44: goto            50
        //    47: lconst_0       
        //    48: lstore          8
        //    50: aload           16
        //    52: ldc             "Cache-Control"
        //    54: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    59: checkcast       Ljava/lang/String;
        //    62: astore          17
        //    64: iconst_0       
        //    65: istore_2       
        //    66: iconst_0       
        //    67: istore_3       
        //    68: aload           17
        //    70: ifnull          255
        //    73: aload           17
        //    75: ldc             ","
        //    77: iconst_0       
        //    78: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //    81: astore          17
        //    83: iconst_0       
        //    84: istore_1       
        //    85: lconst_0       
        //    86: lstore          6
        //    88: lconst_0       
        //    89: lstore          4
        //    91: iload_3        
        //    92: istore_2       
        //    93: iload_2        
        //    94: aload           17
        //    96: arraylength    
        //    97: if_icmpge       250
        //   100: aload           17
        //   102: iload_2        
        //   103: aaload         
        //   104: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   107: astore          18
        //   109: aload           18
        //   111: ldc_w           "no-cache"
        //   114: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   117: ifne            248
        //   120: aload           18
        //   122: ldc_w           "no-store"
        //   125: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   128: ifeq            134
        //   131: goto            248
        //   134: aload           18
        //   136: ldc_w           "max-age="
        //   139: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   142: ifeq            164
        //   145: aload           18
        //   147: bipush          8
        //   149: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   152: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   155: lstore          12
        //   157: lload           6
        //   159: lstore          10
        //   161: goto            234
        //   164: aload           18
        //   166: ldc_w           "stale-while-revalidate="
        //   169: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   172: ifeq            194
        //   175: aload           18
        //   177: bipush          23
        //   179: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   182: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   185: lstore          10
        //   187: lload           4
        //   189: lstore          12
        //   191: goto            234
        //   194: aload           18
        //   196: ldc_w           "must-revalidate"
        //   199: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   202: ifne            224
        //   205: lload           6
        //   207: lstore          10
        //   209: lload           4
        //   211: lstore          12
        //   213: aload           18
        //   215: ldc_w           "proxy-revalidate"
        //   218: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   221: ifeq            234
        //   224: iconst_1       
        //   225: istore_1       
        //   226: lload           4
        //   228: lstore          12
        //   230: lload           6
        //   232: lstore          10
        //   234: iinc            2, 1
        //   237: lload           10
        //   239: lstore          6
        //   241: lload           12
        //   243: lstore          4
        //   245: goto            93
        //   248: aconst_null    
        //   249: areturn        
        //   250: iconst_1       
        //   251: istore_2       
        //   252: goto            263
        //   255: iconst_0       
        //   256: istore_1       
        //   257: lconst_0       
        //   258: lstore          6
        //   260: lconst_0       
        //   261: lstore          4
        //   263: aload           16
        //   265: ldc_w           "Expires"
        //   268: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   273: checkcast       Ljava/lang/String;
        //   276: astore          17
        //   278: aload           17
        //   280: ifnull          293
        //   283: aload           17
        //   285: invokestatic    ckd.f:(Ljava/lang/String;)J
        //   288: lstore          12
        //   290: goto            296
        //   293: lconst_0       
        //   294: lstore          12
        //   296: aload           16
        //   298: ldc_w           "Last-Modified"
        //   301: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   306: checkcast       Ljava/lang/String;
        //   309: astore          17
        //   311: aload           17
        //   313: ifnull          326
        //   316: aload           17
        //   318: invokestatic    ckd.f:(Ljava/lang/String;)J
        //   321: lstore          10
        //   323: goto            329
        //   326: lconst_0       
        //   327: lstore          10
        //   329: aload           16
        //   331: ldc_w           "ETag"
        //   334: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   339: checkcast       Ljava/lang/String;
        //   342: astore          18
        //   344: iload_2        
        //   345: ifeq            398
        //   348: lload           14
        //   350: lload           4
        //   352: ldc2_w          1000
        //   355: lmul           
        //   356: ladd           
        //   357: lstore          12
        //   359: iload_1        
        //   360: ifeq            370
        //   363: lload           12
        //   365: lstore          4
        //   367: goto            387
        //   370: lload           6
        //   372: invokestatic    java/lang/Long.signum:(J)I
        //   375: pop            
        //   376: lload           6
        //   378: ldc2_w          1000
        //   381: lmul           
        //   382: lload           12
        //   384: ladd           
        //   385: lstore          4
        //   387: lload           4
        //   389: lstore          6
        //   391: lload           12
        //   393: lstore          4
        //   395: goto            436
        //   398: lconst_0       
        //   399: lstore          6
        //   401: lload           8
        //   403: lconst_0       
        //   404: lcmp           
        //   405: ifle            433
        //   408: lload           12
        //   410: lload           8
        //   412: lcmp           
        //   413: iflt            433
        //   416: lload           14
        //   418: lload           12
        //   420: lload           8
        //   422: lsub           
        //   423: ladd           
        //   424: lstore          4
        //   426: lload           4
        //   428: lstore          6
        //   430: goto            436
        //   433: lconst_0       
        //   434: lstore          4
        //   436: new             Ldaz;
        //   439: dup            
        //   440: invokespecial   daz.<init>:()V
        //   443: astore          17
        //   445: aload           17
        //   447: aload_0        
        //   448: getfield        dbe.b:[B
        //   451: putfield        daz.a:[B
        //   454: aload           17
        //   456: aload           18
        //   458: putfield        daz.b:Ljava/lang/String;
        //   461: aload           17
        //   463: lload           4
        //   465: putfield        daz.f:J
        //   468: aload           17
        //   470: lload           6
        //   472: putfield        daz.e:J
        //   475: aload           17
        //   477: lload           8
        //   479: putfield        daz.c:J
        //   482: aload           17
        //   484: lload           10
        //   486: putfield        daz.d:J
        //   489: aload           17
        //   491: aload           16
        //   493: putfield        daz.g:Ljava/util/Map;
        //   496: aload_0        
        //   497: getfield        dbe.d:Ljava/util/List;
        //   500: astore_0       
        //   501: aload           17
        //   503: areturn        
        //   504: astore          18
        //   506: lload           6
        //   508: lstore          10
        //   510: lload           4
        //   512: lstore          12
        //   514: goto            234
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  145    157    504    517    Ljava/lang/Exception;
        //  175    187    504    517    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public static String h(final Map map, final String s) {
        if (map == null) {
            return s;
        }
        final String s2 = map.get("Content-Type");
        if (s2 != null) {
            final String[] split = s2.split(";", 0);
            for (int i = 1; i < split.length; ++i) {
                final String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return s;
    }
}
