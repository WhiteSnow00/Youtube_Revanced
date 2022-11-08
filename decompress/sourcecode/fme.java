import java.util.Map;
import android.text.TextUtils;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fme implements View$OnClickListener
{
    private final fml a;
    private final aago b;
    private final vax c;
    private final String d;
    private final amva e;
    private final aibb f;
    private final atjj g;
    private final atjj h;
    private final wwv i;
    
    public fme(final fml a, final aago b, final vax c, final String d, final amva e, final aibb f, final atjj g, final atjj h, final wwv i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void onClick(final View view) {
        if (TextUtils.isEmpty((CharSequence)this.d)) {
            return;
        }
        final aibb f = this.f;
        if (f != null) {
            if ((f.b & 0x8000) != 0x0) {
                final vax c = this.c;
                aioe aioe;
                if ((aioe = f.o) == null) {
                    aioe = aioe.a;
                }
                c.c(aioe, (Map)null);
            }
            return;
        }
        if (!this.a.j(this.d)) {
            this.b.k(this.d, this.e, this.i, (amqx)null);
            return;
        }
        if (this.g.a()) {
            this.b.h(this.d);
            return;
        }
        if (this.h.a()) {
            this.b.b(this.d, aagg.a(true));
            return;
        }
        this.b.c(this.d, aagg.a(true));
    }
}
