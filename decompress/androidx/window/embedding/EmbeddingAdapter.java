// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import java.util.Iterator;
import java.util.ArrayList;
import android.graphics.Rect;
import androidx.window.extensions.layout.WindowLayoutInfo;
import android.content.res.Configuration;
import androidx.window.layout.adapter.extensions.ExtensionsWindowLayoutInfoAdapter;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule$Builder;
import android.content.Intent;
import android.app.Activity;
import java.util.Set;
import java.util.List;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitAttributes$SplitType$RatioSplitType;
import androidx.window.extensions.embedding.SplitAttributes$SplitType$ExpandContainersSplitType;
import androidx.window.extensions.embedding.SplitAttributes$SplitType$HingeSplitType;
import androidx.window.extensions.embedding.SplitPlaceholderRule$Builder;
import androidx.window.extensions.embedding.SplitPairRule$Builder;
import androidx.window.core.ExtensionsUtil;
import androidx.window.extensions.embedding.SplitAttributes;
import androidx.window.extensions.embedding.SplitAttributesCalculator$SplitAttributesCalculatorParams;
import androidx.window.core.PredicateAdapter;

public final class EmbeddingAdapter
{
    private final PredicateAdapter predicateAdapter;
    private final int vendorApiLevel;
    
    public static SplitAttributes $r8$lambda$UZaNoXnWEe-fPYDvRnnAj_AMnz8(final EmbeddingAdapter embeddingAdapter, final SplitAttributesCalculator splitAttributesCalculator, final SplitAttributesCalculator$SplitAttributesCalculatorParams splitAttributesCalculator$SplitAttributesCalculatorParams) {
        return translateSplitAttributesCalculator$lambda$0(embeddingAdapter, splitAttributesCalculator, splitAttributesCalculator$SplitAttributesCalculatorParams);
    }
    
    public EmbeddingAdapter(final PredicateAdapter predicateAdapter) {
        predicateAdapter.getClass();
        this.predicateAdapter = predicateAdapter;
        this.vendorApiLevel = ExtensionsUtil.INSTANCE.getSafeVendorApiLevel();
    }
    
    private final SplitPairRule$Builder safeSetDefaultSplitAttributes(final SplitPairRule$Builder splitPairRule$Builder, final androidx.window.embedding.SplitAttributes splitAttributes) {
        if (this.vendorApiLevel >= 2) {
            splitPairRule$Builder.setDefaultSplitAttributes(this.translateSplitAttributes(splitAttributes));
        }
        else {
            EmbeddingAdapter$VendorApiLevel1Impl.INSTANCE.setDefaultSplitAttributesCompat(splitPairRule$Builder, splitAttributes);
        }
        return splitPairRule$Builder;
    }
    
    private final SplitPlaceholderRule$Builder safeSetDefaultSplitAttributes(SplitPlaceholderRule$Builder splitPlaceholderRule$Builder, final androidx.window.embedding.SplitAttributes splitAttributes) {
        if (this.vendorApiLevel >= 2) {
            splitPlaceholderRule$Builder = splitPlaceholderRule$Builder.setDefaultSplitAttributes(this.translateSplitAttributes(splitAttributes));
            splitPlaceholderRule$Builder.getClass();
        }
        else {
            splitPlaceholderRule$Builder = EmbeddingAdapter$VendorApiLevel1Impl.INSTANCE.setDefaultSplitAttributesCompat(splitPlaceholderRule$Builder, splitAttributes);
        }
        return splitPlaceholderRule$Builder;
    }
    
    private final SplitPlaceholderRule$Builder safeSetFinishPrimaryWithPlaceholder(SplitPlaceholderRule$Builder splitPlaceholderRule$Builder, final SplitRule$FinishBehavior splitRule$FinishBehavior) {
        if (this.vendorApiLevel >= 2) {
            splitPlaceholderRule$Builder = splitPlaceholderRule$Builder.setFinishPrimaryWithPlaceholder(this.translateFinishBehavior(splitRule$FinishBehavior));
            splitPlaceholderRule$Builder.getClass();
        }
        else {
            splitPlaceholderRule$Builder = EmbeddingAdapter$VendorApiLevel1Impl.INSTANCE.setFinishPrimaryWithPlaceholderCompat(splitPlaceholderRule$Builder, this.translateFinishBehavior(splitRule$FinishBehavior));
        }
        return splitPlaceholderRule$Builder;
    }
    
