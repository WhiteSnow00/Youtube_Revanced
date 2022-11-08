// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui;

import android.widget.TextView;
import android.widget.ProgressBar;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import androidx.preference.Preference;

public class StorageBarPreference extends Preference implements tec
{
    public zki a;
    public atjj b;
    public tlk c;
    public tdz d;
    private final boolean e;
    
    public StorageBarPreference(final Context context) {
        this(context, null);
    }
    
    public StorageBarPreference(final Context context, final AttributeSet set) {
        this(context, set, 0, 0);
    }
    
    public StorageBarPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public StorageBarPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        ((jvr)ahbz.az(super.j, (Class)jvr.class)).wz(this);
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, juo.a);
            this.e = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            return;
        }
        this.e = false;
    }
    
    @Override
    public final void B() {
        super.Q();
        this.d.m((Object)this);
    }
    
    @Override
    protected final void C() {
        this.d.m((Object)this);
        super.Q();
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zwn zwn = (zwn)o;
                this.d();
            }
            else {
                final zvz zvz = (zvz)o;
                this.d();
            }
        }
        else {
            array = new Class[] { zvz.class, zwn.class };
        }
        return array;
    }
    
    @Override
    public final void rH(final cfi cfi) {
        super.rH(cfi);
        long v;
        if (this.a.t()) {
            v = tmy.V(((zzu)this.b.a()).a().c().b(this.e));
        }
        else {
            v = 0L;
        }
        final long a = this.c.a();
        long n;
        if (this.e) {
            n = tmy.V(a);
        }
        else {
            n = tmy.V(tmy.aW());
        }
        final ProgressBar progressBar = (ProgressBar)cfi.a.findViewById(2131431757);
        progressBar.setMax(1000);
        final float n2 = (float)v;
        progressBar.setProgress((int)(1000.0f * n2 / (n2 + n)));
        ((TextView)cfi.a.findViewById(2131431762)).setText((CharSequence)super.j.getResources().getString(2132019269, new Object[] { tsx.g(super.j.getResources(), v) }));
        ((TextView)cfi.a.findViewById(2131431759)).setText((CharSequence)super.j.getResources().getString(2132019266, new Object[] { tsx.g(super.j.getResources(), n) }));
    }
    
    @Override
    public final void z() {
        super.E();
        this.d.g((Object)this);
    }
}
