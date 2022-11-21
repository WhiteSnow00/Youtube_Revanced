import android.text.Editable;

// 
// Decompiled by Procyon v0.6.0
// 

final class aecc extends adxx
{
    final aece a;
    
    public aecc(final aece a) {
        this.a = a;
    }
    
    @Override
    public final void afterTextChanged(final Editable editable) {
        this.a.b().l();
    }
    
    @Override
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        this.a.b().y();
    }
}
