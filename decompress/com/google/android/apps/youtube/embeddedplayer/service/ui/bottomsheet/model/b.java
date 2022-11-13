// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public final class b extends a
{
    public boolean i;
    
    public b(final String s) {
        super(s, -1);
        this.i = false;
    }
    
    @Override
    public final void a(final View view) {
        final TextView textView = (TextView)view.findViewById(2131429586);
        final ImageView imageView = (ImageView)view.findViewById(2131429582);
        final TextView textView2 = (TextView)view.findViewById(2131429588);
        final TextView textView3 = (TextView)view.findViewById(2131429587);
        final ImageView imageView2 = (ImageView)view.findViewById(2131429581);
        kzr.h((a)this, view, textView, imageView, textView3, textView2);
        if (this.i) {
            imageView2.setVisibility(0);
            return;
        }
        imageView2.setVisibility(4);
    }
    
    public final void b() {
        this.i = true;
    }
}
