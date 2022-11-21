// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.camera;

import android.content.res.TypedArray;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;
import android.view.View$OnTouchListener;
import javax.microedition.khronos.egl.EGLConfig;
import android.os.Parcelable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import android.opengl.GLES20;
import javax.microedition.khronos.opengles.GL10;
import android.hardware.Camera$AutoFocusCallback;
import android.hardware.Camera$Area;
import java.util.ArrayList;
import android.graphics.Matrix;
import android.hardware.Camera$Size;
import java.util.Iterator;
import android.hardware.Camera$CameraInfo;
import android.opengl.EGLContext;
import android.opengl.EGL14;
import android.media.CamcorderProfile;
import com.google.research.xeno.effect.InputFrameSource;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.List;
import android.hardware.Camera$Parameters;
import android.hardware.Camera;
import java.util.concurrent.Executor;
import android.view.ViewGroup;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.util.AttributeSet;
import java.util.Set;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.Context;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import android.opengl.GLSurfaceView$Renderer;

public class CameraView extends ulp implements GLSurfaceView$Renderer, SurfaceTexture$OnFrameAvailableListener, ulm, qza, ulc, req
{
    public static final int F = 0;
    public uld A;
    public aapu B;
    public oqz C;
    public oqz D;
    public aefs E;
    private boolean G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private final Context N;
    private final ListenableFuture O;
    private int P;
    private oqz Q;
    public boolean a;
    public View b;
    public GLSurfaceView c;
    public rbe d;
    public SurfaceTexture e;
    public int f;
    public boolean g;
    public upn h;
    public volatile rer i;
    public final Object j;
    public uqn k;
    public volatile upp l;
    public qyz m;
    public int n;
    public int o;
    public ulh p;
    public rep q;
    public volatile boolean r;
    public final Object s;
    public final Set t;
    public boolean u;
    public boolean v;
    public req w;
    public boolean x;
    public boolean y;
    public uoe z;
    
