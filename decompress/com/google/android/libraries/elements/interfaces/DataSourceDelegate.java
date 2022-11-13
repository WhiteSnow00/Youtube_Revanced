// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.ArrayList;
import com.youtube.android.libraries.elements.StatusOr;

public abstract class DataSourceDelegate
{
    public static StatusOr getDelegate(final byte[] array, final DataSourceListener dataSourceListener, final ByteStore byteStore, final String s) {
        return DataSourceDelegate$CppProxy.getDelegate(array, dataSourceListener, byteStore, s);
    }
    
    public abstract void dispose();
    
    public abstract StatusOr elementAtIndex(final int p0);
    
    public abstract ArrayList identifiers();
    
    public abstract Status loadMore();
    
    public abstract Status moveItem(final int p0, final int p1);
    
    public abstract Status reload();
    
    public abstract Status removeItem(final int p0);
    
    public abstract int size();
}
