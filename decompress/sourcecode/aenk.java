import android.os.Process;
import app.revanced.integrations.utils.ReVancedUtils;
import android.content.Context;
import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aenk extends aenj implements aenm
{
    public aeru r;
    public atjj s;
    
    static {
        SystemClock.elapsedRealtime();
    }
    
    protected void attachBaseContext(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            12
        //     6: aload_0        
        //     7: aload_1        
        //     8: invokespecial   aenj.attachBaseContext:(Landroid/content/Context;)V
        //    11: return         
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   aenj.attachBaseContext:(Landroid/content/Context;)V
        //    17: getstatic       as.b:Z
        //    20: ifeq            26
        //    23: goto            564
        //    26: aconst_null    
        //    27: astore_2       
        //    28: aload_0        
        //    29: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //    32: astore_1       
        //    33: goto            52
        //    36: astore_3       
        //    37: goto            565
        //    40: astore_1       
        //    41: ldc             "MultiDex"
        //    43: ldc             "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching."
        //    45: aload_1        
        //    46: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    49: pop            
        //    50: aconst_null    
        //    51: astore_1       
        //    52: aload_1        
        //    53: ifnull          564
        //    56: new             Ljava/io/File;
        //    59: astore          4
        //    61: aload           4
        //    63: aload_1        
        //    64: getfield        android/content/pm/ApplicationInfo.sourceDir:Ljava/lang/String;
        //    67: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    70: new             Ljava/io/File;
        //    73: astore          5
        //    75: aload           5
        //    77: aload_1        
        //    78: getfield        android/content/pm/ApplicationInfo.dataDir:Ljava/lang/String;
        //    81: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    84: getstatic       as.a:Ljava/util/Set;
        //    87: astore          6
        //    89: aload           6
        //    91: monitorenter   
        //    92: getstatic       as.a:Ljava/util/Set;
        //    95: aload           4
        //    97: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   102: ifeq            109
        //   105: aload           6
        //   107: monitorexit    
        //   108: return         
        //   109: getstatic       as.a:Ljava/util/Set;
        //   112: aload           4
        //   114: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   119: pop            
        //   120: new             Ljava/lang/StringBuilder;
        //   123: astore_1       
        //   124: aload_1        
        //   125: ldc             "MultiDex is not guaranteed to work in SDK version "
        //   127: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   130: aload_1        
        //   131: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   134: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   137: pop            
        //   138: aload_1        
        //   139: ldc             ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\""
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: pop            
        //   145: aload_1        
        //   146: ldc             "java.vm.version"
        //   148: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   154: pop            
        //   155: aload_1        
        //   156: ldc             "\""
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   161: pop            
        //   162: ldc             "MultiDex"
        //   164: aload_1        
        //   165: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   168: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   171: pop            
        //   172: aload_0        
        //   173: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //   176: astore_3       
        //   177: aload_3        
        //   178: astore_1       
        //   179: aload_3        
        //   180: instanceof      Ldalvik/system/BaseDexClassLoader;
        //   183: ifne            209
        //   186: ldc             "MultiDex"
        //   188: ldc             "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
        //   190: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   193: pop            
        //   194: goto            207
        //   197: astore_1       
        //   198: ldc             "MultiDex"
        //   200: ldc             "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
        //   202: aload_1        
        //   203: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   206: pop            
        //   207: aconst_null    
        //   208: astore_1       
        //   209: aload_1        
        //   210: ifnonnull       217
        //   213: aload           6
        //   215: monitorexit    
        //   216: return         
        //   217: new             Ljava/io/File;
        //   220: astore_3       
        //   221: aload_3        
        //   222: aload_0        
        //   223: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //   226: ldc             "secondary-dexes"
        //   228: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   231: aload_3        
        //   232: invokevirtual   java/io/File.isDirectory:()Z
        //   235: ifeq            420
        //   238: aload_3        
        //   239: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   242: pop            
        //   243: aload_3        
        //   244: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //   247: astore          7
        //   249: aload           7
        //   251: ifnonnull       298
        //   254: new             Ljava/lang/StringBuilder;
        //   257: astore          7
        //   259: aload           7
        //   261: ldc             "Failed to list secondary dex dir content ("
        //   263: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   266: aload           7
        //   268: aload_3        
        //   269: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   272: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   275: pop            
        //   276: aload           7
        //   278: ldc             ")."
        //   280: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   283: pop            
        //   284: ldc             "MultiDex"
        //   286: aload           7
        //   288: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   291: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   294: pop            
        //   295: goto            420
        //   298: aload           7
        //   300: arraylength    
        //   301: istore          8
        //   303: iconst_0       
        //   304: istore          9
        //   306: iload           9
        //   308: iload           8
        //   310: if_icmpge       374
        //   313: aload           7
        //   315: iload           9
        //   317: aaload         
        //   318: astore          10
        //   320: aload           10
        //   322: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   325: pop            
        //   326: aload           10
        //   328: invokevirtual   java/io/File.length:()J
        //   331: pop2           
        //   332: aload           10
        //   334: invokevirtual   java/io/File.delete:()Z
        //   337: ifne            362
        //   340: ldc             "MultiDex"
        //   342: ldc             "Failed to delete old file "
        //   344: aload           10
        //   346: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   349: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   352: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   355: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   358: pop            
        //   359: goto            368
        //   362: aload           10
        //   364: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   367: pop            
        //   368: iinc            9, 1
        //   371: goto            306
        //   374: aload_3        
        //   375: invokevirtual   java/io/File.delete:()Z
        //   378: ifne            402
        //   381: ldc             "MultiDex"
        //   383: ldc             "Failed to delete secondary dex dir "
        //   385: aload_3        
        //   386: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   389: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   392: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   395: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   398: pop            
        //   399: goto            420
        //   402: aload_3        
        //   403: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   406: pop            
        //   407: goto            420
        //   410: astore_3       
        //   411: ldc             "MultiDex"
        //   413: ldc             "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
        //   415: aload_3        
        //   416: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   419: pop            
        //   420: new             Ljava/io/File;
        //   423: astore_3       
        //   424: aload_3        
        //   425: aload           5
        //   427: ldc             "code_cache"
        //   429: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   432: aload_3        
        //   433: invokestatic    as.c:(Ljava/io/File;)V
        //   436: goto            458
        //   439: astore_3       
        //   440: new             Ljava/io/File;
        //   443: astore_3       
        //   444: aload_3        
        //   445: aload_0        
        //   446: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //   449: ldc             "code_cache"
        //   451: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   454: aload_3        
        //   455: invokestatic    as.c:(Ljava/io/File;)V
        //   458: new             Ljava/io/File;
        //   461: astore          5
        //   463: aload           5
        //   465: aload_3        
        //   466: ldc             "secondary-dexes"
        //   468: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   471: aload           5
        //   473: invokestatic    as.c:(Ljava/io/File;)V
        //   476: new             Lau;
        //   479: astore_3       
        //   480: aload_3        
        //   481: aload           4
        //   483: aload           5
        //   485: invokespecial   au.<init>:(Ljava/io/File;Ljava/io/File;)V
        //   488: aload_3        
        //   489: aload_0        
        //   490: iconst_0       
        //   491: invokevirtual   au.a:(Landroid/content/Context;Z)Ljava/util/List;
        //   494: astore          4
        //   496: aload_1        
        //   497: aload           5
        //   499: aload           4
        //   501: invokestatic    as.b:(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/util/List;)V
        //   504: goto            531
        //   507: astore          4
        //   509: ldc             "MultiDex"
        //   511: ldc             "Failed to install extracted secondary dex files, retrying with forced extraction"
        //   513: aload           4
        //   515: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   518: pop            
        //   519: aload_1        
        //   520: aload           5
        //   522: aload_3        
        //   523: aload_0        
        //   524: iconst_1       
        //   525: invokevirtual   au.a:(Landroid/content/Context;Z)Ljava/util/List;
        //   528: invokestatic    as.b:(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/util/List;)V
        //   531: aload_3        
        //   532: invokevirtual   au.close:()V
        //   535: aload_2        
        //   536: astore_1       
        //   537: goto            541
        //   540: astore_1       
        //   541: aload_1        
        //   542: ifnonnull       549
        //   545: aload           6
        //   547: monitorexit    
        //   548: return         
        //   549: aload_1        
        //   550: athrow         
        //   551: astore_1       
        //   552: aload_3        
        //   553: invokevirtual   au.close:()V
        //   556: aload_1        
        //   557: athrow         
        //   558: astore_1       
        //   559: aload           6
        //   561: monitorexit    
        //   562: aload_1        
        //   563: athrow         
        //   564: return         
        //   565: ldc             "MultiDex"
        //   567: ldc             "MultiDex installation failure"
        //   569: aload_3        
        //   570: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   573: pop            
        //   574: new             Ljava/lang/StringBuilder;
        //   577: dup            
        //   578: ldc             "MultiDex installation failed ("
        //   580: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   583: astore_1       
        //   584: aload_1        
        //   585: aload_3        
        //   586: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   589: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   592: pop            
        //   593: aload_1        
        //   594: ldc             ")."
        //   596: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   599: pop            
        //   600: new             Ljava/lang/RuntimeException;
        //   603: dup            
        //   604: aload_1        
        //   605: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   608: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   611: astore_1       
        //   612: goto            617
        //   615: aload_1        
        //   616: athrow         
        //   617: goto            615
        //   620: astore_3       
        //   621: goto            556
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  28     33     40     52     Ljava/lang/RuntimeException;
        //  28     33     36     620    Ljava/lang/Exception;
        //  41     50     36     620    Ljava/lang/Exception;
        //  56     92     36     620    Ljava/lang/Exception;
        //  92     108    558    564    Any
        //  109    172    558    564    Any
        //  172    177    197    207    Ljava/lang/RuntimeException;
        //  172    177    558    564    Any
        //  179    194    558    564    Any
        //  198    207    558    564    Any
        //  213    216    558    564    Any
        //  217    249    410    420    Any
        //  254    295    410    420    Any
        //  298    303    410    420    Any
        //  320    359    410    420    Any
        //  362    368    410    420    Any
        //  374    399    410    420    Any
        //  402    407    410    420    Any
        //  411    420    558    564    Any
        //  420    432    558    564    Any
        //  432    436    439    458    Ljava/io/IOException;
        //  432    436    558    564    Any
        //  440    458    558    564    Any
        //  458    488    558    564    Any
        //  488    496    551    558    Any
        //  496    504    507    531    Ljava/io/IOException;
        //  496    504    551    558    Any
        //  509    531    551    558    Any
        //  531    535    540    541    Ljava/io/IOException;
        //  531    535    558    564    Any
        //  545    548    558    564    Any
        //  549    551    558    564    Any
        //  552    556    620    624    Ljava/io/IOException;
        //  552    556    558    564    Any
        //  556    558    558    564    Any
        //  559    562    558    564    Any
        //  562    564    36     620    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 316, Size: 316
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
    
    public void onCreate() {
        ReVancedUtils.context = (Context)this;
        if (qit.b == null) {
            final boolean isolated = Process.isIsolated();
            final boolean b = true;
            boolean b2 = false;
            Label_0217: {
                if (isolated) {
                    b2 = b;
                }
                else {
                    final String a = qit.a;
                    int n = -1;
                    String a2;
                    if ((a2 = a) == null) {
                        final String a3 = qit.a((Context)this);
                        if (a3 == null) {
                            a2 = null;
                        }
                        else {
                            final int index = a3.indexOf(58);
                            if (index == -1) {
                                qit.a = "";
                            }
                            else {
                                qit.a = a3.substring(index);
                            }
                            a2 = qit.a;
                        }
                    }
                    if (a2 != null) {
                        final int hashCode = a2.hashCode();
                        if (hashCode != -737791795) {
                            if (hashCode != -733923188) {
                                if (hashCode == 1771111950) {
                                    if (a2.equals(":train")) {
                                        n = 1;
                                    }
                                }
                            }
                            else if (a2.equals(":learning_bg")) {
                                n = 0;
                            }
                        }
                        else if (a2.equals(":primes_lifeboat")) {
                            n = 2;
                        }
                        b2 = b;
                        if (n == 0) {
                            break Label_0217;
                        }
                        b2 = b;
                        if (n == 1) {
                            break Label_0217;
                        }
                        b2 = b;
                        if (n == 2) {
                            break Label_0217;
                        }
                        if (a2.startsWith(":privileged_process")) {
                            b2 = b;
                            break Label_0217;
                        }
                    }
                    b2 = false;
                }
            }
            qit.b = b2;
        }
        if (!qit.b) {
            if (!aesw.r()) {
                final aexq a4 = qeh.a();
                long n2;
                if (a4.h()) {
                    n2 = (long)a4.c();
                }
                else {
                    n2 = Process.getStartElapsedRealtime();
                }
                final long max = Math.max(0L, System.currentTimeMillis() - Math.max(0L, SystemClock.elapsedRealtime() - n2));
                final aeso aeso = new aeso(aesw.h);
                if (aeso.a == null) {
                    final aeru r = this.r;
                    final Object b3 = r.b;
                    final Object c = r.c;
                    final int a5 = r.a;
                    final aeqx c2 = ((aesb)b3).c("Application creation", (aeri)c, max, n2);
                    try {
                        aesw.h = aesw.a();
                        qcj.u((Runnable)aess.a);
                        final aere o = aesw.o("Application.onCreate");
                        try {
                            ((acnx)this.s.a()).r();
                            super.onCreate();
                            o.close();
                            if (c2 != null) {
                                c2.close();
                            }
                            return;
                        }
                        finally {
                            try {
                                o.close();
                            }
                            finally {
                                final Throwable t;
                                final Throwable t2;
                                ajox.Z(t, t2);
                            }
                        }
                    }
                    finally {
                        if (c2 != null) {
                            try {
                                c2.close();
                            }
                            finally {
                                final Throwable t3;
                                final Throwable t4;
                                ajox.Z(t3, t4);
                            }
                        }
                    }
                }
                final aers a6 = aeso.a();
                try {
                    final aere o2 = aesw.o("Application creation");
                    try {
                        final aere o3 = aesw.o("Application.onCreate");
                        try {
                            ((acnx)this.s.a()).r();
                            super.onCreate();
                            o3.close();
                            o2.close();
                            a6.close();
                            return;
                        }
                        finally {
                            try {
                                o3.close();
                            }
                            finally {
                                final Throwable t5;
                                final Throwable t6;
                                ajox.Z(t5, t6);
                            }
                        }
                    }
                    finally {
                        try {
                            o2.close();
                        }
                        finally {
                            final Throwable t7;
                            final Throwable t8;
                            ajox.Z(t7, t8);
                        }
                    }
                }
                finally {
                    try {
                        a6.close();
                    }
                    finally {
                        final Throwable t9;
                        final Throwable t10;
                        ajox.Z(t9, t10);
                    }
                }
            }
            ((acnx)this.s.a()).r();
            super.onCreate();
            return;
        }
        super.onCreate();
    }
}
