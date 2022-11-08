// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

final class AutoValue_ReelEditModel_DeletedItem extends ReelEditModel$DeletedItem
{
    private final int a;
    private final ReelItemEditModel b;
    
    public AutoValue_ReelEditModel_DeletedItem(final int a, final ReelItemEditModel b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null reelItemEditModel");
    }
    
    @Override
    public final int a() {
        return this.a;
    }
    
    @Override
    public final ReelItemEditModel b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ReelEditModel$DeletedItem) {
            final ReelEditModel$DeletedItem reelEditModel$DeletedItem = (ReelEditModel$DeletedItem)o;
            if (this.a == reelEditModel$DeletedItem.a() && this.b.equals(reelEditModel$DeletedItem.b())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("DeletedItem{index=");
        sb.append(a);
        sb.append(", reelItemEditModel=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
