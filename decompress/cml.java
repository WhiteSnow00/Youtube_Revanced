import java.util.Set;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import android.util.Log;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cml
{
    public static final cml a;
    private static final String c;
    Map b;
    
    static {
        c = cmv.b("Data");
        a = ckp.a(new HashMap());
    }
    
    cml() {
    }
    
    public cml(final cml cml) {
        this.b = new HashMap(cml.b);
    }
    
    public cml(final Map map) {
        this.b = new HashMap(map);
    }
    
    public static cml a(byte[] ex) {
        if (ex.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        final HashMap hashMap = new HashMap();
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])(Object)ex);
        Exception ex2 = null;
        Label_0192: {
            try {
                final Object o = ex = (IOException)new ObjectInputStream(byteArrayInputStream);
                try {
                    try {
                        for (int i = ((ObjectInputStream)o).readInt(); i > 0; --i) {
                            ex = (IOException)o;
                            hashMap.put(((ObjectInputStream)o).readUTF(), ((ObjectInputStream)o).readObject());
                        }
                        try {
                            ((ObjectInputStream)o).close();
                        }
                        catch (final IOException ex) {
                            Log.e(cml.c, "Error in Data#fromByteArray: ", (Throwable)ex);
                        }
                        try {
                            byteArrayInputStream.close();
                            return new cml(hashMap);
                        }
                        catch (final IOException ex) {
                            Log.e(cml.c, "Error in Data#fromByteArray: ", (Throwable)ex);
                            return new cml(hashMap);
                        }
                    }
                    finally {
                        ex = (IOException)o;
                    }
                }
                catch (final ClassNotFoundException ex2) {}
                catch (final IOException ex2) {}
            }
            catch (final ClassNotFoundException ex3) {}
            catch (final IOException ex4) {}
            finally {
                break Label_0192;
            }
            final Object o = null;
            ex2 = ex;
            Log.e(cml.c, "Error in Data#fromByteArray: ", (Throwable)ex2);
            if (o != null) {
                try {
                    ((ObjectInputStream)o).close();
                }
                catch (final IOException ex5) {
                    Log.e(cml.c, "Error in Data#fromByteArray: ", (Throwable)ex5);
                }
            }
            byteArrayInputStream.close();
            return new cml(hashMap);
        }
        if (ex2 != null) {
            try {
                ((ObjectInputStream)ex2).close();
            }
            catch (final IOException ex6) {
                Log.e(cml.c, "Error in Data#fromByteArray: ", (Throwable)ex6);
            }
        }
        try {
            byteArrayInputStream.close();
        }
        catch (final IOException ex7) {
            Log.e(cml.c, "Error in Data#fromByteArray: ", (Throwable)ex7);
        }
    }
    
    public static byte[] e(cml o) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final Object o2 = null;
        Object o4;
        final Object o3 = o4 = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                o4 = o3;
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeInt(((cml)o).b.size());
                    final Iterator iterator = ((cml)o).b.entrySet().iterator();
                    while (iterator.hasNext()) {
                        o4 = iterator.next();
                        objectOutputStream.writeUTF(((Map.Entry<String, V>)o4).getKey());
                        objectOutputStream.writeObject(((Map.Entry)o4).getValue());
                    }
                    try {
                        objectOutputStream.close();
                    }
                    catch (final IOException ex) {
                        Log.e(cml.c, "Error in Data#toByteArray: ", (Throwable)ex);
                    }
                    try {
                        byteArrayOutputStream.close();
                    }
                    catch (final IOException ex2) {
                        Log.e(cml.c, "Error in Data#toByteArray: ", (Throwable)ex2);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                catch (final IOException o4) {}
                finally {
                    o4 = objectOutputStream;
                }
            }
            finally {}
        }
        catch (final IOException objectOutputStream) {
            o = o2;
        }
        Log.e(cml.c, "Error in Data#toByteArray: ", (Throwable)objectOutputStream);
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (o != null) {
            try {
                ((ObjectOutputStream)o).close();
            }
            catch (final IOException ex3) {
                Log.e(cml.c, "Error in Data#toByteArray: ", (Throwable)ex3);
            }
        }
        try {
            byteArrayOutputStream.close();
        }
        catch (final IOException ex4) {
            Log.e(cml.c, "Error in Data#toByteArray: ", (Throwable)ex4);
        }
        return byteArray;
        if (o4 != null) {
            try {
                ((ObjectOutputStream)o4).close();
            }
            catch (final IOException ex5) {
                Log.e(cml.c, "Error in Data#toByteArray: ", (Throwable)ex5);
            }
        }
        try {
            byteArrayOutputStream.close();
        }
        catch (final IOException ex6) {
            Log.e(cml.c, "Error in Data#toByteArray: ", (Throwable)ex6);
        }
        throw o;
    }
    
    public static Boolean[] f(final boolean[] array) {
        final Boolean[] array2 = new Boolean[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public static Byte[] g(final byte[] array) {
        final Byte[] array2 = new Byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public static Double[] h(final double[] array) {
        final Double[] array2 = new Double[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public static Float[] i(final float[] array) {
        final Float[] array2 = new Float[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public static Integer[] j(final int[] array) {
        final Integer[] array2 = new Integer[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public static Long[] k(final long[] array) {
        final Long[] array2 = new Long[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public final String b(final String s) {
        final String value = this.b.get(s);
        if (value instanceof String) {
            return value;
        }
        return null;
    }
    
    public final Map c() {
        return Collections.unmodifiableMap((Map<?, ?>)this.b);
    }
    
    public final byte[] d(final String s) {
        final Byte[] value = this.b.get(s);
        if (value instanceof Byte[]) {
            final Byte[] array = value;
            final byte[] array2 = new byte[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final cml cml = (cml)o;
        final Set keySet = this.b.keySet();
        if (!keySet.equals(cml.b.keySet())) {
            return false;
        }
        for (final String s : keySet) {
            final Object value = this.b.get(s);
            final Object value2 = cml.b.get(s);
            boolean b;
            if (value != null && value2 != null) {
                if (value instanceof Object[] && value2 instanceof Object[]) {
                    b = Arrays.deepEquals((Object[])value, (Object[])value2);
                }
                else {
                    b = value.equals(value2);
                }
            }
            else {
                b = (value == value2);
            }
            if (!b) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Data {");
        if (!this.b.isEmpty()) {
            for (final String s : this.b.keySet()) {
                sb.append(s);
                sb.append(" : ");
                final Object value = this.b.get(s);
                if (value instanceof Object[]) {
                    sb.append(Arrays.toString((Object[])value));
                }
                else {
                    sb.append(value);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
