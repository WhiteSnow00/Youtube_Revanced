// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import j$.util.Optional;

public final class b implements thj
{
    public final Object a;
    public Object b;
    private final int c;
    
    public b(final int c) {
        this.c = c;
        this.a = atmp.e();
        this.b = Optional.empty();
    }
    
    public b(final bu a, final int c) {
        this.c = c;
        this.a = a;
    }
    
    public final Class[] mr(final Class clazz, Object o, int ordinal) {
        final int c = this.c;
        Class[] array = null;
        final Class[] array2 = null;
        if (c != 0) {
            Class[] array3;
            if (ordinal != -1) {
                if (ordinal != 0) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(ordinal);
                    throw new IllegalStateException(sb.toString());
                }
                final zon zon = (zon)o;
                final View viewById = ((bu)this.a).findViewById(2131427411);
                if (viewById instanceof AccessibilityLayerLayout) {
                    final AccessibilityLayerLayout accessibilityLayerLayout = (AccessibilityLayerLayout)viewById;
                    accessibilityLayerLayout.d(true);
                    accessibilityLayerLayout.c(true);
                }
                if (((bu)this.a).getSupportFragmentManager().f("require_signin_fragment") == null) {
                    array3 = array2;
                }
                else if ((this.b = ((bu)this.a).getSupportFragmentManager().f("require_signin_fragment")) == null) {
                    array3 = array2;
                }
                else {
                    final ct i = ((bu)this.a).getSupportFragmentManager().i();
                    i.n((br)this.b);
                    i.d();
                    final ViewGroup viewGroup = (ViewGroup)((bu)this.a).findViewById(2131429447);
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                        viewGroup.setVisibility(8);
                    }
                    this.b = null;
                    array3 = array2;
                }
            }
            else {
                array3 = new Class[] { zon.class };
            }
            return array3;
        }
        if (ordinal != -1) {
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        final StringBuilder sb2 = new StringBuilder("unsupported op code: ");
                        sb2.append(ordinal);
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (!((zop)o).a()) {
                        o = this.a;
                        ((atmp)o).tt((Object)aein.b);
                    }
                }
                else {
                    final rmw rmw = (rmw)o;
                    final rmv a = rmv.a;
                    ordinal = rmw.a().ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            o = this.a;
                            ((atmp)o).tt((Object)aein.c);
                        }
                    }
                    else {
                        ((atmp)this.a).tt((Object)aein.a);
                    }
                }
            }
            else {
                aftr.k(((rmu)o).a().getMessage());
                ((atmp)this.a).tt((Object)aein.d);
            }
        }
        else {
            array = new Class[] { rmu.class, rmw.class, zop.class };
        }
        return array;
    }
}
