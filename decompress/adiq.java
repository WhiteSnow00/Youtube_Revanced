import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adiq implements qho
{
    public final thg a;
    public final adkx b;
    public final atmj c;
    
    public adiq(final thg a, final adkx b) {
        this.a = a;
        this.b = b;
        this.c = atmj.e();
    }
    
    public final ListenableFuture a(aubz aubz) {
        final String d = aubz.d;
        String s = null;
        String s2 = null;
        aosw aosw2;
        if (d != null) {
            final String[] split = d.split(",");
            final int length = split.length;
            aosw aosw = null;
            int n = 0;
            while (true) {
                s = s2;
                aosw2 = aosw;
                if (n >= length) {
                    break;
                }
                final String s3 = split[n];
                String s4 = s2;
                aosw b = aosw;
                if (s3.length() > 0) {
                    final String[] split2 = s3.split(":");
                    if (split2.length != 2) {
                        final StringBuilder sb = new StringBuilder("Expected a colon-separated key-value pair when parsing '");
                        sb.append(s3);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    if ("pcen".equals(split2[0])) {
                        s4 = split2[1];
                        b = aosw;
                    }
                    else {
                        s4 = s2;
                        b = aosw;
                        if ("tag".equals(split2[0])) {
                            b = aosw.b(Integer.parseInt(split2[1]));
                            s4 = s2;
                        }
                    }
                }
                ++n;
                s2 = s4;
                aosw = b;
            }
        }
        else {
            aosw2 = null;
        }
        final adkv adkv = new adkv(s, aosw2);
        final String a = adkv.a;
        final ahcr builder = aubz.toBuilder();
        if (a != null) {
            builder.copyOnWrite();
            final aubz aubz2 = (aubz)builder.instance;
            aubz2.b |= 0x2;
            aubz2.d = a;
        }
        else {
            builder.copyOnWrite();
            final aubz aubz3 = (aubz)builder.instance;
            aubz3.b &= 0xFFFFFFFD;
            aubz3.d = aubz.a.d;
        }
        aubz = (aubz)builder.build();
        return new qhs(this, adkv).a(aubz);
    }
    
    public final void b() {
    }
}
