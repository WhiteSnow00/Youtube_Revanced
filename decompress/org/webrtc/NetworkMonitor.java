// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import android.net.ConnectivityManager$NetworkCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build$VERSION;
import java.util.ArrayList;

public class NetworkMonitor
{
    public volatile NetworkChangeDetector$ConnectionType a;
    private final ArrayList b;
    private final ArrayList c;
    private final Object d;
    private auks e;
    private int f;
    
    public NetworkMonitor() {
        this.d = new Object();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = 0;
        this.a = NetworkChangeDetector$ConnectionType.a;
    }
    
    private static int androidSdkInt() {
        return Build$VERSION.SDK_INT;
    }
    
    public static NetworkMonitor getInstance() {
        return aukt.a;
    }
    
    private native void nativeNotifyConnectionTypeChanged(final long p0);
    
    private native void nativeNotifyOfActiveNetworkList(final long p0, final NetworkChangeDetector$NetworkInformation[] p1);
    
    private native void nativeNotifyOfNetworkPreference(final long p0, final NetworkChangeDetector$ConnectionType p1, final int p2);
    
    private boolean networkBindingSupported() {
        synchronized (this.d) {
            final auks e = this.e;
            boolean b = false;
            if (e != null) {
                b = b;
                if (((aukz)e).e.d()) {
                    b = true;
                }
            }
            return b;
        }
    }
    
