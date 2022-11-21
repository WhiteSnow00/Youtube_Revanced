import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class azj extends IOException
{
    public azj(final int n, final int n2) {
        final StringBuilder sb = new StringBuilder("Priority too low [priority=");
        sb.append(n);
        sb.append(", highest=");
        sb.append(n2);
        sb.append("]");
        super(sb.toString());
    }
}
