import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dra
{
    public long a;
    public final List b;
    
    public dra() {
        this.b = new ArrayList();
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final int size = this.b.size();
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder(string.length() + 92);
        sb.append("SampleEntry{sampleDelta=");
        sb.append(a);
        sb.append(", subsampleCount=");
        sb.append(size);
        sb.append(", subsampleEntries=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
