import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.content.Context;
import java.util.Collection;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hto implements zei
{
    public UploadActivity a;
    public String b;
    int c;
    public final ziy d;
    private final htn e;
    private final htl f;
    private boolean g;
    private boolean h;
    private final vai i;
    
    public hto(final ziy d, final vai i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.g = false;
        this.h = false;
        this.d = d;
        this.i = i;
        this.c = 1;
        this.e = new htn(this);
        this.f = new htl(this);
    }
    
    public final void a() {
        this.c = 1;
    }
    
    public final void b(final UploadActivity a, final fzg fzg) {
        this.a = a;
        fzg.c((Collection)afeq.r((Object)this.e));
        fzg.d(tpe.cr((Context)a, 2130970940));
        this.f.a = a.findViewById(2131432241);
        final htl f = this.f;
        final YouTubeTextView c = (YouTubeTextView)a.findViewById(2131432240);
        f.c = c;
        f.d = f.b.d.ap((TextView)c);
    }
    
    public final void c() {
        if (!this.h()) {
            return;
        }
        this.a.q();
    }
    
    public final void d(final boolean h) {
        this.h = h;
        this.g();
    }
    
    public final void e(final boolean g) {
        this.g = g;
        this.g();
    }
    
    public final void f(final String b) {
        this.b = b;
        this.g();
    }
    
    public final void g() {
        final int c = this.c;
        final int n = c - 1;
        if (c != 0) {
            if (n != 1) {
                if (n == 2) {
                    ((htm)this.e).a(false);
                    ((htm)this.f).a(true);
                    final htl f = this.f;
                    ((htm)f).b(this.h());
                    final String b = f.b.b;
                    if (b != null) {
                        f.c.setText((CharSequence)b);
                        return;
                    }
                    f.c.setText(2132019864);
                }
            }
            else {
                ((htm)this.e).a(true);
                ((htm)this.f).a(false);
                final htn e = this.e;
                final boolean h = this.h();
                final MenuItem a = e.a;
                if (a != null && e.c != null) {
                    a.setEnabled(h);
                    ((htm)e).b(h);
                    final String b2 = e.b.b;
                    if (b2 != null) {
                        e.a.setTitle((CharSequence)b2);
                        e.c.setText((CharSequence)e.b.b);
                        return;
                    }
                    e.c.setText(2132019864);
                }
            }
            return;
        }
        throw null;
    }
    
    final boolean h() {
        return this.h && this.g;
    }
    
    public final int i() {
        return this.c;
    }
    
    public final void j(int c) {
        this.c = c;
        final int orientation = this.a.getResources().getConfiguration().orientation;
        final int n = 16;
        if ((c != 3) ? (c == 2) : (this.i.aI() && orientation == 1)) {
            c = n;
        }
        else {
            c = 32;
        }
        this.a.getWindow().setSoftInputMode((this.a.getWindow().getAttributes().softInputMode & 0xF) | c);
        this.g();
    }
}
