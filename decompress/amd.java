import android.text.TextUtils;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amd extends amh
{
    public amd(final Class clazz) {
        super(2131431931, clazz, 8, 28);
    }
    
    @Override
    public final Object a(final View view) {
        return amu.a(view);
    }
    
    @Override
    public final void b(final View view, final Object o) {
        amu.f(view, (CharSequence)o);
    }
    
    @Override
    public final /* bridge */ boolean c(final Object o, final Object o2) {
        return !TextUtils.equals((CharSequence)o, (CharSequence)o2);
    }
}
