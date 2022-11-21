import java.util.List;
import java.util.Iterator;
import java.io.ByteArrayInputStream;
import com.google.protobuf.MessageLite;
import java.io.OutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asgu implements aseo
{
    public int a;
    public arxc b;
    public final asgs c;
    public final ByteBuffer d;
    public final asin e;
    public boolean f;
    public int g;
    public int h;
    public long i;
    public agpb j;
    private final asgt k;
    
    public asgu(final asgt k, final asin e) {
        this.a = -1;
        this.b = (arxc)arxa.a;
        this.c = new asgs(this);
        this.d = ByteBuffer.allocate(5);
        this.h = -1;
        this.k = k;
        this.e = e;
    }
    
    public static int a(final InputStream inputStream, final OutputStream outputStream) {
        final asiw asiw = (asiw)inputStream;
        final MessageLite a = asiw.a;
        int serializedSize;
        if (a != null) {
            serializedSize = a.getSerializedSize();
            asiw.a.writeTo(outputStream);
            asiw.a = null;
        }
        else {
            final ByteArrayInputStream c = asiw.c;
            if (c != null) {
                serializedSize = (int)asiy.a((InputStream)c, outputStream);
                asiw.c = null;
            }
            else {
                serializedSize = 0;
            }
        }
        return serializedSize;
    }
    
    public final void b(final boolean b, final boolean b2) {
        final agpb j = this.j;
        this.j = null;
        this.k.w(j, b, b2);
        this.g = 0;
    }
    
    public final void c(final asgr asgr, final boolean b) {
        final Iterator iterator = asgr.a.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += ((agpb)iterator.next()).P();
        }
        final ByteBuffer byteBuffer = (ByteBuffer)this.d.clear();
        this.d.put((byte)(b ? 1 : 0)).putInt(n);
        final agpb i = asbq.i(5);
        i.R(this.d.array(), 0, this.d.position());
        if (n == 0) {
            this.j = i;
            return;
        }
        this.k.w(i, false, false);
        this.g = 1;
        final List a = asgr.a;
        for (int j = 0; j < a.size() - 1; ++j) {
            this.k.w((agpb)a.get(j), false, false);
        }
        this.j = (agpb)a.get(a.size() - 1);
        this.i = n;
    }
    
    public final void d(final byte[] array, int n, int i) {
        while (i > 0) {
            final agpb j = this.j;
            if (j != null && j.Q() == 0) {
                this.b(false, false);
            }
            if (this.j == null) {
                this.j = asbq.i(i);
            }
            final int min = Math.min(i, this.j.Q());
            this.j.R(array, n, min);
            n += min;
            i -= min;
        }
    }
}
