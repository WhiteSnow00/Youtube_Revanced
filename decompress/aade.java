import java.util.Iterator;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aade implements aach
{
    private final Map a;
    
    public aade() {
        this.a = new HashMap();
    }
    
    public aade(final byte[] array) {
        final HashMap a = new HashMap();
        this.a = a;
        if (array.length > 0) {
            monitorenter(a);
            try {
                try {
                    a.clear();
                    final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(array));
                    for (int int1 = dataInputStream.readInt(), i = 0; i < int1; ++i) {
                        final String utf = dataInputStream.readUTF();
                        final byte byte1 = dataInputStream.readByte();
                        switch (byte1) {
                            default: {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Couldn't read extra of type: ");
                                sb.append(byte1);
                                throw new RuntimeException(sb.toString());
                            }
                            case 11: {
                                this.a.put(utf, dataInputStream.readDouble());
                                break;
                            }
                            case 10: {
                                final int int2 = dataInputStream.readInt();
                                final byte[] array2 = new byte[int2];
                                int read;
                                for (int j = 0; j < int2; j += read) {
                                    read = dataInputStream.read(array2, j, int2 - j);
                                    if (read == -1) {
                                        throw new IOException("Unexpected end of stream");
                                    }
                                }
                                this.a.put(utf, array2);
                                break;
                            }
                            case 9: {
                                this.a.put(utf, dataInputStream.readByte());
                                break;
                            }
                            case 8: {
                                final int int3 = dataInputStream.readInt();
                                final boolean[] array3 = new boolean[int3];
                                for (int k = 0; k < int3; ++k) {
                                    array3[k] = dataInputStream.readBoolean();
                                }
                                this.a.put(utf, array3);
                                break;
                            }
                            case 7: {
                                this.a.put(utf, dataInputStream.readBoolean());
                                break;
                            }
                            case 6: {
                                final int int4 = dataInputStream.readInt();
                                final int[] array4 = new int[int4];
                                for (int l = 0; l < int4; ++l) {
                                    array4[l] = dataInputStream.readInt();
                                }
                                this.a.put(utf, array4);
                                break;
                            }
                            case 5: {
                                this.a.put(utf, dataInputStream.readInt());
                                break;
                            }
                            case 4: {
                                final int int5 = dataInputStream.readInt();
                                final long[] array5 = new long[int5];
                                for (int n = 0; n < int5; ++n) {
                                    array5[n] = dataInputStream.readLong();
                                }
                                this.a.put(utf, array5);
                                break;
                            }
                            case 3: {
                                this.a.put(utf, dataInputStream.readLong());
                                break;
                            }
                            case 2: {
                                final int int6 = dataInputStream.readInt();
                                final String[] array6 = new String[int6];
                                for (int n2 = 0; n2 < int6; ++n2) {
                                    array6[n2] = dataInputStream.readUTF();
                                }
                                this.a.put(utf, array6);
                                break;
                            }
                            case 1: {
                                this.a.put(utf, dataInputStream.readUTF());
                                break;
                            }
                        }
                    }
                    dataInputStream.close();
                    monitorexit(a);
                }
                finally {
                    monitorexit(a);
                }
            }
            catch (final IOException ex) {}
        }
    }
    
    public final double a(final String s) {
        if (this.a.containsKey(s)) {
            return this.a.get(s);
        }
        return 0.0;
    }
    
    public final int b(final String s) {
        return this.c(s, 0);
    }
    
    public final int c(final String s, final int n) {
        if (this.a.containsKey(s)) {
            return this.a.get(s);
        }
        return n;
    }
    
    public final long d(final String s) {
        return this.e(s, 0L);
    }
    
    public final long e(final String s, final long n) {
        if (this.a.containsKey(s)) {
            return this.a.get(s);
        }
        return n;
    }
    
    public final afhk f() {
        return afhk.p(this.a.keySet());
    }
    
    public final String g(final String s) {
        return this.h(s, null);
    }
    
    public final String h(final String s, final String s2) {
        if (this.a.containsKey(s)) {
            return this.a.get(s);
        }
        return s2;
    }
    
    public final void i(final String s, final boolean b) {
        synchronized (this.a) {
            this.a.put(s, b);
        }
    }
    
    public final void j(final String s, final byte[] array) {
        synchronized (this.a) {
            this.a.put(s, array);
        }
    }
    
    public final void k(final String s, final double n) {
        synchronized (this.a) {
            this.a.put(s, n);
        }
    }
    
    public final void l(final String s, final int n) {
        synchronized (this.a) {
            this.a.put(s, n);
        }
    }
    
    public final void m(final String s, final long n) {
        synchronized (this.a) {
            this.a.put(s, n);
        }
    }
    
    public final void n(final String s, final String s2) {
        synchronized (this.a) {
            this.a.put(s, s2);
        }
    }
    
    public final boolean o(final String s) {
        return this.p(s, false);
    }
    
    public final boolean p(final String s, final boolean b) {
        if (this.a.containsKey(s)) {
            return this.a.get(s);
        }
        return b;
    }
    
    public final byte[] q(final String s) {
        if (this.a.containsKey(s)) {
            return this.a.get(s);
        }
        return null;
    }
    
    public final byte[] r() {
        final Map a = this.a;
        monitorenter(a);
        try {
            try {
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(this.a.size());
                for (final Map.Entry<String, V> entry : this.a.entrySet()) {
                    dataOutputStream.writeUTF(entry.getKey());
                    final V value = entry.getValue();
                    if (value instanceof String) {
                        dataOutputStream.writeByte(1);
                        dataOutputStream.writeUTF((String)value);
                    }
                    else {
                        final boolean b = value instanceof String[];
                        int i = 0;
                        final int n = 0;
                        final int n2 = 0;
                        final int n3 = 0;
                        if (b) {
                            dataOutputStream.writeByte(2);
                            final String[] array = (Object)value;
                            dataOutputStream.writeInt(array.length);
                            for (int j = n3; j < array.length; ++j) {
                                dataOutputStream.writeUTF(array[j]);
                            }
                        }
                        else if (value instanceof Long) {
                            dataOutputStream.writeByte(3);
                            dataOutputStream.writeLong((long)value);
                        }
                        else if (value instanceof long[]) {
                            dataOutputStream.writeByte(4);
                            final long[] array2 = (Object)value;
                            dataOutputStream.writeInt(array2.length);
                            while (i < array2.length) {
                                dataOutputStream.writeLong(array2[i]);
                                ++i;
                            }
                        }
                        else if (value instanceof Integer) {
                            dataOutputStream.writeByte(5);
                            dataOutputStream.writeInt((int)value);
                        }
                        else if (value instanceof int[]) {
                            dataOutputStream.writeByte(6);
                            final int[] array3 = (Object)value;
                            dataOutputStream.writeInt(array3.length);
                            for (int k = n; k < array3.length; ++k) {
                                dataOutputStream.writeInt(array3[k]);
                            }
                        }
                        else if (value instanceof Boolean) {
                            dataOutputStream.writeByte(7);
                            dataOutputStream.writeBoolean((boolean)value);
                        }
                        else if (value instanceof boolean[]) {
                            dataOutputStream.writeByte(8);
                            final boolean[] array4 = (Object)value;
                            dataOutputStream.writeInt(array4.length);
                            for (int l = n2; l < array4.length; ++l) {
                                dataOutputStream.writeBoolean(array4[l]);
                            }
                        }
                        else if (value instanceof Byte) {
                            dataOutputStream.writeByte(9);
                            dataOutputStream.writeByte((byte)value);
                        }
                        else if (value instanceof byte[]) {
                            dataOutputStream.writeByte(10);
                            final byte[] array5 = (Object)value;
                            dataOutputStream.writeInt(array5.length);
                            dataOutputStream.write(array5);
                        }
                        else {
                            if (!(value instanceof Double)) {
                                continue;
                            }
                            dataOutputStream.writeByte(11);
                            dataOutputStream.writeDouble((double)value);
                        }
                    }
                }
                dataOutputStream.flush();
                byteArrayOutputStream.flush();
                final byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                monitorexit(a);
                return byteArray;
            }
            finally {
                monitorexit(a);
                while (true) {}
            }
        }
        catch (final IOException ex) {}
    }
    
    public final String s() {
        return afbj.e(this.h("transfer_nonce", ""));
    }
}
