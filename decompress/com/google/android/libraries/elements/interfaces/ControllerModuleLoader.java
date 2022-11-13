// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.ArrayList;

public abstract class ControllerModuleLoader
{
    public abstract Status loadModule(final byte[] p0, final ArrayList p1);
}
