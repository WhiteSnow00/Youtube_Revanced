import J.N;
import org.chromium.base.TraceEvent;
import org.chromium.base.EarlyTraceEvent;
import android.util.Printer;

// 
// Decompiled by Procyon v0.6.0
// 

class auef implements Printer
{
    private String a;
    
    public auef() {
    }
    
    public void a(String string) {
        final boolean d = EarlyTraceEvent.d();
        if (!TraceEvent.m() && !d) {
            return;
        }
        if (TraceEvent.n()) {
            string = "Looper.dispatch: EVENT_NAME_FILTERED";
        }
        else {
            final int index = string.indexOf(40, 18);
            int index2;
            if (index == -1) {
                index2 = -1;
            }
            else {
                index2 = string.indexOf(41, index);
            }
            String substring = "";
            String substring2;
            if (index2 != -1) {
                substring2 = string.substring(index + 1, index2);
            }
            else {
                substring2 = "";
            }
            final int index3 = string.indexOf(125, 18);
            int index4;
            if (index3 == -1) {
                index4 = -1;
            }
            else {
                index4 = string.indexOf(58, index3);
            }
            int length = index4;
            if (index4 == -1) {
                length = string.length();
            }
            if (index3 != -1) {
                substring = string.substring(index3 + 2, length);
            }
            final StringBuilder sb = new StringBuilder("Looper.dispatch: ");
            sb.append(substring2);
            sb.append("(");
            sb.append(substring);
            sb.append(")");
            string = sb.toString();
        }
        this.a = string;
        if (TraceEvent.m()) {
            N.M_y76mct(this.a);
            return;
        }
        EarlyTraceEvent.a(this.a, true);
    }
    
    public void b(final String s) {
        final boolean d = EarlyTraceEvent.d();
        if ((TraceEvent.m() || d) && this.a != null) {
            if (TraceEvent.m()) {
                N.MLJecZJ9(this.a);
            }
            else {
                EarlyTraceEvent.c(this.a, true);
            }
        }
        this.a = null;
    }
    
    public final void println(final String s) {
        if (s.startsWith(">")) {
            this.a(s);
            return;
        }
        this.b(s);
    }
}
