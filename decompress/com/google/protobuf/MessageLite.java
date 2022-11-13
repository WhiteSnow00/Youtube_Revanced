// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protobuf;

import java.io.OutputStream;

public interface MessageLite extends ahcw
{
    ahdd getParserForType();
    
    int getSerializedSize();
    
    ahcv newBuilderForType();
    
    ahcv toBuilder();
    
    byte[] toByteArray();
    
    ahab toByteString();
    
    void writeDelimitedTo(final OutputStream p0);
    
    void writeTo(final ahal p0);
    
    void writeTo(final OutputStream p0);
}
