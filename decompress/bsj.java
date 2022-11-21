import java.util.Arrays;
import android.database.Cursor;
import androidx.media3.common.Metadata;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public class bsj
{
    public static void a(final Surface surface, final float n) {
        int n2;
        if (n == 0.0f) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        try {
            surface.setFrameRate(n, n2);
        }
        catch (final IllegalStateException ex) {
            baq.b("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", ex);
        }
    }
    
    public static Metadata b(final btn btn, final boolean b) {
        bvn a;
        if (b) {
            a = null;
        }
        else {
            a = bvo.a;
        }
        final Metadata d = new bhy().d(btn, a);
        if (d != null && d.a() != 0) {
            return d;
        }
        return null;
    }
    
    public static int c(final Cursor cursor, final String s) {
        final int columnIndex = cursor.getColumnIndex(s);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        final StringBuilder sb = new StringBuilder("`");
        sb.append(s);
        sb.append('`');
        final int columnIndex2 = cursor.getColumnIndex(sb.toString());
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }
    
    public static int d(final Cursor cursor, final String s) {
        final int c = c(cursor, s);
        if (c >= 0) {
            return c;
        }
        String string;
        try {
            final String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            final StringBuilder sb = new StringBuilder();
            sb.append("");
            final int length = columnNames.length;
            int i = 0;
            int n = 0;
            while (i < length) {
                final String s2 = columnNames[i];
                if (++n > 1) {
                    sb.append(", ");
                }
                auop.l((Appendable)sb, (Object)s2, (atqd)null);
                ++i;
            }
            sb.append("");
            string = sb.toString();
        }
        catch (final Exception ex) {
            string = "unknown";
        }
        final StringBuilder sb2 = new StringBuilder("column '");
        sb2.append(s);
        sb2.append("' does not exist. Available columns: ");
        sb2.append(string);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public static dmo f(final bat bat) {
        bat.H(1);
        final int k = bat.k();
        final long n = bat.b;
        final long n2 = k;
        final int n3 = k / 18;
        final long[] array = new long[n3];
        final long[] array2 = new long[n3];
        int n4 = 0;
        long[] copy;
        long[] copy2;
        while (true) {
            copy = array;
            copy2 = array2;
            if (n4 >= n3) {
                break;
            }
            final long p = bat.p();
            if (p == -1L) {
                copy = Arrays.copyOf(array, n4);
                copy2 = Arrays.copyOf(array2, n4);
                break;
            }
            array[n4] = p;
            array2[n4] = bat.p();
            bat.H(2);
            ++n4;
        }
        bat.H((int)(n + n2 - bat.b));
        return new dmo(copy, copy2);
    }
    
    public void e(final cgp cgp) {
    }
}
