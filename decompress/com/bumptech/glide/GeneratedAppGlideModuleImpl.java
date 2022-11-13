// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide;

import com.bumptech.glide.module.AppGlideModule;
import com.google.android.libraries.user.profile.photopicker.common.glide.PhotoPickerLibraryGlideModule;
import com.google.android.libraries.glide.animatedwebp.AnimatedWebpGlideModule;
import com.bumptech.glide.integration.avif.AvifGlideModule;
import java.util.Collections;
import java.util.Set;
import android.content.Context;
import com.google.android.libraries.youtube.rendering.image.glide.GlideLoaderModule;

public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule
{
    private final GlideLoaderModule a;
    
    public GeneratedAppGlideModuleImpl(final Context context) {
        this.a = new GlideLoaderModule();
    }
    
    public final /* bridge */ dmp a() {
        return (dmp)new dmo(1);
    }
    
    public final void applyOptions(final Context context, final dbx dbx) {
        ((AppGlideModule)this.a).applyOptions(context, dbx);
    }
    
    public final Set b() {
        return Collections.emptySet();
    }
    
    public final boolean isManifestParsingEnabled() {
        return false;
    }
    
    public final void registerComponents(final Context context, final dbp dbp, final dcg dcg) {
        new AvifGlideModule().registerComponents(context, dbp, dcg);
        ((dnd)new AnimatedWebpGlideModule()).registerComponents(context, dbp, dcg);
        ((dnd)new PhotoPickerLibraryGlideModule()).registerComponents(context, dbp, dcg);
        ((dnd)this.a).registerComponents(context, dbp, dcg);
    }
}
