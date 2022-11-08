// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.sdk.qrcode;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;

class InputStreamProvider$BufferedProvider implements InputStreamProvider$Provider
{
    public InputStreamProvider$BufferedProvider() {
    }
    
    public InputStream get(final File file) {
        return new BufferedInputStream(new FileInputStream(file));
    }
}
