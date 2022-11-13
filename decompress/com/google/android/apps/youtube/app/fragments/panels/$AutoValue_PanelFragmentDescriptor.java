// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.fragments.panels;

import com.google.apps.tiktok.account.AccountId;

abstract class $AutoValue_PanelFragmentDescriptor extends PanelFragmentDescriptor
{
    public final Class a;
    public final AccountId b;
    
    public $AutoValue_PanelFragmentDescriptor(final Class a, final AccountId b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null fragmentClass");
    }
    
    public final AccountId a() {
        return this.b;
    }
    
    public final Class b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof PanelFragmentDescriptor) {
            final PanelFragmentDescriptor panelFragmentDescriptor = (PanelFragmentDescriptor)o;
            if (this.a.equals(panelFragmentDescriptor.b())) {
                final AccountId b = this.b;
                if (b == null) {
                    if (panelFragmentDescriptor.a() != null) {
                        return false;
                    }
                }
                else if (!b.equals(panelFragmentDescriptor.a())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final AccountId b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ hashCode2;
    }
    
    public final String toString() {
        final String string = this.a.toString();
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("PanelFragmentDescriptor{fragmentClass=");
        sb.append(string);
        sb.append(", accountId=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
