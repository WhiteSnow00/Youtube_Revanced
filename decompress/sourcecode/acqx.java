import java.util.Map;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class acqx implements View$OnClickListener
{
    public String a;
    private final acrc b;
    
    public acqx(final acrc b) {
        this.b = b;
    }
    
    public final void onClick(final View view) {
        final acrc b = this.b;
        if (b != null) {
            final String a = this.a;
            int n;
            if (b.f.getSelectionEnd() >= 0) {
                n = b.f.getSelectionEnd();
            }
            else {
                n = b.f.getText().length();
            }
            b.f.getEditableText().insert(n, (CharSequence)b.j.o(a));
            final ajmd ajmd = ((Map<K, ajmd>)b.j.a).get(a);
            if (ajmd != null) {
                if (ajmd.g) {
                    b.i = true;
                    b.e(b.f.getEditableText());
                    b.i = false;
                    return;
                }
            }
            b.d.clear();
            ((acle)b.c).e();
            b.c.a(b.j.o(a), b.j.l(a), b.a.getResources().getDimension(2131166401), (Object)a, b.f.getId(), b.d, (StringBuilder)null);
        }
    }
}
