import java.util.Collection;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import android.database.Cursor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coh
{
    static boolean a(final Context context) {
        return context.isDeviceProtectedStorage();
    }
    
    public static cqt b(final cqu cqu, final cqz cqz) {
        final String a = cqz.a;
        final int b = cqz.b;
        final cfy a2 = cfy.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        a2.g(1, a);
        a2.e(2, b);
        final cqy cqy = (cqy)cqu;
        cqy.a.j();
        final Cursor e = byp.e(cqy.a, (cgv)a2, false);
        try {
            final int d = bsj.d(e, "work_spec_id");
            final int d2 = bsj.d(e, "generation");
            final int d3 = bsj.d(e, "system_id");
            final boolean moveToFirst = e.moveToFirst();
            cqt cqt = null;
            final String s = null;
            if (moveToFirst) {
                String string;
                if (e.isNull(d)) {
                    string = s;
                }
                else {
                    string = e.getString(d);
                }
                cqt = new cqt(string, e.getInt(d2), e.getInt(d3));
            }
            return cqt;
        }
        finally {
            e.close();
            a2.j();
        }
    }
    
    public static double c(final ByteBuffer byteBuffer) {
        final byte[] array = new byte[4];
        byteBuffer.get(array);
        final double n = (array[0] << 24 & 0xFF000000) | (array[1] << 16 & 0xFF0000) | (0xFF00 & array[2] << 8) | (array[3] & 0xFF);
        Double.isNaN(n);
        return n / 1.073741824E9;
    }
    
    public static double d(final ByteBuffer byteBuffer) {
        final byte[] array = new byte[4];
        byteBuffer.get(array);
        final double n = (array[0] << 24 & 0xFF000000) | (array[1] << 16 & 0xFF0000) | (0xFF00 & array[2] << 8) | (array[3] & 0xFF);
        Double.isNaN(n);
        return n / 65536.0;
    }
    
    public static float e(final ByteBuffer byteBuffer) {
        final byte[] array = new byte[2];
        byteBuffer.get(array);
        return (short)((short)(array[0] << 8 & 0xFF00) | (array[1] & 0xFF)) / 256.0f;
    }
    
    public static int f(final byte b) {
        int n = b;
        if (b < 0) {
            n = b + 256;
        }
        return n;
    }
    
    public static int g(final ByteBuffer byteBuffer) {
        return (f(byteBuffer.get()) << 8) + f(byteBuffer.get());
    }
    
    public static int h(final ByteBuffer byteBuffer) {
        return (g(byteBuffer) << 8) + f(byteBuffer.get());
    }
    
    public static int i(final ByteBuffer byteBuffer) {
        return f(byteBuffer.get());
    }
    
    public static long j(final ByteBuffer byteBuffer) {
        long n2;
        final long n = n2 = byteBuffer.getInt();
        if (n < 0L) {
            n2 = n + 4294967296L;
        }
        return n2;
    }
    
    public static long k(final ByteBuffer byteBuffer) {
        final long n = j(byteBuffer) << 32;
        if (n >= 0L) {
            return n + j(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
    
    public static String l(final ByteBuffer byteBuffer) {
        final byte[] array = new byte[4];
        byteBuffer.get(array);
        try {
            return new String(array, "ISO-8859-1");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static String m(final ByteBuffer byteBuffer) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            final byte value = byteBuffer.get();
            if (value == 0) {
                break;
            }
            byteArrayOutputStream.write(value);
        }
        return cop.d(byteArrayOutputStream.toByteArray());
    }
    
    public static String n(final ByteBuffer byteBuffer, final int n) {
        final byte[] array = new byte[n];
        byteBuffer.get(array);
        return cop.d(array);
    }
    
    public static Object o(final Object o) {
        s(o, "Argument must not be null");
        return o;
    }
    
    public static void p(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(s);
    }
    
    public static void q(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
    
    public static void r(final Collection collection) {
        if (!collection.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }
    
    public static void s(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new NullPointerException(s);
    }
}
