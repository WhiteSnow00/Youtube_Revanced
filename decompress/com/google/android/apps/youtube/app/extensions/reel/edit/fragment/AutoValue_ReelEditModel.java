// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import java.util.List;

public final class AutoValue_ReelEditModel extends ReelEditModel
{
    public final afcr a;
    public final int b;
    public final ReelEditModel$DeletedItem c;
    
    public AutoValue_ReelEditModel(final afcr a, final int b, final ReelEditModel$DeletedItem c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final int a() {
        return this.b;
    }
    
    @Override
    public final ReelEditModel$DeletedItem b() {
        return this.c;
    }
    
    @Override
    public final afcr c() {
        return this.a;
    }
    
    @Override
    public final zvm d() {
        return new zvm((ReelEditModel)this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ReelEditModel) {
            final ReelEditModel reelEditModel = (ReelEditModel)o;
            if (adwd.ar((List)this.a, reelEditModel.c()) && this.b == reelEditModel.a()) {
                final ReelEditModel$DeletedItem c = this.c;
                if (c == null) {
                    if (reelEditModel.b() != null) {
                        return false;
                    }
                }
                else if (!c.equals(reelEditModel.b())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        final ReelEditModel$DeletedItem c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ hashCode2;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final int b = this.b;
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("ReelEditModel{reelItems=");
        sb.append(string);
        sb.append(", currentIndex=");
        sb.append(b);
        sb.append(", lastDeletedItem=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
