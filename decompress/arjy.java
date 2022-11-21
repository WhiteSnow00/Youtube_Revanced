import java.util.logging.Level;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

@arjx(b = { 3 })
public final class arjy extends arjt
{
    private static final Logger m;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g;
    public int h;
    public int i;
    public arjv j;
    public arke k;
    public final List l;
    
    static {
        m = Logger.getLogger(arjy.class.getName());
    }
    
    public arjy() {
        this.f = 0;
        this.l = new ArrayList();
    }
    
    @Override
    public final void a(final ByteBuffer byteBuffer) {
        this.a = coh.g(byteBuffer);
        final int i = coh.i(byteBuffer);
        final int b = i >>> 7;
        this.b = b;
        this.c = (i >>> 6 & 0x1);
        this.d = (i >>> 5 & 0x1);
        this.e = (i & 0x1F);
        if (b == 1) {
            this.h = coh.g(byteBuffer);
        }
        if (this.c == 1) {
            final int j = coh.i(byteBuffer);
            this.f = j;
            this.g = coh.n(byteBuffer, j);
        }
        if (this.d == 1) {
            this.i = coh.g(byteBuffer);
        }
        final int v = super.V;
        final int b2 = this.b;
        int n = 0;
        int n2;
        if (b2 == 0) {
            n2 = 0;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (this.c == 1) {
            n3 = this.f + 1;
        }
        else {
            n3 = 0;
        }
        if (1 == this.d) {
            n = 2;
        }
        final int position = byteBuffer.position();
        final int c = this.c();
        int n5;
        final int n4 = n5 = v + 4 + n2 + n3 + n;
        if (c > n4 + 2) {
            final arjt a = arkc.a(-1, byteBuffer);
            final int position2 = byteBuffer.position();
            final Logger m = arjy.m;
            final Level finer = Level.FINER;
            final String value = String.valueOf(a);
            Integer value2;
            if (a != null) {
                value2 = a.c();
            }
            else {
                value2 = null;
            }
            final long n6 = position2 - position;
            final String value3 = String.valueOf(value2);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 51 + String.valueOf(value3).length());
            sb.append(value);
            sb.append(" - ESDescriptor1 read: ");
            sb.append(n6);
            sb.append(", size: ");
            sb.append(value3);
            m.logp(finer, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "parseDetail", sb.toString());
            int n7;
            if (a != null) {
                final int c2 = a.c();
                byteBuffer.position(position + c2);
                n7 = n4 + c2;
            }
            else {
                n7 = (int)(n4 + n6);
            }
            n5 = n7;
            if (a instanceof arjv) {
                this.j = (arjv)a;
                n5 = n7;
            }
        }
        final int position3 = byteBuffer.position();
        if (this.c() > n5 + 2) {
            final arjt a2 = arkc.a(-1, byteBuffer);
            final int position4 = byteBuffer.position();
            final Logger k = arjy.m;
            final Level finer2 = Level.FINER;
            final String value4 = String.valueOf(a2);
            Integer value5;
            if (a2 != null) {
                value5 = a2.c();
            }
            else {
                value5 = null;
            }
            final long n8 = position4 - position3;
            final String value6 = String.valueOf(value5);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value4).length() + 51 + String.valueOf(value6).length());
            sb2.append(value4);
            sb2.append(" - ESDescriptor2 read: ");
            sb2.append(n8);
            sb2.append(", size: ");
            sb2.append(value6);
            k.logp(finer2, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "parseDetail", sb2.toString());
            int n9;
            if (a2 != null) {
                final int c3 = a2.c();
                byteBuffer.position(position3 + c3);
                n9 = n5 + c3;
            }
            else {
                n9 = (int)(n5 + n8);
            }
            n5 = n9;
            if (a2 instanceof arke) {
                this.k = (arke)a2;
                n5 = n9;
            }
        }
        else {
            arjy.m.logp(Level.WARNING, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "parseDetail", "SLConfigDescriptor is missing!");
        }
        while (this.c() - n5 > 2) {
            final int position5 = byteBuffer.position();
            final arjt a3 = arkc.a(-1, byteBuffer);
            final int position6 = byteBuffer.position();
            final Logger l = arjy.m;
            final Level finer3 = Level.FINER;
            final String value7 = String.valueOf(a3);
            Integer value8;
            if (a3 != null) {
                value8 = a3.c();
            }
            else {
                value8 = null;
            }
            final long n10 = position6 - position5;
            final String value9 = String.valueOf(value8);
            final StringBuilder sb3 = new StringBuilder(String.valueOf(value7).length() + 51 + String.valueOf(value9).length());
            sb3.append(value7);
            sb3.append(" - ESDescriptor3 read: ");
            sb3.append(n10);
            sb3.append(", size: ");
            sb3.append(value9);
            l.logp(finer3, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "parseDetail", sb3.toString());
            if (a3 != null) {
                final int c4 = a3.c();
                byteBuffer.position(position5 + c4);
                n5 += c4;
            }
            else {
                n5 += (int)n10;
            }
            this.l.add(a3);
        }
    }
    
    public final int b() {
        final int b = this.b;
        final int c = this.c;
        int n;
        if (b == 0) {
            n = 5;
        }
        else {
            n = 7;
        }
        int n2 = n;
        if (c > 0) {
            n2 = n + (this.f + 1);
        }
        int n3 = n2;
        if (this.d > 0) {
            n3 = n2 + 2;
        }
        return n3 + this.j.b() + 3;
    }
    
    public final ByteBuffer d() {
        final ByteBuffer allocate = ByteBuffer.allocate(this.b());
        cop.l(allocate, 3);
        cop.l(allocate, this.b() - 2);
        cop.i(allocate, this.a);
        cop.l(allocate, this.b << 7 | this.c << 6 | this.d << 5 | this.e);
        if (this.b > 0) {
            cop.i(allocate, this.h);
        }
        if (this.c > 0) {
            cop.l(allocate, this.f);
            allocate.put(cop.e(this.g));
            cop.l(allocate, 0);
        }
        if (this.d > 0) {
            cop.i(allocate, this.i);
        }
        final arjv j = this.j;
        final ByteBuffer allocate2 = ByteBuffer.allocate(j.b());
        cop.l(allocate2, 4);
        cop.l(allocate2, j.b() - 2);
        cop.l(allocate2, j.a);
        final int b = j.b;
        final int c = j.c;
        cop.l(allocate2, b << 2 | c + c | 0x1);
        cop.j(allocate2, j.d);
        cop.k(allocate2, j.e);
        cop.k(allocate2, j.f);
        final arjs h = j.h;
        if (h != null) {
            h.b();
            final ByteBuffer allocate3 = ByteBuffer.allocate(4);
            cop.l(allocate3, 5);
            h.b();
            cop.l(allocate3, 2);
            final arju arju = new arju(allocate3);
            arju.a(h.d, 5);
            arju.a(h.e, 4);
            if (h.e == 15) {
                throw new UnsupportedOperationException("can't serialize that yet");
            }
            arju.a(h.g, 4);
            allocate2.put(allocate3.array());
        }
        final arke k = this.k;
        final ByteBuffer allocate4 = ByteBuffer.allocate(3);
        cop.l(allocate4, 6);
        cop.l(allocate4, 1);
        cop.l(allocate4, k.a);
        allocate.put(allocate2.array());
        allocate.put(allocate4.array());
        return allocate;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final arjy arjy = (arjy)o;
                if (this.c != arjy.c) {
                    return false;
                }
                if (this.f != arjy.f) {
                    return false;
                }
                if (this.h != arjy.h) {
                    return false;
                }
                if (this.a != arjy.a) {
                    return false;
                }
                if (this.i != arjy.i) {
                    return false;
                }
                if (this.d != arjy.d) {
                    return false;
                }
                if (this.b != arjy.b) {
                    return false;
                }
                if (this.e != arjy.e) {
                    return false;
                }
                final String g = this.g;
                Label_0166: {
                    if (g != null) {
                        if (g.equals(arjy.g)) {
                            break Label_0166;
                        }
                    }
                    else if (arjy.g == null) {
                        break Label_0166;
                    }
                    return false;
                }
                final arjv j = this.j;
                Label_0198: {
                    if (j != null) {
                        if (j.equals(arjy.j)) {
                            break Label_0198;
                        }
                    }
                    else if (arjy.j == null) {
                        break Label_0198;
                    }
                    return false;
                }
                if (this.l.equals(arjy.l)) {
                    final arke k = this.k;
                    if (k != null) {
                        if (k.equals(arjy.k)) {
                            return true;
                        }
                    }
                    else if (arjy.k == null) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final int e = this.e;
        final int f = this.f;
        final String g = this.g;
        int a2 = 0;
        int hashCode;
        if (g != null) {
            hashCode = g.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int h = this.h;
        final int i = this.i;
        final arjv j = this.j;
        int hashCode2;
        if (j != null) {
            hashCode2 = j.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final arke k = this.k;
        if (k != null) {
            a2 = k.a;
        }
        return ((((((((((a * 31 + b) * 31 + c) * 31 + d) * 31 + e) * 31 + f) * 31 + hashCode) * 961 + h) * 31 + i) * 31 + hashCode2) * 31 + a2) * 31 + this.l.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ESDescriptor{esId=");
        sb.append(this.a);
        sb.append(", streamDependenceFlag=");
        sb.append(this.b);
        sb.append(", URLFlag=");
        sb.append(this.c);
        sb.append(", oCRstreamFlag=");
        sb.append(this.d);
        sb.append(", streamPriority=");
        sb.append(this.e);
        sb.append(", URLLength=");
        sb.append(this.f);
        sb.append(", URLString='");
        sb.append(this.g);
        sb.append("', remoteODFlag=0, dependsOnEsId=");
        sb.append(this.h);
        sb.append(", oCREsId=");
        sb.append(this.i);
        sb.append(", decoderConfigDescriptor=");
        sb.append(this.j);
        sb.append(", slConfigDescriptor=");
        sb.append(this.k);
        sb.append('}');
        return sb.toString();
    }
}
