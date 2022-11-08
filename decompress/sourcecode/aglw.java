import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aglw extends aglu
{
    public static int e(final CharSequence charSequence) {
        final int length = charSequence.length();
        final int n = 0;
        int i;
        for (i = 0; i < length && charSequence.charAt(i) < '\u0080'; ++i) {}
        int n2 = length;
        int n3;
        while (true) {
            n3 = n2;
            if (i >= length) {
                break;
            }
            final char char1 = charSequence.charAt(i);
            if (char1 >= '\u0800') {
                final int length2 = charSequence.length();
                int n4 = n;
                while (i < length2) {
                    final char char2 = charSequence.charAt(i);
                    int n5;
                    if (char2 < '\u0800') {
                        n4 += '\u007f' - char2 >>> 31;
                        n5 = i;
                    }
                    else {
                        final int n6 = n4 += 2;
                        n5 = i;
                        if (char2 >= '\ud800') {
                            n4 = n6;
                            n5 = i;
                            if (char2 <= '\udfff') {
                                if (Character.codePointAt(charSequence, i) < 65536) {
                                    throw new aglv(i, length2);
                                }
                                n5 = i + 1;
                                n4 = n6;
                            }
                        }
                    }
                    i = n5 + 1;
                }
                n3 = n2 + n4;
                break;
            }
            n2 += '\u007f' - char1 >>> 31;
            ++i;
        }
        if (n3 >= length) {
            return n3;
        }
        final StringBuilder sb = new StringBuilder("UTF-8 length does not fit in int: ");
        sb.append(n3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static void f(final CharSequence p0, final ByteBuffer p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokeinterface java/lang/CharSequence.length:()I
        //     6: istore_2       
        //     7: aload_1        
        //     8: invokevirtual   java/nio/ByteBuffer.position:()I
        //    11: istore_3       
        //    12: iconst_0       
        //    13: istore          4
        //    15: iload           4
        //    17: iload_2        
        //    18: if_icmpge       71
        //    21: iload_3        
        //    22: istore          5
        //    24: iload           4
        //    26: istore          6
        //    28: aload_0        
        //    29: iload           4
        //    31: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    36: istore          7
        //    38: iload           7
        //    40: sipush          128
        //    43: if_icmpge       71
        //    46: iload_3        
        //    47: istore          5
        //    49: iload           4
        //    51: istore          6
        //    53: aload_1        
        //    54: iload_3        
        //    55: iload           4
        //    57: iadd           
        //    58: iload           7
        //    60: i2b            
        //    61: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //    64: pop            
        //    65: iinc            4, 1
        //    68: goto            15
        //    71: iload           4
        //    73: iload_2        
        //    74: if_icmpne       98
        //    77: iload_3        
        //    78: istore          5
        //    80: iload           4
        //    82: istore          6
        //    84: aload_1        
        //    85: iload_3        
        //    86: iload           4
        //    88: iadd           
        //    89: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //    92: checkcast       Ljava/nio/ByteBuffer;
        //    95: astore          8
        //    97: return         
        //    98: iload_3        
        //    99: iload           4
        //   101: iadd           
        //   102: istore_3       
        //   103: iload           4
        //   105: iload_2        
        //   106: if_icmpge       571
        //   109: iload_3        
        //   110: istore          5
        //   112: iload           4
        //   114: istore          6
        //   116: aload_0        
        //   117: iload           4
        //   119: invokeinterface java/lang/CharSequence.charAt:(I)C
        //   124: istore          9
        //   126: iload           9
        //   128: sipush          128
        //   131: if_icmpge       153
        //   134: iload_3        
        //   135: istore          5
        //   137: iload           4
        //   139: istore          6
        //   141: aload_1        
        //   142: iload_3        
        //   143: iload           9
        //   145: i2b            
        //   146: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   149: pop            
        //   150: goto            562
        //   153: iload           9
        //   155: sipush          2048
        //   158: if_icmpge       226
        //   161: iload_3        
        //   162: iconst_1       
        //   163: iadd           
        //   164: istore          5
        //   166: iload           9
        //   168: bipush          6
        //   170: iushr          
        //   171: sipush          192
        //   174: ior            
        //   175: i2b            
        //   176: istore          10
        //   178: iload           5
        //   180: istore          6
        //   182: aload_1        
        //   183: iload_3        
        //   184: iload           10
        //   186: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   189: pop            
        //   190: iload           5
        //   192: istore          6
        //   194: aload_1        
        //   195: iload           5
        //   197: iload           9
        //   199: bipush          63
        //   201: iand           
        //   202: sipush          128
        //   205: ior            
        //   206: i2b            
        //   207: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   210: pop            
        //   211: iload           5
        //   213: istore_3       
        //   214: goto            562
        //   217: astore          8
        //   219: iload           6
        //   221: istore          5
        //   223: goto            589
        //   226: iload           9
        //   228: ldc             55296
        //   230: if_icmplt       474
        //   233: iload           9
        //   235: ldc             57343
        //   237: if_icmple       243
        //   240: goto            474
        //   243: iload           4
        //   245: iconst_1       
        //   246: iadd           
        //   247: istore          6
        //   249: iload           6
        //   251: iload_2        
        //   252: if_icmpeq       437
        //   255: iload_3        
        //   256: istore          4
        //   258: aload_0        
        //   259: iload           6
        //   261: invokeinterface java/lang/CharSequence.charAt:(I)C
        //   266: istore          11
        //   268: iload_3        
        //   269: istore          4
        //   271: iload           9
        //   273: iload           11
        //   275: invokestatic    java/lang/Character.isSurrogatePair:(CC)Z
        //   278: ifeq            419
        //   281: iload_3        
        //   282: istore          4
        //   284: iload           9
        //   286: iload           11
        //   288: invokestatic    java/lang/Character.toCodePoint:(CC)I
        //   291: istore          12
        //   293: iload_3        
        //   294: iconst_1       
        //   295: iadd           
        //   296: istore          5
        //   298: iload           12
        //   300: bipush          18
        //   302: iushr          
        //   303: sipush          240
        //   306: ior            
        //   307: i2b            
        //   308: istore          10
        //   310: iload           5
        //   312: istore          4
        //   314: aload_1        
        //   315: iload_3        
        //   316: iload           10
        //   318: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   321: pop            
        //   322: iload           5
        //   324: iconst_1       
        //   325: iadd           
        //   326: istore          7
        //   328: iload           12
        //   330: bipush          12
        //   332: iushr          
        //   333: bipush          63
        //   335: iand           
        //   336: sipush          128
        //   339: ior            
        //   340: i2b            
        //   341: istore          10
        //   343: iload           7
        //   345: istore          4
        //   347: aload_1        
        //   348: iload           5
        //   350: iload           10
        //   352: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   355: pop            
        //   356: iload           7
        //   358: iconst_1       
        //   359: iadd           
        //   360: istore_3       
        //   361: iload           12
        //   363: bipush          6
        //   365: iushr          
        //   366: bipush          63
        //   368: iand           
        //   369: sipush          128
        //   372: ior            
        //   373: i2b            
        //   374: istore          10
        //   376: iload_3        
        //   377: istore          4
        //   379: aload_1        
        //   380: iload           7
        //   382: iload           10
        //   384: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   387: pop            
        //   388: iload_3        
        //   389: istore          4
        //   391: aload_1        
        //   392: iload_3        
        //   393: iload           12
        //   395: bipush          63
        //   397: iand           
        //   398: sipush          128
        //   401: ior            
        //   402: i2b            
        //   403: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   406: pop            
        //   407: iload           6
        //   409: istore          4
        //   411: goto            562
        //   414: astore          8
        //   416: goto            426
        //   419: iload           6
        //   421: istore          4
        //   423: goto            437
        //   426: iload           4
        //   428: istore          5
        //   430: iload           6
        //   432: istore          4
        //   434: goto            589
        //   437: iload_3        
        //   438: istore          5
        //   440: iload           4
        //   442: istore          6
        //   444: new             Laglv;
        //   447: astore          8
        //   449: iload_3        
        //   450: istore          5
        //   452: iload           4
        //   454: istore          6
        //   456: aload           8
        //   458: iload           4
        //   460: iload_2        
        //   461: invokespecial   aglv.<init>:(II)V
        //   464: iload_3        
        //   465: istore          5
        //   467: iload           4
        //   469: istore          6
        //   471: aload           8
        //   473: athrow         
        //   474: iload_3        
        //   475: iconst_1       
        //   476: iadd           
        //   477: istore          7
        //   479: iload           9
        //   481: bipush          12
        //   483: iushr          
        //   484: sipush          224
        //   487: ior            
        //   488: i2b            
        //   489: istore          10
        //   491: iload           7
        //   493: istore          6
        //   495: aload_1        
        //   496: iload_3        
        //   497: iload           10
        //   499: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   502: pop            
        //   503: iload           7
        //   505: iconst_1       
        //   506: iadd           
        //   507: istore_3       
        //   508: iload           9
        //   510: bipush          6
        //   512: iushr          
        //   513: bipush          63
        //   515: iand           
        //   516: sipush          128
        //   519: ior            
        //   520: i2b            
        //   521: istore          10
        //   523: iload_3        
        //   524: istore          5
        //   526: iload           4
        //   528: istore          6
        //   530: aload_1        
        //   531: iload           7
        //   533: iload           10
        //   535: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   538: pop            
        //   539: iload_3        
        //   540: istore          5
        //   542: iload           4
        //   544: istore          6
        //   546: aload_1        
        //   547: iload_3        
        //   548: iload           9
        //   550: bipush          63
        //   552: iand           
        //   553: sipush          128
        //   556: ior            
        //   557: i2b            
        //   558: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   561: pop            
        //   562: iinc            4, 1
        //   565: iinc            3, 1
        //   568: goto            103
        //   571: iload_3        
        //   572: istore          5
        //   574: iload           4
        //   576: istore          6
        //   578: aload_1        
        //   579: iload_3        
        //   580: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   583: checkcast       Ljava/nio/ByteBuffer;
        //   586: astore          8
        //   588: return         
        //   589: aload_1        
        //   590: invokevirtual   java/nio/ByteBuffer.position:()I
        //   593: istore_3       
        //   594: iload           4
        //   596: iload           5
        //   598: aload_1        
        //   599: invokevirtual   java/nio/ByteBuffer.position:()I
        //   602: isub           
        //   603: iconst_1       
        //   604: iadd           
        //   605: invokestatic    java/lang/Math.max:(II)I
        //   608: istore          6
        //   610: aload_0        
        //   611: iload           4
        //   613: invokeinterface java/lang/CharSequence.charAt:(I)C
        //   618: istore          9
        //   620: new             Ljava/lang/StringBuilder;
        //   623: dup            
        //   624: ldc             "Failed writing "
        //   626: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   629: astore_0       
        //   630: aload_0        
        //   631: iload           9
        //   633: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   636: pop            
        //   637: aload_0        
        //   638: ldc             " at index "
        //   640: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   643: pop            
        //   644: aload_0        
        //   645: iload_3        
        //   646: iload           6
        //   648: iadd           
        //   649: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   652: pop            
        //   653: new             Ljava/lang/ArrayIndexOutOfBoundsException;
        //   656: dup            
        //   657: aload_0        
        //   658: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   661: invokespecial   java/lang/ArrayIndexOutOfBoundsException.<init>:(Ljava/lang/String;)V
        //   664: astore_0       
        //   665: goto            670
        //   668: aload_0        
        //   669: athrow         
        //   670: goto            668
        //   673: astore          8
        //   675: iload           6
        //   677: istore          4
        //   679: goto            589
        //   682: astore          8
        //   684: goto            426
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  28     38     673    682    Ljava/lang/IndexOutOfBoundsException;
        //  53     65     673    682    Ljava/lang/IndexOutOfBoundsException;
        //  84     97     673    682    Ljava/lang/IndexOutOfBoundsException;
        //  116    126    673    682    Ljava/lang/IndexOutOfBoundsException;
        //  141    150    673    682    Ljava/lang/IndexOutOfBoundsException;
        //  182    190    217    226    Ljava/lang/IndexOutOfBoundsException;
        //  194    211    217    226    Ljava/lang/IndexOutOfBoundsException;
        //  258    268    682    687    Ljava/lang/IndexOutOfBoundsException;
        //  271    281    682    687    Ljava/lang/IndexOutOfBoundsException;
        //  284    293    682    687    Ljava/lang/IndexOutOfBoundsException;
        //  314    322    414    419    Ljava/lang/IndexOutOfBoundsException;
        //  347    356    682    687    Ljava/lang/IndexOutOfBoundsException;
        //  379    388    414    419    Ljava/lang/IndexOutOfBoundsException;
        //  391    407    414    419    Ljava/lang/IndexOutOfBoundsException;
        //  444    449    673    682    Ljava/lang/IndexOutOfBoundsException;
        //  456    464    673    682    Ljava/lang/IndexOutOfBoundsException;
        //  471    474    673    682    Ljava/lang/IndexOutOfBoundsException;
        //  495    503    217    226    Ljava/lang/IndexOutOfBoundsException;
        //  530    539    673    682    Ljava/lang/IndexOutOfBoundsException;
        //  546    562    673    682    Ljava/lang/IndexOutOfBoundsException;
        //  578    588    673    682    Ljava/lang/IndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0419:
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
    
    public final int a(final CharSequence charSequence) {
        return e(charSequence);
    }
    
    public final String b(final ByteBuffer byteBuffer, int length, int i) {
        if (byteBuffer.hasArray()) {
            final byte[] array = byteBuffer.array();
            int n = byteBuffer.arrayOffset() + length;
            length = array.length;
            if ((n | i | length - n - i) >= 0) {
                final int n2 = n + i;
                final char[] array2 = new char[i];
                int n3 = 0;
                while (true) {
                    length = n3;
                    i = n;
                    if (n >= n2) {
                        break;
                    }
                    final byte b = array[n];
                    if (!agnj.i(b)) {
                        length = n3;
                        i = n;
                        break;
                    }
                    ++n;
                    agnj.f(b, array2, n3);
                    ++n3;
                }
            Label_0106:
                while (i < n2) {
                    int n4 = i + 1;
                    final byte b2 = array[i];
                    if (agnj.i(b2)) {
                        agnj.f(b2, array2, length);
                        int n5 = length + 1;
                        while (true) {
                            length = n5;
                            i = n4;
                            if (n4 >= n2) {
                                continue Label_0106;
                            }
                            final byte b3 = array[n4];
                            if (!agnj.i(b3)) {
                                break;
                            }
                            ++n4;
                            agnj.f(b3, array2, n5);
                            ++n5;
                        }
                        length = n5;
                        i = n4;
                    }
                    else if (agnj.k(b2)) {
                        if (n4 >= n2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i = n4 + 1;
                        agnj.h(b2, array[n4], array2, length);
                        ++length;
                    }
                    else if (agnj.j(b2)) {
                        if (n4 >= n2 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i = n4 + 1;
                        agnj.g(b2, array[n4], array[i], array2, length);
                        ++i;
                        ++length;
                    }
                    else {
                        if (n4 >= n2 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        final int n6 = n4 + 1;
                        i = n6 + 1;
                        agnj.e(b2, array[n4], array[n6], array[i], array2, length);
                        length += 2;
                        ++i;
                    }
                }
                return new String(array2, 0, length);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", length, n, i));
        }
        else {
            if ((length | i | byteBuffer.limit() - length - i) >= 0) {
                final int n7 = length + i;
                final char[] array3 = new char[i];
                int n8 = 0;
                int n9 = length;
                while (true) {
                    length = n8;
                    i = n9;
                    if (n9 >= n7) {
                        break;
                    }
                    final byte value = byteBuffer.get(n9);
                    if (!agnj.i(value)) {
                        length = n8;
                        i = n9;
                        break;
                    }
                    ++n9;
                    agnj.f(value, array3, n8);
                    ++n8;
                }
            Label_0499:
                while (i < n7) {
                    int n10 = i + 1;
                    final byte value2 = byteBuffer.get(i);
                    if (agnj.i(value2)) {
                        agnj.f(value2, array3, length);
                        int n11 = length + 1;
                        while (true) {
                            length = n11;
                            i = n10;
                            if (n10 >= n7) {
                                continue Label_0499;
                            }
                            final byte value3 = byteBuffer.get(n10);
                            if (!agnj.i(value3)) {
                                break;
                            }
                            ++n10;
                            agnj.f(value3, array3, n11);
                            ++n11;
                        }
                        length = n11;
                        i = n10;
                    }
                    else if (agnj.k(value2)) {
                        if (n10 >= n7) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i = n10 + 1;
                        agnj.h(value2, byteBuffer.get(n10), array3, length);
                        ++length;
                    }
                    else if (agnj.j(value2)) {
                        if (n10 >= n7 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i = n10 + 1;
                        agnj.g(value2, byteBuffer.get(n10), byteBuffer.get(i), array3, length);
                        ++i;
                        ++length;
                    }
                    else {
                        if (n10 >= n7 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        final int n12 = n10 + 1;
                        i = n12 + 1;
                        agnj.e(value2, byteBuffer.get(n10), byteBuffer.get(n12), byteBuffer.get(i), array3, length);
                        length += 2;
                        ++i;
                    }
                }
                return new String(array3, 0, length);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer.limit(), length, i));
        }
    }
    
    public final void c(final CharSequence charSequence, final ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            final int arrayOffset = byteBuffer.arrayOffset();
            final byte[] array = byteBuffer.array();
            final int n = byteBuffer.position() + arrayOffset;
            final int remaining = byteBuffer.remaining();
            final int length = charSequence.length();
            final int n2 = remaining + n;
            int i;
            for (i = 0; i < length; ++i) {
                final int n3 = i + n;
                if (n3 >= n2) {
                    break;
                }
                final char char1 = charSequence.charAt(i);
                if (char1 >= '\u0080') {
                    break;
                }
                array[n3] = (byte)char1;
            }
            int n5 = 0;
            Label_0624: {
                if (i != length) {
                    int n4 = n + i;
                    while (true) {
                        n5 = n4;
                        if (i >= length) {
                            break Label_0624;
                        }
                        final char char2 = charSequence.charAt(i);
                        if (char2 < '\u0080' && n4 < n2) {
                            final int n6 = n4 + 1;
                            array[n4] = (byte)char2;
                            n4 = n6;
                        }
                        else if (char2 < '\u0800' && n4 <= n2 - 2) {
                            final int n7 = n4 + 1;
                            array[n4] = (byte)(char2 >>> 6 | 0x3C0);
                            n4 = n7 + 1;
                            array[n7] = (byte)((char2 & '?') | 0x80);
                        }
                        else if ((char2 < '\ud800' || char2 > '\udfff') && n4 <= n2 - 3) {
                            final int n8 = n4 + 1;
                            array[n4] = (byte)(char2 >>> 12 | 0x1E0);
                            final int n9 = n8 + 1;
                            array[n8] = (byte)((char2 >>> 6 & 0x3F) | 0x80);
                            n4 = n9 + 1;
                            array[n9] = (byte)((char2 & '?') | 0x80);
                        }
                        else {
                            if (n4 > n2 - 4) {
                                if (char2 >= '\ud800' && char2 <= '\udfff') {
                                    final int n10 = i + 1;
                                    if (n10 == charSequence.length() || !Character.isSurrogatePair(char2, charSequence.charAt(n10))) {
                                        throw new aglv(i, length);
                                    }
                                }
                                final StringBuilder sb = new StringBuilder("Failed writing ");
                                sb.append(char2);
                                sb.append(" at index ");
                                sb.append(n4);
                                throw new ArrayIndexOutOfBoundsException(sb.toString());
                            }
                            final int n11 = i + 1;
                            if (n11 == charSequence.length()) {
                                break;
                            }
                            final char char3 = charSequence.charAt(n11);
                            if (!Character.isSurrogatePair(char2, char3)) {
                                i = n11;
                                break;
                            }
                            final int codePoint = Character.toCodePoint(char2, char3);
                            final int n12 = n4 + 1;
                            array[n4] = (byte)(codePoint >>> 18 | 0xF0);
                            final int n13 = n12 + 1;
                            array[n12] = (byte)((codePoint >>> 12 & 0x3F) | 0x80);
                            final int n14 = n13 + 1;
                            array[n13] = (byte)((codePoint >>> 6 & 0x3F) | 0x80);
                            n4 = n14 + 1;
                            array[n14] = (byte)((codePoint & 0x3F) | 0x80);
                            i = n11;
                        }
                        ++i;
                    }
                    throw new aglv(i - 1, length);
                }
                n5 = n + length;
            }
            final ByteBuffer byteBuffer2 = (ByteBuffer)byteBuffer.position(n5 - arrayOffset);
            return;
        }
        f(charSequence, byteBuffer);
    }
}
