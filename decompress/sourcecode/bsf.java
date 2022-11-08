import java.util.Iterator;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import android.database.MatrixCursor;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsf
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
            bao.b("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", (Throwable)ex);
        }
    }
    
    public static List b(final byte[] array) {
        final byte b = array[11];
        final byte b2 = array[10];
        final ArrayList list = new ArrayList(3);
        list.add(array);
        list.add(h(g((b & 0xFF) << 8 | (b2 & 0xFF))));
        list.add(h(g(3840L)));
        return list;
    }
    
    public static final void c(final cgl cgl) {
        final List e = aqzg.E();
        Object o = cgl.b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            while (((Cursor)o).moveToNext()) {
                e.add(((Cursor)o).getString(0));
            }
            atzz.c((Closeable)o, null);
            aqzg.P(e);
            o = e.iterator();
            while (((Iterator)o).hasNext()) {
                final String s = ((Iterator<String>)o).next();
                s.getClass();
                if (aubt.o(s, "room_fts_content_sync_")) {
                    cgl.g("DROP TRIGGER IF EXISTS ".concat(s));
                }
            }
        }
        finally {
            try {}
            finally {
                final Throwable t;
                atzz.c((Closeable)o, t);
                while (true) {}
            }
        }
    }
    
    public static final Cursor d(cfs p3, final cgr cgr, final boolean b) {
        p3 = (cfs)p3.p(cgr);
        if (b && p3 instanceof AbstractWindowedCursor) {
            final AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor)p3;
            final int count = abstractWindowedCursor.getCount();
            int numRows;
            if (abstractWindowedCursor.hasWindow()) {
                numRows = abstractWindowedCursor.getWindow().getNumRows();
            }
            else {
                numRows = count;
            }
            if (numRows < count) {
                try {
                    final MatrixCursor matrixCursor = new MatrixCursor(((Cursor)p3).getColumnNames(), ((Cursor)p3).getCount());
                    while (((Cursor)p3).moveToNext()) {
                        final Object[] array = new Object[((Cursor)p3).getColumnCount()];
                        for (int columnCount = ((Cursor)p3).getColumnCount(), i = 0; i < columnCount; ++i) {
                            final int type = ((Cursor)p3).getType(i);
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 2) {
                                        if (type != 3) {
                                            if (type != 4) {
                                                throw new IllegalStateException();
                                            }
                                            array[i] = ((Cursor)p3).getBlob(i);
                                        }
                                        else {
                                            array[i] = ((Cursor)p3).getString(i);
                                        }
                                    }
                                    else {
                                        array[i] = ((Cursor)p3).getDouble(i);
                                    }
                                }
                                else {
                                    array[i] = ((Cursor)p3).getLong(i);
                                }
                            }
                            else {
                                array[i] = null;
                            }
                        }
                        matrixCursor.addRow(array);
                    }
                    atzz.c((Closeable)p3, null);
                    return (Cursor)matrixCursor;
                }
                finally {
                    try {}
                    finally {
                        atzz.c((Closeable)p3, (Throwable)cgr);
                    }
                }
            }
        }
        return (Cursor)p3;
    }
    
    public static final int e(final Cursor cursor, final String s) {
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
    
    public static final int f(final Cursor cursor, final String s) {
        final int e = e(cursor, s);
        if (e >= 0) {
            return e;
        }
        String string;
        try {
            final String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            final Object[] array = columnNames;
            final StringBuilder sb = new StringBuilder();
            sb.append("");
            final int length = array.length;
            int i = 0;
            int n = 0;
            while (i < length) {
                final Object o = array[i];
                if (++n > 1) {
                    sb.append(", ");
                }
                aubt.d((Appendable)sb, o, (atml)null);
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
    
    private static long g(final long n) {
        return n * 1000000000L / 48000L;
    }
    
    private static byte[] h(final long n) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(n).array();
    }
}
