import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adey implements qfl
{
    public final tdz a;
    public final adhe b;
    public final atir c;
    
    public adey(final tdz a, final adhe b) {
        this.a = a;
        this.b = b;
        this.c = atir.e();
    }
    
    public final ListenableFuture a(atyg atyg) {
        final String d = atyg.d;
        final String s = null;
        aooi aooi = null;
        aooi aooi2;
        String s6;
        if (d != null) {
            final String[] split = d.split(",");
            final int length = split.length;
            String s2 = null;
            aooi b;
            String s4;
            for (int i = 0; i < length; ++i, aooi = b, s2 = s4) {
                final String s3 = split[i];
                b = aooi;
                s4 = s2;
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
                        b = aooi;
                    }
                    else {
                        b = aooi;
                        s4 = s2;
                        if ("tag".equals(split2[0])) {
                            b = aooi.b(Integer.parseInt(split2[1]));
                            s4 = s2;
                        }
                    }
                }
            }
            final String s5 = s2;
            aooi2 = aooi;
            s6 = s5;
        }
        else {
            final aooi aooi3 = null;
            s6 = s;
            aooi2 = aooi3;
        }
        final adhc adhc = new adhc(s6, aooi2);
        final String a = adhc.a;
        final agza builder = ((agzi)atyg).toBuilder();
        if (a != null) {
            builder.copyOnWrite();
            final atyg atyg2 = (atyg)builder.instance;
            atyg2.b |= 0x2;
            atyg2.d = a;
        }
        else {
            builder.copyOnWrite();
            final atyg atyg3 = (atyg)builder.instance;
            atyg3.b &= 0xFFFFFFFD;
            atyg3.d = atyg.a.d;
        }
        atyg = (atyg)builder.build();
        return new qfp(this, adhc).a(atyg);
    }
}
