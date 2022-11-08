import com.google.protobuf.ExtensionRegistryLite;
import android.app.Activity;
import android.view.View;
import java.util.Iterator;
import android.content.Context;
import android.util.DisplayMetrics;
import java.util.LinkedList;
import android.view.MotionEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class elm implements ell
{
    protected static volatile emj a;
    protected MotionEvent b;
    protected final LinkedList c;
    protected long d;
    protected long e;
    protected long f;
    protected long g;
    protected long h;
    protected long i;
    protected long j;
    protected double k;
    protected float l;
    protected float m;
    protected float n;
    protected float o;
    protected boolean p;
    protected DisplayMetrics q;
    private double r;
    private double s;
    private boolean t;
    
    protected elm(final Context context) {
        this.c = new LinkedList();
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.t = false;
        this.p = false;
        try {
            if (mcs.u.e()) {
                ekt.b();
            }
            else {
                epc.i(elm.a);
            }
            this.q = context.getResources().getDisplayMetrics();
        }
        finally {}
    }
    
    private final void p() {
        this.h = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.i = 0L;
        this.j = 0L;
        if (this.c.size() > 0) {
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ((MotionEvent)iterator.next()).recycle();
            }
            this.c.clear();
        }
        else {
            final MotionEvent b = this.b;
            if (b != null) {
                b.recycle();
            }
        }
        this.b = null;
    }
    
    private final String q(final Context context, String s, int n, final View view, final Activity activity, byte[] j) {
        final byte[] array = null;
        Label_0048: {
            if (j != null && j.length > 0) {
                try {
                    final ehn ehn = (ehn)agzi.parseFrom((agzi)ehn.a, j, ExtensionRegistryLite.a);
                    break Label_0048;
                }
                catch (final NullPointerException ex) {
                    return Integer.toString(3);
                }
                catch (final ahab ahab) {}
            }
            final ehn ehn = null;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final boolean booleanValue = (boolean)mcs.j.e();
        String s2;
        Object o;
        if (booleanValue) {
            elk k;
            if (elm.a != null) {
                k = elm.a.k;
            }
            else {
                k = null;
            }
            if (!(boolean)mcs.u.e()) {
                s2 = "te";
                o = k;
            }
            else {
                s2 = "be";
                o = k;
            }
        }
        else {
            o = (s2 = null);
        }
        Object o3 = null;
        int n4 = 0;
        Label_0176: {
            if (n != 3) {
                break Label_0176;
            }
            j = array;
            final ehn ehn;
            Object o2 = null;
            int n2;
            int n3;
            Label_0257_Outer:Block_16_Outer:
            while (true) {
                try {
                    o2 = (j = (byte[])(Object)this.j(context, view, activity));
                    this.t = true;
                    n2 = 1002;
                    break Label_0220;
                }
                catch (final Exception ex2) {
                    o3 = j;
                    if (booleanValue) {
                        o3 = j;
                        if (o != null) {
                            if (n == 3) {
                                n3 = 1003;
                            }
                            else if (n == 2) {
                                n3 = 1009;
                            }
                            else {
                                n3 = 1001;
                                n = 1;
                            }
                            ((elk)o).a(n3, -1, System.currentTimeMillis() - currentTimeMillis, s2, ex2);
                            o3 = j;
                            n4 = n;
                        }
                    }
                    while (true) {
                        Block_15: {
                            while (true) {
                                n4 = n;
                                break Label_0176;
                                o3 = o2;
                                iftrue(Label_0257:)(!booleanValue);
                                break Block_15;
                                ((elk)o).b(n2, System.currentTimeMillis() - currentTimeMillis, s2);
                                o3 = o2;
                                continue Block_16_Outer;
                            }
                            while (true) {
                                o2 = this.n(context, view, activity);
                                n2 = 1008;
                                continue Label_0257_Outer;
                                iftrue(Label_0203:)(n != 2);
                                continue;
                            }
                            Label_0203: {
                                o2 = this.l(context, ehn);
                            }
                            n2 = 1000;
                            continue Label_0257_Outer;
                        }
                        o3 = o2;
                        iftrue(Label_0257:)(o == null);
                        continue;
                    }
                }
                break;
            }
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        while (true) {
            if (o3 != null) {
                String s3;
                try {
                    if (((agzi)((agza)o3).build()).getSerializedSize() == 0) {
                        s3 = Integer.toString(5);
                    }
                    else {
                        s = (s3 = ekt.a((ehs)((agza)o3).build(), s));
                        if (booleanValue) {
                            s3 = s;
                            if (o != null) {
                                if (n4 == 3) {
                                    n = 1006;
                                }
                                else if (n4 == 2) {
                                    n = 1010;
                                }
                                else {
                                    n = 1004;
                                }
                                ((elk)o).b(n, System.currentTimeMillis() - currentTimeMillis2, s2);
                                s3 = s;
                            }
                        }
                    }
                }
                catch (final Exception ex3) {
                    s = (s3 = Integer.toString(7));
                    if (booleanValue) {
                        s3 = s;
                        if (o != null) {
                            if (n4 == 3) {
                                n = 1007;
                            }
                            else if (n4 == 2) {
                                n = 1011;
                            }
                            else {
                                n = 1005;
                            }
                            ((elk)o).a(n, -1, System.currentTimeMillis() - currentTimeMillis2, s2, ex3);
                            s3 = s;
                        }
                    }
                }
                return s3;
            }
            continue;
        }
    }
    
    protected abstract long a(final StackTraceElement[] p0);
    
    protected abstract eml b(final MotionEvent p0);
    
    public final String c(final Context context, final String s) {
        return this.d(context, s, null, null);
    }
    
    public final String d(final Context context, final String s, final View view, final Activity activity) {
        return this.q(context, s, 3, view, activity, null);
    }
    
    public final String e(final Context context) {
        if (!emm.f()) {
            return this.q(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }
    
    public final String f(final Context context, final byte[] array) {
        if (!emm.f()) {
            return this.q(context, null, 1, null, null, array);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }
    
    public final String g(final Context context, final View view, final Activity activity) {
        return this.q(context, null, 2, view, activity, null);
    }
    
    public final void h(final MotionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        elm.t:Z
        //     6: ifeq            18
        //     9: aload_0        
        //    10: invokespecial   elm.p:()V
        //    13: aload_0        
        //    14: iconst_0       
        //    15: putfield        elm.t:Z
        //    18: aload_1        
        //    19: invokevirtual   android/view/MotionEvent.getAction:()I
        //    22: istore_2       
        //    23: iload_2        
        //    24: ifeq            126
        //    27: iload_2        
        //    28: iconst_1       
        //    29: if_icmpeq       40
        //    32: iload_2        
        //    33: iconst_2       
        //    34: if_icmpeq       40
        //    37: goto            149
        //    40: aload_1        
        //    41: invokevirtual   android/view/MotionEvent.getRawX:()F
        //    44: f2d            
        //    45: dstore_3       
        //    46: aload_1        
        //    47: invokevirtual   android/view/MotionEvent.getRawY:()F
        //    50: f2d            
        //    51: dstore          5
        //    53: aload_0        
        //    54: getfield        elm.r:D
        //    57: dstore          7
        //    59: dload_3        
        //    60: invokestatic    java/lang/Double.isNaN:(D)Z
        //    63: pop            
        //    64: dload_3        
        //    65: dload           7
        //    67: dsub           
        //    68: dstore          7
        //    70: aload_0        
        //    71: getfield        elm.s:D
        //    74: dstore          9
        //    76: dload           5
        //    78: invokestatic    java/lang/Double.isNaN:(D)Z
        //    81: pop            
        //    82: dload           5
        //    84: dload           9
        //    86: dsub           
        //    87: dstore          9
        //    89: aload_0        
        //    90: aload_0        
        //    91: getfield        elm.k:D
        //    94: dload           7
        //    96: dload           7
        //    98: dmul           
        //    99: dload           9
        //   101: dload           9
        //   103: dmul           
        //   104: dadd           
        //   105: invokestatic    java/lang/Math.sqrt:(D)D
        //   108: dadd           
        //   109: putfield        elm.k:D
        //   112: aload_0        
        //   113: dload_3        
        //   114: putfield        elm.r:D
        //   117: aload_0        
        //   118: dload           5
        //   120: putfield        elm.s:D
        //   123: goto            149
        //   126: aload_0        
        //   127: dconst_0       
        //   128: putfield        elm.k:D
        //   131: aload_0        
        //   132: aload_1        
        //   133: invokevirtual   android/view/MotionEvent.getRawX:()F
        //   136: f2d            
        //   137: putfield        elm.r:D
        //   140: aload_0        
        //   141: aload_1        
        //   142: invokevirtual   android/view/MotionEvent.getRawY:()F
        //   145: f2d            
        //   146: putfield        elm.s:D
        //   149: aload_1        
        //   150: invokevirtual   android/view/MotionEvent.getAction:()I
        //   153: istore_2       
        //   154: iload_2        
        //   155: ifeq            378
        //   158: iload_2        
        //   159: iconst_1       
        //   160: if_icmpeq       301
        //   163: iload_2        
        //   164: iconst_2       
        //   165: if_icmpeq       189
        //   168: iload_2        
        //   169: iconst_3       
        //   170: if_icmpeq       176
        //   173: goto            420
        //   176: aload_0        
        //   177: aload_0        
        //   178: getfield        elm.g:J
        //   181: lconst_1       
        //   182: ladd           
        //   183: putfield        elm.g:J
        //   186: goto            420
        //   189: aload_0        
        //   190: aload_0        
        //   191: getfield        elm.e:J
        //   194: aload_1        
        //   195: invokevirtual   android/view/MotionEvent.getHistorySize:()I
        //   198: iconst_1       
        //   199: iadd           
        //   200: i2l            
        //   201: ladd           
        //   202: putfield        elm.e:J
        //   205: aload_0        
        //   206: aload_1        
        //   207: invokevirtual   elm.b:(Landroid/view/MotionEvent;)Leml;
        //   210: astore_1       
        //   211: aload_1        
        //   212: getfield        eml.d:Ljava/lang/Long;
        //   215: astore          11
        //   217: aload           11
        //   219: ifnull          251
        //   222: aload_1        
        //   223: getfield        eml.g:Ljava/lang/Long;
        //   226: ifnull          251
        //   229: aload_0        
        //   230: aload_0        
        //   231: getfield        elm.i:J
        //   234: aload           11
        //   236: invokevirtual   java/lang/Long.longValue:()J
        //   239: aload_1        
        //   240: getfield        eml.g:Ljava/lang/Long;
        //   243: invokevirtual   java/lang/Long.longValue:()J
        //   246: ladd           
        //   247: ladd           
        //   248: putfield        elm.i:J
        //   251: aload_0        
        //   252: getfield        elm.q:Landroid/util/DisplayMetrics;
        //   255: ifnull          420
        //   258: aload_1        
        //   259: getfield        eml.e:Ljava/lang/Long;
        //   262: astore          11
        //   264: aload           11
        //   266: ifnull          420
        //   269: aload_1        
        //   270: getfield        eml.h:Ljava/lang/Long;
        //   273: ifnull          420
        //   276: aload_0        
        //   277: aload_0        
        //   278: getfield        elm.j:J
        //   281: aload           11
        //   283: invokevirtual   java/lang/Long.longValue:()J
        //   286: aload_1        
        //   287: getfield        eml.h:Ljava/lang/Long;
        //   290: invokevirtual   java/lang/Long.longValue:()J
        //   293: ladd           
        //   294: ladd           
        //   295: putfield        elm.j:J
        //   298: goto            420
        //   301: aload_1        
        //   302: invokestatic    android/view/MotionEvent.obtain:(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
        //   305: astore_1       
        //   306: aload_0        
        //   307: aload_1        
        //   308: putfield        elm.b:Landroid/view/MotionEvent;
        //   311: aload_0        
        //   312: getfield        elm.c:Ljava/util/LinkedList;
        //   315: aload_1        
        //   316: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   319: pop            
        //   320: aload_0        
        //   321: getfield        elm.c:Ljava/util/LinkedList;
        //   324: invokevirtual   java/util/LinkedList.size:()I
        //   327: bipush          6
        //   329: if_icmple       345
        //   332: aload_0        
        //   333: getfield        elm.c:Ljava/util/LinkedList;
        //   336: invokevirtual   java/util/LinkedList.remove:()Ljava/lang/Object;
        //   339: checkcast       Landroid/view/MotionEvent;
        //   342: invokevirtual   android/view/MotionEvent.recycle:()V
        //   345: aload_0        
        //   346: aload_0        
        //   347: getfield        elm.f:J
        //   350: lconst_1       
        //   351: ladd           
        //   352: putfield        elm.f:J
        //   355: new             Ljava/lang/Throwable;
        //   358: astore_1       
        //   359: aload_1        
        //   360: invokespecial   java/lang/Throwable.<init>:()V
        //   363: aload_0        
        //   364: aload_0        
        //   365: aload_1        
        //   366: invokevirtual   java/lang/Throwable.getStackTrace:()[Ljava/lang/StackTraceElement;
        //   369: invokevirtual   elm.a:([Ljava/lang/StackTraceElement;)J
        //   372: putfield        elm.h:J
        //   375: goto            420
        //   378: aload_0        
        //   379: aload_1        
        //   380: invokevirtual   android/view/MotionEvent.getX:()F
        //   383: putfield        elm.l:F
        //   386: aload_0        
        //   387: aload_1        
        //   388: invokevirtual   android/view/MotionEvent.getY:()F
        //   391: putfield        elm.m:F
        //   394: aload_0        
        //   395: aload_1        
        //   396: invokevirtual   android/view/MotionEvent.getRawX:()F
        //   399: putfield        elm.n:F
        //   402: aload_0        
        //   403: aload_1        
        //   404: invokevirtual   android/view/MotionEvent.getRawY:()F
        //   407: putfield        elm.o:F
        //   410: aload_0        
        //   411: aload_0        
        //   412: getfield        elm.d:J
        //   415: lconst_1       
        //   416: ladd           
        //   417: putfield        elm.d:J
        //   420: aload_0        
        //   421: iconst_1       
        //   422: putfield        elm.p:Z
        //   425: aload_0        
        //   426: monitorexit    
        //   427: return         
        //   428: astore_1       
        //   429: aload_0        
        //   430: monitorexit    
        //   431: aload_1        
        //   432: athrow         
        //   433: astore_1       
        //   434: goto            420
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type 
        //  -----  -----  -----  -----  -----
        //  2      18     428    433    Any
        //  18     23     428    433    Any
        //  40     59     428    433    Any
        //  70     76     428    433    Any
        //  89     123    428    433    Any
        //  126    149    428    433    Any
        //  149    154    428    433    Any
        //  176    186    428    433    Any
        //  189    205    428    433    Any
        //  205    217    433    437    Leme;
        //  205    217    428    433    Any
        //  222    251    433    437    Leme;
        //  222    251    428    433    Any
        //  251    264    433    437    Leme;
        //  251    264    428    433    Any
        //  269    298    433    437    Leme;
        //  269    298    428    433    Any
        //  301    345    428    433    Any
        //  345    355    428    433    Any
        //  355    375    433    437    Leme;
        //  355    375    428    433    Any
        //  378    420    428    433    Any
        //  420    425    428    433    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0251:
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
    
    public final void i(final int n, final int n2, final int n3) {
        synchronized (this) {
            if (this.b != null) {
                if (mcs.i.e()) {
                    this.p();
                }
                else {
                    this.b.recycle();
                }
            }
            final DisplayMetrics q = this.q;
            if (q != null) {
                this.b = MotionEvent.obtain(0L, (long)n3, 1, n * q.density, this.q.density * n2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            }
            else {
                this.b = null;
            }
            this.p = false;
        }
    }
    
    protected abstract agza j(final Context p0, final View p1, final Activity p2);
    
    public void k(final View view) {
    }
    
    protected abstract agza l(final Context p0, final ehn p1);
    
    public final boolean m() {
        return true;
    }
    
    protected abstract agza n(final Context p0, final View p1, final Activity p2);
    
    public final boolean o() {
        return true;
    }
}
