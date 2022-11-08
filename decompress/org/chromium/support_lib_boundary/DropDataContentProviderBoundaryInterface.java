// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.support_lib_boundary;

import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.content.ContentProvider;
import android.os.Bundle;
import android.net.Uri;

public interface DropDataContentProviderBoundaryInterface
{
    Uri cache(final byte[] p0, final String p1, final String p2);
    
    Bundle call(final String p0, final String p1, final Bundle p2);
    
    String[] getStreamTypes(final Uri p0, final String p1);
    
    String getType(final Uri p0);
    
    boolean onCreate();
    
    void onDragEnd(final boolean p0);
    
    ParcelFileDescriptor openFile(final ContentProvider p0, final Uri p1);
    
    Cursor query(final Uri p0, final String[] p1, final String p2, final String[] p3, final String p4);
    
    void setClearCachedDataIntervalMs(final int p0);
}
