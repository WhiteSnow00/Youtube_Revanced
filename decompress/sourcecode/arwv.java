import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import io.grpc.Status;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arwv
{
    private static final arua a;
    
    static {
        a = (arua)new arwu((Parcelable$Creator)null);
    }
    
    private arwv() {
    }
    
    public static arug a(final Parcel parcel, final arrg arrg) {
        final int int1 = parcel.readInt();
        if (int1 == 0) {
            return new arug();
        }
        final Object[] array = new Object[int1 + int1];
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < int1) {
            final int int2 = parcel.readInt();
            n += 4;
            final int n3 = i + i;
            array[n3] = c(parcel, int2, n);
            final int int3 = parcel.readInt();
            final int n4 = n + int2 + 4;
            int n5 = 0;
            int n6 = 0;
            Label_0264: {
                if (int3 == -1) {
                    final arvw arvw = (arvw)arrg.a(arwg.h);
                    if (arvw.b) {
                        final int dataPosition = parcel.dataPosition();
                        try {
                            final Parcelable parcelable = parcel.readParcelable(arwv.class.getClassLoader());
                            if (parcelable == null) {
                                throw Status.k.withDescription("Read null parcelable in metadata").asException();
                            }
                            array[n3 + 1] = artc.e(arwv.a, (Object)parcelable);
                            n5 = n2 + (parcel.dataPosition() - dataPosition);
                            final int c = arvw.c;
                            if (n5 <= 32768) {
                                n6 = n4;
                                break Label_0264;
                            }
                            throw Status.h.withDescription("Inbound Parcelables too large according to policy (see InboundParcelablePolicy)").asException();
                        }
                        catch (final AndroidRuntimeException ex) {
                            throw Status.k.c((Throwable)ex).withDescription("Failure reading parcelable in metadata").asException();
                        }
                    }
                    throw Status.f.withDescription("Parcelable metadata values not allowed").asException();
                }
                if (int3 < 0) {
                    throw Status.k.withDescription("Unrecognized metadata sentinel").asException();
                }
                array[n3 + 1] = c(parcel, int3, n4);
                final int n7 = n4 + int3;
                n5 = n2;
                n6 = n7;
            }
            ++i;
            n = n6;
            n2 = n5;
        }
        return artc.d(int1, array);
    }
    
    public static void b(final Parcel p0, final arug p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnull          12
        //     4: aload_1        
        //     5: invokestatic    artc.a:(Larug;)I
        //     8: istore_2       
        //     9: goto            14
        //    12: iconst_0       
        //    13: istore_2       
        //    14: iload_2        
        //    15: ifne            24
        //    18: aload_0        
        //    19: iconst_0       
        //    20: invokevirtual   android/os/Parcel.writeInt:(I)V
        //    23: return         
        //    24: aload_1        
        //    25: invokestatic    artc.f:(Larug;)[Ljava/lang/Object;
        //    28: astore_1       
        //    29: aload_0        
        //    30: iload_2        
        //    31: invokevirtual   android/os/Parcel.writeInt:(I)V
        //    34: iconst_0       
        //    35: istore_3       
        //    36: iload_3        
        //    37: iload_2        
        //    38: if_icmpge       253
        //    41: iload_3        
        //    42: iload_3        
        //    43: iadd           
        //    44: istore          4
        //    46: aload_1        
        //    47: iload           4
        //    49: aaload         
        //    50: checkcast       [B
        //    53: astore          5
        //    55: aload_0        
        //    56: aload           5
        //    58: arraylength    
        //    59: invokevirtual   android/os/Parcel.writeInt:(I)V
        //    62: aload_0        
        //    63: aload           5
        //    65: invokevirtual   android/os/Parcel.writeByteArray:([B)V
        //    68: aload_1        
        //    69: iload           4
        //    71: iconst_1       
        //    72: iadd           
        //    73: aaload         
        //    74: astore          6
        //    76: aload           6
        //    78: instanceof      [B
        //    81: ifeq            107
        //    84: aload           6
        //    86: checkcast       [B
        //    89: astore          5
        //    91: aload_0        
        //    92: aload           5
        //    94: arraylength    
        //    95: invokevirtual   android/os/Parcel.writeInt:(I)V
        //    98: aload_0        
        //    99: aload           5
        //   101: invokevirtual   android/os/Parcel.writeByteArray:([B)V
        //   104: goto            227
        //   107: aload           6
        //   109: instanceof      Larxe;
        //   112: ifeq            133
        //   115: aload_0        
        //   116: iconst_m1      
        //   117: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   120: aload           6
        //   122: checkcast       Larxe;
        //   125: aload_0        
        //   126: invokevirtual   arxe.a:(Landroid/os/Parcel;)I
        //   129: pop            
        //   130: goto            227
        //   133: invokestatic    arwk.b:()[B
        //   136: astore          5
        //   138: aload           6
        //   140: checkcast       Ljava/io/InputStream;
        //   143: astore          6
        //   145: iconst_0       
        //   146: istore          4
        //   148: aload           5
        //   150: arraylength    
        //   151: istore          7
        //   153: iload           4
        //   155: iload           7
        //   157: if_icmpge       195
        //   160: aload           6
        //   162: aload           5
        //   164: iload           4
        //   166: iload           7
        //   168: iload           4
        //   170: isub           
        //   171: invokevirtual   java/io/InputStream.read:([BII)I
        //   174: istore          8
        //   176: iload           8
        //   178: iconst_m1      
        //   179: if_icmpne       185
        //   182: goto            195
        //   185: iload           4
        //   187: iload           8
        //   189: iadd           
        //   190: istore          4
        //   192: goto            148
        //   195: iload           4
        //   197: iload           7
        //   199: if_icmpeq       233
        //   202: aload_0        
        //   203: iload           4
        //   205: invokevirtual   android/os/Parcel.writeInt:(I)V
        //   208: iload           4
        //   210: ifle            222
        //   213: aload_0        
        //   214: aload           5
        //   216: iconst_0       
        //   217: iload           4
        //   219: invokevirtual   android/os/Parcel.writeByteArray:([BII)V
        //   222: aload           5
        //   224: invokestatic    arwk.a:([B)V
        //   227: iinc            3, 1
        //   230: goto            36
        //   233: getstatic       io/grpc/Status.h:Lio/grpc/Status;
        //   236: ldc             "Metadata value too large"
        //   238: invokevirtual   io/grpc/Status.withDescription:(Ljava/lang/String;)Lio/grpc/Status;
        //   241: invokevirtual   io/grpc/Status.asException:()Lio/grpc/StatusException;
        //   244: athrow         
        //   245: astore_0       
        //   246: aload           5
        //   248: invokestatic    arwk.a:([B)V
        //   251: aload_0        
        //   252: athrow         
        //   253: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  138    145    245    253    Any
        //  148    153    245    253    Any
        //  160    176    245    253    Any
        //  202    208    245    253    Any
        //  213    222    245    253    Any
        //  233    245    245    253    Any
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
    
    private static byte[] c(final Parcel parcel, final int n, final int n2) {
        if (n2 + n <= 8192) {
            final byte[] array = new byte[n];
            if (n > 0) {
                parcel.readByteArray(array);
            }
            return array;
        }
        throw Status.h.withDescription("Metadata too large").asException();
    }
}
