import java.util.ArrayList;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import android.util.Log;
import java.util.List;
import android.content.SharedPreferences;
import android.content.Context;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.nio.channels.FileChannel;
import java.io.RandomAccessFile;
import java.io.File;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class au implements Closeable
{
    private final File a;
    private final long b;
    private final File c;
    private final RandomAccessFile d;
    private final FileChannel e;
    private final FileLock f;
    
    public au(File a, final File c) {
        ((File)a).getPath();
        c.getPath();
        this.a = (File)a;
        this.c = c;
        this.b = c((File)a);
        a = (Error)new File(c, "MultiDex.lock");
        final RandomAccessFile d = new RandomAccessFile((File)a, "rw");
        this.d = d;
        try {
            final FileChannel channel = d.getChannel();
            this.e = channel;
            try {
                ((File)a).getPath();
                this.f = channel.lock();
                ((File)a).getPath();
                return;
            }
            catch (final Error a) {}
            catch (final RuntimeException a) {}
            catch (final IOException ex) {}
            f(this.e);
            throw a;
        }
        catch (final Error a) {}
        catch (final RuntimeException a) {}
        catch (final IOException ex2) {}
        f(this.d);
        throw a;
    }
    
    private static long b(final File file) {
        long lastModified;
        if ((lastModified = file.lastModified()) == -1L) {
            lastModified = -2L;
        }
        return lastModified;
    }
    
    private static long c(File file) {
        file = (File)new RandomAccessFile(file, "r");
        try {
            long n = ((RandomAccessFile)file).length() - 22L;
            if (n < 0L) {
                final StringBuilder sb = new StringBuilder("File too short to be a zip file: ");
                sb.append(((RandomAccessFile)file).length());
                throw new ZipException(sb.toString());
            }
            long n2;
            if ((n2 = -65536L + n) < 0L) {
                n2 = 0L;
            }
            final int reverseBytes = Integer.reverseBytes(101010256);
            while (true) {
                ((RandomAccessFile)file).seek(n);
                if (((RandomAccessFile)file).readInt() == reverseBytes) {
                    ((RandomAccessFile)file).skipBytes(2);
                    ((RandomAccessFile)file).skipBytes(2);
                    ((RandomAccessFile)file).skipBytes(2);
                    ((RandomAccessFile)file).skipBytes(2);
                    long n3 = (long)Integer.reverseBytes(((RandomAccessFile)file).readInt()) & 0xFFFFFFFFL;
                    final long n4 = Integer.reverseBytes(((RandomAccessFile)file).readInt());
                    final CRC32 crc32 = new CRC32();
                    ((RandomAccessFile)file).seek(0xFFFFFFFFL & n4);
                    final int n5 = (int)Math.min(16384L, n3);
                    final byte[] array = new byte[16384];
                    for (int i = ((RandomAccessFile)file).read(array, 0, n5); i != -1; i = ((RandomAccessFile)file).read(array, 0, (int)Math.min(16384L, n3))) {
                        crc32.update(array, 0, i);
                        n3 -= i;
                        if (n3 == 0L) {
                            break;
                        }
                    }
                    final long value = crc32.getValue();
                    ((RandomAccessFile)file).close();
                    if (value == -1L) {
                        return -2L;
                    }
                    return value;
                }
                else {
                    --n;
                    if (n >= n2) {
                        continue;
                    }
                    throw new ZipException("End Of Central Directory signature not found");
                }
            }
        }
        finally {
            ((RandomAccessFile)file).close();
            while (true) {}
        }
    }
    
    private static SharedPreferences d(final Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }
    
    private final List e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_1       
        //     2: ldc             ".zip"
        //     4: astore_2       
        //     5: aload_1        
        //     6: getfield        au.a:Ljava/io/File;
        //     9: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    12: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    15: ldc             ".classes"
        //    17: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    20: astore_3       
        //    21: aload_1        
        //    22: getfield        au.c:Ljava/io/File;
        //    25: new             Ldyp;
        //    28: dup            
        //    29: iconst_1       
        //    30: invokespecial   dyp.<init>:(I)V
        //    33: invokevirtual   java/io/File.listFiles:(Ljava/io/FileFilter;)[Ljava/io/File;
        //    36: astore          4
        //    38: aload           4
        //    40: ifnonnull       89
        //    43: new             Ljava/lang/StringBuilder;
        //    46: dup            
        //    47: ldc             "Failed to list secondary dex dir content ("
        //    49: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    52: astore          4
        //    54: aload           4
        //    56: aload_1        
        //    57: getfield        au.c:Ljava/io/File;
        //    60: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //    63: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    66: pop            
        //    67: aload           4
        //    69: ldc             ")."
        //    71: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    74: pop            
        //    75: ldc             "MultiDex"
        //    77: aload           4
        //    79: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    82: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    85: pop            
        //    86: goto            165
        //    89: aload           4
        //    91: arraylength    
        //    92: istore          5
        //    94: iconst_0       
        //    95: istore          6
        //    97: iload           6
        //    99: iload           5
        //   101: if_icmpge       165
        //   104: aload           4
        //   106: iload           6
        //   108: aaload         
        //   109: astore          7
        //   111: aload           7
        //   113: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   116: pop            
        //   117: aload           7
        //   119: invokevirtual   java/io/File.length:()J
        //   122: pop2           
        //   123: aload           7
        //   125: invokevirtual   java/io/File.delete:()Z
        //   128: ifne            153
        //   131: ldc             "MultiDex"
        //   133: ldc             "Failed to delete old file "
        //   135: aload           7
        //   137: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   140: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   143: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   146: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   149: pop            
        //   150: goto            159
        //   153: aload           7
        //   155: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   158: pop            
        //   159: iinc            6, 1
        //   162: goto            97
        //   165: new             Ljava/util/ArrayList;
        //   168: dup            
        //   169: invokespecial   java/util/ArrayList.<init>:()V
        //   172: astore          7
        //   174: new             Ljava/util/zip/ZipFile;
        //   177: dup            
        //   178: aload_1        
        //   179: getfield        au.a:Ljava/io/File;
        //   182: invokespecial   java/util/zip/ZipFile.<init>:(Ljava/io/File;)V
        //   185: astore_1       
        //   186: aload_1        
        //   187: astore          4
        //   189: new             Ljava/lang/StringBuilder;
        //   192: astore          8
        //   194: aload_1        
        //   195: astore          4
        //   197: aload           8
        //   199: invokespecial   java/lang/StringBuilder.<init>:()V
        //   202: aload_1        
        //   203: astore          4
        //   205: aload           8
        //   207: ldc             "classes"
        //   209: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   212: pop            
        //   213: aload_1        
        //   214: astore          4
        //   216: aload           8
        //   218: iconst_2       
        //   219: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   222: pop            
        //   223: aload_1        
        //   224: astore          4
        //   226: aload           8
        //   228: ldc             ".dex"
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: pop            
        //   234: aload_1        
        //   235: astore          4
        //   237: aload_1        
        //   238: aload           8
        //   240: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   243: invokevirtual   java/util/zip/ZipFile.getEntry:(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
        //   246: astore          8
        //   248: iconst_2       
        //   249: istore          5
        //   251: aload           8
        //   253: ifnull          1106
        //   256: aload_1        
        //   257: astore          4
        //   259: new             Ljava/lang/StringBuilder;
        //   262: astore          9
        //   264: aload_1        
        //   265: astore          4
        //   267: aload           9
        //   269: invokespecial   java/lang/StringBuilder.<init>:()V
        //   272: aload_1        
        //   273: astore          4
        //   275: aload           9
        //   277: aload_3        
        //   278: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   281: pop            
        //   282: aload_1        
        //   283: astore          4
        //   285: aload           9
        //   287: iload           5
        //   289: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   292: pop            
        //   293: aload_1        
        //   294: astore          4
        //   296: aload           9
        //   298: aload_2        
        //   299: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   302: pop            
        //   303: aload_1        
        //   304: astore          4
        //   306: aload           9
        //   308: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   311: astore          10
        //   313: aload_1        
        //   314: astore          4
        //   316: new             Lat;
        //   319: astore          9
        //   321: aload_1        
        //   322: astore          4
        //   324: aload           9
        //   326: aload_0        
        //   327: getfield        au.c:Ljava/io/File;
        //   330: aload           10
        //   332: invokespecial   at.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   335: aload_1        
        //   336: astore          4
        //   338: aload           7
        //   340: aload           9
        //   342: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   347: pop            
        //   348: aload_1        
        //   349: astore          4
        //   351: new             Ljava/lang/StringBuilder;
        //   354: astore          10
        //   356: aload_1        
        //   357: astore          4
        //   359: aload           10
        //   361: invokespecial   java/lang/StringBuilder.<init>:()V
        //   364: aload_1        
        //   365: astore          4
        //   367: aload           10
        //   369: ldc             "Extraction is needed for file "
        //   371: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   374: pop            
        //   375: aload_1        
        //   376: astore          4
        //   378: aload           10
        //   380: aload           9
        //   382: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   385: pop            
        //   386: iconst_0       
        //   387: istore          11
        //   389: iconst_0       
        //   390: istore          6
        //   392: aload_2        
        //   393: astore          4
        //   395: iload           11
        //   397: iconst_3       
        //   398: if_icmpge       934
        //   401: iload           6
        //   403: ifne            931
        //   406: aload_1        
        //   407: aload           8
        //   409: invokevirtual   java/util/zip/ZipFile.getInputStream:(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
        //   412: astore          10
        //   414: ldc             "tmp-"
        //   416: aload_3        
        //   417: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   420: aload           4
        //   422: aload           9
        //   424: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //   427: invokestatic    java/io/File.createTempFile:(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
        //   430: astore_2       
        //   431: aload_2        
        //   432: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   435: pop            
        //   436: new             Ljava/util/zip/ZipOutputStream;
        //   439: astore          12
        //   441: new             Ljava/io/BufferedOutputStream;
        //   444: astore          13
        //   446: new             Ljava/io/FileOutputStream;
        //   449: astore          14
        //   451: aload           14
        //   453: aload_2        
        //   454: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   457: aload           13
        //   459: aload           14
        //   461: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   464: aload           12
        //   466: aload           13
        //   468: invokespecial   java/util/zip/ZipOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   471: new             Ljava/util/zip/ZipEntry;
        //   474: astore          13
        //   476: aload           13
        //   478: ldc_w           "classes.dex"
        //   481: invokespecial   java/util/zip/ZipEntry.<init>:(Ljava/lang/String;)V
        //   484: aload           13
        //   486: aload           8
        //   488: invokevirtual   java/util/zip/ZipEntry.getTime:()J
        //   491: invokevirtual   java/util/zip/ZipEntry.setTime:(J)V
        //   494: aload           12
        //   496: aload           13
        //   498: invokevirtual   java/util/zip/ZipOutputStream.putNextEntry:(Ljava/util/zip/ZipEntry;)V
        //   501: sipush          16384
        //   504: newarray        B
        //   506: astore          13
        //   508: aload           10
        //   510: aload           13
        //   512: invokevirtual   java/io/InputStream.read:([B)I
        //   515: istore          6
        //   517: iload           6
        //   519: iconst_m1      
        //   520: if_icmpeq       545
        //   523: aload           12
        //   525: aload           13
        //   527: iconst_0       
        //   528: iload           6
        //   530: invokevirtual   java/util/zip/ZipOutputStream.write:([BII)V
        //   533: aload           10
        //   535: aload           13
        //   537: invokevirtual   java/io/InputStream.read:([B)I
        //   540: istore          6
        //   542: goto            517
        //   545: aload           12
        //   547: invokevirtual   java/util/zip/ZipOutputStream.closeEntry:()V
        //   550: aload           12
        //   552: invokevirtual   java/util/zip/ZipOutputStream.close:()V
        //   555: aload_2        
        //   556: invokevirtual   java/io/File.setReadOnly:()Z
        //   559: ifeq            810
        //   562: aload           9
        //   564: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   567: pop            
        //   568: aload_2        
        //   569: aload           9
        //   571: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   574: istore          15
        //   576: iload           15
        //   578: ifeq            734
        //   581: aload           10
        //   583: invokestatic    au.f:(Ljava/io/Closeable;)V
        //   586: aload_2        
        //   587: invokevirtual   java/io/File.delete:()Z
        //   590: pop            
        //   591: aload           9
        //   593: aload           9
        //   595: invokestatic    au.c:(Ljava/io/File;)J
        //   598: putfield        at.a:J
        //   601: iconst_1       
        //   602: istore          6
        //   604: goto            653
        //   607: astore_2       
        //   608: new             Ljava/lang/StringBuilder;
        //   611: astore          10
        //   613: aload           10
        //   615: invokespecial   java/lang/StringBuilder.<init>:()V
        //   618: aload           10
        //   620: ldc_w           "Failed to read crc from "
        //   623: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   626: pop            
        //   627: aload           10
        //   629: aload           9
        //   631: invokevirtual   at.getAbsolutePath:()Ljava/lang/String;
        //   634: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   637: pop            
        //   638: ldc             "MultiDex"
        //   640: aload           10
        //   642: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   645: aload_2        
        //   646: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   649: pop            
        //   650: iconst_0       
        //   651: istore          6
        //   653: aload           9
        //   655: invokevirtual   at.getAbsolutePath:()Ljava/lang/String;
        //   658: pop            
        //   659: aload           9
        //   661: invokevirtual   at.length:()J
        //   664: pop2           
        //   665: iload           6
        //   667: ifne            728
        //   670: aload           9
        //   672: invokevirtual   at.delete:()Z
        //   675: pop            
        //   676: aload           9
        //   678: invokevirtual   at.exists:()Z
        //   681: ifeq            728
        //   684: new             Ljava/lang/StringBuilder;
        //   687: astore_2       
        //   688: aload_2        
        //   689: invokespecial   java/lang/StringBuilder.<init>:()V
        //   692: aload_2        
        //   693: ldc_w           "Failed to delete corrupted secondary dex '"
        //   696: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   699: pop            
        //   700: aload_2        
        //   701: aload           9
        //   703: invokevirtual   at.getPath:()Ljava/lang/String;
        //   706: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   709: pop            
        //   710: aload_2        
        //   711: ldc_w           "'"
        //   714: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   717: pop            
        //   718: ldc             "MultiDex"
        //   720: aload_2        
        //   721: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   724: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   727: pop            
        //   728: iinc            11, 1
        //   731: goto            395
        //   734: new             Ljava/io/IOException;
        //   737: astore          4
        //   739: new             Ljava/lang/StringBuilder;
        //   742: astore          7
        //   744: aload           7
        //   746: invokespecial   java/lang/StringBuilder.<init>:()V
        //   749: aload           7
        //   751: ldc_w           "Failed to rename \""
        //   754: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   757: pop            
        //   758: aload           7
        //   760: aload_2        
        //   761: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   764: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   767: pop            
        //   768: aload           7
        //   770: ldc_w           "\" to \""
        //   773: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   776: pop            
        //   777: aload           7
        //   779: aload           9
        //   781: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   784: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   787: pop            
        //   788: aload           7
        //   790: ldc_w           "\""
        //   793: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   796: pop            
        //   797: aload           4
        //   799: aload           7
        //   801: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   804: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   807: aload           4
        //   809: athrow         
        //   810: new             Ljava/io/IOException;
        //   813: astore          7
        //   815: new             Ljava/lang/StringBuilder;
        //   818: astore          4
        //   820: aload           4
        //   822: invokespecial   java/lang/StringBuilder.<init>:()V
        //   825: aload           4
        //   827: ldc_w           "Failed to mark readonly \""
        //   830: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   833: pop            
        //   834: aload           4
        //   836: aload_2        
        //   837: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   840: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   843: pop            
        //   844: aload           4
        //   846: ldc_w           "\" (tmp of \""
        //   849: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   852: pop            
        //   853: aload           4
        //   855: aload           9
        //   857: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   860: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   863: pop            
        //   864: aload           4
        //   866: ldc_w           "\")"
        //   869: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   872: pop            
        //   873: aload           7
        //   875: aload           4
        //   877: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   880: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   883: aload           7
        //   885: athrow         
        //   886: astore          4
        //   888: goto            893
        //   891: astore          4
        //   893: aload           12
        //   895: invokevirtual   java/util/zip/ZipOutputStream.close:()V
        //   898: aload           4
        //   900: athrow         
        //   901: astore          4
        //   903: goto            908
        //   906: astore          4
        //   908: aload           10
        //   910: invokestatic    au.f:(Ljava/io/Closeable;)V
        //   913: aload_2        
        //   914: invokevirtual   java/io/File.delete:()Z
        //   917: pop            
        //   918: aload           4
        //   920: athrow         
        //   921: astore          4
        //   923: goto            1136
        //   926: astore          4
        //   928: goto            1136
        //   931: goto            939
        //   934: iload           6
        //   936: ifeq            1002
        //   939: iinc            5, 1
        //   942: new             Ljava/lang/StringBuilder;
        //   945: astore_2       
        //   946: aload_2        
        //   947: invokespecial   java/lang/StringBuilder.<init>:()V
        //   950: aload_2        
        //   951: ldc             "classes"
        //   953: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   956: pop            
        //   957: aload_2        
        //   958: iload           5
        //   960: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   963: pop            
        //   964: aload_2        
        //   965: ldc             ".dex"
        //   967: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   970: pop            
        //   971: aload_2        
        //   972: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   975: astore          8
        //   977: aload_1        
        //   978: astore_2       
        //   979: aload_2        
        //   980: astore_1       
        //   981: aload_2        
        //   982: aload           8
        //   984: invokevirtual   java/util/zip/ZipFile.getEntry:(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
        //   987: astore          8
        //   989: aload_2        
        //   990: astore_1       
        //   991: aload           4
        //   993: astore_2       
        //   994: goto            251
        //   997: astore          4
        //   999: goto            1136
        //  1002: aload_1        
        //  1003: astore          4
        //  1005: aload           4
        //  1007: astore_1       
        //  1008: new             Ljava/io/IOException;
        //  1011: astore          7
        //  1013: aload           4
        //  1015: astore_1       
        //  1016: new             Ljava/lang/StringBuilder;
        //  1019: astore_2       
        //  1020: aload           4
        //  1022: astore_1       
        //  1023: aload_2        
        //  1024: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1027: aload           4
        //  1029: astore_1       
        //  1030: aload_2        
        //  1031: ldc_w           "Could not create zip file "
        //  1034: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1037: pop            
        //  1038: aload           4
        //  1040: astore_1       
        //  1041: aload_2        
        //  1042: aload           9
        //  1044: invokevirtual   at.getAbsolutePath:()Ljava/lang/String;
        //  1047: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1050: pop            
        //  1051: aload           4
        //  1053: astore_1       
        //  1054: aload_2        
        //  1055: ldc_w           " for secondary dex ("
        //  1058: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1061: pop            
        //  1062: aload           4
        //  1064: astore_1       
        //  1065: aload_2        
        //  1066: iload           5
        //  1068: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1071: pop            
        //  1072: aload           4
        //  1074: astore_1       
        //  1075: aload_2        
        //  1076: ldc_w           ")"
        //  1079: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1082: pop            
        //  1083: aload           4
        //  1085: astore_1       
        //  1086: aload           7
        //  1088: aload_2        
        //  1089: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1092: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1095: aload           4
        //  1097: astore_1       
        //  1098: aload           7
        //  1100: athrow         
        //  1101: astore          4
        //  1103: goto            1136
        //  1106: aload_1        
        //  1107: invokevirtual   java/util/zip/ZipFile.close:()V
        //  1110: goto            1124
        //  1113: astore_1       
        //  1114: ldc             "MultiDex"
        //  1116: ldc_w           "Failed to close resource"
        //  1119: aload_1        
        //  1120: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1123: pop            
        //  1124: aload           7
        //  1126: areturn        
        //  1127: astore          7
        //  1129: aload           4
        //  1131: astore_1       
        //  1132: aload           7
        //  1134: astore          4
        //  1136: aload_1        
        //  1137: invokevirtual   java/util/zip/ZipFile.close:()V
        //  1140: goto            1154
        //  1143: astore_1       
        //  1144: ldc             "MultiDex"
        //  1146: ldc_w           "Failed to close resource"
        //  1149: aload_1        
        //  1150: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1153: pop            
        //  1154: goto            1160
        //  1157: aload           4
        //  1159: athrow         
        //  1160: goto            1157
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  189    194    1127   1136   Any
        //  197    202    1127   1136   Any
        //  205    213    1127   1136   Any
        //  216    223    1127   1136   Any
        //  226    234    1127   1136   Any
        //  237    248    1127   1136   Any
        //  259    264    1127   1136   Any
        //  267    272    1127   1136   Any
        //  275    282    1127   1136   Any
        //  285    293    1127   1136   Any
        //  296    303    1127   1136   Any
        //  306    313    1127   1136   Any
        //  316    321    1127   1136   Any
        //  324    335    1127   1136   Any
        //  338    348    1127   1136   Any
        //  351    356    1127   1136   Any
        //  359    364    1127   1136   Any
        //  367    375    1127   1136   Any
        //  378    386    1127   1136   Any
        //  406    436    926    931    Any
        //  436    471    906    908    Any
        //  471    484    891    893    Any
        //  484    517    886    891    Any
        //  523    542    886    891    Any
        //  545    550    886    891    Any
        //  550    576    901    906    Any
        //  581    591    921    926    Any
        //  591    601    607    653    Ljava/io/IOException;
        //  591    601    921    926    Any
        //  608    650    921    926    Any
        //  653    665    921    926    Any
        //  670    728    921    926    Any
        //  734    810    901    906    Any
        //  810    886    901    906    Any
        //  893    901    901    906    Any
        //  908    921    921    926    Any
        //  942    977    997    1002   Any
        //  981    989    1101   1106   Any
        //  1008   1013   1101   1106   Any
        //  1016   1020   1101   1106   Any
        //  1023   1027   1101   1106   Any
        //  1030   1038   1101   1106   Any
        //  1041   1051   1101   1106   Any
        //  1054   1062   1101   1106   Any
        //  1065   1072   1101   1106   Any
        //  1075   1083   1101   1106   Any
        //  1086   1095   1101   1106   Any
        //  1098   1101   1101   1106   Any
        //  1106   1110   1113   1124   Ljava/io/IOException;
        //  1136   1140   1143   1154   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0653:
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
    
    private static void f(final Closeable closeable) {
        try {
            closeable.close();
        }
        catch (final IOException ex) {
            Log.w("MultiDex", "Failed to close resource", (Throwable)ex);
        }
    }
    
    private static void g(final Context context, final long n, final long n2, final List list) {
        final SharedPreferences$Editor edit = d(context).edit();
        edit.putLong("timestamp", n);
        edit.putLong("crc", n2);
        edit.putInt("dex.number", list.size() + 1);
        final Iterator iterator = list.iterator();
        int n3 = 2;
        while (iterator.hasNext()) {
            final at at = (at)iterator.next();
            final StringBuilder sb = new StringBuilder("dex.crc.");
            sb.append(n3);
            edit.putLong(sb.toString(), at.a);
            final StringBuilder sb2 = new StringBuilder("dex.time.");
            sb2.append(n3);
            edit.putLong(sb2.toString(), at.lastModified());
            ++n3;
        }
        edit.commit();
    }
    
    public final List a(final Context context, final boolean b) {
        this.a.getPath();
        if (this.f.isValid()) {
            List list2 = null;
            Label_0598: {
                if (!b) {
                    final File a = this.a;
                    final long b2 = this.b;
                    final SharedPreferences d = d(context);
                    if (d.getLong("timestamp", -1L) == b(a)) {
                        if (d.getLong("crc", -1L) == b2) {
                            try {
                                final String concat = String.valueOf(this.a.getName()).concat(".classes");
                                final SharedPreferences d2 = d(context);
                                final int int1 = d2.getInt("dex.number", 1);
                                final ArrayList list = new ArrayList(int1 - 1);
                                int n = 2;
                                while (true) {
                                    list2 = list;
                                    if (n > int1) {
                                        break Label_0598;
                                    }
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(concat);
                                    sb.append(n);
                                    sb.append(".zip");
                                    final at at = new at(this.c, sb.toString());
                                    if (!at.isFile()) {
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Missing extracted secondary dex file '");
                                        sb2.append(at.getPath());
                                        sb2.append("'");
                                        throw new IOException(sb2.toString());
                                    }
                                    at.a = c((File)at);
                                    final StringBuilder sb3 = new StringBuilder();
                                    sb3.append("");
                                    sb3.append("dex.crc.");
                                    sb3.append(n);
                                    final long long1 = d2.getLong(sb3.toString(), -1L);
                                    final StringBuilder sb4 = new StringBuilder();
                                    sb4.append("");
                                    sb4.append("dex.time.");
                                    sb4.append(n);
                                    final long long2 = d2.getLong(sb4.toString(), -1L);
                                    final long lastModified = at.lastModified();
                                    if (long2 != lastModified || long1 != at.a) {
                                        final StringBuilder sb5 = new StringBuilder();
                                        sb5.append("Invalid extracted dex: ");
                                        sb5.append(at);
                                        sb5.append(" (key \"");
                                        sb5.append("");
                                        sb5.append("\"), expected modification time: ");
                                        sb5.append(long2);
                                        sb5.append(", modification time: ");
                                        sb5.append(lastModified);
                                        sb5.append(", expected crc: ");
                                        sb5.append(long1);
                                        sb5.append(", file crc: ");
                                        sb5.append(at.a);
                                        throw new IOException(sb5.toString());
                                    }
                                    list.add((Object)at);
                                    ++n;
                                }
                            }
                            catch (final IOException ex) {
                                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", (Throwable)ex);
                                list2 = this.e();
                                g(context, b(this.a), this.b, list2);
                                break Label_0598;
                            }
                        }
                    }
                }
                list2 = this.e();
                g(context, b(this.a), this.b, list2);
            }
            list2.size();
            return list2;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
    
    @Override
    public final void close() {
        this.f.release();
        this.e.close();
        this.d.close();
    }
}
