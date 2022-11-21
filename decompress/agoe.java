import com.google.firebase.messaging.FirebaseMessaging;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoe
{
    final FirebaseMessaging a;
    private final agmg b;
    private boolean c;
    private agme d;
    private Boolean e;
    
    public agoe(final FirebaseMessaging a, final agmg b) {
        this.a = a;
        this.b = b;
    }
    
    final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        agoe.c:Z
        //     6: ifne            160
        //     9: aload_0        
        //    10: getfield        agoe.a:Lcom/google/firebase/messaging/FirebaseMessaging;
        //    13: getfield        com/google/firebase/messaging/FirebaseMessaging.c:Lagjs;
        //    16: invokevirtual   agjs.a:()Landroid/content/Context;
        //    19: astore_1       
        //    20: aload_1        
        //    21: ldc             "com.google.firebase.messaging"
        //    23: iconst_0       
        //    24: invokevirtual   android/content/Context.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //    27: astore_2       
        //    28: aload_2        
        //    29: ldc             "auto_init"
        //    31: invokeinterface android/content/SharedPreferences.contains:(Ljava/lang/String;)Z
        //    36: ifeq            55
        //    39: aload_2        
        //    40: ldc             "auto_init"
        //    42: iconst_0       
        //    43: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //    48: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    51: astore_1       
        //    52: goto            117
        //    55: aload_1        
        //    56: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    59: astore_2       
        //    60: aload_2        
        //    61: ifnull          115
        //    64: aload_2        
        //    65: aload_1        
        //    66: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    69: sipush          128
        //    72: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //    75: astore_1       
        //    76: aload_1        
        //    77: ifnull          115
        //    80: aload_1        
        //    81: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    84: ifnull          115
        //    87: aload_1        
        //    88: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    91: ldc             "firebase_messaging_auto_init_enabled"
        //    93: invokevirtual   android/os/Bundle.containsKey:(Ljava/lang/String;)Z
        //    96: ifeq            115
        //    99: aload_1        
        //   100: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //   103: ldc             "firebase_messaging_auto_init_enabled"
        //   105: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //   108: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   111: astore_1       
        //   112: goto            117
        //   115: aconst_null    
        //   116: astore_1       
        //   117: aload_0        
        //   118: aload_1        
        //   119: putfield        agoe.e:Ljava/lang/Boolean;
        //   122: aload_1        
        //   123: ifnonnull       152
        //   126: new             Lagod;
        //   129: astore_1       
        //   130: aload_1        
        //   131: aload_0        
        //   132: invokespecial   agod.<init>:(Lagoe;)V
        //   135: aload_0        
        //   136: aload_1        
        //   137: putfield        agoe.d:Lagme;
        //   140: aload_0        
        //   141: getfield        agoe.b:Lagmg;
        //   144: ldc             Lagjn;.class
        //   146: aload_1        
        //   147: invokeinterface agmg.b:(Ljava/lang/Class;Lagme;)V
        //   152: aload_0        
        //   153: iconst_1       
        //   154: putfield        agoe.c:Z
        //   157: aload_0        
        //   158: monitorexit    
        //   159: return         
        //   160: aload_0        
        //   161: monitorexit    
        //   162: return         
        //   163: astore_1       
        //   164: aload_0        
        //   165: monitorexit    
        //   166: aload_1        
        //   167: athrow         
        //   168: astore_1       
        //   169: goto            115
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  2      52     163    168    Any
        //  55     60     168    172    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  55     60     163    168    Any
        //  64     76     168    172    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  64     76     163    168    Any
        //  80     112    168    172    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  80     112    163    168    Any
        //  117    122    163    168    Any
        //  126    152    163    168    Any
        //  152    157    163    168    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0055:
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
    
    public final boolean b() {
        synchronized (this) {
            this.a();
            final Boolean e = this.e;
            boolean b;
            if (e != null) {
                b = e;
            }
            else {
                b = this.a.c.j();
            }
            return b;
        }
    }
}
