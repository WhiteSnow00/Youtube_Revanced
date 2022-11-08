// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.preview;

import java.util.Set;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.view.View$OnTouchListener;
import android.widget.TextView;
import android.widget.SeekBar;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;

public class TrimVideoControllerView extends rbi
{
    public ImageView f;
    public final View g;
    public qpt h;
    
    public TrimVideoControllerView(final Context context, final AttributeSet set) {
        super(context, set);
        LayoutInflater.from(context).inflate(2131625725, (ViewGroup)this, true);
        final SeekBar seekBar = (SeekBar)this.findViewById(2131430419);
        this.m((TextView)this.findViewById(2131430418), (TextView)this.findViewById(2131432304), seekBar);
        this.g = this.findViewById(2131432332);
        seekBar.setOnTouchListener((View$OnTouchListener)new gby(this, 18));
    }
    
    final void A() {
        final ImageView f = this.f;
        if (f == null) {
            trn.b("PlayButton is null");
            return;
        }
        f.setVisibility(4);
    }
    
    final void B() {
        final ImageView f = this.f;
        if (f == null) {
            trn.b("PlayButton is null");
            return;
        }
        f.setVisibility(0);
    }
    
    public final void a(final EditableVideo editableVideo, final Set set) {
        super.a(editableVideo, set);
        this.A();
    }
    
    public final void c(final EditableVideo editableVideo, final Set set) {
        super.c(editableVideo, set);
        if (!this.z()) {
            this.B();
        }
    }
    
    public final void t() {
        super.t();
        if (!this.z() && !this.y()) {
            this.B();
            return;
        }
        this.A();
    }
    
    public final void u() {
    }
}
