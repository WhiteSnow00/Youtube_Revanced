import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class huj implements afty
{
    public final hun a;
    
    public huj(final hun a) {
        this.a = a;
    }
    
    public final ListenableFuture a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        huj.a:Lhun;
        //     4: astore          10
        //     6: new             Ljava/util/ArrayList;
        //     9: dup            
        //    10: aload           10
        //    12: getfield        hun.Q:Ljava/util/List;
        //    15: invokeinterface java/util/List.size:()I
        //    20: invokespecial   java/util/ArrayList.<init>:(I)V
        //    23: astore          11
        //    25: aload           10
        //    27: getfield        hun.Q:Ljava/util/List;
        //    30: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    35: astore          4
        //    37: iconst_0       
        //    38: istore_1       
        //    39: aload           4
        //    41: invokeinterface java/util/Iterator.hasNext:()Z
        //    46: ifeq            94
        //    49: aload           4
        //    51: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    56: checkcast       Ladjw;
        //    59: astore          5
        //    61: aload           5
        //    63: getfield        adjw.b:Laezp;
        //    66: invokevirtual   aezp.h:()Z
        //    69: ifne            39
        //    72: aload           10
        //    74: getfield        hun.A:Lcom/google/android/apps/youtube/app/extensions/upload/UploadFrontendIdMapHelper;
        //    77: aload           5
        //    79: getfield        adjw.a:Landroid/net/Uri;
        //    82: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadFrontendIdMapHelper.a:(Landroid/net/Uri;)Ljava/lang/String;
        //    85: ifnonnull       39
        //    88: iinc            1, 1
        //    91: goto            39
        //    94: aload           10
        //    96: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //    99: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadActivity.getIntent:()Landroid/content/Intent;
        //   102: invokestatic    adjx.k:(Landroid/content/Intent;)I
        //   105: istore_2       
        //   106: iload_1        
        //   107: ifle            223
        //   110: new             Labh;
        //   113: dup            
        //   114: iload_1        
        //   115: invokespecial   abh.<init>:(I)V
        //   118: astore          7
        //   120: aload           10
        //   122: getfield        hun.C:Ladkb;
        //   125: iload_1        
        //   126: getstatic       aphp.c:Laphp;
        //   129: aload           10
        //   131: invokeinterface adkb.z:(ILaphp;Ladkg;)Ljava/util/List;
        //   136: astore          6
        //   138: aload           10
        //   140: getfield        hun.Q:Ljava/util/List;
        //   143: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   148: astore          4
        //   150: iconst_0       
        //   151: istore_1       
        //   152: aload           4
        //   154: invokeinterface java/util/Iterator.hasNext:()Z
        //   159: ifeq            220
        //   162: aload           4
        //   164: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   169: checkcast       Ladjw;
        //   172: astore          5
        //   174: aload           10
        //   176: getfield        hun.A:Lcom/google/android/apps/youtube/app/extensions/upload/UploadFrontendIdMapHelper;
        //   179: aload           5
        //   181: getfield        adjw.a:Landroid/net/Uri;
        //   184: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadFrontendIdMapHelper.a:(Landroid/net/Uri;)Ljava/lang/String;
        //   187: ifnonnull       152
        //   190: aload           7
        //   192: aload           5
        //   194: getfield        adjw.a:Landroid/net/Uri;
        //   197: aload           6
        //   199: iload_1        
        //   200: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   205: checkcast       Ljava/lang/String;
        //   208: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   213: pop            
        //   214: iinc            1, 1
        //   217: goto            152
        //   220: goto            226
        //   223: aconst_null    
        //   224: astore          7
        //   226: aload           10
        //   228: getfield        hun.Q:Ljava/util/List;
        //   231: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   236: astore          12
        //   238: aconst_null    
        //   239: astore          5
        //   241: iload_2        
        //   242: istore_1       
        //   243: aload           12
        //   245: invokeinterface java/util/Iterator.hasNext:()Z
        //   250: ifeq            2297
        //   253: aload           12
        //   255: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   260: checkcast       Ladjw;
        //   263: astore          13
        //   265: aload           13
        //   267: getfield        adjw.b:Laezp;
        //   270: invokevirtual   aezp.h:()Z
        //   273: ifne            326
        //   276: aload           10
        //   278: getfield        hun.A:Lcom/google/android/apps/youtube/app/extensions/upload/UploadFrontendIdMapHelper;
        //   281: aload           13
        //   283: getfield        adjw.a:Landroid/net/Uri;
        //   286: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadFrontendIdMapHelper.a:(Landroid/net/Uri;)Ljava/lang/String;
        //   289: astore          4
        //   291: aload           4
        //   293: astore          6
        //   295: aload           4
        //   297: ifnonnull       339
        //   300: aload           7
        //   302: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   305: pop            
        //   306: aload           7
        //   308: aload           13
        //   310: getfield        adjw.a:Landroid/net/Uri;
        //   313: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   318: checkcast       Ljava/lang/String;
        //   321: astore          6
        //   323: goto            339
        //   326: aload           13
        //   328: getfield        adjw.b:Laezp;
        //   331: invokevirtual   aezp.c:()Ljava/lang/Object;
        //   334: checkcast       Ljava/lang/String;
        //   337: astore          6
        //   339: aload           6
        //   341: invokestatic    adkm.d:(Ljava/lang/String;)Z
        //   344: ifne            357
        //   347: aload           10
        //   349: getfield        hun.aa:Ladet;
        //   352: ldc             "Upload Activity supports only ClientApi uploads."
        //   354: invokevirtual   adet.g:(Ljava/lang/String;)V
        //   357: aload           10
        //   359: getfield        hun.ad:Lziy;
        //   362: getfield        ziy.c:Ljava/lang/Object;
        //   365: checkcast       Lvai;
        //   368: ldc2_w          45381991
        //   371: invokevirtual   vai.l:(J)Lasht;
        //   374: invokevirtual   asht.aM:()Ljava/lang/Object;
        //   377: checkcast       Ljava/lang/Boolean;
        //   380: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   383: ifeq            396
        //   386: aload           6
        //   388: invokestatic    adkm.d:(Ljava/lang/String;)Z
        //   391: ldc             "Upload Activity supports only ClientApi uploads."
        //   393: invokestatic    adkp.I:(ZLjava/lang/Object;)V
        //   396: aload           10
        //   398: getfield        hun.D:Ladlp;
        //   401: aload           6
        //   403: aconst_null    
        //   404: getstatic       apht.aI:Lapht;
        //   407: aload           10
        //   409: getfield        hun.U:Laphs;
        //   412: invokevirtual   adlp.d:(Ljava/lang/String;Ljava/lang/String;Lapht;Laphs;)V
        //   415: aload           10
        //   417: getfield        hun.C:Ladkb;
        //   420: aload           6
        //   422: aload           10
        //   424: invokeinterface adkb.B:(Ljava/lang/String;Ladkg;)V
        //   429: aload           10
        //   431: getfield        hun.C:Ladkb;
        //   434: aload           6
        //   436: iload_1        
        //   437: invokeinterface adkb.T:(Ljava/lang/String;I)Lcom/google/common/util/concurrent/ListenableFuture;
        //   442: pop            
        //   443: aload           10
        //   445: getfield        hun.C:Ladkb;
        //   448: aload           6
        //   450: aload           13
        //   452: getfield        adjw.a:Landroid/net/Uri;
        //   455: invokeinterface adkb.p:(Ljava/lang/String;Landroid/net/Uri;)Lcom/google/common/util/concurrent/ListenableFuture;
        //   460: pop            
        //   461: aload           10
        //   463: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //   466: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadActivity.getIntent:()Landroid/content/Intent;
        //   469: ldc             "com.google.android.libraries.youtube.upload.extra_upload_activity_presumed_shorts_eligibility"
        //   471: iconst_0       
        //   472: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   475: istore_3       
        //   476: aload           13
        //   478: getfield        adjw.a:Landroid/net/Uri;
        //   481: astore          8
        //   483: aload           10
        //   485: getfield        hun.U:Laphs;
        //   488: astore          4
        //   490: aload           8
        //   492: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   495: pop            
        //   496: getstatic       android/net/Uri.EMPTY:Landroid/net/Uri;
        //   499: aload           8
        //   501: invokevirtual   android/net/Uri.equals:(Ljava/lang/Object;)Z
        //   504: iconst_1       
        //   505: ixor           
        //   506: invokestatic    adkp.H:(Z)V
        //   509: aload           6
        //   511: invokestatic    tvb.n:(Ljava/lang/String;)V
        //   514: aload           4
        //   516: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   519: pop            
        //   520: new             Ladop;
        //   523: dup            
        //   524: invokespecial   adop.<init>:()V
        //   527: astore          9
        //   529: aload           6
        //   531: ifnull          2286
        //   534: aload           9
        //   536: aload           6
        //   538: putfield        adop.a:Ljava/lang/String;
        //   541: aload           9
        //   543: aload           8
        //   545: putfield        adop.f:Ljava/lang/Object;
        //   548: aload           9
        //   550: aload           4
        //   552: putfield        adop.g:Ljava/lang/Object;
        //   555: aload           9
        //   557: iload_1        
        //   558: putfield        adop.e:I
        //   561: aload           9
        //   563: iload_3        
        //   564: putfield        adop.b:Z
        //   567: aload           9
        //   569: iconst_1       
        //   570: putfield        adop.d:B
        //   573: aload           9
        //   575: aload           8
        //   577: invokevirtual   android/net/Uri.getLastPathSegment:()Ljava/lang/String;
        //   580: putfield        adop.h:Ljava/lang/Object;
        //   583: aload           10
        //   585: getfield        hun.E:Ladjx;
        //   588: astore          4
        //   590: aload           10
        //   592: getfield        hun.d:Lwyw;
        //   595: astore          15
        //   597: aload           9
        //   599: invokevirtual   adop.a:()Landroid/net/Uri;
        //   602: astore          14
        //   604: aload           4
        //   606: getfield        adjx.b:Landroid/content/ContentResolver;
        //   609: aload           14
        //   611: invokevirtual   android/content/ContentResolver.getType:(Landroid/net/Uri;)Ljava/lang/String;
        //   614: astore          8
        //   616: aload           8
        //   618: ifnull          644
        //   621: aload           8
        //   623: ldc_w           "image/"
        //   626: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   629: ifeq            644
        //   632: ldc_w           "URI is an image"
        //   635: invokestatic    ttr.l:(Ljava/lang/String;)V
        //   638: aconst_null    
        //   639: astore          8
        //   641: goto            1386
        //   644: aload           4
        //   646: getfield        adjx.b:Landroid/content/ContentResolver;
        //   649: aload           14
        //   651: getstatic       adjx.a:[Ljava/lang/String;
        //   654: ldc_w           "mime_type LIKE 'video/%'"
        //   657: aconst_null    
        //   658: aconst_null    
        //   659: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   662: astore          4
        //   664: goto            923
        //   667: astore          8
        //   669: aload           14
        //   671: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   674: astore          4
        //   676: aload           8
        //   678: invokevirtual   java/lang/NullPointerException.getMessage:()Ljava/lang/String;
        //   681: astore          16
        //   683: new             Ljava/lang/StringBuilder;
        //   686: dup            
        //   687: ldc_w           "NullPointerException resolving content from URL "
        //   690: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   693: astore          8
        //   695: aload           8
        //   697: aload           4
        //   699: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   702: pop            
        //   703: aload           8
        //   705: ldc_w           ": "
        //   708: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   711: pop            
        //   712: aload           8
        //   714: aload           16
        //   716: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   719: pop            
        //   720: aload           8
        //   722: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   725: invokestatic    ttr.l:(Ljava/lang/String;)V
        //   728: goto            920
        //   731: astore          8
        //   733: aload           14
        //   735: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   738: astore          4
        //   740: aload           8
        //   742: invokevirtual   android/database/sqlite/SQLiteException.getMessage:()Ljava/lang/String;
        //   745: astore          16
        //   747: new             Ljava/lang/StringBuilder;
        //   750: dup            
        //   751: ldc_w           "Error resolving content from URL "
        //   754: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   757: astore          8
        //   759: aload           8
        //   761: aload           4
        //   763: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   766: pop            
        //   767: aload           8
        //   769: ldc_w           ": "
        //   772: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   775: pop            
        //   776: aload           8
        //   778: aload           16
        //   780: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   783: pop            
        //   784: aload           8
        //   786: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   789: invokestatic    ttr.l:(Ljava/lang/String;)V
        //   792: goto            920
        //   795: astore          8
        //   797: aload           14
        //   799: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   802: astore          4
        //   804: aload           8
        //   806: invokevirtual   java/lang/IllegalArgumentException.getMessage:()Ljava/lang/String;
        //   809: astore          16
        //   811: new             Ljava/lang/StringBuilder;
        //   814: dup            
        //   815: ldc_w           "Illegal argument when resolving content URL "
        //   818: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   821: astore          8
        //   823: aload           8
        //   825: aload           4
        //   827: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   830: pop            
        //   831: aload           8
        //   833: ldc_w           ": "
        //   836: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   839: pop            
        //   840: aload           8
        //   842: aload           16
        //   844: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   847: pop            
        //   848: aload           8
        //   850: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   853: invokestatic    ttr.l:(Ljava/lang/String;)V
        //   856: goto            920
        //   859: astore          8
        //   861: aload           14
        //   863: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   866: astore          4
        //   868: aload           8
        //   870: invokevirtual   java/lang/SecurityException.getMessage:()Ljava/lang/String;
        //   873: astore          16
        //   875: new             Ljava/lang/StringBuilder;
        //   878: dup            
        //   879: ldc_w           "SecurityException resolving URI "
        //   882: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   885: astore          8
        //   887: aload           8
        //   889: aload           4
        //   891: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   894: pop            
        //   895: aload           8
        //   897: ldc_w           ": "
        //   900: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   903: pop            
        //   904: aload           8
        //   906: aload           16
        //   908: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   911: pop            
        //   912: aload           8
        //   914: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   917: invokestatic    ttr.l:(Ljava/lang/String;)V
        //   920: aconst_null    
        //   921: astore          4
        //   923: aload           14
        //   925: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //   928: astore          16
        //   930: aload           16
        //   932: ifnonnull       950
        //   935: aload           4
        //   937: ifnull          638
        //   940: aload           4
        //   942: invokeinterface android/database/Cursor.close:()V
        //   947: goto            638
        //   950: new             Ljava/io/File;
        //   953: astore          8
        //   955: aload           8
        //   957: aload           16
        //   959: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   962: aload           8
        //   964: invokevirtual   java/io/File.getCanonicalPath:()Ljava/lang/String;
        //   967: invokestatic    android/os/Environment.getDataDirectory:()Ljava/io/File;
        //   970: invokevirtual   java/io/File.toString:()Ljava/lang/String;
        //   973: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   976: ifeq            987
        //   979: aload           4
        //   981: ifnull          638
        //   984: goto            940
        //   987: aload           4
        //   989: ifnull          1232
        //   992: aload           4
        //   994: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   999: ifne            1005
        //  1002: goto            1232
        //  1005: getstatic       admo.a:Ladmo;
        //  1008: invokevirtual   ahbh.createBuilder:()Lahaz;
        //  1011: astore          8
        //  1013: getstatic       adjr.j:Ladjr;
        //  1016: astore          17
        //  1018: aload           4
        //  1020: ldc_w           "_id"
        //  1023: invokestatic    adjx.d:(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/Long;
        //  1026: astore          16
        //  1028: aload           17
        //  1030: aload           8
        //  1032: aload           16
        //  1034: ldc_w           "Invalid media store video id."
        //  1037: invokestatic    adjx.m:(Lasji;Lahaz;Ljava/lang/Object;Ljava/lang/String;)Lahaz;
        //  1040: astore          16
        //  1042: aload           4
        //  1044: ldc_w           "mime_type"
        //  1047: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //  1052: istore_2       
        //  1053: iload_2        
        //  1054: ifge            1063
        //  1057: aconst_null    
        //  1058: astore          8
        //  1060: goto            1073
        //  1063: aload           4
        //  1065: iload_2        
        //  1066: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1071: astore          8
        //  1073: aload           8
        //  1075: ifnull          1136
        //  1078: aload           8
        //  1080: ldc_w           "video/"
        //  1083: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //  1086: ifne            1136
        //  1089: new             Ljava/lang/StringBuilder;
        //  1092: astore          15
        //  1094: aload           15
        //  1096: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1099: aload           15
        //  1101: ldc_w           "invalid file type ["
        //  1104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1107: pop            
        //  1108: aload           15
        //  1110: aload           8
        //  1112: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1115: pop            
        //  1116: aload           15
        //  1118: ldc_w           "]"
        //  1121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1124: pop            
        //  1125: aload           15
        //  1127: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1130: invokestatic    ttr.l:(Ljava/lang/String;)V
        //  1133: goto            1376
        //  1136: getstatic       adjr.k:Ladjr;
        //  1139: aload           16
        //  1141: aload           4
        //  1143: ldc_w           "duration"
        //  1146: invokestatic    adjx.d:(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/Long;
        //  1149: ldc_w           "Invalid media store video duration."
        //  1152: invokestatic    adjx.m:(Lasji;Lahaz;Ljava/lang/Object;Ljava/lang/String;)Lahaz;
        //  1155: astore          8
        //  1157: aload           9
        //  1159: getstatic       adjr.l:Ladjr;
        //  1162: aload           8
        //  1164: aload           4
        //  1166: ldc_w           "_size"
        //  1169: invokestatic    adjx.d:(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/Long;
        //  1172: ldc_w           "Invalid media store video size."
        //  1175: invokestatic    adjx.m:(Lasji;Lahaz;Ljava/lang/Object;Ljava/lang/String;)Lahaz;
        //  1178: invokevirtual   ahaz.build:()Lahbh;
        //  1181: checkcast       Ladmo;
        //  1184: putfield        adop.j:Ljava/lang/Object;
        //  1187: new             Lwyt;
        //  1190: astore          8
        //  1192: aload           8
        //  1194: sipush          13621
        //  1197: invokestatic    xaa.c:(I)Lxab;
        //  1200: invokespecial   wyt.<init>:(Lxab;)V
        //  1203: aload           15
        //  1205: iconst_3       
        //  1206: aload           8
        //  1208: aload           9
        //  1210: invokevirtual   adop.c:()Ljava/lang/String;
        //  1213: aload           9
        //  1215: getfield        adop.h:Ljava/lang/Object;
        //  1218: checkcast       Ljava/lang/String;
        //  1221: invokestatic    adkp.b:(Ljava/lang/String;Ljava/lang/String;)Lalhi;
        //  1224: invokeinterface wyw.J:(ILwzz;Lalhi;)V
        //  1229: goto            1274
        //  1232: new             Lwyt;
        //  1235: astore          8
        //  1237: aload           8
        //  1239: sipush          13620
        //  1242: invokestatic    xaa.c:(I)Lxab;
        //  1245: invokespecial   wyt.<init>:(Lxab;)V
        //  1248: aload           15
        //  1250: iconst_3       
        //  1251: aload           8
        //  1253: aload           9
        //  1255: invokevirtual   adop.c:()Ljava/lang/String;
        //  1258: aload           9
        //  1260: getfield        adop.h:Ljava/lang/Object;
        //  1263: checkcast       Ljava/lang/String;
        //  1266: invokestatic    adkp.b:(Ljava/lang/String;Ljava/lang/String;)Lalhi;
        //  1269: invokeinterface wyw.J:(ILwzz;Lalhi;)V
        //  1274: aload           4
        //  1276: ifnull          1286
        //  1279: aload           4
        //  1281: invokeinterface android/database/Cursor.close:()V
        //  1286: aload           9
        //  1288: astore          8
        //  1290: goto            1386
        //  1293: astore          8
        //  1295: goto            1305
        //  1298: astore          5
        //  1300: goto            2271
        //  1303: astore          8
        //  1305: aload           14
        //  1307: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  1310: astore          14
        //  1312: aload           8
        //  1314: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //  1317: astore          15
        //  1319: new             Ljava/lang/StringBuilder;
        //  1322: astore          8
        //  1324: aload           8
        //  1326: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1329: aload           8
        //  1331: ldc_w           "Exception when resolving content URI "
        //  1334: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1337: pop            
        //  1338: aload           8
        //  1340: aload           14
        //  1342: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1345: pop            
        //  1346: aload           8
        //  1348: ldc_w           ": "
        //  1351: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1354: pop            
        //  1355: aload           8
        //  1357: aload           15
        //  1359: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1362: pop            
        //  1363: aload           8
        //  1365: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1368: invokestatic    ttr.l:(Ljava/lang/String;)V
        //  1371: aload           4
        //  1373: ifnull          638
        //  1376: aload           4
        //  1378: invokeinterface android/database/Cursor.close:()V
        //  1383: goto            638
        //  1386: aload           10
        //  1388: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  1391: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadActivity.getIntent:()Landroid/content/Intent;
        //  1394: invokestatic    adjx.b:(Landroid/content/Intent;)Laezp;
        //  1397: astore          14
        //  1399: aload           8
        //  1401: ifnull          2226
        //  1404: aload           8
        //  1406: getfield        adop.j:Ljava/lang/Object;
        //  1409: astore          4
        //  1411: aload           4
        //  1413: ifnull          1433
        //  1416: aload           10
        //  1418: getfield        hun.C:Ladkb;
        //  1421: aload           6
        //  1423: aload           4
        //  1425: checkcast       Ladmo;
        //  1428: invokeinterface adkb.P:(Ljava/lang/String;Ladmo;)V
        //  1433: aload           14
        //  1435: invokevirtual   aezp.h:()Z
        //  1438: ifeq            1462
        //  1441: aload           10
        //  1443: getfield        hun.C:Ladkb;
        //  1446: aload           6
        //  1448: aload           14
        //  1450: invokevirtual   aezp.c:()Ljava/lang/Object;
        //  1453: checkcast       Lapos;
        //  1456: invokeinterface adkb.t:(Ljava/lang/String;Lapos;)Lcom/google/common/util/concurrent/ListenableFuture;
        //  1461: pop            
        //  1462: aload           8
        //  1464: invokevirtual   adop.a:()Landroid/net/Uri;
        //  1467: astore          4
        //  1469: aload           10
        //  1471: getfield        hun.W:Ljava/lang/Boolean;
        //  1474: ifnonnull       1490
        //  1477: aload           10
        //  1479: aload           10
        //  1481: invokevirtual   hun.r:()Z
        //  1484: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1487: putfield        hun.W:Ljava/lang/Boolean;
        //  1490: aload           10
        //  1492: getfield        hun.W:Ljava/lang/Boolean;
        //  1495: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  1498: ifne            1507
        //  1501: aconst_null    
        //  1502: astore          4
        //  1504: goto            2163
        //  1507: aload           10
        //  1509: getfield        hun.ac:Laujg;
        //  1512: astore          16
        //  1514: getstatic       admw.a:Ladmw;
        //  1517: invokevirtual   ahbh.createBuilder:()Lahaz;
        //  1520: astore          14
        //  1522: aload           14
        //  1524: invokevirtual   ahaz.copyOnWrite:()V
        //  1527: aload           14
        //  1529: getfield        ahaz.instance:Lahbh;
        //  1532: checkcast       Ladmw;
        //  1535: astore          15
        //  1537: aload           15
        //  1539: iconst_0       
        //  1540: putfield        admw.c:I
        //  1543: aload           15
        //  1545: aload           15
        //  1547: getfield        admw.b:I
        //  1550: iconst_1       
        //  1551: ior            
        //  1552: putfield        admw.b:I
        //  1555: aload           14
        //  1557: invokevirtual   ahaz.copyOnWrite:()V
        //  1560: aload           14
        //  1562: getfield        ahaz.instance:Lahbh;
        //  1565: checkcast       Ladmw;
        //  1568: astore          15
        //  1570: aload           15
        //  1572: iconst_0       
        //  1573: putfield        admw.d:I
        //  1576: aload           15
        //  1578: aload           15
        //  1580: getfield        admw.b:I
        //  1583: iconst_2       
        //  1584: ior            
        //  1585: putfield        admw.b:I
        //  1588: aload           4
        //  1590: invokestatic    aujg.s:(Landroid/net/Uri;)Z
        //  1593: ifne            1642
        //  1596: aload           14
        //  1598: invokevirtual   ahaz.copyOnWrite:()V
        //  1601: aload           14
        //  1603: getfield        ahaz.instance:Lahbh;
        //  1606: checkcast       Ladmw;
        //  1609: astore          4
        //  1611: aload           4
        //  1613: iconst_2       
        //  1614: putfield        admw.c:I
        //  1617: aload           4
        //  1619: aload           4
        //  1621: getfield        admw.b:I
        //  1624: iconst_1       
        //  1625: ior            
        //  1626: putfield        admw.b:I
        //  1629: aload           14
        //  1631: invokevirtual   ahaz.build:()Lahbh;
        //  1634: checkcast       Ladmw;
        //  1637: astore          4
        //  1639: goto            1504
        //  1642: aload           16
        //  1644: aload           4
        //  1646: invokevirtual   aujg.r:(Landroid/net/Uri;)Landroid/database/Cursor;
        //  1649: astore          15
        //  1651: aload           15
        //  1653: ifnull          2033
        //  1656: aload           14
        //  1658: invokevirtual   ahaz.copyOnWrite:()V
        //  1661: aload           14
        //  1663: getfield        ahaz.instance:Lahbh;
        //  1666: checkcast       Ladmw;
        //  1669: astore          4
        //  1671: aload           4
        //  1673: iconst_1       
        //  1674: putfield        admw.c:I
        //  1677: aload           4
        //  1679: aload           4
        //  1681: getfield        admw.b:I
        //  1684: iconst_1       
        //  1685: ior            
        //  1686: putfield        admw.b:I
        //  1689: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1692: bipush          29
        //  1694: if_icmpge       1823
        //  1697: aload           15
        //  1699: aload           15
        //  1701: ldc_w           "_data"
        //  1704: invokeinterface android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
        //  1709: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1714: astore          4
        //  1716: aload           4
        //  1718: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1721: ifeq            1739
        //  1724: ldc_w           "StorageVolumeUtil"
        //  1727: ldc_w           "Path is null"
        //  1730: invokestatic    ttr.m:(Ljava/lang/String;Ljava/lang/String;)V
        //  1733: aconst_null    
        //  1734: astore          4
        //  1736: goto            1750
        //  1739: new             Ljava/io/File;
        //  1742: dup            
        //  1743: aload           4
        //  1745: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //  1748: astore          4
        //  1750: aload           4
        //  1752: ifnull          1991
        //  1755: aload           16
        //  1757: getfield        aujg.a:Ljava/lang/Object;
        //  1760: checkcast       Landroid/os/storage/StorageManager;
        //  1763: aload           4
        //  1765: invokevirtual   android/os/storage/StorageManager.getStorageVolume:(Ljava/io/File;)Landroid/os/storage/StorageVolume;
        //  1768: astore          4
        //  1770: aload           4
        //  1772: ifnull          1787
        //  1775: aload           16
        //  1777: aload           14
        //  1779: aload           4
        //  1781: invokevirtual   aujg.v:(Lahaz;Landroid/os/storage/StorageVolume;)V
        //  1784: goto            1991
        //  1787: aload           14
        //  1789: invokevirtual   ahaz.copyOnWrite:()V
        //  1792: aload           14
        //  1794: getfield        ahaz.instance:Lahbh;
        //  1797: checkcast       Ladmw;
        //  1800: astore          4
        //  1802: aload           4
        //  1804: iconst_3       
        //  1805: putfield        admw.d:I
        //  1808: aload           4
        //  1810: aload           4
        //  1812: getfield        admw.b:I
        //  1815: iconst_2       
        //  1816: ior            
        //  1817: putfield        admw.b:I
        //  1820: goto            1991
        //  1823: aload           15
        //  1825: aload           15
        //  1827: ldc_w           "volume_name"
        //  1830: invokeinterface android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
        //  1835: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  1840: astore          17
        //  1842: aload           17
        //  1844: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1847: ifeq            1886
        //  1850: aload           14
        //  1852: invokevirtual   ahaz.copyOnWrite:()V
        //  1855: aload           14
        //  1857: getfield        ahaz.instance:Lahbh;
        //  1860: checkcast       Ladmw;
        //  1863: astore          4
        //  1865: aload           4
        //  1867: iconst_3       
        //  1868: putfield        admw.d:I
        //  1871: aload           4
        //  1873: aload           4
        //  1875: getfield        admw.b:I
        //  1878: iconst_2       
        //  1879: ior            
        //  1880: putfield        admw.b:I
        //  1883: goto            1991
        //  1886: new             Landroid/net/Uri$Builder;
        //  1889: astore          4
        //  1891: aload           4
        //  1893: invokespecial   android/net/Uri$Builder.<init>:()V
        //  1896: aload           4
        //  1898: ldc_w           "content"
        //  1901: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  1904: pop            
        //  1905: aload           4
        //  1907: ldc_w           "media"
        //  1910: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  1913: pop            
        //  1914: aload           4
        //  1916: aload           17
        //  1918: invokevirtual   android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  1921: pop            
        //  1922: aload           16
        //  1924: getfield        aujg.a:Ljava/lang/Object;
        //  1927: astore          17
        //  1929: aload           4
        //  1931: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //  1934: astore          4
        //  1936: aload           16
        //  1938: aload           14
        //  1940: aload           17
        //  1942: checkcast       Landroid/os/storage/StorageManager;
        //  1945: aload           4
        //  1947: invokevirtual   android/os/storage/StorageManager.getStorageVolume:(Landroid/net/Uri;)Landroid/os/storage/StorageVolume;
        //  1950: invokevirtual   aujg.v:(Lahaz;Landroid/os/storage/StorageVolume;)V
        //  1953: goto            1991
        //  1956: astore          4
        //  1958: aload           14
        //  1960: invokevirtual   ahaz.copyOnWrite:()V
        //  1963: aload           14
        //  1965: getfield        ahaz.instance:Lahbh;
        //  1968: checkcast       Ladmw;
        //  1971: astore          4
        //  1973: aload           4
        //  1975: iconst_3       
        //  1976: putfield        admw.d:I
        //  1979: aload           4
        //  1981: aload           4
        //  1983: getfield        admw.b:I
        //  1986: iconst_2       
        //  1987: ior            
        //  1988: putfield        admw.b:I
        //  1991: aload           15
        //  1993: invokeinterface android/database/Cursor.isClosed:()Z
        //  1998: ifne            2033
        //  2001: aload           15
        //  2003: invokeinterface android/database/Cursor.close:()V
        //  2008: goto            2033
        //  2011: astore          4
        //  2013: aload           15
        //  2015: invokeinterface android/database/Cursor.isClosed:()Z
        //  2020: ifne            2030
        //  2023: aload           15
        //  2025: invokeinterface android/database/Cursor.close:()V
        //  2030: aload           4
        //  2032: athrow         
        //  2033: aload           14
        //  2035: invokevirtual   ahaz.build:()Lahbh;
        //  2038: checkcast       Ladmw;
        //  2041: astore          4
        //  2043: goto            1504
        //  2046: astore          14
        //  2048: aload           10
        //  2050: getfield        hun.a:Lcom/google/android/apps/youtube/app/extensions/upload/UploadActivity;
        //  2053: invokevirtual   com/google/android/apps/youtube/app/extensions/upload/UploadActivity.getIntent:()Landroid/content/Intent;
        //  2056: invokestatic    adjx.k:(Landroid/content/Intent;)I
        //  2059: invokestatic    adjx.j:(I)Ladmt;
        //  2062: astore          4
        //  2064: aload           10
        //  2066: getfield        hun.aa:Ladet;
        //  2069: ldc_w           "Media info fetch failed"
        //  2072: aload           14
        //  2074: aload           4
        //  2076: invokevirtual   adet.i:(Ljava/lang/String;Ljava/lang/Throwable;Ladmt;)V
        //  2079: getstatic       admw.a:Ladmw;
        //  2082: invokevirtual   ahbh.createBuilder:()Lahaz;
        //  2085: astore          4
        //  2087: aload           4
        //  2089: invokevirtual   ahaz.copyOnWrite:()V
        //  2092: aload           4
        //  2094: getfield        ahaz.instance:Lahbh;
        //  2097: checkcast       Ladmw;
        //  2100: astore          14
        //  2102: aload           14
        //  2104: iconst_3       
        //  2105: putfield        admw.c:I
        //  2108: aload           14
        //  2110: aload           14
        //  2112: getfield        admw.b:I
        //  2115: iconst_1       
        //  2116: ior            
        //  2117: putfield        admw.b:I
        //  2120: aload           4
        //  2122: invokevirtual   ahaz.copyOnWrite:()V
        //  2125: aload           4
        //  2127: getfield        ahaz.instance:Lahbh;
        //  2130: checkcast       Ladmw;
        //  2133: astore          14
        //  2135: aload           14
        //  2137: iconst_0       
        //  2138: putfield        admw.d:I
        //  2141: aload           14
        //  2143: aload           14
        //  2145: getfield        admw.b:I
        //  2148: iconst_2       
        //  2149: ior            
        //  2150: putfield        admw.b:I
        //  2153: aload           4
        //  2155: invokevirtual   ahaz.build:()Lahbh;
        //  2158: checkcast       Ladmw;
        //  2161: astore          4
        //  2163: aload           4
        //  2165: ifnull          2182
        //  2168: aload           10
        //  2170: getfield        hun.C:Ladkb;
        //  2173: aload           6
        //  2175: aload           4
        //  2177: invokeinterface adkb.R:(Ljava/lang/String;Ladmw;)V
        //  2182: aload           13
        //  2184: getfield        adjw.c:Laezp;
        //  2187: invokevirtual   aezp.h:()Z
        //  2190: ifeq            2209
        //  2193: aload           9
        //  2195: aload           13
        //  2197: getfield        adjw.c:Laezp;
        //  2200: invokevirtual   aezp.c:()Ljava/lang/Object;
        //  2203: checkcast       Ljava/lang/String;
        //  2206: putfield        adop.c:Ljava/lang/String;
        //  2209: aload           11
        //  2211: aload           8
        //  2213: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  2218: pop            
        //  2219: aload           5
        //  2221: astore          4
        //  2223: goto            2264
        //  2226: aload           5
        //  2228: astore          4
        //  2230: aload           5
        //  2232: ifnonnull       2254
        //  2235: new             Ljava/util/ArrayList;
        //  2238: dup            
        //  2239: aload           10
        //  2241: getfield        hun.Q:Ljava/util/List;
        //  2244: invokeinterface java/util/List.size:()I
        //  2249: invokespecial   java/util/ArrayList.<init>:(I)V
        //  2252: astore          4
        //  2254: aload           4
        //  2256: aload           6
        //  2258: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  2263: pop            
        //  2264: aload           4
        //  2266: astore          5
        //  2268: goto            243
        //  2271: aload           4
        //  2273: ifnull          2283
        //  2276: aload           4
        //  2278: invokeinterface android/database/Cursor.close:()V
        //  2283: aload           5
        //  2285: athrow         
        //  2286: new             Ljava/lang/NullPointerException;
        //  2289: dup            
        //  2290: ldc_w           "Null frontendUploadId"
        //  2293: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  2296: athrow         
        //  2297: new             Lheo;
        //  2300: dup            
        //  2301: aload           7
        //  2303: aload           5
        //  2305: aload           11
        //  2307: invokespecial   heo.<init>:(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V
        //  2310: invokestatic    afwm.m:(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
        //  2313: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  644    664    859    920    Ljava/lang/SecurityException;
        //  644    664    795    859    Ljava/lang/IllegalArgumentException;
        //  644    664    731    795    Landroid/database/sqlite/SQLiteException;
        //  644    664    667    731    Ljava/lang/NullPointerException;
        //  923    930    1303   1305   Ljava/lang/Exception;
        //  923    930    1298   2286   Any
        //  950    979    1303   1305   Ljava/lang/Exception;
        //  950    979    1298   2286   Any
        //  992    1002   1303   1305   Ljava/lang/Exception;
        //  992    1002   1298   2286   Any
        //  1005   1028   1303   1305   Ljava/lang/Exception;
        //  1005   1028   1298   2286   Any
        //  1028   1053   1293   1298   Ljava/lang/Exception;
        //  1028   1053   1298   2286   Any
        //  1063   1073   1293   1298   Ljava/lang/Exception;
        //  1063   1073   1298   2286   Any
        //  1078   1133   1293   1298   Ljava/lang/Exception;
        //  1078   1133   1298   2286   Any
        //  1136   1229   1293   1298   Ljava/lang/Exception;
        //  1136   1229   1298   2286   Any
        //  1232   1274   1293   1298   Ljava/lang/Exception;
        //  1232   1274   1298   2286   Any
        //  1305   1371   1298   2286   Any
        //  1507   1639   2046   2163   Ljava/lang/Exception;
        //  1642   1651   2046   2163   Ljava/lang/Exception;
        //  1656   1733   2011   2033   Any
        //  1739   1750   2011   2033   Any
        //  1755   1770   2011   2033   Any
        //  1775   1784   2011   2033   Any
        //  1787   1820   2011   2033   Any
        //  1823   1883   1956   1991   Ljava/lang/IllegalStateException;
        //  1823   1883   2011   2033   Any
        //  1886   1953   1956   1991   Ljava/lang/IllegalStateException;
        //  1886   1953   2011   2033   Any
        //  1958   1991   2011   2033   Any
        //  1991   2008   2046   2163   Ljava/lang/Exception;
        //  2013   2030   2046   2163   Ljava/lang/Exception;
        //  2030   2033   2046   2163   Ljava/lang/Exception;
        //  2033   2043   2046   2163   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1507:
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
}
