// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import android.system.ErrnoException;
import java.io.IOException;
import android.system.Os;
import android.system.OsConstants;
import android.os.ParcelFileDescriptor;

public final class ParcelFileDescriptorRewinder$InternalRewinder
{
    private final ParcelFileDescriptor a;
    
    public ParcelFileDescriptorRewinder$InternalRewinder(final ParcelFileDescriptor a) {
        this.a = a;
    }
    
    public ParcelFileDescriptor rewind() {
        try {
            Os.lseek(this.a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return this.a;
        }
        catch (final ErrnoException ex) {
            throw new IOException((Throwable)ex);
        }
    }
}
