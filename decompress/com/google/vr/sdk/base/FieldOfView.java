// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

import java.util.Arrays;
import android.opengl.Matrix;
import java.util.List;

public class FieldOfView
{
    private float bottom;
    private float left;
    private float right;
    private float top;
    
    public FieldOfView() {
        this.left = 60.0f;
        this.right = 60.0f;
        this.bottom = 60.0f;
        this.top = 60.0f;
    }
    
    public FieldOfView(final float n, final float n2, final float n3, final float n4) {
        this.setAngles(n, n2, n3, n4);
    }
    
    public FieldOfView(final FieldOfView fieldOfView) {
        this.copy(fieldOfView);
    }
    
    public static FieldOfView parseFromProtobuf(final List list) {
        if (list.size() != 4) {
            return null;
        }
        return new FieldOfView(list.get(0), list.get(1), list.get(2), list.get(3));
    }
    
    public void copy(final FieldOfView fieldOfView) {
        this.left = fieldOfView.left;
        this.right = fieldOfView.right;
        this.bottom = fieldOfView.bottom;
        this.top = fieldOfView.top;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof FieldOfView)) {
            return false;
        }
        final FieldOfView fieldOfView = (FieldOfView)o;
        return this.left == fieldOfView.left && this.right == fieldOfView.right && this.bottom == fieldOfView.bottom && this.top == fieldOfView.top;
    }
    
    public float getBottom() {
        return this.bottom;
    }
    
    public float getLeft() {
        return this.left;
    }
    
    public float getRight() {
        return this.right;
    }
    
    public float getTop() {
        return this.top;
    }
    
    public void setAngles(final float left, final float right, final float bottom, final float top) {
        this.left = left;
        this.right = right;
        this.bottom = bottom;
        this.top = top;
    }
    
    public void toPerspectiveMatrix(final float n, final float n2, final float[] array, final int n3) {
        if (array.length >= 16) {
            Matrix.frustumM(array, 0, (float)(-Math.tan(Math.toRadians(this.left))) * 0.1f, (float)Math.tan(Math.toRadians(this.right)) * 0.1f, (float)(-Math.tan(Math.toRadians(this.bottom))) * 0.1f, (float)Math.tan(Math.toRadians(this.top)) * 0.1f, 0.1f, 20000.0f);
            return;
        }
        throw new IllegalArgumentException("Not enough space to write the result");
    }
    
    public List toProtobufAsList() {
        return Arrays.asList(this.left, this.right, this.bottom, this.top);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{\n");
        final float left = this.left;
        final StringBuilder sb2 = new StringBuilder("  left: ");
        sb2.append(left);
        sb2.append(",\n");
        sb.append(sb2.toString());
        final float right = this.right;
        final StringBuilder sb3 = new StringBuilder("  right: ");
        sb3.append(right);
        sb3.append(",\n");
        sb.append(sb3.toString());
        final float bottom = this.bottom;
        final StringBuilder sb4 = new StringBuilder("  bottom: ");
        sb4.append(bottom);
        sb4.append(",\n");
        sb.append(sb4.toString());
        final float top = this.top;
        final StringBuilder sb5 = new StringBuilder("  top: ");
        sb5.append(top);
        sb5.append(",\n");
        sb.append(sb5.toString());
        sb.append("}");
        return sb.toString();
    }
}
