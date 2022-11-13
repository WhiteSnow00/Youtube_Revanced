import android.content.res.AssetManager;
import android.text.TextUtils;
import java.io.IOException;
import android.database.sqlite.SQLiteDatabase;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtt
{
    private static final afkk a;
    private static agtt b;
    private int c;
    private final agtu d;
    private final Context e;
    
    static {
        a = afkk.m("com/google/mediapipe/framework/AssetCache");
    }
    
    private agtt(final Context e) {
        this.e = e;
        final agtu d = new agtu(e);
        this.d = d;
        try {
            this.c = e.getPackageManager().getPackageInfo(e.getPackageName(), 0).versionCode;
            ((afki)((afki)((afkg)agtt.a).f()).j("com/google/mediapipe/framework/AssetCache", "<init>", 178, "AssetCache.java")).s("Current app version code: %d", this.c);
            final int c = this.c;
            final SQLiteDatabase writableDatabase = d.getWritableDatabase();
            final String[] array = { Integer.toString(c) };
            agtu.b(writableDatabase, "version != ?", array);
            writableDatabase.delete("AssetVersion", "version != ?", array);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new RuntimeException("Can't get app version code.", (Throwable)ex);
        }
    }
    
    public static agtt a() {
        synchronized (agtt.class) {
            return agtt.b;
        }
    }
    
    public static void c(final Context context) {
        synchronized (agtt.class) {
            context.getClass();
            if (agtt.b == null) {
                agtt.b = new agtt(context);
            }
        }
    }
    
    public final String b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        agtt.e:Landroid/content/Context;
        //     6: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //     9: astore          5
        //    11: new             Ljava/io/File;
        //    14: astore          6
        //    16: aload           6
        //    18: aload_0        
        //    19: getfield        agtt.e:Landroid/content/Context;
        //    22: invokevirtual   android/content/Context.getCacheDir:()Ljava/io/File;
        //    25: ldc             "drishti_asset_cache"
        //    27: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    30: aload           6
        //    32: invokevirtual   java/io/File.mkdir:()Z
        //    35: pop            
        //    36: new             Ljava/io/File;
        //    39: astore          4
        //    41: aload           4
        //    43: aload_1        
        //    44: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    47: aload           4
        //    49: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    52: astore          7
        //    54: new             Ljava/io/File;
        //    57: astore          4
        //    59: aload           4
        //    61: aload           6
        //    63: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //    66: aload           7
        //    68: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    71: aload           4
        //    73: invokevirtual   java/io/File.exists:()Z
        //    76: ifeq            179
        //    79: aload_0        
        //    80: getfield        agtt.c:I
        //    83: istore_2       
        //    84: iload_2        
        //    85: ifeq            179
        //    88: aload_0        
        //    89: getfield        agtt.d:Lagtu;
        //    92: invokevirtual   agtu.getReadableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    95: iconst_1       
        //    96: anewarray       Ljava/lang/String;
        //    99: dup            
        //   100: iconst_0       
        //   101: ldc             "version"
        //   103: aastore        
        //   104: ldc             "asset = ?"
        //   106: iconst_1       
        //   107: anewarray       Ljava/lang/String;
        //   110: dup            
        //   111: iconst_0       
        //   112: aload_1        
        //   113: aastore        
        //   114: invokestatic    agtu.a:(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   117: astore          6
        //   119: aload           6
        //   121: invokeinterface android/database/Cursor.getCount:()I
        //   126: ifne            132
        //   129: goto            179
        //   132: aload           6
        //   134: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   139: pop            
        //   140: aload           6
        //   142: aload           6
        //   144: ldc             "version"
        //   146: invokeinterface android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
        //   151: invokeinterface android/database/Cursor.getInt:(I)I
        //   156: istore_3       
        //   157: aload           6
        //   159: invokeinterface android/database/Cursor.close:()V
        //   164: iload_3        
        //   165: iload_2        
        //   166: if_icmpne       179
        //   169: aload           4
        //   171: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   174: astore_1       
        //   175: aload_0        
        //   176: monitorexit    
        //   177: aload_1        
        //   178: areturn        
        //   179: aload           5
        //   181: aload_1        
        //   182: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;)Ljava/io/InputStream;
        //   185: astore          6
        //   187: new             Ljava/io/FileOutputStream;
        //   190: astore          5
        //   192: aload           5
        //   194: aload           4
        //   196: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   199: sipush          1000
        //   202: newarray        B
        //   204: astore          7
        //   206: aload           6
        //   208: aload           7
        //   210: invokevirtual   java/io/InputStream.read:([B)I
        //   213: istore_2       
        //   214: iload_2        
        //   215: iconst_m1      
        //   216: if_icmpne       357
        //   219: aload           5
        //   221: invokevirtual   java/io/FileOutputStream.close:()V
        //   224: aload_0        
        //   225: getfield        agtt.c:I
        //   228: ifeq            347
        //   231: aload_0        
        //   232: getfield        agtt.d:Lagtu;
        //   235: astore          6
        //   237: aload           4
        //   239: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   242: astore          5
        //   244: aload_0        
        //   245: getfield        agtt.c:I
        //   248: istore_2       
        //   249: aload           6
        //   251: invokevirtual   agtu.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //   254: astore          7
        //   256: aload           7
        //   258: ldc             "asset = ? and cache_path != ?"
        //   260: iconst_2       
        //   261: anewarray       Ljava/lang/String;
        //   264: dup            
        //   265: iconst_0       
        //   266: aload_1        
        //   267: aastore        
        //   268: dup            
        //   269: iconst_1       
        //   270: aload           5
        //   272: aastore        
        //   273: invokestatic    agtu.b:(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;)V
        //   276: new             Landroid/content/ContentValues;
        //   279: astore          6
        //   281: aload           6
        //   283: invokespecial   android/content/ContentValues.<init>:()V
        //   286: aload           6
        //   288: ldc             "asset"
        //   290: aload_1        
        //   291: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   294: aload           6
        //   296: ldc             "cache_path"
        //   298: aload           5
        //   300: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   303: aload           6
        //   305: ldc             "version"
        //   307: iload_2        
        //   308: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   311: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   314: aload           7
        //   316: ldc             "AssetVersion"
        //   318: aconst_null    
        //   319: aload           6
        //   321: iconst_5       
        //   322: invokevirtual   android/database/sqlite/SQLiteDatabase.insertWithOnConflict:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
        //   325: ldc2_w          -1
        //   328: lcmp           
        //   329: ifeq            335
        //   332: goto            347
        //   335: new             Ljava/lang/RuntimeException;
        //   338: astore_1       
        //   339: aload_1        
        //   340: ldc             "Can't insert entry into the mediapipe db."
        //   342: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   345: aload_1        
        //   346: athrow         
        //   347: aload           4
        //   349: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   352: astore_1       
        //   353: aload_0        
        //   354: monitorexit    
        //   355: aload_1        
        //   356: areturn        
        //   357: aload           5
        //   359: aload           7
        //   361: iconst_0       
        //   362: iload_2        
        //   363: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //   366: goto            206
        //   369: astore          4
        //   371: goto            379
        //   374: astore          4
        //   376: aconst_null    
        //   377: astore          5
        //   379: aload           5
        //   381: ifnull          389
        //   384: aload           5
        //   386: invokevirtual   java/io/FileOutputStream.close:()V
        //   389: aload           4
        //   391: athrow         
        //   392: astore          4
        //   394: aconst_null    
        //   395: astore          4
        //   397: getstatic       agtt.a:Lafkk;
        //   400: invokevirtual   afkg.g:()Lafkz;
        //   403: checkcast       Lafki;
        //   406: ldc             "com/google/mediapipe/framework/AssetCache"
        //   408: ldc             "getAbsolutePathFromAsset"
        //   410: sipush          136
        //   413: ldc             "AssetCache.java"
        //   415: invokeinterface afki.j:(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lafkz;
        //   420: checkcast       Lafki;
        //   423: ldc             "Unable to unpack: %s"
        //   425: aload_1        
        //   426: invokeinterface afki.t:(Ljava/lang/String;Ljava/lang/Object;)V
        //   431: aload           4
        //   433: ifnull          449
        //   436: aload           4
        //   438: invokevirtual   java/io/InputStream.close:()V
        //   441: goto            449
        //   444: astore_1       
        //   445: aload_0        
        //   446: monitorexit    
        //   447: aconst_null    
        //   448: areturn        
        //   449: aload_0        
        //   450: monitorexit    
        //   451: aconst_null    
        //   452: areturn        
        //   453: astore_1       
        //   454: aload_0        
        //   455: monitorexit    
        //   456: goto            461
        //   459: aload_1        
        //   460: athrow         
        //   461: goto            459
        //   464: astore          4
        //   466: aload           6
        //   468: astore          4
        //   470: goto            397
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      84     453    464    Any
        //  88     129    453    464    Any
        //  132    164    453    464    Any
        //  169    175    453    464    Any
        //  179    187    392    397    Ljava/io/IOException;
        //  179    187    453    464    Any
        //  187    199    374    379    Any
        //  199    206    369    374    Any
        //  206    214    369    374    Any
        //  219    224    464    473    Ljava/io/IOException;
        //  219    224    453    464    Any
        //  224    332    453    464    Any
        //  335    347    453    464    Any
        //  347    353    453    464    Any
        //  357    366    369    374    Any
        //  384    389    464    473    Ljava/io/IOException;
        //  384    389    453    464    Any
        //  389    392    464    473    Ljava/io/IOException;
        //  389    392    453    464    Any
        //  397    431    453    464    Any
        //  436    441    444    449    Ljava/io/IOException;
        //  436    441    453    464    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0335:
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
    
    public final void d() {
        monitorenter(this);
        try {
            final AssetManager assets = this.e.getAssets();
            String[] list;
            try {
                list = assets.list("kazoo");
            }
            catch (final IOException ex) {
                ((afki)((afki)((afki)((afkg)agtt.a).g()).i((Throwable)ex)).j("com/google/mediapipe/framework/AssetCache", "loadAllAssets", 96, "AssetCache.java")).t("Unable to get files in assets path: %s", (Object)"kazoo");
                list = null;
            }
            if (list != null) {
                final int length = list.length;
                if (length != 0) {
                    for (String concat : list) {
                        if (!TextUtils.isEmpty((CharSequence)"kazoo")) {
                            concat = "kazoo/".concat(String.valueOf(concat));
                        }
                        this.b(concat);
                    }
                    monitorexit(this);
                    return;
                }
            }
            ((afki)((afki)((afkg)agtt.a).h()).j("com/google/mediapipe/framework/AssetCache", "loadAllAssets", 99, "AssetCache.java")).r("No files to load");
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
