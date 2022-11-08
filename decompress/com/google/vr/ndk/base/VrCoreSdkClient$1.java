// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

class VrCoreSdkClient$1 implements ServiceConnection
{
    final /* synthetic */ VrCoreSdkClient this$0;
    
    public VrCoreSdkClient$1(final VrCoreSdkClient this$0) {
        this.this$0 = this$0;
    }
    
    public void onServiceConnected(final ComponentName p0, final IBinder p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: aconst_null    
        //     3: astore          4
        //     5: aload_2        
        //     6: ifnonnull       14
        //     9: aconst_null    
        //    10: astore_1       
        //    11: goto            47
        //    14: aload_2        
        //    15: ldc             "com.google.vr.vrcore.common.api.IVrCoreSdkService"
        //    17: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //    22: astore_1       
        //    23: aload_1        
        //    24: instanceof      Laraw;
        //    27: ifeq            38
        //    30: aload_1        
        //    31: checkcast       Laraw;
        //    34: astore_1       
        //    35: goto            47
        //    38: new             Larav;
        //    41: dup            
        //    42: aload_2        
        //    43: invokespecial   arav.<init>:(Landroid/os/IBinder;)V
        //    46: astore_1       
        //    47: aload_1        
        //    48: invokeinterface araw.g:()Z
        //    53: istore          5
        //    55: iload           5
        //    57: ifeq            392
        //    60: aload_0        
        //    61: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //    64: aload_1        
        //    65: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fputvrCoreSdkService:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Laraw;)V
        //    68: aload_0        
        //    69: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //    72: astore_1       
        //    73: aload_1        
        //    74: aload_1        
        //    75: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetvrCoreSdkService:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Laraw;
        //    78: invokeinterface araw.a:()Laras;
        //    83: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fputdaydreamManager:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Laras;)V
        //    86: aload_0        
        //    87: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //    90: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetdaydreamManager:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Laras;
        //    93: ifnonnull       112
        //    96: ldc             "VrCoreSdkClient"
        //    98: ldc             "Failed to obtain DaydreamManager from VrCore SDK Service."
        //   100: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   103: pop            
        //   104: aload_0        
        //   105: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   108: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mhandleNoDaydreamManager:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)V
        //   111: return         
        //   112: aload_0        
        //   113: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   116: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetdaydreamManager:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Laras;
        //   119: aload_0        
        //   120: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   123: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetcomponentName:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Landroid/content/ComponentName;
        //   126: aload_0        
        //   127: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   130: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetdaydreamListener:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Lcom/google/vr/ndk/base/VrCoreSdkClient$DaydreamListenerImpl;
        //   133: invokeinterface aras.p:(Landroid/content/ComponentName;Laraq;)V
        //   138: aload_0        
        //   139: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   142: invokevirtual   com/google/vr/ndk/base/VrCoreSdkClient.getHeadTrackingState:()Lcom/google/vr/vrcore/common/api/HeadTrackingState;
        //   145: astore_2       
        //   146: aload_0        
        //   147: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   150: aload_2        
        //   151: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mprepareVr:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Lcom/google/vr/vrcore/common/api/HeadTrackingState;)I
        //   154: istore          6
        //   156: iload           6
        //   158: istore          7
        //   160: iload           6
        //   162: ifne            190
        //   165: aload_0        
        //   166: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   169: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetonDonNotNeededListener:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Ljava/lang/Runnable;
        //   172: ifnull          187
        //   175: aload_0        
        //   176: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   179: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetonDonNotNeededListener:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Ljava/lang/Runnable;
        //   182: invokeinterface java/lang/Runnable.run:()V
        //   187: iconst_0       
        //   188: istore          7
        //   190: iload           7
        //   192: iconst_2       
        //   193: if_icmpne       230
        //   196: ldc             "VrCoreSdkClient"
        //   198: ldc             "Daydream VR preparation failed, closing VR session."
        //   200: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   203: pop            
        //   204: aload_0        
        //   205: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   208: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mhandlePrepareVrFailed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)V
        //   211: aload_0        
        //   212: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   215: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetisResumed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Z
        //   218: ifeq            229
        //   221: aload_0        
        //   222: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   225: aconst_null    
        //   226: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mresumeTracking:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Lcom/google/vr/vrcore/common/api/HeadTrackingState;)V
        //   229: return         
        //   230: aload           4
        //   232: astore_1       
        //   233: iload           7
        //   235: ifne            240
        //   238: aload_2        
        //   239: astore_1       
        //   240: aload_0        
        //   241: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   244: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetisResumed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Z
        //   247: ifeq            312
        //   250: aload_0        
        //   251: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   254: aload_1        
        //   255: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mresumeTracking:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Lcom/google/vr/vrcore/common/api/HeadTrackingState;)V
        //   258: goto            312
        //   261: astore_1       
        //   262: goto            348
        //   265: astore_1       
        //   266: aload_1        
        //   267: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   270: astore_2       
        //   271: new             Ljava/lang/StringBuilder;
        //   274: astore_1       
        //   275: aload_1        
        //   276: ldc             "Error while registering listener with the VrCore SDK Service:"
        //   278: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   281: aload_1        
        //   282: aload_2        
        //   283: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   286: pop            
        //   287: ldc             "VrCoreSdkClient"
        //   289: aload_1        
        //   290: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   293: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   296: pop            
        //   297: aload_0        
        //   298: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   301: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetisResumed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Z
        //   304: ifeq            312
        //   307: aload_3        
        //   308: astore_1       
        //   309: goto            250
        //   312: aload_0        
        //   313: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   316: astore_1       
        //   317: aload_1        
        //   318: aload_1        
        //   319: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetvrCoreSdkService:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Laraw;
        //   322: invokeinterface araw.b:()Larbq;
        //   327: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fputloggingService:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Larbq;)V
        //   330: return         
        //   331: astore_1       
        //   332: ldc             "VrCoreSdkClient"
        //   334: ldc             "Error getting logging service from VrCore:"
        //   336: aload_1        
        //   337: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   340: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   343: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   346: pop            
        //   347: return         
        //   348: aload_0        
        //   349: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   352: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$fgetisResumed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)Z
        //   355: ifeq            366
        //   358: aload_0        
        //   359: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   362: aconst_null    
        //   363: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mresumeTracking:(Lcom/google/vr/ndk/base/VrCoreSdkClient;Lcom/google/vr/vrcore/common/api/HeadTrackingState;)V
        //   366: aload_1        
        //   367: athrow         
        //   368: astore_1       
        //   369: ldc             "VrCoreSdkClient"
        //   371: ldc             "Failed to obtain DaydreamManager from VrCore SDK Service:"
        //   373: aload_1        
        //   374: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   377: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   380: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   383: pop            
        //   384: aload_0        
        //   385: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   388: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mhandleNoDaydreamManager:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)V
        //   391: return         
        //   392: ldc             "VrCoreSdkClient"
        //   394: ldc             "Failed to initialize VrCore SDK Service."
        //   396: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   399: pop            
        //   400: aload_0        
        //   401: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   404: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mhandleBindFailed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)V
        //   407: return         
        //   408: astore_1       
        //   409: ldc             "VrCoreSdkClient"
        //   411: ldc             "Failed to initialize VrCore SDK Service: "
        //   413: aload_1        
        //   414: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   417: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   420: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   423: pop            
        //   424: aload_0        
        //   425: getfield        com/google/vr/ndk/base/VrCoreSdkClient$1.this$0:Lcom/google/vr/ndk/base/VrCoreSdkClient;
        //   428: invokestatic    com/google/vr/ndk/base/VrCoreSdkClient.-$$Nest$mhandleBindFailed:(Lcom/google/vr/ndk/base/VrCoreSdkClient;)V
        //   431: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  47     55     408    432    Landroid/os/RemoteException;
        //  68     111    368    392    Landroid/os/RemoteException;
        //  112    138    368    392    Landroid/os/RemoteException;
        //  138    156    265    312    Landroid/os/RemoteException;
        //  138    156    261    368    Any
        //  165    187    265    312    Landroid/os/RemoteException;
        //  165    187    261    368    Any
        //  196    211    265    312    Landroid/os/RemoteException;
        //  196    211    261    368    Any
        //  266    297    261    368    Any
        //  312    330    331    348    Landroid/os/RemoteException;
        //  392    407    408    432    Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0312:
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
        VrCoreSdkClient.-$$Nest$fputvrCoreSdkService(this.this$0, (araw)null);
        VrCoreSdkClient.-$$Nest$fputdaydreamManager(this.this$0, (aras)null);
        VrCoreSdkClient.-$$Nest$fputloggingService(this.this$0, (arbq)null);
    }
}
