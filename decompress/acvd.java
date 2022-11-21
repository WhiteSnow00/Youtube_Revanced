import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acvd implements afax
{
    public final List a;
    public final String b;
    public final long c;
    
    public acvd(final List a, final String b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Object apply(final Object o) {
        final List a = this.a;
        final String b = this.b;
        final long c = this.c;
        final aque aque = (aque)o;
        ahcr ahcr;
        if (aque == null) {
            ahcr = aque.a.createBuilder();
        }
        else {
            ahcr = aque.toBuilder();
        }
        final Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            final String concat = b.concat(String.valueOf(((ainq)iterator.next()).b));
            aquf a2 = aquf.a;
            final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)((aque)ahcr.instance).c);
            if (unmodifiableMap.containsKey(concat)) {
                a2 = (aquf)unmodifiableMap.get(concat);
            }
            final ahcr builder = a2.toBuilder();
            builder.ct(c);
            ahcr.cs(concat, (aquf)builder.build());
        }
        final aque aque2 = (aque)ahcr.build();
        final ahcr builder2 = aque.a.createBuilder();
        final boolean d = aque2.d;
        builder2.copyOnWrite();
        final aque aque3 = (aque)builder2.instance;
        aque3.b |= 0x1;
        aque3.d = d;
        final long e = aque2.e;
        builder2.copyOnWrite();
        final aque aque4 = (aque)builder2.instance;
        aque4.b |= 0x2;
        aque4.e = e;
        aque aque5;
        if (aque2 != null && aque2.c.size() != 0) {
            final long a3 = acve.a;
            for (final Map.Entry<K, aquf> entry : Collections.unmodifiableMap((Map<?, ?>)aque2.c).entrySet()) {
                final ahcr builder3 = aquf.a.createBuilder();
                for (final long longValue : entry.getValue().b) {
                    if (longValue >= c - a3) {
                        builder3.ct(longValue);
                    }
                }
                if (((aquf)builder3.instance).b.size() > 0) {
                    builder2.cs((String)entry.getKey(), (aquf)builder3.build());
                }
            }
            aque5 = (aque)builder2.build();
        }
        else {
            aque5 = (aque)builder2.build();
        }
        return aque5;
    }
}
