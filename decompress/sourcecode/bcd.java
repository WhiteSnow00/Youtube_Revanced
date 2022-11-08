import java.io.IOException;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcd extends bcb
{
    public final int d;
    public final Map e;
    
    public bcd(final int d, final IOException ex, final Map e, final bbo bbo) {
        final StringBuilder sb = new StringBuilder("Response code: ");
        sb.append(d);
        super(sb.toString(), ex, bbo, 2004);
        this.d = d;
        this.e = e;
    }
}
