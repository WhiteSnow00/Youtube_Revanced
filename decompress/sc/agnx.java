import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnx extends agnv
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
                                    throw new agnw(i, length2);
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
        final long n7 = n3;
        final StringBuilder sb = new StringBuilder("UTF-8 length does not fit in int: ");
        sb.append(n7 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static void f(final CharSequence p0, final ByteBuffer p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokeinterface java/lang/CharSequence.length:()I
        //     6: istore          10
        //     8: aload_1        
        //     9: invokevirtual   java/nio/ByteBuffer.position:()I
        //    12: istore          6
        //    14: iconst_0       
        //    15: istore          5
        //    17: iload           5
        //    19: iload           10
        //    21: if_icmpge       77
        //    24: iload           6
        //    26: istore          8
        //    28: iload           5
        //    30: istore          7
        //    32: aload_0        
        //    33: iload           5
        //    35: invokeinterface java/lang/CharSequence.charAt:(I)C
        //    40: istore          9
        //    42: iload           9
        //    44: sipush          128
        //    47: if_icmpge       77
        //    50: iload           6
        //    52: istore          8
        //    54: iload           5
        //    56: istore          7
        //    58: aload_1        
        //    59: iload           6
        //    61: iload           5
        //    63: iadd           
        //    64: iload           9
        //    66: i2b            
        //    67: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //    70: pop            
        //    71: iinc            5, 1
        //    74: goto            17
        //    77: iload           5
        //    79: iload           10
        //    81: if_icmpne       107
        //    84: iload           6
        //    86: istore          8
        //    88: iload           5
        //    90: istore          7
        //    92: aload_1        
        //    93: iload           6
        //    95: iload           5
        //    97: iadd           
        //    98: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   101: checkcast       Ljava/nio/ByteBuffer;
        //   104: astore          12
        //   106: return         
        //   107: iload           6
        //   109: iload           5
        //   111: iadd           
        //   112: istore          6
        //   114: iload           5
        //   116: iload           10
        //   118: if_icmpge       584
        //   121: iload           6
        //   123: istore          8
        //   125: iload           5
        //   127: istore          7
        //   129: aload_0        
        //   130: iload           5
        //   132: invokeinterface java/lang/CharSequence.charAt:(I)C
        //   137: istore_3       
        //   138: iload_3        
        //   139: sipush          128
        //   142: if_icmpge       165
        //   145: iload           6
        //   147: istore          8
        //   149: iload           5
        //   151: istore          7
        //   153: aload_1        
        //   154: iload           6
        //   156: iload_3        
        //   157: i2b            
        //   158: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   161: pop            
        //   162: goto            575
        //   165: iload_3        
        //   166: sipush          2048
        //   169: if_icmpge       236
        //   172: iload           6
        //   174: iconst_1       
        //   175: iadd           
        //   176: istore          8
        //   178: iload_3        
        //   179: bipush          6
        //   181: iushr          
        //   182: sipush          192
        //   185: ior            
        //   186: i2b            
        //   187: istore_2       
        //   188: iload           8
        //   190: istore          7
        //   192: aload_1        
        //   193: iload           6
        //   195: iload_2        
        //   196: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   199: pop            
        //   200: iload           8
        //   202: istore          7
        //   204: aload_1        
        //   205: iload           8
        //   207: iload_3        
        //   208: bipush          63
        //   210: iand           
        //   211: sipush          128
        //   214: ior            
        //   215: i2b            
        //   216: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   219: pop            
        //   220: iload           8
        //   222: istore          6
        //   224: goto            575
        //   227: astore          12
        //   229: iload           7
        //   231: istore          8
        //   233: goto            604
        //   236: iload_3        
        //   237: ldc             55296
        //   239: if_icmplt       488
        //   242: iload_3        
        //   243: ldc             57343
        //   245: if_icmple       251
        //   248: goto            488
        //   251: iload           5
        //   253: iconst_1       
        //   254: iadd           
        //   255: istore          7
        //   257: iload           7
        //   259: iload           10
        //   261: if_icmpeq       447
        //   264: iload           6
        //   266: istore          5
        //   268: aload_0        
        //   269: iload           7
        //   271: invokeinterface java/lang/CharSequence.charAt:(I)C
        //   276: istore          4
        //   278: iload           6
        //   280: istore          5
        //   282: iload_3        
        //   283: iload           4
        //   285: invokestatic    java/lang/Character.isSurrogatePair:(CC)Z
        //   288: ifeq            429
        //   291: iload           6
        //   293: istore          5
        //   295: iload_3        
        //   296: iload           4
        //   298: invokestatic    java/lang/Character.toCodePoint:(CC)I
        //   301: istore          11
        //   303: iload           6
        //   305: iconst_1       
        //   306: iadd           
        //   307: istore          8
        //   309: iload           11
        //   311: bipush          18
        //   313: iushr          
        //   314: sipush          240
        //   317: ior            
        //   318: i2b            
        //   319: istore_2       
        //   320: iload           8
        //   322: istore          5
        //   324: aload_1        
        //   325: iload           6
        //   327: iload_2        
        //   328: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   331: pop            
        //   332: iload           8
        //   334: iconst_1       
        //   335: iadd           
        //   336: istore          9
        //   338: iload           11
        //   340: bipush          12
        //   342: iushr          
        //   343: bipush          63
        //   345: iand           
        //   346: sipush          128
        //   349: ior            
        //   350: i2b            
        //   351: istore_2       
        //   352: iload           9
        //   354: istore          5
        //   356: aload_1        
        //   357: iload           8
        //   359: iload_2        
        //   360: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   363: pop            
        //   364: iload           9
        //   366: iconst_1       
        //   367: iadd           
        //   368: istore          6
        //   370: iload           11
        //   372: bipush          6
        //   374: iushr          
        //   375: bipush          63
        //   377: iand           
        //   378: sipush          128
        //   381: ior            
        //   382: i2b            
        //   383: istore_2       
        //   384: iload           6
        //   386: istore          5
        //   388: aload_1        
        //   389: iload           9
        //   391: iload_2        
        //   392: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   395: pop            
        //   396: iload           6
        //   398: istore          5
        //   400: aload_1        
        //   401: iload           6
        //   403: iload           11
        //   405: bipush          63
        //   407: iand           
        //   408: sipush          128
        //   411: ior            
        //   412: i2b            
        //   413: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   416: pop            
        //   417: iload           7
        //   419: istore          5
        //   421: goto            575
        //   424: astore          12
        //   426: goto            436
        //   429: iload           7
        //   431: istore          5
        //   433: goto            447
        //   436: iload           5
        //   438: istore          8
        //   440: iload           7
        //   442: istore          5
        //   444: goto            604
        //   447: iload           6
        //   449: istore          8
        //   451: iload           5
        //   453: istore          7
        //   455: new             Lagnw;
        //   458: astore          12
        //   460: iload           6
        //   462: istore          8
        //   464: iload           5
        //   466: istore          7
        //   468: aload           12
        //   470: iload           5
        //   472: iload           10
        //   474: invokespecial   agnw.<init>:(II)V
        //   477: iload           6
        //   479: istore          8
        //   481: iload           5
        //   483: istore          7
        //   485: aload           12
        //   487: athrow         
        //   488: iload           6
        //   490: iconst_1       
        //   491: iadd           
        //   492: istore          9
        //   494: iload_3        
        //   495: bipush          12
        //   497: iushr          
        //   498: sipush          224
        //   501: ior            
        //   502: i2b            
        //   503: istore_2       
        //   504: iload           9
        //   506: istore          7
        //   508: aload_1        
        //   509: iload           6
        //   511: iload_2        
        //   512: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   515: pop            
        //   516: iload           9
        //   518: iconst_1       
        //   519: iadd           
        //   520: istore          6
        //   522: iload_3        
        //   523: bipush          6
        //   525: iushr          
        //   526: bipush          63
        //   528: iand           
        //   529: sipush          128
        //   532: ior            
        //   533: i2b            
        //   534: istore_2       
        //   535: iload           6
        //   537: istore          8
        //   539: iload           5
        //   541: istore          7
        //   543: aload_1        
        //   544: iload           9
        //   546: iload_2        
        //   547: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   550: pop            
        //   551: iload           6
        //   553: istore          8
        //   555: iload           5
        //   557: istore          7
        //   559: aload_1        
        //   560: iload           6
        //   562: iload_3        
        //   563: bipush          63
        //   565: iand           
        //   566: sipush          128
        //   569: ior            
        //   570: i2b            
        //   571: invokevirtual   java/nio/ByteBuffer.put:(IB)Ljava/nio/ByteBuffer;
        //   574: pop            
        //   575: iinc            6, 1
        //   578: iinc            5, 1
        //   581: goto            114
        //   584: iload           6
        //   586: istore          8
        //   588: iload           5
        //   590: istore          7
        //   592: aload_1        
        //   593: iload           6
        //   595: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   598: checkcast       Ljava/nio/ByteBuffer;
        //   601: astore          12
        //   603: return         
        //   604: aload_1        
        //   605: invokevirtual   java/nio/ByteBuffer.position:()I
        //   608: istore          6
        //   610: iload           5
        //   612: iload           8
        //   614: aload_1        
        //   615: invokevirtual   java/nio/ByteBuffer.position:()I
        //   618: isub           
        //   619: iconst_1       
        //   620: iadd           
        //   621: invokestatic    java/lang/Math.max:(II)I
        //   624: istore          7
        //   626: aload_0        
        //   627: iload           5
        //   629: invokeinterface java/lang/CharSequence.charAt:(I)C
        //   634: istore_3       
        //   635: new             Ljava/lang/StringBuilder;
        //   638: dup            
        //   639: ldc             "Failed writing "
        //   641: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   644: astore_0       
        //   645: aload_0        
        //   646: iload_3        
        //   647: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   650: pop            
        //   651: aload_0        
        //   652: ldc             " at index "
        //   654: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   657: pop            
        //   658: aload_0        
        //   659: iload           6
        //   661: iload           7
        //   663: iadd           
        //   664: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   667: pop            
        //   668: new             Ljava/lang/ArrayIndexOutOfBoundsException;
        //   671: dup            
        //   672: aload_0        
        //   673: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   676: invokespecial   java/lang/ArrayIndexOutOfBoundsException.<init>:(Ljava/lang/String;)V
        //   679: astore_0       
        //   680: goto            685
        //   683: aload_0        
        //   684: athrow         
        //   685: goto            683
        //   688: astore          12
        //   690: iload           7
        //   692: istore          5
        //   694: goto            604
        //   697: astore          12
        //   699: goto            436
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  32     42     688    697    Ljava/lang/IndexOutOfBoundsException;
        //  58     71     688    697    Ljava/lang/IndexOutOfBoundsException;
        //  92     106    688    697    Ljava/lang/IndexOutOfBoundsException;
        //  129    138    688    697    Ljava/lang/IndexOutOfBoundsException;
        //  153    162    688    697    Ljava/lang/IndexOutOfBoundsException;
        //  192    200    227    236    Ljava/lang/IndexOutOfBoundsException;
        //  204    220    227    236    Ljava/lang/IndexOutOfBoundsException;
        //  268    278    697    702    Ljava/lang/IndexOutOfBoundsException;
        //  282    291    697    702    Ljava/lang/IndexOutOfBoundsException;
        //  295    303    697    702    Ljava/lang/IndexOutOfBoundsException;
        //  324    332    424    429    Ljava/lang/IndexOutOfBoundsException;
        //  356    364    697    702    Ljava/lang/IndexOutOfBoundsException;
        //  388    396    424    429    Ljava/lang/IndexOutOfBoundsException;
        //  400    417    424    429    Ljava/lang/IndexOutOfBoundsException;
        //  455    460    688    697    Ljava/lang/IndexOutOfBoundsException;
        //  468    477    688    697    Ljava/lang/IndexOutOfBoundsException;
        //  485    488    688    697    Ljava/lang/IndexOutOfBoundsException;
        //  508    516    227    236    Ljava/lang/IndexOutOfBoundsException;
        //  543    551    688    697    Ljava/lang/IndexOutOfBoundsException;
        //  559    575    688    697    Ljava/lang/IndexOutOfBoundsException;
        //  592    603    688    697    Ljava/lang/IndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0429:
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
    public final int a(final CharSequence charSequence) {
        return e(charSequence);
    }
    
    @Override
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
                    length = n3;
                    i = n;
                    if (!agpc.i(b)) {
                        break;
                    }
                    ++n;
                    agpc.f(b, array2, n3);
                    ++n3;
                }
                while (i < n2) {
                    int n4 = i + 1;
                    final byte b2 = array[i];
                    if (agpc.i(b2)) {
                        agpc.f(b2, array2, length);
                        int n5 = length + 1;
                        while (true) {
                            length = n5;
                            i = n4;
                            if (n4 >= n2) {
                                break;
                            }
                            final byte b3 = array[n4];
                            length = n5;
                            i = n4;
                            if (!agpc.i(b3)) {
                                break;
                            }
                            ++n4;
                            agpc.f(b3, array2, n5);
                            ++n5;
                        }
                    }
                    else if (agpc.k(b2)) {
                        if (n4 >= n2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i = n4 + 1;
                        agpc.h(b2, array[n4], array2, length);
                        ++length;
                    }
                    else if (agpc.j(b2)) {
                        if (n4 >= n2 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i = n4 + 1;
                        agpc.g(b2, array[n4], array[i], array2, length);
                        ++i;
                        ++length;
                    }
                    else {
                        if (n4 >= n2 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i = n4 + 1;
                        final byte b4 = array[n4];
                        final int n6 = i + 1;
                        final byte b5 = array[i];
                        i = n6 + 1;
                        agpc.e(b2, b4, b5, array[n6], array2, length);
                        length += 2;
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
                    length = n8;
                    i = n9;
                    if (!agpc.i(value)) {
                        break;
                    }
                    ++n9;
                    agpc.f(value, array3, n8);
                    ++n8;
                }
                while (i < n7) {
                    int n10 = i + 1;
                    final byte value2 = byteBuffer.get(i);
                    if (agpc.i(value2)) {
                        agpc.f(value2, array3, length);
                        int n11 = length + 1;
                        while (true) {
                            length = n11;
                            i = n10;
                            if (n10 >= n7) {
                                break;
                            }
                            final byte value3 = byteBuffer.get(n10);
                            length = n11;
                            i = n10;
                            if (!agpc.i(value3)) {
                                break;
                            }
                            ++n10;
                            agpc.f(value3, array3, n11);
                            ++n11;
                        }
                    }
                    else if (agpc.k(value2)) {
                        if (n10 >= n7) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i = n10 + 1;
                        agpc.h(value2, byteBuffer.get(n10), array3, length);
                        ++length;
                    }
                    else if (agpc.j(value2)) {
                        if (n10 >= n7 - 1) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i = n10 + 1;
                        agpc.g(value2, byteBuffer.get(n10), byteBuffer.get(i), array3, length);
                        ++i;
                        ++length;
                    }
                    else {
                        if (n10 >= n7 - 2) {
                            throw new IllegalArgumentException("Invalid UTF-8");
                        }
                        i = n10 + 1;
                        final byte value4 = byteBuffer.get(n10);
                        final int n12 = i + 1;
                        final byte value5 = byteBuffer.get(i);
                        i = n12 + 1;
                        agpc.e(value2, value4, value5, byteBuffer.get(n12), array3, length);
                        length += 2;
                    }
                }
                return new String(array3, 0, length);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer.limit(), length, i));
        }
    }
    
    @Override
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
            Label_0598: {
                if (i != length) {
                    int n4 = n + i;
                    while (true) {
                        n5 = n4;
                        if (i >= length) {
                            break Label_0598;
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
                                        throw new agnw(i, length);
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
                    throw new agnw(i - 1, length);
                }
                n5 = n + length;
            }
            final ByteBuffer byteBuffer2 = (ByteBuffer)byteBuffer.position(n5 - arrayOffset);
            return;
        }
        f(charSequence, byteBuffer);
    }
}
