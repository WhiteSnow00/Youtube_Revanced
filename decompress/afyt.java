import java.util.concurrent.ConcurrentMap;
import java.util.Iterator;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afyt
{
    private final agfg a;
    private final agdl b;
    
    private afyt(final agfg a) {
        this.a = a;
        this.b = agdl.a;
    }
    
    public static final afyt a(final agfg agfg) {
        if (agfg != null && agfg.c.size() > 0) {
            return new afyt(agfg);
        }
        throw new GeneralSecurityException("empty keyset");
    }
    
    public static final afyt c(final agpb p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        agpb.a:Ljava/lang/Object;
        //     4: astore_1       
        //     5: getstatic       com/google/protobuf/ExtensionRegistryLite.a:Lcom/google/protobuf/ExtensionRegistryLite;
        //     8: astore_2       
        //     9: getstatic       agfg.a:Lagfg;
        //    12: aload_1        
        //    13: checkcast       Ljava/io/InputStream;
        //    16: aload_2        
        //    17: invokestatic    ahcz.parseFrom:(Lahcz;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lahcz;
        //    20: checkcast       Lagfg;
        //    23: astore          4
        //    25: aload_0        
        //    26: getfield        agpb.a:Ljava/lang/Object;
        //    29: checkcast       Ljava/io/InputStream;
        //    32: invokevirtual   java/io/InputStream.close:()V
        //    35: aload           4
        //    37: getfield        agfg.c:Lahdp;
        //    40: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    45: astore          5
        //    47: aload           5
        //    49: invokeinterface java/util/Iterator.hasNext:()Z
        //    54: ifeq            271
        //    57: aload           5
        //    59: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    64: checkcast       Lagff;
        //    67: astore_3       
        //    68: aload_3        
        //    69: getfield        agff.b:Lagfc;
        //    72: astore_1       
        //    73: aload_1        
        //    74: astore_0       
        //    75: aload_1        
        //    76: ifnonnull       83
        //    79: getstatic       agfc.a:Lagfc;
        //    82: astore_0       
        //    83: aload_0        
        //    84: getfield        agfc.d:I
        //    87: invokestatic    agfb.a:(I)Lagfb;
        //    90: astore_1       
        //    91: aload_1        
        //    92: astore_0       
        //    93: aload_1        
        //    94: ifnonnull       101
        //    97: getstatic       agfb.f:Lagfb;
        //   100: astore_0       
        //   101: aload_0        
        //   102: getstatic       agfb.a:Lagfb;
        //   105: if_acmpeq       186
        //   108: aload_3        
        //   109: getfield        agff.b:Lagfc;
        //   112: astore_0       
        //   113: aload_0        
        //   114: ifnonnull       124
        //   117: getstatic       agfc.a:Lagfc;
        //   120: astore_1       
        //   121: goto            126
        //   124: aload_0        
        //   125: astore_1       
        //   126: aload_1        
        //   127: getfield        agfc.d:I
        //   130: invokestatic    agfb.a:(I)Lagfb;
        //   133: astore_2       
        //   134: aload_2        
        //   135: astore_1       
        //   136: aload_2        
        //   137: ifnonnull       144
        //   140: getstatic       agfb.f:Lagfb;
        //   143: astore_1       
        //   144: aload_1        
        //   145: getstatic       agfb.b:Lagfb;
        //   148: if_acmpeq       186
        //   151: aload_0        
        //   152: astore_1       
        //   153: aload_0        
        //   154: ifnonnull       161
        //   157: getstatic       agfc.a:Lagfc;
        //   160: astore_1       
        //   161: aload_1        
        //   162: getfield        agfc.d:I
        //   165: invokestatic    agfb.a:(I)Lagfb;
        //   168: astore_1       
        //   169: aload_1        
        //   170: astore_0       
        //   171: aload_1        
        //   172: ifnonnull       179
        //   175: getstatic       agfb.f:Lagfb;
        //   178: astore_0       
        //   179: aload_0        
        //   180: getstatic       agfb.c:Lagfb;
        //   183: if_acmpne       47
        //   186: new             Ljava/security/GeneralSecurityException;
        //   189: astore_2       
        //   190: aload_3        
        //   191: getfield        agff.b:Lagfc;
        //   194: astore_1       
        //   195: aload_1        
        //   196: astore_0       
        //   197: aload_1        
        //   198: ifnonnull       205
        //   201: getstatic       agfc.a:Lagfc;
        //   204: astore_0       
        //   205: aload_0        
        //   206: getfield        agfc.d:I
        //   209: invokestatic    agfb.a:(I)Lagfb;
        //   212: astore_1       
        //   213: aload_1        
        //   214: astore_0       
        //   215: aload_1        
        //   216: ifnonnull       223
        //   219: getstatic       agfb.f:Lagfb;
        //   222: astore_0       
        //   223: aload_0        
        //   224: invokevirtual   agfb.name:()Ljava/lang/String;
        //   227: astore          4
        //   229: aload_3        
        //   230: getfield        agff.b:Lagfc;
        //   233: astore_1       
        //   234: aload_1        
        //   235: astore_0       
        //   236: aload_1        
        //   237: ifnonnull       244
        //   240: getstatic       agfc.a:Lagfc;
        //   243: astore_0       
        //   244: aload_2        
        //   245: ldc             "keyset contains key material of type %s for type url %s"
        //   247: iconst_2       
        //   248: anewarray       Ljava/lang/Object;
        //   251: dup            
        //   252: iconst_0       
        //   253: aload           4
        //   255: aastore        
        //   256: dup            
        //   257: iconst_1       
        //   258: aload_0        
        //   259: getfield        agfc.b:Ljava/lang/String;
        //   262: aastore        
        //   263: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   266: invokespecial   java/security/GeneralSecurityException.<init>:(Ljava/lang/String;)V
        //   269: aload_2        
        //   270: athrow         
        //   271: aload           4
        //   273: invokestatic    afyt.a:(Lagfg;)Lafyt;
        //   276: areturn        
        //   277: astore_1       
        //   278: aload_0        
        //   279: getfield        agpb.a:Ljava/lang/Object;
        //   282: checkcast       Ljava/io/InputStream;
        //   285: invokevirtual   java/io/InputStream.close:()V
        //   288: aload_1        
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
        //  0      25     277    290    Any
        //  25     47     290    309    Lahds;
        //  47     73     290    309    Lahds;
        //  79     83     290    309    Lahds;
        //  83     91     290    309    Lahds;
        //  97     101    290    309    Lahds;
        //  101    113    290    309    Lahds;
        //  117    121    290    309    Lahds;
        //  126    134    290    309    Lahds;
        //  140    144    290    309    Lahds;
        //  144    151    290    309    Lahds;
        //  157    161    290    309    Lahds;
        //  161    169    290    309    Lahds;
        //  175    179    290    309    Lahds;
        //  179    186    290    309    Lahds;
        //  186    195    290    309    Lahds;
        //  201    205    290    309    Lahds;
        //  205    213    290    309    Lahds;
        //  219    223    290    309    Lahds;
        //  223    234    290    309    Lahds;
        //  240    244    290    309    Lahds;
        //  244    271    290    309    Lahds;
        //  271    277    290    309    Lahds;
        //  278    290    290    309    Lahds;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0047:
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
        final afza afza = (afza)afzd.a.get(clazz);
        Class a;
        if (afza == null) {
            a = null;
        }
        else {
            a = afza.a();
        }
        if (a == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(clazz.getName())));
        }
        afze.b(this.a);
        final afyx afyx = new afyx(a);
        final agdl b = this.b;
        if (afyx.b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        afyx.d = b;
        for (final agff agff : this.a.c) {
            final int t = aexq.T(agff.c);
            if (t != 0 && t == 3) {
                agfc agfc;
                if ((agfc = agff.b) == null) {
                    agfc = agfc.a;
                }
                final Object d = afzd.d(agfc, a);
                if (agff.d == this.a.b) {
                    afyx.a(d, agff, true);
                }
                else {
                    afyx.a(d, agff, false);
                }
            }
        }
        final ConcurrentMap b2 = afyx.b;
        if (b2 == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        final ahei ahei = new ahei(b2, afyx.c, afyx.d, afyx.a);
        afyx.b = null;
        final afza afza2 = (afza)afzd.a.get(clazz);
        if (afza2 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(((Class)ahei.a).getName())));
        }
        if (afza2.a().equals(ahei.a)) {
            return afza2.c(ahei);
        }
        final String string = afza2.a().toString();
        final String string2 = ahei.a.toString();
        final StringBuilder sb = new StringBuilder("Wrong input primitive class, expected ");
        sb.append(string);
        sb.append(", got ");
        sb.append(string2);
        throw new GeneralSecurityException(sb.toString());
    }
    
    @Override
    public final String toString() {
        return ((ahcz)afze.a(this.a)).toString();
    }
}
