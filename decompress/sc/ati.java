import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ati extends atp
{
    public ati(final br br, final ViewGroup viewGroup) {
        final StringBuilder sb = new StringBuilder("Attempting to use <fragment> tag to add fragment ");
        sb.append(br);
        sb.append(" to container ");
        sb.append(viewGroup);
        super(br, sb.toString());
    }
}