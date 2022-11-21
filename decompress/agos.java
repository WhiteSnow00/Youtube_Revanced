import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class agos implements Runnable
{
    private static final Object c;
    private static Boolean d;
    private static Boolean e;
    public final Context a;
    public final agoq b;
    private final agoi f;
    private final PowerManager$WakeLock g;
    private final long h;
    
    static {
        c = new Object();
    }
    
    public agos(final agoq b, final Context a, final agoi f, final long h) {
        this.b = b;
        this.a = a;
        this.h = h;
        this.f = f;
        this.g = ((PowerManager)a.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
    
    private static boolean b(final Context context) {
        synchronized (agos.c) {
            final Boolean d = agos.d;
            boolean b;
            if (d == null) {
                b = c(context, "android.permission.WAKE_LOCK");
            }
            else {
                b = d;
            }
            return agos.d = b;
        }
    }
    
    private static boolean c(final Context context, final String s) {
        return context.checkCallingOrSelfPermission(s) == 0;
    }
    
    public final boolean a() {
        synchronized (this) {
            final ConnectivityManager connectivityManager = (ConnectivityManager)this.a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo;
            if (connectivityManager != null) {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            }
            else {
                activeNetworkInfo = null;
            }
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        agos.a:Landroid/content/Context;
        //     4: invokestatic    agos.b:(Landroid/content/Context;)Z
        //     7: ifeq            20
        //    10: aload_0        
        //    11: getfield        agos.g:Landroid/os/PowerManager$WakeLock;
        //    14: getstatic       agnx.a:J
        //    17: invokevirtual   android/os/PowerManager$WakeLock.acquire:(J)V
        //    20: aload_0        
        //    21: getfield        agos.b:Lagoq;
        //    24: iconst_1       
        //    25: invokevirtual   agoq.e:(Z)V
        //    28: aload_0        
        //    29: getfield        agos.f:Lagoi;
        //    32: invokevirtual   agoi.f:()Z
        //    35: ifne            64
        //    38: aload_0        
        //    39: getfield        agos.b:Lagoq;
        //    42: iconst_0       
        //    43: invokevirtual   agoq.e:(Z)V
        //    46: aload_0        
        //    47: getfield        agos.a:Landroid/content/Context;
        //    50: invokestatic    agos.b:(Landroid/content/Context;)Z
        //    53: ifeq            63
        //    56: aload_0        
        //    57: getfield        agos.g:Landroid/os/PowerManager$WakeLock;
        //    60: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //    63: return         
        //    64: aload_0        
        //    65: getfield        agos.a:Landroid/content/Context;
        //    68: astore          4
        //    70: getstatic       agos.c:Ljava/lang/Object;
        //    73: astore_3       
        //    74: aload_3        
        //    75: monitorenter   
        //    76: getstatic       agos.e:Ljava/lang/Boolean;
        //    79: astore          5
        //    81: aload           5
        //    83: ifnonnull       97
        //    86: aload           4
        //    88: ldc             "android.permission.ACCESS_NETWORK_STATE"
        //    90: invokestatic    agos.c:(Landroid/content/Context;Ljava/lang/String;)Z
        //    93: istore_2       
        //    94: goto            103
        //    97: aload           5
        //    99: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   102: istore_2       
        //   103: iload_2        
        //   104: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   107: astore          4
        //   109: aload           4
        //   111: putstatic       agos.e:Ljava/lang/Boolean;
        //   114: aload           4
        //   116: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   119: istore_2       
        //   120: aload_3        
        //   121: monitorexit    
        //   122: iload_2        
        //   123: ifeq            192
        //   126: aload_0        
        //   127: invokevirtual   agos.a:()Z
        //   130: ifne            192
        //   133: new             Lagor;
        //   136: astore          4
        //   138: aload           4
        //   140: aload_0        
        //   141: aload_0        
        //   142: invokespecial   agor.<init>:(Lagos;Lagos;)V
        //   145: aload           4
        //   147: getfield        agor.a:Lagos;
        //   150: getfield        agos.a:Landroid/content/Context;
        //   153: astore          5
        //   155: new             Landroid/content/IntentFilter;
        //   158: astore_3       
        //   159: aload_3        
        //   160: ldc             "android.net.conn.CONNECTIVITY_CHANGE"
        //   162: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //   165: aload           5
        //   167: aload           4
        //   169: aload_3        
        //   170: invokevirtual   android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //   173: pop            
        //   174: aload_0        
        //   175: getfield        agos.a:Landroid/content/Context;
        //   178: invokestatic    agos.b:(Landroid/content/Context;)Z
        //   181: ifeq            191
        //   184: aload_0        
        //   185: getfield        agos.g:Landroid/os/PowerManager$WakeLock;
        //   188: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   191: return         
        //   192: aload_0        
        //   193: getfield        agos.b:Lagoq;
        //   196: astore_3       
        //   197: aload_3        
        //   198: monitorenter   
        //   199: aload_3        
        //   200: getfield        agoq.d:Lagop;
        //   203: invokevirtual   agop.a:()Lagoo;
        //   206: astore          4
        //   208: aload           4
        //   210: ifnonnull       226
        //   213: aload_3        
        //   214: monitorexit    
        //   215: aload_0        
        //   216: getfield        agos.b:Lagoq;
        //   219: iconst_0       
        //   220: invokevirtual   agoq.e:(Z)V
        //   223: goto            676
        //   226: aload_3        
        //   227: monitorexit    
        //   228: aload           4
        //   230: getfield        agoo.b:Ljava/lang/String;
        //   233: astore          5
        //   235: aload           5
        //   237: invokevirtual   java/lang/String.hashCode:()I
        //   240: istore_1       
        //   241: iload_1        
        //   242: bipush          83
        //   244: if_icmpeq       271
        //   247: iload_1        
        //   248: bipush          85
        //   250: if_icmpeq       256
        //   253: goto            286
        //   256: aload           5
        //   258: ldc             "U"
        //   260: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   263: ifeq            286
        //   266: iconst_1       
        //   267: istore_1       
        //   268: goto            288
        //   271: aload           5
        //   273: ldc             "S"
        //   275: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   278: ifeq            286
        //   281: iconst_0       
        //   282: istore_1       
        //   283: goto            288
        //   286: iconst_m1      
        //   287: istore_1       
        //   288: iload_1        
        //   289: ifeq            380
        //   292: iload_1        
        //   293: iconst_1       
        //   294: if_icmpeq       300
        //   297: goto            448
        //   300: aload           4
        //   302: getfield        agoo.a:Ljava/lang/String;
        //   305: astore          8
        //   307: aload_3        
        //   308: getfield        agoq.a:Lagof;
        //   311: astore          5
        //   313: aload_3        
        //   314: getfield        agoq.b:Lcom/google/firebase/messaging/FirebaseMessaging;
        //   317: invokevirtual   com/google/firebase/messaging/FirebaseMessaging.c:()Ljava/lang/String;
        //   320: astore          6
        //   322: new             Landroid/os/Bundle;
        //   325: astore          7
        //   327: aload           7
        //   329: invokespecial   android/os/Bundle.<init>:()V
        //   332: aload           7
        //   334: ldc             "gcm.topic"
        //   336: ldc             "/topics/"
        //   338: aload           8
        //   340: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   343: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   346: aload           7
        //   348: ldc             "delete"
        //   350: ldc             "1"
        //   352: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   355: aload           5
        //   357: aload           6
        //   359: ldc             "/topics/"
        //   361: aload           8
        //   363: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   366: aload           7
        //   368: invokevirtual   agof.a:(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lnnt;
        //   371: invokestatic    agof.b:(Lnnt;)Lnnt;
        //   374: invokestatic    agoq.c:(Lnnt;)V
        //   377: goto            448
        //   380: aload           4
        //   382: getfield        agoo.a:Ljava/lang/String;
        //   385: astore          8
        //   387: aload_3        
        //   388: getfield        agoq.a:Lagof;
        //   391: astore          7
        //   393: aload_3        
        //   394: getfield        agoq.b:Lcom/google/firebase/messaging/FirebaseMessaging;
        //   397: invokevirtual   com/google/firebase/messaging/FirebaseMessaging.c:()Ljava/lang/String;
        //   400: astore          5
        //   402: new             Landroid/os/Bundle;
        //   405: astore          6
        //   407: aload           6
        //   409: invokespecial   android/os/Bundle.<init>:()V
        //   412: aload           6
        //   414: ldc             "gcm.topic"
        //   416: ldc             "/topics/"
        //   418: aload           8
        //   420: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   423: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   426: aload           7
        //   428: aload           5
        //   430: ldc             "/topics/"
        //   432: aload           8
        //   434: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   437: aload           6
        //   439: invokevirtual   agof.a:(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lnnt;
        //   442: invokestatic    agof.b:(Lnnt;)Lnnt;
        //   445: invokestatic    agoq.c:(Lnnt;)V
        //   448: aload_3        
        //   449: getfield        agoq.d:Lagop;
        //   452: aload           4
        //   454: invokevirtual   agop.d:(Lagoo;)V
        //   457: aload_3        
        //   458: getfield        agoq.c:Ljava/util/Map;
        //   461: astore          5
        //   463: aload           5
        //   465: monitorenter   
        //   466: aload           4
        //   468: getfield        agoo.c:Ljava/lang/String;
        //   471: astore          7
        //   473: aload_3        
        //   474: getfield        agoq.c:Ljava/util/Map;
        //   477: aload           7
        //   479: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   484: ifne            493
        //   487: aload           5
        //   489: monitorexit    
        //   490: goto            197
        //   493: aload_3        
        //   494: getfield        agoq.c:Ljava/util/Map;
        //   497: aload           7
        //   499: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   504: checkcast       Ljava/util/ArrayDeque;
        //   507: astore          6
        //   509: aload           6
        //   511: invokevirtual   java/util/ArrayDeque.poll:()Ljava/lang/Object;
        //   514: checkcast       Lnoj;
        //   517: astore          4
        //   519: aload           4
        //   521: ifnull          530
        //   524: aload           4
        //   526: aconst_null    
        //   527: invokevirtual   noj.b:(Ljava/lang/Object;)V
        //   530: aload           6
        //   532: invokevirtual   java/util/ArrayDeque.isEmpty:()Z
        //   535: ifeq            550
        //   538: aload_3        
        //   539: getfield        agoq.c:Ljava/util/Map;
        //   542: aload           7
        //   544: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   549: pop            
        //   550: aload           5
        //   552: monitorexit    
        //   553: goto            197
        //   556: astore_3       
        //   557: aload           5
        //   559: monitorexit    
        //   560: aload_3        
        //   561: athrow         
        //   562: astore_3       
        //   563: ldc             "SERVICE_NOT_AVAILABLE"
        //   565: aload_3        
        //   566: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   569: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   572: ifne            613
        //   575: ldc_w           "INTERNAL_SERVER_ERROR"
        //   578: aload_3        
        //   579: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   582: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   585: ifeq            591
        //   588: goto            613
        //   591: aload_3        
        //   592: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   595: ifnonnull       611
        //   598: ldc_w           "FirebaseMessaging"
        //   601: ldc_w           "Topic operation failed without exception message. Will retry Topic operation."
        //   604: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   607: pop            
        //   608: goto            665
        //   611: aload_3        
        //   612: athrow         
        //   613: aload_3        
        //   614: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   617: astore_3       
        //   618: new             Ljava/lang/StringBuilder;
        //   621: astore          4
        //   623: aload           4
        //   625: invokespecial   java/lang/StringBuilder.<init>:()V
        //   628: aload           4
        //   630: ldc_w           "Topic operation failed: "
        //   633: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   636: pop            
        //   637: aload           4
        //   639: aload_3        
        //   640: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   643: pop            
        //   644: aload           4
        //   646: ldc_w           ". Will retry Topic operation."
        //   649: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   652: pop            
        //   653: ldc_w           "FirebaseMessaging"
        //   656: aload           4
        //   658: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   661: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   664: pop            
        //   665: aload_0        
        //   666: getfield        agos.b:Lagoq;
        //   669: aload_0        
        //   670: getfield        agos.h:J
        //   673: invokevirtual   agoq.g:(J)V
        //   676: aload_0        
        //   677: getfield        agos.a:Landroid/content/Context;
        //   680: invokestatic    agos.b:(Landroid/content/Context;)Z
        //   683: ifeq            781
        //   686: aload_0        
        //   687: getfield        agos.g:Landroid/os/PowerManager$WakeLock;
        //   690: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   693: return         
        //   694: astore          4
        //   696: aload_3        
        //   697: monitorexit    
        //   698: aload           4
        //   700: athrow         
        //   701: astore          4
        //   703: aload_3        
        //   704: monitorexit    
        //   705: aload           4
        //   707: athrow         
        //   708: astore_3       
        //   709: goto            782
        //   712: astore_3       
        //   713: aload_3        
        //   714: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   717: astore_3       
        //   718: new             Ljava/lang/StringBuilder;
        //   721: astore          4
        //   723: aload           4
        //   725: invokespecial   java/lang/StringBuilder.<init>:()V
        //   728: aload           4
        //   730: ldc_w           "Failed to sync topics. Won't retry sync. "
        //   733: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   736: pop            
        //   737: aload           4
        //   739: aload_3        
        //   740: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   743: pop            
        //   744: ldc_w           "FirebaseMessaging"
        //   747: aload           4
        //   749: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   752: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   755: pop            
        //   756: aload_0        
        //   757: getfield        agos.b:Lagoq;
        //   760: iconst_0       
        //   761: invokevirtual   agoq.e:(Z)V
        //   764: aload_0        
        //   765: getfield        agos.a:Landroid/content/Context;
        //   768: invokestatic    agos.b:(Landroid/content/Context;)Z
        //   771: ifeq            781
        //   774: aload_0        
        //   775: getfield        agos.g:Landroid/os/PowerManager$WakeLock;
        //   778: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   781: return         
        //   782: aload_0        
        //   783: getfield        agos.a:Landroid/content/Context;
        //   786: invokestatic    agos.b:(Landroid/content/Context;)Z
        //   789: ifeq            799
        //   792: aload_0        
        //   793: getfield        agos.g:Landroid/os/PowerManager$WakeLock;
        //   796: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   799: goto            804
        //   802: aload_3        
        //   803: athrow         
        //   804: goto            802
        //   807: astore_3       
        //   808: goto            63
        //   811: astore_3       
        //   812: goto            191
        //   815: astore_3       
        //   816: goto            693
        //   819: astore_3       
        //   820: goto            781
        //   823: astore          4
        //   825: goto            799
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  20     46     712    781    Ljava/io/IOException;
        //  20     46     708    807    Any
        //  56     63     807    811    Ljava/lang/RuntimeException;
        //  64     76     712    781    Ljava/io/IOException;
        //  64     76     708    807    Any
        //  76     81     701    708    Any
        //  86     94     701    708    Any
        //  97     103    701    708    Any
        //  103    122    701    708    Any
        //  126    174    712    781    Ljava/io/IOException;
        //  126    174    708    807    Any
        //  184    191    811    815    Ljava/lang/RuntimeException;
        //  192    197    712    781    Ljava/io/IOException;
        //  192    197    708    807    Any
        //  197    199    712    781    Ljava/io/IOException;
        //  197    199    708    807    Any
        //  199    208    694    701    Any
        //  213    215    694    701    Any
        //  215    223    712    781    Ljava/io/IOException;
        //  215    223    708    807    Any
        //  226    228    694    701    Any
        //  228    241    562    676    Ljava/io/IOException;
        //  228    241    708    807    Any
        //  300    377    562    676    Ljava/io/IOException;
        //  300    377    708    807    Any
        //  380    448    562    676    Ljava/io/IOException;
        //  380    448    708    807    Any
        //  448    466    712    781    Ljava/io/IOException;
        //  448    466    708    807    Any
        //  466    490    556    562    Any
        //  493    519    556    562    Any
        //  524    530    556    562    Any
        //  530    550    556    562    Any
        //  550    553    556    562    Any
        //  557    560    556    562    Any
        //  560    562    712    781    Ljava/io/IOException;
        //  560    562    708    807    Any
        //  563    588    712    781    Ljava/io/IOException;
        //  563    588    708    807    Any
        //  591    608    712    781    Ljava/io/IOException;
        //  591    608    708    807    Any
        //  611    613    712    781    Ljava/io/IOException;
        //  611    613    708    807    Any
        //  613    665    712    781    Ljava/io/IOException;
        //  613    665    708    807    Any
        //  665    676    712    781    Ljava/io/IOException;
        //  665    676    708    807    Any
        //  686    693    815    819    Ljava/lang/RuntimeException;
        //  696    698    694    701    Any
        //  698    701    712    781    Ljava/io/IOException;
        //  698    701    708    807    Any
        //  703    705    701    708    Any
        //  705    708    712    781    Ljava/io/IOException;
        //  705    708    708    807    Any
        //  713    764    708    807    Any
        //  774    781    819    823    Ljava/lang/RuntimeException;
        //  792    799    823    828    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 384, Size: 384
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
}
