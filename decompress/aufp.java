import java.util.List;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.BidirectionalStream$Builder;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream$Callback;
import org.chromium.net.ExperimentalBidirectionalStream$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aufp extends ExperimentalBidirectionalStream$Builder
{
    private final aufu a;
    private final String b;
    private final BidirectionalStream$Callback c;
    private final Executor d;
    private final ArrayList e;
    private String f;
    private int g;
    private boolean h;
    private Collection i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;
    private long n;
    
    public aufp(final String b, final BidirectionalStream$Callback c, final Executor d, final aufu a) {
        this.e = new ArrayList();
        this.f = "POST";
        this.g = 3;
        this.n = -1L;
        if (b == null) {
            throw new NullPointerException("URL is required.");
        }
        if (c == null) {
            throw new NullPointerException("Callback is required.");
        }
        if (d != null) {
            this.b = b;
            this.c = c;
            this.d = d;
            this.a = a;
            return;
        }
        throw new NullPointerException("Executor is required.");
    }
    
    public final void a(final String s, final String s2) {
        if (s == null) {
            throw new NullPointerException("Invalid header name.");
        }
        if (s2 != null) {
            this.e.add(new AbstractMap.SimpleImmutableEntry<String, String>(s, s2));
            return;
        }
        throw new NullPointerException("Invalid header value.");
    }
    
    public final /* bridge */ BidirectionalStream$Builder addHeader(final String s, final String s2) {
        this.a(s, s2);
        return (BidirectionalStream$Builder)this;
    }
    
    public final /* bridge */ ExperimentalBidirectionalStream$Builder addHeader(final String s, final String s2) {
        this.a(s, s2);
        return this;
    }
    
    public final ExperimentalBidirectionalStream$Builder addRequestAnnotation(final Object o) {
        if (o != null) {
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(o);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }
    
    public final void b(final String f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Method is required.");
    }
    
    public final ExperimentalBidirectionalStream$Builder bindToNetwork(final long n) {
        this.n = n;
        return this;
    }
    
    public final /* bridge */ BidirectionalStream build() {
        return (BidirectionalStream)this.build();
    }
    
    public final ExperimentalBidirectionalStream build() {
        return this.a.a(this.b, this.c, this.d, this.f, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }
    
    public final BidirectionalStream$Builder delayRequestHeadersUntilFirstFlush(final boolean h) {
        this.h = h;
        return (BidirectionalStream$Builder)this;
    }
    
    public final ExperimentalBidirectionalStream$Builder delayRequestHeadersUntilFirstFlush(final boolean h) {
        this.h = h;
        return this;
    }
    
    public final /* bridge */ BidirectionalStream$Builder setHttpMethod(final String s) {
        this.b(s);
        return (BidirectionalStream$Builder)this;
    }
    
    public final /* bridge */ ExperimentalBidirectionalStream$Builder setHttpMethod(final String s) {
        this.b(s);
        return this;
    }
    
    public final BidirectionalStream$Builder setPriority(final int g) {
        this.g = g;
        return (BidirectionalStream$Builder)this;
    }
    
    public final ExperimentalBidirectionalStream$Builder setPriority(final int g) {
        this.g = g;
        return this;
    }
    
    public final ExperimentalBidirectionalStream$Builder setTrafficStatsTag(final int k) {
        this.j = true;
        this.k = k;
        return this;
    }
    
    public final ExperimentalBidirectionalStream$Builder setTrafficStatsUid(final int m) {
        this.l = true;
        this.m = m;
        return this;
    }
}