    private final androidx.window.embedding.SplitAttributes$SplitType$HingeSplitType translate(final SplitAttributes$SplitType$HingeSplitType splitAttributes$SplitType$HingeSplitType) {
        final SplitAttributes$SplitType$Companion companion = SplitAttributes$SplitType.Companion;
        final androidx.window.extensions.embedding.SplitAttributes$SplitType fallbackSplitType = splitAttributes$SplitType$HingeSplitType.getFallbackSplitType();
        fallbackSplitType.getClass();
        Object o;
        if (fallbackSplitType instanceof SplitAttributes$SplitType$ExpandContainersSplitType) {
            o = SplitAttributes$SplitType.Companion.expandContainers();
        }
        else {
            if (!(fallbackSplitType instanceof SplitAttributes$SplitType$RatioSplitType)) {
                new StringBuilder("Unsupported split type: ").append(fallbackSplitType);
                throw new IllegalArgumentException("Unsupported split type: ".concat(fallbackSplitType.toString()));
            }
            o = this.translate((SplitAttributes$SplitType$RatioSplitType)fallbackSplitType);
        }
        return companion.splitByHinge((SplitAttributes$SplitType)o);
    }
    
    private final androidx.window.embedding.SplitAttributes$SplitType$RatioSplitType translate(final SplitAttributes$SplitType$RatioSplitType splitAttributes$SplitType$RatioSplitType) {
        return SplitAttributes$SplitType.Companion.ratio(splitAttributes$SplitType$RatioSplitType.getRatio());
    }
    
    private final SplitAttributes$SplitType translate(final androidx.window.extensions.embedding.SplitAttributes$SplitType splitAttributes$SplitType) {
        Object o;
        if (splitAttributes$SplitType instanceof SplitAttributes$SplitType$RatioSplitType) {
            o = this.translate((SplitAttributes$SplitType$RatioSplitType)splitAttributes$SplitType);
        }
        else if (splitAttributes$SplitType instanceof SplitAttributes$SplitType$ExpandContainersSplitType) {
            o = SplitAttributes$SplitType.Companion.expandContainers();
        }
        else {
            if (!(splitAttributes$SplitType instanceof SplitAttributes$SplitType$HingeSplitType)) {
                new StringBuilder("Unsupported split type: ").append(splitAttributes$SplitType);
                throw new IllegalArgumentException("Unsupported split type: ".concat(String.valueOf(splitAttributes$SplitType)));
            }
            o = this.translate((SplitAttributes$SplitType$HingeSplitType)splitAttributes$SplitType);
        }
        return (SplitAttributes$SplitType)o;
    }
    