    public CameraView(final Context n, AttributeSet obtainStyledAttributes) {
        super(n, obtainStyledAttributes);
        final boolean b = false;
        this.g = false;
        this.j = new Object();
        this.n = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.M = 30;
        this.o = 5000000;
        this.s = new Object();
        this.t = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.u = false;
        this.P = 6;
        this.N = n;
        obtainStyledAttributes = (AttributeSet)n.obtainStyledAttributes(obtainStyledAttributes, ujr.a, 0, 0);
        try {
            final aapu b2 = this.B;
            if (b2 != null) {
                boolean a = b;
                if (((TypedArray)obtainStyledAttributes).getBoolean(0, false)) {
                    a = b;
                    if (((vbs)b2.c).l(45367133L).aM()) {
                        a = true;
                    }
                }
                this.a = a;
            }
            ((TypedArray)obtainStyledAttributes).recycle();
            inflate(n, 2131624119, (ViewGroup)this);
            final aefs e = this.E;
            ListenableFuture e2;
            if (e != null) {
                e2 = afvh.e(((qrk)e.a).a(), (afax)uio.e, (Executor)afwd.a);
            }
            else {
                e2 = null;
            }
            this.O = e2;
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    static final boolean N(final Camera camera, final String s) {
        try {
            final Camera$Parameters parameters = camera.getParameters();
            final List supportedFlashModes = parameters.getSupportedFlashModes();
            return parameters.getFlashMode() != null && supportedFlashModes != null && supportedFlashModes.contains(s);
        }
        catch (final Exception ex) {
            tut.n("Error while getting camera parameters.", (Throwable)ex);
            return false;
        }
    }
    
    public static final Rect O(final RectF rectF) {
        final Rect rect = new Rect();
        rect.left = Math.round(rectF.left);
        rect.top = Math.round(rectF.top);
        rect.right = Math.round(rectF.right);
        rect.bottom = Math.round(rectF.bottom);
        return rect;
    }
    
    public static final RectF P(final Rect rect) {
        return new RectF((float)rect.left, (float)rect.top, (float)rect.right, (float)rect.bottom);
    }
    
    private static Rect U(final float n, final float n2, final float n3, int n4, int n5) {
        final int n6 = Math.round(n3 * 200.0f) / 2;
        final double n7 = n2 / n5 * 2000.0f;
        Double.isNaN(n7);
        n5 = (int)(n7 - 1000.0);
        final double n8 = n / n4 * 2000.0f;
        Double.isNaN(n8);
        n4 = (int)(n8 - 1000.0);
        return new Rect(afxr.C(n4 - n6, -1000, 1000), afxr.C(n5 - n6, -1000, 1000), afxr.C(n4 + n6, -1000, 1000), afxr.C(n5 + n6, -1000, 1000));
    }
    
    private final void V(final String s) {
        qkx.l(s, (rbd)ab(this.z));
    }
    
    private final void W() {
        final aefs e = this.E;
        boolean b;
        if (this.H == this.I) {
            b = false;
        }
        else {
            b = true;
        }
        tfx.m(((qrk)e.a).b((afax)new fqv((int)(b ? 1 : 0), 9), (Executor)afwd.a), (tfv)rmm.t);
    }
    
    private final void X() {
        if (!this.a) {
            this.l.getClass();
        }
        final CamcorderProfile f = this.f(true);
        int videoFrameHeight = 0;
        int videoFrameWidth;
        if (f == null) {
            videoFrameWidth = 0;
        }
        else {
            videoFrameWidth = f.videoFrameWidth;
        }
        if (f != null) {
            videoFrameHeight = f.videoFrameHeight;
        }
        final int n = (this.A.e + 90) % 180;
        int j;
        if (n == 0) {
            j = videoFrameWidth;
        }
        else {
            j = videoFrameHeight;
        }
        if (n == 0) {
            videoFrameWidth = videoFrameHeight;
        }
        if (this.a) {
            final qyz m = this.m;
            m.getClass();
            InputFrameSource inputFrameSource;
            if (this.H == this.I) {
                inputFrameSource = InputFrameSource.a;
            }
            else {
                inputFrameSource = InputFrameSource.b;
            }
            final uow d = ((ulu)m).d;
            if (d != null) {
                final uov a = d.a;
                a.getClass();
                a.sendMessage(a.obtainMessage(11, (Object)inputFrameSource));
            }
            final ulu ulu = (ulu)this.m;
            ulu.i = videoFrameWidth;
            ulu.j = j;
            final agvh e = ulu.e;
            if (e != null) {
                e.a(videoFrameWidth, j);
            }
            final uow d2 = ulu.d;
            if (d2 != null) {
                final uov a2 = d2.a;
                a2.getClass();
                a2.sendMessage(a2.obtainMessage(9, videoFrameWidth, j));
                final uov a3 = ulu.d.a;
                a3.getClass();
                a3.sendEmptyMessage(1);
            }
        }
        else if (this.l != null && this.e != null) {
            this.l.e(this.e, videoFrameWidth, j);
        }
    }
    
    private final void Y() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.P:I
        //     4: aload_0        
        //     5: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.H:I
        //     8: invokestatic    uky.c:(II)Landroid/media/CamcorderProfile;
        //    11: astore          9
        //    13: aload           9
        //    15: ifnonnull       25
        //    18: ldc_w           "Failed to determine camera profile."
        //    21: invokestatic    tut.b:(Ljava/lang/String;)V
        //    24: return         
        //    25: aload_0        
        //    26: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.A:Luld;
        //    29: astore          8
        //    31: aload_0        
        //    32: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.H:I
        //    35: istore_1       
        //    36: aload           9
        //    38: getfield        android/media/CamcorderProfile.videoFrameWidth:I
        //    41: istore_3       
        //    42: aload           9
        //    44: getfield        android/media/CamcorderProfile.videoFrameHeight:I
        //    47: istore          4
        //    49: aload           9
        //    51: getfield        android/media/CamcorderProfile.videoFrameRate:I
        //    54: aload_0        
        //    55: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.M:I
        //    58: invokestatic    java/lang/Math.min:(II)I
        //    61: istore_2       
        //    62: aload           8
        //    64: getfield        uld.k:Ljava/lang/Object;
        //    67: astore          9
        //    69: aload           9
        //    71: monitorenter   
        //    72: aload           8
        //    74: getfield        uld.i:I
        //    77: istore          5
        //    79: iload           5
        //    81: iconst_3       
        //    82: if_icmpne       96
        //    85: aload           8
        //    87: getfield        uld.k:Ljava/lang/Object;
        //    90: invokevirtual   java/lang/Object.wait:()V
        //    93: goto            72
        //    96: iload           5
        //    98: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   101: astore          10
        //   103: aload           8
        //   105: getfield        uld.i:I
        //   108: istore          5
        //   110: iconst_1       
        //   111: istore          7
        //   113: iload           5
        //   115: ifne            124
        //   118: iconst_1       
        //   119: istore          6
        //   121: goto            127
        //   124: iconst_0       
        //   125: istore          6
        //   127: iload           6
        //   129: ldc_w           "Camera not stopped. State: %s"
        //   132: aload           10
        //   134: invokestatic    adme.W:(ZLjava/lang/String;Ljava/lang/Object;)V
        //   137: aload           8
        //   139: iconst_1       
        //   140: invokevirtual   uld.f:(I)V
        //   143: aload           9
        //   145: monitorexit    
        //   146: aload           8
        //   148: getfield        uld.b:Landroid/hardware/Camera;
        //   151: ifnonnull       160
        //   154: iconst_1       
        //   155: istore          6
        //   157: goto            163
        //   160: iconst_0       
        //   161: istore          6
        //   163: iload           6
        //   165: ldc_w           "Camera already exists."
        //   168: invokestatic    adme.U:(ZLjava/lang/Object;)V
        //   171: aload           8
        //   173: getfield        uld.h:Landroid/os/AsyncTask;
        //   176: ifnonnull       186
        //   179: iload           7
        //   181: istore          6
        //   183: goto            189
        //   186: iconst_0       
        //   187: istore          6
        //   189: iload           6
        //   191: ldc_w           "Camera task already exists."
        //   194: invokestatic    adme.U:(ZLjava/lang/Object;)V
        //   197: aload           8
        //   199: iload_1        
        //   200: putfield        uld.g:I
        //   203: aload           8
        //   205: new             Lulb;
        //   208: dup            
        //   209: aload           8
        //   211: iload_1        
        //   212: iload_3        
        //   213: iload           4
        //   215: iload_2        
        //   216: invokespecial   ulb.<init>:(Luld;IIII)V
        //   219: putfield        uld.h:Landroid/os/AsyncTask;
        //   222: aload           8
        //   224: getfield        uld.h:Landroid/os/AsyncTask;
        //   227: iconst_0       
        //   228: anewarray       Ljava/lang/Void;
        //   231: invokevirtual   android/os/AsyncTask.execute:([Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   234: pop            
        //   235: return         
        //   236: astore          8
        //   238: aload           9
        //   240: monitorexit    
        //   241: goto            247
        //   244: aload           8
        //   246: athrow         
        //   247: goto            244
        //   250: astore          10
        //   252: goto            72
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  72     79     236    250    Any
        //  85     93     250    255    Ljava/lang/InterruptedException;
        //  85     93     236    250    Any
        //  96     110    236    250    Any
        //  127    146    236    250    Any
        //  238    241    236    250    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
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
    
    private final void Z() {
        final rer i = this.i;
        if (i != null && i.t) {
            this.B();
        }
        if (i != null) {
            i.a = EGL14.EGL_NO_CONTEXT;
            synchronized (i) {
                if (i.t) {
                    i.w = 1;
                    i.m();
                    i.q(6);
                }
                else if (i.d > 0) {
                    i.q(6);
                }
                monitorexit(i);
                final ren a = i.A;
                if (a != null) {
                    a.d();
                    i.A.b();
                    i.A = null;
                }
                this.i = null;
            }
        }
    }
    
    private final reo aa(final EGLContext eglContext) {
        int orientation;
        if (this.I >= 0) {
            final Camera$CameraInfo camera$CameraInfo = new Camera$CameraInfo();
            Camera.getCameraInfo(this.I, camera$CameraInfo);
            orientation = camera$CameraInfo.orientation;
        }
        else {
            orientation = -1;
        }
        int orientation2;
        if (this.J >= 0) {
            final Camera$CameraInfo camera$CameraInfo2 = new Camera$CameraInfo();
            Camera.getCameraInfo(this.J, camera$CameraInfo2);
            orientation2 = camera$CameraInfo2.orientation;
        }
        else {
            orientation2 = -1;
        }
        final CamcorderProfile f = this.f(true);
        int audioChannels;
        if (f != null) {
            audioChannels = f.audioChannels;
        }
        else {
            tut.b("Couldn't find camcorder profile to prepare audio. Falling back to mono.");
            audioChannels = 1;
        }
        if (eglContext == null) {
            throw new NullPointerException("Null sharedEglContext");
        }
        final rbk a = rbk.a;
        final boolean u = this.u;
        final int o = this.o;
        final Context n = this.N;
        if (n != null) {
            return new reo(eglContext, a, u, orientation, orientation2, o, audioChannels, n, this.v, (rbd)ab(this.z), this.a, new vxu(znf.x, "[ShortsCreation][Android][CameraRecorder]"), new vxu(znf.f), (byte[])null, (byte[])null);
        }
        throw new NullPointerException("Null context");
    }
    
    private static final uoe ab(final uoe uoe) {
        if (uoe != null) {
            return uoe;
        }
        return uoe.a;
    }
    
    public static int d(final float n, final int n2, final int n3) {
        return Math.min(n2, Math.max(0, (int)(n2 * n) + n3));
    }
    
    public static void l(final Throwable t) {
        tut.d("Error calling setCameraFacing() in ProtoDataStore", t);
    }
    
    public final void A() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0        
        //     4: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.a:Z
        //     7: ifeq            159
        //    10: aload_0        
        //    11: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.s:Ljava/lang/Object;
        //    14: astore_3       
        //    15: aload_3        
        //    16: monitorenter   
        //    17: aload_0        
        //    18: iconst_1       
        //    19: putfield        com/google/android/libraries/youtube/edit/camera/CameraView.r:Z
        //    22: aload_3        
        //    23: monitorexit    
        //    24: aload_0        
        //    25: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.A:Luld;
        //    28: invokevirtual   uld.c:()V
        //    31: aload_0        
        //    32: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.A:Luld;
        //    35: invokevirtual   uld.a:()Landroid/hardware/Camera;
        //    38: pop            
        //    39: aload_0        
        //    40: invokespecial   com/google/android/libraries/youtube/edit/camera/CameraView.Z:()V
        //    43: aload_0        
        //    44: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.A:Luld;
        //    47: invokevirtual   uld.d:()V
        //    50: aload_0        
        //    51: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.A:Luld;
        //    54: aconst_null    
        //    55: invokevirtual   uld.b:(Landroid/graphics/SurfaceTexture;)V
        //    58: aload_0        
        //    59: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.m:Lqyz;
        //    62: astore_2       
        //    63: aload_2        
        //    64: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    67: pop            
        //    68: aload_2        
        //    69: checkcast       Lulu;
        //    72: astore_2       
        //    73: aload_2        
        //    74: getfield        ulu.d:Luow;
        //    77: astore_3       
        //    78: aload_3        
        //    79: ifnull          91
        //    82: aload_2        
        //    83: iconst_0       
        //    84: putfield        ulu.k:Z
        //    87: aload_3        
        //    88: invokevirtual   uow.e:()V
        //    91: aload_2        
        //    92: getfield        ulu.h:Lqyy;
        //    95: astore_3       
        //    96: aload_3        
        //    97: ifnull          114
        //   100: aload_3        
        //   101: invokeinterface qyy.d:()V
        //   106: aload_2        
        //   107: getfield        ulu.c:Ljava/util/concurrent/atomic/AtomicBoolean;
        //   110: iconst_0       
        //   111: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.set:(Z)V
        //   114: aload_0        
        //   115: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.s:Ljava/lang/Object;
        //   118: astore_2       
        //   119: aload_2        
        //   120: monitorenter   
        //   121: aload_0        
        //   122: iconst_0       
        //   123: putfield        com/google/android/libraries/youtube/edit/camera/CameraView.r:Z
        //   126: aload_0        
        //   127: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.s:Ljava/lang/Object;
        //   130: invokevirtual   java/lang/Object.notifyAll:()V
        //   133: aload_2        
        //   134: monitorexit    
        //   135: aload_0        
        //   136: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.c:Landroid/opengl/GLSurfaceView;
        //   139: astore_2       
        //   140: aload_2        
        //   141: ifnull          148
        //   144: aload_2        
        //   145: invokevirtual   android/opengl/GLSurfaceView.onPause:()V
        //   148: return         
        //   149: astore_3       
        //   150: aload_2        
        //   151: monitorexit    
        //   152: aload_3        
        //   153: athrow         
        //   154: astore_2       
        //   155: aload_3        
        //   156: monitorexit    
        //   157: aload_2        
        //   158: athrow         
        //   159: aload_0        
        //   160: invokespecial   com/google/android/libraries/youtube/edit/camera/CameraView.Z:()V
        //   163: aload_0        
        //   164: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.s:Ljava/lang/Object;
        //   167: astore_3       
        //   168: aload_3        
        //   169: monitorenter   
        //   170: aload_0        
        //   171: iconst_1       
        //   172: putfield        com/google/android/libraries/youtube/edit/camera/CameraView.r:Z
        //   175: aload_3        
        //   176: monitorexit    
        //   177: aload_0        
        //   178: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.A:Luld;
        //   181: invokevirtual   uld.c:()V
        //   184: aload_0        
        //   185: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.A:Luld;
        //   188: invokevirtual   uld.a:()Landroid/hardware/Camera;
        //   191: pop            
        //   192: new             Lukz;
        //   195: dup            
        //   196: aload_0        
        //   197: aload_0        
        //   198: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.l:Lupp;
        //   201: iconst_3       
        //   202: invokespecial   ukz.<init>:(Lcom/google/android/libraries/youtube/edit/camera/CameraView;Lupp;I)V
        //   205: astore_2       
        //   206: aload_0        
        //   207: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.c:Landroid/opengl/GLSurfaceView;
        //   210: astore_3       
        //   211: aload_3        
        //   212: ifnull          220
        //   215: aload_3        
        //   216: aload_2        
        //   217: invokevirtual   android/opengl/GLSurfaceView.queueEvent:(Ljava/lang/Runnable;)V
        //   220: iconst_1       
        //   221: newarray        Z
        //   223: astore_2       
        //   224: aload_0        
        //   225: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.c:Landroid/opengl/GLSurfaceView;
        //   228: astore_3       
        //   229: aload_3        
        //   230: ifnull          254
        //   233: aload_3        
        //   234: invokevirtual   android/opengl/GLSurfaceView.onPause:()V
        //   237: aload_0        
        //   238: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.c:Landroid/opengl/GLSurfaceView;
        //   241: new             Luhs;
        //   244: dup            
        //   245: aload_2        
        //   246: bipush          9
        //   248: invokespecial   uhs.<init>:([ZI)V
        //   251: invokevirtual   android/opengl/GLSurfaceView.queueEvent:(Ljava/lang/Runnable;)V
        //   254: aload_2        
        //   255: monitorenter   
        //   256: iconst_0       
        //   257: istore_1       
        //   258: iload_1        
        //   259: iconst_5       
        //   260: if_icmpge       317
        //   263: aload_2        
        //   264: iconst_0       
        //   265: baload         
        //   266: ifeq            272
        //   269: goto            317
        //   272: aload_2        
        //   273: iconst_5       
        //   274: newarray        I
        //   276: dup            
        //   277: iconst_0       
        //   278: bipush          100
        //   280: iastore        
        //   281: dup            
        //   282: iconst_1       
        //   283: sipush          250
        //   286: iastore        
        //   287: dup            
        //   288: iconst_2       
        //   289: sipush          500
        //   292: iastore        
        //   293: dup            
        //   294: iconst_3       
        //   295: sipush          1000
        //   298: iastore        
        //   299: dup            
        //   300: iconst_4       
        //   301: sipush          3000
        //   304: iastore        
        //   305: iload_1        
        //   306: iaload         
        //   307: i2l            
        //   308: invokevirtual   java/lang/Object.wait:(J)V
        //   311: iinc            1, 1
        //   314: goto            258
        //   317: aload_2        
        //   318: monitorexit    
        //   319: return         
        //   320: astore_3       
        //   321: aload_2        
        //   322: monitorexit    
        //   323: aload_3        
        //   324: athrow         
        //   325: astore_2       
        //   326: aload_3        
        //   327: monitorexit    
        //   328: goto            333
        //   331: aload_2        
        //   332: athrow         
        //   333: goto            331
        //   336: astore_3       
        //   337: goto            311
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  17     24     154    159    Any
        //  121    135    149    154    Any
        //  150    152    149    154    Any
        //  155    157    154    159    Any
        //  170    177    325    336    Any
        //  272    311    336    340    Ljava/lang/InterruptedException;
        //  272    311    320    325    Any
        //  317    319    320    325    Any
        //  321    323    320    325    Any
        //  326    328    325    336    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0272:
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
    
    public final void B() {
        this.C(0);
    }
    
    public final void C(final int n) {
        final rer i = this.i;
        if (this.I() && i != null) {
            i.k(n);
            final Iterator iterator = this.t.iterator();
            while (iterator.hasNext()) {
                ((ulk)iterator.next()).nD();
            }
            return;
        }
        tut.l("stopRecord called but camera is not recording.");
    }
    
    public final void D(int h) {
        int n = h;
        if (h != 1) {
            n = 0;
        }
        adme.N(true, "cameraDirection must be one of @CameraDirection values; was %s.", n);
        if (!this.J()) {
            return;
        }
        if ((n != 0 || this.H != this.I) && (n != 1 || this.H != this.J)) {
            this.A.d();
            if (this.A.g == (h = this.I)) {
                h = this.J;
            }
            this.H = h;
            this.W();
            this.Y();
            final oqz q = this.Q;
            if (q != null) {
                ((gwq)q.a).a(n);
            }
        }
    }
    
    public final void E() {
        if (this.l != null) {
            this.l.h();
            this.l.i();
            this.l = null;
        }
    }
    
    public final boolean F() {
        return this.g;
    }
    
    public final boolean G() {
        final Camera a = this.A.a();
        return a != null && (N(a, "torch") || this.H == this.J);
    }
    
    public final boolean H() {
        final rer i = this.i;
        return i != null && !i.t;
    }
    
    public final boolean I() {
        final rer i = this.i;
        return i != null && i.t;
    }
    
    public final boolean J() {
        final rer i = this.i;
        final int j = this.I;
        boolean b = false;
        if (j >= 0) {
            b = b;
            if (this.J >= 0) {
                if (i != null && i.t) {
                    return false;
                }
                b = true;
            }
        }
        return b;
    }
    
    public final boolean K(final Camera camera, final String flashMode) {
        if (camera != null && (N(camera, flashMode) || this.H != this.I)) {
            if (!N(camera, flashMode) && this.H == this.J) {
                return "torch".equals(flashMode) || "off".equals(flashMode);
            }
            try {
                final Camera$Parameters parameters = camera.getParameters();
                parameters.setFlashMode(flashMode);
                camera.setParameters(parameters);
                return true;
            }
            catch (final Exception ex) {
                tut.n("Error while setting camera flash light mode", (Throwable)ex);
            }
        }
        return false;
    }
    
    public final boolean L(final boolean b) {
        if (b == this.g) {
            return true;
        }
        if (b) {
            if (this.K(this.A.a(), "torch")) {
                return this.g = true;
            }
        }
        else if (this.K(this.A.a(), "off")) {
            this.g = false;
            return true;
        }
        return false;
    }
    
    public final boolean M() {
        if (this.A.a() == null) {
            return false;
        }
        final Camera$CameraInfo camera$CameraInfo = new Camera$CameraInfo();
        Camera.getCameraInfo(this.H, camera$CameraInfo);
        return !camera$CameraInfo.canDisableShutterSound;
    }
    
    public final void Q() {
        this.G = true;
    }
    
    public final void R(final oqz q) {
        this.Q = q;
    }
    
    public final void a(final SurfaceTexture surfaceTexture, final int n) {
        this.A.b(surfaceTexture);
    }
    
    public final void b() {
        this.post((Runnable)new uhs(this, 8));
    }
    
    public final void c(final Camera camera) {
        if (this.l != null || this.a) {
            this.X();
        }
        this.post((Runnable)new ukz(this, camera, 2));
    }
    
    public final int e() {
        if (this.H == this.J) {
            return 1;
        }
        return 0;
    }
    
    public final CamcorderProfile f(final boolean b) {
        if (b) {
            return uky.d(this.P, this.I, this.J);
        }
        return uky.c(this.P, this.H);
    }
    
    public final ull g() {
        final Camera a = this.A.a();
        if (a == null) {
            return null;
        }
        final Camera$Size previewSize = a.getParameters().getPreviewSize();
        final ull ull = new ull();
        ull.b = previewSize.height;
        ull.a = previewSize.width;
        return ull;
    }
    
    public final void h(final ulk ulk) {
        this.t.add(ulk);
    }
    
    public final void i(float n) {
        final Camera a = this.A.a();
        if (a == null) {
            return;
        }
        final Camera$Parameters h = this.A.h(a);
        if (h == null) {
            return;
        }
        if (h.isZoomSupported()) {
            final float n2 = -1.0f;
            --n;
            if (Math.abs(n) >= 0.001f) {
                final int zoom = h.getZoom();
                final int maxZoom = h.getMaxZoom();
                final float n3 = n * maxZoom;
                if (Math.abs(n3) < 1.0f) {
                    n = n2;
                    if (n3 > 0.0f) {
                        n = 1.0f;
                    }
                }
                else {
                    n = n3;
                }
                this.u(a, h, Math.max(0, Math.min(maxZoom, Math.round(zoom + n))), maxZoom, true);
            }
        }
    }
    
    public final void j(final float n, final float n2, final uli uli) {
        this.k(n, n2, (int)n, (int)n2, uli);
    }
    
    public final void k(final float n, final float n2, final int n3, final int n4, final uli uli) {
        final Camera a = this.A.a();
        if (a == null) {
            return;
        }
        try {
            final Camera$Parameters parameters = a.getParameters();
            final String focusMode = parameters.getFocusMode();
            final int e = this.A.e;
            final Matrix matrix = new Matrix();
            float n5;
            if (this.H == this.J) {
                n5 = -1.0f;
            }
            else {
                n5 = 1.0f;
            }
            matrix.setScale(1.0f, n5);
            matrix.postRotate((float)(360 - e));
            try {
                a.cancelAutoFocus();
                if (parameters.getMaxNumFocusAreas() > 0) {
                    final ArrayList focusAreas = new ArrayList();
                    final GLSurfaceView c = this.c;
                    if (c != null) {
                        final RectF p5 = P(U(n, n2, 1.0f, c.getWidth(), this.c.getHeight()));
                        matrix.mapRect(p5);
                        focusAreas.add(new Camera$Area(O(p5), 800));
                    }
                    parameters.setFocusAreas((List)focusAreas);
                }
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    final ArrayList meteringAreas = new ArrayList();
                    final GLSurfaceView c2 = this.c;
                    if (c2 != null) {
                        final RectF p6 = P(U(n, n2, 1.5f, c2.getWidth(), this.c.getHeight()));
                        matrix.mapRect(p6);
                        meteringAreas.add(new Camera$Area(O(p6), 800));
                    }
                    parameters.setMeteringAreas((List)meteringAreas);
                }
                final int n6 = 0;
                int n7;
                if (parameters == null) {
                    n7 = n6;
                }
                else {
                    final List supportedFocusModes = parameters.getSupportedFocusModes();
                    n7 = n6;
                    if (supportedFocusModes != null) {
                        n7 = n6;
                        if (supportedFocusModes.contains("auto")) {
                            n7 = 1;
                        }
                    }
                }
                if (n7 != 0) {
                    parameters.setFocusMode("auto");
                }
                a.setParameters(parameters);
                if ((parameters.getMaxNumFocusAreas() > 0 || parameters.getMaxNumMeteringAreas() > 0) && uli != null) {
                    uli.a(n3, n4);
                }
                if (n7 != 0) {
                    a.autoFocus((Camera$AutoFocusCallback)new ulg(focusMode));
                }
            }
            catch (final RuntimeException ex) {
                tut.b("error setting camera parameters");
            }
        }
        catch (final RuntimeException ex2) {}
    }
    
    public final void m() {
        final Camera a = this.A.a();
        if (a == null) {
            return;
        }
        if (this.g && this.H == this.J && !N(a, "torch")) {
            final View b = this.b;
            if (b != null) {
                b.setVisibility(0);
            }
            final Iterator iterator = this.t.iterator();
            while (iterator.hasNext()) {
                ((ulk)iterator.next()).g();
            }
        }
    }
    
    public final void n(final ulk ulk) {
        this.t.remove(ulk);
    }
    
    public final void o(final float n) {
        this.p(n, false);
    }
    
    public final void onDrawFrame(GL10 i) {
        i = (GL10)this.i;
        if (i != null && ((rer)i).t) {
            synchronized (((rer)i).c) {
                while (((rer)i).D) {
                    try {
                        ((rer)i).c.wait();
                    }
                    catch (final InterruptedException ex) {
                        rbf.b("TextureLock waiting interrupted.");
                    }
                }
            }
        }
        final SurfaceTexture e = this.e;
        if (e == null) {
            return;
        }
        e.updateTexImage();
        if (i != null && ((rer)i).t) {
            final int f = this.f;
            synchronized (i) {
                if (((rer)i).t() && e.getTimestamp() > 0L) {
                    ((rer)i).D = true;
                    ++((rer)i).u;
                    final Handler b = ((rer)i).B;
                    b.getClass();
                    b.post((Runnable)new nyv((rer)i, e, f, 3));
                    monitorexit(i);
                }
                else {
                    monitorexit(i);
                }
                ++this.K;
            }
        }
        i = (GL10)(Object)new float[16];
        e.getTransformMatrix((float[])(Object)i);
        final float[] array = new float[16];
        android.opengl.Matrix.setIdentityM(array, 0);
        try {
            final rbe d = this.d;
            if (d != null) {
                d.a(this.f, array, (float[])(Object)i);
            }
        }
        catch (final RuntimeException ex2) {
            tut.d("Error render texture ", (Throwable)ex2);
        }
        if (this.p == null) {
            return;
        }
        final int f2 = this.f;
        Object bitmap = new int[4];
        GLES20.glGetIntegerv(2978, (int[])bitmap, 0);
        final Camera$Size previewSize = this.A.a().getParameters().getPreviewSize();
        final int height = previewSize.height;
        final int width = previewSize.width;
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(height * width * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        final int[] array2 = { 0 };
        final int[] array3 = { 0 };
        try {
            this.V("glGenFramebuffers");
            GLES20.glGenTextures(1, array3, 0);
            final int n = array3[0];
            GLES20.glActiveTexture(33984);
            this.V("glActiveTexture");
            GLES20.glBindTexture(3553, n);
            this.V("glBindTexture");
            try {
                GLES20.glTexImage2D(3553, 0, 6408, height, width, 0, 6408, 5121, (Buffer)null);
                this.V("glTexImage2D");
                try {
                    GLES20.glGenFramebuffers(1, array2, 0);
                    GLES20.glBindFramebuffer(36160, array2[0]);
                    this.V("glBindFramebuffer");
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, n, 0);
                    this.V("glFramebufferTexture2D");
                    final int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
                    if (glCheckFramebufferStatus == 36053) {
                        GLES20.glViewport(0, 0, height, width);
                        final rbe d2 = this.d;
                        if (d2 != null) {
                            d2.a(f2, array, (float[])(Object)i);
                        }
                        try {
                            GLES20.glReadPixels(0, 0, height, width, 6408, 5121, (Buffer)allocateDirect);
                            this.V("glReadPixels");
                            final uoe ab = ab(this.z);
                            GLES20.glBindFramebuffer(36160, 0);
                            qkx.m("glBindFramebuffer", (rbd)ab);
                            GLES20.glDeleteFramebuffers(1, array2, 0);
                            qkx.m("glDeleteFramebuffers", (rbd)ab);
                            GLES20.glBindTexture(3553, 0);
                            qkx.m("glBindTexture", (rbd)ab);
                            GLES20.glDeleteTextures(1, array3, 0);
                            qkx.m("glDeleteTextures", (rbd)ab);
                            GLES20.glViewport(bitmap[0], bitmap[1], bitmap[2], bitmap[3]);
                            final Bitmap bitmap2 = Bitmap.createBitmap(height, width, Bitmap$Config.ARGB_8888);
                            bitmap2.copyPixelsFromBuffer((Buffer)allocateDirect);
                            bitmap = new Matrix();
                            ((Matrix)bitmap).postScale(1.0f, -1.0f);
                            bitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), (Matrix)bitmap, true);
                            final ulh p = this.p;
                            this.p = null;
                            this.post((Runnable)new ulf(this, p, (Bitmap)bitmap, 0));
                            return;
                        }
                        finally {}
                    }
                    try {
                        final int glGetError = GLES20.glGetError();
                        ab(this.z).b(glGetError);
                        final String string = this.toString();
                        final StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(": Failed to set up render buffer with status ");
                        sb.append(glCheckFramebufferStatus);
                        sb.append(" and error ");
                        sb.append(glGetError);
                        throw new RuntimeException(sb.toString());
                    }
                    finally {}
                }
                finally {}
            }
            finally {}
        }
        finally {}
        final uoe ab2 = ab(this.z);
        GLES20.glBindFramebuffer(36160, 0);
        qkx.m("glBindFramebuffer", (rbd)ab2);
        GLES20.glDeleteFramebuffers(1, array2, 0);
        qkx.m("glDeleteFramebuffers", (rbd)ab2);
        GLES20.glBindTexture(3553, 0);
        qkx.m("glBindTexture", (rbd)ab2);
        GLES20.glDeleteTextures(1, array3, 0);
        qkx.m("glDeleteTextures", (rbd)ab2);
        GLES20.glViewport(bitmap[0], bitmap[1], bitmap[2], bitmap[3]);
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        final int[] g = uld.g();
        adme.T(g[0] >= 0 || g[1] >= 0);
        final int i = g[0];
        this.I = i;
        final int n = g[1];
        this.J = n;
        this.H = n;
        if (i >= 0) {
            final ListenableFuture o = this.O;
            if (o != null && (int)tfx.g((Future)o, 500L, TimeUnit.MILLISECONDS, (Object)this.J) == 0) {
                this.H = this.I;
            }
        }
        this.A.j = (ulc)this;
        final GLSurfaceView c = (GLSurfaceView)this.findViewById(2131427984);
        this.c = c;
        if (!this.a) {
            c.setEGLContextClientVersion(2);
            this.c.setRenderer((GLSurfaceView$Renderer)this);
            this.c.setRenderMode(0);
        }
        this.b = this.findViewById(2131427976);
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        final GLSurfaceView c = this.c;
        if (c != null) {
            c.requestRender();
        }
        final rer i = this.i;
        if (i != null && i.t) {
            ++this.L;
        }
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof CameraView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final CameraView$SavedState cameraView$SavedState = (CameraView$SavedState)parcelable;
        super.onRestoreInstanceState(cameraView$SavedState.getSuperState());
        this.g = cameraView$SavedState.a;
        this.M = cameraView$SavedState.b;
        this.o = cameraView$SavedState.c;
    }
    
    protected final Parcelable onSaveInstanceState() {
        final Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        final CameraView$SavedState cameraView$SavedState = new CameraView$SavedState(onSaveInstanceState);
        cameraView$SavedState.a = this.g;
        cameraView$SavedState.b = this.M;
        cameraView$SavedState.c = this.o;
        return (Parcelable)cameraView$SavedState;
    }
    
    public final void onSurfaceChanged(final GL10 gl10, final int n, final int n2) {
        GLES20.glViewport(0, 0, n, n2);
    }
    
    public final void onSurfaceCreated(final GL10 gl10, final EGLConfig eglConfig) {
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        this.V("Couldn't generate textures.");
        GLES20.glBindTexture(36197, array[0]);
        this.V("Couldn't bind texture.");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        this.V("Couldn't set texture parameters.");
        final int f = array[0];
        this.f = f;
        (this.e = new SurfaceTexture(f)).setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)this);
        this.d = new rbe((rbd)ab(this.z));
        final reo aa = this.aa(EGL14.eglGetCurrentContext());
        final rer i = new rer(aa);
        i.g(aa);
        this.i = i;
        if (this.G) {
            if (!this.y) {
                this.E();
            }
            synchronized (this.j) {
                if (this.y) {
                    this.E();
                }
                (this.l = this.h.b((qza)this, EGL14.eglGetCurrentContext(), uoe.a, 2)).H();
                if (this.k != null) {
                    this.l.y(this.k);
                }
                this.l.h.G = (boolean)((vbs)this.B.c).l(45360670L).aM();
                this.l.j();
                monitorexit(this.j);
                try {
                    if (this.A.a() != null) {
                        this.X();
                    }
                    return;
                }
                catch (final RuntimeException var_1_B7) {
                    tut.l("Error getting camera from the cameraManager");
                    return;
                }
            }
        }
        final SurfaceTexture e = this.e;
        if (e != null) {
            this.A.b(e);
        }
    }
    
    public final void p(final float n, final boolean b) {
        final Camera a = this.A.a();
        if (a == null) {
            return;
        }
        final Camera$Parameters h = this.A.h(a);
        if (h == null) {
            return;
        }
        if (!h.isZoomSupported()) {
            return;
        }
        final int maxZoom = h.getMaxZoom();
        this.u(a, h, d(n, maxZoom, 0), maxZoom, b);
    }
    
    public final void q(final int d) {
        final uld a = this.A;
        synchronized (a.l) {
            a.d = d;
            a.e();
        }
    }
    
    public final void r(final boolean b) {
        if (this.l != null) {
            this.l.x(b);
        }
        final uqn k = this.k;
        if (k != null) {
            k.k(b);
        }
        if (this.a) {
            final qyz m = this.m;
            m.getClass();
            final uqn g = ((ulu)m).g;
            if (g != null) {
                g.k(b);
            }
        }
    }
    
    public final void s(final int n, final int n2) {
        final GLSurfaceView c = this.c;
        if (c != null) {
            tqf.aH((View)c, n, n2);
        }
        final View b = this.b;
        if (b != null) {
            tqf.aH(b, n, n2);
        }
    }
    
    public final void setOnTouchListener(final View$OnTouchListener onTouchListener) {
        final GLSurfaceView c = this.c;
        if (c != null) {
            c.setOnTouchListener(onTouchListener);
        }
    }
    
    public final void t(final int p) {
        adme.T(this.A.a() == null);
        this.P = p;
    }
    
    public final void u(final Camera camera, final Camera$Parameters parameters, final int zoom, final int n, final boolean b) {
        parameters.setZoom(zoom);
        try {
            camera.setParameters(parameters);
            final oqz c = this.C;
            if (c != null) {
                final float n2 = zoom / (float)n;
                final ShortsZoomSlider ao = ((gxg)c.a).ao;
                if (ao != null) {
                    if (b && n2 > 0.0f) {
                        ao.setVisibility(0);
                        ao.e();
                    }
                    ((gxg)c.a).ao.c(n2, b ^ true);
                }
            }
        }
        catch (final Exception ex) {
            tut.n("Error while setting camera parameters.", (Throwable)ex);
        }
    }
    
    public final void v() {
        this.x(this.e());
    }
    
    public final void w(final qzb qzb, final int n) {
        this.post((Runnable)new nyv(this, qzb, n, 7));
    }
    
    public final void x(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: iload_1        
        //     4: istore_2       
        //     5: iload_1        
        //     6: iconst_1       
        //     7: if_icmpeq       12
        //    10: iconst_0       
        //    11: istore_2       
        //    12: iconst_1       
        //    13: ldc_w           "cameraDirection must be one of @CameraDirection values; was %s."
        //    16: iload_2        
        //    17: invokestatic    adme.N:(ZLjava/lang/String;I)V
        //    20: aload_0        
        //    21: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.s:Ljava/lang/Object;
        //    24: astore          4
        //    26: aload           4
        //    28: monitorenter   
        //    29: aload_0        
        //    30: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.r:Z
        //    33: istore_3       
        //    34: iload_3        
        //    35: ifeq            48
        //    38: aload_0        
        //    39: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.s:Ljava/lang/Object;
        //    42: invokevirtual   java/lang/Object.wait:()V
        //    45: goto            29
        //    48: aload           4
        //    50: monitorexit    
        //    51: iload_2        
        //    52: iconst_1       
        //    53: if_icmpne       64
        //    56: aload_0        
        //    57: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.J:I
        //    60: istore_1       
        //    61: goto            69
        //    64: aload_0        
        //    65: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.I:I
        //    68: istore_1       
        //    69: aload_0        
        //    70: iload_1        
        //    71: putfield        com/google/android/libraries/youtube/edit/camera/CameraView.H:I
        //    74: aload_0        
        //    75: invokespecial   com/google/android/libraries/youtube/edit/camera/CameraView.W:()V
        //    78: aload_0        
        //    79: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.a:Z
        //    82: ifeq            502
        //    85: aload_0        
        //    86: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.m:Lqyz;
        //    89: astore          4
        //    91: aload           4
        //    93: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    96: pop            
        //    97: aload           4
        //    99: checkcast       Lulu;
        //   102: astore          4
        //   104: aload           4
        //   106: getfield        ulu.k:Z
        //   109: ifeq            115
        //   112: goto            264
        //   115: new             Luow;
        //   118: dup            
        //   119: aload           4
        //   121: getfield        ulu.a:Lagvp;
        //   124: getfield        agvp.a:Ljavax/microedition/khronos/egl/EGLContext;
        //   127: aload_0        
        //   128: aload           4
        //   130: getfield        ulu.b:Luoe;
        //   133: invokespecial   uow.<init>:(Ljavax/microedition/khronos/egl/EGLContext;Lqza;Luoe;)V
        //   136: astore          5
        //   138: new             Landroid/os/HandlerThread;
        //   141: dup            
        //   142: ldc_w           Luow;.class
        //   145: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   148: invokespecial   android/os/HandlerThread.<init>:(Ljava/lang/String;)V
        //   151: astore          6
        //   153: aload           6
        //   155: aload           5
        //   157: invokevirtual   android/os/HandlerThread.setUncaughtExceptionHandler:(Ljava/lang/Thread$UncaughtExceptionHandler;)V
        //   160: aload           6
        //   162: invokevirtual   android/os/HandlerThread.start:()V
        //   165: new             Luov;
        //   168: dup            
        //   169: aload           6
        //   171: invokevirtual   android/os/HandlerThread.getLooper:()Landroid/os/Looper;
        //   174: aload           5
        //   176: invokespecial   uov.<init>:(Landroid/os/Looper;Luow;)V
        //   179: astore          6
        //   181: aload           5
        //   183: aload           6
        //   185: putfield        uow.a:Luov;
        //   188: aload           6
        //   190: new             Luhs;
        //   193: dup            
        //   194: aload           5
        //   196: bipush          13
        //   198: invokespecial   uhs.<init>:(Luow;I)V
        //   201: invokevirtual   uov.post:(Ljava/lang/Runnable;)Z
        //   204: pop            
        //   205: aload           4
        //   207: aload           5
        //   209: putfield        ulu.d:Luow;
        //   212: aload           4
        //   214: iconst_1       
        //   215: putfield        ulu.k:Z
        //   218: aload           4
        //   220: getfield        ulu.f:Lagvi;
        //   223: astore          5
        //   225: aload           5
        //   227: ifnull          240
        //   230: aload           4
        //   232: getfield        ulu.d:Luow;
        //   235: aload           5
        //   237: invokevirtual   uow.a:(Lagvi;)V
        //   240: aload           4
        //   242: getfield        ulu.g:Luqn;
        //   245: astore          5
        //   247: aload           5
        //   249: ifnull          259
        //   252: aload           4
        //   254: aload           5
        //   256: invokevirtual   ulu.b:(Luqn;)V
        //   259: aload           4
        //   261: invokevirtual   ulu.a:()V
        //   264: aload_0        
        //   265: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.m:Lqyz;
        //   268: checkcast       Lulu;
        //   271: getfield        ulu.d:Luow;
        //   274: astore          7
        //   276: aconst_null    
        //   277: astore          5
        //   279: aload           5
        //   281: astore          4
        //   283: aload           7
        //   285: ifnull          431
        //   288: aload           7
        //   290: getfield        uow.b:Ljava/lang/Object;
        //   293: astore          6
        //   295: aload           6
        //   297: monitorenter   
        //   298: aload           7
        //   300: getfield        uow.e:Lagvp;
        //   303: ifnonnull       375
        //   306: aload           7
        //   308: getfield        uow.s:I
        //   311: istore_1       
        //   312: iload_1        
        //   313: iconst_3       
        //   314: if_icmpeq       375
        //   317: aload           7
        //   319: getfield        uow.b:Ljava/lang/Object;
        //   322: invokevirtual   java/lang/Object.wait:()V
        //   325: goto            298
        //   328: astore          4
        //   330: aload           4
        //   332: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   335: astore          8
        //   337: new             Ljava/lang/StringBuilder;
        //   340: astore          4
        //   342: aload           4
        //   344: invokespecial   java/lang/StringBuilder.<init>:()V
        //   347: aload           4
        //   349: ldc_w           "InterruptedException while waiting for eglContextCreation "
        //   352: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   355: pop            
        //   356: aload           4
        //   358: aload           8
        //   360: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   363: pop            
        //   364: aload           4
        //   366: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   369: invokestatic    tut.b:(Ljava/lang/String;)V
        //   372: goto            298
        //   375: aload           7
        //   377: getfield        uow.e:Lagvp;
        //   380: astore          4
        //   382: aload           4
        //   384: ifnull          413
        //   387: aload           4
        //   389: getfield        agvp.c:Landroid/opengl/EGLContext;
        //   392: ifnonnull       400
        //   395: aload           4
        //   397: invokevirtual   agvp.b:()V
        //   400: aload           4
        //   402: getfield        agvp.c:Landroid/opengl/EGLContext;
        //   405: astore          4
        //   407: aload           6
        //   409: monitorexit    
        //   410: goto            431
        //   413: aload           6
        //   415: monitorexit    
        //   416: aload           5
        //   418: astore          4
        //   420: goto            431
        //   423: astore          4
        //   425: aload           6
        //   427: monitorexit    
        //   428: aload           4
        //   430: athrow         
        //   431: aload           4
        //   433: ifnull          502
        //   436: aload_0        
        //   437: aload           4
        //   439: invokespecial   com/google/android/libraries/youtube/edit/camera/CameraView.aa:(Landroid/opengl/EGLContext;)Lreo;
        //   442: astore          5
        //   444: new             Lres;
        //   447: dup            
        //   448: aload           5
        //   450: invokespecial   res.<init>:(Lreo;)V
        //   453: astore          4
        //   455: aload           4
        //   457: aload           5
        //   459: invokevirtual   rer.g:(Lreo;)V
        //   462: aload_0        
        //   463: aload           4
        //   465: putfield        com/google/android/libraries/youtube/edit/camera/CameraView.i:Lrer;
        //   468: aload_0        
        //   469: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.m:Lqyz;
        //   472: astore          5
        //   474: aload           5
        //   476: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   479: pop            
        //   480: aload           5
        //   482: checkcast       Lulu;
        //   485: getfield        ulu.d:Luow;
        //   488: astore          5
        //   490: aload           5
        //   492: ifnull          502
        //   495: aload           5
        //   497: aload           4
        //   499: invokevirtual   uow.a:(Lagvi;)V
        //   502: aload_0        
        //   503: invokespecial   com/google/android/libraries/youtube/edit/camera/CameraView.Y:()V
        //   506: aload_0        
        //   507: getfield        com/google/android/libraries/youtube/edit/camera/CameraView.c:Landroid/opengl/GLSurfaceView;
        //   510: astore          4
        //   512: aload           4
        //   514: ifnull          522
        //   517: aload           4
        //   519: invokevirtual   android/opengl/GLSurfaceView.onResume:()V
        //   522: return         
        //   523: astore          5
        //   525: aload           4
        //   527: monitorexit    
        //   528: goto            534
        //   531: aload           5
        //   533: athrow         
        //   534: goto            531
        //   537: astore          5
        //   539: goto            29
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  29     34     523    537    Any
        //  38     45     537    542    Ljava/lang/InterruptedException;
        //  38     45     523    537    Any
        //  48     51     523    537    Any
        //  298    312    423    431    Any
        //  317    325    328    375    Ljava/lang/InterruptedException;
        //  317    325    423    431    Any
        //  330    372    423    431    Any
        //  375    382    423    431    Any
        //  387    400    423    431    Any
        //  400    410    423    431    Any
        //  413    416    423    431    Any
        //  425    428    423    431    Any
        //  525    528    523    537    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
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
    
    public final void y() {
        final rer i = this.i;
        if (i == null) {
            tut.b("Recorder has not been initialized.");
            return;
        }
        synchronized (i) {
            if (i.d == 2) {
                i.p();
            }
        }
    }
    
    public final void z(final rdd l, final int f, final long j, final long k, final req w, final boolean b) {
        this.K = 0;
        this.L = 0;
        if (!this.H()) {
            tut.b("Camera is not ready for recording.");
            return;
        }
        if (this.A.a() == null) {
            tut.b("Camera not active.");
            return;
        }
        final rer i = this.i;
        final CamcorderProfile f2 = this.f(false);
        if (f2 == null) {
            tut.b("No camcorder profile. Did you forget to call prepareRecord?");
            return;
        }
        this.n = -1;
        this.r(false);
        this.w = w;
        if (i != null) {
            final oqz d = this.D;
            if (d != null) {
                i.K = d;
            }
            final rep q = this.q;
            if (q != null) {
                i.r = q;
            }
            final ren a = i.A;
            if (a != null) {
                a.b = b;
            }
            i.I = b;
            final int c = this.A.c;
            final int videoFrameWidth = f2.videoFrameWidth;
            final int videoFrameHeight = f2.videoFrameHeight;
            final float m = (float)Math.min(f2.videoFrameRate, this.M);
            final int e = this.e();
            i.e = c;
            i.f = f;
            i.g = videoFrameWidth;
            i.h = videoFrameHeight;
            i.i = m;
            adme.T(j == 0L || j > 0L);
            adme.T(k == 0L || k > 0L);
            if (j != 0L && k != 0L) {
                adme.T(j <= k);
            }
            i.j = j;
            i.k = k;
            i.l = l;
            i.m = (req)this;
            i.n = e;
            i.p = (long)(TimeUnit.SECONDS.toNanos(1L) / m);
            i.J = null;
            i.t = true;
            i.s = false;
            i.u = 0;
            i.o(i.v = 0);
            (i.o = new Thread((Runnable)i, "editRecordVideo")).start();
        }
        this.m();
        final Iterator iterator = this.t.iterator();
        while (iterator.hasNext()) {
            ((ulk)iterator.next()).d();
        }
    }
}
