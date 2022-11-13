import java.nio.channels.FileChannel;
import java.io.FileNotFoundException;
import j$.wrapper.java.io.FileInputStreamWrapper;
import android.os.Bundle;
import java.io.IOException;
import android.content.Context;
import java.io.FileInputStream;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbh extends bbd
{
    private final ContentResolver a;
    private Uri b;
    private AssetFileDescriptor c;
    private FileInputStream d;
    private long e;
    private boolean f;
    
    public bbh(final Context context) {
        super(false);
        this.a = context.getContentResolver();
    }
    
    public final int a(final byte[] array, int read, int a) {
        if (a == 0) {
            return 0;
        }
        final long e = this.e;
        if (e != 0L) {
            int n = a;
            Label_0045: {
                if (e == -1L) {
                    break Label_0045;
                }
                final long n2 = a;
                try {
                    n = (int)Math.min(e, n2);
                    final FileInputStream d = this.d;
                    a = bax.a;
                    read = d.read(array, read, n);
                    if (read == -1) {
                        return -1;
                    }
                    final long e2 = this.e;
                    if (e2 != -1L) {
                        this.e = e2 - read;
                    }
                    this.g(read);
                    return read;
                }
                catch (final IOException ex) {
                    throw new bbg(ex, 2000);
                }
            }
        }
        return -1;
    }
    
    public final long b(final bbp bbp) {
        int n = 2000;
        try {
            final Uri a = bbp.a;
            this.b = a;
            this.i(bbp);
            AssetFileDescriptor c;
            if ("content".equals(bbp.a.getScheme())) {
                final Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                c = this.a.openTypedAssetFileDescriptor(a, "*/*", bundle);
            }
            else {
                c = this.a.openAssetFileDescriptor(a, "r");
            }
            this.c = c;
            if (c == null) {
                final String value = String.valueOf(a);
                final StringBuilder sb = new StringBuilder("Could not open file descriptor for: ");
                sb.append(value);
                throw new bbg(new IOException(sb.toString()), 2000);
            }
            final long length = c.getLength();
            final FileInputStream d = new FileInputStream(c.getFileDescriptor());
            this.d = d;
            if (length != -1L && bbp.g > length) {
                throw new bbg((IOException)null, 2008);
            }
            final long startOffset = c.getStartOffset();
            final long n2 = d.skip(bbp.g + startOffset) - startOffset;
            if (n2 != bbp.g) {
                throw new bbg((IOException)null, 2008);
            }
            long n3;
            if (length == -1L) {
                final FileChannel channel = FileInputStreamWrapper.getChannel(d);
                final long size = channel.size();
                if (size == 0L) {
                    this.e = -1L;
                    n3 = -1L;
                }
                else {
                    n3 = size - channel.position();
                    this.e = n3;
                    if (n3 < 0L) {
                        throw new bbg((IOException)null, 2008);
                    }
                }
            }
            else {
                n3 = length - n2;
                this.e = n3;
                if (n3 < 0L) {
                    throw new bbg((IOException)null, 2008);
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
                this.e = min;
            }
            this.f = true;
            this.j(bbp);
            final long h2 = bbp.h;
            if (h2 != -1L) {
                return h2;
            }
            return this.e;
        }
        catch (final IOException ex) {
            if (ex instanceof FileNotFoundException) {
                n = 2005;
            }
            throw new bbg(ex, n);
        }
        catch (final bbg bbg) {
            throw bbg;
        }
    }
    
    public final Uri c() {
        return this.b;
    }
    
    public final void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aconst_null    
        //     2: putfield        bbh.b:Landroid/net/Uri;
        //     5: aload_0        
        //     6: getfield        bbh.d:Ljava/io/FileInputStream;
        //     9: astore_1       
        //    10: aload_1        
        //    11: ifnull          18
        //    14: aload_1        
        //    15: invokevirtual   java/io/FileInputStream.close:()V
        //    18: aload_0        
        //    19: aconst_null    
        //    20: putfield        bbh.d:Ljava/io/FileInputStream;
        //    23: aload_0        
        //    24: getfield        bbh.c:Landroid/content/res/AssetFileDescriptor;
        //    27: astore_1       
        //    28: aload_1        
        //    29: ifnull          36
        //    32: aload_1        
        //    33: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //    36: aload_0        
        //    37: aconst_null    
        //    38: putfield        bbh.c:Landroid/content/res/AssetFileDescriptor;
        //    41: aload_0        
        //    42: getfield        bbh.f:Z
        //    45: ifeq            57
        //    48: aload_0        
        //    49: iconst_0       
        //    50: putfield        bbh.f:Z
        //    53: aload_0        
        //    54: invokevirtual   bbd.h:()V
        //    57: return         
        //    58: astore_1       
        //    59: goto            77
        //    62: astore_1       
        //    63: new             Lbbg;
        //    66: astore_2       
        //    67: aload_2        
        //    68: aload_1        
        //    69: sipush          2000
        //    72: invokespecial   bbg.<init>:(Ljava/io/IOException;I)V
        //    75: aload_2        
        //    76: athrow         
        //    77: aload_0        
        //    78: aconst_null    
        //    79: putfield        bbh.c:Landroid/content/res/AssetFileDescriptor;
        //    82: aload_0        
        //    83: getfield        bbh.f:Z
        //    86: ifeq            98
        //    89: aload_0        
        //    90: iconst_0       
        //    91: putfield        bbh.f:Z
        //    94: aload_0        
        //    95: invokevirtual   bbd.h:()V
        //    98: aload_1        
        //    99: athrow         
        //   100: astore_2       
        //   101: goto            119
        //   104: astore_1       
        //   105: new             Lbbg;
        //   108: astore_2       
        //   109: aload_2        
        //   110: aload_1        
        //   111: sipush          2000
        //   114: invokespecial   bbg.<init>:(Ljava/io/IOException;I)V
        //   117: aload_2        
        //   118: athrow         
        //   119: aload_0        
        //   120: aconst_null    
        //   121: putfield        bbh.d:Ljava/io/FileInputStream;
        //   124: aload_0        
        //   125: getfield        bbh.c:Landroid/content/res/AssetFileDescriptor;
        //   128: astore_1       
        //   129: aload_1        
        //   130: ifnull          137
        //   133: aload_1        
        //   134: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   137: aload_0        
        //   138: aconst_null    
        //   139: putfield        bbh.c:Landroid/content/res/AssetFileDescriptor;
        //   142: aload_0        
        //   143: getfield        bbh.f:Z
        //   146: ifeq            158
        //   149: aload_0        
        //   150: iconst_0       
        //   151: putfield        bbh.f:Z
        //   154: aload_0        
        //   155: invokevirtual   bbd.h:()V
        //   158: aload_2        
        //   159: athrow         
        //   160: astore_1       
        //   161: goto            179
        //   164: astore_1       
        //   165: new             Lbbg;
        //   168: astore_2       
        //   169: aload_2        
        //   170: aload_1        
        //   171: sipush          2000
        //   174: invokespecial   bbg.<init>:(Ljava/io/IOException;I)V
        //   177: aload_2        
        //   178: athrow         
        //   179: aload_0        
        //   180: aconst_null    
        //   181: putfield        bbh.c:Landroid/content/res/AssetFileDescriptor;
        //   184: aload_0        
        //   185: getfield        bbh.f:Z
        //   188: ifne            194
        //   191: goto            203
        //   194: aload_0        
        //   195: iconst_0       
        //   196: putfield        bbh.f:Z
        //   199: aload_0        
        //   200: invokevirtual   bbd.h:()V
        //   203: aload_1        
        //   204: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      10     104    119    Ljava/io/IOException;
        //  5      10     100    205    Any
        //  14     18     104    119    Ljava/io/IOException;
        //  14     18     100    205    Any
        //  23     28     62     77     Ljava/io/IOException;
        //  23     28     58     100    Any
        //  32     36     62     77     Ljava/io/IOException;
        //  32     36     58     100    Any
        //  63     77     58     100    Any
        //  105    119    100    205    Any
        //  124    129    164    179    Ljava/io/IOException;
        //  124    129    160    205    Any
        //  133    137    164    179    Ljava/io/IOException;
        //  133    137    160    205    Any
        //  165    179    160    205    Any
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
}