    private final androidx.window.embedding.SplitAttributes translate(final SplitAttributes splitAttributes) {
        final SplitAttributes$Builder splitAttributes$Builder = new SplitAttributes$Builder();
        final androidx.window.extensions.embedding.SplitAttributes$SplitType splitType = splitAttributes.getSplitType();
        splitType.getClass();
        splitAttributes$Builder.setSplitType(this.translate(splitType));
        final int layoutDirection = splitAttributes.getLayoutDirection();
        SplitAttributes$LayoutDirection layoutDirection2;
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                if (layoutDirection != 3) {
                    if (layoutDirection != 4) {
                        if (layoutDirection != 5) {
                            final StringBuilder sb = new StringBuilder("Unknown layout direction: ");
                            sb.append(layoutDirection);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        layoutDirection2 = SplitAttributes$LayoutDirection.BOTTOM_TO_TOP;
                    }
                    else {
                        layoutDirection2 = SplitAttributes$LayoutDirection.TOP_TO_BOTTOM;
                    }
                }
                else {
                    layoutDirection2 = SplitAttributes$LayoutDirection.LOCALE;
                }
            }
            else {
                layoutDirection2 = SplitAttributes$LayoutDirection.RIGHT_TO_LEFT;
            }
        }
        else {
            layoutDirection2 = SplitAttributes$LayoutDirection.LEFT_TO_RIGHT;
        }
        splitAttributes$Builder.setLayoutDirection(layoutDirection2);
        return splitAttributes$Builder.build();
    }
    
    private final androidx.window.embedding.SplitInfo translate(final SplitInfo splitInfo) {
        final androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        primaryActivityStack.getClass();
        final boolean b = false;
        boolean empty;
        try {
            empty = primaryActivityStack.isEmpty();
        }
        catch (final NoSuchMethodError noSuchMethodError) {
            empty = false;
        }
        final List activities = primaryActivityStack.getActivities();
        activities.getClass();
        final ActivityStack activityStack = new ActivityStack(activities, empty);
        final androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        secondaryActivityStack.getClass();
        boolean empty2;
        try {
            empty2 = secondaryActivityStack.isEmpty();
        }
        catch (final NoSuchMethodError noSuchMethodError2) {
            empty2 = b;
        }
        final List activities2 = secondaryActivityStack.getActivities();
        activities2.getClass();
        final ActivityStack activityStack2 = new ActivityStack(activities2, empty2);
        androidx.window.embedding.SplitAttributes splitAttributes2;
        if (this.vendorApiLevel >= 2) {
            final SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
            splitAttributes.getClass();
            splitAttributes2 = this.translate(splitAttributes);
        }
        else {
            splitAttributes2 = EmbeddingAdapter$VendorApiLevel1Impl.INSTANCE.getSplitAttributesCompat(splitInfo);
        }
        return new androidx.window.embedding.SplitInfo(activityStack, activityStack2, splitAttributes2);
    }
    
    private final Object translateActivityIntentPredicates(final Set set) {
        return this.predicateAdapter.buildPairPredicate(atrg.b(Activity.class), atrg.b(Intent.class), (atqh)new EmbeddingAdapter$translateActivityIntentPredicates$1(set));
    }
    
    private final Object translateActivityPairPredicates(final Set set) {
        return this.predicateAdapter.buildPairPredicate(atrg.b(Activity.class), atrg.b(Activity.class), (atqh)new EmbeddingAdapter$translateActivityPairPredicates$1(set));
    }
    
    private final Object translateActivityPredicates(final Set set) {
        return this.predicateAdapter.buildPredicate(atrg.b(Activity.class), (atqd)new EmbeddingAdapter$translateActivityPredicates$1(set));
    }
    
    private final androidx.window.extensions.embedding.ActivityRule translateActivityRule(final ActivityRule activityRule, final Class clazz) {
        final ActivityRule$Builder setShouldAlwaysExpand = ActivityRule$Builder.class.getConstructor(clazz, clazz).newInstance(this.translateActivityPredicates(activityRule.getFilters()), this.translateIntentPredicates(activityRule.getFilters())).setShouldAlwaysExpand(activityRule.getAlwaysExpand());
        setShouldAlwaysExpand.getClass();
        final String tag = ((EmbeddingRule)activityRule).getTag();
        if (tag != null && this.vendorApiLevel >= 2) {
            setShouldAlwaysExpand.setTag(tag);
        }
        final androidx.window.extensions.embedding.ActivityRule build = setShouldAlwaysExpand.build();
        build.getClass();
        return build;
    }
    
    private final int translateFinishBehavior(final SplitRule$FinishBehavior splitRule$FinishBehavior) {
        int n;
        if (atqz.c(splitRule$FinishBehavior, SplitRule$FinishBehavior.NEVER)) {
            n = 0;
        }
        else if (atqz.c(splitRule$FinishBehavior, SplitRule$FinishBehavior.ALWAYS)) {
            n = 1;
        }
        else {
            if (!atqz.c(splitRule$FinishBehavior, SplitRule$FinishBehavior.ADJACENT)) {
                new StringBuilder("Unknown finish behavior:").append(splitRule$FinishBehavior);
                throw new IllegalArgumentException("Unknown finish behavior:".concat(String.valueOf(splitRule$FinishBehavior)));
            }
            n = 2;
        }
        return n;
    }
    
    private final SplitAttributes$SplitType$HingeSplitType translateHinge(final androidx.window.embedding.SplitAttributes$SplitType$HingeSplitType splitAttributes$SplitType$HingeSplitType) {
        final SplitAttributes$SplitType fallbackSplitType = splitAttributes$SplitType$HingeSplitType.getFallbackSplitType();
        androidx.window.extensions.embedding.SplitAttributes$SplitType splitAttributes$SplitType;
        if (fallbackSplitType instanceof androidx.window.embedding.SplitAttributes$SplitType$ExpandContainersSplitType) {
            splitAttributes$SplitType = (androidx.window.extensions.embedding.SplitAttributes$SplitType)new SplitAttributes$SplitType$ExpandContainersSplitType();
        }
        else {
            if (!(fallbackSplitType instanceof androidx.window.embedding.SplitAttributes$SplitType$RatioSplitType)) {
                new StringBuilder("Unsupported splitType: ").append(fallbackSplitType);
                throw new IllegalArgumentException("Unsupported splitType: ".concat(String.valueOf(fallbackSplitType)));
            }
            splitAttributes$SplitType = (androidx.window.extensions.embedding.SplitAttributes$SplitType)this.translateRatio((androidx.window.embedding.SplitAttributes$SplitType$RatioSplitType)fallbackSplitType);
        }
        return new SplitAttributes$SplitType$HingeSplitType(splitAttributes$SplitType);
    }
    
    private final Object translateIntentPredicates(final Set set) {
        return this.predicateAdapter.buildPredicate(atrg.b(Intent.class), (atqd)new EmbeddingAdapter$translateIntentPredicates$1(set));
    }
    
    private final Object translateParentMetricsPredicate(final SplitRule splitRule) {
        return this.predicateAdapter.buildPredicate(atrg.b(WindowMetrics.class), (atqd)new EmbeddingAdapter$translateParentMetricsPredicate$1(splitRule));
    }
    
    private final SplitAttributes$SplitType$RatioSplitType translateRatio(final androidx.window.embedding.SplitAttributes$SplitType$RatioSplitType splitAttributes$SplitType$RatioSplitType) {
        return new SplitAttributes$SplitType$RatioSplitType(splitAttributes$SplitType$RatioSplitType.getRatio());
    }
    
    private final SplitAttributes translateSplitAttributes(final androidx.window.embedding.SplitAttributes splitAttributes) {
        if (this.vendorApiLevel >= 2) {
            final androidx.window.extensions.embedding.SplitAttributes$Builder setSplitType = new androidx.window.extensions.embedding.SplitAttributes$Builder().setSplitType(this.translateSplitType(splitAttributes.getSplitType()));
            final SplitAttributes$LayoutDirection layoutDirection = splitAttributes.getLayoutDirection();
            int layoutDirection2;
            if (atqz.c(layoutDirection, SplitAttributes$LayoutDirection.LOCALE)) {
                layoutDirection2 = 3;
            }
            else if (atqz.c(layoutDirection, SplitAttributes$LayoutDirection.LEFT_TO_RIGHT)) {
                layoutDirection2 = 0;
            }
            else if (atqz.c(layoutDirection, SplitAttributes$LayoutDirection.RIGHT_TO_LEFT)) {
                layoutDirection2 = 1;
            }
            else if (atqz.c(layoutDirection, SplitAttributes$LayoutDirection.TOP_TO_BOTTOM)) {
                layoutDirection2 = 4;
            }
            else {
                if (!atqz.c(layoutDirection, SplitAttributes$LayoutDirection.BOTTOM_TO_TOP)) {
                    final StringBuilder sb = new StringBuilder("Unsupported layoutDirection:");
                    sb.append(splitAttributes);
                    sb.append(".layoutDirection");
                    throw new IllegalArgumentException(sb.toString());
                }
                layoutDirection2 = 5;
            }
            final SplitAttributes build = setSplitType.setLayoutDirection(layoutDirection2).build();
            build.getClass();
            return build;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
    
    private static final SplitAttributes translateSplitAttributesCalculator$lambda$0(final EmbeddingAdapter embeddingAdapter, final SplitAttributesCalculator splitAttributesCalculator, final SplitAttributesCalculator$SplitAttributesCalculatorParams splitAttributesCalculator$SplitAttributesCalculatorParams) {
        embeddingAdapter.getClass();
        splitAttributesCalculator.getClass();
        splitAttributesCalculator$SplitAttributesCalculatorParams.getClass();
        return embeddingAdapter.translateSplitAttributes(splitAttributesCalculator.computeSplitAttributesForParams(embeddingAdapter.translate(splitAttributesCalculator$SplitAttributesCalculatorParams)));
    }
    
    private final androidx.window.extensions.embedding.SplitPairRule translateSplitPairRule(final SplitPairRule splitPairRule, final Class clazz) {
        final SplitPairRule$Builder instance = SplitPairRule$Builder.class.getConstructor(clazz, clazz, clazz).newInstance(this.translateActivityPairPredicates(splitPairRule.getFilters()), this.translateActivityIntentPredicates(splitPairRule.getFilters()), this.translateParentMetricsPredicate((SplitRule)splitPairRule));
        instance.getClass();
        final SplitPairRule$Builder splitPairRule$Builder = instance;
        this.safeSetDefaultSplitAttributes(splitPairRule$Builder, ((SplitRule)splitPairRule).getDefaultSplitAttributes());
        final SplitPairRule$Builder setFinishSecondaryWithPrimary = splitPairRule$Builder.setShouldClearTop(splitPairRule.getClearTop()).setFinishPrimaryWithSecondary(this.translateFinishBehavior(splitPairRule.getFinishPrimaryWithSecondary())).setFinishSecondaryWithPrimary(this.translateFinishBehavior(splitPairRule.getFinishSecondaryWithPrimary()));
        setFinishSecondaryWithPrimary.getClass();
        final String tag = ((EmbeddingRule)splitPairRule).getTag();
        if (tag != null && this.vendorApiLevel >= 2) {
            setFinishSecondaryWithPrimary.setTag(tag);
        }
        final androidx.window.extensions.embedding.SplitPairRule build = setFinishSecondaryWithPrimary.build();
        build.getClass();
        return build;
    }
    
    private final androidx.window.extensions.embedding.SplitPlaceholderRule translateSplitPlaceholderRule(final SplitPlaceholderRule splitPlaceholderRule, final Class clazz) {
        final SplitPlaceholderRule$Builder setSticky = SplitPlaceholderRule$Builder.class.getConstructor(Intent.class, clazz, clazz, clazz).newInstance(splitPlaceholderRule.getPlaceholderIntent(), this.translateActivityPredicates(splitPlaceholderRule.getFilters()), this.translateIntentPredicates(splitPlaceholderRule.getFilters()), this.translateParentMetricsPredicate((SplitRule)splitPlaceholderRule)).setSticky(splitPlaceholderRule.isSticky());
        setSticky.getClass();
        final SplitPlaceholderRule$Builder safeSetDefaultSplitAttributes = this.safeSetDefaultSplitAttributes(this.safeSetFinishPrimaryWithPlaceholder(setSticky, splitPlaceholderRule.getFinishPrimaryWithPlaceholder()), ((SplitRule)splitPlaceholderRule).getDefaultSplitAttributes());
        final String tag = ((EmbeddingRule)splitPlaceholderRule).getTag();
        if (tag != null && this.vendorApiLevel >= 2) {
            safeSetDefaultSplitAttributes.setTag(tag);
        }
        final androidx.window.extensions.embedding.SplitPlaceholderRule build = safeSetDefaultSplitAttributes.build();
        build.getClass();
        return build;
    }
    
    private final androidx.window.extensions.embedding.SplitAttributes$SplitType translateSplitType(final SplitAttributes$SplitType splitAttributes$SplitType) {
        if (this.vendorApiLevel >= 2) {
            androidx.window.extensions.embedding.SplitAttributes$SplitType splitAttributes$SplitType2;
            if (splitAttributes$SplitType instanceof androidx.window.embedding.SplitAttributes$SplitType$HingeSplitType) {
                splitAttributes$SplitType2 = (androidx.window.extensions.embedding.SplitAttributes$SplitType)this.translateHinge((androidx.window.embedding.SplitAttributes$SplitType$HingeSplitType)splitAttributes$SplitType);
            }
            else if (splitAttributes$SplitType instanceof androidx.window.embedding.SplitAttributes$SplitType$ExpandContainersSplitType) {
                splitAttributes$SplitType2 = (androidx.window.extensions.embedding.SplitAttributes$SplitType)new SplitAttributes$SplitType$ExpandContainersSplitType();
            }
            else {
                if (!(splitAttributes$SplitType instanceof androidx.window.embedding.SplitAttributes$SplitType$RatioSplitType)) {
                    new StringBuilder("Unsupported splitType: ").append(splitAttributes$SplitType);
                    throw new IllegalArgumentException("Unsupported splitType: ".concat(String.valueOf(splitAttributes$SplitType)));
                }
                splitAttributes$SplitType2 = (androidx.window.extensions.embedding.SplitAttributes$SplitType)this.translateRatio((androidx.window.embedding.SplitAttributes$SplitType$RatioSplitType)splitAttributes$SplitType);
            }
            return splitAttributes$SplitType2;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
    
    public final androidx.window.embedding.SplitAttributesCalculator$SplitAttributesCalculatorParams translate(final SplitAttributesCalculator$SplitAttributesCalculatorParams splitAttributesCalculator$SplitAttributesCalculatorParams) {
        splitAttributesCalculator$SplitAttributesCalculatorParams.getClass();
        final WindowMetrics parentWindowMetrics = splitAttributesCalculator$SplitAttributesCalculatorParams.getParentWindowMetrics();
        parentWindowMetrics.getClass();
        final Configuration parentConfiguration = splitAttributesCalculator$SplitAttributesCalculatorParams.getParentConfiguration();
        parentConfiguration.getClass();
        final SplitAttributes defaultSplitAttributes = splitAttributesCalculator$SplitAttributesCalculatorParams.getDefaultSplitAttributes();
        defaultSplitAttributes.getClass();
        final boolean defaultMinSizeSatisfied = splitAttributesCalculator$SplitAttributesCalculatorParams.isDefaultMinSizeSatisfied();
        final WindowLayoutInfo parentWindowLayoutInfo = splitAttributesCalculator$SplitAttributesCalculatorParams.getParentWindowLayoutInfo();
        parentWindowLayoutInfo.getClass();
        final String splitRuleTag = splitAttributesCalculator$SplitAttributesCalculatorParams.getSplitRuleTag();
        final Rect bounds = parentWindowMetrics.getBounds();
        bounds.getClass();
        final androidx.window.layout.WindowMetrics windowMetrics = new androidx.window.layout.WindowMetrics(bounds, aoc.o(parentWindowMetrics.getWindowInsets()));
        return new androidx.window.embedding.SplitAttributesCalculator$SplitAttributesCalculatorParams(windowMetrics, parentConfiguration, this.translate(defaultSplitAttributes), defaultMinSizeSatisfied, ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(windowMetrics, parentWindowLayoutInfo), splitRuleTag);
    }
    
    public final List translate(final List list) {
        list.getClass();
        final ArrayList list2 = new ArrayList(atzd.l((Iterable)list));
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(this.translate((SplitInfo)iterator.next()));
        }
        return list2;
    }
    
    public final Set translate(final Set set) {
        set.getClass();
        final Class predicateClassOrNull$window_release = this.predicateAdapter.predicateClassOrNull$window_release();
        if (predicateClassOrNull$window_release == null) {
            return (Set)atob.a;
        }
        final ArrayList list = new ArrayList(atzd.l((Iterable)set));
        for (final EmbeddingRule embeddingRule : set) {
            androidx.window.extensions.embedding.EmbeddingRule embeddingRule2;
            if (embeddingRule instanceof SplitPairRule) {
                embeddingRule2 = (androidx.window.extensions.embedding.EmbeddingRule)this.translateSplitPairRule((SplitPairRule)embeddingRule, predicateClassOrNull$window_release);
            }
            else if (embeddingRule instanceof SplitPlaceholderRule) {
                embeddingRule2 = (androidx.window.extensions.embedding.EmbeddingRule)this.translateSplitPlaceholderRule((SplitPlaceholderRule)embeddingRule, predicateClassOrNull$window_release);
            }
            else {
                if (!(embeddingRule instanceof ActivityRule)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                embeddingRule2 = (androidx.window.extensions.embedding.EmbeddingRule)this.translateActivityRule((ActivityRule)embeddingRule, predicateClassOrNull$window_release);
            }
            list.add(embeddingRule2);
        }
        return atzd.j((Iterable)list);
    }
    
    public final androidx.window.extensions.embedding.SplitAttributesCalculator translateSplitAttributesCalculator(final SplitAttributesCalculator splitAttributesCalculator) {
        splitAttributesCalculator.getClass();
        return (androidx.window.extensions.embedding.SplitAttributesCalculator)new EmbeddingAdapter$$ExternalSyntheticLambda0(this, splitAttributesCalculator);
    }
}
