// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import java.io.Writer;

class GvrSurfaceView$LogWriter extends Writer
{
    private StringBuilder mBuilder;
    
    public GvrSurfaceView$LogWriter() {
        this.mBuilder = new StringBuilder();
    }
    
    private void flushBuilder() {
        if (this.mBuilder.length() > 0) {
            this.mBuilder.toString();
            final StringBuilder mBuilder = this.mBuilder;
            mBuilder.delete(0, mBuilder.length());
        }
    }
    
    @Override
    public void close() {
        this.flushBuilder();
    }
    
    @Override
    public void flush() {
        this.flushBuilder();
    }
    
    @Override
    public void write(final char[] array, final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            final char c = array[n + i];
            if (c == '\n') {
                this.flushBuilder();
            }
            else {
                this.mBuilder.append(c);
            }
        }
    }
}
