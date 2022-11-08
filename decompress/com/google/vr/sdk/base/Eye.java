// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base;

public class Eye
{
    private final float[] eyeView;
    private final FieldOfView fov;
    private float lastZFar;
    private float lastZNear;
    private float[] perspective;
    private volatile boolean projectionChanged;
    private final int type;
    private final Viewport viewport;
    
    public Eye(final int type) {
        this.type = type;
        this.eyeView = new float[16];
        this.viewport = new Viewport();
        this.fov = new FieldOfView();
        this.projectionChanged = true;
    }
    
    private void setValues(final int n, final int n2, final int n3, final int n4, final float n5, final float n6, final float n7, final float n8) {
        this.viewport.setViewport(n, n2, n3, n4);
        this.fov.setAngles(n5, n6, n7, n8);
        this.projectionChanged = true;
    }
    
    public float[] getEyeView() {
        return this.eyeView;
    }
    
    public FieldOfView getFov() {
        return this.fov;
    }
    
    public float[] getPerspective(final float n, final float n2) {
        if (!this.projectionChanged && this.lastZNear == 0.1f && this.lastZFar == 20000.0f) {
            return this.perspective;
        }
        if (this.perspective == null) {
            this.perspective = new float[16];
        }
        this.getFov().toPerspectiveMatrix(0.1f, 20000.0f, this.perspective, 0);
        this.lastZNear = 0.1f;
        this.lastZFar = 20000.0f;
        this.projectionChanged = false;
        return this.perspective;
    }
    
    public int getType() {
        return this.type;
    }
}
