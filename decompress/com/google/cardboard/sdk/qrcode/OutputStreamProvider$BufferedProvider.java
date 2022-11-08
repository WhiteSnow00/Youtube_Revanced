// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.sdk.qrcode;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.File;

class OutputStreamProvider$BufferedProvider implements OutputStreamProvider$Provider
{
    public OutputStreamProvider$BufferedProvider() {
    }
    
    public OutputStream get(final File file) {
        return new BufferedOutputStream(new FileOutputStream(file));
    }
}
