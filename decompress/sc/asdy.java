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

public final class asdy implements asbt
{
    public int a;
    public arui b;
    public final asdw c;
    public final ByteBuffer d;
    public final asfr e;
    public boolean f;
    public int g;
    public int h;
    public long i;
    public auch j;
    private final asdx k;
    
    public asdy(final asdx k, final asfr e) {
        this.a = -1;
        this.b = (arui)arug.a;
        this.c = new asdw(this);
        this.d = ByteBuffer.allocate(5);
        this.h = -1;
        this.k = k;
        this.e = e;
    }
    
    public static int a(final InputStream inputStream, final OutputStream outputStream) {
        final asga asga = (asga)inputStream;
        final MessageLite a = asga.a;
        int serializedSize;
        if (a != null) {
            serializedSize = a.getSerializedSize();
            asga.a.writeTo(outputStream);
            asga.a = null;
        }
        else {
            final ByteArrayInputStream c = asga.c;
            if (c != null) {
                serializedSize = (int)asgc.a(c, outputStream);
                asga.c = null;
            }
            else {
                serializedSize = 0;
            }
        }
        return serializedSize;
    }
    
    public final void b(final boolean b, final boolean b2) {
        final auch j = this.j;
        this.j = null;
        this.k.w(j, b, b2);
        this.g = 0;
    }
    
    public final void c(final asdv asdv, final boolean b) {
        final Iterator iterator = asdv.a.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += ((auch)iterator.next()).o();
        }
        final ByteBuffer byteBuffer = (ByteBuffer)this.d.clear();
        this.d.put((byte)(b ? 1 : 0)).putInt(n);
        final auch n2 = aryu.n(5);
        n2.q(this.d.array(), 0, this.d.position());
        if (n == 0) {
            this.j = n2;
            return;
        }
        this.k.w(n2, false, false);
        this.g = 1;
        final List a = asdv.a;
        for (int i = 0; i < a.size() - 1; ++i) {
            this.k.w((auch)a.get(i), false, false);
        }
        this.j = (auch)a.get(a.size() - 1);
        this.i = n;
    }
    
    public final void d(final byte[] array, int n, int i) {
        while (i > 0) {
            final auch j = this.j;
            if (j != null && j.p() == 0) {
                this.b(false, false);
            }
            if (this.j == null) {
                this.j = aryu.n(i);
            }
            final int min = Math.min(i, this.j.p());
            this.j.q(array, n, min);
            n += min;
            i -= min;
        }
    }
}
