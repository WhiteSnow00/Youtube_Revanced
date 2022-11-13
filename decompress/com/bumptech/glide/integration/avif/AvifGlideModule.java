// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.integration.avif;

import java.io.InputStream;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import android.content.Context;

public final class AvifGlideModule extends dnd
{
    @Override
    public void registerComponents(final Context context, final dbp dbp, final dcg dcg) {
        final dcy dcy = new dcy(dbp.a);
        dcg.i(ByteBuffer.class, Bitmap.class, (ddr)dcy);
        dcg.i(InputStream.class, Bitmap.class, (ddr)new dcz(dcg.b(), dcy, dbp.c));
    }
}
