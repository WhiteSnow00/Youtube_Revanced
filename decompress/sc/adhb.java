import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhb implements qgv
{
    public final tgd a;
    public final adjh b;
    public final atjm c;
    
    public adhb(final tgd a, final adjh b) {
        this.a = a;
        this.b = b;
        this.c = atjm.e();
    }
    
    public final ListenableFuture a(atzd atzd) {
        final String d = atzd.d;
        String s = null;
        String s2 = null;
        aoql aoql2;
        if (d != null) {
            final String[] split = d.split(",");
            final int length = split.length;
            aoql aoql = null;
            int n = 0;
            while (true) {
                s = s2;
                aoql2 = aoql;
                if (n >= length) {
                    break;
                }
                final String s3 = split[n];
                String s4 = s2;
                aoql b = aoql;
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
                        b = aoql;
                    }
                    else {
                        s4 = s2;
                        b = aoql;
                        if ("tag".equals(split2[0])) {
                            b = aoql.b(Integer.parseInt(split2[1]));
                            s4 = s2;
                        }
                    }
                }
                ++n;
                s2 = s4;
                aoql = b;
            }
        }
        else {
            aoql2 = null;
        }
        final adjf adjf = new adjf(s, aoql2);
        final String a = adjf.a;
        final ahaz builder = atzd.toBuilder();
        if (a != null) {
            builder.copyOnWrite();
            final atzd atzd2 = (atzd)builder.instance;
            atzd2.b |= 0x2;
            atzd2.d = a;
        }
        else {
            builder.copyOnWrite();
            final atzd atzd3 = (atzd)builder.instance;
            atzd3.b &= 0xFFFFFFFD;
            atzd3.d = atzd.a.d;
        }
        atzd = (atzd)builder.build();
        return new qgz(this, adjf).a(atzd);
    }
    
    public final void b() {
    }
}
