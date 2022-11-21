// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.integration.avif;

import java.io.InputStream;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import android.content.Context;

public final class AvifGlideModule extends dng
{
    public void registerComponents(final Context context, final dbs dbs, final dcj dcj) {
        final ddb ddb = new ddb(dbs.a);
        dcj.i((Class)ByteBuffer.class, (Class)Bitmap.class, (ddu)ddb);
        dcj.i((Class)InputStream.class, (Class)Bitmap.class, (ddu)new ddc(dcj.b(), ddb, dbs.c));
    }
}
