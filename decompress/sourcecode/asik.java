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

public final class asik extends RuntimeException
{
    private static final long serialVersionUID = 3026362227162912146L;
    private final List a;
    private final String b;
    private Throwable c;
    
    public asik(final Iterable iterable) {
        final LinkedHashSet set = new LinkedHashSet();
        final ArrayList list = new ArrayList();
        if (iterable != null) {
            for (final Throwable t : iterable) {
                if (t instanceof asik) {
                    set.addAll(((asik)t).a);
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
    
    public asik(final Throwable... array) {
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
    
    private final void b(final asih asih) {
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
        asih.a(sb.toString());
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
        //     3: getfield        asik.c:Ljava/lang/Throwable;
        //     6: ifnonnull       296
        //     9: new             Lasig;
        //    12: astore_1       
        //    13: aload_1        
        //    14: invokespecial   asig.<init>:()V
        //    17: new             Ljava/util/HashSet;
        //    20: astore_2       
        //    21: aload_2        
        //    22: invokespecial   java/util/HashSet.<init>:()V
        //    25: aload_0        
        //    26: getfield        asik.a:Ljava/util/List;
        //    29: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    34: astore_3       
        //    35: aload_1        
        //    36: astore          4
        //    38: aload_3        
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            291
        //    47: aload_3        
        //    48: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    53: checkcast       Ljava/lang/Throwable;
        //    56: astore          5
        //    58: aload_2        
        //    59: aload           5
        //    61: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    66: ifne            38
        //    69: aload_2        
        //    70: aload           5
        //    72: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    77: pop            
        //    78: new             Ljava/util/ArrayList;
        //    81: astore          6
        //    83: aload           6
        //    85: invokespecial   java/util/ArrayList.<init>:()V
        //    88: aload           5
        //    90: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //    93: astore          7
        //    95: aload           7
        //    97: ifnull          150
        //   100: aload           7
        //   102: astore          8
        //   104: aload           7
        //   106: aload           5
        //   108: if_acmpne       114
        //   111: goto            150
        //   114: aload           6
        //   116: aload           8
        //   118: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   123: pop            
        //   124: aload           8
        //   126: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   129: astore          7
        //   131: aload           7
        //   133: ifnull          150
        //   136: aload           7
        //   138: aload           8
        //   140: if_acmpeq       150
        //   143: aload           7
        //   145: astore          8
        //   147: goto            114
        //   150: aload           6
        //   152: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   157: astore          7
        //   159: aload           5
        //   161: astore          8
        //   163: aload           7
        //   165: invokeinterface java/util/Iterator.hasNext:()Z
        //   170: ifeq            222
        //   173: aload           7
        //   175: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   180: checkcast       Ljava/lang/Throwable;
        //   183: astore          5
        //   185: aload_2        
        //   186: aload           5
        //   188: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   193: ifeq            210
        //   196: new             Ljava/lang/RuntimeException;
        //   199: dup            
        //   200: ldc             "Duplicate found in causal chain so cropping to prevent loop ..."
        //   202: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   205: astore          8
        //   207: goto            163
        //   210: aload_2        
        //   211: aload           5
        //   213: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   218: pop            
        //   219: goto            163
        //   222: aload           4
        //   224: aload           8
        //   226: invokevirtual   java/lang/Throwable.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
        //   229: pop            
        //   230: aload           4
        //   232: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   235: astore          8
        //   237: aload           8
        //   239: ifnull          38
        //   242: aload           4
        //   244: aload           8
        //   246: if_acmpeq       38
        //   249: aload           8
        //   251: astore          4
        //   253: aload           4
        //   255: astore          8
        //   257: aload           8
        //   259: invokevirtual   java/lang/Throwable.getCause:()Ljava/lang/Throwable;
        //   262: astore          5
        //   264: aload           8
        //   266: astore          4
        //   268: aload           5
        //   270: ifnull          38
        //   273: aload           8
        //   275: astore          4
        //   277: aload           5
        //   279: aload           8
        //   281: if_acmpeq       38
        //   284: aload           5
        //   286: astore          4
        //   288: goto            253
        //   291: aload_0        
        //   292: aload_1        
        //   293: putfield        asik.c:Ljava/lang/Throwable;
        //   296: aload_0        
        //   297: getfield        asik.c:Ljava/lang/Throwable;
        //   300: astore          4
        //   302: aload_0        
        //   303: monitorexit    
        //   304: aload           4
        //   306: areturn        
        //   307: astore          4
        //   309: aload_0        
        //   310: monitorexit    
        //   311: goto            317
        //   314: aload           4
        //   316: athrow         
        //   317: goto            314
        //   320: astore          8
        //   322: goto            230
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      35     307    320    Any
        //  38     95     307    320    Any
        //  114    131    307    320    Any
        //  150    159    307    320    Any
        //  163    207    307    320    Any
        //  210    219    307    320    Any
        //  222    230    320    325    Any
        //  230    237    307    320    Any
        //  257    264    307    320    Any
        //  291    296    307    320    Any
        //  296    302    307    320    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0222:
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
        this.b((asih)new asii(printStream));
    }
    
    @Override
    public final void printStackTrace(final PrintWriter printWriter) {
        this.b((asih)new asij(printWriter));
    }
}
