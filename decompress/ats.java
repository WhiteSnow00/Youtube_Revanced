import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ats extends atr
{
    public ats(final br br, final ViewGroup viewGroup) {
        final StringBuilder sb = new StringBuilder("Attempting to add fragment ");
        sb.append(br);
        sb.append(" to container ");
        sb.append(viewGroup);
        sb.append(" which is not a FragmentContainerView");
        super(br, sb.toString());
    }
}
