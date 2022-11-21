import java.io.InputStream;
import org.json.JSONException;
import java.io.Reader;
import android.util.JsonReader;
import java.io.InputStreamReader;
import android.net.TrafficStats;
import java.net.MalformedURLException;
import org.json.JSONObject;
import java.net.URLConnection;
import java.security.MessageDigest;
import android.content.pm.PackageInfo;
import java.io.IOException;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.concurrent.ExecutionException;
import android.util.Log;
import java.net.HttpURLConnection;
import java.net.URL;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agno
{
    private static final Pattern a;
    private static final Charset b;
    private final Context c;
    private final agmy d;
    private final agnq e;
    
    static {
        a = Pattern.compile("[0-9]+s");
        b = Charset.forName("UTF-8");
    }
    
    public agno(final Context c, final agmy d) {
        this.c = c;
        this.d = d;
        this.e = new agnq();
    }
    
    static long a(final String s) {
        kht.aN(agno.a.matcher(s).matches(), (Object)"Invalid Expiration Timestamp.");
        if (s != null && s.length() != 0) {
            return Long.parseLong(s.substring(0, s.length() - 1));
        }
        return 0L;
    }
    
    private final HttpURLConnection d(final URL url, final String s) {
        try {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            int i = 0;
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.c.getPackageName());
            final agmk agmk = (agmk)this.d.a();
            if (agmk != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String)nom.f(agmk.a()));
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", (Throwable)ex);
                }
                catch (final ExecutionException ex2) {
                    Log.w("ContentValues", "Failed to get heartbeats header", (Throwable)ex2);
                }
            }
            final String s2 = null;
            String string;
            try {
                final Context c = this.c;
                final PackageInfo f = mwh.b(c).f(c.getPackageName(), 64);
                byte[] digest = null;
                Label_0230: {
                    if (f.signatures != null && f.signatures.length == 1) {
                        final MessageDigest a = mvx.a("SHA1");
                        if (a != null) {
                            digest = a.digest(f.signatures[0].toByteArray());
                            break Label_0230;
                        }
                    }
                    digest = null;
                }
                if (digest == null) {
                    final String packageName = this.c.getPackageName();
                    final StringBuilder sb = new StringBuilder("Could not get fingerprint hash for package: ");
                    sb.append(packageName);
                    Log.e("ContentValues", sb.toString());
                    string = s2;
                }
                else {
                    final int length = digest.length;
                    final StringBuilder sb2 = new StringBuilder(length + length);
                    while (i < length) {
                        sb2.append(mwa.a[(digest[i] & 0xF0) >>> 4]);
                        sb2.append(mwa.a[digest[i] & 0xF]);
                        ++i;
                    }
                    string = sb2.toString();
                }
            }
            catch (final PackageManager$NameNotFoundException ex3) {
                Log.e("ContentValues", "No such package: ".concat(String.valueOf(this.c.getPackageName())), (Throwable)ex3);
                string = s2;
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string);
            httpURLConnection.addRequestProperty("x-goog-api-key", s);
            return httpURLConnection;
        }
        catch (final IOException ex4) {
            throw new agnc("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
    
    private static void e() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }
    
    private static void f(final HttpURLConnection p0, final String p1, final String p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //     4: astore          6
        //     6: aconst_null    
        //     7: astore          5
        //     9: aconst_null    
        //    10: astore          4
        //    12: aload           6
        //    14: ifnonnull       23
        //    17: aload           5
        //    19: astore_0       
        //    20: goto            139
        //    23: new             Ljava/io/BufferedReader;
        //    26: dup            
        //    27: new             Ljava/io/InputStreamReader;
        //    30: dup            
        //    31: aload           6
        //    33: getstatic       agno.b:Ljava/nio/charset/Charset;
        //    36: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //    39: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    42: astore          5
        //    44: new             Ljava/lang/StringBuilder;
        //    47: astore          6
        //    49: aload           6
        //    51: invokespecial   java/lang/StringBuilder.<init>:()V
        //    54: aload           5
        //    56: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    59: astore          7
        //    61: aload           7
        //    63: ifnull          85
        //    66: aload           6
        //    68: aload           7
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    73: pop            
        //    74: aload           6
        //    76: bipush          10
        //    78: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    81: pop            
        //    82: goto            54
        //    85: ldc_w           "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
        //    88: iconst_3       
        //    89: anewarray       Ljava/lang/Object;
        //    92: dup            
        //    93: iconst_0       
        //    94: aload_0        
        //    95: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    98: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   101: aastore        
        //   102: dup            
        //   103: iconst_1       
        //   104: aload_0        
        //   105: invokevirtual   java/net/HttpURLConnection.getResponseMessage:()Ljava/lang/String;
        //   108: aastore        
        //   109: dup            
        //   110: iconst_2       
        //   111: aload           6
        //   113: aastore        
        //   114: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   117: astore_0       
        //   118: aload           5
        //   120: invokevirtual   java/io/BufferedReader.close:()V
        //   123: goto            139
        //   126: astore          4
        //   128: goto            139
        //   131: astore_0       
        //   132: aload           5
        //   134: invokevirtual   java/io/BufferedReader.close:()V
        //   137: aload_0        
        //   138: athrow         
        //   139: aload_0        
        //   140: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   143: ifne            208
        //   146: ldc_w           "Firebase-Installations"
        //   149: aload_0        
        //   150: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   153: pop            
        //   154: aload_1        
        //   155: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   158: ifeq            168
        //   161: ldc_w           ""
        //   164: astore_0       
        //   165: goto            179
        //   168: ldc_w           ", "
        //   171: aload_1        
        //   172: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   175: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   178: astore_0       
        //   179: ldc_w           "Firebase-Installations"
        //   182: ldc_w           "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
        //   185: iconst_3       
        //   186: anewarray       Ljava/lang/Object;
        //   189: dup            
        //   190: iconst_0       
        //   191: aload_2        
        //   192: aastore        
        //   193: dup            
        //   194: iconst_1       
        //   195: aload_3        
        //   196: aastore        
        //   197: dup            
        //   198: iconst_2       
        //   199: aload_0        
        //   200: aastore        
        //   201: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   204: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   207: pop            
        //   208: return         
        //   209: astore_0       
        //   210: aload           4
        //   212: astore_0       
        //   213: goto            118
        //   216: astore_1       
        //   217: goto            137
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  44     54     209    216    Ljava/io/IOException;
        //  44     54     131    139    Any
        //  54     61     209    216    Ljava/io/IOException;
        //  54     61     131    139    Any
        //  66     82     209    216    Ljava/io/IOException;
        //  66     82     131    139    Any
        //  85     118    209    216    Ljava/io/IOException;
        //  85     118    131    139    Any
        //  118    123    126    131    Ljava/io/IOException;
        //  132    137    216    220    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0137:
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
    
    private static void g(final URLConnection p0, final byte[] p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/net/URLConnection.getOutputStream:()Ljava/io/OutputStream;
        //     4: astore_0       
        //     5: aload_0        
        //     6: ifnull          43
        //     9: new             Ljava/util/zip/GZIPOutputStream;
        //    12: dup            
        //    13: aload_0        
        //    14: invokespecial   java/util/zip/GZIPOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    17: astore_2       
        //    18: aload_2        
        //    19: aload_1        
        //    20: invokevirtual   java/util/zip/GZIPOutputStream.write:([B)V
        //    23: aload_2        
        //    24: invokevirtual   java/util/zip/GZIPOutputStream.close:()V
        //    27: aload_0        
        //    28: invokevirtual   java/io/OutputStream.close:()V
        //    31: return         
        //    32: astore_1       
        //    33: aload_2        
        //    34: invokevirtual   java/util/zip/GZIPOutputStream.close:()V
        //    37: aload_0        
        //    38: invokevirtual   java/io/OutputStream.close:()V
        //    41: aload_1        
        //    42: athrow         
        //    43: new             Ljava/io/IOException;
        //    46: dup            
        //    47: ldc_w           "Cannot send request to FIS servers. No OutputStream available."
        //    50: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    53: athrow         
        //    54: astore_0       
        //    55: goto            31
        //    58: astore_0       
        //    59: goto            41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  18     23     32     43     Any
        //  23     31     54     58     Ljava/io/IOException;
        //  33     41     58     62     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 34, Size: 34
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
    
    private static boolean h(final int n) {
        return n >= 200 && n < 300;
    }
    
    private static byte[] i(final JSONObject jsonObject) {
        return jsonObject.toString().getBytes("UTF-8");
    }
    
    private static final URL j(final String s) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", s));
        }
        catch (final MalformedURLException ex) {
            throw new agnc(ex.getMessage());
        }
    }
    
    public final agnp b(final String p0, final String p1, final String p2, final String p3, final String p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          10
        //     5: aload_0        
        //     6: getfield        agno.e:Lagnq;
        //     9: invokevirtual   agnq.b:()Z
        //    12: istore          8
        //    14: ldc_w           "Firebase Installations Service is unavailable. Please try again later."
        //    17: astore          9
        //    19: iload           8
        //    21: ifeq            974
        //    24: iconst_0       
        //    25: istore          6
        //    27: ldc_w           "projects/%s/installations"
        //    30: iconst_1       
        //    31: anewarray       Ljava/lang/Object;
        //    34: dup            
        //    35: iconst_0       
        //    36: aload_3        
        //    37: aastore        
        //    38: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    41: invokestatic    agno.j:(Ljava/lang/String;)Ljava/net/URL;
        //    44: astore          15
        //    46: iload           6
        //    48: iconst_1       
        //    49: if_icmpgt       964
        //    52: ldc_w           32769
        //    55: invokestatic    android/net/TrafficStats.setThreadStatsTag:(I)V
        //    58: aload_0        
        //    59: aload           15
        //    61: aload_1        
        //    62: invokespecial   agno.d:(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
        //    65: astore          20
        //    67: aload           20
        //    69: ldc_w           "POST"
        //    72: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //    75: aload           20
        //    77: iconst_1       
        //    78: invokevirtual   java/net/HttpURLConnection.setDoOutput:(Z)V
        //    81: aload           5
        //    83: ifnull          96
        //    86: aload           20
        //    88: ldc_w           "x-goog-fis-android-iid-migration-auth"
        //    91: aload           5
        //    93: invokevirtual   java/net/HttpURLConnection.addRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //    96: new             Lorg/json/JSONObject;
        //    99: astore          11
        //   101: aload           11
        //   103: invokespecial   org/json/JSONObject.<init>:()V
        //   106: aload           11
        //   108: aload           10
        //   110: aload_2        
        //   111: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   114: pop            
        //   115: aload           11
        //   117: ldc_w           "appId"
        //   120: aload           4
        //   122: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   125: pop            
        //   126: aload           11
        //   128: ldc_w           "authVersion"
        //   131: ldc_w           "FIS_v2"
        //   134: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   137: pop            
        //   138: aload           11
        //   140: ldc_w           "sdkVersion"
        //   143: ldc_w           "a:17.0.2_1p"
        //   146: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   149: pop            
        //   150: aload           20
        //   152: aload           11
        //   154: invokestatic    agno.i:(Lorg/json/JSONObject;)[B
        //   157: invokestatic    agno.g:(Ljava/net/URLConnection;[B)V
        //   160: aload           20
        //   162: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   165: istore          7
        //   167: aload_0        
        //   168: getfield        agno.e:Lagnq;
        //   171: iload           7
        //   173: invokevirtual   agnq.a:(I)V
        //   176: iload           7
        //   178: invokestatic    agno.h:(I)Z
        //   181: ifeq            729
        //   184: aload           20
        //   186: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //   189: astore          22
        //   191: new             Landroid/util/JsonReader;
        //   194: astore          21
        //   196: new             Ljava/io/InputStreamReader;
        //   199: astore          11
        //   201: aload           11
        //   203: aload           22
        //   205: getstatic       agno.b:Ljava/nio/charset/Charset;
        //   208: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //   211: aload           21
        //   213: aload           11
        //   215: invokespecial   android/util/JsonReader.<init>:(Ljava/io/Reader;)V
        //   218: invokestatic    agns.a:()Lagnr;
        //   221: astore          23
        //   223: aload           21
        //   225: invokevirtual   android/util/JsonReader.beginObject:()V
        //   228: aconst_null    
        //   229: astore          18
        //   231: aconst_null    
        //   232: astore          17
        //   234: aconst_null    
        //   235: astore          19
        //   237: aconst_null    
        //   238: astore          16
        //   240: aload           10
        //   242: astore          14
        //   244: aload           9
        //   246: astore          13
        //   248: aload           21
        //   250: invokevirtual   android/util/JsonReader.hasNext:()Z
        //   253: ifeq            634
        //   256: aload           10
        //   258: astore          14
        //   260: aload           9
        //   262: astore          13
        //   264: aload           21
        //   266: invokevirtual   android/util/JsonReader.nextName:()Ljava/lang/String;
        //   269: astore          11
        //   271: aload           10
        //   273: astore          14
        //   275: aload           9
        //   277: astore          13
        //   279: aload           11
        //   281: ldc_w           "name"
        //   284: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   287: ifeq            308
        //   290: aload           10
        //   292: astore          14
        //   294: aload           9
        //   296: astore          13
        //   298: aload           21
        //   300: invokevirtual   android/util/JsonReader.nextString:()Ljava/lang/String;
        //   303: astore          16
        //   305: goto            240
        //   308: aload           10
        //   310: astore          14
        //   312: aload           9
        //   314: astore          13
        //   316: aload           11
        //   318: aload           10
        //   320: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   323: ifeq            344
        //   326: aload           10
        //   328: astore          14
        //   330: aload           9
        //   332: astore          13
        //   334: aload           21
        //   336: invokevirtual   android/util/JsonReader.nextString:()Ljava/lang/String;
        //   339: astore          18
        //   341: goto            305
        //   344: aload           10
        //   346: astore          14
        //   348: aload           9
        //   350: astore          13
        //   352: aload           11
        //   354: ldc_w           "refreshToken"
        //   357: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   360: ifeq            381
        //   363: aload           10
        //   365: astore          14
        //   367: aload           9
        //   369: astore          13
        //   371: aload           21
        //   373: invokevirtual   android/util/JsonReader.nextString:()Ljava/lang/String;
        //   376: astore          17
        //   378: goto            305
        //   381: aload           10
        //   383: astore          14
        //   385: aload           9
        //   387: astore          13
        //   389: aload           11
        //   391: ldc_w           "authToken"
        //   394: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   397: ifeq            598
        //   400: aload           10
        //   402: astore          14
        //   404: aload           9
        //   406: astore          13
        //   408: aload           21
        //   410: invokevirtual   android/util/JsonReader.beginObject:()V
        //   413: aload           9
        //   415: astore          11
        //   417: aload           10
        //   419: astore          12
        //   421: aload           12
        //   423: astore          14
        //   425: aload           11
        //   427: astore          13
        //   429: aload           21
        //   431: invokevirtual   android/util/JsonReader.hasNext:()Z
        //   434: ifeq            563
        //   437: aload           12
        //   439: astore          14
        //   441: aload           11
        //   443: astore          13
        //   445: aload           21
        //   447: invokevirtual   android/util/JsonReader.nextName:()Ljava/lang/String;
        //   450: astore          9
        //   452: aload           12
        //   454: astore          14
        //   456: aload           11
        //   458: astore          13
        //   460: aload           9
        //   462: ldc_w           "token"
        //   465: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   468: ifeq            492
        //   471: aload           12
        //   473: astore          14
        //   475: aload           11
        //   477: astore          13
        //   479: aload           23
        //   481: aload           21
        //   483: invokevirtual   android/util/JsonReader.nextString:()Ljava/lang/String;
        //   486: putfield        agnr.a:Ljava/lang/String;
        //   489: goto            421
        //   492: aload           12
        //   494: astore          14
        //   496: aload           11
        //   498: astore          13
        //   500: aload           9
        //   502: ldc_w           "expiresIn"
        //   505: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   508: ifeq            547
        //   511: aload           12
        //   513: astore          14
        //   515: aload           11
        //   517: astore          13
        //   519: aload           21
        //   521: invokevirtual   android/util/JsonReader.nextString:()Ljava/lang/String;
        //   524: astore          19
        //   526: aload           12
        //   528: astore          9
        //   530: aload           11
        //   532: astore          10
        //   534: aload           23
        //   536: aload           19
        //   538: invokestatic    agno.a:(Ljava/lang/String;)J
        //   541: invokevirtual   agnr.b:(J)V
        //   544: goto            560
        //   547: aload           12
        //   549: astore          9
        //   551: aload           11
        //   553: astore          10
        //   555: aload           21
        //   557: invokevirtual   android/util/JsonReader.skipValue:()V
        //   560: goto            421
        //   563: aload           12
        //   565: astore          9
        //   567: aload           11
        //   569: astore          10
        //   571: aload           23
        //   573: invokevirtual   agnr.a:()Lagns;
        //   576: astore          19
        //   578: aload           12
        //   580: astore          9
        //   582: aload           11
        //   584: astore          10
        //   586: aload           21
        //   588: invokevirtual   android/util/JsonReader.endObject:()V
        //   591: aload           11
        //   593: astore          9
        //   595: goto            627
        //   598: aload           10
        //   600: astore          11
        //   602: aload           9
        //   604: astore          12
        //   606: aload           11
        //   608: astore          9
        //   610: aload           12
        //   612: astore          10
        //   614: aload           21
        //   616: invokevirtual   android/util/JsonReader.skipValue:()V
        //   619: aload           12
        //   621: astore          9
        //   623: aload           11
        //   625: astore          12
        //   627: aload           12
        //   629: astore          10
        //   631: goto            240
        //   634: aload           10
        //   636: astore          12
        //   638: aload           9
        //   640: astore          11
        //   642: aload           12
        //   644: astore          9
        //   646: aload           11
        //   648: astore          10
        //   650: aload           21
        //   652: invokevirtual   android/util/JsonReader.endObject:()V
        //   655: aload           12
        //   657: astore          9
        //   659: aload           11
        //   661: astore          10
        //   663: aload           21
        //   665: invokevirtual   android/util/JsonReader.close:()V
        //   668: aload           12
        //   670: astore          9
        //   672: aload           11
        //   674: astore          10
        //   676: aload           22
        //   678: invokevirtual   java/io/InputStream.close:()V
        //   681: aload           12
        //   683: astore          9
        //   685: aload           11
        //   687: astore          10
        //   689: aload           16
        //   691: aload           18
        //   693: aload           17
        //   695: aload           19
        //   697: iconst_1       
        //   698: invokestatic    agpx.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lagns;I)Lagnp;
        //   701: astore          11
        //   703: aload           11
        //   705: astore_1       
        //   706: aload           20
        //   708: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   711: invokestatic    android/net/TrafficStats.clearThreadStatsTag:()V
        //   714: aload_1        
        //   715: areturn        
        //   716: astore          9
        //   718: aload           14
        //   720: astore          9
        //   722: aload           13
        //   724: astore          10
        //   726: goto            938
        //   729: aload           10
        //   731: astore          11
        //   733: aload           9
        //   735: astore          12
        //   737: aload           11
        //   739: astore          9
        //   741: aload           12
        //   743: astore          10
        //   745: aload           20
        //   747: aload           4
        //   749: aload_1        
        //   750: aload_3        
        //   751: invokestatic    agno.f:(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   754: iload           7
        //   756: sipush          429
        //   759: if_icmpeq       824
        //   762: iload           7
        //   764: sipush          500
        //   767: if_icmplt       789
        //   770: iload           7
        //   772: sipush          600
        //   775: if_icmpge       789
        //   778: aload           11
        //   780: astore          9
        //   782: aload           12
        //   784: astore          10
        //   786: goto            938
        //   789: aload           11
        //   791: astore          9
        //   793: aload           12
        //   795: astore          10
        //   797: invokestatic    agno.e:()V
        //   800: aload           11
        //   802: astore          9
        //   804: aload           12
        //   806: astore          10
        //   808: aconst_null    
        //   809: aconst_null    
        //   810: aconst_null    
        //   811: aconst_null    
        //   812: iconst_2       
        //   813: invokestatic    agpx.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lagns;I)Lagnp;
        //   816: astore          11
        //   818: aload           11
        //   820: astore_1       
        //   821: goto            706
        //   824: aload           11
        //   826: astore          9
        //   828: aload           12
        //   830: astore          10
        //   832: new             Lagnc;
        //   835: astore          13
        //   837: aload           11
        //   839: astore          9
        //   841: aload           12
        //   843: astore          10
        //   845: aload           13
        //   847: ldc_w           "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
        //   850: invokespecial   agnc.<init>:(Ljava/lang/String;)V
        //   853: aload           11
        //   855: astore          9
        //   857: aload           12
        //   859: astore          10
        //   861: aload           13
        //   863: athrow         
        //   864: astore          13
        //   866: aload           10
        //   868: astore          11
        //   870: aload           9
        //   872: astore          12
        //   874: aload           11
        //   876: astore          9
        //   878: aload           12
        //   880: astore          10
        //   882: new             Ljava/lang/IllegalStateException;
        //   885: astore          14
        //   887: aload           11
        //   889: astore          9
        //   891: aload           12
        //   893: astore          10
        //   895: aload           14
        //   897: aload           13
        //   899: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   902: aload           11
        //   904: astore          9
        //   906: aload           12
        //   908: astore          10
        //   910: aload           14
        //   912: athrow         
        //   913: astore_1       
        //   914: aload           20
        //   916: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   919: invokestatic    android/net/TrafficStats.clearThreadStatsTag:()V
        //   922: aload_1        
        //   923: athrow         
        //   924: astore          11
        //   926: aload           10
        //   928: astore          11
        //   930: aload           9
        //   932: astore          10
        //   934: aload           11
        //   936: astore          9
        //   938: aload           20
        //   940: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   943: invokestatic    android/net/TrafficStats.clearThreadStatsTag:()V
        //   946: iinc            6, 1
        //   949: aload           10
        //   951: astore          11
        //   953: aload           9
        //   955: astore          10
        //   957: aload           11
        //   959: astore          9
        //   961: goto            46
        //   964: new             Lagnc;
        //   967: dup            
        //   968: aload           9
        //   970: invokespecial   agnc.<init>:(Ljava/lang/String;)V
        //   973: athrow         
        //   974: new             Lagnc;
        //   977: dup            
        //   978: ldc_w           "Firebase Installations Service is unavailable. Please try again later."
        //   981: invokespecial   agnc.<init>:(Ljava/lang/String;)V
        //   984: astore_1       
        //   985: goto            990
        //   988: aload_1        
        //   989: athrow         
        //   990: goto            988
        //   993: astore          11
        //   995: goto            938
        //   998: astore          11
        //  1000: goto            938
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  67     81     924    938    Ljava/lang/AssertionError;
        //  67     81     924    938    Ljava/io/IOException;
        //  67     81     913    924    Any
        //  86     96     924    938    Ljava/lang/AssertionError;
        //  86     96     924    938    Ljava/io/IOException;
        //  86     96     913    924    Any
        //  96     150    864    913    Lorg/json/JSONException;
        //  96     150    924    938    Ljava/lang/AssertionError;
        //  96     150    924    938    Ljava/io/IOException;
        //  96     150    913    924    Any
        //  150    228    924    938    Ljava/lang/AssertionError;
        //  150    228    924    938    Ljava/io/IOException;
        //  150    228    913    924    Any
        //  248    256    716    729    Ljava/lang/AssertionError;
        //  248    256    716    729    Ljava/io/IOException;
        //  248    256    913    924    Any
        //  264    271    716    729    Ljava/lang/AssertionError;
        //  264    271    716    729    Ljava/io/IOException;
        //  264    271    913    924    Any
        //  279    290    716    729    Ljava/lang/AssertionError;
        //  279    290    716    729    Ljava/io/IOException;
        //  279    290    913    924    Any
        //  298    305    716    729    Ljava/lang/AssertionError;
        //  298    305    716    729    Ljava/io/IOException;
        //  298    305    913    924    Any
        //  316    326    716    729    Ljava/lang/AssertionError;
        //  316    326    716    729    Ljava/io/IOException;
        //  316    326    913    924    Any
        //  334    341    716    729    Ljava/lang/AssertionError;
        //  334    341    716    729    Ljava/io/IOException;
        //  334    341    913    924    Any
        //  352    363    716    729    Ljava/lang/AssertionError;
        //  352    363    716    729    Ljava/io/IOException;
        //  352    363    913    924    Any
        //  371    378    716    729    Ljava/lang/AssertionError;
        //  371    378    716    729    Ljava/io/IOException;
        //  371    378    913    924    Any
        //  389    400    716    729    Ljava/lang/AssertionError;
        //  389    400    716    729    Ljava/io/IOException;
        //  389    400    913    924    Any
        //  408    413    716    729    Ljava/lang/AssertionError;
        //  408    413    716    729    Ljava/io/IOException;
        //  408    413    913    924    Any
        //  429    437    716    729    Ljava/lang/AssertionError;
        //  429    437    716    729    Ljava/io/IOException;
        //  429    437    913    924    Any
        //  445    452    716    729    Ljava/lang/AssertionError;
        //  445    452    716    729    Ljava/io/IOException;
        //  445    452    913    924    Any
        //  460    471    716    729    Ljava/lang/AssertionError;
        //  460    471    716    729    Ljava/io/IOException;
        //  460    471    913    924    Any
        //  479    489    716    729    Ljava/lang/AssertionError;
        //  479    489    716    729    Ljava/io/IOException;
        //  479    489    913    924    Any
        //  500    511    716    729    Ljava/lang/AssertionError;
        //  500    511    716    729    Ljava/io/IOException;
        //  500    511    913    924    Any
        //  519    526    716    729    Ljava/lang/AssertionError;
        //  519    526    716    729    Ljava/io/IOException;
        //  519    526    913    924    Any
        //  534    544    993    998    Ljava/lang/AssertionError;
        //  534    544    993    998    Ljava/io/IOException;
        //  534    544    913    924    Any
        //  555    560    993    998    Ljava/lang/AssertionError;
        //  555    560    993    998    Ljava/io/IOException;
        //  555    560    913    924    Any
        //  571    578    993    998    Ljava/lang/AssertionError;
        //  571    578    993    998    Ljava/io/IOException;
        //  571    578    913    924    Any
        //  586    591    993    998    Ljava/lang/AssertionError;
        //  586    591    993    998    Ljava/io/IOException;
        //  586    591    913    924    Any
        //  614    619    993    998    Ljava/lang/AssertionError;
        //  614    619    993    998    Ljava/io/IOException;
        //  614    619    913    924    Any
        //  650    655    993    998    Ljava/lang/AssertionError;
        //  650    655    993    998    Ljava/io/IOException;
        //  650    655    913    924    Any
        //  663    668    993    998    Ljava/lang/AssertionError;
        //  663    668    993    998    Ljava/io/IOException;
        //  663    668    913    924    Any
        //  676    681    993    998    Ljava/lang/AssertionError;
        //  676    681    993    998    Ljava/io/IOException;
        //  676    681    913    924    Any
        //  689    703    998    1003   Ljava/lang/AssertionError;
        //  689    703    998    1003   Ljava/io/IOException;
        //  689    703    913    924    Any
        //  745    754    998    1003   Ljava/lang/AssertionError;
        //  745    754    998    1003   Ljava/io/IOException;
        //  745    754    913    924    Any
        //  797    800    998    1003   Ljava/lang/AssertionError;
        //  797    800    998    1003   Ljava/io/IOException;
        //  797    800    913    924    Any
        //  808    818    998    1003   Ljava/lang/AssertionError;
        //  808    818    998    1003   Ljava/io/IOException;
        //  808    818    913    924    Any
        //  832    837    998    1003   Ljava/lang/AssertionError;
        //  832    837    998    1003   Ljava/io/IOException;
        //  832    837    913    924    Any
        //  845    853    998    1003   Ljava/lang/AssertionError;
        //  845    853    998    1003   Ljava/io/IOException;
        //  845    853    913    924    Any
        //  861    864    998    1003   Ljava/lang/AssertionError;
        //  861    864    998    1003   Ljava/io/IOException;
        //  861    864    913    924    Any
        //  882    887    998    1003   Ljava/lang/AssertionError;
        //  882    887    998    1003   Ljava/io/IOException;
        //  882    887    913    924    Any
        //  895    902    998    1003   Ljava/lang/AssertionError;
        //  895    902    998    1003   Ljava/io/IOException;
        //  895    902    913    924    Any
        //  910    913    998    1003   Ljava/lang/AssertionError;
        //  910    913    998    1003   Ljava/io/IOException;
        //  910    913    913    924    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException
        //     at java.util.Collections$1.remove(Unknown Source)
        //     at java.util.AbstractCollection.removeAll(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:3018)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2501)
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
    
    public final agns c(final String s, final String s2, final String s3, final String s4) {
        if (!this.e.b()) {
            goto Label_0491;
        }
        final int n = 0;
        final URL j = j(String.format("projects/%s/installations/%s/authTokens:generate", s3, s2));
        if (n > 1) {
            goto Label_0480;
        }
        TrafficStats.setThreadStatsTag(32771);
        final HttpURLConnection d = this.d(j, s);
        try {
            d.setRequestMethod("POST");
            final StringBuilder sb = new StringBuilder();
            sb.append("FIS_v2 ");
            sb.append(s4);
            d.addRequestProperty("Authorization", sb.toString());
            d.setDoOutput(true);
            try {
                final JSONObject jsonObject = new JSONObject();
                jsonObject.put("sdkVersion", (Object)"a:17.0.2_1p");
                final JSONObject jsonObject2 = new JSONObject();
                jsonObject2.put("installation", (Object)jsonObject);
                g(d, i(jsonObject2));
                final int responseCode = d.getResponseCode();
                this.e.a(responseCode);
                agns agns;
                if (h(responseCode)) {
                    final InputStream inputStream = d.getInputStream();
                    final JsonReader jsonReader = new JsonReader((Reader)new InputStreamReader(inputStream, agno.b));
                    final agnr a = agns.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        final String nextName = jsonReader.nextName();
                        if (nextName.equals("token")) {
                            a.a = jsonReader.nextString();
                        }
                        else if (nextName.equals("expiresIn")) {
                            a.b(a(jsonReader.nextString()));
                        }
                        else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    jsonReader.close();
                    inputStream.close();
                    a.b = 1;
                    agns = a.a();
                }
                else {
                    f(d, null, s, s3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new agnc("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode >= 500 && responseCode < 600) {
                            goto Label_0466;
                        }
                        e();
                        final agnr a2 = agns.a();
                        a2.b = 2;
                        agns = a2.a();
                    }
                    else {
                        final agnr a3 = agns.a();
                        a3.b = 3;
                        agns = a3.a();
                    }
                }
                return agns;
            }
            catch (final JSONException ex) {
                throw new IllegalStateException((Throwable)ex);
            }
        }
        catch (final AssertionError | IOException ex2) {
            goto Label_0466;
        }
        finally {
            d.disconnect();
            TrafficStats.clearThreadStatsTag();
        }
    }
}
