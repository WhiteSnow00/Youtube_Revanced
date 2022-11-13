// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

import android.text.style.ClickableSpan;
import java.util.Map;

public final class e implements acaf
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public e(final f a, final vdc b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public e(final gch a, final Map b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public e(final vdc b, final vcy a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final ClickableSpan a(final aiqj aiqj) {
        final int c = this.c;
        if (c == 0) {
            return ((vdc)this.b).a(((f)this.a).b, (Map)null, aiqj);
        }
        if (c != 1) {
            return ((vdc)this.b).a((vcy)this.a, (Map)null, aiqj);
        }
        return vdd.a(false).a(((gch)this.a).a, (Map)this.b, aiqj);
    }
}
