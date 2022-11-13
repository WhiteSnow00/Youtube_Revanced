// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet;

import android.view.LayoutInflater;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.ArrayAdapter;

public final class d extends ArrayAdapter
{
    public d(final Context context) {
        super(context, 2131624385);
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        final a a = (a)this.getItem(n);
        View view2 = view;
        if (view == null) {
            final LayoutInflater from = LayoutInflater.from(this.getContext());
            if (a != null) {
                view2 = from.inflate(2131624385, viewGroup, false);
            }
            else {
                view2 = from.inflate(2131624385, viewGroup, false);
            }
        }
        if (a != null) {
            this.getContext();
            a.a(view2);
        }
        else {
            final StringBuilder sb = new StringBuilder("Cannot build view; empty bottom sheet list item at position ");
            sb.append(n);
            afse.o(sb.toString());
        }
        return view2;
    }
}
