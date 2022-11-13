import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhr extends arfu
{
    public List a;
    private int b;
    
    public arhr() {
        super("sgpd");
        this.a = new LinkedList();
        super.q = 1;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final arhr arhr = (arhr)o;
        if (this.b != arhr.b) {
            return false;
        }
        final List a = this.a;
        if (a != null) {
            if (a.equals(arhr.a)) {
                return true;
            }
        }
        else if (arhr.a == null) {
            return true;
        }
        return false;
    }
    
    protected final long h() {
        final int s = this.s();
        final Iterator iterator = this.a.iterator();
        long n;
        if (s == 1) {
            n = 12L;
        }
        else {
            n = 8L;
        }
        long n2 = n + 4L;
        while (iterator.hasNext()) {
            final arhn arhn = (arhn)iterator.next();
            long n3 = n2;
            if (this.s() == 1) {
                n3 = n2;
                if (this.b == 0) {
                    n3 = n2 + 4L;
                }
            }
            n2 = n3 + arhn.d();
        }
        return n2;
    }
    
    public final int hashCode() {
        final int b = this.b;
        final List a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return b * 31 + hashCode;
    }
    
    protected final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        if (this.s() == 1) {
            final String y = cln.y(byteBuffer);
            if (this.s() == 1) {
                this.b = aqsy.q(cln.w(byteBuffer));
            }
            long w = cln.w(byteBuffer);
            while (w > 0L) {
                int n = this.b;
                if (this.s() != 1) {
                    throw new RuntimeException("This should be implemented");
                }
                if (this.b == 0) {
                    n = aqsy.q(cln.w(byteBuffer));
                }
                final int position = byteBuffer.position();
                final ByteBuffer slice = byteBuffer.slice();
                slice.limit(n);
                final List a = this.a;
                arhn arhn;
                if ("roll".equals(y)) {
                    arhn = new arhq();
                }
                else if ("rash".equals(y)) {
                    arhn = new arhp();
                }
                else if ("seig".equals(y)) {
                    arhn = new arhm();
                }
                else if ("rap ".equals(y)) {
                    arhn = new arhw();
                }
                else if ("tele".equals(y)) {
                    arhn = new arhu();
                }
                else if ("sync".equals(y)) {
                    arhn = new aril();
                }
                else if ("tscl".equals(y)) {
                    arhn = new arim();
                }
                else if ("tsas".equals(y)) {
                    arhn = new arin();
                }
                else if ("stsa".equals(y)) {
                    arhn = new arik();
                }
                else {
                    arhn = new arhv(y);
                }
                --w;
                arhn.c(slice);
                a.add(arhn);
                byteBuffer.position(position + n);
            }
            return;
        }
        throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        byteBuffer.put(dpt.b(this.a.get(0).a()));
        if (this.s() == 1) {
            cln.m(byteBuffer, (long)this.b);
        }
        cln.m(byteBuffer, (long)this.a.size());
        for (final arhn arhn : this.a) {
            if (this.s() == 1 && this.b == 0) {
                cln.m(byteBuffer, (long)arhn.b().limit());
            }
            byteBuffer.put(arhn.b());
        }
    }
    
    public final String toString() {
        String a;
        if (this.a.size() > 0) {
            a = this.a.get(0).a();
        }
        else {
            a = "????";
        }
        final int b = this.b;
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(a.length() + 84 + String.valueOf(value).length());
        sb.append("SampleGroupDescriptionBox{groupingType='");
        sb.append(a);
        sb.append("', defaultLength=");
        sb.append(b);
        sb.append(", groupEntries=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
