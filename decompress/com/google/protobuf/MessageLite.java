// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protobuf;

import java.io.OutputStream;

public interface MessageLite extends ahax
{
    ahbe getParserForType();
    
    int getSerializedSize();
    
    ahaw newBuilderForType();
    
    ahaw toBuilder();
    
    byte[] toByteArray();
    
    agyc toByteString();
    
    void writeDelimitedTo(final OutputStream p0);
    
    void writeTo(final agym p0);
    
    void writeTo(final OutputStream p0);
}
