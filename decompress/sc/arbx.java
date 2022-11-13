import android.os.Environment;
import android.os.Build$VERSION;
import com.google.protobuf.MessageLite;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import android.util.Log;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbx
{
    private static final String a = "arbx";
    
    public static CardboardDevice$DeviceParams a(final Context context) {
        return (CardboardDevice$DeviceParams)e((ahcv)CardboardDevice$DeviceParams.newBuilder(), "current_device_params", 894990891, true, context);
    }
    
    public static Display$DisplayParams b(final Context context) {
        return (Display$DisplayParams)e((ahcv)Display$DisplayParams.newBuilder(), "phone_params", 779508118, false, context);
    }
    
    public static boolean c(final Context context) {
        boolean b;
        try {
            final File f = f("current_device_params", context);
            b = (!f.exists() || f.delete());
        }
        catch (final IllegalStateException ex) {
            Log.w(arbx.a, "Error clearing device parameters: ".concat(ex.toString()));
            b = false;
        }
        if (!b) {
            Log.e(arbx.a, "Could not clear Cardboard parameters from storage.");
        }
        return b;
    }
    
    public static boolean d(CardboardDevice$DeviceParams allocate, Context o) {
        final byte[] byteArray = ((MessageLite)allocate).toByteArray();
        final Object o2 = null;
        final Object o3 = null;
        final IllegalStateException ex = null;
        final boolean b = false;
        boolean b2 = false;
        allocate = ex;
        Label_0341: {
            Label_0326: {
                Object o4 = null;
                try {
                    try {
                        o4 = new(java.io.BufferedOutputStream.class)();
                        allocate = ex;
                        allocate = ex;
                        final FileOutputStream fileOutputStream = new FileOutputStream(f("current_device_params", (Context)o));
                        allocate = ex;
                        new BufferedOutputStream(fileOutputStream);
                        try {
                            try {
                                allocate = (IllegalStateException)ByteBuffer.allocate(8);
                                ((ByteBuffer)allocate).putInt(894990891);
                                ((ByteBuffer)allocate).putInt(byteArray.length);
                                ((OutputStream)o4).write(((ByteBuffer)allocate).array());
                                ((OutputStream)o4).write(byteArray);
                                b2 = true;
                            }
                            catch (final IllegalStateException allocate) {}
                        }
                        catch (final IOException allocate) {
                            final String s = arbx.a;
                            final String s2 = "Error writing parameters: ";
                            final IllegalStateException ex2 = allocate;
                            final String s3 = ex2.toString();
                            final String s4 = String.valueOf(s3);
                            final String s5 = s2.concat(s4);
                            Log.w(s, s5);
                        }
                        try {
                            final String s = arbx.a;
                            final String s2 = "Error writing parameters: ";
                            final IllegalStateException ex2 = allocate;
                            final String s3 = ex2.toString();
                            final String s4 = String.valueOf(s3);
                            final String s5 = s2.concat(s4);
                            Log.w(s, s5);
                            final boolean b3 = b2;
                            try {
                                ((OutputStream)o4).close();
                            }
                            catch (final IOException allocate) {
                                b2 = b3;
                            }
                            break Label_0326;
                            allocate = (IllegalStateException)o4;
                            break Label_0341;
                            o4 = allocate;
                        }
                        catch (final FileNotFoundException allocate) {
                            o4 = allocate;
                        }
                    }
                    finally {}
                }
                catch (final IllegalStateException o4) {
                    o = o2;
                }
                catch (final FileNotFoundException o4) {
                    o = o3;
                }
                final String a = arbx.a;
                final String string = o4.toString();
                final StringBuilder sb = new StringBuilder("Parameters file not found for writing: ");
                sb.append(string);
                Log.e(a, sb.toString());
                b2 = b;
                if (o != null) {
                    goto Label_0246;
                }
            }
            if (!b2) {
                Log.e(arbx.a, "Could not write Cardboard parameters to storage.");
            }
            return b2;
        }
        Label_0349: {
            if (allocate == null) {
                break Label_0349;
            }
            try {
                ((OutputStream)allocate).close();
                throw o;
            }
            catch (final IOException ex3) {
                throw o;
            }
        }
    }
    
    private static MessageLite e(final ahcv p0, final String p1, final int p2, final boolean p3, final Context p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          7
        //     5: new             Ljava/io/FileInputStream;
        //     8: astore          8
        //    10: aload           8
        //    12: aload_1        
        //    13: aload           4
        //    15: invokestatic    arbx.f:(Ljava/lang/String;Landroid/content/Context;)Ljava/io/File;
        //    18: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    21: aload           7
        //    23: aload           8
        //    25: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    28: bipush          8
        //    30: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //    33: astore_1       
        //    34: aload           7
        //    36: aload_1        
        //    37: invokevirtual   java/nio/ByteBuffer.array:()[B
        //    40: iconst_0       
        //    41: aload_1        
        //    42: invokevirtual   java/nio/ByteBuffer.array:()[B
        //    45: arraylength    
        //    46: invokevirtual   java/io/InputStream.read:([BII)I
        //    49: istore          5
        //    51: iload           5
        //    53: iconst_m1      
        //    54: if_icmpne       69
        //    57: getstatic       arbx.a:Ljava/lang/String;
        //    60: ldc             "Error parsing param record: end of stream."
        //    62: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    65: pop            
        //    66: goto            162
        //    69: aload_1        
        //    70: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //    73: istore          6
        //    75: aload_1        
        //    76: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //    79: istore          5
        //    81: iload           6
        //    83: iload_2        
        //    84: if_icmpeq       99
        //    87: getstatic       arbx.a:Ljava/lang/String;
        //    90: ldc             "Error parsing param record: incorrect sentinel."
        //    92: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    95: pop            
        //    96: goto            162
        //    99: iload           5
        //   101: newarray        B
        //   103: astore          4
        //   105: aload           4
        //   107: astore_1       
        //   108: aload           7
        //   110: aload           4
        //   112: iconst_0       
        //   113: iload           5
        //   115: invokevirtual   java/io/InputStream.read:([BII)I
        //   118: iconst_m1      
        //   119: if_icmpne       164
        //   122: getstatic       arbx.a:Ljava/lang/String;
        //   125: ldc             "Error parsing param record: end of stream."
        //   127: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   130: pop            
        //   131: goto            162
        //   134: astore_1       
        //   135: aload           7
        //   137: astore          4
        //   139: goto            181
        //   142: astore_1       
        //   143: getstatic       arbx.a:Ljava/lang/String;
        //   146: ldc             "Error reading parameters: "
        //   148: aload_1        
        //   149: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   152: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   155: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   158: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   161: pop            
        //   162: aconst_null    
        //   163: astore_1       
        //   164: aload           7
        //   166: invokevirtual   java/io/InputStream.close:()V
        //   169: goto            228
        //   172: astore          4
        //   174: goto            228
        //   177: astore_1       
        //   178: aconst_null    
        //   179: astore          4
        //   181: aload           4
        //   183: ifnull          191
        //   186: aload           4
        //   188: invokevirtual   java/io/InputStream.close:()V
        //   191: aload_1        
        //   192: athrow         
        //   193: astore_1       
        //   194: getstatic       arbx.a:Ljava/lang/String;
        //   197: ldc             "Error reading parameters: "
        //   199: aload_1        
        //   200: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   203: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   206: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   209: pop            
        //   210: aconst_null    
        //   211: astore_1       
        //   212: goto            228
        //   215: astore_1       
        //   216: iload_3        
        //   217: ifeq            210
        //   220: aload_1        
        //   221: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   224: pop            
        //   225: goto            210
        //   228: aload_1        
        //   229: ifnonnull       234
        //   232: aconst_null    
        //   233: areturn        
        //   234: aload_0        
        //   235: aload_1        
        //   236: invokeinterface ahcv.mergeFrom:([B)Lahcv;
        //   241: invokeinterface ahcv.build:()Lcom/google/protobuf/MessageLite;
        //   246: astore_0       
        //   247: aload_0        
        //   248: areturn        
        //   249: astore_0       
        //   250: getstatic       arbx.a:Ljava/lang/String;
        //   253: ldc             "Error reading params from ContentProvider"
        //   255: aload_0        
        //   256: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   259: pop            
        //   260: aconst_null    
        //   261: areturn        
        //   262: astore          4
        //   264: goto            191
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      28     177    181    Any
        //  28     51     142    162    Ljava/io/IOException;
        //  28     51     134    142    Any
        //  57     66     142    162    Ljava/io/IOException;
        //  57     66     134    142    Any
        //  69     81     142    162    Ljava/io/IOException;
        //  69     81     134    142    Any
        //  87     96     142    162    Ljava/io/IOException;
        //  87     96     134    142    Any
        //  99     105    142    162    Ljava/io/IOException;
        //  99     105    134    142    Any
        //  108    131    142    162    Ljava/io/IOException;
        //  108    131    134    142    Any
        //  143    162    134    142    Any
        //  164    169    172    177    Ljava/io/IOException;
        //  164    169    215    228    Ljava/io/FileNotFoundException;
        //  164    169    193    210    Ljava/lang/IllegalStateException;
        //  186    191    262    267    Ljava/io/IOException;
        //  186    191    215    228    Ljava/io/FileNotFoundException;
        //  186    191    193    210    Ljava/lang/IllegalStateException;
        //  191    193    215    228    Ljava/io/FileNotFoundException;
        //  191    193    193    210    Ljava/lang/IllegalStateException;
        //  234    247    249    262    Lahca;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0164:
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
    
    private static File f(final String s, final Context context) {
        File file;
        if (Build$VERSION.SDK_INT >= 29) {
            file = context.getFilesDir();
        }
        else {
            file = Environment.getExternalStorageDirectory();
        }
        final File file2 = new File(file, "Cardboard");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        else if (!file2.isDirectory()) {
            throw new IllegalStateException(file2.toString().concat(" already exists as a file, but is expected to be a directory."));
        }
        return new File(file2, s);
    }
}
