// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public final class IntersectionCriteria
{
    final boolean isIncreasing;
    final float ratio;
    
    public IntersectionCriteria(final float ratio, final boolean isIncreasing) {
        this.ratio = ratio;
        this.isIncreasing = isIncreasing;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof IntersectionCriteria)) {
            return false;
        }
        final IntersectionCriteria intersectionCriteria = (IntersectionCriteria)o;
        return this.ratio == intersectionCriteria.ratio && this.isIncreasing == intersectionCriteria.isIncreasing;
    }
    
    public boolean getIsIncreasing() {
        return this.isIncreasing;
    }
    
    public float getRatio() {
        return this.ratio;
    }
    
    @Override
    public int hashCode() {
        return (Float.floatToIntBits(this.ratio) + 527) * 31 + (this.isIncreasing ? 1 : 0);
    }
    
    @Override
    public String toString() {
        final float ratio = this.ratio;
        final boolean isIncreasing = this.isIncreasing;
        final StringBuilder sb = new StringBuilder("IntersectionCriteria{ratio=");
        sb.append(ratio);
        sb.append(",isIncreasing=");
        sb.append(isIncreasing);
        sb.append("}");
        return sb.toString();
    }
}
