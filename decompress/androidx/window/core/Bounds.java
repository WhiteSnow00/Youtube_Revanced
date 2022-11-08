// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

import android.graphics.Rect;

public final class Bounds
{
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;
    
    public Bounds(final int left, final int top, final int right, final int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        if (left > right) {
            final StringBuilder sb = new StringBuilder("Left must be less than or equal to right, left: ");
            sb.append(left);
            sb.append(", right: ");
            sb.append(right);
            throw new IllegalArgumentException(sb.toString());
        }
        if (top <= bottom) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder("top must be less than or equal to bottom, top: ");
        sb2.append(top);
        sb2.append(", bottom: ");
        sb2.append(bottom);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public Bounds(final Rect rect) {
        rect.getClass();
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        final Class<? extends Bounds> class1 = this.getClass();
        Class<?> class2;
        if (o != null) {
            class2 = o.getClass();
        }
        else {
            class2 = null;
        }
        if (!atnh.c((Object)class1, (Object)class2)) {
            return false;
        }
        o.getClass();
        final Bounds bounds = (Bounds)o;
        return this.left == bounds.left && this.top == bounds.top && this.right == bounds.right && this.bottom == bounds.bottom;
    }
    
    public final int getBottom() {
        return this.bottom;
    }
    
    public final int getHeight() {
        return this.bottom - this.top;
    }
    
    public final int getLeft() {
        return this.left;
    }
    
    public final int getRight() {
        return this.right;
    }
    
    public final int getTop() {
        return this.top;
    }
    
    public final int getWidth() {
        return this.right - this.left;
    }
    
    @Override
    public int hashCode() {
        return ((this.left * 31 + this.top) * 31 + this.right) * 31 + this.bottom;
    }
    
    public final boolean isEmpty() {
        return this.getHeight() == 0 || this.getWidth() == 0;
    }
    
    public final boolean isZero() {
        return this.getHeight() == 0 && this.getWidth() == 0;
    }
    
    public final Rect toRect() {
        return new Rect(this.left, this.top, this.right, this.bottom);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bounds { [");
        sb.append(this.left);
        sb.append(',');
        sb.append(this.top);
        sb.append(',');
        sb.append(this.right);
        sb.append(',');
        sb.append(this.bottom);
        sb.append("] }");
        return sb.toString();
    }
}
