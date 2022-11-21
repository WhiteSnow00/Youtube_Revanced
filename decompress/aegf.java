import org.xmlpull.v1.XmlPullParserException;
import java.io.File;
import org.xmlpull.v1.XmlPullParser;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegf
{
    private static final aefs c;
    public final XmlPullParser a;
    public final agmu b;
    
    static {
        c = new aefs("LocalTestingConfigParser", null);
    }
    
    public aegf(final XmlPullParser a) {
        this.a = a;
        this.b = aegc.a();
    }
    
    public static aegc a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0        
        //     5: ldc             "local_testing_config.xml"
        //     7: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    10: astore_1       
        //    11: aload_1        
        //    12: invokevirtual   java/io/File.exists:()Z
        //    15: ifne            22
        //    18: getstatic       aegc.a:Laegc;
        //    21: areturn        
        //    22: new             Ljava/io/FileReader;
        //    25: astore_0       
        //    26: aload_0        
        //    27: aload_1        
        //    28: invokespecial   java/io/FileReader.<init>:(Ljava/io/File;)V
        //    31: invokestatic    org/xmlpull/v1/XmlPullParserFactory.newInstance:()Lorg/xmlpull/v1/XmlPullParserFactory;
        //    34: invokevirtual   org/xmlpull/v1/XmlPullParserFactory.newPullParser:()Lorg/xmlpull/v1/XmlPullParser;
        //    37: astore_2       
        //    38: aload_2        
        //    39: aload_0        
        //    40: invokeinterface org/xmlpull/v1/XmlPullParser.setInput:(Ljava/io/Reader;)V
        //    45: new             Laegf;
        //    48: astore_1       
        //    49: aload_1        
        //    50: aload_2        
        //    51: invokespecial   aegf.<init>:(Lorg/xmlpull/v1/XmlPullParser;)V
        //    54: new             Laegd;
        //    57: astore_2       
        //    58: aload_2        
        //    59: aload_1        
        //    60: iconst_2       
        //    61: invokespecial   aegd.<init>:(Laegf;I)V
        //    64: aload_1        
        //    65: ldc             "local-testing-config"
        //    67: aload_2        
        //    68: invokevirtual   aegf.b:(Ljava/lang/String;Laege;)V
        //    71: aload_1        
        //    72: getfield        aegf.b:Lagmu;
        //    75: invokevirtual   agmu.g:()Laegc;
        //    78: astore_1       
        //    79: aload_0        
        //    80: invokevirtual   java/io/FileReader.close:()V
        //    83: aload_1        
        //    84: areturn        
        //    85: astore_1       
        //    86: aload_0        
        //    87: invokevirtual   java/io/FileReader.close:()V
        //    90: goto            123
        //    93: astore_0       
        //    94: ldc             Ljava/lang/Throwable;.class
        //    96: ldc             "addSuppressed"
        //    98: iconst_1       
        //    99: anewarray       Ljava/lang/Class;
        //   102: dup            
        //   103: iconst_0       
        //   104: ldc             Ljava/lang/Throwable;.class
        //   106: aastore        
        //   107: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   110: aload_1        
        //   111: iconst_1       
        //   112: anewarray       Ljava/lang/Object;
        //   115: dup            
        //   116: iconst_0       
        //   117: aload_0        
        //   118: aastore        
        //   119: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   122: pop            
        //   123: aload_1        
        //   124: athrow         
        //   125: astore_0       
        //   126: goto            134
        //   129: astore_0       
        //   130: goto            134
        //   133: astore_0       
        //   134: getstatic       aegf.c:Laefs;
        //   137: ldc             "%s can not be parsed, using default. Error: %s"
        //   139: iconst_2       
        //   140: anewarray       Ljava/lang/Object;
        //   143: dup            
        //   144: iconst_0       
        //   145: ldc             "local_testing_config.xml"
        //   147: aastore        
        //   148: dup            
        //   149: iconst_1       
        //   150: aload_0        
        //   151: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   154: aastore        
        //   155: invokevirtual   aefs.j:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   158: getstatic       aegc.a:Laegc;
        //   161: areturn        
        //   162: astore_0       
        //   163: goto            123
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  22     31     133    134    Ljava/io/IOException;
        //  22     31     129    133    Lorg/xmlpull/v1/XmlPullParserException;
        //  22     31     125    129    Ljava/lang/RuntimeException;
        //  31     79     85     125    Any
        //  79     83     133    134    Ljava/io/IOException;
        //  79     83     129    133    Lorg/xmlpull/v1/XmlPullParserException;
        //  79     83     125    129    Ljava/lang/RuntimeException;
        //  86     90     93     123    Any
        //  94     123    162    166    Ljava/lang/Exception;
        //  123    125    133    134    Ljava/io/IOException;
        //  123    125    129    133    Lorg/xmlpull/v1/XmlPullParserException;
        //  123    125    125    129    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0123:
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
    
    public final void b(final String s, final aege aege) {
        while (true) {
            final int next = this.a.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.a.getEventType() != 2) {
                continue;
            }
            if (!this.a.getName().equals(s)) {
                throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", s, this.a.getName()), this.a, (Throwable)null);
            }
            aege.a();
        }
    }
}
