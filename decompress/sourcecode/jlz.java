import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlz
{
    public final aum a;
    public final wwv b;
    public final cl c;
    public final TextView d;
    public final LinearLayout e;
    public final ImageView f;
    public final jmp g;
    public final acup h;
    public anyc i;
    private final uyf j;
    private final adbp k;
    private e l;
    
    public jlz(final uyf j, final alm alm, final adbp k, final acup h, final aum a, final LinearLayout e, final wwv b, final cl c, final jmp g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.j = j;
        this.g = g;
        this.k = k;
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = (TextView)e.findViewById(2131432387);
        this.f = (ImageView)e.findViewById(2131432389);
        if (gkt.u(j)) {
            final String n = adbp.n();
            final String a2 = k.a();
            String string;
            if (!n.isEmpty() && !a2.isEmpty()) {
                final StringBuilder sb = new StringBuilder();
                sb.append(n);
                sb.append("-");
                sb.append(a2);
                string = sb.toString();
            }
            else {
                string = "en-US";
            }
            final e u = alm.U(string);
            this.l = u;
            tcp.n(a, u.g(), (trb)new htn(this, 20), (trb)new jly(this, 1));
        }
    }
}
