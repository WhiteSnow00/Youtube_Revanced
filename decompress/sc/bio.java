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

final class bio implements bnv, box, bpp
{
    private static final Pattern i;
    private static final Pattern j;
    final int a;
    public final bje b;
    public bnu c;
    public bpq[] d;
    public bjb[] e;
    public bjh f;
    public int g;
    public List h;
    private final bco k;
    private final bks l;
    private final bri m;
    private final long n;
    private final brp o;
    private final bpe p;
    private final IdentityHashMap q;
    private final bnz r;
    private boy s;
    private final brf t;
    private final buf[] u;
    private final des v;
    private final bhv w;
    private final ttl x;
    
    static {
        i = Pattern.compile("CC([1-4])=(.+)");
        j = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    }
    
    public bio(int i, final bjh f, des v, int j, final bhv w, final bco k, final bks l, final ttl x, final bri m, final bnz r, final long n, final brp o, final brf t, final pvh pvh, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
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
        this.b = new bje(f, pvh, t, null, null, null, null);
        this.d = new bpq[0];
        this.e = new bjb[0];
        this.q = new IdentityHashMap();
        this.s = bkw.b((boy[])this.d);
        final adhi d = f.d(j);
        this.h = (List)d.b;
        final Object d2 = d.d;
        final List h = this.h;
        final int size = ((List)d2).size();
        final SparseIntArray sparseIntArray = new SparseIntArray(size);
        final ArrayList list = new ArrayList(size);
        final SparseArray sparseArray = new SparseArray(size);
        ArrayList list2;
        for (i = 0; i < size; ++i) {
            sparseIntArray.put(((bjf)((List)d2).get(i)).a, i);
            list2 = new ArrayList();
            list2.add(i);
            list.add((Object)list2);
            sparseArray.put(i, (Object)list2);
        }
        bjf bjf;
        bjk bjk;
        int n2;
        bjk q;
        String[] ap;
        int length;
        int n3;
        int value;
        int min;
        List list3;
        List list4;
        for (j = 0; j < size; ++j) {
            bjf = (bjf)((List)d2).get(j);
            if ((bjk = r(bjf.e)) == null) {
                bjk = r(bjf.f);
            }
            if (bjk == null || (i = sparseIntArray.get(Integer.parseInt(bjk.b), -1)) == -1) {
                i = j;
            }
            if ((n2 = i) == j) {
                q = q(bjf.f, "urn:mpeg:dash:adaptation-set-switching:2016");
                n2 = i;
                if (q != null) {
                    ap = bax.ap(q.b, ",");
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
            Arrays.sort(array9[i] = afwm.J((Collection)list.get(i)));
        }
        final boolean[] array10 = new boolean[size2];
        final ayg[][] array11 = new ayg[size2][];
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
                for (c = ((bjf)((List)d2).get(array12[n5])).c, i = n6; i < c.size(); ++i) {
                    if (!((bjp)c.get(i)).g.isEmpty()) {
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
                    final bjf bjf2 = (bjf)((List)d2).get(n7);
                    final List d3 = ((bjf)((List)d2).get(n7)).d;
                    for (int n8 = 0; n8 < d3.size(); ++n8) {
                        final bjk bjk2 = d3.get(n8);
                        if ("urn:scte:dash:cc:cea-608:2015".equals(bjk2.a)) {
                            final ayf ayf = new ayf();
                            ayf.k = "application/cea-608";
                            j = bjf2.a;
                            final StringBuilder sb = new StringBuilder();
                            sb.append(j);
                            sb.append(":cea608");
                            ayf.a = sb.toString();
                            final ayg[] array14 = s(bjk2, bio.i, ayf.a());
                            break Label_0963;
                        }
                        if ("urn:scte:dash:cc:cea-708:2015".equals(bjk2.a)) {
                            final ayf ayf2 = new ayf();
                            ayf2.k = "application/cea-708";
                            j = bjf2.a;
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(j);
                            sb2.append(":cea708");
                            ayf2.a = sb2.toString();
                            final ayg[] array14 = s(bjk2, bio.j, ayf2.a());
                            break Label_0963;
                        }
                    }
                    ++j;
                    continue Label_0963_Outer;
                    ayg[] array14 = null;
                    array11[n4] = array14;
                    j = i;
                    if (array14.length != 0) {
                        j = i + 1;
                    }
                    ++n4;
                    continue Label_0963_Outer;
                }
                final ayg[] array14 = new ayg[0];
                continue Label_0963;
            }
        }
        i = j + size2 + h.size();
        final azn[] array15 = new azn[i];
        final buf[] array16 = new buf[i];
        int n9 = 0;
        j = 0;
        final boolean[] array17 = array10;
        final int[][] array18 = array9;
        while (n9 < size2) {
            final int[] array19 = array18[n9];
            final ArrayList list5 = new ArrayList();
            int length4;
            for (length4 = array19.length, i = 0; i < length4; ++i) {
                list5.addAll(((bjf)((List)d2).get(array19[i])).c);
            }
            i = list5.size();
            final ayg[] array20 = new ayg[i];
            for (int n10 = 0; n10 < i; ++n10) {
                final ayg d4 = ((bjp)list5.get(n10)).d;
                array20[n10] = d4.c(l.a(d4));
            }
            final bjf bjf3 = (bjf)((List)d2).get(array19[0]);
            i = bjf3.a;
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
            array15[j] = new azn(s, array20);
            array16[j] = new buf(bjf3.b, 0, array19, j, n11, n13, -1);
            if (n11 != -1) {
                final String value2 = String.valueOf(s);
                final ayf ayf3 = new ayf();
                final String concat = value2.concat(":emsg");
                ayf3.a = concat;
                ayf3.k = "application/x-emsg";
                array15[n11] = new azn(concat, new ayg[] { ayf3.a() });
                array16[n11] = new buf(5, 1, array19, j, -1, -1, -1);
            }
            if (n13 != -1) {
                array15[n13] = new azn(String.valueOf(s).concat(":cc"), array11[n9]);
                array16[n13] = new buf(3, 1, array19, j, -1, -1, -1);
            }
            ++n9;
            j = i;
        }
        ayf ayf4;
        ayg a;
        String a2;
        StringBuilder sb4;
        for (i = 0; i < h.size(); ++i, ++j) {
            v = (des)h.get(i);
            ayf4 = new ayf();
            ayf4.a = v.a();
            ayf4.k = "application/x-emsg";
            a = ayf4.a();
            a2 = v.a();
            sb4 = new StringBuilder();
            sb4.append(a2);
            sb4.append(":");
            sb4.append(i);
            array15[j] = new azn(sb4.toString(), new ayg[] { a });
            array16[j] = new buf(5, 2, new int[0], -1, -1, -1, i);
        }
        final Pair create = Pair.create((Object)new bpe(array15), (Object)array16);
        this.p = (bpe)create.first;
        this.u = (buf[])create.second;
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
    
    private static bjk q(final List list, final String s) {
        for (int i = 0; i < list.size(); ++i) {
            final bjk bjk = list.get(i);
            if (s.equals(bjk.a)) {
                return bjk;
            }
        }
        return null;
    }
    
    private static bjk r(final List list) {
        return q(list, "http://dashif.org/guidelines/trickmode");
    }
    
    private static ayg[] s(final bjk bjk, final Pattern pattern, final ayg ayg) {
        final String b = bjk.b;
        if (b == null) {
            return new ayg[] { ayg };
        }
        final String[] ap = bax.ap(b, ";");
        final ayg[] array = new ayg[ap.length];
        for (int i = 0; i < ap.length; ++i) {
            final Matcher matcher = pattern.matcher(ap[i]);
            if (!matcher.matches()) {
                return new ayg[] { ayg };
            }
            final int int1 = Integer.parseInt(matcher.group(1));
            final ayf b2 = ayg.b();
            final String c = ayg.c;
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
    
    public final long a(final long n, final bfv bfv) {
        for (final bpq bpq : this.d) {
            if (bpq.a == 2) {
                return bpq.f(n, bfv);
            }
        }
        return n;
    }
    
    public final /* bridge */ void b(final boy boy) {
        this.c.b((boy)this);
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
        final bpq[] d = this.d;
        final int length = d.length;
        final int n2 = 0;
        for (int i = 0; i < length; ++i) {
            d[i].j(n);
        }
        final bjb[] e = this.e;
        for (int length2 = e.length, j = n2; j < length2; ++j) {
            e[j].c(n);
        }
        return n;
    }
    
    public final long g(final bqw[] p0, final boolean[] p1, final bow[] p2, final boolean[] p3, final long p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          14
        //     3: aload_1        
        //     4: arraylength    
        //     5: newarray        I
        //     7: astore          15
        //     9: iconst_0       
        //    10: istore          7
        //    12: iload           7
        //    14: aload_1        
        //    15: arraylength    
        //    16: if_icmpge       65
        //    19: aload_1        
        //    20: iload           7
        //    22: aaload         
        //    23: astore          16
        //    25: aload           16
        //    27: ifnull          53
        //    30: aload           15
        //    32: iload           7
        //    34: aload           14
        //    36: getfield        bio.p:Lbpe;
        //    39: aload           16
        //    41: invokeinterface bqw.j:()Lazn;
        //    46: invokevirtual   bpe.a:(Lazn;)I
        //    49: iastore        
        //    50: goto            59
        //    53: aload           15
        //    55: iload           7
        //    57: iconst_m1      
        //    58: iastore        
        //    59: iinc            7, 1
        //    62: goto            12
        //    65: iconst_0       
        //    66: istore          7
        //    68: iload           7
        //    70: aload_1        
        //    71: arraylength    
        //    72: if_icmpge       143
        //    75: aload_1        
        //    76: iload           7
        //    78: aaload         
        //    79: ifnull          89
        //    82: aload_2        
        //    83: iload           7
        //    85: baload         
        //    86: ifne            137
        //    89: aload_3        
        //    90: iload           7
        //    92: aaload         
        //    93: astore          16
        //    95: aload           16
        //    97: instanceof      Lbpq;
        //   100: ifeq            116
        //   103: aload           16
        //   105: checkcast       Lbpq;
        //   108: aload           14
        //   110: invokevirtual   bpq.i:(Lbpp;)V
        //   113: goto            132
        //   116: aload           16
        //   118: instanceof      Lbpo;
        //   121: ifeq            132
        //   124: aload           16
        //   126: checkcast       Lbpo;
        //   129: invokevirtual   bpo.c:()V
        //   132: aload_3        
        //   133: iload           7
        //   135: aconst_null    
        //   136: aastore        
        //   137: iinc            7, 1
        //   140: goto            68
        //   143: iconst_0       
        //   144: istore          7
        //   146: aload_1        
        //   147: arraylength    
        //   148: istore          8
        //   150: iconst_1       
        //   151: istore          13
        //   153: iload           7
        //   155: iload           8
        //   157: if_icmpge       275
        //   160: aload_3        
        //   161: iload           7
        //   163: aaload         
        //   164: astore_2       
        //   165: aload_2        
        //   166: instanceof      Lbnk;
        //   169: ifne            179
        //   172: aload_2        
        //   173: instanceof      Lbpo;
        //   176: ifeq            269
        //   179: aload           14
        //   181: iload           7
        //   183: aload           15
        //   185: invokespecial   bio.p:(I[I)I
        //   188: istore          8
        //   190: iload           8
        //   192: iconst_m1      
        //   193: if_icmpne       208
        //   196: aload_3        
        //   197: iload           7
        //   199: aaload         
        //   200: instanceof      Lbnk;
        //   203: istore          13
        //   205: goto            240
        //   208: aload_3        
        //   209: iload           7
        //   211: aaload         
        //   212: astore_2       
        //   213: aload_2        
        //   214: instanceof      Lbpo;
        //   217: ifeq            237
        //   220: aload_2        
        //   221: checkcast       Lbpo;
        //   224: getfield        bpo.a:Lbpq;
        //   227: aload_3        
        //   228: iload           8
        //   230: aaload         
        //   231: if_acmpne       237
        //   234: goto            240
        //   237: iconst_0       
        //   238: istore          13
        //   240: iload           13
        //   242: ifne            269
        //   245: aload_3        
        //   246: iload           7
        //   248: aaload         
        //   249: astore_2       
        //   250: aload_2        
        //   251: instanceof      Lbpo;
        //   254: ifeq            264
        //   257: aload_2        
        //   258: checkcast       Lbpo;
        //   261: invokevirtual   bpo.c:()V
        //   264: aload_3        
        //   265: iload           7
        //   267: aconst_null    
        //   268: aastore        
        //   269: iinc            7, 1
        //   272: goto            146
        //   275: iconst_0       
        //   276: istore          8
        //   278: aload           14
        //   280: astore_2       
        //   281: aload           15
        //   283: astore          14
        //   285: iload           8
        //   287: aload_1        
        //   288: arraylength    
        //   289: if_icmpge       916
        //   292: aload_1        
        //   293: iload           8
        //   295: aaload         
        //   296: astore          17
        //   298: aload           17
        //   300: ifnonnull       306
        //   303: goto            910
        //   306: aload_3        
        //   307: iload           8
        //   309: aaload         
        //   310: astore          16
        //   312: aload           16
        //   314: ifnonnull       875
        //   317: aload           4
        //   319: iload           8
        //   321: iconst_1       
        //   322: bastore        
        //   323: aload           14
        //   325: iload           8
        //   327: iaload         
        //   328: istore          7
        //   330: aload_2        
        //   331: getfield        bio.u:[Lbuf;
        //   334: iload           7
        //   336: aaload         
        //   337: astore          18
        //   339: aload           18
        //   341: getfield        buf.a:I
        //   344: istore          7
        //   346: iload           7
        //   348: ifne            807
        //   351: aload           18
        //   353: getfield        buf.d:I
        //   356: istore          7
        //   358: iload           7
        //   360: iconst_m1      
        //   361: if_icmpeq       370
        //   364: iconst_1       
        //   365: istore          13
        //   367: goto            373
        //   370: iconst_0       
        //   371: istore          13
        //   373: iload           13
        //   375: ifeq            395
        //   378: aload_2        
        //   379: getfield        bio.p:Lbpe;
        //   382: iload           7
        //   384: invokevirtual   bpe.b:(I)Lazn;
        //   387: astore          16
        //   389: iconst_1       
        //   390: istore          7
        //   392: goto            401
        //   395: aconst_null    
        //   396: astore          16
        //   398: iconst_0       
        //   399: istore          7
        //   401: aload           18
        //   403: getfield        buf.c:I
        //   406: istore          10
        //   408: iload           10
        //   410: iconst_m1      
        //   411: if_icmpeq       420
        //   414: iconst_1       
        //   415: istore          9
        //   417: goto            423
        //   420: iconst_0       
        //   421: istore          9
        //   423: iload           9
        //   425: ifeq            452
        //   428: aload_2        
        //   429: getfield        bio.p:Lbpe;
        //   432: iload           10
        //   434: invokevirtual   bpe.b:(I)Lazn;
        //   437: astore          15
        //   439: iload           7
        //   441: aload           15
        //   443: getfield        azn.a:I
        //   446: iadd           
        //   447: istore          7
        //   449: goto            455
        //   452: aconst_null    
        //   453: astore          15
        //   455: iload           7
        //   457: anewarray       Layg;
        //   460: astore          19
        //   462: iload           7
        //   464: newarray        I
        //   466: astore          20
        //   468: iload           13
        //   470: ifeq            494
        //   473: aload           19
        //   475: iconst_0       
        //   476: aload           16
        //   478: iconst_0       
        //   479: invokevirtual   azn.a:(I)Layg;
        //   482: aastore        
        //   483: aload           20
        //   485: iconst_0       
        //   486: iconst_5       
        //   487: iastore        
        //   488: iconst_1       
        //   489: istore          7
        //   491: goto            497
        //   494: iconst_0       
        //   495: istore          7
        //   497: new             Ljava/util/ArrayList;
        //   500: dup            
        //   501: invokespecial   java/util/ArrayList.<init>:()V
        //   504: astore          16
        //   506: iload           9
        //   508: ifeq            565
        //   511: iconst_0       
        //   512: istore          9
        //   514: iload           9
        //   516: aload           15
        //   518: getfield        azn.a:I
        //   521: if_icmpge       565
        //   524: aload           15
        //   526: iload           9
        //   528: invokevirtual   azn.a:(I)Layg;
        //   531: astore          21
        //   533: aload           19
        //   535: iload           7
        //   537: aload           21
        //   539: aastore        
        //   540: aload           20
        //   542: iload           7
        //   544: iconst_3       
        //   545: iastore        
        //   546: aload           16
        //   548: aload           21
        //   550: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   555: pop            
        //   556: iinc            7, 1
        //   559: iinc            9, 1
        //   562: goto            514
        //   565: aload_2        
        //   566: getfield        bio.f:Lbjh;
        //   569: getfield        bjh.d:Z
        //   572: ifeq            605
        //   575: iload           13
        //   577: ifeq            605
        //   580: aload_2        
        //   581: getfield        bio.b:Lbje;
        //   584: astore          15
        //   586: new             Lbjd;
        //   589: dup            
        //   590: aload           15
        //   592: aload           15
        //   594: getfield        bje.h:Lbrf;
        //   597: invokespecial   bjd.<init>:(Lbje;Lbrf;)V
        //   600: astore          15
        //   602: goto            608
        //   605: aconst_null    
        //   606: astore          15
        //   608: aload_2        
        //   609: getfield        bio.w:Lbhv;
        //   612: astore          26
        //   614: aload_2        
        //   615: getfield        bio.o:Lbrp;
        //   618: astore          24
        //   620: aload_2        
        //   621: getfield        bio.f:Lbjh;
        //   624: astore          25
        //   626: aload_2        
        //   627: getfield        bio.v:Ldes;
        //   630: astore          21
        //   632: aload_2        
        //   633: getfield        bio.g:I
        //   636: istore          9
        //   638: aload           18
        //   640: getfield        buf.g:Ljava/lang/Object;
        //   643: astore          22
        //   645: aload           18
        //   647: getfield        buf.b:I
        //   650: istore          7
        //   652: aload_2        
        //   653: getfield        bio.n:J
        //   656: lstore          11
        //   658: aload_2        
        //   659: getfield        bio.k:Lbco;
        //   662: astore          23
        //   664: aload           26
        //   666: getfield        bhv.a:Ljava/lang/Object;
        //   669: invokeinterface bbk.a:()Lbbl;
        //   674: astore          26
        //   676: aload           23
        //   678: ifnull          690
        //   681: aload           26
        //   683: aload           23
        //   685: invokeinterface bbl.e:(Lbco;)V
        //   690: new             Lbja;
        //   693: dup            
        //   694: aload           24
        //   696: aload           25
        //   698: aload           21
        //   700: iload           9
        //   702: aload           22
        //   704: checkcast       [I
        //   707: aload           17
        //   709: iload           7
        //   711: aload           26
        //   713: lload           11
        //   715: iload           13
        //   717: aload           16
        //   719: aload           15
        //   721: aconst_null    
        //   722: aconst_null    
        //   723: invokespecial   bja.<init>:(Lbrp;Lbjh;Ldes;I[ILbqw;ILbbl;JZLjava/util/List;Lbjd;[B[B)V
        //   726: astore          16
        //   728: new             Lbpq;
        //   731: dup            
        //   732: aload           18
        //   734: getfield        buf.b:I
        //   737: aload           20
        //   739: aload           19
        //   741: aload           16
        //   743: aload_0        
        //   744: aload_2        
        //   745: getfield        bio.t:Lbrf;
        //   748: lload           5
        //   750: aload_2        
        //   751: getfield        bio.l:Lbks;
        //   754: aload_2        
        //   755: getfield        bio.x:Lttl;
        //   758: aload_2        
        //   759: getfield        bio.m:Lbri;
        //   762: aload_2        
        //   763: getfield        bio.r:Lbnz;
        //   766: aconst_null    
        //   767: aconst_null    
        //   768: aconst_null    
        //   769: aconst_null    
        //   770: invokespecial   bpq.<init>:(I[I[Layg;Lbpr;Lbox;Lbrf;JLbks;Lttl;Lbri;Lbnz;[B[B[B[B)V
        //   773: astore          16
        //   775: aload_0        
        //   776: astore_2       
        //   777: aload_0        
        //   778: monitorenter   
        //   779: aload_2        
        //   780: getfield        bio.q:Ljava/util/IdentityHashMap;
        //   783: aload           16
        //   785: aload           15
        //   787: invokevirtual   java/util/IdentityHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   790: pop            
        //   791: aload_0        
        //   792: monitorexit    
        //   793: aload_3        
        //   794: iload           8
        //   796: aload           16
        //   798: aastore        
        //   799: goto            303
        //   802: astore_1       
        //   803: aload_0        
        //   804: monitorexit    
        //   805: aload_1        
        //   806: athrow         
        //   807: aload_2        
        //   808: astore          15
        //   810: aload           15
        //   812: astore_2       
        //   813: iload           7
        //   815: iconst_2       
        //   816: if_icmpne       303
        //   819: aload_3        
        //   820: iload           8
        //   822: new             Lbjb;
        //   825: dup            
        //   826: aload           15
        //   828: getfield        bio.h:Ljava/util/List;
        //   831: aload           18
        //   833: getfield        buf.e:I
        //   836: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   841: checkcast       Ldes;
        //   844: aload           17
        //   846: invokeinterface bqw.j:()Lazn;
        //   851: iconst_0       
        //   852: invokevirtual   azn.a:(I)Layg;
        //   855: aload           15
        //   857: getfield        bio.f:Lbjh;
        //   860: getfield        bjh.d:Z
        //   863: aconst_null    
        //   864: aconst_null    
        //   865: invokespecial   bjb.<init>:(Ldes;Layg;Z[B[B)V
        //   868: aastore        
        //   869: aload           15
        //   871: astore_2       
        //   872: goto            910
        //   875: aload_2        
        //   876: astore          15
        //   878: aload           15
        //   880: astore_2       
        //   881: aload           16
        //   883: instanceof      Lbpq;
        //   886: ifeq            910
        //   889: aload           16
        //   891: checkcast       Lbpq;
        //   894: getfield        bpq.e:Lbpr;
        //   897: checkcast       Lbim;
        //   900: aload           17
        //   902: invokeinterface bim.b:(Lbqw;)V
        //   907: aload           15
        //   909: astore_2       
        //   910: iinc            8, 1
        //   913: goto            285
        //   916: aload           14
        //   918: astore          4
        //   920: iconst_0       
        //   921: istore          7
        //   923: iload           7
        //   925: aload_1        
        //   926: arraylength    
        //   927: if_icmpge       1130
        //   930: aload_3        
        //   931: iload           7
        //   933: aaload         
        //   934: ifnonnull       1124
        //   937: aload_1        
        //   938: iload           7
        //   940: aaload         
        //   941: ifnull          1124
        //   944: aload           4
        //   946: iload           7
        //   948: iaload         
        //   949: istore          8
        //   951: aload_2        
        //   952: getfield        bio.u:[Lbuf;
        //   955: iload           8
        //   957: aaload         
        //   958: astore          14
        //   960: aload           14
        //   962: getfield        buf.a:I
        //   965: iconst_1       
        //   966: if_icmpne       1121
        //   969: aload_2        
        //   970: iload           7
        //   972: aload           4
        //   974: invokespecial   bio.p:(I[I)I
        //   977: istore          8
        //   979: iload           8
        //   981: iconst_m1      
        //   982: if_icmpne       999
        //   985: aload_3        
        //   986: iload           7
        //   988: new             Lbnk;
        //   991: dup            
        //   992: invokespecial   bnk.<init>:()V
        //   995: aastore        
        //   996: goto            1124
        //   999: aload_3        
        //  1000: iload           8
        //  1002: aaload         
        //  1003: checkcast       Lbpq;
        //  1006: astore          15
        //  1008: aload           14
        //  1010: getfield        buf.b:I
        //  1013: istore          9
        //  1015: iconst_0       
        //  1016: istore          8
        //  1018: iload           8
        //  1020: aload           15
        //  1022: getfield        bpq.g:[Lbov;
        //  1025: arraylength    
        //  1026: if_icmpge       1113
        //  1029: aload           15
        //  1031: getfield        bpq.b:[I
        //  1034: iload           8
        //  1036: iaload         
        //  1037: iload           9
        //  1039: if_icmpne       1107
        //  1042: aload           15
        //  1044: getfield        bpq.d:[Z
        //  1047: iload           8
        //  1049: baload         
        //  1050: iconst_1       
        //  1051: ixor           
        //  1052: invokestatic    dk.h:(Z)V
        //  1055: aload           15
        //  1057: getfield        bpq.d:[Z
        //  1060: iload           8
        //  1062: iconst_1       
        //  1063: bastore        
        //  1064: aload           15
        //  1066: getfield        bpq.g:[Lbov;
        //  1069: iload           8
        //  1071: aaload         
        //  1072: lload           5
        //  1074: iconst_1       
        //  1075: invokevirtual   bov.C:(JZ)Z
        //  1078: pop            
        //  1079: aload_3        
        //  1080: iload           7
        //  1082: new             Lbpo;
        //  1085: dup            
        //  1086: aload           15
        //  1088: aload           15
        //  1090: aload           15
        //  1092: getfield        bpq.g:[Lbov;
        //  1095: iload           8
        //  1097: aaload         
        //  1098: iload           8
        //  1100: invokespecial   bpo.<init>:(Lbpq;Lbpq;Lbov;I)V
        //  1103: aastore        
        //  1104: goto            1124
        //  1107: iinc            8, 1
        //  1110: goto            1018
        //  1113: new             Ljava/lang/IllegalStateException;
        //  1116: dup            
        //  1117: invokespecial   java/lang/IllegalStateException.<init>:()V
        //  1120: athrow         
        //  1121: goto            1124
        //  1124: iinc            7, 1
        //  1127: goto            923
        //  1130: new             Ljava/util/ArrayList;
        //  1133: dup            
        //  1134: invokespecial   java/util/ArrayList.<init>:()V
        //  1137: astore          4
        //  1139: new             Ljava/util/ArrayList;
        //  1142: dup            
        //  1143: invokespecial   java/util/ArrayList.<init>:()V
        //  1146: astore_1       
        //  1147: aload_3        
        //  1148: arraylength    
        //  1149: istore          8
        //  1151: iconst_0       
        //  1152: istore          7
        //  1154: iload           7
        //  1156: iload           8
        //  1158: if_icmpge       1213
        //  1161: aload_3        
        //  1162: iload           7
        //  1164: aaload         
        //  1165: astore          14
        //  1167: aload           14
        //  1169: instanceof      Lbpq;
        //  1172: ifeq            1189
        //  1175: aload           4
        //  1177: aload           14
        //  1179: checkcast       Lbpq;
        //  1182: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1185: pop            
        //  1186: goto            1207
        //  1189: aload           14
        //  1191: instanceof      Lbjb;
        //  1194: ifeq            1207
        //  1197: aload_1        
        //  1198: aload           14
        //  1200: checkcast       Lbjb;
        //  1203: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1206: pop            
        //  1207: iinc            7, 1
        //  1210: goto            1154
        //  1213: aload           4
        //  1215: invokevirtual   java/util/ArrayList.size:()I
        //  1218: anewarray       Lbpq;
        //  1221: astore_3       
        //  1222: aload_2        
        //  1223: aload_3        
        //  1224: putfield        bio.d:[Lbpq;
        //  1227: aload           4
        //  1229: aload_3        
        //  1230: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //  1233: pop            
        //  1234: aload_1        
        //  1235: invokevirtual   java/util/ArrayList.size:()I
        //  1238: anewarray       Lbjb;
        //  1241: astore_3       
        //  1242: aload_2        
        //  1243: aload_3        
        //  1244: putfield        bio.e:[Lbjb;
        //  1247: aload_1        
        //  1248: aload_3        
        //  1249: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //  1252: pop            
        //  1253: aload_2        
        //  1254: aload_2        
        //  1255: getfield        bio.d:[Lbpq;
        //  1258: invokestatic    bkw.b:([Lboy;)Lboy;
        //  1261: putfield        bio.s:Lboy;
        //  1264: lload           5
        //  1266: lreturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  779    793    802    807    Any
        //  803    805    802    807    Any
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
    
    public final bpe h() {
        return this.p;
    }
    
    public final void i(final long n, final boolean b) {
        final bpq[] d = this.d;
        for (int length = d.length, i = 0; i < length; ++i) {
            d[i].g(n, b);
        }
    }
    
    public final void j() {
        this.o.a();
    }
    
    public final void k(final bpq bpq) {
        synchronized (this) {
            final bjd bjd = this.q.remove(bpq);
            if (bjd != null) {
                bjd.a.v();
            }
        }
    }
    
    public final void l(final bnu c, final long n) {
        (this.c = c).kX((bnv)this);
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
