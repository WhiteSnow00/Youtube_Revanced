import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asiz extends RuntimeException
{
    private static final long serialVersionUID = 3026362227162912146L;
    private final List a;
    private final String b;
    private Throwable c;
    
    public asiz(final Iterable iterable) {
        final LinkedHashSet set = new LinkedHashSet();
        final ArrayList list = new ArrayList();
        if (iterable != null) {
            for (final Throwable t : iterable) {
                if (t instanceof asiz) {
                    set.addAll(((asiz)t).a);
                }
                else if (t != null) {
                    set.add(t);
                }
                else {
                    set.add(new NullPointerException("Throwable was null!"));
                }
            }
        }
        else {
            set.add(new NullPointerException("errors was null"));
        }
        if (!set.isEmpty()) {
            list.addAll(set);
            final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)list);
            this.a = unmodifiableList;
            final int size = unmodifiableList.size();
            final StringBuilder sb = new StringBuilder();
            sb.append(size);
            sb.append(" exceptions occurred. ");
            this.b = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
    
    public asiz(final Throwable... array) {
        this(Arrays.asList(array));
    }
    
    private final void a(final StringBuilder sb, final Throwable t, final String s) {
        sb.append(s);
        sb.append(t);
        sb.append('\n');
        for (final StackTraceElement stackTraceElement : t.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (t.getCause() != null) {
            sb.append("\tCaused by: ");
            this.a(sb, t.getCause(), "");
        }
    }
    
    private final void b(final asiw asiw) {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (final StackTraceElement stackTraceElement : this.getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        final Iterator iterator = this.a.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Throwable t = (Throwable)iterator.next();
            sb.append("  ComposedException ");
            sb.append(n);
            sb.append(" :\n");
            this.a(sb, t, "\t");
            ++n;
        }
        asiw.a(sb.toString());
    }
    
    @Override
    public final Throwable getCause() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        asiz.c:Ljava/lang/Throwable;
        //     6: ifnonnull       279
        //     9: new             Lasiv;
        //    12: astore_3       
        //    13: aload_3        
        //    14: invokespecial   asiv.<init>:()V
        //    17: new             Ljava/util/HashSet;
        //    20: astore          6
        //    22: aload           6
        //    24: invokespecial   java/util/HashSet.<init>:()V
        //    27: aload_0        
        //    28: getfield        asiz.a:Ljava/util/List;
        //    31: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    36: astore          7
        //    38: aload_3        
        //    39: astore_1       
        //    40: aload           7
        //    42: invokeinterface java/util/Iterator.hasNext:()Z
        //    47: ifeq            274
        //    50: aload           7
        //    52: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    57: checkcast       Ljava/lang/Throwable;
        //    60: astore          4
        //    62: aload           6
        //    64: aload           4
        //    66: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    71: ifne            40
        //    74: aload           6
        //    76: aload           4
        //    78: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    83: pop            
        //    84: new             Ljava/util/ArrayList;
        //    87: astore          8
        //    89: aload           8
        //    91: invokespecial   java/util/ArrayList.<init>:()V
        //    94: aload           4
        //    96: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //    99: astore          5
        //   101: aload           5
        //   103: ifnull          151
        //   106: aload           5
        //   108: astore_2       
        //   109: aload           5
        //   111: aload           4
        //   113: if_acmpne       119
        //   116: goto            151
        //   119: aload           8
        //   121: aload_2        
        //   122: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   127: pop            
        //   128: aload_2        
        //   129: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   132: astore          5
        //   134: aload           5
        //   136: ifnull          151
        //   139: aload           5
        //   141: aload_2        
        //   142: if_acmpeq       151
        //   145: aload           5
        //   147: astore_2       
        //   148: goto            119
        //   151: aload           8
        //   153: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   158: astore          5
        //   160: aload           4
        //   162: astore_2       
        //   163: aload           5
        //   165: invokeinterface java/util/Iterator.hasNext:()Z
        //   170: ifeq            223
        //   173: aload           5
        //   175: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   180: checkcast       Ljava/lang/Throwable;
        //   183: astore          4
        //   185: aload           6
        //   187: aload           4
        //   189: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   194: ifeq            210
        //   197: new             Ljava/lang/RuntimeException;
        //   200: dup            
        //   201: ldc             "Duplicate found in causal chain so cropping to prevent loop ..."
        //   203: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   206: astore_2       
        //   207: goto            163
        //   210: aload           6
        //   212: aload           4
        //   214: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   219: pop            
        //   220: goto            163
        //   223: aload_1        
        //   224: aload_2        
        //   225: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   228: pop            
        //   229: aload_1        
        //   230: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   233: astore_2       
        //   234: aload_2        
        //   235: ifnull          40
        //   238: aload_1        
        //   239: aload_2        
        //   240: if_acmpeq       40
        //   243: aload_2        
        //   244: astore_1       
        //   245: aload_1        
        //   246: astore_2       
        //   247: aload_2        
        //   248: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   251: astore          4
        //   253: aload_2        
        //   254: astore_1       
        //   255: aload           4
        //   257: ifnull          40
        //   260: aload_2        
        //   261: astore_1       
        //   262: aload           4
        //   264: aload_2        
        //   265: if_acmpeq       40
        //   268: aload           4
        //   270: astore_1       
        //   271: goto            245
        //   274: aload_0        
        //   275: aload_3        
        //   276: putfield        asiz.c:Ljava/lang/Throwable;
        //   279: aload_0        
        //   280: getfield        asiz.c:Ljava/lang/Throwable;
        //   283: astore_1       
        //   284: aload_0        
        //   285: monitorexit    
        //   286: aload_1        
        //   287: areturn        
        //   288: astore_1       
        //   289: aload_0        
        //   290: monitorexit    
        //   291: goto            296
        //   294: aload_1        
        //   295: athrow         
        //   296: goto            294
        //   299: astore_2       
        //   300: goto            229
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      38     288    299    Any
        //  40     101    288    299    Any
        //  119    134    288    299    Any
        //  151    160    288    299    Any
        //  163    207    288    299    Any
        //  210    220    288    299    Any
        //  223    229    299    303    Any
        //  229    234    288    299    Any
        //  247    253    288    299    Any
        //  274    279    288    299    Any
        //  279    284    288    299    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0223:
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
    
    @Override
    public final String getMessage() {
        return this.b;
    }
    
    @Override
    public final void printStackTrace() {
        this.printStackTrace(System.err);
    }
    
    @Override
    public final void printStackTrace(final PrintStream printStream) {
        this.b(new asix(printStream));
    }
    
    @Override
    public final void printStackTrace(final PrintWriter printWriter) {
        this.b(new asiy(printWriter));
    }
}
