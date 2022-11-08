import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqh extends ardf
{
    public String a;
    public String b;
    private long c;
    private long d;
    private long e;
    private boolean f;
    private long g;
    
    static {
        final HashMap hashMap = new HashMap();
        hashMap.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        hashMap.put("mdir", "Apple Meta Data iTunes Reader");
        hashMap.put("mp7b", "MPEG-7 binary XML");
        hashMap.put("mp7t", "MPEG-7 XML");
        hashMap.put("vide", "Video Track");
        hashMap.put("soun", "Sound Track");
        hashMap.put("hint", "Hint Track");
        hashMap.put("appl", "Apple specific");
        hashMap.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public dqh() {
        super("hdlr");
        this.b = null;
        this.f = true;
    }
    
    protected final long h() {
        int n;
        if (this.f) {
            n = cod.d(this.b) + 25;
        }
        else {
            n = cod.d(this.b) + 24;
        }
        return n;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        this.g = clm.w(byteBuffer);
        this.a = clm.y(byteBuffer);
        this.c = clm.w(byteBuffer);
        this.d = clm.w(byteBuffer);
        this.e = clm.w(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.f = false;
            return;
        }
        final String a = clm.A(byteBuffer, byteBuffer.remaining());
        this.b = a;
        if (a.endsWith("\u0000")) {
            final String b = this.b;
            this.b = b.substring(0, b.length() - 1);
            this.f = true;
            return;
        }
        this.f = false;
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        clm.m(byteBuffer, this.g);
        byteBuffer.put(dps.b(this.a));
        clm.m(byteBuffer, this.c);
        clm.m(byteBuffer, this.d);
        clm.m(byteBuffer, this.e);
        final String b = this.b;
        if (b != null) {
            byteBuffer.put(cod.f(b));
        }
        if (this.f) {
            byteBuffer.put((byte)0);
        }
    }
    
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 30 + String.valueOf(b).length());
        sb.append("HandlerBox[handlerType=");
        sb.append(a);
        sb.append(";name=");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
}
