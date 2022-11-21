import java.nio.Buffer;
import java.security.PublicKey;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SignatureException;
import java.util.Arrays;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.security.Signature;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Iterator;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.io.IOException;
import java.util.Map;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.security.cert.X509Certificate;
import java.nio.channels.FileChannel;
import java.nio.BufferUnderflowException;
import java.nio.ByteOrder;
import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class cjo
{
    static void a(final View view, final int transitionVisibility) {
        view.setTransitionVisibility(transitionVisibility);
    }
    
    public static long b(final ByteBuffer byteBuffer, final int n) {
        return (long)byteBuffer.getInt(n) & 0xFFFFFFFFL;
    }
    
    public static Pair c(final RandomAccessFile randomAccessFile, int i) {
        final long length = randomAccessFile.length();
        if (length < 22L) {
            return null;
        }
        final ByteBuffer allocate = ByteBuffer.allocate((int)Math.min(i, -22L + length) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        final long n = length - allocate.capacity();
        randomAccessFile.seek(n);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        d(allocate);
        i = allocate.capacity();
        Label_0166: {
            if (i >= 22) {
                final int n2 = i - 22;
                int min;
                int n3;
                for (min = Math.min(n2, 65535), i = 0; i < min; ++i) {
                    n3 = n2 - i;
                    if (allocate.getInt(n3) == 101010256 && (char)allocate.getShort(n3 + 20) == i) {
                        i = n3;
                        break Label_0166;
                    }
                }
            }
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        allocate.position(i);
        final ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create((Object)slice, (Object)(n + i));
    }
    
    public static void d(final ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }
    
    public static ByteBuffer e(final ByteBuffer byteBuffer, int n) {
        final int limit = byteBuffer.limit();
        final int position = byteBuffer.position();
        n += position;
        if (n >= position && n <= limit) {
            byteBuffer.limit(n);
            try {
                final ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(n);
                return slice;
            }
            finally {
                byteBuffer.limit(limit);
            }
        }
        throw new BufferUnderflowException();
    }
    
    public static X509Certificate[][] f(final FileChannel ex, final dat dat) {
        final HashMap hashMap = new HashMap();
        final ArrayList list = new ArrayList();
        try {
            final CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                final ByteBuffer j = j(dat.a);
                int n = 0;
                while (j.hasRemaining()) {
                    ++n;
                    try {
                        list.add(m(j(j), hashMap, instance));
                        continue;
                    }
                    catch (final SecurityException ex) {}
                    catch (final BufferUnderflowException ex) {}
                    catch (final IOException ex2) {}
                    final StringBuilder sb = new StringBuilder("Failed to parse/verify signer #");
                    sb.append(n);
                    sb.append(" block");
                    throw new SecurityException(sb.toString(), ex);
                }
                if (n <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (!hashMap.isEmpty()) {
                    k(hashMap, (FileChannel)ex, dat.b, dat.c, dat.d, dat.e);
                    return (X509Certificate[][])list.toArray(new X509Certificate[list.size()][]);
                }
                throw new SecurityException("No content digests found");
            }
            catch (final IOException ex3) {
                throw new SecurityException("Failed to read list of signers", ex3);
            }
        }
        catch (final CertificateException ex4) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", ex4);
        }
    }
    
    private static int g(final int n) {
        if (n == 1) {
            return 32;
        }
        if (n == 2) {
            return 64;
        }
        final StringBuilder sb = new StringBuilder("Unknown content digest algorthm: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static int h(final int n) {
        if (n != 513) {
            if (n != 514) {
                if (n == 769) {
                    return 1;
                }
                switch (n) {
                    default: {
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(n))));
                    }
                    case 258:
                    case 260: {
                        break;
                    }
                    case 257:
                    case 259: {
                        return 1;
                    }
                }
            }
            return 2;
        }
        return 1;
    }
    
    private static String i(final int n) {
        if (n == 1) {
            return "SHA-256";
        }
        if (n == 2) {
            return "SHA-512";
        }
        final StringBuilder sb = new StringBuilder("Unknown content digest algorthm: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static ByteBuffer j(final ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            final int remaining = byteBuffer.remaining();
            final StringBuilder sb = new StringBuilder("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            sb.append(remaining);
            throw new IOException(sb.toString());
        }
        final int int1 = byteBuffer.getInt();
        if (int1 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (int1 <= byteBuffer.remaining()) {
            return e(byteBuffer, int1);
        }
        final int remaining2 = byteBuffer.remaining();
        final StringBuilder sb2 = new StringBuilder("Length-prefixed field longer than remaining buffer. Field length: ");
        sb2.append(int1);
        sb2.append(", remaining: ");
        sb2.append(remaining2);
        throw new IOException(sb2.toString());
    }
    
    private static void k(final Map map, final FileChannel fileChannel, final long n, final long n2, final long n3, ByteBuffer duplicate) {
        if (!map.isEmpty()) {
            final das das = new das(fileChannel, 0L, n);
            final das das2 = new das(fileChannel, n2, n3 - n2);
            duplicate = duplicate.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            d(duplicate);
            final int position = duplicate.position();
            if (n >= 0L && n <= 4294967295L) {
                duplicate.putInt(duplicate.position() + (position + 16), (int)n);
                final daq daq = new daq(duplicate);
                final int size = map.size();
                final int[] array = new int[size];
                final Iterator iterator = map.keySet().iterator();
                final int n4 = 0;
                int n5 = 0;
                while (iterator.hasNext()) {
                    array[n5] = (int)iterator.next();
                    ++n5;
                }
                try {
                    final byte[][] n6 = n(array, new dar[] { (dar)das, (dar)das2, (dar)daq });
                    for (int i = n4; i < size; ++i) {
                        final int n7 = array[i];
                        if (!MessageDigest.isEqual((byte[])map.get(n7), n6[i])) {
                            throw new SecurityException(i(n7).concat(" digest of contents did not verify"));
                        }
                    }
                    return;
                }
                catch (final DigestException ex) {
                    throw new SecurityException("Failed to compute digest(s) of contents", ex);
                }
            }
            final StringBuilder sb = new StringBuilder("uint32 value of out range: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new SecurityException("No digests provided");
    }
    
    private static byte[] l(final ByteBuffer byteBuffer) {
        final int int1 = byteBuffer.getInt();
        if (int1 < 0) {
            throw new IOException("Negative length");
        }
        if (int1 <= byteBuffer.remaining()) {
            final byte[] array = new byte[int1];
            byteBuffer.get(array);
            return array;
        }
        final int remaining = byteBuffer.remaining();
        final StringBuilder sb = new StringBuilder("Underflow while reading length-prefixed value. Length: ");
        sb.append(int1);
        sb.append(", available: ");
        sb.append(remaining);
        throw new IOException(sb.toString());
    }
    
    private static X509Certificate[] m(ByteBuffer parameter, final Map map, final CertificateFactory certificateFactory) {
        final ByteBuffer j = j((ByteBuffer)parameter);
        final ByteBuffer i = j((ByteBuffer)parameter);
        final byte[] l = l((ByteBuffer)parameter);
        final ArrayList list = new ArrayList();
        final BufferUnderflowException ex = null;
        byte[] k = null;
        int n = -1;
        int n2 = 0;
        while (i.hasRemaining()) {
            final int n3 = n2 + 1;
            try {
                parameter = (BufferUnderflowException)j(i);
                if (((Buffer)parameter).remaining() >= 8) {
                    final int int1 = ((ByteBuffer)parameter).getInt();
                    list.add(int1);
                    if (int1 != 513 && int1 != 514 && int1 != 769) {
                        switch (int1) {
                            default: {
                                n2 = n3;
                                continue;
                            }
                            case 257:
                            case 258:
                            case 259:
                            case 260: {
                                break;
                            }
                        }
                    }
                    if (n != -1) {
                        final int h = h(int1);
                        final int h2 = h(n);
                        n2 = n3;
                        if (h == 1) {
                            continue;
                        }
                        if (h2 != 1) {
                            n2 = n3;
                            continue;
                        }
                    }
                    k = l((ByteBuffer)parameter);
                    n = int1;
                    n2 = n3;
                    continue;
                }
                parameter = (BufferUnderflowException)new SecurityException("Signature record too short");
                throw parameter;
            }
            catch (final BufferUnderflowException parameter) {}
            catch (final IOException ex2) {}
            final StringBuilder sb = new StringBuilder("Failed to parse signature record #");
            sb.append(n3);
            throw new SecurityException(sb.toString(), parameter);
        }
        if (n != -1) {
            String s;
            if (n != 513 && n != 514) {
                if (n != 769) {
                    switch (n) {
                        default: {
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(n))));
                        }
                        case 257:
                        case 258:
                        case 259:
                        case 260: {
                            s = "RSA";
                            break;
                        }
                    }
                }
                else {
                    s = "DSA";
                }
            }
            else {
                s = "EC";
            }
            Pair pair;
            if (n != 513) {
                if (n != 514) {
                    if (n != 769) {
                        switch (n) {
                            default: {
                                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(n))));
                            }
                            case 260: {
                                pair = Pair.create((Object)"SHA512withRSA", (Object)null);
                                break;
                            }
                            case 259: {
                                pair = Pair.create((Object)"SHA256withRSA", (Object)null);
                                break;
                            }
                            case 258: {
                                pair = Pair.create((Object)"SHA512withRSA/PSS", (Object)new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                                break;
                            }
                            case 257: {
                                pair = Pair.create((Object)"SHA256withRSA/PSS", (Object)new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                                break;
                            }
                        }
                    }
                    else {
                        pair = Pair.create((Object)"SHA256withDSA", (Object)null);
                    }
                }
                else {
                    pair = Pair.create((Object)"SHA512withECDSA", (Object)null);
                }
            }
            else {
                pair = Pair.create((Object)"SHA256withECDSA", (Object)null);
            }
            final String s2 = (String)pair.first;
            parameter = (BufferUnderflowException)pair.second;
            try {
                final PublicKey generatePublic = KeyFactory.getInstance(s).generatePublic(new X509EncodedKeySpec(l));
                final Signature instance = Signature.getInstance(s2);
                instance.initVerify(generatePublic);
                if (parameter != null) {
                    instance.setParameter((AlgorithmParameterSpec)parameter);
                }
                instance.update(j);
                if (!instance.verify(k)) {
                    throw new SecurityException(String.valueOf(s2).concat(" signature did not verify"));
                }
                j.clear();
                final ByteBuffer m = j(j);
                final ArrayList list2 = new ArrayList();
                int n4 = 0;
                parameter = ex;
                while (m.hasRemaining()) {
                    final int n5 = n4 + 1;
                    try {
                        final ByteBuffer j2 = j(m);
                        if (j2.remaining() < 8) {
                            parameter = (BufferUnderflowException)new IOException("Record too short");
                            throw parameter;
                        }
                        final int int2 = j2.getInt();
                        list2.add(int2);
                        n4 = n5;
                        if (int2 == n) {
                            parameter = (BufferUnderflowException)(Object)l(j2);
                            n4 = n5;
                            continue;
                        }
                        continue;
                    }
                    catch (final BufferUnderflowException parameter) {}
                    catch (final IOException ex3) {}
                    final StringBuilder sb2 = new StringBuilder("Failed to parse digest record #");
                    sb2.append(n5);
                    throw new IOException(sb2.toString(), parameter);
                }
                if (!list.equals(list2)) {
                    throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                }
                final int h3 = h(n);
                final byte[] array = map.put(h3, parameter);
                if (array != null && !MessageDigest.isEqual(array, (byte[])(Object)parameter)) {
                    throw new SecurityException(i(h3).concat(" contents digest does not match the digest specified by a preceding signer"));
                }
                parameter = (BufferUnderflowException)j(j);
                final ArrayList list3 = new ArrayList();
                int n6 = 0;
                while (((Buffer)parameter).hasRemaining()) {
                    ++n6;
                    final byte[] l2 = l((ByteBuffer)parameter);
                    try {
                        list3.add(new dav((X509Certificate)certificateFactory.generateCertificate(new ByteArrayInputStream(l2)), l2));
                        continue;
                    }
                    catch (final CertificateException parameter) {
                        final StringBuilder sb3 = new StringBuilder("Failed to decode certificate #");
                        sb3.append(n6);
                        throw new SecurityException(sb3.toString(), parameter);
                    }
                    break;
                }
                if (list3.isEmpty()) {
                    throw new SecurityException("No certificates listed");
                }
                if (Arrays.equals(l, ((X509Certificate)list3.get(0)).getPublicKey().getEncoded())) {
                    return (X509Certificate[])list3.toArray(new X509Certificate[list3.size()]);
                }
                throw new SecurityException("Public key mismatch between certificate and signature record");
            }
            catch (final SignatureException parameter) {}
            catch (final InvalidAlgorithmParameterException parameter) {}
            catch (final InvalidKeyException parameter) {}
            catch (final InvalidKeySpecException parameter) {}
            catch (final NoSuchAlgorithmException ex4) {}
            final StringBuilder sb4 = new StringBuilder("Failed to verify ");
            sb4.append(s2);
            sb4.append(" signature");
            throw new SecurityException(sb4.toString(), parameter);
        }
        if (n2 == 0) {
            throw new SecurityException("No signatures found");
        }
        throw new SecurityException("No supported signatures found");
    }
    
    private static byte[][] n(final int[] array, dar[] i) {
        long n = 0L;
        for (int j = 0; j < 3; ++j) {
            n += (i[j].a() + 1048575L) / 1048576L;
        }
        if (n < 2097151L) {
            final byte[][] array2 = new byte[array.length][];
            int n2 = 0;
            int length;
            while (true) {
                length = array.length;
                if (n2 >= length) {
                    break;
                }
                final int n3 = (int)n;
                final byte[] array3 = new byte[g(array[n2]) * n3 + 5];
                array3[0] = 90;
                o(n3, array3);
                array2[n2] = array3;
                ++n2;
            }
            final byte[] array4 = new byte[5];
            array4[0] = -91;
            final MessageDigest[] array5 = new MessageDigest[length];
            int k = 0;
            while (k < array.length) {
                final String l = i(array[k]);
                try {
                    array5[k] = MessageDigest.getInstance(l);
                    ++k;
                    continue;
                }
                catch (final NoSuchAlgorithmException ex) {
                    throw new RuntimeException(l.concat(" digest not supported"), ex);
                }
                break;
            }
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            while (n4 < 3) {
                final dar dar = i[n4];
                long a = dar.a();
                long n7 = 0L;
                while (a > 0L) {
                    final int n8 = (int)Math.min(a, 1048576L);
                    o(n8, array4);
                    for (int n9 = 0; n9 < length; ++n9) {
                        array5[n9].update(array4);
                    }
                    try {
                        dar.b(array5, n7, n8);
                        for (int n10 = 0; n10 < array.length; ++n10) {
                            final int n11 = array[n10];
                            final byte[] array6 = array2[n10];
                            final int g = g(n11);
                            final MessageDigest messageDigest = array5[n10];
                            final int digest = messageDigest.digest(array6, n5 * g + 5, g);
                            if (digest != g) {
                                final String algorithm = messageDigest.getAlgorithm();
                                final StringBuilder sb = new StringBuilder("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        final long n12 = n8;
                        n7 += n12;
                        a -= n12;
                        ++n5;
                        continue;
                    }
                    catch (final IOException ex2) {
                        final StringBuilder sb2 = new StringBuilder("Failed to digest chunk #");
                        sb2.append(n5);
                        sb2.append(" of section #");
                        sb2.append(n6);
                        throw new DigestException(sb2.toString(), ex2);
                    }
                    break;
                }
                ++n6;
                ++n4;
            }
            final byte[][] array7 = new byte[array.length][];
            int n13 = 0;
            while (n13 < array.length) {
                final int n14 = array[n13];
                final byte[] array8 = array2[n13];
                i = (dar[])(Object)i(n14);
                try {
                    array7[n13] = MessageDigest.getInstance((String)(Object)i).digest(array8);
                    ++n13;
                    continue;
                }
                catch (final NoSuchAlgorithmException ex3) {
                    throw new RuntimeException(((String)(Object)i).concat(" digest not supported"), ex3);
                }
                break;
            }
            return array7;
        }
        final StringBuilder sb3 = new StringBuilder("Too many chunks: ");
        sb3.append(n);
        throw new DigestException(sb3.toString());
    }
    
    private static void o(final int n, final byte[] array) {
        array[1] = (byte)(n & 0xFF);
        array[2] = (byte)(n >>> 8 & 0xFF);
        array[3] = (byte)(n >>> 16 & 0xFF);
        array[4] = (byte)(n >> 24);
    }
}
