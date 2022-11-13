import java.util.concurrent.atomic.AtomicReference;
import java.io.IOException;
import java.io.DataInput;
import android.opengl.GLException;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public class aucl
{
    public static UploadDataProvider a(final byte[] array, final int n, final int n2) {
        return new aucq(ByteBuffer.wrap(array, n, n2).slice());
    }
    
    public static int b(final int n) {
        final int[] array = { 0 };
        GLES20.glGenTextures(1, array, 0);
        final int n2 = array[0];
        GLES20.glBindTexture(n, n2);
        GLES20.glTexParameterf(n, 10241, 9729.0f);
        GLES20.glTexParameterf(n, 10240, 9729.0f);
        GLES20.glTexParameterf(n, 10242, 33071.0f);
        GLES20.glTexParameterf(n, 10243, 33071.0f);
        d("generateTexture");
        return n2;
    }
    
    public static FloatBuffer c(final float[] array) {
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        final FloatBuffer floatBuffer = allocateDirect.asFloatBuffer();
        floatBuffer.put(array);
        floatBuffer.position(0);
        return floatBuffer;
    }
    
    public static void d(final String s) {
        final int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Object o;
            if (glGetError == 1285) {
                o = new aule(s);
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(": GLES20 error: ");
                sb.append(glGetError);
                o = new GLException(glGetError, sb.toString());
            }
            throw o;
        }
    }
    
    public static long e(final DataInput dataInput) {
        final int unsignedByte = dataInput.readUnsignedByte();
        final int n = unsignedByte >> 6;
        long n2;
        long n3;
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    return dataInput.readLong();
                }
                n2 = unsignedByte << 26 >> 26;
                n3 = 1800000L;
            }
            else {
                n2 = ((long)unsignedByte << 58 >> 26 | (long)(dataInput.readUnsignedByte() << 24) | (long)(dataInput.readUnsignedByte() << 16) | (long)(dataInput.readUnsignedByte() << 8) | (long)dataInput.readUnsignedByte());
                n3 = 1000L;
            }
        }
        else {
            n2 = (dataInput.readUnsignedByte() | (unsignedByte << 26 >> 2 | dataInput.readUnsignedByte() << 16 | dataInput.readUnsignedByte() << 8));
            n3 = 60000L;
        }
        return n2 * n3;
    }
    
    public static auft f(final DataInput dataInput, final String s) {
        final int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return new aujt(aujw.o(dataInput, s));
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return aujw.o(dataInput, s);
            }
            throw new IOException("Invalid encoding");
        }
        else {
            final aujz aujz = new aujz(s, dataInput.readUTF(), (int)e(dataInput), (int)e(dataInput));
            if (aujz.equals((Object)auft.a)) {
                return auft.a;
            }
            return aujz;
        }
    }
    
    public static atpm g(final boolean b) {
        return new atpm(b, (aucl)atpq.a, (byte[])null);
    }
    
    public static atpo h(final long n) {
        return new atpo(n, (aucl)atpq.a, (byte[])null);
    }
    
    public static atpp i(final Object o) {
        return new atpp(o, (aucl)atpq.a, (byte[])null);
    }
    
    public static atpn j() {
        return new atpn((aucl)atpq.a, (byte[])null);
    }
    
    public static void k(final Class clazz) {
        final String name = clazz.getName();
        final StringBuilder sb = new StringBuilder("It is not allowed to subscribe with a(n) ");
        sb.append(name);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(name);
        sb.append(" and subscribe that to the target source instead.");
        atqx.j((Throwable)new asjc(sb.toString()));
    }
    
    public static void l(final AtomicReference atomicReference, final asir asir, final Class clazz) {
        askk.b((Object)asir, "next is null");
        while (!atomicReference.compareAndSet(null, asir)) {
            if (atomicReference.get() != null) {
                asir.dispose();
                if (atomicReference.get() != asjv.a) {
                    k(clazz);
                }
            }
        }
    }
    
    public static boolean m(final AtomicReference atomicReference, final Object o, final Object o2) {
        while (!atomicReference.compareAndSet(o, o2)) {
            if (atomicReference.get() != o) {
                return false;
            }
        }
        return true;
    }
}
