import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frn
{
    public final ActiveStateScrollSelectionController a;
    
    public frn() {
    }
    
    public frn(final ActiveStateScrollSelectionController a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        final boolean b = o instanceof frn;
        boolean equals = false;
        if (b) {
            final frn frn = (frn)o;
            final ActiveStateScrollSelectionController a = this.a;
            final ActiveStateScrollSelectionController a2 = frn.a;
            if (a == null) {
                if (a2 == null) {
                    return true;
                }
                equals = equals;
            }
            else {
                equals = a.equals(a2);
            }
        }
        return equals;
    }
    
    @Override
    public final int hashCode() {
        final ActiveStateScrollSelectionController a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder("MainAppElementsUserData{activeStateScrollSelectionController=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
