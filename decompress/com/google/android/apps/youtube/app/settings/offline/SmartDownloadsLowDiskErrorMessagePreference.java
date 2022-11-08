// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.settings.offline;

import android.view.ViewGroup;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import androidx.preference.Preference;

public class SmartDownloadsLowDiskErrorMessagePreference extends Preference
{
    public kgp a;
    public wwu b;
    private View c;
    private final Context d;
    
    public SmartDownloadsLowDiskErrorMessagePreference(final Context d) {
        super(d);
        this.d = d;
        this.k();
    }
    
    public SmartDownloadsLowDiskErrorMessagePreference(final Context d, final AttributeSet set) {
        super(d, set);
        this.d = d;
        this.k();
    }
    
    private final void k() {
        Context context2;
        final Context context = context2 = this.d;
        if (context instanceof ContextWrapper) {
            context2 = ((ContextWrapper)context).getBaseContext();
        }
        ((jpq)aqqm.k((Object)context2, (Class)jpq.class)).ba(this);
        super.B = 2131625071;
    }
    
    @Override
    public final void rH(final cfi cfi) {
        super.rH(cfi);
        if (this.c != null) {
            return;
        }
        final kgo b = this.a.b((ViewGroup)cfi.a);
        this.c = (View)b.a;
        ((ViewGroup)cfi.a).addView(this.c);
        final acij acij = new acij();
        ((wwx)acij).a(this.b.n());
        final agza builder = ((agzi)aogq.a).createBuilder();
        final String string = this.d.getResources().getString(2132019843);
        builder.copyOnWrite();
        final aogq aogq = (aogq)builder.instance;
        string.getClass();
        aogq.b |= 0x1;
        aogq.c = string;
        final String string2 = this.d.getResources().getString(2132019842);
        builder.copyOnWrite();
        final aogq aogq2 = (aogq)builder.instance;
        string2.getClass();
        aogq2.b |= 0x2;
        aogq2.d = string2;
        final agza builder2 = ahfw.a.createBuilder();
        builder2.copyOnWrite();
        final ahfw ahfw = (ahfw)builder2.instance;
        ahfw.b |= 0x1;
        ahfw.c = 153067;
        final ahfw e = (ahfw)builder2.build();
        builder.copyOnWrite();
        final aogq aogq3 = (aogq)builder.instance;
        e.getClass();
        aogq3.e = e;
        aogq3.b |= 0x4;
        b.b(acij, (aogq)builder.build());
    }
}
