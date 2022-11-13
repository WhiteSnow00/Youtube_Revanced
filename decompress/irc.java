import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irc extends iqv implements Comparable
{
    private final long b;
    
    public irc(final MessageLite messageLite, final long b) {
        super(messageLite);
        this.b = b;
    }
    
    public final Long b() {
        return this.b;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return -this.b().compareTo(((irc)o).b());
    }
}
