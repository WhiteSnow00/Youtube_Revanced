import java.util.concurrent.ConcurrentMap;
import java.util.Iterator;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvb
{
    private final agbn a;
    private final afzs b;
    
    private afvb(final agbn a) {
        this.a = a;
        this.b = afzs.a;
    }
    
    public static final afvb a(final agbn agbn) {
        if (agbn != null && agbn.c.size() > 0) {
            return new afvb(agbn);
        }
        throw new GeneralSecurityException("empty keyset");
    }
    
    public static final afvb c(final adcr p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        adcr.a:Ljava/lang/Object;
        //     4: astore_1       
        //     5: getstatic       com/google/protobuf/ExtensionRegistryLite.a:Lcom/google/protobuf/ExtensionRegistryLite;
        //     8: astore_2       
        //     9: getstatic       agbn.a:Lagbn;
        //    12: aload_1        
        //    13: checkcast       Ljava/io/InputStream;
        //    16: aload_2        
        //    17: invokestatic    agzi.parseFrom:(Lagzi;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lagzi;
        //    20: checkcast       Lagbn;
        //    23: astore_3       
        //    24: aload_0        
        //    25: getfield        adcr.a:Ljava/lang/Object;
        //    28: checkcast       Ljava/io/InputStream;
        //    31: invokevirtual   java/io/InputStream.close:()V
        //    34: aload_3        
        //    35: getfield        agbn.c:Lagzy;
        //    38: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    43: astore          4
        //    45: aload           4
        //    47: invokeinterface java/util/Iterator.hasNext:()Z
        //    52: ifeq            272
        //    55: aload           4
        //    57: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    62: checkcast       Lagbm;
        //    65: astore          5
        //    67: aload           5
        //    69: getfield        agbm.b:Lagbj;
        //    72: astore_2       
        //    73: aload_2        
        //    74: astore_0       
        //    75: aload_2        
        //    76: ifnonnull       83
        //    79: getstatic       agbj.a:Lagbj;
        //    82: astore_0       
        //    83: aload_0        
        //    84: getfield        agbj.d:I
        //    87: invokestatic    agbi.a:(I)Lagbi;
        //    90: astore_2       
        //    91: aload_2        
        //    92: astore_0       
        //    93: aload_2        
        //    94: ifnonnull       101
        //    97: getstatic       agbi.f:Lagbi;
        //   100: astore_0       
        //   101: aload_0        
        //   102: getstatic       agbi.a:Lagbi;
        //   105: if_acmpeq       187
        //   108: aload           5
        //   110: getfield        agbm.b:Lagbj;
        //   113: astore_0       
        //   114: aload_0        
        //   115: ifnonnull       125
        //   118: getstatic       agbj.a:Lagbj;
        //   121: astore_2       
        //   122: goto            127
        //   125: aload_0        
        //   126: astore_2       
        //   127: aload_2        
        //   128: getfield        agbj.d:I
        //   131: invokestatic    agbi.a:(I)Lagbi;
        //   134: astore_1       
        //   135: aload_1        
        //   136: astore_2       
        //   137: aload_1        
        //   138: ifnonnull       145
        //   141: getstatic       agbi.f:Lagbi;
        //   144: astore_2       
        //   145: aload_2        
        //   146: getstatic       agbi.b:Lagbi;
        //   149: if_acmpeq       187
        //   152: aload_0        
        //   153: astore_2       
        //   154: aload_0        
        //   155: ifnonnull       162
        //   158: getstatic       agbj.a:Lagbj;
        //   161: astore_2       
        //   162: aload_2        
        //   163: getfield        agbj.d:I
        //   166: invokestatic    agbi.a:(I)Lagbi;
        //   169: astore_2       
        //   170: aload_2        
        //   171: astore_0       
        //   172: aload_2        
        //   173: ifnonnull       180
        //   176: getstatic       agbi.f:Lagbi;
        //   179: astore_0       
        //   180: aload_0        
        //   181: getstatic       agbi.c:Lagbi;
        //   184: if_acmpne       45
        //   187: new             Ljava/security/GeneralSecurityException;
        //   190: astore_1       
        //   191: aload           5
        //   193: getfield        agbm.b:Lagbj;
        //   196: astore_2       
        //   197: aload_2        
        //   198: astore_0       
        //   199: aload_2        
        //   200: ifnonnull       207
        //   203: getstatic       agbj.a:Lagbj;
        //   206: astore_0       
        //   207: aload_0        
        //   208: getfield        agbj.d:I
        //   211: invokestatic    agbi.a:(I)Lagbi;
        //   214: astore_2       
        //   215: aload_2        
        //   216: astore_0       
        //   217: aload_2        
        //   218: ifnonnull       225
        //   221: getstatic       agbi.f:Lagbi;
        //   224: astore_0       
        //   225: aload_0        
        //   226: invokevirtual   agbi.name:()Ljava/lang/String;
        //   229: astore_3       
        //   230: aload           5
        //   232: getfield        agbm.b:Lagbj;
        //   235: astore_2       
        //   236: aload_2        
        //   237: astore_0       
        //   238: aload_2        
        //   239: ifnonnull       246
        //   242: getstatic       agbj.a:Lagbj;
        //   245: astore_0       
        //   246: aload_1        
        //   247: ldc             "keyset contains key material of type %s for type url %s"
        //   249: iconst_2       
        //   250: anewarray       Ljava/lang/Object;
        //   253: dup            
        //   254: iconst_0       
        //   255: aload_3        
        //   256: aastore        
        //   257: dup            
        //   258: iconst_1       
        //   259: aload_0        
        //   260: getfield        agbj.b:Ljava/lang/String;
        //   263: aastore        
        //   264: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   267: invokespecial   java/security/GeneralSecurityException.<init>:(Ljava/lang/String;)V
        //   270: aload_1        
        //   271: athrow         
        //   272: aload_3        
        //   273: invokestatic    afvb.a:(Lagbn;)Lafvb;
        //   276: areturn        
        //   277: astore_2       
        //   278: aload_0        
        //   279: getfield        adcr.a:Ljava/lang/Object;
        //   282: checkcast       Ljava/io/InputStream;
        //   285: invokevirtual   java/io/InputStream.close:()V
        //   288: aload_2        
        //   289: athrow         
        //   290: astore_0       
        //   291: new             Ljava/security/GeneralSecurityException;
        //   294: dup            
        //   295: ldc             "invalid keyset"
        //   297: invokespecial   java/security/GeneralSecurityException.<init>:(Ljava/lang/String;)V
        //   300: astore_0       
        //   301: goto            306
        //   304: aload_0        
        //   305: athrow         
        //   306: goto            304
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type  
        //  -----  -----  -----  -----  ------
        //  0      24     277    290    Any
        //  24     45     290    309    Lahab;
        //  45     73     290    309    Lahab;
        //  79     83     290    309    Lahab;
        //  83     91     290    309    Lahab;
        //  97     101    290    309    Lahab;
        //  101    114    290    309    Lahab;
        //  118    122    290    309    Lahab;
        //  127    135    290    309    Lahab;
        //  141    145    290    309    Lahab;
        //  145    152    290    309    Lahab;
        //  158    162    290    309    Lahab;
        //  162    170    290    309    Lahab;
        //  176    180    290    309    Lahab;
        //  180    187    290    309    Lahab;
        //  187    197    290    309    Lahab;
        //  203    207    290    309    Lahab;
        //  207    215    290    309    Lahab;
        //  221    225    290    309    Lahab;
        //  225    236    290    309    Lahab;
        //  242    246    290    309    Lahab;
        //  246    272    290    309    Lahab;
        //  272    277    290    309    Lahab;
        //  278    290    290    309    Lahab;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    
    public final Object b(final Class clazz) {
        final afvi afvi = (afvi)afvl.a.get(clazz);
        Class a;
        if (afvi == null) {
            a = null;
        }
        else {
            a = afvi.a();
        }
        if (a == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(clazz.getName())));
        }
        afvm.b(this.a);
        final afvf afvf = new afvf(a);
        final afzs b = this.b;
        if (afvf.b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        afvf.d = b;
        for (final agbm agbm : this.a.c) {
            final int ab = aety.ab(agbm.c);
            if (ab != 0 && ab == 3) {
                agbj agbj;
                if ((agbj = agbm.b) == null) {
                    agbj = agbj.a;
                }
                final Object d = afvl.d(agbj, a);
                if (agbm.d == this.a.b) {
                    afvf.a(d, agbm, true);
                }
                else {
                    afvf.a(d, agbm, false);
                }
            }
        }
        final ConcurrentMap b2 = afvf.b;
        if (b2 == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        final ahar ahar = new ahar(b2, afvf.c, afvf.d, afvf.a);
        afvf.b = null;
        final afvi afvi2 = (afvi)afvl.a.get(clazz);
        if (afvi2 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(((Class)ahar.a).getName())));
        }
        if (afvi2.a().equals(ahar.a)) {
            return afvi2.c(ahar);
        }
        final String string = afvi2.a().toString();
        final String string2 = ahar.a.toString();
        final StringBuilder sb = new StringBuilder("Wrong input primitive class, expected ");
        sb.append(string);
        sb.append(", got ");
        sb.append(string2);
        throw new GeneralSecurityException(sb.toString());
    }
    
    @Override
    public final String toString() {
        return afvm.a(this.a).toString();
    }
}
