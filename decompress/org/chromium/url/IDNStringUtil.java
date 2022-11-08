// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.url;

import java.net.IDN;

public class IDNStringUtil
{
    private static String idnToASCII(String ascii) {
        try {
            ascii = IDN.toASCII(ascii, 2);
            return ascii;
        }
        catch (final Exception ex) {
            return null;
        }
    }
}
