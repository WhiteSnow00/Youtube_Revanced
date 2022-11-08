// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

import java.nio.ByteBuffer;
import java.io.File;
import android.os.ParcelFileDescriptor;

public final class UploadDataProviders
{
    private UploadDataProviders() {
    }
    
    public static UploadDataProvider create(final ParcelFileDescriptor parcelFileDescriptor) {
        return new aubz((auby)new aubw(parcelFileDescriptor, 0));
    }
    
    public static UploadDataProvider create(final File file) {
        return new aubz((auby)new aubw(file, 1));
    }
    
    public static UploadDataProvider create(final ByteBuffer byteBuffer) {
        return new aubx(byteBuffer.slice());
    }
    
    public static UploadDataProvider create(final byte[] array) {
        return create(array, 0, array.length);
    }
    
    public static UploadDataProvider create(final byte[] array, final int n, final int n2) {
        return new aubx(ByteBuffer.wrap(array, n, n2).slice());
    }
}
