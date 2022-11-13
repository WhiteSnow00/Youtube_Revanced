import android.text.Editable;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeak extends adwg
{
    final aeam a;
    
    public aeak(final aeam a) {
        this.a = a;
    }
    
    public final void afterTextChanged(final Editable editable) {
        this.a.b().l();
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        this.a.b().y();
    }
}
