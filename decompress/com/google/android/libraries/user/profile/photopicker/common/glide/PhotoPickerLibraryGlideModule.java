// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.user.profile.photopicker.common.glide;

import java.io.InputStream;
import java.nio.ByteBuffer;
import android.content.Context;

public class PhotoPickerLibraryGlideModule extends dnd
{
    private static final int URL_CACHE_SIZE = 2000;
    
    public void registerComponents(final Context context, final dbp dbp, final dcg dcg) {
        final cya cya = new cya(2000L);
        final qsv qsv = new qsv(context, new sqq(context, "oauth2:https://www.googleapis.com/auth/photos.image.readonly"), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        dcg.g((Class)qsy.class, (Class)ByteBuffer.class, (dik)new qta(qsv, cya, 0, (byte[])null));
        dcg.g((Class)qsy.class, (Class)InputStream.class, (dik)new qta(qsv, cya, 1, (byte[])null));
    }
}
