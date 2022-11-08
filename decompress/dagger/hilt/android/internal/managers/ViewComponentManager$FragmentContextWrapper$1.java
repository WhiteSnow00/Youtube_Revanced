// 
// Decompiled by Procyon v0.6.0
// 

package dagger.hilt.android.internal.managers;

public class ViewComponentManager$FragmentContextWrapper$1 implements auk
{
    final /* synthetic */ ariq a;
    
    public ViewComponentManager$FragmentContextWrapper$1(final ariq a) {
        this.a = a;
    }
    
    @Override
    public final void a(final aum aum, final auf auf) {
        if (auf == auf.ON_DESTROY) {
            final ariq a = this.a;
            a.a = null;
            a.b = null;
            a.c = null;
        }
    }
}
