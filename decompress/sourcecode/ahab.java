import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public class ahab extends IOException
{
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;
    
    public ahab(final IOException ex) {
        super(ex.getMessage(), ex);
    }
    
    public ahab(final String s) {
        super(s);
    }
    
    public ahab(final String s, final IOException ex) {
        super(s, ex);
    }
    
    public static ahaa a() {
        return new ahaa("Protocol message tag had invalid wire type.");
    }
    
    public static ahab b() {
        return new ahab("Protocol message end-group tag did not match expected tag.");
    }
    
    static ahab c() {
        return new ahab("Protocol message contained an invalid tag (zero).");
    }
    
    public static ahab d() {
        return new ahab("Protocol message had invalid UTF-8.");
    }
    
    static ahab e() {
        return new ahab("CodedInputStream encountered a malformed varint.");
    }
    
    static ahab f() {
        return new ahab("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    
    static ahab g() {
        return new ahab("Failed to parse the message.");
    }
    
    static ahab h() {
        return new ahab("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
    
    static ahab i() {
        return new ahab("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
    
    public static ahab j() {
        return new ahab("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
    
    final void k() {
        this.a = true;
    }
}
