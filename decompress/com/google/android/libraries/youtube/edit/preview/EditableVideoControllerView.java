// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.preview;

import java.util.Set;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import android.view.View$OnClickListener;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class EditableVideoControllerView extends reb
{
    private final ImageView f;
    
    public EditableVideoControllerView(final Context context, final AttributeSet set) {
        super(context, set);
        LayoutInflater.from(context).inflate(2131624379, (ViewGroup)this, true);
        this.m((TextView)this.findViewById(2131430419), (TextView)this.findViewById(2131432308), (SeekBar)this.findViewById(2131430420));
        (this.f = (ImageView)this.findViewById(2131430410)).setOnClickListener((View$OnClickListener)new qwj((reb)this, 16));
    }
    
    public final void a(final EditableVideo editableVideo, final Set set) {
        super.a(editableVideo, set);
        this.setVisibility(4);
    }
    
    public final void c(final EditableVideo editableVideo, final Set set) {
        super.c(editableVideo, set);
        this.setVisibility(0);
    }
    
    public final void u() {
        if (this.z()) {
            this.f.setImageResource(2131231875);
            this.f.setContentDescription((CharSequence)this.getContext().getString(2132017969));
            return;
        }
        this.f.setImageResource(2131231876);
        this.f.setContentDescription((CharSequence)this.getContext().getString(2132017970));
    }
}
