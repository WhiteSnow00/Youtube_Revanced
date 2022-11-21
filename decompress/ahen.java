import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public interface ahen extends Cloneable, aheo
{
    MessageLite build();
    
    MessageLite buildPartial();
    
    ahen clone();
    
    ahen mergeFrom(final ahbt p0);
    
    ahen mergeFrom(final ahby p0, final ExtensionRegistryLite p1);
    
    ahen mergeFrom(final MessageLite p0);
    
    ahen mergeFrom(final byte[] p0);
    
    ahen mergeFrom(final byte[] p0, final ExtensionRegistryLite p1);
}
