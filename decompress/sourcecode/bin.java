import java.util.regex.Matcher;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collection;
import android.util.SparseArray;
import java.util.ArrayList;
import android.util.SparseIntArray;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

final class bin implements bnu, bow, bpo
{
    private static final Pattern i;
    private static final Pattern j;
    final int a;
    public final bjd b;
    public bnt c;
    public bpp[] d;
    public bja[] e;
    public bjg f;
    public int g;
    public List h;
    private final bcn k;
    private final bkr l;
    private final brh m;
    private final long n;
    private final bro o;
    private final bpd p;
    private final IdentityHashMap q;
    private final bny r;
    private box s;
    private final bre t;
    private final bue[] u;
    private final der v;
    private final bhu w;
    private final trg x;
    
    static {
        i = Pattern.compile("CC([1-4])=(.+)");
        j = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    }
    
    public bin(int i, final bjg f, der v, int j, final bhu w, final bcn k, final bkr l, final trg x, final brh m, final bny r, final long n, final bro o, final bre t, final qpt qpt, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.a = i;
        this.f = f;
        this.v = v;
        this.g = j;
        this.w = w;
        this.k = k;
        this.l = l;
        this.x = x;
        this.m = m;
        this.r = r;
        this.n = n;
        this.o = o;
        this.t = t;
        this.b = new bjd(f, qpt, t, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.d = new bpp[0];
        this.e = new bja[0];
        this.q = new IdentityHashMap();
        this.s = bkv.b((box[])this.d);
        final adff d = f.d(j);
        this.h = (List)d.b;
        final Object d2 = d.d;
        final List h = this.h;
        final int size = ((List)d2).size();
        final SparseIntArray sparseIntArray = new SparseIntArray(size);
        final ArrayList list = new ArrayList(size);
        final SparseArray sparseArray = new SparseArray(size);
        ArrayList list2;
        for (i = 0; i < size; ++i) {
            sparseIntArray.put(((bje)((List)d2).get(i)).a, i);
            list2 = new ArrayList();
            list2.add(i);
            list.add((Object)list2);
            sparseArray.put(i, (Object)list2);
        }
        bje bje;
        bjj bjj;
        int n2;
        bjj q;
        String[] ap;
        int length;
        int n3;
        int value;
        int min;
        List list3;
        List list4;
        for (j = 0; j < size; ++j) {
            bje = (bje)((List)d2).get(j);
            if ((bjj = r(bje.e)) == null) {
                bjj = r(bje.f);
            }
            if (bjj == null || (i = sparseIntArray.get(Integer.parseInt(bjj.b), -1)) == -1) {
                i = j;
            }
            if ((n2 = i) == j) {
                q = q(bje.f, "urn:mpeg:dash:adaptation-set-switching:2016");
                n2 = i;
                if (q != null) {
                    ap = baw.ap(q.b, ",");
                    length = ap.length;
                    n3 = 0;
                    while (true) {
                        n2 = i;
                        if (n3 >= length) {
                            break;
                        }
                        value = sparseIntArray.get(Integer.parseInt(ap[n3]), -1);
                        min = i;
                        if (value != -1) {
                            min = Math.min(i, value);
                        }
                        ++n3;
                        i = min;
                    }
                }
            }
            if (n2 != j) {
                list3 = (List)sparseArray.get(j);
                list4 = (List)sparseArray.get(n2);
                list4.addAll(list3);
                sparseArray.put(j, (Object)list4);
                list.remove(list3);
            }
        }
        final int size2 = list.size();
        final int[][] array9 = new int[size2][];
        for (i = 0; i < size2; ++i) {
            Arrays.sort(array9[i] = aesy.D((Collection)list.get(i)));
        }
        final boolean[] array10 = new boolean[size2];
        final ayf[][] array11 = new ayf[size2][];
        int n4 = 0;
        j = 0;
    Label_0963_Outer:
        while (n4 < size2) {
            final int[] array12 = array9[n4];
            final int length2 = array12.length;
            int n5 = 0;
        Label_0693:
            while (true) {
                final int n6 = 0;
                i = j;
                if (n5 >= length2) {
                    break;
                }
                List c;
                for (c = ((bje)((List)d2).get(array12[n5])).c, i = n6; i < c.size(); ++i) {
                    if (!((bjo)c.get(i)).g.isEmpty()) {
                        array10[n4] = true;
                        i = j + 1;
                        break Label_0693;
                    }
                }
                ++n5;
            }
            final int[] array13 = array9[n4];
            final int length3 = array13.length;
            j = 0;
        Label_0963:
            while (true) {
                while (j < length3) {
                    final int n7 = array13[j];
                    final bje bje2 = (bje)((List)d2).get(n7);
                    final List d3 = ((bje)((List)d2).get(n7)).d;
                    for (int n8 = 0; n8 < d3.size(); ++n8) {
                        final bjj bjj2 = d3.get(n8);
                        if ("urn:scte:dash:cc:cea-608:2015".equals(bjj2.a)) {
                            final aye aye = new aye();
                            aye.k = "application/cea-608";
                            j = bje2.a;
                            final StringBuilder sb = new StringBuilder();
                            sb.append(j);
                            sb.append(":cea608");
                            aye.a = sb.toString();
                            final ayf[] array14 = s(bjj2, bin.i, aye.a());
                            break Label_0963;
                        }
                        if ("urn:scte:dash:cc:cea-708:2015".equals(bjj2.a)) {
                            final aye aye2 = new aye();
                            aye2.k = "application/cea-708";
                            j = bje2.a;
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(j);
                            sb2.append(":cea708");
                            aye2.a = sb2.toString();
                            final ayf[] array14 = s(bjj2, bin.j, aye2.a());
                            break Label_0963;
                        }
                    }
                    ++j;
                    continue Label_0963_Outer;
                    ayf[] array14 = null;
                    array11[n4] = array14;
                    j = i;
                    if (array14.length != 0) {
                        j = i + 1;
                    }
                    ++n4;
                    continue Label_0963_Outer;
                }
                final ayf[] array14 = new ayf[0];
                continue Label_0963;
            }
        }
        i = j + size2 + h.size();
        final azm[] array15 = new azm[i];
        final bue[] array16 = new bue[i];
        int n9 = 0;
        j = 0;
        final boolean[] array17 = array10;
        final int[][] array18 = array9;
        while (n9 < size2) {
            final int[] array19 = array18[n9];
            final ArrayList list5 = new ArrayList();
            int length4;
            for (length4 = array19.length, i = 0; i < length4; ++i) {
                list5.addAll(((bje)((List)d2).get(array19[i])).c);
            }
            i = list5.size();
            final ayf[] array20 = new ayf[i];
            for (int n10 = 0; n10 < i; ++n10) {
                final ayf d4 = ((bjo)list5.get(n10)).d;
                array20[n10] = d4.c(l.a(d4));
            }
            final bje bje3 = (bje)((List)d2).get(array19[0]);
            i = bje3.a;
            String s;
            if (i != -1) {
                s = Integer.toString(i);
            }
            else {
                final StringBuilder sb3 = new StringBuilder("unset:");
                sb3.append(n9);
                s = sb3.toString();
            }
            i = j + 1;
            int n11;
            if (array17[n9]) {
                n11 = i;
                ++i;
            }
            else {
                n11 = -1;
            }
            int n13;
            if (array11[n9].length != 0) {
                final int n12 = i + 1;
                n13 = i;
                i = n12;
            }
            else {
                n13 = -1;
            }
            array15[j] = new azm(s, array20);
            array16[j] = new bue(bje3.b, 0, array19, j, n11, n13, -1);
            if (n11 != -1) {
                final String concat = String.valueOf(s).concat(":emsg");
                final aye aye3 = new aye();
                aye3.a = concat;
                aye3.k = "application/x-emsg";
                array15[n11] = new azm(concat, new ayf[] { aye3.a() });
                array16[n11] = new bue(5, 1, array19, j, -1, -1, -1);
            }
            if (n13 != -1) {
                array15[n13] = new azm(String.valueOf(s).concat(":cc"), array11[n9]);
                array16[n13] = new bue(3, 1, array19, j, -1, -1, -1);
            }
            ++n9;
            j = i;
        }
        aye aye4;
        ayf a;
        String a2;
        StringBuilder sb4;
        for (i = 0; i < h.size(); ++i, ++j) {
            v = (der)h.get(i);
            aye4 = new aye();
            aye4.a = v.a();
            aye4.k = "application/x-emsg";
            a = aye4.a();
            a2 = v.a();
            sb4 = new StringBuilder();
            sb4.append(a2);
            sb4.append(":");
            sb4.append(i);
            array15[j] = new azm(sb4.toString(), new ayf[] { a });
            array16[j] = new bue(5, 2, new int[0], -1, -1, -1, i);
        }
        final Pair create = Pair.create((Object)new bpd(array15), (Object)array16);
        this.p = (bpd)create.first;
        this.u = (bue[])create.second;
    }
    
    private final int p(int i, final int[] array) {
        i = array[i];
        if (i == -1) {
            return -1;
        }
        final int f = this.u[i].f;
        int n;
        for (i = 0; i < array.length; ++i) {
            n = array[i];
            if (n == f && this.u[n].a == 0) {
                return i;
            }
        }
        return -1;
    }
    
    private static bjj q(final List list, final String s) {
        for (int i = 0; i < list.size(); ++i) {
            final bjj bjj = list.get(i);
            if (s.equals(bjj.a)) {
                return bjj;
            }
        }
        return null;
    }
    
    private static bjj r(final List list) {
        return q(list, "http://dashif.org/guidelines/trickmode");
    }
    
    private static ayf[] s(final bjj bjj, final Pattern pattern, final ayf ayf) {
        final String b = bjj.b;
        if (b == null) {
            return new ayf[] { ayf };
        }
        final String[] ap = baw.ap(b, ";");
        final ayf[] array = new ayf[ap.length];
        for (int i = 0; i < ap.length; ++i) {
            final Matcher matcher = pattern.matcher(ap[i]);
            if (!matcher.matches()) {
                return new ayf[] { ayf };
            }
            final int int1 = Integer.parseInt(matcher.group(1));
            final aye b2 = ayf.b();
            final String c = ayf.c;
            final StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(":");
            sb.append(int1);
            b2.a = sb.toString();
            b2.C = int1;
            b2.c = matcher.group(2);
            array[i] = b2.a();
        }
        return array;
    }
    
    public final long a(final long n, final bfu bfu) {
        for (final bpp bpp : this.d) {
            if (bpp.a == 2) {
                return bpp.f(n, bfu);
            }
        }
        return n;
    }
    
    public final long c() {
        return this.s.c();
    }
    
    public final long d() {
        return this.s.d();
    }
    
    public final long e() {
        return -9223372036854775807L;
    }
    
    public final long f(final long n) {
        final bpp[] d = this.d;
        final int length = d.length;
        final int n2 = 0;
        for (int i = 0; i < length; ++i) {
            d[i].j(n);
        }
        final bja[] e = this.e;
        for (int length2 = e.length, j = n2; j < length2; ++j) {
            e[j].c(n);
        }
        return n;
    }
    
    public final long g(final bqv[] p0, final boolean[] p1, final bov[] p2, final boolean[] p3, final long p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          7
        //     3: aload_1        
        //     4: astore          8
        //     6: aload_3        
        //     7: astore          9
        //     9: aload           8
        //    11: arraylength    
        //    12: newarray        I
        //    14: astore          10
        //    16: iconst_0       
        //    17: istore          11
        //    19: iload           11
        //    21: aload           8
        //    23: arraylength    
        //    24: if_icmpge       74
        //    27: aload           8
        //    29: iload           11
        //    31: aaload         
        //    32: astore          12
        //    34: aload           12
        //    36: ifnull          62
        //    39: aload           10
        //    41: iload           11
        //    43: aload           7
        //    45: getfield        bin.p:Lbpd;
        //    48: aload           12
        //    50: invokeinterface bqv.j:()Lazm;
        //    55: invokevirtual   bpd.a:(Lazm;)I
        //    58: iastore        
        //    59: goto            68
        //    62: aload           10
        //    64: iload           11
        //    66: iconst_m1      
        //    67: iastore        
        //    68: iinc            11, 1
        //    71: goto            19
        //    74: iconst_0       
        //    75: istore          11
        //    77: iload           11
        //    79: aload           8
        //    81: arraylength    
        //    82: if_icmpge       156
        //    85: aload           8
        //    87: iload           11
        //    89: aaload         
        //    90: ifnull          100
        //    93: aload_2        
        //    94: iload           11
        //    96: baload         
        //    97: ifne            150
        //   100: aload           9
        //   102: iload           11
        //   104: aaload         
        //   105: astore          12
        //   107: aload           12
        //   109: instanceof      Lbpp;
        //   112: ifeq            128
        //   115: aload           12
        //   117: checkcast       Lbpp;
        //   120: aload           7
        //   122: invokevirtual   bpp.i:(Lbpo;)V
        //   125: goto            144
        //   128: aload           12
        //   130: instanceof      Lbpn;
        //   133: ifeq            144
        //   136: aload           12
        //   138: checkcast       Lbpn;
        //   141: invokevirtual   bpn.c:()V
        //   144: aload           9
        //   146: iload           11
        //   148: aconst_null    
        //   149: aastore        
        //   150: iinc            11, 1
        //   153: goto            77
        //   156: iconst_0       
        //   157: istore          11
        //   159: aload           8
        //   161: arraylength    
        //   162: istore          13
        //   164: iconst_1       
        //   165: istore          14
        //   167: iload           11
        //   169: iload           13
        //   171: if_icmpge       295
        //   174: aload           9
        //   176: iload           11
        //   178: aaload         
        //   179: astore_2       
        //   180: aload_2        
        //   181: instanceof      Lbnj;
        //   184: ifne            194
        //   187: aload_2        
        //   188: instanceof      Lbpn;
        //   191: ifeq            289
        //   194: aload           7
        //   196: iload           11
        //   198: aload           10
        //   200: invokespecial   bin.p:(I[I)I
        //   203: istore          13
        //   205: iload           13
        //   207: iconst_m1      
        //   208: if_icmpne       224
        //   211: aload           9
        //   213: iload           11
        //   215: aaload         
        //   216: instanceof      Lbnj;
        //   219: istore          14
        //   221: goto            258
        //   224: aload           9
        //   226: iload           11
        //   228: aaload         
        //   229: astore_2       
        //   230: aload_2        
        //   231: instanceof      Lbpn;
        //   234: ifeq            255
        //   237: aload_2        
        //   238: checkcast       Lbpn;
        //   241: getfield        bpn.a:Lbpp;
        //   244: aload           9
        //   246: iload           13
        //   248: aaload         
        //   249: if_acmpne       255
        //   252: goto            258
        //   255: iconst_0       
        //   256: istore          14
        //   258: iload           14
        //   260: ifne            289
        //   263: aload           9
        //   265: iload           11
        //   267: aaload         
        //   268: astore_2       
        //   269: aload_2        
        //   270: instanceof      Lbpn;
        //   273: ifeq            283
        //   276: aload_2        
        //   277: checkcast       Lbpn;
        //   280: invokevirtual   bpn.c:()V
        //   283: aload           9
        //   285: iload           11
        //   287: aconst_null    
        //   288: aastore        
        //   289: iinc            11, 1
        //   292: goto            159
        //   295: iconst_0       
        //   296: istore          13
        //   298: aload           7
        //   300: astore_2       
        //   301: aload           10
        //   303: astore          7
        //   305: aload_1        
        //   306: astore          10
        //   308: iload           13
        //   310: aload           10
        //   312: arraylength    
        //   313: if_icmpge       941
        //   316: aload           10
        //   318: iload           13
        //   320: aaload         
        //   321: astore          9
        //   323: aload           9
        //   325: ifnonnull       331
        //   328: goto            935
        //   331: aload_3        
        //   332: iload           13
        //   334: aaload         
        //   335: astore          8
        //   337: aload           8
        //   339: ifnonnull       900
        //   342: aload           4
        //   344: iload           13
        //   346: iconst_1       
        //   347: bastore        
        //   348: aload           7
        //   350: iload           13
        //   352: iaload         
        //   353: istore          11
        //   355: aload_2        
        //   356: getfield        bin.u:[Lbue;
        //   359: iload           11
        //   361: aaload         
        //   362: astore          12
        //   364: aload           12
        //   366: getfield        bue.a:I
        //   369: istore          11
        //   371: iload           11
        //   373: ifne            832
        //   376: aload           12
        //   378: getfield        bue.d:I
        //   381: istore          11
        //   383: iload           11
        //   385: iconst_m1      
        //   386: if_icmpeq       395
        //   389: iconst_1       
        //   390: istore          14
        //   392: goto            398
        //   395: iconst_0       
        //   396: istore          14
        //   398: iload           14
        //   400: ifeq            420
        //   403: aload_2        
        //   404: getfield        bin.p:Lbpd;
        //   407: iload           11
        //   409: invokevirtual   bpd.b:(I)Lazm;
        //   412: astore          8
        //   414: iconst_1       
        //   415: istore          11
        //   417: goto            426
        //   420: aconst_null    
        //   421: astore          8
        //   423: iconst_0       
        //   424: istore          11
        //   426: aload           12
        //   428: getfield        bue.c:I
        //   431: istore          15
        //   433: iload           15
        //   435: iconst_m1      
        //   436: if_icmpeq       445
        //   439: iconst_1       
        //   440: istore          16
        //   442: goto            448
        //   445: iconst_0       
        //   446: istore          16
        //   448: iload           16
        //   450: ifeq            477
        //   453: aload_2        
        //   454: getfield        bin.p:Lbpd;
        //   457: iload           15
        //   459: invokevirtual   bpd.b:(I)Lazm;
        //   462: astore          10
        //   464: iload           11
        //   466: aload           10
        //   468: getfield        azm.a:I
        //   471: iadd           
        //   472: istore          11
        //   474: goto            480
        //   477: aconst_null    
        //   478: astore          10
        //   480: iload           11
        //   482: anewarray       Layf;
        //   485: astore          17
        //   487: iload           11
        //   489: newarray        I
        //   491: astore          18
        //   493: iload           14
        //   495: ifeq            519
        //   498: aload           17
        //   500: iconst_0       
        //   501: aload           8
        //   503: iconst_0       
        //   504: invokevirtual   azm.a:(I)Layf;
        //   507: aastore        
        //   508: aload           18
        //   510: iconst_0       
        //   511: iconst_5       
        //   512: iastore        
        //   513: iconst_1       
        //   514: istore          11
        //   516: goto            522
        //   519: iconst_0       
        //   520: istore          11
        //   522: new             Ljava/util/ArrayList;
        //   525: dup            
        //   526: invokespecial   java/util/ArrayList.<init>:()V
        //   529: astore          8
        //   531: iload           16
        //   533: ifeq            590
        //   536: iconst_0       
        //   537: istore          16
        //   539: iload           16
        //   541: aload           10
        //   543: getfield        azm.a:I
        //   546: if_icmpge       590
        //   549: aload           10
        //   551: iload           16
        //   553: invokevirtual   azm.a:(I)Layf;
        //   556: astore          19
        //   558: aload           17
        //   560: iload           11
        //   562: aload           19
        //   564: aastore        
        //   565: aload           18
        //   567: iload           11
        //   569: iconst_3       
        //   570: iastore        
        //   571: aload           8
        //   573: aload           19
        //   575: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   580: pop            
        //   581: iinc            11, 1
        //   584: iinc            16, 1
        //   587: goto            539
        //   590: aload_2        
        //   591: getfield        bin.f:Lbjg;
        //   594: getfield        bjg.d:Z
        //   597: ifeq            630
        //   600: iload           14
        //   602: ifeq            630
        //   605: aload_2        
        //   606: getfield        bin.b:Lbjd;
        //   609: astore          10
        //   611: new             Lbjc;
        //   614: dup            
        //   615: aload           10
        //   617: aload           10
        //   619: getfield        bjd.h:Lbre;
        //   622: invokespecial   bjc.<init>:(Lbjd;Lbre;)V
        //   625: astore          10
        //   627: goto            633
        //   630: aconst_null    
        //   631: astore          10
        //   633: aload_2        
        //   634: getfield        bin.w:Lbhu;
        //   637: astore          20
        //   639: aload_2        
        //   640: getfield        bin.o:Lbro;
        //   643: astore          21
        //   645: aload_2        
        //   646: getfield        bin.f:Lbjg;
        //   649: astore          22
        //   651: aload_2        
        //   652: getfield        bin.v:Lder;
        //   655: astore          23
        //   657: aload_2        
        //   658: getfield        bin.g:I
        //   661: istore          16
        //   663: aload           12
        //   665: getfield        bue.g:Ljava/lang/Object;
        //   668: astore          24
        //   670: aload           12
        //   672: getfield        bue.b:I
        //   675: istore          11
        //   677: aload_2        
        //   678: getfield        bin.n:J
        //   681: lstore          25
        //   683: aload_2        
        //   684: getfield        bin.k:Lbcn;
        //   687: astore          19
        //   689: aload           20
        //   691: getfield        bhu.a:Ljava/lang/Object;
        //   694: invokeinterface bbj.a:()Lbbk;
        //   699: astore          20
        //   701: aload           19
        //   703: ifnull          715
        //   706: aload           20
        //   708: aload           19
        //   710: invokeinterface bbk.e:(Lbcn;)V
        //   715: new             Lbiz;
        //   718: dup            
        //   719: aload           21
        //   721: aload           22
        //   723: aload           23
        //   725: iload           16
        //   727: aload           24
        //   729: checkcast       [I
        //   732: aload           9
        //   734: iload           11
        //   736: aload           20
        //   738: lload           25
        //   740: iload           14
        //   742: aload           8
        //   744: aload           10
        //   746: aconst_null    
        //   747: aconst_null    
        //   748: invokespecial   biz.<init>:(Lbro;Lbjg;Lder;I[ILbqv;ILbbk;JZLjava/util/List;Lbjc;[B[B)V
        //   751: astore          8
        //   753: new             Lbpp;
        //   756: dup            
        //   757: aload           12
        //   759: getfield        bue.b:I
        //   762: aload           18
        //   764: aload           17
        //   766: aload           8
        //   768: aload_0        
        //   769: aload_2        
        //   770: getfield        bin.t:Lbre;
        //   773: lload           5
        //   775: aload_2        
        //   776: getfield        bin.l:Lbkr;
        //   779: aload_2        
        //   780: getfield        bin.x:Ltrg;
        //   783: aload_2        
        //   784: getfield        bin.m:Lbrh;
        //   787: aload_2        
        //   788: getfield        bin.r:Lbny;
        //   791: aconst_null    
        //   792: aconst_null    
        //   793: aconst_null    
        //   794: aconst_null    
        //   795: invokespecial   bpp.<init>:(I[I[Layf;Lbpq;Lbow;Lbre;JLbkr;Ltrg;Lbrh;Lbny;[B[B[B[B)V
        //   798: astore          8
        //   800: aload_0        
        //   801: astore_2       
        //   802: aload_0        
        //   803: monitorenter   
        //   804: aload_2        
        //   805: getfield        bin.q:Ljava/util/IdentityHashMap;
        //   808: aload           8
        //   810: aload           10
        //   812: invokevirtual   java/util/IdentityHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   815: pop            
        //   816: aload_0        
        //   817: monitorexit    
        //   818: aload_3        
        //   819: iload           13
        //   821: aload           8
        //   823: aastore        
        //   824: goto            328
        //   827: astore_1       
        //   828: aload_0        
        //   829: monitorexit    
        //   830: aload_1        
        //   831: athrow         
        //   832: aload_2        
        //   833: astore          10
        //   835: aload           10
        //   837: astore_2       
        //   838: iload           11
        //   840: iconst_2       
        //   841: if_icmpne       328
        //   844: aload_3        
        //   845: iload           13
        //   847: new             Lbja;
        //   850: dup            
        //   851: aload           10
        //   853: getfield        bin.h:Ljava/util/List;
        //   856: aload           12
        //   858: getfield        bue.e:I
        //   861: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   866: checkcast       Lder;
        //   869: aload           9
        //   871: invokeinterface bqv.j:()Lazm;
        //   876: iconst_0       
        //   877: invokevirtual   azm.a:(I)Layf;
        //   880: aload           10
        //   882: getfield        bin.f:Lbjg;
        //   885: getfield        bjg.d:Z
        //   888: aconst_null    
        //   889: aconst_null    
        //   890: invokespecial   bja.<init>:(Lder;Layf;Z[B[B)V
        //   893: aastore        
        //   894: aload           10
        //   896: astore_2       
        //   897: goto            935
        //   900: aload_2        
        //   901: astore          10
        //   903: aload           10
        //   905: astore_2       
        //   906: aload           8
        //   908: instanceof      Lbpp;
        //   911: ifeq            935
        //   914: aload           8
        //   916: checkcast       Lbpp;
        //   919: getfield        bpp.e:Lbpq;
        //   922: checkcast       Lbil;
        //   925: aload           9
        //   927: invokeinterface bil.b:(Lbqv;)V
        //   932: aload           10
        //   934: astore_2       
        //   935: iinc            13, 1
        //   938: goto            305
        //   941: aload           7
        //   943: astore          4
        //   945: iconst_0       
        //   946: istore          11
        //   948: iload           11
        //   950: aload_1        
        //   951: arraylength    
        //   952: if_icmpge       1159
        //   955: aload_3        
        //   956: iload           11
        //   958: aaload         
        //   959: ifnonnull       1153
        //   962: aload_1        
        //   963: iload           11
        //   965: aaload         
        //   966: ifnull          1153
        //   969: aload           4
        //   971: astore          7
        //   973: aload           7
        //   975: iload           11
        //   977: iaload         
        //   978: istore          13
        //   980: aload_2        
        //   981: getfield        bin.u:[Lbue;
        //   984: iload           13
        //   986: aaload         
        //   987: astore          10
        //   989: aload           10
        //   991: getfield        bue.a:I
        //   994: iconst_1       
        //   995: if_icmpne       1150
        //   998: aload_2        
        //   999: iload           11
        //  1001: aload           7
        //  1003: invokespecial   bin.p:(I[I)I
        //  1006: istore          13
        //  1008: iload           13
        //  1010: iconst_m1      
        //  1011: if_icmpne       1028
        //  1014: aload_3        
        //  1015: iload           11
        //  1017: new             Lbnj;
        //  1020: dup            
        //  1021: invokespecial   bnj.<init>:()V
        //  1024: aastore        
        //  1025: goto            1153
        //  1028: aload_3        
        //  1029: iload           13
        //  1031: aaload         
        //  1032: checkcast       Lbpp;
        //  1035: astore          7
        //  1037: aload           10
        //  1039: getfield        bue.b:I
        //  1042: istore          16
        //  1044: iconst_0       
        //  1045: istore          13
        //  1047: iload           13
        //  1049: aload           7
        //  1051: getfield        bpp.g:[Lbou;
        //  1054: arraylength    
        //  1055: if_icmpge       1142
        //  1058: aload           7
        //  1060: getfield        bpp.b:[I
        //  1063: iload           13
        //  1065: iaload         
        //  1066: iload           16
        //  1068: if_icmpne       1136
        //  1071: aload           7
        //  1073: getfield        bpp.d:[Z
        //  1076: iload           13
        //  1078: baload         
        //  1079: iconst_1       
        //  1080: ixor           
        //  1081: invokestatic    dk.h:(Z)V
        //  1084: aload           7
        //  1086: getfield        bpp.d:[Z
        //  1089: iload           13
        //  1091: iconst_1       
        //  1092: bastore        
        //  1093: aload           7
        //  1095: getfield        bpp.g:[Lbou;
        //  1098: iload           13
        //  1100: aaload         
        //  1101: lload           5
        //  1103: iconst_1       
        //  1104: invokevirtual   bou.C:(JZ)Z
        //  1107: pop            
        //  1108: aload_3        
        //  1109: iload           11
        //  1111: new             Lbpn;
        //  1114: dup            
        //  1115: aload           7
        //  1117: aload           7
        //  1119: aload           7
        //  1121: getfield        bpp.g:[Lbou;
        //  1124: iload           13
        //  1126: aaload         
        //  1127: iload           13
        //  1129: invokespecial   bpn.<init>:(Lbpp;Lbpp;Lbou;I)V
        //  1132: aastore        
        //  1133: goto            1153
        //  1136: iinc            13, 1
        //  1139: goto            1047
        //  1142: new             Ljava/lang/IllegalStateException;
        //  1145: dup            
        //  1146: invokespecial   java/lang/IllegalStateException.<init>:()V
        //  1149: athrow         
        //  1150: goto            1153
        //  1153: iinc            11, 1
        //  1156: goto            948
        //  1159: new             Ljava/util/ArrayList;
        //  1162: dup            
        //  1163: invokespecial   java/util/ArrayList.<init>:()V
        //  1166: astore          4
        //  1168: new             Ljava/util/ArrayList;
        //  1171: dup            
        //  1172: invokespecial   java/util/ArrayList.<init>:()V
        //  1175: astore_1       
        //  1176: aload_3        
        //  1177: arraylength    
        //  1178: istore          13
        //  1180: iconst_0       
        //  1181: istore          11
        //  1183: iload           11
        //  1185: iload           13
        //  1187: if_icmpge       1242
        //  1190: aload_3        
        //  1191: iload           11
        //  1193: aaload         
        //  1194: astore          7
        //  1196: aload           7
        //  1198: instanceof      Lbpp;
        //  1201: ifeq            1218
        //  1204: aload           4
        //  1206: aload           7
        //  1208: checkcast       Lbpp;
        //  1211: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1214: pop            
        //  1215: goto            1236
        //  1218: aload           7
        //  1220: instanceof      Lbja;
        //  1223: ifeq            1236
        //  1226: aload_1        
        //  1227: aload           7
        //  1229: checkcast       Lbja;
        //  1232: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1235: pop            
        //  1236: iinc            11, 1
        //  1239: goto            1183
        //  1242: aload           4
        //  1244: invokevirtual   java/util/ArrayList.size:()I
        //  1247: anewarray       Lbpp;
        //  1250: astore_3       
        //  1251: aload_2        
        //  1252: aload_3        
        //  1253: putfield        bin.d:[Lbpp;
        //  1256: aload           4
        //  1258: aload_3        
        //  1259: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //  1262: pop            
        //  1263: aload_1        
        //  1264: invokevirtual   java/util/ArrayList.size:()I
        //  1267: anewarray       Lbja;
        //  1270: astore_3       
        //  1271: aload_2        
        //  1272: aload_3        
        //  1273: putfield        bin.e:[Lbja;
        //  1276: aload_1        
        //  1277: aload_3        
        //  1278: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //  1281: pop            
        //  1282: aload_2        
        //  1283: aload_2        
        //  1284: getfield        bin.d:[Lbpp;
        //  1287: invokestatic    bkv.b:([Lbox;)Lbox;
        //  1290: putfield        bin.s:Lbox;
        //  1293: lload           5
        //  1295: lreturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  804    818    827    832    Any
        //  828    830    827    832    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public final bpd h() {
        return this.p;
    }
    
    public final void i(final long n, final boolean b) {
        final bpp[] d = this.d;
        for (int length = d.length, i = 0; i < length; ++i) {
            d[i].g(n, b);
        }
    }
    
    public final void j() {
        this.o.a();
    }
    
    public final void k(final bpp bpp) {
        synchronized (this) {
            final bjc bjc = this.q.remove(bpp);
            if (bjc != null) {
                bjc.a.v();
            }
        }
    }
    
    public final void l(final bnt c, final long n) {
        (this.c = c).kX((bnu)this);
    }
    
    public final void m(final long n) {
        this.s.m(n);
    }
    
    public final boolean n(final long n) {
        return this.s.n(n);
    }
    
    public final boolean o() {
        return this.s.o();
    }
}
