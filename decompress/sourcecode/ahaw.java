import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public interface ahaw extends Cloneable, ahax
{
    MessageLite build();
    
    MessageLite buildPartial();
    
    ahaw clone();
    
    ahaw mergeFrom(final agyc p0);
    
    ahaw mergeFrom(final agyh p0, final ExtensionRegistryLite p1);
    
    ahaw mergeFrom(final MessageLite p0);
    
    ahaw mergeFrom(final byte[] p0);
    
    ahaw mergeFrom(final byte[] p0, final ExtensionRegistryLite p1);
}
