import java.nio.channels.FileChannel;
import android.content.res.Resources$NotFoundException;
import j$.wrapper.java.io.FileInputStreamWrapper;
import java.io.FileInputStream;
import android.text.TextUtils;
import java.io.IOException;
import java.io.EOFException;
import android.content.Context;
import java.io.InputStream;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcj extends bbd
{
    private final Resources a;
    private final String b;
    private Uri c;
    private AssetFileDescriptor d;
    private InputStream e;
    private long f;
    private boolean g;
    
    public bcj(final Context context) {
        super(false);
        this.a = context.getResources();
        this.b = context.getPackageName();
    }
    
    public static Uri buildRawResourceUri(final int n) {
        final StringBuilder sb = new StringBuilder("rawresource:///");
        sb.append(n);
        return Uri.parse(sb.toString());
    }
    
    public final int a(final byte[] array, int read, int a) {
        if (a == 0) {
            return 0;
        }
        final long f = this.f;
        if (f != 0L) {
            int n = a;
            Label_0045: {
                if (f == -1L) {
                    break Label_0045;
                }
                final long n2 = a;
                try {
                    n = (int)Math.min(f, n2);
                    final InputStream e = this.e;
                    a = bax.a;
                    read = e.read(array, read, n);
                    if (read != -1) {
                        final long f2 = this.f;
                        if (f2 != -1L) {
                            this.f = f2 - read;
                        }
                        this.g(read);
                        return read;
                    }
                    if (this.f == -1L) {
                        return -1;
                    }
                    throw new bci("End of stream reached having not read sufficient data.", (Throwable)new EOFException(), 2000);
                }
                catch (final IOException ex) {
                    throw new bci((String)null, (Throwable)ex, 2000);
                }
            }
        }
        return -1;
    }
    
    public final long b(final bbp bbp) {
        final Uri a = bbp.a;
        this.c = a;
        Label_0250: {
            if (!TextUtils.equals((CharSequence)"rawresource", (CharSequence)a.getScheme())) {
                if (TextUtils.equals((CharSequence)"android.resource", (CharSequence)a.getScheme()) && a.getPathSegments().size() == 1) {
                    final String lastPathSegment = a.getLastPathSegment();
                    dk.d((Object)lastPathSegment);
                    if (lastPathSegment.matches("\\d+")) {
                        break Label_0250;
                    }
                }
                if (!TextUtils.equals((CharSequence)"android.resource", (CharSequence)a.getScheme())) {
                    throw new bci("URI must either use scheme rawresource or android.resource", (Throwable)null, 1004);
                }
                final String path = a.getPath();
                dk.d((Object)path);
                String substring = path;
                if (path.startsWith("/")) {
                    substring = path.substring(1);
                }
                final String host = a.getHost();
                String concat;
                if (TextUtils.isEmpty((CharSequence)host)) {
                    concat = "";
                }
                else {
                    concat = String.valueOf(host).concat(":");
                }
                final int n = this.a.getIdentifier(concat.concat(String.valueOf(substring)), "raw", this.b);
                if (n != 0) {
                    break Label_0250;
                }
                throw new bci("Resource not found.", (Throwable)null, 2005);
            }
            try {
                final String lastPathSegment2 = a.getLastPathSegment();
                dk.d((Object)lastPathSegment2);
                final int n = Integer.parseInt(lastPathSegment2);
                this.i(bbp);
                try {
                    final AssetFileDescriptor openRawResourceFd = this.a.openRawResourceFd(n);
                    this.d = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        final long length = openRawResourceFd.getLength();
                        final FileInputStream e = new FileInputStream(openRawResourceFd.getFileDescriptor());
                        this.e = e;
                        Label_0337: {
                            if (length == -1L) {
                                break Label_0337;
                            }
                            try {
                                if (bbp.g > length) {
                                    throw new bci((String)null, (Throwable)null, 2008);
                                }
                                final long startOffset = openRawResourceFd.getStartOffset();
                                final long n2 = e.skip(bbp.g + startOffset) - startOffset;
                                if (n2 != bbp.g) {
                                    throw new bci((String)null, (Throwable)null, 2008);
                                }
                                long n3;
                                if (length == -1L) {
                                    final FileChannel channel = FileInputStreamWrapper.getChannel(e);
                                    if (channel.size() == 0L) {
                                        this.f = -1L;
                                        n3 = -1L;
                                    }
                                    else {
                                        n3 = channel.size() - channel.position();
                                        this.f = n3;
                                        if (n3 < 0L) {
                                            throw new bci((String)null, (Throwable)null, 2008);
                                        }
                                    }
                                }
                                else {
                                    n3 = length - n2;
                                    this.f = n3;
                                    if (n3 < 0L) {
                                        throw new bbm(2008);
                                    }
                                }
                                final long h = bbp.h;
                                if (h != -1L) {
                                    long min;
                                    if (n3 == -1L) {
                                        min = h;
                                    }
                                    else {
                                        min = Math.min(n3, h);
                                    }
                                    this.f = min;
                                }
                                this.g = true;
                                this.j(bbp);
                                final long h2 = bbp.h;
                                if (h2 != -1L) {
                                    return h2;
                                }
                                return this.f;
                            }
                            catch (final IOException ex) {
                                throw new bci((String)null, (Throwable)ex, 2000);
                            }
                            catch (final bci bci) {
                                throw bci;
                            }
                        }
                    }
                    throw new bci("Resource is compressed: ".concat(String.valueOf(String.valueOf(a))), (Throwable)null, 2000);
                }
                catch (final Resources$NotFoundException ex2) {
                    throw new bci((String)null, (Throwable)ex2, 2005);
                }
            }
            catch (final NumberFormatException ex3) {
                throw new bci("Resource identifier must be an integer.", (Throwable)null, 1004);
            }
        }
    }
    
    public final Uri c() {
        return this.c;
    }
    
    public final void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aconst_null    
        //     2: putfield        bcj.c:Landroid/net/Uri;
        //     5: aload_0        
        //     6: getfield        bcj.e:Ljava/io/InputStream;
        //     9: astore_1       
        //    10: aload_1        
        //    11: ifnull          18
        //    14: aload_1        
        //    15: invokevirtual   java/io/InputStream.close:()V
        //    18: aload_0        
        //    19: aconst_null    
        //    20: putfield        bcj.e:Ljava/io/InputStream;
        //    23: aload_0        
        //    24: getfield        bcj.d:Landroid/content/res/AssetFileDescriptor;
        //    27: astore_1       
        //    28: aload_1        
        //    29: ifnull          36
        //    32: aload_1        
        //    33: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //    36: aload_0        
        //    37: aconst_null    
        //    38: putfield        bcj.d:Landroid/content/res/AssetFileDescriptor;
        //    41: aload_0        
        //    42: getfield        bcj.g:Z
        //    45: ifeq            57
        //    48: aload_0        
        //    49: iconst_0       
        //    50: putfield        bcj.g:Z
        //    53: aload_0        
        //    54: invokevirtual   bbd.h:()V
        //    57: return         
        //    58: astore_1       
        //    59: goto            78
        //    62: astore_2       
        //    63: new             Lbci;
        //    66: astore_1       
        //    67: aload_1        
        //    68: aconst_null    
        //    69: aload_2        
        //    70: sipush          2000
        //    73: invokespecial   bci.<init>:(Ljava/lang/String;Ljava/lang/Throwable;I)V
        //    76: aload_1        
        //    77: athrow         
        //    78: aload_0        
        //    79: aconst_null    
        //    80: putfield        bcj.d:Landroid/content/res/AssetFileDescriptor;
        //    83: aload_0        
        //    84: getfield        bcj.g:Z
        //    87: ifeq            99
        //    90: aload_0        
        //    91: iconst_0       
        //    92: putfield        bcj.g:Z
        //    95: aload_0        
        //    96: invokevirtual   bbd.h:()V
        //    99: aload_1        
        //   100: athrow         
        //   101: astore_2       
        //   102: goto            121
        //   105: astore_2       
        //   106: new             Lbci;
        //   109: astore_1       
        //   110: aload_1        
        //   111: aconst_null    
        //   112: aload_2        
        //   113: sipush          2000
        //   116: invokespecial   bci.<init>:(Ljava/lang/String;Ljava/lang/Throwable;I)V
        //   119: aload_1        
        //   120: athrow         
        //   121: aload_0        
        //   122: aconst_null    
        //   123: putfield        bcj.e:Ljava/io/InputStream;
        //   126: aload_0        
        //   127: getfield        bcj.d:Landroid/content/res/AssetFileDescriptor;
        //   130: astore_1       
        //   131: aload_1        
        //   132: ifnull          139
        //   135: aload_1        
        //   136: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   139: aload_0        
        //   140: aconst_null    
        //   141: putfield        bcj.d:Landroid/content/res/AssetFileDescriptor;
        //   144: aload_0        
        //   145: getfield        bcj.g:Z
        //   148: ifeq            160
        //   151: aload_0        
        //   152: iconst_0       
        //   153: putfield        bcj.g:Z
        //   156: aload_0        
        //   157: invokevirtual   bbd.h:()V
        //   160: aload_2        
        //   161: athrow         
        //   162: astore_1       
        //   163: goto            182
        //   166: astore_2       
        //   167: new             Lbci;
        //   170: astore_1       
        //   171: aload_1        
        //   172: aconst_null    
        //   173: aload_2        
        //   174: sipush          2000
        //   177: invokespecial   bci.<init>:(Ljava/lang/String;Ljava/lang/Throwable;I)V
        //   180: aload_1        
        //   181: athrow         
        //   182: aload_0        
        //   183: aconst_null    
        //   184: putfield        bcj.d:Landroid/content/res/AssetFileDescriptor;
        //   187: aload_0        
        //   188: getfield        bcj.g:Z
        //   191: ifne            197
        //   194: goto            206
        //   197: aload_0        
        //   198: iconst_0       
        //   199: putfield        bcj.g:Z
        //   202: aload_0        
        //   203: invokevirtual   bbd.h:()V
        //   206: aload_1        
        //   207: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      10     105    121    Ljava/io/IOException;
        //  5      10     101    208    Any
        //  14     18     105    121    Ljava/io/IOException;
        //  14     18     101    208    Any
        //  23     28     62     78     Ljava/io/IOException;
        //  23     28     58     101    Any
        //  32     36     62     78     Ljava/io/IOException;
        //  32     36     58     101    Any
        //  63     78     58     101    Any
        //  106    121    101    208    Any
        //  126    131    166    182    Ljava/io/IOException;
        //  126    131    162    208    Any
        //  135    139    166    182    Ljava/io/IOException;
        //  135    139    162    208    Any
        //  167    182    162    208    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0139:
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
