// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import androidx.window.extensions.embedding.SplitPlaceholderRule$Builder;
import androidx.window.extensions.embedding.SplitPairRule$Builder;
import androidx.window.extensions.embedding.SplitInfo;

final class EmbeddingAdapter$VendorApiLevel1Impl
{
    public static final EmbeddingAdapter$VendorApiLevel1Impl INSTANCE;
    
    static {
        INSTANCE = new EmbeddingAdapter$VendorApiLevel1Impl();
    }
    
    private EmbeddingAdapter$VendorApiLevel1Impl() {
    }
    
    private final boolean isSplitAttributesSupported(final SplitAttributes splitAttributes) {
        return splitAttributes.getSplitType() instanceof SplitAttributes$SplitType$RatioSplitType && aqqn.A((Object[])new SplitAttributes$LayoutDirection[] { SplitAttributes$LayoutDirection.LEFT_TO_RIGHT, SplitAttributes$LayoutDirection.RIGHT_TO_LEFT, SplitAttributes$LayoutDirection.LOCALE }, (Object)splitAttributes.getLayoutDirection());
    }
    
    private final atjp translateSplitAttributesCompatInternal(final SplitAttributes splitAttributes) {
        final boolean splitAttributesSupported = this.isSplitAttributesSupported(splitAttributes);
        int n = 3;
        atjp atjp;
        if (!splitAttributesSupported) {
            atjp = new atjp((Object)0.0f, (Object)3);
        }
        else {
            final float value$window_release = splitAttributes.getSplitType().getValue$window_release();
            final SplitAttributes$LayoutDirection layoutDirection = splitAttributes.getLayoutDirection();
            if (!atnh.c((Object)layoutDirection, (Object)SplitAttributes$LayoutDirection.LOCALE)) {
                if (atnh.c((Object)layoutDirection, (Object)SplitAttributes$LayoutDirection.LEFT_TO_RIGHT)) {
                    n = 0;
                }
                else {
                    if (!atnh.c((Object)layoutDirection, (Object)SplitAttributes$LayoutDirection.RIGHT_TO_LEFT)) {
                        throw new IllegalStateException("Unsupported layout direction must be covered in @isSplitAttributesSupported!");
                    }
                    n = 1;
                }
            }
            atjp = new atjp((Object)value$window_release, (Object)n);
        }
        return atjp;
    }
    
    public final SplitAttributes getSplitAttributesCompat(final SplitInfo splitInfo) {
        splitInfo.getClass();
        final SplitAttributes$Builder splitAttributes$Builder = new SplitAttributes$Builder();
        splitAttributes$Builder.setSplitType(SplitAttributes$SplitType.Companion.buildSplitTypeFromValue$window_release(splitInfo.getSplitRatio()));
        splitAttributes$Builder.setLayoutDirection(SplitAttributes$LayoutDirection.LOCALE);
        return splitAttributes$Builder.build();
    }
    
    public final SplitPairRule$Builder setDefaultSplitAttributesCompat(SplitPairRule$Builder setLayoutDirection, final SplitAttributes splitAttributes) {
        setLayoutDirection.getClass();
        splitAttributes.getClass();
        final atjp translateSplitAttributesCompatInternal = this.translateSplitAttributesCompatInternal(splitAttributes);
        setLayoutDirection = setLayoutDirection.setSplitRatio(((Number)translateSplitAttributesCompatInternal.a).floatValue()).setLayoutDirection(((Number)translateSplitAttributesCompatInternal.b).intValue());
        setLayoutDirection.getClass();
        return setLayoutDirection;
    }
    
    public final SplitPlaceholderRule$Builder setDefaultSplitAttributesCompat(SplitPlaceholderRule$Builder setLayoutDirection, final SplitAttributes splitAttributes) {
        setLayoutDirection.getClass();
        splitAttributes.getClass();
        final atjp translateSplitAttributesCompatInternal = this.translateSplitAttributesCompatInternal(splitAttributes);
        setLayoutDirection = setLayoutDirection.setSplitRatio(((Number)translateSplitAttributesCompatInternal.a).floatValue()).setLayoutDirection(((Number)translateSplitAttributesCompatInternal.b).intValue());
        setLayoutDirection.getClass();
        return setLayoutDirection;
    }
    
    public final SplitPlaceholderRule$Builder setFinishPrimaryWithPlaceholderCompat(SplitPlaceholderRule$Builder setFinishPrimaryWithSecondary, final int finishPrimaryWithSecondary) {
        setFinishPrimaryWithSecondary.getClass();
        setFinishPrimaryWithSecondary = setFinishPrimaryWithSecondary.setFinishPrimaryWithSecondary(finishPrimaryWithSecondary);
        setFinishPrimaryWithSecondary.getClass();
        return setFinishPrimaryWithSecondary;
    }
}
