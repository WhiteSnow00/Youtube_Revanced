import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface mwz extends IInterface
{
    boolean getBooleanFlagValue(final String p0, final boolean p1, final int p2);
    
    int getIntFlagValue(final String p0, final int p1, final int p2);
    
    long getLongFlagValue(final String p0, final long p1, final int p2);
    
    String getStringFlagValue(final String p0, final String p1, final int p2);
    
    void init(final mvn p0);
}
