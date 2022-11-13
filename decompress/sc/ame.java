import android.text.TextUtils;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class ame extends amh
{
    public ame(final Class clazz) {
        super(2131431938, clazz, 64, 30);
    }
    
    @Override
    public final Object a(final View view) {
        return amw.a(view);
    }
    
    @Override
    public final void b(final View view, final Object o) {
        amw.b(view, (CharSequence)o);
    }
    
    @Override
    public final /* bridge */ boolean c(final Object o, final Object o2) {
        return !TextUtils.equals((CharSequence)o, (CharSequence)o2);
    }
}
