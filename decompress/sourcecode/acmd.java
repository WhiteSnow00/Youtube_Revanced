import android.view.ViewGroup;
import android.view.View;
import android.view.ViewGroup$OnHierarchyChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acmd implements ViewGroup$OnHierarchyChangeListener
{
    private final ViewGroup$OnHierarchyChangeListener a;
    private final aext b;
    
    public acmd(final ViewGroup$OnHierarchyChangeListener a, final aext b) {
        this.a = a;
        this.b = b;
    }
    
    private final void a(final View view, final View view2) {
        this.a.onChildViewAdded(view, view2);
        if (view2 instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view2;
            viewGroup.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)this);
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                this.a((View)viewGroup, viewGroup.getChildAt(i));
            }
        }
    }
    
    private final void b(final View view, final View view2) {
        if (view2 instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view2;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                this.b((View)viewGroup, viewGroup.getChildAt(i));
            }
            viewGroup.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)null);
        }
        this.a.onChildViewRemoved(view, view2);
    }
    
    public final void onChildViewAdded(final View view, final View view2) {
        if (this.b.a((Object)view2)) {
            this.a(view, view2);
            return;
        }
        this.a.onChildViewAdded(view, view2);
    }
    
    public final void onChildViewRemoved(final View view, final View view2) {
        if (this.b.a((Object)view2)) {
            this.b(view, view2);
            return;
        }
        this.a.onChildViewRemoved(view, view2);
    }
}
