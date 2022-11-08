import java.util.Arrays;
import java.util.logging.Level;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

@areo(b = { 4 })
public final class arem extends arek
{
    private static final Logger k;
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public aren g;
    public arej h;
    public final List i;
    byte[] j;
    
    static {
        k = Logger.getLogger(arem.class.getName());
    }
    
    public arem() {
        this.i = new ArrayList();
    }
    
    public final void a(final ByteBuffer byteBuffer) {
        this.a = clm.v(byteBuffer);
        final int v = clm.v(byteBuffer);
        this.b = v >>> 2;
        this.c = (v >> 1 & 0x1);
        this.d = clm.u(byteBuffer);
        this.e = clm.w(byteBuffer);
        this.f = clm.w(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            final int position = byteBuffer.position();
            final arek a = aret.a(this.a, byteBuffer);
            final int n = byteBuffer.position() - position;
            final Logger k = arem.k;
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
            if (a instanceof aren) {
                this.g = (aren)a;
            }
            if (a instanceof arej) {
                this.h = (arej)a;
            }
        }
        while (byteBuffer.remaining() > 2) {
            final int position2 = byteBuffer.position();
            final arek a2 = aret.a(this.a, byteBuffer);
            final long n2 = byteBuffer.position();
            final long n3 = position2;
            final Logger i = arem.k;
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
            sb2.append(n2 - n3);
            sb2.append(", size: ");
            sb2.append(value6);
            i.logp(finer2, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor", "parseDetail", sb2.toString());
            if (a2 instanceof areu) {
                this.i.add(a2);
            }
        }
    }
    
    public final int b() {
        final arej h = this.h;
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
        sb.append(dpr.a(j));
        sb.append(", profileLevelIndicationDescriptors=");
        sb.append(Arrays.asList(this.i).toString());
        sb.append('}');
        return sb.toString();
    }
}
