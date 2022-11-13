import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class agna implements Runnable
{
    private static final Object c;
    private static Boolean d;
    private static Boolean e;
    public final Context a;
    public final agmy b;
    private final agmq f;
    private final PowerManager$WakeLock g;
    private final long h;
    
    static {
        c = new Object();
    }
    
    public agna(final agmy b, final Context a, final agmq f, final long h) {
        this.b = b;
        this.a = a;
        this.h = h;
        this.f = f;
        this.g = ((PowerManager)a.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
    
    private static boolean b(final Context context) {
        synchronized (agna.c) {
            final Boolean d = agna.d;
            boolean b;
            if (d == null) {
                b = c(context, "android.permission.WAKE_LOCK");
            }
            else {
                b = d;
            }
            return agna.d = b;
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
        //     1: getfield        agna.a:Landroid/content/Context;
        //     4: invokestatic    agna.b:(Landroid/content/Context;)Z
        //     7: ifeq            20
        //    10: aload_0        
        //    11: getfield        agna.g:Landroid/os/PowerManager$WakeLock;
        //    14: getstatic       agmf.a:J
        //    17: invokevirtual   android/os/PowerManager$WakeLock.acquire:(J)V
        //    20: aload_0        
        //    21: getfield        agna.b:Lagmy;
        //    24: iconst_1       
        //    25: invokevirtual   agmy.e:(Z)V
        //    28: aload_0        
        //    29: getfield        agna.f:Lagmq;
        //    32: invokevirtual   agmq.f:()Z
        //    35: ifne            64
        //    38: aload_0        
        //    39: getfield        agna.b:Lagmy;
        //    42: iconst_0       
        //    43: invokevirtual   agmy.e:(Z)V
        //    46: aload_0        
        //    47: getfield        agna.a:Landroid/content/Context;
        //    50: invokestatic    agna.b:(Landroid/content/Context;)Z
        //    53: ifeq            63
        //    56: aload_0        
        //    57: getfield        agna.g:Landroid/os/PowerManager$WakeLock;
        //    60: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //    63: return         
        //    64: aload_0        
        //    65: getfield        agna.a:Landroid/content/Context;
        //    68: astore          5
        //    70: getstatic       agna.c:Ljava/lang/Object;
        //    73: astore_3       
        //    74: aload_3        
        //    75: monitorenter   
        //    76: getstatic       agna.e:Ljava/lang/Boolean;
        //    79: astore          4
        //    81: aload           4
        //    83: ifnonnull       97
        //    86: aload           5
        //    88: ldc             "android.permission.ACCESS_NETWORK_STATE"
        //    90: invokestatic    agna.c:(Landroid/content/Context;Ljava/lang/String;)Z
        //    93: istore_2       
        //    94: goto            103
        //    97: aload           4
        //    99: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   102: istore_2       
        //   103: iload_2        
        //   104: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   107: astore          4
        //   109: aload           4
        //   111: putstatic       agna.e:Ljava/lang/Boolean;
        //   114: aload           4
        //   116: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   119: istore_2       
        //   120: aload_3        
        //   121: monitorexit    
        //   122: iload_2        
        //   123: ifeq            192
        //   126: aload_0        
        //   127: invokevirtual   agna.a:()Z
        //   130: ifne            192
        //   133: new             Lagmz;
        //   136: astore          4
        //   138: aload           4
        //   140: aload_0        
        //   141: aload_0        
        //   142: invokespecial   agmz.<init>:(Lagna;Lagna;)V
        //   145: aload           4
        //   147: getfield        agmz.a:Lagna;
        //   150: getfield        agna.a:Landroid/content/Context;
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
        //   175: getfield        agna.a:Landroid/content/Context;
        //   178: invokestatic    agna.b:(Landroid/content/Context;)Z
        //   181: ifeq            191
        //   184: aload_0        
        //   185: getfield        agna.g:Landroid/os/PowerManager$WakeLock;
        //   188: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   191: return         
        //   192: aload_0        
        //   193: getfield        agna.b:Lagmy;
        //   196: astore_3       
        //   197: aload_3        
        //   198: monitorenter   
        //   199: aload_3        
        //   200: getfield        agmy.d:Lagmx;
        //   203: invokevirtual   agmx.a:()Lagmw;
        //   206: astore          4
        //   208: aload           4
        //   210: ifnonnull       226
        //   213: aload_3        
        //   214: monitorexit    
        //   215: aload_0        
        //   216: getfield        agna.b:Lagmy;
        //   219: iconst_0       
        //   220: invokevirtual   agmy.e:(Z)V
        //   223: goto            676
        //   226: aload_3        
        //   227: monitorexit    
        //   228: aload           4
        //   230: getfield        agmw.b:Ljava/lang/String;
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
        //   302: getfield        agmw.a:Ljava/lang/String;
        //   305: astore          6
        //   307: aload_3        
        //   308: getfield        agmy.a:Lagmn;
        //   311: astore          7
        //   313: aload_3        
        //   314: getfield        agmy.b:Lcom/google/firebase/messaging/FirebaseMessaging;
        //   317: invokevirtual   com/google/firebase/messaging/FirebaseMessaging.c:()Ljava/lang/String;
        //   320: astore          5
        //   322: new             Landroid/os/Bundle;
        //   325: astore          8
        //   327: aload           8
        //   329: invokespecial   android/os/Bundle.<init>:()V
        //   332: aload           8
        //   334: ldc             "gcm.topic"
        //   336: ldc             "/topics/"
        //   338: aload           6
        //   340: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   343: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   346: aload           8
        //   348: ldc             "delete"
        //   350: ldc             "1"
        //   352: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   355: aload           7
        //   357: aload           5
        //   359: ldc             "/topics/"
        //   361: aload           6
        //   363: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   366: aload           8
        //   368: invokevirtual   agmn.a:(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lnnc;
        //   371: invokestatic    agmn.b:(Lnnc;)Lnnc;
        //   374: invokestatic    agmy.c:(Lnnc;)V
        //   377: goto            448
        //   380: aload           4
        //   382: getfield        agmw.a:Ljava/lang/String;
        //   385: astore          7
        //   387: aload_3        
        //   388: getfield        agmy.a:Lagmn;
        //   391: astore          5
        //   393: aload_3        
        //   394: getfield        agmy.b:Lcom/google/firebase/messaging/FirebaseMessaging;
        //   397: invokevirtual   com/google/firebase/messaging/FirebaseMessaging.c:()Ljava/lang/String;
        //   400: astore          6
        //   402: new             Landroid/os/Bundle;
        //   405: astore          8
        //   407: aload           8
        //   409: invokespecial   android/os/Bundle.<init>:()V
        //   412: aload           8
        //   414: ldc             "gcm.topic"
        //   416: ldc             "/topics/"
        //   418: aload           7
        //   420: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   423: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   426: aload           5
        //   428: aload           6
        //   430: ldc             "/topics/"
        //   432: aload           7
        //   434: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   437: aload           8
        //   439: invokevirtual   agmn.a:(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lnnc;
        //   442: invokestatic    agmn.b:(Lnnc;)Lnnc;
        //   445: invokestatic    agmy.c:(Lnnc;)V
        //   448: aload_3        
        //   449: getfield        agmy.d:Lagmx;
        //   452: aload           4
        //   454: invokevirtual   agmx.d:(Lagmw;)V
        //   457: aload_3        
        //   458: getfield        agmy.c:Ljava/util/Map;
        //   461: astore          5
        //   463: aload           5
        //   465: monitorenter   
        //   466: aload           4
        //   468: getfield        agmw.c:Ljava/lang/String;
        //   471: astore          7
        //   473: aload_3        
        //   474: getfield        agmy.c:Ljava/util/Map;
        //   477: aload           7
        //   479: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   484: ifne            493
        //   487: aload           5
        //   489: monitorexit    
        //   490: goto            197
        //   493: aload_3        
        //   494: getfield        agmy.c:Ljava/util/Map;
        //   497: aload           7
        //   499: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   504: checkcast       Ljava/util/ArrayDeque;
        //   507: astore          6
        //   509: aload           6
        //   511: invokevirtual   java/util/ArrayDeque.poll:()Ljava/lang/Object;
        //   514: checkcast       Lnns;
        //   517: astore          4
        //   519: aload           4
        //   521: ifnull          530
        //   524: aload           4
        //   526: aconst_null    
        //   527: invokevirtual   nns.b:(Ljava/lang/Object;)V
        //   530: aload           6
        //   532: invokevirtual   java/util/ArrayDeque.isEmpty:()Z
        //   535: ifeq            550
        //   538: aload_3        
        //   539: getfield        agmy.c:Ljava/util/Map;
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
        //   666: getfield        agna.b:Lagmy;
        //   669: aload_0        
        //   670: getfield        agna.h:J
        //   673: invokevirtual   agmy.g:(J)V
        //   676: aload_0        
        //   677: getfield        agna.a:Landroid/content/Context;
        //   680: invokestatic    agna.b:(Landroid/content/Context;)Z
        //   683: ifeq            779
        //   686: aload_0        
        //   687: getfield        agna.g:Landroid/os/PowerManager$WakeLock;
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
        //   708: astore          4
        //   710: goto            780
        //   713: astore_3       
        //   714: aload_3        
        //   715: invokevirtual   java/io/IOException.getMessage:()Ljava/lang/String;
        //   718: astore          4
        //   720: new             Ljava/lang/StringBuilder;
        //   723: astore_3       
        //   724: aload_3        
        //   725: invokespecial   java/lang/StringBuilder.<init>:()V
        //   728: aload_3        
        //   729: ldc_w           "Failed to sync topics. Won't retry sync. "
        //   732: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   735: pop            
        //   736: aload_3        
        //   737: aload           4
        //   739: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   742: pop            
        //   743: ldc_w           "FirebaseMessaging"
        //   746: aload_3        
        //   747: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   750: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   753: pop            
        //   754: aload_0        
        //   755: getfield        agna.b:Lagmy;
        //   758: iconst_0       
        //   759: invokevirtual   agmy.e:(Z)V
        //   762: aload_0        
        //   763: getfield        agna.a:Landroid/content/Context;
        //   766: invokestatic    agna.b:(Landroid/content/Context;)Z
        //   769: ifeq            779
        //   772: aload_0        
        //   773: getfield        agna.g:Landroid/os/PowerManager$WakeLock;
        //   776: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   779: return         
        //   780: aload_0        
        //   781: getfield        agna.a:Landroid/content/Context;
        //   784: invokestatic    agna.b:(Landroid/content/Context;)Z
        //   787: ifeq            797
        //   790: aload_0        
        //   791: getfield        agna.g:Landroid/os/PowerManager$WakeLock;
        //   794: invokevirtual   android/os/PowerManager$WakeLock.release:()V
        //   797: goto            803
        //   800: aload           4
        //   802: athrow         
        //   803: goto            800
        //   806: astore_3       
        //   807: goto            63
        //   810: astore_3       
        //   811: goto            191
        //   814: astore_3       
        //   815: goto            693
        //   818: astore_3       
        //   819: goto            779
        //   822: astore_3       
        //   823: goto            797
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  20     46     713    779    Ljava/io/IOException;
        //  20     46     708    806    Any
        //  56     63     806    810    Ljava/lang/RuntimeException;
        //  64     76     713    779    Ljava/io/IOException;
        //  64     76     708    806    Any
        //  76     81     701    708    Any
        //  86     94     701    708    Any
        //  97     103    701    708    Any
        //  103    122    701    708    Any
        //  126    174    713    779    Ljava/io/IOException;
        //  126    174    708    806    Any
        //  184    191    810    814    Ljava/lang/RuntimeException;
        //  192    197    713    779    Ljava/io/IOException;
        //  192    197    708    806    Any
        //  197    199    713    779    Ljava/io/IOException;
        //  197    199    708    806    Any
        //  199    208    694    701    Any
        //  213    215    694    701    Any
        //  215    223    713    779    Ljava/io/IOException;
        //  215    223    708    806    Any
        //  226    228    694    701    Any
        //  228    241    562    676    Ljava/io/IOException;
        //  228    241    708    806    Any
        //  300    377    562    676    Ljava/io/IOException;
        //  300    377    708    806    Any
        //  380    448    562    676    Ljava/io/IOException;
        //  380    448    708    806    Any
        //  448    466    713    779    Ljava/io/IOException;
        //  448    466    708    806    Any
        //  466    490    556    562    Any
        //  493    519    556    562    Any
        //  524    530    556    562    Any
        //  530    550    556    562    Any
        //  550    553    556    562    Any
        //  557    560    556    562    Any
        //  560    562    713    779    Ljava/io/IOException;
        //  560    562    708    806    Any
        //  563    588    713    779    Ljava/io/IOException;
        //  563    588    708    806    Any
        //  591    608    713    779    Ljava/io/IOException;
        //  591    608    708    806    Any
        //  611    613    713    779    Ljava/io/IOException;
        //  611    613    708    806    Any
        //  613    665    713    779    Ljava/io/IOException;
        //  613    665    708    806    Any
        //  665    676    713    779    Ljava/io/IOException;
        //  665    676    708    806    Any
        //  686    693    814    818    Ljava/lang/RuntimeException;
        //  696    698    694    701    Any
        //  698    701    713    779    Ljava/io/IOException;
        //  698    701    708    806    Any
        //  703    705    701    708    Any
        //  705    708    713    779    Ljava/io/IOException;
        //  705    708    708    806    Any
        //  714    762    708    806    Any
        //  772    779    818    822    Ljava/lang/RuntimeException;
        //  790    797    822    826    Ljava/lang/RuntimeException;
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
