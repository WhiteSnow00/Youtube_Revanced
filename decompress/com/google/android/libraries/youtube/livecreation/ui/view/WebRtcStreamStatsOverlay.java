// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import android.widget.TextView;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RelativeLayout;

public class WebRtcStreamStatsOverlay extends RelativeLayout
{
    public WebRtcStreamStatsOverlay(final Context context) {
        super(context);
        this.a(context);
    }
    
    public WebRtcStreamStatsOverlay(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context);
    }
    
    public WebRtcStreamStatsOverlay(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context);
    }
    
    private final void a(final Context context) {
        inflate(context, 2131624658, (ViewGroup)this);
        this.setSaveEnabled(true);
        final TextView textView = (TextView)this.findViewById(2131431728);
        final TextView textView2 = (TextView)this.findViewById(2131431729);
        final TextView textView3 = (TextView)this.findViewById(2131431722);
        final TextView textView4 = (TextView)this.findViewById(2131431727);
        final TextView textView5 = (TextView)this.findViewById(2131431721);
        final TextView textView6 = (TextView)this.findViewById(2131431723);
        final TextView textView7 = (TextView)this.findViewById(2131431725);
        final TextView textView8 = (TextView)this.findViewById(2131431720);
        final TextView textView9 = (TextView)this.findViewById(2131431726);
        final TextView textView10 = (TextView)this.findViewById(2131431724);
        final TextView textView11 = (TextView)this.findViewById(2131431707);
        final TextView textView12 = (TextView)this.findViewById(2131431705);
        final TextView textView13 = (TextView)this.findViewById(2131431706);
    }
}