    private void startMonitoring(final Context p0, final long p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "Start monitoring with native observer "
        //     6: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //     9: astore          5
        //    11: aload           5
        //    13: lload_2        
        //    14: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    17: pop            
        //    18: aload           5
        //    20: ldc             " fieldTrialsString: "
        //    22: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    25: pop            
        //    26: aload           5
        //    28: aload           4
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: pop            
        //    34: ldc             "NetworkMonitor"
        //    36: aload           5
        //    38: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    41: invokestatic    org/webrtc/Logging.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    44: aload_1        
        //    45: astore          5
        //    47: aload_1        
        //    48: ifnonnull       56
        //    51: invokestatic    org/webrtc/ContextUtils.getApplicationContext:()Landroid/content/Context;
        //    54: astore          5
        //    56: aload_0        
        //    57: getfield        org/webrtc/NetworkMonitor.d:Ljava/lang/Object;
        //    60: astore_1       
        //    61: aload_1        
        //    62: monitorenter   
        //    63: aload_0        
        //    64: aload_0        
        //    65: getfield        org/webrtc/NetworkMonitor.f:I
        //    68: iconst_1       
        //    69: iadd           
        //    70: putfield        org/webrtc/NetworkMonitor.f:I
        //    73: aload_0        
        //    74: getfield        org/webrtc/NetworkMonitor.e:Lauks;
        //    77: ifnonnull       113
        //    80: new             Laukr;
        //    83: astore          6
        //    85: aload           6
        //    87: aload_0        
        //    88: aload           4
        //    90: invokespecial   aukr.<init>:(Lorg/webrtc/NetworkMonitor;Ljava/lang/String;)V
        //    93: new             Laukz;
        //    96: astore          4
        //    98: aload           4
        //   100: aload           6
        //   102: aload           5
        //   104: invokespecial   aukz.<init>:(Laukr;Landroid/content/Context;)V
        //   107: aload_0        
        //   108: aload           4
        //   110: putfield        org/webrtc/NetworkMonitor.e:Lauks;
        //   113: aload_0        
        //   114: aload_0        
        //   115: getfield        org/webrtc/NetworkMonitor.e:Lauks;
        //   118: checkcast       Laukz;
        //   121: invokevirtual   aukz.c:()Laukw;
        //   124: invokestatic    aukz.a:(Laukw;)Lorg/webrtc/NetworkChangeDetector$ConnectionType;
        //   127: putfield        org/webrtc/NetworkMonitor.a:Lorg/webrtc/NetworkChangeDetector$ConnectionType;
        //   130: aload_1        
        //   131: monitorexit    
        //   132: aload_0        
        //   133: getfield        org/webrtc/NetworkMonitor.b:Ljava/util/ArrayList;
        //   136: astore          4
        //   138: aload           4
        //   140: monitorenter   
        //   141: aload_0        
        //   142: getfield        org/webrtc/NetworkMonitor.b:Ljava/util/ArrayList;
        //   145: lload_2        
        //   146: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   149: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   152: pop            
        //   153: aload           4
        //   155: monitorexit    
        //   156: aload_0        
        //   157: getfield        org/webrtc/NetworkMonitor.d:Ljava/lang/Object;
        //   160: astore          7
        //   162: aload           7
        //   164: monitorenter   
        //   165: aload_0        
        //   166: getfield        org/webrtc/NetworkMonitor.e:Lauks;
        //   169: astore_1       
        //   170: aconst_null    
        //   171: astore          5
        //   173: aload_1        
        //   174: ifnonnull       183
        //   177: aload           5
        //   179: astore_1       
        //   180: goto            368
        //   183: aload_1        
        //   184: checkcast       Laukz;
        //   187: getfield        aukz.e:Laukv;
        //   190: astore          8
        //   192: aload           8
        //   194: invokevirtual   aukv.d:()Z
        //   197: ifne            206
        //   200: aconst_null    
        //   201: astore          4
        //   203: goto            347
        //   206: new             Ljava/util/ArrayList;
        //   209: astore          6
        //   211: aload           6
        //   213: invokespecial   java/util/ArrayList.<init>:()V
        //   216: aload           8
        //   218: getfield        aukv.a:Landroid/net/ConnectivityManager;
        //   221: astore_1       
        //   222: iconst_0       
        //   223: istore          9
        //   225: aload_1        
        //   226: ifnonnull       237
        //   229: iconst_0       
        //   230: anewarray       Landroid/net/Network;
        //   233: astore_1       
        //   234: goto            302
        //   237: aload           8
        //   239: invokevirtual   aukv.d:()Z
        //   242: ifeq            293
        //   245: aload           8
        //   247: getfield        aukv.c:Z
        //   250: ifeq            293
        //   253: aload           8
        //   255: getfield        aukv.b:Ljava/util/Set;
        //   258: astore          4
        //   260: aload           4
        //   262: monitorenter   
        //   263: aload           8
        //   265: getfield        aukv.b:Ljava/util/Set;
        //   268: iconst_0       
        //   269: anewarray       Landroid/net/Network;
        //   272: invokeinterface java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   277: checkcast       [Landroid/net/Network;
        //   280: astore_1       
        //   281: aload           4
        //   283: monitorexit    
        //   284: goto            302
        //   287: astore_1       
        //   288: aload           4
        //   290: monitorexit    
        //   291: aload_1        
        //   292: athrow         
        //   293: aload           8
        //   295: getfield        aukv.a:Landroid/net/ConnectivityManager;
        //   298: invokevirtual   android/net/ConnectivityManager.getAllNetworks:()[Landroid/net/Network;
        //   301: astore_1       
        //   302: aload_1        
        //   303: arraylength    
        //   304: istore          10
        //   306: aload           6
        //   308: astore          4
        //   310: iload           9
        //   312: iload           10
        //   314: if_icmpge       347
        //   317: aload           8
        //   319: aload_1        
        //   320: iload           9
        //   322: aaload         
        //   323: invokevirtual   aukv.a:(Landroid/net/Network;)Lorg/webrtc/NetworkChangeDetector$NetworkInformation;
        //   326: astore          4
        //   328: aload           4
        //   330: ifnull          341
        //   333: aload           6
        //   335: aload           4
        //   337: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   340: pop            
        //   341: iinc            9, 1
        //   344: goto            306
        //   347: aload           4
        //   349: ifnonnull       358
        //   352: aload           5
        //   354: astore_1       
        //   355: goto            368
        //   358: new             Ljava/util/ArrayList;
        //   361: dup            
        //   362: aload           4
        //   364: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   367: astore_1       
        //   368: aload           7
        //   370: monitorexit    
        //   371: aload_1        
        //   372: ifnull          398
        //   375: aload_0        
        //   376: lload_2        
        //   377: aload_1        
        //   378: aload_1        
        //   379: invokeinterface java/util/List.size:()I
        //   384: anewarray       Lorg/webrtc/NetworkChangeDetector$NetworkInformation;
        //   387: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   392: checkcast       [Lorg/webrtc/NetworkChangeDetector$NetworkInformation;
        //   395: invokespecial   org/webrtc/NetworkMonitor.nativeNotifyOfActiveNetworkList:(J[Lorg/webrtc/NetworkChangeDetector$NetworkInformation;)V
        //   398: aload_0        
        //   399: invokevirtual   org/webrtc/NetworkMonitor.b:()V
        //   402: return         
        //   403: astore_1       
        //   404: aload           7
        //   406: monitorexit    
        //   407: aload_1        
        //   408: athrow         
        //   409: astore_1       
        //   410: aload           4
        //   412: monitorexit    
        //   413: aload_1        
        //   414: athrow         
        //   415: astore          4
        //   417: aload_1        
        //   418: monitorexit    
        //   419: goto            425
        //   422: aload           4
        //   424: athrow         
        //   425: goto            422
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  63     113    415    428    Any
        //  113    132    415    428    Any
        //  141    156    409    415    Any
        //  165    170    403    409    Any
        //  183    200    403    409    Any
        //  206    222    403    409    Any
        //  229    234    403    409    Any
        //  237    263    403    409    Any
        //  263    284    287    293    Any
        //  288    291    287    293    Any
        //  291    293    403    409    Any
        //  293    302    403    409    Any
        //  302    306    403    409    Any
        //  317    328    403    409    Any
        //  333    341    403    409    Any
        //  358    368    403    409    Any
        //  368    371    403    409    Any
        //  404    407    403    409    Any
        //  410    413    409    415    Any
        //  417    419    415    428    Any
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
    
    private void stopMonitoring(final long n) {
        final StringBuilder sb = new StringBuilder("Stop monitoring with native observer ");
        sb.append(n);
        Logging.a("NetworkMonitor", sb.toString());
        synchronized (this.d) {
            final int f = this.f - 1;
            this.f = f;
            if (f == 0) {
                final auks e = this.e;
                final ConnectivityManager$NetworkCallback d = ((aukz)e).d;
                if (d != null) {
                    ((aukz)e).e.c(d);
                }
                final ConnectivityManager$NetworkCallback c = ((aukz)e).c;
                if (c != null) {
                    ((aukz)e).e.c(c);
                }
                final auky f2 = ((aukz)e).f;
                if (((aukz)e).h) {
                    ((aukz)e).h = false;
                    ((aukz)e).b.unregisterReceiver((BroadcastReceiver)e);
                }
                this.e = null;
            }
            monitorexit(this.d);
            synchronized (this.b) {
                this.b.remove(n);
            }
        }
    }
    
    public final List a() {
        synchronized (this.b) {
            return new ArrayList(this.b);
        }
    }
    
    public final void b() {
        final Iterator iterator = this.a().iterator();
        while (iterator.hasNext()) {
            this.nativeNotifyConnectionTypeChanged((long)iterator.next());
        }
        final ArrayList c = this.c;
        monitorenter(c);
        try {
            final ArrayList list = new ArrayList(this.c);
            monitorexit(c);
            for (int size = list.size(), i = 0; i < size; ++i) {
                ((auku)list.get(i)).a();
            }
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    public native void nativeNotifyOfNetworkConnect(final long p0, final NetworkChangeDetector$NetworkInformation p1);
    
    public native void nativeNotifyOfNetworkDisconnect(final long p0, final long p1);
}
