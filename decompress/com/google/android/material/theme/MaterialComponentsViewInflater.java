// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.theme;

import com.google.android.material.textview.MaterialTextView;
import android.support.v7.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;

public class MaterialComponentsViewInflater extends AppCompatViewInflater
{
    public final jz a(final Context context, final AttributeSet set) {
        return (jz)new aeas(context, set);
    }
    
    public final AppCompatButton b(final Context context, final AttributeSet set) {
        return new MaterialButton(context, set);
    }
    
    public final kb c(final Context context, final AttributeSet set) {
        return (kb)new adug(context, set);
    }
    
    public final kk d(final Context context, final AttributeSet set) {
        return (kk)new adxt(context, set);
    }
    
    public final AppCompatTextView e(final Context context, final AttributeSet set) {
        return new MaterialTextView(context, set);
    }
}
