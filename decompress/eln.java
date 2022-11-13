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

public abstract class eln implements elm
{
    protected static volatile emk a;
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
    
    protected eln(final Context context) {
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
            if (mdx.u.e()) {
                eku.b();
            }
            else {
                epf.i(eln.a);
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
                    final eho eho = (eho)ahbh.parseFrom((ahbh)eho.a, j, ExtensionRegistryLite.a);
                    break Label_0048;
                }
                catch (final NullPointerException ex) {
                    return Integer.toString(3);
                }
                catch (final ahca ahca) {}
            }
            final eho eho = null;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final boolean booleanValue = (boolean)mdx.j.e();
        String s2;
        ell ell;
        if (booleanValue) {
            ell k;
            if (eln.a != null) {
                k = eln.a.k;
            }
            else {
                k = null;
            }
            if (!(boolean)mdx.u.e()) {
                s2 = "te";
                ell = k;
            }
            else {
                s2 = "be";
                ell = k;
            }
        }
        else {
            ell = null;
            s2 = null;
        }
        Object o2 = null;
        int n4 = 0;
        Label_0175: {
            if (n != 3) {
                break Label_0175;
            }
            j = array;
            Label_0219: {
                try {
                    final Object o = j = (byte[])(Object)this.j(context, view, activity);
                    this.t = true;
                    final int n2 = 1002;
                    break Label_0219;
                }
                catch (final Exception ex2) {
                    o2 = j;
                    if (booleanValue) {
                        o2 = j;
                        if (ell != null) {
                            int n3;
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
                            ell.a(n3, -1, System.currentTimeMillis() - currentTimeMillis, s2, ex2);
                            o2 = j;
                            n4 = n;
                        }
                    }
                Block_14_Outer:
                    while (true) {
                        n4 = n;
                        break Label_0175;
                        Object o = null;
                        int n2 = 0;
                    Block_16:
                        while (true) {
                            o = this.n(context, view, activity);
                            n2 = 1008;
                            break Label_0219;
                            Label_0202: {
                                final eho eho;
                                o = this.l(context, eho);
                            }
                            n2 = 1000;
                            o2 = o;
                            iftrue(Label_0256:)(!booleanValue);
                            o2 = o;
                            iftrue(Label_0256:)(ell == null);
                            break Block_16;
                            iftrue(Label_0202:)(n != 2);
                            continue;
                        }
                        ell.b(n2, System.currentTimeMillis() - currentTimeMillis, s2);
                        o2 = o;
                        continue Block_14_Outer;
                    }
                }
            }
        }
        final long currentTimeMillis2 = System.currentTimeMillis();
        while (true) {
            if (o2 != null) {
                String s3;
                try {
                    if (((ahbh)((ahaz)o2).build()).getSerializedSize() == 0) {
                        s3 = Integer.toString(5);
                    }
                    else {
                        s = (s3 = eku.a((eht)((ahaz)o2).build(), s));
                        if (booleanValue) {
                            s3 = s;
                            if (ell != null) {
                                if (n4 == 3) {
                                    n = 1006;
                                }
                                else if (n4 == 2) {
                                    n = 1010;
                                }
                                else {
                                    n = 1004;
                                }
                                ell.b(n, System.currentTimeMillis() - currentTimeMillis2, s2);
                                s3 = s;
                            }
                        }
                    }
                }
                catch (final Exception ex3) {
                    s = (s3 = Integer.toString(7));
                    if (booleanValue) {
                        s3 = s;
                        if (ell != null) {
                            if (n4 == 3) {
                                n = 1007;
                            }
                            else if (n4 == 2) {
                                n = 1011;
                            }
                            else {
                                n = 1005;
                            }
                            ell.a(n, -1, System.currentTimeMillis() - currentTimeMillis2, s2, ex3);
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
    
    protected abstract emm b(final MotionEvent p0);
    
    public final String c(final Context context, final String s) {
        return this.d(context, s, null, null);
    }
    
    public final String d(final Context context, final String s, final View view, final Activity activity) {
        return this.q(context, s, 3, view, activity, null);
    }
    
    public final String e(final Context context) {
        if (!emn.f()) {
            return this.q(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }
    
    public final String f(final Context context, final byte[] array) {
        if (!emn.f()) {
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
        //     3: getfield        eln.t:Z
        //     6: ifeq            18
        //     9: aload_0        
        //    10: invokespecial   eln.p:()V
        //    13: aload_0        
        //    14: iconst_0       
        //    15: putfield        eln.t:Z
        //    18: aload_1        
        //    19: invokevirtual   android/view/MotionEvent.getAction:()I
        //    22: istore          10
        //    24: iload           10
        //    26: ifeq            130
        //    29: iload           10
        //    31: iconst_1       
        //    32: if_icmpeq       44
        //    35: iload           10
        //    37: iconst_2       
        //    38: if_icmpeq       44
        //    41: goto            153
        //    44: aload_1        
        //    45: invokevirtual   android/view/MotionEvent.getRawX:()F
        //    48: f2d            
        //    49: dstore_2       
        //    50: aload_1        
        //    51: invokevirtual   android/view/MotionEvent.getRawY:()F
        //    54: f2d            
        //    55: dstore          4
        //    57: aload_0        
        //    58: getfield        eln.r:D
        //    61: dstore          6
        //    63: dload_2        
        //    64: invokestatic    java/lang/Double.isNaN:(D)Z
        //    67: pop            
        //    68: dload_2        
        //    69: dload           6
        //    71: dsub           
        //    72: dstore          6
        //    74: aload_0        
        //    75: getfield        eln.s:D
        //    78: dstore          8
        //    80: dload           4
        //    82: invokestatic    java/lang/Double.isNaN:(D)Z
        //    85: pop            
        //    86: dload           4
        //    88: dload           8
        //    90: dsub           
        //    91: dstore          8
        //    93: aload_0        
        //    94: aload_0        
        //    95: getfield        eln.k:D
        //    98: dload           6
        //   100: dload           6
        //   102: dmul           
        //   103: dload           8
        //   105: dload           8
        //   107: dmul           
        //   108: dadd           
        //   109: invokestatic    java/lang/Math.sqrt:(D)D
        //   112: dadd           
        //   113: putfield        eln.k:D
        //   116: aload_0        
        //   117: dload_2        
        //   118: putfield        eln.r:D
        //   121: aload_0        
        //   122: dload           4
        //   124: putfield        eln.s:D
        //   127: goto            153
        //   130: aload_0        
        //   131: dconst_0       
        //   132: putfield        eln.k:D
        //   135: aload_0        
        //   136: aload_1        
        //   137: invokevirtual   android/view/MotionEvent.getRawX:()F
        //   140: f2d            
        //   141: putfield        eln.r:D
        //   144: aload_0        
        //   145: aload_1        
        //   146: invokevirtual   android/view/MotionEvent.getRawY:()F
        //   149: f2d            
        //   150: putfield        eln.s:D
        //   153: aload_1        
        //   154: invokevirtual   android/view/MotionEvent.getAction:()I
        //   157: istore          10
        //   159: iload           10
        //   161: ifeq            387
        //   164: iload           10
        //   166: iconst_1       
        //   167: if_icmpeq       310
        //   170: iload           10
        //   172: iconst_2       
        //   173: if_icmpeq       198
        //   176: iload           10
        //   178: iconst_3       
        //   179: if_icmpeq       185
        //   182: goto            429
        //   185: aload_0        
        //   186: aload_0        
        //   187: getfield        eln.g:J
        //   190: lconst_1       
        //   191: ladd           
        //   192: putfield        eln.g:J
        //   195: goto            429
        //   198: aload_0        
        //   199: aload_0        
        //   200: getfield        eln.e:J
        //   203: aload_1        
        //   204: invokevirtual   android/view/MotionEvent.getHistorySize:()I
        //   207: iconst_1       
        //   208: iadd           
        //   209: i2l            
        //   210: ladd           
        //   211: putfield        eln.e:J
        //   214: aload_0        
        //   215: aload_1        
        //   216: invokevirtual   eln.b:(Landroid/view/MotionEvent;)Lemm;
        //   219: astore_1       
        //   220: aload_1        
        //   221: getfield        emm.d:Ljava/lang/Long;
        //   224: astore          11
        //   226: aload           11
        //   228: ifnull          260
        //   231: aload_1        
        //   232: getfield        emm.g:Ljava/lang/Long;
        //   235: ifnull          260
        //   238: aload_0        
        //   239: aload_0        
        //   240: getfield        eln.i:J
        //   243: aload           11
        //   245: invokevirtual   java/lang/Long.longValue:()J
        //   248: aload_1        
        //   249: getfield        emm.g:Ljava/lang/Long;
        //   252: invokevirtual   java/lang/Long.longValue:()J
        //   255: ladd           
        //   256: ladd           
        //   257: putfield        eln.i:J
        //   260: aload_0        
        //   261: getfield        eln.q:Landroid/util/DisplayMetrics;
        //   264: ifnull          429
        //   267: aload_1        
        //   268: getfield        emm.e:Ljava/lang/Long;
        //   271: astore          11
        //   273: aload           11
        //   275: ifnull          429
        //   278: aload_1        
        //   279: getfield        emm.h:Ljava/lang/Long;
        //   282: ifnull          429
        //   285: aload_0        
        //   286: aload_0        
        //   287: getfield        eln.j:J
        //   290: aload           11
        //   292: invokevirtual   java/lang/Long.longValue:()J
        //   295: aload_1        
        //   296: getfield        emm.h:Ljava/lang/Long;
        //   299: invokevirtual   java/lang/Long.longValue:()J
        //   302: ladd           
        //   303: ladd           
        //   304: putfield        eln.j:J
        //   307: goto            429
        //   310: aload_1        
        //   311: invokestatic    android/view/MotionEvent.obtain:(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
        //   314: astore_1       
        //   315: aload_0        
        //   316: aload_1        
        //   317: putfield        eln.b:Landroid/view/MotionEvent;
        //   320: aload_0        
        //   321: getfield        eln.c:Ljava/util/LinkedList;
        //   324: aload_1        
        //   325: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   328: pop            
        //   329: aload_0        
        //   330: getfield        eln.c:Ljava/util/LinkedList;
        //   333: invokevirtual   java/util/LinkedList.size:()I
        //   336: bipush          6
        //   338: if_icmple       354
        //   341: aload_0        
        //   342: getfield        eln.c:Ljava/util/LinkedList;
        //   345: invokevirtual   java/util/LinkedList.remove:()Ljava/lang/Object;
        //   348: checkcast       Landroid/view/MotionEvent;
        //   351: invokevirtual   android/view/MotionEvent.recycle:()V
        //   354: aload_0        
        //   355: aload_0        
        //   356: getfield        eln.f:J
        //   359: lconst_1       
        //   360: ladd           
        //   361: putfield        eln.f:J
        //   364: new             Ljava/lang/Throwable;
        //   367: astore_1       
        //   368: aload_1        
        //   369: invokespecial   java/lang/Throwable.<init>:()V
        //   372: aload_0        
        //   373: aload_0        
        //   374: aload_1        
        //   375: invokevirtual   java/lang/Throwable.getStackTrace:()[Ljava/lang/StackTraceElement;
        //   378: invokevirtual   eln.a:([Ljava/lang/StackTraceElement;)J
        //   381: putfield        eln.h:J
        //   384: goto            429
        //   387: aload_0        
        //   388: aload_1        
        //   389: invokevirtual   android/view/MotionEvent.getX:()F
        //   392: putfield        eln.l:F
        //   395: aload_0        
        //   396: aload_1        
        //   397: invokevirtual   android/view/MotionEvent.getY:()F
        //   400: putfield        eln.m:F
        //   403: aload_0        
        //   404: aload_1        
        //   405: invokevirtual   android/view/MotionEvent.getRawX:()F
        //   408: putfield        eln.n:F
        //   411: aload_0        
        //   412: aload_1        
        //   413: invokevirtual   android/view/MotionEvent.getRawY:()F
        //   416: putfield        eln.o:F
        //   419: aload_0        
        //   420: aload_0        
        //   421: getfield        eln.d:J
        //   424: lconst_1       
        //   425: ladd           
        //   426: putfield        eln.d:J
        //   429: aload_0        
        //   430: iconst_1       
        //   431: putfield        eln.p:Z
        //   434: aload_0        
        //   435: monitorexit    
        //   436: return         
        //   437: astore_1       
        //   438: aload_0        
        //   439: monitorexit    
        //   440: aload_1        
        //   441: athrow         
        //   442: astore_1       
        //   443: goto            429
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type 
        //  -----  -----  -----  -----  -----
        //  2      18     437    442    Any
        //  18     24     437    442    Any
        //  44     63     437    442    Any
        //  74     80     437    442    Any
        //  93     127    437    442    Any
        //  130    153    437    442    Any
        //  153    159    437    442    Any
        //  185    195    437    442    Any
        //  198    214    437    442    Any
        //  214    226    442    446    Lemf;
        //  214    226    437    442    Any
        //  231    260    442    446    Lemf;
        //  231    260    437    442    Any
        //  260    273    442    446    Lemf;
        //  260    273    437    442    Any
        //  278    307    442    446    Lemf;
        //  278    307    437    442    Any
        //  310    354    437    442    Any
        //  354    364    437    442    Any
        //  364    384    442    446    Lemf;
        //  364    384    437    442    Any
        //  387    429    437    442    Any
        //  429    434    437    442    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0260:
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
                if (mdx.i.e()) {
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
    
    protected abstract ahaz j(final Context p0, final View p1, final Activity p2);
    
    public void k(final View view) {
    }
    
    protected abstract ahaz l(final Context p0, final eho p1);
    
    public final boolean m() {
        return true;
    }
    
    protected abstract ahaz n(final Context p0, final View p1, final Activity p2);
    
    public final boolean o() {
        return true;
    }
}
