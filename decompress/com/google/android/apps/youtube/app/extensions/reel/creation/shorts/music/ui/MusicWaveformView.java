// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui;

import android.view.MotionEvent;
import android.graphics.Canvas;
import android.content.res.Resources;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class MusicWaveformView extends View
{
    public final hcw a;
    float b;
    float c;
    public float d;
    public float e;
    AttributeSet f;
    public hci g;
    private boolean h;
    private float i;
    private float j;
    private float k;
    private float l;
    
    public MusicWaveformView(final Context context) {
        this(context, null, 0);
    }
    
    public MusicWaveformView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MusicWaveformView(final Context context, final AttributeSet f, final int n) {
        super(context, f, n);
        this.f = f;
        final hcw a = new hcw(context);
        (this.a = a).d();
        a.c(f, false);
        final float dimension = context.getResources().getDimension(2131165623);
        final float dimension2 = context.getResources().getDimension(2131168252);
        this.d(dimension, dimension2, Resources.getSystem().getDisplayMetrics().widthPixels - (dimension + dimension) - (dimension2 + dimension2));
    }
    
    private final void f(final long n, final long n2) {
        float l = 0.0f;
        this.d = 0.0f;
        if (n >= n2) {
            l = (n - n2) / this.a.e;
        }
        this.l = l;
    }
    
    public final void a(final long n, final long n2) {
        this.a.e(n, n2, this.j);
        this.f(n, n2);
    }
    
    public final void b(final long p0, final long p1, final byte[] p2, final afcr p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: lconst_0       
        //     2: lcmp           
        //     3: ifgt            33
        //     6: new             Ljava/lang/StringBuilder;
        //     9: dup            
        //    10: ldc             "Invalid previewPlayableDurationMs: "
        //    12: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    15: astore          5
        //    17: aload           5
        //    19: lload_3        
        //    20: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    23: pop            
        //    24: aload           5
        //    26: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    29: invokestatic    trn.b:(Ljava/lang/String;)V
        //    32: return         
        //    33: new             Ljava/io/ByteArrayInputStream;
        //    36: astore          7
        //    38: aload           7
        //    40: aload           5
        //    42: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //    45: aload           7
        //    47: invokestatic    aeud.a:(Ljava/io/InputStream;)Laeud;
        //    50: astore          5
        //    52: aload           5
        //    54: getfield        aeud.a:I
        //    57: istore          8
        //    59: aload           5
        //    61: getfield        aeud.d:Ljava/lang/Object;
        //    64: astore          5
        //    66: aload_0        
        //    67: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/music/ui/MusicWaveformView.a:Lhcw;
        //    70: lload_1        
        //    71: lload_3        
        //    72: aload_0        
        //    73: getfield        com/google/android/apps/youtube/app/extensions/reel/creation/shorts/music/ui/MusicWaveformView.j:F
        //    76: aload           5
        //    78: checkcast       [B
        //    81: iload           8
        //    83: aload           6
        //    85: invokevirtual   hcw.f:(JJF[BILafcr;)V
        //    88: aload_0        
        //    89: lload_1        
        //    90: lload_3        
        //    91: invokespecial   com/google/android/apps/youtube/app/extensions/reel/creation/shorts/music/ui/MusicWaveformView.f:(JJ)V
        //    94: aload           7
        //    96: invokevirtual   java/io/InputStream.close:()V
        //    99: return         
        //   100: astore          5
        //   102: aload           7
        //   104: invokevirtual   java/io/InputStream.close:()V
        //   107: goto            143
        //   110: astore          6
        //   112: ldc             Ljava/lang/Throwable;.class
        //   114: ldc             "addSuppressed"
        //   116: iconst_1       
        //   117: anewarray       Ljava/lang/Class;
        //   120: dup            
        //   121: iconst_0       
        //   122: ldc             Ljava/lang/Throwable;.class
        //   124: aastore        
        //   125: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   128: aload           5
        //   130: iconst_1       
        //   131: anewarray       Ljava/lang/Object;
        //   134: dup            
        //   135: iconst_0       
        //   136: aload           6
        //   138: aastore        
        //   139: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   142: pop            
        //   143: aload           5
        //   145: athrow         
        //   146: astore          5
        //   148: ldc             "Error reading the raw waveform bytes. "
        //   150: aload           5
        //   152: invokestatic    trn.d:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   155: aload_0        
        //   156: lload_1        
        //   157: lload_3        
        //   158: invokevirtual   com/google/android/apps/youtube/app/extensions/reel/creation/shorts/music/ui/MusicWaveformView.a:(JJ)V
        //   161: return         
        //   162: astore          6
        //   164: goto            143
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  33     45     146    162    Ljava/io/IOException;
        //  45     94     100    146    Any
        //  94     99     146    162    Ljava/io/IOException;
        //  102    107    110    143    Any
        //  112    143    162    167    Ljava/lang/Exception;
        //  143    146    146    162    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0143:
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
    
    public final void c(final boolean b) {
        this.a.c(this.f, b);
    }
    
    public final void d(final float n, final float i, final float b) {
        this.i = i;
        this.b = b;
        this.c = n + i;
        this.j = b / this.a.d;
    }
    
    public final void e(final long n) {
        final float n2 = n / this.a.e;
        this.d = n2;
        this.e = n2;
        this.invalidate();
    }
    
    public final void onDraw(final Canvas canvas) {
        this.a.b(canvas, this.getWidth(), this.getHeight() / 2, 0.0f, 0.0f, this.c, this.b, this.i, this.d, this.e, this.h);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.isEnabled()) {
            return false;
        }
        final int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    final float k = this.k;
                    final float d = this.d;
                    final float x = motionEvent.getX();
                    final hcw a = this.a;
                    final float d2 = d + (k - x) / a.d;
                    this.d = d2;
                    float n = d2;
                    if (d2 < 0.0f) {
                        this.d = 0.0f;
                        n = 0.0f;
                    }
                    final boolean nt = this.g.nt((long)(a.e * n));
                    this.h = nt;
                    if (nt) {
                        this.d = this.l;
                    }
                    this.e = this.d;
                    this.invalidate();
                    this.k = motionEvent.getX();
                }
            }
            else {
                this.g.d();
            }
        }
        else {
            this.g.b();
            this.k = motionEvent.getX();
        }
        return true;
    }
}
