// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth;

import android.content.Intent;

public class UserRecoverableAuthException extends mih
{
    public final Intent b;
    
    public UserRecoverableAuthException(final String s, final Intent b) {
        super(s);
        this.b = b;
    }
}
