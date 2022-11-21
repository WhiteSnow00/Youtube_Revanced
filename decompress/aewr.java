import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public class aewr
{
    public static int A(final int n) {
        final int n2 = n - 2;
        if (n2 == 2) {
            return 1;
        }
        if (n2 == 3) {
            return 2;
        }
        if (n2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(o(n))));
    }
    
    public static int B(final int n) {
        final int n2 = n - 2;
        int n3 = 1;
        if (n2 != 1) {
            n3 = 2;
            if (n2 != 2) {
                if (n2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(r(n))));
            }
        }
        return n3;
    }
    
    public static boolean C(final int n) {
        if (n - 1 != 0) {
            if (agau.a()) {
                Boolean value;
                try {
                    value = (Boolean)Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
                }
                catch (final Exception ex) {
                    agau.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                    value = false;
                }
                if (!value) {
                    return false;
                }
            }
            return true;
        }
        return !agau.a();
    }
    
    public static long D(final byte[] array, final int n, final int n2) {
        return E(array, n) >> n2 & 0x3FFFFFFL;
    }
    
    public static long E(final byte[] array, final int n) {
        return (long)((array[n + 3] & 0xFF) << 24 | ((array[n + 1] & 0xFF) << 8 | (array[n] & 0xFF) | (array[n + 2] & 0xFF) << 16)) & 0xFFFFFFFFL;
    }
    
    public static void F(final byte[] array, long n, final int n2) {
        for (int i = 0; i < 4; ++i) {
            array[n2 + i] = (byte)(0xFFL & n);
            n >>= 8;
        }
    }
    
    public static Object G(final Future future) {
        int n = 0;
        while (true) {
            try {
                final Object value = future.get();
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
                return value;
            }
            catch (final InterruptedException ex) {
                n = 1;
                continue;
            }
            finally {
                if (n != 0) {
                    Thread.currentThread().interrupt();
                }
            }
            break;
        }
    }
    
    public static Object H(final Future p0, final long p1, final TimeUnit p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          5
        //     3: iconst_0       
        //     4: istore          6
        //     6: iload           5
        //     8: istore          4
        //    10: aload_3        
        //    11: lload_1        
        //    12: invokevirtual   java/util/concurrent/TimeUnit.toNanos:(J)J
        //    15: lstore          7
        //    17: iload           5
        //    19: istore          4
        //    21: invokestatic    java/lang/System.nanoTime:()J
        //    24: lstore          9
        //    26: lload           7
        //    28: lstore_1       
        //    29: iload           6
        //    31: istore          5
        //    33: iload           5
        //    35: istore          4
        //    37: aload_0        
        //    38: lload_1        
        //    39: getstatic       java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
        //    42: invokeinterface java/util/concurrent/Future.get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
        //    47: astore_3       
        //    48: iload           5
        //    50: ifeq            59
        //    53: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    56: invokevirtual   java/lang/Thread.interrupt:()V
        //    59: aload_3        
        //    60: areturn        
        //    61: astore_0       
        //    62: goto            87
        //    65: astore_3       
        //    66: iconst_1       
        //    67: istore          4
        //    69: iconst_1       
        //    70: istore          5
        //    72: invokestatic    java/lang/System.nanoTime:()J
        //    75: lstore_1       
        //    76: lload           9
        //    78: lload           7
        //    80: ladd           
        //    81: lload_1        
        //    82: lsub           
        //    83: lstore_1       
        //    84: goto            33
        //    87: iload           4
        //    89: ifeq            98
        //    92: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    95: invokevirtual   java/lang/Thread.interrupt:()V
        //    98: goto            103
        //   101: aload_0        
        //   102: athrow         
        //   103: goto            101
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  10     17     61     106    Any
        //  21     26     61     106    Any
        //  37     48     65     87     Ljava/lang/InterruptedException;
        //  37     48     61     106    Any
        //  72     76     61     106    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
    
    public static void I(final Throwable t) {
        if (t instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
    
    public static void J(final ahei ahei) {
        final ArrayList list = new ArrayList();
        final agdl a = agdl.a;
        final Iterator iterator = ahei.a().iterator();
        while (iterator.hasNext()) {
            for (final afyy afyy : (List)iterator.next()) {
                final int n = afyy.e - 2;
                afys afys;
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            throw new IllegalStateException("Unknown key status");
                        }
                        afys = afys.c;
                    }
                    else {
                        afys = afys.b;
                    }
                }
                else {
                    afys = afys.a;
                }
                list.add(new agdm(afys, afyy.c, afyy.d.a(), (byte[])null, (byte[])null, (byte[])null));
            }
        }
        final Object c = ahei.c;
        Integer value;
        if (c != null) {
            value = ((afyy)c).c;
        }
        else {
            value = null;
        }
        Label_0251: {
            if (value == null) {
                break Label_0251;
            }
            try {
                final int intValue = value;
                final int size = list.size();
                int i = 0;
                while (i < size) {
                    final int a2 = ((agdm)list.get(i)).a;
                    ++i;
                    if (a2 == intValue) {
                        Collections.unmodifiableList((List<?>)list);
                        return;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            catch (final GeneralSecurityException ex) {
                throw new IllegalStateException(ex);
            }
        }
    }
    
    public static agpb K(final agey agey) {
        final int c = agey.c;
        final int w = aexq.W(c);
        if (w != 0) {
            if (w == 3) {
                return new agpb("HmacSha256");
            }
        }
        final int w2 = aexq.W(c);
        if (w2 != 0) {
            if (w2 == 4) {
                return new agpb("HmacSha384");
            }
        }
        final int w3 = aexq.W(c);
        if (w3 != 0 && w3 == 5) {
            return new agpb("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
    
    public static agpb L(final String s) {
        final agpb agpb = afzd.h().get(s);
        if (agpb != null) {
            return agpb;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(s));
    }
    
    public static adgg M(final Class clazz, final String s) {
        try {
            return new adgg(clazz.getDeclaredField(s));
        }
        catch (final NoSuchFieldException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static int N(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static int O(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int P(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int Q(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int R(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int S(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int T(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int U(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int V(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int W(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int X(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n == 4) {
            return 5;
        }
        if (n != 5) {
            return 0;
        }
        return 6;
    }
    
    public static int Y(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 10) {
            return 11;
        }
        if (n == 20) {
            return 21;
        }
        if (n == 30) {
            return 31;
        }
        if (n == 80) {
            return 81;
        }
        if (n != 100) {
            return 0;
        }
        return 101;
    }
    
    public static int Z(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static void a(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static int aa(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ab(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ac(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ad(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int ae(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n != 2) {
            return 0;
        }
        return 3;
    }
    
    public static int af(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int ag(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ah(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 38: {
                return 39;
            }
            case 37: {
                return 38;
            }
            case 36: {
                return 37;
            }
            case 35: {
                return 36;
            }
            case 34: {
                return 35;
            }
            case 33: {
                return 34;
            }
            case 32: {
                return 33;
            }
            case 31: {
                return 32;
            }
            case 30: {
                return 31;
            }
            case 29: {
                return 30;
            }
            case 28: {
                return 29;
            }
            case 27: {
                return 28;
            }
            case 26: {
                return 27;
            }
            case 25: {
                return 26;
            }
            case 24: {
                return 25;
            }
            case 23: {
                return 24;
            }
            case 22: {
                return 23;
            }
            case 21: {
                return 22;
            }
            case 20: {
                return 21;
            }
            case 19: {
                return 20;
            }
            case 18: {
                return 19;
            }
            case 17: {
                return 18;
            }
            case 16: {
                return 17;
            }
            case 15: {
                return 16;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int ai(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int aj(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ak(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int al(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int am(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int an(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ao(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ap(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int aq(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n != 3) {
            return 0;
        }
        return 4;
    }
    
    public static int ar(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1) {
            return 0;
        }
        return 2;
    }
    
    public static int as(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 3;
        }
        if (n == 3) {
            return 4;
        }
        if (n != 4) {
            return 0;
        }
        return 5;
    }
    
    private static int at(final char c) {
        return (char)((c | ' ') - 97);
    }
    
    public static String b(final String s) {
        for (int length = s.length(), i = 0; i < length; ++i) {
            if (f(s.charAt(i))) {
                final char[] charArray = s.toCharArray();
                while (i < length) {
                    final char c = charArray[i];
                    if (f(c)) {
                        charArray[i] = (char)(c ^ ' ');
                    }
                    ++i;
                }
                return String.valueOf(charArray);
            }
        }
        return s;
    }
    
    public static String c(final String s) {
        for (int length = s.length(), i = 0; i < length; ++i) {
            if (e(s.charAt(i))) {
                final char[] charArray = s.toCharArray();
                while (i < length) {
                    final char c = charArray[i];
                    if (e(c)) {
                        charArray[i] = (char)(c ^ ' ');
                    }
                    ++i;
                }
                return String.valueOf(charArray);
            }
        }
        return s;
    }
    
    public static boolean d(final CharSequence charSequence, final CharSequence charSequence2) {
        final int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i = 0; i < length; ++i) {
                final char char1 = charSequence.charAt(i);
                final char char2 = charSequence2.charAt(i);
                if (char1 != char2) {
                    final int at = at(char1);
                    if (at >= 26 || at != at(char2)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static boolean e(final char c) {
        return c >= 'a' && c <= 'z';
    }
    
    public static boolean f(final char c) {
        return c >= 'A' && c <= 'Z';
    }
    
    public static void g(final afjb afjb, final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(afjb.v().size());
        for (final Map.Entry<Object, V> entry : afjb.v().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection)entry.getValue()).size());
            final Iterator iterator2 = ((Collection)entry.getValue()).iterator();
            while (iterator2.hasNext()) {
                objectOutputStream.writeObject(iterator2.next());
            }
        }
    }
    
    public static Object[] h(final Object[] array, final int n) {
        return (Object[])Array.newInstance(array.getClass().getComponentType(), n);
    }
    
    public static Object[] i(final Class clazz, final int n) {
        return (Object[])Array.newInstance(clazz, n);
    }
    
    public static void j(final Object o, final int n) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder("at index ");
        sb.append(n);
        throw new NullPointerException(sb.toString());
    }
    
    public static void k(final Object... array) {
        l(array, array.length);
    }
    
    public static void l(final Object[] array, final int n) {
        for (int i = 0; i < n; ++i) {
            j(array[i], i);
        }
    }
    
    public static void m(final Iterable iterable, final Object[] array) {
        final Iterator iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            array[n] = iterator.next();
            ++n;
        }
    }
    
    public static boolean n(final afjh afjh, final Object o) {
        if (o == afjh) {
            return true;
        }
        if (o instanceof afjh) {
            final afjh afjh2 = (afjh)o;
            if (afjh.size() == afjh2.size()) {
                if (afjh.j().size() == afjh2.j().size()) {
                    for (final afji afji : afjh2.j()) {
                        if (afjh.b(afji.a) != afji.a()) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    public static int o(final int n) {
        if (n != 1) {
            return n - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public static int p(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 2) {
            return 4;
        }
        if (n == 3) {
            return 5;
        }
        if (n == 4) {
            return 6;
        }
        if (n != 5) {
            return 0;
        }
        return 7;
    }
    
    public static int q(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 3;
        }
        if (n != 2) {
            return 0;
        }
        return 4;
    }
    
    public static int r(final int n) {
        if (n != 1) {
            return n - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public static int s(final int n) {
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 3;
        }
        if (n == 2) {
            return 4;
        }
        if (n != 3) {
            return 0;
        }
        return 5;
    }
    
    public static byte[] t(byte[] copy) {
        final int length = copy.length;
        if (length < 16) {
            copy = Arrays.copyOf(copy, 16);
            copy[length] = -128;
            return copy;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }
    
    public static byte[] u(final byte[] array) {
        if (array.length == 16) {
            final byte[] array2 = new byte[16];
            for (int i = 0; i < 16; ++i) {
                final byte b = array[i];
                final byte b2 = (byte)(b + b & 0xFE);
                array2[i] = b2;
                if (i < 15) {
                    array2[i] = (byte)((array[i + 1] >> 7 & 0x1) | b2);
                }
            }
            array2[15] ^= (byte)(array[0] >> 7 & 0x87);
            return array2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
    
    public static agij v(final String s) {
        final byte[] array = new byte[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 < '!' || char1 > '~') {
                final StringBuilder sb = new StringBuilder("Not a printable ASCII character: ");
                sb.append(char1);
                throw new agcp(sb.toString());
            }
            array[i] = (byte)char1;
        }
        return agij.a(array);
    }
    
    public static agbm w(final agey agey) {
        final int d = agey.d;
        final int x = aexq.X(d);
        if (x != 0) {
            if (x == 3) {
                return (agbm)new agbk(16);
            }
        }
        final int x2 = aexq.X(d);
        if (x2 != 0) {
            if (x2 == 4) {
                return (agbm)new agbk(32);
            }
        }
        final int x3 = aexq.X(d);
        if (x3 != 0 && x3 == 5) {
            return (agbm)new agbl();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }
    
    public static agbq x(final agey agey) {
        final int b = agey.b;
        final int v = aexq.V(b);
        if (v != 0) {
            if (v == 3) {
                return (agbq)new agby(new agpb("HmacSha256"), null, null);
            }
        }
        final int v2 = aexq.V(b);
        if (v2 != 0) {
            if (v2 == 4) {
                return (agbq)agbx.c(1);
            }
        }
        final int v3 = aexq.V(b);
        if (v3 != 0) {
            if (v3 == 5) {
                return (agbq)agbx.c(2);
            }
        }
        final int v4 = aexq.V(b);
        if (v4 != 0 && v4 == 6) {
            return (agbq)agbx.c(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
    
    public static void y(final agen agen) {
        ageq ageq;
        if ((ageq = agen.b) == null) {
            ageq = ageq.a;
        }
        final int p = p(ageq.b);
        final int n = 1;
        int n2;
        if ((n2 = p) == 0) {
            n2 = 1;
        }
        aexq.F(A(n2));
        ageq ageq2;
        if ((ageq2 = agen.b) == null) {
            ageq2 = ageq.a;
        }
        int z = aexq.Z(ageq2.c);
        if (z == 0) {
            z = n;
        }
        z(z);
        final int s = s(agen.d);
        if (s != 0) {
            if (s == 2) {
                throw new GeneralSecurityException("unknown EC point format");
            }
        }
        agel agel;
        if ((agel = agen.c) == null) {
            agel = agel.a;
        }
        agfd agfd;
        if ((agfd = agel.b) == null) {
            agfd = agfd.a;
        }
        afzd.k(agfd);
    }
    
    public static String z(final int n) {
        final int n2 = n - 2;
        if (n2 == 1) {
            return "HmacSha1";
        }
        if (n2 == 2) {
            return "HmacSha384";
        }
        if (n2 == 3) {
            return "HmacSha256";
        }
        if (n2 == 4) {
            return "HmacSha512";
        }
        if (n2 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(aexq.Y(n))));
    }
}
