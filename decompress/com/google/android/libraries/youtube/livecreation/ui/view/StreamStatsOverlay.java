// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class StreamStatsOverlay extends RelativeLayout
{
    private TextView a;
    
    public StreamStatsOverlay(final Context context) {
        super(context);
        this.a(context);
    }
    
    public StreamStatsOverlay(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context);
    }
    
    public StreamStatsOverlay(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context);
    }
    
    private final void a(final Context context) {
        inflate(context, 2131624653, (ViewGroup)this);
        this.setSaveEnabled(true);
        final TextView textView = (TextView)this.findViewById(2131431712);
        final TextView textView2 = (TextView)this.findViewById(2131431719);
        final TextView textView3 = (TextView)this.findViewById(2131431711);
        final TextView textView4 = (TextView)this.findViewById(2131431718);
        final TextView textView5 = (TextView)this.findViewById(2131431710);
        (this.a = (TextView)this.findViewById(2131431709)).setText((CharSequence)"");
    }
}
