// 
// Decompiled by Procyon v0.6.0
// 

package dagger.hilt.android.internal.managers;

public class ViewComponentManager$FragmentContextWrapper$1 implements aul
{
    final arlf a;
    
    public ViewComponentManager$FragmentContextWrapper$1(final arlf a) {
        this.a = a;
    }
    
    @Override
    public final void a(final aun aun, final aug aug) {
        if (aug == aug.ON_DESTROY) {
            final arlf a = this.a;
            a.a = null;
            a.b = null;
            a.c = null;
        }
    }
}
