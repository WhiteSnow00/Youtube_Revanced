import java.util.Arrays;
import java.util.logging.Level;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

@arhd(b = { 4 })
public final class arhb extends argz
{
    private static final Logger k;
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public arhc g;
    public argy h;
    public final List i;
    byte[] j;
    
    static {
        k = Logger.getLogger(arhb.class.getName());
    }
    
    public arhb() {
        this.i = new ArrayList();
    }
    
    public final void a(final ByteBuffer byteBuffer) {
        this.a = cln.v(byteBuffer);
        final int v = cln.v(byteBuffer);
        this.b = v >>> 2;
        this.c = (v >> 1 & 0x1);
        this.d = cln.u(byteBuffer);
        this.e = cln.w(byteBuffer);
        this.f = cln.w(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            final int position = byteBuffer.position();
            final argz a = arhi.a(this.a, byteBuffer);
            final int n = byteBuffer.position() - position;
            final Logger k = arhb.k;
            final Level finer = Level.FINER;
            final String value = String.valueOf(a);
            Integer value2;
            if (a != null) {
                value2 = a.c();
            }
            else {
                value2 = null;
            }
            final String value3 = String.valueOf(value2);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 48 + String.valueOf(value3).length());
            sb.append(value);
            sb.append(" - DecoderConfigDescr1 read: ");
            sb.append(n);
            sb.append(", size: ");
            sb.append(value3);
            k.logp(finer, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor", "parseDetail", sb.toString());
            if (a != null) {
                final int c = a.c();
                if (n < c) {
                    byteBuffer.get(this.j = new byte[c - n]);
                }
            }
            if (a instanceof arhc) {
                this.g = (arhc)a;
            }
            if (a instanceof argy) {
                this.h = (argy)a;
            }
        }
        while (byteBuffer.remaining() > 2) {
            final long n2 = byteBuffer.position();
            final argz a2 = arhi.a(this.a, byteBuffer);
            final long n3 = byteBuffer.position();
            final Logger i = arhb.k;
            final Level finer2 = Level.FINER;
            final String value4 = String.valueOf(a2);
            Integer value5;
            if (a2 != null) {
                value5 = a2.c();
            }
            else {
                value5 = null;
            }
            final String value6 = String.valueOf(value5);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value4).length() + 57 + String.valueOf(value6).length());
            sb2.append(value4);
            sb2.append(" - DecoderConfigDescr2 read: ");
            sb2.append(n3 - n2);
            sb2.append(", size: ");
            sb2.append(value6);
            i.logp(finer2, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor", "parseDetail", sb2.toString());
            if (a2 instanceof arhj) {
                this.i.add(a2);
            }
        }
    }
    
    public final int b() {
        final argy h = this.h;
        int n;
        if (h == null) {
            n = 0;
        }
        else {
            h.b();
            n = 4;
        }
        return n + 15;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb.append(this.a);
        sb.append(", streamType=");
        sb.append(this.b);
        sb.append(", upStream=");
        sb.append(this.c);
        sb.append(", bufferSizeDB=");
        sb.append(this.d);
        sb.append(", maxBitRate=");
        sb.append(this.e);
        sb.append(", avgBitRate=");
        sb.append(this.f);
        sb.append(", decoderSpecificInfo=");
        sb.append(this.g);
        sb.append(", audioSpecificInfo=");
        sb.append(this.h);
        sb.append(", configDescriptorDeadBytes=");
        byte[] j;
        if ((j = this.j) == null) {
            j = new byte[0];
        }
        sb.append(dps.a(j));
        sb.append(", profileLevelIndicationDescriptors=");
        sb.append(Arrays.asList(this.i).toString());
        sb.append('}');
        return sb.toString();
    }
}
