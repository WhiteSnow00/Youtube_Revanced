// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

import android.text.style.ClickableSpan;
import java.util.Map;

public final class e implements acbp
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public e(final g a, final vel b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public e(final gcn a, final Map b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public e(final vel b, final veh a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final ClickableSpan a(final aisc aisc) {
        final int c = this.c;
        if (c == 0) {
            return ((vel)this.b).a(((g)this.a).b, (Map)null, aisc);
        }
        if (c != 1) {
            return ((vel)this.b).a((veh)this.a, (Map)null, aisc);
        }
        return vem.a(false).a(((gcn)this.a).a, (Map)this.b, aisc);
    }
}
