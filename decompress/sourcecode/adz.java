import java.util.Locale;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import java.util.Iterator;
import androidx.constraintlayout.widget.Barrier;
import java.lang.reflect.InvocationTargetException;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Log;
import android.content.Context;
import java.util.Arrays;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import android.content.res.TypedArray;
import java.util.HashMap;
import android.util.SparseIntArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adz
{
    public static final int[] a;
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    public final HashMap b;
    private final HashMap e;
    
    static {
        a = new int[] { 0, 4, 8 };
        final SparseIntArray sparseIntArray = c = new SparseIntArray();
        final SparseIntArray sparseIntArray2 = d = new SparseIntArray();
        final int[] a2 = aed.a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }
    
    public adz() {
        this.e = new HashMap();
        this.b = new HashMap();
    }
    
    public static int a(final TypedArray typedArray, final int n, int resourceId) {
        resourceId = typedArray.getResourceId(n, resourceId);
        if (resourceId == -1) {
            return typedArray.getInt(n, -1);
        }
        return resourceId;
    }
    
    static void e(final Object p0, final TypedArray p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iload_2        
        //     2: invokevirtual   android/content/res/TypedArray.peekValue:(I)Landroid/util/TypedValue;
        //     5: getfield        android/util/TypedValue.type:I
        //     8: istore          4
        //    10: iconst_1       
        //    11: istore          5
        //    13: iconst_0       
        //    14: istore          6
        //    16: iload           4
        //    18: iconst_3       
        //    19: if_icmpeq       222
        //    22: iload           4
        //    24: iconst_5       
        //    25: if_icmpeq       84
        //    28: aload_1        
        //    29: iload_2        
        //    30: iconst_0       
        //    31: invokevirtual   android/content/res/TypedArray.getInt:(II)I
        //    34: istore          4
        //    36: iload           4
        //    38: bipush          -4
        //    40: if_icmpeq       78
        //    43: iload           6
        //    45: istore_2       
        //    46: iload           4
        //    48: bipush          -3
        //    50: if_icmpeq       91
        //    53: iload           4
        //    55: istore_2       
        //    56: iload           4
        //    58: bipush          -2
        //    60: if_icmpeq       91
        //    63: iload           4
        //    65: istore_2       
        //    66: iload           4
        //    68: iconst_m1      
        //    69: if_icmpeq       91
        //    72: iload           6
        //    74: istore_2       
        //    75: goto            91
        //    78: bipush          -2
        //    80: istore_2       
        //    81: goto            94
        //    84: aload_1        
        //    85: iload_2        
        //    86: iconst_0       
        //    87: invokevirtual   android/content/res/TypedArray.getDimensionPixelSize:(II)I
        //    90: istore_2       
        //    91: iconst_0       
        //    92: istore          5
        //    94: aload_0        
        //    95: instanceof      Ladq;
        //    98: ifeq            134
        //   101: aload_0        
        //   102: checkcast       Ladq;
        //   105: astore_0       
        //   106: iload_3        
        //   107: ifne            122
        //   110: aload_0        
        //   111: iload_2        
        //   112: putfield        adq.width:I
        //   115: aload_0        
        //   116: iload           5
        //   118: putfield        adq.aa:Z
        //   121: return         
        //   122: aload_0        
        //   123: iload_2        
        //   124: putfield        adq.height:I
        //   127: aload_0        
        //   128: iload           5
        //   130: putfield        adq.ab:Z
        //   133: return         
        //   134: aload_0        
        //   135: instanceof      Ladv;
        //   138: ifeq            174
        //   141: aload_0        
        //   142: checkcast       Ladv;
        //   145: astore_0       
        //   146: iload_3        
        //   147: ifne            162
        //   150: aload_0        
        //   151: iload_2        
        //   152: putfield        adv.d:I
        //   155: aload_0        
        //   156: iload           5
        //   158: putfield        adv.an:Z
        //   161: return         
        //   162: aload_0        
        //   163: iload_2        
        //   164: putfield        adv.e:I
        //   167: aload_0        
        //   168: iload           5
        //   170: putfield        adv.ao:Z
        //   173: return         
        //   174: aload_0        
        //   175: instanceof      Ladt;
        //   178: ifeq            221
        //   181: aload_0        
        //   182: checkcast       Ladt;
        //   185: astore_0       
        //   186: iload_3        
        //   187: ifne            206
        //   190: aload_0        
        //   191: bipush          23
        //   193: iload_2        
        //   194: invokevirtual   adt.b:(II)V
        //   197: aload_0        
        //   198: bipush          80
        //   200: iload           5
        //   202: invokevirtual   adt.d:(IZ)V
        //   205: return         
        //   206: aload_0        
        //   207: bipush          21
        //   209: iload_2        
        //   210: invokevirtual   adt.b:(II)V
        //   213: aload_0        
        //   214: bipush          81
        //   216: iload           5
        //   218: invokevirtual   adt.d:(IZ)V
        //   221: return         
        //   222: aload_1        
        //   223: iload_2        
        //   224: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //   227: astore_1       
        //   228: aload_1        
        //   229: ifnonnull       235
        //   232: goto            686
        //   235: aload_1        
        //   236: bipush          61
        //   238: invokevirtual   java/lang/String.indexOf:(I)I
        //   241: istore_2       
        //   242: aload_1        
        //   243: invokevirtual   java/lang/String.length:()I
        //   246: istore          6
        //   248: iload_2        
        //   249: ifle            686
        //   252: iload_2        
        //   253: iload           6
        //   255: iconst_1       
        //   256: isub           
        //   257: if_icmpge       686
        //   260: aload_1        
        //   261: iconst_0       
        //   262: iload_2        
        //   263: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   266: astore          7
        //   268: aload_1        
        //   269: iload_2        
        //   270: iconst_1       
        //   271: iadd           
        //   272: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   275: astore_1       
        //   276: aload_1        
        //   277: invokevirtual   java/lang/String.length:()I
        //   280: ifle            686
        //   283: aload           7
        //   285: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   288: astore          7
        //   290: aload_1        
        //   291: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   294: astore_1       
        //   295: ldc             "ratio"
        //   297: aload           7
        //   299: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   302: ifeq            373
        //   305: aload_0        
        //   306: instanceof      Ladq;
        //   309: ifeq            340
        //   312: aload_0        
        //   313: checkcast       Ladq;
        //   316: astore_0       
        //   317: iload_3        
        //   318: ifne            329
        //   321: aload_0        
        //   322: iconst_0       
        //   323: putfield        adq.width:I
        //   326: goto            334
        //   329: aload_0        
        //   330: iconst_0       
        //   331: putfield        adq.height:I
        //   334: aload_0        
        //   335: aload_1        
        //   336: invokestatic    adz.f:(Ladq;Ljava/lang/String;)V
        //   339: return         
        //   340: aload_0        
        //   341: instanceof      Ladv;
        //   344: ifeq            356
        //   347: aload_0        
        //   348: checkcast       Ladv;
        //   351: aload_1        
        //   352: putfield        adv.A:Ljava/lang/String;
        //   355: return         
        //   356: aload_0        
        //   357: instanceof      Ladt;
        //   360: ifeq            686
        //   363: aload_0        
        //   364: checkcast       Ladt;
        //   367: iconst_5       
        //   368: aload_1        
        //   369: invokevirtual   adt.c:(ILjava/lang/String;)V
        //   372: return         
        //   373: ldc             "weight"
        //   375: aload           7
        //   377: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   380: ifeq            517
        //   383: aload_1        
        //   384: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //   387: fstore          8
        //   389: aload_0        
        //   390: instanceof      Ladq;
        //   393: ifeq            429
        //   396: aload_0        
        //   397: checkcast       Ladq;
        //   400: astore_0       
        //   401: iload_3        
        //   402: ifne            417
        //   405: aload_0        
        //   406: iconst_0       
        //   407: putfield        adq.width:I
        //   410: aload_0        
        //   411: fload           8
        //   413: putfield        adq.L:F
        //   416: return         
        //   417: aload_0        
        //   418: iconst_0       
        //   419: putfield        adq.height:I
        //   422: aload_0        
        //   423: fload           8
        //   425: putfield        adq.M:F
        //   428: return         
        //   429: aload_0        
        //   430: instanceof      Ladv;
        //   433: ifeq            469
        //   436: aload_0        
        //   437: checkcast       Ladv;
        //   440: astore_0       
        //   441: iload_3        
        //   442: ifne            457
        //   445: aload_0        
        //   446: iconst_0       
        //   447: putfield        adv.d:I
        //   450: aload_0        
        //   451: fload           8
        //   453: putfield        adv.W:F
        //   456: return         
        //   457: aload_0        
        //   458: iconst_0       
        //   459: putfield        adv.e:I
        //   462: aload_0        
        //   463: fload           8
        //   465: putfield        adv.V:F
        //   468: return         
        //   469: aload_0        
        //   470: instanceof      Ladt;
        //   473: ifeq            686
        //   476: aload_0        
        //   477: checkcast       Ladt;
        //   480: astore_0       
        //   481: iload_3        
        //   482: ifne            501
        //   485: aload_0        
        //   486: bipush          23
        //   488: iconst_0       
        //   489: invokevirtual   adt.b:(II)V
        //   492: aload_0        
        //   493: bipush          39
        //   495: fload           8
        //   497: invokevirtual   adt.a:(IF)V
        //   500: return         
        //   501: aload_0        
        //   502: bipush          21
        //   504: iconst_0       
        //   505: invokevirtual   adt.b:(II)V
        //   508: aload_0        
        //   509: bipush          40
        //   511: fload           8
        //   513: invokevirtual   adt.a:(IF)V
        //   516: return         
        //   517: ldc             "parent"
        //   519: aload           7
        //   521: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   524: ifeq            686
        //   527: fconst_0       
        //   528: fconst_1       
        //   529: aload_1        
        //   530: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //   533: invokestatic    java/lang/Math.min:(FF)F
        //   536: invokestatic    java/lang/Math.max:(FF)F
        //   539: fstore          8
        //   541: aload_0        
        //   542: instanceof      Ladq;
        //   545: ifeq            591
        //   548: aload_0        
        //   549: checkcast       Ladq;
        //   552: astore_0       
        //   553: iload_3        
        //   554: ifne            574
        //   557: aload_0        
        //   558: iconst_0       
        //   559: putfield        adq.width:I
        //   562: aload_0        
        //   563: fload           8
        //   565: putfield        adq.V:F
        //   568: aload_0        
        //   569: iconst_2       
        //   570: putfield        adq.P:I
        //   573: return         
        //   574: aload_0        
        //   575: iconst_0       
        //   576: putfield        adq.height:I
        //   579: aload_0        
        //   580: fload           8
        //   582: putfield        adq.W:F
        //   585: aload_0        
        //   586: iconst_2       
        //   587: putfield        adq.Q:I
        //   590: return         
        //   591: aload_0        
        //   592: instanceof      Ladv;
        //   595: ifeq            641
        //   598: aload_0        
        //   599: checkcast       Ladv;
        //   602: astore_0       
        //   603: iload_3        
        //   604: ifne            624
        //   607: aload_0        
        //   608: iconst_0       
        //   609: putfield        adv.d:I
        //   612: aload_0        
        //   613: fload           8
        //   615: putfield        adv.af:F
        //   618: aload_0        
        //   619: iconst_2       
        //   620: putfield        adv.Z:I
        //   623: return         
        //   624: aload_0        
        //   625: iconst_0       
        //   626: putfield        adv.e:I
        //   629: aload_0        
        //   630: fload           8
        //   632: putfield        adv.ag:F
        //   635: aload_0        
        //   636: iconst_2       
        //   637: putfield        adv.aa:I
        //   640: return         
        //   641: aload_0        
        //   642: instanceof      Ladt;
        //   645: ifeq            686
        //   648: aload_0        
        //   649: checkcast       Ladt;
        //   652: astore_0       
        //   653: iload_3        
        //   654: ifne            672
        //   657: aload_0        
        //   658: bipush          23
        //   660: iconst_0       
        //   661: invokevirtual   adt.b:(II)V
        //   664: aload_0        
        //   665: bipush          54
        //   667: iconst_2       
        //   668: invokevirtual   adt.b:(II)V
        //   671: return         
        //   672: aload_0        
        //   673: bipush          21
        //   675: iconst_0       
        //   676: invokevirtual   adt.b:(II)V
        //   679: aload_0        
        //   680: bipush          55
        //   682: iconst_2       
        //   683: invokevirtual   adt.b:(II)V
        //   686: return         
        //   687: astore_0       
        //   688: goto            516
        //   691: astore_0       
        //   692: goto            686
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  383    401    687    691    Ljava/lang/NumberFormatException;
        //  405    416    687    691    Ljava/lang/NumberFormatException;
        //  417    428    687    691    Ljava/lang/NumberFormatException;
        //  429    441    687    691    Ljava/lang/NumberFormatException;
        //  445    456    687    691    Ljava/lang/NumberFormatException;
        //  457    468    687    691    Ljava/lang/NumberFormatException;
        //  469    481    687    691    Ljava/lang/NumberFormatException;
        //  485    500    687    691    Ljava/lang/NumberFormatException;
        //  501    516    687    691    Ljava/lang/NumberFormatException;
        //  527    553    691    695    Ljava/lang/NumberFormatException;
        //  557    573    691    695    Ljava/lang/NumberFormatException;
        //  574    590    691    695    Ljava/lang/NumberFormatException;
        //  591    603    691    695    Ljava/lang/NumberFormatException;
        //  607    623    691    695    Ljava/lang/NumberFormatException;
        //  624    640    691    695    Ljava/lang/NumberFormatException;
        //  641    653    691    695    Ljava/lang/NumberFormatException;
        //  657    671    691    695    Ljava/lang/NumberFormatException;
        //  672    686    691    695    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0574:
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
    
    static void f(final adq adq, final String i) {
        int k = -1;
        float j;
        final float n = j = Float.NaN;
        while (true) {
            if (i == null) {
                break Label_0247;
            }
            final int length = i.length();
            int index = i.indexOf(44);
            k = 0;
            if (index > 0 && index < length - 1) {
                final String substring = i.substring(0, index);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        k = 1;
                    }
                    else {
                        k = -1;
                    }
                }
                ++index;
            }
            else {
                index = 0;
                k = -1;
            }
            final int index2 = i.indexOf(58);
            Label_0221: {
                if (index2 < 0 || index2 >= length - 1) {
                    break Label_0221;
                }
                final String substring2 = i.substring(index, index2);
                final String substring3 = i.substring(index2 + 1);
                j = n;
                if (substring2.length() <= 0) {
                    break Label_0247;
                }
                j = n;
                if (substring3.length() <= 0) {
                    break Label_0247;
                }
                try {
                    final float float1 = Float.parseFloat(substring2);
                    final float float2 = Float.parseFloat(substring3);
                    j = n;
                    if (float1 > 0.0f) {
                        j = n;
                        if (float2 > 0.0f) {
                            if (k == 1) {
                                j = Math.abs(float2 / float1);
                            }
                            else {
                                j = Math.abs(float1 / float2);
                            }
                        }
                    }
                    adq.I = i;
                    adq.J = j;
                    adq.K = k;
                    return;
                    final String substring4 = i.substring(index);
                    j = n;
                    iftrue(Label_0247:)(substring4.length() <= 0);
                    j = Float.parseFloat(substring4);
                    continue;
                }
                catch (final NumberFormatException ex) {
                    j = n;
                    continue;
                }
            }
            break;
        }
    }
    
    public static final int[] g(final View view, String s) {
        final String[] split = s.split(",");
        final Context context = view.getContext();
        s = (String)(Object)new int[split.length];
        int n = 0;
        int n2 = 0;
        int length;
        while (true) {
            length = split.length;
            if (n >= length) {
                break;
            }
            final String trim = split[n].trim();
            int int1;
            try {
                int1 = aec.class.getField(trim).getInt(null);
            }
            catch (final Exception ex) {
                int1 = 0;
            }
            int identifier = int1;
            if (int1 == 0) {
                identifier = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            int intValue = 0;
            Label_0159: {
                if ((intValue = identifier) == 0) {
                    if (view.isInEditMode() && view.getParent() instanceof ConstraintLayout) {
                        final Object e = ((ConstraintLayout)view.getParent()).e((Object)trim);
                        if (e != null && e instanceof Integer) {
                            intValue = (int)e;
                            break Label_0159;
                        }
                    }
                    intValue = 0;
                }
            }
            s[n2] = intValue;
            ++n;
            ++n2;
        }
        if (n2 != length) {
            return Arrays.copyOf((int[])(Object)s, n2);
        }
        return (int[])(Object)s;
    }
    
    private static void h(final adu adu, final TypedArray typedArray) {
        final int indexCount = typedArray.getIndexCount();
        final adt g = new adt();
        adu.g = g;
        adu.c.b = false;
        adu.d.c = false;
        adu.b.a = false;
        adu.e.b = false;
        for (int i = 0; i < indexCount; ++i) {
            final int index = typedArray.getIndex(i);
            switch (adz.d.get(index)) {
                default: {
                    final StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(adz.c.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
                }
                case 99: {
                    g.d(99, typedArray.getBoolean(index, adu.d.i));
                    break;
                }
                case 98: {
                    if (typedArray.peekValue(index).type == 3) {
                        typedArray.getString(index);
                        break;
                    }
                    adu.a = typedArray.getResourceId(index, adu.a);
                    break;
                }
                case 97: {
                    g.b(97, typedArray.getInt(index, adu.d.aq));
                    break;
                }
                case 96: {
                    e(g, typedArray, index, 1);
                    break;
                }
                case 95: {
                    e(g, typedArray, index, 0);
                    break;
                }
                case 94: {
                    g.b(94, typedArray.getDimensionPixelSize(index, adu.d.U));
                    break;
                }
                case 93: {
                    g.b(93, typedArray.getDimensionPixelSize(index, adu.d.N));
                    break;
                }
                case 87: {
                    final StringBuilder sb2 = new StringBuilder("unused attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(adz.c.get(index));
                    Log.w("ConstraintSet", sb2.toString());
                    break;
                }
                case 86: {
                    final TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type == 1) {
                        g.b(89, adu.c.o = typedArray.getResourceId(index, -1));
                        final adw c = adu.c;
                        if (c.o != -1) {
                            g.b(88, c.n = -2);
                            break;
                        }
                        break;
                    }
                    else {
                        if (peekValue.type != 3) {
                            final adw c2 = adu.c;
                            c2.n = typedArray.getInteger(index, c2.o);
                            g.b(88, adu.c.n);
                            break;
                        }
                        g.c(90, adu.c.m = typedArray.getString(index));
                        if (adu.c.m.indexOf("/") > 0) {
                            g.b(89, adu.c.o = typedArray.getResourceId(index, -1));
                            g.b(88, adu.c.n = -2);
                            break;
                        }
                        g.b(88, adu.c.n = -1);
                        break;
                    }
                    break;
                }
                case 85: {
                    g.a(85, typedArray.getFloat(index, adu.c.k));
                    break;
                }
                case 84: {
                    g.b(84, typedArray.getInteger(index, adu.c.l));
                    break;
                }
                case 83: {
                    g.b(83, a(typedArray, index, adu.e.j));
                    break;
                }
                case 82: {
                    g.b(82, typedArray.getInteger(index, adu.c.d));
                    break;
                }
                case 81: {
                    g.d(81, typedArray.getBoolean(index, adu.d.ao));
                    break;
                }
                case 80: {
                    g.d(80, typedArray.getBoolean(index, adu.d.an));
                    break;
                }
                case 79: {
                    g.a(79, typedArray.getFloat(index, adu.c.h));
                    break;
                }
                case 78: {
                    g.b(78, typedArray.getInt(index, adu.b.c));
                    break;
                }
                case 77: {
                    g.c(77, typedArray.getString(index));
                    break;
                }
                case 76: {
                    g.b(76, typedArray.getInt(index, adu.c.f));
                    break;
                }
                case 75: {
                    g.d(75, typedArray.getBoolean(index, adu.d.ap));
                    break;
                }
                case 74: {
                    g.c(74, typedArray.getString(index));
                    break;
                }
                case 73: {
                    g.b(73, typedArray.getDimensionPixelSize(index, adu.d.ai));
                    break;
                }
                case 72: {
                    g.b(72, typedArray.getInt(index, adu.d.ah));
                    break;
                }
                case 71: {
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                }
                case 70: {
                    g.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                }
                case 69: {
                    g.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                }
                case 68: {
                    g.a(68, typedArray.getFloat(index, adu.b.e));
                    break;
                }
                case 67: {
                    g.a(67, typedArray.getFloat(index, adu.c.j));
                    break;
                }
                case 66: {
                    g.b(66, typedArray.getInt(index, 0));
                    break;
                }
                case 65: {
                    if (typedArray.peekValue(index).type == 3) {
                        g.c(65, typedArray.getString(index));
                        break;
                    }
                    g.c(65, acn.a[typedArray.getInteger(index, 0)]);
                    break;
                }
                case 64: {
                    g.b(64, a(typedArray, index, adu.c.c));
                    break;
                }
                case 63: {
                    g.a(63, typedArray.getFloat(index, adu.d.D));
                    break;
                }
                case 62: {
                    g.b(62, typedArray.getDimensionPixelSize(index, adu.d.C));
                    break;
                }
                case 60: {
                    g.a(60, typedArray.getFloat(index, adu.e.c));
                    break;
                }
                case 59: {
                    g.b(59, typedArray.getDimensionPixelSize(index, adu.d.ae));
                    break;
                }
                case 58: {
                    g.b(58, typedArray.getDimensionPixelSize(index, adu.d.ad));
                    break;
                }
                case 57: {
                    g.b(57, typedArray.getDimensionPixelSize(index, adu.d.ac));
                    break;
                }
                case 56: {
                    g.b(56, typedArray.getDimensionPixelSize(index, adu.d.ab));
                    break;
                }
                case 55: {
                    g.b(55, typedArray.getInt(index, adu.d.aa));
                    break;
                }
                case 54: {
                    g.b(54, typedArray.getInt(index, adu.d.Z));
                    break;
                }
                case 53: {
                    g.a(53, typedArray.getDimension(index, adu.e.m));
                    break;
                }
                case 52: {
                    g.a(52, typedArray.getDimension(index, adu.e.l));
                    break;
                }
                case 51: {
                    g.a(51, typedArray.getDimension(index, adu.e.k));
                    break;
                }
                case 50: {
                    g.a(50, typedArray.getDimension(index, adu.e.i));
                    break;
                }
                case 49: {
                    g.a(49, typedArray.getDimension(index, adu.e.h));
                    break;
                }
                case 48: {
                    g.a(48, typedArray.getFloat(index, adu.e.g));
                    break;
                }
                case 47: {
                    g.a(47, typedArray.getFloat(index, adu.e.f));
                    break;
                }
                case 46: {
                    g.a(46, typedArray.getFloat(index, adu.e.e));
                    break;
                }
                case 45: {
                    g.a(45, typedArray.getFloat(index, adu.e.d));
                    break;
                }
                case 44: {
                    g.d(44, true);
                    g.a(44, typedArray.getDimension(index, adu.e.o));
                    break;
                }
                case 43: {
                    g.a(43, typedArray.getFloat(index, adu.b.d));
                    break;
                }
                case 42: {
                    g.b(42, typedArray.getInt(index, adu.d.Y));
                    break;
                }
                case 41: {
                    g.b(41, typedArray.getInt(index, adu.d.X));
                    break;
                }
                case 40: {
                    g.a(40, typedArray.getFloat(index, adu.d.V));
                    break;
                }
                case 39: {
                    g.a(39, typedArray.getFloat(index, adu.d.W));
                    break;
                }
                case 38: {
                    g.b(38, adu.a = typedArray.getResourceId(index, adu.a));
                    break;
                }
                case 37: {
                    g.a(37, typedArray.getFloat(index, adu.d.z));
                    break;
                }
                case 34: {
                    g.b(34, typedArray.getDimensionPixelSize(index, adu.d.J));
                    break;
                }
                case 31: {
                    g.b(31, typedArray.getDimensionPixelSize(index, adu.d.M));
                    break;
                }
                case 28: {
                    g.b(28, typedArray.getDimensionPixelSize(index, adu.d.I));
                    break;
                }
                case 27: {
                    g.b(27, typedArray.getInt(index, adu.d.G));
                    break;
                }
                case 24: {
                    g.b(24, typedArray.getDimensionPixelSize(index, adu.d.H));
                    break;
                }
                case 23: {
                    g.b(23, typedArray.getLayoutDimension(index, adu.d.d));
                    break;
                }
                case 22: {
                    g.b(22, adz.a[typedArray.getInt(index, adu.b.b)]);
                    break;
                }
                case 21: {
                    g.b(21, typedArray.getLayoutDimension(index, adu.d.e));
                    break;
                }
                case 20: {
                    g.a(20, typedArray.getFloat(index, adu.d.y));
                    break;
                }
                case 19: {
                    g.a(19, typedArray.getFloat(index, adu.d.h));
                    break;
                }
                case 18: {
                    g.b(18, typedArray.getDimensionPixelOffset(index, adu.d.g));
                    break;
                }
                case 17: {
                    g.b(17, typedArray.getDimensionPixelOffset(index, adu.d.f));
                    break;
                }
                case 16: {
                    g.b(16, typedArray.getDimensionPixelSize(index, adu.d.P));
                    break;
                }
                case 15: {
                    g.b(15, typedArray.getDimensionPixelSize(index, adu.d.T));
                    break;
                }
                case 14: {
                    g.b(14, typedArray.getDimensionPixelSize(index, adu.d.Q));
                    break;
                }
                case 13: {
                    g.b(13, typedArray.getDimensionPixelSize(index, adu.d.O));
                    break;
                }
                case 12: {
                    g.b(12, typedArray.getDimensionPixelSize(index, adu.d.S));
                    break;
                }
                case 11: {
                    g.b(11, typedArray.getDimensionPixelSize(index, adu.d.R));
                    break;
                }
                case 8: {
                    g.b(8, typedArray.getDimensionPixelSize(index, adu.d.L));
                    break;
                }
                case 7: {
                    g.b(7, typedArray.getDimensionPixelOffset(index, adu.d.F));
                    break;
                }
                case 6: {
                    g.b(6, typedArray.getDimensionPixelOffset(index, adu.d.E));
                    break;
                }
                case 5: {
                    g.c(5, typedArray.getString(index));
                    break;
                }
                case 2: {
                    g.b(2, typedArray.getDimensionPixelSize(index, adu.d.K));
                    break;
                }
            }
        }
    }
    
    private static final adu i(final Context context, final AttributeSet set, final boolean b) {
        final adu adu = new adu();
        int[] array;
        if (b) {
            array = aed.c;
        }
        else {
            array = aed.a;
        }
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, array);
        if (b) {
            h(adu, obtainStyledAttributes);
        }
        else {
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index != 1 && index != 23 && index != 24) {
                    adu.c.b = true;
                    adu.d.c = true;
                    adu.b.a = true;
                    adu.e.b = true;
                }
                final SparseIntArray c = adz.c;
                switch (c.get(index)) {
                    default: {
                        final StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(c.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    }
                    case 97: {
                        final adv d = adu.d;
                        d.aq = obtainStyledAttributes.getInt(index, d.aq);
                        break;
                    }
                    case 96: {
                        e(adu.d, obtainStyledAttributes, index, 1);
                        break;
                    }
                    case 95: {
                        e(adu.d, obtainStyledAttributes, index, 0);
                        break;
                    }
                    case 94: {
                        final adv d2 = adu.d;
                        d2.U = obtainStyledAttributes.getDimensionPixelSize(index, d2.U);
                        break;
                    }
                    case 93: {
                        final adv d3 = adu.d;
                        d3.N = obtainStyledAttributes.getDimensionPixelSize(index, d3.N);
                        break;
                    }
                    case 92: {
                        final adv d4 = adu.d;
                        d4.t = a(obtainStyledAttributes, index, d4.t);
                        break;
                    }
                    case 91: {
                        final adv d5 = adu.d;
                        d5.s = a(obtainStyledAttributes, index, d5.s);
                        break;
                    }
                    case 87: {
                        final StringBuilder sb2 = new StringBuilder("unused attribute 0x");
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(c.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    }
                    case 86: {
                        final TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                        if (peekValue.type == 1) {
                            adu.c.o = obtainStyledAttributes.getResourceId(index, -1);
                            final adw c2 = adu.c;
                            if (c2.o != -1) {
                                c2.n = -2;
                                break;
                            }
                            break;
                        }
                        else {
                            if (peekValue.type != 3) {
                                final adw c3 = adu.c;
                                c3.n = obtainStyledAttributes.getInteger(index, c3.o);
                                break;
                            }
                            adu.c.m = obtainStyledAttributes.getString(index);
                            if (adu.c.m.indexOf("/") > 0) {
                                adu.c.o = obtainStyledAttributes.getResourceId(index, -1);
                                adu.c.n = -2;
                                break;
                            }
                            adu.c.n = -1;
                            break;
                        }
                        break;
                    }
                    case 85: {
                        final adw c4 = adu.c;
                        c4.k = obtainStyledAttributes.getFloat(index, c4.k);
                        break;
                    }
                    case 84: {
                        final adw c5 = adu.c;
                        c5.l = obtainStyledAttributes.getInteger(index, c5.l);
                        break;
                    }
                    case 83: {
                        final ady e = adu.e;
                        e.j = a(obtainStyledAttributes, index, e.j);
                        break;
                    }
                    case 82: {
                        final adw c6 = adu.c;
                        c6.d = obtainStyledAttributes.getInteger(index, c6.d);
                        break;
                    }
                    case 81: {
                        final adv d6 = adu.d;
                        d6.ao = obtainStyledAttributes.getBoolean(index, d6.ao);
                        break;
                    }
                    case 80: {
                        final adv d7 = adu.d;
                        d7.an = obtainStyledAttributes.getBoolean(index, d7.an);
                        break;
                    }
                    case 79: {
                        final adw c7 = adu.c;
                        c7.h = obtainStyledAttributes.getFloat(index, c7.h);
                        break;
                    }
                    case 78: {
                        final adx b2 = adu.b;
                        b2.c = obtainStyledAttributes.getInt(index, b2.c);
                        break;
                    }
                    case 77: {
                        adu.d.am = obtainStyledAttributes.getString(index);
                        break;
                    }
                    case 76: {
                        final adw c8 = adu.c;
                        c8.f = obtainStyledAttributes.getInt(index, c8.f);
                        break;
                    }
                    case 75: {
                        final adv d8 = adu.d;
                        d8.ap = obtainStyledAttributes.getBoolean(index, d8.ap);
                        break;
                    }
                    case 74: {
                        adu.d.al = obtainStyledAttributes.getString(index);
                        break;
                    }
                    case 73: {
                        final adv d9 = adu.d;
                        d9.ai = obtainStyledAttributes.getDimensionPixelSize(index, d9.ai);
                        break;
                    }
                    case 72: {
                        final adv d10 = adu.d;
                        d10.ah = obtainStyledAttributes.getInt(index, d10.ah);
                        break;
                    }
                    case 71: {
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    }
                    case 70: {
                        adu.d.ag = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    }
                    case 69: {
                        adu.d.af = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    }
                    case 68: {
                        final adx b3 = adu.b;
                        b3.e = obtainStyledAttributes.getFloat(index, b3.e);
                        break;
                    }
                    case 67: {
                        final adw c9 = adu.c;
                        c9.j = obtainStyledAttributes.getFloat(index, c9.j);
                        break;
                    }
                    case 66: {
                        adu.c.g = obtainStyledAttributes.getInt(index, 0);
                        break;
                    }
                    case 65: {
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            adu.c.e = obtainStyledAttributes.getString(index);
                            break;
                        }
                        adu.c.e = acn.a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                    case 64: {
                        final adw c10 = adu.c;
                        c10.c = a(obtainStyledAttributes, index, c10.c);
                        break;
                    }
                    case 63: {
                        final adv d11 = adu.d;
                        d11.D = obtainStyledAttributes.getFloat(index, d11.D);
                        break;
                    }
                    case 62: {
                        final adv d12 = adu.d;
                        d12.C = obtainStyledAttributes.getDimensionPixelSize(index, d12.C);
                        break;
                    }
                    case 61: {
                        final adv d13 = adu.d;
                        d13.B = a(obtainStyledAttributes, index, d13.B);
                        break;
                    }
                    case 60: {
                        final ady e2 = adu.e;
                        e2.c = obtainStyledAttributes.getFloat(index, e2.c);
                        break;
                    }
                    case 59: {
                        final adv d14 = adu.d;
                        d14.ae = obtainStyledAttributes.getDimensionPixelSize(index, d14.ae);
                        break;
                    }
                    case 58: {
                        final adv d15 = adu.d;
                        d15.ad = obtainStyledAttributes.getDimensionPixelSize(index, d15.ad);
                        break;
                    }
                    case 57: {
                        final adv d16 = adu.d;
                        d16.ac = obtainStyledAttributes.getDimensionPixelSize(index, d16.ac);
                        break;
                    }
                    case 56: {
                        final adv d17 = adu.d;
                        d17.ab = obtainStyledAttributes.getDimensionPixelSize(index, d17.ab);
                        break;
                    }
                    case 55: {
                        final adv d18 = adu.d;
                        d18.aa = obtainStyledAttributes.getInt(index, d18.aa);
                        break;
                    }
                    case 54: {
                        final adv d19 = adu.d;
                        d19.Z = obtainStyledAttributes.getInt(index, d19.Z);
                        break;
                    }
                    case 53: {
                        final ady e3 = adu.e;
                        e3.m = obtainStyledAttributes.getDimension(index, e3.m);
                        break;
                    }
                    case 52: {
                        final ady e4 = adu.e;
                        e4.l = obtainStyledAttributes.getDimension(index, e4.l);
                        break;
                    }
                    case 51: {
                        final ady e5 = adu.e;
                        e5.k = obtainStyledAttributes.getDimension(index, e5.k);
                        break;
                    }
                    case 50: {
                        final ady e6 = adu.e;
                        e6.i = obtainStyledAttributes.getDimension(index, e6.i);
                        break;
                    }
                    case 49: {
                        final ady e7 = adu.e;
                        e7.h = obtainStyledAttributes.getDimension(index, e7.h);
                        break;
                    }
                    case 48: {
                        final ady e8 = adu.e;
                        e8.g = obtainStyledAttributes.getFloat(index, e8.g);
                        break;
                    }
                    case 47: {
                        final ady e9 = adu.e;
                        e9.f = obtainStyledAttributes.getFloat(index, e9.f);
                        break;
                    }
                    case 46: {
                        final ady e10 = adu.e;
                        e10.e = obtainStyledAttributes.getFloat(index, e10.e);
                        break;
                    }
                    case 45: {
                        final ady e11 = adu.e;
                        e11.d = obtainStyledAttributes.getFloat(index, e11.d);
                        break;
                    }
                    case 44: {
                        final ady e12 = adu.e;
                        e12.n = true;
                        e12.o = obtainStyledAttributes.getDimension(index, e12.o);
                        break;
                    }
                    case 43: {
                        final adx b4 = adu.b;
                        b4.d = obtainStyledAttributes.getFloat(index, b4.d);
                        break;
                    }
                    case 42: {
                        final adv d20 = adu.d;
                        d20.Y = obtainStyledAttributes.getInt(index, d20.Y);
                        break;
                    }
                    case 41: {
                        final adv d21 = adu.d;
                        d21.X = obtainStyledAttributes.getInt(index, d21.X);
                        break;
                    }
                    case 40: {
                        final adv d22 = adu.d;
                        d22.V = obtainStyledAttributes.getFloat(index, d22.V);
                        break;
                    }
                    case 39: {
                        final adv d23 = adu.d;
                        d23.W = obtainStyledAttributes.getFloat(index, d23.W);
                        break;
                    }
                    case 38: {
                        adu.a = obtainStyledAttributes.getResourceId(index, adu.a);
                        break;
                    }
                    case 37: {
                        final adv d24 = adu.d;
                        d24.z = obtainStyledAttributes.getFloat(index, d24.z);
                        break;
                    }
                    case 36: {
                        final adv d25 = adu.d;
                        d25.n = a(obtainStyledAttributes, index, d25.n);
                        break;
                    }
                    case 35: {
                        final adv d26 = adu.d;
                        d26.o = a(obtainStyledAttributes, index, d26.o);
                        break;
                    }
                    case 34: {
                        final adv d27 = adu.d;
                        d27.J = obtainStyledAttributes.getDimensionPixelSize(index, d27.J);
                        break;
                    }
                    case 33: {
                        final adv d28 = adu.d;
                        d28.v = a(obtainStyledAttributes, index, d28.v);
                        break;
                    }
                    case 32: {
                        final adv d29 = adu.d;
                        d29.u = a(obtainStyledAttributes, index, d29.u);
                        break;
                    }
                    case 31: {
                        final adv d30 = adu.d;
                        d30.M = obtainStyledAttributes.getDimensionPixelSize(index, d30.M);
                        break;
                    }
                    case 30: {
                        final adv d31 = adu.d;
                        d31.m = a(obtainStyledAttributes, index, d31.m);
                        break;
                    }
                    case 29: {
                        final adv d32 = adu.d;
                        d32.l = a(obtainStyledAttributes, index, d32.l);
                        break;
                    }
                    case 28: {
                        final adv d33 = adu.d;
                        d33.I = obtainStyledAttributes.getDimensionPixelSize(index, d33.I);
                        break;
                    }
                    case 27: {
                        final adv d34 = adu.d;
                        d34.G = obtainStyledAttributes.getInt(index, d34.G);
                        break;
                    }
                    case 26: {
                        final adv d35 = adu.d;
                        d35.k = a(obtainStyledAttributes, index, d35.k);
                        break;
                    }
                    case 25: {
                        final adv d36 = adu.d;
                        d36.j = a(obtainStyledAttributes, index, d36.j);
                        break;
                    }
                    case 24: {
                        final adv d37 = adu.d;
                        d37.H = obtainStyledAttributes.getDimensionPixelSize(index, d37.H);
                        break;
                    }
                    case 23: {
                        final adv d38 = adu.d;
                        d38.d = obtainStyledAttributes.getLayoutDimension(index, d38.d);
                        break;
                    }
                    case 22: {
                        final adx b5 = adu.b;
                        b5.b = obtainStyledAttributes.getInt(index, b5.b);
                        final adx b6 = adu.b;
                        b6.b = adz.a[b6.b];
                        break;
                    }
                    case 21: {
                        final adv d39 = adu.d;
                        d39.e = obtainStyledAttributes.getLayoutDimension(index, d39.e);
                        break;
                    }
                    case 20: {
                        final adv d40 = adu.d;
                        d40.y = obtainStyledAttributes.getFloat(index, d40.y);
                        break;
                    }
                    case 19: {
                        final adv d41 = adu.d;
                        d41.h = obtainStyledAttributes.getFloat(index, d41.h);
                        break;
                    }
                    case 18: {
                        final adv d42 = adu.d;
                        d42.g = obtainStyledAttributes.getDimensionPixelOffset(index, d42.g);
                        break;
                    }
                    case 17: {
                        final adv d43 = adu.d;
                        d43.f = obtainStyledAttributes.getDimensionPixelOffset(index, d43.f);
                        break;
                    }
                    case 16: {
                        final adv d44 = adu.d;
                        d44.P = obtainStyledAttributes.getDimensionPixelSize(index, d44.P);
                        break;
                    }
                    case 15: {
                        final adv d45 = adu.d;
                        d45.T = obtainStyledAttributes.getDimensionPixelSize(index, d45.T);
                        break;
                    }
                    case 14: {
                        final adv d46 = adu.d;
                        d46.Q = obtainStyledAttributes.getDimensionPixelSize(index, d46.Q);
                        break;
                    }
                    case 13: {
                        final adv d47 = adu.d;
                        d47.O = obtainStyledAttributes.getDimensionPixelSize(index, d47.O);
                        break;
                    }
                    case 12: {
                        final adv d48 = adu.d;
                        d48.S = obtainStyledAttributes.getDimensionPixelSize(index, d48.S);
                        break;
                    }
                    case 11: {
                        final adv d49 = adu.d;
                        d49.R = obtainStyledAttributes.getDimensionPixelSize(index, d49.R);
                        break;
                    }
                    case 10: {
                        final adv d50 = adu.d;
                        d50.w = a(obtainStyledAttributes, index, d50.w);
                        break;
                    }
                    case 9: {
                        final adv d51 = adu.d;
                        d51.x = a(obtainStyledAttributes, index, d51.x);
                        break;
                    }
                    case 8: {
                        final adv d52 = adu.d;
                        d52.L = obtainStyledAttributes.getDimensionPixelSize(index, d52.L);
                        break;
                    }
                    case 7: {
                        final adv d53 = adu.d;
                        d53.F = obtainStyledAttributes.getDimensionPixelOffset(index, d53.F);
                        break;
                    }
                    case 6: {
                        final adv d54 = adu.d;
                        d54.E = obtainStyledAttributes.getDimensionPixelOffset(index, d54.E);
                        break;
                    }
                    case 5: {
                        adu.d.A = obtainStyledAttributes.getString(index);
                        break;
                    }
                    case 4: {
                        final adv d55 = adu.d;
                        d55.p = a(obtainStyledAttributes, index, d55.p);
                        break;
                    }
                    case 3: {
                        final adv d56 = adu.d;
                        d56.q = a(obtainStyledAttributes, index, d56.q);
                        break;
                    }
                    case 2: {
                        final adv d57 = adu.d;
                        d57.K = obtainStyledAttributes.getDimensionPixelSize(index, d57.K);
                        break;
                    }
                    case 1: {
                        final adv d58 = adu.d;
                        d58.r = a(obtainStyledAttributes, index, d58.r);
                        break;
                    }
                }
            }
            final adv d59 = adu.d;
            if (d59.al != null) {
                d59.ak = null;
            }
        }
        obtainStyledAttributes.recycle();
        return adu;
    }
    
    public final void b(Context o, int childCount) {
        o = LayoutInflater.from((Context)o).inflate(childCount, (ViewGroup)null);
        childCount = ((ConstraintLayout)o).getChildCount();
        this.b.clear();
        for (int i = 0; i < childCount; ++i) {
            final View child = ((ConstraintLayout)o).getChildAt(i);
            final adq adq = (adq)child.getLayoutParams();
            final int id = child.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            final HashMap b = this.b;
            final Integer value = id;
            if (!b.containsKey(value)) {
                this.b.put(value, new adu());
            }
            final adu adu = this.b.get(value);
            if (adu != null) {
                final HashMap e = this.e;
                final HashMap<String, adn> f = new HashMap<String, adn>();
                final Class<? extends View> class1 = child.getClass();
                for (final String s : e.keySet()) {
                    final adn adn = e.get(s);
                    try {
                        Label_0253: {
                            if (!s.equals("BackgroundColor")) {
                                break Label_0253;
                            }
                            final int color = ((ColorDrawable)child.getBackground()).getColor();
                            try {
                                f.put(s, new adn(adn, (Object)color));
                                continue;
                                final StringBuilder sb = new StringBuilder();
                                sb.append("getMap");
                                sb.append(s);
                                final String string = sb.toString();
                                try {
                                    f.put(s, new adn(adn, class1.getMethod(string, (Class<?>[])new Class[0]).invoke(child, new Object[0])));
                                }
                                catch (final InvocationTargetException adn) {}
                                catch (final IllegalAccessException adn) {}
                                catch (final NoSuchMethodException adn) {}
                            }
                            catch (final InvocationTargetException adn) {}
                            catch (final IllegalAccessException adn) {}
                            catch (final NoSuchMethodException adn) {}
                        }
                    }
                    catch (final InvocationTargetException ex) {}
                    catch (final IllegalAccessException ex2) {}
                    catch (final NoSuchMethodException ex3) {}
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(class1.getName());
                    sb2.append(" must have a method ");
                    sb2.append(s);
                    Log.e("TransitionLayout", sb2.toString(), (Throwable)adn);
                }
                final Object o2 = o;
                final int n = childCount;
                adu.f = f;
                adu.a = id;
                final adv d = adu.d;
                d.j = adq.e;
                d.k = adq.f;
                d.l = adq.g;
                d.m = adq.h;
                d.n = adq.i;
                d.o = adq.j;
                d.p = adq.k;
                d.q = adq.l;
                d.r = adq.m;
                d.s = adq.n;
                d.t = adq.o;
                d.u = adq.s;
                d.v = adq.t;
                d.w = adq.u;
                d.x = adq.v;
                d.y = adq.G;
                d.z = adq.H;
                d.A = adq.I;
                d.B = adq.p;
                d.C = adq.q;
                d.D = adq.r;
                d.E = adq.X;
                d.F = adq.Y;
                d.G = adq.Z;
                d.h = adq.c;
                d.f = adq.a;
                d.g = adq.b;
                d.d = adq.width;
                adu.d.e = adq.height;
                adu.d.H = adq.leftMargin;
                adu.d.I = adq.rightMargin;
                adu.d.J = adq.topMargin;
                adu.d.K = adq.bottomMargin;
                final adv d2 = adu.d;
                d2.N = adq.D;
                d2.V = adq.M;
                d2.W = adq.L;
                d2.Y = adq.O;
                d2.X = adq.N;
                d2.an = adq.aa;
                d2.ao = adq.ab;
                d2.Z = adq.P;
                d2.aa = adq.Q;
                d2.ab = adq.T;
                d2.ac = adq.U;
                d2.ad = adq.R;
                d2.ae = adq.S;
                d2.af = adq.V;
                d2.ag = adq.W;
                d2.am = adq.ac;
                d2.P = adq.x;
                d2.R = adq.z;
                d2.O = adq.w;
                d2.Q = adq.y;
                d2.T = adq.A;
                d2.S = adq.B;
                d2.U = adq.C;
                d2.aq = adq.ad;
                d2.L = adq.getMarginEnd();
                adu.d.M = adq.getMarginStart();
                adu.b.b = child.getVisibility();
                adu.b.d = child.getAlpha();
                adu.e.c = child.getRotation();
                adu.e.d = child.getRotationX();
                adu.e.e = child.getRotationY();
                adu.e.f = child.getScaleX();
                adu.e.g = child.getScaleY();
                final float pivotX = child.getPivotX();
                final float pivotY = child.getPivotY();
                if (pivotX != 0.0 || pivotY != 0.0) {
                    final ady e2 = adu.e;
                    e2.h = pivotX;
                    e2.i = pivotY;
                }
                adu.e.k = child.getTranslationX();
                adu.e.l = child.getTranslationY();
                adu.e.m = child.getTranslationZ();
                final ady e3 = adu.e;
                if (e3.n) {
                    e3.o = child.getElevation();
                }
                childCount = n;
                o = o2;
                if (child instanceof Barrier) {
                    final Barrier barrier = (Barrier)child;
                    final adv d3 = adu.d;
                    d3.ap = barrier.b.b;
                    d3.ak = Arrays.copyOf(((ado)barrier).c, ((ado)barrier).d);
                    final adv d4 = adu.d;
                    d4.ah = barrier.a;
                    d4.ai = barrier.b.c;
                    o = o2;
                    childCount = n;
                }
            }
        }
    }
    
    public final void c(final Context context, final int n) {
        final XmlResourceParser xml = context.getResources().getXml(n);
        try {
            for (int i = ((XmlPullParser)xml).getEventType(); i != 1; i = ((XmlPullParser)xml).next()) {
                if (i == 2) {
                    final String name = ((XmlPullParser)xml).getName();
                    final adu j = i(context, Xml.asAttributeSet((XmlPullParser)xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        j.d.b = true;
                    }
                    this.b.put(j.a, j);
                }
            }
        }
        catch (final IOException ex) {
            final StringBuilder sb = new StringBuilder("Error parsing resource: ");
            sb.append(n);
            Log.e("ConstraintSet", sb.toString(), (Throwable)ex);
        }
        catch (final XmlPullParserException ex2) {
            final StringBuilder sb2 = new StringBuilder("Error parsing resource: ");
            sb2.append(n);
            Log.e("ConstraintSet", sb2.toString(), (Throwable)ex2);
        }
    }
    
    public final void d(final Context ex, final XmlPullParser xmlPullParser) {
        Label_4331: {
            try {
                int i = xmlPullParser.getEventType();
                adu adu = null;
            Label_4294_Outer:
                while (i != 1) {
                    Label_4283: {
                        if (i == 0) {
                            break Label_4283;
                        }
                        String lowerCase;
                        int n = 0;
                        adu adu2;
                        boolean b2;
                        boolean b;
                        ady e;
                        TypedArray obtainStyledAttributes;
                        int index;
                        adv d;
                        TypedArray obtainStyledAttributes2;
                        int index2;
                        int n2;
                        int n3;
                        adw c;
                        TypedArray obtainStyledAttributes3;
                        int index3;
                        TypedArray obtainStyledAttributes4;
                        String s;
                        TypedArray obtainStyledAttributes5;
                        int n4;
                        int index4;
                        int n5;
                        int indexCount;
                        int n6;
                        String s2;
                        int index5;
                        StringBuilder sb;
                        adx b3;
                        String name;
                        int n7;
                        int value;
                        int indexCount2;
                        Object o;
                        int n8;
                        int int1;
                        int indexCount3;
                        StringBuilder sb2;
                        int indexCount4;
                        TypedValue peekValue;
                        StringBuilder sb3;
                        adv d2;
                        HashMap f;
                        int n9;
                        StringBuilder sb4;
                        int indexCount5;
                        StringBuilder sb5;
                        StringBuilder sb6;
                        StringBuilder sb7;
                        StringBuilder sb8;
                        Label_0686_Outer:Label_1029_Outer:Label_0489_Outer:
                        while (true) {
                            if (i != 2) {
                                if (i == 3) {
                                    lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                                    Label_0169: {
                                        switch (lowerCase.hashCode()) {
                                            case 2146106725: {
                                                if (lowerCase.equals("constraintset")) {
                                                    n = 0;
                                                    break Label_0169;
                                                }
                                                break;
                                            }
                                            case 426575017: {
                                                if (lowerCase.equals("constraintoverride")) {
                                                    n = 2;
                                                    break Label_0169;
                                                }
                                                break;
                                            }
                                            case -190376483: {
                                                if (lowerCase.equals("constraint")) {
                                                    n = 1;
                                                    break Label_0169;
                                                }
                                                break;
                                            }
                                            case -2075718416: {
                                                if (lowerCase.equals("guideline")) {
                                                    n = 3;
                                                    break Label_0169;
                                                }
                                                break;
                                            }
                                        }
                                        n = -1;
                                    }
                                    if (n == 0) {
                                        return;
                                    }
                                    if (n == 1 || n == 2 || n == 3) {
                                        break Label_0686_Outer;
                                    }
                                }
                                adu2 = adu;
                                break Label_4294;
                            }
                            Label_0216: {
                                break Label_0216;
                                try {
                                    this.b.put(adu.a, adu);
                                    adu2 = null;
                                    i = xmlPullParser.next();
                                    adu = adu2;
                                    continue Label_4294_Outer;
                                    Label_0489:Block_34_Outer:
                                    while (true) {
                                    Block_22:
                                        while (true) {
                                        Label_3906:
                                            while (true) {
                                                Label_3473:Label_1599_Outer:Block_48_Outer:
                                                while (true) {
                                                    while (true) {
                                                        Label_1599:Block_36_Outer:
                                                        while (true) {
                                                            Label_1256: {
                                                                while (true) {
                                                                    Label_1029:Label_0597_Outer:
                                                                    while (true) {
                                                                    Label_0597:
                                                                        while (true) {
                                                                        Label_1701_Outer:
                                                                            while (true) {
                                                                            Label_1701:
                                                                                while (true) {
                                                                                    Block_49: {
                                                                                    Block_39_Outer:
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                                Block_38: {
                                                                                                    Label_0861: {
                                                                                                        Label_1080: {
                                                                                                            while (true) {
                                                                                                                while (true) {
                                                                                                                    Block_50_Outer:Block_51_Outer:Block_15_Outer:
                                                                                                                    while (true) {
                                                                                                                        b = b2;
                                                                                                                        break Label_1029;
                                                                                                                        Label_3709: {
                                                                                                                            e.m = obtainStyledAttributes.getDimension(index, e.m);
                                                                                                                        }
                                                                                                                        break Label_3906;
                                                                                                                        Label_2563:
                                                                                                                        d.ag = obtainStyledAttributes2.getFloat(index2, 1.0f);
                                                                                                                        break Label_3473;
                                                                                                                        Block_28: {
                                                                                                                        Block_35_Outer:
                                                                                                                            while (true) {
                                                                                                                                while (true) {
                                                                                                                                    while (true) {
                                                                                                                                        Block_17: {
                                                                                                                                            while (true) {
                                                                                                                                                Block_41: {
                                                                                                                                                    Block_20: {
                                                                                                                                                        while (true) {
                                                                                                                                                        Label_4046_Outer:
                                                                                                                                                            while (true) {
                                                                                                                                                                index = obtainStyledAttributes.getIndex(n2);
                                                                                                                                                                switch([Lcom.strobel.decompiler.ast.Label;@12ef633)(ady.a.get(index));
                                                                                                                                                                ++n3;
                                                                                                                                                                Label_3575: {
                                                                                                                                                                Label_4046:
                                                                                                                                                                    while (true) {
                                                                                                                                                                        Block_55: {
                                                                                                                                                                            Block_33: {
                                                                                                                                                                                Block_14: {
                                                                                                                                                                                Block_26_Outer:
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        break Label_1178;
                                                                                                                                                                                        Label_2921:
                                                                                                                                                                                        d.l = a(obtainStyledAttributes2, index2, d.l);
                                                                                                                                                                                        break Label_3473;
                                                                                                                                                                                        Label_1377:
                                                                                                                                                                                        c.n = obtainStyledAttributes3.getInteger(index3, c.o);
                                                                                                                                                                                        continue Label_1599;
                                                                                                                                                                                        Label_0320:
                                                                                                                                                                                        Block_42: {
                                                                                                                                                                                            Block_16: {
                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                    Block_31: {
                                                                                                                                                                                                        Block_30: {
                                                                                                                                                                                                            Block_18: {
                                                                                                                                                                                                                Block_43: {
                                                                                                                                                                                                                Block_54_Outer:
                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        Block_25: {
                                                                                                                                                                                                                        Block_56_Outer:
                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                Block_45: {
                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                    Label_4135_Outer:
                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                            Label_4010: {
                                                                                                                                                                                                                                                Label_0487: {
                                                                                                                                                                                                                                                    break Label_0487;
                                                                                                                                                                                                                                                    Label_2530:
                                                                                                                                                                                                                                                    d.ah = obtainStyledAttributes2.getInt(index2, d.ah);
                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                    s = obtainStyledAttributes4.getString(0);
                                                                                                                                                                                                                                                    iftrue(Label_0686:)(s == null || s.length() <= 0);
                                                                                                                                                                                                                                                    break Block_28;
                                                                                                                                                                                                                                                    Label_3416:
                                                                                                                                                                                                                                                    d.q = a(obtainStyledAttributes2, index2, d.q);
                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                    Label_3301:
                                                                                                                                                                                                                                                    d.x = a(obtainStyledAttributes2, index2, d.x);
                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                    Label_1477:
                                                                                                                                                                                                                                                    c.c = a(obtainStyledAttributes3, index3, c.c);
                                                                                                                                                                                                                                                    continue Label_1599;
                                                                                                                                                                                                                                                    Label_3396:
                                                                                                                                                                                                                                                    d.p = a(obtainStyledAttributes2, index2, d.p);
                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                    Label_2615:
                                                                                                                                                                                                                                                    d.C = obtainStyledAttributes2.getDimensionPixelSize(index2, d.C);
                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                    index4 = obtainStyledAttributes5.getIndex(n4);
                                                                                                                                                                                                                                                    iftrue(Label_4049:)(index4 != 1);
                                                                                                                                                                                                                                                    break Block_55;
                                                                                                                                                                                                                                                    Label_3479:
                                                                                                                                                                                                                                                    obtainStyledAttributes2.recycle();
                                                                                                                                                                                                                                                    adu2 = adu;
                                                                                                                                                                                                                                                    continue Label_0686_Outer;
                                                                                                                                                                                                                                                    Label_3321:
                                                                                                                                                                                                                                                    d.L = obtainStyledAttributes2.getDimensionPixelSize(index2, d.L);
                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                    Label_3361:
                                                                                                                                                                                                                                                    d.E = obtainStyledAttributes2.getDimensionPixelOffset(index2, d.E);
                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                    iftrue(Label_1043:)(n5 >= indexCount);
                                                                                                                                                                                                                                                    break Block_25;
                                                                                                                                                                                                                                                    n6 = 5;
                                                                                                                                                                                                                                                    break Label_0489;
                                                                                                                                                                                                                                                    Label_0969:
                                                                                                                                                                                                                                                    s = s2;
                                                                                                                                                                                                                                                    b = b2;
                                                                                                                                                                                                                                                    iftrue(Label_1029:)(index5 != 8);
                                                                                                                                                                                                                                                    break Block_38;
                                                                                                                                                                                                                                                    Label_2475:
                                                                                                                                                                                                                                                    d.ap = obtainStyledAttributes2.getBoolean(index2, d.ap);
                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                    Label_2721:
                                                                                                                                                                                                                                                    d.V = obtainStyledAttributes2.getFloat(index2, d.V);
                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                    Label_4135:
                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                Block_29: {
                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                        c.m = obtainStyledAttributes3.getString(index3);
                                                                                                                                                                                                                                                                        iftrue(Label_1368:)(c.m.indexOf("/") <= 0);
                                                                                                                                                                                                                                                                        Block_47: {
                                                                                                                                                                                                                                                                            break Block_47;
                                                                                                                                                                                                                                                                            Label_2044:
                                                                                                                                                                                                                                                                            sb = new StringBuilder();
                                                                                                                                                                                                                                                                            sb.append("Unknown attribute 0x");
                                                                                                                                                                                                                                                                            sb.append(Integer.toHexString(index2));
                                                                                                                                                                                                                                                                            sb.append("   ");
                                                                                                                                                                                                                                                                            sb.append(adv.a.get(index2));
                                                                                                                                                                                                                                                                            Log.w("ConstraintSet", sb.toString());
                                                                                                                                                                                                                                                                            break Label_3473;
                                                                                                                                                                                                                                                                            ++n4;
                                                                                                                                                                                                                                                                            break Label_4010;
                                                                                                                                                                                                                                                                            b3.e = obtainStyledAttributes5.getFloat(3, b3.e);
                                                                                                                                                                                                                                                                            continue Label_4135;
                                                                                                                                                                                                                                                                            Label_0372:
                                                                                                                                                                                                                                                                            iftrue(Label_0487:)(!name.equals("CustomMethod"));
                                                                                                                                                                                                                                                                            break Block_17;
                                                                                                                                                                                                                                                                            Label_2941:
                                                                                                                                                                                                                                                                            d.I = obtainStyledAttributes2.getDimensionPixelSize(index2, d.I);
                                                                                                                                                                                                                                                                            break Label_3473;
                                                                                                                                                                                                                                                                            index2 = obtainStyledAttributes2.getIndex(n7);
                                                                                                                                                                                                                                                                            value = adv.a.get(index2);
                                                                                                                                                                                                                                                                            switch([Lcom.strobel.decompiler.ast.Label;@c3d562)(value);
                                                                                                                                                                                                                                                                            Label_3001:
                                                                                                                                                                                                                                                                            d.j = a(obtainStyledAttributes2, index2, d.j);
                                                                                                                                                                                                                                                                            break Label_3473;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        c.o = obtainStyledAttributes3.getResourceId(index3, -1);
                                                                                                                                                                                                                                                                        c.n = -2;
                                                                                                                                                                                                                                                                        break Label_1256;
                                                                                                                                                                                                                                                                        e = adu.e;
                                                                                                                                                                                                                                                                        obtainStyledAttributes = ((Context)ex).obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aed.i);
                                                                                                                                                                                                                                                                        e.b = true;
                                                                                                                                                                                                                                                                        indexCount2 = obtainStyledAttributes.getIndexCount();
                                                                                                                                                                                                                                                                        n2 = 0;
                                                                                                                                                                                                                                                                        break Label_3575;
                                                                                                                                                                                                                                                                        Label_3729:
                                                                                                                                                                                                                                                                        e.l = obtainStyledAttributes.getDimension(index, e.l);
                                                                                                                                                                                                                                                                        break Label_3906;
                                                                                                                                                                                                                                                                        o = obtainStyledAttributes4.getString(9);
                                                                                                                                                                                                                                                                        n8 = 5;
                                                                                                                                                                                                                                                                        s = s2;
                                                                                                                                                                                                                                                                        b = b2;
                                                                                                                                                                                                                                                                        break Label_1029;
                                                                                                                                                                                                                                                                        Label_1936:
                                                                                                                                                                                                                                                                        switch([Lcom.strobel.decompiler.ast.Label;@d79bc0)(value);
                                                                                                                                                                                                                                                                        Label_2821:
                                                                                                                                                                                                                                                                        d.J = obtainStyledAttributes2.getDimensionPixelSize(index2, d.J);
                                                                                                                                                                                                                                                                        break Label_3473;
                                                                                                                                                                                                                                                                        int1 = obtainStyledAttributes5.getInt(0, b3.b);
                                                                                                                                                                                                                                                                        b3.b = int1;
                                                                                                                                                                                                                                                                        b3.b = adz.a[int1];
                                                                                                                                                                                                                                                                        break Label_4046;
                                                                                                                                                                                                                                                                        Label_2961:
                                                                                                                                                                                                                                                                        d.G = obtainStyledAttributes2.getInt(index2, d.G);
                                                                                                                                                                                                                                                                        break Label_3473;
                                                                                                                                                                                                                                                                        n6 = 8;
                                                                                                                                                                                                                                                                        break Label_0489;
                                                                                                                                                                                                                                                                        Label_0693:
                                                                                                                                                                                                                                                                        iftrue(Label_0715:)(index5 != 10);
                                                                                                                                                                                                                                                                        break Block_29;
                                                                                                                                                                                                                                                                        Label_0389:
                                                                                                                                                                                                                                                                        iftrue(Label_0487:)(!name.equals("Guideline"));
                                                                                                                                                                                                                                                                        break Block_18;
                                                                                                                                                                                                                                                                        o = obtainStyledAttributes4.getFloat(5, Float.NaN);
                                                                                                                                                                                                                                                                        n8 = 2;
                                                                                                                                                                                                                                                                        s = s2;
                                                                                                                                                                                                                                                                        b = b2;
                                                                                                                                                                                                                                                                        break Label_1029;
                                                                                                                                                                                                                                                                        iftrue(Label_1605:)(n3 >= indexCount3);
                                                                                                                                                                                                                                                                        break Block_43;
                                                                                                                                                                                                                                                                        b3.c = obtainStyledAttributes5.getInt(4, b3.c);
                                                                                                                                                                                                                                                                        continue Label_4135;
                                                                                                                                                                                                                                                                        Label_3924:
                                                                                                                                                                                                                                                                        sb2 = new StringBuilder();
                                                                                                                                                                                                                                                                        sb2.append("XML parser error must be within a Constraint ");
                                                                                                                                                                                                                                                                        sb2.append(xmlPullParser.getLineNumber());
                                                                                                                                                                                                                                                                        throw new RuntimeException(sb2.toString());
                                                                                                                                                                                                                                                                        Label_2200:
                                                                                                                                                                                                                                                                        d.am = obtainStyledAttributes2.getString(index2);
                                                                                                                                                                                                                                                                        break Label_3473;
                                                                                                                                                                                                                                                                        Label_3021:
                                                                                                                                                                                                                                                                        d.H = obtainStyledAttributes2.getDimensionPixelSize(index2, d.H);
                                                                                                                                                                                                                                                                        break Label_3473;
                                                                                                                                                                                                                                                                        b3 = adu.b;
                                                                                                                                                                                                                                                                        obtainStyledAttributes5 = ((Context)ex).obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aed.g);
                                                                                                                                                                                                                                                                        b3.a = true;
                                                                                                                                                                                                                                                                        indexCount4 = obtainStyledAttributes5.getIndexCount();
                                                                                                                                                                                                                                                                        n4 = 0;
                                                                                                                                                                                                                                                                        break Label_4010;
                                                                                                                                                                                                                                                                        Label_1397:
                                                                                                                                                                                                                                                                        c.k = obtainStyledAttributes3.getFloat(index3, c.k);
                                                                                                                                                                                                                                                                        continue Label_1599;
                                                                                                                                                                                                                                                                        Label_3261:
                                                                                                                                                                                                                                                                        d.R = obtainStyledAttributes2.getDimensionPixelSize(index2, d.R);
                                                                                                                                                                                                                                                                        break Label_3473;
                                                                                                                                                                                                                                                                        Label_2681:
                                                                                                                                                                                                                                                                        d.Y = obtainStyledAttributes2.getInt(index2, d.Y);
                                                                                                                                                                                                                                                                        break Label_3473;
                                                                                                                                                                                                                                                                        Label_1310:
                                                                                                                                                                                                                                                                        iftrue(Label_1377:)(peekValue.type != 3);
                                                                                                                                                                                                                                                                        continue Label_4135_Outer;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    Label_2781:
                                                                                                                                                                                                                                                                    d.n = a(obtainStyledAttributes2, index2, d.n);
                                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                                    Label_2550:
                                                                                                                                                                                                                                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                                    Label_2841:
                                                                                                                                                                                                                                                                    d.v = a(obtainStyledAttributes2, index2, d.v);
                                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                                    Label_2395:
                                                                                                                                                                                                                                                                    d.U = obtainStyledAttributes2.getDimensionPixelSize(index2, d.U);
                                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                                    Label_0421:
                                                                                                                                                                                                                                                                    iftrue(Label_0487:)(!name.equals("PropertySet"));
                                                                                                                                                                                                                                                                    break Block_20;
                                                                                                                                                                                                                                                                    Label_3912:
                                                                                                                                                                                                                                                                    obtainStyledAttributes.recycle();
                                                                                                                                                                                                                                                                    adu2 = adu;
                                                                                                                                                                                                                                                                    continue Label_0686_Outer;
                                                                                                                                                                                                                                                                    Label_4269:
                                                                                                                                                                                                                                                                    adu2 = i((Context)ex, Xml.asAttributeSet(xmlPullParser), false);
                                                                                                                                                                                                                                                                    continue Label_0686_Outer;
                                                                                                                                                                                                                                                                    Label_3061:
                                                                                                                                                                                                                                                                    d.e = obtainStyledAttributes2.getLayoutDimension(index2, d.e);
                                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                                    Label_0715:
                                                                                                                                                                                                                                                                    iftrue(Label_0747:)(index5 != 1);
                                                                                                                                                                                                                                                                    break Block_30;
                                                                                                                                                                                                                                                                    Label_3201:
                                                                                                                                                                                                                                                                    d.Q = obtainStyledAttributes2.getDimensionPixelSize(index2, d.Q);
                                                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                s = obtainStyledAttributes4.getString(10);
                                                                                                                                                                                                                                                                b = true;
                                                                                                                                                                                                                                                                break Label_1029;
                                                                                                                                                                                                                                                                Label_1368:
                                                                                                                                                                                                                                                                c.n = -1;
                                                                                                                                                                                                                                                                continue Label_1599;
                                                                                                                                                                                                                                                                Label_2579:
                                                                                                                                                                                                                                                                d.af = obtainStyledAttributes2.getFloat(index2, 1.0f);
                                                                                                                                                                                                                                                                break Label_3473;
                                                                                                                                                                                                                                                                o = obtainStyledAttributes4.getDimension(4, 0.0f);
                                                                                                                                                                                                                                                                break Label_0861;
                                                                                                                                                                                                                                                                Label_2495:
                                                                                                                                                                                                                                                                d.al = obtainStyledAttributes2.getString(index2);
                                                                                                                                                                                                                                                                break Label_3473;
                                                                                                                                                                                                                                                                Label_2981:
                                                                                                                                                                                                                                                                d.k = a(obtainStyledAttributes2, index2, d.k);
                                                                                                                                                                                                                                                                break Label_3473;
                                                                                                                                                                                                                                                                Label_3829:
                                                                                                                                                                                                                                                                e.f = obtainStyledAttributes.getFloat(index, e.f);
                                                                                                                                                                                                                                                                break Label_3906;
                                                                                                                                                                                                                                                                Label_3121:
                                                                                                                                                                                                                                                                d.g = obtainStyledAttributes2.getDimensionPixelOffset(index2, d.g);
                                                                                                                                                                                                                                                                break Label_3473;
                                                                                                                                                                                                                                                                Label_1138:
                                                                                                                                                                                                                                                                iftrue(Label_1617:)(adu == null);
                                                                                                                                                                                                                                                                break Block_42;
                                                                                                                                                                                                                                                                Label_2215:
                                                                                                                                                                                                                                                                d.ao = obtainStyledAttributes2.getBoolean(index2, d.ao);
                                                                                                                                                                                                                                                                break Label_3473;
                                                                                                                                                                                                                                                                Label_4153:
                                                                                                                                                                                                                                                                sb3 = new StringBuilder();
                                                                                                                                                                                                                                                                sb3.append("XML parser error must be within a Constraint ");
                                                                                                                                                                                                                                                                sb3.append(xmlPullParser.getLineNumber());
                                                                                                                                                                                                                                                                throw new RuntimeException(sb3.toString());
                                                                                                                                                                                                                                                                Label_0323:
                                                                                                                                                                                                                                                                iftrue(Label_0487:)(!name.equals("Constraint"));
                                                                                                                                                                                                                                                                break Block_14;
                                                                                                                                                                                                                                                                Label_3970:
                                                                                                                                                                                                                                                                iftrue(Label_4153:)(adu == null);
                                                                                                                                                                                                                                                                continue Block_34_Outer;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            Label_4222:
                                                                                                                                                                                                                                                            adu2 = i((Context)ex, Xml.asAttributeSet(xmlPullParser), false);
                                                                                                                                                                                                                                                            d2 = adu2.d;
                                                                                                                                                                                                                                                            d2.b = true;
                                                                                                                                                                                                                                                            d2.c = true;
                                                                                                                                                                                                                                                            continue Label_0686_Outer;
                                                                                                                                                                                                                                                            Label_2415:
                                                                                                                                                                                                                                                            d.t = a(obtainStyledAttributes2, index2, d.t);
                                                                                                                                                                                                                                                            break Label_3473;
                                                                                                                                                                                                                                                            f = adu.f;
                                                                                                                                                                                                                                                            obtainStyledAttributes4 = ((Context)ex).obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aed.d);
                                                                                                                                                                                                                                                            indexCount = obtainStyledAttributes4.getIndexCount();
                                                                                                                                                                                                                                                            n5 = 0;
                                                                                                                                                                                                                                                            s2 = null;
                                                                                                                                                                                                                                                            o = null;
                                                                                                                                                                                                                                                            n8 = 0;
                                                                                                                                                                                                                                                            b2 = false;
                                                                                                                                                                                                                                                            continue Label_0597;
                                                                                                                                                                                                                                                            Label_3889:
                                                                                                                                                                                                                                                            e.c = obtainStyledAttributes.getFloat(index, e.c);
                                                                                                                                                                                                                                                            break Label_3906;
                                                                                                                                                                                                                                                            Label_3181:
                                                                                                                                                                                                                                                            d.T = obtainStyledAttributes2.getDimensionPixelSize(index2, d.T);
                                                                                                                                                                                                                                                            break Label_3473;
                                                                                                                                                                                                                                                            continue Label_4135;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        iftrue(Label_1256:)((c.o = obtainStyledAttributes3.getResourceId(index3, -1)) == -1);
                                                                                                                                                                                                                                                        break Block_45;
                                                                                                                                                                                                                                                        Label_4113:
                                                                                                                                                                                                                                                        iftrue(Label_4135:)(index4 != 3);
                                                                                                                                                                                                                                                        continue Block_50_Outer;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                n6 = -1;
                                                                                                                                                                                                                                                break Label_0489;
                                                                                                                                                                                                                                                Label_3849:
                                                                                                                                                                                                                                                e.e = obtainStyledAttributes.getFloat(index, e.e);
                                                                                                                                                                                                                                                break Label_3906;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            iftrue(Label_4141:)(n4 >= indexCount4);
                                                                                                                                                                                                                                            continue Label_0597_Outer;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        Label_3660:
                                                                                                                                                                                                                                        break Label_3906;
                                                                                                                                                                                                                                        Label_4049:
                                                                                                                                                                                                                                        iftrue(Label_4088:)(index4 != 0);
                                                                                                                                                                                                                                        continue Label_4046_Outer;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    Label_2275:
                                                                                                                                                                                                                                    d.ae = obtainStyledAttributes2.getDimensionPixelSize(index2, d.ae);
                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                    Label_3161:
                                                                                                                                                                                                                                    d.P = obtainStyledAttributes2.getDimensionPixelSize(index2, d.P);
                                                                                                                                                                                                                                    break Label_3473;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                c.n = -2;
                                                                                                                                                                                                                                break Label_1256;
                                                                                                                                                                                                                                Label_0747:
                                                                                                                                                                                                                                iftrue(Label_0778:)(index5 != 3);
                                                                                                                                                                                                                                break Block_31;
                                                                                                                                                                                                                                Label_2635:
                                                                                                                                                                                                                                d.B = a(obtainStyledAttributes2, index2, d.B);
                                                                                                                                                                                                                                break Label_3473;
                                                                                                                                                                                                                                Label_0940:
                                                                                                                                                                                                                                iftrue(Label_0969:)(index5 != 9);
                                                                                                                                                                                                                                continue Block_56_Outer;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            Label_2861:
                                                                                                                                                                                                                            d.u = a(obtainStyledAttributes2, index2, d.u);
                                                                                                                                                                                                                            break Label_3473;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        index5 = obtainStyledAttributes4.getIndex(n5);
                                                                                                                                                                                                                        iftrue(Label_0693:)(index5 != 0);
                                                                                                                                                                                                                        continue Block_54_Outer;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    Label_3381:
                                                                                                                                                                                                                    d.A = obtainStyledAttributes2.getString(index2);
                                                                                                                                                                                                                    ++n7;
                                                                                                                                                                                                                    break Label_1701;
                                                                                                                                                                                                                    Label_3683:
                                                                                                                                                                                                                    e.n = true;
                                                                                                                                                                                                                    e.o = obtainStyledAttributes.getDimension(index, e.o);
                                                                                                                                                                                                                    break Label_3906;
                                                                                                                                                                                                                    Label_0356:
                                                                                                                                                                                                                    iftrue(Label_0487:)(!name.equals("Barrier"));
                                                                                                                                                                                                                    break Block_16;
                                                                                                                                                                                                                    Label_2668:
                                                                                                                                                                                                                    e(d, obtainStyledAttributes2, index2, 0);
                                                                                                                                                                                                                    continue Label_3473;
                                                                                                                                                                                                                    o = n9;
                                                                                                                                                                                                                    n8 = 8;
                                                                                                                                                                                                                    b = b2;
                                                                                                                                                                                                                    s = s2;
                                                                                                                                                                                                                    break Label_1029;
                                                                                                                                                                                                                    Label_1417:
                                                                                                                                                                                                                    c.l = obtainStyledAttributes3.getInteger(index3, c.l);
                                                                                                                                                                                                                    continue Label_1599;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                index3 = obtainStyledAttributes3.getIndex(n3);
                                                                                                                                                                                                                switch([Lcom.strobel.decompiler.ast.Label;@70a02e)(adw.a.get(index3));
                                                                                                                                                                                                            }
                                                                                                                                                                                                            n6 = 2;
                                                                                                                                                                                                            break Label_0489;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        o = obtainStyledAttributes4.getBoolean(1, false);
                                                                                                                                                                                                        n8 = 6;
                                                                                                                                                                                                        s = s2;
                                                                                                                                                                                                        b = b2;
                                                                                                                                                                                                        break Label_1029;
                                                                                                                                                                                                        Label_2235:
                                                                                                                                                                                                        d.an = obtainStyledAttributes2.getBoolean(index2, d.an);
                                                                                                                                                                                                        continue Label_3473;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    o = obtainStyledAttributes4.getColor(3, 0);
                                                                                                                                                                                                    n8 = 3;
                                                                                                                                                                                                    s = s2;
                                                                                                                                                                                                    b = b2;
                                                                                                                                                                                                    break Label_1029;
                                                                                                                                                                                                    Label_2655:
                                                                                                                                                                                                    e(d, obtainStyledAttributes2, index2, 1);
                                                                                                                                                                                                    continue Label_3473;
                                                                                                                                                                                                    Label_2255:
                                                                                                                                                                                                    d.ad = obtainStyledAttributes2.getDimensionPixelSize(index2, d.ad);
                                                                                                                                                                                                    continue Label_3473;
                                                                                                                                                                                                    Label_2901:
                                                                                                                                                                                                    d.m = a(obtainStyledAttributes2, index2, d.m);
                                                                                                                                                                                                    continue Label_3473;
                                                                                                                                                                                                    Label_3491:
                                                                                                                                                                                                    sb4 = new StringBuilder();
                                                                                                                                                                                                    sb4.append("XML parser error must be within a Constraint ");
                                                                                                                                                                                                    sb4.append(xmlPullParser.getLineNumber());
                                                                                                                                                                                                    throw new RuntimeException(sb4.toString());
                                                                                                                                                                                                    Label_1661:
                                                                                                                                                                                                    iftrue(Label_3491:)(adu == null);
                                                                                                                                                                                                    break Block_49;
                                                                                                                                                                                                    n9 = obtainStyledAttributes4.getInt(8, -1);
                                                                                                                                                                                                    continue Block_39_Outer;
                                                                                                                                                                                                }
                                                                                                                                                                                                Label_2761:
                                                                                                                                                                                                d.z = obtainStyledAttributes2.getFloat(index2, d.z);
                                                                                                                                                                                                continue Label_3473;
                                                                                                                                                                                                Label_2801:
                                                                                                                                                                                                d.o = a(obtainStyledAttributes2, index2, d.o);
                                                                                                                                                                                                continue Label_3473;
                                                                                                                                                                                            }
                                                                                                                                                                                            n6 = 3;
                                                                                                                                                                                            break Label_0489;
                                                                                                                                                                                            Label_0809:
                                                                                                                                                                                            iftrue(Label_0843:)(index5 != 7);
                                                                                                                                                                                            break Block_33;
                                                                                                                                                                                            Label_1043:
                                                                                                                                                                                            iftrue(Label_1080:)(s2 == null || o == null);
                                                                                                                                                                                            break Block_41;
                                                                                                                                                                                            Label_2355:
                                                                                                                                                                                            d.Z = obtainStyledAttributes2.getInt(index2, d.Z);
                                                                                                                                                                                            continue Label_3473;
                                                                                                                                                                                        }
                                                                                                                                                                                        c = adu.c;
                                                                                                                                                                                        obtainStyledAttributes3 = ((Context)ex).obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aed.f);
                                                                                                                                                                                        c.b = true;
                                                                                                                                                                                        indexCount3 = obtainStyledAttributes3.getIndexCount();
                                                                                                                                                                                        n3 = 0;
                                                                                                                                                                                        continue Block_26_Outer;
                                                                                                                                                                                    }
                                                                                                                                                                                    ++n2;
                                                                                                                                                                                    break Label_3575;
                                                                                                                                                                                    Label_2701:
                                                                                                                                                                                    d.X = obtainStyledAttributes2.getInt(index2, d.X);
                                                                                                                                                                                    continue Label_3473;
                                                                                                                                                                                }
                                                                                                                                                                                n6 = 0;
                                                                                                                                                                                break Label_0489;
                                                                                                                                                                            }
                                                                                                                                                                            o = TypedValue.applyDimension(1, obtainStyledAttributes4.getDimension(7, 0.0f), ((Context)ex).getResources().getDisplayMetrics());
                                                                                                                                                                            break Label_0861;
                                                                                                                                                                        }
                                                                                                                                                                        b3.d = obtainStyledAttributes5.getFloat(1, b3.d);
                                                                                                                                                                        continue Label_4046;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iftrue(Label_3912:)(n2 >= indexCount2);
                                                                                                                                                                continue Label_1599_Outer;
                                                                                                                                                            }
                                                                                                                                                            Label_2595:
                                                                                                                                                            d.D = obtainStyledAttributes2.getFloat(index2, d.D);
                                                                                                                                                            continue Label_3473;
                                                                                                                                                            Label_4088:
                                                                                                                                                            iftrue(Label_4113:)(index4 != 4);
                                                                                                                                                            continue Block_34_Outer;
                                                                                                                                                        }
                                                                                                                                                        Label_3341:
                                                                                                                                                        d.F = obtainStyledAttributes2.getDimensionPixelOffset(index2, d.F);
                                                                                                                                                        continue Label_3473;
                                                                                                                                                        Label_2295:
                                                                                                                                                        d.ab = obtainStyledAttributes2.getDimensionPixelSize(index2, d.ab);
                                                                                                                                                        continue Label_3473;
                                                                                                                                                        Label_1562:
                                                                                                                                                        c.f = obtainStyledAttributes3.getInt(index3, c.f);
                                                                                                                                                        continue Label_1599;
                                                                                                                                                    }
                                                                                                                                                    n6 = 4;
                                                                                                                                                    break Label_0489;
                                                                                                                                                }
                                                                                                                                                f.put(s2, new adn(s2, n8, o, b2));
                                                                                                                                                break Label_1080;
                                                                                                                                                iftrue(Label_3479:)(n7 >= indexCount5);
                                                                                                                                                continue Block_51_Outer;
                                                                                                                                            }
                                                                                                                                            Label_3749:
                                                                                                                                            e.k = obtainStyledAttributes.getDimension(index, e.k);
                                                                                                                                            continue Label_3906;
                                                                                                                                            n6 = 1;
                                                                                                                                            break Label_0489;
                                                                                                                                            Label_2180:
                                                                                                                                            d.i = obtainStyledAttributes2.getBoolean(index2, d.i);
                                                                                                                                            continue Label_3473;
                                                                                                                                            Label_4255:
                                                                                                                                            adu2 = i((Context)ex, Xml.asAttributeSet(xmlPullParser), true);
                                                                                                                                            continue Label_0686_Outer;
                                                                                                                                            Label_3041:
                                                                                                                                            d.d = obtainStyledAttributes2.getLayoutDimension(index2, d.d);
                                                                                                                                            continue Label_3473;
                                                                                                                                            Label_0453:
                                                                                                                                            iftrue(Label_0487:)(!name.equals("Motion"));
                                                                                                                                            break Block_22;
                                                                                                                                        }
                                                                                                                                        n6 = 9;
                                                                                                                                        break Label_0489;
                                                                                                                                        Label_1617:
                                                                                                                                        sb5 = new StringBuilder();
                                                                                                                                        sb5.append("XML parser error must be within a Constraint ");
                                                                                                                                        sb5.append(xmlPullParser.getLineNumber());
                                                                                                                                        throw new RuntimeException(sb5.toString());
                                                                                                                                        Label_3535:
                                                                                                                                        iftrue(Label_3924:)(adu == null);
                                                                                                                                        continue Block_15_Outer;
                                                                                                                                    }
                                                                                                                                    Label_2455:
                                                                                                                                    d.aq = obtainStyledAttributes2.getInt(index2, d.aq);
                                                                                                                                    continue Label_3473;
                                                                                                                                    Label_3141:
                                                                                                                                    d.f = obtainStyledAttributes2.getDimensionPixelOffset(index2, d.f);
                                                                                                                                    continue Label_3473;
                                                                                                                                    Label_0875:
                                                                                                                                    iftrue(Label_0907:)(index5 != 5);
                                                                                                                                    continue Block_34_Outer;
                                                                                                                                }
                                                                                                                                Label_3436:
                                                                                                                                d.K = obtainStyledAttributes2.getDimensionPixelSize(index2, d.K);
                                                                                                                                continue Label_3473;
                                                                                                                                Label_3869:
                                                                                                                                e.d = obtainStyledAttributes.getFloat(index, e.d);
                                                                                                                                continue Label_3906;
                                                                                                                                Label_0339:
                                                                                                                                iftrue(Label_0487:)(!name.equals("CustomAttribute"));
                                                                                                                                continue Block_35_Outer;
                                                                                                                            }
                                                                                                                            Label_1457:
                                                                                                                            c.d = obtainStyledAttributes3.getInteger(index3, c.d);
                                                                                                                            continue Label_1599;
                                                                                                                        }
                                                                                                                        sb6 = new StringBuilder();
                                                                                                                        sb6.append(Character.toUpperCase(s.charAt(0)));
                                                                                                                        sb6.append(s.substring(1));
                                                                                                                        s = sb6.toString();
                                                                                                                        continue Label_1029_Outer;
                                                                                                                    }
                                                                                                                    Label_1259: {
                                                                                                                        peekValue = obtainStyledAttributes3.peekValue(index3);
                                                                                                                    }
                                                                                                                    iftrue(Label_1310:)(peekValue.type != 1);
                                                                                                                    continue Label_1701_Outer;
                                                                                                                }
                                                                                                                o = obtainStyledAttributes4.getInteger(6, -1);
                                                                                                                n8 = 1;
                                                                                                                s = s2;
                                                                                                                b = b2;
                                                                                                                break Label_1029;
                                                                                                                name = xmlPullParser.getName();
                                                                                                                switch([Lcom.strobel.decompiler.ast.Label;@235b3d)(name.hashCode());
                                                                                                                Label_0437: {
                                                                                                                    iftrue(Label_0487:)(!name.equals("ConstraintOverride"));
                                                                                                                }
                                                                                                                continue Block_36_Outer;
                                                                                                            }
                                                                                                            Label_3769: {
                                                                                                                e.i = obtainStyledAttributes.getDimension(index, e.i);
                                                                                                            }
                                                                                                            continue Label_3906;
                                                                                                        }
                                                                                                        obtainStyledAttributes4.recycle();
                                                                                                        adu2 = adu;
                                                                                                        continue Label_0686_Outer;
                                                                                                        Label_3809: {
                                                                                                            e.g = obtainStyledAttributes.getFloat(index, e.g);
                                                                                                        }
                                                                                                        continue Label_3906;
                                                                                                    }
                                                                                                    n8 = 7;
                                                                                                    s = s2;
                                                                                                    b = b2;
                                                                                                    break Label_1029;
                                                                                                    switch([Lcom.strobel.decompiler.ast.Label;@75e55e)(n6);
                                                                                                }
                                                                                                iftrue(Label_1012:)((n9 = obtainStyledAttributes4.getResourceId(8, -1)) != -1);
                                                                                                continue Block_36_Outer;
                                                                                            }
                                                                                            Label_1908: {
                                                                                                switch([Lcom.strobel.decompiler.ast.Label;@4a630b)(value);
                                                                                            }
                                                                                            c.e = obtainStyledAttributes3.getString(index3);
                                                                                            continue Label_1599;
                                                                                            Label_2315:
                                                                                            d.ac = obtainStyledAttributes2.getDimensionPixelSize(index2, d.ac);
                                                                                            continue Label_3473;
                                                                                            Label_1092:
                                                                                            sb7 = new StringBuilder();
                                                                                            sb7.append("XML parser error must be within a Constraint ");
                                                                                            sb7.append(xmlPullParser.getLineNumber());
                                                                                            throw new RuntimeException(sb7.toString());
                                                                                            Label_1497:
                                                                                            c.g = obtainStyledAttributes3.getInt(index3, 0);
                                                                                            continue Label_1599;
                                                                                            Label_1582:
                                                                                            c.j = obtainStyledAttributes3.getFloat(index3, c.j);
                                                                                            continue Label_1599;
                                                                                            Label_0551:
                                                                                            iftrue(Label_1092:)(adu == null);
                                                                                            continue Label_1701_Outer;
                                                                                        }
                                                                                        Label_2375: {
                                                                                            d.N = obtainStyledAttributes2.getDimensionPixelSize(index2, d.N);
                                                                                        }
                                                                                        continue Label_3473;
                                                                                        Label_2435:
                                                                                        d.s = a(obtainStyledAttributes2, index2, d.s);
                                                                                        continue Label_3473;
                                                                                        Label_2510:
                                                                                        d.ai = obtainStyledAttributes2.getDimensionPixelSize(index2, d.ai);
                                                                                        continue Label_3473;
                                                                                        xmlPullParser.getName();
                                                                                        adu2 = adu;
                                                                                        continue Label_0686_Outer;
                                                                                        Label_3281:
                                                                                        d.w = a(obtainStyledAttributes2, index2, d.w);
                                                                                        continue Label_3473;
                                                                                    }
                                                                                    d = adu.d;
                                                                                    obtainStyledAttributes2 = ((Context)ex).obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aed.e);
                                                                                    d.c = true;
                                                                                    indexCount5 = obtainStyledAttributes2.getIndexCount();
                                                                                    n7 = 0;
                                                                                    continue Label_1701;
                                                                                }
                                                                                Label_3081: {
                                                                                    d.y = obtainStyledAttributes2.getFloat(index2, d.y);
                                                                                }
                                                                                continue Label_3473;
                                                                                Label_3241:
                                                                                d.S = obtainStyledAttributes2.getDimensionPixelSize(index2, d.S);
                                                                                continue Label_3473;
                                                                                Label_0405:
                                                                                iftrue(Label_0487:)(!name.equals("Transform"));
                                                                                continue Label_0489_Outer;
                                                                            }
                                                                            Label_4199: {
                                                                                adu2 = i((Context)ex, Xml.asAttributeSet(xmlPullParser), false);
                                                                            }
                                                                            adu2.d.aj = 1;
                                                                            continue Label_0686_Outer;
                                                                            Label_2112:
                                                                            sb8 = new StringBuilder();
                                                                            sb8.append("unused attribute 0x");
                                                                            sb8.append(Integer.toHexString(index2));
                                                                            sb8.append("   ");
                                                                            sb8.append(adv.a.get(index2));
                                                                            Log.w("ConstraintSet", sb8.toString());
                                                                            continue Label_3473;
                                                                            ++n5;
                                                                            s2 = s;
                                                                            b2 = b;
                                                                            continue Label_0597;
                                                                        }
                                                                        Label_0470: {
                                                                            iftrue(Label_0487:)(!name.equals("Layout"));
                                                                        }
                                                                        Block_23: {
                                                                            break Block_23;
                                                                            Label_3221:
                                                                            d.O = obtainStyledAttributes2.getDimensionPixelSize(index2, d.O);
                                                                            continue Label_3473;
                                                                        }
                                                                        n6 = 6;
                                                                        continue Label_0489;
                                                                        Label_2335:
                                                                        d.aa = obtainStyledAttributes2.getInt(index2, d.aa);
                                                                        continue Label_3473;
                                                                        Label_0544:
                                                                        adu2 = adu;
                                                                        continue Label_0686_Outer;
                                                                        Label_1605:
                                                                        obtainStyledAttributes3.recycle();
                                                                        adu2 = adu;
                                                                        continue Label_0686_Outer;
                                                                        Label_0778:
                                                                        iftrue(Label_0809:)(index5 != 2);
                                                                        Block_32: {
                                                                            break Block_32;
                                                                            Label_1542:
                                                                            c.e = acn.a[obtainStyledAttributes3.getInteger(index3, 0)];
                                                                            continue Label_1599;
                                                                        }
                                                                        o = obtainStyledAttributes4.getColor(2, 0);
                                                                        n8 = 4;
                                                                        s = s2;
                                                                        b = b2;
                                                                        continue Label_1029;
                                                                    }
                                                                    Label_2881: {
                                                                        d.M = obtainStyledAttributes2.getDimensionPixelSize(index2, d.M);
                                                                    }
                                                                    continue Label_3473;
                                                                    Label_4141:
                                                                    obtainStyledAttributes5.recycle();
                                                                    adu2 = adu;
                                                                    continue Label_0686_Outer;
                                                                    Label_0907:
                                                                    iftrue(Label_0940:)(index5 != 6);
                                                                    continue Block_48_Outer;
                                                                }
                                                            }
                                                            continue Label_1599;
                                                            Label_2741: {
                                                                d.W = obtainStyledAttributes2.getFloat(index2, d.W);
                                                            }
                                                            continue Label_3473;
                                                            Label_1437:
                                                            c.h = obtainStyledAttributes3.getFloat(index3, c.h);
                                                            continue Label_1599;
                                                        }
                                                        Label_1513: {
                                                            iftrue(Label_1542:)(obtainStyledAttributes3.peekValue(index3).type != 3);
                                                        }
                                                        continue;
                                                    }
                                                    Label_3789: {
                                                        e.h = obtainStyledAttributes.getDimension(index, e.h);
                                                    }
                                                    continue Label_3906;
                                                    Label_3456:
                                                    d.r = a(obtainStyledAttributes2, index2, d.r);
                                                    continue Label_3473;
                                                    Label_3101:
                                                    d.h = obtainStyledAttributes2.getFloat(index2, d.h);
                                                    continue Label_3473;
                                                }
                                                Label_3663: {
                                                    e.j = a(obtainStyledAttributes, index, e.j);
                                                }
                                                continue Label_3906;
                                            }
                                            Label_0843: {
                                                iftrue(Label_0875:)(index5 != 4);
                                            }
                                            continue;
                                        }
                                        n6 = 7;
                                        continue Label_0489;
                                    }
                                }
                                catch (final IOException ex) {
                                    goto Label_4318;
                                }
                                catch (final XmlPullParserException ex) {
                                    break Label_4331;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                return;
            }
            catch (final IOException ex2) {}
            catch (final XmlPullParserException ex3) {}
        }
        Log.e("ConstraintSet", "Error parsing XML resource", (Throwable)ex);
    }
}
