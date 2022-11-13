import java.lang.ref.SoftReference;
import java.io.DataInputStream;
import java.io.IOException;
import java.security.PrivilegedAction;
import java.security.AccessController;
import java.io.InputStream;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aukd implements auka
{
    public final ClassLoader a;
    private final String b;
    private final Map c;
    private final Set d;
    
    public aukd() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: ldc             "org/joda/time/tz/data/"
        //     7: putfield        aukd.b:Ljava/lang/String;
        //    10: aload_0        
        //    11: aload_0        
        //    12: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    15: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    18: putfield        aukd.a:Ljava/lang/ClassLoader;
        //    21: aload_0        
        //    22: ldc             "ZoneInfoMap"
        //    24: invokespecial   aukd.c:(Ljava/lang/String;)Ljava/io/InputStream;
        //    27: astore_2       
        //    28: new             Lj$/util/concurrent/ConcurrentHashMap;
        //    31: dup            
        //    32: invokespecial   j$/util/concurrent/ConcurrentHashMap.<init>:()V
        //    35: astore_1       
        //    36: new             Ljava/io/DataInputStream;
        //    39: dup            
        //    40: aload_2        
        //    41: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    44: astore_2       
        //    45: aload_2        
        //    46: aload_1        
        //    47: invokestatic    aukd.e:(Ljava/io/DataInputStream;Ljava/util/Map;)V
        //    50: aload_2        
        //    51: invokevirtual   java/io/DataInputStream.close:()V
        //    54: aload_1        
        //    55: ldc             "UTC"
        //    57: new             Ljava/lang/ref/SoftReference;
        //    60: dup            
        //    61: getstatic       auft.a:Lauft;
        //    64: invokespecial   java/lang/ref/SoftReference.<init>:(Ljava/lang/Object;)V
        //    67: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    72: pop            
        //    73: aload_0        
        //    74: aload_1        
        //    75: putfield        aukd.c:Ljava/util/Map;
        //    78: aload_0        
        //    79: new             Ljava/util/TreeSet;
        //    82: dup            
        //    83: aload_1        
        //    84: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    89: invokespecial   java/util/TreeSet.<init>:(Ljava/util/Collection;)V
        //    92: invokestatic    java/util/Collections.unmodifiableSortedSet:(Ljava/util/SortedSet;)Ljava/util/SortedSet;
        //    95: putfield        aukd.d:Ljava/util/Set;
        //    98: return         
        //    99: astore_1       
        //   100: aload_2        
        //   101: invokevirtual   java/io/DataInputStream.close:()V
        //   104: aload_1        
        //   105: athrow         
        //   106: astore_2       
        //   107: goto            54
        //   110: astore_2       
        //   111: goto            104
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  45     50     99     106    Any
        //  50     54     106    110    Ljava/io/IOException;
        //  100    104    110    114    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 57, Size: 57
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    private final InputStream c(String s) {
        s = this.b.concat(s);
        final InputStream inputStream = AccessController.doPrivileged((PrivilegedAction<InputStream>)new aukc(this, s, 0));
        if (inputStream == null) {
            final StringBuilder sb = new StringBuilder(40);
            sb.append("Resource not found: \"");
            sb.append(s);
            sb.append("\" ClassLoader: ");
            final ClassLoader a = this.a;
            if (a != null) {
                s = a.toString();
            }
            else {
                s = "system";
            }
            sb.append(s);
            throw new IOException(sb.toString());
        }
        return inputStream;
    }
    
    private final auft d(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: aload_0        
        //     4: aload_1        
        //     5: invokespecial   aukd.c:(Ljava/lang/String;)Ljava/io/InputStream;
        //     8: astore_3       
        //     9: aload_3        
        //    10: astore_2       
        //    11: aload_3        
        //    12: instanceof      Ljava/io/DataInput;
        //    15: ifeq            33
        //    18: aload_3        
        //    19: astore_2       
        //    20: aload_3        
        //    21: checkcast       Ljava/io/DataInput;
        //    24: aload_1        
        //    25: invokestatic    aucl.f:(Ljava/io/DataInput;Ljava/lang/String;)Lauft;
        //    28: astore          4
        //    30: goto            58
        //    33: aload_3        
        //    34: astore_2       
        //    35: new             Ljava/io/DataInputStream;
        //    38: astore          4
        //    40: aload_3        
        //    41: astore_2       
        //    42: aload           4
        //    44: aload_3        
        //    45: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    48: aload_3        
        //    49: astore_2       
        //    50: aload           4
        //    52: aload_1        
        //    53: invokestatic    aucl.f:(Ljava/io/DataInput;Ljava/lang/String;)Lauft;
        //    56: astore          4
        //    58: aload_3        
        //    59: astore_2       
        //    60: aload_0        
        //    61: getfield        aukd.c:Ljava/util/Map;
        //    64: astore          6
        //    66: aload_3        
        //    67: astore_2       
        //    68: new             Ljava/lang/ref/SoftReference;
        //    71: astore          5
        //    73: aload_3        
        //    74: astore_2       
        //    75: aload           5
        //    77: aload           4
        //    79: invokespecial   java/lang/ref/SoftReference.<init>:(Ljava/lang/Object;)V
        //    82: aload_3        
        //    83: astore_2       
        //    84: aload           6
        //    86: aload_1        
        //    87: aload           5
        //    89: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    94: pop            
        //    95: aload_3        
        //    96: invokevirtual   java/io/InputStream.close:()V
        //    99: aload           4
        //   101: areturn        
        //   102: astore_3       
        //   103: aload_2        
        //   104: astore_1       
        //   105: aload_3        
        //   106: astore_2       
        //   107: goto            156
        //   110: astore          4
        //   112: goto            126
        //   115: astore_2       
        //   116: aload           4
        //   118: astore_1       
        //   119: goto            156
        //   122: astore          4
        //   124: aconst_null    
        //   125: astore_3       
        //   126: aload_3        
        //   127: astore_2       
        //   128: aload           4
        //   130: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   133: aload_3        
        //   134: astore_2       
        //   135: aload_0        
        //   136: getfield        aukd.c:Ljava/util/Map;
        //   139: aload_1        
        //   140: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   145: pop            
        //   146: aload_3        
        //   147: ifnull          154
        //   150: aload_3        
        //   151: invokevirtual   java/io/InputStream.close:()V
        //   154: aconst_null    
        //   155: areturn        
        //   156: aload_1        
        //   157: ifnull          164
        //   160: aload_1        
        //   161: invokevirtual   java/io/InputStream.close:()V
        //   164: aload_2        
        //   165: athrow         
        //   166: astore_1       
        //   167: goto            99
        //   170: astore_1       
        //   171: goto            154
        //   174: astore_1       
        //   175: goto            164
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      9      122    126    Ljava/io/IOException;
        //  3      9      115    122    Any
        //  11     18     110    115    Ljava/io/IOException;
        //  11     18     102    110    Any
        //  20     30     110    115    Ljava/io/IOException;
        //  20     30     102    110    Any
        //  35     40     110    115    Ljava/io/IOException;
        //  35     40     102    110    Any
        //  42     48     110    115    Ljava/io/IOException;
        //  42     48     102    110    Any
        //  50     58     110    115    Ljava/io/IOException;
        //  50     58     102    110    Any
        //  60     66     110    115    Ljava/io/IOException;
        //  60     66     102    110    Any
        //  68     73     110    115    Ljava/io/IOException;
        //  68     73     102    110    Any
        //  75     82     110    115    Ljava/io/IOException;
        //  75     82     102    110    Any
        //  84     95     110    115    Ljava/io/IOException;
        //  84     95     102    110    Any
        //  95     99     166    170    Ljava/io/IOException;
        //  128    133    102    110    Any
        //  135    146    102    110    Any
        //  150    154    170    174    Ljava/io/IOException;
        //  160    164    174    178    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 103, Size: 103
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    private static void e(final DataInputStream dataInputStream, final Map map) {
        final int unsignedShort = dataInputStream.readUnsignedShort();
        final String[] array = new String[unsignedShort];
        final int n = 0;
        for (int i = 0; i < unsignedShort; ++i) {
            array[i] = dataInputStream.readUTF().intern();
        }
        final int unsignedShort2 = dataInputStream.readUnsignedShort();
        int j = n;
        while (j < unsignedShort2) {
            try {
                map.put(array[dataInputStream.readUnsignedShort()], array[dataInputStream.readUnsignedShort()]);
                ++j;
                continue;
            }
            catch (final ArrayIndexOutOfBoundsException ex) {
                throw new IOException("Corrupt zone info map");
            }
            break;
        }
    }
    
    public final Set a() {
        return this.d;
    }
    
    public final auft b(final String s) {
        if (s == null) {
            return null;
        }
        final String value = this.c.get(s);
        if (value == null) {
            return null;
        }
        if (value instanceof SoftReference) {
            final auft auft = ((SoftReference<auft>)value).get();
            if (auft != null) {
                return auft;
            }
            return this.d(s);
        }
        else {
            if (s.equals(value)) {
                return this.d(s);
            }
            return this.b(value);
        }
    }
}
