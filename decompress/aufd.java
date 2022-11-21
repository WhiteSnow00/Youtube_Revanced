import android.net.ConnectivityManager$NetworkCallback;
import android.net.NetworkCapabilities;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import org.chromium.net.NetworkChangeNotifierAutoDetect;
import android.net.Network;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aufd
{
    public final Object a;
    
    aufd() {
        this.a = null;
    }
    
    public aufd(final Context context) {
        this.a = context.getSystemService("connectivity");
    }
    
    public aufd(final Context a, final byte[] array) {
        this.a = a;
    }
    
    public static final boolean g(final Network p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/net/Socket.<init>:()V
        //     7: astore_1       
        //     8: invokestatic    android/os/StrictMode.getVmPolicy:()Landroid/os/StrictMode$VmPolicy;
        //    11: astore_3       
        //    12: getstatic       android/os/StrictMode$VmPolicy.LAX:Landroid/os/StrictMode$VmPolicy;
        //    15: invokestatic    android/os/StrictMode.setVmPolicy:(Landroid/os/StrictMode$VmPolicy;)V
        //    18: new             Laued;
        //    21: astore_2       
        //    22: aload_2        
        //    23: aconst_null    
        //    24: aload_3        
        //    25: invokespecial   aued.<init>:(Landroid/os/StrictMode$ThreadPolicy;Landroid/os/StrictMode$VmPolicy;)V
        //    28: aload_0        
        //    29: aload_1        
        //    30: invokevirtual   android/net/Network.bindSocket:(Ljava/net/Socket;)V
        //    33: aload_2        
        //    34: invokevirtual   aued.close:()V
        //    37: aload_1        
        //    38: invokevirtual   java/net/Socket.close:()V
        //    41: iconst_1       
        //    42: ireturn        
        //    43: astore_0       
        //    44: aload_2        
        //    45: invokevirtual   aued.close:()V
        //    48: goto            57
        //    51: astore_2       
        //    52: aload_0        
        //    53: aload_2        
        //    54: invokestatic    org/chromium/net/NetworkChangeNotifierAutoDetect$ConnectivityManagerDelegate$$ExternalSyntheticBackport0.m:(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
        //    57: aload_0        
        //    58: athrow         
        //    59: astore_0       
        //    60: aload_1        
        //    61: invokevirtual   java/net/Socket.close:()V
        //    64: aload_0        
        //    65: athrow         
        //    66: astore_0       
        //    67: aload_1        
        //    68: invokevirtual   java/net/Socket.close:()V
        //    71: iconst_0       
        //    72: ireturn        
        //    73: astore_0       
        //    74: goto            41
        //    77: astore_1       
        //    78: goto            64
        //    81: astore_0       
        //    82: goto            71
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      28     66     73     Ljava/io/IOException;
        //  8      28     59     66     Any
        //  28     33     43     59     Any
        //  33     37     66     73     Ljava/io/IOException;
        //  33     37     59     66     Any
        //  37     41     73     77     Ljava/io/IOException;
        //  44     48     51     57     Any
        //  52     57     66     73     Ljava/io/IOException;
        //  52     57     59     66     Any
        //  57     59     66     73     Ljava/io/IOException;
        //  57     59     59     66     Any
        //  60     64     77     81     Ljava/io/IOException;
        //  67     71     81     85     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 49, Size: 49
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
    
    public final int a(final Network network) {
        final NetworkInfo d = this.d(network);
        if (d != null && d.isConnected()) {
            return NetworkChangeNotifierAutoDetect.-$$Nest$smconvertToConnectionType(d.getType(), d.getSubtype());
        }
        return 6;
    }
    
    public final Network b() {
        Network activeNetwork;
        Network network = activeNetwork = ((ConnectivityManager)this.a).getActiveNetwork();
        if (network == null) {
            final NetworkInfo activeNetworkInfo = ((ConnectivityManager)this.a).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            final Network[] -$$Nest$smgetAllNetworksFiltered = NetworkChangeNotifierAutoDetect.-$$Nest$smgetAllNetworksFiltered(this, (Network)null);
            final int length = -$$Nest$smgetAllNetworksFiltered.length;
            int n = 0;
            while (true) {
                activeNetwork = network;
                if (n >= length) {
                    break;
                }
                final Network network2 = -$$Nest$smgetAllNetworksFiltered[n];
                final NetworkInfo e = this.e(network2);
                Network network3 = network;
                Label_0110: {
                    if (e != null) {
                        if (e.getType() != activeNetworkInfo.getType()) {
                            network3 = network;
                            if (e.getType() != 17) {
                                break Label_0110;
                            }
                        }
                        network3 = network2;
                    }
                }
                ++n;
                network = network3;
            }
        }
        return activeNetwork;
    }
    
    public final NetworkCapabilities c(final Network network) {
        int i = 0;
        while (i < 2) {
            try {
                return ((ConnectivityManager)this.a).getNetworkCapabilities(network);
            }
            catch (final SecurityException ex) {
                ++i;
                continue;
            }
            break;
        }
        return null;
    }
    
    public final NetworkInfo d(final Network network) {
        NetworkInfo networkInfo2;
        final NetworkInfo networkInfo = networkInfo2 = this.e(network);
        if (networkInfo != null) {
            networkInfo2 = networkInfo;
            if (networkInfo.getType() == 17) {
                networkInfo2 = ((ConnectivityManager)this.a).getActiveNetworkInfo();
            }
        }
        return networkInfo2;
    }
    
    final NetworkInfo e(final Network network) {
        try {
            return ((ConnectivityManager)this.a).getNetworkInfo(network);
        }
        catch (final NullPointerException ex) {
            try {
                return ((ConnectivityManager)this.a).getNetworkInfo(network);
            }
            catch (final NullPointerException ex2) {
                return null;
            }
        }
    }
    
    public final void f(final ConnectivityManager$NetworkCallback connectivityManager$NetworkCallback) {
        ((ConnectivityManager)this.a).unregisterNetworkCallback(connectivityManager$NetworkCallback);
    }
}
