// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

class VrCoreSdkClient$1 implements ServiceConnection
{
    final VrCoreSdkClient this$0;
    
    public VrCoreSdkClient$1(final VrCoreSdkClient this$0) {
        this.this$0 = this$0;
    }
    
    public void onServiceConnected(final ComponentName p0, final IBinder p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          6
        //     3: aconst_null    
        //     4: astore          7
        //     6: aload_2        
        //     7: ifnonnull       15
        //    10: aconst_null    
        //    11: astore_1       
        //    12: goto            48
        //    15: aload_2        
        //    16: ldc             "com.google.vr.vrcore.common.api.IVrCoreSdkService"
        //    18: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //    23: astore_1       
        //    24: aload_1        
        //    25: instanceof      Lardk;
        //    28: ifeq            39
        //    31: aload_1        
        //    32: checkcast       Lardk;
        //    35: astore_1       
        //    36: goto            48
        //    39: new             Lardj;
        //    42: dup            
        //    43: aload_2        
        //    44: invokespecial   ardj.<init>:(Landroid/os/IBinder;)V
        //    47: astore_1       
        //    48: aload_1        
        //    49: invokeinterface ardk.g:()Z
        //    54: istore          5
        //    56: iload           5
        //    58: ifeq            390
        //    61: aload_0        
        //    62: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //    65: aload_1        
        //    66: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fputvrCoreSdkService:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Lardk;)V
        //    69: aload_0        
        //    70: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //    73: astore_1       
        //    74: aload_1        
        //    75: aload_1        
        //    76: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetvrCoreSdkService:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Lardk;
        //    79: invokeinterface ardk.a:()Lardg;
        //    84: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fputdaydreamManager:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Lardg;)V
        //    87: aload_0        
        //    88: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //    91: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetdaydreamManager:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Lardg;
        //    94: ifnonnull       113
        //    97: ldc             "VrCoreSdkClient"
        //    99: ldc             "Failed to obtain DaydreamManager from VrCore SDK Service."
        //   101: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   104: pop            
        //   105: aload_0        
        //   106: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   109: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mhandleNoDaydreamManager:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)V
        //   112: return         
        //   113: aload_0        
        //   114: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   117: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetdaydreamManager:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Lardg;
        //   120: aload_0        
        //   121: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   124: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetcomponentName:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Landroid/content/ComponentName;
        //   127: aload_0        
        //   128: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   131: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetdaydreamListener:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Lcom/google/vr/ndk/base/VrCoreSdkClient$DaydreamListenerImpl;
        //   134: invokeinterface ardg.p:(Landroid/content/ComponentName;Larde;)V
        //   139: aload_0        
        //   140: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   143: invokevirtual   com/google/vr/ndk/base/VrCoreSdkClient.getHeadTrackingState:()Lcom/google/vr/vrcore/common/api/HeadTrackingState;
        //   146: astore_2       
        //   147: aload_0        
        //   148: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   151: aload_2        
        //   152: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mprepareVr:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Lcom/google/vr/vrcore/common/api/HeadTrackingState;)I
        //   155: istore          4
        //   157: iload           4
        //   159: istore_3       
        //   160: iload           4
        //   162: ifne            189
        //   165: aload_0        
        //   166: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   169: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetonDonNotNeededListener:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Ljava/lang/Runnable;
        //   172: ifnull          187
        //   175: aload_0        
        //   176: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   179: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetonDonNotNeededListener:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Ljava/lang/Runnable;
        //   182: invokeinterface java/lang/Runnable.run:()V
        //   187: iconst_0       
        //   188: istore_3       
        //   189: iload_3        
        //   190: iconst_2       
        //   191: if_icmpne       228
        //   194: ldc             "VrCoreSdkClient"
        //   196: ldc             "Daydream VR preparation failed, closing VR session."
        //   198: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   201: pop            
        //   202: aload_0        
        //   203: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   206: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mhandlePrepareVrFailed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)V
        //   209: aload_0        
        //   210: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   213: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetisResumed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Z
        //   216: ifeq            227
        //   219: aload_0        
        //   220: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   223: aconst_null    
        //   224: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mresumeTracking:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Lcom/google/vr/vrcore/common/api/HeadTrackingState;)V
        //   227: return         
        //   228: aload           7
        //   230: astore_1       
        //   231: iload_3        
        //   232: ifne            237
        //   235: aload_2        
        //   236: astore_1       
        //   237: aload_0        
        //   238: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   241: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetisResumed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Z
        //   244: ifeq            310
        //   247: aload_0        
        //   248: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   251: aload_1        
        //   252: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mresumeTracking:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Lcom/google/vr/vrcore/common/api/HeadTrackingState;)V
        //   255: goto            310
        //   258: astore_1       
        //   259: goto            346
        //   262: astore_1       
        //   263: aload_1        
        //   264: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   267: astore_2       
        //   268: new             Ljava/lang/StringBuilder;
        //   271: astore_1       
        //   272: aload_1        
        //   273: ldc             "Error while registering listener with the VrCore SDK Service:"
        //   275: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   278: aload_1        
        //   279: aload_2        
        //   280: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   283: pop            
        //   284: ldc             "VrCoreSdkClient"
        //   286: aload_1        
        //   287: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   290: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   293: pop            
        //   294: aload_0        
        //   295: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   298: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetisResumed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Z
        //   301: ifeq            310
        //   304: aload           6
        //   306: astore_1       
        //   307: goto            247
        //   310: aload_0        
        //   311: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   314: astore_1       
        //   315: aload_1        
        //   316: aload_1        
        //   317: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetvrCoreSdkService:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Lardk;
        //   320: invokeinterface ardk.b:()Laree;
        //   325: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fputloggingService:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Laree;)V
        //   328: return         
        //   329: astore_1       
        //   330: ldc             "VrCoreSdkClient"
        //   332: ldc             "Error getting logging service from VrCore:"
        //   334: aload_1        
        //   335: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   338: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   341: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   344: pop            
        //   345: return         
        //   346: aload_0        
        //   347: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   350: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetisResumed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Z
        //   353: ifeq            364
        //   356: aload_0        
        //   357: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   360: aconst_null    
        //   361: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mresumeTracking:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Lcom/google/vr/vrcore/common/api/HeadTrackingState;)V
        //   364: aload_1        
        //   365: athrow         
        //   366: astore_1       
        //   367: ldc             "VrCoreSdkClient"
        //   369: ldc             "Failed to obtain DaydreamManager from VrCore SDK Service:"
        //   371: aload_1        
        //   372: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   375: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   378: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   381: pop            
        //   382: aload_0        
        //   383: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   386: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mhandleNoDaydreamManager:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)V
        //   389: return         
        //   390: ldc             "VrCoreSdkClient"
        //   392: ldc             "Failed to initialize VrCore SDK Service."
        //   394: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   397: pop            
        //   398: aload_0        
        //   399: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   402: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mhandleBindFailed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)V
        //   405: return         
        //   406: astore_1       
        //   407: ldc             "VrCoreSdkClient"
        //   409: ldc             "Failed to initialize VrCore SDK Service: "
        //   411: aload_1        
        //   412: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   415: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   418: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   421: pop            
        //   422: aload_0        
        //   423: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   426: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mhandleBindFailed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)V
        //   429: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  48     56     406    430    Landroid/os/RemoteException;
        //  69     112    366    390    Landroid/os/RemoteException;
        //  113    139    366    390    Landroid/os/RemoteException;
        //  139    157    262    310    Landroid/os/RemoteException;
        //  139    157    258    366    Any
        //  165    187    262    310    Landroid/os/RemoteException;
        //  165    187    258    366    Any
        //  194    209    262    310    Landroid/os/RemoteException;
        //  194    209    258    366    Any
        //  263    294    258    366    Any
        //  310    328    329    346    Landroid/os/RemoteException;
        //  390    405    406    430    Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0310:
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
    
    public void onServiceDisconnected(final ComponentName componentName) {
        VrCoreSdkClient.-$$Nest$fputvrCoreSdkService(this.this$0, (ardk)null);
        VrCoreSdkClient.-$$Nest$fputdaydreamManager(this.this$0, (ardg)null);
        VrCoreSdkClient.-$$Nest$fputloggingService(this.this$0, (aree)null);
    }
}
