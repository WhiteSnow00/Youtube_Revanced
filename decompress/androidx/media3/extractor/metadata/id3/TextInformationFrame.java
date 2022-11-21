// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media3.extractor.metadata.id3;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class TextInformationFrame extends Id3Frame
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new bvp(1);
    }
    
    public TextInformationFrame(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = baz.a;
        super(string);
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
    
    public TextInformationFrame(final String s, final String a, final String b) {
        super(s);
        this.a = a;
        this.b = b;
    }
    
    private static List d(final String s) {
        final ArrayList list = new ArrayList();
        try {
            if (s.length() >= 10) {
                list.add(Integer.parseInt(s.substring(0, 4)));
                list.add(Integer.parseInt(s.substring(5, 7)));
                list.add(Integer.parseInt(s.substring(8, 10)));
            }
            else if (s.length() >= 7) {
                list.add(Integer.parseInt(s.substring(0, 4)));
                list.add(Integer.parseInt(s.substring(5, 7)));
            }
            else if (s.length() >= 4) {
                list.add(Integer.parseInt(s.substring(0, 4)));
            }
            return list;
        }
        catch (final NumberFormatException ex) {
            return new ArrayList();
        }
    }
    
    public final void b(final ayx p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.f:Ljava/lang/String;
        //     4: astore          4
        //     6: aload           4
        //     8: invokevirtual   java/lang/String.hashCode:()I
        //    11: lookupswitch {
        //            82815: 529
        //            82878: 513
        //            82897: 497
        //            83253: 482
        //            83254: 467
        //            83255: 451
        //            83341: 435
        //            83378: 420
        //            83536: 404
        //            83552: 388
        //          2567331: 372
        //          2569357: 356
        //          2569891: 340
        //          2570401: 324
        //          2570410: 308
        //          2571565: 292
        //          2575251: 277
        //          2581512: 262
        //          2581513: 247
        //          2581514: 231
        //          2583398: 215
        //          2590194: 199
        //          default: 196
        //        }
        //   196: goto            545
        //   199: aload           4
        //   201: ldc             "TYER"
        //   203: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   206: ifeq            545
        //   209: bipush          11
        //   211: istore_2       
        //   212: goto            547
        //   215: aload           4
        //   217: ldc             "TRCK"
        //   219: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   222: ifeq            545
        //   225: bipush          9
        //   227: istore_2       
        //   228: goto            547
        //   231: aload           4
        //   233: ldc             "TPE3"
        //   235: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   238: ifeq            545
        //   241: bipush          19
        //   243: istore_2       
        //   244: goto            547
        //   247: aload           4
        //   249: ldc             "TPE2"
        //   251: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   254: ifeq            545
        //   257: iconst_5       
        //   258: istore_2       
        //   259: goto            547
        //   262: aload           4
        //   264: ldc             "TPE1"
        //   266: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   269: ifeq            545
        //   272: iconst_3       
        //   273: istore_2       
        //   274: goto            547
        //   277: aload           4
        //   279: ldc             "TIT2"
        //   281: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   284: ifeq            545
        //   287: iconst_1       
        //   288: istore_2       
        //   289: goto            547
        //   292: aload           4
        //   294: ldc             "TEXT"
        //   296: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   299: ifeq            545
        //   302: bipush          21
        //   304: istore_2       
        //   305: goto            547
        //   308: aload           4
        //   310: ldc             "TDRL"
        //   312: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   315: ifeq            545
        //   318: bipush          15
        //   320: istore_2       
        //   321: goto            547
        //   324: aload           4
        //   326: ldc             "TDRC"
        //   328: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   331: ifeq            545
        //   334: bipush          14
        //   336: istore_2       
        //   337: goto            547
        //   340: aload           4
        //   342: ldc             "TDAT"
        //   344: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   347: ifeq            545
        //   350: bipush          13
        //   352: istore_2       
        //   353: goto            547
        //   356: aload           4
        //   358: ldc             "TCOM"
        //   360: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   363: ifeq            545
        //   366: bipush          17
        //   368: istore_2       
        //   369: goto            547
        //   372: aload           4
        //   374: ldc             "TALB"
        //   376: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   379: ifeq            545
        //   382: bipush          7
        //   384: istore_2       
        //   385: goto            547
        //   388: aload           4
        //   390: ldc             "TYE"
        //   392: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   395: ifeq            545
        //   398: bipush          10
        //   400: istore_2       
        //   401: goto            547
        //   404: aload           4
        //   406: ldc             "TXT"
        //   408: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   411: ifeq            545
        //   414: bipush          20
        //   416: istore_2       
        //   417: goto            547
        //   420: aload           4
        //   422: ldc             "TT2"
        //   424: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   427: ifeq            545
        //   430: iconst_0       
        //   431: istore_2       
        //   432: goto            547
        //   435: aload           4
        //   437: ldc             "TRK"
        //   439: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   442: ifeq            545
        //   445: bipush          8
        //   447: istore_2       
        //   448: goto            547
        //   451: aload           4
        //   453: ldc             "TP3"
        //   455: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   458: ifeq            545
        //   461: bipush          18
        //   463: istore_2       
        //   464: goto            547
        //   467: aload           4
        //   469: ldc             "TP2"
        //   471: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   474: ifeq            545
        //   477: iconst_4       
        //   478: istore_2       
        //   479: goto            547
        //   482: aload           4
        //   484: ldc             "TP1"
        //   486: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   489: ifeq            545
        //   492: iconst_2       
        //   493: istore_2       
        //   494: goto            547
        //   497: aload           4
        //   499: ldc             "TDA"
        //   501: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   504: ifeq            545
        //   507: bipush          12
        //   509: istore_2       
        //   510: goto            547
        //   513: aload           4
        //   515: ldc             "TCM"
        //   517: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   520: ifeq            545
        //   523: bipush          16
        //   525: istore_2       
        //   526: goto            547
        //   529: aload           4
        //   531: ldc             "TAL"
        //   533: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   536: ifeq            545
        //   539: bipush          6
        //   541: istore_2       
        //   542: goto            547
        //   545: iconst_m1      
        //   546: istore_2       
        //   547: iload_2        
        //   548: tableswitch {
        //                0: 988
        //                1: 988
        //                2: 979
        //                3: 979
        //                4: 970
        //                5: 970
        //                6: 961
        //                7: 961
        //                8: 902
        //                9: 902
        //               10: 887
        //               11: 887
        //               12: 844
        //               13: 844
        //               14: 763
        //               15: 682
        //               16: 673
        //               17: 673
        //               18: 664
        //               19: 664
        //               20: 655
        //               21: 655
        //          default: 652
        //        }
        //   652: goto            996
        //   655: aload_1        
        //   656: aload_0        
        //   657: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   660: putfield        ayx.p:Ljava/lang/CharSequence;
        //   663: return         
        //   664: aload_1        
        //   665: aload_0        
        //   666: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   669: putfield        ayx.r:Ljava/lang/CharSequence;
        //   672: return         
        //   673: aload_1        
        //   674: aload_0        
        //   675: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   678: putfield        ayx.q:Ljava/lang/CharSequence;
        //   681: return         
        //   682: aload_0        
        //   683: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   686: invokestatic    androidx/media3/extractor/metadata/id3/TextInformationFrame.d:(Ljava/lang/String;)Ljava/util/List;
        //   689: astore          4
        //   691: aload           4
        //   693: invokeinterface java/util/List.size:()I
        //   698: istore_2       
        //   699: iload_2        
        //   700: iconst_1       
        //   701: if_icmpeq       747
        //   704: iload_2        
        //   705: iconst_2       
        //   706: if_icmpeq       732
        //   709: iload_2        
        //   710: iconst_3       
        //   711: if_icmpeq       717
        //   714: goto            996
        //   717: aload_1        
        //   718: aload           4
        //   720: iconst_2       
        //   721: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   726: checkcast       Ljava/lang/Integer;
        //   729: putfield        ayx.o:Ljava/lang/Integer;
        //   732: aload_1        
        //   733: aload           4
        //   735: iconst_1       
        //   736: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   741: checkcast       Ljava/lang/Integer;
        //   744: putfield        ayx.n:Ljava/lang/Integer;
        //   747: aload_1        
        //   748: aload           4
        //   750: iconst_0       
        //   751: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   756: checkcast       Ljava/lang/Integer;
        //   759: putfield        ayx.m:Ljava/lang/Integer;
        //   762: return         
        //   763: aload_0        
        //   764: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   767: invokestatic    androidx/media3/extractor/metadata/id3/TextInformationFrame.d:(Ljava/lang/String;)Ljava/util/List;
        //   770: astore          4
        //   772: aload           4
        //   774: invokeinterface java/util/List.size:()I
        //   779: istore_2       
        //   780: iload_2        
        //   781: iconst_1       
        //   782: if_icmpeq       828
        //   785: iload_2        
        //   786: iconst_2       
        //   787: if_icmpeq       813
        //   790: iload_2        
        //   791: iconst_3       
        //   792: if_icmpeq       798
        //   795: goto            996
        //   798: aload_1        
        //   799: aload           4
        //   801: iconst_2       
        //   802: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   807: checkcast       Ljava/lang/Integer;
        //   810: putfield        ayx.l:Ljava/lang/Integer;
        //   813: aload_1        
        //   814: aload           4
        //   816: iconst_1       
        //   817: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   822: checkcast       Ljava/lang/Integer;
        //   825: putfield        ayx.k:Ljava/lang/Integer;
        //   828: aload_1        
        //   829: aload           4
        //   831: iconst_0       
        //   832: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   837: checkcast       Ljava/lang/Integer;
        //   840: putfield        ayx.j:Ljava/lang/Integer;
        //   843: return         
        //   844: aload_0        
        //   845: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   848: iconst_2       
        //   849: iconst_4       
        //   850: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   853: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   856: istore_2       
        //   857: aload_0        
        //   858: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   861: iconst_0       
        //   862: iconst_2       
        //   863: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   866: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   869: istore_3       
        //   870: aload_1        
        //   871: iload_2        
        //   872: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   875: putfield        ayx.k:Ljava/lang/Integer;
        //   878: aload_1        
        //   879: iload_3        
        //   880: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   883: putfield        ayx.l:Ljava/lang/Integer;
        //   886: return         
        //   887: aload_1        
        //   888: aload_0        
        //   889: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   892: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   895: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   898: putfield        ayx.j:Ljava/lang/Integer;
        //   901: return         
        //   902: aload_0        
        //   903: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   906: ldc             "/"
        //   908: invokestatic    baz.ap:(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
        //   911: astore          4
        //   913: aload           4
        //   915: iconst_0       
        //   916: aaload         
        //   917: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   920: istore_2       
        //   921: aload           4
        //   923: arraylength    
        //   924: iconst_1       
        //   925: if_icmple       943
        //   928: aload           4
        //   930: iconst_1       
        //   931: aaload         
        //   932: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   935: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   938: astore          4
        //   940: goto            946
        //   943: aconst_null    
        //   944: astore          4
        //   946: aload_1        
        //   947: iload_2        
        //   948: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   951: putfield        ayx.h:Ljava/lang/Integer;
        //   954: aload_1        
        //   955: aload           4
        //   957: putfield        ayx.i:Ljava/lang/Integer;
        //   960: return         
        //   961: aload_1        
        //   962: aload_0        
        //   963: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   966: putfield        ayx.c:Ljava/lang/CharSequence;
        //   969: return         
        //   970: aload_1        
        //   971: aload_0        
        //   972: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   975: putfield        ayx.d:Ljava/lang/CharSequence;
        //   978: return         
        //   979: aload_1        
        //   980: aload_0        
        //   981: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   984: putfield        ayx.b:Ljava/lang/CharSequence;
        //   987: return         
        //   988: aload_1        
        //   989: aload_0        
        //   990: getfield        androidx/media3/extractor/metadata/id3/TextInformationFrame.b:Ljava/lang/String;
        //   993: putfield        ayx.a:Ljava/lang/CharSequence;
        //   996: return         
        //   997: astore_1       
        //   998: goto            886
        //  1001: astore_1       
        //  1002: goto            901
        //  1005: astore_1       
        //  1006: goto            960
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  844    886    997    1001   Ljava/lang/NumberFormatException;
        //  844    886    997    1001   Ljava/lang/StringIndexOutOfBoundsException;
        //  887    901    1001   1005   Ljava/lang/NumberFormatException;
        //  913    940    1005   1009   Ljava/lang/NumberFormatException;
        //  946    960    1005   1009   Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 340, Size: 340
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
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final TextInformationFrame textInformationFrame = (TextInformationFrame)o;
                if (baz.aa(this.f, textInformationFrame.f) && baz.aa(this.a, textInformationFrame.a) && baz.aa(this.b, textInformationFrame.b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final int hashCode = this.f.hashCode();
        final String a = this.a;
        int hashCode2 = 0;
        int hashCode3;
        if (a != null) {
            hashCode3 = a.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String b = this.b;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        return ((hashCode + 527) * 31 + hashCode3) * 31 + hashCode2;
    }
    
    public final String toString() {
        final String f = this.f;
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(": description=");
        sb.append(a);
        sb.append(": value=");
        sb.append(b);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
