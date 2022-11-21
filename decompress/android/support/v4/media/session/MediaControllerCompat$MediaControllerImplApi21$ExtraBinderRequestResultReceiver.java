// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import java.lang.ref.WeakReference;
import android.os.ResultReceiver;

public class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver
{
    private final WeakReference a;
    
    public MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(final dw dw) {
        super((Handler)null);
        this.a = new WeakReference((T)dw);
    }
    
    protected final void onReceiveResult(final int p0, final Bundle p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.a:Ljava/lang/ref/WeakReference;
        //     4: invokevirtual   java/lang/ref/WeakReference.get:()Ljava/lang/Object;
        //     7: checkcast       Ldw;
        //    10: astore          5
        //    12: aload           5
        //    14: ifnull          346
        //    17: aload_2        
        //    18: ifnonnull       24
        //    21: goto            346
        //    24: aload           5
        //    26: getfield        dw.b:Ljava/lang/Object;
        //    29: astore          4
        //    31: aload           4
        //    33: monitorenter   
        //    34: aload           5
        //    36: getfield        dw.e:Landroid/support/v4/media/session/MediaSessionCompat$Token;
        //    39: astore          6
        //    41: aload_2        
        //    42: ldc             "android.support.v4.media.session.EXTRA_BINDER"
        //    44: invokestatic    afc.a:(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;
        //    47: astore          7
        //    49: aload           7
        //    51: ifnonnull       59
        //    54: aconst_null    
        //    55: astore_3       
        //    56: goto            98
        //    59: aload           7
        //    61: ldc             "android.support.v4.media.session.IMediaSession"
        //    63: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //    68: astore_3       
        //    69: aload_3        
        //    70: ifnull          88
        //    73: aload_3        
        //    74: instanceof      Ldr;
        //    77: ifeq            88
        //    80: aload_3        
        //    81: checkcast       Ldr;
        //    84: astore_3       
        //    85: goto            98
        //    88: new             Ldp;
        //    91: dup            
        //    92: aload           7
        //    94: invokespecial   dp.<init>:(Landroid/os/IBinder;)V
        //    97: astore_3       
        //    98: aload           6
        //   100: getfield        android/support/v4/media/session/MediaSessionCompat$Token.a:Ljava/lang/Object;
        //   103: astore          7
        //   105: aload           7
        //   107: monitorenter   
        //   108: aload           6
        //   110: aload_3        
        //   111: putfield        android/support/v4/media/session/MediaSessionCompat$Token.c:Ldr;
        //   114: aload           7
        //   116: monitorexit    
        //   117: aload           5
        //   119: getfield        dw.e:Landroid/support/v4/media/session/MediaSessionCompat$Token;
        //   122: astore_3       
        //   123: aload_2        
        //   124: ldc             "android.support.v4.media.session.SESSION_TOKEN2"
        //   126: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   129: checkcast       Landroid/os/Bundle;
        //   132: astore_2       
        //   133: aload_2        
        //   134: ifnonnull       140
        //   137: goto            186
        //   140: aload_2        
        //   141: ldc             Lckp;.class
        //   143: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //   146: invokevirtual   android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
        //   149: aload_2        
        //   150: ldc             "a"
        //   152: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   155: astore_2       
        //   156: aload_2        
        //   157: instanceof      Landroidx/versionedparcelable/ParcelImpl;
        //   160: ifeq            174
        //   163: aload_2        
        //   164: checkcast       Landroidx/versionedparcelable/ParcelImpl;
        //   167: getfield        androidx/versionedparcelable/ParcelImpl.a:Lckr;
        //   170: astore_2       
        //   171: goto            188
        //   174: new             Ljava/lang/IllegalArgumentException;
        //   177: astore_2       
        //   178: aload_2        
        //   179: ldc             "Invalid parcel"
        //   181: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   184: aload_2        
        //   185: athrow         
        //   186: aconst_null    
        //   187: astore_2       
        //   188: aload_3        
        //   189: getfield        android/support/v4/media/session/MediaSessionCompat$Token.a:Ljava/lang/Object;
        //   192: astore          6
        //   194: aload           6
        //   196: monitorenter   
        //   197: aload_3        
        //   198: aload_2        
        //   199: putfield        android/support/v4/media/session/MediaSessionCompat$Token.d:Lckr;
        //   202: aload           6
        //   204: monitorexit    
        //   205: aload           5
        //   207: getfield        dw.e:Landroid/support/v4/media/session/MediaSessionCompat$Token;
        //   210: invokevirtual   android/support/v4/media/session/MediaSessionCompat$Token.a:()Ldr;
        //   213: ifnonnull       219
        //   216: goto            324
        //   219: aload           5
        //   221: getfield        dw.c:Ljava/util/List;
        //   224: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   229: astore_2       
        //   230: aload_2        
        //   231: invokeinterface java/util/Iterator.hasNext:()Z
        //   236: ifeq            314
        //   239: aload_2        
        //   240: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   245: checkcast       Ldu;
        //   248: astore          6
        //   250: new             Ldv;
        //   253: astore_3       
        //   254: aload_3        
        //   255: aload           6
        //   257: invokespecial   dv.<init>:(Ldu;)V
        //   260: aload           5
        //   262: getfield        dw.d:Ljava/util/HashMap;
        //   265: aload           6
        //   267: aload_3        
        //   268: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   271: pop            
        //   272: aload           6
        //   274: aload_3        
        //   275: putfield        du.c:Ldo;
        //   278: aload           5
        //   280: getfield        dw.e:Landroid/support/v4/media/session/MediaSessionCompat$Token;
        //   283: invokevirtual   android/support/v4/media/session/MediaSessionCompat$Token.a:()Ldr;
        //   286: aload_3        
        //   287: invokeinterface dr.b:(Ldo;)V
        //   292: aload           6
        //   294: bipush          13
        //   296: aconst_null    
        //   297: aconst_null    
        //   298: invokevirtual   du.d:(ILjava/lang/Object;Landroid/os/Bundle;)V
        //   301: goto            230
        //   304: astore_2       
        //   305: ldc             "MediaControllerCompat"
        //   307: ldc             "Dead object in registerCallback."
        //   309: aload_2        
        //   310: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   313: pop            
        //   314: aload           5
        //   316: getfield        dw.c:Ljava/util/List;
        //   319: invokeinterface java/util/List.clear:()V
        //   324: aload           4
        //   326: monitorexit    
        //   327: return         
        //   328: astore_2       
        //   329: aload           6
        //   331: monitorexit    
        //   332: aload_2        
        //   333: athrow         
        //   334: astore_2       
        //   335: aload           7
        //   337: monitorexit    
        //   338: aload_2        
        //   339: athrow         
        //   340: astore_2       
        //   341: aload           4
        //   343: monitorexit    
        //   344: aload_2        
        //   345: athrow         
        //   346: return         
        //   347: astore_2       
        //   348: goto            186
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  34     49     340    346    Any
        //  59     69     340    346    Any
        //  73     85     340    346    Any
        //  88     98     340    346    Any
        //  98     108    340    346    Any
        //  108    117    334    340    Any
        //  117    123    340    346    Any
        //  123    133    347    351    Ljava/lang/RuntimeException;
        //  123    133    340    346    Any
        //  140    171    347    351    Ljava/lang/RuntimeException;
        //  140    171    340    346    Any
        //  174    186    347    351    Ljava/lang/RuntimeException;
        //  174    186    340    346    Any
        //  188    197    340    346    Any
        //  197    205    328    334    Any
        //  205    216    340    346    Any
        //  219    230    340    346    Any
        //  230    278    340    346    Any
        //  278    292    304    314    Landroid/os/RemoteException;
        //  278    292    340    346    Any
        //  292    301    340    346    Any
        //  305    314    340    346    Any
        //  314    324    340    346    Any
        //  324    327    340    346    Any
        //  329    332    328    334    Any
        //  332    334    340    346    Any
        //  335    338    334    340    Any
        //  338    340    340    346    Any
        //  341    344    340    346    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0140:
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
}
