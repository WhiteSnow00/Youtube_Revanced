import java.util.Locale;
import android.view.View;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqb
{
    private final int a;
    private TextView b;
    private String c;
    private long d;
    
    public hqb(final int a) {
        this.a = a;
    }
    
    public final void a(final View view) {
        if (this.b == null) {
            final TextView b = (TextView)view.findViewById(this.a);
            this.b = b;
            final String c = this.c;
            if (c != null) {
                b.setText((CharSequence)c);
            }
        }
    }
    
    public final void b(final long n) {
        ++this.d;
        final String format = String.format(Locale.US, "%.2fs #%d", n / 1000.0f, this.d);
        this.c = format;
        final TextView b = this.b;
        if (b != null) {
            b.setText((CharSequence)format);
        }
    }
}
