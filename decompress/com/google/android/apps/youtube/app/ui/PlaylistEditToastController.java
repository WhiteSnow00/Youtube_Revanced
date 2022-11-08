// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui;

import java.util.HashSet;
import java.util.Set;
import android.content.Context;

public class PlaylistEditToastController implements tfg, tec
{
    Context a;
    public boolean b;
    private final actx c;
    private final tdz d;
    private final Set e;
    private String f;
    
    public PlaylistEditToastController(final Context a, final actx c, final tdz d) {
        this.b = false;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = new HashSet();
    }
    
    public final void j() {
        this.e.clear();
        this.b = false;
        this.f = null;
    }
    
    public final void k() {
        if (!this.e.isEmpty() && this.b) {
            final int size = this.e.size();
            this.j();
            final gbo e = gbq.e((CharSequence)this.a.getResources().getQuantityString(2131886129, size));
            e.j();
            this.c.n((actz)e.a());
        }
    }
    
    public final void l(final String s, final String f, final akvo akvo) {
        if (akvo.f.size() <= 0) {
            if ((akvo.b & 0x100) == 0x0) {
                if (!f.equals(this.f)) {
                    this.e.clear();
                    this.f = f;
                }
                this.e.add(s);
                this.k();
            }
        }
    }
    
    public final void lW(final aum aum) {
        this.d.g((Object)this);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    final vsp vsp = (vsp)o;
                    this.l(vsp.a, vsp.d, vsp.c);
                }
                else {
                    final vsm vsm = (vsm)o;
                    this.l(vsm.a, vsm.b, vsm.c);
                }
            }
            else if (((hwc)o).a) {
                this.j();
            }
            else {
                this.b = true;
                this.k();
            }
        }
        else {
            array = new Class[] { hwc.class, vsm.class, vsp.class };
        }
        return array;
    }
    
    public final void my(final aum aum) {
        this.d.m((Object)this);
    }
}
