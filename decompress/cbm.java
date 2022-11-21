import android.os.SystemClock;
import java.net.URLConnection;
import java.io.BufferedInputStream;
import java.net.URL;
import java.io.InputStream;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import android.net.Uri;
import android.graphics.Bitmap;
import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbm extends AsyncTask
{
    public final Bitmap a;
    public final Uri b;
    final cbr c;
    private int d;
    private long e;
    
    public cbm(final cbr c) {
        this.c = c;
        final MediaDescriptionCompat d = c.D;
        final Uri uri = null;
        Bitmap c2;
        if (d == null) {
            c2 = null;
        }
        else {
            c2 = d.c;
        }
        Bitmap a = c2;
        if (cbr.v(c2)) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            a = null;
        }
        this.a = a;
        final MediaDescriptionCompat d2 = c.D;
        Uri d3;
        if (d2 == null) {
            d3 = uri;
        }
        else {
            d3 = d2.d;
        }
        this.b = d3;
    }
    
    private final InputStream a(final Uri uri) {
        final String lowerCase = uri.getScheme().toLowerCase();
        InputStream inputStream;
        if (!"android.resource".equals(lowerCase) && !"content".equals(lowerCase) && !"file".equals(lowerCase)) {
            final URLConnection openConnection = new URL(uri.toString()).openConnection();
            openConnection.setConnectTimeout(cbr.b);
            openConnection.setReadTimeout(cbr.b);
            inputStream = openConnection.getInputStream();
        }
        else {
            inputStream = this.c.d.getContentResolver().openInputStream(uri);
        }
        if (inputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStream);
    }
    
    protected final /* bridge */ Object doInBackground(final Object[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       [Ljava/lang/Void;
        //     4: astore_1       
        //     5: aload_0        
        //     6: getfield        cbm.a:Landroid/graphics/Bitmap;
        //     9: astore          5
        //    11: iconst_0       
        //    12: istore_2       
        //    13: aconst_null    
        //    14: astore          8
        //    16: aconst_null    
        //    17: astore          6
        //    19: aload           5
        //    21: astore_1       
        //    22: aload           5
        //    24: ifnonnull       577
        //    27: aload_0        
        //    28: getfield        cbm.b:Landroid/net/Uri;
        //    31: astore_1       
        //    32: aload_1        
        //    33: ifnull          575
        //    36: aload_0        
        //    37: aload_1        
        //    38: invokespecial   cbm.a:(Landroid/net/Uri;)Ljava/io/InputStream;
        //    41: astore          5
        //    43: aload           5
        //    45: ifnonnull       115
        //    48: aload           5
        //    50: astore          6
        //    52: aload           5
        //    54: astore_1       
        //    55: new             Ljava/lang/StringBuilder;
        //    58: astore          7
        //    60: aload           5
        //    62: astore          6
        //    64: aload           5
        //    66: astore_1       
        //    67: aload           7
        //    69: ldc             "Unable to open: "
        //    71: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    74: aload           5
        //    76: astore          6
        //    78: aload           5
        //    80: astore_1       
        //    81: aload           7
        //    83: aload_0        
        //    84: getfield        cbm.b:Landroid/net/Uri;
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    90: pop            
        //    91: aload           5
        //    93: astore          6
        //    95: aload           5
        //    97: astore_1       
        //    98: ldc             "MediaRouteCtrlDialog"
        //   100: aload           7
        //   102: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   105: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   108: pop            
        //   109: aload           8
        //   111: astore_1       
        //   112: goto            696
        //   115: aload           5
        //   117: astore          6
        //   119: aload           5
        //   121: astore_1       
        //   122: new             Landroid/graphics/BitmapFactory$Options;
        //   125: astore          9
        //   127: aload           5
        //   129: astore          6
        //   131: aload           5
        //   133: astore_1       
        //   134: aload           9
        //   136: invokespecial   android/graphics/BitmapFactory$Options.<init>:()V
        //   139: aload           5
        //   141: astore          6
        //   143: aload           5
        //   145: astore_1       
        //   146: aload           9
        //   148: iconst_1       
        //   149: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   152: aload           5
        //   154: astore          6
        //   156: aload           5
        //   158: astore_1       
        //   159: aload           5
        //   161: aconst_null    
        //   162: aload           9
        //   164: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   167: pop            
        //   168: aload           5
        //   170: astore          6
        //   172: aload           5
        //   174: astore          7
        //   176: aload           5
        //   178: astore_1       
        //   179: aload           9
        //   181: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   184: ifeq            427
        //   187: aload           5
        //   189: astore          6
        //   191: aload           5
        //   193: astore_1       
        //   194: aload           9
        //   196: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   199: istore_3       
        //   200: iload_3        
        //   201: ifne            211
        //   204: aload           5
        //   206: astore          7
        //   208: goto            427
        //   211: aload           5
        //   213: astore_1       
        //   214: aload           5
        //   216: invokevirtual   java/io/InputStream.reset:()V
        //   219: goto            333
        //   222: astore_1       
        //   223: aload           5
        //   225: astore          6
        //   227: aload           5
        //   229: astore_1       
        //   230: aload           5
        //   232: invokevirtual   java/io/InputStream.close:()V
        //   235: aload           5
        //   237: astore          6
        //   239: aload           5
        //   241: astore_1       
        //   242: aload_0        
        //   243: aload_0        
        //   244: getfield        cbm.b:Landroid/net/Uri;
        //   247: invokespecial   cbm.a:(Landroid/net/Uri;)Ljava/io/InputStream;
        //   250: astore          7
        //   252: aload           7
        //   254: astore          5
        //   256: aload           7
        //   258: ifnonnull       333
        //   261: aload           7
        //   263: astore          6
        //   265: aload           7
        //   267: astore_1       
        //   268: new             Ljava/lang/StringBuilder;
        //   271: astore          5
        //   273: aload           7
        //   275: astore          6
        //   277: aload           7
        //   279: astore_1       
        //   280: aload           5
        //   282: ldc             "Unable to open: "
        //   284: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   287: aload           7
        //   289: astore          6
        //   291: aload           7
        //   293: astore_1       
        //   294: aload           5
        //   296: aload_0        
        //   297: getfield        cbm.b:Landroid/net/Uri;
        //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   303: pop            
        //   304: aload           7
        //   306: astore          6
        //   308: aload           7
        //   310: astore_1       
        //   311: ldc             "MediaRouteCtrlDialog"
        //   313: aload           5
        //   315: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   318: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   321: pop            
        //   322: aload           8
        //   324: astore_1       
        //   325: goto            696
        //   328: astore          5
        //   330: goto            499
        //   333: aload           5
        //   335: astore          6
        //   337: aload           5
        //   339: astore_1       
        //   340: aload           9
        //   342: iconst_0       
        //   343: putfield        android/graphics/BitmapFactory$Options.inJustDecodeBounds:Z
        //   346: aload           5
        //   348: astore          6
        //   350: aload           5
        //   352: astore_1       
        //   353: aload_0        
        //   354: getfield        cbm.c:Lcbr;
        //   357: aload           9
        //   359: getfield        android/graphics/BitmapFactory$Options.outWidth:I
        //   362: aload           9
        //   364: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   367: invokevirtual   cbr.g:(II)I
        //   370: istore_3       
        //   371: aload           5
        //   373: astore          6
        //   375: aload           5
        //   377: astore_1       
        //   378: aload           9
        //   380: iconst_1       
        //   381: aload           9
        //   383: getfield        android/graphics/BitmapFactory$Options.outHeight:I
        //   386: iload_3        
        //   387: idiv           
        //   388: invokestatic    java/lang/Integer.highestOneBit:(I)I
        //   391: invokestatic    java/lang/Math.max:(II)I
        //   394: putfield        android/graphics/BitmapFactory$Options.inSampleSize:I
        //   397: aload           5
        //   399: astore          6
        //   401: aload           5
        //   403: astore_1       
        //   404: aload_0        
        //   405: invokevirtual   cbm.isCancelled:()Z
        //   408: istore          4
        //   410: iload           4
        //   412: ifeq            438
        //   415: aload           8
        //   417: astore_1       
        //   418: aload           5
        //   420: ifnull          696
        //   423: aload           5
        //   425: astore          7
        //   427: aload           7
        //   429: invokevirtual   java/io/InputStream.close:()V
        //   432: aload           8
        //   434: astore_1       
        //   435: goto            696
        //   438: aload           5
        //   440: astore          6
        //   442: aload           5
        //   444: astore_1       
        //   445: aload           5
        //   447: aconst_null    
        //   448: aload           9
        //   450: invokestatic    android/graphics/BitmapFactory.decodeStream:(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
        //   453: astore          7
        //   455: aload           5
        //   457: ifnull          469
        //   460: aload           5
        //   462: invokevirtual   java/io/InputStream.close:()V
        //   465: goto            469
        //   468: astore_1       
        //   469: aload           7
        //   471: astore_1       
        //   472: goto            577
        //   475: astore          6
        //   477: aload_1        
        //   478: astore          5
        //   480: aload           6
        //   482: astore_1       
        //   483: goto            563
        //   486: astore_1       
        //   487: aload           6
        //   489: astore          5
        //   491: goto            563
        //   494: astore          5
        //   496: aconst_null    
        //   497: astore          6
        //   499: aload           6
        //   501: astore_1       
        //   502: new             Ljava/lang/StringBuilder;
        //   505: astore          7
        //   507: aload           6
        //   509: astore_1       
        //   510: aload           7
        //   512: ldc             "Unable to open: "
        //   514: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   517: aload           6
        //   519: astore_1       
        //   520: aload           7
        //   522: aload_0        
        //   523: getfield        cbm.b:Landroid/net/Uri;
        //   526: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   529: pop            
        //   530: aload           6
        //   532: astore_1       
        //   533: ldc             "MediaRouteCtrlDialog"
        //   535: aload           7
        //   537: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   540: aload           5
        //   542: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   545: pop            
        //   546: aload           6
        //   548: ifnull          575
        //   551: aload           6
        //   553: invokevirtual   java/io/InputStream.close:()V
        //   556: goto            575
        //   559: astore_1       
        //   560: goto            575
        //   563: aload           5
        //   565: ifnull          573
        //   568: aload           5
        //   570: invokevirtual   java/io/InputStream.close:()V
        //   573: aload_1        
        //   574: athrow         
        //   575: aconst_null    
        //   576: astore_1       
        //   577: aload_1        
        //   578: invokestatic    cbr.v:(Landroid/graphics/Bitmap;)Z
        //   581: ifeq            619
        //   584: new             Ljava/lang/StringBuilder;
        //   587: dup            
        //   588: ldc             "Can't use recycled bitmap: "
        //   590: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   593: aload_1        
        //   594: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   597: pop            
        //   598: ldc             "MediaRouteCtrlDialog"
        //   600: ldc             "Can't use recycled bitmap: "
        //   602: aload_1        
        //   603: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   606: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   609: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   612: pop            
        //   613: aload           8
        //   615: astore_1       
        //   616: goto            696
        //   619: aload_1        
        //   620: ifnull          696
        //   623: aload_1        
        //   624: invokevirtual   android/graphics/Bitmap.getWidth:()I
        //   627: aload_1        
        //   628: invokevirtual   android/graphics/Bitmap.getHeight:()I
        //   631: if_icmpge       696
        //   634: new             Lceb;
        //   637: dup            
        //   638: aload_1        
        //   639: invokespecial   ceb.<init>:(Landroid/graphics/Bitmap;)V
        //   642: astore          5
        //   644: aload           5
        //   646: iconst_1       
        //   647: putfield        ceb.a:I
        //   650: aload           5
        //   652: invokevirtual   ceb.b:()Lcee;
        //   655: astore          5
        //   657: aload           5
        //   659: invokevirtual   cee.d:()Ljava/util/List;
        //   662: invokeinterface java/util/List.isEmpty:()Z
        //   667: ifeq            673
        //   670: goto            691
        //   673: aload           5
        //   675: invokevirtual   cee.d:()Ljava/util/List;
        //   678: iconst_0       
        //   679: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   684: checkcast       Lced;
        //   687: getfield        ced.a:I
        //   690: istore_2       
        //   691: aload_0        
        //   692: iload_2        
        //   693: putfield        cbm.d:I
        //   696: aload_1        
        //   697: areturn        
        //   698: astore_1       
        //   699: aload           8
        //   701: astore_1       
        //   702: goto            696
        //   705: astore          5
        //   707: goto            573
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  36     43     494    499    Ljava/io/IOException;
        //  36     43     486    494    Any
        //  55     60     328    333    Ljava/io/IOException;
        //  55     60     475    486    Any
        //  67     74     328    333    Ljava/io/IOException;
        //  67     74     475    486    Any
        //  81     91     328    333    Ljava/io/IOException;
        //  81     91     475    486    Any
        //  98     109    328    333    Ljava/io/IOException;
        //  98     109    475    486    Any
        //  122    127    328    333    Ljava/io/IOException;
        //  122    127    475    486    Any
        //  134    139    328    333    Ljava/io/IOException;
        //  134    139    475    486    Any
        //  146    152    328    333    Ljava/io/IOException;
        //  146    152    475    486    Any
        //  159    168    328    333    Ljava/io/IOException;
        //  159    168    475    486    Any
        //  179    187    328    333    Ljava/io/IOException;
        //  179    187    475    486    Any
        //  194    200    328    333    Ljava/io/IOException;
        //  194    200    475    486    Any
        //  214    219    222    328    Ljava/io/IOException;
        //  214    219    475    486    Any
        //  230    235    328    333    Ljava/io/IOException;
        //  230    235    475    486    Any
        //  242    252    328    333    Ljava/io/IOException;
        //  242    252    475    486    Any
        //  268    273    328    333    Ljava/io/IOException;
        //  268    273    475    486    Any
        //  280    287    328    333    Ljava/io/IOException;
        //  280    287    475    486    Any
        //  294    304    328    333    Ljava/io/IOException;
        //  294    304    475    486    Any
        //  311    322    328    333    Ljava/io/IOException;
        //  311    322    475    486    Any
        //  340    346    328    333    Ljava/io/IOException;
        //  340    346    475    486    Any
        //  353    371    328    333    Ljava/io/IOException;
        //  353    371    475    486    Any
        //  378    397    328    333    Ljava/io/IOException;
        //  378    397    475    486    Any
        //  404    410    328    333    Ljava/io/IOException;
        //  404    410    475    486    Any
        //  427    432    698    705    Ljava/io/IOException;
        //  445    455    328    333    Ljava/io/IOException;
        //  445    455    475    486    Any
        //  460    465    468    469    Ljava/io/IOException;
        //  502    507    475    486    Any
        //  510    517    475    486    Any
        //  520    530    475    486    Any
        //  533    546    475    486    Any
        //  551    556    559    563    Ljava/io/IOException;
        //  568    573    705    710    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0427:
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
    
    protected final /* bridge */ void onPostExecute(final Object o) {
        final Bitmap i = (Bitmap)o;
        final cbr c = this.c;
        c.E = null;
        if (akq.b((Object)c.F, (Object)this.a) && akq.b((Object)this.c.G, (Object)this.b)) {
            return;
        }
        final cbr c2 = this.c;
        c2.F = this.a;
        c2.I = i;
        c2.G = this.b;
        c2.J = this.d;
        boolean b = true;
        c2.H = true;
        final long uptimeMillis = SystemClock.uptimeMillis();
        final long e = this.e;
        final cbr c3 = this.c;
        if (uptimeMillis - e <= 120L) {
            b = false;
        }
        c3.oz(b);
    }
    
    protected final void onPreExecute() {
        this.e = SystemClock.uptimeMillis();
        this.c.l();
    }
}
