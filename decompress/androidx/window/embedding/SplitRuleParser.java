// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import android.content.res.Resources$NotFoundException;
import java.util.Collection;
import android.content.Intent;
import java.util.Set;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.window.R$styleable;
import android.content.res.XmlResourceParser;
import android.content.Context;
import android.content.res.Resources;
import android.content.ComponentName;
import java.util.ArrayList;
import java.util.HashSet;

public final class SplitRuleParser
{
    private final HashSet splitRuleConfigs;
    private final ArrayList tags;
    
    public SplitRuleParser() {
        this.splitRuleConfigs = new HashSet();
        this.tags = new ArrayList();
    }
    
    private final void addRule(final EmbeddingRule embeddingRule) {
        final String tag = embeddingRule.getTag();
        if (!aqzg.K((Iterable)this.tags, (Object)tag)) {
            this.splitRuleConfigs.add(embeddingRule);
            if (tag != null) {
                this.tags.add(tag);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("Duplicated tag: ");
        sb.append(tag);
        sb.append(" for ");
        sb.append(embeddingRule);
        sb.append(". Each tag registered to SplitController must be unique.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private final ComponentName buildClassName(String substring, final CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            throw new IllegalArgumentException("Activity name must not be null");
        }
        final String string = charSequence.toString();
        if (string.charAt(0) == '.') {
            return new ComponentName(substring, String.valueOf(substring).concat(string));
        }
        final int k = aubt.k(string, '/', 0, 6);
        String substring2 = substring;
        substring = string;
        if (k > 0) {
            substring2 = string.substring(0, k);
            substring2.getClass();
            substring = string.substring(k + 1);
            substring.getClass();
        }
        if (!atnh.c(substring, "*") && aubt.k(substring, '.', 0, 6) < 0) {
            final StringBuilder sb = new StringBuilder(substring2);
            sb.append('.');
            sb.append(substring);
            return new ComponentName(substring2, sb.toString());
        }
        return new ComponentName(substring2, substring);
    }
    
    private final SplitAttributes buildSplitAttributesFromValue(final float n, final int n2) {
        final SplitAttributes$Builder splitAttributes$Builder = new SplitAttributes$Builder();
        Object splitType;
        if (n == 0.0f) {
            splitType = SplitAttributes$SplitType.Companion.expandContainers();
        }
        else {
            splitType = SplitAttributes$SplitType.Companion.ratio(n);
        }
        splitAttributes$Builder.setSplitType((SplitAttributes$SplitType)splitType);
        splitAttributes$Builder.setLayoutDirection(SplitAttributes$LayoutDirection.Companion.getLayoutDirectionFromValue$window_release(n2));
        return splitAttributes$Builder.build();
    }
    
    private final float defaultMinDimension(final Resources resources) {
        return resources.getDisplayMetrics().density * 600.0f + 0.5f;
    }
    
    private final ActivityFilter parseActivityFilter(final Context context, final XmlResourceParser xmlResourceParser) {
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet)xmlResourceParser, R$styleable.ActivityFilter, 0, 0);
        final String string = obtainStyledAttributes.getString(R$styleable.ActivityFilter_activityName);
        final String string2 = obtainStyledAttributes.getString(R$styleable.ActivityFilter_activityAction);
        final String packageName = context.getApplicationContext().getPackageName();
        packageName.getClass();
        return new ActivityFilter(this.buildClassName(packageName, string), string2);
    }
    
