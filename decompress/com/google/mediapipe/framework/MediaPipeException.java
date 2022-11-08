// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public class MediaPipeException extends RuntimeException
{
    MediaPipeException(final int n, final byte[] array) {
        final String s = new String(array, aexb.c);
        final String r = agrw.values()[n].r;
        final StringBuilder sb = new StringBuilder();
        sb.append(r);
        sb.append(": ");
        sb.append(s);
        super(sb.toString());
        final agrw agrw = agrw.values()[n];
    }
}
