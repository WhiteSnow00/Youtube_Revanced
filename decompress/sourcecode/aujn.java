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

public final class aujn implements aujk
{
    public final ClassLoader a;
    private final String b;
    private final Map c;
    private final Set d;
    
    public aujn() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: ldc             "org/joda/time/tz/data/"
        //     7: putfield        aujn.b:Ljava/lang/String;
        //    10: aload_0        
        //    11: aload_0        
        //    12: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    15: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    18: putfield        aujn.a:Ljava/lang/ClassLoader;
        //    21: aload_0        
        //    22: ldc             "ZoneInfoMap"
        //    24: invokespecial   aujn.c:(Ljava/lang/String;)Ljava/io/InputStream;
        //    27: astore_1       
        //    28: new             Lj$/util/concurrent/ConcurrentHashMap;
        //    31: dup            
        //    32: invokespecial   j$/util/concurrent/ConcurrentHashMap.<init>:()V
        //    35: astore_2       
        //    36: new             Ljava/io/DataInputStream;
        //    39: dup            
        //    40: aload_1        
        //    41: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    44: astore_1       
        //    45: aload_1        
        //    46: aload_2        
        //    47: invokestatic    aujn.e:(Ljava/io/DataInputStream;Ljava/util/Map;)V
        //    50: aload_1        
        //    51: invokevirtual   java/io/DataInputStream.close:()V
        //    54: aload_2        
        //    55: ldc             "UTC"
        //    57: new             Ljava/lang/ref/SoftReference;
        //    60: dup            
        //    61: getstatic       aufc.a:Laufc;
        //    64: invokespecial   java/lang/ref/SoftReference.<init>:(Ljava/lang/Object;)V
        //    67: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    72: pop            
        //    73: aload_0        
        //    74: aload_2        
        //    75: putfield        aujn.c:Ljava/util/Map;
        //    78: aload_0        
        //    79: new             Ljava/util/TreeSet;
        //    82: dup            
        //    83: aload_2        
        //    84: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    89: invokespecial   java/util/TreeSet.<init>:(Ljava/util/Collection;)V
        //    92: invokestatic    java/util/Collections.unmodifiableSortedSet:(Ljava/util/SortedSet;)Ljava/util/SortedSet;
        //    95: putfield        aujn.d:Ljava/util/Set;
        //    98: return         
        //    99: astore_2       
        //   100: aload_1        
        //   101: invokevirtual   java/io/DataInputStream.close:()V
        //   104: aload_2        
        //   105: athrow         
        //   106: astore_1       
        //   107: goto            54
        //   110: astore_1       
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
        final InputStream inputStream = AccessController.doPrivileged((PrivilegedAction<InputStream>)new aujm(this, s, 0));
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
    
    private final aufc d(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: aload_0        
        //     3: aload_1        
        //     4: invokespecial   aujn.c:(Ljava/lang/String;)Ljava/io/InputStream;
        //     7: astore_3       
        //     8: aload_3        
        //     9: astore_2       
        //    10: aload_3        
        //    11: instanceof      Ljava/io/DataInput;
        //    14: ifeq            32
        //    17: aload_3        
        //    18: astore_2       
        //    19: aload_3        
        //    20: checkcast       Ljava/io/DataInput;
        //    23: aload_1        
        //    24: invokestatic    aujh.b:(Ljava/io/DataInput;Ljava/lang/String;)Laufc;
        //    27: astore          4
        //    29: goto            57
        //    32: aload_3        
        //    33: astore_2       
        //    34: new             Ljava/io/DataInputStream;
        //    37: astore          4
        //    39: aload_3        
        //    40: astore_2       
        //    41: aload           4
        //    43: aload_3        
        //    44: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    47: aload_3        
        //    48: astore_2       
        //    49: aload           4
        //    51: aload_1        
        //    52: invokestatic    aujh.b:(Ljava/io/DataInput;Ljava/lang/String;)Laufc;
        //    55: astore          4
        //    57: aload_3        
        //    58: astore_2       
        //    59: aload_0        
        //    60: getfield        aujn.c:Ljava/util/Map;
        //    63: astore          5
        //    65: aload_3        
        //    66: astore_2       
        //    67: new             Ljava/lang/ref/SoftReference;
        //    70: astore          6
        //    72: aload_3        
        //    73: astore_2       
        //    74: aload           6
        //    76: aload           4
        //    78: invokespecial   java/lang/ref/SoftReference.<init>:(Ljava/lang/Object;)V
        //    81: aload_3        
        //    82: astore_2       
        //    83: aload           5
        //    85: aload_1        
        //    86: aload           6
        //    88: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    93: pop            
        //    94: aload_3        
        //    95: invokevirtual   java/io/InputStream.close:()V
        //    98: aload           4
        //   100: areturn        
        //   101: astore_1       
        //   102: goto            148
        //   105: astore          4
        //   107: goto            118
        //   110: astore_1       
        //   111: goto            148
        //   114: astore          4
        //   116: aconst_null    
        //   117: astore_3       
        //   118: aload_3        
        //   119: astore_2       
        //   120: aload           4
        //   122: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   125: aload_3        
        //   126: astore_2       
        //   127: aload_0        
        //   128: getfield        aujn.c:Ljava/util/Map;
        //   131: aload_1        
        //   132: invokeinterface java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   137: pop            
        //   138: aload_3        
        //   139: ifnull          146
        //   142: aload_3        
        //   143: invokevirtual   java/io/InputStream.close:()V
        //   146: aconst_null    
        //   147: areturn        
        //   148: aload_2        
        //   149: ifnull          156
        //   152: aload_2        
        //   153: invokevirtual   java/io/InputStream.close:()V
        //   156: aload_1        
        //   157: athrow         
        //   158: astore_1       
        //   159: goto            98
        //   162: astore_1       
        //   163: goto            146
        //   166: astore_2       
        //   167: goto            156
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      8      114    118    Ljava/io/IOException;
        //  2      8      110    114    Any
        //  10     17     105    110    Ljava/io/IOException;
        //  10     17     101    105    Any
        //  19     29     105    110    Ljava/io/IOException;
        //  19     29     101    105    Any
        //  34     39     105    110    Ljava/io/IOException;
        //  34     39     101    105    Any
        //  41     47     105    110    Ljava/io/IOException;
        //  41     47     101    105    Any
        //  49     57     105    110    Ljava/io/IOException;
        //  49     57     101    105    Any
        //  59     65     105    110    Ljava/io/IOException;
        //  59     65     101    105    Any
        //  67     72     105    110    Ljava/io/IOException;
        //  67     72     101    105    Any
        //  74     81     105    110    Ljava/io/IOException;
        //  74     81     101    105    Any
        //  83     94     105    110    Ljava/io/IOException;
        //  83     94     101    105    Any
        //  94     98     158    162    Ljava/io/IOException;
        //  120    125    101    105    Any
        //  127    138    101    105    Any
        //  142    146    162    166    Ljava/io/IOException;
        //  152    156    166    170    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 97, Size: 97
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
    
    public final aufc b(final String s) {
        if (s == null) {
            return null;
        }
        final String value = this.c.get(s);
        if (value == null) {
            return null;
        }
        if (value instanceof SoftReference) {
            final aufc aufc = ((SoftReference<aufc>)value).get();
            if (aufc != null) {
                return aufc;
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