    private final ActivityRule parseSplitActivityRule(final Context context, final XmlResourceParser xmlResourceParser) {
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet)xmlResourceParser, R$styleable.ActivityRule, 0, 0);
        final String string = obtainStyledAttributes.getString(R$styleable.ActivityRule_tag);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(R$styleable.ActivityRule_alwaysExpand, false);
        obtainStyledAttributes.recycle();
        final ActivityRule$Builder activityRule$Builder = new ActivityRule$Builder((Set)atkj.a);
        activityRule$Builder.setAlwaysExpand(boolean1);
        if (string != null) {
            activityRule$Builder.setTag(string);
        }
        return activityRule$Builder.build();
    }
    
    private final SplitPairFilter parseSplitPairFilter(final Context context, final XmlResourceParser xmlResourceParser) {
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet)xmlResourceParser, R$styleable.SplitPairFilter, 0, 0);
        final String string = obtainStyledAttributes.getString(R$styleable.SplitPairFilter_primaryActivityName);
        final String string2 = obtainStyledAttributes.getString(R$styleable.SplitPairFilter_secondaryActivityName);
        final String string3 = obtainStyledAttributes.getString(R$styleable.SplitPairFilter_secondaryActivityAction);
        final String packageName = context.getApplicationContext().getPackageName();
        packageName.getClass();
        return new SplitPairFilter(this.buildClassName(packageName, string), this.buildClassName(packageName, string2), string3);
    }
    
    private final SplitPairRule parseSplitPairRule(final Context context, final XmlResourceParser xmlResourceParser) {
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet)xmlResourceParser, R$styleable.SplitPairRule, 0, 0);
        final String string = obtainStyledAttributes.getString(R$styleable.SplitPairRule_tag);
        final float float1 = obtainStyledAttributes.getFloat(R$styleable.SplitPairRule_splitRatio, 0.5f);
        final int splitPairRule_splitMinWidth = R$styleable.SplitPairRule_splitMinWidth;
        final Resources resources = context.getResources();
        resources.getClass();
        final float dimension = obtainStyledAttributes.getDimension(splitPairRule_splitMinWidth, this.defaultMinDimension(resources));
        final int splitPairRule_splitMinHeight = R$styleable.SplitPairRule_splitMinHeight;
        final Resources resources2 = context.getResources();
        resources2.getClass();
        final float dimension2 = obtainStyledAttributes.getDimension(splitPairRule_splitMinHeight, this.defaultMinDimension(resources2));
        final int splitPairRule_splitMinSmallestWidth = R$styleable.SplitPairRule_splitMinSmallestWidth;
        final Resources resources3 = context.getResources();
        resources3.getClass();
        final float dimension3 = obtainStyledAttributes.getDimension(splitPairRule_splitMinSmallestWidth, this.defaultMinDimension(resources3));
        final int int1 = obtainStyledAttributes.getInt(R$styleable.SplitPairRule_splitLayoutDirection, SplitAttributes$LayoutDirection.LOCALE.getValue$window_release());
        final int int2 = obtainStyledAttributes.getInt(R$styleable.SplitPairRule_finishPrimaryWithSecondary, SplitRule$FinishBehavior.NEVER.getValue$window_release());
        final int int3 = obtainStyledAttributes.getInt(R$styleable.SplitPairRule_finishSecondaryWithPrimary, SplitRule$FinishBehavior.ALWAYS.getValue$window_release());
        final boolean boolean1 = obtainStyledAttributes.getBoolean(R$styleable.SplitPairRule_clearTop, false);
        obtainStyledAttributes.recycle();
        final SplitAttributes buildSplitAttributesFromValue$window_release = SplitAttributes.Companion.buildSplitAttributesFromValue$window_release(float1, int1);
        final SplitPairRule$Builder splitPairRule$Builder = new SplitPairRule$Builder((Set)atkj.a, (int)dimension, (int)dimension2, (int)dimension3);
        splitPairRule$Builder.setTag(string);
        splitPairRule$Builder.setFinishPrimaryWithSecondary(SplitRule$FinishBehavior.Companion.getFinishBehaviorFromValue$window_release(int2));
        splitPairRule$Builder.setFinishSecondaryWithPrimary(SplitRule$FinishBehavior.Companion.getFinishBehaviorFromValue$window_release(int3));
        splitPairRule$Builder.setClearTop(boolean1);
        splitPairRule$Builder.setDefaultSplitAttributes(buildSplitAttributesFromValue$window_release);
        return splitPairRule$Builder.build();
    }
    
    private final SplitPlaceholderRule parseSplitPlaceholderRule(final Context context, final XmlResourceParser xmlResourceParser) {
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet)xmlResourceParser, R$styleable.SplitPlaceholderRule, 0, 0);
        final String string = obtainStyledAttributes.getString(R$styleable.SplitPlaceholderRule_tag);
        final String string2 = obtainStyledAttributes.getString(R$styleable.SplitPlaceholderRule_placeholderActivityName);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(R$styleable.SplitPlaceholderRule_stickyPlaceholder, false);
        final int int1 = obtainStyledAttributes.getInt(R$styleable.SplitPlaceholderRule_finishPrimaryWithPlaceholder, SplitRule$FinishBehavior.ALWAYS.getValue$window_release());
        if (int1 != SplitRule$FinishBehavior.NEVER.getValue$window_release()) {
            final float float1 = obtainStyledAttributes.getFloat(R$styleable.SplitPlaceholderRule_splitRatio, 0.5f);
            final int splitPlaceholderRule_splitMinWidth = R$styleable.SplitPlaceholderRule_splitMinWidth;
            final Resources resources = context.getResources();
            resources.getClass();
            final float dimension = obtainStyledAttributes.getDimension(splitPlaceholderRule_splitMinWidth, this.defaultMinDimension(resources));
            final int splitPlaceholderRule_splitMinHeight = R$styleable.SplitPlaceholderRule_splitMinHeight;
            final Resources resources2 = context.getResources();
            resources2.getClass();
            final float dimension2 = obtainStyledAttributes.getDimension(splitPlaceholderRule_splitMinHeight, this.defaultMinDimension(resources2));
            final int splitPlaceholderRule_splitMinSmallestWidth = R$styleable.SplitPlaceholderRule_splitMinSmallestWidth;
            final Resources resources3 = context.getResources();
            resources3.getClass();
            final float dimension3 = obtainStyledAttributes.getDimension(splitPlaceholderRule_splitMinSmallestWidth, this.defaultMinDimension(resources3));
            final int int2 = obtainStyledAttributes.getInt(R$styleable.SplitPlaceholderRule_splitLayoutDirection, SplitAttributes$LayoutDirection.LOCALE.getValue$window_release());
            obtainStyledAttributes.recycle();
            final SplitAttributes buildSplitAttributesFromValue$window_release = SplitAttributes.Companion.buildSplitAttributesFromValue$window_release(float1, int2);
            final String packageName = context.getApplicationContext().getPackageName();
            packageName.getClass();
            final ComponentName buildClassName = this.buildClassName(packageName, string2);
            final atkj a = atkj.a;
            final Intent setComponent = new Intent().setComponent(buildClassName);
            setComponent.getClass();
            final SplitPlaceholderRule$Builder splitPlaceholderRule$Builder = new SplitPlaceholderRule$Builder((Set)a, setComponent, (int)dimension, (int)dimension2, (int)dimension3);
            splitPlaceholderRule$Builder.setTag(string);
            splitPlaceholderRule$Builder.setSticky(boolean1);
            splitPlaceholderRule$Builder.setFinishPrimaryWithPlaceholder(SplitRule$FinishBehavior.Companion.getFinishBehaviorFromValue$window_release(int1));
            splitPlaceholderRule$Builder.setDefaultSplitAttributes(buildSplitAttributesFromValue$window_release);
            return splitPlaceholderRule$Builder.build();
        }
        throw new IllegalArgumentException("Never is not a valid configuration for Placeholder activities. Please use FINISH_ALWAYS or FINISH_ADJACENT instead or refer to the current API");
    }
    
    private final Set parseSplitXml(final Context context, int n) {
        final Resources resources = context.getResources();
        try {
            final XmlResourceParser xml = resources.getXml(n);
            xml.getClass();
            final int depth = xml.getDepth();
            n = xml.next();
            Object o = null;
            Object o3;
            Object o2 = o3 = o;
            while (n != 1 && (n != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() == 2 && !atnh.c("split-config", xml.getName())) {
                    final String name = xml.getName();
                    Object o4 = o;
                    ActivityRule activityRule = (ActivityRule)o2;
                    Object o5 = o3;
                    Label_0545: {
                        if (name != null) {
                            SplitPairRule splitPairRule = null;
                            Label_0420: {
                                ActivityRule activityRule2 = null;
                                Label_0292: {
                                    switch (name.hashCode()) {
                                        default: {
                                            o4 = o;
                                            activityRule = (ActivityRule)o2;
                                            o5 = o3;
                                            break Label_0545;
                                        }
                                        case 2050988213: {
                                            if (!name.equals("SplitPlaceholderRule")) {
                                                o4 = o;
                                                activityRule = (ActivityRule)o2;
                                                o5 = o3;
                                                break Label_0545;
                                            }
                                            o4 = this.parseSplitPlaceholderRule(context, xml);
                                            this.addRule((EmbeddingRule)o4);
                                            o2 = (o3 = null);
                                            break;
                                        }
                                        case 1793077963: {
                                            if (!name.equals("ActivityRule")) {
                                                o4 = o;
                                                activityRule = (ActivityRule)o2;
                                                o5 = o3;
                                                break Label_0545;
                                            }
                                            activityRule2 = this.parseSplitActivityRule(context, xml);
                                            this.addRule((EmbeddingRule)activityRule2);
                                            o4 = (o3 = null);
                                            break Label_0292;
                                        }
                                        case 1579230604: {
                                            if (!name.equals("SplitPairFilter")) {
                                                o4 = o;
                                                activityRule = (ActivityRule)o2;
                                                o5 = o3;
                                                break Label_0545;
                                            }
                                            if (o3 != null) {
                                                final SplitPairFilter splitPairFilter = this.parseSplitPairFilter(context, xml);
                                                this.removeRule((EmbeddingRule)o3);
                                                splitPairRule = ((SplitPairRule)o3).plus$window_release(splitPairFilter);
                                                this.addRule((EmbeddingRule)splitPairRule);
                                                o4 = o;
                                                break Label_0420;
                                            }
                                            throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                        }
                                        case 520447504: {
                                            if (!name.equals("SplitPairRule")) {
                                                o4 = o;
                                                activityRule = (ActivityRule)o2;
                                                o5 = o3;
                                                break Label_0545;
                                            }
                                            splitPairRule = this.parseSplitPairRule(context, xml);
                                            this.addRule((EmbeddingRule)splitPairRule);
                                            o4 = (o2 = null);
                                            break Label_0420;
                                        }
                                        case 511422343: {
                                            if (!name.equals("ActivityFilter")) {
                                                o4 = o;
                                                activityRule = (ActivityRule)o2;
                                                o5 = o3;
                                                break Label_0545;
                                            }
                                            if (o2 == null && o == null) {
                                                throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                            }
                                            final ActivityFilter activityFilter = this.parseActivityFilter(context, xml);
                                            if (o2 != null) {
                                                this.removeRule((EmbeddingRule)o2);
                                                activityRule2 = ((ActivityRule)o2).plus$window_release(activityFilter);
                                                this.addRule((EmbeddingRule)activityRule2);
                                                o4 = o;
                                                break Label_0292;
                                            }
                                            this.removeRule((EmbeddingRule)o);
                                            o4 = ((SplitPlaceholderRule)o).plus$window_release(activityFilter);
                                            this.addRule((EmbeddingRule)o4);
                                            break;
                                        }
                                    }
                                    activityRule = (ActivityRule)o2;
                                    o5 = o3;
                                    break Label_0545;
                                }
                                activityRule = activityRule2;
                                o5 = o3;
                                break Label_0545;
                            }
                            activityRule = (ActivityRule)o2;
                            o5 = splitPairRule;
                        }
                    }
                    n = xml.next();
                    o = o4;
                    o2 = activityRule;
                    o3 = o5;
                }
                else {
                    n = xml.next();
                }
            }
            final HashSet set = new HashSet(this.splitRuleConfigs);
            this.splitRuleConfigs.clear();
            return set;
        }
        catch (final Resources$NotFoundException ex) {
            return null;
        }
    }
    
    private final void removeRule(final EmbeddingRule embeddingRule) {
        this.splitRuleConfigs.remove(embeddingRule);
        final ArrayList tags = this.tags;
        final String tag = embeddingRule.getTag();
        if (tags instanceof atnq && !(tags instanceof atnr)) {
            atnp.a(tags, "kotlin.collections.MutableCollection");
        }
        tags.remove(tag);
    }
    
    public final Set parseSplitRules$window_release(final Context context, final int n) {
        context.getClass();
        return this.parseSplitXml(context, n);
    }
}
